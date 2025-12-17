package pl.feature.toggle.service.model.featuretoggle;


public class FeatureToggleValueRecognizer {

    public static FeatureToggleValue from(FeatureToggleType type, String raw) {
        return switch (type) {
            case BOOLEAN -> BooleanFeatureToggleValue.of(Boolean.parseBoolean(raw));
            default -> throw new IllegalArgumentException("Unsupported feature toggle type");
        };
    }

    public static FeatureToggleValue from(String type, String raw) {
        return from(FeatureToggleType.valueOf(type), raw);
    }

}
