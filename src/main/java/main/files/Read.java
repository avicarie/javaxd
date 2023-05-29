package main.files;

import java.io.IOException;
import java.io.InputStream;

public class Read {
    public static void main(String[] args) throws IOException {
        ReadResource readResource = new ReadResource();
        String s = readResource.readResource();
        System.out.println(s);
    }
}

class ReadResource {
    public String readResource() throws IOException {
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("text.txt");
        return new String(inputStream.readAllBytes());
    }
}
