//comment types

/*
comment multiple lines */


pipeline{
agent any    // we can expecute a pipeline or stage with any agent available 
stages{
    stage('First stage')  //this can be user friendly but need to be meaning full for task 
    steps{
        echo " example for using jenkins files "
    }
}
}