package br.com.mongoproject.repositories;

import br.com.mongoproject.entities.Person;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PersonRepository extends MongoRepository<Person, String> {

    Person findBy_id(ObjectId _id);

    List<Person> findByLastname(@Param("name") String name);
}
