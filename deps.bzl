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
    ref = get_ref(name, "3c24dc6fe1b8f3e5c89b919c38a4eefe216397d3", kwargs)  # v1.19.0 and changes up to PR #5456
    sha256 = get_sha256(name, "1eeb136874a58a0a311a0701016aced96919f501ced0372013eb1708724ab046", kwargs)
    github_archive(name, "grpc", "grpc-java", ref, sha256)