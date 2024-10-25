pipeline{
    agent any
    environment
    {
        //key value pairs
        name = "vinay"
        course = "k8s"
    }
    stages{
        stage ('global env testing') {
             steps{
                echo "welcome ${name}"
                echo " weclome to ${course}"

             }
        }
        stage ('local env testing') {
            environment{
               name = "local"
                  course = "openshift" 
            }
            steps{
                echo "welcome ${name}"
                echo " weclome to ${course}"
                //sh "print env"  //linux
                bat 'set'

            }
        }
    }
}