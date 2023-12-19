// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package archive

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-archive/sdk/go/archive/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Generates an archive from content, a file, or directory of files.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-archive/sdk/go/archive"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := archive.LookupFile(ctx, &archive.LookupFileArgs{
//				OutputPath: fmt.Sprintf("%v/files/init.zip", path.Module),
//				SourceFile: pulumi.StringRef(fmt.Sprintf("%v/init.tpl", path.Module)),
//				Type:       "zip",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-archive/sdk/go/archive"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := archive.LookupFile(ctx, &archive.LookupFileArgs{
//				Type:       "zip",
//				OutputPath: fmt.Sprintf("%v/files/dotfiles.zip", path.Module),
//				Excludes: []string{
//					fmt.Sprintf("%v/unwanted.zip", path.Module),
//				},
//				Sources: []archive.GetFileSource{
//					{
//						Content:  data.Template_file.Vimrc.Rendered,
//						Filename: ".vimrc",
//					},
//					{
//						Content:  data.Template_file.Ssh_config.Rendered,
//						Filename: ".ssh/config",
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-archive/sdk/go/archive"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := archive.LookupFile(ctx, &archive.LookupFileArgs{
//				OutputFileMode: pulumi.StringRef("0666"),
//				OutputPath:     fmt.Sprintf("%v/files/lambda-my-function.js.zip", path.Module),
//				SourceFile:     pulumi.StringRef(fmt.Sprintf("%v/../lambda/my-function/index.js", path.Module)),
//				Type:           "zip",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupFile(ctx *pulumi.Context, args *LookupFileArgs, opts ...pulumi.InvokeOption) (*LookupFileResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupFileResult
	err := ctx.Invoke("archive:index/getFile:getFile", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getFile.
type LookupFileArgs struct {
	// Boolean flag indicating whether symbolically linked directories should be excluded during the creation of the archive. Defaults to `false`.
	ExcludeSymlinkDirectories *bool `pulumi:"excludeSymlinkDirectories"`
	// Specify files to ignore when reading the `sourceDir`.
	Excludes []string `pulumi:"excludes"`
	// String that specifies the octal file mode for all archived files. For example: `"0666"`. Setting this will ensure that cross platform usage of this module will not vary the modes of archived files (and ultimately checksums) resulting in more deterministic behavior.
	OutputFileMode *string `pulumi:"outputFileMode"`
	// The output of the archive file.
	OutputPath string `pulumi:"outputPath"`
	// Add only this content to the archive with `sourceContentFilename` as the filename. One and only one of `source`, `sourceContentFilename` (with `sourceContent`), `sourceFile`, or `sourceDir` must be specified.
	SourceContent *string `pulumi:"sourceContent"`
	// Set this as the filename when using `sourceContent`. One and only one of `source`, `sourceContentFilename` (with `sourceContent`), `sourceFile`, or `sourceDir` must be specified.
	SourceContentFilename *string `pulumi:"sourceContentFilename"`
	// Package entire contents of this directory into the archive. One and only one of `source`, `sourceContentFilename` (with `sourceContent`), `sourceFile`, or `sourceDir` must be specified.
	SourceDir *string `pulumi:"sourceDir"`
	// Package this file into the archive. One and only one of `source`, `sourceContentFilename` (with `sourceContent`), `sourceFile`, or `sourceDir` must be specified.
	SourceFile *string `pulumi:"sourceFile"`
	// Specifies attributes of a single source file to include into the archive. One and only one of `source`, `sourceContentFilename` (with `sourceContent`), `sourceFile`, or `sourceDir` must be specified.
	Sources []GetFileSource `pulumi:"sources"`
	// The type of archive to generate. NOTE: `zip` is supported.
	Type string `pulumi:"type"`
}

// A collection of values returned by getFile.
type LookupFileResult struct {
	// Boolean flag indicating whether symbolically linked directories should be excluded during the creation of the archive. Defaults to `false`.
	ExcludeSymlinkDirectories *bool `pulumi:"excludeSymlinkDirectories"`
	// Specify files to ignore when reading the `sourceDir`.
	Excludes []string `pulumi:"excludes"`
	// The sha1 checksum hash of the output.
	Id string `pulumi:"id"`
	// Base64 Encoded SHA256 checksum of output file
	OutputBase64sha256 string `pulumi:"outputBase64sha256"`
	// Base64 Encoded SHA512 checksum of output file
	OutputBase64sha512 string `pulumi:"outputBase64sha512"`
	// String that specifies the octal file mode for all archived files. For example: `"0666"`. Setting this will ensure that cross platform usage of this module will not vary the modes of archived files (and ultimately checksums) resulting in more deterministic behavior.
	OutputFileMode *string `pulumi:"outputFileMode"`
	// MD5 of output file
	OutputMd5 string `pulumi:"outputMd5"`
	// The output of the archive file.
	OutputPath string `pulumi:"outputPath"`
	// SHA1 checksum of output file
	OutputSha string `pulumi:"outputSha"`
	// SHA256 checksum of output file
	OutputSha256 string `pulumi:"outputSha256"`
	// SHA512 checksum of output file
	OutputSha512 string `pulumi:"outputSha512"`
	// The byte size of the output archive file.
	OutputSize int `pulumi:"outputSize"`
	// Add only this content to the archive with `sourceContentFilename` as the filename. One and only one of `source`, `sourceContentFilename` (with `sourceContent`), `sourceFile`, or `sourceDir` must be specified.
	SourceContent *string `pulumi:"sourceContent"`
	// Set this as the filename when using `sourceContent`. One and only one of `source`, `sourceContentFilename` (with `sourceContent`), `sourceFile`, or `sourceDir` must be specified.
	SourceContentFilename *string `pulumi:"sourceContentFilename"`
	// Package entire contents of this directory into the archive. One and only one of `source`, `sourceContentFilename` (with `sourceContent`), `sourceFile`, or `sourceDir` must be specified.
	SourceDir *string `pulumi:"sourceDir"`
	// Package this file into the archive. One and only one of `source`, `sourceContentFilename` (with `sourceContent`), `sourceFile`, or `sourceDir` must be specified.
	SourceFile *string `pulumi:"sourceFile"`
	// Specifies attributes of a single source file to include into the archive. One and only one of `source`, `sourceContentFilename` (with `sourceContent`), `sourceFile`, or `sourceDir` must be specified.
	Sources []GetFileSource `pulumi:"sources"`
	// The type of archive to generate. NOTE: `zip` is supported.
	Type string `pulumi:"type"`
}

func LookupFileOutput(ctx *pulumi.Context, args LookupFileOutputArgs, opts ...pulumi.InvokeOption) LookupFileResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupFileResult, error) {
			args := v.(LookupFileArgs)
			r, err := LookupFile(ctx, &args, opts...)
			var s LookupFileResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupFileResultOutput)
}

