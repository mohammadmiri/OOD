package springproject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import springproject.Model.Employee;
import springproject.Model.OrderEntity;
import springproject.Model.UserEntity;
import springproject.Service.UserCatalogue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

/**
 * Created by mohammad on 7/2/2017.
 */
@Controller
@RequestMapping("/user")
public class TestController {

    @Autowired
    private UserCatalogue userCatalogue;

    @RequestMapping("/save")
    public String save(){
        System.out.println("in save method");
        UserEntity user = new UserEntity();
        user.setFirstName("mohammad");
        user.setPassword("1234567");
        user.setLastName("miri");
        user.setUsername("mohammad");
        userCatalogue.addUser(user);
        return "save method";
    }

    @RequestMapping("/home")
    public String home(Model model){
        System.out.println("in home method");
        return "homepage";
    }

    @RequestMapping(value = "testadd", method = RequestMethod.POST)
    public String submit(@RequestParam("name") String name){
        System.out.println("name is:"+name);
        return "/forms/test";
    }

    @RequestMapping(value = "/form", method = RequestMethod.POST)
    public String submit(@Valid @ModelAttribute("employee")OrderEntity order,
                         BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        System.out.println("cost:"+order.getTotalCost());
        model.addAttribute("totalCost", order.getTotalCost());
        return "form2";
    }

    @RequestMapping(value = "/order", method = RequestMethod.GET)
    public ModelAndView showForm() {
        System.out.println("in show form method");
        return new ModelAndView("form2", "order", new OrderEntity());
    }

}
