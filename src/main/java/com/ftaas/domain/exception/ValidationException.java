package com.ftaas.domain.exception;

public class ValidationException extends RuntimeException {
    private ValidationException(String message) {
        super(message);
    }

    public static void isNull(Object value, String fieldName) {
        if (value == null) {
            throw new ValidationException(String.format("Field '%s' cannot be null", fieldName));
        }
    }

    public static void isBlank(String value, String fieldName) {
        if (value.isBlank()) {
            throw new ValidationException(String.format("Field '%s' cannot be blank", fieldName));
        }
    }
}
