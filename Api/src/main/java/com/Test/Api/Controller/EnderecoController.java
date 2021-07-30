package com.Test.Api.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.Test.Api.Model.Endereco;
import com.Test.Api.Repository.EnderecoRepository;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {

	@Autowired
	private EnderecoRepository er;
	
	@GetMapping
	public List<Endereco> listar() {
		return er.findAll();
	
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Endereco adicionar(@RequestBody Endereco endereco) {
		return er.save(endereco);
	}
	
	@PutMapping
	public Endereco atualizar(@RequestBody Endereco endereco) {
		return er.save(endereco);
	}
}

