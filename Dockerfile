FROM adoptopenjdk/openjdk11-openj9:jdk-11.0.7_10_openj9-0.20.0-alpine-slim

COPY build/libs/small-frozen-ostrich-*-all.jar small-frozen-ostrich.jar

EXPOSE 8080

CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-XX:+IdleTuningGcOnIdle", "-Xtune:virtualized", "-jar", "small-frozen-ostrich.jar"]
