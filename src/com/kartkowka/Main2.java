package com.kartkowka;

import java.util.HashSet;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) {

        //1 wylosuj 20 liczb z zakresu od 1 do 50 i zapisz w dowolnej zmiennej
        //2 przygotuj zmienną zawierającą liczby z 1 zadania bez powtórzeń
        //3 wypisz z tablicy liczby pierwsze
        //4 znajdź najdłuższy ciąg rosnący w elementach  z zadania 1

        // ZADANIE 2
        System.out.println("zadanie 2");
         Set<Integer> tablica = new HashSet<>();

        while (tablica.size() < 20) {
            tablica.add((int) (Math.random() * 50 + 1));

        }
        System.out.println(tablica);
    }
    }
