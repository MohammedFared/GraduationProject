package com.example.egypt.app;

import java.io.Serializable;

/**
 * Created by Mohammed on 29/10/2015.
 */
public class Member implements Serializable {

    public String name = "";
    public String relation="";
    public boolean  image=false;

    public Member(String name , String relation ,boolean image) {
        super();
        this.name=name;
        this.relation=relation;
        this.image=image;

    }

}
