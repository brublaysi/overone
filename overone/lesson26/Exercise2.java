package by.overone.lesson26;

import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise2 {
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("C:\\Users\\JJ\\IdeaProjects\\HomeTask\\src\\by\\5.txt");
        BufferedReader buffer = new BufferedReader(file);
        String words = null;
        while ((words = buffer.readLine()) != null) {
            Pattern p = Pattern.compile("\\b[OoAaEeIiYyUu]\\S+\\b");
            Matcher m = p.matcher(words);
            if (m.find()) {
                System.out.println(m.group() + " ");
            }
            file.close();
        }
    }
}