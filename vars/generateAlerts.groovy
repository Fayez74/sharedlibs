def call(buildStatus,buildJobUrl){
  pipeline {
    agent any
    stages {
        stage('Generating Email') {
          steps {
              emailext body: 'Job ${buildJobUrl} was a ${buildStatus} !', subject: 'JOB BUILD: ${buildStatus}', to: 'fayez.aqtas@ecs.co.uk'
                
            }
        }
}
