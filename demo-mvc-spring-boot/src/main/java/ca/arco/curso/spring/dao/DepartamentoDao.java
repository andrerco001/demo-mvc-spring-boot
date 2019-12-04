package ca.arco.curso.spring.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import ca.arco.curso.spring.domain.Departamento;

@Repository
public interface DepartamentoDao {

	void save(Departamento departamento);

	void update(Departamento departamento);

	void delete(Long id);

	Departamento findById(Long id);

	List<Departamento> findAll();
}
