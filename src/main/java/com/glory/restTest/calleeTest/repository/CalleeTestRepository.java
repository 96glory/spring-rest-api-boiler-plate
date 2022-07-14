package com.glory.restTest.calleeTest.repository;

import com.glory.restTest.calleeTest.model.CalleeDetailVO;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class CalleeTestRepository {

    public static List<CalleeDetailVO> calleeDetailList;

    static {
        calleeDetailList = new ArrayList<>();
        calleeDetailList.add(CalleeDetailVO.builder().id(1L).name("song").age(14)
            .creationDate(LocalDateTime.now()).lastUpdatedDate(LocalDateTime.now()).build());
        calleeDetailList.add(CalleeDetailVO.builder().id(2L).name("lee").age(25)
            .creationDate(LocalDateTime.now()).lastUpdatedDate(LocalDateTime.now()).build());
        calleeDetailList.add(CalleeDetailVO.builder().id(3L).name("moon").age(26)
            .creationDate(LocalDateTime.now()).lastUpdatedDate(LocalDateTime.now()).build());
        calleeDetailList.add(CalleeDetailVO.builder().id(4L).name("son").age(18)
            .creationDate(LocalDateTime.now()).lastUpdatedDate(LocalDateTime.now()).build());
        calleeDetailList.add(CalleeDetailVO.builder().id(5L).name("shim").age(30)
            .creationDate(LocalDateTime.now()).lastUpdatedDate(LocalDateTime.now()).build());
        System.out.println(calleeDetailList);
    }

    public List<CalleeDetailVO> retrieveCalleeDetails() {
        return calleeDetailList;
    }

}