// A collection of arguments for invoking getFile.
type LookupFileOutputArgs struct {
	// Boolean flag indicating whether symbolically linked directories should be excluded during the creation of the archive. Defaults to `false`.
	ExcludeSymlinkDirectories pulumi.BoolPtrInput `pulumi:"excludeSymlinkDirectories"`
	// Specify files to ignore when reading the `sourceDir`.
	Excludes pulumi.StringArrayInput `pulumi:"excludes"`
	// String that specifies the octal file mode for all archived files. For example: `"0666"`. Setting this will ensure that cross platform usage of this module will not vary the modes of archived files (and ultimately checksums) resulting in more deterministic behavior.
	OutputFileMode pulumi.StringPtrInput `pulumi:"outputFileMode"`
	// The output of the archive file.
	OutputPath pulumi.StringInput `pulumi:"outputPath"`
	// Add only this content to the archive with `sourceContentFilename` as the filename. One and only one of `source`, `sourceContentFilename` (with `sourceContent`), `sourceFile`, or `sourceDir` must be specified.
	SourceContent pulumi.StringPtrInput `pulumi:"sourceContent"`
	// Set this as the filename when using `sourceContent`. One and only one of `source`, `sourceContentFilename` (with `sourceContent`), `sourceFile`, or `sourceDir` must be specified.
	SourceContentFilename pulumi.StringPtrInput `pulumi:"sourceContentFilename"`
	// Package entire contents of this directory into the archive. One and only one of `source`, `sourceContentFilename` (with `sourceContent`), `sourceFile`, or `sourceDir` must be specified.
	SourceDir pulumi.StringPtrInput `pulumi:"sourceDir"`
	// Package this file into the archive. One and only one of `source`, `sourceContentFilename` (with `sourceContent`), `sourceFile`, or `sourceDir` must be specified.
	SourceFile pulumi.StringPtrInput `pulumi:"sourceFile"`
	// Specifies attributes of a single source file to include into the archive. One and only one of `source`, `sourceContentFilename` (with `sourceContent`), `sourceFile`, or `sourceDir` must be specified.
	Sources GetFileSourceArrayInput `pulumi:"sources"`
	// The type of archive to generate. NOTE: `zip` is supported.
	Type pulumi.StringInput `pulumi:"type"`
}

func (LookupFileOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupFileArgs)(nil)).Elem()
}

// A collection of values returned by getFile.
type LookupFileResultOutput struct{ *pulumi.OutputState }

