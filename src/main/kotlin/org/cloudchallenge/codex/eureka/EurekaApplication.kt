package org.cloudchallenge.codex.eureka

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableConfigurationProperties
@EnableEurekaServer
class EurekaApplication

fun main(args: Array<String>) {
	runApplication<EurekaApplication>(*args)
}
