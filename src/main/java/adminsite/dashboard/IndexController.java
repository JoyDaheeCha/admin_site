package adminsite.dashboard;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping(value="/dashBoard")
    public String DashBoard() throws Exception{
        return "Dashboard/index";
    }
}
