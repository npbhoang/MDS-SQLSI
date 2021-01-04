/*
 * generated by Xtext 2.15.0
 */
package uam.mde20.sqlsi.xtext.ui;

import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import uam.mde20.sqlsi.xtext.securitymodels.ui.internal.SecuritymodelsActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class SecuritymodelsExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(SecuritymodelsActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		SecuritymodelsActivator activator = SecuritymodelsActivator.getInstance();
		return activator != null ? activator.getInjector(SecuritymodelsActivator.UAM_MDE20_SQLSI_XTEXT_SECURITYMODELS) : null;
	}

}