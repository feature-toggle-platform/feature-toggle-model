package pl.feature.toggle.service.model.project;


import static pl.feature.toggle.service.model.exception.ValidationException.isBlank;
import static pl.feature.toggle.service.model.exception.ValidationException.isNull;

public record ProjectName(
        String value
) {

    public ProjectName {
        validate(value);
    }

    public static ProjectName create(String name) {
        return new ProjectName(name);
    }

    private void validate(final String value) {
        isNull(value, ProjectName.class.getSimpleName());
        isBlank(value, ProjectName.class.getSimpleName());
    }


}
