package com.hemebiotech.analytics;

import java.util.Map;

/**
 * Anything that will write symptom data to a source
 * 
 * @author Radenne Jérémy
 */
public interface ISymptomWriter {
    void writeSymptoms(Map<String, Integer> symptoms);
}
