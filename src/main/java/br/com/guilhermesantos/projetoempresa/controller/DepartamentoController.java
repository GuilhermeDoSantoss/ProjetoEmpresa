package br.com.guilhermesantos.projetoempresa.controller;

import br.com.guilhermesantos.projetoempresa.dao.DepartamentoDAO;
import br.com.guilhermesantos.projetoempresa.model.Departamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class DepartamentoController {

    @Autowired
    private DepartamentoDAO dao;

    @GetMapping("/departamentos")
    public ArrayList<Departamento> recuperarTodos(){
        ArrayList<Departamento> lista;
        // lista = (ArrayList<Departamento>) dao.findAll();
        // lista = (ArrayList<Departamento>)dao.findByOrderByNome();
        // lista = (ArrayList<Departamento>)dao.findByAndar(1);
        lista = (ArrayList<Departamento>)dao.findByOrderByNumeroIdDesc();
        return lista;
    }
}
