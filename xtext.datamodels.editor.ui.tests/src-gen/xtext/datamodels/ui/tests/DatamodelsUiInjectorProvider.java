/*
 * generated by Xtext 2.15.0
 */
package xtext.datamodels.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import xtext.datamodels.editor.ui.internal.EditorActivator;

public class DatamodelsUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return EditorActivator.getInstance().getInjector("xtext.datamodels.Datamodels");
	}

}
