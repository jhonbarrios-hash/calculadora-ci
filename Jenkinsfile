pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Compilando proyecto'
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                echo 'Ejecutando las pruebas unitarias'
                sh 'mvn test'
            }
        }
    }
}