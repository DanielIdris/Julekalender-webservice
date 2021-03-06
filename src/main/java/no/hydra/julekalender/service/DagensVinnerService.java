package no.hydra.julekalender.service;

import no.hydra.julekalender.model.Alv;
import no.hydra.julekalender.model.DagensVinner;
import no.hydra.julekalender.repository.DagensVinnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DagensVinnerService {

    private DagensVinnerRepository dagensVinnerRepository;

    @Autowired
    public DagensVinnerService(DagensVinnerRepository dagensVinnerRepository) {
        this.dagensVinnerRepository = dagensVinnerRepository;
    }

    public DagensVinner lagreDagensVinner(Alv alv1, Alv alv2){
        DagensVinner dagensVinner = new DagensVinner();
        dagensVinner.setAlv1(alv1);
        dagensVinner.setAlv2(alv2);
        return this.dagensVinnerRepository.save(dagensVinner);
    }

    public boolean erDetEnVinnerIDag(){
        return !this.dagensVinnerRepository.findAll().isEmpty();
    }

    public DagensVinner dagensVinner() {
        List<DagensVinner> dagensVinnerList = this.dagensVinnerRepository.findAll();
        if(dagensVinnerList.isEmpty()){
            return null;
        }
        return dagensVinnerList.get(0);
    }

    @Scheduled(cron = "0 0 0 * * *")
    public void slettDagensVinner() {
        this.dagensVinnerRepository.deleteAll();
    }
}
