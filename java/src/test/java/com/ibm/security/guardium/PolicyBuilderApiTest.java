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


package com.ibm.security.guardium;

import com.ibm.security.ApiException;
import com.ibm.security.guardium.Policybuilderv3ClonePolicyRequest;
import com.ibm.security.guardium.Policybuilderv3CreateUpdatePolicyRequest;
import com.ibm.security.guardium.Policybuilderv3CreateUpdatePolicyResponse;
import com.ibm.security.guardium.Policybuilderv3DeleteGdpPolicySyncResponse;
import com.ibm.security.guardium.Policybuilderv3GetGdpPolicyMetaDataResponse;
import com.ibm.security.guardium.Policybuilderv3GetIntegrationCheckResponse;
import com.ibm.security.guardium.Policybuilderv3GetPoliciesGroupsResponse;
import com.ibm.security.guardium.Policybuilderv3GetPoliciesResponse;
import com.ibm.security.guardium.Policybuilderv3GetPolicyDetailsResponse;
import com.ibm.security.guardium.Policybuilderv3GetPolicyNamesFromRuleIDsRequest;
import com.ibm.security.guardium.Policybuilderv3GetPolicyNamesFromRuleIDsResponse;
import com.ibm.security.guardium.Policybuilderv3GetPolicySyncListResponse;
import com.ibm.security.guardium.Policybuilderv3GetReceiversResponse;
import com.ibm.security.guardium.Policybuilderv3GetRuleValidationRequest;
import com.ibm.security.guardium.Policybuilderv3InsertGdpPolicyMetaDataRequest;
import com.ibm.security.guardium.Policybuilderv3InsertGdpPolicyMetaDataResponse;
import com.ibm.security.guardium.Policybuilderv3InsertGdpPolicySyncRequest;
import com.ibm.security.guardium.Policybuilderv3InsertGdpPolicySyncResponse;
import com.ibm.security.guardium.Policybuilderv3InstallPoliciesRequest;
import com.ibm.security.guardium.Policybuilderv3RuleMetadataResponse;
import com.ibm.security.guardium.Policybuilderv3StandardCRUDResponse;
import com.ibm.security.guardium.Policybuilderv3StatusResponseBase;
import com.ibm.security.guardium.Policybuilderv3StorePolicyGdpRequest;
import com.ibm.security.guardium.Policybuilderv3StorePolicyGdpResponse;
import com.ibm.security.guardium.RuntimeError;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PolicyBuilderApi
 */
@Disabled
public class PolicyBuilderApiTest {

    private final PolicyBuilderApi api = new PolicyBuilderApi();

