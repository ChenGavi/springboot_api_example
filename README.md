# springboot_api_example

Prerequisite: Java 11.0.9, Gradle 6.5.1-all
Reference: https://www.youtube.com/watch?v=Kc3Vw5vk1Lw
            https://tomgregory.com/building-a-spring-boot-application-in-docker-and-jenkins/
1. Running a Spring Boot application in Docker
      1. Add Dockerfile and modify build.gradle
       
       ./gradlew assemble docker dockerRun
       check the website localhost:9000/actuator/health to verify running in docker is ok
       http://localhost:9000/ride

2. Pushing to Docker Hub

       ./gradlew dockerPush

3. Configuring Jenkins to be able to run Docker in Docker
    
    Do not forget cancel docker in part 1 & 2

       ./gradlew docker dockerRun
      To double check you can run Docker in Docker, run 
             
        docker exec jenkins-demo docker ps

4. Building the Docker spring Boot API application in Jenkins

       update Jenkinsfile to Jenkinsfile-docker
       Adding the new Docker job definition in createJob.groovy
       ./gradlew docker dockerRun