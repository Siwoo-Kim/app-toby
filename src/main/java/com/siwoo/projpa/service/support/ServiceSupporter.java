package com.siwoo.projpa.service.support;

import org.springframework.util.Assert;

import java.util.function.Predicate;

public interface ServiceSupporter {

    static void throwIfNull(Object object) {
        Assert.notNull(object, object.getClass().getSimpleName() + " must not null");
    }

    static <T> void throwIfNotTrue(Predicate<T> predicate, T object) {
        Assert.isTrue(predicate.test(object), object.getClass().getSimpleName() + " must not null");
    }

    static void throwIfEmpty(String string) {
        Assert.hasText(string, "String must not empty");
    };
}
