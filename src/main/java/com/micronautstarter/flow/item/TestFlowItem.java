package com.micronautstarter.flow.item;

import com.micronautstarter.model.TestModel;
import com.micronautstarter.trace.FlowItem;
import jakarta.inject.Singleton;

@Singleton
public class TestFlowItem implements FlowItem {

    public TestModel getFlowItem() {
        return TestModel.builder()
                .nome("Leo")
                .idade("27")
                .build();
    }
}
