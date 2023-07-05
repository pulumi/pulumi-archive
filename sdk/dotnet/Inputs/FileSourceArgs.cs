// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Archive.Inputs
{

    public sealed class FileSourceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Add this content to the archive with `filename` as the filename.
        /// </summary>
        [Input("content", required: true)]
        public Input<string> Content { get; set; } = null!;

        /// <summary>
        /// Set this as the filename when declaring a `source`.
        /// </summary>
        [Input("filename", required: true)]
        public Input<string> Filename { get; set; } = null!;

        public FileSourceArgs()
        {
        }
        public static new FileSourceArgs Empty => new FileSourceArgs();
    }
}