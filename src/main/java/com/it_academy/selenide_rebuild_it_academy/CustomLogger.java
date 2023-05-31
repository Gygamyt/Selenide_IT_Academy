package com.it_academy.selenide_rebuild_it_academy;

import org.apache.logging.log4j.*;

public interface CustomLogger {
    default Logger logger() {
        return LogManager.getLogger(this.getClass());
    }
    Logger staticLogger = LogManager.getLogger();
}
