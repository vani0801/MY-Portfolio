package com.Portfolio_Website.portfolio.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping({"/", "", "/home"})
    public String showHomePage(){
        return "home";
    }

    @GetMapping("/projects")
    public String showProjectsPage(){
        return "projects";
    }
    @GetMapping("/resume")
    public String showResumePage(){
        return "resume";
    }
    @GetMapping("/contact")
    public String showContactPage(){
        return "contact";
    }
}
