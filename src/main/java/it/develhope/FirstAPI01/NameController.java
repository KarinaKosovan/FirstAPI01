package it.develhope.FirstAPI01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/name")
public class NameController {

    @GetMapping
    public String getName() {
        return "Karina Alejandra Kosovan";
    }

    @PostMapping
    public String postName() {
        StringBuilder myName = new StringBuilder("Karina Alejandra Kosovan");
        return myName.reverse().toString();
    }

}