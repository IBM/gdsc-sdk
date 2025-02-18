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


package com.ibm.gdsc.sdk;

import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.sdk.RuntimeError;
import com.ibm.gdsc.sdk.Streamsv3CheckAWSCredentialsRequest;
import com.ibm.gdsc.sdk.Streamsv3CheckAWSCredentialsResponse;
import com.ibm.gdsc.sdk.Streamsv3CheckAzureEventHubRequest;
import com.ibm.gdsc.sdk.Streamsv3CheckAzureEventHubResponse;
import com.ibm.gdsc.sdk.Streamsv3CheckAzureStorageStringRequest;
import com.ibm.gdsc.sdk.Streamsv3CheckAzureStorageStringResponse;
import com.ibm.gdsc.sdk.Streamsv3GetAWSRegionsResponse;
import com.ibm.gdsc.sdk.Streamsv3ListAWSStreamsRequest;
import com.ibm.gdsc.sdk.Streamsv3ListAWSStreamsResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StreamsServiceApi
 */
@Disabled
public class StreamsServiceApiTest {

    private final StreamsServiceApi api = new StreamsServiceApi();

    /**
     * Summary: Check AWS credentials Description: Service to verify AWS credentials.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void streamsServiceCheckAWSCredentialsTest() throws ApiException {
        Streamsv3CheckAWSCredentialsRequest streamsv3CheckAWSCredentialsRequest = null;
        Streamsv3CheckAWSCredentialsResponse response = api.streamsServiceCheckAWSCredentials(streamsv3CheckAWSCredentialsRequest);
        // TODO: test validations
    }

    /**
     * Summary: Check Azure event hub Description: Service to check Azure event hub.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void streamsServiceCheckAzureEventHubTest() throws ApiException {
        Streamsv3CheckAzureEventHubRequest streamsv3CheckAzureEventHubRequest = null;
        Streamsv3CheckAzureEventHubResponse response = api.streamsServiceCheckAzureEventHub(streamsv3CheckAzureEventHubRequest);
        // TODO: test validations
    }

    /**
     * Summary: Check Azure storage string Description: Service to verify Azure storage connection.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void streamsServiceCheckAzureStorageStringTest() throws ApiException {
        Streamsv3CheckAzureStorageStringRequest streamsv3CheckAzureStorageStringRequest = null;
        Streamsv3CheckAzureStorageStringResponse response = api.streamsServiceCheckAzureStorageString(streamsv3CheckAzureStorageStringRequest);
        // TODO: test validations
    }

    /**
     * Summary: Get AWS regions Description: Service to get AWS regions.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void streamsServiceGetAWSRegionsTest() throws ApiException {
        Streamsv3GetAWSRegionsResponse response = api.streamsServiceGetAWSRegions();
        // TODO: test validations
    }

    /**
     * Summary: List AWS streams Description: Service to list AWS Kinesis streams.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void streamsServiceListAWSStreamsTest() throws ApiException {
        Streamsv3ListAWSStreamsRequest streamsv3ListAWSStreamsRequest = null;
        Streamsv3ListAWSStreamsResponse response = api.streamsServiceListAWSStreams(streamsv3ListAWSStreamsRequest);
        // TODO: test validations
    }

}
