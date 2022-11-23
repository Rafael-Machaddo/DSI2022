package br.univille.mydashboard.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Staff extends Usuario{
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long id;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    private int AWaprover;
    private int TicketChief;

    @OneToMany(cascade = {CascadeType.MERGE,CascadeType.REFRESH})
    @JoinColumn(name = "Staff_id", referencedColumnName = "id")
    private List<Tickets> listadeTickets = new ArrayList<>();
    
    @OneToMany(cascade = {CascadeType.MERGE,CascadeType.REFRESH})
    @JoinColumn(name = "Staff_id", referencedColumnName = "id")
    private List<Allowlist> listadeAL = new ArrayList<>();

    public int getAWaprover() {
        return AWaprover;
    }
    public void setAWaprover(int aWaprover) {
        AWaprover = aWaprover;
    }
    public int getTicketChief() {
        return TicketChief;
    }
    public void setTicketChief(int ticketChief) {
        TicketChief = ticketChief;
    }

}