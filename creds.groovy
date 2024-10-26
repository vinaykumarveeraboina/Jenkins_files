//credentials example , we are calling the credentials function and storing the value in a varaible called (CREDS)
pipeline{
    agent any
    environment
    {
        CREDS = credentials ('Github_Token')
    }
    stages{
        stage ('Creds_Test') {
             steps{
                
                  echo " Github credentials are ${CREDS}"
                  echo "username is  ${CREDS_USR}"
                  echo " password is   ${CREDS_PSW}"
                }
        }
    }
}