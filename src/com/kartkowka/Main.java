package com.kartkowka;
public class Main {
    public static void main(String[] args) {

        //1 wylosuj 20 liczb z zakresu od 1 do 50 i zapisz w dowolnej zmiennej
        //2 przygotuj zmienną zawierającą liczby z 1 zadania bez powtórzeń
        //3 wypisz z tablicy liczby pierwsze
        //4 znajdź najdłuższy ciąg rosnący w elementach  z zadania 1

        // ZADANIE 1
        int tablica[]=new int[20];
        for(int i=0;i<20;i++){
            tablica[i] = (int) (Math.random() * 50 + 1);
            System.out.print(tablica[i]+" ");
        }
    }
}