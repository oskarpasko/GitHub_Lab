package com.company;

public class Garaz extends Pomieszczenie implements PowierzchnioLiczone{
    int szerokoscBramy;
    int wysokoscBramy;

    @Override
    public int policzPole() {
        return szerokoscBramy * wysokoscBramy;
    }
}
