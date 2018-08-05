package com.company;




public class Wizyty {

    private String idPacjenta;
    private String idLekarza;

    public Wizyty(String idPacjenta, String idLekarza) {
        this.idPacjenta = idPacjenta;
        this.idLekarza = idLekarza;
    }

    @Override
    public String toString() {
        return "Wizyty{" +
                "idPacjenta='" + idPacjenta + '\'' +
                ", idLekarza='" + idLekarza + '\'' +
                '}';
    }
}