    /**
     * Summary: Clone policy Description: Clone a policy.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policyBuilderClonePolicyTest() throws ApiException {
        String policyId = null;
        Policybuilderv3ClonePolicyRequest policybuilderv3ClonePolicyRequest = null;
        Policybuilderv3StandardCRUDResponse response = api.policyBuilderClonePolicy(policyId, policybuilderv3ClonePolicyRequest);
        // TODO: test validations
    }

    /**
     * Summary: Create policy Description: Create Policy returns response code and message.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policyBuilderCreatePolicyTest() throws ApiException {
        Policybuilderv3CreateUpdatePolicyRequest policybuilderv3CreateUpdatePolicyRequest = null;
        Policybuilderv3CreateUpdatePolicyResponse response = api.policyBuilderCreatePolicy(policybuilderv3CreateUpdatePolicyRequest);
        // TODO: test validations
    }

    /**
     * Summary: Delete GDP policy sync entry Description: Deletes GDP policy from sync collection
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policyBuilderDeleteGdpSyncEntryTest() throws ApiException {
        List<String> syncIds = null;
        Policybuilderv3DeleteGdpPolicySyncResponse response = api.policyBuilderDeleteGdpSyncEntry(syncIds);
        // TODO: test validations
    }

    /**
     * Summary: Delete policies Description: Delete Policy returns response code and message.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policyBuilderDeletePoliciesTest() throws ApiException {
        List<String> policyIds = null;
        Policybuilderv3StandardCRUDResponse response = api.policyBuilderDeletePolicies(policyIds);
        // TODO: test validations
    }

    /**
     * Summary: Get GDP policy summary information Description: Get GDP&#39;s CM&#39;s policy summary from mogodb
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policyBuilderGetGdpPolicyMetaDataTest() throws ApiException {
        Policybuilderv3GetGdpPolicyMetaDataResponse response = api.policyBuilderGetGdpPolicyMetaData();
        // TODO: test validations
    }

    /**
     * Summary: Get policies Description: Return a list of policies to the caller.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policyBuilderGetPoliciesTest() throws ApiException {
        Policybuilderv3GetPoliciesResponse response = api.policyBuilderGetPolicies();
        // TODO: test validations
    }

    /**
     * Summary: Get policy details Description: Return a list of rules inside the policy.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policyBuilderGetPolicyDetailsTest() throws ApiException {
        String policyId = null;
        Policybuilderv3GetPolicyDetailsResponse response = api.policyBuilderGetPolicyDetails(policyId);
        // TODO: test validations
    }

    /**
     * Summary: GetPolicy names from rule IDs Description: Return a map where the key is the rule ID and value is the policy name that has the rule ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policyBuilderGetPolicyNamesFromRuleIDsTest() throws ApiException {
        Policybuilderv3GetPolicyNamesFromRuleIDsRequest policybuilderv3GetPolicyNamesFromRuleIDsRequest = null;
        Policybuilderv3GetPolicyNamesFromRuleIDsResponse response = api.policyBuilderGetPolicyNamesFromRuleIDs(policybuilderv3GetPolicyNamesFromRuleIDsRequest);
        // TODO: test validations
    }

    /**
     * Summary: Get list of synced polices Description: Returns the list and status of sync entries
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policyBuilderGetPolicySyncListTest() throws ApiException {
        Policybuilderv3GetPolicySyncListResponse response = api.policyBuilderGetPolicySyncList();
        // TODO: test validations
    }

    /**
     * Summary: Get receivers Description: Get all the receivers associated with actions.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policyBuilderGetReceiversTest() throws ApiException {
        List<String> actionId = null;
        Boolean validateCache = null;
        Policybuilderv3GetReceiversResponse response = api.policyBuilderGetReceivers(actionId, validateCache);
        // TODO: test validations
    }

    /**
     * Summary: Get rule metadata Description: Return a list of rule parameters and actions to the caller.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policyBuilderGetRuleMetadataTest() throws ApiException {
        String ruleType = null;
        Policybuilderv3RuleMetadataResponse response = api.policyBuilderGetRuleMetadata(ruleType);
        // TODO: test validations
    }

    /**
     * Summary: Insert GDP policy sync entry Description: Inserts GDP policy&#39;s name into sync collection
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policyBuilderInsertGdpPolicyTest() throws ApiException {
        Policybuilderv3InsertGdpPolicySyncRequest policybuilderv3InsertGdpPolicySyncRequest = null;
        Policybuilderv3InsertGdpPolicySyncResponse response = api.policyBuilderInsertGdpPolicy(policybuilderv3InsertGdpPolicySyncRequest);
        // TODO: test validations
    }

    /**
     * Summary: Insert GDP policy summaries Description: Inserts GDP&#39;s CM&#39;s policy summary information into mogodb. (This API is called from GDP only)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policyBuilderInsertGdpPolicyMetaDataTest() throws ApiException {
        String centralManagerId = null;
        Policybuilderv3InsertGdpPolicyMetaDataRequest policybuilderv3InsertGdpPolicyMetaDataRequest = null;
        Policybuilderv3InsertGdpPolicyMetaDataResponse response = api.policyBuilderInsertGdpPolicyMetaData(centralManagerId, policybuilderv3InsertGdpPolicyMetaDataRequest);
        // TODO: test validations
    }

    /**
     * Summary: Install policies Description: Activate Policies request performs activations.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policyBuilderInstallPoliciesTest() throws ApiException {
        Policybuilderv3InstallPoliciesRequest policybuilderv3InstallPoliciesRequest = null;
        Policybuilderv3StatusResponseBase response = api.policyBuilderInstallPolicies(policybuilderv3InstallPoliciesRequest);
        // TODO: test validations
    }

    /**
     * Summary: Integration check Description: Check if integration id is being used in policies.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policyBuilderIntegrationCheckTest() throws ApiException {
        String integrationId = null;
        String templateId = null;
        Policybuilderv3GetIntegrationCheckResponse response = api.policyBuilderIntegrationCheck(integrationId, templateId);
        // TODO: test validations
    }

    /**
     * Summary: Policies groups Description: Get policy groups.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policyBuilderPoliciesGroupsTest() throws ApiException {
        List<String> groupIds = null;
        Policybuilderv3GetPoliciesGroupsResponse response = api.policyBuilderPoliciesGroups(groupIds);
        // TODO: test validations
    }

    /**
     * Summary: Rule validation Description: Validate a rule parameters and actions.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policyBuilderRuleValidationTest() throws ApiException {
        Policybuilderv3GetRuleValidationRequest policybuilderv3GetRuleValidationRequest = null;
        Policybuilderv3StandardCRUDResponse response = api.policyBuilderRuleValidation(policybuilderv3GetRuleValidationRequest);
        // TODO: test validations
    }

    /**
     * Summary: Store policies Gdp Description: Store policies.  (This API is called from GDP only)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policyBuilderStorePoliciesGdpTest() throws ApiException {
        String centralManagerId = null;
        Policybuilderv3StorePolicyGdpRequest policybuilderv3StorePolicyGdpRequest = null;
        Policybuilderv3StorePolicyGdpResponse response = api.policyBuilderStorePoliciesGdp(centralManagerId, policybuilderv3StorePolicyGdpRequest);
        // TODO: test validations
    }

}
