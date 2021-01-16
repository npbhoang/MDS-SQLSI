package uam.mde20.sqlsi.henshin.securitymodels.exec;

import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Engine;
import org.eclipse.emf.henshin.interpreter.UnitApplication;
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl;
import org.eclipse.emf.henshin.interpreter.impl.EngineImpl;
import org.eclipse.emf.henshin.interpreter.impl.UnitApplicationImpl;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;

import securitymodels.SecuritymodelsPackage;

public class Main {

	final static String inputSecurityModelsURI = "../usecase.university/%s";
	final static String outputSecurityModelsURI = "../usecase.university/normalize-universitySM.xmi";
	final static String transformationURI = "transformations/default.henshin";

	public static void main(String[] args) {
		HenshinResourceSet resourceSet = new HenshinResourceSet();
		resourceSet.getPackageRegistry().put(SecuritymodelsPackage.eNS_URI, SecuritymodelsPackage.eINSTANCE);

		EGraph graph = new EGraphImpl(resourceSet.getResource(String.format(inputSecurityModelsURI, args[0])));

		Module module = resourceSet.getModule(transformationURI, false);
		Engine engine = new EngineImpl();
		UnitApplication normalizeSecurityModelApp = new UnitApplicationImpl(engine);
		normalizeSecurityModelApp.setEGraph(graph);
		normalizeSecurityModelApp.setUnit(module.getUnit("main"));

		if (!normalizeSecurityModelApp.execute(null)) {
			throw new RuntimeException("Error running Henshin!!");
		}
		resourceSet.saveEObject(graph.getRoots().get(0), outputSecurityModelsURI);
	}

}
