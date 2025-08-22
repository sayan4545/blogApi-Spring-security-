package com.dev.sayan.blogapi.services;

import com.dev.sayan.blogapi.entities.UserAuthEntity;
import com.dev.sayan.blogapi.repositories.UserAuthRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserAuthService implements UserDetailsService {

    private final UserAuthRepository userAuthRepository;

    public UserDetails save(UserAuthEntity userAuthEntity){
        return userAuthRepository.save(userAuthEntity);
    }
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userAuthRepository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("username not found"+username));

    }
}
