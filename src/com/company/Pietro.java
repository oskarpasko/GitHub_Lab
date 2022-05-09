package com.company;

public class Pietro {
    int numerPietra;
    int [] ElementPietra;
    int podajIloscPomieszczen;
}
public Pietro(int numerPietra, int[] ElementPietra, int podajIloscPomieszczen){
    this.numerPietra = numerPietra;
    this.ElementPietra = ElementPietra;
    this.podajIloscPomieszczen = podajIloscPomieszczen;

}

    public int getNumerPietra() {
        return numerPietra;
    }

    public int[] getElementPietra() {
        return ElementPietra;
    }

    public int getPodajIloscPomieszczen() {
        return podajIloscPomieszczen;
    }

    public void setNumerPietra(int numerPietra) {
        this.numerPietra = numerPietra;
    }

    public void setElementPietra(int[] elementPietra) {
        ElementPietra = elementPietra;
    }

    public void setPodajIloscPomieszczen(int podajIloscPomieszczen) {
        this.podajIloscPomieszczen = podajIloscPomieszczen;
    }

