pipeline{
agent any 
parameters {
//string
//text
//boolean
//choice
string(name: 'PERSON', defaultValue: 'Mr Jenkins', description: 'Who should I say hello to?')
//real time we can give branch name 
//string(name: 'Branch', defaultValue: 'main', description: 'Who brnch should I deploy?')
choice(
     
     choice(name: 'ENVironmnet', choices: ['main', 'dev', 'stage' 'prod'], description: 'Pick something')

)
}
stages{
    stage('param stage'){
        steps{
           echo "Hello ${params.PERSON}"   //person is a variable of type string and take the string input and print it 
           echo "deployed on ${param.ENVironmnet}"

        }
    }
}
}