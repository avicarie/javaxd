package main.strings;

public class Operations {
    public static void main(String[] args) {
        String t = "5";
//        String c = t.concat("test");
//        System.out.println(t);
//        System.out.println(c);
        StringBuilder stringBuilder = new StringBuilder(t);
        for (int i = 0; i < 500_000_000; i++) {
            stringBuilder.append("\nx");
        }
        t = stringBuilder.toString();

        System.out.println("end");
//        System.out.println(t);

    }
    public void test(){
        String t = "5";
        t = new StringBuilder(t).append("x").toString();
    }
}
