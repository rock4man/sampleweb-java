pipeline {
    agent any

    environment {
        IMAGE_NAME = "my-java-web"
    }

    stages {

        stage('Build & Test') {
            steps {
                bat 'mvn clean test'
            }
        }

        stage('Package') {
            steps {
                bat 'mvn package -DskipTests'
            }
        }

        stage('Docker Build') {
            steps {
                bat "docker build -t ${IMAGE_NAME} ."
            }
        }

        stage('Run Container') {
            steps {
                bat """
                docker rm -f my-container || exit 0
                docker run -d -p 8082:8082 --name my-container ${IMAGE_NAME}
                """
            }
        }
    }
}
