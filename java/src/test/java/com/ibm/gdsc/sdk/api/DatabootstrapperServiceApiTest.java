/*
 * IBM Guardium Data Security Center
 * Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.
 *
 * The version of the OpenAPI document: 3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ibm.gdsc.sdk.api;

import com.ibm.gdsc.sdk.ApiException;
import com.ibm.gdsc.sdk.models.Databootstrapperv3LoadDataRequest;
import com.ibm.gdsc.sdk.models.Databootstrapperv3LoadDataResponse;
import com.ibm.gdsc.sdk.models.RuntimeError;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DatabootstrapperServiceApi
 */
@Disabled
public class DatabootstrapperServiceApiTest {

    private final DatabootstrapperServiceApi api = new DatabootstrapperServiceApi();

    /**
     * Summary: Load data Description: Load data for a tenant.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void databootstrapperServiceLoadDataTest() throws ApiException {
        Databootstrapperv3LoadDataRequest databootstrapperv3LoadDataRequest = null;
        Databootstrapperv3LoadDataResponse response = api.databootstrapperServiceLoadData(databootstrapperv3LoadDataRequest);
        // TODO: test validations
    }

}
