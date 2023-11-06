# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'FileSourceArgs',
    'GetFileSourceArgs',
]

@pulumi.input_type
class FileSourceArgs:
    def __init__(__self__, *,
                 content: pulumi.Input[str],
                 filename: pulumi.Input[str]):
        """
        :param pulumi.Input[str] content: Add this content to the archive with `filename` as the filename.
        :param pulumi.Input[str] filename: Set this as the filename when declaring a `source`.
        """
        FileSourceArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            content=content,
            filename=filename,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             content: Optional[pulumi.Input[str]] = None,
             filename: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if content is None:
            raise TypeError("Missing 'content' argument")
        if filename is None:
            raise TypeError("Missing 'filename' argument")

        _setter("content", content)
        _setter("filename", filename)

    @property
    @pulumi.getter
    def content(self) -> pulumi.Input[str]:
        """
        Add this content to the archive with `filename` as the filename.
        """
        return pulumi.get(self, "content")

    @content.setter
    def content(self, value: pulumi.Input[str]):
        pulumi.set(self, "content", value)

    @property
    @pulumi.getter
    def filename(self) -> pulumi.Input[str]:
        """
        Set this as the filename when declaring a `source`.
        """
        return pulumi.get(self, "filename")

    @filename.setter
    def filename(self, value: pulumi.Input[str]):
        pulumi.set(self, "filename", value)


@pulumi.input_type
class GetFileSourceArgs:
    def __init__(__self__, *,
                 content: str,
                 filename: str):
        """
        :param str content: Add this content to the archive with `filename` as the filename.
        :param str filename: Set this as the filename when declaring a `source`.
        """
        GetFileSourceArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            content=content,
            filename=filename,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             content: Optional[str] = None,
             filename: Optional[str] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if content is None:
            raise TypeError("Missing 'content' argument")
        if filename is None:
            raise TypeError("Missing 'filename' argument")

        _setter("content", content)
        _setter("filename", filename)

    @property
    @pulumi.getter
    def content(self) -> str:
        """
        Add this content to the archive with `filename` as the filename.
        """
        return pulumi.get(self, "content")

    @content.setter
    def content(self, value: str):
        pulumi.set(self, "content", value)

    @property
    @pulumi.getter
    def filename(self) -> str:
        """
        Set this as the filename when declaring a `source`.
        """
        return pulumi.get(self, "filename")

    @filename.setter
    def filename(self, value: str):
        pulumi.set(self, "filename", value)


