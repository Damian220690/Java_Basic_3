package b_Zadania_Domowe.a_Dzien_3;

//W pliku `Main4.java` umieść metodę o sygnaturze `static int toInt(String str)`.
//
//1. Uzupełnij ciało metody tak, aby zwracała napis `str` zamieniony na typ `int`,
//2. obsłuż możliwe wyjątki.

public class Main4 {

    public static void main(String[] args) {
        System.out.println(toInt("Hello"));
    }

    static int toInt(String str){
        int numericType = 0;
        try {
            numericType = Integer.parseInt(str);
        }
        catch (NumberFormatException e){
            System.out.println("You should enter numeric value!!!");
            numericType = -1;
        }
        return numericType;
    }
}
