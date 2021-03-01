package main.model;

import io.swagger.v3.oas.annotations.media.Schema;

public class Mother {
    private Age mothersAge;

    public Age getMothersAge() {
        return mothersAge;
    }

    public void setMothersAge(final Age mothersAge) {
        this.mothersAge = mothersAge;
    }
}
