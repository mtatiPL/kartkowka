package com.kartkowka;
public class Main3 {
    public static void main(String[] args) {

        //1 wylosuj 20 liczb z zakresu od 1 do 50 i zapisz w dowolnej zmiennej
        //2 przygotuj zmienną zawierającą liczby z 1 zadania bez powtórzeń
        //3 wypisz z tablicy liczby pierwsze
        //4 znajdź najdłuższy ciąg rosnący w elementach  z zadania 1

        // ZADANIE 3

        System.out.println("zadanie 3");
        int tablica[]=new int[20];
        boolean liczba;
        for(int i=0;i<20;i++){
            tablica[i] = (int) (Math.random() * 50 + 1);
            System.out.println(tablica[i]+" ");

            for(int x=2;x<=tablica[i]/2;x++){

                if (tablica[i]%x==0){
               liczba = false;

                }
                else {
                    liczba=true;
                }



                if (liczba == false){
                    System.out.println(tablica[i]+"  liczba nie jest pierwsza     "+x);

                }
                else{
                    System.out.println(tablica[i]+"  liczba  jest pierwsza"+ x);

                }



            }


        }


    }
}