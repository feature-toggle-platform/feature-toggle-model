package pl.feature.toggle.service.model;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public record UpdatedAt(
        Instant timestamp
) {

    private static final ChronoUnit PRECISION = ChronoUnit.SECONDS;

    public UpdatedAt {
        if (timestamp != null) {
            timestamp = timestamp.truncatedTo(PRECISION);
        }
    }

    public static UpdatedAt now() {
        return new UpdatedAt(Instant.now());
    }

    public static UpdatedAt notUpdatedYet() {
        return new UpdatedAt(null);
    }

    public static UpdatedAt of(LocalDateTime timestamp) {
        if (timestamp == null) {
            return notUpdatedYet();
        }
        return new UpdatedAt(timestamp.toInstant(java.time.ZoneOffset.UTC));
    }

    public static UpdatedAt of(Instant timestamp) {
        if (timestamp == null) {
            return notUpdatedYet();
        }
        return new UpdatedAt(timestamp.truncatedTo(PRECISION));
    }

    public LocalDateTime toLocalDateTime() {
        if (timestamp == null) {
            return null;
        }
        return LocalDateTime.ofInstant(timestamp, java.time.ZoneOffset.UTC);
    }

}
