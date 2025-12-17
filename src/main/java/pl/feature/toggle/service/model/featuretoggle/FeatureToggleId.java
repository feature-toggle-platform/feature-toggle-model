package pl.feature.toggle.service.model.featuretoggle;

import pl.feature.toggle.service.model.Identifier;

import java.util.UUID;

public record FeatureToggleId(
        UUID uuid
) implements Identifier {

    public static FeatureToggleId create() {
        return new FeatureToggleId(UUID.randomUUID());
    }

    public static FeatureToggleId create(UUID uuid) {
        return new FeatureToggleId(uuid);
    }

    public static FeatureToggleId create(String uuid) {
        return new FeatureToggleId(UUID.fromString(uuid));
    }

}
