/*pipeline{
    agent any
    environment{
        Deploy_to= 'unknown'
    }
    stages{
        stage ('deploy') {
            when {
                environment name : 'DEPLOY_to', value : 'prod' //when name =value execute it 
                }
             steps{
                  echo " deploying "
                  
                }
        }
        }
    }
    */

//another way of writing the code 

/* pipeline{
    agent any
    environment{
        Deploy_to= 'prod'
    }
    stages{
        stage ('deploy') {
            when {
                equals expected : 'prod', actual: "${Deploy_to}"
                /* Here we are expecting prod and it is comparing to the value in depoy_to variable 
                which we called in actual block actual: "${Deploy_to}
                 when expected is equal to actual , excute the the when block 
                
                }
             steps{
                  echo " deploying "
                  
                }
        }
        }
    }
    */

//not condition 

    pipeline{
    agent any
    environment{
        Deploy_to= 'prod'
    }
    stages{
        stage ('deploy') {
            when {
                not{
                equals expected : 'prod', actual: "${Deploy_to}"
                }
                }
             steps{
                  echo " deploying when condition "
                  
                }
        }
        }
    }