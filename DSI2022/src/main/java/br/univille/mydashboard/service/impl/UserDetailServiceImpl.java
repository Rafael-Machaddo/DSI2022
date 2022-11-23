package br.univille.mydashboard.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import br.univille.mydashboard.repository.Usuariorepository;

@Service
public class UserDetailServiceImpl 
    implements UserDetailsService{
    
    @Autowired
    private Usuariorepository repository;

    @Override
    public UserDetails loadUserByUsername(String username)
        throws UsernameNotFoundException {
        var usuario = repository.findByEmail(username);
        
        return new User(usuario.getEmail(),
                        usuario.getSenha(),
                        new ArrayList<>());
        }
}
