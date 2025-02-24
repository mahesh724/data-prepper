/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.plugins.processor.mutateevent;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public class CopyValueProcessorConfig {
   public static class Entry {
        @NotEmpty
        @NotNull
        @JsonProperty("from_key")
        private String fromKey;

        @NotEmpty
        @NotNull
        @JsonProperty("to_key")
        private String toKey;

        @JsonProperty("overwrite_if_to_key_exists")
        private boolean overwriteIfToKeyExists = false;

        public String getFromKey() {
            return fromKey;
        }

        public String getToKey() {
            return toKey;
        }

        public boolean getOverwriteIfToKeyExists() {
            return overwriteIfToKeyExists;
        }

        public Entry(final String fromKey, final String toKey, final boolean overwriteIfToKeyExists) {
            this.fromKey = fromKey;
            this.toKey = toKey;
            this.overwriteIfToKeyExists = overwriteIfToKeyExists;
        }

        public Entry() {

        }
    }

    @NotEmpty
    @NotNull
    private List<Entry> entries;

    public List<Entry> getEntries() {
        return entries;
    }
}
