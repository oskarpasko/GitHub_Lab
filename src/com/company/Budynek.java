package com.company;

public class Budynek implements PowierzchnioLiczone{

    public int powierzchniaDzialki;
    public Pietro[] pietra = new Pietro[0];
    public Garaz[] garaze = new Garaz[0];

    public int podajiloscPieter(){
        return 0;
    }

    @Override
    public int policzPole() {
        return 0;
    }
}
