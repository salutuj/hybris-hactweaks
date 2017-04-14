/** */
package eu.pawelniewiadomski.java.hybris.hactweaks.aspects;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.ui.Model;

import eu.pawelniewiadomski.java.hybris.hactweaks.context.HacInitUpdateModeAware;

/** @author Paweł Niewiadomski */
public class HacInitUpdateModeFinderAspect implements ApplicationContextAware {
  private static final Logger LOG = Logger.getLogger(HacInitUpdateModeFinderAspect.class);
  private ApplicationContext applicationContext;

  public void injectModeToInterestedBeans(final JoinPoint joinPoint) {
    final Object[] args = joinPoint.getArgs();
    if (args != null && args.length == 1 && args[0] instanceof Model) {
      final Model model = (Model) args[0];
      final Object title = model.asMap().get("title");
      if (title != null) {
        final String hacInitUpdateMode = title.toString().toUpperCase();
        applicationContext
            .getBeansOfType(HacInitUpdateModeAware.class)
            .values()
            .forEach(bean -> bean.setHacInitUpdateMode(hacInitUpdateMode));
      }
    }
  }

  @Override
  public void setApplicationContext(final ApplicationContext applicationContext)
      throws BeansException {
    this.applicationContext = applicationContext;
  }
}
