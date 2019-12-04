package ca.arco.curso.spring.dao;

import java.util.List;

import ca.arco.curso.spring.domain.Funcionario;

public interface FuncionarioDao {
	
	void save(Funcionario funcionario);

	void update(Funcionario funcionario);

	void delete(Long id);

	Funcionario findById(Long id);

	List<Funcionario> findAll();

}
