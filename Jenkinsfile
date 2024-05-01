
pipeline {
    agent any
    tools {
        maven 'maven-3.9'
    }
    stages {
        stage('build jar') {
            steps {
                script {
                    echo 'building the application ...'
                    sh 'mvn package'
                }
            }
        }
        stage('build image'){
            steps {
                script {
                    echo 'building the image ....'
                    withCredentials([usernamePassword(credentialsId: 'docker-hub-repo', passwordVariable: 'PASS', usernameVariable: 'USER')]){
                        sh 'docker build -t waseem63/m y-demo-app:jma-1.3 .'
                        sh "echo $PASS | docker login -u $USER --password-stdin"
                        sh  'docker push waseem63/my-demo-app:jam-1.3'
                    }
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