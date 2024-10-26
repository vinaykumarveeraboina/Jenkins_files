pipeline{
agent any 
paramaters{
//string
//text
//boolean
//choice
string(name: 'PERSON', defaultValue: 'Mr Jenkins', description: 'Who should I say hello to?')
//real time we can give branch name 
string(name: 'Branch', defaultValue: 'main', description: 'Who brnch should I deploy?')
}
stages{
    stage('param stage'){
        steps{
           echo "Hello siva"
        }
    }
}
}