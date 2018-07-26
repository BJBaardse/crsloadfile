package com.company;
import java.io.*;
import java.net.URL;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        //URL yahoo = new URL("");
        System.setProperty("http.agent", "Chrome");
        URL url = new URL("http://creative-scape.com/paradime/version.txt");
        Scanner s = new Scanner(url.openStream());
        Double dubbs = Double.valueOf(s.next());
        System.out.println(dubbs);
    }
}

