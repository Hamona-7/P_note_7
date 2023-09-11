package note.P_note.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {
    @RequestMapping("/")
    public ModelAndView index() throws Exception {
        ModelAndView mav = new ModelAndView("main");
        mav.addObject("name", "JSP");

        List<String> testList = new ArrayList<>();
        testList.add("a");
        testList.add("b");
        testList.add("c");

        mav.addObject("list", testList);
        return mav;
    }
}
