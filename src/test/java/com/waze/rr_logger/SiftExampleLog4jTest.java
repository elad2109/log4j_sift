package com.waze.rr_logger;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by eladb on 4/13/16.
 */
public class SiftExampleLog4jTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void log() throws Exception {
        SiftExampleLog4j logger = new SiftExampleLog4j();
        logger.log();
    }

}