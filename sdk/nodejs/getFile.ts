// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Generates an archive from content, a file, or directory of files.
 */
export function getFile(args: GetFileArgs, opts?: pulumi.InvokeOptions): Promise<GetFileResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("archive:index/getFile:getFile", {
        "excludeSymlinkDirectories": args.excludeSymlinkDirectories,
        "excludes": args.excludes,
        "outputFileMode": args.outputFileMode,
        "outputPath": args.outputPath,
        "sourceContent": args.sourceContent,
        "sourceContentFilename": args.sourceContentFilename,
        "sourceDir": args.sourceDir,
        "sourceFile": args.sourceFile,
        "sources": args.sources,
        "type": args.type,
    }, opts);
}

/**
 * A collection of arguments for invoking getFile.
 */
export interface GetFileArgs {
    /**
     * Boolean flag indicating whether symbolically linked directories should be excluded during the creation of the archive. Defaults to `false`.
     */
    excludeSymlinkDirectories?: boolean;
    /**
     * Specify files to ignore when reading the `sourceDir`.
     */
    excludes?: string[];
    /**
     * String that specifies the octal file mode for all archived files. For example: `"0666"`. Setting this will ensure that cross platform usage of this module will not vary the modes of archived files (and ultimately checksums) resulting in more deterministic behavior.
     */
    outputFileMode?: string;
    /**
     * The output of the archive file.
     */
    outputPath: string;
    /**
     * Add only this content to the archive with `sourceContentFilename` as the filename. One and only one of `source`, `sourceContentFilename` (with `sourceContent`), `sourceFile`, or `sourceDir` must be specified.
     */
    sourceContent?: string;
    /**
     * Set this as the filename when using `sourceContent`. One and only one of `source`, `sourceContentFilename` (with `sourceContent`), `sourceFile`, or `sourceDir` must be specified.
     */
    sourceContentFilename?: string;
    /**
     * Package entire contents of this directory into the archive. One and only one of `source`, `sourceContentFilename` (with `sourceContent`), `sourceFile`, or `sourceDir` must be specified.
     */
    sourceDir?: string;
    /**
     * Package this file into the archive. One and only one of `source`, `sourceContentFilename` (with `sourceContent`), `sourceFile`, or `sourceDir` must be specified.
     */
    sourceFile?: string;
    /**
     * Specifies attributes of a single source file to include into the archive. One and only one of `source`, `sourceContentFilename` (with `sourceContent`), `sourceFile`, or `sourceDir` must be specified.
     */
    sources?: inputs.GetFileSource[];
    /**
     * The type of archive to generate. NOTE: `zip` is supported.
     */
    type: string;
}

/**
 * A collection of values returned by getFile.
 */
export interface GetFileResult {
    /**
     * Boolean flag indicating whether symbolically linked directories should be excluded during the creation of the archive. Defaults to `false`.
     */
    readonly excludeSymlinkDirectories?: boolean;
    /**
     * Specify files to ignore when reading the `sourceDir`.
     */
    readonly excludes?: string[];
    /**
     * The sha1 checksum hash of the output.
     */
    readonly id: string;
    /**
     * Base64 Encoded SHA256 checksum of output file
     */
    readonly outputBase64sha256: string;
    /**
     * Base64 Encoded SHA512 checksum of output file
     */
    readonly outputBase64sha512: string;
    /**
     * String that specifies the octal file mode for all archived files. For example: `"0666"`. Setting this will ensure that cross platform usage of this module will not vary the modes of archived files (and ultimately checksums) resulting in more deterministic behavior.
     */
    readonly outputFileMode?: string;
    /**
     * MD5 of output file
     */
    readonly outputMd5: string;
    /**
     * The output of the archive file.
     */
    readonly outputPath: string;
    /**
     * SHA1 checksum of output file
     */
    readonly outputSha: string;
    /**
     * SHA256 checksum of output file
     */
    readonly outputSha256: string;
    /**
     * SHA512 checksum of output file
     */
    readonly outputSha512: string;
    /**
     * The byte size of the output archive file.
     */
    readonly outputSize: number;
    /**
     * Add only this content to the archive with `sourceContentFilename` as the filename. One and only one of `source`, `sourceContentFilename` (with `sourceContent`), `sourceFile`, or `sourceDir` must be specified.
     */
    readonly sourceContent?: string;
    /**
     * Set this as the filename when using `sourceContent`. One and only one of `source`, `sourceContentFilename` (with `sourceContent`), `sourceFile`, or `sourceDir` must be specified.
     */
    readonly sourceContentFilename?: string;
    /**
     * Package entire contents of this directory into the archive. One and only one of `source`, `sourceContentFilename` (with `sourceContent`), `sourceFile`, or `sourceDir` must be specified.
     */
    readonly sourceDir?: string;
    /**
     * Package this file into the archive. One and only one of `source`, `sourceContentFilename` (with `sourceContent`), `sourceFile`, or `sourceDir` must be specified.
     */
    readonly sourceFile?: string;
    /**
     * Specifies attributes of a single source file to include into the archive. One and only one of `source`, `sourceContentFilename` (with `sourceContent`), `sourceFile`, or `sourceDir` must be specified.
     */
    readonly sources?: outputs.GetFileSource[];
    /**
     * The type of archive to generate. NOTE: `zip` is supported.
     */
    readonly type: string;
}
/**
 * Generates an archive from content, a file, or directory of files.
 */
export function getFileOutput(args: GetFileOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetFileResult> {
    return pulumi.output(args).apply((a: any) => getFile(a, opts))
}

/**
 * A collection of arguments for invoking getFile.
 */
export interface GetFileOutputArgs {
    /**
     * Boolean flag indicating whether symbolically linked directories should be excluded during the creation of the archive. Defaults to `false`.
     */
    excludeSymlinkDirectories?: pulumi.Input<boolean>;
    /**
     * Specify files to ignore when reading the `sourceDir`.
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
    sources?: pulumi.Input<pulumi.Input<inputs.GetFileSourceArgs>[]>;
    /**
     * The type of archive to generate. NOTE: `zip` is supported.
     */
    type: pulumi.Input<string>;
}
