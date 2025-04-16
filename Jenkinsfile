pipeline {
    agent any 
    
    stages {
        stage('build'){
            steps {
                script {
                    echo "This is building stage"
                    echo "Executing pipeline for branch $BRANCH_NAME"
                }
            }
        }
        stage('test'){
            when {
                expression {
                     BRANCH_NAME = 'master'
                }
            }
            steps {
                script {
                    echo "This is testing stage"
                }
            }
        }
        stage('deploy'){

             when {
                expression {
                     BRANCH_NAME = 'master'
                }
            }
            steps {
                script {
                    echo "This is the deployment stage"
                }
            }
        }
        

    }
}

// def gv

// pipeline {
//     agent any
//     stages {
//         stage("init") {
//             steps {
//                 script {
//                     gv = load "script.groovy"
//                 }
//             }
//         }
//         stage("build jar") {
//             steps {
//                 script {
//                     echo "building jar"
//                     //gv.buildJar()
//                 }
//             }
//         }
//         stage("build image") {
//             steps {
//                 script {
//                     echo "building image"
//                     //gv.buildImage()
//                 }
//             }
//         }
//         stage("deploy") {
//             steps {
//                 script {
//                     echo "deploying"
//                     //gv.deployApp()
//                 }
//             }
//         }
//     }   
// }
