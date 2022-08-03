package com.Mapper.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Mapper.domain.entity.Paciente;
import com.Mapper.domain.repository.PacienteRepository;

import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class PacienteService {

	
	private final PacienteRepository repository;
	
	public Paciente salvar(Paciente paciente) {
		
		return repository.save(paciente);		
	}
	
	
	public List<Paciente> listaTodos(){
		return repository.findAll();
	}
	
	// Optinal possa ser que não existar um id de paciente.
	public Optional<Paciente> buscarPorId(Long id) {
		return repository.findById(id);
	}
	
	public void deletar(Long id) {	
		repository.deleteById(id);
	}
	
}