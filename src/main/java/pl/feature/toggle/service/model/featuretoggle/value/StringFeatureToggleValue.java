package pl.feature.toggle.service.model.featuretoggle.value;

import pl.feature.toggle.service.model.exception.WrongFeatureToggleValue;

import static java.util.Objects.isNull;

record StringFeatureToggleValue(
        String value
) implements FeatureToggleValue {

    static StringFeatureToggleValue create(String value) {
        if (isNull(value)) {
            throw new WrongFeatureToggleValue();
        }
        return new StringFeatureToggleValue(value);
    }

    @Override
    public String asText() {
        return value;
    }
}