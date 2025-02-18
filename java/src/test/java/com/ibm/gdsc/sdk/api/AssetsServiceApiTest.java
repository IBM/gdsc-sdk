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
import com.ibm.gdsc.sdk.models.Assetsv3AssetFilterTemplateRequest;
import com.ibm.gdsc.sdk.models.Assetsv3AssetIngestionRequest;
import com.ibm.gdsc.sdk.models.Assetsv3AssetIngestionResponse;
import com.ibm.gdsc.sdk.models.Assetsv3AssetOverviewResponse;
import com.ibm.gdsc.sdk.models.Assetsv3ClonePolicyRequest;
import com.ibm.gdsc.sdk.models.Assetsv3CreateUpdatePolicyRequest;
import com.ibm.gdsc.sdk.models.Assetsv3CreateUpdatePolicyResponse;
import com.ibm.gdsc.sdk.models.Assetsv3FetchAssetChangeLogRequest;
import com.ibm.gdsc.sdk.models.Assetsv3FetchAssetChangeLogResponse;
import com.ibm.gdsc.sdk.models.Assetsv3FetchAssetDashboardResponse;
import com.ibm.gdsc.sdk.models.Assetsv3FetchAssetListRequest;
import com.ibm.gdsc.sdk.models.Assetsv3FetchAssetListResponse;
import com.ibm.gdsc.sdk.models.Assetsv3FetchAssetsForMergeSplitResponse;
import com.ibm.gdsc.sdk.models.Assetsv3FindAssetNameResponse;
import com.ibm.gdsc.sdk.models.Assetsv3GetAssetTopologyRequest;
import com.ibm.gdsc.sdk.models.Assetsv3GetAssetTopologyResponse;
import com.ibm.gdsc.sdk.models.Assetsv3GetFilterTemplateResponse;
import com.ibm.gdsc.sdk.models.Assetsv3GetFiltersDataResponse;
import com.ibm.gdsc.sdk.models.Assetsv3ListPolicyResponse;
import com.ibm.gdsc.sdk.models.Assetsv3ListRuleResponse;
import com.ibm.gdsc.sdk.models.Assetsv3ListTagDomainsResponse;
import com.ibm.gdsc.sdk.models.Assetsv3ListTagsResponse;
import com.ibm.gdsc.sdk.models.Assetsv3MergeOrSplitAssetsRequest;
import com.ibm.gdsc.sdk.models.Assetsv3SaveAssignedTagsRequest;
import com.ibm.gdsc.sdk.models.Assetsv3SaveTagConceptDataRequest;
import com.ibm.gdsc.sdk.models.Assetsv3SaveTagDomainDataRequest;
import com.ibm.gdsc.sdk.models.Assetsv3SaveUpdateFilterTemplateRequest;
import com.ibm.gdsc.sdk.models.Assetsv3SaveUpdateFilterTemplateResponse;
import com.ibm.gdsc.sdk.models.Assetsv3SetBannerStateRequest;
import com.ibm.gdsc.sdk.models.Assetsv3UpdateAssetNameRequest;
import com.ibm.gdsc.sdk.models.Assetsv3UpdatePolicyRequest;
import com.ibm.gdsc.sdk.models.RuntimeError;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AssetsServiceApi
 */
@Disabled
public class AssetsServiceApiTest {

    private final AssetsServiceApi api = new AssetsServiceApi();

