pipeline {

    agent any

    stages {

        stage("build") {

            steps {
                echo 'building the application...'
                sh 'sbt compile'
            }
        }

        stage("test") {

            steps {
                echo 'testing the application...'
                // sh '/usr/bin/sbt test'
            }
        }

        stage("packaging") {

            steps {
                echo 'packaging the application...'
                // sh 'sbt package'
            }
        }
    }
}
