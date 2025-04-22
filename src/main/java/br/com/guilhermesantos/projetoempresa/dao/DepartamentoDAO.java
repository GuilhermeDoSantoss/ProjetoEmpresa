package br.com.guilhermesantos.projetoempresa.dao;

import br.com.guilhermesantos.projetoempresa.model.Departamento;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DepartamentoDAO extends CrudRepository<Departamento, Integer> {

    // para uso posterior: consultas customizadas

        public List<Departamento> findByOrderByNome();
        public List<Departamento> findByAndar(int andar);
        public List<Departamento> findByOrderByNumeroIdDesc();
        public List<Departamento> findByNumeroIdOrAndAndar(int numeroId, int andar);

}
