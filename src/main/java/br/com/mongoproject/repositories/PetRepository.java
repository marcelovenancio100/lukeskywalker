package br.com.mongoproject.repositories;

import br.com.mongoproject.entities.Pet;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PetRepository extends MongoRepository<Pet, String> {

    Pet findBy_id(ObjectId _id);
}
