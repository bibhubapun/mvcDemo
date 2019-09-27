package com.stackroute;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController{

    @GetMapping("/show")
    public ModelAndView getValue()
    {
        User user = new User();
        user.setName("Bibhu");
        ModelAndView mv = new ModelAndView("display");
        mv.addObject("value",user.getName());
        return mv;
    }


}