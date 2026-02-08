
pipeline {
    agent any

    stages {
        stage('build'){
            steps {
                script {
                    echo "This is building the stage"
                }
            }
        }
        stage('test') {
            steps {
                script {
                    echo "This is testing stage"
                }
            }
        }
        stage('deploy') {
            steps {
                script {
                    echo "This is deploying stage"
                }
            }
        }
    }
}

