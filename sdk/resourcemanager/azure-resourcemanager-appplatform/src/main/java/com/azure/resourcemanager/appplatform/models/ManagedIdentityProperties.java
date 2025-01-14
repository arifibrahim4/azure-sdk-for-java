// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Managed identity properties retrieved from ARM request headers. */
@Fluent
public final class ManagedIdentityProperties {
    /*
     * Type of the managed identity
     */
    @JsonProperty(value = "type")
    private ManagedIdentityType type;

    /*
     * Principal Id of system-assigned managed identity.
     */
    @JsonProperty(value = "principalId")
    private String principalId;

    /*
     * Tenant Id of system-assigned managed identity.
     */
    @JsonProperty(value = "tenantId")
    private String tenantId;

    /*
     * Properties of user-assigned managed identities
     */
    @JsonProperty(value = "userAssignedIdentities")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, UserAssignedManagedIdentity> userAssignedIdentities;

    /**
     * Get the type property: Type of the managed identity.
     *
     * @return the type value.
     */
    public ManagedIdentityType type() {
        return this.type;
    }

    /**
     * Set the type property: Type of the managed identity.
     *
     * @param type the type value to set.
     * @return the ManagedIdentityProperties object itself.
     */
    public ManagedIdentityProperties withType(ManagedIdentityType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the principalId property: Principal Id of system-assigned managed identity.
     *
     * @return the principalId value.
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Set the principalId property: Principal Id of system-assigned managed identity.
     *
     * @param principalId the principalId value to set.
     * @return the ManagedIdentityProperties object itself.
     */
    public ManagedIdentityProperties withPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }

    /**
     * Get the tenantId property: Tenant Id of system-assigned managed identity.
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId property: Tenant Id of system-assigned managed identity.
     *
     * @param tenantId the tenantId value to set.
     * @return the ManagedIdentityProperties object itself.
     */
    public ManagedIdentityProperties withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get the userAssignedIdentities property: Properties of user-assigned managed identities.
     *
     * @return the userAssignedIdentities value.
     */
    public Map<String, UserAssignedManagedIdentity> userAssignedIdentities() {
        return this.userAssignedIdentities;
    }

    /**
     * Set the userAssignedIdentities property: Properties of user-assigned managed identities.
     *
     * @param userAssignedIdentities the userAssignedIdentities value to set.
     * @return the ManagedIdentityProperties object itself.
     */
    public ManagedIdentityProperties withUserAssignedIdentities(
        Map<String, UserAssignedManagedIdentity> userAssignedIdentities) {
        this.userAssignedIdentities = userAssignedIdentities;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (userAssignedIdentities() != null) {
            userAssignedIdentities()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
    }
}
