// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.DefenderForContainersAwsOfferingKinesisToS3;
import org.junit.jupiter.api.Assertions;

public final class DefenderForContainersAwsOfferingKinesisToS3Tests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DefenderForContainersAwsOfferingKinesisToS3 model =
            BinaryData
                .fromString("{\"cloudRoleArn\":\"tepdjxqes\"}")
                .toObject(DefenderForContainersAwsOfferingKinesisToS3.class);
        Assertions.assertEquals("tepdjxqes", model.cloudRoleArn());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DefenderForContainersAwsOfferingKinesisToS3 model =
            new DefenderForContainersAwsOfferingKinesisToS3().withCloudRoleArn("tepdjxqes");
        model = BinaryData.fromObject(model).toObject(DefenderForContainersAwsOfferingKinesisToS3.class);
        Assertions.assertEquals("tepdjxqes", model.cloudRoleArn());
    }
}
