package com.workitout.util;

import com.fasterxml.jackson.databind.util.StdConverter;    
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author Aintech
 */
public class ByteDeserializeConventer extends StdConverter<Object, byte[]> {

    @Override
    public byte[] convert(Object value) {
        byte[] source = new byte[0];
        if (value instanceof Map) {
            LinkedHashMap<Object, Integer> map = (LinkedHashMap<Object, Integer>)value;

            source = new byte[map.size()];
            if (map.keySet().contains("0")) {
                for (Map.Entry<Object, Integer> entry : map.entrySet()) {
                    source[Integer.parseInt(entry.getKey().toString())] = (byte)(int)entry.getValue();
                }
            } else {
                for (Map.Entry<Object, Integer> entry : map.entrySet()) {
                    source[(Integer)entry.getKey()] = (byte)(int)entry.getValue();
                }
            }
        }
        return source;
    }
}
