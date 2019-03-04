FROM openjdk:8-jdk-stretch
VOLUME /tmp
ARG DEPENDENCY=target/dependency
COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY ${DEPENDENCY}/META-INF /app/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes /app
EXPOSE 8080
ENTRYPOINT ["java", "-Dspring.config.additional-location=/deployment/config/","-cp","app:app/lib/*","com.ippon.k8s.client.ClientApplication"]