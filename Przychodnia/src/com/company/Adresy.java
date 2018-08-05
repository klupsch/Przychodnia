package com.company;




public class Adresy {

    String adresPacjenta;
    int numerTelefonu;

    public Adresy(String adresPacjenta, int numerTelefonu) {
        this.adresPacjenta = adresPacjenta;
        this.numerTelefonu = numerTelefonu;
    }

    @Override
    public String toString() {
        return "Adresy{" +
                "adresPacjenta='" + adresPacjenta + '\'' +
                ", numerTelefonu=" + numerTelefonu +
                '}';
    }
}
