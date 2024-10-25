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
                      println ("Thanks for subscription to + ${course}")
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

