package com.hemebiotech.analytics;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReadSymptomDataFromFile implements ISymptomReader {
	
	/**
	 * Get the list of symptoms from the file
	 * @author Radenne Jérémy
	 * @version 1.0
	 * @return List of symptoms
	 */
	@Override
	public List<String> getSymptoms() {
		List<String> symptoms = new ArrayList<>();

		try {
			symptoms = Files.readAllLines(Paths.get("Project02Eclipse/symptoms.txt"));
		} catch (IOException e) {
			System.out.println("An error occurred: " + e.getMessage());
		}
		
		return symptoms;
	}

}
