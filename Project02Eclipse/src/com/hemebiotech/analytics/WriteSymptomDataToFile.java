package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

public class WriteSymptomDataToFile implements ISymptomWriter {

    /**
     * Write the symptoms and their occurrences to a file
     * @param symptoms Map of symptoms with their occurrences
     * @author Radenne Jérémy
     * @version 1.0
     * @return void
     */
    @Override
    public void writeSymptoms(Map<String, Integer> symptoms) {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get("Project02Eclipse/result.out"))) {
            for (Map.Entry<String, Integer> entry : symptoms.entrySet()) {
                writer.write(entry.getKey() + ":" + entry.getValue());
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error writing file: " + e.getMessage());
        }
    }
}
