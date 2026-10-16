FROM eclipse-temurin:17-jre

WORKDIR /app

COPY target/GeneracionComprobantes-1.0-SNAPSHOT.jar app.jar

CMD ["java", "-version"]
