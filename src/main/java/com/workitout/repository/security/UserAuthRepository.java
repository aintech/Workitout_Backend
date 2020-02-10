package com.workitout.repository.security;

import com.workitout.model.security.UserAuth;
import org.springframework.data.repository.CrudRepository;

public interface UserAuthRepository extends CrudRepository<UserAuth, Long> {

    UserAuth findByUsername(String username);
}
