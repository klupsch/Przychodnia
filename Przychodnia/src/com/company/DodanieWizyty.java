package com.company;

import java.util.Scanner;

public class DodanieWizyty {

    public void dodawanieWizyty() {

        Menu menu = new Menu();
        Scanner wybor = new Scanner(System.in);

        System.out.print("Podaj pacjenta: ");

        String pacjent = wybor.nextLine();

        System.out.print("Podaj lekarza: ");

        String lekarz = wybor.nextLine();

        System.out.println("Czy napewno dodać wizyte? [t]/[n]");

        if (wybor.nextLine().equals("t")) {

            menu.listaWizyt.add(new Wizyty(pacjent, lekarz));

            System.out.println("Wizyta dodana do systemu.");
            menu.MenuGlowne();

        } else {

            System.out.println("Wizyta nie dodana.");

            menu.MenuGlowne();
        }


    }
}
