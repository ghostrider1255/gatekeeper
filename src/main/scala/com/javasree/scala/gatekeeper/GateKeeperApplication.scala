package com.javasree.scala.gatekeeper

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.cloud.netflix.zuul.EnableZuulProxy

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
class GateKeeperApplication extends SpringBootServletInitializer

object GateKeeperApplication extends App{
  SpringApplication.run(classOf[GateKeeperApplication])
}
