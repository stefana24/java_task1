package org.example;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.nio.charset.Charset;
public class MostCommon {
    private String readFile(String path, Charset encoding) throws IOException
    {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, encoding);
    }

    public HashMap<String, Integer> getResult(String fileName) {
        HashMap<String, Integer> wordsMap = new HashMap<>();
        String content = null;
        try {
            content = this.readFile(fileName, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        content = content.replace("[\\.,]", "");
        String[] words = content.split(" ");
        for(String word: words){
            if (wordsMap.containsKey(word)) {
                wordsMap.put(word, wordsMap.get(word) + 1);
            } else {
                if(!word.isEmpty()){
                    wordsMap.put(word, 1);
                }
            }
        }
        wordsMap.entrySet()
                .stream()
                .sorted((one, another) -> -one.getValue()
                        .compareTo(another.getValue()))
                .limit(10)
                .forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));
        return wordsMap;
    }

    public static void main(String[] args) {
        MostCommon mc = new MostCommon();
        System.out.println(mc.getResult("blank.txt").size());
    }
}