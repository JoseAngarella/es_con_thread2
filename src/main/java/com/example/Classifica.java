package com.example;

import java.util.ArrayList;
import java.util.List;

public class Classifica {
    private List<Cavallo> classificaCavalli = new ArrayList<>();


    synchronized public void add(Cavallo c){
        classificaCavalli.add(c);
    }


    @Override
    public String toString() {
        return "Classifica: \n" + classificaCavalli.toString();
    }


    public List<Cavallo> getClassificaCavalli() {
        return classificaCavalli;
    }

    

    
}
