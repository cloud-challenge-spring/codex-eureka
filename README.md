![Build](https://github.com/cloud-challenge/codex-eureka/workflows/Build/badge.svg?branch=master)

# Eureka server for discover Spring micro-service

This microservice use Spring and Spring boot technologies.

## Starting services locally without Docker

Every microservice is a Spring Boot application and can be started locally using IDE or `./gradlew bootRun` command.

Please note that supporting services Config Server must be started before any other application.

You can access the following service at given location:

* Eureka Service - http://localhost:8887

## Starting service locally with docker-compose

You can use docker-compose inside codex-compose repository present in this organisation.

## In case you find a bug/suggested improvement for codex microservices
Our issue tracker is available in this organisation.

## Interesting codex forks

If you have a special interest in a different technology stack that could be used to implement the codex then please join the community there.

## This project is inspired by spring-petclinic

Thanks [spring-petclinic sample](https://github.com/spring-petclinic) for your spring cloud tutorial.

This project is inpired by it!

## Contributing
The issue tracker is the preferred channel for bug reports, features requests and submitting pull requests.
