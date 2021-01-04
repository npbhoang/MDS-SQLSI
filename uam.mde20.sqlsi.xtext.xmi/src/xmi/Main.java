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
	private static Resource transformDataModelXText2XMI() throws IOException {
		Injector injector = new DatamodelsStandaloneSetup().createInjectorAndDoEMFRegistration();
		ResourceSet resourceSet = injector.getInstance(ResourceSet.class);
		resourceSet.getPackageRegistry().put(DatamodelsPackage.eNS_URI, DatamodelsPackage.eINSTANCE);
		Resource resource = resourceSet.getResource(URI.createURI("University.dm"), true);
		resource.load(null);
		EcoreUtil.resolveAll(resourceSet);
		Resource xmiResource = resourceSet.createResource(URI.createURI("UniversityDM.xmi"));
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
		Resource resource = resourceSet.getResource(URI.createURI("University.sm"), true);
		resource.load(null);
		EcoreUtil.resolveAll(resourceSet);
		SecurityModel secModel = (SecurityModel) resource.getContents().get(0);
		Resource xmiResource = resourceSet.createResource(URI.createURI("UniversitySM.xmi"));
		xmiResource.getContents().add(secModel);
		xmiResource.save(null);
	}
}
