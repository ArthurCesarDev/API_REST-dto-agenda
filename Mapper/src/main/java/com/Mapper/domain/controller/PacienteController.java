package com.Mapper.domain.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Mapper.domain.entity.Paciente;
import com.Mapper.domain.service.PacienteService;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@RestController
@RequestMapping("/paciente")
public class PacienteController {

	private final  PacienteService service;
	
	// salva banco de dados
	@PostMapping	
	public ResponseEntity<Paciente> salvar(@RequestBody Paciente paciente){
		Paciente pacienteSalvo = service.salvar(paciente); 
		return ResponseEntity.status(HttpStatus.CREATED).body(pacienteSalvo);
	}
	// lista todos 
	@GetMapping
	public ResponseEntity<List<Paciente>> listarTodos() {
	List<Paciente> pacientes = service.listaTodos();
	return ResponseEntity.status(HttpStatus.OK).body(pacientes);
	}
}
