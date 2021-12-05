package com.example.mednew.models;

import javax.persistence.*;

@Entity
@Table(name = "cart")
public class Cart {

    public Cart() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

//    @ManyToOne
//    @JoinColumn(name = "product_id", referencedColumnName = "id")
//    private Product product;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
