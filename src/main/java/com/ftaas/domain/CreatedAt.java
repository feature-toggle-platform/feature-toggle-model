package com.ftaas.domain;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public record CreatedAt(
        Instant timestamp
) {

    private static final ChronoUnit PRECISION = ChronoUnit.SECONDS;

    public CreatedAt {
        timestamp = timestamp.truncatedTo(PRECISION);
    }

    public static CreatedAt now() {
        return new CreatedAt(Instant.now());
    }

    public static CreatedAt of(LocalDateTime timestamp) {
        return new CreatedAt(timestamp.toInstant(java.time.ZoneOffset.UTC));
    }

    public static CreatedAt of(Instant timestamp) {
        return new CreatedAt(timestamp.truncatedTo(PRECISION));
    }

    public LocalDateTime toLocalDateTime() {
        return LocalDateTime.ofInstant(timestamp, java.time.ZoneOffset.UTC);
    }

}
