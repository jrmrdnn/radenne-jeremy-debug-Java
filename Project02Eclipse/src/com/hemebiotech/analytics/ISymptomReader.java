package com.hemebiotech.analytics;

import java.util.List;

/**
 * Anything that will read symptom data from a source
 * 
 * @author Radenne Jérémy
 * @version 1.0
 */
public interface ISymptomReader {
	List<String> getSymptoms();
}
