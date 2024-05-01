
 def buildJar() {
    echo "building the application..."
    sh 'mvn package'
} 

def buildImage() {
    echo "builing docker image..."
        withCredentials([usernamePassword(credentialsId: 'docker-hub-repo', passwordVariable: 'PASS', usernameVariable: 'USER')]){
            sh 'docker build -t waseem63/my-demo-app:jma-4.0 .'
            sh "echo $PASS | docker login -u $USER --password-stdin"
            sh 'docker push waseem63/my-demo-app:jma-4.0'
    }
} 

def deployApp() {
    echo 'deploying the application...'
} 

return this
