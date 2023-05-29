package main.flow;

public class JumpStatements {
    public static void main(String[] args) {
//        breakLoop();
//        continueLoop();
        labelsLoop();
//        testTwo();
    }

    public static void breakLoop(){
        for (int i = 0; i < 10; i++) {
            if(i == 3) {
                break;
            }
            System.out.println(i);
        }
    }

    public static void continueLoop(){
        for (int i = 0; i < 10; i++) {
            if(i == 3) {
                continue;
            }
            System.out.println(i);
        }
    }

    public static void labelsLoop(){
        tenths: for (int i = 1; i <= 5; i++) {
            for (int j = 0; j <= 9; j++) {
                if(i == 3 && j > 5){
                    break tenths;
                }
                System.out.println(i + "" + j); // 10 11 12 13 14 15 16 17 18 19 20
            }
        }
    }

    public static void testTwo(){
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j <= 9; j++) {
                System.out.println(j);
            }
        }
    }
}
