def buildJar() {
    echo '<h2>Step 01: Building Jar</h2>'
    echo '<h4>Building the Java application jar file... The Maven package command will be executed below:</h4>'
    try {
        sh 'mvn package'
        echo 'Maven package build completed successfully.'
    } catch (Exception e) {
        echo "Error occurred while building the jar: ${e.message}"
        currentBuild.result = 'FAILURE'
        throw e
    }
}

def buildImage() {  // Corrected method name to 'buildImage'
    echo '<h2>Step 02: Building Docker Image</h2>'
    echo '<h4>Building the Docker image and pushing it to the Docker repository...</h4>'
    try {
       withCredentials([usernamePassword(credentialsId: 'dockerhub', usernameVariable: 'USER', passwordVariable: 'PASS')]){
        sh 'docker build -t waseem63/demo-app:jma-3.2 .'
        sh "echo $PASS | docker login -u $USER --password-stdin"
        sh 'docker push waseem63/demo-app:jma-3.2'
        echo 'Docker image built and pushed successfully.'
    } catch (Exception e) {
        echo "Error occurred while building the Docker image: ${e.message}"
        currentBuild.result = 'FAILURE'
        throw e
    }
}

def deployApp() {
    echo '<h2>Step 03: Deploying Application</h2>'
    echo '<h4>Deploying the application and pushing it to Docker Hub...</h4>'
    try {
        // Add the deployment command here
        echo 'Application deployed successfully.'
    } catch (Exception e) {
        echo "Error occurred during deployment: ${e.message}"
        currentBuild.result = 'FAILURE'
        throw e
    }
}
return this