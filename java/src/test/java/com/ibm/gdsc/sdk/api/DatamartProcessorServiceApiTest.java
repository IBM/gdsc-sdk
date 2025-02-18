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
import com.ibm.gdsc.sdk.models.Datamartprocessorv3DMExtractionLogsRequest;
import com.ibm.gdsc.sdk.models.Datamartprocessorv3DMExtractionLogsResponse;
import com.ibm.gdsc.sdk.models.Datamartprocessorv3GetDatamartInfoResponse;
import com.ibm.gdsc.sdk.models.Datamartprocessorv3GetDatamartResponse;
import com.ibm.gdsc.sdk.models.Datamartprocessorv3GetEarliestStartTimeResponse;
import com.ibm.gdsc.sdk.models.Datamartprocessorv3StatusResponseBase;
import java.io.File;
import java.time.OffsetDateTime;
import com.ibm.gdsc.sdk.models.RuntimeError;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DatamartProcessorServiceApi
 */
@Disabled
public class DatamartProcessorServiceApiTest {

    private final DatamartProcessorServiceApi api = new DatamartProcessorServiceApi();

    /**
     * Summary: Get datamarts Description: Return a list of files inside a datamart to the caller.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void datamartProcessorServiceGetDatamartInfoTest() throws ApiException {
        String ingestionId = null;
        Datamartprocessorv3GetDatamartInfoResponse response = api.datamartProcessorServiceGetDatamartInfo(ingestionId);
        // TODO: test validations
    }

    /**
     * Summary: Get datamarts Description: Return a list of datamarts for a time interval to the caller.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void datamartProcessorServiceGetDatamartsTest() throws ApiException {
        OffsetDateTime periodStart = null;
        OffsetDateTime periodEnd = null;
        Datamartprocessorv3GetDatamartResponse response = api.datamartProcessorServiceGetDatamarts(periodStart, periodEnd);
        // TODO: test validations
    }

    /**
     * Summary: Get rarliest start time Description: Return the earliest time period of data available in database.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void datamartProcessorServiceGetEarliestStartTimeTest() throws ApiException {
        Datamartprocessorv3GetEarliestStartTimeResponse response = api.datamartProcessorServiceGetEarliestStartTime();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void datamartProcessorServiceSendAllCompleteFilesToQueueTest() throws ApiException {
        Object body = null;
        Datamartprocessorv3StatusResponseBase response = api.datamartProcessorServiceSendAllCompleteFilesToQueue(body);
        // TODO: test validations
    }

    /**
     * Summary: Store extraction logs Description: Store the datamart extraction logs inside GI.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void datamartProcessorServiceStoreExtractionLogsTest() throws ApiException {
        String requestId = null;
        Datamartprocessorv3DMExtractionLogsRequest datamartprocessorv3DMExtractionLogsRequest = null;
        Datamartprocessorv3DMExtractionLogsResponse response = api.datamartProcessorServiceStoreExtractionLogs(requestId, datamartprocessorv3DMExtractionLogsRequest);
        // TODO: test validations
    }

    /**
     * Summary: Upload datamart Description: Upload datamart file for ingestion.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void uploadDatamartTest() throws ApiException {
        File _file = null;
        api.uploadDatamart(_file);
        // TODO: test validations
    }

}
