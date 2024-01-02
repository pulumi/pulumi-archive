// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.archive.inputs;

import com.pulumi.archive.inputs.GetFileSource;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetFilePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFilePlainArgs Empty = new GetFilePlainArgs();

    /**
     * Boolean flag indicating whether symbolically linked directories should be excluded during the creation of the archive. Defaults to `false`.
     * 
     */
    @Import(name="excludeSymlinkDirectories")
    private @Nullable Boolean excludeSymlinkDirectories;

    /**
     * @return Boolean flag indicating whether symbolically linked directories should be excluded during the creation of the archive. Defaults to `false`.
     * 
     */
    public Optional<Boolean> excludeSymlinkDirectories() {
        return Optional.ofNullable(this.excludeSymlinkDirectories);
    }

    /**
     * Specify files to ignore when reading the `source_dir`.
     * 
     */
    @Import(name="excludes")
    private @Nullable List<String> excludes;

    /**
     * @return Specify files to ignore when reading the `source_dir`.
     * 
     */
    public Optional<List<String>> excludes() {
        return Optional.ofNullable(this.excludes);
    }

    /**
     * String that specifies the octal file mode for all archived files. For example: `&#34;0666&#34;`. Setting this will ensure that cross platform usage of this module will not vary the modes of archived files (and ultimately checksums) resulting in more deterministic behavior.
     * 
     */
    @Import(name="outputFileMode")
    private @Nullable String outputFileMode;

    /**
     * @return String that specifies the octal file mode for all archived files. For example: `&#34;0666&#34;`. Setting this will ensure that cross platform usage of this module will not vary the modes of archived files (and ultimately checksums) resulting in more deterministic behavior.
     * 
     */
    public Optional<String> outputFileMode() {
        return Optional.ofNullable(this.outputFileMode);
    }

    /**
     * The output of the archive file.
     * 
     */
    @Import(name="outputPath", required=true)
    private String outputPath;

    /**
     * @return The output of the archive file.
     * 
     */
    public String outputPath() {
        return this.outputPath;
    }

    /**
     * Add only this content to the archive with `source_content_filename` as the filename. One and only one of `source`, `source_content_filename` (with `source_content`), `source_file`, or `source_dir` must be specified.
     * 
     */
    @Import(name="sourceContent")
    private @Nullable String sourceContent;

    /**
     * @return Add only this content to the archive with `source_content_filename` as the filename. One and only one of `source`, `source_content_filename` (with `source_content`), `source_file`, or `source_dir` must be specified.
     * 
     */
    public Optional<String> sourceContent() {
        return Optional.ofNullable(this.sourceContent);
    }

    /**
     * Set this as the filename when using `source_content`. One and only one of `source`, `source_content_filename` (with `source_content`), `source_file`, or `source_dir` must be specified.
     * 
     */
    @Import(name="sourceContentFilename")
    private @Nullable String sourceContentFilename;

    /**
     * @return Set this as the filename when using `source_content`. One and only one of `source`, `source_content_filename` (with `source_content`), `source_file`, or `source_dir` must be specified.
     * 
     */
    public Optional<String> sourceContentFilename() {
        return Optional.ofNullable(this.sourceContentFilename);
    }

    /**
     * Package entire contents of this directory into the archive. One and only one of `source`, `source_content_filename` (with `source_content`), `source_file`, or `source_dir` must be specified.
     * 
     */
    @Import(name="sourceDir")
    private @Nullable String sourceDir;

    /**
     * @return Package entire contents of this directory into the archive. One and only one of `source`, `source_content_filename` (with `source_content`), `source_file`, or `source_dir` must be specified.
     * 
     */
    public Optional<String> sourceDir() {
        return Optional.ofNullable(this.sourceDir);
    }

    /**
     * Package this file into the archive. One and only one of `source`, `source_content_filename` (with `source_content`), `source_file`, or `source_dir` must be specified.
     * 
     */
    @Import(name="sourceFile")
    private @Nullable String sourceFile;

    /**
     * @return Package this file into the archive. One and only one of `source`, `source_content_filename` (with `source_content`), `source_file`, or `source_dir` must be specified.
     * 
     */
    public Optional<String> sourceFile() {
        return Optional.ofNullable(this.sourceFile);
    }

    /**
     * Specifies attributes of a single source file to include into the archive. One and only one of `source`, `source_content_filename` (with `source_content`), `source_file`, or `source_dir` must be specified.
     * 
     */
    @Import(name="sources")
    private @Nullable List<GetFileSource> sources;

    /**
     * @return Specifies attributes of a single source file to include into the archive. One and only one of `source`, `source_content_filename` (with `source_content`), `source_file`, or `source_dir` must be specified.
     * 
     */
    public Optional<List<GetFileSource>> sources() {
        return Optional.ofNullable(this.sources);
    }

    /**
     * The type of archive to generate. NOTE: `zip` is supported.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return The type of archive to generate. NOTE: `zip` is supported.
     * 
     */
    public String type() {
        return this.type;
    }

    private GetFilePlainArgs() {}

    private GetFilePlainArgs(GetFilePlainArgs $) {
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
    public static Builder builder(GetFilePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFilePlainArgs $;

        public Builder() {
            $ = new GetFilePlainArgs();
        }

        public Builder(GetFilePlainArgs defaults) {
            $ = new GetFilePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param excludeSymlinkDirectories Boolean flag indicating whether symbolically linked directories should be excluded during the creation of the archive. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder excludeSymlinkDirectories(@Nullable Boolean excludeSymlinkDirectories) {
            $.excludeSymlinkDirectories = excludeSymlinkDirectories;
            return this;
        }

        /**
         * @param excludes Specify files to ignore when reading the `source_dir`.
         * 
         * @return builder
         * 
         */
        public Builder excludes(@Nullable List<String> excludes) {
            $.excludes = excludes;
            return this;
        }

        /**
         * @param excludes Specify files to ignore when reading the `source_dir`.
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
        public Builder outputFileMode(@Nullable String outputFileMode) {
            $.outputFileMode = outputFileMode;
            return this;
        }

        /**
         * @param outputPath The output of the archive file.
         * 
         * @return builder
         * 
         */
        public Builder outputPath(String outputPath) {
            $.outputPath = outputPath;
            return this;
        }

        /**
         * @param sourceContent Add only this content to the archive with `source_content_filename` as the filename. One and only one of `source`, `source_content_filename` (with `source_content`), `source_file`, or `source_dir` must be specified.
         * 
         * @return builder
         * 
         */
        public Builder sourceContent(@Nullable String sourceContent) {
            $.sourceContent = sourceContent;
            return this;
        }

        /**
         * @param sourceContentFilename Set this as the filename when using `source_content`. One and only one of `source`, `source_content_filename` (with `source_content`), `source_file`, or `source_dir` must be specified.
         * 
         * @return builder
         * 
         */
        public Builder sourceContentFilename(@Nullable String sourceContentFilename) {
            $.sourceContentFilename = sourceContentFilename;
            return this;
        }

        /**
         * @param sourceDir Package entire contents of this directory into the archive. One and only one of `source`, `source_content_filename` (with `source_content`), `source_file`, or `source_dir` must be specified.
         * 
         * @return builder
         * 
         */
        public Builder sourceDir(@Nullable String sourceDir) {
            $.sourceDir = sourceDir;
            return this;
        }

        /**
         * @param sourceFile Package this file into the archive. One and only one of `source`, `source_content_filename` (with `source_content`), `source_file`, or `source_dir` must be specified.
         * 
         * @return builder
         * 
         */
        public Builder sourceFile(@Nullable String sourceFile) {
            $.sourceFile = sourceFile;
            return this;
        }

        /**
         * @param sources Specifies attributes of a single source file to include into the archive. One and only one of `source`, `source_content_filename` (with `source_content`), `source_file`, or `source_dir` must be specified.
         * 
         * @return builder
         * 
         */
        public Builder sources(@Nullable List<GetFileSource> sources) {
            $.sources = sources;
            return this;
        }

        /**
         * @param sources Specifies attributes of a single source file to include into the archive. One and only one of `source`, `source_content_filename` (with `source_content`), `source_file`, or `source_dir` must be specified.
         * 
         * @return builder
         * 
         */
        public Builder sources(GetFileSource... sources) {
            return sources(List.of(sources));
        }

        /**
         * @param type The type of archive to generate. NOTE: `zip` is supported.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public GetFilePlainArgs build() {
            if ($.outputPath == null) {
                throw new MissingRequiredPropertyException("GetFilePlainArgs", "outputPath");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("GetFilePlainArgs", "type");
            }
            return $;
        }
    }

}
