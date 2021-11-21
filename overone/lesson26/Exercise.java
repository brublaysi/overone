package by.overone.lesson26;

import java.io.*;

public class Exercise {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\JJ\\IdeaProjects\\HomeTask\\src\\by\\SomeText.txt");
        InputStreamReader reader = new InputStreamReader(fileInputStream, "windows-1251");
        int i = -1;
        StringBuilder text = new StringBuilder();
        while ((i=reader.read()) != -1){
    text.append((char) i);
        }
        fileInputStream.close();
        System.out.println(text);
    }
}
