#!/usr/bin/env groovy

pipeline {
    agent any
    stages {
        stage ('build') {
            steps {
                script {
                    echo "Building the pipeline application...."
                }
            }
        }
        stage('test') {
            steps {
                script {
                    echo "Testing the pipleline application...."
                }
            }
        }
        stage('deploy') {
            steps {
                script {
                    echo "Deploying the application...."
                }
            }
        }
    }
}


pipeline {
    agent none
    stages {
        stage('build') {
            steps {
                script {
                    echo "Building the application..."
                    //echo "Start webhook in jenkins-jobs branch..."
                }
            }
        }
        stage('test') {
            steps {
                script {
                    echo "Testing the application..."
                }
            }
        }
        stage('deploy') {
            steps {
                script {
                    echo "Deploying the application..."
                }
            }
        }
    }
}


/*
pipeline {
    agent any
    stages{
        stage('test'){
            steps{
                script{
                    echo "Testing the application..."
                    echo "Executing the pipeline for branch $BRANCH_NAME"
                    
                }
            }
        }
        stage('build'){
            when {
                expression {
                    BRANCH_NAME == 'master' 
                }
            }
            steps{
                script{
                    echo "Building the application..."
                }
            }
        } 
        stage('deploy'){
            when {
                expression {
                    BRANCH_NAME == 'master'
                }
            }
            steps{
                script{
                    echo "Deploying the application..."
                }
            }
        }

    }
}

*/

/*
----------------------------
03 File with seperate Groovy File
----------------------------

def gv


pipeline {
    agent any
    tools {
        maven 'maven-3.9'
    }
    stages {
        stage('init'){
            steps {
                script {

                    gv = load "script.groovy"
                }
            }
        }
        stage('build jar') {
            steps {
                script {
                   gv.buildJar()
                }
            }
        }
        stage('build image'){
            steps {
                script {

                  gv.buildImage()

                }
            }
        }

        stage('deploy') {
            steps {
                script {
                    gv.deployApp()
                }
            }
        }
        
    }  
}

*/

/*
--------------------
02 File
--------------------

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
                        sh 'docker build -t waseem63/my-demo-app:jma-1.3 .'
                        sh "echo $PASS | docker login -u $USER --password-stdin"
                        sh  'docker push waseem63/my-demo-app:jma-1.3'
                    }
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
 
 */

/*
------------------------
01 File 
------------------------
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

