package com.company;

public class Pomieszczenie extends ElementPietra {
    int szerokosc;
    int dlugosc;
    String nazwa;

    public Pomieszczenie(int szerokosc, int dlugosc, String nazwa) {
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
        this.nazwa = nazwa;

    }

    public int getSzerokosc() {
        return szerokosc;
    }

    public int getDlugosc() {
        return dlugosc;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setSzerokosc(int szerokosc) {
        this.szerokosc = szerokosc;
    }

    public void setDlugosc(int dlugosc) {
        this.dlugosc = dlugosc;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
}
