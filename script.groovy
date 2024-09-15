
def buildjar() {
    echo "building the application..."
    sh 'mvn package'
}

def buildImage(){
    echo "Building the image...."
    withCredentials([usernamePassword(credentialsId: 'dockerhub', usernameVariable: 'USER', passwordVariable: 'PASS')]){
        sh 'docker build -t waseem63/demo-app:jma-3.0 .'
        sh "echo $PASS docker login -u $USER --password-stdin"
        sh 'docker push waseem63/demo-app:3.0'
    }
}

def deplyApp(){

    echo "deploying the app....."
}

return this



 