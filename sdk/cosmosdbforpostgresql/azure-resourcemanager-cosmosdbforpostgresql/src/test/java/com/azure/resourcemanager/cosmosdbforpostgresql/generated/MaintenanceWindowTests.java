// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmosdbforpostgresql.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.cosmosdbforpostgresql.models.MaintenanceWindow;
import org.junit.jupiter.api.Assertions;

public final class MaintenanceWindowTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MaintenanceWindow model =
            BinaryData
                .fromString(
                    "{\"customWindow\":\"dxbmtqioq\",\"startHour\":1116722151,\"startMinute\":1801213143,\"dayOfWeek\":538577990}")
                .toObject(MaintenanceWindow.class);
        Assertions.assertEquals("dxbmtqioq", model.customWindow());
        Assertions.assertEquals(1116722151, model.startHour());
        Assertions.assertEquals(1801213143, model.startMinute());
        Assertions.assertEquals(538577990, model.dayOfWeek());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MaintenanceWindow model =
            new MaintenanceWindow()
                .withCustomWindow("dxbmtqioq")
                .withStartHour(1116722151)
                .withStartMinute(1801213143)
                .withDayOfWeek(538577990);
        model = BinaryData.fromObject(model).toObject(MaintenanceWindow.class);
        Assertions.assertEquals("dxbmtqioq", model.customWindow());
        Assertions.assertEquals(1116722151, model.startHour());
        Assertions.assertEquals(1801213143, model.startMinute());
        Assertions.assertEquals(538577990, model.dayOfWeek());
    }
}
