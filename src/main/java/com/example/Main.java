package com.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int lunghezzaPista=100;
        int numeroCavalli=20;
        Classifica classifica1 = new Classifica();
        List<Cavallo> cavalli = new ArrayList<>();
        for(int i=0; i<numeroCavalli;i++ ){
            cavalli.add(new Cavallo(i, lunghezzaPista, classifica1));
            cavalli.get(i).start();
        }
        try {
            for(int i=0; i<numeroCavalli;i++){
                cavalli.get(i).join();
            }
        } catch (Exception e) {
            System.out.println("errore thread");
        }
        System.out.println(classifica1.toString());
        
     
       

    }
}