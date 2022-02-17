# springbootapplication
This is the application folder which will hold examples of different springboot application implementations

We will focus on following examples to start with 

Note : 
    a. All Springboot examples will (try to) follow 12 factor API : https://12factor.net/
    b. All Springboot apps will be built and deployed in Kubernetes via Docker.
    c. All apps will have clear instructions for local setup in each respective readme files. For eg : For redis cache implementation, add steps for Redis cache installations steps in MAC. To keep it simple for us we will only keep it as MAC.
    d. All apps examples will be Java 8 or Java 11 with lambok support..
    e. All apps will have swagger documentation or open api specification.
    f. All apps will have naming convention : Spring-Boot-{IMPLEMENTATION_FOCUS}-{SPRING_VERSION}-{JAVA_VERSION}-Project. EG : Spring-Boot-RedisCache-2.5-8-Project
    g. All apps (hopefully), we will add JUNIT Test Cases and have 80+% coverage and 0 Blocker & Critical issues.
    h. All apps will be production ready code.

1. Simple Springboot project
2. Springboot project with different dabatase 
       2.1) jpa
       2.2) JDBCTemplate
       2.3) NamedJDBCTemplate Implementations
       2.4)batch processing.
3. Springboot project with NOSQL.
4. Springboot projects with Message Queue implementations of most used 
      4.1) RabbitMQ 
      4.2) Kafka 
      4.3) Active MQ 
      4.4) Any Could MQ implemetation
6. Springboot projects with Spring Cloud concepts like : 
        6.1) Circuit breaker
        6.2) Service Registry -  Netflix Eureka, Netflix OSS ,Netflix Ribbon,Consul service registry,Apache Zookeeper, etcd,consul
        6.3) Cloud COnfig 
        6.4) OpenFeign
        6.5) Zipkin
        6.6) Sleuth
        6.7) Vault
        6.8) API gateway
        6.9) Hystrix
8. Springboot projects with GraphQL Integration.
9. Springboot app with different UI impelmentaion.
       8.1) Thymeleaf 
       8.2) Angular implementation
       8.3) React implementation
10.Scuring the application
        10.1) JWT
        10.2) Open ID
        11.3) OAuth 2.0
        11.4) Spring Security
        11.5) Public Private Key
        11.6) Http(S) SSL over HTTP
11.Deploying the application
         11.1)Docker
         11.2) Docker compose
         11.3) Docker with kubernetes
         11.4) Docker on Cloud(ECS in AWS).
12) Implement SOLID Design Principles .
13) Demonstrate the usage of Design Patterns in spring boot/Microservices application.
         13.1)CQRS
         13.2)SAGA 

14) Demonstrate usage of Desgin Patterns in Java. 
          14.1) Creational
          14.2) Structrural
          14.3) Behavioural

15) Designing Microservice in node JS.
15) Calling among apis using 
          15.1) Rest Template
          15.2) Websockets
          15.3) Spring Webclient
16) Create Custom Annotations in Sprin Boot project 
17) Proper Exception handling Framework Using Spring.
18) Create jenkins Pipeline to deploy the project.
19) Deploy the application in 
     19.1) Heroku
     19.2) Pivotal Cloud Foundry
     19.3) AWS
     19.4) GCP
     19.5) Azure , use free trial to add it.
20) Use Spring Transaction for ACID Compliance.
21) Java Functional Programming Feature with streams and lambda.
22) Integration with a payment gateway.
23) Implement Caching in spring boot
    23.1) Redis
    23.2) memcache
    23.3.)Hazelcache
    23.4) ElasticSearch
24)Deploying Spring Boot
    24.1) Blue Green Deployment
25) Reactive Programmig in Java
        

Final Aim : To take atleast 2 design patterns , pick and choose the best workflow for that design within API developement and do orchesterization between all the implementations

Common Interview Questions for Architect:
1. how tomcat runs in spring boot
2. explain spring boot
3. why use spring boot
4. test coverage
5. sonar test coverage
6. how use sqs locally
7. how to test microservices
8. what desinign pattersn you have used
9. how do you design a application
10. what test cases you will writr
11. what will you see in a code review
12. how a stroty goes lifecycle
13. how will you test frontend code
14. what is node js
15. kubernetes
16. docker
17. rabbit mq 
18. kakfa working
19. explain about youself
20. raspberry pi elaborate
21. current work elaborate
22. if given a test write everything
23. https
24. publiv private security
25. api security
26. use some keywords to give all answers
27. few design patterns 
28. how to create high performing system



Good Links to follow:
https://www.nginx.com/blog/deploying-microservices/
https://github.com/dailycodebuffer/Spring-MVC-Tutorials
https://docs.spring.io/spring-boot/docs/current/reference/html/deployment.html

