package no.hydra.julekalender.controller;

import no.hydra.julekalender.Konstanter;
import no.hydra.julekalender.model.Alv;
import no.hydra.julekalender.service.KalenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController()
public class KalenderController {

    private KalenderService kalenderService;

    @Autowired
    public KalenderController(KalenderService kalenderService) {
        this.kalenderService = kalenderService;
    }

    @GetMapping("/vinner")
    @CrossOrigin(Konstanter.FRONT_END_URL_PROD)
    @ResponseBody
    public Alv finnDagensVinner(@RequestHeader String passord) throws IllegalAccessException {
       return this.kalenderService.finnDagensVinner(passord);
    }

}
