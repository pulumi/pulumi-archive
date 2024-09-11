// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.archive;

import com.pulumi.archive.inputs.FileSourceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FileArgs extends com.pulumi.resources.ResourceArgs {

    public static final FileArgs Empty = new FileArgs();

    /**
     * Boolean flag indicating whether symbolically linked directories should be excluded during the creation of the archive. Defaults to `false`.
     * 
     */
    @Import(name="excludeSymlinkDirectories")
    private @Nullable Output<Boolean> excludeSymlinkDirectories;

    /**
     * @return Boolean flag indicating whether symbolically linked directories should be excluded during the creation of the archive. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> excludeSymlinkDirectories() {
        return Optional.ofNullable(this.excludeSymlinkDirectories);
    }

    /**
     * Specify files/directories to ignore when reading the `source_dir`. Supports glob file matching patterns including doublestar/globstar (`**`) patterns.
     * 
     */
    @Import(name="excludes")
    private @Nullable Output<List<String>> excludes;

    /**
     * @return Specify files/directories to ignore when reading the `source_dir`. Supports glob file matching patterns including doublestar/globstar (`**`) patterns.
     * 
     */
    public Optional<Output<List<String>>> excludes() {
        return Optional.ofNullable(this.excludes);
    }

    /**
     * String that specifies the octal file mode for all archived files. For example: `&#34;0666&#34;`. Setting this will ensure that cross platform usage of this module will not vary the modes of archived files (and ultimately checksums) resulting in more deterministic behavior.
     * 
     */
    @Import(name="outputFileMode")
    private @Nullable Output<String> outputFileMode;

    /**
     * @return String that specifies the octal file mode for all archived files. For example: `&#34;0666&#34;`. Setting this will ensure that cross platform usage of this module will not vary the modes of archived files (and ultimately checksums) resulting in more deterministic behavior.
     * 
     */
    public Optional<Output<String>> outputFileMode() {
        return Optional.ofNullable(this.outputFileMode);
    }

    /**
     * The output of the archive file.
     * 
     */
    @Import(name="outputPath", required=true)
    private Output<String> outputPath;

    /**
     * @return The output of the archive file.
     * 
     */
    public Output<String> outputPath() {
        return this.outputPath;
    }

    /**
     * Add only this content to the archive with `source_content_filename` as the filename. One and only one of `source`, `source_content_filename` (with `source_content`), `source_file`, or `source_dir` must be specified.
     * 
     */
    @Import(name="sourceContent")
    private @Nullable Output<String> sourceContent;

    /**
     * @return Add only this content to the archive with `source_content_filename` as the filename. One and only one of `source`, `source_content_filename` (with `source_content`), `source_file`, or `source_dir` must be specified.
     * 
     */
    public Optional<Output<String>> sourceContent() {
        return Optional.ofNullable(this.sourceContent);
    }

    /**
     * Set this as the filename when using `source_content`. One and only one of `source`, `source_content_filename` (with `source_content`), `source_file`, or `source_dir` must be specified.
     * 
     */
    @Import(name="sourceContentFilename")
    private @Nullable Output<String> sourceContentFilename;

    /**
     * @return Set this as the filename when using `source_content`. One and only one of `source`, `source_content_filename` (with `source_content`), `source_file`, or `source_dir` must be specified.
     * 
     */
    public Optional<Output<String>> sourceContentFilename() {
        return Optional.ofNullable(this.sourceContentFilename);
    }

    /**
     * Package entire contents of this directory into the archive. One and only one of `source`, `source_content_filename` (with `source_content`), `source_file`, or `source_dir` must be specified.
     * 
     */
    @Import(name="sourceDir")
    private @Nullable Output<String> sourceDir;

    /**
     * @return Package entire contents of this directory into the archive. One and only one of `source`, `source_content_filename` (with `source_content`), `source_file`, or `source_dir` must be specified.
     * 
     */
    public Optional<Output<String>> sourceDir() {
        return Optional.ofNullable(this.sourceDir);
    }

    /**
     * Package this file into the archive. One and only one of `source`, `source_content_filename` (with `source_content`), `source_file`, or `source_dir` must be specified.
     * 
     */
    @Import(name="sourceFile")
    private @Nullable Output<String> sourceFile;

    /**
     * @return Package this file into the archive. One and only one of `source`, `source_content_filename` (with `source_content`), `source_file`, or `source_dir` must be specified.
     * 
     */
    public Optional<Output<String>> sourceFile() {
        return Optional.ofNullable(this.sourceFile);
    }

    /**
     * Specifies attributes of a single source file to include into the archive. One and only one of `source`, `source_content_filename` (with `source_content`), `source_file`, or `source_dir` must be specified.
     * 
     */
    @Import(name="sources")
    private @Nullable Output<List<FileSourceArgs>> sources;

    /**
     * @return Specifies attributes of a single source file to include into the archive. One and only one of `source`, `source_content_filename` (with `source_content`), `source_file`, or `source_dir` must be specified.
     * 
     */
    public Optional<Output<List<FileSourceArgs>>> sources() {
        return Optional.ofNullable(this.sources);
    }

    /**
     * The type of archive to generate. NOTE: `zip` and `tar.gz` is supported.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The type of archive to generate. NOTE: `zip` and `tar.gz` is supported.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private FileArgs() {}

    private FileArgs(FileArgs $) {
        this.excludeSymlinkDirectories = $.excludeSymlinkDirectories;
        this.excludes = $.excludes;
        this.outputFileMode = $.outputFileMode;
        this.outputPath = $.outputPath;
        this.sourceContent = $.sourceContent;
        this.sourceContentFilename = $.sourceContentFilename;
        this.sourceDir = $.sourceDir;
        this.sourceFile = $.sourceFile;
        this.sources = $.sources;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FileArgs $;

        public Builder() {
            $ = new FileArgs();
        }

        public Builder(FileArgs defaults) {
            $ = new FileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param excludeSymlinkDirectories Boolean flag indicating whether symbolically linked directories should be excluded during the creation of the archive. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder excludeSymlinkDirectories(@Nullable Output<Boolean> excludeSymlinkDirectories) {
            $.excludeSymlinkDirectories = excludeSymlinkDirectories;
            return this;
        }

        /**
         * @param excludeSymlinkDirectories Boolean flag indicating whether symbolically linked directories should be excluded during the creation of the archive. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder excludeSymlinkDirectories(Boolean excludeSymlinkDirectories) {
            return excludeSymlinkDirectories(Output.of(excludeSymlinkDirectories));
        }

        /**
         * @param excludes Specify files/directories to ignore when reading the `source_dir`. Supports glob file matching patterns including doublestar/globstar (`**`) patterns.
         * 
         * @return builder
         * 
         */
        public Builder excludes(@Nullable Output<List<String>> excludes) {
            $.excludes = excludes;
            return this;
        }

        /**
         * @param excludes Specify files/directories to ignore when reading the `source_dir`. Supports glob file matching patterns including doublestar/globstar (`**`) patterns.
         * 
         * @return builder
         * 
         */
        public Builder excludes(List<String> excludes) {
            return excludes(Output.of(excludes));
        }

        /**
         * @param excludes Specify files/directories to ignore when reading the `source_dir`. Supports glob file matching patterns including doublestar/globstar (`**`) patterns.
         * 
         * @return builder
         * 
         */
        public Builder excludes(String... excludes) {
            return excludes(List.of(excludes));
        }

        /**
         * @param outputFileMode String that specifies the octal file mode for all archived files. For example: `&#34;0666&#34;`. Setting this will ensure that cross platform usage of this module will not vary the modes of archived files (and ultimately checksums) resulting in more deterministic behavior.
         * 
         * @return builder
         * 
         */
        public Builder outputFileMode(@Nullable Output<String> outputFileMode) {
            $.outputFileMode = outputFileMode;
            return this;
        }

        /**
         * @param outputFileMode String that specifies the octal file mode for all archived files. For example: `&#34;0666&#34;`. Setting this will ensure that cross platform usage of this module will not vary the modes of archived files (and ultimately checksums) resulting in more deterministic behavior.
         * 
         * @return builder
         * 
         */
        public Builder outputFileMode(String outputFileMode) {
            return outputFileMode(Output.of(outputFileMode));
        }

        /**
         * @param outputPath The output of the archive file.
         * 
         * @return builder
         * 
         */
        public Builder outputPath(Output<String> outputPath) {
            $.outputPath = outputPath;
            return this;
        }

        /**
         * @param outputPath The output of the archive file.
         * 
         * @return builder
         * 
         */
        public Builder outputPath(String outputPath) {
            return outputPath(Output.of(outputPath));
        }

        /**
         * @param sourceContent Add only this content to the archive with `source_content_filename` as the filename. One and only one of `source`, `source_content_filename` (with `source_content`), `source_file`, or `source_dir` must be specified.
         * 
         * @return builder
         * 
         */
        public Builder sourceContent(@Nullable Output<String> sourceContent) {
            $.sourceContent = sourceContent;
            return this;
        }

        /**
         * @param sourceContent Add only this content to the archive with `source_content_filename` as the filename. One and only one of `source`, `source_content_filename` (with `source_content`), `source_file`, or `source_dir` must be specified.
         * 
         * @return builder
         * 
         */
        public Builder sourceContent(String sourceContent) {
            return sourceContent(Output.of(sourceContent));
        }

        /**
         * @param sourceContentFilename Set this as the filename when using `source_content`. One and only one of `source`, `source_content_filename` (with `source_content`), `source_file`, or `source_dir` must be specified.
         * 
         * @return builder
         * 
         */
        public Builder sourceContentFilename(@Nullable Output<String> sourceContentFilename) {
            $.sourceContentFilename = sourceContentFilename;
            return this;
        }

        /**
         * @param sourceContentFilename Set this as the filename when using `source_content`. One and only one of `source`, `source_content_filename` (with `source_content`), `source_file`, or `source_dir` must be specified.
         * 
         * @return builder
         * 
         */
        public Builder sourceContentFilename(String sourceContentFilename) {
            return sourceContentFilename(Output.of(sourceContentFilename));
        }

        /**
         * @param sourceDir Package entire contents of this directory into the archive. One and only one of `source`, `source_content_filename` (with `source_content`), `source_file`, or `source_dir` must be specified.
         * 
         * @return builder
         * 
         */
        public Builder sourceDir(@Nullable Output<String> sourceDir) {
            $.sourceDir = sourceDir;
            return this;
        }

        /**
         * @param sourceDir Package entire contents of this directory into the archive. One and only one of `source`, `source_content_filename` (with `source_content`), `source_file`, or `source_dir` must be specified.
         * 
         * @return builder
         * 
         */
        public Builder sourceDir(String sourceDir) {
            return sourceDir(Output.of(sourceDir));
        }

        /**
         * @param sourceFile Package this file into the archive. One and only one of `source`, `source_content_filename` (with `source_content`), `source_file`, or `source_dir` must be specified.
         * 
         * @return builder
         * 
         */
        public Builder sourceFile(@Nullable Output<String> sourceFile) {
            $.sourceFile = sourceFile;
            return this;
        }

        /**
         * @param sourceFile Package this file into the archive. One and only one of `source`, `source_content_filename` (with `source_content`), `source_file`, or `source_dir` must be specified.
         * 
         * @return builder
         * 
         */
        public Builder sourceFile(String sourceFile) {
            return sourceFile(Output.of(sourceFile));
        }

        /**
         * @param sources Specifies attributes of a single source file to include into the archive. One and only one of `source`, `source_content_filename` (with `source_content`), `source_file`, or `source_dir` must be specified.
         * 
         * @return builder
         * 
         */
        public Builder sources(@Nullable Output<List<FileSourceArgs>> sources) {
            $.sources = sources;
            return this;
        }

        /**
         * @param sources Specifies attributes of a single source file to include into the archive. One and only one of `source`, `source_content_filename` (with `source_content`), `source_file`, or `source_dir` must be specified.
         * 
         * @return builder
         * 
         */
        public Builder sources(List<FileSourceArgs> sources) {
            return sources(Output.of(sources));
        }

        /**
         * @param sources Specifies attributes of a single source file to include into the archive. One and only one of `source`, `source_content_filename` (with `source_content`), `source_file`, or `source_dir` must be specified.
         * 
         * @return builder
         * 
         */
        public Builder sources(FileSourceArgs... sources) {
            return sources(List.of(sources));
        }

        /**
         * @param type The type of archive to generate. NOTE: `zip` and `tar.gz` is supported.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of archive to generate. NOTE: `zip` and `tar.gz` is supported.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public FileArgs build() {
            if ($.outputPath == null) {
                throw new MissingRequiredPropertyException("FileArgs", "outputPath");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("FileArgs", "type");
            }
            return $;
        }
    }

}
