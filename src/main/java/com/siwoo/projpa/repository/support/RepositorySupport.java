package com.siwoo.projpa.repository.support;

import java.util.List;
import java.util.stream.Collectors;

public class RepositorySupport {

    public static String surround(String source, String word) {
        return  word + source + word;
    }

    public static List<String> capitalize(List<String> strings) {
        return strings.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

}
