package br.univille.mydashboard.entity;

//import java.util.ArrayList;
import java.util.Date;
//import java.util.List;

//import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
//import javax.persistence.JoinColumn;

//import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Usuario {
    @Id
    private long id;
    private String nome;
    private String email;
    private String sexo;
    private String telefone;
    @Temporal(value = TemporalType.DATE)
    private Date nascimento;

    //@OneToMany(cascade = CascadeType.ALL)
    //@JoinColumn(name = "Usuario_id", referencedColumnName = "id")
    //private List<Tickets> listadeTickets = new ArrayList<>();

    //@OneToMany(cascade = CascadeType.ALL)
    //@JoinColumn(name = "Usuario_id", referencedColumnName = "id")
    //private List<Allowlist> listadeAL = new ArrayList<>();

    public long getId() {
        return id;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public Date getNascimento() {
        return nascimento;
    }
    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    
}
