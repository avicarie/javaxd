package main.flow;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        a = scanner.nextInt();

        if(a > 4){
            System.out.println("geater than 4");
        } else if(a < 2){
            System.out.println("less than 2");
        } else {
            System.out.println("else");
        }
        //ternary operator musi coś zwracać
//        a > 4 ? System.out.println("geater than 4") : System.out.println("else"); // dlatego to nie zadziała
        // mozna to zastąpić w ten sposób
        System.out.println(printTextTwo(a));

        System.out.println(a > 4 ? "geater than 4" : a < 2 ? "less than 2" : "else");
        switch (a){
            case 5:
                System.out.println("five");
            case 4:
                System.out.println("four");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("default");
        }
    }

    private void test(){
        Integer number = 1;
        String text = "12345";
        if(text.length() < 10) {
            number = 10;
        } else {
            number = 20;
        }

        number = text.length() < 10 ? 10 : 20;
    }

    public static void printText(Integer a){
        if(a > 4){
            System.out.println("geater than 4");
            return;
        }
        if(a < 2){
            System.out.println("less than 2");
            return;
        }
        System.out.println("else");
    }

    public static String printTextTwo(Integer a){
        if(a > 4){
            return "geater than 4";
        }
        if(a < 2){
            return "less than 2";
        }
        return "else";
    }

    // https://www.youtube.com/shorts/Zmx0Ou5TNJs
    public static void nestedIf(){
        if(true){
            if(false){

            }
        }
    }
}
