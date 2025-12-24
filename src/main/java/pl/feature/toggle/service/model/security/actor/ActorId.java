package pl.feature.toggle.service.model.security.actor;

public record ActorId(
        String value
) {

    public static ActorId create(String value) {
        return new ActorId(value);
    }

    public static ActorId system() {
        return new ActorId("system");
    }
}
