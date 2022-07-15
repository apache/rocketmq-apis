# Licensed to the Apache Software Foundation (ASF) under one or more
# contributor license agreements.  See the NOTICE file distributed with
# this work for additional information regarding copyright ownership.
# The ASF licenses this file to You under the Apache License, Version 2.0
# (the "License"); you may not use this file except in compliance with
# the License.  You may obtain a copy of the License at

#     http://www.apache.org/licenses/LICENSE-2.0

# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

workspace(name = "org_apache_rocketmq_apis")

load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")
load("@bazel_tools//tools/build_defs/repo:git.bzl","git_repository")
load(
    "//:deps.bzl",
    "io_grpc_grpc_java",
)

io_grpc_grpc_java()

http_archive(
    name = "rules_proto",
    sha256 = "66bfdf8782796239d3875d37e7de19b1d94301e8972b3cbd2446b332429b4df1",
    strip_prefix = "rules_proto-4.0.0",
    urls = [
        "https://mirror.bazel.build/github.com/bazelbuild/rules_proto/archive/refs/tags/4.0.0.tar.gz",
        "https://github.com/bazelbuild/rules_proto/archive/refs/tags/4.0.0.tar.gz",
    ],
)
load("@rules_proto//proto:repositories.bzl", "rules_proto_dependencies", "rules_proto_toolchains")
rules_proto_dependencies()
rules_proto_toolchains()

RULES_JVM_EXTERNAL_TAG = "a1eaa5b82103c8b54154c9a37c4901b663aadc07"
RULES_JVM_EXTERNAL_SHA = "e1aefed247ba2d9ccc405e3f673ec81e3dde5a0a43fa59ccdb2df53a55ef8684"
http_archive(
    name = "rules_jvm_external",
    strip_prefix = "rules_jvm_external-%s" % RULES_JVM_EXTERNAL_TAG,
    sha256 = RULES_JVM_EXTERNAL_SHA,
    url = "https://github.com/bazelbuild/rules_jvm_external/archive/%s.zip" % RULES_JVM_EXTERNAL_TAG,
)
load("@rules_jvm_external//:repositories.bzl", "rules_jvm_external_deps")
rules_jvm_external_deps()
load("@rules_jvm_external//:setup.bzl", "rules_jvm_external_setup")
rules_jvm_external_setup()
load("@rules_jvm_external//:defs.bzl", "maven_install")

maven_install(
    artifacts = [
        "com.google.guava:guava:31.1-jre",
        "com.google.protobuf:protobuf-java:3.19.4",
        "io.grpc:grpc-core:1.45.0",
        "io.grpc:grpc-protobuf:1.45.0",
        "io.grpc:grpc-stub:1.45.0",
        "io.grpc:grpc-api:1.45.0",
        "com.google.api.grpc:proto-google-common-protos:2.0.1",
        "javax.annotation:javax.annotation-api:1.3.2"
    ],
    repositories = [
        "https://repo1.maven.org/maven2",
    ],
)

http_archive(
    name = "com_google_googleapis",
    sha256 = "e89f15d54b0ddab0cd41d18cb2299e5447db704e2b05ff141cb1769170671466",
    urls = [
        "https://github.com/googleapis/googleapis/archive/af7fb72df59a814221b123a4d1acb3f6c3e6cc95.zip",
    ],
    strip_prefix = "googleapis-af7fb72df59a814221b123a4d1acb3f6c3e6cc95"
)
load("@com_google_googleapis//:repository_rules.bzl", "switched_rules_by_language")
switched_rules_by_language(
    name = "com_google_googleapis_imports",
    cc = True,
 #   csharp = True,
 #   gapic = True,
 #   go = True,
 #   grpc = True,
    java = True,
 #   nodejs = True,
 #   php = True,
 #   python = True,
 #   ruby = True,
)

git_repository(
    name = "graknlabs_bazel_distribution",
    remote = "https://github.com/graknlabs/bazel-distribution",
    commit = "d3d4075a6618edc683a88630bf1f9f58859563b7",
)

http_archive(
    name = "rules_proto_grpc",
    sha256 = "507e38c8d95c7efa4f3b1c0595a8e8f139c885cb41a76cab7e20e4e67ae87731",
    strip_prefix = "rules_proto_grpc-4.1.1",
    urls = ["https://github.com/rules-proto-grpc/rules_proto_grpc/archive/4.1.1.tar.gz"],
)
load("@rules_proto_grpc//:repositories.bzl", "rules_proto_grpc_toolchains", "rules_proto_grpc_repos")
rules_proto_grpc_toolchains()
rules_proto_grpc_repos()
load("@com_github_grpc_grpc//bazel:grpc_deps.bzl", "grpc_deps", "grpc_test_only_deps")
grpc_deps()
grpc_test_only_deps()
load("@com_github_grpc_grpc//bazel:grpc_extra_deps.bzl", "grpc_extra_deps")
grpc_extra_deps()