func (LookupFileResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupFileResult)(nil)).Elem()
}

func (o LookupFileResultOutput) ToLookupFileResultOutput() LookupFileResultOutput {
	return o
}

func (o LookupFileResultOutput) ToLookupFileResultOutputWithContext(ctx context.Context) LookupFileResultOutput {
	return o
}

// Boolean flag indicating whether symbolically linked directories should be excluded during the creation of the archive. Defaults to `false`.
func (o LookupFileResultOutput) ExcludeSymlinkDirectories() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v LookupFileResult) *bool { return v.ExcludeSymlinkDirectories }).(pulumi.BoolPtrOutput)
}

// Specify files to ignore when reading the `sourceDir`.
func (o LookupFileResultOutput) Excludes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupFileResult) []string { return v.Excludes }).(pulumi.StringArrayOutput)
}

// The sha1 checksum hash of the output.
func (o LookupFileResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFileResult) string { return v.Id }).(pulumi.StringOutput)
}

// Base64 Encoded SHA256 checksum of output file
func (o LookupFileResultOutput) OutputBase64sha256() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFileResult) string { return v.OutputBase64sha256 }).(pulumi.StringOutput)
}

// Base64 Encoded SHA512 checksum of output file
func (o LookupFileResultOutput) OutputBase64sha512() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFileResult) string { return v.OutputBase64sha512 }).(pulumi.StringOutput)
}

// String that specifies the octal file mode for all archived files. For example: `"0666"`. Setting this will ensure that cross platform usage of this module will not vary the modes of archived files (and ultimately checksums) resulting in more deterministic behavior.
func (o LookupFileResultOutput) OutputFileMode() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupFileResult) *string { return v.OutputFileMode }).(pulumi.StringPtrOutput)
}

// MD5 of output file
func (o LookupFileResultOutput) OutputMd5() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFileResult) string { return v.OutputMd5 }).(pulumi.StringOutput)
}

// The output of the archive file.
func (o LookupFileResultOutput) OutputPath() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFileResult) string { return v.OutputPath }).(pulumi.StringOutput)
}

// SHA1 checksum of output file
func (o LookupFileResultOutput) OutputSha() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFileResult) string { return v.OutputSha }).(pulumi.StringOutput)
}

// SHA256 checksum of output file
func (o LookupFileResultOutput) OutputSha256() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFileResult) string { return v.OutputSha256 }).(pulumi.StringOutput)
}

// SHA512 checksum of output file
func (o LookupFileResultOutput) OutputSha512() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFileResult) string { return v.OutputSha512 }).(pulumi.StringOutput)
}

// The byte size of the output archive file.
func (o LookupFileResultOutput) OutputSize() pulumi.IntOutput {
	return o.ApplyT(func(v LookupFileResult) int { return v.OutputSize }).(pulumi.IntOutput)
}

// Add only this content to the archive with `sourceContentFilename` as the filename. One and only one of `source`, `sourceContentFilename` (with `sourceContent`), `sourceFile`, or `sourceDir` must be specified.
func (o LookupFileResultOutput) SourceContent() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupFileResult) *string { return v.SourceContent }).(pulumi.StringPtrOutput)
}

// Set this as the filename when using `sourceContent`. One and only one of `source`, `sourceContentFilename` (with `sourceContent`), `sourceFile`, or `sourceDir` must be specified.
func (o LookupFileResultOutput) SourceContentFilename() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupFileResult) *string { return v.SourceContentFilename }).(pulumi.StringPtrOutput)
}

// Package entire contents of this directory into the archive. One and only one of `source`, `sourceContentFilename` (with `sourceContent`), `sourceFile`, or `sourceDir` must be specified.
func (o LookupFileResultOutput) SourceDir() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupFileResult) *string { return v.SourceDir }).(pulumi.StringPtrOutput)
}

// Package this file into the archive. One and only one of `source`, `sourceContentFilename` (with `sourceContent`), `sourceFile`, or `sourceDir` must be specified.
func (o LookupFileResultOutput) SourceFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupFileResult) *string { return v.SourceFile }).(pulumi.StringPtrOutput)
}

// Specifies attributes of a single source file to include into the archive. One and only one of `source`, `sourceContentFilename` (with `sourceContent`), `sourceFile`, or `sourceDir` must be specified.
func (o LookupFileResultOutput) Sources() GetFileSourceArrayOutput {
	return o.ApplyT(func(v LookupFileResult) []GetFileSource { return v.Sources }).(GetFileSourceArrayOutput)
}

// The type of archive to generate. NOTE: `zip` is supported.
func (o LookupFileResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFileResult) string { return v.Type }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupFileResultOutput{})
}
