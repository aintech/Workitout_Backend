package com.workitout.service.security;

import com.workitout.model.security.UserAuth;
import com.workitout.repository.security.UserAuthRepository;
import com.workitout.repository.security.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class UserAuthService implements UserDetailsService {

    @Autowired
    UserAuthRepository repo;

    @Autowired
    UserRoleRepository roleRepo;

    @Autowired
    BCryptPasswordEncoder passwordEncoder;

    public UserAuth save(UserAuth userAuth) {
        return repo.save(userAuth);
    }

    public UserAuth get(Long id) {
        return repo.findById(id).orElseThrow(() -> new RuntimeException("Unable to find exercise with ID " + id));
    }

    public UserAuth update(Long id, UserAuth userAuth) {
        UserAuth user = get(id);
        user.setUserRoles(userAuth.getUserRoles());
        user.setPassword(passwordEncoder.encode(userAuth.getPassword()));
        return repo.save(user);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return repo.findByUsername(username);
    }
}
