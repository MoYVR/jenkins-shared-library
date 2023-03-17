#!/usr/bin/env groovy

import example.Docker

def call(String imageName) {
    return new Docker(this).buildDockerImage(imageName)
}

