package com.micronautstarter.flow;

import com.micronautstarter.flow.item.TestFlowItem;
import com.micronautstarter.model.TestModel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class TestFlowTest {

    @Mock
    private TestFlowItem flowItem;

    @InjectMocks
    private TestFlow testFlow;

    @BeforeEach
    public void init() {
        testFlow = new TestFlow(flowItem);
    }

    @Test
    void shouldTestFlow() {
        var testModel = TestModel.builder()
                .idade("27")
                .nome("Leo")
                .build();

        when(flowItem.getFlowItem()).thenReturn(testModel);

        var response = testFlow.getTestModel();

        verify(flowItem).getFlowItem();
        assertEquals(testModel, response);
        assertEquals(response.getIdade(), "27");
        assertEquals(response.getNome(), "Leo");
    }
}
