package pl.feature.toggle.service.model.security.correlation;

import pl.feature.toggle.service.model.exception.MissingCorrelationIdException;

public record CorrelationId(
        String value
) {

    public static CorrelationId of(String value) {
        if (value == null || value.isBlank()) {
            throw new MissingCorrelationIdException();
        }
        return new CorrelationId(value);
    }

}
