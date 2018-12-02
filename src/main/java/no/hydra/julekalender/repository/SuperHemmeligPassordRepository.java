package no.hydra.julekalender.repository;

import no.hydra.julekalender.model.SuperHemmeligPassord;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuperHemmeligPassordRepository extends MongoRepository<SuperHemmeligPassord, String> {
}
