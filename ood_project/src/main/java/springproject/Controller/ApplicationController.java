package springproject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by mohammad on 7/3/2017.
 */
@Controller
@RequestMapping("/home")
public class ApplicationController {

    @RequestMapping("/")
    public String homepage(){
        System.out.println("in homepage function");
        return "homepage";
    }

}
