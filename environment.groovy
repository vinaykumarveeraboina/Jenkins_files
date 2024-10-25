pipeline{
    agent any
    environment
    {
        //key value pairs
        name = vinay
        course = k8s
    }
    stages{
        stage ('env testing') {
             steps{
                echo "welcome ${name}"
                echo " weclome to ${course}"

             }
        }
    }
}