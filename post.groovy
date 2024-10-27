pipeline{
    agent any
    stages{
        stage('build')
        {
            steps{
                echo " build and deploy yo dev"
                error "failing the stage intentionally"
            }
        post{
            success{
                echo "build stage is sucess"
            }
            failure{
                echo "build stage got failed"
            }
        }
    }
    }
    post{
            success{
                echo "pipeline is sucess"
            }
            failure{
                echo "pileline got failed"
            }
        }

    }

