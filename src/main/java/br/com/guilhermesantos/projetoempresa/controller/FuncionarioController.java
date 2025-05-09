package br.com.guilhermesantos.projetoempresa.controller;

import br.com.guilhermesantos.projetoempresa.dao.FuncionarioDAO;
import br.com.guilhermesantos.projetoempresa.model.Funcionario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class FuncionarioController {

    @Autowired
    private FuncionarioDAO dao;

    @GetMapping("/testefuncionario")
    public Funcionario recuperarTeste(){
        Funcionario teste = dao.findById(1).get();
        return teste;
    }

    @GetMapping("/todos")
    public ArrayList<Funcionario> recuperarTodos(){
        return (ArrayList<Funcionario>)dao.findAll();
    }
}
