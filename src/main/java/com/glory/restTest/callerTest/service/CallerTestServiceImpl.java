package com.glory.restTest.callerTest.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.glory.restTest.callerTest.model.CallerTestDetailVO;
import com.glory.restTest.util.HttpUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CallerTestServiceImpl implements CallerTestService {

    private final ObjectMapper objectMapper;

    @Override
    public List<CallerTestDetailVO> retrieveCallerTestDetailList() {
        String getResultJsonString = null;
        List<CallerTestDetailVO> callerTestDetailVOList = new ArrayList<>();
        try {
            getResultJsonString = HttpUtils.get("https://jsonplaceholder.typicode.com/posts");
            callerTestDetailVOList =
                Arrays.asList(
                    objectMapper.readValue(getResultJsonString, CallerTestDetailVO[].class));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return callerTestDetailVOList;
    }

}
