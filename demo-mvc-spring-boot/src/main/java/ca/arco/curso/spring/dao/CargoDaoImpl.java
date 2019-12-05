package ca.arco.curso.spring.dao;

import org.springframework.stereotype.Repository;

import ca.arco.curso.spring.domain.Cargo;

@Repository
public class CargoDaoImpl extends AbstractDao<Cargo, Long> implements CargoDao {

}
