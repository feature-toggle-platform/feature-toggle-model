package com.configly.model.featuretoggle;

public record FeatureToggleDescription(
        String value
) {

    public static FeatureToggleDescription empty() {
        return new FeatureToggleDescription("");
    }

    public static FeatureToggleDescription create(String value) {
        return new FeatureToggleDescription(value);
    }
}
