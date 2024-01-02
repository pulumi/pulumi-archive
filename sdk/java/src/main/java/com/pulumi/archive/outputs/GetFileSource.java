// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.archive.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetFileSource {
    /**
     * @return Add this content to the archive with `filename` as the filename.
     * 
     */
    private String content;
    /**
     * @return Set this as the filename when declaring a `source`.
     * 
     */
    private String filename;

    private GetFileSource() {}
    /**
     * @return Add this content to the archive with `filename` as the filename.
     * 
     */
    public String content() {
        return this.content;
    }
    /**
     * @return Set this as the filename when declaring a `source`.
     * 
     */
    public String filename() {
        return this.filename;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFileSource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String content;
        private String filename;
        public Builder() {}
        public Builder(GetFileSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.filename = defaults.filename;
        }

        @CustomType.Setter
        public Builder content(String content) {
            if (content == null) {
              throw new MissingRequiredPropertyException("GetFileSource", "content");
            }
            this.content = content;
            return this;
        }
        @CustomType.Setter
        public Builder filename(String filename) {
            if (filename == null) {
              throw new MissingRequiredPropertyException("GetFileSource", "filename");
            }
            this.filename = filename;
            return this;
        }
        public GetFileSource build() {
            final var _resultValue = new GetFileSource();
            _resultValue.content = content;
            _resultValue.filename = filename;
            return _resultValue;
        }
    }
}
