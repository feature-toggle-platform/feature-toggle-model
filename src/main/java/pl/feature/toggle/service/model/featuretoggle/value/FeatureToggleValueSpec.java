package pl.feature.toggle.service.model.featuretoggle.value;

import pl.feature.toggle.service.model.exception.UnsupportedFeatureToggleType;

record FeatureToggleValueSpec<T>(
        T value,
        FeatureToggleType type
) {

    static FeatureToggleValueSpec<?> create(Object value) {
        return recognizeValueSpec(value);
    }

    public static FeatureToggleValueSpec<Object> create(Object value, String type) {
        return new FeatureToggleValueSpec<>(value, FeatureToggleType.valueOf(type));
    }

    static FeatureToggleValueSpec<Boolean> bool(Boolean value) {
        return new FeatureToggleValueSpec<>(value, FeatureToggleType.BOOLEAN);
    }

    static FeatureToggleValueSpec<String> text(String value) {
        return new FeatureToggleValueSpec<>(value, FeatureToggleType.TEXT);
    }

    static FeatureToggleValueSpec<Number> number(Number value) {
        return new FeatureToggleValueSpec<>(value, FeatureToggleType.NUMBER);
    }

    private static FeatureToggleValueSpec<?> recognizeValueSpec(Object value) {
        return switch (value) {
            case String s -> FeatureToggleValueSpec.text(s);
            case Boolean b -> FeatureToggleValueSpec.bool(b);
            case Number n -> FeatureToggleValueSpec.number(n);
            default -> throw new UnsupportedFeatureToggleType(value.getClass().getTypeName());
        };
    }

}
