package no.hydra.julekalender.service;

import no.hydra.julekalender.model.Alv;
import no.hydra.julekalender.repository.AlvRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlvService {

    private AlvRepository alvRepository;

    @Autowired
    public AlvService(AlvRepository alvRepository) {
        this.alvRepository = alvRepository;
    }

    public Alv leggTilAlv(Alv alv) {
       return alvRepository.save(alv);
    }
}
