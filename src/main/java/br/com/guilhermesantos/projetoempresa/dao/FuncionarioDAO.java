package br.com.guilhermesantos.projetoempresa.dao;

import br.com.guilhermesantos.projetoempresa.model.Funcionario;
import org.springframework.data.repository.CrudRepository;

public interface FuncionarioDAO extends CrudRepository<Funcionario, Integer> {

}
