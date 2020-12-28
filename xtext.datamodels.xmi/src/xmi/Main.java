package xmi;


import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.inject.Injector;

import datamodels.DatamodelsPackage;
import datamodels.impl.DatamodelsPackageImpl;
import securitymodels.SecuritymodelsPackage;
import xtext.datamodels.DatamodelsStandaloneSetup;
import xtext.securitymodels.SecurityModelStandaloneSetup;

public class Main {

	public static final String INPUT_UNIVERSITY_DATAMODEL_PATH = "uni.dm";
	public static final String INPUT_UNIVERSITY_SECURITYMODEL_PATH = "uni.sec";
	public static final String OUTPUT_UNIVERSITY_DATAMODEL_PATH = "unidm.xmi";
	public static final String OUTPUT_UNIVERSITY_SECURITYMODEL_PATH = "unisec.xmi";
	
	public static void main(String[] args) throws IOException {
		Injector injector = new DatamodelsStandaloneSetup().createInjectorAndDoEMFRegistration();
		ResourceSet resourceSet = injector.getInstance(ResourceSet.class);
		resourceSet.getPackageRegistry().put(DatamodelsPackage.eNS_URI, DatamodelsPackage.eINSTANCE);
		Resource resource = resourceSet.getResource(URI.createURI(INPUT_UNIVERSITY_DATAMODEL_PATH), true);
		resource.load(null);
		EcoreUtil.resolveAll(resourceSet);
		Resource xmiResource = resourceSet.createResource(URI.createURI(OUTPUT_UNIVERSITY_DATAMODEL_PATH));
		xmiResource.getContents().add(resource.getContents().get(0));
		xmiResource.save(null);
//		Injector injector = new SecurityModelStandaloneSetup().createInjectorAndDoEMFRegistration();
//		ResourceSet resourceSet = injector.getInstance(ResourceSet.class);
//		resourceSet.getPackageRegistry().put(SecuritymodelsPackage.eNS_URI, SecuritymodelsPackage.eINSTANCE);
//		Resource resource = resourceSet.getResource(URI.createURI(INPUT_UNIVERSITY_SECURITYMODEL_PATH), true);
//		resource.load(null);
//		EcoreUtil.resolveAll(resourceSet);
//		Resource xmiResource = resourceSet.createResource(URI.createURI(OUTPUT_UNIVERSITY_SECURITYMODEL_PATH));
//		xmiResource.getContents().add(resource.getContents().get(0));
//		xmiResource.save(null);
	}

}
