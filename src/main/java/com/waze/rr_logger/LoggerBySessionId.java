/**
 * 2    * Logback: the reliable, generic, fast and flexible logging framework.
 * 3    * Copyright (C) 1999-2015, QOS.ch. All rights reserved.
 * 4    *
 * 5    * This program and the accompanying materials are dual-licensed under
 * 6    * either the terms of the Eclipse Public License v1.0 as published by
 * 7    * the Eclipse Foundation
 * 8    *
 * 9    *   or (per the licensee's choosing)
 * 10   *
 * 11   * under the terms of the GNU Lesser General Public License version 2.1
 * 12   * as published by the Free Software Foundation.
 * 13
 */
package com.waze.rr_logger;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.core.joran.spi.JoranException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class LoggerBySessionId {

    String configFile = "logback.xml";

    public LoggerBySessionId() {
    }

    public LoggerBySessionId(String configFile) {
        this.configFile = configFile;
    }

    public void log(String sessionId, String content) throws JoranException {

        LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
        JoranConfigurator configurator = new JoranConfigurator();
        lc.reset();
        configurator.setContext(lc);
        configurator.doConfigure(configFile);

        Logger logger = LoggerFactory.getLogger(LoggerBySessionId.class);
        MDC.put("sessionId", sessionId);
        logger.debug(content);
    }

    static void usage(String msg) {
        System.err.println(msg);
        System.err.println("Usage: java " + LoggerBySessionId.class.getName() + " configFile\n" + "   configFile a logback " +
                "configuration file");
        System.exit(1);
    }
}
