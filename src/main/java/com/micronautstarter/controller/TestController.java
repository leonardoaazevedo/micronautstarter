package com.micronautstarter.controller;

import com.micronautstarter.flow.TestFlow;
import com.micronautstarter.model.TestModel;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Status;
import jakarta.inject.Singleton;

@Singleton
@Controller("/test")
public class TestController {

    private final TestFlow testFlow;

    public TestController(TestFlow testFlow) {
        this.testFlow = testFlow;
    }

    @Get(produces = MediaType.APPLICATION_JSON)
    @Status(HttpStatus.OK)
    public HttpResponse<TestModel> getString() {
        var testModel = testFlow.getTestModel();
        return HttpResponse.ok(testModel);
    }

}
