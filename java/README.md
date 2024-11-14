# Java

build and deploy snapshot

```bash
export DEPLOY_MAVEN_USERNAME=your_username
export DEPLOY_MAVEN_PASSWORD=your_password
bazel run //java:deploy-maven snapshot

# release to apache repo
# https://medium.com/wix-engineering/how-to-publish-artifacts-from-bazel-to-maven-central-71da0cf990f5
bazel run //java:deploy-maven -- snapshot --gpg
```