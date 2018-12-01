package no.hydra.julekalender.controller;

import no.hydra.julekalender.model.Alv;
import no.hydra.julekalender.service.AlvService;
import org.springframework.web.bind.annotation.*;

@RestController("/alv")
public class AlvController {

    private AlvService alvService;

    public AlvController(AlvService alvService) {
        this.alvService = alvService;
    }

    @PostMapping
    private Alv leggTilAlv(@RequestBody Alv alv) {
        return this.alvService.leggTilAlv(alv);
    }


}
