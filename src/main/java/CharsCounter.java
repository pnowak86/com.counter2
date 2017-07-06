//package com.sda.word;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.length;

/**
 * Created by RENT on 2017-07-05.
 */
public class CharsCounter implements Countable {


    @Override
    public int countLines(String filePath) {
            int charsCount = 0;
            //List<String> lines = null;
            try {
                List <String> lines = Files.readAllLines(Paths.get(filePath));
                System.out.println(lines.get(0));
                System.out.println(lines.get(1));
                List<String> words = new ArrayList<>();
                lines.forEach(line -> Collections.addAll(words, line.split(" ")));
                for (String word : words) {
                    charsCount += word.length();
                }
            } catch (IOException e) {
                e.printStackTrace();

            }
            return charsCount;
        }
    }