    /**
     * AssetIngestion - Asset Ingestion Api to ingest assets from different applications including asset extensibility assets.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void assetsServiceAssetIngestionTest() throws ApiException {
        Assetsv3AssetIngestionRequest assetsv3AssetIngestionRequest = null;
        Assetsv3AssetIngestionResponse response = api.assetsServiceAssetIngestion(assetsv3AssetIngestionRequest);
        // TODO: test validations
    }

    /**
     * AssetIngestionManualTrigger - Manual trigger for Scheduled Asset Ingestion of databases.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void assetsServiceAssetIngestionManualTriggerTest() throws ApiException {
        Object body = null;
        Assetsv3AssetIngestionResponse response = api.assetsServiceAssetIngestionManualTrigger(body);
        // TODO: test validations
    }

    /**
     * ClonePolicy - Clone a policy.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void assetsServiceClonePolicyTest() throws ApiException {
        String policyId = null;
        Assetsv3ClonePolicyRequest assetsv3ClonePolicyRequest = null;
        Object response = api.assetsServiceClonePolicy(policyId, assetsv3ClonePolicyRequest);
        // TODO: test validations
    }

    /**
     * CreateUpdatePolicy - Create/update new Policy.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void assetsServiceCreateUpdatePolicyTest() throws ApiException {
        Assetsv3CreateUpdatePolicyRequest assetsv3CreateUpdatePolicyRequest = null;
        Assetsv3CreateUpdatePolicyResponse response = api.assetsServiceCreateUpdatePolicy(assetsv3CreateUpdatePolicyRequest);
        // TODO: test validations
    }

    /**
     * DeleteFilterTemplateForAssets - Deleting a template using TemplateID in manage assets.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void assetsServiceDeleteFilterTemplateForAssetsTest() throws ApiException {
        String templateId = null;
        Assetsv3AssetFilterTemplateRequest assetsv3AssetFilterTemplateRequest = null;
        Object response = api.assetsServiceDeleteFilterTemplateForAssets(templateId, assetsv3AssetFilterTemplateRequest);
        // TODO: test validations
    }

    /**
     * DeletePolicies - Delete Policy returns response code and message.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void assetsServiceDeletePoliciesTest() throws ApiException {
        List<String> policyIds = null;
        Object response = api.assetsServiceDeletePolicies(policyIds);
        // TODO: test validations
    }

    /**
     * FetchAssetChangeLog - Fetch the logs for any actions performed on assets.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void assetsServiceFetchAssetChangeLogTest() throws ApiException {
        Assetsv3FetchAssetChangeLogRequest assetsv3FetchAssetChangeLogRequest = null;
        Assetsv3FetchAssetChangeLogResponse response = api.assetsServiceFetchAssetChangeLog(assetsv3FetchAssetChangeLogRequest);
        // TODO: test validations
    }

    /**
     * FetchAssetDashboard - Gets Filter Templates for Dshboard Widgets.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void assetsServiceFetchAssetDashboardTest() throws ApiException {
        String widgetType = null;
        String dateRangeStart = null;
        String dateRangeEnd = null;
        String dateRangeType = null;
        String dateRangeKey = null;
        String dateRangeError = null;
        Integer dateRangeStartNumber = null;
        String dateRangeStartUnit = null;
        Integer dateRangeEndNumber = null;
        String dateRangeEndUnit = null;
        String timelineValueSelected = null;
        String tagId = null;
        Assetsv3FetchAssetDashboardResponse response = api.assetsServiceFetchAssetDashboard(widgetType, dateRangeStart, dateRangeEnd, dateRangeType, dateRangeKey, dateRangeError, dateRangeStartNumber, dateRangeStartUnit, dateRangeEndNumber, dateRangeEndUnit, timelineValueSelected, tagId);
        // TODO: test validations
    }

    /**
     * FetchAssetList - Asset Fetch Api .
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void assetsServiceFetchAssetListTest() throws ApiException {
        Assetsv3FetchAssetListRequest assetsv3FetchAssetListRequest = null;
        Assetsv3FetchAssetListResponse response = api.assetsServiceFetchAssetList(assetsv3FetchAssetListRequest);
        // TODO: test validations
    }

    /**
     * FetchAssetsForMergeSplit : Fetch assets for Merge and Split.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void assetsServiceFetchAssetsForMergeSplitTest() throws ApiException {
        String assetId = null;
        Integer pageNumber = null;
        Integer pageSize = null;
        String action = null;
        String searchKey = null;
        Assetsv3FetchAssetsForMergeSplitResponse response = api.assetsServiceFetchAssetsForMergeSplit(assetId, pageNumber, pageSize, action, searchKey);
        // TODO: test validations
    }

    /**
     * FindAssetName - Checks if the given Asset Name has already been assigned to an asset.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void assetsServiceFindAssetNameTest() throws ApiException {
        String assetName = null;
        Assetsv3FindAssetNameResponse response = api.assetsServiceFindAssetName(assetName);
        // TODO: test validations
    }

    /**
     * GetAssetOverview - Get asset overview widgets data for a particular asset.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void assetsServiceGetAssetOverviewTest() throws ApiException {
        String assetId = null;
        Integer pageNumber = null;
        Integer size = null;
        String widget = null;
        String ip = null;
        String host = null;
        String database = null;
        String assetEntityType = null;
        Assetsv3AssetOverviewResponse response = api.assetsServiceGetAssetOverview(assetId, pageNumber, size, widget, ip, host, database, assetEntityType);
        // TODO: test validations
    }

    /**
     * GetAssetTopology- Get list of topology for a parent asset.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void assetsServiceGetAssetTopologyTest() throws ApiException {
        Assetsv3GetAssetTopologyRequest assetsv3GetAssetTopologyRequest = null;
        Assetsv3GetAssetTopologyResponse response = api.assetsServiceGetAssetTopology(assetsv3GetAssetTopologyRequest);
        // TODO: test validations
    }

    /**
     * GetFilterTemplateForAssets - Get list of filters query templates for manage assets.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void assetsServiceGetFilterTemplateForAssetsTest() throws ApiException {
        String templateId = null;
        Assetsv3GetFilterTemplateResponse response = api.assetsServiceGetFilterTemplateForAssets(templateId);
        // TODO: test validations
    }

    /**
     * GetFiltersForAssets - Get a list of filters category and sub category with all data.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void assetsServiceGetFiltersForAssetsTest() throws ApiException {
        Assetsv3GetFiltersDataResponse response = api.assetsServiceGetFiltersForAssets();
        // TODO: test validations
    }

    /**
     * ListPolicy - List all policies.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void assetsServiceListPolicyTest() throws ApiException {
        Assetsv3ListPolicyResponse response = api.assetsServiceListPolicy();
        // TODO: test validations
    }

    /**
     * ListRule - List all rules for a policy.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void assetsServiceListRuleTest() throws ApiException {
        String policyId = null;
        Assetsv3ListRuleResponse response = api.assetsServiceListRule(policyId);
        // TODO: test validations
    }

    /**
     * ListTagDomains - Get Tag categories by request parameters .
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void assetsServiceListTagDomainsTest() throws ApiException {
        String domGrouper = null;
        String purpose = null;
        Boolean needTag = null;
        Assetsv3ListTagDomainsResponse response = api.assetsServiceListTagDomains(domGrouper, purpose, needTag);
        // TODO: test validations
    }

    /**
     * ListTags - Get Tags for Manage Tags listing screen .
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void assetsServiceListTagsTest() throws ApiException {
        List<String> assetId = null;
        Assetsv3ListTagsResponse response = api.assetsServiceListTags(assetId);
        // TODO: test validations
    }

    /**
     * MergeOrSplitAssets - Merge or split the selected assets.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void assetsServiceMergeOrSplitAssetsTest() throws ApiException {
        Assetsv3MergeOrSplitAssetsRequest assetsv3MergeOrSplitAssetsRequest = null;
        Object response = api.assetsServiceMergeOrSplitAssets(assetsv3MergeOrSplitAssetsRequest);
        // TODO: test validations
    }

    /**
     * SaveAssignedTags - Save Assigned Tags to TAG_DSDEF_MAP table.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void assetsServiceSaveAssignedTagsTest() throws ApiException {
        Assetsv3SaveAssignedTagsRequest assetsv3SaveAssignedTagsRequest = null;
        Object response = api.assetsServiceSaveAssignedTags(assetsv3SaveAssignedTagsRequest);
        // TODO: test validations
    }

    /**
     * SaveTagConceptData - creates a custom tag
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void assetsServiceSaveTagConceptDataTest() throws ApiException {
        Assetsv3SaveTagConceptDataRequest assetsv3SaveTagConceptDataRequest = null;
        Object response = api.assetsServiceSaveTagConceptData(assetsv3SaveTagConceptDataRequest);
        // TODO: test validations
    }

    /**
     * SaveTagDomainData - creates a custom category to be assigned to a tag
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void assetsServiceSaveTagDomainDataTest() throws ApiException {
        Assetsv3SaveTagDomainDataRequest assetsv3SaveTagDomainDataRequest = null;
        Object response = api.assetsServiceSaveTagDomainData(assetsv3SaveTagDomainDataRequest);
        // TODO: test validations
    }

    /**
     * SaveUpdateFilterTemplateForAssets - Save/Update a filters query to use as template in manage assets along with reordering of template list.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void assetsServiceSaveUpdateFilterTemplateForAssetsTest() throws ApiException {
        Assetsv3SaveUpdateFilterTemplateRequest assetsv3SaveUpdateFilterTemplateRequest = null;
        Assetsv3SaveUpdateFilterTemplateResponse response = api.assetsServiceSaveUpdateFilterTemplateForAssets(assetsv3SaveUpdateFilterTemplateRequest);
        // TODO: test validations
    }

    /**
     * SetBannerState - Set banner state for asset inventory page.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void assetsServiceSetBannerStateTest() throws ApiException {
        Assetsv3SetBannerStateRequest assetsv3SetBannerStateRequest = null;
        Object response = api.assetsServiceSetBannerState(assetsv3SetBannerStateRequest);
        // TODO: test validations
    }

    /**
     * UpdateAssetName - Udates the name of the asset as given by the user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void assetsServiceUpdateAssetNameTest() throws ApiException {
        Assetsv3UpdateAssetNameRequest assetsv3UpdateAssetNameRequest = null;
        Object response = api.assetsServiceUpdateAssetName(assetsv3UpdateAssetNameRequest);
        // TODO: test validations
    }

    /**
     * UpdatePolicy - Update existing Policy status.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void assetsServiceUpdatePolicyTest() throws ApiException {
        Assetsv3UpdatePolicyRequest assetsv3UpdatePolicyRequest = null;
        Object response = api.assetsServiceUpdatePolicy(assetsv3UpdatePolicyRequest);
        // TODO: test validations
    }

}
