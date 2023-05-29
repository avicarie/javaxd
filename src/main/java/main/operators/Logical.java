package main.operators;

public class Logical {
    // rok przestępny
    // podzielny przez 4
    // nie jest podzielny przez 100
    // jeśli jest podzielny przez 400 to jest przestępny

    public static void main(String[] args) {
        System.out.println(leapYear(1904));
        System.out.println(leapYearTwo(1904));
    }

    public static Boolean leapYear(Integer year){
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            return true;
        }
        return false;
    }

    //guard clause
    public static Boolean leapYearTwo(Integer year){
        if(year % 400 == 0){
            return true;
        }
        if(year % 100 == 0){
            return false;
        }
        if(year % 4 == 0){
            return true;
        }
        return false;
    }
}

// stack int, bool, new Integer();
// metoda(){
//    Integer test = new Integer();
// }
//
