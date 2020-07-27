package io.demo.springbootjwt.model;

import org.springframework.security.core.GrantedAuthority;

/**
 * @author Hamza Ouni
 */
public enum Role implements GrantedAuthority {
    ROLE_ADMIN, ROLE_CLIENT;

    public String getAuthority() {
        return name();
    }
}
