package com.example.dockerdemo.api;

import com.example.dockerdemo.api.requests.Message;
import org.springframework.context.annotation.Scope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Scope("request")
@RequestMapping("/v1")
public class TestApi {

    @RequestMapping(value = "/test", produces = { "application/json" }, consumes = {"application/json"}, method = RequestMethod.POST)
    ResponseEntity<Message> test(@RequestBody Message message) {
        return ResponseEntity.ok(message);
    }
}
