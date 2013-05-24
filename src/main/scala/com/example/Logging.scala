package com.example

import org.slf4j.LoggerFactory

trait Logging {
  def log = LoggerFactory.getLogger(loggerNameFor(this.getClass))
  def loggerNameFor(cls: Class[_]) = {
    val className = cls.getName
    if (className endsWith "$") className.substring(0, className.length - 1)
    else className
  }

  // to print some logback info for debug:
  // import ch.qos.logback.classic.LoggerContext
  // StatusPrinter.print((LoggerFactory.getILoggerFactory).asInstanceOf[LoggerContext])
}