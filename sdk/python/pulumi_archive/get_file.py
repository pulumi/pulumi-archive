# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = [
    'GetFileResult',
    'AwaitableGetFileResult',
    'get_file',
    'get_file_output',
]

@pulumi.output_type
class GetFileResult:
    """
    A collection of values returned by getFile.
    """
    def __init__(__self__, exclude_symlink_directories=None, excludes=None, id=None, output_base64sha256=None, output_base64sha512=None, output_file_mode=None, output_md5=None, output_path=None, output_sha=None, output_sha256=None, output_sha512=None, output_size=None, source_content=None, source_content_filename=None, source_dir=None, source_file=None, sources=None, type=None):
        if exclude_symlink_directories and not isinstance(exclude_symlink_directories, bool):
            raise TypeError("Expected argument 'exclude_symlink_directories' to be a bool")
        pulumi.set(__self__, "exclude_symlink_directories", exclude_symlink_directories)
        if excludes and not isinstance(excludes, list):
            raise TypeError("Expected argument 'excludes' to be a list")
        pulumi.set(__self__, "excludes", excludes)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if output_base64sha256 and not isinstance(output_base64sha256, str):
            raise TypeError("Expected argument 'output_base64sha256' to be a str")
        pulumi.set(__self__, "output_base64sha256", output_base64sha256)
        if output_base64sha512 and not isinstance(output_base64sha512, str):
            raise TypeError("Expected argument 'output_base64sha512' to be a str")
        pulumi.set(__self__, "output_base64sha512", output_base64sha512)
        if output_file_mode and not isinstance(output_file_mode, str):
            raise TypeError("Expected argument 'output_file_mode' to be a str")
        pulumi.set(__self__, "output_file_mode", output_file_mode)
        if output_md5 and not isinstance(output_md5, str):
            raise TypeError("Expected argument 'output_md5' to be a str")
        pulumi.set(__self__, "output_md5", output_md5)
        if output_path and not isinstance(output_path, str):
            raise TypeError("Expected argument 'output_path' to be a str")
        pulumi.set(__self__, "output_path", output_path)
        if output_sha and not isinstance(output_sha, str):
            raise TypeError("Expected argument 'output_sha' to be a str")
        pulumi.set(__self__, "output_sha", output_sha)
        if output_sha256 and not isinstance(output_sha256, str):
            raise TypeError("Expected argument 'output_sha256' to be a str")
        pulumi.set(__self__, "output_sha256", output_sha256)
        if output_sha512 and not isinstance(output_sha512, str):
            raise TypeError("Expected argument 'output_sha512' to be a str")
        pulumi.set(__self__, "output_sha512", output_sha512)
        if output_size and not isinstance(output_size, int):
            raise TypeError("Expected argument 'output_size' to be a int")
        pulumi.set(__self__, "output_size", output_size)
        if source_content and not isinstance(source_content, str):
            raise TypeError("Expected argument 'source_content' to be a str")
        pulumi.set(__self__, "source_content", source_content)
        if source_content_filename and not isinstance(source_content_filename, str):
            raise TypeError("Expected argument 'source_content_filename' to be a str")
        pulumi.set(__self__, "source_content_filename", source_content_filename)
        if source_dir and not isinstance(source_dir, str):
            raise TypeError("Expected argument 'source_dir' to be a str")
        pulumi.set(__self__, "source_dir", source_dir)
        if source_file and not isinstance(source_file, str):
            raise TypeError("Expected argument 'source_file' to be a str")
        pulumi.set(__self__, "source_file", source_file)
        if sources and not isinstance(sources, list):
            raise TypeError("Expected argument 'sources' to be a list")
        pulumi.set(__self__, "sources", sources)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter(name="excludeSymlinkDirectories")
    def exclude_symlink_directories(self) -> Optional[builtins.bool]:
        """
        Boolean flag indicating whether symbolically linked directories should be excluded during the creation of the archive. Defaults to `false`.
        """
        return pulumi.get(self, "exclude_symlink_directories")

    @property
    @pulumi.getter
    def excludes(self) -> Optional[Sequence[builtins.str]]:
        """
        Specify files/directories to ignore when reading the `source_dir`. Supports glob file matching patterns including doublestar/globstar (`**`) patterns.
        """
        return pulumi.get(self, "excludes")

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        The sha1 checksum hash of the output.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="outputBase64sha256")
    def output_base64sha256(self) -> builtins.str:
        """
        Base64 Encoded SHA256 checksum of output file
        """
        return pulumi.get(self, "output_base64sha256")

    @property
    @pulumi.getter(name="outputBase64sha512")
    def output_base64sha512(self) -> builtins.str:
        """
        Base64 Encoded SHA512 checksum of output file
        """
        return pulumi.get(self, "output_base64sha512")

    @property
    @pulumi.getter(name="outputFileMode")
    def output_file_mode(self) -> Optional[builtins.str]:
        """
        String that specifies the octal file mode for all archived files. For example: `"0666"`. Setting this will ensure that cross platform usage of this module will not vary the modes of archived files (and ultimately checksums) resulting in more deterministic behavior.
        """
        return pulumi.get(self, "output_file_mode")

    @property
    @pulumi.getter(name="outputMd5")
    def output_md5(self) -> builtins.str:
        """
        MD5 of output file
        """
        return pulumi.get(self, "output_md5")

    @property
    @pulumi.getter(name="outputPath")
    def output_path(self) -> builtins.str:
        """
        The output of the archive file.
        """
        return pulumi.get(self, "output_path")

    @property
    @pulumi.getter(name="outputSha")
    def output_sha(self) -> builtins.str:
        """
        SHA1 checksum of output file
        """
        return pulumi.get(self, "output_sha")

    @property
    @pulumi.getter(name="outputSha256")
    def output_sha256(self) -> builtins.str:
        """
        SHA256 checksum of output file
        """
        return pulumi.get(self, "output_sha256")

    @property
    @pulumi.getter(name="outputSha512")
    def output_sha512(self) -> builtins.str:
        """
        SHA512 checksum of output file
        """
        return pulumi.get(self, "output_sha512")

    @property
    @pulumi.getter(name="outputSize")
    def output_size(self) -> builtins.int:
        """
        The byte size of the output archive file.
        """
        return pulumi.get(self, "output_size")

    @property
    @pulumi.getter(name="sourceContent")
    def source_content(self) -> Optional[builtins.str]:
        """
        Add only this content to the archive with `source_content_filename` as the filename. One and only one of `source`, `source_content_filename` (with `source_content`), `source_file`, or `source_dir` must be specified.
        """
        return pulumi.get(self, "source_content")

    @property
    @pulumi.getter(name="sourceContentFilename")
    def source_content_filename(self) -> Optional[builtins.str]:
        """
        Set this as the filename when using `source_content`. One and only one of `source`, `source_content_filename` (with `source_content`), `source_file`, or `source_dir` must be specified.
        """
        return pulumi.get(self, "source_content_filename")

    @property
    @pulumi.getter(name="sourceDir")
    def source_dir(self) -> Optional[builtins.str]:
        """
        Package entire contents of this directory into the archive. One and only one of `source`, `source_content_filename` (with `source_content`), `source_file`, or `source_dir` must be specified.
        """
        return pulumi.get(self, "source_dir")

    @property
    @pulumi.getter(name="sourceFile")
    def source_file(self) -> Optional[builtins.str]:
        """
        Package this file into the archive. One and only one of `source`, `source_content_filename` (with `source_content`), `source_file`, or `source_dir` must be specified.
        """
        return pulumi.get(self, "source_file")

    @property
    @pulumi.getter
    def sources(self) -> Optional[Sequence['outputs.GetFileSourceResult']]:
        """
        Specifies attributes of a single source file to include into the archive. One and only one of `source`, `source_content_filename` (with `source_content`), `source_file`, or `source_dir` must be specified.
        """
        return pulumi.get(self, "sources")

    @property
    @pulumi.getter
    def type(self) -> builtins.str:
        """
        The type of archive to generate. NOTE: `zip` and `tar.gz` is supported.
        """
        return pulumi.get(self, "type")


