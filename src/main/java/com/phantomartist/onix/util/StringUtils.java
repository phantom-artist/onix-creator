package com.phantomartist.onix.util;

public class StringUtils {

    public static String splitCamelCase(final String camelCase) {
        return camelCase.replaceAll(
                String.format("%s|%s|%s",
                   "(?<=[A-Z])(?=[A-Z][a-z])",
                   "(?<=[^A-Z])(?=[A-Z])",
                   "(?<=[A-Za-z])(?=[^A-Za-z])"
                ),
                " "
             );
    }
}
