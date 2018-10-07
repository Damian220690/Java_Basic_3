package b_Zadania_Domowe.a_Dzien_3;

//W pliku `Main2.java` umieść metodę o sygnaturze `static String safeGet(String[] strTab, int index)`.
//
//        1. Uzupełnij ciało metody tak aby zwracała element tablicy `strTab` zawarty pod indeksem `index`,
//        2. dodaj obsługę odpowiedniego wyjątku.

import java.sql.SQLOutput;

public class Main2 {

    public static void main(String[] args) {
        String[] someArray = {"Damian","Paulina","Kasia"};
        System.out.println(safeGet(someArray, 0));
    }

    static String safeGet(String[] strTab, int index){
        String result = "";
        try {
            result = strTab[index];
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index is out of bounds!!!");
        }
        return result;
    }
}
