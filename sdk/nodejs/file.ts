// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * **NOTE**: This resource is deprecated, use data source instead.
 */
export class File extends pulumi.CustomResource {
    /**
     * Get an existing File resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: FileState, opts?: pulumi.CustomResourceOptions): File {
        return new File(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'archive:index/file:File';

    /**
     * Returns true if the given object is an instance of File.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is File {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === File.__pulumiType;
    }

    /**
     * Boolean flag indicating whether symbolically linked directories should be excluded during the creation of the archive. Defaults to `false`.
     */
    public readonly excludeSymlinkDirectories!: pulumi.Output<boolean | undefined>;
    /**
     * Specify files/directories to ignore when reading the `sourceDir`. Supports glob file matching patterns including doublestar/globstar (`**`) patterns.
     */
    public readonly excludes!: pulumi.Output<string[] | undefined>;
    /**
     * Base64 Encoded SHA256 checksum of output file
     */
    public /*out*/ readonly outputBase64sha256!: pulumi.Output<string>;
    /**
     * Base64 Encoded SHA512 checksum of output file
     */
    public /*out*/ readonly outputBase64sha512!: pulumi.Output<string>;
    /**
     * String that specifies the octal file mode for all archived files. For example: `"0666"`. Setting this will ensure that cross platform usage of this module will not vary the modes of archived files (and ultimately checksums) resulting in more deterministic behavior.
     */
    public readonly outputFileMode!: pulumi.Output<string | undefined>;
    /**
     * MD5 of output file
     */
    public /*out*/ readonly outputMd5!: pulumi.Output<string>;
    /**
     * The output of the archive file.
     */
    public readonly outputPath!: pulumi.Output<string>;
    /**
     * SHA1 checksum of output file
     */
    public /*out*/ readonly outputSha!: pulumi.Output<string>;
    /**
     * SHA256 checksum of output file
     */
    public /*out*/ readonly outputSha256!: pulumi.Output<string>;
    /**
     * SHA512 checksum of output file
     */
    public /*out*/ readonly outputSha512!: pulumi.Output<string>;
    /**
     * The byte size of the output archive file.
     */
    public /*out*/ readonly outputSize!: pulumi.Output<number>;
    /**
     * Add only this content to the archive with `sourceContentFilename` as the filename. One and only one of `source`, `sourceContentFilename` (with `sourceContent`), `sourceFile`, or `sourceDir` must be specified.
     */
    public readonly sourceContent!: pulumi.Output<string | undefined>;
    /**
     * Set this as the filename when using `sourceContent`. One and only one of `source`, `sourceContentFilename` (with `sourceContent`), `sourceFile`, or `sourceDir` must be specified.
     */
    public readonly sourceContentFilename!: pulumi.Output<string | undefined>;
    /**
     * Package entire contents of this directory into the archive. One and only one of `source`, `sourceContentFilename` (with `sourceContent`), `sourceFile`, or `sourceDir` must be specified.
     */
    public readonly sourceDir!: pulumi.Output<string | undefined>;
    /**
     * Package this file into the archive. One and only one of `source`, `sourceContentFilename` (with `sourceContent`), `sourceFile`, or `sourceDir` must be specified.
     */
    public readonly sourceFile!: pulumi.Output<string | undefined>;
    /**
     * Specifies attributes of a single source file to include into the archive. One and only one of `source`, `sourceContentFilename` (with `sourceContent`), `sourceFile`, or `sourceDir` must be specified.
     */
    public readonly sources!: pulumi.Output<outputs.FileSource[] | undefined>;
    /**
     * The type of archive to generate. NOTE: `zip` and `tar.gz` is supported.
     */
    public readonly type!: pulumi.Output<string>;

