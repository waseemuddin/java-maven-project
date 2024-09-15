
//Step 01 build jar file
def buildJar(){
    echo '<h2>Step 01</h2>'
    echo '<h4>I am building the java application jar file .....<br> the below sh command for java maven packages are required<h2>'
    sh 'mvn package'
}
// step 02 building images and login docker account and push it
def builImage(){
    echo '<h2>Step 02</h2>'
    echo '<h4>Building the docker images and push to docker repository</h4>'
}

// step 03 final step success
def deployApp(){
    echo '<h2>Step 03</h2'
    echo '</h4>This is the final step where application successfully deployed and push to docker hub</h4>'

}