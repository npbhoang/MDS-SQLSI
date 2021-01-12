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
	static final String datamodelURI = "";
	static final String securitymodelURI = "";
	static final String XMIFileExtension = "xmi";
	
	private static Resource transformDataModelXText2XMI() throws IOException {
		Injector injector = new DatamodelsStandaloneSetup().createInjectorAndDoEMFRegistration();
		ResourceSet resourceSet = injector.getInstance(ResourceSet.class);
		resourceSet.getPackageRegistry().put(DatamodelsPackage.eNS_URI, DatamodelsPackage.eINSTANCE);
		URI uri = URI.createFileURI(datamodelURI);
		Resource resource = resourceSet.getResource(uri, true);
		resource.load(null);
		EcoreUtil.resolveAll(resourceSet);
		Resource xmiResource = resourceSet.createResource(uri.trimFileExtension().appendFileExtension(XMIFileExtension));
		xmiResource.getContents().add(resource.getContents().get(0));
		xmiResource.save(null);
		return xmiResource;
	}

	public static void main(String[] args) throws IOException {
		transformDataModelXText2XMI();
		transformSecurityModelXText2XMI();
	}

	private static void transformSecurityModelXText2XMI() throws IOException {
		Injector injector = new SecuritymodelsStandaloneSetup().createInjectorAndDoEMFRegistration();
		ResourceSet resourceSet = injector.getInstance(ResourceSet.class);
		resourceSet.getPackageRegistry().put(SecuritymodelsPackage.eNS_URI, SecuritymodelsPackage.eINSTANCE);
		URI uri = URI.createFileURI(securitymodelURI);
		Resource resource = resourceSet.getResource(uri, true);
		resource.load(null);
		EcoreUtil.resolveAll(resourceSet);
		SecurityModel secModel = (SecurityModel) resource.getContents().get(0);
		Resource xmiResource = resourceSet.createResource(uri.trimFileExtension().appendFileExtension(XMIFileExtension));
		xmiResource.getContents().add(secModel);
		xmiResource.save(null);
	}
}
