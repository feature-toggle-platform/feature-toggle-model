package com.ftaas.domain.environment;


import static com.ftaas.domain.exception.ValidationException.isNull;

public record EnvironmentName(
        String value
) {

    public EnvironmentName {
        validate(value);
    }

    public static EnvironmentName create(String name) {
        return new EnvironmentName(name);
    }

    private void validate(final String value) {
        isNull(value, EnvironmentName.class.getSimpleName());
    }

}
