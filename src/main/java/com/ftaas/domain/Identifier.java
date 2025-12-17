package com.ftaas.domain;

import java.util.UUID;

public interface Identifier {

    UUID uuid();

    default String idAsString() {
        return uuid().toString();
    }
}
