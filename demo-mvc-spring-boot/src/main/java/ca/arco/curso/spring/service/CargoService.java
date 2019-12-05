package ca.arco.curso.spring.service;

import java.util.List;

import ca.arco.curso.spring.domain.Cargo;

public interface CargoService {
	
	void salvar(Cargo cargo);
	
	void editar(Cargo cargo);
	
	void excluir(Long id);
	
	Cargo buscarPorId(Long id);
	
	List<Cargo> buscaTodos();
	
}
