package no.hydra.julekalender;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GodJul {

    @GetMapping("/godjul")
    private String godJul() {
        return "God Jul!";
    }
}
