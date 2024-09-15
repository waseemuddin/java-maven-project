def buildJar() {
    echo '<h2>Step 01</h2>'
    echo '<h4>I am building the java application jar file .....<br> the below sh command for java maven packages are required</h4>'
    sh 'mvn package'
}

def buildImage() {  // Corrected method name
    echo '<h2>Step 02</h2>'
    echo '<h4>Building the docker images and pushing to docker repository</h4>'
    withCredentials([usernamePassword(credentialsId: 'dockerhub', usernameVariable: 'USER', passwordVariable: 'PASS')]){
        sh 'docker build -t waseem63/demo-app:jma-3.2 .'
        sh "echo $PASS | docker login -u $USER --passsword-stdin"
        sh 'docker push waseem63/demo-app:jma-3.2'
    }
}

def deployApp() {
    echo '<h2>Step 03</h2>'
    echo '<h4>This is the final step where the application is successfully deployed and pushed to Docker Hub</h4>'  // Corrected closing tags
}

return this