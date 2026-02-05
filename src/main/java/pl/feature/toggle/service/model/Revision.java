package pl.feature.toggle.service.model;

public record Revision(
        long value
) {

    public static Revision initialRevision() {
        return new Revision(1);
    }

    public static Revision from(long value) {
        return new Revision(value);
    }

    public Revision next() {
        return new Revision(value + 1);
    }

    public boolean representsNewerStateThan(Revision current) {
        return this.value > current.value;
    }

    public boolean canBeAppliedAfter(Revision current) {
        return this.value == current.value + 1;
    }

    public boolean indicatesGapAfter(Revision current) {
        return this.value > current.value + 1;
    }

    public boolean isOutdatedComparedTo(Revision current) {
        return this.value <= current.value;
    }

}
