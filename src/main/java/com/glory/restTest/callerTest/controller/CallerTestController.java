package com.glory.restTest.callerTest.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.glory.restTest.callerTest.model.CallerTestDetailVO;
import com.glory.restTest.callerTest.service.CallerTestService;
import com.glory.restTest.util.HttpUtils;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("/callerTest")
@RestController
public class CallerTestController {

    private final CallerTestService callerTestService;

    @RequestMapping(method = RequestMethod.POST, path = "/posts")
    public Map<String, Object> callerTest() throws IOException {
        Map<String, Object> map = new HashMap<>();
        map.put("callerDetailDataset", callerTestService.retrieveCallerTestDetailList());
        return map;
    }

}
