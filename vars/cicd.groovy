def gitdownload(repo)
{
  git "https://github.com/sudarshansw7/${repo}.git"
}
def build()
{
  sh "mvn package"
}
def deploy(jobname,ip,appname)
{
   sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${appname}.war"
}

