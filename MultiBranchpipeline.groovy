pipeline{
agent any    // we can expecute a pipeline or stage with any agent available

 /*agent 
   label = mvnnode  */    //ideally this is a string pased , which inform our jib to run on particular stage 


stages{
    stage('First stage') { //this can be user friendly but need to be meaning full for task 
    steps{
        echo " Execting multi branch pipeline"
    }
    }
    
}
}