class AwaitableGetFileResult(GetFileResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetFileResult(
            exclude_symlink_directories=self.exclude_symlink_directories,
            excludes=self.excludes,
            id=self.id,
            output_base64sha256=self.output_base64sha256,
            output_base64sha512=self.output_base64sha512,
            output_file_mode=self.output_file_mode,
            output_md5=self.output_md5,
            output_path=self.output_path,
            output_sha=self.output_sha,
            output_sha256=self.output_sha256,
            output_sha512=self.output_sha512,
            output_size=self.output_size,
            source_content=self.source_content,
            source_content_filename=self.source_content_filename,
            source_dir=self.source_dir,
            source_file=self.source_file,
            sources=self.sources,
            type=self.type)


def get_file(exclude_symlink_directories: Optional[builtins.bool] = None,
             excludes: Optional[Sequence[builtins.str]] = None,
             output_file_mode: Optional[builtins.str] = None,
             output_path: Optional[builtins.str] = None,
             source_content: Optional[builtins.str] = None,
             source_content_filename: Optional[builtins.str] = None,
             source_dir: Optional[builtins.str] = None,
             source_file: Optional[builtins.str] = None,
             sources: Optional[Sequence[Union['GetFileSourceArgs', 'GetFileSourceArgsDict']]] = None,
             type: Optional[builtins.str] = None,
             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetFileResult:
    """
    Generates an archive from content, a file, or directory of files. The archive is built during the pulumi preview, so you must persist the archive through to the pulumi up. See the `File` resource for an alternative if you cannot persist the file, such as in a multi-phase CI or build server context.


    :param builtins.bool exclude_symlink_directories: Boolean flag indicating whether symbolically linked directories should be excluded during the creation of the archive. Defaults to `false`.
    :param Sequence[builtins.str] excludes: Specify files/directories to ignore when reading the `source_dir`. Supports glob file matching patterns including doublestar/globstar (`**`) patterns.
    :param builtins.str output_file_mode: String that specifies the octal file mode for all archived files. For example: `"0666"`. Setting this will ensure that cross platform usage of this module will not vary the modes of archived files (and ultimately checksums) resulting in more deterministic behavior.
    :param builtins.str output_path: The output of the archive file.
    :param builtins.str source_content: Add only this content to the archive with `source_content_filename` as the filename. One and only one of `source`, `source_content_filename` (with `source_content`), `source_file`, or `source_dir` must be specified.
    :param builtins.str source_content_filename: Set this as the filename when using `source_content`. One and only one of `source`, `source_content_filename` (with `source_content`), `source_file`, or `source_dir` must be specified.
    :param builtins.str source_dir: Package entire contents of this directory into the archive. One and only one of `source`, `source_content_filename` (with `source_content`), `source_file`, or `source_dir` must be specified.
    :param builtins.str source_file: Package this file into the archive. One and only one of `source`, `source_content_filename` (with `source_content`), `source_file`, or `source_dir` must be specified.
    :param Sequence[Union['GetFileSourceArgs', 'GetFileSourceArgsDict']] sources: Specifies attributes of a single source file to include into the archive. One and only one of `source`, `source_content_filename` (with `source_content`), `source_file`, or `source_dir` must be specified.
    :param builtins.str type: The type of archive to generate. NOTE: `zip` and `tar.gz` is supported.
    """
    __args__ = dict()
    __args__['excludeSymlinkDirectories'] = exclude_symlink_directories
    __args__['excludes'] = excludes
    __args__['outputFileMode'] = output_file_mode
    __args__['outputPath'] = output_path
    __args__['sourceContent'] = source_content
    __args__['sourceContentFilename'] = source_content_filename
    __args__['sourceDir'] = source_dir
    __args__['sourceFile'] = source_file
    __args__['sources'] = sources
    __args__['type'] = type
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('archive:index/getFile:getFile', __args__, opts=opts, typ=GetFileResult).value

    return AwaitableGetFileResult(
        exclude_symlink_directories=pulumi.get(__ret__, 'exclude_symlink_directories'),
        excludes=pulumi.get(__ret__, 'excludes'),
        id=pulumi.get(__ret__, 'id'),
        output_base64sha256=pulumi.get(__ret__, 'output_base64sha256'),
        output_base64sha512=pulumi.get(__ret__, 'output_base64sha512'),
        output_file_mode=pulumi.get(__ret__, 'output_file_mode'),
        output_md5=pulumi.get(__ret__, 'output_md5'),
        output_path=pulumi.get(__ret__, 'output_path'),
        output_sha=pulumi.get(__ret__, 'output_sha'),
        output_sha256=pulumi.get(__ret__, 'output_sha256'),
        output_sha512=pulumi.get(__ret__, 'output_sha512'),
        output_size=pulumi.get(__ret__, 'output_size'),
        source_content=pulumi.get(__ret__, 'source_content'),
        source_content_filename=pulumi.get(__ret__, 'source_content_filename'),
        source_dir=pulumi.get(__ret__, 'source_dir'),
        source_file=pulumi.get(__ret__, 'source_file'),
        sources=pulumi.get(__ret__, 'sources'),
        type=pulumi.get(__ret__, 'type'))
def get_file_output(exclude_symlink_directories: Optional[pulumi.Input[Optional[builtins.bool]]] = None,
                    excludes: Optional[pulumi.Input[Optional[Sequence[builtins.str]]]] = None,
                    output_file_mode: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                    output_path: Optional[pulumi.Input[builtins.str]] = None,
                    source_content: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                    source_content_filename: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                    source_dir: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                    source_file: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                    sources: Optional[pulumi.Input[Optional[Sequence[Union['GetFileSourceArgs', 'GetFileSourceArgsDict']]]]] = None,
                    type: Optional[pulumi.Input[builtins.str]] = None,
                    opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetFileResult]:
    """
    Generates an archive from content, a file, or directory of files. The archive is built during the pulumi preview, so you must persist the archive through to the pulumi up. See the `File` resource for an alternative if you cannot persist the file, such as in a multi-phase CI or build server context.


    :param builtins.bool exclude_symlink_directories: Boolean flag indicating whether symbolically linked directories should be excluded during the creation of the archive. Defaults to `false`.
    :param Sequence[builtins.str] excludes: Specify files/directories to ignore when reading the `source_dir`. Supports glob file matching patterns including doublestar/globstar (`**`) patterns.
    :param builtins.str output_file_mode: String that specifies the octal file mode for all archived files. For example: `"0666"`. Setting this will ensure that cross platform usage of this module will not vary the modes of archived files (and ultimately checksums) resulting in more deterministic behavior.
    :param builtins.str output_path: The output of the archive file.
    :param builtins.str source_content: Add only this content to the archive with `source_content_filename` as the filename. One and only one of `source`, `source_content_filename` (with `source_content`), `source_file`, or `source_dir` must be specified.
    :param builtins.str source_content_filename: Set this as the filename when using `source_content`. One and only one of `source`, `source_content_filename` (with `source_content`), `source_file`, or `source_dir` must be specified.
    :param builtins.str source_dir: Package entire contents of this directory into the archive. One and only one of `source`, `source_content_filename` (with `source_content`), `source_file`, or `source_dir` must be specified.
    :param builtins.str source_file: Package this file into the archive. One and only one of `source`, `source_content_filename` (with `source_content`), `source_file`, or `source_dir` must be specified.
    :param Sequence[Union['GetFileSourceArgs', 'GetFileSourceArgsDict']] sources: Specifies attributes of a single source file to include into the archive. One and only one of `source`, `source_content_filename` (with `source_content`), `source_file`, or `source_dir` must be specified.
    :param builtins.str type: The type of archive to generate. NOTE: `zip` and `tar.gz` is supported.
    """
    __args__ = dict()
    __args__['excludeSymlinkDirectories'] = exclude_symlink_directories
    __args__['excludes'] = excludes
    __args__['outputFileMode'] = output_file_mode
    __args__['outputPath'] = output_path
    __args__['sourceContent'] = source_content
    __args__['sourceContentFilename'] = source_content_filename
    __args__['sourceDir'] = source_dir
    __args__['sourceFile'] = source_file
    __args__['sources'] = sources
    __args__['type'] = type
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('archive:index/getFile:getFile', __args__, opts=opts, typ=GetFileResult)
    return __ret__.apply(lambda __response__: GetFileResult(
        exclude_symlink_directories=pulumi.get(__response__, 'exclude_symlink_directories'),
        excludes=pulumi.get(__response__, 'excludes'),
        id=pulumi.get(__response__, 'id'),
        output_base64sha256=pulumi.get(__response__, 'output_base64sha256'),
        output_base64sha512=pulumi.get(__response__, 'output_base64sha512'),
        output_file_mode=pulumi.get(__response__, 'output_file_mode'),
        output_md5=pulumi.get(__response__, 'output_md5'),
        output_path=pulumi.get(__response__, 'output_path'),
        output_sha=pulumi.get(__response__, 'output_sha'),
        output_sha256=pulumi.get(__response__, 'output_sha256'),
        output_sha512=pulumi.get(__response__, 'output_sha512'),
        output_size=pulumi.get(__response__, 'output_size'),
        source_content=pulumi.get(__response__, 'source_content'),
        source_content_filename=pulumi.get(__response__, 'source_content_filename'),
        source_dir=pulumi.get(__response__, 'source_dir'),
        source_file=pulumi.get(__response__, 'source_file'),
        sources=pulumi.get(__response__, 'sources'),
        type=pulumi.get(__response__, 'type')))
