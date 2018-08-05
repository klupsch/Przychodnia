package com.company;


;


public class Lekarz {

    private String imie;
    private String specjalizacja;

    public Lekarz(String imie, String specjalizacja) {
        this.imie = imie;
        this.specjalizacja = specjalizacja;
    }

    @Override
    public String toString() {
        return "Lekarz{" +
                "imie='" + imie + '\'' +
                ", specjalizacja='" + specjalizacja + '\'' +
                '}';
    }
}







