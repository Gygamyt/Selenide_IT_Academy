pipeline {
    agent any
    stages {
        stage('Git') {
            steps {
                git url: 'https://github.com/Gygamyt/Selenium_IT_Academy'
            }
        }
        stage('Tests') {
            steps {
                  bat "mvn clean test -Dheadless=0"
            }
        }
            }
        post {
               always {
                      allure includeProperties: false, jdk: '', results: [[path: 'target/allure-results']]
               }
            }
        }