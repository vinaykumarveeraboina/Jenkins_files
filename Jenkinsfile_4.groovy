//script block should be available in steps block 
// script used groovy as the programming language 

pipeline{
    agent any 

    stages{

        stage ('hello') {
            steps{
             echo "Hello!! MR.vk"
            }
        }

        stage ('scripted stage')
        {
            steps  {
             script{
                  def course ="k8s"  //static defination 
                  if(course == "k8s")
                   {
                      println ("Thanks for subscription to  ${course}")
                   }
                  else  
                   {
                   println(" Go and enrol")
                    }
               }
            }
        
        }
    }
}

