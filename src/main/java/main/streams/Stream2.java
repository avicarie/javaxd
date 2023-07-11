package main.streams;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

public class Stream2 {
  public static void main(String[] args) throws JsonProcessingException {
    InputStream resourceAsStream = Stream2.class.getClassLoader().getResourceAsStream("person.json");

    String personJson = new BufferedReader(new InputStreamReader(resourceAsStream, StandardCharsets.UTF_8))
        .lines()
        .collect(Collectors.joining());

    ObjectMapper mapper = new ObjectMapper();
    JsonNode personJackson = mapper.readTree(personJson);

    System.out.println(personJackson.get("friends").get(0));

  }
}
