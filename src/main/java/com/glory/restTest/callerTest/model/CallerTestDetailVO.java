package com.glory.restTest.callerTest.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CallerTestDetailVO {

    private Long userId;
    private Long id;
    private String title;
    private String body;

}
