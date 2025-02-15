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
import com.ibm.gdsc.sdk.Complianceacceleratorv3CreateWorkspaceRequest;
import com.ibm.gdsc.sdk.Complianceacceleratorv3DeleteComplianceWorkspacesResponse;
import com.ibm.gdsc.sdk.Complianceacceleratorv3GetComplianceInfoResponse;
import com.ibm.gdsc.sdk.Complianceacceleratorv3HydrateComplianceWorkspacesRequest;
import com.ibm.gdsc.sdk.Complianceacceleratorv3HydrateComplianceWorkspacesResponse;
import com.ibm.gdsc.sdk.Complianceacceleratorv3StoreComplianceInfoRequest;
import com.ibm.gdsc.sdk.Complianceacceleratorv3StoreComplianceInfoResponse;
import com.ibm.gdsc.sdk.RuntimeError;
import com.ibm.gdsc.sdk.StreamResultOfComplianceacceleratorv3CreateWorkspaceResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ComplianceAcceleratorApi
 */
@Disabled
public class ComplianceAcceleratorApiTest {

    private final ComplianceAcceleratorApi api = new ComplianceAcceleratorApi();

    /**
     * Summary: Create workspace Description: Create a workspace.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void complianceAcceleratorCreateWorkspaceTest() throws ApiException {
        Complianceacceleratorv3CreateWorkspaceRequest complianceacceleratorv3CreateWorkspaceRequest = null;
        StreamResultOfComplianceacceleratorv3CreateWorkspaceResponse response = api.complianceAcceleratorCreateWorkspace(complianceacceleratorv3CreateWorkspaceRequest);
        // TODO: test validations
    }

    /**
     * Summary: Delete compliance workspaces Description: Delete workspaces.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void complianceAcceleratorDeleteComplianceWorkspacesTest() throws ApiException {
        List<String> regulations = null;
        Boolean deleteAll = null;
        Complianceacceleratorv3DeleteComplianceWorkspacesResponse response = api.complianceAcceleratorDeleteComplianceWorkspaces(regulations, deleteAll);
        // TODO: test validations
    }

    /**
     * Summary: Get compliance info Description: Return stored compliance data.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void complianceAcceleratorGetComplianceInfoTest() throws ApiException {
        Complianceacceleratorv3GetComplianceInfoResponse response = api.complianceAcceleratorGetComplianceInfo();
        // TODO: test validations
    }

    /**
     * HydrateWorkspace - Hydrates specified objects within a workspace
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void complianceAcceleratorHydrateWorkspaceTest() throws ApiException {
        Complianceacceleratorv3HydrateComplianceWorkspacesRequest complianceacceleratorv3HydrateComplianceWorkspacesRequest = null;
        Complianceacceleratorv3HydrateComplianceWorkspacesResponse response = api.complianceAcceleratorHydrateWorkspace(complianceacceleratorv3HydrateComplianceWorkspacesRequest);
        // TODO: test validations
    }

    /**
     * Summary: Store compliance info Description: Store compliance data.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void complianceAcceleratorStoreComplianceInfoTest() throws ApiException {
        Complianceacceleratorv3StoreComplianceInfoRequest complianceacceleratorv3StoreComplianceInfoRequest = null;
        Complianceacceleratorv3StoreComplianceInfoResponse response = api.complianceAcceleratorStoreComplianceInfo(complianceacceleratorv3StoreComplianceInfoRequest);
        // TODO: test validations
    }

}
