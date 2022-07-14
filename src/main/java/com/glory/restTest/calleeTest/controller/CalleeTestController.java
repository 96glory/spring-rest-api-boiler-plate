package com.glory.restTest.calleeTest.controller;

import com.glory.restTest.calleeTest.model.CalleeDetailVO;
import com.glory.restTest.calleeTest.service.CalleeTestService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("/calleeTest")
@RestController
public class CalleeTestController {

    private final CalleeTestService calleeTestService;

    @RequestMapping(method = RequestMethod.POST, path = "/")
    public ResponseEntity<String> hello() {
        String msg = "Hello Spring Word";
        return ResponseEntity.ok(msg);
    }

    @RequestMapping(method = RequestMethod.POST, path="/retrieveCalleeDetail")
    public Map<String, Object> retrieveCalleeDetails() {
        Map<String, Object> map = new HashMap<>();
        map.put("calleeDetailsDataset", calleeTestService.retrieveCalleeDetails());
        return map;
    }

}
