// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The CheckPrivateLinkServiceVisibilityRequest model.
 */
@Fluent
public final class CheckPrivateLinkServiceVisibilityRequest {
    /*
     * The alias of the private link service.
     */
    @JsonProperty(value = "privateLinkServiceAlias")
    private String privateLinkServiceAlias;

    /**
     * Get the privateLinkServiceAlias property: The alias of the private link
     * service.
     * 
     * @return the privateLinkServiceAlias value.
     */
    public String privateLinkServiceAlias() {
        return this.privateLinkServiceAlias;
    }

    /**
     * Set the privateLinkServiceAlias property: The alias of the private link
     * service.
     * 
     * @param privateLinkServiceAlias the privateLinkServiceAlias value to set.
     * @return the CheckPrivateLinkServiceVisibilityRequest object itself.
     */
    public CheckPrivateLinkServiceVisibilityRequest withPrivateLinkServiceAlias(String privateLinkServiceAlias) {
        this.privateLinkServiceAlias = privateLinkServiceAlias;
        return this;
    }
}
