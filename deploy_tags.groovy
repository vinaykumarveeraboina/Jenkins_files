pipeline{
    agent any
    stages{
        stage ('deploy to stage'){  /*If we want to execute the stage env , when branch is with release*/
            when {
                    branch 'release-*' 
            }   
            steps{
                echo "deploying to stage env "
            }
        }
        stage ('deploy to Prod'){  /*this stage shoudl execute with tags only */
           //v1.2.3 --it will deploy 
           //v.1.2.3 --it wont deply
           //v1.0 --it wont deploy 
              // v\\d{1,2} --v first character of tag , \\ , d --digit , {1,2}--it will allow 2 digits only ,if we want 3 digits {1,2,3}
            when {
                    tag pattern : "v\\d{1,2}\\.\\d{1,2}\\.\\d{1,2}", comparator: "REGEXP"
             }  
            steps{
                echo "deploying to prod env "
            }
        }    
    }  
 }
