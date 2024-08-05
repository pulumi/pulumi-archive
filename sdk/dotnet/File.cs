// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Archive
{
    /// <summary>
    /// **NOTE**: This resource is deprecated, use data source instead.
    /// </summary>
    [ArchiveResourceType("archive:index/file:File")]
    public partial class File : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Boolean flag indicating whether symbolically linked directories should be excluded during the creation of the archive. Defaults to `false`.
        /// </summary>
        [Output("excludeSymlinkDirectories")]
        public Output<bool?> ExcludeSymlinkDirectories { get; private set; } = null!;

        /// <summary>
        /// Specify files/directories to ignore when reading the `source_dir`. Supports glob file matching patterns including doublestar/globstar (`**`) patterns.
        /// </summary>
        [Output("excludes")]
        public Output<ImmutableArray<string>> Excludes { get; private set; } = null!;

        /// <summary>
        /// Base64 Encoded SHA256 checksum of output file
        /// </summary>
        [Output("outputBase64sha256")]
        public Output<string> OutputBase64sha256 { get; private set; } = null!;

        /// <summary>
        /// Base64 Encoded SHA512 checksum of output file
        /// </summary>
        [Output("outputBase64sha512")]
        public Output<string> OutputBase64sha512 { get; private set; } = null!;

        /// <summary>
        /// String that specifies the octal file mode for all archived files. For example: `"0666"`. Setting this will ensure that cross platform usage of this module will not vary the modes of archived files (and ultimately checksums) resulting in more deterministic behavior.
        /// </summary>
        [Output("outputFileMode")]
        public Output<string?> OutputFileMode { get; private set; } = null!;

        /// <summary>
        /// MD5 of output file
        /// </summary>
        [Output("outputMd5")]
        public Output<string> OutputMd5 { get; private set; } = null!;

        /// <summary>
        /// The output of the archive file.
        /// </summary>
        [Output("outputPath")]
        public Output<string> OutputPath { get; private set; } = null!;

        /// <summary>
        /// SHA1 checksum of output file
        /// </summary>
        [Output("outputSha")]
        public Output<string> OutputSha { get; private set; } = null!;

        /// <summary>
        /// SHA256 checksum of output file
        /// </summary>
        [Output("outputSha256")]
        public Output<string> OutputSha256 { get; private set; } = null!;

        /// <summary>
        /// SHA512 checksum of output file
        /// </summary>
        [Output("outputSha512")]
        public Output<string> OutputSha512 { get; private set; } = null!;

        /// <summary>
        /// The byte size of the output archive file.
        /// </summary>
        [Output("outputSize")]
        public Output<int> OutputSize { get; private set; } = null!;

        /// <summary>
        /// Add only this content to the archive with `source_content_filename` as the filename. One and only one of `source`, `source_content_filename` (with `source_content`), `source_file`, or `source_dir` must be specified.
        /// </summary>
        [Output("sourceContent")]
        public Output<string?> SourceContent { get; private set; } = null!;

        /// <summary>
        /// Set this as the filename when using `source_content`. One and only one of `source`, `source_content_filename` (with `source_content`), `source_file`, or `source_dir` must be specified.
        /// </summary>
        [Output("sourceContentFilename")]
        public Output<string?> SourceContentFilename { get; private set; } = null!;

        /// <summary>
        /// Package entire contents of this directory into the archive. One and only one of `source`, `source_content_filename` (with `source_content`), `source_file`, or `source_dir` must be specified.
        /// </summary>
        [Output("sourceDir")]
        public Output<string?> SourceDir { get; private set; } = null!;

        /// <summary>
        /// Package this file into the archive. One and only one of `source`, `source_content_filename` (with `source_content`), `source_file`, or `source_dir` must be specified.
        /// </summary>
        [Output("sourceFile")]
        public Output<string?> SourceFile { get; private set; } = null!;

        /// <summary>
        /// Specifies attributes of a single source file to include into the archive. One and only one of `source`, `source_content_filename` (with `source_content`), `source_file`, or `source_dir` must be specified.
        /// </summary>
        [Output("sources")]
        public Output<ImmutableArray<Outputs.FileSource>> Sources { get; private set; } = null!;

        /// <summary>
        /// The type of archive to generate. NOTE: `zip` is supported.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;


        /// <summary>
        /// Create a File resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public File(string name, FileArgs args, CustomResourceOptions? options = null)
            : base("archive:index/file:File", name, args ?? new FileArgs(), MakeResourceOptions(options, ""))
        {
        }

        private File(string name, Input<string> id, FileState? state = null, CustomResourceOptions? options = null)
            : base("archive:index/file:File", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing File resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static File Get(string name, Input<string> id, FileState? state = null, CustomResourceOptions? options = null)
        {
            return new File(name, id, state, options);
        }
    }

    public sealed class FileArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Boolean flag indicating whether symbolically linked directories should be excluded during the creation of the archive. Defaults to `false`.
        /// </summary>
        [Input("excludeSymlinkDirectories")]
        public Input<bool>? ExcludeSymlinkDirectories { get; set; }

        [Input("excludes")]
        private InputList<string>? _excludes;

        /// <summary>
        /// Specify files/directories to ignore when reading the `source_dir`. Supports glob file matching patterns including doublestar/globstar (`**`) patterns.
        /// </summary>
        public InputList<string> Excludes
        {
            get => _excludes ?? (_excludes = new InputList<string>());
            set => _excludes = value;
        }

        /// <summary>
        /// String that specifies the octal file mode for all archived files. For example: `"0666"`. Setting this will ensure that cross platform usage of this module will not vary the modes of archived files (and ultimately checksums) resulting in more deterministic behavior.
        /// </summary>
        [Input("outputFileMode")]
        public Input<string>? OutputFileMode { get; set; }

        /// <summary>
        /// The output of the archive file.
        /// </summary>
        [Input("outputPath", required: true)]
        public Input<string> OutputPath { get; set; } = null!;

        /// <summary>
        /// Add only this content to the archive with `source_content_filename` as the filename. One and only one of `source`, `source_content_filename` (with `source_content`), `source_file`, or `source_dir` must be specified.
        /// </summary>
        [Input("sourceContent")]
        public Input<string>? SourceContent { get; set; }

        /// <summary>
        /// Set this as the filename when using `source_content`. One and only one of `source`, `source_content_filename` (with `source_content`), `source_file`, or `source_dir` must be specified.
        /// </summary>
        [Input("sourceContentFilename")]
        public Input<string>? SourceContentFilename { get; set; }

        /// <summary>
        /// Package entire contents of this directory into the archive. One and only one of `source`, `source_content_filename` (with `source_content`), `source_file`, or `source_dir` must be specified.
        /// </summary>
        [Input("sourceDir")]
        public Input<string>? SourceDir { get; set; }

        /// <summary>
        /// Package this file into the archive. One and only one of `source`, `source_content_filename` (with `source_content`), `source_file`, or `source_dir` must be specified.
        /// </summary>
        [Input("sourceFile")]
        public Input<string>? SourceFile { get; set; }

        [Input("sources")]
        private InputList<Inputs.FileSourceArgs>? _sources;

        /// <summary>
        /// Specifies attributes of a single source file to include into the archive. One and only one of `source`, `source_content_filename` (with `source_content`), `source_file`, or `source_dir` must be specified.
        /// </summary>
        public InputList<Inputs.FileSourceArgs> Sources
        {
            get => _sources ?? (_sources = new InputList<Inputs.FileSourceArgs>());
            set => _sources = value;
        }

        /// <summary>
        /// The type of archive to generate. NOTE: `zip` is supported.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public FileArgs()
        {
        }
        public static new FileArgs Empty => new FileArgs();
    }

    public sealed class FileState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Boolean flag indicating whether symbolically linked directories should be excluded during the creation of the archive. Defaults to `false`.
        /// </summary>
        [Input("excludeSymlinkDirectories")]
        public Input<bool>? ExcludeSymlinkDirectories { get; set; }

        [Input("excludes")]
        private InputList<string>? _excludes;

        /// <summary>
        /// Specify files/directories to ignore when reading the `source_dir`. Supports glob file matching patterns including doublestar/globstar (`**`) patterns.
        /// </summary>
        public InputList<string> Excludes
        {
            get => _excludes ?? (_excludes = new InputList<string>());
            set => _excludes = value;
        }

        /// <summary>
        /// Base64 Encoded SHA256 checksum of output file
        /// </summary>
        [Input("outputBase64sha256")]
        public Input<string>? OutputBase64sha256 { get; set; }

        /// <summary>
        /// Base64 Encoded SHA512 checksum of output file
        /// </summary>
        [Input("outputBase64sha512")]
        public Input<string>? OutputBase64sha512 { get; set; }

        /// <summary>
        /// String that specifies the octal file mode for all archived files. For example: `"0666"`. Setting this will ensure that cross platform usage of this module will not vary the modes of archived files (and ultimately checksums) resulting in more deterministic behavior.
        /// </summary>
        [Input("outputFileMode")]
        public Input<string>? OutputFileMode { get; set; }

        /// <summary>
        /// MD5 of output file
        /// </summary>
        [Input("outputMd5")]
        public Input<string>? OutputMd5 { get; set; }

        /// <summary>
        /// The output of the archive file.
        /// </summary>
        [Input("outputPath")]
        public Input<string>? OutputPath { get; set; }

        /// <summary>
        /// SHA1 checksum of output file
        /// </summary>
        [Input("outputSha")]
        public Input<string>? OutputSha { get; set; }

        /// <summary>
        /// SHA256 checksum of output file
        /// </summary>
        [Input("outputSha256")]
        public Input<string>? OutputSha256 { get; set; }

        /// <summary>
        /// SHA512 checksum of output file
        /// </summary>
        [Input("outputSha512")]
        public Input<string>? OutputSha512 { get; set; }

        /// <summary>
        /// The byte size of the output archive file.
        /// </summary>
        [Input("outputSize")]
        public Input<int>? OutputSize { get; set; }

        /// <summary>
        /// Add only this content to the archive with `source_content_filename` as the filename. One and only one of `source`, `source_content_filename` (with `source_content`), `source_file`, or `source_dir` must be specified.
        /// </summary>
        [Input("sourceContent")]
        public Input<string>? SourceContent { get; set; }

        /// <summary>
        /// Set this as the filename when using `source_content`. One and only one of `source`, `source_content_filename` (with `source_content`), `source_file`, or `source_dir` must be specified.
        /// </summary>
        [Input("sourceContentFilename")]
        public Input<string>? SourceContentFilename { get; set; }

        /// <summary>
        /// Package entire contents of this directory into the archive. One and only one of `source`, `source_content_filename` (with `source_content`), `source_file`, or `source_dir` must be specified.
        /// </summary>
        [Input("sourceDir")]
        public Input<string>? SourceDir { get; set; }

        /// <summary>
        /// Package this file into the archive. One and only one of `source`, `source_content_filename` (with `source_content`), `source_file`, or `source_dir` must be specified.
        /// </summary>
        [Input("sourceFile")]
        public Input<string>? SourceFile { get; set; }

        [Input("sources")]
        private InputList<Inputs.FileSourceGetArgs>? _sources;

        /// <summary>
        /// Specifies attributes of a single source file to include into the archive. One and only one of `source`, `source_content_filename` (with `source_content`), `source_file`, or `source_dir` must be specified.
        /// </summary>
        public InputList<Inputs.FileSourceGetArgs> Sources
        {
            get => _sources ?? (_sources = new InputList<Inputs.FileSourceGetArgs>());
            set => _sources = value;
        }

        /// <summary>
        /// The type of archive to generate. NOTE: `zip` is supported.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public FileState()
        {
        }
        public static new FileState Empty => new FileState();
    }
}
