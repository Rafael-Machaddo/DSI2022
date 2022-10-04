package br.univille.mydashboard.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Allowlist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private int telefone;
    private String formulario1;
    private String formulario2;
    private String formulario3;
    private String formulario4;
    
    @OneToOne(cascade = {CascadeType.MERGE,CascadeType.REFRESH})
    private Usuario usuario;
    

    public String getFormulario1() {
        return formulario1;
    }
    public void setFormulario1(String formulario1) {
        this.formulario1 = formulario1;
    }
    public String getFormulario2() {
        return formulario2;
    }
    public void setFormulario2(String formulario2) {
        this.formulario2 = formulario2;
    }
    public String getFormulario3() {
        return formulario3;
    }
    public void setFormulario3(String formulario3) {
        this.formulario3 = formulario3;
    }
    public String getFormulario4() {
        return formulario4;
    }
    public void setFormulario4(String formulario4) {
        this.formulario4 = formulario4;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
}
