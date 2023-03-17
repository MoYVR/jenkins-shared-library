#!/bin/bash groovy

def call() {
    echo "building the application for branch "
    sh 'mvn package'
}
