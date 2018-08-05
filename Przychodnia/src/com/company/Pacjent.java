package com.company;



public class Pacjent {

    String imiePacjenta;
    int numerKolejki;

    public Pacjent(String imiePacjenta, int numerKolejki) {
        this.imiePacjenta = imiePacjenta;
        this.numerKolejki = numerKolejki;


    }


    @Override
    public String toString() {
        return "Pacjent{" +
                "imiePacjenta='" + imiePacjenta + '\'' +
                ", numerKolejki=" + numerKolejki +
                '}';



    }


}
