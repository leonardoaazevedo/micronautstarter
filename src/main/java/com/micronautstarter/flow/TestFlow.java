package com.micronautstarter.flow;

import com.micronautstarter.model.TestModel;
import io.micronaut.core.annotation.ReflectiveAccess;
import jakarta.inject.Singleton;
import lombok.AllArgsConstructor;

@Singleton
public class TestFlow {
    public TestModel getTestModel() {
        return TestModel.builder()
                .nome("Leo")
                .idade("27")
                .build();
    }
}
