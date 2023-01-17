package com.micronautstarter.flow;

import com.micronautstarter.flow.item.TestFlowItem;
import com.micronautstarter.model.TestModel;
import jakarta.inject.Singleton;

@Singleton
public class TestFlow {

    private final TestFlowItem testFlowItem;

    public TestFlow(TestFlowItem testFlowItem) {
        this.testFlowItem = testFlowItem;
    }

    public TestModel getTestModel() {
        return testFlowItem.getFlowItem();
    }
}
