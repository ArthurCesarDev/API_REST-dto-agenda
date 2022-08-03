package com.Mapper.domain.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Mapper.domain.entity.Paciente;
import com.Mapper.domain.service.PacienteService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/paciente")

public class PacienteController {

	private final PacienteService service;
	
	@PostMapping	
	public ResponseEntity<Paciente> salvar(@RequestBody Paciente paciente){
		Paciente pacieenteSalvo = service.salvar(paciente); 
		return ResponseEntity.status(HttpStatus.CREATED).body(pacienteSalvo);
	}
}
