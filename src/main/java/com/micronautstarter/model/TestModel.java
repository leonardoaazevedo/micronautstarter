package com.micronautstarter.model;

import io.micronaut.serde.annotation.Serdeable;
import lombok.Builder;
import lombok.Data;

@Data
@Serdeable
@Builder
public class TestModel {

    private String nome;
    private String idade;
}
