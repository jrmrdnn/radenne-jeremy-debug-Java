package com.hemebiotech.analytics;

import java.util.Map;

/**
 * Anything that will write symptom data to a source
 * 
 * @author Radenne Jérémy
 * @version 1.0
 */
public interface ISymptomWriter {
    void writeSymptoms(Map<String, Integer> symptoms);
}
