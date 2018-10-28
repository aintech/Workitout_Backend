package com.workitout.model;

import com.fasterxml.jackson.databind.util.StdConverter;
import java.util.LinkedHashMap;

/**
 *
 * @author Aintech
 */
public class ByteDeserializeConventer extends StdConverter<LinkedHashMap<Integer, Integer>, byte[]> {

    @Override
    public byte[] convert(LinkedHashMap<Integer, Integer> value) {
        byte[] source = new byte[value.size()];
        for (int i = 0; i < value.size(); i++) {
            source[i] = (byte)(int)value.get(i);
        }
        return source;
    }
}