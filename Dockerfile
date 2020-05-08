FROM adoptopenjdk/openjdk8:ubi
COPY /target/my-app-1.0-SNAPSHOT.jar my-app-1.0-SNAPSHOT.jar
CMD ["java","-cp","/my-app-1.0-SNAPSHOT.jar","Calculator"]
