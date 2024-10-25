//time out example ,
//here we are keeping 60 seconds sleep, but time out is 2 seconds , step will wait for only 2 seconds

pipeline{
    agent any
    stages{
        stage('build'){
            steps{
                timeout(time :2, unit : 'SECONDS')
                echo "sleeping for 60 seconds"
                sleep 60
            }
        }
    }
}