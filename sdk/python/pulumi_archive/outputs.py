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
    'FileSource',
    'GetFileSourceResult',
]

@pulumi.output_type
class FileSource(dict):
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

    @property
    @pulumi.getter
    def filename(self) -> builtins.str:
        """
        Set this as the filename when declaring a `source`.
        """
        return pulumi.get(self, "filename")


@pulumi.output_type
class GetFileSourceResult(dict):
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

    @property
    @pulumi.getter
    def filename(self) -> builtins.str:
        """
        Set this as the filename when declaring a `source`.
        """
        return pulumi.get(self, "filename")


