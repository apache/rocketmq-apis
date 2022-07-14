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

load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")
load("@bazel_tools//tools/build_defs/repo:jvm.bzl", "jvm_maven_import_external")

def get_ref(name, default, kwargs):
    key = name + "_ref"
    return kwargs.get(key, default)

def get_sha256(name, default, kwargs):
    key = name + "_sha256"
    return kwargs.get(key, default)

def github_archive(name, org, repo, ref, sha256):
    """Declare an http_archive from github
    """

    # correct github quirk about removing the 'v' in front of tags
    stripRef = ref
    if stripRef.startswith("v"):
        stripRef = ref[1:]

    if name not in native.existing_rules():
        http_archive(
            name = name,
            strip_prefix = repo + "-" + stripRef,
            urls = [
                "https://mirror.bazel.build/github.com/%s/%s/archive/%s.tar.gz" % (org, repo, ref),
                "https://github.com/%s/%s/archive/%s.tar.gz" % (org, repo, ref),
            ],
            sha256 = sha256,
        )

def io_grpc_grpc_java(**kwargs):
    """grpc java plugin and jars
    """
    name = "io_grpc_grpc_java"
    ref = get_ref(name, "8eff2630828a7ec6f4980b5b46f30f875070a4e4", kwargs)  # v1.19.0 and changes up to PR #5456
    sha256 = get_sha256(name, "f0e17fb16a404ba473429144481221e2c970c65596f65129002af3c73dcfe141", kwargs)
    github_archive(name, "grpc", "grpc-java", ref, sha256)