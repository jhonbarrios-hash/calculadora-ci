pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                echo 'Realizando checkout del repositorio'
            }
        }

        stage('Build') {
            steps {
                echo 'Compilando proyecto'
            }
        }

        stage('Test') {
            steps {
                echo 'Ejecutando las pruebas unitarias'
                echo 'test run: 1'
                echo "Failed tests: 0"
                echo "Errors: 0"
            }
        }
    }
}