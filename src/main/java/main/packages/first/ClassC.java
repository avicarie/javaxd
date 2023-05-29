package main.packages.first;

class ClassC extends ClassB{ // package-private
    private void Test(){
        System.out.println(this.a);
//        System.out.println(this.b); // nie można użyć bo b jest private
    }
}
