//inputs with parameters

pipeline{
    agent any

    stages{
    stage('deploy to dev')
        {
        steps {
          echo "deploying to dev env "
          }
        }

         stage('deploy to prod')
         {
         options{ 
                timeout(time :600 ,unit : 'SECONDS')
                }
         
                inputs{
                    message : "should we continue"
                    submitter : 'vinay'
                    submitterParameter: "who approved"   
                }
                parameters {
                    string(name: 'CHANGE_TICKET', defaultValue: 'CH12345', description: 'Please Enter Change Ticket number')
                    booleanParam(name: 'SRE Approved ????', defaultValue: true, description: 'Is approval taken from SRE??')
                    choice(name: 'Release', choices: 'Regular\nHotfix', description: 'What type of release is this ??')
                    text(name: 'Notes', defaultValue: "Enter release notes if any.....", description: 'Release Notes')
                    password(name: 'myPassword', defaultValue: 'myPasswordValue', description: 'Enter the password')
                    credentials(name: 'myCredentials', description: 'My Credentials stored', required: true)
                }
          
            steps {
                echo "The Change Ticket is ${CHANGE_TICKET}"
                echo "Deploying to Production"
                echo "This is a ${Release} Release"
                echo "Approved by ${whoApproved}"
            }
        }
    }
}



// submitterParameter --type  who approved is the variable , which stores the value of submitter
// pipeline >> params.NAME
// stage >.>.input >>>> parameters >>> NAME

// if we define paramaerts insode the stage then no nooed to write




