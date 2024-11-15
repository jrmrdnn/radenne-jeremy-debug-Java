package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AnalyticsCounter {

    public static void main(String[] args) {
        Map<String, Integer> symptomsMap = new TreeMap<>();

        try {
            List<String> symptomsList = Files.readAllLines(Paths.get("Project02Eclipse/symptoms.txt"));

            for (String symptom : symptomsList) symptomsMap.put(symptom, symptomsMap.getOrDefault(symptom, 0) + 1);
            
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("Project02Eclipse/result.out"))) {
                for (Map.Entry<String, Integer> entry : symptomsMap.entrySet()) {
                    writer.write(entry.getKey() + ":" + entry.getValue());
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}