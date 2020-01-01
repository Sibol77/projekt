package ii.uph.edu.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping(path = "/")
  //  @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
    public String home(Model model) {
        model.addAttribute("message", "Witaj na stronie pizzeri italiano!!!");
        return "home";
    }

}



