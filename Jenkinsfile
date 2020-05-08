#!groovy
pipeline {
    agent any
    stages {
     stage('Maven Install and Build Jar') {
      steps {
       sh 'mvn clean package -DskipTests'
       }
     }
     stage('Docker Build') {
      steps {
        sh 'docker build -t soumyakariveda/calculatordocker:latest .'
      }
    }
     stage('Docker Hub'){
     steps{
 	  withDockerRegistry([ credentialsId: "DockerhubPush", url: "" ]){
 	   sh 'docker push soumyakariveda/calculatordocker:latest'
 	  }
     }
   }   
  }
 }
