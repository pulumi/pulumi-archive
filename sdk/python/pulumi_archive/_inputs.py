# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
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

__all__ = [
    'FileSourceArgs',
    'FileSourceArgsDict',
    'GetFileSourceArgs',
    'GetFileSourceArgsDict',
]

MYPY = False

if not MYPY:
    class FileSourceArgsDict(TypedDict):
        content: pulumi.Input[builtins.str]
        """
        Add this content to the archive with `filename` as the filename.
        """
        filename: pulumi.Input[builtins.str]
        """
        Set this as the filename when declaring a `source`.
        """
elif False:
    FileSourceArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class FileSourceArgs:
    def __init__(__self__, *,
                 content: pulumi.Input[builtins.str],
                 filename: pulumi.Input[builtins.str]):
        """
        :param pulumi.Input[builtins.str] content: Add this content to the archive with `filename` as the filename.
        :param pulumi.Input[builtins.str] filename: Set this as the filename when declaring a `source`.
        """
        pulumi.set(__self__, "content", content)
        pulumi.set(__self__, "filename", filename)

    @property
    @pulumi.getter
    def content(self) -> pulumi.Input[builtins.str]:
        """
        Add this content to the archive with `filename` as the filename.
        """
        return pulumi.get(self, "content")

    @content.setter
    def content(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "content", value)

    @property
    @pulumi.getter
    def filename(self) -> pulumi.Input[builtins.str]:
        """
        Set this as the filename when declaring a `source`.
        """
        return pulumi.get(self, "filename")

    @filename.setter
    def filename(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "filename", value)


if not MYPY:
    class GetFileSourceArgsDict(TypedDict):
        content: builtins.str
        """
        Add this content to the archive with `filename` as the filename.
        """
        filename: builtins.str
        """
        Set this as the filename when declaring a `source`.
        """
elif False:
    GetFileSourceArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class GetFileSourceArgs:
    def __init__(__self__, *,
                 content: builtins.str,
                 filename: builtins.str):
        """
        :param builtins.str content: Add this content to the archive with `filename` as the filename.
        :param builtins.str filename: Set this as the filename when declaring a `source`.
        """
        pulumi.set(__self__, "content", content)
        pulumi.set(__self__, "filename", filename)

    @property
    @pulumi.getter
    def content(self) -> builtins.str:
        """
        Add this content to the archive with `filename` as the filename.
        """
        return pulumi.get(self, "content")

    @content.setter
    def content(self, value: builtins.str):
        pulumi.set(self, "content", value)

    @property
    @pulumi.getter
    def filename(self) -> builtins.str:
        """
        Set this as the filename when declaring a `source`.
        """
        return pulumi.get(self, "filename")

    @filename.setter
    def filename(self, value: builtins.str):
        pulumi.set(self, "filename", value)


