package com.example.kotlincmdexample

import org.slf4j.LoggerFactory

fun main(args: Array<String>) {
    val log = LoggerFactory.getLogger("com.example.kotlincmdexample.KotlinCmdExample")

    if (args.isEmpty()) {
        println("Usage: kotlin-cmd-example name")
        return
    }

    log.info("Hello, {}", args[0])
}
