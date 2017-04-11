package eu.pawelniewiadomski.java.hybris.hactweaks.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import eu.pawelniewiadomski.java.hybris.hactweaks.constants.HacTweaksConstants;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class HacTweaksManager extends GeneratedHacTweaksManager
{
	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger( HacTweaksManager.class.getName() );
	
	public static final HacTweaksManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (HacTweaksManager) em.getExtension(HacTweaksConstants.EXTENSIONNAME);
	}
	
}
