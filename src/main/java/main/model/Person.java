package main.model;

import io.swagger.v3.oas.annotations.media.Schema;

public class Person {
    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private String name;

    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private Age age;

    //@Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private Mother mother;

    public String getName() {
        return name;
    }

    public Age getAge() {
        return age;
    }

    public Mother getMother() {
        return mother;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(final Age age) {
        this.age = age;
    }

    public void setMother(final Mother mother) {
        this.mother = mother;
    }
}
