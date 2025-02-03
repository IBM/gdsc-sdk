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
import org.openapitools.client.model.Outliersenginev3GetSourceStatisticsResponse;
import org.openapitools.client.model.Outliersenginev3GetWorkingHoursPeriodsResponse;
import org.openapitools.client.model.Outliersenginev3OutlierResponse;
import org.openapitools.client.model.Outliersenginev3RunSimulatorRequest;
import org.openapitools.client.model.Outliersenginev3StatisticsResponse;
import org.openapitools.client.model.Outliersenginev3UpdateWorkingHoursPeriodsRequest;
import org.openapitools.client.model.RpcStatus;
import org.openapitools.client.model.RuntimeError;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OutliersEngineApi
 */
@Disabled
public class OutliersEngineApiTest {

    private final OutliersEngineApi api = new OutliersEngineApi();

    /**
     * Summary: Get source statistics Description: Return statistics regarding the input source, including distribution of verbs, source program, working hours etc.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void outliersEngineGetSourceStatisticsTest() throws ApiException {
        String sourceServerIp = null;
        String sourceDatabaseName = null;
        String sourceDbUser = null;
        Integer attributesLimit = null;
        Outliersenginev3GetSourceStatisticsResponse response = api.outliersEngineGetSourceStatistics(sourceServerIp, sourceDatabaseName, sourceDbUser, attributesLimit);
        // TODO: test validations
    }

    /**
     * Summary: Get statistics Description: Return statistics regarding number of outliers, clusters and un/completed periods.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void outliersEngineGetStatisticsTest() throws ApiException {
        Outliersenginev3StatisticsResponse response = api.outliersEngineGetStatistics();
        // TODO: test validations
    }

    /**
     * Summary: Get working hours periods Description: Get a list of the working hours periods.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void outliersEngineGetWorkingHoursPeriodsTest() throws ApiException {
        Outliersenginev3GetWorkingHoursPeriodsResponse response = api.outliersEngineGetWorkingHoursPeriods();
        // TODO: test validations
    }

    /**
     * Summary: Run simulator Description: Run outlier simulator.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void outliersEngineRunSimulatorTest() throws ApiException {
        Outliersenginev3RunSimulatorRequest outliersenginev3RunSimulatorRequest = null;
        RpcStatus response = api.outliersEngineRunSimulator(outliersenginev3RunSimulatorRequest);
        // TODO: test validations
    }

    /**
     * Summary: Update working hours periods Description: Update the working hours periods values.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void outliersEngineUpdateWorkingHoursPeriodsTest() throws ApiException {
        Outliersenginev3UpdateWorkingHoursPeriodsRequest outliersenginev3UpdateWorkingHoursPeriodsRequest = null;
        Outliersenginev3OutlierResponse response = api.outliersEngineUpdateWorkingHoursPeriods(outliersenginev3UpdateWorkingHoursPeriodsRequest);
        // TODO: test validations
    }

    /**
     * Summary: Upload and analyze period Description: Run outliers detection on ready periods.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void outliersEngineUploadAndAnalyzePeriodTest() throws ApiException {
        Object body = null;
        RpcStatus response = api.outliersEngineUploadAndAnalyzePeriod(body);
        // TODO: test validations
    }

    /**
     * Summary: User clustering Description: Run user-clustering on current sources.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void outliersEngineUserClusteringTest() throws ApiException {
        Object body = null;
        RpcStatus response = api.outliersEngineUserClustering(body);
        // TODO: test validations
    }

}
