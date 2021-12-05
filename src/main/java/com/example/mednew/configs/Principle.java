package com.example.mednew.configs;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public class Principle implements UserDetails {
    private String name;
    private Boolean isAdult;
    private String email;
    private String password;
    private Integer age;

    public Principle() {
    }

    public Principle(String name, Boolean isAdult, String email, String password, Integer age) {
        this.name = name;
        this.isAdult = isAdult;
        this.email = email;
        this.password = password;
        this.age = age;
    }

    @Override
    public String getUsername() {
        return this.email;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getAdult() {
        return isAdult;
    }

    public void setAdult(Boolean adult) {
        isAdult = adult;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
