package com.cocorette.genesis.authentication;

import javax.persistence.*;

@Entity(name="authorities")
public class AuthorityEntity {
    @Id
    @GeneratedValue
    private int id;
    private String authority;
    @ManyToOne
    @JoinColumn(name = "username")
    private UserEntity user;

    public AuthorityEntity(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }
}
