package main.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
  public static void main(String[] args) {
    List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 10, 215, 32, 12, 10, 1);
//
//    integerList.stream()
//        .filter(it -> {
//          System.out.println("filter: " + it);
//          return it > 10;
//        })
//        .findFirst();
//
//    integerList.stream().

    // mapa
    // bierze każdy z elementów i zamienia go na to co zwracamy
    List<Integer> doubleTheValue = integerList.stream().map(integer -> integer * 2).collect(Collectors.toList());
    System.out.println(doubleTheValue);
    List<String> toString = integerList.stream().map(integer -> integer.toString()).collect(Collectors.toList());
    System.out.println(toString);

    // flatMap pozwala nam np zamienienia listy list w jedną listę
    // 20 Lekarzy i każdy z nich ma X wizyt - ma listę wizyt
    // masz 20 list wizyt i możesz z nich zrobić 1 listę i np sobie wypisać wszystkie wizytu od razu
    List<List<Integer>> listOfLists = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4));
    List<Integer> collect = listOfLists.stream().flatMap(integers -> integers.stream()).collect(Collectors.toList());
    System.out.println(collect);

    //filter
    // filtruje wartości w oparciu o podany predykat (funkcja przyjmująca 1 wartośc [dla nas każdy kolejny element ze streama] i zwracająca true albo false)

    // distinct zwraca wszystkie unikalne (nie zwróci 2 razy tego samego) i to działa na klasach które overridują equals
    List<Integer> distinctIntegers = integerList.stream().distinct().collect(Collectors.toList());
    System.out.println(distinctIntegers);

    // reduce - zamienia streama w jedną wartość
    // identity - wartość początkowa
    // Accumulator - funkcja która przyjmuje 2 parametry (wynik tego co dotychczas "zredukowaliśmy", następny element streama)
    // Combiner - funkcja
    // 1 przykład to suma liczb w liscie
    Integer sumOfIntegers = integerList.stream().reduce(0, (sum, element) -> sum + element);
    // (1, 2, 3, 4, 5, 6, 10, 215, 32, 12, 10, 1)
    // sum = 0, element = 1 -> 0 + 1 -> 1
    // sum = 1, element = 2 -> 1 + 2 -> 3
    // sum = 3, element = 4 -> 3 + 4 -> 7
    System.out.println(sumOfIntegers);

    List<ClassA> classAList = Arrays.asList(new ClassA("Adam", 15), new ClassA("Zbigniew", 22));
    Integer ageSum = classAList
        .stream()
        .reduce(0, (sum, element) -> sum + element.getAge(), (integer, integer2) -> 0);
    System.out.println(ageSum);


//    integerList.stream().

//    Stream<Integer> integerStream = integerList
//        .stream()
//        .filter(it -> {
//          System.out.println("filter: " + it);
//          return it > 10;
//        })
//        .map(integer -> {
//          System.out.println("map: " + integer);
////          "ADAM"
////          "MADA"
////          "KAMIL"
////          "LIMAK"
//          return integer;
//        })
//        .sorted()
//        .map(integer -> {
//          System.out.println("map: " + integer);
////          "ADAM"
////          "MADA"
////          "KAMIL"
////          "LIMAK"
//          return integer;
//        });
//
//    // dla .map
//    // SIZED // flaga zostaje
//    // DISTINCT // flaga zostaje usunieta
//    // SORTED // flaga zostaje usunieta
//    // ORDERED // flaga zostaje
//
//    List<Integer> filteredIntegers = new ArrayList<>();
//    for (Integer i : integerList) {
////      System.out.println("filtered: " + i);
//      if (i > 10) {
//        filteredIntegers.add(i);
//      }
//    }
//    List<Integer> mappedIntegers = new ArrayList<>();
//    for (Integer i : filteredIntegers) {
////      System.out.println("mapped: " + i);
//      i = i * 2;
//    }
//
////    integerList.forEach(integer -> System.out.print(integer + ", "));
////    System.out.println();
////    integerList.forEach(integer -> System.out.print(integer + ", "));
////    System.out.println();
//
//    Set<Integer> collect = integerStream.collect(Collectors.toSet());
//
////    integerStream.forEach(integer -> System.out.print(integer + ", "));
////    System.out.println();
//
//    // zeby stream się wykonał musi być zawołana terminalOpertaion
//    // allMatch()
//    // anyMatch()
//    // noneMatch()
//    // collect()
//    // count()
//    // forEeach()
//    // min()
//    // max()
//    // reduce() => zamienienie na pojedyńcza wartośc
//
//    System.out.println("test");
  }

}

class ClassA {
  private String name;
  private Integer age;

  public ClassA(String name, Integer age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }
}