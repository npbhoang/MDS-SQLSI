/*
 * generated by Xtext 2.15.0
 */
package uam.mde20.sqlsi.xtext.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import uam.mde20.sqlsi.xtext.datamodels.ui.internal.DatamodelsActivator;

public class DatamodelsUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return DatamodelsActivator.getInstance().getInjector("uam.mde20.sqlsi.xtext.Datamodels");
	}

}
