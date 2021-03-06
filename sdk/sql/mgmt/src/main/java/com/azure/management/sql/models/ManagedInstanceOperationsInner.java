// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql.models;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.management.CloudException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import java.util.UUID;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ManagedInstanceOperations. */
public final class ManagedInstanceOperationsInner {
    /** The proxy service used to perform REST calls. */
    private final ManagedInstanceOperationsService service;

    /** The service client containing this operation class. */
    private final SqlManagementClientImpl client;

    /**
     * Initializes an instance of ManagedInstanceOperationsInner.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ManagedInstanceOperationsInner(SqlManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    ManagedInstanceOperationsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SqlManagementClientManagedInstanceOperations to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SqlManagementClientM")
    private interface ManagedInstanceOperationsService {
        @Headers({"Accept: application/json;q=0.9", "Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql"
                + "/managedInstances/{managedInstanceName}/operations/{operationId}/cancel")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<Response<Void>> cancel(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("managedInstanceName") String managedInstanceName,
            @PathParam("operationId") UUID operationId,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql"
                + "/managedInstances/{managedInstanceName}/operations")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ManagedInstanceOperationListResultInner>> listByManagedInstance(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("managedInstanceName") String managedInstanceName,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql"
                + "/managedInstances/{managedInstanceName}/operations/{operationId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ManagedInstanceOperationInner>> get(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("managedInstanceName") String managedInstanceName,
            @PathParam("operationId") UUID operationId,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ManagedInstanceOperationListResultInner>> listByManagedInstanceNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, Context context);
    }

    /**
     * Cancels the asynchronous operation on the managed instance.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param operationId The operationId parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> cancelWithResponseAsync(
        String resourceGroupName, String managedInstanceName, UUID operationId) {
        final String apiVersion = "2019-06-01-preview";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .cancel(
                            this.client.getHost(),
                            resourceGroupName,
                            managedInstanceName,
                            operationId,
                            this.client.getSubscriptionId(),
                            apiVersion,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Cancels the asynchronous operation on the managed instance.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param operationId The operationId parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> cancelAsync(String resourceGroupName, String managedInstanceName, UUID operationId) {
        return cancelWithResponseAsync(resourceGroupName, managedInstanceName, operationId)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Cancels the asynchronous operation on the managed instance.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param operationId The operationId parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void cancel(String resourceGroupName, String managedInstanceName, UUID operationId) {
        cancelAsync(resourceGroupName, managedInstanceName, operationId).block();
    }

    /**
     * Gets a list of operations performed on the managed instance.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of operations performed on the managed instance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ManagedInstanceOperationInner>> listByManagedInstanceSinglePageAsync(
        String resourceGroupName, String managedInstanceName) {
        final String apiVersion = "2019-06-01-preview";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listByManagedInstance(
                            this.client.getHost(),
                            resourceGroupName,
                            managedInstanceName,
                            this.client.getSubscriptionId(),
                            apiVersion,
                            context))
            .<PagedResponse<ManagedInstanceOperationInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets a list of operations performed on the managed instance.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of operations performed on the managed instance.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ManagedInstanceOperationInner> listByManagedInstanceAsync(
        String resourceGroupName, String managedInstanceName) {
        return new PagedFlux<>(
            () -> listByManagedInstanceSinglePageAsync(resourceGroupName, managedInstanceName),
            nextLink -> listByManagedInstanceNextSinglePageAsync(nextLink));
    }

    /**
     * Gets a list of operations performed on the managed instance.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of operations performed on the managed instance.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ManagedInstanceOperationInner> listByManagedInstance(
        String resourceGroupName, String managedInstanceName) {
        return new PagedIterable<>(listByManagedInstanceAsync(resourceGroupName, managedInstanceName));
    }

    /**
     * Gets a management operation on a managed instance.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param operationId The operationId parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a management operation on a managed instance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ManagedInstanceOperationInner>> getWithResponseAsync(
        String resourceGroupName, String managedInstanceName, UUID operationId) {
        final String apiVersion = "2019-06-01-preview";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getHost(),
                            resourceGroupName,
                            managedInstanceName,
                            operationId,
                            this.client.getSubscriptionId(),
                            apiVersion,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets a management operation on a managed instance.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param operationId The operationId parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a management operation on a managed instance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ManagedInstanceOperationInner> getAsync(
        String resourceGroupName, String managedInstanceName, UUID operationId) {
        return getWithResponseAsync(resourceGroupName, managedInstanceName, operationId)
            .flatMap(
                (SimpleResponse<ManagedInstanceOperationInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets a management operation on a managed instance.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param operationId The operationId parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a management operation on a managed instance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ManagedInstanceOperationInner get(String resourceGroupName, String managedInstanceName, UUID operationId) {
        return getAsync(resourceGroupName, managedInstanceName, operationId).block();
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a list managed instance operations request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ManagedInstanceOperationInner>> listByManagedInstanceNextSinglePageAsync(
        String nextLink) {
        return FluxUtil
            .withContext(context -> service.listByManagedInstanceNext(nextLink, context))
            .<PagedResponse<ManagedInstanceOperationInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }
}
