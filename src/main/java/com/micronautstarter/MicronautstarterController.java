package com.micronautstarter;

import io.micronaut.http.annotation.*;

@Controller("/micronautstarter")
public class MicronautstarterController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}