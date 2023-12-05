pipeline {
    agent any

    tools {
        maven "MavenRepo"
    }

    stages {

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
                    sh "${MAVEN_HOME}/bin/mvn clean install"
                }
            }
        }
    }
}