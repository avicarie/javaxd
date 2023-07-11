package main.streams;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream2 {
  public static void main(String[] args) throws JsonProcessingException {
    InputStream resourceAsStream = Stream2.class.getClassLoader().getResourceAsStream("person.json");

    String personJson = new BufferedReader(new InputStreamReader(resourceAsStream, StandardCharsets.UTF_8))
        .lines()
        .collect(Collectors.joining());

    ObjectMapper mapper = new ObjectMapper();
    Person person = mapper.readValue(personJson, Person.class);

    List<String> collect = person.getFriends().stream().filter(it -> it.getEnemies().stream().filter(an -> an.getLevel() == 7).count() >= 2).map(
            Friend::getName).collect(Collectors.toList());

//    System.out.println(collect);

    List<Enemy> collect1 = person.getFriends().stream().flatMap(it -> it.getEnemies().stream()).toList();
    System.out.println(collect1);

  }
}
