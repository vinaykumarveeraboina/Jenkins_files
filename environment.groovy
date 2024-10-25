pipeline{
    agent any
    environments
    {
        //key value pairs
        name = vinay
        course = k8s
    }
    stages{
        stage{
             steps{
                echo "welcome ${name}"
                echo " weclome to ${course}"

             }
        }
    }
}