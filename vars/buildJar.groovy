#!/bin/bash groovy

def call() {
    echo "building the application..."
    sh 'mvn package'
}