package com.company;


import java.util.Scanner;

public class DodanieLekarza {



    public void dodawanieLekarza() {

        Menu menu = new Menu();
        Scanner wybor = new Scanner(System.in);

        System.out.print("Podaj imię: ");

        String imie = wybor.nextLine();

        System.out.print("Podaj specjalizacje: ");

        String specjalizacja = wybor.nextLine();


        System.out.println("Czy napewno dodać lekarza? [t]/[n]");

        if (wybor.nextLine().equals("t")) {

            menu.listaLekarzy.add(new Lekarz(imie, specjalizacja));

            System.out.println("Lekarz dodany do listy lekarzy.");
            menu.MenuGlowne();

        } else {

            System.out.println("Lekarz nie dodany do listy lekarzy.");

            menu.MenuGlowne();
        }


    }


}
