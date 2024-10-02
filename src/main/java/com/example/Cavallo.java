package com.example;

public class Cavallo extends Thread {

    private int numeroCavallo;
    private int lunghezzaPista; //metri
    private Classifica classifica;

    public Cavallo(int numeroCavallo, int lunghezzaPista, Classifica classifica){
        this.lunghezzaPista=lunghezzaPista;
        this.numeroCavallo=numeroCavallo;
        this.classifica=classifica;
    }
    
    public void run(){
        for(int i =0; i<lunghezzaPista; i++){
            System.out.println("cavallo "+numeroCavallo+" ha percorso metri: "+ (i+1));
        }
        aggiungiAllaClassifica();
    }

    public void aggiungiAllaClassifica(){
        classifica.add(this);
    }

    public int getNumeroCavallo() {
        return numeroCavallo;
    }

    public int getLunghezzaPista() {
        return lunghezzaPista;
    }

    @Override
    public String toString() {
        return "Cavallo " + numeroCavallo ;
    }

    


    

    
}
