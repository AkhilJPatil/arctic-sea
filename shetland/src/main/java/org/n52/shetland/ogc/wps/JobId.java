/*
 * Copyright 2015-2018 52°North Initiative for Geospatial Open Source
 * Software GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.n52.shetland.ogc.wps;

import java.util.Objects;

/**
 * A JobID is a unique identifier for a process execution, i.e.&nbsp;a process
 * instance. Particularly suitable JobIDs are UUIDs or monotonic identifiers
 * such as unique timestamps. If the privacy of a Processing Job is imperative,
 * the JobID should be non-guessable.
 *
 * @author Christian Autermann
 */
public class JobId {

    private final String value;

    public JobId(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.value);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final JobId other = (JobId) obj;
        return Objects.equals(this.value, other.value);
    }

    @Override
    public String toString() {
        return "JobId{" + "value=" + value + '}';
    }
}