package life.goyell.akshit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebsiteController {

    @RequestMapping(value = {"/","/home"},method = RequestMethod.GET)
    public String home(){
        return "jsp/index";
    }
}
