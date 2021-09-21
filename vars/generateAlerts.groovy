def call() {
    pipeline {
    agent any

    stages {
        stage('Git Checkout') {
            steps {
                emailext body: 'Job ${buildJobUrl} was a ${buildStatus} !', subject: 'JOB BUILD: ${buildStatus}', to: 'fayez.aqtas@ecs.co.uk'
            }
        }


    }
}

}
