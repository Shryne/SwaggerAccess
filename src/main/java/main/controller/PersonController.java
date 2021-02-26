package main.controller;

import main.model.Person;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(
    path = "/person",
    produces = MediaType.APPLICATION_JSON_VALUE
)
public class PersonController {
    @PostMapping
    public void create(final Person person) {

    }

    @GetMapping
    public Person get() {
        return new Person();
    }
}
