package xmi;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.inject.Injector;

import datamodels.DatamodelsPackage;
import securitymodels.SecurityModel;
import securitymodels.SecuritymodelsPackage;
import uam.mde20.sqlsi.xtext.DatamodelsStandaloneSetup;
import uam.mde20.sqlsi.xtext.SecuritymodelsStandaloneSetup;

public class Main {
	static final String datamodelURI = "../usecase.university/%s";
	static final String securitymodelURI = "../usecase.university/%s";
	static final String XMIFileExtension = "xmi";

	private static void transformDataModelXText2XMI(String args) {
		try {
			Injector injector = new DatamodelsStandaloneSetup().createInjectorAndDoEMFRegistration();
			ResourceSet resourceSet = injector.getInstance(ResourceSet.class);
			resourceSet.getPackageRegistry().put(DatamodelsPackage.eNS_URI, DatamodelsPackage.eINSTANCE);
			URI uri = URI.createFileURI(String.format(datamodelURI, args));
			Resource resource = resourceSet.getResource(uri, true);
			resource.load(null);
			EcoreUtil.resolveAll(resourceSet);
			Resource xmiResource = resourceSet
					.createResource(uri.trimFileExtension().appendFileExtension(XMIFileExtension));
			xmiResource.getContents().add(resource.getContents().get(0));
			xmiResource.save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		transformDataModelXText2XMI(args[0]);
		transformSecurityModelXText2XMI(args[1]);
	}

	private static void transformSecurityModelXText2XMI(String args) {
		try {
			Injector injector = new SecuritymodelsStandaloneSetup().createInjectorAndDoEMFRegistration();
			ResourceSet resourceSet = injector.getInstance(ResourceSet.class);
			resourceSet.getPackageRegistry().put(SecuritymodelsPackage.eNS_URI, SecuritymodelsPackage.eINSTANCE);
			URI uri = URI.createFileURI(String.format(securitymodelURI, args));
			Resource resource = resourceSet.getResource(uri, true);
			resource.load(null);
			EcoreUtil.resolveAll(resourceSet);
			SecurityModel secModel = (SecurityModel) resource.getContents().get(0);
			Resource xmiResource = resourceSet
					.createResource(uri.trimFileExtension().appendFileExtension(XMIFileExtension));
			xmiResource.getContents().add(secModel);
			xmiResource.save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
