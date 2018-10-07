package b_Zadania_Domowe.a_Dzien_3;

//W pliku `Main3.java` umieść metodę o sygnaturze `static int getLength(String str)`.
//
//1. Uzupełnij ciało metody tak, aby zwracała długość napisu `str`,
//2. obsłuż wyjątek wywołania metody `getLength(null)`.

public class Main3 {

    public static void main(String[] args) {
        System.out.println(getLength(null));
    }

    static int getLength(String str){
        int strLenght = 0;
            try {
                strLenght = str.length();
            }
            catch (NullPointerException e){
                System.out.println("Argument can't be null!!!");
                strLenght = -1;
            }
            return strLenght;
    }

}
