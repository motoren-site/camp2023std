package no.miles.camp2023.SteinarHelloWorld;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class HelloController
{

    private static final String PRODUCES = "application/json; charset=UTF-8";

    @GetMapping(path = "/camp2023std/hello", produces = PRODUCES)
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hi!");
    }
}
