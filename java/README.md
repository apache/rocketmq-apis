# Java

build and deploy snapshot

```bash
export DEPLOY_MAVEN_USERNAME=your_username
export DEPLOY_MAVEN_PASSWORD=your_password
bazel run //java:deploy-maven snapshot
```