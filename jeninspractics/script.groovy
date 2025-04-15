def buildJar() {
    echo "building the application"
    sh 'mvn package'
}

def buildImage() {
        echo "This is testing stage"
        withCredentials([usernamePassword(credentialsId: 'docker-hub-id', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh 'docker build -t vpccloud/demo-app:jma-3.0 .'
        sh "echo $PASS | docker login -u $USER --password-stdin"
        sh 'docker push vpccloud/demo-app:jma-3.0'
    }
}

def deployApp() {
    echo 'deploying the application'
}


return this
