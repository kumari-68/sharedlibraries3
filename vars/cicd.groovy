def gitdownload(repo)
{
   git 'https://github.com/IntelliqDevops/maven.git'
}
def buildartifact()
{
  sh 'mvn package'
}
