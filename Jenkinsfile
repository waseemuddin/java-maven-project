pipeline {
    agent any
    stages {
        stage('test') {
            steps {
                script {
                    echo "Testing the application..."
                    echo "Executing the pipeline for branch $BRANCHNAME"
                }
            }
        }
        stage('build') {
            when {
                expression {
                    BRANCHNAME == 'master'
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
                    BRANCHNAME == 'master'
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

