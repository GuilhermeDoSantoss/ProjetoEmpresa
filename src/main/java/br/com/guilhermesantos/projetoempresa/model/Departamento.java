package br.com.guilhermesantos.projetoempresa.model;

import jakarta.persistence.*;

@Entity                        // para indicar que a classe corresponde a uma entidade armazenável
@Table(name = "departamento")  // especificar o nome da tabela (porque nao coincide com o nome da classe)
public class Departamento {

    @Id                                                 // informo que o atributo é chave-primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // informo que é auto-increment
    @Column(name = "numero_id")                         // especifico o nome da coluna
    private int numeroId;

    @Column(name = "nome", length = 100, nullable = false)
    private String nome;

    @Column(name = "andar", nullable = false)
    private int andar;

    public int getNumeroId() {
        return numeroId;
    }

    public void setNumeroId(int numeroId) {
        this.numeroId = numeroId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }
}
