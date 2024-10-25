pipeline{
    agent any
    environments
    {
        //key value pairs
        name = vinay
        course = k8s
    }
    stages('env testing'){
        stage{
             steps{
                echo "welcome ${name}"
                echo " weclome to ${course}"

             }
        }
    }
}