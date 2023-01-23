package com.micronautstarter.flow;

import com.micronautstarter.flow.item.TestFlowItem;
import com.micronautstarter.model.TestModel;
import com.micronautstarter.trace.Flow;
import jakarta.inject.Singleton;
import lombok.RequiredArgsConstructor;

@Singleton
@RequiredArgsConstructor
public class TestFlow implements Flow {

    private final TestFlowItem testFlowItem;

    public TestModel getTestModel() {
        return testFlowItem.getFlowItem();
    }
}
