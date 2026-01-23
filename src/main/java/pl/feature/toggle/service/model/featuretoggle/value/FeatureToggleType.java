package pl.feature.toggle.service.model.featuretoggle.value;

import pl.feature.toggle.service.model.exception.UnsupportedFeatureToggleType;

public enum FeatureToggleType {
    BOOLEAN,
    NUMBER,
    TEXT;

    public static FeatureToggleType fromString(String rawType) {
        if (rawType == null || rawType.isBlank()) {
            throw new UnsupportedFeatureToggleType();
        }

        for (FeatureToggleType type : FeatureToggleType.values()) {
            if (type.name().equalsIgnoreCase(rawType.trim())) {
                return type;
            }
        }

        throw new UnsupportedFeatureToggleType(rawType);
    }
}
