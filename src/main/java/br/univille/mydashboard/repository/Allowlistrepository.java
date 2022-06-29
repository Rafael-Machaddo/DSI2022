package br.univille.mydashboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.univille.mydashboard.entity.Allowlist;

@Repository
public interface Allowlistrepository 
            extends JpaRepository<Allowlist, Long> {
    
}
