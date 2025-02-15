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


package com.ibm.gdsc.sdk;

import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.sdk.Ecosystemv3CreateDatasetRequest;
import com.ibm.gdsc.sdk.Ecosystemv3CreateDatasetResponse;
import com.ibm.gdsc.sdk.Ecosystemv3DataInsertRequest;
import com.ibm.gdsc.sdk.Ecosystemv3DataInsertResponse;
import com.ibm.gdsc.sdk.Ecosystemv3DeleteDatasetsResponse;
import com.ibm.gdsc.sdk.Ecosystemv3GetDatasetDataResponse;
import com.ibm.gdsc.sdk.Ecosystemv3GetDatasetDetailResponse;
import com.ibm.gdsc.sdk.Ecosystemv3GetDatasetsResponse;
import com.ibm.gdsc.sdk.Ecosystemv3GetPurgableRowsRequest;
import com.ibm.gdsc.sdk.Ecosystemv3GetPurgableRowsResponse;
import com.ibm.gdsc.sdk.Ecosystemv3PurgeDataResponse;
import java.time.OffsetDateTime;
import com.ibm.gdsc.sdk.RuntimeError;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EcosystemServiceApi
 */
@Disabled
public class EcosystemServiceApiTest {

    private final EcosystemServiceApi api = new EcosystemServiceApi();

    /**
     * Summary: Create dataset Description: Save a definition in the database.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ecosystemServiceCreateDatasetTest() throws ApiException {
        Ecosystemv3CreateDatasetRequest ecosystemv3CreateDatasetRequest = null;
        Ecosystemv3CreateDatasetResponse response = api.ecosystemServiceCreateDataset(ecosystemv3CreateDatasetRequest);
        // TODO: test validations
    }

    /**
     * Summary: Data insert Description: Process Data received from webhook API and insert.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ecosystemServiceDataInsertTest() throws ApiException {
        String datasetName = null;
        Ecosystemv3DataInsertRequest ecosystemv3DataInsertRequest = null;
        Ecosystemv3DataInsertResponse response = api.ecosystemServiceDataInsert(datasetName, ecosystemv3DataInsertRequest);
        // TODO: test validations
    }

    /**
     * Summary: Delete datasets Description: Delete an array of datasets.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ecosystemServiceDeleteDatasetsTest() throws ApiException {
        List<String> datasetNames = null;
        Ecosystemv3DeleteDatasetsResponse response = api.ecosystemServiceDeleteDatasets(datasetNames);
        // TODO: test validations
    }

    /**
     * Summary: Get dataset data Description: Return data report for a given dataset.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ecosystemServiceGetDatasetDataTest() throws ApiException {
        String datasetName = null;
        Long offset = null;
        Long limit = null;
        Boolean returnHeader = null;
        String field = null;
        String value = null;
        String sortField = null;
        String sortOrder = null;
        Ecosystemv3GetDatasetDataResponse response = api.ecosystemServiceGetDatasetData(datasetName, offset, limit, returnHeader, field, value, sortField, sortOrder);
        // TODO: test validations
    }

    /**
     * Summary: Get dataset detail Description: Return detail on a dataset definition.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ecosystemServiceGetDatasetDetailTest() throws ApiException {
        String datasetName = null;
        Ecosystemv3GetDatasetDetailResponse response = api.ecosystemServiceGetDatasetDetail(datasetName);
        // TODO: test validations
    }

    /**
     * Summary: Get datasets Description: Return dataset list that matches the specified filter.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ecosystemServiceGetDatasetsTest() throws ApiException {
        OffsetDateTime filterStartTime = null;
        OffsetDateTime filterEndTime = null;
        List<String> filterDatasetNames = null;
        Long offset = null;
        Long limit = null;
        Boolean includeFilterCounts = null;
        Ecosystemv3GetDatasetsResponse response = api.ecosystemServiceGetDatasets(filterStartTime, filterEndTime, filterDatasetNames, offset, limit, includeFilterCounts);
        // TODO: test validations
    }

    /**
     * Summary: Get purgable rows Description: Check the number of rows that can be purged.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ecosystemServiceGetPurgableRowsTest() throws ApiException {
        Ecosystemv3GetPurgableRowsRequest ecosystemv3GetPurgableRowsRequest = null;
        Ecosystemv3GetPurgableRowsResponse response = api.ecosystemServiceGetPurgableRows(ecosystemv3GetPurgableRowsRequest);
        // TODO: test validations
    }

    /**
     * Summary: Purge data Description: Purge data.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ecosystemServicePurgeDataTest() throws ApiException {
        List<String> datasetNames = null;
        Ecosystemv3PurgeDataResponse response = api.ecosystemServicePurgeData(datasetNames);
        // TODO: test validations
    }

}
