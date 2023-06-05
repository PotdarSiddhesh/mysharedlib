def newGit(repo)
{
  git "https://github.com/intelliqittrainings/${repo}"
}
def newBuild()
{
   sh 'mvn package'
}
