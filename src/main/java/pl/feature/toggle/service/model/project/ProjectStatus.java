package pl.feature.toggle.service.model.project;

public enum ProjectStatus {
    ACTIVE,
    ARCHIVED;

    public boolean isArchived(){
        return this == ARCHIVED;
    }

    public boolean isActive(){
        return this == ACTIVE;
    }
}
