package com.example;

import kotlin.reflect.jvm.internal.impl.util.Check;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;

/**
 * Utility class for extracting the checkstyle.xml used by other projects
 */
public final class CheckstyleUtil {
    private CheckstyleUtil() {}

    public static String getCheckstyleConfig(String resourcePath) throws IOException {
        InputStream inputStream = CheckstyleUtil.class.getResourceAsStream(resourcePath);
        StringBuilder sb = new StringBuilder();
        try (Reader reader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8))) {
            int c;
            while ((c = reader.read()) != -1) {
                sb.append((char) c);
            }
        }
        return sb.toString();
    }
}
