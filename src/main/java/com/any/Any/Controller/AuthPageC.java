package com.any.Any.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AuthPageC {

    @RequestMapping(value = {"/authPage"}, method = RequestMethod.GET)
    public String page() {
        return "authPage";
    }

    @RequestMapping(value = {"/authPage"}, method = RequestMethod.POST)
    public String pageP() {
        return "admin";
    }

}
