pipeline {

    agent any

    stages {

        stage("build") {

            steps {
                echo 'building the application...'
                sh 'sbt complile'
            }
        }

        stage("test") {

            steps {
                echo 'testing the application...'
                // sh 'sbt test'
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
