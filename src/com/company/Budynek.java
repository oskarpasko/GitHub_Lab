package com.company;

public class Budynek implements PowierzchnioLiczone{

    public int powierzchniaDzialki;
    public Pietro[] pietra;
    public Garaz[] garaze;


    @Override
    public int policzPole() {
        int suma=0;
        for(int i = 0; i < pietra.length ;i++)
        {
            suma += pietra[i].policzPole();
        }
        for(int i = 0; i < garaze.length ;i++)
        {
            suma += garaze[i].policzPole();
        }

        return suma;
    }
}
