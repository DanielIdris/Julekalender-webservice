package no.hydra.julekalender.service;

import no.hydra.julekalender.model.SuperHemmeligPassord;
import no.hydra.julekalender.repository.SuperHemmeligPassordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuperHemmeligPassordService {

    private SuperHemmeligPassordRepository superHemmeligPassordRepository;

    @Autowired
    public SuperHemmeligPassordService(SuperHemmeligPassordRepository superHemmeligPassordRepository) {
        this.superHemmeligPassordRepository = superHemmeligPassordRepository;
    }

    public boolean sjekkOmPassordErGyldiog(String passord) {
        List<SuperHemmeligPassord> superHemmeligPassords = this.superHemmeligPassordRepository.findAll();
        SuperHemmeligPassord superHemmeligPassord = superHemmeligPassords.get(0);

        return passord.equals(superHemmeligPassord.getPassord());
    }
}
