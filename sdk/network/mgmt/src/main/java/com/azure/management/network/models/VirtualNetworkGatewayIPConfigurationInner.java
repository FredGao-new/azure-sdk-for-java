// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.azure.management.network.IPAllocationMethod;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The VirtualNetworkGatewayIPConfiguration model.
 */
@JsonFlatten
@Fluent
public class VirtualNetworkGatewayIPConfigurationInner extends SubResource {
    /*
     * The name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /*
     * IP address allocation method.
     */
    @JsonProperty(value = "properties.privateIPAllocationMethod")
    private IPAllocationMethod privateIPAllocationMethod;

    /*
     * Reference to another subresource.
     */
    @JsonProperty(value = "properties.subnet")
    private SubResource subnet;

    /*
     * Reference to another subresource.
     */
    @JsonProperty(value = "properties.publicIPAddress")
    private SubResource publicIPAddress;

    /*
     * The provisioning state of the public IP resource. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Get the name property: The name of the resource that is unique within a
     * resource group. This name can be used to access the resource.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource that is unique within a
     * resource group. This name can be used to access the resource.
     * 
     * @param name the name value to set.
     * @return the VirtualNetworkGatewayIPConfigurationInner object itself.
     */
    public VirtualNetworkGatewayIPConfigurationInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever
     * the resource is updated.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: A unique read-only string that changes whenever
     * the resource is updated.
     * 
     * @param etag the etag value to set.
     * @return the VirtualNetworkGatewayIPConfigurationInner object itself.
     */
    public VirtualNetworkGatewayIPConfigurationInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the privateIPAllocationMethod property: IP address allocation
     * method.
     * 
     * @return the privateIPAllocationMethod value.
     */
    public IPAllocationMethod privateIPAllocationMethod() {
        return this.privateIPAllocationMethod;
    }

    /**
     * Set the privateIPAllocationMethod property: IP address allocation
     * method.
     * 
     * @param privateIPAllocationMethod the privateIPAllocationMethod value to
     * set.
     * @return the VirtualNetworkGatewayIPConfigurationInner object itself.
     */
    public VirtualNetworkGatewayIPConfigurationInner withPrivateIPAllocationMethod(IPAllocationMethod privateIPAllocationMethod) {
        this.privateIPAllocationMethod = privateIPAllocationMethod;
        return this;
    }

    /**
     * Get the subnet property: Reference to another subresource.
     * 
     * @return the subnet value.
     */
    public SubResource subnet() {
        return this.subnet;
    }

    /**
     * Set the subnet property: Reference to another subresource.
     * 
     * @param subnet the subnet value to set.
     * @return the VirtualNetworkGatewayIPConfigurationInner object itself.
     */
    public VirtualNetworkGatewayIPConfigurationInner withSubnet(SubResource subnet) {
        this.subnet = subnet;
        return this;
    }

    /**
     * Get the publicIPAddress property: Reference to another subresource.
     * 
     * @return the publicIPAddress value.
     */
    public SubResource publicIPAddress() {
        return this.publicIPAddress;
    }

    /**
     * Set the publicIPAddress property: Reference to another subresource.
     * 
     * @param publicIPAddress the publicIPAddress value to set.
     * @return the VirtualNetworkGatewayIPConfigurationInner object itself.
     */
    public VirtualNetworkGatewayIPConfigurationInner withPublicIPAddress(SubResource publicIPAddress) {
        this.publicIPAddress = publicIPAddress;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the public
     * IP resource. Possible values are: 'Updating', 'Deleting', and 'Failed'.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }
}
