// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.archive.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetFileSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetFileSourceArgs Empty = new GetFileSourceArgs();

    /**
     * Add this content to the archive with `filename` as the filename.
     * 
     */
    @Import(name="content", required=true)
    private Output<String> content;

    /**
     * @return Add this content to the archive with `filename` as the filename.
     * 
     */
    public Output<String> content() {
        return this.content;
    }

    /**
     * Set this as the filename when declaring a `source`.
     * 
     */
    @Import(name="filename", required=true)
    private Output<String> filename;

    /**
     * @return Set this as the filename when declaring a `source`.
     * 
     */
    public Output<String> filename() {
        return this.filename;
    }

    private GetFileSourceArgs() {}

    private GetFileSourceArgs(GetFileSourceArgs $) {
        this.content = $.content;
        this.filename = $.filename;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFileSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFileSourceArgs $;

        public Builder() {
            $ = new GetFileSourceArgs();
        }

        public Builder(GetFileSourceArgs defaults) {
            $ = new GetFileSourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param content Add this content to the archive with `filename` as the filename.
         * 
         * @return builder
         * 
         */
        public Builder content(Output<String> content) {
            $.content = content;
            return this;
        }

        /**
         * @param content Add this content to the archive with `filename` as the filename.
         * 
         * @return builder
         * 
         */
        public Builder content(String content) {
            return content(Output.of(content));
        }

        /**
         * @param filename Set this as the filename when declaring a `source`.
         * 
         * @return builder
         * 
         */
        public Builder filename(Output<String> filename) {
            $.filename = filename;
            return this;
        }

        /**
         * @param filename Set this as the filename when declaring a `source`.
         * 
         * @return builder
         * 
         */
        public Builder filename(String filename) {
            return filename(Output.of(filename));
        }

        public GetFileSourceArgs build() {
            if ($.content == null) {
                throw new MissingRequiredPropertyException("GetFileSourceArgs", "content");
            }
            if ($.filename == null) {
                throw new MissingRequiredPropertyException("GetFileSourceArgs", "filename");
            }
            return $;
        }
    }

}
