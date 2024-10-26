pipeline{
    agent any
    environment{
        Deploy_to= 'unknown'
    }
    stages{
        stage ('deploy') {
            when {
                environment name : 'DEPLOY_to', value : 'prod'
                }
             steps{
                  echo " deploying "
                  
                }
        }
        }
    }
