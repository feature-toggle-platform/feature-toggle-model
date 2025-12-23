package pl.feature.toggle.service.model.security;

import java.util.Optional;

public enum Role {
    ADMIN, EDITOR, VIEWER;

    public static Optional<Role> fromString(String value) {
        if (value == null || value.isBlank()) {
            return Optional.empty();
        }
        try {
            return Optional.of(Role.valueOf(value.trim().toUpperCase()));
        } catch (IllegalArgumentException ex) {
            return Optional.empty();
        }
    }
}
