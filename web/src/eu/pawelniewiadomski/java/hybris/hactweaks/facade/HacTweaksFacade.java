/** */
package eu.pawelniewiadomski.java.hybris.hactweaks.facade;

import java.util.Map;

import com.google.common.collect.ImmutableMap;

import eu.pawelniewiadomski.java.hybris.hactweaks.data.HacTweaksInitData;

/** @author Paweł Niewiadomski */
public class HacTweaksFacade {

  public Map<String, Object> update(final HacTweaksInitData data) {
    final ImmutableMap.Builder<String, Object> resultBuilder = ImmutableMap.builder();
    return resultBuilder.build();
  }
}
