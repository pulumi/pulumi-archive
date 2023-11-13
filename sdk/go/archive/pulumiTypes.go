// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package archive

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-archive/sdk/go/archive/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

var _ = internal.GetEnvOrDefault

type FileSource struct {
	// Add this content to the archive with `filename` as the filename.
	Content string `pulumi:"content"`
	// Set this as the filename when declaring a `source`.
	Filename string `pulumi:"filename"`
}

// FileSourceInput is an input type that accepts FileSourceArgs and FileSourceOutput values.
// You can construct a concrete instance of `FileSourceInput` via:
//
//	FileSourceArgs{...}
type FileSourceInput interface {
	pulumi.Input

	ToFileSourceOutput() FileSourceOutput
	ToFileSourceOutputWithContext(context.Context) FileSourceOutput
}

type FileSourceArgs struct {
	// Add this content to the archive with `filename` as the filename.
	Content pulumi.StringInput `pulumi:"content"`
	// Set this as the filename when declaring a `source`.
	Filename pulumi.StringInput `pulumi:"filename"`
}

func (FileSourceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*FileSource)(nil)).Elem()
}

func (i FileSourceArgs) ToFileSourceOutput() FileSourceOutput {
	return i.ToFileSourceOutputWithContext(context.Background())
}

func (i FileSourceArgs) ToFileSourceOutputWithContext(ctx context.Context) FileSourceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FileSourceOutput)
}

// FileSourceArrayInput is an input type that accepts FileSourceArray and FileSourceArrayOutput values.
// You can construct a concrete instance of `FileSourceArrayInput` via:
//
//	FileSourceArray{ FileSourceArgs{...} }
type FileSourceArrayInput interface {
	pulumi.Input

	ToFileSourceArrayOutput() FileSourceArrayOutput
	ToFileSourceArrayOutputWithContext(context.Context) FileSourceArrayOutput
}

type FileSourceArray []FileSourceInput

func (FileSourceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]FileSource)(nil)).Elem()
}

func (i FileSourceArray) ToFileSourceArrayOutput() FileSourceArrayOutput {
	return i.ToFileSourceArrayOutputWithContext(context.Background())
}

func (i FileSourceArray) ToFileSourceArrayOutputWithContext(ctx context.Context) FileSourceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FileSourceArrayOutput)
}

type FileSourceOutput struct{ *pulumi.OutputState }

func (FileSourceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*FileSource)(nil)).Elem()
}

func (o FileSourceOutput) ToFileSourceOutput() FileSourceOutput {
	return o
}

func (o FileSourceOutput) ToFileSourceOutputWithContext(ctx context.Context) FileSourceOutput {
	return o
}

// Add this content to the archive with `filename` as the filename.
func (o FileSourceOutput) Content() pulumi.StringOutput {
	return o.ApplyT(func(v FileSource) string { return v.Content }).(pulumi.StringOutput)
}

// Set this as the filename when declaring a `source`.
func (o FileSourceOutput) Filename() pulumi.StringOutput {
	return o.ApplyT(func(v FileSource) string { return v.Filename }).(pulumi.StringOutput)
}

type FileSourceArrayOutput struct{ *pulumi.OutputState }

func (FileSourceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]FileSource)(nil)).Elem()
}

func (o FileSourceArrayOutput) ToFileSourceArrayOutput() FileSourceArrayOutput {
	return o
}

func (o FileSourceArrayOutput) ToFileSourceArrayOutputWithContext(ctx context.Context) FileSourceArrayOutput {
	return o
}

func (o FileSourceArrayOutput) Index(i pulumi.IntInput) FileSourceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) FileSource {
		return vs[0].([]FileSource)[vs[1].(int)]
	}).(FileSourceOutput)
}

type GetFileSource struct {
	// Add this content to the archive with `filename` as the filename.
	Content string `pulumi:"content"`
	// Set this as the filename when declaring a `source`.
	Filename string `pulumi:"filename"`
}

