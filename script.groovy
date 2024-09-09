
 def buildJar() {
    echo "building the application..."
    sh 'mvn package'
} 

def buildImage() {
    echo 'building the image ....'
    withCredentials([usernamePassword(credentialsId: 'dockerhub', passwordVariable: 'PASS', usernameVariable: 'USER')]){
        sh 'docker build -t waseem63/my-demo-app:jma-1.5 .'
        sh "echo $PASS | docker login -u $USER --password-stdin"
        sh  'docker push waseem63/my-demo-app:jma-1.5'
    }
} 

def deployApp() {
    echo 'deploying the application...'
} 

return this
