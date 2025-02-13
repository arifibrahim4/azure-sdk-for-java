// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ActivityDependency;
import com.azure.resourcemanager.datafactory.models.ActivityOnInactiveMarkAs;
import com.azure.resourcemanager.datafactory.models.ActivityPolicy;
import com.azure.resourcemanager.datafactory.models.ActivityState;
import com.azure.resourcemanager.datafactory.models.DatabricksSparkPythonActivity;
import com.azure.resourcemanager.datafactory.models.DependencyCondition;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.UserProperty;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DatabricksSparkPythonActivityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DatabricksSparkPythonActivity model = BinaryData.fromString(
            "{\"type\":\"DatabricksSparkPython\",\"typeProperties\":{\"pythonFile\":\"datays\",\"parameters\":[\"dataaymxldorq\"],\"libraries\":[{\"ssog\":\"datavueyzg\",\"vir\":\"dataeqv\",\"eoma\":\"databguewtcq\",\"ojmxbyviykwrffxo\":\"datanwsgauwe\"}]},\"linkedServiceName\":{\"referenceName\":\"xhcxpzjewo\",\"parameters\":{\"quyatvsn\":\"datacvtdyuozmtsjgnp\",\"gwvblrgrzlrnu\":\"datarxhv\",\"d\":\"datah\"}},\"policy\":{\"timeout\":\"dataidfwzpauw\",\"retry\":\"datahynholojcaybu\",\"retryIntervalInSeconds\":1411197523,\"secureInput\":false,\"secureOutput\":true,\"\":{\"ekxvlejh\":\"dataqlghrcctvlnnkvdr\",\"u\":\"databqzxqid\"}},\"name\":\"wrwjbanteeu\",\"description\":\"icaikfvj\",\"state\":\"Active\",\"onInactiveMarkAs\":\"Succeeded\",\"dependsOn\":[{\"activity\":\"lrrqjioltdl\",\"dependencyConditions\":[\"Skipped\",\"Completed\"],\"\":{\"rvghvfodrqmcgeqy\":\"datan\"}},{\"activity\":\"ordnwtucvbviymv\",\"dependencyConditions\":[\"Completed\"],\"\":{\"mpcnezd\":\"datanvdorsgcvgkn\",\"bqhbbzfcjmhpobu\":\"datal\",\"mbyltd\":\"datapdyztqpszbtbx\",\"cotfov\":\"dataraxehxotizvwiha\"}},{\"activity\":\"iyluvebcovbzsmge\",\"dependencyConditions\":[\"Succeeded\",\"Completed\",\"Succeeded\"],\"\":{\"t\":\"datahxswebgaaxff\"}},{\"activity\":\"qlcxymcmogfbweu\",\"dependencyConditions\":[\"Failed\",\"Completed\",\"Skipped\",\"Succeeded\"],\"\":{\"cdgim\":\"dataoadsbacemwn\",\"xzmxww\":\"databumpplbcarcyrftc\",\"vxrcmrdmyjcou\":\"datahdlrfyonnb\",\"zirkyxhqwoxm\":\"datazodolehchimzrc\"}}],\"userProperties\":[{\"name\":\"u\",\"value\":\"datanybfmbl\"},{\"name\":\"hpqnzpf\",\"value\":\"datasp\"},{\"name\":\"kqufdmgmfyi\",\"value\":\"datarfkfgr\"},{\"name\":\"rilhyfxmrq\",\"value\":\"dataicknygzdrdicwm\"}],\"\":{\"gcc\":\"datavawywo\",\"fqwyiuhhuftn\":\"datazhjvvrrxclfomx\",\"ossokafy\":\"dataigxwxxfkfthw\"}}")
            .toObject(DatabricksSparkPythonActivity.class);
        Assertions.assertEquals("wrwjbanteeu", model.name());
        Assertions.assertEquals("icaikfvj", model.description());
        Assertions.assertEquals(ActivityState.ACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.SUCCEEDED, model.onInactiveMarkAs());
        Assertions.assertEquals("lrrqjioltdl", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.SKIPPED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("u", model.userProperties().get(0).name());
        Assertions.assertEquals("xhcxpzjewo", model.linkedServiceName().referenceName());
        Assertions.assertEquals(1411197523, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(false, model.policy().secureInput());
        Assertions.assertEquals(true, model.policy().secureOutput());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DatabricksSparkPythonActivity model
            = new DatabricksSparkPythonActivity().withName("wrwjbanteeu").withDescription("icaikfvj")
                .withState(ActivityState.ACTIVE).withOnInactiveMarkAs(ActivityOnInactiveMarkAs.SUCCEEDED)
                .withDependsOn(Arrays.asList(
                    new ActivityDependency().withActivity("lrrqjioltdl")
                        .withDependencyConditions(
                            Arrays.asList(DependencyCondition.SKIPPED, DependencyCondition.COMPLETED))
                        .withAdditionalProperties(mapOf()),
                    new ActivityDependency().withActivity("ordnwtucvbviymv")
                        .withDependencyConditions(Arrays.asList(DependencyCondition.COMPLETED))
                        .withAdditionalProperties(mapOf()),
                    new ActivityDependency().withActivity("iyluvebcovbzsmge")
                        .withDependencyConditions(Arrays.asList(DependencyCondition.SUCCEEDED,
                            DependencyCondition.COMPLETED, DependencyCondition.SUCCEEDED))
                        .withAdditionalProperties(mapOf()),
                    new ActivityDependency().withActivity("qlcxymcmogfbweu")
                        .withDependencyConditions(Arrays.asList(DependencyCondition.FAILED,
                            DependencyCondition.COMPLETED, DependencyCondition.SKIPPED, DependencyCondition.SUCCEEDED))
                        .withAdditionalProperties(mapOf())))
                .withUserProperties(Arrays.asList(new UserProperty().withName("u").withValue("datanybfmbl"),
                    new UserProperty().withName("hpqnzpf").withValue("datasp"),
                    new UserProperty().withName("kqufdmgmfyi").withValue("datarfkfgr"),
                    new UserProperty().withName("rilhyfxmrq").withValue("dataicknygzdrdicwm")))
                .withLinkedServiceName(new LinkedServiceReference().withReferenceName("xhcxpzjewo").withParameters(
                    mapOf("quyatvsn", "datacvtdyuozmtsjgnp", "gwvblrgrzlrnu", "datarxhv", "d", "datah")))
                .withPolicy(new ActivityPolicy().withTimeout("dataidfwzpauw").withRetry("datahynholojcaybu")
                    .withRetryIntervalInSeconds(1411197523).withSecureInput(false).withSecureOutput(true)
                    .withAdditionalProperties(mapOf()))
                .withPythonFile("datays").withParameters(Arrays.asList("dataaymxldorq"))
                .withLibraries(Arrays.asList(mapOf("ssog", "datavueyzg", "vir", "dataeqv", "eoma", "databguewtcq",
                    "ojmxbyviykwrffxo", "datanwsgauwe")));
        model = BinaryData.fromObject(model).toObject(DatabricksSparkPythonActivity.class);
        Assertions.assertEquals("wrwjbanteeu", model.name());
        Assertions.assertEquals("icaikfvj", model.description());
        Assertions.assertEquals(ActivityState.ACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.SUCCEEDED, model.onInactiveMarkAs());
        Assertions.assertEquals("lrrqjioltdl", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.SKIPPED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("u", model.userProperties().get(0).name());
        Assertions.assertEquals("xhcxpzjewo", model.linkedServiceName().referenceName());
        Assertions.assertEquals(1411197523, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(false, model.policy().secureInput());
        Assertions.assertEquals(true, model.policy().secureOutput());
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
