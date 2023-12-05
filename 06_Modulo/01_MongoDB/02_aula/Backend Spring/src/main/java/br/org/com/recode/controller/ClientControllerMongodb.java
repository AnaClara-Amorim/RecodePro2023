package br.org.com.recode.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import br.org.com.recode.model.ClientMongodb;
import br.org.com.recode.repository.ClientRepositoryMongodb;

@CrossOrigin(origins = "http://localhost:3000")

@RestController
public class ClientControllerMongodb {

	@Autowired
	private ClientRepositoryMongodb clientRepositoryMongodb;


	// get all clients
	@GetMapping("/clients")
	public List<ClientMongodb> getAllClients() {
		return clientRepositoryMongodb.findAll();		
		
	}
	
	// get client by id rest api
	@GetMapping("/clients/{id}")
	public ClientMongodb getClientById(@PathVariable String id) {
		return clientRepositoryMongodb.findById(id).get();
	}

	// create client rest api
	@PostMapping("/clients")
	public ClientMongodb createClient(@RequestBody ClientMongodb client) {
		return clientRepositoryMongodb.save(client);
	}


	// update client rest api

	@PutMapping("/clients/{id}")
	public ClientMongodb updateClient(@PathVariable String id, @RequestBody ClientMongodb clientDetails) {
		ClientMongodb client = clientRepositoryMongodb.findById(id).get();

		client.setName(clientDetails.getName());
		client.setEmail(clientDetails.getEmail());

		return clientRepositoryMongodb.save(client);

	}

	// delete client rest api
	@DeleteMapping("/clients/{id}")
	public void deleteClient(@PathVariable String id) {
		clientRepositoryMongodb.deleteById(id);
	}

}
