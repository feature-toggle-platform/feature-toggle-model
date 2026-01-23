package pl.feature.toggle.service.model.featuretoggle.value;

public interface FeatureToggleValue {

    String asText();

    FeatureToggleType type();

    default String typeName(){
        return type().name();
    }

}
