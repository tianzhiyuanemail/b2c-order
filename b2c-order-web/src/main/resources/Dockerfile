FROM frolvlad/alpine-oraclejdk8 
MAINTAINER lgl "tianzhiyuanemail@163.com"
ADD b2c-service-web-0.0.1-SNAPSHOT.jar  app.jar
EXPOSE 10100
CMD ["java","-jar","/app.jar","--spring.profiles.active=dev"]
