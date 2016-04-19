//package com.waze.rr_logger;
//
//import ch.qos.logback.classic.Logger;
//import ch.qos.logback.core.Appender;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.slf4j.LoggerFactory;
//
//import static org.junit.Assert.*;
//
///**
// * Created by eladb on 4/13/16.
// */
//public class LoggerBySessionIdTest {
//    @Before
//    public void setUp() throws Exception {
//
//    }
//
//    @After
//    public void tearDown() throws Exception {
//
//    }
//
//    @Test
//    public void logTwoSessionsWriteToTwoDifferentFiles() throws Exception {
//        LoggerBySessionId logger = new LoggerBySessionId();
//        logger.log("session1", "data 1.1");
//        logger.log("session2", "data 2.1");
//        logger.log("session1", "data 1.2");
//    }
//
//
//    private static Logger logger = LoggerFactory.getLogger(MyTest.class);
//
//    @Test
//    public void testSomething() {
//        ch.qos.logback.classic.Logger root = (ch.qos.logback.classic.Logger) LoggerFactory.getLogger(ch.qos.logback.classic.Logger.ROOT_LOGGER_NAME);
//        final Appender mockAppender = mock(Appender.class);
//        when(mockAppender.getName()).thenReturn("MOCK");
//        root.addAppender(mockAppender);
//
//        //... do whatever you need to trigger the log
//
//        verify(mockAppender).doAppend(argThat(new ArgumentMatcher() {
//            @Override
//            public boolean matches(final Object argument) {
//                return ((LoggingEvent)argument).getFormattedMessage().contains("Hey this is the message I want to see");
//            }
//        }));
//    }
//
//    @Test
//    public void usage() throws Exception {
//
//    }
//
//}