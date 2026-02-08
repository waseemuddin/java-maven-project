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
                    sh 'mvn package'
                }
            }
        }
         stage("build image") {
            steps {
                script {
                    echo "building the applicaton...."
                    withCrdentials([usernamePassword(crdentialsId: 'docker-hub-account', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
                        sh 'docker build -t vpccloud/demo-app:jma-1.0 .'
                        sh "echo $PASS | docker login -u $USER --password-stdin"
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

