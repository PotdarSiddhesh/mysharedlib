def newGit(repo)
{
  git "https://github.com/intelliqittrainings/${repo}"
}
def newBuild()
{
   sh 'mvn package'
}
def newDeploy(ip,context)
{
  deploy adapters: [tomcat9(credentialsId: '99635ba4-4507-4e54-984e-2fb06a157567', path: '', url: '${ip}')], contextPath: '${context}', war: '**/*.war'
}
