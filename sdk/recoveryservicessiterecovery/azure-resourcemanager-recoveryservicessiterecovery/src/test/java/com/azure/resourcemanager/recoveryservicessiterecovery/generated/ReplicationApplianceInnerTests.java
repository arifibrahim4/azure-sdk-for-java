// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.ReplicationApplianceInner;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ApplianceSpecificDetails;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ReplicationApplianceProperties;

public final class ReplicationApplianceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ReplicationApplianceInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"providerSpecificDetails\":{\"instanceType\":\"ApplianceSpecificDetails\"}}}")
                .toObject(ReplicationApplianceInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ReplicationApplianceInner model =
            new ReplicationApplianceInner()
                .withProperties(
                    new ReplicationApplianceProperties().withProviderSpecificDetails(new ApplianceSpecificDetails()));
        model = BinaryData.fromObject(model).toObject(ReplicationApplianceInner.class);
    }
}
