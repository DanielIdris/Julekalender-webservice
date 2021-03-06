package no.hydra.julekalender.repository;

import no.hydra.julekalender.model.Alv;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlvRepository extends MongoRepository<Alv, String> {
}
