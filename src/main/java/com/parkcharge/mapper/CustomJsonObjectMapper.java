package com.parkcharge.mapper;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;

import java.text.SimpleDateFormat;

/**
 * Created on 22.09.15.
 */
public class CustomJsonObjectMapper extends ObjectMapper {

    private static String projectDateFormat;

    public CustomJsonObjectMapper() {
        super();
        configure(SerializationConfig.Feature.WRITE_DATES_AS_TIMESTAMPS, false);
        setDateFormat(new SimpleDateFormat(projectDateFormat));
    }

    public static void setFormat(String value) {
        projectDateFormat = value;
    }

}