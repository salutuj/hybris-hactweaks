/** */
package eu.pawelniewiadomski.java.hybris.hactweaks.controller;

import de.hybris.platform.hac.controller.platform.InitUpdateController;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import eu.pawelniewiadomski.java.hybris.hactweaks.data.HacTweaksInitData;
import eu.pawelniewiadomski.java.hybris.hactweaks.facade.HacTweaksFacade;

/** @author Paweł Niewiadomski */
@Controller
@RequestMapping(value = "/platform/**")
public class HacTweaksInitUpdateController extends InitUpdateController {

  private HacTweaksFacade hacTweaksFacade;

  @RequestMapping(
    value = "init/hactweaksdata",
    method = RequestMethod.POST,
    headers = "Accept=application/json"
  )
  @ResponseBody
  public Map<String, Object> hacTweaksInitUpdateOnChange(
      @RequestBody final HacTweaksInitData data) {
    return hacTweaksFacade.update(data);
  }
}
