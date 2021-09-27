package labs.lab8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Lab8p {
    public static void main(String[] args) {
        try {
            BufferedReader names = Files.newBufferedReader(Paths.get("names.txt"));
            BufferedWriter small = Files.newBufferedWriter(Paths.get("small.txt"));
            BufferedWriter large = Files.newBufferedWriter(Paths.get("large.txt"));
            for (String s; (s = names.readLine()) != null;) {
                BufferedWriter out = (s.length() <= 5) ? small : large;
                out.write(s);
                out.newLine();
            }
            names.close();
            small.close();
            large.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
