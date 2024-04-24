/* def buildJar() {
    echo "building the application..."
    sh 'mvn package'
} 

def buildImage() {
    echo "builing docker image..."
        withCredentials([usernamePassword(credentialsId: 'docker-hub-repo', passwordVariable: 'PASS', usernameVariable: 'USER')]){
            sh 'docker build -t waseem63/myrepo:jma-3.0 .'
            sh "echo $PASS | docker login -u $USER --password-stdin"
            sh 'docker push waseem63/myrepo:jma-3.0'
    }
} 

def deployApp() {
    echo 'deploying the application...'
} 

return this
*/

def buildJar() {
    echo "building the Jar file"
    sh 'mvn package'
}

def buildImage() {
    echo "building the image...."
    withCredentials([usernamePassword(credentialsId: 'docker-hub-repo', passwordVariable: 'PASS', usernameVariable: 'USER')])
    sh 'docker build -t waseem63/myrepo:jma-4.0 .'
    sh "echo $PASS | docker login -u $USER --password-stdin"
    sh 'docker push waseem63/myrepo:jma-4.0'
  
}

def deployApp() {
    echo 'deploying the application...'
}

return this