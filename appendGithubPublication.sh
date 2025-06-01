#!/bin/bash

# Check if a file path is provided
if [ -z "$1" ]; then
    echo "Error: Please provide the path to build.gradle file"
    echo "Usage: $0 <path-to-build.gradle>"
    exit 1
fi

BUILD_GRADLE="$1"

# Check if the file exists
if [ ! -f "$BUILD_GRADLE" ]; then
    echo "Error: File $BUILD_GRADLE does not exist"
    exit 1
fi

# Publishing configuration block
config_block='
publishing {
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/chauhaidang/xq-apis")
            credentials {
                username = System.getenv("GITHUB_ACTOR")
                password = System.getenv("GITHUB_TOKEN")
            }
        }
    }
}'

# Check if the configuration already exists
if ! grep -q "maven.pkg.github.com/chauhaidang/xq-apis" "$BUILD_GRADLE"; then
    # Append the configuration block to build.gradle
    echo "$config_block" >> "$BUILD_GRADLE"
    echo "Publishing configuration added to $BUILD_GRADLE"
else
    echo "Publishing configuration already exists in $BUILD_GRADLE"
fi