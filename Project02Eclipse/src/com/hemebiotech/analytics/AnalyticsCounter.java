package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AnalyticsCounter implements ISymptomReader, ISymptomWriter {
	public static void main(String[] args) {
		AnalyticsCounter analyticsCounter = new AnalyticsCounter();
		List<String> symptoms = analyticsCounter.getSymptoms();
		Map<String, Integer> symptomsMap = analyticsCounter.countSymptoms(symptoms);
		analyticsCounter.writeSymptoms(symptomsMap);
	}
	
	@Override
	public List<String> getSymptoms() {
		return new ReadSymptomDataFromFile().getSymptoms();
	}

	public Map<String, Integer> countSymptoms(List<String> symptoms) {
		Map<String, Integer> symptomsMap = new TreeMap<>();
		for (String symptom : symptoms)
			symptomsMap.put(symptom, symptomsMap.getOrDefault(symptom, 0) + 1);
		return symptomsMap;
	}
	
	@Override
	public void writeSymptoms(Map<String, Integer> symptoms) {
		new WriteSymptomDataToFile().writeSymptoms(symptoms);
	}
}