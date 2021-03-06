// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.monitor;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ResponseWithError model.
 */
@Fluent
public final class ResponseWithError {
    /*
     * Error information.
     */
    @JsonProperty(value = "error", required = true)
    private Error error;

    /**
     * Get the error property: Error information.
     * 
     * @return the error value.
     */
    public Error error() {
        return this.error;
    }

    /**
     * Set the error property: Error information.
     * 
     * @param error the error value to set.
     * @return the ResponseWithError object itself.
     */
    public ResponseWithError withError(Error error) {
        this.error = error;
        return this;
    }
}
