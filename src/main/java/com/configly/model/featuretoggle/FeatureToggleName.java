package com.configly.model.featuretoggle;

public record FeatureToggleName(
        String value
) {

    public static FeatureToggleName create(String value) {
        return new FeatureToggleName(value);
    }

}
