package no.hydra.julekalender.controller;

import no.hydra.julekalender.Konstanter;
import no.hydra.julekalender.model.DagensVinner;
import no.hydra.julekalender.service.DagensVinnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DagensVinnerController {

    private DagensVinnerService dagensVinnerService;

    @Autowired
    public DagensVinnerController(DagensVinnerService dagensVinnerService) {
        this.dagensVinnerService = dagensVinnerService;
    }

    @GetMapping("/dagens-vinner")
    @CrossOrigin(Konstanter.FRONT_END_URL_PROD)
    public DagensVinner hentDagensVinner() {
        return dagensVinnerService.dagensVinner();
    }
}
