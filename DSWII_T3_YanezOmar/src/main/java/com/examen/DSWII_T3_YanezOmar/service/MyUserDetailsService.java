package com.examen.DSWII_T3_YanezOmar.service;

package com.examen.DSWII_T3_YanezOmar.service;

import com.examen.DSWII_T3_YanezOmar.model.User;
import com.examen.DSWII_T3_YanezOmar.model.bd.Usuario;
import com.examen.DSWII_T3_YanezOmar.repository.UserRepository;
import com.examen.DSWII_T3_YanezOmar.repository.UsuariorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UsuariorRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario user = userRepository.findByUserName(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
        return new org.springframework.security.core.userdetails.User(
                user.getNombres(), user.getPassword(), (Collection<? extends GrantedAuthority>) user.getRoles());
    }
}

