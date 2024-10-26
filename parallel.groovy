pipeline{
    agent any 
    stages{
        stage('running parallel jobs'){
            failFast false
        parallel{
            stage('sonar')
            {
             steps{
                echo "sonar step"
                sleep 10
                }
            }
            stage('fortyfyscan')
            {
                steps{
                echo "fortyfyscan"
                sleep 10
                error 'simulating error during fortyscan'

            }
            }
            stage('checkmark scan')
            {
                steps{
                echo "checkmark scan"
                sleep 10

            }
            }
        }
    }
    }
}