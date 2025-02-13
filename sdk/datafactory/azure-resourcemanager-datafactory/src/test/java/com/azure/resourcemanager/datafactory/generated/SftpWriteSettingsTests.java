// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.MetadataItem;
import com.azure.resourcemanager.datafactory.models.SftpWriteSettings;
import java.util.Arrays;

public final class SftpWriteSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SftpWriteSettings model = BinaryData.fromString(
            "{\"type\":\"SftpWriteSettings\",\"operationTimeout\":\"datafvxnisoorwfdtj\",\"useTempFileRename\":\"datajwlpcxljzzcdrgtu\",\"maxConcurrentConnections\":\"dataouoca\",\"disableMetricsCollection\":\"dataxvhjrpbnr\",\"copyBehavior\":\"datagelsgnenjtxuu\",\"metadata\":[{\"name\":\"dataqahlby\",\"value\":\"datahb\"}],\"\":{\"lrl\":\"datalmacbwmvphmjyzic\",\"qgjibrxxiaocr\":\"datazcgwnibnd\",\"pugnvhtgwadu\":\"datauhumgw\"}}")
            .toObject(SftpWriteSettings.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SftpWriteSettings model = new SftpWriteSettings().withMaxConcurrentConnections("dataouoca")
            .withDisableMetricsCollection("dataxvhjrpbnr").withCopyBehavior("datagelsgnenjtxuu")
            .withMetadata(Arrays.asList(new MetadataItem().withName("dataqahlby").withValue("datahb")))
            .withOperationTimeout("datafvxnisoorwfdtj").withUseTempFileRename("datajwlpcxljzzcdrgtu");
        model = BinaryData.fromObject(model).toObject(SftpWriteSettings.class);
    }
}
