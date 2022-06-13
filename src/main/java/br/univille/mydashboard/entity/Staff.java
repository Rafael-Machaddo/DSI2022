package br.univille.mydashboard.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Staff extends Usuario{
    private int AWaprover;
    private int TicketChief;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "Staff_id")
    private List<Tickets> listadeTickets = new ArrayList<>();
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "Staff_id")
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
