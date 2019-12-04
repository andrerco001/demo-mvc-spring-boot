package ca.arco.curso.spring.dao;

import org.springframework.stereotype.Repository;

import ca.arco.curso.spring.domain.Funcionario;

@Repository
public class FuncionarioImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao {

}
