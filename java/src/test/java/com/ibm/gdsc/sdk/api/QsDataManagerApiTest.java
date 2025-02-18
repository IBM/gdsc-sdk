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
import com.ibm.gdsc.sdk.models.Qspmdatamanagerv3AppDataResponse;
import com.ibm.gdsc.sdk.models.Qspmdatamanagerv3InsertEntitiesRequest;
import com.ibm.gdsc.sdk.models.Qspmdatamanagerv3MasterDataResponse;
import com.ibm.gdsc.sdk.models.Qspmdatamanagerv3NetlocDataResponse;
import com.ibm.gdsc.sdk.models.Qspmdatamanagerv3ScanRequest;
import com.ibm.gdsc.sdk.models.Qspmdatamanagerv3ScanResponse;
import com.ibm.gdsc.sdk.models.Qspmdatamanagerv3SearchEntityDataRequest;
import com.ibm.gdsc.sdk.models.Qspmdatamanagerv3SearchEntityDataResponse;
import com.ibm.gdsc.sdk.models.Qspmdatamanagerv3UpdateNetLocRequest;
import com.ibm.gdsc.sdk.models.Qspmdatamanagerv3UpdateNetLocResponse;
import com.ibm.gdsc.sdk.models.RuntimeError;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for QsDataManagerApi
 */
@Disabled
public class QsDataManagerApiTest {

    private final QsDataManagerApi api = new QsDataManagerApi();

    /**
     * Summary: Fetch Application Provisoning Details Description: Fetch details from app dimension entity for given provision id.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void qSDataManagerGetAppDataForProvisionIdTest() throws ApiException {
        String provisionId = null;
        Qspmdatamanagerv3AppDataResponse response = api.qSDataManagerGetAppDataForProvisionId(provisionId);
        // TODO: test validations
    }

    /**
     * Summary: master data for all entities Description: Retrieves All Dimension and Fact tables data.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void qSDataManagerGetMasterDataTest() throws ApiException {
        Qspmdatamanagerv3MasterDataResponse response = api.qSDataManagerGetMasterData();
        // TODO: test validations
    }

    /**
     * Summary: Fetch Netlocation Details Description: Fetch details from netloc dimension entity for a given scanid.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void qSDataManagerGetNetLocDimDataForScanIdTest() throws ApiException {
        String scanId = null;
        Qspmdatamanagerv3NetlocDataResponse response = api.qSDataManagerGetNetLocDimDataForScanId(scanId);
        // TODO: test validations
    }

    /**
     * Summary: Insert Data Description: Insert All Dimension and Fact tables data.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void qSDataManagerInsertAllEntitiesTest() throws ApiException {
        Qspmdatamanagerv3InsertEntitiesRequest qspmdatamanagerv3InsertEntitiesRequest = null;
        Object response = api.qSDataManagerInsertAllEntities(qspmdatamanagerv3InsertEntitiesRequest);
        // TODO: test validations
    }

    /**
     * Summary: Insert ScanDetails Description: Register new data into scan dimension table.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void qSDataManagerRegisterScanTest() throws ApiException {
        Qspmdatamanagerv3ScanRequest qspmdatamanagerv3ScanRequest = null;
        Qspmdatamanagerv3ScanResponse response = api.qSDataManagerRegisterScan(qspmdatamanagerv3ScanRequest);
        // TODO: test validations
    }

    /**
     * Summary: Fetch ScanDetails Description: Fetch details from scan dimension table.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void qSDataManagerRetrieveScanTest() throws ApiException {
        String scanId = null;
        Qspmdatamanagerv3ScanResponse response = api.qSDataManagerRetrieveScan(scanId);
        // TODO: test validations
    }

    /**
     * Summary: Retrieve Entity Data Description:Retrieve Entity data for given parameters
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void qSDataManagerSearchEntityDataTest() throws ApiException {
        Qspmdatamanagerv3SearchEntityDataRequest qspmdatamanagerv3SearchEntityDataRequest = null;
        Qspmdatamanagerv3SearchEntityDataResponse response = api.qSDataManagerSearchEntityData(qspmdatamanagerv3SearchEntityDataRequest);
        // TODO: test validations
    }

    /**
     * Summary: Update Netlocation Details Description: Update netloc dimension entity for agiven scanid.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void qSDataManagerUpdateNetLocationTest() throws ApiException {
        Qspmdatamanagerv3UpdateNetLocRequest qspmdatamanagerv3UpdateNetLocRequest = null;
        Qspmdatamanagerv3UpdateNetLocResponse response = api.qSDataManagerUpdateNetLocation(qspmdatamanagerv3UpdateNetLocRequest);
        // TODO: test validations
    }

}
