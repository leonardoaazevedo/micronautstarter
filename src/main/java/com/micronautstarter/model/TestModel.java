package com.micronautstarter.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.micronaut.serde.annotation.Serdeable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@JsonFormat
@Serdeable
@Builder
public class TestModel {

    private String nome;
    private String idade;
}
