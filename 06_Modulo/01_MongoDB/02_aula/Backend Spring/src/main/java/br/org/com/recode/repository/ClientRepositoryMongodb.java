package br.org.com.recode.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.org.com.recode.model.ClientMongodb;

@Repository
public interface ClientRepositoryMongodb extends MongoRepository<ClientMongodb, String> {


	
}
