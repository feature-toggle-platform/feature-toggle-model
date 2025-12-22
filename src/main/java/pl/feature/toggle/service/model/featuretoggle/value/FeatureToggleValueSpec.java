package pl.feature.toggle.service.model.featuretoggle.value;

public record FeatureToggleValueSpec(
        String value,
        FeatureToggleType type
) {

    public static FeatureToggleValueSpec create(String value, FeatureToggleType type) {
        return new FeatureToggleValueSpec(value, type);
    }

}
