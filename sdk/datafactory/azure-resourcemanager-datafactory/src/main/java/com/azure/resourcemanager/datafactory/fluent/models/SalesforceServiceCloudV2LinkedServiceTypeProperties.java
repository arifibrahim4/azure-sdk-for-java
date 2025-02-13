// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Salesforce Service Cloud V2 linked service properties.
 */
@Fluent
public final class SalesforceServiceCloudV2LinkedServiceTypeProperties {
    /*
     * The URL of Salesforce Service Cloud instance. For example, 'https://[domain].my.salesforce.com'. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "environmentUrl")
    private Object environmentUrl;

    /*
     * The client Id for OAuth 2.0 Client Credentials Flow authentication of the Salesforce instance. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "clientId")
    private Object clientId;

    /*
     * The client secret for OAuth 2.0 Client Credentials Flow authentication of the Salesforce instance.
     */
    @JsonProperty(value = "clientSecret")
    private SecretBase clientSecret;

    /*
     * The Salesforce API version used in ADF. The version must be larger than or equal to 47.0 which is required by
     * Salesforce BULK API 2.0. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "apiVersion")
    private Object apiVersion;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string.
     */
    @JsonProperty(value = "encryptedCredential")
    private String encryptedCredential;

    /**
     * Creates an instance of SalesforceServiceCloudV2LinkedServiceTypeProperties class.
     */
    public SalesforceServiceCloudV2LinkedServiceTypeProperties() {
    }

    /**
     * Get the environmentUrl property: The URL of Salesforce Service Cloud instance. For example,
     * 'https://[domain].my.salesforce.com'. Type: string (or Expression with resultType string).
     * 
     * @return the environmentUrl value.
     */
    public Object environmentUrl() {
        return this.environmentUrl;
    }

    /**
     * Set the environmentUrl property: The URL of Salesforce Service Cloud instance. For example,
     * 'https://[domain].my.salesforce.com'. Type: string (or Expression with resultType string).
     * 
     * @param environmentUrl the environmentUrl value to set.
     * @return the SalesforceServiceCloudV2LinkedServiceTypeProperties object itself.
     */
    public SalesforceServiceCloudV2LinkedServiceTypeProperties withEnvironmentUrl(Object environmentUrl) {
        this.environmentUrl = environmentUrl;
        return this;
    }

    /**
     * Get the clientId property: The client Id for OAuth 2.0 Client Credentials Flow authentication of the Salesforce
     * instance. Type: string (or Expression with resultType string).
     * 
     * @return the clientId value.
     */
    public Object clientId() {
        return this.clientId;
    }

    /**
     * Set the clientId property: The client Id for OAuth 2.0 Client Credentials Flow authentication of the Salesforce
     * instance. Type: string (or Expression with resultType string).
     * 
     * @param clientId the clientId value to set.
     * @return the SalesforceServiceCloudV2LinkedServiceTypeProperties object itself.
     */
    public SalesforceServiceCloudV2LinkedServiceTypeProperties withClientId(Object clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get the clientSecret property: The client secret for OAuth 2.0 Client Credentials Flow authentication of the
     * Salesforce instance.
     * 
     * @return the clientSecret value.
     */
    public SecretBase clientSecret() {
        return this.clientSecret;
    }

    /**
     * Set the clientSecret property: The client secret for OAuth 2.0 Client Credentials Flow authentication of the
     * Salesforce instance.
     * 
     * @param clientSecret the clientSecret value to set.
     * @return the SalesforceServiceCloudV2LinkedServiceTypeProperties object itself.
     */
    public SalesforceServiceCloudV2LinkedServiceTypeProperties withClientSecret(SecretBase clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * Get the apiVersion property: The Salesforce API version used in ADF. The version must be larger than or equal to
     * 47.0 which is required by Salesforce BULK API 2.0. Type: string (or Expression with resultType string).
     * 
     * @return the apiVersion value.
     */
    public Object apiVersion() {
        return this.apiVersion;
    }

    /**
     * Set the apiVersion property: The Salesforce API version used in ADF. The version must be larger than or equal to
     * 47.0 which is required by Salesforce BULK API 2.0. Type: string (or Expression with resultType string).
     * 
     * @param apiVersion the apiVersion value to set.
     * @return the SalesforceServiceCloudV2LinkedServiceTypeProperties object itself.
     */
    public SalesforceServiceCloudV2LinkedServiceTypeProperties withApiVersion(Object apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string.
     * 
     * @return the encryptedCredential value.
     */
    public String encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string.
     * 
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the SalesforceServiceCloudV2LinkedServiceTypeProperties object itself.
     */
    public SalesforceServiceCloudV2LinkedServiceTypeProperties withEncryptedCredential(String encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (clientSecret() != null) {
            clientSecret().validate();
        }
    }
}
