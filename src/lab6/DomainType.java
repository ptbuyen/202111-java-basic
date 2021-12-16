package lab6;

public enum DomainType {
    COM(".com"),
    NET(".net"),
    IO(".io"),
    APP(".app"),
    AI(".ai");

    private String value;

    DomainType(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
