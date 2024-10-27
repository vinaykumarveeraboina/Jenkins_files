pipeline{
    stages{
        stage('build')
        {
            steps{
                echo " build and deploy yo dev"
            }
        }
        post{
            sucess{
                "build stage is sucess"
            }
            failure{
                "build stage got failed"
            }
        }
    }
    post{
            sucess{
                "pipeline is sucess"
            }
            failure{
                "pileline got failed"
            }
        }

    }

