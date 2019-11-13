package softuni.springcardemo.data.web.controlers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeControler {
    @GetMapping("/")
    public String home(){
        ModelAndView modelAndView=new ModelAndView();

        modelAndView.setViewName("home");
        return "home";
    }
}
