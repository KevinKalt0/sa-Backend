package dev;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "test")
public class Test {

    @GetMapping (path = "string")
    public String getString() {
        return "Chaine de caractère transmise par SA";
    }
}
