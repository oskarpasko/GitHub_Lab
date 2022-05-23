package com.company;

public class Pomieszczenie extends ElementPietra implements PowierzchnioLiczone {

    int szerokosc;
    int dlugosc;
    String nazwa;

    @Override
    public int policzPole() {
        return szerokosc * dlugosc;
    }
}
