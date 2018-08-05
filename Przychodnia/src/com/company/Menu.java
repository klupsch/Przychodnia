package com.company;

import java.util.LinkedList;
import java.util.Scanner;

public class Menu {

    LinkedList<Lekarz> listaLekarzy = new LinkedList<>();
    LinkedList<Wizyty> listaWizyt = new LinkedList<>();

    public void MenuGlowne()
    {

       while (true) {


            Scanner wybor = new Scanner(System.in);
            System.out.println("Witamy w przychodni co chcesz zrobić?");
            System.out.println("\n1: Dodaj Pacjenta  " +
                    "\n2: Dodaj Lekarza " +
                    "\n3: Umów wizyte" +
                    "\n4: Wyświetl liste wizyt" +
                    "\n5: Wyświetl liste lekarzy");
            System.out.print("\n=================================="+
                    "\nTwój wybór to: " + " \n "
            );

            int wybórOpcji = wybor.nextInt();

            if (wybórOpcji == 1) {

                DodaniePacjenta pacjent = new DodaniePacjenta();


                break;
            }
            if (wybórOpcji == 2) {

                DodanieLekarza dodanieLekarza=new DodanieLekarza();

                dodanieLekarza.dodawanieLekarza();


                break;

            }
            if (wybórOpcji == 3) {

               DodanieWizyty dodanieWizyty = new DodanieWizyty();
               dodanieWizyty.dodawanieWizyty();

                break;
            }

            if (wybórOpcji == 4) {

              //  Wizyty wizyty= new Wizyty();
                //  System.out.println(Wizyty.poll);

                break;
            }
            if (wybórOpcji == 5){

                System.out.println(listaLekarzy.peek());
            }

            else

                if (wybórOpcji != 1 || wybórOpcji !=2 | wybórOpcji !=3 | wybórOpcji != 4 | wybórOpcji !=5) ;

            {
                System.out.println("wybierz opcje");

            }

        }
    }
}
