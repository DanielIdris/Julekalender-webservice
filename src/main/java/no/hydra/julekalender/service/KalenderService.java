package no.hydra.julekalender.service;

import no.hydra.julekalender.model.Alv;
import no.hydra.julekalender.model.Lodd;
import no.hydra.julekalender.model.Pakke;
import no.hydra.julekalender.repository.AlvRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class KalenderService {

    private static final Double ANTALL_LODD_PER_ALV = 8.0;

    private AlvRepository alvRepository;

    @Autowired
    public KalenderService(AlvRepository alvRepository) {
        this.alvRepository = alvRepository;
    }

    public Alv finnDagensVinner() {
        List<Alv> alver = this.alvRepository.findAll();
        List<Lodd> loddList = new ArrayList<>();

        for(Alv alv: alver) {
            double antallLodd = ANTALL_LODD_PER_ALV * alv.getHandikapp();
            for(int i = 0; i < antallLodd; i++){
                loddList.add(new Lodd(alv.getId()));
            }
        }

        Random random = new Random(Double.doubleToLongBits(Math.random()));
        int heldigVinner = random.nextInt(loddList.size());

        Alv alv = null;
        Optional<Alv> alvOptional = alvRepository.findById(loddList.get(heldigVinner).getAlvId());
        if(alvOptional.isPresent()){
            alv = alvOptional.get();
        }

        if (alv != null) {
            alv.setHandikapp(alv.getHandikapp() / 2);
            Pakke pakke = new Pakke();
            pakke.setDate(new Date());
            alv.getPakker().add(pakke);
        }

        alvRepository.save(alv);


        return alv;
    }


}
