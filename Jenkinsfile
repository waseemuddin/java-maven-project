pipeline {
    agent any
    tools {
        maven 'maven-3.9'
    }
    stages {
        stage("build jar") {
            steps {
                script {
                    echo "building the applicaton...."
                    sh 'mvn  package'
                }
            }
        }
            stage("Build Image") {
                steps {
                 script {
                    echo "Building the Docker image...."
                    withCredentials([usernamePassword(credentialsId: 'docker-hub-account', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
                        // Login FIRST before building/pushing
                        sh "echo \$PASS | docker login -u \$USER --password-stdin"
                        sh 'docker build -t vpccloud/demo-app:jma-1.0 .'
                        sh 'docker push vpccloud/demo-app:jma-1.0'
                    }
                }
            }
        }
            stage("deploy") {
            steps {
                script {
                    echo "deploying the java application...."
                    
                }
            }
        }
    }
}
















//------------------------------------------------------------
// pipeline {
//     agent any

//     stages {
//         stage('build'){
//             steps {
//                 script {
//                     sh 'npm --version'
//                     echo "This is building the stage"
//                 }
//             }
//         }
//         stage('test') {
//             steps {
//                 script {
//                     echo "This is testing stage"
//                 }
//             }
//         }
//         stage('deploy') {
//             steps {
//                 script {
//                     echo "This is deploying stage"
//                 }
//             }
//         }
//     }
// }

