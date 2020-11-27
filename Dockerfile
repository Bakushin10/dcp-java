FROM gradle:6.7.0-jdk11 AS builder
LABEL MAINTAINER Shin Nagai
ENV APP_HOME=claimlist
RUN mkdir APP_HOME
WORKDIR /claimlist
COPY . .
RUN gradle build

# centos as base image
FROM centos:7

ENV DEBIAN_FRONTEND=noninteractive
ENV JAVA_VERSON 11
ENV BUILD_FILE /claimlist/build/libs/dcp-microfe-framework-poc-api-claimlist-0.0.1-SNAPSHOT.jar
#ENV JAVA_HOME /usr/lib/jvm/java-$JAVA_VERSON-openjdk/

RUN yum install -y \
    java-$JAVA_VERSON-openjdk \
    java-$JAVA_VERSON-openjdk-devel \
    && yum clean all \
    #&& rm /tmp/* \
    && rm -rf /var/cache/yum

COPY --from=builder $BUILD_FILE $BUILD_FILE
EXPOSE 8083
CMD ["java","-jar","/claimlist/build/libs/dcp-microfe-framework-poc-api-claimlist-0.0.1-SNAPSHOT.jar"]