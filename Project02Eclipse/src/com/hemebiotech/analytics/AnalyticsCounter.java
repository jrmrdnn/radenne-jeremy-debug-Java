package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Class to count the number of occurrences of each symptom and write them to a file
 * @version 1.0
 */
public class AnalyticsCounter implements ISymptomReader, ISymptomWriter {

	/**
	 * Get the list of symptoms from the file
	 * @author Radenne Jérémy
	 * @version 1.0
	 * @return List of symptoms
	 */
	@Override
	public List<String> getSymptoms() {
		return new ReadSymptomDataFromFile().getSymptoms();
	}

	/**
	 * Count the number of occurrences of each symptom
	 * @param symptoms List of symptoms
	 * @author Radenne Jérémy
	 * @version 1.0
	 * @return Map of symptoms with their occurrences
	 */
	public Map<String, Integer> countSymptoms(List<String> symptoms) {
		Map<String, Integer> symptomsMap = new TreeMap<>();
		for (String symptom : symptoms)
			symptomsMap.put(symptom, symptomsMap.getOrDefault(symptom, 0) + 1);
		return symptomsMap;
	}
	
	/**
	 * Write the symptoms and their occurrences to a file
	 * @param symptoms Map of symptoms with their occurrences
	 * @author Radenne Jérémy
	 * @version 1.0
	 * @return void
	 */
	@Override
	public void writeSymptoms(Map<String, Integer> symptoms) {
		new WriteSymptomDataToFile().writeSymptoms(symptoms);
	}
}