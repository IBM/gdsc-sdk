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
import com.ibm.gdsc.sdk.models.Authenticate400Response;
import java.math.BigDecimal;
import com.ibm.gdsc.sdk.models.LastSeenSortSchema;
import com.ibm.gdsc.sdk.models.ListSensitivities200Response;
import com.ibm.gdsc.sdk.models.ListSensitivitiesFilterParameter;
import com.ibm.gdsc.sdk.models.SensitivitiesSummary;
import com.ibm.gdsc.sdk.models.Sensitivity;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DataSensitivitiesApi
 */
@Disabled
public class DataSensitivitiesApiTest {

    private final DataSensitivitiesApi api = new DataSensitivitiesApi();

    /**
     * Get the summary of sensitivities
     *
     * Get a summarised information about all sensitivities classified by Guardium Insights SaaS DSPM.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSensitivitiesSummaryTest() throws ApiException {
        ListSensitivitiesFilterParameter filter = null;
        SensitivitiesSummary response = api.getSensitivitiesSummary(filter);
        // TODO: test validations
    }

    /**
     * Get sensitivity details by providing its ID
     *
     * Get details of a sensitivity by providing its ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSensitivityTest() throws ApiException {
        String sensitivityId = null;
        Sensitivity response = api.getSensitivity(sensitivityId);
        // TODO: test validations
    }

    /**
     * List sensitivities
     *
     * Get a list of all the sensitivities based on an applied filter.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listSensitivitiesTest() throws ApiException {
        ListSensitivitiesFilterParameter filter = null;
        LastSeenSortSchema sort = null;
        BigDecimal pageSize = null;
        String nextToken = null;
        ListSensitivities200Response response = api.listSensitivities(filter, sort, pageSize, nextToken);
        // TODO: test validations
    }

}
