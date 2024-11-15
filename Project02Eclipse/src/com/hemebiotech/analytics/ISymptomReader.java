package com.hemebiotech.analytics;

import java.util.List;

/**
 * Anything that will read symptom data from a source
 * 
 * @author Radenne Jérémy
 */
public interface ISymptomReader {
	List<String> getSymptoms();
}
