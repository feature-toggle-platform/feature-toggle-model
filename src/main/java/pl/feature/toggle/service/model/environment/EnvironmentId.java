package pl.feature.toggle.service.model.environment;

import pl.feature.toggle.service.model.Identifier;

import java.util.UUID;

import static pl.feature.toggle.service.model.exception.ValidationException.isNull;


public record EnvironmentId(
        UUID uuid
) implements Identifier {

    public EnvironmentId {
        validate(uuid);
    }

    public static EnvironmentId create() {
        return new EnvironmentId(UUID.randomUUID());
    }

    public static EnvironmentId create(UUID uuid) {
        return new EnvironmentId(uuid);
    }

    public static EnvironmentId create(String uuid) {
        return new EnvironmentId(UUID.fromString(uuid));
    }

    private void validate(final UUID uuid) {
        isNull(uuid, EnvironmentId.class.getSimpleName());
    }

}
