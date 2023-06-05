def newGit(repo)
{
  git "https://github.com/intelliqittrainings/${repo}"
}
def newBuild()
{
   sh "mvn package"
}
def newDeploy()
{
  deploy adapters: [tomcat9(credentialsId: '99635ba4-4507-4e54-984e-2fb06a157567', path: '', url: 'http://172.31.46.127:8080')], contextPath: 'testapp', war: '**/*.war'
}
def newTesting(jobname)
{
  sh "java -jar /var/lib/jenkins/workspace/${jobname}/testing.jar"
}
