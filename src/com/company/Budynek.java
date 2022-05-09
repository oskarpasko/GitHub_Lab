package com.company;

public class Budynek implements PowierzchnioLiczone{

    public int powierzchniaDzialki;
    public int[] pietra = new int[0];
    public int[] garaze = new int[0];

    public int podajiloscPieter(){
        return 0;
    }

    @Override
    public int policzPole() {
        return 0;
    }
}
