package ca.arco.curso.spring.service;

import java.util.List;

import ca.arco.curso.spring.domain.Funcionario;

public interface FuncionarioService {

	void salvar(Funcionario funcionario);

	void editar(Funcionario funcionario);

	void excluir(Long id);

	Funcionario buscarPorId(Long id);

	List<Funcionario> buscaTodos();
}
