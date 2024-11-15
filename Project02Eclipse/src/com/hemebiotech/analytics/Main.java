package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        AnalyticsCounter analyticsCounter = new AnalyticsCounter();
        List<String> symptoms = analyticsCounter.getSymptoms();
        Map<String, Integer> countSymptoms = analyticsCounter.countSymptoms(symptoms);
        analyticsCounter.writeSymptoms(countSymptoms);
	}
}
