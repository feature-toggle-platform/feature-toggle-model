package com.ftaas.domain;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public record UpdatedAt(
        Instant timestamp
) {

    private static final ChronoUnit PRECISION = ChronoUnit.SECONDS;

    public UpdatedAt {
        timestamp = timestamp.truncatedTo(PRECISION);
    }

    public static UpdatedAt now() {
        return new UpdatedAt(Instant.now());
    }

    public static UpdatedAt of(LocalDateTime timestamp) {
        return new UpdatedAt(timestamp.toInstant(java.time.ZoneOffset.UTC));
    }

    public static UpdatedAt of(Instant timestamp) {
        return new UpdatedAt(timestamp.truncatedTo(PRECISION));
    }

    public LocalDateTime toLocalDateTime() {
        return  LocalDateTime.ofInstant(timestamp, java.time.ZoneOffset.UTC);
    }

}
