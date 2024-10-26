pipeline{
    agent any 
    stages{
        stage('input prompt'){
            steps{
                timeout(time :300, unit:'SECONDS')
                input messages : 'are you building the application', ok: 'yes', submitter: 'vinay kumar veeraboina'
            }
               echo "building application "
         }
    }
}
