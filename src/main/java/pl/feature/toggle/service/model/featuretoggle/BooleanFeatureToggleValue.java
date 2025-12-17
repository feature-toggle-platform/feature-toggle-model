package pl.feature.toggle.service.model.featuretoggle;

public record BooleanFeatureToggleValue(
        boolean value
) implements FeatureToggleValue {

    public static BooleanFeatureToggleValue disabled() {
        return new BooleanFeatureToggleValue(false);
    }

    public static BooleanFeatureToggleValue enabled() {
        return new BooleanFeatureToggleValue(true);
    }

    public static BooleanFeatureToggleValue of(boolean value) {
        return new BooleanFeatureToggleValue(value);
    }

    @Override
    public String stringValue() {
        return value ? "TRUE" : "FALSE";
    }
}
