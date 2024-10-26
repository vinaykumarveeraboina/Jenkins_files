pipeline{
    agent any
    environment{
        Deploy_to= 'prod'
    }
    stages{
        stage ('deploy') {
            when {environmnet name : 'DEPLOY_to', value : 'prod'}
             steps{
                  echo " deploying "
                  
                }
        }
        }
    }
