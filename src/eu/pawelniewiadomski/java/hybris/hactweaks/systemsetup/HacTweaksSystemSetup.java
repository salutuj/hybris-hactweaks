/**
 *
 */
package eu.pawelniewiadomski.java.hybris.hactweaks.systemsetup;

import de.hybris.platform.commerceservices.setup.AbstractSystemSetup;
import de.hybris.platform.core.initialization.SystemSetup;
import de.hybris.platform.core.initialization.SystemSetupParameter;

import java.util.List;

import eu.pawelniewiadomski.java.hybris.hactweaks.constants.HacTweaksConstants;


/**
 * @author Paweł Niewiadomski
 *
 */
@SystemSetup(extension = HacTweaksConstants.EXTENSIONNAME)
public class HacTweaksSystemSetup extends AbstractSystemSetup
{

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.commerceservices.setup.AbstractSystemSetup#getInitializationOptions()
	 */
	@Override
	public List<SystemSetupParameter> getInitializationOptions()
	{
		// YTODO Auto-generated method stub
		return null;
	}

}
