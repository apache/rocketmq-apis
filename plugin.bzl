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

ProtoPluginInfo = provider(fields = {
    "name": "proto plugin name",
    "outputs": "outputs to be generated",
    "tool": "plugin tool",
    "executable": "plugin tool executable",
    "options": "proto options",
    "out": "aggregate proto output",
    "outdir": "whether to use the package output dir",
    "data": "additional data",
    "transitivity": "transitivity properties",
})

def _proto_plugin_impl(ctx):
    return [ProtoPluginInfo(
        data = ctx.files.data,
        executable = ctx.executable.tool,
        name = ctx.label.name,
        options = ctx.attr.options,
        out = ctx.attr.out,
        outdir = ctx.attr.outdir,
        outputs = ctx.attr.outputs,
        tool = ctx.attr.tool,
        transitivity = ctx.attr.transitivity,
    )]

proto_plugin = rule(
    implementation = _proto_plugin_impl,
    attrs = {
        "options": attr.string_list(
            doc = "An list of options to pass to the compiler.",
        ),
        "outputs": attr.string_list(
            doc = "Output filenames generated on a per-proto basis.  Example: '{basename}_pb2.py'",
        ),
        "out": attr.string(
            doc = "Output filename generated on a per-plugin basis; to be used in the value for --NAME-out=OUT",
        ),
        "outdir": attr.string(
            doc = "If present, overrides the file.path from out; to be used in the value for --NAME-out=OUT",
        ),
        "tool": attr.label(
            doc = "The plugin binary.  If absent, assume the plugin is a built-in to protoc itself",
            cfg = "host",
            allow_files = True,
            executable = True,
        ),
        "transitivity": attr.string_dict(
            doc = "Transitive exclusions.  When the compile.bzl 'transitive' property is enabled, this string_dict can be used to exclude protos from the compilation list",
        ),
        "data": attr.label_list(
            doc = "Additional files that should travel with the plugin",
            allow_files = True,
        ),
    },
)
