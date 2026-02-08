pipeline {
    agent any
    tools {
        maven 'Maven-3.9'  // Check your Jenkins tool configuration for exact name
    }
    stages {
        stage("Build") {
            steps {
                script {
                    echo "Building the application...."
                    sh 'mvn clean package'
                }
            }
        }
        stage("Build Image") {
            agent {
                docker {
                    image 'docker:latest'  // Uses Docker-in-Docker
                    args '-v /var/run/docker.sock:/var/run/docker.sock'
                }
            }
            steps {
                script {
                    echo "Building the Docker image...."
                    withCredentials([usernamePassword(credentialsId: 'docker-hub-account', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
                        sh """
                            echo \$PASS | docker login -u \$USER --password-stdin
                            docker build -t vpccloud/demo-app:jma-1.0 .
                            docker push vpccloud/demo-app:jma-1.0
                        """
                    }
                }
            }
        }
        stage("Deploy") {
            steps {
                script {
                    echo "Deploying the Java application...."
                    // Add deployment commands
                }
            }
        }
    }
}



// pipeline {
//     agent any
//     tools {
//         maven 'maven-3.9'
//     }
//     stages {
//         stage("build jar") {
//             steps {
//                 script {
//                     echo "building the applicaton...."
//                     sh 'mvn  package'
//                 }
//             }
//         }
//            stage("Build Image") {
//             agent {
//                 docker {
//                     image 'docker:latest'  // Uses Docker-in-Docker
//                     args '-v /var/run/docker.sock:/var/run/docker.sock'
//                 }
//             }
//             steps {
//                 script {
//                     echo "Building the Docker image...."
//                     withCredentials([usernamePassword(credentialsId: 'docker-hub-account', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
//                         sh """
//                             echo \$PASS | docker login -u \$USER --password-stdin
//                             docker build -t vpccloud/demo-app:jma-1.0 .
//                             docker push vpccloud/demo-app:jma-1.0
//                         """
//                     }
//                 }
//             }
//         }
//             stage("deploy") {
//             steps {
//                 script {
//                     echo "deploying the java application...."
                    
//                 }
//             }
//         }
//     }
// }
















// //------------------------------------------------------------
// // pipeline {
// //     agent any

// //     stages {
// //         stage('build'){
// //             steps {
// //                 script {
// //                     sh 'npm --version'
// //                     echo "This is building the stage"
// //                 }
// //             }
// //         }
// //         stage('test') {
// //             steps {
// //                 script {
// //                     echo "This is testing stage"
// //                 }
// //             }
// //         }
// //         stage('deploy') {
// //             steps {
// //                 script {
// //                     echo "This is deploying stage"
// //                 }
// //             }
// //         }
// //     }
// // }

