FROM jetty:latest
VOLUME /tmp/jetty
ADD interview-tool-backend-0.2.0.jar /usr/local/jetty/start.jar
#RUN sh -c 'touch /app.jar'
#ENV JAVA_OPTS=""
#ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -Djava.security.edg=file:/dev/./urandom -jar /app.jar"]