    /**
     * Create a File resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: FileArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: FileArgs | FileState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as FileState | undefined;
            resourceInputs["excludeSymlinkDirectories"] = state ? state.excludeSymlinkDirectories : undefined;
            resourceInputs["excludes"] = state ? state.excludes : undefined;
            resourceInputs["outputBase64sha256"] = state ? state.outputBase64sha256 : undefined;
            resourceInputs["outputBase64sha512"] = state ? state.outputBase64sha512 : undefined;
            resourceInputs["outputFileMode"] = state ? state.outputFileMode : undefined;
            resourceInputs["outputMd5"] = state ? state.outputMd5 : undefined;
            resourceInputs["outputPath"] = state ? state.outputPath : undefined;
            resourceInputs["outputSha"] = state ? state.outputSha : undefined;
            resourceInputs["outputSha256"] = state ? state.outputSha256 : undefined;
            resourceInputs["outputSha512"] = state ? state.outputSha512 : undefined;
            resourceInputs["outputSize"] = state ? state.outputSize : undefined;
            resourceInputs["sourceContent"] = state ? state.sourceContent : undefined;
            resourceInputs["sourceContentFilename"] = state ? state.sourceContentFilename : undefined;
            resourceInputs["sourceDir"] = state ? state.sourceDir : undefined;
            resourceInputs["sourceFile"] = state ? state.sourceFile : undefined;
            resourceInputs["sources"] = state ? state.sources : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as FileArgs | undefined;
            if ((!args || args.outputPath === undefined) && !opts.urn) {
                throw new Error("Missing required property 'outputPath'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            resourceInputs["excludeSymlinkDirectories"] = args ? args.excludeSymlinkDirectories : undefined;
            resourceInputs["excludes"] = args ? args.excludes : undefined;
            resourceInputs["outputFileMode"] = args ? args.outputFileMode : undefined;
            resourceInputs["outputPath"] = args ? args.outputPath : undefined;
            resourceInputs["sourceContent"] = args ? args.sourceContent : undefined;
            resourceInputs["sourceContentFilename"] = args ? args.sourceContentFilename : undefined;
            resourceInputs["sourceDir"] = args ? args.sourceDir : undefined;
            resourceInputs["sourceFile"] = args ? args.sourceFile : undefined;
            resourceInputs["sources"] = args ? args.sources : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["outputBase64sha256"] = undefined /*out*/;
            resourceInputs["outputBase64sha512"] = undefined /*out*/;
            resourceInputs["outputMd5"] = undefined /*out*/;
            resourceInputs["outputSha"] = undefined /*out*/;
            resourceInputs["outputSha256"] = undefined /*out*/;
            resourceInputs["outputSha512"] = undefined /*out*/;
            resourceInputs["outputSize"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(File.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering File resources.
 */
export interface FileState {
    /**
     * Boolean flag indicating whether symbolically linked directories should be excluded during the creation of the archive. Defaults to `false`.
     */
    excludeSymlinkDirectories?: pulumi.Input<boolean>;
    /**
     * Specify files/directories to ignore when reading the `sourceDir`. Supports glob file matching patterns including doublestar/globstar (`**`) patterns.
     */
    excludes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Base64 Encoded SHA256 checksum of output file
     */
    outputBase64sha256?: pulumi.Input<string>;
    /**
     * Base64 Encoded SHA512 checksum of output file
     */
    outputBase64sha512?: pulumi.Input<string>;
    /**
     * String that specifies the octal file mode for all archived files. For example: `"0666"`. Setting this will ensure that cross platform usage of this module will not vary the modes of archived files (and ultimately checksums) resulting in more deterministic behavior.
     */
    outputFileMode?: pulumi.Input<string>;
    /**
     * MD5 of output file
     */
    outputMd5?: pulumi.Input<string>;
    /**
     * The output of the archive file.
     */
    outputPath?: pulumi.Input<string>;
    /**
     * SHA1 checksum of output file
     */
    outputSha?: pulumi.Input<string>;
    /**
     * SHA256 checksum of output file
     */
    outputSha256?: pulumi.Input<string>;
    /**
     * SHA512 checksum of output file
     */
    outputSha512?: pulumi.Input<string>;
    /**
     * The byte size of the output archive file.
     */
    outputSize?: pulumi.Input<number>;
    /**
     * Add only this content to the archive with `sourceContentFilename` as the filename. One and only one of `source`, `sourceContentFilename` (with `sourceContent`), `sourceFile`, or `sourceDir` must be specified.
     */
    sourceContent?: pulumi.Input<string>;
    /**
     * Set this as the filename when using `sourceContent`. One and only one of `source`, `sourceContentFilename` (with `sourceContent`), `sourceFile`, or `sourceDir` must be specified.
     */
    sourceContentFilename?: pulumi.Input<string>;
    /**
     * Package entire contents of this directory into the archive. One and only one of `source`, `sourceContentFilename` (with `sourceContent`), `sourceFile`, or `sourceDir` must be specified.
     */
    sourceDir?: pulumi.Input<string>;
    /**
     * Package this file into the archive. One and only one of `source`, `sourceContentFilename` (with `sourceContent`), `sourceFile`, or `sourceDir` must be specified.
     */
    sourceFile?: pulumi.Input<string>;
    /**
     * Specifies attributes of a single source file to include into the archive. One and only one of `source`, `sourceContentFilename` (with `sourceContent`), `sourceFile`, or `sourceDir` must be specified.
     */
    sources?: pulumi.Input<pulumi.Input<inputs.FileSource>[]>;
    /**
     * The type of archive to generate. NOTE: `zip` and `tar.gz` is supported.
     */
    type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a File resource.
 */
export interface FileArgs {
    /**
     * Boolean flag indicating whether symbolically linked directories should be excluded during the creation of the archive. Defaults to `false`.
     */
    excludeSymlinkDirectories?: pulumi.Input<boolean>;
    /**
     * Specify files/directories to ignore when reading the `sourceDir`. Supports glob file matching patterns including doublestar/globstar (`**`) patterns.
     */
    excludes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * String that specifies the octal file mode for all archived files. For example: `"0666"`. Setting this will ensure that cross platform usage of this module will not vary the modes of archived files (and ultimately checksums) resulting in more deterministic behavior.
     */
    outputFileMode?: pulumi.Input<string>;
    /**
     * The output of the archive file.
     */
    outputPath: pulumi.Input<string>;
    /**
     * Add only this content to the archive with `sourceContentFilename` as the filename. One and only one of `source`, `sourceContentFilename` (with `sourceContent`), `sourceFile`, or `sourceDir` must be specified.
     */
    sourceContent?: pulumi.Input<string>;
    /**
     * Set this as the filename when using `sourceContent`. One and only one of `source`, `sourceContentFilename` (with `sourceContent`), `sourceFile`, or `sourceDir` must be specified.
     */
    sourceContentFilename?: pulumi.Input<string>;
    /**
     * Package entire contents of this directory into the archive. One and only one of `source`, `sourceContentFilename` (with `sourceContent`), `sourceFile`, or `sourceDir` must be specified.
     */
    sourceDir?: pulumi.Input<string>;
    /**
     * Package this file into the archive. One and only one of `source`, `sourceContentFilename` (with `sourceContent`), `sourceFile`, or `sourceDir` must be specified.
     */
    sourceFile?: pulumi.Input<string>;
    /**
     * Specifies attributes of a single source file to include into the archive. One and only one of `source`, `sourceContentFilename` (with `sourceContent`), `sourceFile`, or `sourceDir` must be specified.
     */
    sources?: pulumi.Input<pulumi.Input<inputs.FileSource>[]>;
    /**
     * The type of archive to generate. NOTE: `zip` and `tar.gz` is supported.
     */
    type: pulumi.Input<string>;
}
