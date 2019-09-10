FROM openjdk:8
ENV APP_HOME=/usr/app/
WORKDIR $APP_HOME
COPY ./build/libs/* ./app.jar
EXPOSE 8080
CMD ["java","-Dspring.profiles.active=development","-jar","app.jar"]

FROM openjdk:8
ENV APP_HOME=/usr/app/
WORKDIR $APP_HOME
COPY ./build/libs/* ./app.jar
EXPOSE 8080
CMD ["java","-Dspring.profiles.active=development","-jar","app.jar"]

