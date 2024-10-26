pipeline{
    agent any 
    stages{
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