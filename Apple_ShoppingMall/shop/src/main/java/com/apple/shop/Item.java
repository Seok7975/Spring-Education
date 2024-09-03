package com.apple.shop;

import jakarta.persistence.*;
import lombok.ToString;

@Entity
@ToString
public class Item {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column()
    public String title;
    public Integer price;

//    @Override
//    public String toString() {
//        return this.title + this.price;
//    }
}
