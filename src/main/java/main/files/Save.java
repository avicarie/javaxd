package main.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Save {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("G:/not/pliki/xd.txt", true);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.write("xd");
        printWriter.append("xd").append("ala").append("ma").append("kota").write("lalala");
        printWriter.close();
    }
}
