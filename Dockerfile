FROM alpine

ADD target/SteinarHelloWorld-0.0.1-SNAPSHOT.jar SteinarHelloWorld-0.0.1-SNAPSHOT.jar
ARG JETTY_DEBUG=""
ENV JETTY_DEBUG $JETTY_DEBUG
ENTRYPOINT exec java $JETTY_DEBUG -XX:MinHeapFreeRatio=20 -XX:MaxHeapFreeRatio=90 -XX:InitialRAMPercentage=90 -XX:MaxRAMPercentage=90 -Djava.security.egd=file:/dev/./urandom -jar SteinarHelloWorld-0.0.1-SNAPSHOT.jar
