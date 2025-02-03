/*
 * IBM Guardium Data Security Center
 * IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.
 *
 * The version of the OpenAPI document: 3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.Authenticate400Response;
import java.math.BigDecimal;
import org.openapitools.client.model.LastSeenSortSchema;
import org.openapitools.client.model.ListSensitivities200Response;
import org.openapitools.client.model.ListSensitivitiesFilterParameter;
import org.openapitools.client.model.SensitivitiesSummary;
import org.openapitools.client.model.Sensitivity;
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
