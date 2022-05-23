package com.company;

public class Mieszkanie extends ElementPietra implements PowierzchnioLiczone {

    public String wizytowka;
    public Pomieszczenie[] pomieszczenie = new Pomieszczenie[0];

    @Override
    public int policzPole() {
        return 0;
    }
}
