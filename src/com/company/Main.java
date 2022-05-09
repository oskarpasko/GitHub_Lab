package com.company;

public class Main {

    public static void main(String[] args) {
        Pomieszczenie[] mojePomieszczenia = {
                new Pomieszczenie(){
                    {
                        this.szerokosc=3;
                        this.dlugosc=2;
                        this.nazwa="pokoj";
                    }
                },
                new Pomieszczenie(){
                    {
                        szerokosc=2;
                        dlugosc=2;
                        nazwa="lazienka";
                    }
                }
        };
    }
}
