//comment types

/*
comment multiple lines */


pipeline{
agent {
    label  'mvn_slave'
  }   
stages{
    stage('First stage') {
    steps{
        echo " example for using jenkins files "
    }
}
}
}