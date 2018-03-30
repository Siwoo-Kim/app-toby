package com.siwoo.projpa.service;

import com.siwoo.projpa.domain.Log;
import com.siwoo.projpa.repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service @Transactional(readOnly = true)
public class AuditService {
    @Autowired
    LogRepository logRepository;

    @Transactional(readOnly = false)
    public void log(String action) {
        Log log = new Log(LocalDateTime.now(), action);
        logRepository.save(log);
    }
}
