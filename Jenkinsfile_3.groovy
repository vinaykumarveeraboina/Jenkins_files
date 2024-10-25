//comment types

/*
comment multiple lines */


//agent { lebel 'label name '} -- will run on mvn slave 

pipeline{
agent  none  // this applies to entire pipleline     
stages{
    stage('First stage') {
        agent{   // this is specific to stage 
            node {
                label 'mvn-slave'
                customWorkspace '/home/jslave/agnettest'
            }
        }
    steps{
        echo " example for using jenkins files and node agent "
        sh 'hostname -i'
        sh 'pwd'
        sh 'cat agnet.txtfile'

      
    }
}
}
}

