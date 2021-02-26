package main.model;

import io.swagger.v3.oas.annotations.media.Schema;

public class Mother {
    private Age mothersAge;

    public Age getBid() {
        return mothersAge;
    }

    public void setBid(Age mothersAge) {
        this.mothersAge = mothersAge;
    }
}
