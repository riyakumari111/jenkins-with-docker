pipeline{
    agent any
    tools{
        maven 'Maven3'
    }
    stages{
        stage('build'){
            steps{
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/riyakumari111/jenkins-with-docker.git']])
                bat 'mvn clean install'
            }
        }
        stage('test'){
            steps{
                bat 'mvn test'
            }
        }
        
    }
}