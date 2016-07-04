package com.peploleum.thinbp.service;

import javax.enterprise.context.RequestScoped;

@RequestScoped
public class DataProvider {
    public String produce(){
        return "tadaaaa";
    }
}
