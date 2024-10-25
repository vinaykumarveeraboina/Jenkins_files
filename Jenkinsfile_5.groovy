// retry block -- it will retry for 3 times , if there is any error block in the step elase it will move to next step 

pipeline{
    agent any 
    stages{
        stage('retry stage'){
            steps{
                retry(3) {
                echo 'retry block'
                error 'something is fishy '
            }
           echo " out of retry block"
        }
    
        
    }
}
}