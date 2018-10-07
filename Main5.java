package b_Zadania_Domowe.a_Dzien_3;

//W pliku `Main5.java` umieść metodę o sygnaturze `static int elementExists(int[] elements, int value)`.
//
//1. Uzupełnij ciało metody tak, aby sprawdzała czy w tablicy `elements` istnieje element o wartości
// `value`,
//2. jeżeli wartość nie istnieje, metoda zwróci wyjątek typu `Exception` z komentarzem: `Nie ma
// takiego elementu!`.
//3. Uzupełnij sygnaturę metody informacją, że może ona zwracać wyjątek typu `Exception`.



public class Main5 {

    public static void main(String[] args) {
        int[] elements = {1, 2, 3, 4, 5};
        try {
            System.out.println(elementExists(elements, 15));
        } catch (Exception e) {
            System.err.println("This element not exist on the array!!!");
        }
    }

    static int elementExists(int[] elements, int value) throws Exception {
        boolean result = false;
        for (int j : elements) {
            if (j == value) {
                System.out.println(value + " exist in our array");
                result = true;
                break;
            }
        }
        if (result == false) {
            throw new Exception();
        }
        return value;
    }
}

