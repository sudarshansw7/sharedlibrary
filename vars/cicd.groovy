def gitdownload(repo)
{
  git "https://github.com/sudarshansw7/${repo}.git"
}
def build()
{
  sh "mvn package"
}
