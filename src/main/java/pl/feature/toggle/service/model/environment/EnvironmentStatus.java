package pl.feature.toggle.service.model.environment;

public enum EnvironmentStatus {
    ACTIVE,
    ARCHIVED;

    public boolean isArchived() {
        return this == ARCHIVED;
    }
}
