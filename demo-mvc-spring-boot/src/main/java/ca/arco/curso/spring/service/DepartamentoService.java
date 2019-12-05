package ca.arco.curso.spring.service;

import java.util.List;

import ca.arco.curso.spring.domain.Departamento;

public interface DepartamentoService {
	
void salvar(Departamento departamento);
	
	void editar(Departamento departamento);
	
	void excluir(Long id);
	
	Departamento buscarPorId(Long id);
	
	List<Departamento> buscaTodos();

	boolean departamentoTemCargos(Long id);

}
