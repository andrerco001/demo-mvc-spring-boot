package ca.arco.curso.spring.dao;

import java.util.List;

import ca.arco.curso.spring.domain.Cargo;

public interface CargoDao {
	
	void save(Cargo cargo);

	void update(Cargo cargo);

	void delete(Long id);

	Cargo findById(Long id);

	List<Cargo> findAll();
}
