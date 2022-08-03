package com.Mapper.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Mapper.domain.entity.Paciente;
@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long>{
}
