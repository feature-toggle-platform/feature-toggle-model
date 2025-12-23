package pl.feature.toggle.service.model.security;

public record Username(
        String value
) {

    public static Username create(String value) {
        return new Username(value);
    }

    public static Username system() {
        return new Username("system");
    }

}
