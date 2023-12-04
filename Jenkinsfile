pipeline {
    agent any

    environment {
        // Define environment variables if needed
        MAVEN_HOME = tool 'Maven'
    }

    stages {
//         stage('Checkout') {
//             steps {
//                 // Checkout the source code from your version control system (e.g., Git)
//                 checkout scm
//             }
//         }

        stage('Build') {
            steps {
                // Build the Spring Boot project using Maven
                script {
                    sh "${MAVEN_HOME}/bin/mvn clean install"
                }
            }
        }

        stage('Test') {
            steps {
                // Run tests (if applicable)
                script {
//                     sh "${MAVEN_HOME}/bin/mvn test"
                }
            }
        }

        stage('Deploy') {
            steps {
                // Deploy the Spring Boot application (e.g., to a server or a container)
                script {
                    // Add deployment steps here, such as copying the JAR file to the server
                }
            }
        }
    }

    post {
        always {
            // Clean up or perform any necessary tasks after the pipeline run
//             sh "java -jar ./target/spring-0.0.1-SNAPSHOT.jar"
        }
    }
}