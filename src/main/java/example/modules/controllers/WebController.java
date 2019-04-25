package example.modules.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value={"/web"})
public class WebController {
    @RequestMapping(value="/index",method = {RequestMethod.GET,RequestMethod.POST})
    public String index(){
        return "web/index";
    }
//    @RequestMapping(value="/redirect",method=RequestMethod.GET)
//    public String redirect(){
//        return "redirect:finalPage";
//    }
    @RequestMapping(value="/finalPage",method = RequestMethod.GET)
    public String finalPage(){
        return "web/final";
    }

    @RequestMapping(value="/staticPage",method = RequestMethod.GET)
    public String redirect(){
        return "redirect:/pages/final.html";
    }

}
