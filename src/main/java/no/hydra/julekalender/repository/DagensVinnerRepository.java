package no.hydra.julekalender.repository;

import no.hydra.julekalender.model.DagensVinner;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DagensVinnerRepository extends MongoRepository<DagensVinner, String> {
}
