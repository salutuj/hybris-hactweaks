/** */
package eu.pawelniewiadomski.java.hybris.hactweaks.systemsetup;

import de.hybris.platform.commerceservices.setup.AbstractSystemSetup;
import de.hybris.platform.core.initialization.SystemSetup;
import de.hybris.platform.core.initialization.SystemSetupParameter;
import de.hybris.platform.core.initialization.SystemSetupParameterMethod;

import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;

import eu.pawelniewiadomski.java.hybris.hactweaks.constants.HacTweaksConstants;
import eu.pawelniewiadomski.java.hybris.hactweaks.context.HacInitUpdateModeAware;

/** @author Paweł Niewiadomski */
@SystemSetup(extension = HacTweaksConstants.EXTENSIONNAME)
public class HacTweaksSystemSetup extends AbstractSystemSetup implements HacInitUpdateModeAware {
  private static final Logger LOG = Logger.getLogger(HacTweaksSystemSetup.class);
  private String hacInitUpdateMode;

  @Override
  @SystemSetupParameterMethod
  public List<SystemSetupParameter> getInitializationOptions() {
    LOG.info("Hac Init/Update mode is: " + hacInitUpdateMode);
    return Collections.singletonList(
        createBooleanSystemSetupParameter("HacTweaksKey", "HacTweaks", false));
  }

  @Override
  public void setHacInitUpdateMode(final String hacInitUpdateMode) {
    this.hacInitUpdateMode = hacInitUpdateMode;
  }
}
