package by.overone.lesson26;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise4 {
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("C:\\Users\\JJ\\IdeaProjects\\HomeTask\\src\\by\\Numbers.txt");
        BufferedReader buffer = new BufferedReader(file);
        String numsWord = null;
        while ((numsWord = buffer.readLine()) != null) {
            Pattern p = Pattern.compile("\\d+");
            Matcher m = p.matcher(numsWord);
            List<String> resultNum = new ArrayList<>();
            while (m.find()) resultNum.add(m.group());
            System.out.println(resultNum.stream().max(Comparator.comparingInt(String::length)).get());
        }
    }
}
