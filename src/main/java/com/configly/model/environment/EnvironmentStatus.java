package com.configly.model.environment;

public enum EnvironmentStatus {
    ACTIVE,
    ARCHIVED;

    public boolean isArchived() {
        return this == ARCHIVED;
    }
}
