package b_Zadania_Domowe.a_Dzien_3;

//W pliku `Main1.java` umieść metodę o sygnaturze `static void average(String a, String b)`.
//
//1. Uzupełnij ciało metody tak, aby dokonała konwersji zmiennych `a` i `b` na typ liczbowy `int`,
//2. wykonała dzielenie zmiennej `a` przez zmienną `b`.
//3. Zabezpiecz program przed możliwymi błędami.

public class Main1 {

    public static void main(String[] args) {
        average("5","3");
    }

    static void average(String a, String b){
        try {
            int y = Integer.parseInt(a);
            int z = Integer.parseInt(b);
            double result = (double) y / z;
            String strResult = String.format("%.2f", result);
            System.out.println(strResult);
        }
        catch(NumberFormatException ex){
            System.out.println("You must enter numerical value!!!");
        }
        catch (ArithmeticException e){
            System.out.println("You can't divide by zero!!!");
        }
    }


}
