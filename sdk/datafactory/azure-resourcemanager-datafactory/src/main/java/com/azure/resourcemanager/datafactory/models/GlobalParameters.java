// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of GlobalParameters. */
public interface GlobalParameters {
    /**
     * Lists Global parameters.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Global parameters as paginated response with {@link PagedIterable}.
     */
    PagedIterable<GlobalParameterResource> listByFactory(String resourceGroupName, String factoryName);

    /**
     * Lists Global parameters.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Global parameters as paginated response with {@link PagedIterable}.
     */
    PagedIterable<GlobalParameterResource> listByFactory(String resourceGroupName, String factoryName, Context context);

    /**
     * Gets a Global parameter.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param globalParameterName The global parameter name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Global parameter.
     */
    GlobalParameterResource get(String resourceGroupName, String factoryName, String globalParameterName);

    /**
     * Gets a Global parameter.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param globalParameterName The global parameter name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Global parameter along with {@link Response}.
     */
    Response<GlobalParameterResource> getWithResponse(
        String resourceGroupName, String factoryName, String globalParameterName, Context context);

    /**
     * Deletes a Global parameter.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param globalParameterName The global parameter name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String factoryName, String globalParameterName);

    /**
     * Deletes a Global parameter.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param globalParameterName The global parameter name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteWithResponse(
        String resourceGroupName, String factoryName, String globalParameterName, Context context);

    /**
     * Gets a Global parameter.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Global parameter along with {@link Response}.
     */
    GlobalParameterResource getById(String id);

    /**
     * Gets a Global parameter.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Global parameter along with {@link Response}.
     */
    Response<GlobalParameterResource> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a Global parameter.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a Global parameter.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new GlobalParameterResource resource.
     *
     * @param name resource name.
     * @return the first stage of the new GlobalParameterResource definition.
     */
    GlobalParameterResource.DefinitionStages.Blank define(String name);
}