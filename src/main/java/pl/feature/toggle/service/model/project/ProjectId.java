package pl.feature.toggle.service.model.project;

import pl.feature.toggle.service.model.Identifier;

import java.util.UUID;

import static pl.feature.toggle.service.model.exception.ValidationException.isNull;


public record ProjectId(
        UUID uuid
) implements Identifier {

    public ProjectId {
        validate(uuid);
    }

    public static ProjectId create() {
        return new ProjectId(UUID.randomUUID());
    }

    public static ProjectId create(final UUID uuid) {
        return new ProjectId(uuid);
    }

    public static ProjectId create(final String uuid) {
        return new ProjectId(UUID.fromString(uuid));
    }

    private void validate(final UUID uuid) {
        isNull(uuid, ProjectId.class.getSimpleName());
    }

}
