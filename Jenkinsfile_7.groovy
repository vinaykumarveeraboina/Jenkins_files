//tools usage in pipleline or stage level

pipeline{
    agent any
    tools{
     java 'JavaJdk_21'
    }
    
    stages    
{
    stage(' jdk 21')
    {
        steps{
            echo " jdk 11"
            sh 'java -version'
            
        }
        
    }
    stage('jdk 17')
    {
        tools {
            java 'JavaJdk_17'
        }
        steps{
            echo " jdk 17"
            sh 'java -version'
          
        }
        
    }
}
   
}