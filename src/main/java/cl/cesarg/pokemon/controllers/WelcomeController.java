package cl.cesarg.pokemon.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

    /**
     * This is the home page
     * @return
     */
    @GetMapping("/")
    public String welcome () {
        return "Welcome";
    }
}
