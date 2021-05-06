package com.company.architecture.core.concretes;

import com.company.architecture.core.abstracts.LoggerService;
import com.company.architecture.jLogger.jLoggerManager;

public class jLoggerManagerAdapter implements LoggerService {
    @Override
    public void logToSystem(String message) {
        jLoggerManager manager = new jLoggerManager();
        manager.Log(message);
    }
}
