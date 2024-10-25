pipeline{
    agent any 

    stages{

        stage ('hello') {
           echo "Hello!! MR.vk"
        }

        stage ('scripted stage')
        {
            steps  {
             script{
                  def course ="k8s"  //static defination 
                  if(course == "k8s")
                   {
                      println ("Thanks for subscription")
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

