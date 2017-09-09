package com.jfinal.ext2.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jfinal.log.Log;


/**
 * Created by tan on 2017/5/9.
 */
public class LogBackExt extends Log {


    private Logger log;

    LogBackExt(Class<?> clazz) {
        log = LoggerFactory.getLogger(clazz);
    }

    LogBackExt(String name) {
        log = LoggerFactory.getLogger(name);
    }

    public void info(String message) {
        this.log.info(message);
    }

    public void info(String message, Throwable t) {
        this.log.info(message, t);
    }

    public void debug(String message) {
        this.log.debug(message);
    }

    public void debug(String message, Throwable t) {
        this.log.debug(message, t);
    }

    public void warn(String message) {
        this.log.warn(message);
    }

    public void warn(String message, Throwable t) {
        this.log.warn(message, t);
    }

    public void error(String message) {
        this.log.error(message);
    }

    public void error(String message, Throwable t) {
        this.log.error(message, t);
    }

    public void fatal(String message) {
        this.log.error(message);
    }

    public void fatal(String message, Throwable t) {
        this.log.error(message, t);
    }

    public boolean isDebugEnabled() {
        return this.log.isDebugEnabled();
    }

    public boolean isInfoEnabled() {
        return this.log.isInfoEnabled();
    }

    public boolean isWarnEnabled() {
        return this.log.isWarnEnabled();
    }

    public boolean isErrorEnabled() {
        return this.log.isErrorEnabled();
    }

    public boolean isFatalEnabled() {
        return this.log.isErrorEnabled();
    }
}
