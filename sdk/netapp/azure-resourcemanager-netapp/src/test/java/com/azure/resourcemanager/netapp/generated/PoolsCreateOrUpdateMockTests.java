// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.netapp.NetAppFilesManager;
import com.azure.resourcemanager.netapp.models.CapacityPool;
import com.azure.resourcemanager.netapp.models.EncryptionType;
import com.azure.resourcemanager.netapp.models.QosType;
import com.azure.resourcemanager.netapp.models.ServiceLevel;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class PoolsCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"etag\":\"gpr\",\"properties\":{\"poolId\":\"tillucbiqtg\",\"size\":56526058003542305,\"serviceLevel\":\"Standard\",\"provisioningState\":\"Succeeded\",\"totalThroughputMibps\":21.163637,\"utilizedThroughputMibps\":90.1712,\"qosType\":\"Manual\",\"coolAccess\":false,\"encryptionType\":\"Single\"},\"location\":\"bphbqzmizakakank\",\"tags\":{\"zhajoylhjlmuo\":\"n\",\"eecjmeis\":\"xprimrsop\"},\"id\":\"stvasylwxdzaumw\",\"name\":\"oohgu\",\"type\":\"fuzboyjathwtzolb\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito.when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito.when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito.when(httpClient.send(httpRequest.capture(), Mockito.any())).thenReturn(Mono.defer(() -> {
            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
            return Mono.just(httpResponse);
        }));

        NetAppFilesManager manager = NetAppFilesManager.configure().withHttpClient(httpClient).authenticate(
            tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
            new AzureProfile("", "", AzureEnvironment.AZURE));

        CapacityPool response = manager.pools().define("whryvycytdcl").withRegion("bg")
            .withExistingNetAppAccount("oylaxxul", "disdosfjbjsvgj").withSize(1887689540352270929L)
            .withServiceLevel(ServiceLevel.STANDARD_ZRS)
            .withTags(mapOf("utlwxezwzhok", "ylkdghrje", "ehgpp", "bwnhhtql", "csheafidltugsr", "pifhpfeoajvgcxtx"))
            .withQosType(QosType.MANUAL).withCoolAccess(true).withEncryptionType(EncryptionType.DOUBLE).create();

        Assertions.assertEquals("bphbqzmizakakank", response.location());
        Assertions.assertEquals("n", response.tags().get("zhajoylhjlmuo"));
        Assertions.assertEquals(56526058003542305L, response.size());
        Assertions.assertEquals(ServiceLevel.STANDARD, response.serviceLevel());
        Assertions.assertEquals(QosType.MANUAL, response.qosType());
        Assertions.assertEquals(false, response.coolAccess());
        Assertions.assertEquals(EncryptionType.SINGLE, response.encryptionType());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
