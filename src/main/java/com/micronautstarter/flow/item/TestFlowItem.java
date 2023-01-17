package com.micronautstarter.flow.item;

import com.micronautstarter.model.TestModel;
import jakarta.inject.Singleton;

@Singleton
public class TestFlowItem {

    public TestModel getFlowItem() {
        return TestModel.builder()
                .nome("Leo")
                .idade("27")
                .build();
    }
}
