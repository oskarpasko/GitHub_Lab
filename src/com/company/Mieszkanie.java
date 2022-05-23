package com.company;

public class Mieszkanie extends ElementPietra implements PowierzchnioLiczone {

    public String wizytowka;
    public Pomieszczenie[] pomieszczenia;

    @Override
    public int policzPole() {
        int suma=0;
        for(int i = 0; i < pomieszczenia.length ;i++)
        {
            suma += pomieszczenia[i].policzPole();
        }
        return suma;
    }
}