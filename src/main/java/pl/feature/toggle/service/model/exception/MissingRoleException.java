package pl.feature.toggle.service.model.exception;


import pl.feature.toggle.service.model.security.actor.Actor;

public class MissingRoleException extends RuntimeException {
    public MissingRoleException(Actor actor) {
        super("User" + actor.username().value() + " does not have required role");
    }
}
