package com.company;

public class Pietro {
    int numerPietra;
    public ElementPietra[] elementy;
    int podajIloscPomieszczen(){
        int suma=0;
        for(int i = 0; i < elementy.length ;i++)
        {
            suma += elementy[i].policzPole();
        }
        return suma;
    }

    public int policzPole() {
    }
}