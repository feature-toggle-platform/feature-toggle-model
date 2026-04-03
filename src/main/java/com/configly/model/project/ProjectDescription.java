package com.configly.model.project;


import static com.configly.model.exception.ValidationException.isNull;

public record ProjectDescription(
        String value
) {

    public ProjectDescription {
        validate(value);
    }

    public static ProjectDescription create(final String description) {
        return new ProjectDescription(description);
    }

    public static ProjectDescription empty() {
        return new ProjectDescription("");
    }

    private void validate(final String value) {
        isNull(value, ProjectDescription.class.getSimpleName());
    }


}
