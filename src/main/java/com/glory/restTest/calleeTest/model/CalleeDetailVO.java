package com.glory.restTest.calleeTest.model;

import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CalleeDetailVO {

    private final Long id;
    private final String name;
    private final Integer age;
    private final Boolean enabledFlag;
    private final LocalDateTime creationDate;
    private final LocalDateTime lastUpdatedDate;

}
