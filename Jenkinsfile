pipeline {
    agent any
    environment {
        JAVA_HOME = '/opt/homebrew/opt/openjdk@21/libexec/openjdk.jdk/Contents/Home'
        // PATH = "${JAVA_HOME}/bin:${env.PATH}"
    }
    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "M3"
    }

    stages {
        stage('Pull the code') {
            steps {
                // Get some code from a GitHub repository
                git branch: 'main', url: 'https://github.com/dev-naman/maven-demo-docker.git'
            }
        }
        stage('Build the code') {
            steps {
                sh "mvn -Dmaven.test.failure.ignore=true clean package"

                // To run Maven on a Windows agent, use
                // bat "mvn -Dmaven.test.failure.ignore=true clean package"
            }

            post {
                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
                success {
                    junit '**/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'target/*.jar'
                }
            }
        }
        stage('Build the Image') {
            steps {
                // Get some code from a GitHub repository
                sh "/opt/homebrew/bin/podman build -t maven_demo:latest1 ."
            }
        }
    }
}
