package no.miles.camp2023.SteinarHelloWorld;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController
{

    private static final String PRODUCES = "application/json; charset=UTF-8";

    @GetMapping(path = "/steinar/hello", produces = PRODUCES)
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hi ostepopp!");
    }
}
