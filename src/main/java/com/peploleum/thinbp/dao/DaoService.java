package com.peploleum.thinbp.dao;


import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DaoService {

    public String produceData() {
        return " data";
    }

    @PostConstruct
    public void broadcast() {
        System.out.println("construct");
    }

}
