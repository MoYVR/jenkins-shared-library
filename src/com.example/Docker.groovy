#!/usr/bin/env groovy
package com.example

class docker implements Serializable {
    
    def script

    Docker(script) {
        this.script = script
    }
    
def buildingDockerImage() {
    script.echo "building the docker image..."
    script.withCredentials([script.usernamePassword(credentialsId:'docker-hub-repo', usernameVariable: 'USER', passwordVariable: 'PASS')]) {
    script.sh 'docker build -t moyvr/my-repo:jma-3.0 .'
    script.sh "echo $script.PASS | docker login -u $script.USER --password-stdin"
    script.sh 'docker push moyvr/my-repo:jma-3.0'
        }
    }
}
