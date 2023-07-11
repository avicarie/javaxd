package main.operators;

public class Second {
    private int count = 1;

    public static void main(String[] args) {
        int a = 0;
        a++;
        System.out.println(a);
        a = 0;

        System.out.println(a++); // wykonane po funkcji
        a=0;
        System.out.println(++a); // wykonan przed funkcją

        for (int i = 0; i < 5; ++i) {
            System.out.println(i);
        }
    }

    public void dodajUzytkownikow(){
        for (int i = 0; i < 5; i++) {
            if(true){ // załóżmy że to spradza np czy mają powyżej 18 lat
                test(count++);
            }
        }
    }

    // Dodawać do bazy danych nowego użytkownika z losowymi danymi
    public static void test(int a){

    }

}
