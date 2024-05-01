
pipeline {
    agent none
    stages {
        stage('build') {
            steps {
                script {
                    echo 'building the application ...'
                }
            }
        }
        stage('test') {
            steps {
                script {
                    echo 'Testing the application....'

                }
            }
        }
        stage('deploy') {
            steps {
                script {
                    echo 'deploying the applicaton.....'
                }
            }
        }
        
    }
}
 
/*
 #!/usr/bin/env groovy

pipeline {
    agent any
    stages {
        stage('test') {
            steps {
                script {
                    echo "Testing the application..."
                    echo "Executing the pipeline for branch $BRANCH_NAME"
                }
            }
        }
        stage('build') {
            when {
                expression {
                    BRANCH_NAME == 'master'
                }
            }
            steps {
                script {
                    echo "Building the application..."

                }
            }
        }
        stage('deploy') {
              when {
                expression {
                    BRANCH_NAME == 'master'
                }
            }

            steps {
                script {
                    echo "Deploying the application..."
                }
            }
        }
    }
}

*/