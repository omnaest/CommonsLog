package org.omnaest.utils;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class CommonsLogTest {

    @Test
    void testSlf4jToLog4j2Bridge() {
        Logger logger = LoggerFactory.getLogger(CommonsLogTest.class);
        assertDoesNotThrow(() -> {
            logger.debug("debug message");
            logger.info("info message");
            logger.warn("warn message");
            logger.error("error message");
        });
    }

    @Test
    void testLoggerIsNotNop() {
        Logger logger = LoggerFactory.getLogger(CommonsLogTest.class);
        assertDoesNotThrow(() -> logger.getName());
    }
}