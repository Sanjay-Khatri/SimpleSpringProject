pipeline {
    agent any

    tools {
        maven "MavenRepo"
        jdk "JAVA_HOME"
    }

    stages {

        stage('Which Java?') {
            steps {
                bat 'java --version'
            }
        }

        stage('Checkout') {
            steps {
                // Checkout the source code from your version control system (e.g., Git)
                checkout scm
            }
        }
        stage('Build') {
            steps {
                // Build the Spring Boot project using Maven
                script {
//                     sh "${MAVEN_HOME}/bin/mvn clean install"
                    bat "mvn clean install"
                }
            }
        }
        stage('Run JAR') {
            steps {
                script {
                    // Run the Spring Boot JAR file
                    bat "java -jar target/spring-0.0.1-SNAPSHOT.jar"
                }
            }
        }
    }
}