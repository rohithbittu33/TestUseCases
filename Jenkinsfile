pipeline {

    agent any

    stages {

        stage("build") {

            steps {
                echo 'building the application...'
                echo '--------------------------------------------------------------------------------------------------'
                sh 'sbt compile'
                echo '--------------------------------------------------------------------------------------------------'
            }
        }

        stage("test") {

            steps {
                echo 'testing the application...'
                echo '--------------------------------------------------------------------------------------------------'
                sh 'sbt test'
                echo '--------------------------------------------------------------------------------------------------'
            }
        }

        stage("packaging") {

            steps {
                echo 'packaging the application...'
                echo '--------------------------------------------------------------------------------------------------'
                sh 'pwd'
                sh 'sbt package'
                echo '--------------------------------------------------------------------------------------------------'                
            }
        }
    }
}
