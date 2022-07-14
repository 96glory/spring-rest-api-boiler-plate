package com.glory.restTest.calleeTest.service;

import com.glory.restTest.calleeTest.model.CalleeDetailVO;
import com.glory.restTest.calleeTest.repository.CalleeTestRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
@Log4j2
public class CalleeTestServiceImpl implements CalleeTestService {

    private final CalleeTestRepository calleeTestRepository;

    @Override
    public List<CalleeDetailVO> retrieveCalleeDetails() {
        return calleeTestRepository.retrieveCalleeDetails();
    }

}