// GetFileSourceInput is an input type that accepts GetFileSourceArgs and GetFileSourceOutput values.
// You can construct a concrete instance of `GetFileSourceInput` via:
//
//	GetFileSourceArgs{...}
type GetFileSourceInput interface {
	pulumi.Input

	ToGetFileSourceOutput() GetFileSourceOutput
	ToGetFileSourceOutputWithContext(context.Context) GetFileSourceOutput
}

type GetFileSourceArgs struct {
	// Add this content to the archive with `filename` as the filename.
	Content pulumi.StringInput `pulumi:"content"`
	// Set this as the filename when declaring a `source`.
	Filename pulumi.StringInput `pulumi:"filename"`
}

func (GetFileSourceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetFileSource)(nil)).Elem()
}

func (i GetFileSourceArgs) ToGetFileSourceOutput() GetFileSourceOutput {
	return i.ToGetFileSourceOutputWithContext(context.Background())
}

func (i GetFileSourceArgs) ToGetFileSourceOutputWithContext(ctx context.Context) GetFileSourceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetFileSourceOutput)
}

// GetFileSourceArrayInput is an input type that accepts GetFileSourceArray and GetFileSourceArrayOutput values.
// You can construct a concrete instance of `GetFileSourceArrayInput` via:
//
//	GetFileSourceArray{ GetFileSourceArgs{...} }
type GetFileSourceArrayInput interface {
	pulumi.Input

	ToGetFileSourceArrayOutput() GetFileSourceArrayOutput
	ToGetFileSourceArrayOutputWithContext(context.Context) GetFileSourceArrayOutput
}

type GetFileSourceArray []GetFileSourceInput

func (GetFileSourceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetFileSource)(nil)).Elem()
}

func (i GetFileSourceArray) ToGetFileSourceArrayOutput() GetFileSourceArrayOutput {
	return i.ToGetFileSourceArrayOutputWithContext(context.Background())
}

func (i GetFileSourceArray) ToGetFileSourceArrayOutputWithContext(ctx context.Context) GetFileSourceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetFileSourceArrayOutput)
}

type GetFileSourceOutput struct{ *pulumi.OutputState }

func (GetFileSourceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetFileSource)(nil)).Elem()
}

func (o GetFileSourceOutput) ToGetFileSourceOutput() GetFileSourceOutput {
	return o
}

func (o GetFileSourceOutput) ToGetFileSourceOutputWithContext(ctx context.Context) GetFileSourceOutput {
	return o
}

// Add this content to the archive with `filename` as the filename.
func (o GetFileSourceOutput) Content() pulumi.StringOutput {
	return o.ApplyT(func(v GetFileSource) string { return v.Content }).(pulumi.StringOutput)
}

// Set this as the filename when declaring a `source`.
func (o GetFileSourceOutput) Filename() pulumi.StringOutput {
	return o.ApplyT(func(v GetFileSource) string { return v.Filename }).(pulumi.StringOutput)
}

type GetFileSourceArrayOutput struct{ *pulumi.OutputState }

func (GetFileSourceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetFileSource)(nil)).Elem()
}

func (o GetFileSourceArrayOutput) ToGetFileSourceArrayOutput() GetFileSourceArrayOutput {
	return o
}

func (o GetFileSourceArrayOutput) ToGetFileSourceArrayOutputWithContext(ctx context.Context) GetFileSourceArrayOutput {
	return o
}

func (o GetFileSourceArrayOutput) Index(i pulumi.IntInput) GetFileSourceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GetFileSource {
		return vs[0].([]GetFileSource)[vs[1].(int)]
	}).(GetFileSourceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*FileSourceInput)(nil)).Elem(), FileSourceArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*FileSourceArrayInput)(nil)).Elem(), FileSourceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetFileSourceInput)(nil)).Elem(), GetFileSourceArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetFileSourceArrayInput)(nil)).Elem(), GetFileSourceArray{})
	pulumi.RegisterOutputType(FileSourceOutput{})
	pulumi.RegisterOutputType(FileSourceArrayOutput{})
	pulumi.RegisterOutputType(GetFileSourceOutput{})
	pulumi.RegisterOutputType(GetFileSourceArrayOutput{})
}
