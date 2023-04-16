FROM openjdk:11
EXPOSE 8080
ADD target/demo88.jar springboot-images-new.jar
ENTRYPOINT ["java", "-jar","/springboot-images-new.jar"]
