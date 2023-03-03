package edu.eci.Name;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyNameController {
    @GetMapping("/")
    public String getStatus(){
        return "Nicole Vanessa Montaña Gómez";
    }
}