package pl.feature.toggle.service.model.featuretoggle.value;


import pl.feature.toggle.service.model.exception.UnsupportedFeatureToggleType;

public class FeatureToggleValueRecognizer {

    public static FeatureToggleValue from(FeatureToggleValueSpec spec) {
        return switch (spec.type()) {
            case BOOLEAN -> BooleanFeatureToggleValue.create(spec.value());
            case NUMBER -> NumberFeatureToggleValue.create(spec.value());
            case STRING -> StringFeatureToggleValue.create(spec.value());
            default -> throw new UnsupportedFeatureToggleType(spec.type());
        };
    }

}
