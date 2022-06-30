// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** This is the disk image base class. */
@Fluent
public class SharedGalleryDiskImage {
    /*
     * This property indicates the size of the VHD to be created.
     */
    @JsonProperty(value = "diskSizeGB", access = JsonProperty.Access.WRITE_ONLY)
    private Integer diskSizeGB;

    /*
     * The host caching of the disk. Valid values are 'None', 'ReadOnly', and
     * 'ReadWrite'
     */
    @JsonProperty(value = "hostCaching")
    private SharedGalleryHostCaching hostCaching;

    /**
     * Get the diskSizeGB property: This property indicates the size of the VHD to be created.
     *
     * @return the diskSizeGB value.
     */
    public Integer diskSizeGB() {
        return this.diskSizeGB;
    }

    /**
     * Get the hostCaching property: The host caching of the disk. Valid values are 'None', 'ReadOnly', and 'ReadWrite'.
     *
     * @return the hostCaching value.
     */
    public SharedGalleryHostCaching hostCaching() {
        return this.hostCaching;
    }

    /**
     * Set the hostCaching property: The host caching of the disk. Valid values are 'None', 'ReadOnly', and 'ReadWrite'.
     *
     * @param hostCaching the hostCaching value to set.
     * @return the SharedGalleryDiskImage object itself.
     */
    public SharedGalleryDiskImage withHostCaching(SharedGalleryHostCaching hostCaching) {
        this.hostCaching = hostCaching;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}