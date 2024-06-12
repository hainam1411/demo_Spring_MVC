package org.example.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {
    @GetMapping("/halo")
    public String greeting(Model model) {
        model.addAttribute("name", "Yare yare daze");
        model.addAttribute("name2", "Za warudo");
        return "index";
    }
}
