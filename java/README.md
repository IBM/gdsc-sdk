# IBM Guardium Data Security Center Java client

## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.ibm.gdsc.sdk</groupId>
  <artifactId>com.ibm.gdsc.sdk.software</artifactId>
  <version>3.6.1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'com.ibm.gdsc.sdk.software' jar has been published to maven central.
    mavenLocal()       // Needed if the 'com.ibm.gdsc.sdk.software' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "com.ibm.gdsc.sdk:com.ibm.gdsc.sdk.software:3.6.1"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/com.ibm.gdsc.sdk.software-3.6.1.jar`
* `target/lib/*.jar`

## Getting Started
  IBM Guardium Data Secruity center must be running. You need to get a API key or userID and password from there.

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.AnalyticsEventsServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AnalyticsEventsServiceApi apiInstance = new AnalyticsEventsServiceApi(defaultClient);
    String cacheKey = "cacheKey_example"; // String | The cache key to delete.
    Analyticseventsv3DeleteCacheKeyRequest analyticseventsv3DeleteCacheKeyRequest = new Analyticseventsv3DeleteCacheKeyRequest(); // Analyticseventsv3DeleteCacheKeyRequest | 
    try {
      Analyticseventsv3DeleteCacheKeyResponse result = apiInstance.analyticsEventsServiceDeleteCacheKey(cacheKey, analyticseventsv3DeleteCacheKeyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalyticsEventsServiceApi#analyticsEventsServiceDeleteCacheKey");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

<details><summary>Documentation for API Endpoints</summary>

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AnalyticsEventsServiceApi* | [**analyticsEventsServiceDeleteCacheKey**](docs/AnalyticsEventsServiceApi.md#analyticsEventsServiceDeleteCacheKey) | **DELETE** /api/v3/eventscache/{cache_key} | Summary: Delete cache key Description: Return delete key result message.
*AnalyticsEventsServiceApi* | [**analyticsEventsServicePostQSAdvisorRisk**](docs/AnalyticsEventsServiceApi.md#analyticsEventsServicePostQSAdvisorRisk) | **POST** /api/v3/risk/qs_advisor | Summary: For QS Advisor risk notification only Description: Sends QS Advisor risk notification with recipients and returns a status
*AssetsServiceApi* | [**assetsServiceAssetIngestion**](docs/AssetsServiceApi.md#assetsServiceAssetIngestion) | **POST** /api/v3/assets/ingestion | AssetIngestion - Asset Ingestion Api to ingest assets from different applications including asset extensibility assets.
*AssetsServiceApi* | [**assetsServiceAssetIngestionManualTrigger**](docs/AssetsServiceApi.md#assetsServiceAssetIngestionManualTrigger) | **POST** /api/v3/assets/ingestion/trigger | AssetIngestionManualTrigger - Manual trigger for Scheduled Asset Ingestion of databases.
*AssetsServiceApi* | [**assetsServiceClonePolicy**](docs/AssetsServiceApi.md#assetsServiceClonePolicy) | **POST** /api/v3/assets/policies/{policy_id}/clone | ClonePolicy - Clone a policy.
*AssetsServiceApi* | [**assetsServiceCreateUpdatePolicy**](docs/AssetsServiceApi.md#assetsServiceCreateUpdatePolicy) | **POST** /api/v3/assets/policies | CreateUpdatePolicy - Create/update new Policy.
*AssetsServiceApi* | [**assetsServiceDeleteFilterTemplateForAssets**](docs/AssetsServiceApi.md#assetsServiceDeleteFilterTemplateForAssets) | **DELETE** /api/v3/assets/filters/template/{template_id} | DeleteFilterTemplateForAssets - Deleting a template using TemplateID in manage assets.
*AssetsServiceApi* | [**assetsServiceDeletePolicies**](docs/AssetsServiceApi.md#assetsServiceDeletePolicies) | **DELETE** /api/v3/assets/policies | DeletePolicies - Delete Policy returns response code and message.
*AssetsServiceApi* | [**assetsServiceFetchAssetChangeLog**](docs/AssetsServiceApi.md#assetsServiceFetchAssetChangeLog) | **POST** /api/v3/assets/logs | FetchAssetChangeLog - Fetch the logs for any actions performed on assets.
*AssetsServiceApi* | [**assetsServiceFetchAssetDashboard**](docs/AssetsServiceApi.md#assetsServiceFetchAssetDashboard) | **GET** /api/v3/assets/dashboard/{widget_type} | FetchAssetDashboard - Gets Filter Templates for Dshboard Widgets.
*AssetsServiceApi* | [**assetsServiceFetchAssetList**](docs/AssetsServiceApi.md#assetsServiceFetchAssetList) | **POST** /api/v3/assets | FetchAssetList - Asset Fetch Api .
*AssetsServiceApi* | [**assetsServiceFetchAssetsForMergeSplit**](docs/AssetsServiceApi.md#assetsServiceFetchAssetsForMergeSplit) | **GET** /api/v3/assets/configuration | FetchAssetsForMergeSplit : Fetch assets for Merge and Split.
*AssetsServiceApi* | [**assetsServiceFindAssetName**](docs/AssetsServiceApi.md#assetsServiceFindAssetName) | **GET** /api/v3/assets/name | FindAssetName - Checks if the given Asset Name has already been assigned to an asset.
*AssetsServiceApi* | [**assetsServiceGetAssetOverview**](docs/AssetsServiceApi.md#assetsServiceGetAssetOverview) | **GET** /api/v3/assets/overview | GetAssetOverview - Get asset overview widgets data for a particular asset.
*AssetsServiceApi* | [**assetsServiceGetAssetTopology**](docs/AssetsServiceApi.md#assetsServiceGetAssetTopology) | **POST** /api/v3/assets/topology | GetAssetTopology- Get list of topology for a parent asset.
*AssetsServiceApi* | [**assetsServiceGetFilterTemplateForAssets**](docs/AssetsServiceApi.md#assetsServiceGetFilterTemplateForAssets) | **GET** /api/v3/assets/filters/templates | GetFilterTemplateForAssets - Get list of filters query templates for manage assets.
*AssetsServiceApi* | [**assetsServiceGetFiltersForAssets**](docs/AssetsServiceApi.md#assetsServiceGetFiltersForAssets) | **GET** /api/v3/assets/filters | GetFiltersForAssets - Get a list of filters category and sub category with all data.
*AssetsServiceApi* | [**assetsServiceListPolicy**](docs/AssetsServiceApi.md#assetsServiceListPolicy) | **GET** /api/v3/assets/policies | ListPolicy - List all policies.
*AssetsServiceApi* | [**assetsServiceListRule**](docs/AssetsServiceApi.md#assetsServiceListRule) | **GET** /api/v3/assets/policies/{policy_id}/rules | ListRule - List all rules for a policy.
*AssetsServiceApi* | [**assetsServiceListTagDomains**](docs/AssetsServiceApi.md#assetsServiceListTagDomains) | **GET** /api/v3/assets/tags/categories | ListTagDomains - Get Tag categories by request parameters .
*AssetsServiceApi* | [**assetsServiceListTags**](docs/AssetsServiceApi.md#assetsServiceListTags) | **GET** /api/v3/assets/tags | ListTags - Get Tags for Manage Tags listing screen .
*AssetsServiceApi* | [**assetsServiceMergeOrSplitAssets**](docs/AssetsServiceApi.md#assetsServiceMergeOrSplitAssets) | **POST** /api/v3/assets/configuration | MergeOrSplitAssets - Merge or split the selected assets.
*AssetsServiceApi* | [**assetsServiceSaveAssignedTags**](docs/AssetsServiceApi.md#assetsServiceSaveAssignedTags) | **POST** /api/v3/assets/tags/assign | SaveAssignedTags - Save Assigned Tags to TAG_DSDEF_MAP table.
*AssetsServiceApi* | [**assetsServiceSaveTagConceptData**](docs/AssetsServiceApi.md#assetsServiceSaveTagConceptData) | **POST** /api/v3/assets/tags | SaveTagConceptData - creates a custom tag
*AssetsServiceApi* | [**assetsServiceSaveTagDomainData**](docs/AssetsServiceApi.md#assetsServiceSaveTagDomainData) | **POST** /api/v3/assets/tags/categories | SaveTagDomainData - creates a custom category to be assigned to a tag
*AssetsServiceApi* | [**assetsServiceSaveUpdateFilterTemplateForAssets**](docs/AssetsServiceApi.md#assetsServiceSaveUpdateFilterTemplateForAssets) | **POST** /api/v3/assets/filters/templates | SaveUpdateFilterTemplateForAssets - Save/Update a filters query to use as template in manage assets along with reordering of template list.
*AssetsServiceApi* | [**assetsServiceSetBannerState**](docs/AssetsServiceApi.md#assetsServiceSetBannerState) | **PUT** /api/v3/assets/banner | SetBannerState - Set banner state for asset inventory page.
*AssetsServiceApi* | [**assetsServiceUpdateAssetName**](docs/AssetsServiceApi.md#assetsServiceUpdateAssetName) | **PUT** /api/v3/assets/name | UpdateAssetName - Udates the name of the asset as given by the user.
*AssetsServiceApi* | [**assetsServiceUpdatePolicy**](docs/AssetsServiceApi.md#assetsServiceUpdatePolicy) | **PUT** /api/v3/assets/policies | UpdatePolicy - Update existing Policy status.
*AuditServiceApi* | [**auditServiceGetActivityRecords**](docs/AuditServiceApi.md#auditServiceGetActivityRecords) | **GET** /api/v3/activity | Summary: Get activity records Description: Return activity records that match the arguments passed in the request.  Multiple values can be passed to the (UID, Context, ActionTaken, PerformedBy) fields by supplying a  comma-separated list to the corresponding fields in the request.  For instance to check for  multiple Contexts set the field to \&quot;op1, op2, op3\&quot;.
*AuditServiceApi* | [**auditServicePutDownloadActivityRecord**](docs/AuditServiceApi.md#auditServicePutDownloadActivityRecord) | **POST** /api/v3/activity | Summary: Put download activity record Description: Create an activity log record with the arguments passed in the request.
*AuthServerServiceApi* | [**authServerServiceCreateOauthClient**](docs/AuthServerServiceApi.md#authServerServiceCreateOauthClient) | **POST** /api/v3/oauth/clients | Summary: Create Oauth client Description: Create/register new Oauth client.
*AuthServerServiceApi* | [**authServerServiceDeleteOauthClient**](docs/AuthServerServiceApi.md#authServerServiceDeleteOauthClient) | **DELETE** /api/v3/oauth/clients/{client_id} | Summary: Delete Oauth client Description: Delete registered Oauth client by clientId.
*AuthServerServiceApi* | [**authServerServiceGetAccessToken**](docs/AuthServerServiceApi.md#authServerServiceGetAccessToken) | **GET** /api/v3/oauth/token | Summary: Get access token Description: Get access token from passed clientId and secret.
*AuthServerServiceApi* | [**authServerServiceGetOauthClient**](docs/AuthServerServiceApi.md#authServerServiceGetOauthClient) | **GET** /api/v3/oauth/clients/{client_id} | Summary: Get Oauth client Description: Get registered Oauth client by clientId.
*AuthServerServiceApi* | [**authServerServiceGetUser**](docs/AuthServerServiceApi.md#authServerServiceGetUser) | **GET** /api/v3/auth/user | Summary: Get user Description: Get user.
*AuthServerServiceApi* | [**authServerServiceListOauthClient**](docs/AuthServerServiceApi.md#authServerServiceListOauthClient) | **GET** /api/v3/oauth/clients | Summary: List Oauth client Description: List all registered Oauth client.
*CloudAccountsApi* | [**addAnalyzedRegion**](docs/CloudAccountsApi.md#addAnalyzedRegion) | **POST** /api/v1/dspm/cloudAccounts/cloudProviders/analyzedRegions | Add a new region for data classification
*CloudAccountsApi* | [**addCloudAccounts**](docs/CloudAccountsApi.md#addCloudAccounts) | **POST** /api/v1/dspm/cloudAccounts/cloudProviders | Add cloud account connections to DSPM
*CloudAccountsApi* | [**generateAtlassianConfluenceAuthUrl**](docs/CloudAccountsApi.md#generateAtlassianConfluenceAuthUrl) | **GET** /api/v1/dspm/cloudAccounts/saasApps/atlassian-confluence/generateAuthUrl | Generate a Confluence authentication URL
*CloudAccountsApi* | [**generateAtlassianJiraAuthUrl**](docs/CloudAccountsApi.md#generateAtlassianJiraAuthUrl) | **GET** /api/v1/dspm/cloudAccounts/saasApps/atlassian-jira/generateAuthUrl | Generate a JIRA authentication URL
*CloudAccountsApi* | [**generateAzureAuthUrl**](docs/CloudAccountsApi.md#generateAzureAuthUrl) | **GET** /api/v1/dspm/cloudAccounts/azure/generateAuthUrl | Generate azure authorization url
*CloudAccountsApi* | [**generateOffice365AuthUrl**](docs/CloudAccountsApi.md#generateOffice365AuthUrl) | **GET** /api/v1/dspm/cloudAccounts/saasApps/office365/generateAuthUrl | Generate a Microsoft 365 consent URL
*CloudAccountsApi* | [**generateSlackAuthUrl**](docs/CloudAccountsApi.md#generateSlackAuthUrl) | **GET** /api/v1/dspm/cloudAccounts/saasApps/slack/generateAuthUrl | Generate a Slack authentication URL
*CloudAccountsApi* | [**generateSnowflakeAuthUrl**](docs/CloudAccountsApi.md#generateSnowflakeAuthUrl) | **POST** /api/v1/dspm/cloudAccounts/saasApps/snowflake/generateAuthUrl | Validate and Generate a Snowflake OAuth URL
*CloudAccountsApi* | [**getAnalyzedRegionStatus**](docs/CloudAccountsApi.md#getAnalyzedRegionStatus) | **GET** /api/v1/dspm/cloudAccounts/cloudProviders/analyzedRegions/status | Get the status of analyzer installation for a region
*CloudAccountsApi* | [**getAzureAdminConsentStatus**](docs/CloudAccountsApi.md#getAzureAdminConsentStatus) | **GET** /api/v1/dspm/cloudAccounts/azure/getAdminConsentStatus | Get Azure admin consent status
*CloudAccountsApi* | [**getCloudAccountInstallationStatus**](docs/CloudAccountsApi.md#getCloudAccountInstallationStatus) | **GET** /api/v1/dspm/cloudAccounts/{cloudProvider}/{cloudAccountId}/installationStatus | Get the installation status of a cloud account
*CloudAccountsApi* | [**getRefreshTokenExpiry**](docs/CloudAccountsApi.md#getRefreshTokenExpiry) | **GET** /api/v1/dspm/cloudAccounts/saasApps/snowflake/getRefreshTokenExpiry/{providerId} | Get Snowflake Refresh Token Expiry date
*CloudAccountsApi* | [**listLinkedAccounts**](docs/CloudAccountsApi.md#listLinkedAccounts) | **GET** /api/v1/dspm/cloudAccounts/linkedAccounts | List cloud accounts connected to DSPM
*CloudAccountsApi* | [**removeAccounts**](docs/CloudAccountsApi.md#removeAccounts) | **DELETE** /api/v1/dspm/cloudAccounts/removeAccounts | Post cloud account ID connections to be removed
*CloudAccountsApi* | [**removeAccountsInstructions**](docs/CloudAccountsApi.md#removeAccountsInstructions) | **GET** /api/v1/dspm/cloudAccounts/removeAccountsInstructions | Post cloud account IDs and get instructions to remove the accounts
*CloudAccountsApi* | [**retrieveServiceAccountId**](docs/CloudAccountsApi.md#retrieveServiceAccountId) | **GET** /api/v1/dspm/cloudAccounts/saasApps/google/retrieveServiceAccountId | Get Google Workspace authentication
*CloudAccountsApi* | [**snowflakeIntegrationScript**](docs/CloudAccountsApi.md#snowflakeIntegrationScript) | **GET** /api/v1/dspm/cloudAccounts/saasApps/snowflake/snowflakeIntegrationScript | Generate Snowflake Integration Script
*CloudAccountsApi* | [**submitGoogleWorkspaceAdminEmail**](docs/CloudAccountsApi.md#submitGoogleWorkspaceAdminEmail) | **POST** /api/v1/dspm/cloudAccounts/saasApps/google/submitAdminEmail | Submit email for service account authorization
*CloudAccountsApi* | [**submitOffice365TenantInfo**](docs/CloudAccountsApi.md#submitOffice365TenantInfo) | **POST** /api/v1/dspm/cloudAccounts/saasApps/office365/submitTenantInfo | Submit Microsoft 365 customer information
*CloudAccountsApi* | [**submitSlackAuthCode**](docs/CloudAccountsApi.md#submitSlackAuthCode) | **POST** /api/v1/dspm/cloudAccounts/saasApps/slack/submitAuthCode | Submit a Slack authentication code
*CloudAccountsApi* | [**submitSnowflakeAuthCode**](docs/CloudAccountsApi.md#submitSnowflakeAuthCode) | **POST** /api/v1/dspm/cloudAccounts/saasApps/snowflake/submitAuthCode | Submit Snowflake oAuth code
*ComplianceAcceleratorApi* | [**complianceAcceleratorCreateWorkspace**](docs/ComplianceAcceleratorApi.md#complianceAcceleratorCreateWorkspace) | **POST** /api/v3/compliance/workspace | Summary: Create workspace Description: Create a workspace.
*ComplianceAcceleratorApi* | [**complianceAcceleratorDeleteComplianceWorkspaces**](docs/ComplianceAcceleratorApi.md#complianceAcceleratorDeleteComplianceWorkspaces) | **DELETE** /api/v3/compliance | Summary: Delete compliance workspaces Description: Delete workspaces.
*ComplianceAcceleratorApi* | [**complianceAcceleratorGetComplianceInfo**](docs/ComplianceAcceleratorApi.md#complianceAcceleratorGetComplianceInfo) | **GET** /api/v3/compliance | Summary: Get compliance info Description: Return stored compliance data.
*ComplianceAcceleratorApi* | [**complianceAcceleratorHydrateWorkspace**](docs/ComplianceAcceleratorApi.md#complianceAcceleratorHydrateWorkspace) | **POST** /api/v3/compliance/workspace/hydrate | HydrateWorkspace - Hydrates specified objects within a workspace
*ComplianceAcceleratorApi* | [**complianceAcceleratorStoreComplianceInfo**](docs/ComplianceAcceleratorApi.md#complianceAcceleratorStoreComplianceInfo) | **POST** /api/v3/compliance | Summary: Store compliance info Description: Store compliance data.
*ConnectionsServiceApi* | [**connectionsServiceCreateConnectionsAccounts**](docs/ConnectionsServiceApi.md#connectionsServiceCreateConnectionsAccounts) | **POST** /api/v3/connections/accounts | Summary: Create Connections accounts Description: Create Connections acccounts.
*ConnectionsServiceApi* | [**connectionsServiceCreateConnectionsConfigs**](docs/ConnectionsServiceApi.md#connectionsServiceCreateConnectionsConfigs) | **POST** /api/v3/connections/configs | Summary: Create connections configs Description: Create Connection config by connection type.
*ConnectionsServiceApi* | [**connectionsServiceCreatePlugin**](docs/ConnectionsServiceApi.md#connectionsServiceCreatePlugin) | **POST** /api/v3/connections/plugins | Summary: Create plugin Description: Create UC generic plugin
*ConnectionsServiceApi* | [**connectionsServiceCreateSettings**](docs/ConnectionsServiceApi.md#connectionsServiceCreateSettings) | **POST** /api/v3/connections/settings | Summary: Create settings Description: Create Settings.
*ConnectionsServiceApi* | [**connectionsServiceDeleteConnectionsAccounts**](docs/ConnectionsServiceApi.md#connectionsServiceDeleteConnectionsAccounts) | **DELETE** /api/v3/connections/accounts/{account_id} | Summary: Delete Connections accounts Description: Delete Connections acccounts.
*ConnectionsServiceApi* | [**connectionsServiceDeleteConnectionsConfigs**](docs/ConnectionsServiceApi.md#connectionsServiceDeleteConnectionsConfigs) | **DELETE** /api/v3/connections/configs/{connection_id} | Summary: Delete connections configs Description: Delete Connection config by connection id.
*ConnectionsServiceApi* | [**connectionsServiceDeleteConnector**](docs/ConnectionsServiceApi.md#connectionsServiceDeleteConnector) | **DELETE** /api/v3/connections/{connection_id} | Summary: Delete connector Description: Delete a Connection.
*ConnectionsServiceApi* | [**connectionsServiceDeletePlugin**](docs/ConnectionsServiceApi.md#connectionsServiceDeletePlugin) | **DELETE** /api/v3/connections/plugins/{id} | Summary: Delete plugin. Description: Delete plugin.
*ConnectionsServiceApi* | [**connectionsServiceGetBannerState**](docs/ConnectionsServiceApi.md#connectionsServiceGetBannerState) | **GET** /api/v3/connections/banner | Summary: Get banner state for object verb page.  Description: Get banner state for object verb page.
*ConnectionsServiceApi* | [**connectionsServiceGetConnectionsAccounts**](docs/ConnectionsServiceApi.md#connectionsServiceGetConnectionsAccounts) | **GET** /api/v3/connections/accounts | Summary: Get Connections accounts Description: Get Connections acccounts.
*ConnectionsServiceApi* | [**connectionsServiceGetConnectionsConfigs**](docs/ConnectionsServiceApi.md#connectionsServiceGetConnectionsConfigs) | **GET** /api/v3/connections/configs | Summary: Get connections configs Description: Get Connection config by connection type.
*ConnectionsServiceApi* | [**connectionsServiceGetConnectionsWithFilters**](docs/ConnectionsServiceApi.md#connectionsServiceGetConnectionsWithFilters) | **POST** /api/v3/connections | Summary: Get connections with filters Description: Get connections with filters.
*ConnectionsServiceApi* | [**connectionsServiceGetConnectorsSummary**](docs/ConnectionsServiceApi.md#connectionsServiceGetConnectorsSummary) | **GET** /api/v3/connections/summary | Summary: Get connectors summary Description: Get a summary of Connectors.
*ConnectionsServiceApi* | [**connectionsServiceGetDataSources**](docs/ConnectionsServiceApi.md#connectionsServiceGetDataSources) | **GET** /api/v3/connections/datasources | Summary: Get data sources Description: Get a list of data sources.
*ConnectionsServiceApi* | [**connectionsServiceGetGuardRecordFields**](docs/ConnectionsServiceApi.md#connectionsServiceGetGuardRecordFields) | **GET** /api/v3/connections/fields | Summary: Get list of guard record fields.  Description: Get list of guard record fields.
*ConnectionsServiceApi* | [**connectionsServiceGetHeaders**](docs/ConnectionsServiceApi.md#connectionsServiceGetHeaders) | **GET** /api/v3/connections/headers | Summary: Get headers Description: Get a list of Headers.
*ConnectionsServiceApi* | [**connectionsServiceGetPlugins**](docs/ConnectionsServiceApi.md#connectionsServiceGetPlugins) | **GET** /api/v3/connections/plugins | Summary: Get plugins  Description: Get custom universal connector plugins
*ConnectionsServiceApi* | [**connectionsServiceGetSettings**](docs/ConnectionsServiceApi.md#connectionsServiceGetSettings) | **GET** /api/v3/connections/settings | Summary: Get settings Description: Get a list of Settings.
*ConnectionsServiceApi* | [**connectionsServicePartialUpdateConnectors**](docs/ConnectionsServiceApi.md#connectionsServicePartialUpdateConnectors) | **PATCH** /api/v3/connections | Summary: Partial update connectors Description: Partial update of Connectors.
*ConnectionsServiceApi* | [**connectionsServicePostStapCommand**](docs/ConnectionsServiceApi.md#connectionsServicePostStapCommand) | **POST** /api/v3/stap/commands | Summary: Post stap command Description: Send a STAP command down to kafka for snif-assist.
*ConnectionsServiceApi* | [**connectionsServiceUpdateBannerState**](docs/ConnectionsServiceApi.md#connectionsServiceUpdateBannerState) | **PUT** /api/v3/connections/banner | Summary: Update banner state for object verb page.  Description: Update banner state for object verb page.
*ConnectionsServiceApi* | [**connectionsServiceUpdateConnectionsAccounts**](docs/ConnectionsServiceApi.md#connectionsServiceUpdateConnectionsAccounts) | **PUT** /api/v3/connections/accounts | Summary: Update Connections accounts Description: Update Connections acccounts.
*ConnectionsServiceApi* | [**connectionsServiceUpdateConnectionsConfigs**](docs/ConnectionsServiceApi.md#connectionsServiceUpdateConnectionsConfigs) | **PATCH** /api/v3/connections/configs | Summary: Update connections configs Description: Update Connection config by connection id.
*ConnectionsServiceApi* | [**connectionsServiceUpdateConnectors**](docs/ConnectionsServiceApi.md#connectionsServiceUpdateConnectors) | **PUT** /api/v3/connections | Summary: Update connectors Description: Update a list of Connectors.
*ConnectionsServiceApi* | [**connectionsServiceUpdatePlugin**](docs/ConnectionsServiceApi.md#connectionsServiceUpdatePlugin) | **PUT** /api/v3/connections/plugins/{id} | Summary: Update plugin. Description: Update plugin.
*ConnectionsServiceApi* | [**connectionsServiceUpdateSettings**](docs/ConnectionsServiceApi.md#connectionsServiceUpdateSettings) | **PUT** /api/v3/connections/settings | Summary: Update settings Description: Update Settings.
*DashboardsServiceApi* | [**dashboardsServiceCreateDashboard**](docs/DashboardsServiceApi.md#dashboardsServiceCreateDashboard) | **POST** /api/v3/dashboards | Summary: Create dashboard Description: Create a unique dashboard.
*DashboardsServiceApi* | [**dashboardsServiceDeleteDashboard**](docs/DashboardsServiceApi.md#dashboardsServiceDeleteDashboard) | **DELETE** /api/v3/dashboards/{dashboard_id} | Summary: Delete dashboard Description: Delete a unique dashboard.
*DashboardsServiceApi* | [**dashboardsServiceGetDashboards**](docs/DashboardsServiceApi.md#dashboardsServiceGetDashboards) | **GET** /api/v3/dashboards | Summary: Get dashboards Description: Get a list of dashboards with all data.
*DashboardsServiceApi* | [**dashboardsServiceUpdateDashboard**](docs/DashboardsServiceApi.md#dashboardsServiceUpdateDashboard) | **PUT** /api/v3/dashboards/{dashboard_id} | Summary: Update dashboard Description: Update a dashboard.
*DataMovementsApi* | [**getActualFlow**](docs/DataMovementsApi.md#getActualFlow) | **GET** /api/v1/dspm/dataMovements/actualFlows/{id} | Get actual flow by providing its ID
*DataMovementsApi* | [**getActualFlowsSummary**](docs/DataMovementsApi.md#getActualFlowsSummary) | **GET** /api/v1/dspm/dataMovements/actualFlows/summary | Get summary of actual flows
*DataMovementsApi* | [**getPotentialFlow**](docs/DataMovementsApi.md#getPotentialFlow) | **GET** /api/v1/dspm/dataMovements/potentialFlows/{flowId} | Get potential flow by providing its ID
*DataMovementsApi* | [**getPotentialFlowPath**](docs/DataMovementsApi.md#getPotentialFlowPath) | **GET** /api/v1/dspm/dataMovements/potentialFlows/paths/{flowPathId} | Get potential flow path by providing its ID
*DataMovementsApi* | [**getPotentialFlowsSummary**](docs/DataMovementsApi.md#getPotentialFlowsSummary) | **GET** /api/v1/dspm/dataMovements/potentialFlows/summary | Get summary of potential flows according to the filter applied
*DataMovementsApi* | [**listActualFlowPaths**](docs/DataMovementsApi.md#listActualFlowPaths) | **GET** /api/v1/dspm/dataMovements/actualFlowPaths | Get summary of actual flows according to the filter applied
*DataMovementsApi* | [**listActualFlows**](docs/DataMovementsApi.md#listActualFlows) | **GET** /api/v1/dspm/dataMovements/actualFlows | List actual flows
*DataMovementsApi* | [**listPotentialFlows**](docs/DataMovementsApi.md#listPotentialFlows) | **GET** /api/v1/dspm/dataMovements/potentialFlows | List potential flows
*DataMovementsApi* | [**listPotentialFlowsPaths**](docs/DataMovementsApi.md#listPotentialFlowsPaths) | **GET** /api/v1/dspm/dataMovements/potentialFlows/paths | List potential flow paths
*DataResourcesApi* | [**getDataResource**](docs/DataResourcesApi.md#getDataResource) | **GET** /api/v1/dspm/dataResources/{dataResourceId} | Get a specific data resource by its ID
*DataResourcesApi* | [**getDataResourcesSummary**](docs/DataResourcesApi.md#getDataResourcesSummary) | **GET** /api/v1/dspm/dataResources/summary | Data resources summary
*DataResourcesApi* | [**listDataResources**](docs/DataResourcesApi.md#listDataResources) | **GET** /api/v1/dspm/dataResources | List data resources that match a given filter
*DataResourcesApi* | [**listDataResourcesNames**](docs/DataResourcesApi.md#listDataResourcesNames) | **GET** /api/v1/dspm/dataResources/names | List names of data resources
*DataResourcesApi* | [**removeResource**](docs/DataResourcesApi.md#removeResource) | **DELETE** /api/v1/dspm/dataResources/{dataResourceId}/removeResource | Remove resource from DSPM
*DataResourcesApi* | [**updateResourceReviewStatus**](docs/DataResourcesApi.md#updateResourceReviewStatus) | **PUT** /api/v1/dspm/dataResources/{dataResourceId}/reviewed | Set review status of a data resource
*DataSensitivitiesApi* | [**getSensitivitiesSummary**](docs/DataSensitivitiesApi.md#getSensitivitiesSummary) | **GET** /api/v1/dspm/sensitivities/summary | Get the summary of sensitivities
*DataSensitivitiesApi* | [**getSensitivity**](docs/DataSensitivitiesApi.md#getSensitivity) | **GET** /api/v1/dspm/sensitivities/{sensitivityId} | Get sensitivity details by providing its ID
*DataSensitivitiesApi* | [**listSensitivities**](docs/DataSensitivitiesApi.md#listSensitivities) | **GET** /api/v1/dspm/sensitivities | List sensitivities
*DataStoresApi* | [**getDataStore**](docs/DataStoresApi.md#getDataStore) | **GET** /api/v1/dspm/dataStores/{dataStoreId} | Get a data store by its ID
*DataStoresApi* | [**getDataStoresSummary**](docs/DataStoresApi.md#getDataStoresSummary) | **GET** /api/v1/dspm/dataStores/summary | Get summary of data stores
*DataStoresApi* | [**listAllDataStoresLabels**](docs/DataStoresApi.md#listAllDataStoresLabels) | **GET** /api/v1/dspm/dataStores/labels | List labels of data stores.
*DataStoresApi* | [**listDataStores**](docs/DataStoresApi.md#listDataStores) | **GET** /api/v1/dspm/dataStores | List data stores
*DataStoresApi* | [**listDataStoresCloudTagsKeys**](docs/DataStoresApi.md#listDataStoresCloudTagsKeys) | **GET** /api/v1/dspm/dataStores/cloudTags/keys | List the cloud tag keys of data stores that can be filtered on the basis of prefixes.
*DataStoresApi* | [**listDataStoresCloudTagsValues**](docs/DataStoresApi.md#listDataStoresCloudTagsValues) | **GET** /api/v1/dspm/dataStores/cloudTags/values | List the cloud tag values of data stores that can be filtered on the basis of prefixes and cloud tag key names.
*DataStoresApi* | [**listDataStoresNames**](docs/DataStoresApi.md#listDataStoresNames) | **GET** /api/v1/dspm/dataStores/filters/name | List name of filterable data stores
*DataStoresApi* | [**rescanDataStore**](docs/DataStoresApi.md#rescanDataStore) | **POST** /api/v1/dspm/dataStores/rescan | Post data store rescan request
*DataStoresApi* | [**setDataStoreLabel**](docs/DataStoresApi.md#setDataStoreLabel) | **PUT** /api/v1/dspm/dataStores/{dataStoreId}/labels | Label a data store with an existing or new label
*DataStoresApi* | [**updateDatastoreCustodian**](docs/DataStoresApi.md#updateDatastoreCustodian) | **POST** /api/v1/dspm/dataStores/custodian | Update the name of a Data store custodian
*DataVulnerabilitiesApi* | [**addVulnerabilityStatusComment**](docs/DataVulnerabilitiesApi.md#addVulnerabilityStatusComment) | **POST** /api/v1/dspm/vulnerabilities/{vulnerabilityId}/statuses/{statusId}/comments | Add vulnerability status comment
*DataVulnerabilitiesApi* | [**getVulnerabilitiesSummary**](docs/DataVulnerabilitiesApi.md#getVulnerabilitiesSummary) | **GET** /api/v1/dspm/vulnerabilities/summary | Get vulnerabilities summary
*DataVulnerabilitiesApi* | [**getVulnerability**](docs/DataVulnerabilitiesApi.md#getVulnerability) | **GET** /api/v1/dspm/vulnerabilities/{vulnerabilityId} | Get vulnerability details by ID
*DataVulnerabilitiesApi* | [**listVulnerabilities**](docs/DataVulnerabilitiesApi.md#listVulnerabilities) | **GET** /api/v1/dspm/vulnerabilities | List vulnerabilities based on an applied filter
*DataVulnerabilitiesApi* | [**listVulnerabilitiesByDataStore**](docs/DataVulnerabilitiesApi.md#listVulnerabilitiesByDataStore) | **GET** /api/v1/dspm/vulnerabilities/byDataStore | List vulnerabilities of data stores
*DataVulnerabilitiesApi* | [**removeVulnerabilityStatusComment**](docs/DataVulnerabilitiesApi.md#removeVulnerabilityStatusComment) | **DELETE** /api/v1/dspm/vulnerabilities/{vulnerabilityId}/statuses/{statusId}/comments/{commentId} | Delete vulnerability status comment
*DataVulnerabilitiesApi* | [**setVulnerabilityStatus**](docs/DataVulnerabilitiesApi.md#setVulnerabilityStatus) | **POST** /api/v1/dspm/vulnerabilities/{vulnerabilityId}/statuses | Set status of a vulnerability
*DataVulnerabilitiesApi* | [**updateVulnerabilityStatusComment**](docs/DataVulnerabilitiesApi.md#updateVulnerabilityStatusComment) | **PUT** /api/v1/dspm/vulnerabilities/{vulnerabilityId}/statuses/{statusId}/comments/{commentId} | Set vulnerability status
*DatabootstrapperServiceApi* | [**databootstrapperServiceLoadData**](docs/DatabootstrapperServiceApi.md#databootstrapperServiceLoadData) | **POST** /api/v3/databootstrapper/data | Summary: Load data Description: Load data for a tenant.
*DatamartProcessorServiceApi* | [**datamartProcessorServiceGetDatamartInfo**](docs/DatamartProcessorServiceApi.md#datamartProcessorServiceGetDatamartInfo) | **GET** /api/v3/datamarts/info | Summary: Get datamarts Description: Return a list of files inside a datamart to the caller.
*DatamartProcessorServiceApi* | [**datamartProcessorServiceGetDatamarts**](docs/DatamartProcessorServiceApi.md#datamartProcessorServiceGetDatamarts) | **GET** /api/v3/datamarts | Summary: Get datamarts Description: Return a list of datamarts for a time interval to the caller.
*DatamartProcessorServiceApi* | [**datamartProcessorServiceGetEarliestStartTime**](docs/DatamartProcessorServiceApi.md#datamartProcessorServiceGetEarliestStartTime) | **GET** /api/v3/datamarts/earliest_start_time | Summary: Get rarliest start time Description: Return the earliest time period of data available in database.
*DatamartProcessorServiceApi* | [**datamartProcessorServiceSendAllCompleteFilesToQueue**](docs/DatamartProcessorServiceApi.md#datamartProcessorServiceSendAllCompleteFilesToQueue) | **POST** /api/v3/datamarts/repush_files | 
*DatamartProcessorServiceApi* | [**datamartProcessorServiceStoreExtractionLogs**](docs/DatamartProcessorServiceApi.md#datamartProcessorServiceStoreExtractionLogs) | **POST** /api/v3/datamarts/{request_id}/dm_extraction_logs | Summary: Store extraction logs Description: Store the datamart extraction logs inside GI.
*DatamartProcessorServiceApi* | [**uploadDatamart**](docs/DatamartProcessorServiceApi.md#uploadDatamart) | **POST** /api/v3/datamarts/upload | Summary: Upload datamart Description: Upload datamart file for ingestion.
*EcosystemServiceApi* | [**ecosystemServiceCreateDataset**](docs/EcosystemServiceApi.md#ecosystemServiceCreateDataset) | **POST** /api/v3/integrations/datasets | Summary: Create dataset Description: Save a definition in the database.
*EcosystemServiceApi* | [**ecosystemServiceDataInsert**](docs/EcosystemServiceApi.md#ecosystemServiceDataInsert) | **POST** /api/v3/integrations/datasets/{dataset_name} | Summary: Data insert Description: Process Data received from webhook API and insert.
*EcosystemServiceApi* | [**ecosystemServiceDeleteDatasets**](docs/EcosystemServiceApi.md#ecosystemServiceDeleteDatasets) | **DELETE** /api/v3/integrations/datasets | Summary: Delete datasets Description: Delete an array of datasets.
*EcosystemServiceApi* | [**ecosystemServiceGetDatasetData**](docs/EcosystemServiceApi.md#ecosystemServiceGetDatasetData) | **GET** /api/v3/integrations/datasets/{dataset_name}/data | Summary: Get dataset data Description: Return data report for a given dataset.
*EcosystemServiceApi* | [**ecosystemServiceGetDatasetDetail**](docs/EcosystemServiceApi.md#ecosystemServiceGetDatasetDetail) | **GET** /api/v3/integrations/datasets/{dataset_name}/details | Summary: Get dataset detail Description: Return detail on a dataset definition.
*EcosystemServiceApi* | [**ecosystemServiceGetDatasets**](docs/EcosystemServiceApi.md#ecosystemServiceGetDatasets) | **GET** /api/v3/integrations/datasets | Summary: Get datasets Description: Return dataset list that matches the specified filter.
*EcosystemServiceApi* | [**ecosystemServiceGetPurgableRows**](docs/EcosystemServiceApi.md#ecosystemServiceGetPurgableRows) | **POST** /api/v3/integrations/purge | Summary: Get purgable rows Description: Check the number of rows that can be purged.
*EcosystemServiceApi* | [**ecosystemServicePurgeData**](docs/EcosystemServiceApi.md#ecosystemServicePurgeData) | **DELETE** /api/v3/integrations/datasets/data | Summary: Purge data Description: Purge data.
*FeatureFlagsServiceApi* | [**featureFlagsServiceDeleteFeatureFlagOverrides**](docs/FeatureFlagsServiceApi.md#featureFlagsServiceDeleteFeatureFlagOverrides) | **DELETE** /api/v3/feature_flags/overrides | Summary: Delete feature Flag overrides Description: Delete feature Flag overrides from database.
*FeatureFlagsServiceApi* | [**featureFlagsServiceGetFeatureFlagOverrides**](docs/FeatureFlagsServiceApi.md#featureFlagsServiceGetFeatureFlagOverrides) | **GET** /api/v3/feature_flags/overrides | Summary: Get feature Flag overrides Description: Get feature Flag overrides by Feature Flag Name.
*FeatureFlagsServiceApi* | [**featureFlagsServiceGetFeatureFlags**](docs/FeatureFlagsServiceApi.md#featureFlagsServiceGetFeatureFlags) | **GET** /api/v3/feature_flags | Summary: Get feature flags Description: Get feature flags by Feature Flag Name.
*FeatureFlagsServiceApi* | [**featureFlagsServiceUpdateFeatureFlagOverrides**](docs/FeatureFlagsServiceApi.md#featureFlagsServiceUpdateFeatureFlagOverrides) | **PUT** /api/v3/feature_flags/overrides | Summary: Update feature Flag overrides Description: Update feature Flag overrides in the database.
*GroupBuilderApi* | [**groupBuilderCancelImportGroup**](docs/GroupBuilderApi.md#groupBuilderCancelImportGroup) | **DELETE** /api/v3/groups_import | Summary: Cancel import group Description: Cancel import refresh for selected groups.
*GroupBuilderApi* | [**groupBuilderCreateGroup**](docs/GroupBuilderApi.md#groupBuilderCreateGroup) | **POST** /api/v3/groups | Summary: Create group Description: Create new groups.
*GroupBuilderApi* | [**groupBuilderDeleteGroup**](docs/GroupBuilderApi.md#groupBuilderDeleteGroup) | **DELETE** /api/v3/groups | Summary: Delete group Description: Delete specified groups if the group ID is not used for reports.
*GroupBuilderApi* | [**groupBuilderEditGroup**](docs/GroupBuilderApi.md#groupBuilderEditGroup) | **PATCH** /api/v3/groups/{group_id} | Summary: Edit group Description: Add or delete group members.
*GroupBuilderApi* | [**groupBuilderExportGroup**](docs/GroupBuilderApi.md#groupBuilderExportGroup) | **POST** /api/v3/groups_export | Summary: Export group Description: Export group content to a file based on a group ID.
*GroupBuilderApi* | [**groupBuilderGetGroupDetails**](docs/GroupBuilderApi.md#groupBuilderGetGroupDetails) | **GET** /api/v3/groups/{group_id} | Summary: Get group details Description: Get details of group specified by group ID.
*GroupBuilderApi* | [**groupBuilderGetGroupMembers**](docs/GroupBuilderApi.md#groupBuilderGetGroupMembers) | **POST** /api/v3/groups/search | Summary: Get group members Description: Get members of all the group ids provided in the request. To be consumed by policy builder ms.
*GroupBuilderApi* | [**groupBuilderGetGroupSyncMapping**](docs/GroupBuilderApi.md#groupBuilderGetGroupSyncMapping) | **GET** /api/v3/groups/mappings/sync | Summary: Get gdp to gi group mapping Description: Get insights to gdp group sync mapping.
*GroupBuilderApi* | [**groupBuilderGetGroupTypeMapping**](docs/GroupBuilderApi.md#groupBuilderGetGroupTypeMapping) | **GET** /api/v3/groups-mappings | Summary: Get group type mapping Description: Get insights to gdp group types mapping.
*GroupBuilderApi* | [**groupBuilderGetGroupTypes**](docs/GroupBuilderApi.md#groupBuilderGetGroupTypes) | **GET** /api/v3/group_types | Summary: Get group types Description: Get a list of available group types.
*GroupBuilderApi* | [**groupBuilderGetGroups**](docs/GroupBuilderApi.md#groupBuilderGetGroups) | **GET** /api/v3/groups | Summary: Get groups Description: Get a list of imported group members.
*GroupBuilderApi* | [**groupBuilderGetImportGroups**](docs/GroupBuilderApi.md#groupBuilderGetImportGroups) | **GET** /api/v3/groups_import | Summary: Get import groups Description: Get unsynchronized groups from a central manager.
*GroupBuilderApi* | [**groupBuilderImportGroup**](docs/GroupBuilderApi.md#groupBuilderImportGroup) | **POST** /api/v3/groups_import | Summary: Import group Description: Import selected groups from a central manager. (This API is called from GDP only)
*GroupBuilderApi* | [**groupBuilderRefreshGroups**](docs/GroupBuilderApi.md#groupBuilderRefreshGroups) | **POST** /api/v3/groups/refresh | Summary: Refresh groups Description: Refresh tenants selected imported groups.
*GroupBuilderApi* | [**groupBuilderResetGroups**](docs/GroupBuilderApi.md#groupBuilderResetGroups) | **POST** /api/v3/groups/reset | Summary: Reset groups Description: Resets tenants selected predefined groups.
*GroupBuilderApi* | [**groupBuilderStoreGroupMembersGdp**](docs/GroupBuilderApi.md#groupBuilderStoreGroupMembersGdp) | **POST** /api/v3/central_managers/{central_manager_id}/groups/members | Summary: Store group members Gdp Description: Store GDP groups. (This API is called from GDP only)
*GroupBuilderApi* | [**groupBuilderStoreGroupsGdp**](docs/GroupBuilderApi.md#groupBuilderStoreGroupsGdp) | **POST** /api/v3/central_managers/{central_manager_id}/groups | Summary: Store groups Gdp Description: Store GDP groups. (This API is called from GDP only)
*GuardiumConnectorApi* | [**guardiumConnectorAddCM**](docs/GuardiumConnectorApi.md#guardiumConnectorAddCM) | **POST** /api/v3/central_managers | Summary: Add CM Description: Add a Central Manager to the tenant database.
*GuardiumConnectorApi* | [**guardiumConnectorAddDatamarts**](docs/GuardiumConnectorApi.md#guardiumConnectorAddDatamarts) | **POST** /api/v3/central_managers/{central_manager_id}/datamarts | Description: stores datamarts details from GDP
*GuardiumConnectorApi* | [**guardiumConnectorAddDmExclusion**](docs/GuardiumConnectorApi.md#guardiumConnectorAddDmExclusion) | **POST** /api/v3/datamarts/exclusion_list | Summary: Add DM exclusion Description: Add datamart to exclusion list.
*GuardiumConnectorApi* | [**guardiumConnectorAddTask**](docs/GuardiumConnectorApi.md#guardiumConnectorAddTask) | **POST** /api/v3/central_managers/{central_manager_id}/tasks | Summary: Add task Description: Add a task to be executed on GDP.
*GuardiumConnectorApi* | [**guardiumConnectorBlockUser**](docs/GuardiumConnectorApi.md#guardiumConnectorBlockUser) | **POST** /api/v3/block_user | Summary: Block user Description: Block a database user on Guardium Data Protection or on a supported Database as a Service instance.
*GuardiumConnectorApi* | [**guardiumConnectorConfigureAggregatorExport**](docs/GuardiumConnectorApi.md#guardiumConnectorConfigureAggregatorExport) | **PUT** /api/v3/central_managers/{central_manager_id}/aggregator_config_export | Summary: Configure aggregator export Description: Configure datamart export from the Aggregators to GI.
*GuardiumConnectorApi* | [**guardiumConnectorConfigureCollectorExport**](docs/GuardiumConnectorApi.md#guardiumConnectorConfigureCollectorExport) | **PUT** /api/v3/central_managers/{central_manager_id}/collector_config_export | Summary: Configure collector export Description: Schedule export historical data for collectors.
*GuardiumConnectorApi* | [**guardiumConnectorConfigureStreaming**](docs/GuardiumConnectorApi.md#guardiumConnectorConfigureStreaming) | **POST** /api/v3/central_managers/{central_manager_id}/streaming | Summary: Configure streaming Description: Enable or disable streaming.
*GuardiumConnectorApi* | [**guardiumConnectorDatamartVersionCheck**](docs/GuardiumConnectorApi.md#guardiumConnectorDatamartVersionCheck) | **POST** /api/v3/central_managers/{central_manager_id}/datamart_version | Description: validates if central manager has datamart support for event model
*GuardiumConnectorApi* | [**guardiumConnectorDeleteCM**](docs/GuardiumConnectorApi.md#guardiumConnectorDeleteCM) | **DELETE** /api/v3/central_managers/{central_manager_id} | Summary: Delete CM Description: Delete a Central Manager by ID (Name, Hostname or IP).
*GuardiumConnectorApi* | [**guardiumConnectorDeleteDmExclusion**](docs/GuardiumConnectorApi.md#guardiumConnectorDeleteDmExclusion) | **DELETE** /api/v3/datamarts/exclusion_list | Summary: Delete DM exclusion Description: Delete a datamart from exclusion list.
*GuardiumConnectorApi* | [**guardiumConnectorDeleteTask**](docs/GuardiumConnectorApi.md#guardiumConnectorDeleteTask) | **DELETE** /api/v3/central_managers/{central_manager_id}/tasks/{task_id} | Summary: Delete task Description: Delete a task by central manager id and task id.
*GuardiumConnectorApi* | [**guardiumConnectorDeleteTasks**](docs/GuardiumConnectorApi.md#guardiumConnectorDeleteTasks) | **DELETE** /api/v3/central_managers/{central_manager_id}/tasks | Summary: Delete tasks Description: Delete a central manager&#39;s tasks by central manager id.
*GuardiumConnectorApi* | [**guardiumConnectorGetAggregatorsConfig**](docs/GuardiumConnectorApi.md#guardiumConnectorGetAggregatorsConfig) | **GET** /api/v3/central_managers/{central_manager_id}/aggregators_config | Summary: Get aggregators config Description: Return a list of managed units from the config collection in tenant database.
*GuardiumConnectorApi* | [**guardiumConnectorGetCMs**](docs/GuardiumConnectorApi.md#guardiumConnectorGetCMs) | **GET** /api/v3/central_managers | Summary: Get CMs Description: Return a list of Central Managers from the tenant database with additional processing.
*GuardiumConnectorApi* | [**guardiumConnectorGetCMsConfig**](docs/GuardiumConnectorApi.md#guardiumConnectorGetCMsConfig) | **GET** /api/v3/central_managers_config | Summary: Get CMs config Description: Return a list of Central Managers from the tenant database.
*GuardiumConnectorApi* | [**guardiumConnectorGetCollectorsConfig**](docs/GuardiumConnectorApi.md#guardiumConnectorGetCollectorsConfig) | **GET** /api/v3/central_managers/{central_manager_id}/collectors_config | Summary: Get collectors config Description: Return the list of collectors configuration from the tenant database.
*GuardiumConnectorApi* | [**guardiumConnectorGetDatamarts**](docs/GuardiumConnectorApi.md#guardiumConnectorGetDatamarts) | **GET** /api/v3/central_managers/{central_manager_id}/datamarts | Description: returns full list of supported datamarts including type (historical or non-historical)
*GuardiumConnectorApi* | [**guardiumConnectorGetDmExclusion**](docs/GuardiumConnectorApi.md#guardiumConnectorGetDmExclusion) | **GET** /api/v3/datamarts/exclusion_list | Summary: Get DM exclusion Description: Return datamarts in the exclusion list.
*GuardiumConnectorApi* | [**guardiumConnectorGetGdpPolicyInfo**](docs/GuardiumConnectorApi.md#guardiumConnectorGetGdpPolicyInfo) | **GET** /api/v3/central_managers/{central_manager_id}/policies/info | Summary: Get guardium policy definition Description: returns the policy definition on the cm
*GuardiumConnectorApi* | [**guardiumConnectorGetGdpPolicySummaries**](docs/GuardiumConnectorApi.md#guardiumConnectorGetGdpPolicySummaries) | **GET** /api/v3/central_managers/{central_manager_id}/policies/summaries | Summary: Get guardium policy summary Description: returns the summaries of all policies on that central manager
*GuardiumConnectorApi* | [**guardiumConnectorGetHealthInfo**](docs/GuardiumConnectorApi.md#guardiumConnectorGetHealthInfo) | **GET** /api/v3/central_managers/{central_manager_id}/health_info | Summary: Get gealth info Description: Get health information from Guardium Data Protection central mamangers.
*GuardiumConnectorApi* | [**guardiumConnectorGetLatestDMExtractionProfile**](docs/GuardiumConnectorApi.md#guardiumConnectorGetLatestDMExtractionProfile) | **GET** /api/v3/central_managers/{central_manager_id}/datamart_extraction_profile | Summary: Get latest DM extraction profile Description: Return the Datamart Extraction Profile for Guardium.
*GuardiumConnectorApi* | [**guardiumConnectorGetStreamingStatus**](docs/GuardiumConnectorApi.md#guardiumConnectorGetStreamingStatus) | **GET** /api/v3/central_managers/{central_manager_id}/streaming | Summary: Get streaming status Description: Return the streaming configuration.
*GuardiumConnectorApi* | [**guardiumConnectorGetSyncDMs**](docs/GuardiumConnectorApi.md#guardiumConnectorGetSyncDMs) | **GET** /api/v3/central_managers/{central_manager_id}/sync | Summary: Get sync DMs Description: Return the list of tasks from a central manager.
*GuardiumConnectorApi* | [**guardiumConnectorGetTaskTypes**](docs/GuardiumConnectorApi.md#guardiumConnectorGetTaskTypes) | **GET** /api/v3/central_managers/task_types | Summary: Get task types Description: Return the list of supported task types.
*GuardiumConnectorApi* | [**guardiumConnectorGetTasks**](docs/GuardiumConnectorApi.md#guardiumConnectorGetTasks) | **GET** /api/v3/central_managers/{central_manager_id}/tasks | Summary: Get tasks Description: Return the list of tasks from a central manager.
*GuardiumConnectorApi* | [**guardiumConnectorRunGDPReport**](docs/GuardiumConnectorApi.md#guardiumConnectorRunGDPReport) | **POST** /api/v3/central_managers/{central_manager_id}/run_report | Summary: Run GDP report Description: Run GDP report.
*GuardiumConnectorApi* | [**guardiumConnectorSetupCM**](docs/GuardiumConnectorApi.md#guardiumConnectorSetupCM) | **POST** /api/v3/central_managers/setup | Summary: Setup CM Description: Set up the registration between a GDP Central manager and Guardium.
*GuardiumConnectorApi* | [**guardiumConnectorSetupDatamarts**](docs/GuardiumConnectorApi.md#guardiumConnectorSetupDatamarts) | **POST** /api/v3/central_managers/{central_manager_id}/datamarts/setup | Description: setup custom datamart execution mode
*GuardiumConnectorApi* | [**guardiumConnectorTaskError**](docs/GuardiumConnectorApi.md#guardiumConnectorTaskError) | **POST** /api/v3/central_managers/{central_manager_id}/tasks/error | Summary: Task error Description: Log error messages from GDP task execution.
*GuardiumConnectorApi* | [**guardiumConnectorTestDatabaseConnection**](docs/GuardiumConnectorApi.md#guardiumConnectorTestDatabaseConnection) | **POST** /api/v3/test_database | Summary: Test database connection Description: Return database connection results.
*GuardiumConnectorApi* | [**guardiumConnectorUpdateDmExclusion**](docs/GuardiumConnectorApi.md#guardiumConnectorUpdateDmExclusion) | **PUT** /api/v3/datamarts/exclusion_list | Summary: Update DM exclusion Description: Update the atamart exclusion list.
*GuardiumConnectorApi* | [**guardiumConnectorUpdateStreaming**](docs/GuardiumConnectorApi.md#guardiumConnectorUpdateStreaming) | **PUT** /api/v3/central_managers/{central_manager_id}/streaming | Summary: Update streaming Description: Update streaming status into GI.
*GuardiumConnectorApi* | [**guardiumConnectorUpdateTask**](docs/GuardiumConnectorApi.md#guardiumConnectorUpdateTask) | **PUT** /api/v3/central_managers/{central_manager_id}/tasks/{task_id} | Summary: Update task Description: Update a task that gets executed on GDP.
*HealthCollectorApi* | [**healthCollectorGetDataWarehouseUsage**](docs/HealthCollectorApi.md#healthCollectorGetDataWarehouseUsage) | **GET** /api/v3/metrics/warehouse/{type} | Summary: Get data warehouse usage info Description: Get information from Db2 related to usage
*HealthCollectorApi* | [**healthCollectorGetGDPHealthInfo**](docs/HealthCollectorApi.md#healthCollectorGetGDPHealthInfo) | **GET** /api/v3/health | Summary: Get GDP health info Description: Get information from MongoDB for Guardium central managers using health-connector service.
*HealthCollectorApi* | [**healthCollectorGetHistoricalHealthInfo**](docs/HealthCollectorApi.md#healthCollectorGetHistoricalHealthInfo) | **GET** /api/v3/health/history | Summary: Get historical health info Description: Retrieve historical s-tap related statistics from health-collector service.
*HealthCollectorApi* | [**healthCollectorGetObjectStorageUsage**](docs/HealthCollectorApi.md#healthCollectorGetObjectStorageUsage) | **GET** /api/v3/metrics/object_storage/{type} | Summary: Get object storage usage info Description: Get information from object storage about tenant bucket usage
*HealthCollectorApi* | [**healthCollectorGetPVCUsage**](docs/HealthCollectorApi.md#healthCollectorGetPVCUsage) | **GET** /api/v3/metrics/pvc/{type} | Summary: Get the PVC usage information Description: Get information about the PVC usage in the OCP cluster
*HealthCollectorApi* | [**healthCollectorGetPodRestarts**](docs/HealthCollectorApi.md#healthCollectorGetPodRestarts) | **GET** /api/v3/metrics/pods/{type} | Summary: Get the pod restart information Description: Get information about the number of restarts by pod in OCP
*HealthCollectorApi* | [**healthCollectorGetStreamsIngestion**](docs/HealthCollectorApi.md#healthCollectorGetStreamsIngestion) | **GET** /api/v3/metrics/streams/{type} | Summary: Get streams ingestion volume over a given time Description: Get information about streams ingestion volume
*HealthCollectorApi* | [**healthCollectorGetTopGDPCollectors**](docs/HealthCollectorApi.md#healthCollectorGetTopGDPCollectors) | **GET** /api/v3/metrics/collectors/{type} | Summary: Get the top GDP collectors which send data to GI Description: Get information about the top GDP collectors
*HealthCollectorApi* | [**healthCollectorStoreHealthInfo**](docs/HealthCollectorApi.md#healthCollectorStoreHealthInfo) | **POST** /api/v3/health/central_managers/{central_manager_id}/health_info | Summary: Store health info Description: Store health info from GDP into GI. (This API is called from GDP only)
*JumpboxServiceApi* | [**jumpboxServiceAuthorize**](docs/JumpboxServiceApi.md#jumpboxServiceAuthorize) | **POST** /api/v3/authorization | Summary: Authorize Description: Authenticate a user and return a JWT.
*JumpboxServiceApi* | [**jumpboxServiceDeleteTenant**](docs/JumpboxServiceApi.md#jumpboxServiceDeleteTenant) | **DELETE** /api/v3/tenants/{tenant_id} | Summary: Delete tenant Description: Delete a tenant.
*JumpboxServiceApi* | [**jumpboxServiceDeleteUser**](docs/JumpboxServiceApi.md#jumpboxServiceDeleteUser) | **DELETE** /api/v3/users/{user_id} | Summary: Delete user Description: Delete the user.
*JumpboxServiceApi* | [**jumpboxServiceGetTenant**](docs/JumpboxServiceApi.md#jumpboxServiceGetTenant) | **GET** /api/v3/tenants/{tenant_id} | Summary: Get tenant Description: Get a tenant.
*JumpboxServiceApi* | [**jumpboxServiceGetTenants**](docs/JumpboxServiceApi.md#jumpboxServiceGetTenants) | **GET** /api/v3/tenants | Summary: Get tenants Description: Get all tenant base on UID.
*JumpboxServiceApi* | [**jumpboxServiceGetUsers**](docs/JumpboxServiceApi.md#jumpboxServiceGetUsers) | **GET** /api/v3/users | Summary: Get users Description: Get all users base on a tenantID.
*JumpboxServiceApi* | [**jumpboxServicePostTenants**](docs/JumpboxServiceApi.md#jumpboxServicePostTenants) | **POST** /api/v3/tenants | Summary: Post tenants Description: Create a tenant.
*JumpboxServiceApi* | [**jumpboxServicePostUsers**](docs/JumpboxServiceApi.md#jumpboxServicePostUsers) | **POST** /api/v3/users | Summary: Post users Description: Create users.
*JumpboxServiceApi* | [**jumpboxServiceSearchUsers**](docs/JumpboxServiceApi.md#jumpboxServiceSearchUsers) | **POST** /api/v3/users/search | Summary: Search users Description: Search for all users matching the provided string.
*JumpboxServiceApi* | [**jumpboxServiceTestUser**](docs/JumpboxServiceApi.md#jumpboxServiceTestUser) | **POST** /api/v3/users/test | Summary: Test user Description: Test a user lookup to a given LDAP.
*JumpboxServiceApi* | [**jumpboxServiceUpdateTenant**](docs/JumpboxServiceApi.md#jumpboxServiceUpdateTenant) | **PATCH** /api/v3/tenants/{tenant_id} | Summary: Update tenant Description: Update a tenant.
*JumpboxServiceApi* | [**jumpboxServiceUpdateUsers**](docs/JumpboxServiceApi.md#jumpboxServiceUpdateUsers) | **PATCH** /api/v3/users | Summary: Update users Description: Update an array of users.
*NotificationsServiceApi* | [**notificationsServiceCreateTicket**](docs/NotificationsServiceApi.md#notificationsServiceCreateTicket) | **POST** /api/v3/integrations/ticket | Summary: Create ticket Description: Create ticket based on information passed in.
*NotificationsServiceApi* | [**notificationsServiceGetFolders**](docs/NotificationsServiceApi.md#notificationsServiceGetFolders) | **POST** /api/v3/integrations/folders | Summary: Get folders Description: Get folder for the integration connection provided.
*NotificationsServiceApi* | [**notificationsServiceGetNotificationFilename**](docs/NotificationsServiceApi.md#notificationsServiceGetNotificationFilename) | **GET** /api/v3/notifications/filename | Summary: Get notification filename Description: Return filename associated with the notifications record referenced in the associated context record. The notification id is required but may be set in the associated authentication token or explicitly in the request.
*NotificationsServiceApi* | [**notificationsServiceGetNotificationRecord**](docs/NotificationsServiceApi.md#notificationsServiceGetNotificationRecord) | **GET** /api/v3/notifications/details/{notification_id} | Summary: Get notification record Description: Return notifications record with the specified ID.
*NotificationsServiceApi* | [**notificationsServiceGetNotificationRecords**](docs/NotificationsServiceApi.md#notificationsServiceGetNotificationRecords) | **GET** /api/v3/notifications | Summary: Get notification records Description: Return notifications records that match the specified filter.
*NotificationsServiceApi* | [**notificationsServiceGetTicketStatus**](docs/NotificationsServiceApi.md#notificationsServiceGetTicketStatus) | **GET** /api/v3/integrations/ticket/status | Summary: Get ticket status Description: Get the status of the given ticket
*NotificationsServiceApi* | [**notificationsServiceTestIntegration**](docs/NotificationsServiceApi.md#notificationsServiceTestIntegration) | **POST** /api/v3/integrations/test | Summary: Test integration Description: Test the integration connection with the arguments passed in the TestIntegrationRequest.  When possible a test message is sent to the integration to ensure it is functional.
*NotificationsServiceApi* | [**notificationsServiceUpdateNotificationRecord**](docs/NotificationsServiceApi.md#notificationsServiceUpdateNotificationRecord) | **POST** /api/v3/notifications | Summary: Update notification record Description: Update a notification record with the specified values.  The ID field is required and must match an existing notification. All fields other than the ID are optional. Creation timestamp, user and other administrative fields can not updated.
*OutliersEngineApi* | [**outliersEngineGetSourceStatistics**](docs/OutliersEngineApi.md#outliersEngineGetSourceStatistics) | **GET** /api/v3/outliers/source/statistics | Summary: Get source statistics Description: Return statistics regarding the input source, including distribution of verbs, source program, working hours etc.
*OutliersEngineApi* | [**outliersEngineGetStatistics**](docs/OutliersEngineApi.md#outliersEngineGetStatistics) | **GET** /api/v3/outliers/statistics | Summary: Get statistics Description: Return statistics regarding number of outliers, clusters and un/completed periods.
*OutliersEngineApi* | [**outliersEngineGetWorkingHoursPeriods**](docs/OutliersEngineApi.md#outliersEngineGetWorkingHoursPeriods) | **GET** /api/v3/outliers/working_hours_periods | Summary: Get working hours periods Description: Get a list of the working hours periods.
*OutliersEngineApi* | [**outliersEngineRunSimulator**](docs/OutliersEngineApi.md#outliersEngineRunSimulator) | **POST** /api/v3/outliers/simulator | Summary: Run simulator Description: Run outlier simulator.
*OutliersEngineApi* | [**outliersEngineUpdateWorkingHoursPeriods**](docs/OutliersEngineApi.md#outliersEngineUpdateWorkingHoursPeriods) | **PUT** /api/v3/outliers/working_hours_periods | Summary: Update working hours periods Description: Update the working hours periods values.
*OutliersEngineApi* | [**outliersEngineUploadAndAnalyzePeriod**](docs/OutliersEngineApi.md#outliersEngineUploadAndAnalyzePeriod) | **POST** /api/v3/outliers | Summary: Upload and analyze period Description: Run outliers detection on ready periods.
*OutliersEngineApi* | [**outliersEngineUserClustering**](docs/OutliersEngineApi.md#outliersEngineUserClustering) | **POST** /api/v3/outliers/clusters | Summary: User clustering Description: Run user-clustering on current sources.
*PipelineconfigServiceApi* | [**pipelineconfigServiceDeleteTenantResources**](docs/PipelineconfigServiceApi.md#pipelineconfigServiceDeleteTenantResources) | **DELETE** /api/v3/resources/{tenant_id}/{resource} | Summary: Delete a tenant resource Description: Delete tenant specific resources such as db2, mongo, postgres and s3.
*PolicyBuilderApi* | [**policyBuilderClonePolicy**](docs/PolicyBuilderApi.md#policyBuilderClonePolicy) | **POST** /api/v3/policies/clone/{policy_id} | Summary: Clone policy Description: Clone a policy.
*PolicyBuilderApi* | [**policyBuilderCreatePolicy**](docs/PolicyBuilderApi.md#policyBuilderCreatePolicy) | **POST** /api/v3/policies | Summary: Create policy Description: Create Policy returns response code and message.
*PolicyBuilderApi* | [**policyBuilderDeleteGdpSyncEntry**](docs/PolicyBuilderApi.md#policyBuilderDeleteGdpSyncEntry) | **DELETE** /api/v3/policies/sync_entry | Summary: Delete GDP policy sync entry Description: Deletes GDP policy from sync collection
*PolicyBuilderApi* | [**policyBuilderDeletePolicies**](docs/PolicyBuilderApi.md#policyBuilderDeletePolicies) | **DELETE** /api/v3/policies | Summary: Delete policies Description: Delete Policy returns response code and message.
*PolicyBuilderApi* | [**policyBuilderGetGdpPolicyMetaData**](docs/PolicyBuilderApi.md#policyBuilderGetGdpPolicyMetaData) | **GET** /api/v3/policies/metadata_list | Summary: Get GDP policy summary information Description: Get GDP&#39;s CM&#39;s policy summary from mogodb
*PolicyBuilderApi* | [**policyBuilderGetPolicies**](docs/PolicyBuilderApi.md#policyBuilderGetPolicies) | **GET** /api/v3/policies | Summary: Get policies Description: Return a list of policies to the caller.
*PolicyBuilderApi* | [**policyBuilderGetPolicyDetails**](docs/PolicyBuilderApi.md#policyBuilderGetPolicyDetails) | **GET** /api/v3/policies/{policy_id}/details | Summary: Get policy details Description: Return a list of rules inside the policy.
*PolicyBuilderApi* | [**policyBuilderGetPolicyNamesFromRuleIDs**](docs/PolicyBuilderApi.md#policyBuilderGetPolicyNamesFromRuleIDs) | **POST** /api/v3/policies/policy_names | Summary: GetPolicy names from rule IDs Description: Return a map where the key is the rule ID and value is the policy name that has the rule ID.
*PolicyBuilderApi* | [**policyBuilderGetPolicySyncList**](docs/PolicyBuilderApi.md#policyBuilderGetPolicySyncList) | **GET** /api/v3/policies/sync_list | Summary: Get list of synced polices Description: Returns the list and status of sync entries
*PolicyBuilderApi* | [**policyBuilderGetReceivers**](docs/PolicyBuilderApi.md#policyBuilderGetReceivers) | **GET** /api/v3/policies/receivers | Summary: Get receivers Description: Get all the receivers associated with actions.
*PolicyBuilderApi* | [**policyBuilderGetRuleMetadata**](docs/PolicyBuilderApi.md#policyBuilderGetRuleMetadata) | **GET** /api/v3/rules/metadata | Summary: Get rule metadata Description: Return a list of rule parameters and actions to the caller.
*PolicyBuilderApi* | [**policyBuilderInsertGdpPolicy**](docs/PolicyBuilderApi.md#policyBuilderInsertGdpPolicy) | **POST** /api/v3/policies/sync_entry | Summary: Insert GDP policy sync entry Description: Inserts GDP policy&#39;s name into sync collection
*PolicyBuilderApi* | [**policyBuilderInsertGdpPolicyMetaData**](docs/PolicyBuilderApi.md#policyBuilderInsertGdpPolicyMetaData) | **POST** /api/v3/central_managers/{central_manager_id}/policies/policy_metadata | Summary: Insert gdp policy summaries Description: Inserts GDP&#39;s CM&#39;s policy summary information into mogodb. (This API is called from GDP only)
*PolicyBuilderApi* | [**policyBuilderInstallPolicies**](docs/PolicyBuilderApi.md#policyBuilderInstallPolicies) | **PUT** /api/v3/policies/install | Summary: Install policies Description: Activate Policies request performs activations.
*PolicyBuilderApi* | [**policyBuilderIntegrationCheck**](docs/PolicyBuilderApi.md#policyBuilderIntegrationCheck) | **GET** /api/v3/policies/integration_check/{integration_id} | Summary: Integration check Description: Check if integration id is being used in policies.
*PolicyBuilderApi* | [**policyBuilderPoliciesGroups**](docs/PolicyBuilderApi.md#policyBuilderPoliciesGroups) | **GET** /api/v3/policies/groups | Summary: Policies groups Description: Get policy groups.
*PolicyBuilderApi* | [**policyBuilderRuleValidation**](docs/PolicyBuilderApi.md#policyBuilderRuleValidation) | **POST** /api/v3/rules/validate | Summary: Rule validation Description: Validate a rule parameters and actions.
*PolicyBuilderApi* | [**policyBuilderStorePoliciesGdp**](docs/PolicyBuilderApi.md#policyBuilderStorePoliciesGdp) | **POST** /api/v3/policies/{central_manager_id} | Summary: Store policies Gdp Description: Store policies.  (This API is called from GDP only)
*QsDataManagerApi* | [**qSDataManagerGetMasterData**](docs/QsDataManagerApi.md#qSDataManagerGetMasterData) | **GET** /api/v3/datamanager/master-data | Summary: master data for all entities Description: Retrieves All Dimension and Fact tables data.
*QsDataManagerApi* | [**qSDataManagerRegisterScan**](docs/QsDataManagerApi.md#qSDataManagerRegisterScan) | **POST** /api/v3/datamanager/scan | Summary: Insert ScanDetails Description: Register new data into scan dimension table.
*QsDataManagerApi* | [**qSDataManagerRetrieveScan**](docs/QsDataManagerApi.md#qSDataManagerRetrieveScan) | **GET** /api/v3/datamanager/scan/{scan_id}/data | Summary: Fetch ScanDetails Description: Fetch details from scan dimension table.
*QsPluginManagerApi* | [**qSPluginManagerInvokeAppProv**](docs/QsPluginManagerApi.md#qSPluginManagerInvokeAppProv) | **POST** /api/v3/plugins/{plugin_id}/application | Summary: Invoke only application provisioning data plugin Description:Parses app input file and triggers dataload
*QsPluginManagerApi* | [**qSPluginManagerInvokeExplorerV1**](docs/QsPluginManagerApi.md#qSPluginManagerInvokeExplorerV1) | **POST** /api/v3/plugins/{plugin_id}/explorer | Summary: Invoke only explorer inventory data plugin Description:Parses explorer input file and triggers dataload
*QsPluginManagerApi* | [**qSPluginManagerInvokeExplorerV2**](docs/QsPluginManagerApi.md#qSPluginManagerInvokeExplorerV2) | **POST** /api/v3/plugins/{plugin_id}/explorer/analytics | Summary: Invoke only explorer analytics data plugin Description:Parses explorer input file and triggers dataload
*QsPluginManagerApi* | [**qSPluginManagerInvokePlugin**](docs/QsPluginManagerApi.md#qSPluginManagerInvokePlugin) | **POST** /api/v3/plugins/{plugin_id}/network | Summary: Invoke consolidated or only network data plugin Description:Parses input files and triggers dataload
*QsPluginManagerApi* | [**qSPluginManagerInvokePolicy**](docs/QsPluginManagerApi.md#qSPluginManagerInvokePolicy) | **POST** /api/v3/plugins/{plugin_id}/policy | Summary: Invoke only policy data plugin Description:Parses policy input file and triggers dataload
*QsPolicyManagerApi* | [**qSPolicyManagerBatchStatusUpdate**](docs/QsPolicyManagerApi.md#qSPolicyManagerBatchStatusUpdate) | **PUT** /api/v3/policy_manager/tickets/status | BatchStatusUpdate - trigger the batch to update the status of the Ticket .
*QsPolicyManagerApi* | [**qSPolicyManagerCreateTicket**](docs/QsPolicyManagerApi.md#qSPolicyManagerCreateTicket) | **POST** /api/v3/policy_manager/ticket | CreateTicket - Create a new Incident .
*QsPolicyManagerApi* | [**qSPolicyManagerFetchFilesfromBuckets**](docs/QsPolicyManagerApi.md#qSPolicyManagerFetchFilesfromBuckets) | **GET** /api/v3/policy_manager/os-files | FetchFilesfromBuckets - fetch the file(s) from bucket of the object storage
*QsPolicyManagerApi* | [**qSPolicyManagerProcessPolicyDimentionRecords**](docs/QsPolicyManagerApi.md#qSPolicyManagerProcessPolicyDimentionRecords) | **POST** /api/v3/policy_manager/policy/process | ProcessPolicyDimentionRecords - fetch the records from Policy Dimention and update Policy Fact table
*QsPolicyManagerApi* | [**qSPolicyManagerUpdateTicketStatus**](docs/QsPolicyManagerApi.md#qSPolicyManagerUpdateTicketStatus) | **PUT** /api/v3/policy_manager/ticket/status | UpdateTicketStatus - Update the ticket status based on the IntegrationId and TicketId .
*ReportsRunnerApi* | [**reportsRunnerGetActiveQueries**](docs/ReportsRunnerApi.md#reportsRunnerGetActiveQueries) | **POST** /api/v3/queries/search | Summary: Get running queries Description: Get queries that are running more than certain time
*ReportsRunnerApi* | [**reportsRunnerGetAuditDataCount**](docs/ReportsRunnerApi.md#reportsRunnerGetAuditDataCount) | **POST** /api/v3/reports/{report_id}/audit_count | Summary: Get audit data count Description: Get audit data.
*ReportsRunnerApi* | [**reportsRunnerGetChartData**](docs/ReportsRunnerApi.md#reportsRunnerGetChartData) | **POST** /api/v3/charts/run | Summary: Get chart data Description: Get Chart data by chart ID or by specifying report definition and chart settings.
*ReportsRunnerApi* | [**reportsRunnerGetChartDatav2**](docs/ReportsRunnerApi.md#reportsRunnerGetChartDatav2) | **POST** /api/v3/flex-charts/run | 
*ReportsRunnerApi* | [**reportsRunnerGetReportColumnFacet**](docs/ReportsRunnerApi.md#reportsRunnerGetReportColumnFacet) | **POST** /api/v3/reports/facet | Summary: Get report column facet Description: Get counts that is group by values for the selected column.
*ReportsRunnerApi* | [**reportsRunnerGetReportDataCount**](docs/ReportsRunnerApi.md#reportsRunnerGetReportDataCount) | **POST** /api/v3/reports/count | Summary: Get report data count Description: Get report data.
*ReportsRunnerApi* | [**reportsRunnerRunAuditReport**](docs/ReportsRunnerApi.md#reportsRunnerRunAuditReport) | **POST** /api/v3/audit/{report_id}/run | Summary: Run audit report Description: Run task report by SQL based ob report ID and filter definition.
*ReportsRunnerApi* | [**reportsRunnerRunReport**](docs/ReportsRunnerApi.md#reportsRunnerRunReport) | **POST** /api/v3/reports/run | Summary: Run report Description: Run report by report ID or by specifying report definition.
*ReportsRunnerApi* | [**reportsRunnerStopQuery**](docs/ReportsRunnerApi.md#reportsRunnerStopQuery) | **POST** /api/v3/queries/stop | Summary: Stop query Description: Stop a query based on the id
*ReportsServiceApi* | [**reportsServiceCreateCategory**](docs/ReportsServiceApi.md#reportsServiceCreateCategory) | **POST** /api/v3/reports/categories | Summary: Create a category Description: Create a report category
*ReportsServiceApi* | [**reportsServiceCreateChart**](docs/ReportsServiceApi.md#reportsServiceCreateChart) | **POST** /api/v3/charts | Summary: Create chart Description: Create custom chart based on provided properties.
*ReportsServiceApi* | [**reportsServiceCreateChartTemplatev2**](docs/ReportsServiceApi.md#reportsServiceCreateChartTemplatev2) | **POST** /api/v3/flex-charts/templates | Summary: Create chart template v2 Description: Create custom VEGA chart template.
*ReportsServiceApi* | [**reportsServiceCreateChartv2**](docs/ReportsServiceApi.md#reportsServiceCreateChartv2) | **POST** /api/v3/flex-charts | Summary: Create chart v2 Description: Create custom VEGA chart based on provided properties.
*ReportsServiceApi* | [**reportsServiceCreateFieldsByCategory**](docs/ReportsServiceApi.md#reportsServiceCreateFieldsByCategory) | **POST** /api/v3/reports/fields | Summary - Create fields by category Description: Cteate category fields based on provided properties.
*ReportsServiceApi* | [**reportsServiceCreateJoin**](docs/ReportsServiceApi.md#reportsServiceCreateJoin) | **POST** /api/v3/reports/categories/joins | Summary: Create a join Description: Create a custom report join
*ReportsServiceApi* | [**reportsServiceCreateReport**](docs/ReportsServiceApi.md#reportsServiceCreateReport) | **POST** /api/v3/reports | Summary: Create report Description: Create custom report based on provided properties.
*ReportsServiceApi* | [**reportsServiceCreateVariant**](docs/ReportsServiceApi.md#reportsServiceCreateVariant) | **POST** /api/v3/reports/variants | Summary: Create a variant Description: Create a variant for reports
*ReportsServiceApi* | [**reportsServiceDeleteCategory**](docs/ReportsServiceApi.md#reportsServiceDeleteCategory) | **DELETE** /api/v3/reports/categories | Summary: Delete a category Description: Delete a report category
*ReportsServiceApi* | [**reportsServiceDeleteChart**](docs/ReportsServiceApi.md#reportsServiceDeleteChart) | **DELETE** /api/v3/charts/{chart_id} | Summary: Delete chart Description: Delete a custom chart.
*ReportsServiceApi* | [**reportsServiceDeleteChartTemplatev2**](docs/ReportsServiceApi.md#reportsServiceDeleteChartTemplatev2) | **DELETE** /api/v3/flex-charts/templates/{template_id} | Summary: Delete chart template v2 Description: Delete a custom VEGA chart template.
*ReportsServiceApi* | [**reportsServiceDeleteChartv2**](docs/ReportsServiceApi.md#reportsServiceDeleteChartv2) | **DELETE** /api/v3/flex-charts/{chart_id} | Summary: Delete chart v2 Description: Delete a custom VEGA chart.
*ReportsServiceApi* | [**reportsServiceDeleteFieldsByCategory**](docs/ReportsServiceApi.md#reportsServiceDeleteFieldsByCategory) | **DELETE** /api/v3/reports/fields | Summary - Delete fields by category Description: Delete category fields based on provided properties.
*ReportsServiceApi* | [**reportsServiceDeleteJoin**](docs/ReportsServiceApi.md#reportsServiceDeleteJoin) | **DELETE** /api/v3/reports/categories/joins/{join_id} | Summary: Delete a join Description: Delete a custom join
*ReportsServiceApi* | [**reportsServiceDeleteReport**](docs/ReportsServiceApi.md#reportsServiceDeleteReport) | **DELETE** /api/v3/reports/{report_id} | Summary: Delete report Description: Delete a custom report.
*ReportsServiceApi* | [**reportsServiceDeleteVariant**](docs/ReportsServiceApi.md#reportsServiceDeleteVariant) | **DELETE** /api/v3/reports/variants/{variant_id} | Summary: Delete a variant Description: Delete a variant
*ReportsServiceApi* | [**reportsServiceGetCategories**](docs/ReportsServiceApi.md#reportsServiceGetCategories) | **GET** /api/v3/reports/categories | Summary:  Get all available report categories. Description: Get all category related fields or all possible fields.
*ReportsServiceApi* | [**reportsServiceGetChartSettings**](docs/ReportsServiceApi.md#reportsServiceGetChartSettings) | **GET** /api/v3/charts | Summary: Get chart settings Description: Get a custom chart based on provided report id.
*ReportsServiceApi* | [**reportsServiceGetChartSettingsv2**](docs/ReportsServiceApi.md#reportsServiceGetChartSettingsv2) | **GET** /api/v3/flex-charts | Summary: Get chart settings v2 Description: Get a custom VEGA chart based on provided report id.
*ReportsServiceApi* | [**reportsServiceGetChartTemplatesv2**](docs/ReportsServiceApi.md#reportsServiceGetChartTemplatesv2) | **GET** /api/v3/flex-charts/templates | Summary: Get chart template v2 Description: Get all custom VEGA chart templates.
*ReportsServiceApi* | [**reportsServiceGetFieldsByCategories**](docs/ReportsServiceApi.md#reportsServiceGetFieldsByCategories) | **GET** /api/v3/reports/fields/categories | Summary: Get fields by categories Description: Get all category related fields or all possible fields based on a list of categories.
*ReportsServiceApi* | [**reportsServiceGetFieldsByCategory**](docs/ReportsServiceApi.md#reportsServiceGetFieldsByCategory) | **GET** /api/v3/reports/fields | Summary: Get fields by category Description: Get all category related fields or all possible fields.
*ReportsServiceApi* | [**reportsServiceGetJoins**](docs/ReportsServiceApi.md#reportsServiceGetJoins) | **GET** /api/v3/reports/categories/joins | Summary: Get all joins Description: Get all custom joins.
*ReportsServiceApi* | [**reportsServiceGetQueryByReportDefinition**](docs/ReportsServiceApi.md#reportsServiceGetQueryByReportDefinition) | **POST** /api/v3/reports/query/definition | Summary: Get query by report definition Description: Get query by report definition.
*ReportsServiceApi* | [**reportsServiceGetQueryByReportID**](docs/ReportsServiceApi.md#reportsServiceGetQueryByReportID) | **POST** /api/v3/reports/query/id | Summary: Get query by report ID Description: Get query by report ID.
*ReportsServiceApi* | [**reportsServiceGetReportDefinition**](docs/ReportsServiceApi.md#reportsServiceGetReportDefinition) | **GET** /api/v3/reports/{report_id}/definition | Summary: Get report definition Description: Get report definition.
*ReportsServiceApi* | [**reportsServiceGetReportGroups**](docs/ReportsServiceApi.md#reportsServiceGetReportGroups) | **GET** /api/v3/reports_groups | Summary: Get report groups Description: Get reports used by the provided groups.
*ReportsServiceApi* | [**reportsServiceGetReportSynopsis**](docs/ReportsServiceApi.md#reportsServiceGetReportSynopsis) | **GET** /api/v3/reports/{report_id}/synopsis | Summary: Get report synopsis Description: Return BriefReport.
*ReportsServiceApi* | [**reportsServiceGetReportTimestampHeader**](docs/ReportsServiceApi.md#reportsServiceGetReportTimestampHeader) | **GET** /api/v3/reports/headers/timestamp/default | Summary: Get report timestamp header Description: Get where to take a report timestamp given an entity.
*ReportsServiceApi* | [**reportsServiceGetReports**](docs/ReportsServiceApi.md#reportsServiceGetReports) | **GET** /api/v3/reports | Summary: Get reports Description: Get reports list.
*ReportsServiceApi* | [**reportsServiceGetReportsForJoin**](docs/ReportsServiceApi.md#reportsServiceGetReportsForJoin) | **GET** /api/v3/reports/categories/joins/{join_id}/reports | Summary: Get the reports that use a join Description: Get the reports that use a join and the headers that are imported by the reports using the join
*ReportsServiceApi* | [**reportsServiceGetReportsTags**](docs/ReportsServiceApi.md#reportsServiceGetReportsTags) | **GET** /api/v3/reports/tags | Summary: Get reports tags Description: Get all report distinct tags.
*ReportsServiceApi* | [**reportsServiceGetVariant**](docs/ReportsServiceApi.md#reportsServiceGetVariant) | **GET** /api/v3/reports/variants/{variant_id} | Summary: Get a variant Description: Get a given variant
*ReportsServiceApi* | [**reportsServiceGetVariants**](docs/ReportsServiceApi.md#reportsServiceGetVariants) | **GET** /api/v3/reports/variants | Summary: Get all variants Description: Get all variants in reports
*ReportsServiceApi* | [**reportsServicePartialChartUpdate**](docs/ReportsServiceApi.md#reportsServicePartialChartUpdate) | **PATCH** /api/v3/charts/{chart_id} | Summary: Partial chart update Description: Update a custom chart with partial information.
*ReportsServiceApi* | [**reportsServicePartialReportUpdate**](docs/ReportsServiceApi.md#reportsServicePartialReportUpdate) | **PATCH** /api/v3/reports/{report_id} | Summary: Partial report update Description: Update a custom report with partial information.
*ReportsServiceApi* | [**reportsServiceRunVariantOperation**](docs/ReportsServiceApi.md#reportsServiceRunVariantOperation) | **POST** /api/v3/reports/variants/run | Summary: Run a variant Description: Run the operations in a variant
*ReportsServiceApi* | [**reportsServiceTranspose**](docs/ReportsServiceApi.md#reportsServiceTranspose) | **POST** /api/v3/reports/transpose | Summary: Transpose Description: Return the corresponding full sql data.
*ReportsServiceApi* | [**reportsServiceUpdateChart**](docs/ReportsServiceApi.md#reportsServiceUpdateChart) | **PUT** /api/v3/charts/{chart_id} | Summary: Update chart Description: Update a custom chart.
*ReportsServiceApi* | [**reportsServiceUpdateChartv2**](docs/ReportsServiceApi.md#reportsServiceUpdateChartv2) | **PUT** /api/v3/flex-charts/{chart_id} | Summary: Update chart v2 Description: Update a custom VEGA chart.
*ReportsServiceApi* | [**reportsServiceUpdateJoin**](docs/ReportsServiceApi.md#reportsServiceUpdateJoin) | **PUT** /api/v3/reports/categories/joins/{join_id} | Summary: Update a join Description: Update a custom join
*ReportsServiceApi* | [**reportsServiceUpdateReport**](docs/ReportsServiceApi.md#reportsServiceUpdateReport) | **PUT** /api/v3/reports/{report_id} | Summary: Update report Description: Update a custom report.
*ReportsServiceApi* | [**reportsServiceUpdateVariantOverride**](docs/ReportsServiceApi.md#reportsServiceUpdateVariantOverride) | **PUT** /api/v3/reports/variants/{variant_id} | Summary: Update a variant Description: Update a variant with a custom override
*RiskAnalyticsControllerApi* | [**riskAnalyticsControllerEnableDisableRiskEventFeedback**](docs/RiskAnalyticsControllerApi.md#riskAnalyticsControllerEnableDisableRiskEventFeedback) | **PUT** /api/v3/risk_feedback/status | Summary: Enable disable risk rvent feedback Description: Enable or disable the collect feedback process.
*RiskAnalyticsControllerApi* | [**riskAnalyticsControllerEnableDisableRiskEventProcess**](docs/RiskAnalyticsControllerApi.md#riskAnalyticsControllerEnableDisableRiskEventProcess) | **PUT** /api/v3/risk_process/status | Summary: Enable disable risk event process Description: Enable or disable the risk event process.
*RiskAnalyticsControllerApi* | [**riskAnalyticsControllerGetAllClassificationsList**](docs/RiskAnalyticsControllerApi.md#riskAnalyticsControllerGetAllClassificationsList) | **GET** /api/v3/risk_events/classifications | Summary: Get all classifications Description: Get all possible classifications for a risk event.
*RiskAnalyticsControllerApi* | [**riskAnalyticsControllerGetRiskEventClassificationsList**](docs/RiskAnalyticsControllerApi.md#riskAnalyticsControllerGetRiskEventClassificationsList) | **GET** /api/v3/risk_events/feedback/{risk_id} | Summary: Get risk event classifications list Description: retrieves the ClassificationMatchDetails for a given risk id – classification that did not matched will be with class_value 0.
*RiskAnalyticsControllerApi* | [**riskAnalyticsControllerGetRiskEventDataForSummarization**](docs/RiskAnalyticsControllerApi.md#riskAnalyticsControllerGetRiskEventDataForSummarization) | **GET** /api/v3/risk_events/summarization/data/{risk_id} | Summary: Get risk event data needed for summarization task Description: Retrieve the full information about this risk event including all findings data
*RiskAnalyticsControllerApi* | [**riskAnalyticsControllerGetRiskEventDetails**](docs/RiskAnalyticsControllerApi.md#riskAnalyticsControllerGetRiskEventDetails) | **GET** /api/v3/risk_events/details/{risk_id} | Summary: Get risk event details Description: Return the details of a risk event, including risk general info and a list of observations.
*RiskAnalyticsControllerApi* | [**riskAnalyticsControllerGetRiskEventProcessStatus**](docs/RiskAnalyticsControllerApi.md#riskAnalyticsControllerGetRiskEventProcessStatus) | **GET** /api/v3/risk_process/status | Summary: Get risk event process status Description: Get the risk event process status.
*RiskAnalyticsControllerApi* | [**riskAnalyticsControllerGetRiskEventRow**](docs/RiskAnalyticsControllerApi.md#riskAnalyticsControllerGetRiskEventRow) | **GET** /api/v3/risk_events | Summary: Get risk event row Description: Return a list of risk events.
*RiskAnalyticsControllerApi* | [**riskAnalyticsControllerGetRiskEventVulnerabilityAssessmentDetails**](docs/RiskAnalyticsControllerApi.md#riskAnalyticsControllerGetRiskEventVulnerabilityAssessmentDetails) | **PUT** /api/v3/risk_events/va/{risk_id} | Summary: Get vulnerability assessment details for a given risk event Description: Retrieve the information about failed VA tests for assets database and db user
*RiskAnalyticsControllerApi* | [**riskAnalyticsControllerGetRiskFeedback**](docs/RiskAnalyticsControllerApi.md#riskAnalyticsControllerGetRiskFeedback) | **GET** /api/v3/risk_events/feedback | Summary: Get risk feedback Description: Get all feedbacks that are in status NEW/WIP and change them to status WIP.
*RiskAnalyticsControllerApi* | [**riskAnalyticsControllerGetRiskObservationDetails**](docs/RiskAnalyticsControllerApi.md#riskAnalyticsControllerGetRiskObservationDetails) | **GET** /api/v3/risk_events/observations | Summary: Get risk observation details Description: Return details of a single risk observation.
*RiskAnalyticsControllerApi* | [**riskAnalyticsControllerGetUserUISettings**](docs/RiskAnalyticsControllerApi.md#riskAnalyticsControllerGetUserUISettings) | **GET** /api/v3/risk_events/user_ui_settings | Summary: Get user UI settings Description: Get the user settings by user id to display the risk in the UI.
*RiskAnalyticsControllerApi* | [**riskAnalyticsControllerRiskEventTuning**](docs/RiskAnalyticsControllerApi.md#riskAnalyticsControllerRiskEventTuning) | **PUT** /api/v3/risk_events/tuning | Summary: Risk event tuning Description: Perform tuning risk event actions.
*RiskAnalyticsControllerApi* | [**riskAnalyticsControllerSetRiskEventStatus**](docs/RiskAnalyticsControllerApi.md#riskAnalyticsControllerSetRiskEventStatus) | **PUT** /api/v3/risk_events/status | Summary: Set risk event status Description: Update the risk status and justification.
*RiskAnalyticsControllerApi* | [**riskAnalyticsControllerSetUserUISettings**](docs/RiskAnalyticsControllerApi.md#riskAnalyticsControllerSetUserUISettings) | **PUT** /api/v3/risk_events/user_ui_settings | Summary: Set user UI settings Description: Set the user settings by user id in the mongo collection. WARNING: this API should not be used manually or by a system external to Guardium. Using this API to change a user settings may prevent the user from using the Risk Event function within Guardium.
*RiskAnalyticsControllerApi* | [**riskAnalyticsControllerUpdateRiskFeedback**](docs/RiskAnalyticsControllerApi.md#riskAnalyticsControllerUpdateRiskFeedback) | **PUT** /api/v3/risk_events/feedback | Summary: Update risk feedback Description: Provide feedback for one or more risk events
*RiskAnalyticsDataProcessorApi* | [**riskAnalyticsDataProcessorGetRiskContext**](docs/RiskAnalyticsDataProcessorApi.md#riskAnalyticsDataProcessorGetRiskContext) | **GET** /api/v3/risk_events/context/{risk_id} | Summary: Get Risk Event Context Description: Retrieve the context of the given risk ID. This context will be used for LLM interactions.
*RiskAnalyticsDataProcessorApi* | [**riskAnalyticsDataProcessorGetRiskPredefinedQuestions**](docs/RiskAnalyticsDataProcessorApi.md#riskAnalyticsDataProcessorGetRiskPredefinedQuestions) | **GET** /api/v3/risk_events/{risk_id}/questions | Summary: Get Risk Event Predefined Questions Description: Retrieve the Predefined Questions of the given risk ID. This Predefined Questions will be used quick actions recommendations.
*RiskAnalyticsEngineApi* | [**riskAnalyticsEngineGetLeadGeneratorConfig**](docs/RiskAnalyticsEngineApi.md#riskAnalyticsEngineGetLeadGeneratorConfig) | **GET** /api/v3/risk/lead_generator | Summary: Get lead generator config Description: Retrieve the configuration of a lead generator.
*RiskAnalyticsEngineApi* | [**riskAnalyticsEngineUpdateLeadGeneratorConfig**](docs/RiskAnalyticsEngineApi.md#riskAnalyticsEngineUpdateLeadGeneratorConfig) | **PUT** /api/v3/risk/lead_generator | Summary: Update lead generator config Description: Update the configuration of a leads generator.
*RiskAnalyticsMlClassificationApi* | [**riskAnalyticsMlClassificationResetModelToDefaults**](docs/RiskAnalyticsMlClassificationApi.md#riskAnalyticsMlClassificationResetModelToDefaults) | **POST** /api/v3/classification/ml/models/reset | Summary: Reset the model to its default weights. Description: Load the initial model instead of the existing model - this action is irreversible.
*SchedulerServiceApi* | [**schedulerServiceCreateScheduledJob**](docs/SchedulerServiceApi.md#schedulerServiceCreateScheduledJob) | **POST** /api/v3/schedules | Summary: Create scheduled job Description: Create a new scheduled job with tasks.
*SchedulerServiceApi* | [**schedulerServiceDeleteScheduledJob**](docs/SchedulerServiceApi.md#schedulerServiceDeleteScheduledJob) | **DELETE** /api/v3/schedules/{schedule_id} | Summary: Delete scheduled job Description: Delete a single scheduled job.
*SchedulerServiceApi* | [**schedulerServiceGetDependencies**](docs/SchedulerServiceApi.md#schedulerServiceGetDependencies) | **GET** /api/v3/schedules/dependencies | Summary: Get dependencies Description: returns IDs of distribution rules, response templates, or processing rules that are in use
*SchedulerServiceApi* | [**schedulerServiceGetDistributionRules**](docs/SchedulerServiceApi.md#schedulerServiceGetDistributionRules) | **GET** /api/v3/schedules/distribution_rules | Summary: Get distribution rules Description: Return a list of distribution rule IDs that are used by the scheduler Distribution rules can&#39;t be edited if it is used by a scheduled job.
*SchedulerServiceApi* | [**schedulerServiceGetScheduledJobDetails**](docs/SchedulerServiceApi.md#schedulerServiceGetScheduledJobDetails) | **GET** /api/v3/schedules/{schedule_id}/details | Summary: Get scheduled job Description: Return a single ScheduledJob in detail.
*SchedulerServiceApi* | [**schedulerServiceGetScheduledJobs**](docs/SchedulerServiceApi.md#schedulerServiceGetScheduledJobs) | **GET** /api/v3/schedules | Summary: Get scheduled jobs Description: Return a list of scheduled jobs and the linked tasks.
*SchedulerServiceApi* | [**schedulerServiceGetSchedulesByReport**](docs/SchedulerServiceApi.md#schedulerServiceGetSchedulesByReport) | **POST** /api/v3/schedules/searchByReport/{report_id} | Summary: Get schedules by report Description: Return an array of scheduled job IDs that run the report_id.  An empty array is returned if the report_id is not scheduled.
*SchedulerServiceApi* | [**schedulerServiceGetTags**](docs/SchedulerServiceApi.md#schedulerServiceGetTags) | **GET** /api/v3/schedules/tags | Summary: Get tags Description: Return an array of all the unique tags from scheduled jobs.
*SchedulerServiceApi* | [**schedulerServiceSearchScheduledJobs**](docs/SchedulerServiceApi.md#schedulerServiceSearchScheduledJobs) | **POST** /api/v3/schedules/search | Summary: Search scheduled jobs Description: Return a filtered list of scheduled jobs and the linked tasks.
*SchedulerServiceApi* | [**schedulerServiceSearchScheduledTaskRuns**](docs/SchedulerServiceApi.md#schedulerServiceSearchScheduledTaskRuns) | **POST** /api/v3/schedules/runs/search | Summary: Search scheduled task runs Description: Return a list of scheduled task run, start date, end date, status
*SchedulerServiceApi* | [**schedulerServiceUpdateScheduledJob**](docs/SchedulerServiceApi.md#schedulerServiceUpdateScheduledJob) | **PATCH** /api/v3/schedules/{schedule_id} | Summary: Update scheduled job Description: Update a single schedule job.
*SnifAssistServiceApi* | [**snifAssistServiceTestRegex**](docs/SnifAssistServiceApi.md#snifAssistServiceTestRegex) | **POST** /api/v3/snif/test_regex | Summary: Test regex Description: Match a text string with a regular expression using the same sniffer  code used in production to match a regex.
*StreamsServiceApi* | [**streamsServiceCheckAWSCredentials**](docs/StreamsServiceApi.md#streamsServiceCheckAWSCredentials) | **POST** /api/v3/streams/credentials | Summary: Check AWS credentials Description: Service to verify AWS credentials.
*StreamsServiceApi* | [**streamsServiceCheckAzureEventHub**](docs/StreamsServiceApi.md#streamsServiceCheckAzureEventHub) | **POST** /api/v3/streams/azure_eventhub | Summary: Check Azure event hub Description: Service to check Azure event hub.
*StreamsServiceApi* | [**streamsServiceCheckAzureStorageString**](docs/StreamsServiceApi.md#streamsServiceCheckAzureStorageString) | **POST** /api/v3/streams/azure_storage | Summary: Check Azure storage string Description: Service to verify Azure storage connection.
*StreamsServiceApi* | [**streamsServiceGetAWSRegions**](docs/StreamsServiceApi.md#streamsServiceGetAWSRegions) | **GET** /api/v3/streams/regions | Summary: Get AWS regions Description: Service to get AWS regions.
*StreamsServiceApi* | [**streamsServiceListAWSStreams**](docs/StreamsServiceApi.md#streamsServiceListAWSStreams) | **POST** /api/v3/streams | Summary: List AWS streams Description: Service to list AWS Kinesis streams.
*TemplatesServiceApi* | [**templatesServiceCreateIntegration**](docs/TemplatesServiceApi.md#templatesServiceCreateIntegration) | **POST** /api/v3/templates/integration | Summary: Create integration Description: Create a set of new templates for a new integration.
*TemplatesServiceApi* | [**templatesServiceCreateTemplate**](docs/TemplatesServiceApi.md#templatesServiceCreateTemplate) | **POST** /api/v3/templates | Summary: Create template Description: Create a new template.
*TemplatesServiceApi* | [**templatesServiceDeleteIntegration**](docs/TemplatesServiceApi.md#templatesServiceDeleteIntegration) | **DELETE** /api/v3/templates/integrations/{integration_id} | Summary: Delete integration Description: Delete all templates associated with an integration.
*TemplatesServiceApi* | [**templatesServiceDeleteTemplate**](docs/TemplatesServiceApi.md#templatesServiceDeleteTemplate) | **DELETE** /api/v3/templates/{template_id} | Summary: Delete template Description: Delete a specific template.
*TemplatesServiceApi* | [**templatesServiceGetOriginDefaultContent**](docs/TemplatesServiceApi.md#templatesServiceGetOriginDefaultContent) | **GET** /api/v3/templates/origins/{origin}/content | Summary: Get origin default content Description: Return the default content for a template with a specified origin and MIME type.
*TemplatesServiceApi* | [**templatesServiceGetOriginFields**](docs/TemplatesServiceApi.md#templatesServiceGetOriginFields) | **GET** /api/v3/templates/origins/{origin}/fields | Summary: Get origin fields Description: Return the fields available with a specific origin.
*TemplatesServiceApi* | [**templatesServiceGetTemplate**](docs/TemplatesServiceApi.md#templatesServiceGetTemplate) | **GET** /api/v3/templates/{template_id} | Summary: Get template Description: Return a specific template by id.
*TemplatesServiceApi* | [**templatesServiceGetTemplates**](docs/TemplatesServiceApi.md#templatesServiceGetTemplates) | **GET** /api/v3/templates | Summary: Get templates Description: Return all templates based on supplied filters.
*TemplatesServiceApi* | [**templatesServiceTestTemplate**](docs/TemplatesServiceApi.md#templatesServiceTestTemplate) | **POST** /api/v3/templates/test | Summary: Test template Description: Analyze a specified template to ensure will function correctly when utilized.
*TemplatesServiceApi* | [**templatesServiceTransformTemplate**](docs/TemplatesServiceApi.md#templatesServiceTransformTemplate) | **POST** /api/v3/templates/transform | Summary: Transform template Description: Process the specified template and returns the Title and Content based on supplied data.
*TemplatesServiceApi* | [**templatesServiceTransformTemplateJSON**](docs/TemplatesServiceApi.md#templatesServiceTransformTemplateJSON) | **POST** /api/v3/templates/transformjson | Summary: Transform template JSON Description: Process the specified template and returns the Title and Content based on supplied json data string.
*TemplatesServiceApi* | [**templatesServiceUpdateTemplate**](docs/TemplatesServiceApi.md#templatesServiceUpdateTemplate) | **PATCH** /api/v3/templates/{template_id} | Summary: Update template Description: Update a single template.
*TenantuserApi* | [**tenantuserCreateAPIKey**](docs/TenantuserApi.md#tenantuserCreateAPIKey) | **POST** /api/v3/apikeys | Summary: Create API key Description: Create API Key.
*TenantuserApi* | [**tenantuserDeleteAPIKey**](docs/TenantuserApi.md#tenantuserDeleteAPIKey) | **DELETE** /api/v3/apikeys/{id} | Summary: Delete API key Description: Delete APIKey Document based on the document id.
*TenantuserApi* | [**tenantuserDeleteRole**](docs/TenantuserApi.md#tenantuserDeleteRole) | **DELETE** /api/v3/roles/{role_id} | Summary: Delete role Description: Delete a role.
*TenantuserApi* | [**tenantuserGetAPIKeys**](docs/TenantuserApi.md#tenantuserGetAPIKeys) | **GET** /api/v3/apikeys | Summary: Get API keys Description: Get all APIKeys base on a tenant ID.
*TenantuserApi* | [**tenantuserGetCurrentUser**](docs/TenantuserApi.md#tenantuserGetCurrentUser) | **GET** /api/v3/currentuser | Summary: Get current user Description: Return the currently authenticated user.
*TenantuserApi* | [**tenantuserGetPrivilege**](docs/TenantuserApi.md#tenantuserGetPrivilege) | **GET** /api/v3/privileges/{privilege.privilege_id} | Summary: Get privilege Description: Return privilege.
*TenantuserApi* | [**tenantuserGetPrivileges**](docs/TenantuserApi.md#tenantuserGetPrivileges) | **GET** /api/v3/privileges | Summary: Get privileges Description: Return all available privileges (pages, restapi, reports, etc) if no roles are specified If roles are specified, returns cumulative privileges for the list of roles.
*TenantuserApi* | [**tenantuserGetRole**](docs/TenantuserApi.md#tenantuserGetRole) | **GET** /api/v3/roles/{role_id} | Summary: Get role Description: Return single role.
*TenantuserApi* | [**tenantuserGetRoles**](docs/TenantuserApi.md#tenantuserGetRoles) | **GET** /api/v3/roles | Summary: Get roles Description: Return all roles without privileges.
*TenantuserApi* | [**tenantuserGetUser**](docs/TenantuserApi.md#tenantuserGetUser) | **GET** /api/v3/users/user/{user_id} | Summary: Get user Description: Return full user for specified user_id.
*TenantuserApi* | [**tenantuserGetUserNames**](docs/TenantuserApi.md#tenantuserGetUserNames) | **POST** /api/v3/users/names | Summary: Get user names Description: Get user names.
*TenantuserApi* | [**tenantuserGetUserTenant**](docs/TenantuserApi.md#tenantuserGetUserTenant) | **GET** /api/v3/users/tenant/{user_id} | Summary: Get user tenant Description: Return the user plus tenant information.
*TenantuserApi* | [**tenantuserPostPrivilegesBulk**](docs/TenantuserApi.md#tenantuserPostPrivilegesBulk) | **POST** /api/v3/privileges | Summary: Post privileges bulk Description: Perform bulk user add preivilege.
*TenantuserApi* | [**tenantuserPostRole**](docs/TenantuserApi.md#tenantuserPostRole) | **POST** /api/v3/roles | Summary: Post role Description: Create a new role.
*TenantuserApi* | [**tenantuserUpdatePrivilege**](docs/TenantuserApi.md#tenantuserUpdatePrivilege) | **PATCH** /api/v3/privileges/{privilege_id} | Summary: Update privilege Description: Update privilege.
*TenantuserApi* | [**tenantuserUpdatePrivilegesRoleBulk**](docs/TenantuserApi.md#tenantuserUpdatePrivilegesRoleBulk) | **PATCH** /api/v3/privileges | Summary: Update privileges role bulk Description: Perform bulk user update role.
*TenantuserApi* | [**tenantuserUpdateRole**](docs/TenantuserApi.md#tenantuserUpdateRole) | **PATCH** /api/v3/roles/{role_id} | Summary: Update role Description: Update single role.
*TenantuserApi* | [**tenantuserUpdateUserRoleBulk**](docs/TenantuserApi.md#tenantuserUpdateUserRoleBulk) | **PATCH** /api/v3/users/role | Summary: Update user role bulk Description: Perform bulk user add or remove role.
*ThirdPartyVendorsApi* | [**getLinkedVendor**](docs/ThirdPartyVendorsApi.md#getLinkedVendor) | **GET** /api/v1/dspm/linkedVendors/{vendorId}/cloudAccounts | Get additional details of a specific third party vendor
*ThirdPartyVendorsApi* | [**getSingleLinkedVendor**](docs/ThirdPartyVendorsApi.md#getSingleLinkedVendor) | **GET** /api/v1/dspm/linkedVendors/{vendorId} | Get the third party vendors list
*ThirdPartyVendorsApi* | [**listLinkedVendorDataStores**](docs/ThirdPartyVendorsApi.md#listLinkedVendorDataStores) | **GET** /api/v1/dspm/linkedVendors/{vendorId}/dataStores | Get the data stores associated with a third party vendor
*ThirdPartyVendorsApi* | [**listLinkedVendors**](docs/ThirdPartyVendorsApi.md#listLinkedVendors) | **GET** /api/v1/dspm/linkedVendors | Get the summary of a third party vendor
*ThirdPartyVendorsApi* | [**listTrustedAssets**](docs/ThirdPartyVendorsApi.md#listTrustedAssets) | **GET** /api/v1/dspm/linkedVendors/trustedAssets | Get a list of all the actual trusted assets
*UniversalConnectorManagerApi* | [**universalConnectorManagerGetCertificate**](docs/UniversalConnectorManagerApi.md#universalConnectorManagerGetCertificate) | **GET** /api/v3/certificates | Summary: Get certificate Description: Get the certificate that allows secure communication between data sources and universal connections in Guardium.
*UniversalConnectorManagerApi* | [**universalConnectorManagerGetConnectors**](docs/UniversalConnectorManagerApi.md#universalConnectorManagerGetConnectors) | **GET** /api/v3/connectors | Summary: Get connectors Description: Get all the connectors Universal Connector can support. Includes a list of event pipelines (input--filter pairs), along with the supported data source types and platforms.
*UniversalConnectorManagerApi* | [**universalConnectorManagerListConnectionsSummary**](docs/UniversalConnectorManagerApi.md#universalConnectorManagerListConnectionsSummary) | **GET** /api/v3/universal_connections | Summary: List connections summary Description: List a summary of Universal Connector configured connections (AKA datasources).
*UniversalConnectorManagerApi* | [**universalConnectorManagerPluginsList**](docs/UniversalConnectorManagerApi.md#universalConnectorManagerPluginsList) | **GET** /api/v3/plugins | Summary: Plugins list Description: List of all universal connector plugins.
*UniversalConnectorManagerApi* | [**universalConnectorManagerUploadPlugin**](docs/UniversalConnectorManagerApi.md#universalConnectorManagerUploadPlugin) | **POST** /api/v3/plugins | Summary: Upload plugin Description: Upload a plugin-package for Universal Connector.
*WorkflowApi* | [**workflowCreateCase**](docs/WorkflowApi.md#workflowCreateCase) | **POST** /api/v3/cases | Summary: Create case Description: Create single case.
*WorkflowApi* | [**workflowCreateTask**](docs/WorkflowApi.md#workflowCreateTask) | **POST** /api/v3/cases/{case_id}/tasks | Summary: Create task Description: Create single task within a parent case.
*WorkflowApi* | [**workflowGetCases**](docs/WorkflowApi.md#workflowGetCases) | **GET** /api/v3/cases | Summary: Get cases Description: Return all cases requested.
*WorkflowApi* | [**workflowGetCasesCount**](docs/WorkflowApi.md#workflowGetCasesCount) | **POST** /api/v3/cases/count | Summary: Get cases count Description: Get case count.
*WorkflowApi* | [**workflowGetFilename**](docs/WorkflowApi.md#workflowGetFilename) | **GET** /api/v3/cases/{case_id}/tasks/{task_id}/filename | Summary: Get filename Description: Return filename associated with the task referenced in the associated context record.
*WorkflowApi* | [**workflowGetJobsCount**](docs/WorkflowApi.md#workflowGetJobsCount) | **POST** /api/v3/cases/{case_id}/jobs/count | Summary: Get jobs count Description: Get jobs count.
*WorkflowApi* | [**workflowGetReportResult**](docs/WorkflowApi.md#workflowGetReportResult) | **GET** /api/v3/cases/{case_id}/tasks/{task_id}/result | Summary: Get report result Description: Return a page of results.
*WorkflowApi* | [**workflowGetTasks**](docs/WorkflowApi.md#workflowGetTasks) | **GET** /api/v3/cases/{case_id}/tasks | Summary: Get tasks Description: Return all tasks requested.
*WorkflowApi* | [**workflowGetTasksCount**](docs/WorkflowApi.md#workflowGetTasksCount) | **POST** /api/v3/cases/{case_id}/tasks/count | Summary: Get cases count Description: Get case count.
*WorkflowApi* | [**workflowSearchCases**](docs/WorkflowApi.md#workflowSearchCases) | **POST** /api/v3/cases/search | Summary: Search cases Description: Return a subset of cases.
*WorkflowApi* | [**workflowSearchReports**](docs/WorkflowApi.md#workflowSearchReports) | **POST** /api/v3/cases/reports | Summary: Get a list of report IDs Description: Returns a list of report IDs referenced in all cases and tasks
*WorkflowApi* | [**workflowSearchTasks**](docs/WorkflowApi.md#workflowSearchTasks) | **POST** /api/v3/cases/{case_id}/tasks/search | Summary: Search cases Description: Return a subset of cases.
*WorkflowApi* | [**workflowUpdateCases**](docs/WorkflowApi.md#workflowUpdateCases) | **PUT** /api/v3/cases | Summary: Update cases Description: Update multiple cases in one request.
*WorkflowApi* | [**workflowUpdateTasks**](docs/WorkflowApi.md#workflowUpdateTasks) | **PUT** /api/v3/cases/{case_id}/tasks | Summary: Update tasks Description: Update multiple tasks for the same parent in one request.


## Documentation for Models

 - [AccessType](docs/AccessType.md)
 - [AccessTypeCountInner](docs/AccessTypeCountInner.md)
 - [AccessibleDataStores](docs/AccessibleDataStores.md)
 - [AccessiblePermissionsConfigurations](docs/AccessiblePermissionsConfigurations.md)
 - [ActualFlow](docs/ActualFlow.md)
 - [ActualFlowPath](docs/ActualFlowPath.md)
 - [ActualFlowsSummary](docs/ActualFlowsSummary.md)
 - [AddAnalyzedRegion200Response](docs/AddAnalyzedRegion200Response.md)
 - [AddAnalyzedRegionRequest](docs/AddAnalyzedRegionRequest.md)
 - [AddCloudAccounts200Response](docs/AddCloudAccounts200Response.md)
 - [AddCloudAccountsRequest](docs/AddCloudAccountsRequest.md)
 - [AddCloudAccountsRequestCloudAccountsInner](docs/AddCloudAccountsRequestCloudAccountsInner.md)
 - [AddCommentBody](docs/AddCommentBody.md)
 - [AddJiraIntegrationParametersRequest](docs/AddJiraIntegrationParametersRequest.md)
 - [Analyticseventsv3DeleteCacheKeyRequest](docs/Analyticseventsv3DeleteCacheKeyRequest.md)
 - [Analyticseventsv3DeleteCacheKeyResponse](docs/Analyticseventsv3DeleteCacheKeyResponse.md)
 - [Analyticseventsv3PostQSAdvisorRiskRequest](docs/Analyticseventsv3PostQSAdvisorRiskRequest.md)
 - [Analyticseventsv3PostQSAdvisorRiskResponse](docs/Analyticseventsv3PostQSAdvisorRiskResponse.md)
 - [AnalyzedRegion](docs/AnalyzedRegion.md)
 - [AnalyzedRegionValidationResults](docs/AnalyzedRegionValidationResults.md)
 - [Assetsv3AccountVertex](docs/Assetsv3AccountVertex.md)
 - [Assetsv3Action](docs/Assetsv3Action.md)
 - [Assetsv3ApplicationVertex](docs/Assetsv3ApplicationVertex.md)
 - [Assetsv3Asset](docs/Assetsv3Asset.md)
 - [Assetsv3AssetChangeLog](docs/Assetsv3AssetChangeLog.md)
 - [Assetsv3AssetClassification](docs/Assetsv3AssetClassification.md)
 - [Assetsv3AssetControl](docs/Assetsv3AssetControl.md)
 - [Assetsv3AssetEndpoint](docs/Assetsv3AssetEndpoint.md)
 - [Assetsv3AssetFilterTemplateRequest](docs/Assetsv3AssetFilterTemplateRequest.md)
 - [Assetsv3AssetForMergeSplit](docs/Assetsv3AssetForMergeSplit.md)
 - [Assetsv3AssetInformation](docs/Assetsv3AssetInformation.md)
 - [Assetsv3AssetIngestionRequest](docs/Assetsv3AssetIngestionRequest.md)
 - [Assetsv3AssetIngestionResponse](docs/Assetsv3AssetIngestionResponse.md)
 - [Assetsv3AssetOpenRiskEvent](docs/Assetsv3AssetOpenRiskEvent.md)
 - [Assetsv3AssetOpenRiskEventList](docs/Assetsv3AssetOpenRiskEventList.md)
 - [Assetsv3AssetOverviewResponse](docs/Assetsv3AssetOverviewResponse.md)
 - [Assetsv3AssetResourcesInfo](docs/Assetsv3AssetResourcesInfo.md)
 - [Assetsv3AssetRiskEvents](docs/Assetsv3AssetRiskEvents.md)
 - [Assetsv3AssetSubscription](docs/Assetsv3AssetSubscription.md)
 - [Assetsv3AssetTags](docs/Assetsv3AssetTags.md)
 - [Assetsv3AssetVa](docs/Assetsv3AssetVa.md)
 - [Assetsv3AssetView](docs/Assetsv3AssetView.md)
 - [Assetsv3AssetsForMergeSplitResponse](docs/Assetsv3AssetsForMergeSplitResponse.md)
 - [Assetsv3AssetsWithOpenVulnerabilities](docs/Assetsv3AssetsWithOpenVulnerabilities.md)
 - [Assetsv3AssignedTags](docs/Assetsv3AssignedTags.md)
 - [Assetsv3Attributes](docs/Assetsv3Attributes.md)
 - [Assetsv3BeforeAfter](docs/Assetsv3BeforeAfter.md)
 - [Assetsv3Category](docs/Assetsv3Category.md)
 - [Assetsv3ChildCategory](docs/Assetsv3ChildCategory.md)
 - [Assetsv3ClassificationData](docs/Assetsv3ClassificationData.md)
 - [Assetsv3ClassificationScanStatus](docs/Assetsv3ClassificationScanStatus.md)
 - [Assetsv3ClonePolicyRequest](docs/Assetsv3ClonePolicyRequest.md)
 - [Assetsv3ConnectionEdge](docs/Assetsv3ConnectionEdge.md)
 - [Assetsv3CreateUpdatePolicyRequest](docs/Assetsv3CreateUpdatePolicyRequest.md)
 - [Assetsv3CreateUpdatePolicyResponse](docs/Assetsv3CreateUpdatePolicyResponse.md)
 - [Assetsv3CustomProperty](docs/Assetsv3CustomProperty.md)
 - [Assetsv3DatabaseVertex](docs/Assetsv3DatabaseVertex.md)
 - [Assetsv3DeploymentVertex](docs/Assetsv3DeploymentVertex.md)
 - [Assetsv3EndpointVertex](docs/Assetsv3EndpointVertex.md)
 - [Assetsv3ExtendedProp](docs/Assetsv3ExtendedProp.md)
 - [Assetsv3FetchAssetChangeLogRequest](docs/Assetsv3FetchAssetChangeLogRequest.md)
 - [Assetsv3FetchAssetChangeLogResponse](docs/Assetsv3FetchAssetChangeLogResponse.md)
 - [Assetsv3FetchAssetDashboardResponse](docs/Assetsv3FetchAssetDashboardResponse.md)
 - [Assetsv3FetchAssetListRequest](docs/Assetsv3FetchAssetListRequest.md)
 - [Assetsv3FetchAssetListResponse](docs/Assetsv3FetchAssetListResponse.md)
 - [Assetsv3FetchAssetsForMergeSplitResponse](docs/Assetsv3FetchAssetsForMergeSplitResponse.md)
 - [Assetsv3FilterCatagory](docs/Assetsv3FilterCatagory.md)
 - [Assetsv3FilterSubCatagory](docs/Assetsv3FilterSubCatagory.md)
 - [Assetsv3FilterSubCatagoryChild](docs/Assetsv3FilterSubCatagoryChild.md)
 - [Assetsv3FilterTemplate](docs/Assetsv3FilterTemplate.md)
 - [Assetsv3FindAssetNameResponse](docs/Assetsv3FindAssetNameResponse.md)
 - [Assetsv3GetAssetTopologyRequest](docs/Assetsv3GetAssetTopologyRequest.md)
 - [Assetsv3GetAssetTopologyResponse](docs/Assetsv3GetAssetTopologyResponse.md)
 - [Assetsv3GetFilterTemplateResponse](docs/Assetsv3GetFilterTemplateResponse.md)
 - [Assetsv3GetFiltersDataResponse](docs/Assetsv3GetFiltersDataResponse.md)
 - [Assetsv3GroupedAsset](docs/Assetsv3GroupedAsset.md)
 - [Assetsv3HealthType](docs/Assetsv3HealthType.md)
 - [Assetsv3HighestAssetTagCounts](docs/Assetsv3HighestAssetTagCounts.md)
 - [Assetsv3HostVertex](docs/Assetsv3HostVertex.md)
 - [Assetsv3IPVertex](docs/Assetsv3IPVertex.md)
 - [Assetsv3IpHost](docs/Assetsv3IpHost.md)
 - [Assetsv3Level](docs/Assetsv3Level.md)
 - [Assetsv3ListPolicyResponse](docs/Assetsv3ListPolicyResponse.md)
 - [Assetsv3ListRuleResponse](docs/Assetsv3ListRuleResponse.md)
 - [Assetsv3ListTagDomainsResponse](docs/Assetsv3ListTagDomainsResponse.md)
 - [Assetsv3ListTagsResponse](docs/Assetsv3ListTagsResponse.md)
 - [Assetsv3MappedEntities](docs/Assetsv3MappedEntities.md)
 - [Assetsv3MergeOrSplitAssetsRequest](docs/Assetsv3MergeOrSplitAssetsRequest.md)
 - [Assetsv3ModelApplication](docs/Assetsv3ModelApplication.md)
 - [Assetsv3ModelData](docs/Assetsv3ModelData.md)
 - [Assetsv3ModelVertex](docs/Assetsv3ModelVertex.md)
 - [Assetsv3OverviewParameter](docs/Assetsv3OverviewParameter.md)
 - [Assetsv3Policy](docs/Assetsv3Policy.md)
 - [Assetsv3PolicyApplied](docs/Assetsv3PolicyApplied.md)
 - [Assetsv3PolicyUpdate](docs/Assetsv3PolicyUpdate.md)
 - [Assetsv3PortVertex](docs/Assetsv3PortVertex.md)
 - [Assetsv3ResourceData](docs/Assetsv3ResourceData.md)
 - [Assetsv3ResourcesVertex](docs/Assetsv3ResourcesVertex.md)
 - [Assetsv3Rule](docs/Assetsv3Rule.md)
 - [Assetsv3RuleLog](docs/Assetsv3RuleLog.md)
 - [Assetsv3RuleParameter](docs/Assetsv3RuleParameter.md)
 - [Assetsv3RuleType](docs/Assetsv3RuleType.md)
 - [Assetsv3SaveAssignedTagsRequest](docs/Assetsv3SaveAssignedTagsRequest.md)
 - [Assetsv3SaveTagConceptDataRequest](docs/Assetsv3SaveTagConceptDataRequest.md)
 - [Assetsv3SaveTagDomainDataRequest](docs/Assetsv3SaveTagDomainDataRequest.md)
 - [Assetsv3SaveUpdateFilterTemplateRequest](docs/Assetsv3SaveUpdateFilterTemplateRequest.md)
 - [Assetsv3SaveUpdateFilterTemplateResponse](docs/Assetsv3SaveUpdateFilterTemplateResponse.md)
 - [Assetsv3SensitivityInfo](docs/Assetsv3SensitivityInfo.md)
 - [Assetsv3SetBannerStateRequest](docs/Assetsv3SetBannerStateRequest.md)
 - [Assetsv3StatusType](docs/Assetsv3StatusType.md)
 - [Assetsv3StorageVertex](docs/Assetsv3StorageVertex.md)
 - [Assetsv3SubCategory](docs/Assetsv3SubCategory.md)
 - [Assetsv3SubscriptionVertex](docs/Assetsv3SubscriptionVertex.md)
 - [Assetsv3SuggestionsTags](docs/Assetsv3SuggestionsTags.md)
 - [Assetsv3TableColumn](docs/Assetsv3TableColumn.md)
 - [Assetsv3Tag](docs/Assetsv3Tag.md)
 - [Assetsv3TagCategoriesData](docs/Assetsv3TagCategoriesData.md)
 - [Assetsv3TagCategory](docs/Assetsv3TagCategory.md)
 - [Assetsv3TagsAssigned](docs/Assetsv3TagsAssigned.md)
 - [Assetsv3TagsData](docs/Assetsv3TagsData.md)
 - [Assetsv3TagsFilterData](docs/Assetsv3TagsFilterData.md)
 - [Assetsv3TimelineDateRange](docs/Assetsv3TimelineDateRange.md)
 - [Assetsv3UnassignedTags](docs/Assetsv3UnassignedTags.md)
 - [Assetsv3UpdateAssetNameRequest](docs/Assetsv3UpdateAssetNameRequest.md)
 - [Assetsv3UpdatePolicyRequest](docs/Assetsv3UpdatePolicyRequest.md)
 - [Assetsv3VulnerabilityScanStatus](docs/Assetsv3VulnerabilityScanStatus.md)
 - [Assetsv3VulnerabilityTrend](docs/Assetsv3VulnerabilityTrend.md)
 - [Assetsv3WidgetType](docs/Assetsv3WidgetType.md)
 - [Auditv3ActivityRecord](docs/Auditv3ActivityRecord.md)
 - [Auditv3Filter](docs/Auditv3Filter.md)
 - [Auditv3FilterField](docs/Auditv3FilterField.md)
 - [Auditv3GetActivityRecordsResponse](docs/Auditv3GetActivityRecordsResponse.md)
 - [Auditv3PutActivityRecordRequest](docs/Auditv3PutActivityRecordRequest.md)
 - [Auditv3PutActivityRecordResponse](docs/Auditv3PutActivityRecordResponse.md)
 - [AuthCode](docs/AuthCode.md)
 - [AuthInfo](docs/AuthInfo.md)
 - [AuthUrl](docs/AuthUrl.md)
 - [Authenticate200Response](docs/Authenticate200Response.md)
 - [Authenticate400Response](docs/Authenticate400Response.md)
 - [AuthenticateRequest](docs/AuthenticateRequest.md)
 - [AuthserverCheckPermissionForOAuthTokenResponse](docs/AuthserverCheckPermissionForOAuthTokenResponse.md)
 - [AuthserverCreateOauthClientRequest](docs/AuthserverCreateOauthClientRequest.md)
 - [AuthserverCreateOauthClientResponse](docs/AuthserverCreateOauthClientResponse.md)
 - [AuthserverGetAccessTokenResponse](docs/AuthserverGetAccessTokenResponse.md)
 - [AuthserverGetOauthClientResponse](docs/AuthserverGetOauthClientResponse.md)
 - [AuthserverGetPrivilegesResponse](docs/AuthserverGetPrivilegesResponse.md)
 - [AuthserverGetUserResponse](docs/AuthserverGetUserResponse.md)
 - [AuthserverListOauthClientResponse](docs/AuthserverListOauthClientResponse.md)
 - [AuthserverOauthClient](docs/AuthserverOauthClient.md)
 - [ClassificationStatus](docs/ClassificationStatus.md)
 - [ClientInfo](docs/ClientInfo.md)
 - [CloudAccountCountInner](docs/CloudAccountCountInner.md)
 - [CloudAccountDetails](docs/CloudAccountDetails.md)
 - [CloudAccountInstallationStatus](docs/CloudAccountInstallationStatus.md)
 - [CloudAccountsCloudProvidersAnalyzedRegionsOptionsRequest](docs/CloudAccountsCloudProvidersAnalyzedRegionsOptionsRequest.md)
 - [CloudAccountsCloudProvidersOptionsRequest](docs/CloudAccountsCloudProvidersOptionsRequest.md)
 - [CloudAccountsCloudProvidersOptionsRequestCloudAccountsInner](docs/CloudAccountsCloudProvidersOptionsRequestCloudAccountsInner.md)
 - [CloudRegionCountInner](docs/CloudRegionCountInner.md)
 - [CloudServiceProvider](docs/CloudServiceProvider.md)
 - [Comparator](docs/Comparator.md)
 - [Compliance](docs/Compliance.md)
 - [Complianceacceleratorv3Action](docs/Complianceacceleratorv3Action.md)
 - [Complianceacceleratorv3AuditConfig](docs/Complianceacceleratorv3AuditConfig.md)
 - [Complianceacceleratorv3AuditScheduler](docs/Complianceacceleratorv3AuditScheduler.md)
 - [Complianceacceleratorv3ComplianceInfo](docs/Complianceacceleratorv3ComplianceInfo.md)
 - [Complianceacceleratorv3CreateWorkspaceRequest](docs/Complianceacceleratorv3CreateWorkspaceRequest.md)
 - [Complianceacceleratorv3CreateWorkspaceResponse](docs/Complianceacceleratorv3CreateWorkspaceResponse.md)
 - [Complianceacceleratorv3DashboardObject](docs/Complianceacceleratorv3DashboardObject.md)
 - [Complianceacceleratorv3DashboardType](docs/Complianceacceleratorv3DashboardType.md)
 - [Complianceacceleratorv3DeleteComplianceWorkspacesResponse](docs/Complianceacceleratorv3DeleteComplianceWorkspacesResponse.md)
 - [Complianceacceleratorv3EmailConfig](docs/Complianceacceleratorv3EmailConfig.md)
 - [Complianceacceleratorv3GetComplianceInfoResponse](docs/Complianceacceleratorv3GetComplianceInfoResponse.md)
 - [Complianceacceleratorv3Group](docs/Complianceacceleratorv3Group.md)
 - [Complianceacceleratorv3GroupMember](docs/Complianceacceleratorv3GroupMember.md)
 - [Complianceacceleratorv3HydrateComplianceWorkspacesRequest](docs/Complianceacceleratorv3HydrateComplianceWorkspacesRequest.md)
 - [Complianceacceleratorv3HydrateComplianceWorkspacesResponse](docs/Complianceacceleratorv3HydrateComplianceWorkspacesResponse.md)
 - [Complianceacceleratorv3Options](docs/Complianceacceleratorv3Options.md)
 - [Complianceacceleratorv3RecipientType](docs/Complianceacceleratorv3RecipientType.md)
 - [Complianceacceleratorv3Report](docs/Complianceacceleratorv3Report.md)
 - [Complianceacceleratorv3ReportStatus](docs/Complianceacceleratorv3ReportStatus.md)
 - [Complianceacceleratorv3Reports](docs/Complianceacceleratorv3Reports.md)
 - [Complianceacceleratorv3RuleAndAction](docs/Complianceacceleratorv3RuleAndAction.md)
 - [Complianceacceleratorv3StatusResponseBase](docs/Complianceacceleratorv3StatusResponseBase.md)
 - [Complianceacceleratorv3StoreComplianceInfoRequest](docs/Complianceacceleratorv3StoreComplianceInfoRequest.md)
 - [Complianceacceleratorv3StoreComplianceInfoResponse](docs/Complianceacceleratorv3StoreComplianceInfoResponse.md)
 - [Complianceacceleratorv3SyslogConfig](docs/Complianceacceleratorv3SyslogConfig.md)
 - [Complianceacceleratorv3TaskStatus](docs/Complianceacceleratorv3TaskStatus.md)
 - [Complianceacceleratorv3Workspace](docs/Complianceacceleratorv3Workspace.md)
 - [Complianceacceleratorv3WorkspaceCreationStatus](docs/Complianceacceleratorv3WorkspaceCreationStatus.md)
 - [ConfigureSSORequest](docs/ConfigureSSORequest.md)
 - [ConfigureSSORequestIdpMetadata](docs/ConfigureSSORequestIdpMetadata.md)
 - [Connectionsv3Account](docs/Connectionsv3Account.md)
 - [Connectionsv3AccountConfig](docs/Connectionsv3AccountConfig.md)
 - [Connectionsv3Connector](docs/Connectionsv3Connector.md)
 - [Connectionsv3ConnectorAttribute](docs/Connectionsv3ConnectorAttribute.md)
 - [Connectionsv3ConnectorColumn](docs/Connectionsv3ConnectorColumn.md)
 - [Connectionsv3ConnectorFilter](docs/Connectionsv3ConnectorFilter.md)
 - [Connectionsv3ConnectorFilterHeader](docs/Connectionsv3ConnectorFilterHeader.md)
 - [Connectionsv3ConnectorHeader](docs/Connectionsv3ConnectorHeader.md)
 - [Connectionsv3ConnectorSetting](docs/Connectionsv3ConnectorSetting.md)
 - [Connectionsv3ConnectorSettingStat](docs/Connectionsv3ConnectorSettingStat.md)
 - [Connectionsv3ConnectorSummary](docs/Connectionsv3ConnectorSummary.md)
 - [Connectionsv3ConnectorType](docs/Connectionsv3ConnectorType.md)
 - [Connectionsv3CreateAttributesResponse](docs/Connectionsv3CreateAttributesResponse.md)
 - [Connectionsv3CreateConnectionsAccountsRequest](docs/Connectionsv3CreateConnectionsAccountsRequest.md)
 - [Connectionsv3CreateConnectionsAccountsResponse](docs/Connectionsv3CreateConnectionsAccountsResponse.md)
 - [Connectionsv3CreateConnectionsConfigsRequest](docs/Connectionsv3CreateConnectionsConfigsRequest.md)
 - [Connectionsv3CreateConnectionsConfigsResponse](docs/Connectionsv3CreateConnectionsConfigsResponse.md)
 - [Connectionsv3CreatePluginRequest](docs/Connectionsv3CreatePluginRequest.md)
 - [Connectionsv3CreatePluginResponse](docs/Connectionsv3CreatePluginResponse.md)
 - [Connectionsv3CreateSettingsRequest](docs/Connectionsv3CreateSettingsRequest.md)
 - [Connectionsv3DataSource](docs/Connectionsv3DataSource.md)
 - [Connectionsv3DeleteAttributesResponse](docs/Connectionsv3DeleteAttributesResponse.md)
 - [Connectionsv3DeleteConnectionsAccountsResponse](docs/Connectionsv3DeleteConnectionsAccountsResponse.md)
 - [Connectionsv3DeleteConnectionsConfigsResponse](docs/Connectionsv3DeleteConnectionsConfigsResponse.md)
 - [Connectionsv3DeletePluginResponse](docs/Connectionsv3DeletePluginResponse.md)
 - [Connectionsv3GetAttributesResponse](docs/Connectionsv3GetAttributesResponse.md)
 - [Connectionsv3GetBannerStateResponse](docs/Connectionsv3GetBannerStateResponse.md)
 - [Connectionsv3GetConnectionsAccountsResponse](docs/Connectionsv3GetConnectionsAccountsResponse.md)
 - [Connectionsv3GetConnectionsConfigsResponse](docs/Connectionsv3GetConnectionsConfigsResponse.md)
 - [Connectionsv3GetConnectionsWithFiltersRequest](docs/Connectionsv3GetConnectionsWithFiltersRequest.md)
 - [Connectionsv3GetConnectionsWithFiltersResponse](docs/Connectionsv3GetConnectionsWithFiltersResponse.md)
 - [Connectionsv3GetConnectorsSummaryResponse](docs/Connectionsv3GetConnectorsSummaryResponse.md)
 - [Connectionsv3GetDataSourcesResponse](docs/Connectionsv3GetDataSourcesResponse.md)
 - [Connectionsv3GetGuardRecordFieldsResponse](docs/Connectionsv3GetGuardRecordFieldsResponse.md)
 - [Connectionsv3GetHeadersResponse](docs/Connectionsv3GetHeadersResponse.md)
 - [Connectionsv3GetPluginsResponse](docs/Connectionsv3GetPluginsResponse.md)
 - [Connectionsv3GetSettingsResponse](docs/Connectionsv3GetSettingsResponse.md)
 - [Connectionsv3GuardRecordField](docs/Connectionsv3GuardRecordField.md)
 - [Connectionsv3HeaderFilter](docs/Connectionsv3HeaderFilter.md)
 - [Connectionsv3InternalCreateConnectionConfigResponse](docs/Connectionsv3InternalCreateConnectionConfigResponse.md)
 - [Connectionsv3InternalGetStreamingConnectionsResponse](docs/Connectionsv3InternalGetStreamingConnectionsResponse.md)
 - [Connectionsv3InternalSearchConnectionResponse](docs/Connectionsv3InternalSearchConnectionResponse.md)
 - [Connectionsv3OrderType](docs/Connectionsv3OrderType.md)
 - [Connectionsv3PartialConnector](docs/Connectionsv3PartialConnector.md)
 - [Connectionsv3PartialUpdateConnectorsRequest](docs/Connectionsv3PartialUpdateConnectorsRequest.md)
 - [Connectionsv3PartialUpdateConnectorsResponse](docs/Connectionsv3PartialUpdateConnectorsResponse.md)
 - [Connectionsv3PluginConfiguration](docs/Connectionsv3PluginConfiguration.md)
 - [Connectionsv3PluginRecord](docs/Connectionsv3PluginRecord.md)
 - [Connectionsv3StapCommandRequest](docs/Connectionsv3StapCommandRequest.md)
 - [Connectionsv3StapOperation](docs/Connectionsv3StapOperation.md)
 - [Connectionsv3Status](docs/Connectionsv3Status.md)
 - [Connectionsv3StatusResponseBase](docs/Connectionsv3StatusResponseBase.md)
 - [Connectionsv3StreamConnection](docs/Connectionsv3StreamConnection.md)
 - [Connectionsv3StreamConnectionConfig](docs/Connectionsv3StreamConnectionConfig.md)
 - [Connectionsv3StreamingConfigs](docs/Connectionsv3StreamingConfigs.md)
 - [Connectionsv3StreamingConfigsByTenant](docs/Connectionsv3StreamingConfigsByTenant.md)
 - [Connectionsv3UCConnectionConfig](docs/Connectionsv3UCConnectionConfig.md)
 - [Connectionsv3UCConnectionSummary](docs/Connectionsv3UCConnectionSummary.md)
 - [Connectionsv3UpdateAttributesResponse](docs/Connectionsv3UpdateAttributesResponse.md)
 - [Connectionsv3UpdateBannerStateRequest](docs/Connectionsv3UpdateBannerStateRequest.md)
 - [Connectionsv3UpdateBannerStateResponse](docs/Connectionsv3UpdateBannerStateResponse.md)
 - [Connectionsv3UpdateConnectionsAccountsRequest](docs/Connectionsv3UpdateConnectionsAccountsRequest.md)
 - [Connectionsv3UpdateConnectionsAccountsResponse](docs/Connectionsv3UpdateConnectionsAccountsResponse.md)
 - [Connectionsv3UpdateConnectionsConfigsRequest](docs/Connectionsv3UpdateConnectionsConfigsRequest.md)
 - [Connectionsv3UpdateConnectionsConfigsResponse](docs/Connectionsv3UpdateConnectionsConfigsResponse.md)
 - [Connectionsv3UpdateConnectorsRequest](docs/Connectionsv3UpdateConnectorsRequest.md)
 - [Connectionsv3UpdatePluginRequest](docs/Connectionsv3UpdatePluginRequest.md)
 - [Connectionsv3UpdatePluginResponse](docs/Connectionsv3UpdatePluginResponse.md)
 - [Connectionsv3UpdateSettingsRequest](docs/Connectionsv3UpdateSettingsRequest.md)
 - [Dashboardsv3Card](docs/Dashboardsv3Card.md)
 - [Dashboardsv3CardPosition](docs/Dashboardsv3CardPosition.md)
 - [Dashboardsv3CardType](docs/Dashboardsv3CardType.md)
 - [Dashboardsv3CreateDashboardResponse](docs/Dashboardsv3CreateDashboardResponse.md)
 - [Dashboardsv3Dashboard](docs/Dashboardsv3Dashboard.md)
 - [Dashboardsv3DeleteDashboardRequest](docs/Dashboardsv3DeleteDashboardRequest.md)
 - [Dashboardsv3DeleteDashboardResponse](docs/Dashboardsv3DeleteDashboardResponse.md)
 - [Dashboardsv3GetDashboardsResponse](docs/Dashboardsv3GetDashboardsResponse.md)
 - [Dashboardsv3ReportGlobalFilter](docs/Dashboardsv3ReportGlobalFilter.md)
 - [Dashboardsv3ReportOperator](docs/Dashboardsv3ReportOperator.md)
 - [Dashboardsv3ReportParameters](docs/Dashboardsv3ReportParameters.md)
 - [Dashboardsv3TimeRange](docs/Dashboardsv3TimeRange.md)
 - [Dashboardsv3UpdateDashboardRequest](docs/Dashboardsv3UpdateDashboardRequest.md)
 - [Dashboardsv3UpdateDashboardResponse](docs/Dashboardsv3UpdateDashboardResponse.md)
 - [Dashboardsv3UpdateType](docs/Dashboardsv3UpdateType.md)
 - [DataResource](docs/DataResource.md)
 - [DataResourceStats](docs/DataResourceStats.md)
 - [DataResourcesSummary](docs/DataResourcesSummary.md)
 - [DataResourcesSummaryResourceOwnersInner](docs/DataResourcesSummaryResourceOwnersInner.md)
 - [DataResourcesSummaryResourceTypesInner](docs/DataResourcesSummaryResourceTypesInner.md)
 - [DataStore](docs/DataStore.md)
 - [DataStoreEncryptionStatus](docs/DataStoreEncryptionStatus.md)
 - [DataStoreSource](docs/DataStoreSource.md)
 - [DataStoreStats](docs/DataStoreStats.md)
 - [DataStoresSummary](docs/DataStoresSummary.md)
 - [DataStoresSummaryCloudLocationsInner](docs/DataStoresSummaryCloudLocationsInner.md)
 - [DataStoresSummaryServiceProvidersInner](docs/DataStoresSummaryServiceProvidersInner.md)
 - [DataStoresSummaryStoreTypesInner](docs/DataStoresSummaryStoreTypesInner.md)
 - [Databootstrapperv3LoadDataRequest](docs/Databootstrapperv3LoadDataRequest.md)
 - [Databootstrapperv3LoadDataResponse](docs/Databootstrapperv3LoadDataResponse.md)
 - [Datamartprocessorv3DMExtractionLogsRequest](docs/Datamartprocessorv3DMExtractionLogsRequest.md)
 - [Datamartprocessorv3DMExtractionLogsResponse](docs/Datamartprocessorv3DMExtractionLogsResponse.md)
 - [Datamartprocessorv3DatamartFileInfo](docs/Datamartprocessorv3DatamartFileInfo.md)
 - [Datamartprocessorv3DatamartInfo](docs/Datamartprocessorv3DatamartInfo.md)
 - [Datamartprocessorv3GetDatamartInfoResponse](docs/Datamartprocessorv3GetDatamartInfoResponse.md)
 - [Datamartprocessorv3GetDatamartResponse](docs/Datamartprocessorv3GetDatamartResponse.md)
 - [Datamartprocessorv3GetEarliestStartTimeResponse](docs/Datamartprocessorv3GetEarliestStartTimeResponse.md)
 - [Datamartprocessorv3StatusResponseBase](docs/Datamartprocessorv3StatusResponseBase.md)
 - [Ecosystemv3ColumnDefinition](docs/Ecosystemv3ColumnDefinition.md)
 - [Ecosystemv3CreateDatasetRequest](docs/Ecosystemv3CreateDatasetRequest.md)
 - [Ecosystemv3CreateDatasetResponse](docs/Ecosystemv3CreateDatasetResponse.md)
 - [Ecosystemv3DataEntry](docs/Ecosystemv3DataEntry.md)
 - [Ecosystemv3DataInsertRequest](docs/Ecosystemv3DataInsertRequest.md)
 - [Ecosystemv3DataInsertResponse](docs/Ecosystemv3DataInsertResponse.md)
 - [Ecosystemv3DataType](docs/Ecosystemv3DataType.md)
 - [Ecosystemv3DatasetDetail](docs/Ecosystemv3DatasetDetail.md)
 - [Ecosystemv3DatasetRecord](docs/Ecosystemv3DatasetRecord.md)
 - [Ecosystemv3DatasetsFilter](docs/Ecosystemv3DatasetsFilter.md)
 - [Ecosystemv3DeleteDatasetsResponse](docs/Ecosystemv3DeleteDatasetsResponse.md)
 - [Ecosystemv3Filter](docs/Ecosystemv3Filter.md)
 - [Ecosystemv3FilterField](docs/Ecosystemv3FilterField.md)
 - [Ecosystemv3GetDatasetDataResponse](docs/Ecosystemv3GetDatasetDataResponse.md)
 - [Ecosystemv3GetDatasetDetailResponse](docs/Ecosystemv3GetDatasetDetailResponse.md)
 - [Ecosystemv3GetDatasetsResponse](docs/Ecosystemv3GetDatasetsResponse.md)
 - [Ecosystemv3GetPurgableRowsRequest](docs/Ecosystemv3GetPurgableRowsRequest.md)
 - [Ecosystemv3GetPurgableRowsResponse](docs/Ecosystemv3GetPurgableRowsResponse.md)
 - [Ecosystemv3OrderType](docs/Ecosystemv3OrderType.md)
 - [Ecosystemv3PurgeDataResponse](docs/Ecosystemv3PurgeDataResponse.md)
 - [Ecosystemv3ValidateCSVContentResponse](docs/Ecosystemv3ValidateCSVContentResponse.md)
 - [Environment](docs/Environment.md)
 - [Featureflagsv3DeleteFeatureFlagOverridesResponse](docs/Featureflagsv3DeleteFeatureFlagOverridesResponse.md)
 - [Featureflagsv3FeatureFlag](docs/Featureflagsv3FeatureFlag.md)
 - [Featureflagsv3FeatureFlagOverrides](docs/Featureflagsv3FeatureFlagOverrides.md)
 - [Featureflagsv3FeatureFlagValue](docs/Featureflagsv3FeatureFlagValue.md)
 - [Featureflagsv3GetFeatureFlagOverridesResponse](docs/Featureflagsv3GetFeatureFlagOverridesResponse.md)
 - [Featureflagsv3GetFeatureFlagsResponse](docs/Featureflagsv3GetFeatureFlagsResponse.md)
 - [Featureflagsv3UpdateFeatureFlagOverridesRequest](docs/Featureflagsv3UpdateFeatureFlagOverridesRequest.md)
 - [Featureflagsv3UpdateFeatureFlagOverridesResponse](docs/Featureflagsv3UpdateFeatureFlagOverridesResponse.md)
 - [FlowNode](docs/FlowNode.md)
 - [FlowNodeResource](docs/FlowNodeResource.md)
 - [FlowNodeSummary](docs/FlowNodeSummary.md)
 - [FlowType](docs/FlowType.md)
 - [GetAnalyzedRegionStatus200Response](docs/GetAnalyzedRegionStatus200Response.md)
 - [GetJiraIntegrationParameters200Response](docs/GetJiraIntegrationParameters200Response.md)
 - [GetReportGroupsResponseReportGroups](docs/GetReportGroupsResponseReportGroups.md)
 - [GetSSODetails200Response](docs/GetSSODetails200Response.md)
 - [GooglerpcStatus](docs/GooglerpcStatus.md)
 - [Groupbuilderv3CancelGroupImportResponse](docs/Groupbuilderv3CancelGroupImportResponse.md)
 - [Groupbuilderv3CreateGroupRequest](docs/Groupbuilderv3CreateGroupRequest.md)
 - [Groupbuilderv3CreateGroupResponse](docs/Groupbuilderv3CreateGroupResponse.md)
 - [Groupbuilderv3DeleteGroupResponse](docs/Groupbuilderv3DeleteGroupResponse.md)
 - [Groupbuilderv3EditGroupRequest](docs/Groupbuilderv3EditGroupRequest.md)
 - [Groupbuilderv3EditGroupResponse](docs/Groupbuilderv3EditGroupResponse.md)
 - [Groupbuilderv3GdpGroup](docs/Groupbuilderv3GdpGroup.md)
 - [Groupbuilderv3GetExportGroupRequest](docs/Groupbuilderv3GetExportGroupRequest.md)
 - [Groupbuilderv3GetExportGroupResponse](docs/Groupbuilderv3GetExportGroupResponse.md)
 - [Groupbuilderv3GetGroupDetailResponse](docs/Groupbuilderv3GetGroupDetailResponse.md)
 - [Groupbuilderv3GetGroupMembersRequest](docs/Groupbuilderv3GetGroupMembersRequest.md)
 - [Groupbuilderv3GetGroupMembersResponse](docs/Groupbuilderv3GetGroupMembersResponse.md)
 - [Groupbuilderv3GetGroupSyncMappingResponse](docs/Groupbuilderv3GetGroupSyncMappingResponse.md)
 - [Groupbuilderv3GetGroupTypeMappingResponse](docs/Groupbuilderv3GetGroupTypeMappingResponse.md)
 - [Groupbuilderv3GetGroupTypesResponse](docs/Groupbuilderv3GetGroupTypesResponse.md)
 - [Groupbuilderv3GetGroupsRequestGdp](docs/Groupbuilderv3GetGroupsRequestGdp.md)
 - [Groupbuilderv3GetGroupsResponse](docs/Groupbuilderv3GetGroupsResponse.md)
 - [Groupbuilderv3GetGroupsResponseGdp](docs/Groupbuilderv3GetGroupsResponseGdp.md)
 - [Groupbuilderv3GetImportGroupsResponse](docs/Groupbuilderv3GetImportGroupsResponse.md)
 - [Groupbuilderv3Group](docs/Groupbuilderv3Group.md)
 - [Groupbuilderv3GroupMember](docs/Groupbuilderv3GroupMember.md)
 - [Groupbuilderv3GroupType](docs/Groupbuilderv3GroupType.md)
 - [Groupbuilderv3ImportGroupRequest](docs/Groupbuilderv3ImportGroupRequest.md)
 - [Groupbuilderv3ImportGroupResponse](docs/Groupbuilderv3ImportGroupResponse.md)
 - [Groupbuilderv3LdapConfig](docs/Groupbuilderv3LdapConfig.md)
 - [Groupbuilderv3NestedGroupMember](docs/Groupbuilderv3NestedGroupMember.md)
 - [Groupbuilderv3RefreshGroupsRequest](docs/Groupbuilderv3RefreshGroupsRequest.md)
 - [Groupbuilderv3RefreshGroupsResponse](docs/Groupbuilderv3RefreshGroupsResponse.md)
 - [Groupbuilderv3ResetGroupsRequest](docs/Groupbuilderv3ResetGroupsRequest.md)
 - [Groupbuilderv3ResetGroupsResponse](docs/Groupbuilderv3ResetGroupsResponse.md)
 - [Groupbuilderv3StatusResponseBase](docs/Groupbuilderv3StatusResponseBase.md)
 - [Groupbuilderv3StoreGroupMembersGdpRequest](docs/Groupbuilderv3StoreGroupMembersGdpRequest.md)
 - [Groupbuilderv3StoreGroupMembersGdpResponse](docs/Groupbuilderv3StoreGroupMembersGdpResponse.md)
 - [Guardiumconnectorv3Action](docs/Guardiumconnectorv3Action.md)
 - [Guardiumconnectorv3ActionNotifications](docs/Guardiumconnectorv3ActionNotifications.md)
 - [Guardiumconnectorv3ActionParameter](docs/Guardiumconnectorv3ActionParameter.md)
 - [Guardiumconnectorv3AddCMRequest](docs/Guardiumconnectorv3AddCMRequest.md)
 - [Guardiumconnectorv3AddCMResponse](docs/Guardiumconnectorv3AddCMResponse.md)
 - [Guardiumconnectorv3AddDatamartsRequest](docs/Guardiumconnectorv3AddDatamartsRequest.md)
 - [Guardiumconnectorv3AddDatamartsResponse](docs/Guardiumconnectorv3AddDatamartsResponse.md)
 - [Guardiumconnectorv3AddDmExclusionRequest](docs/Guardiumconnectorv3AddDmExclusionRequest.md)
 - [Guardiumconnectorv3AddDmExclusionResponse](docs/Guardiumconnectorv3AddDmExclusionResponse.md)
 - [Guardiumconnectorv3AddTaskRequest](docs/Guardiumconnectorv3AddTaskRequest.md)
 - [Guardiumconnectorv3AddTaskResponse](docs/Guardiumconnectorv3AddTaskResponse.md)
 - [Guardiumconnectorv3AggregationViewListObject](docs/Guardiumconnectorv3AggregationViewListObject.md)
 - [Guardiumconnectorv3AggregatorConfig](docs/Guardiumconnectorv3AggregatorConfig.md)
 - [Guardiumconnectorv3Attribute](docs/Guardiumconnectorv3Attribute.md)
 - [Guardiumconnectorv3BlockUserRequest](docs/Guardiumconnectorv3BlockUserRequest.md)
 - [Guardiumconnectorv3BlockUserResponse](docs/Guardiumconnectorv3BlockUserResponse.md)
 - [Guardiumconnectorv3BlockWhat](docs/Guardiumconnectorv3BlockWhat.md)
 - [Guardiumconnectorv3BlockWhere](docs/Guardiumconnectorv3BlockWhere.md)
 - [Guardiumconnectorv3CM](docs/Guardiumconnectorv3CM.md)
 - [Guardiumconnectorv3CollectorConfig](docs/Guardiumconnectorv3CollectorConfig.md)
 - [Guardiumconnectorv3ConfigureAggregatorExportRequest](docs/Guardiumconnectorv3ConfigureAggregatorExportRequest.md)
 - [Guardiumconnectorv3ConfigureAggregatorExportResponse](docs/Guardiumconnectorv3ConfigureAggregatorExportResponse.md)
 - [Guardiumconnectorv3ConfigureCollectorExportRequest](docs/Guardiumconnectorv3ConfigureCollectorExportRequest.md)
 - [Guardiumconnectorv3ConfigureCollectorExportResponse](docs/Guardiumconnectorv3ConfigureCollectorExportResponse.md)
 - [Guardiumconnectorv3ConfigureStreamingRequest](docs/Guardiumconnectorv3ConfigureStreamingRequest.md)
 - [Guardiumconnectorv3ConfigureStreamingResponse](docs/Guardiumconnectorv3ConfigureStreamingResponse.md)
 - [Guardiumconnectorv3DatabaseConnectionStringRequest](docs/Guardiumconnectorv3DatabaseConnectionStringRequest.md)
 - [Guardiumconnectorv3DatabaseResultResponse](docs/Guardiumconnectorv3DatabaseResultResponse.md)
 - [Guardiumconnectorv3DatamartExecutionMode](docs/Guardiumconnectorv3DatamartExecutionMode.md)
 - [Guardiumconnectorv3DatamartVersionRequest](docs/Guardiumconnectorv3DatamartVersionRequest.md)
 - [Guardiumconnectorv3DatamartVersionResponse](docs/Guardiumconnectorv3DatamartVersionResponse.md)
 - [Guardiumconnectorv3Datamarts](docs/Guardiumconnectorv3Datamarts.md)
 - [Guardiumconnectorv3DeleteCMResponse](docs/Guardiumconnectorv3DeleteCMResponse.md)
 - [Guardiumconnectorv3DeleteDmExclusionResponse](docs/Guardiumconnectorv3DeleteDmExclusionResponse.md)
 - [Guardiumconnectorv3DeleteTaskResponse](docs/Guardiumconnectorv3DeleteTaskResponse.md)
 - [Guardiumconnectorv3DeleteTasksResponse](docs/Guardiumconnectorv3DeleteTasksResponse.md)
 - [Guardiumconnectorv3ExtractionProfile](docs/Guardiumconnectorv3ExtractionProfile.md)
 - [Guardiumconnectorv3GDPReportParameter](docs/Guardiumconnectorv3GDPReportParameter.md)
 - [Guardiumconnectorv3GDPReportResultColumn](docs/Guardiumconnectorv3GDPReportResultColumn.md)
 - [Guardiumconnectorv3GDPReportResultRow](docs/Guardiumconnectorv3GDPReportResultRow.md)
 - [Guardiumconnectorv3GdpPolicyObject](docs/Guardiumconnectorv3GdpPolicyObject.md)
 - [Guardiumconnectorv3GeneralDetailsObject](docs/Guardiumconnectorv3GeneralDetailsObject.md)
 - [Guardiumconnectorv3GetAggregatorsConfigResponse](docs/Guardiumconnectorv3GetAggregatorsConfigResponse.md)
 - [Guardiumconnectorv3GetCMsConfigResponse](docs/Guardiumconnectorv3GetCMsConfigResponse.md)
 - [Guardiumconnectorv3GetCMsResponse](docs/Guardiumconnectorv3GetCMsResponse.md)
 - [Guardiumconnectorv3GetCollectorsConfigResponse](docs/Guardiumconnectorv3GetCollectorsConfigResponse.md)
 - [Guardiumconnectorv3GetDatamartsResponse](docs/Guardiumconnectorv3GetDatamartsResponse.md)
 - [Guardiumconnectorv3GetDmExclusionResponse](docs/Guardiumconnectorv3GetDmExclusionResponse.md)
 - [Guardiumconnectorv3GetGroupMembersResponse](docs/Guardiumconnectorv3GetGroupMembersResponse.md)
 - [Guardiumconnectorv3GetGroupsResponse](docs/Guardiumconnectorv3GetGroupsResponse.md)
 - [Guardiumconnectorv3GetHealthInfoResponse](docs/Guardiumconnectorv3GetHealthInfoResponse.md)
 - [Guardiumconnectorv3GetLatestDMExtractionProfileResponse](docs/Guardiumconnectorv3GetLatestDMExtractionProfileResponse.md)
 - [Guardiumconnectorv3GetPolicyInfoResponse](docs/Guardiumconnectorv3GetPolicyInfoResponse.md)
 - [Guardiumconnectorv3GetPolicySummariesResponse](docs/Guardiumconnectorv3GetPolicySummariesResponse.md)
 - [Guardiumconnectorv3GetStreamingStatusResponse](docs/Guardiumconnectorv3GetStreamingStatusResponse.md)
 - [Guardiumconnectorv3GetSyncDMsResponse](docs/Guardiumconnectorv3GetSyncDMsResponse.md)
 - [Guardiumconnectorv3GetTaskTypesResponse](docs/Guardiumconnectorv3GetTaskTypesResponse.md)
 - [Guardiumconnectorv3GetTasksResponse](docs/Guardiumconnectorv3GetTasksResponse.md)
 - [Guardiumconnectorv3Group](docs/Guardiumconnectorv3Group.md)
 - [Guardiumconnectorv3GroupMember](docs/Guardiumconnectorv3GroupMember.md)
 - [Guardiumconnectorv3InspectionEngineDetails](docs/Guardiumconnectorv3InspectionEngineDetails.md)
 - [Guardiumconnectorv3InspectionEngineObject](docs/Guardiumconnectorv3InspectionEngineObject.md)
 - [Guardiumconnectorv3MUDetailsObj](docs/Guardiumconnectorv3MUDetailsObj.md)
 - [Guardiumconnectorv3ManagedUnitObject](docs/Guardiumconnectorv3ManagedUnitObject.md)
 - [Guardiumconnectorv3NestedGroupMember](docs/Guardiumconnectorv3NestedGroupMember.md)
 - [Guardiumconnectorv3Params](docs/Guardiumconnectorv3Params.md)
 - [Guardiumconnectorv3PolicyData](docs/Guardiumconnectorv3PolicyData.md)
 - [Guardiumconnectorv3Rule](docs/Guardiumconnectorv3Rule.md)
 - [Guardiumconnectorv3RuleParameter](docs/Guardiumconnectorv3RuleParameter.md)
 - [Guardiumconnectorv3RunGDPReportRequest](docs/Guardiumconnectorv3RunGDPReportRequest.md)
 - [Guardiumconnectorv3RunGDPReportResponse](docs/Guardiumconnectorv3RunGDPReportResponse.md)
 - [Guardiumconnectorv3SetupCMRequest](docs/Guardiumconnectorv3SetupCMRequest.md)
 - [Guardiumconnectorv3SetupCMResponse](docs/Guardiumconnectorv3SetupCMResponse.md)
 - [Guardiumconnectorv3SetupDatamartsRequest](docs/Guardiumconnectorv3SetupDatamartsRequest.md)
 - [Guardiumconnectorv3SetupDatamartsResponse](docs/Guardiumconnectorv3SetupDatamartsResponse.md)
 - [Guardiumconnectorv3StapDetailsObject](docs/Guardiumconnectorv3StapDetailsObject.md)
 - [Guardiumconnectorv3StapLiveInfoObject](docs/Guardiumconnectorv3StapLiveInfoObject.md)
 - [Guardiumconnectorv3StapObject](docs/Guardiumconnectorv3StapObject.md)
 - [Guardiumconnectorv3StatusAttribute](docs/Guardiumconnectorv3StatusAttribute.md)
 - [Guardiumconnectorv3StatusRecord](docs/Guardiumconnectorv3StatusRecord.md)
 - [Guardiumconnectorv3StatusResponseBase](docs/Guardiumconnectorv3StatusResponseBase.md)
 - [Guardiumconnectorv3StreamingStatusRecord](docs/Guardiumconnectorv3StreamingStatusRecord.md)
 - [Guardiumconnectorv3SubTaskObject](docs/Guardiumconnectorv3SubTaskObject.md)
 - [Guardiumconnectorv3TaskDefinition](docs/Guardiumconnectorv3TaskDefinition.md)
 - [Guardiumconnectorv3TaskDefinitionObject](docs/Guardiumconnectorv3TaskDefinitionObject.md)
 - [Guardiumconnectorv3TaskErrorRequest](docs/Guardiumconnectorv3TaskErrorRequest.md)
 - [Guardiumconnectorv3TaskErrorResponse](docs/Guardiumconnectorv3TaskErrorResponse.md)
 - [Guardiumconnectorv3TaskObject](docs/Guardiumconnectorv3TaskObject.md)
 - [Guardiumconnectorv3TaskParamsObject](docs/Guardiumconnectorv3TaskParamsObject.md)
 - [Guardiumconnectorv3TaskType](docs/Guardiumconnectorv3TaskType.md)
 - [Guardiumconnectorv3UpdateDmExclusionRequest](docs/Guardiumconnectorv3UpdateDmExclusionRequest.md)
 - [Guardiumconnectorv3UpdateDmExclusionResponse](docs/Guardiumconnectorv3UpdateDmExclusionResponse.md)
 - [Guardiumconnectorv3UpdateStreamingRequest](docs/Guardiumconnectorv3UpdateStreamingRequest.md)
 - [Guardiumconnectorv3UpdateStreamingResponse](docs/Guardiumconnectorv3UpdateStreamingResponse.md)
 - [Guardiumconnectorv3UpdateTaskRequest](docs/Guardiumconnectorv3UpdateTaskRequest.md)
 - [Guardiumconnectorv3UpdateTaskResponse](docs/Guardiumconnectorv3UpdateTaskResponse.md)
 - [Guardiumconnectorv3UtilizationParameterObject](docs/Guardiumconnectorv3UtilizationParameterObject.md)
 - [Healthcollectorv3AggregationDetailsObject](docs/Healthcollectorv3AggregationDetailsObject.md)
 - [Healthcollectorv3AggregationDetailsObjectGdp](docs/Healthcollectorv3AggregationDetailsObjectGdp.md)
 - [Healthcollectorv3CMNodeObject](docs/Healthcollectorv3CMNodeObject.md)
 - [Healthcollectorv3CountObject](docs/Healthcollectorv3CountObject.md)
 - [Healthcollectorv3GeneralDetailsObject](docs/Healthcollectorv3GeneralDetailsObject.md)
 - [Healthcollectorv3GetDataWarehouseUsageResponse](docs/Healthcollectorv3GetDataWarehouseUsageResponse.md)
 - [Healthcollectorv3GetGDPHealthInfoResponse](docs/Healthcollectorv3GetGDPHealthInfoResponse.md)
 - [Healthcollectorv3GetHistoricalHealthInfoResponse](docs/Healthcollectorv3GetHistoricalHealthInfoResponse.md)
 - [Healthcollectorv3GetObjectStorageUsageResponse](docs/Healthcollectorv3GetObjectStorageUsageResponse.md)
 - [Healthcollectorv3GetPVCUsageResponse](docs/Healthcollectorv3GetPVCUsageResponse.md)
 - [Healthcollectorv3GetPodRestartsResponse](docs/Healthcollectorv3GetPodRestartsResponse.md)
 - [Healthcollectorv3GetStreamsIngestionResponse](docs/Healthcollectorv3GetStreamsIngestionResponse.md)
 - [Healthcollectorv3GetTopGDPCollectorsResponse](docs/Healthcollectorv3GetTopGDPCollectorsResponse.md)
 - [Healthcollectorv3HealthInfoObject](docs/Healthcollectorv3HealthInfoObject.md)
 - [Healthcollectorv3HistoricalDataObject](docs/Healthcollectorv3HistoricalDataObject.md)
 - [Healthcollectorv3InspectionEngineDetails](docs/Healthcollectorv3InspectionEngineDetails.md)
 - [Healthcollectorv3InspectionEngineDetailsGdp](docs/Healthcollectorv3InspectionEngineDetailsGdp.md)
 - [Healthcollectorv3InspectionEngineObjectGdp](docs/Healthcollectorv3InspectionEngineObjectGdp.md)
 - [Healthcollectorv3InspectionEnginePresentDetails](docs/Healthcollectorv3InspectionEnginePresentDetails.md)
 - [Healthcollectorv3MUDetailsObj](docs/Healthcollectorv3MUDetailsObj.md)
 - [Healthcollectorv3MUDetailsObjGdp](docs/Healthcollectorv3MUDetailsObjGdp.md)
 - [Healthcollectorv3ManagedUnitObject](docs/Healthcollectorv3ManagedUnitObject.md)
 - [Healthcollectorv3ManagedUnitObjectGdp](docs/Healthcollectorv3ManagedUnitObjectGdp.md)
 - [Healthcollectorv3StapDetailsObject](docs/Healthcollectorv3StapDetailsObject.md)
 - [Healthcollectorv3StapDetailsObjectGdp](docs/Healthcollectorv3StapDetailsObjectGdp.md)
 - [Healthcollectorv3StapInformationObject](docs/Healthcollectorv3StapInformationObject.md)
 - [Healthcollectorv3StapLiveInfoObject](docs/Healthcollectorv3StapLiveInfoObject.md)
 - [Healthcollectorv3StapObject](docs/Healthcollectorv3StapObject.md)
 - [Healthcollectorv3StapObjectGdp](docs/Healthcollectorv3StapObjectGdp.md)
 - [Healthcollectorv3StatusResponseBase](docs/Healthcollectorv3StatusResponseBase.md)
 - [Healthcollectorv3StoreHealthInfoRequest](docs/Healthcollectorv3StoreHealthInfoRequest.md)
 - [Healthcollectorv3StoreHealthInfoResponse](docs/Healthcollectorv3StoreHealthInfoResponse.md)
 - [Healthcollectorv3UnitType](docs/Healthcollectorv3UnitType.md)
 - [Healthcollectorv3Usage](docs/Healthcollectorv3Usage.md)
 - [Healthcollectorv3UtilizationParameterObject](docs/Healthcollectorv3UtilizationParameterObject.md)
 - [Healthcollectorv3UtilizationParameterObjectGdp](docs/Healthcollectorv3UtilizationParameterObjectGdp.md)
 - [IdpMetadataContent](docs/IdpMetadataContent.md)
 - [IdpMetadataUrl](docs/IdpMetadataUrl.md)
 - [InstallationStatus](docs/InstallationStatus.md)
 - [IntegrationTypes](docs/IntegrationTypes.md)
 - [InviteUserBodyParams](docs/InviteUserBodyParams.md)
 - [Jumpboxv3AuthorizeRequest](docs/Jumpboxv3AuthorizeRequest.md)
 - [Jumpboxv3AuthorizeResponse](docs/Jumpboxv3AuthorizeResponse.md)
 - [Jumpboxv3DirectoryEntry](docs/Jumpboxv3DirectoryEntry.md)
 - [Jumpboxv3DisableUsersBulkResponse](docs/Jumpboxv3DisableUsersBulkResponse.md)
 - [Jumpboxv3GetTenantResponse](docs/Jumpboxv3GetTenantResponse.md)
 - [Jumpboxv3GetTenantsResponse](docs/Jumpboxv3GetTenantsResponse.md)
 - [Jumpboxv3PostTenantsRequest](docs/Jumpboxv3PostTenantsRequest.md)
 - [Jumpboxv3PostTenantsResponse](docs/Jumpboxv3PostTenantsResponse.md)
 - [Jumpboxv3PostUsersBulkRequest](docs/Jumpboxv3PostUsersBulkRequest.md)
 - [Jumpboxv3PostUsersBulkResponse](docs/Jumpboxv3PostUsersBulkResponse.md)
 - [Jumpboxv3SearchUsersRequest](docs/Jumpboxv3SearchUsersRequest.md)
 - [Jumpboxv3SearchUsersResponse](docs/Jumpboxv3SearchUsersResponse.md)
 - [Jumpboxv3Tenant](docs/Jumpboxv3Tenant.md)
 - [Jumpboxv3TestUserRequest](docs/Jumpboxv3TestUserRequest.md)
 - [Jumpboxv3TestUserResponse](docs/Jumpboxv3TestUserResponse.md)
 - [Jumpboxv3UpdateTenantRequest](docs/Jumpboxv3UpdateTenantRequest.md)
 - [Jumpboxv3UpdateTenantResponse](docs/Jumpboxv3UpdateTenantResponse.md)
 - [Jumpboxv3UpdateUsersBulkRequest](docs/Jumpboxv3UpdateUsersBulkRequest.md)
 - [Jumpboxv3UpdateUsersBulkResponse](docs/Jumpboxv3UpdateUsersBulkResponse.md)
 - [Jumpboxv3User](docs/Jumpboxv3User.md)
 - [Jumpboxv3UserState](docs/Jumpboxv3UserState.md)
 - [LastSeenSortSchema](docs/LastSeenSortSchema.md)
 - [LinkedAccounts](docs/LinkedAccounts.md)
 - [LinkedVendor](docs/LinkedVendor.md)
 - [ListActualFlowPaths200Response](docs/ListActualFlowPaths200Response.md)
 - [ListActualFlowPathsFilterParameter](docs/ListActualFlowPathsFilterParameter.md)
 - [ListActualFlowPathsSortParameter](docs/ListActualFlowPathsSortParameter.md)
 - [ListActualFlows200Response](docs/ListActualFlows200Response.md)
 - [ListActualFlowsFilterParameter](docs/ListActualFlowsFilterParameter.md)
 - [ListActualFlowsSortParameter](docs/ListActualFlowsSortParameter.md)
 - [ListDataResources200Response](docs/ListDataResources200Response.md)
 - [ListDataResourcesFilterParameter](docs/ListDataResourcesFilterParameter.md)
 - [ListDataResourcesSortParameter](docs/ListDataResourcesSortParameter.md)
 - [ListDataStores200Response](docs/ListDataStores200Response.md)
 - [ListDataStoresFilterParameter](docs/ListDataStoresFilterParameter.md)
 - [ListDataStoresSortParameter](docs/ListDataStoresSortParameter.md)
 - [ListLinkedVendorDataStores200Response](docs/ListLinkedVendorDataStores200Response.md)
 - [ListLinkedVendorDataStoresSortParameter](docs/ListLinkedVendorDataStoresSortParameter.md)
 - [ListPotentialFlows200Response](docs/ListPotentialFlows200Response.md)
 - [ListPotentialFlowsPaths200Response](docs/ListPotentialFlowsPaths200Response.md)
 - [ListSensitivities200Response](docs/ListSensitivities200Response.md)
 - [ListSensitivitiesFilterParameter](docs/ListSensitivitiesFilterParameter.md)
 - [ListTrusteesFilterParameter](docs/ListTrusteesFilterParameter.md)
 - [ListUsersEntitlements200Response](docs/ListUsersEntitlements200Response.md)
 - [ListUsersEntitlements200ResponseResultsInner](docs/ListUsersEntitlements200ResponseResultsInner.md)
 - [ListVendorDataStoresFilterParameter](docs/ListVendorDataStoresFilterParameter.md)
 - [ListVulnerabilities200Response](docs/ListVulnerabilities200Response.md)
 - [ListVulnerabilitiesByDataStore200Response](docs/ListVulnerabilitiesByDataStore200Response.md)
 - [ListVulnerabilitiesByDataStoreSortParameter](docs/ListVulnerabilitiesByDataStoreSortParameter.md)
 - [ListVulnerabilitiesSortParameter](docs/ListVulnerabilitiesSortParameter.md)
 - [NotificationRecordsFilterStateFilter](docs/NotificationRecordsFilterStateFilter.md)
 - [Notificationsv3CreateTicketRequest](docs/Notificationsv3CreateTicketRequest.md)
 - [Notificationsv3CreateTicketResponse](docs/Notificationsv3CreateTicketResponse.md)
 - [Notificationsv3Filter](docs/Notificationsv3Filter.md)
 - [Notificationsv3FilterField](docs/Notificationsv3FilterField.md)
 - [Notificationsv3GetFoldersRequest](docs/Notificationsv3GetFoldersRequest.md)
 - [Notificationsv3GetFoldersResponse](docs/Notificationsv3GetFoldersResponse.md)
 - [Notificationsv3GetNotificationFilenameResponse](docs/Notificationsv3GetNotificationFilenameResponse.md)
 - [Notificationsv3GetNotificationRecordResponse](docs/Notificationsv3GetNotificationRecordResponse.md)
 - [Notificationsv3GetNotificationRecordsResponse](docs/Notificationsv3GetNotificationRecordsResponse.md)
 - [Notificationsv3GetTicketStatusResponse](docs/Notificationsv3GetTicketStatusResponse.md)
 - [Notificationsv3NotificationRecord](docs/Notificationsv3NotificationRecord.md)
 - [Notificationsv3NotificationRecordsFilter](docs/Notificationsv3NotificationRecordsFilter.md)
 - [Notificationsv3NotificationSeverity](docs/Notificationsv3NotificationSeverity.md)
 - [Notificationsv3NotificationState](docs/Notificationsv3NotificationState.md)
 - [Notificationsv3PutNotificationRecordResponse](docs/Notificationsv3PutNotificationRecordResponse.md)
 - [Notificationsv3TemplateProperty](docs/Notificationsv3TemplateProperty.md)
 - [Notificationsv3TestIntegrationRequest](docs/Notificationsv3TestIntegrationRequest.md)
 - [Notificationsv3TestIntegrationResponse](docs/Notificationsv3TestIntegrationResponse.md)
 - [Notificationsv3UpdateNotificationRecordRequest](docs/Notificationsv3UpdateNotificationRecordRequest.md)
 - [Notificationsv3UpdateNotificationRecordResponse](docs/Notificationsv3UpdateNotificationRecordResponse.md)
 - [Office365TenantInfo](docs/Office365TenantInfo.md)
 - [Operator](docs/Operator.md)
 - [Outliersenginev3AnalysisPerformanceStats](docs/Outliersenginev3AnalysisPerformanceStats.md)
 - [Outliersenginev3AnalysisStatisticsMessage](docs/Outliersenginev3AnalysisStatisticsMessage.md)
 - [Outliersenginev3AttributeStatistics](docs/Outliersenginev3AttributeStatistics.md)
 - [Outliersenginev3DatasourcesCoverageStats](docs/Outliersenginev3DatasourcesCoverageStats.md)
 - [Outliersenginev3GetSourceStatisticsResponse](docs/Outliersenginev3GetSourceStatisticsResponse.md)
 - [Outliersenginev3GetWorkingHoursPeriodsResponse](docs/Outliersenginev3GetWorkingHoursPeriodsResponse.md)
 - [Outliersenginev3OutlierResponse](docs/Outliersenginev3OutlierResponse.md)
 - [Outliersenginev3OutlierTypeStats](docs/Outliersenginev3OutlierTypeStats.md)
 - [Outliersenginev3OutliersStats](docs/Outliersenginev3OutliersStats.md)
 - [Outliersenginev3QueueStatisticsMessage](docs/Outliersenginev3QueueStatisticsMessage.md)
 - [Outliersenginev3RunSimulatorRequest](docs/Outliersenginev3RunSimulatorRequest.md)
 - [Outliersenginev3Source](docs/Outliersenginev3Source.md)
 - [Outliersenginev3SourceAttributeType](docs/Outliersenginev3SourceAttributeType.md)
 - [Outliersenginev3SourceAttributesStatistics](docs/Outliersenginev3SourceAttributesStatistics.md)
 - [Outliersenginev3SourcesStats](docs/Outliersenginev3SourcesStats.md)
 - [Outliersenginev3StatisticsResponse](docs/Outliersenginev3StatisticsResponse.md)
 - [Outliersenginev3UpdateWorkingHoursPeriodsRequest](docs/Outliersenginev3UpdateWorkingHoursPeriodsRequest.md)
 - [Outliersenginev3WorkingHoursPeriod](docs/Outliersenginev3WorkingHoursPeriod.md)
 - [PermissionsConfigurations](docs/PermissionsConfigurations.md)
 - [Pipelineconfigv3DeleteTenantResponse](docs/Pipelineconfigv3DeleteTenantResponse.md)
 - [Policybuilderv3Action](docs/Policybuilderv3Action.md)
 - [Policybuilderv3ActionMetadata](docs/Policybuilderv3ActionMetadata.md)
 - [Policybuilderv3ActionNotificationObject](docs/Policybuilderv3ActionNotificationObject.md)
 - [Policybuilderv3ActionParameter](docs/Policybuilderv3ActionParameter.md)
 - [Policybuilderv3ActionParameterMetadata](docs/Policybuilderv3ActionParameterMetadata.md)
 - [Policybuilderv3ActionType](docs/Policybuilderv3ActionType.md)
 - [Policybuilderv3ClonePolicyRequest](docs/Policybuilderv3ClonePolicyRequest.md)
 - [Policybuilderv3ControlFlow](docs/Policybuilderv3ControlFlow.md)
 - [Policybuilderv3CreateUpdatePolicyRequest](docs/Policybuilderv3CreateUpdatePolicyRequest.md)
 - [Policybuilderv3CreateUpdatePolicyResponse](docs/Policybuilderv3CreateUpdatePolicyResponse.md)
 - [Policybuilderv3DeleteGdpPolicySyncResponse](docs/Policybuilderv3DeleteGdpPolicySyncResponse.md)
 - [Policybuilderv3GDPSyncEntry](docs/Policybuilderv3GDPSyncEntry.md)
 - [Policybuilderv3GdpPolicyObject](docs/Policybuilderv3GdpPolicyObject.md)
 - [Policybuilderv3GdpPolicyObjectWithCm](docs/Policybuilderv3GdpPolicyObjectWithCm.md)
 - [Policybuilderv3GdpPolicySyncRes](docs/Policybuilderv3GdpPolicySyncRes.md)
 - [Policybuilderv3GetGdpPolicyMetaDataResponse](docs/Policybuilderv3GetGdpPolicyMetaDataResponse.md)
 - [Policybuilderv3GetIntegrationCheckResponse](docs/Policybuilderv3GetIntegrationCheckResponse.md)
 - [Policybuilderv3GetPoliciesGroupsResponse](docs/Policybuilderv3GetPoliciesGroupsResponse.md)
 - [Policybuilderv3GetPoliciesResponse](docs/Policybuilderv3GetPoliciesResponse.md)
 - [Policybuilderv3GetPolicyDetailsResponse](docs/Policybuilderv3GetPolicyDetailsResponse.md)
 - [Policybuilderv3GetPolicyNamesFromRuleIDsRequest](docs/Policybuilderv3GetPolicyNamesFromRuleIDsRequest.md)
 - [Policybuilderv3GetPolicyNamesFromRuleIDsResponse](docs/Policybuilderv3GetPolicyNamesFromRuleIDsResponse.md)
 - [Policybuilderv3GetPolicySyncListResponse](docs/Policybuilderv3GetPolicySyncListResponse.md)
 - [Policybuilderv3GetReceiversResponse](docs/Policybuilderv3GetReceiversResponse.md)
 - [Policybuilderv3GetRuleValidationRequest](docs/Policybuilderv3GetRuleValidationRequest.md)
 - [Policybuilderv3ImportIssue](docs/Policybuilderv3ImportIssue.md)
 - [Policybuilderv3ImportState](docs/Policybuilderv3ImportState.md)
 - [Policybuilderv3InsertGdpPolicyMetaDataRequest](docs/Policybuilderv3InsertGdpPolicyMetaDataRequest.md)
 - [Policybuilderv3InsertGdpPolicyMetaDataResponse](docs/Policybuilderv3InsertGdpPolicyMetaDataResponse.md)
 - [Policybuilderv3InsertGdpPolicySyncRequest](docs/Policybuilderv3InsertGdpPolicySyncRequest.md)
 - [Policybuilderv3InsertGdpPolicySyncResponse](docs/Policybuilderv3InsertGdpPolicySyncResponse.md)
 - [Policybuilderv3InstallPoliciesRequest](docs/Policybuilderv3InstallPoliciesRequest.md)
 - [Policybuilderv3InstallationAndSequenceObject](docs/Policybuilderv3InstallationAndSequenceObject.md)
 - [Policybuilderv3ParameterOperator](docs/Policybuilderv3ParameterOperator.md)
 - [Policybuilderv3ParameterRelationShip](docs/Policybuilderv3ParameterRelationShip.md)
 - [Policybuilderv3Policy](docs/Policybuilderv3Policy.md)
 - [Policybuilderv3PolicyDetailsForGroups](docs/Policybuilderv3PolicyDetailsForGroups.md)
 - [Policybuilderv3PolicyGroups](docs/Policybuilderv3PolicyGroups.md)
 - [Policybuilderv3PolicyType](docs/Policybuilderv3PolicyType.md)
 - [Policybuilderv3PolicyUpdate](docs/Policybuilderv3PolicyUpdate.md)
 - [Policybuilderv3PossibleValueObj](docs/Policybuilderv3PossibleValueObj.md)
 - [Policybuilderv3RecipientType](docs/Policybuilderv3RecipientType.md)
 - [Policybuilderv3Rule](docs/Policybuilderv3Rule.md)
 - [Policybuilderv3RuleMetadataResponse](docs/Policybuilderv3RuleMetadataResponse.md)
 - [Policybuilderv3RuleParameter](docs/Policybuilderv3RuleParameter.md)
 - [Policybuilderv3RuleParameterMetadata](docs/Policybuilderv3RuleParameterMetadata.md)
 - [Policybuilderv3RuleSeverity](docs/Policybuilderv3RuleSeverity.md)
 - [Policybuilderv3RuleType](docs/Policybuilderv3RuleType.md)
 - [Policybuilderv3StandardCRUDResponse](docs/Policybuilderv3StandardCRUDResponse.md)
 - [Policybuilderv3StatusResponseBase](docs/Policybuilderv3StatusResponseBase.md)
 - [Policybuilderv3StorePolicyGdpRequest](docs/Policybuilderv3StorePolicyGdpRequest.md)
 - [Policybuilderv3StorePolicyGdpResponse](docs/Policybuilderv3StorePolicyGdpResponse.md)
 - [Policybuilderv3SyncStatusType](docs/Policybuilderv3SyncStatusType.md)
 - [Policybuilderv3TargetReceiver](docs/Policybuilderv3TargetReceiver.md)
 - [PotentialFlow](docs/PotentialFlow.md)
 - [PotentialFlowListItem](docs/PotentialFlowListItem.md)
 - [PotentialFlowPath](docs/PotentialFlowPath.md)
 - [PotentialFlowPathListItem](docs/PotentialFlowPathListItem.md)
 - [PotentialFlowType](docs/PotentialFlowType.md)
 - [PotentialFlowsFilterOptions](docs/PotentialFlowsFilterOptions.md)
 - [PotentialFlowsPathsFilterOptions](docs/PotentialFlowsPathsFilterOptions.md)
 - [PotentialFlowsSummary](docs/PotentialFlowsSummary.md)
 - [ProtobufAny](docs/ProtobufAny.md)
 - [ProtobufFieldMask](docs/ProtobufFieldMask.md)
 - [ProtobufNullValue](docs/ProtobufNullValue.md)
 - [Qspmdatamanagerv3AppData](docs/Qspmdatamanagerv3AppData.md)
 - [Qspmdatamanagerv3AppDataResponse](docs/Qspmdatamanagerv3AppDataResponse.md)
 - [Qspmdatamanagerv3MasterDataModel](docs/Qspmdatamanagerv3MasterDataModel.md)
 - [Qspmdatamanagerv3MasterDataResponse](docs/Qspmdatamanagerv3MasterDataResponse.md)
 - [Qspmdatamanagerv3NetlocData](docs/Qspmdatamanagerv3NetlocData.md)
 - [Qspmdatamanagerv3NetlocDataResponse](docs/Qspmdatamanagerv3NetlocDataResponse.md)
 - [Qspmdatamanagerv3Row](docs/Qspmdatamanagerv3Row.md)
 - [Qspmdatamanagerv3ScanRequest](docs/Qspmdatamanagerv3ScanRequest.md)
 - [Qspmdatamanagerv3ScanResponse](docs/Qspmdatamanagerv3ScanResponse.md)
 - [Qspmdatamanagerv3SearchEntityDataResponse](docs/Qspmdatamanagerv3SearchEntityDataResponse.md)
 - [Qspmdatamanagerv3UpdateNetLocResponse](docs/Qspmdatamanagerv3UpdateNetLocResponse.md)
 - [Qspmpluginmanagerv3EntityNewSchema](docs/Qspmpluginmanagerv3EntityNewSchema.md)
 - [Qspmpluginmanagerv3PluginRQ](docs/Qspmpluginmanagerv3PluginRQ.md)
 - [Qspmpluginmanagerv3PluginRS](docs/Qspmpluginmanagerv3PluginRS.md)
 - [Qspmpluginmanagerv3PolicyPluginRQ](docs/Qspmpluginmanagerv3PolicyPluginRQ.md)
 - [Qspmpluginmanagerv3PolicyPluginRS](docs/Qspmpluginmanagerv3PolicyPluginRS.md)
 - [Qspmpluginmanagerv3ValidationResult](docs/Qspmpluginmanagerv3ValidationResult.md)
 - [Qspmpolicymanagerv3CreateTicketRequest](docs/Qspmpolicymanagerv3CreateTicketRequest.md)
 - [Qspmpolicymanagerv3CreateTicketResponse](docs/Qspmpolicymanagerv3CreateTicketResponse.md)
 - [Qspmpolicymanagerv3FetchObjectStoreFileResponse](docs/Qspmpolicymanagerv3FetchObjectStoreFileResponse.md)
 - [Qspmpolicymanagerv3NotificationSeverity](docs/Qspmpolicymanagerv3NotificationSeverity.md)
 - [Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest](docs/Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest.md)
 - [Qspmpolicymanagerv3ProcessPolicyDimentionRecordsResonse](docs/Qspmpolicymanagerv3ProcessPolicyDimentionRecordsResonse.md)
 - [Qspmpolicymanagerv3StandardEmptyResponse](docs/Qspmpolicymanagerv3StandardEmptyResponse.md)
 - [Qspmpolicymanagerv3UpdateTicketStatusRequest](docs/Qspmpolicymanagerv3UpdateTicketStatusRequest.md)
 - [Qspmpolicymanagerv3UpdateTicketStatusResponse](docs/Qspmpolicymanagerv3UpdateTicketStatusResponse.md)
 - [QuestionType](docs/QuestionType.md)
 - [RemoveAccountsInstructions200Response](docs/RemoveAccountsInstructions200Response.md)
 - [RemoveResource200Response](docs/RemoveResource200Response.md)
 - [ReportGroupsReport](docs/ReportGroupsReport.md)
 - [Reportsrunnerv3ActiveQuery](docs/Reportsrunnerv3ActiveQuery.md)
 - [Reportsrunnerv3DataRow](docs/Reportsrunnerv3DataRow.md)
 - [Reportsrunnerv3ExportJobStatus](docs/Reportsrunnerv3ExportJobStatus.md)
 - [Reportsrunnerv3FileType](docs/Reportsrunnerv3FileType.md)
 - [Reportsrunnerv3Filter](docs/Reportsrunnerv3Filter.md)
 - [Reportsrunnerv3FilterHeaders](docs/Reportsrunnerv3FilterHeaders.md)
 - [Reportsrunnerv3GetActiveQueriesRequest](docs/Reportsrunnerv3GetActiveQueriesRequest.md)
 - [Reportsrunnerv3GetActiveQueriesResponse](docs/Reportsrunnerv3GetActiveQueriesResponse.md)
 - [Reportsrunnerv3GetAuditDataCountRequest](docs/Reportsrunnerv3GetAuditDataCountRequest.md)
 - [Reportsrunnerv3GetChartDataRequest](docs/Reportsrunnerv3GetChartDataRequest.md)
 - [Reportsrunnerv3GetChartDataRequestv2](docs/Reportsrunnerv3GetChartDataRequestv2.md)
 - [Reportsrunnerv3GetChartDataResponse](docs/Reportsrunnerv3GetChartDataResponse.md)
 - [Reportsrunnerv3GetChartDataResponsev2](docs/Reportsrunnerv3GetChartDataResponsev2.md)
 - [Reportsrunnerv3GetExportReportJobStatusResponse](docs/Reportsrunnerv3GetExportReportJobStatusResponse.md)
 - [Reportsrunnerv3GetReportColumnFacetRequest](docs/Reportsrunnerv3GetReportColumnFacetRequest.md)
 - [Reportsrunnerv3GetReportColumnFacetResponse](docs/Reportsrunnerv3GetReportColumnFacetResponse.md)
 - [Reportsrunnerv3GetReportDataCountRequest](docs/Reportsrunnerv3GetReportDataCountRequest.md)
 - [Reportsrunnerv3GetReportDataCountResponse](docs/Reportsrunnerv3GetReportDataCountResponse.md)
 - [Reportsrunnerv3JobType](docs/Reportsrunnerv3JobType.md)
 - [Reportsrunnerv3RunAuditReportRequest](docs/Reportsrunnerv3RunAuditReportRequest.md)
 - [Reportsrunnerv3RunReportRequest](docs/Reportsrunnerv3RunReportRequest.md)
 - [Reportsrunnerv3RunReportResponse](docs/Reportsrunnerv3RunReportResponse.md)
 - [Reportsrunnerv3StopExportReportJobResponse](docs/Reportsrunnerv3StopExportReportJobResponse.md)
 - [Reportsrunnerv3StopQueryRequest](docs/Reportsrunnerv3StopQueryRequest.md)
 - [Reportsrunnerv3StopQueryResponse](docs/Reportsrunnerv3StopQueryResponse.md)
 - [Reportsrunnerv3WriteResultsToFileResponse](docs/Reportsrunnerv3WriteResultsToFileResponse.md)
 - [Reportsrunnerv3WriteResultsToGroupResponse](docs/Reportsrunnerv3WriteResultsToGroupResponse.md)
 - [Reportsv3AggregationType](docs/Reportsv3AggregationType.md)
 - [Reportsv3BriefReport](docs/Reportsv3BriefReport.md)
 - [Reportsv3Category](docs/Reportsv3Category.md)
 - [Reportsv3CategoryDetail](docs/Reportsv3CategoryDetail.md)
 - [Reportsv3CategoryField](docs/Reportsv3CategoryField.md)
 - [Reportsv3CategoryVersion](docs/Reportsv3CategoryVersion.md)
 - [Reportsv3ChartDisplayLayout](docs/Reportsv3ChartDisplayLayout.md)
 - [Reportsv3ChartSettings](docs/Reportsv3ChartSettings.md)
 - [Reportsv3ChartSettingsv2](docs/Reportsv3ChartSettingsv2.md)
 - [Reportsv3ChartType](docs/Reportsv3ChartType.md)
 - [Reportsv3ContributionPointersInfoObject](docs/Reportsv3ContributionPointersInfoObject.md)
 - [Reportsv3CreateCategoryRequest](docs/Reportsv3CreateCategoryRequest.md)
 - [Reportsv3CreateCategoryResponse](docs/Reportsv3CreateCategoryResponse.md)
 - [Reportsv3CreateChartRequest](docs/Reportsv3CreateChartRequest.md)
 - [Reportsv3CreateChartResponse](docs/Reportsv3CreateChartResponse.md)
 - [Reportsv3CreateChartTemplatev2Request](docs/Reportsv3CreateChartTemplatev2Request.md)
 - [Reportsv3CreateChartTemplatev2Response](docs/Reportsv3CreateChartTemplatev2Response.md)
 - [Reportsv3CreateChartv2Request](docs/Reportsv3CreateChartv2Request.md)
 - [Reportsv3CreateChartv2Response](docs/Reportsv3CreateChartv2Response.md)
 - [Reportsv3CreateFieldsByCategoryRequest](docs/Reportsv3CreateFieldsByCategoryRequest.md)
 - [Reportsv3CreateFieldsByCategoryResponse](docs/Reportsv3CreateFieldsByCategoryResponse.md)
 - [Reportsv3CreateJoinRequest](docs/Reportsv3CreateJoinRequest.md)
 - [Reportsv3CreateJoinResponse](docs/Reportsv3CreateJoinResponse.md)
 - [Reportsv3CreateReportRequest](docs/Reportsv3CreateReportRequest.md)
 - [Reportsv3CreateReportResponse](docs/Reportsv3CreateReportResponse.md)
 - [Reportsv3CreateVariantRequest](docs/Reportsv3CreateVariantRequest.md)
 - [Reportsv3CreateVariantResponse](docs/Reportsv3CreateVariantResponse.md)
 - [Reportsv3CustomChartTemplatev2](docs/Reportsv3CustomChartTemplatev2.md)
 - [Reportsv3DateRange](docs/Reportsv3DateRange.md)
 - [Reportsv3DateRangeType](docs/Reportsv3DateRangeType.md)
 - [Reportsv3DateRangeUnit](docs/Reportsv3DateRangeUnit.md)
 - [Reportsv3DeleteCategoryResponse](docs/Reportsv3DeleteCategoryResponse.md)
 - [Reportsv3DeleteChartResponse](docs/Reportsv3DeleteChartResponse.md)
 - [Reportsv3DeleteChartTemplatev2Response](docs/Reportsv3DeleteChartTemplatev2Response.md)
 - [Reportsv3DeleteChartv2Response](docs/Reportsv3DeleteChartv2Response.md)
 - [Reportsv3DeleteFieldsByCategoryResponse](docs/Reportsv3DeleteFieldsByCategoryResponse.md)
 - [Reportsv3DeleteJoinResponse](docs/Reportsv3DeleteJoinResponse.md)
 - [Reportsv3DeleteReportResponse](docs/Reportsv3DeleteReportResponse.md)
 - [Reportsv3DeleteVariantResponse](docs/Reportsv3DeleteVariantResponse.md)
 - [Reportsv3DisplayHeader](docs/Reportsv3DisplayHeader.md)
 - [Reportsv3FieldName](docs/Reportsv3FieldName.md)
 - [Reportsv3Filter](docs/Reportsv3Filter.md)
 - [Reportsv3FilterHeaders](docs/Reportsv3FilterHeaders.md)
 - [Reportsv3GetCategoriesResponse](docs/Reportsv3GetCategoriesResponse.md)
 - [Reportsv3GetChartQueryResponse](docs/Reportsv3GetChartQueryResponse.md)
 - [Reportsv3GetChartQueryResponsev2](docs/Reportsv3GetChartQueryResponsev2.md)
 - [Reportsv3GetChartSettingsResponse](docs/Reportsv3GetChartSettingsResponse.md)
 - [Reportsv3GetChartSettingsv2Response](docs/Reportsv3GetChartSettingsv2Response.md)
 - [Reportsv3GetChartTemplatesv2Response](docs/Reportsv3GetChartTemplatesv2Response.md)
 - [Reportsv3GetFieldsByCategoriesResponse](docs/Reportsv3GetFieldsByCategoriesResponse.md)
 - [Reportsv3GetFieldsByCategoryResponse](docs/Reportsv3GetFieldsByCategoryResponse.md)
 - [Reportsv3GetJoinsResponse](docs/Reportsv3GetJoinsResponse.md)
 - [Reportsv3GetQueryByReportDefinitionRequest](docs/Reportsv3GetQueryByReportDefinitionRequest.md)
 - [Reportsv3GetQueryByReportIDRequest](docs/Reportsv3GetQueryByReportIDRequest.md)
 - [Reportsv3GetReportDefinitionResponse](docs/Reportsv3GetReportDefinitionResponse.md)
 - [Reportsv3GetReportGroupsResponse](docs/Reportsv3GetReportGroupsResponse.md)
 - [Reportsv3GetReportQueryResponse](docs/Reportsv3GetReportQueryResponse.md)
 - [Reportsv3GetReportSynopsisResponse](docs/Reportsv3GetReportSynopsisResponse.md)
 - [Reportsv3GetReportTimestampHeaderResponse](docs/Reportsv3GetReportTimestampHeaderResponse.md)
 - [Reportsv3GetReportsForJoinResponse](docs/Reportsv3GetReportsForJoinResponse.md)
 - [Reportsv3GetReportsResponse](docs/Reportsv3GetReportsResponse.md)
 - [Reportsv3GetReportsTagsResponse](docs/Reportsv3GetReportsTagsResponse.md)
 - [Reportsv3GetVariantResponse](docs/Reportsv3GetVariantResponse.md)
 - [Reportsv3GetVariantsResponse](docs/Reportsv3GetVariantsResponse.md)
 - [Reportsv3Header](docs/Reportsv3Header.md)
 - [Reportsv3HeaderDataType](docs/Reportsv3HeaderDataType.md)
 - [Reportsv3HeaderDescription](docs/Reportsv3HeaderDescription.md)
 - [Reportsv3HeaderPair](docs/Reportsv3HeaderPair.md)
 - [Reportsv3HeaderType](docs/Reportsv3HeaderType.md)
 - [Reportsv3InReportAdditionalParameter](docs/Reportsv3InReportAdditionalParameter.md)
 - [Reportsv3JobType](docs/Reportsv3JobType.md)
 - [Reportsv3JoinDefinition](docs/Reportsv3JoinDefinition.md)
 - [Reportsv3JoinDefinitionWithID](docs/Reportsv3JoinDefinitionWithID.md)
 - [Reportsv3Literal](docs/Reportsv3Literal.md)
 - [Reportsv3ModelType](docs/Reportsv3ModelType.md)
 - [Reportsv3OperatorType](docs/Reportsv3OperatorType.md)
 - [Reportsv3OptionType](docs/Reportsv3OptionType.md)
 - [Reportsv3OrderBy](docs/Reportsv3OrderBy.md)
 - [Reportsv3ParameterType](docs/Reportsv3ParameterType.md)
 - [Reportsv3PartialChartUpdateRequest](docs/Reportsv3PartialChartUpdateRequest.md)
 - [Reportsv3PartialChartUpdateResponse](docs/Reportsv3PartialChartUpdateResponse.md)
 - [Reportsv3PartialReportUpdateRequest](docs/Reportsv3PartialReportUpdateRequest.md)
 - [Reportsv3PartialReportUpdateResponse](docs/Reportsv3PartialReportUpdateResponse.md)
 - [Reportsv3ReportAggFilter](docs/Reportsv3ReportAggFilter.md)
 - [Reportsv3ReportAggFilterCondition](docs/Reportsv3ReportAggFilterCondition.md)
 - [Reportsv3ReportDefinition](docs/Reportsv3ReportDefinition.md)
 - [Reportsv3ReportDisplayLayout](docs/Reportsv3ReportDisplayLayout.md)
 - [Reportsv3ReportFilter](docs/Reportsv3ReportFilter.md)
 - [Reportsv3ReportFilterBrackets](docs/Reportsv3ReportFilterBrackets.md)
 - [Reportsv3ReportFilterCondition](docs/Reportsv3ReportFilterCondition.md)
 - [Reportsv3ReportHeader](docs/Reportsv3ReportHeader.md)
 - [Reportsv3ReportResult](docs/Reportsv3ReportResult.md)
 - [Reportsv3ReportTag](docs/Reportsv3ReportTag.md)
 - [Reportsv3ReportUsedInJoin](docs/Reportsv3ReportUsedInJoin.md)
 - [Reportsv3RunReportResponse](docs/Reportsv3RunReportResponse.md)
 - [Reportsv3RunTimeParameter](docs/Reportsv3RunTimeParameter.md)
 - [Reportsv3RunVariantOperationRequest](docs/Reportsv3RunVariantOperationRequest.md)
 - [Reportsv3RunVariantOperationResponse](docs/Reportsv3RunVariantOperationResponse.md)
 - [Reportsv3SqlType](docs/Reportsv3SqlType.md)
 - [Reportsv3TableNames](docs/Reportsv3TableNames.md)
 - [Reportsv3TimestampMapping](docs/Reportsv3TimestampMapping.md)
 - [Reportsv3TransposeRequest](docs/Reportsv3TransposeRequest.md)
 - [Reportsv3UpdateChartRequest](docs/Reportsv3UpdateChartRequest.md)
 - [Reportsv3UpdateChartResponse](docs/Reportsv3UpdateChartResponse.md)
 - [Reportsv3UpdateChartv2Request](docs/Reportsv3UpdateChartv2Request.md)
 - [Reportsv3UpdateChartv2Response](docs/Reportsv3UpdateChartv2Response.md)
 - [Reportsv3UpdateJoinRequest](docs/Reportsv3UpdateJoinRequest.md)
 - [Reportsv3UpdateJoinResponse](docs/Reportsv3UpdateJoinResponse.md)
 - [Reportsv3UpdateReportRequest](docs/Reportsv3UpdateReportRequest.md)
 - [Reportsv3UpdateReportResponse](docs/Reportsv3UpdateReportResponse.md)
 - [Reportsv3UpdateVariantOverrideRequest](docs/Reportsv3UpdateVariantOverrideRequest.md)
 - [Reportsv3UpdateVariantOverrideResponse](docs/Reportsv3UpdateVariantOverrideResponse.md)
 - [Reportsv3Variant](docs/Reportsv3Variant.md)
 - [Reportsv3VariantDetails](docs/Reportsv3VariantDetails.md)
 - [Reportsv3VariantRule](docs/Reportsv3VariantRule.md)
 - [Reportsv3VariantRuleCondition](docs/Reportsv3VariantRuleCondition.md)
 - [Reportsv3VariantRuleType](docs/Reportsv3VariantRuleType.md)
 - [RescanDataStoreRequest](docs/RescanDataStoreRequest.md)
 - [ResetPasswordRequest](docs/ResetPasswordRequest.md)
 - [Riskanalyticscontrollerv3Action](docs/Riskanalyticscontrollerv3Action.md)
 - [Riskanalyticscontrollerv3CardSettings](docs/Riskanalyticscontrollerv3CardSettings.md)
 - [Riskanalyticscontrollerv3DetailToCount](docs/Riskanalyticscontrollerv3DetailToCount.md)
 - [Riskanalyticscontrollerv3EmergingRiskDetails](docs/Riskanalyticscontrollerv3EmergingRiskDetails.md)
 - [Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest](docs/Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest.md)
 - [Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackResponse](docs/Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackResponse.md)
 - [Riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest](docs/Riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest.md)
 - [Riskanalyticscontrollerv3EnableDisableRiskEventProcessResponse](docs/Riskanalyticscontrollerv3EnableDisableRiskEventProcessResponse.md)
 - [Riskanalyticscontrollerv3ExcludedItem](docs/Riskanalyticscontrollerv3ExcludedItem.md)
 - [Riskanalyticscontrollerv3ExcludedItemType](docs/Riskanalyticscontrollerv3ExcludedItemType.md)
 - [Riskanalyticscontrollerv3FailedVATests](docs/Riskanalyticscontrollerv3FailedVATests.md)
 - [Riskanalyticscontrollerv3Filter](docs/Riskanalyticscontrollerv3Filter.md)
 - [Riskanalyticscontrollerv3Finding](docs/Riskanalyticscontrollerv3Finding.md)
 - [Riskanalyticscontrollerv3FindingDetails](docs/Riskanalyticscontrollerv3FindingDetails.md)
 - [Riskanalyticscontrollerv3FindingDetailsMap](docs/Riskanalyticscontrollerv3FindingDetailsMap.md)
 - [Riskanalyticscontrollerv3GetAllClassificationsListResponse](docs/Riskanalyticscontrollerv3GetAllClassificationsListResponse.md)
 - [Riskanalyticscontrollerv3GetRiskEventClassificationsListResponse](docs/Riskanalyticscontrollerv3GetRiskEventClassificationsListResponse.md)
 - [Riskanalyticscontrollerv3GetRiskEventDetailsResponse](docs/Riskanalyticscontrollerv3GetRiskEventDetailsResponse.md)
 - [Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse](docs/Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse.md)
 - [Riskanalyticscontrollerv3GetRiskEventRowResponse](docs/Riskanalyticscontrollerv3GetRiskEventRowResponse.md)
 - [Riskanalyticscontrollerv3GetRiskFeedbackResponse](docs/Riskanalyticscontrollerv3GetRiskFeedbackResponse.md)
 - [Riskanalyticscontrollerv3GetRiskObservationDetailsResponse](docs/Riskanalyticscontrollerv3GetRiskObservationDetailsResponse.md)
 - [Riskanalyticscontrollerv3GetUserUISettingsResponse](docs/Riskanalyticscontrollerv3GetUserUISettingsResponse.md)
 - [Riskanalyticscontrollerv3Indicator](docs/Riskanalyticscontrollerv3Indicator.md)
 - [Riskanalyticscontrollerv3Observation](docs/Riskanalyticscontrollerv3Observation.md)
 - [Riskanalyticscontrollerv3ObservationReportFilter](docs/Riskanalyticscontrollerv3ObservationReportFilter.md)
 - [Riskanalyticscontrollerv3ObservationType](docs/Riskanalyticscontrollerv3ObservationType.md)
 - [Riskanalyticscontrollerv3OrderBy](docs/Riskanalyticscontrollerv3OrderBy.md)
 - [Riskanalyticscontrollerv3ProcessStatus](docs/Riskanalyticscontrollerv3ProcessStatus.md)
 - [Riskanalyticscontrollerv3RiskEvent](docs/Riskanalyticscontrollerv3RiskEvent.md)
 - [Riskanalyticscontrollerv3RiskEventFormerHours](docs/Riskanalyticscontrollerv3RiskEventFormerHours.md)
 - [Riskanalyticscontrollerv3RiskEventHourlyFindings](docs/Riskanalyticscontrollerv3RiskEventHourlyFindings.md)
 - [Riskanalyticscontrollerv3RiskEventSummarizationDataResponse](docs/Riskanalyticscontrollerv3RiskEventSummarizationDataResponse.md)
 - [Riskanalyticscontrollerv3RiskEventTuningRequest](docs/Riskanalyticscontrollerv3RiskEventTuningRequest.md)
 - [Riskanalyticscontrollerv3RiskEventTuningResponse](docs/Riskanalyticscontrollerv3RiskEventTuningResponse.md)
 - [Riskanalyticscontrollerv3RiskEventVulnerabilityAssessmentDetailsResponse](docs/Riskanalyticscontrollerv3RiskEventVulnerabilityAssessmentDetailsResponse.md)
 - [Riskanalyticscontrollerv3RiskFeedback](docs/Riskanalyticscontrollerv3RiskFeedback.md)
 - [Riskanalyticscontrollerv3RiskObservationDetails](docs/Riskanalyticscontrollerv3RiskObservationDetails.md)
 - [Riskanalyticscontrollerv3SetRiskEventStatusRequest](docs/Riskanalyticscontrollerv3SetRiskEventStatusRequest.md)
 - [Riskanalyticscontrollerv3SetRiskEventStatusResponse](docs/Riskanalyticscontrollerv3SetRiskEventStatusResponse.md)
 - [Riskanalyticscontrollerv3SetUserUISettingsRequest](docs/Riskanalyticscontrollerv3SetUserUISettingsRequest.md)
 - [Riskanalyticscontrollerv3SetUserUISettingsResponse](docs/Riskanalyticscontrollerv3SetUserUISettingsResponse.md)
 - [Riskanalyticscontrollerv3ShortObservation](docs/Riskanalyticscontrollerv3ShortObservation.md)
 - [Riskanalyticscontrollerv3Status](docs/Riskanalyticscontrollerv3Status.md)
 - [Riskanalyticscontrollerv3UpdateRiskFeedbackRequest](docs/Riskanalyticscontrollerv3UpdateRiskFeedbackRequest.md)
 - [Riskanalyticscontrollerv3UpdateRiskFeedbackResponse](docs/Riskanalyticscontrollerv3UpdateRiskFeedbackResponse.md)
 - [Riskanalyticscontrollerv3UserUISettings](docs/Riskanalyticscontrollerv3UserUISettings.md)
 - [Riskanalyticsdataprocessorv3GetRiskContextResponse](docs/Riskanalyticsdataprocessorv3GetRiskContextResponse.md)
 - [Riskanalyticsdataprocessorv3GetRiskPredefinedQuestionsResponse](docs/Riskanalyticsdataprocessorv3GetRiskPredefinedQuestionsResponse.md)
 - [Riskanalyticsdataprocessorv3Question](docs/Riskanalyticsdataprocessorv3Question.md)
 - [Riskanalyticsenginev3AdditionalInfo](docs/Riskanalyticsenginev3AdditionalInfo.md)
 - [Riskanalyticsenginev3ClassificationDetails](docs/Riskanalyticsenginev3ClassificationDetails.md)
 - [Riskanalyticsenginev3ClassificationMatchDetails](docs/Riskanalyticsenginev3ClassificationMatchDetails.md)
 - [Riskanalyticsenginev3ClassificationObservation](docs/Riskanalyticsenginev3ClassificationObservation.md)
 - [Riskanalyticsenginev3DatabaseSourceField](docs/Riskanalyticsenginev3DatabaseSourceField.md)
 - [Riskanalyticsenginev3Feature](docs/Riskanalyticsenginev3Feature.md)
 - [Riskanalyticsenginev3FeatureSet](docs/Riskanalyticsenginev3FeatureSet.md)
 - [Riskanalyticsenginev3FieldType](docs/Riskanalyticsenginev3FieldType.md)
 - [Riskanalyticsenginev3GenerateFeaturesForRisksGroupResponse](docs/Riskanalyticsenginev3GenerateFeaturesForRisksGroupResponse.md)
 - [Riskanalyticsenginev3GenerateLeadsResponse](docs/Riskanalyticsenginev3GenerateLeadsResponse.md)
 - [Riskanalyticsenginev3GetLeadGeneratorConfigResponse](docs/Riskanalyticsenginev3GetLeadGeneratorConfigResponse.md)
 - [Riskanalyticsenginev3Lead](docs/Riskanalyticsenginev3Lead.md)
 - [Riskanalyticsenginev3LeadGeneratorConfig](docs/Riskanalyticsenginev3LeadGeneratorConfig.md)
 - [Riskanalyticsenginev3LeadGeneratorConfigParamValue](docs/Riskanalyticsenginev3LeadGeneratorConfigParamValue.md)
 - [Riskanalyticsenginev3LeadType](docs/Riskanalyticsenginev3LeadType.md)
 - [Riskanalyticsenginev3MethodType](docs/Riskanalyticsenginev3MethodType.md)
 - [Riskanalyticsenginev3Pivot](docs/Riskanalyticsenginev3Pivot.md)
 - [Riskanalyticsenginev3PivotType](docs/Riskanalyticsenginev3PivotType.md)
 - [Riskanalyticsenginev3Risk](docs/Riskanalyticsenginev3Risk.md)
 - [Riskanalyticsenginev3SeverityLevel](docs/Riskanalyticsenginev3SeverityLevel.md)
 - [Riskanalyticsenginev3UpdateLeadGeneratorConfigRequest](docs/Riskanalyticsenginev3UpdateLeadGeneratorConfigRequest.md)
 - [Riskanalyticsenginev3UpdateLeadGeneratorConfigResponse](docs/Riskanalyticsenginev3UpdateLeadGeneratorConfigResponse.md)
 - [Riskanalyticsmlclassificationv3ClassModelExplained](docs/Riskanalyticsmlclassificationv3ClassModelExplained.md)
 - [Riskanalyticsmlclassificationv3ClassificationDefinition](docs/Riskanalyticsmlclassificationv3ClassificationDefinition.md)
 - [Riskanalyticsmlclassificationv3GetClassificationModelResponse](docs/Riskanalyticsmlclassificationv3GetClassificationModelResponse.md)
 - [Riskanalyticsmlclassificationv3GetClassificationResponse](docs/Riskanalyticsmlclassificationv3GetClassificationResponse.md)
 - [Riskanalyticsmlclassificationv3GetClassificationsListResponse](docs/Riskanalyticsmlclassificationv3GetClassificationsListResponse.md)
 - [Riskanalyticsmlclassificationv3ResetModelToDefaultsResponse](docs/Riskanalyticsmlclassificationv3ResetModelToDefaultsResponse.md)
 - [Riskanalyticsmlclassificationv3RuleSet](docs/Riskanalyticsmlclassificationv3RuleSet.md)
 - [Riskanalyticsmlclassificationv3RuleSetList](docs/Riskanalyticsmlclassificationv3RuleSetList.md)
 - [RpcStatus](docs/RpcStatus.md)
 - [RunGDPReportRequestSortOrder](docs/RunGDPReportRequestSortOrder.md)
 - [RuntimeError](docs/RuntimeError.md)
 - [RuntimeStreamError](docs/RuntimeStreamError.md)
 - [Schedulerv3AuditType](docs/Schedulerv3AuditType.md)
 - [Schedulerv3ConfigurationItem](docs/Schedulerv3ConfigurationItem.md)
 - [Schedulerv3CreateScheduledJobRequest](docs/Schedulerv3CreateScheduledJobRequest.md)
 - [Schedulerv3CreateScheduledJobResponse](docs/Schedulerv3CreateScheduledJobResponse.md)
 - [Schedulerv3DayOfWeek](docs/Schedulerv3DayOfWeek.md)
 - [Schedulerv3DayOrder](docs/Schedulerv3DayOrder.md)
 - [Schedulerv3DeleteScheduledJobResponse](docs/Schedulerv3DeleteScheduledJobResponse.md)
 - [Schedulerv3DeliveryMethod](docs/Schedulerv3DeliveryMethod.md)
 - [Schedulerv3Dependency](docs/Schedulerv3Dependency.md)
 - [Schedulerv3ExecutionStatus](docs/Schedulerv3ExecutionStatus.md)
 - [Schedulerv3FileFormat](docs/Schedulerv3FileFormat.md)
 - [Schedulerv3Frequency](docs/Schedulerv3Frequency.md)
 - [Schedulerv3GetDependenciesResponse](docs/Schedulerv3GetDependenciesResponse.md)
 - [Schedulerv3GetDistributionRulesResponse](docs/Schedulerv3GetDistributionRulesResponse.md)
 - [Schedulerv3GetScheduledJobResponse](docs/Schedulerv3GetScheduledJobResponse.md)
 - [Schedulerv3GetSchedulesByReportRequest](docs/Schedulerv3GetSchedulesByReportRequest.md)
 - [Schedulerv3GetSchedulesByReportResponse](docs/Schedulerv3GetSchedulesByReportResponse.md)
 - [Schedulerv3GetTagsResponse](docs/Schedulerv3GetTagsResponse.md)
 - [Schedulerv3IntegrationParameter](docs/Schedulerv3IntegrationParameter.md)
 - [Schedulerv3Month](docs/Schedulerv3Month.md)
 - [Schedulerv3NotificationType](docs/Schedulerv3NotificationType.md)
 - [Schedulerv3Recipient](docs/Schedulerv3Recipient.md)
 - [Schedulerv3RecipientType](docs/Schedulerv3RecipientType.md)
 - [Schedulerv3RepeatBegin](docs/Schedulerv3RepeatBegin.md)
 - [Schedulerv3RepeatEnd](docs/Schedulerv3RepeatEnd.md)
 - [Schedulerv3ReportArray](docs/Schedulerv3ReportArray.md)
 - [Schedulerv3ReportParameter](docs/Schedulerv3ReportParameter.md)
 - [Schedulerv3Retention](docs/Schedulerv3Retention.md)
 - [Schedulerv3ScheduledJob](docs/Schedulerv3ScheduledJob.md)
 - [Schedulerv3ScheduledJobRun](docs/Schedulerv3ScheduledJobRun.md)
 - [Schedulerv3ScheduledJobSummary](docs/Schedulerv3ScheduledJobSummary.md)
 - [Schedulerv3ScheduledJobSummaryResponse](docs/Schedulerv3ScheduledJobSummaryResponse.md)
 - [Schedulerv3ScheduledJobsFilter](docs/Schedulerv3ScheduledJobsFilter.md)
 - [Schedulerv3ScheduledTask](docs/Schedulerv3ScheduledTask.md)
 - [Schedulerv3ScheduledTaskSummary](docs/Schedulerv3ScheduledTaskSummary.md)
 - [Schedulerv3Scheduler](docs/Schedulerv3Scheduler.md)
 - [Schedulerv3SearchScheduledJobsRequest](docs/Schedulerv3SearchScheduledJobsRequest.md)
 - [Schedulerv3SearchScheduledTaskRunsRequest](docs/Schedulerv3SearchScheduledTaskRunsRequest.md)
 - [Schedulerv3SearchScheduledTaskRunsResponse](docs/Schedulerv3SearchScheduledTaskRunsResponse.md)
 - [Schedulerv3TaskParameter](docs/Schedulerv3TaskParameter.md)
 - [Schedulerv3TaskType](docs/Schedulerv3TaskType.md)
 - [Schedulerv3UpdateScheduledJobRequest](docs/Schedulerv3UpdateScheduledJobRequest.md)
 - [Schedulerv3UpdateScheduledJobResponse](docs/Schedulerv3UpdateScheduledJobResponse.md)
 - [Schedulerv3WorkflowType](docs/Schedulerv3WorkflowType.md)
 - [Script](docs/Script.md)
 - [SensitivitiesItemsInner](docs/SensitivitiesItemsInner.md)
 - [SensitivitiesSummary](docs/SensitivitiesSummary.md)
 - [Sensitivity](docs/Sensitivity.md)
 - [SensitivityCategory](docs/SensitivityCategory.md)
 - [SensitivityListItem](docs/SensitivityListItem.md)
 - [SensitivitySummary](docs/SensitivitySummary.md)
 - [ServiceAccountClientId](docs/ServiceAccountClientId.md)
 - [ServiceAccountInstallationStatus](docs/ServiceAccountInstallationStatus.md)
 - [ServiceProvider](docs/ServiceProvider.md)
 - [SetDataStoreLabelRequest](docs/SetDataStoreLabelRequest.md)
 - [SetQuestionBodyParams](docs/SetQuestionBodyParams.md)
 - [SetVulnerabilityStatusRequest](docs/SetVulnerabilityStatusRequest.md)
 - [SignupRequest](docs/SignupRequest.md)
 - [SimpleRecipientSimpleRecipientType](docs/SimpleRecipientSimpleRecipientType.md)
 - [Snifassistv3SnifAssistResponse](docs/Snifassistv3SnifAssistResponse.md)
 - [Snifassistv3SnifAssistType](docs/Snifassistv3SnifAssistType.md)
 - [Snifassistv3StapConfig](docs/Snifassistv3StapConfig.md)
 - [Snifassistv3StapHeartBeat](docs/Snifassistv3StapHeartBeat.md)
 - [Snifassistv3StapOperation](docs/Snifassistv3StapOperation.md)
 - [Snifassistv3StatusResponseBase](docs/Snifassistv3StatusResponseBase.md)
 - [Snifassistv3TestRegexRequest](docs/Snifassistv3TestRegexRequest.md)
 - [SortOrder](docs/SortOrder.md)
 - [StreamResultOfComplianceacceleratorv3CreateWorkspaceResponse](docs/StreamResultOfComplianceacceleratorv3CreateWorkspaceResponse.md)
 - [StreamResultOfReportsrunnerv3RunReportResponse](docs/StreamResultOfReportsrunnerv3RunReportResponse.md)
 - [Streamsv3AWSCheckStreamStatus](docs/Streamsv3AWSCheckStreamStatus.md)
 - [Streamsv3AuthType](docs/Streamsv3AuthType.md)
 - [Streamsv3AzureCheckStatus](docs/Streamsv3AzureCheckStatus.md)
 - [Streamsv3CheckAWSCredentialsRequest](docs/Streamsv3CheckAWSCredentialsRequest.md)
 - [Streamsv3CheckAWSCredentialsResponse](docs/Streamsv3CheckAWSCredentialsResponse.md)
 - [Streamsv3CheckAzureEventHubRequest](docs/Streamsv3CheckAzureEventHubRequest.md)
 - [Streamsv3CheckAzureEventHubResponse](docs/Streamsv3CheckAzureEventHubResponse.md)
 - [Streamsv3CheckAzureStorageStringRequest](docs/Streamsv3CheckAzureStorageStringRequest.md)
 - [Streamsv3CheckAzureStorageStringResponse](docs/Streamsv3CheckAzureStorageStringResponse.md)
 - [Streamsv3GetAWSRegionsResponse](docs/Streamsv3GetAWSRegionsResponse.md)
 - [Streamsv3ListAWSStreamsRequest](docs/Streamsv3ListAWSStreamsRequest.md)
 - [Streamsv3ListAWSStreamsResponse](docs/Streamsv3ListAWSStreamsResponse.md)
 - [Streamsv3StreamByRegion](docs/Streamsv3StreamByRegion.md)
 - [Streamsv3StreamType](docs/Streamsv3StreamType.md)
 - [StringKeyValue](docs/StringKeyValue.md)
 - [SubmitAdminEmailParams](docs/SubmitAdminEmailParams.md)
 - [SubmitAuthCode](docs/SubmitAuthCode.md)
 - [SubmitPasswordRequest](docs/SubmitPasswordRequest.md)
 - [Tags](docs/Tags.md)
 - [Templatesv3CreateIntegrationRequest](docs/Templatesv3CreateIntegrationRequest.md)
 - [Templatesv3CreateIntegrationResponse](docs/Templatesv3CreateIntegrationResponse.md)
 - [Templatesv3CreateTemplateRequest](docs/Templatesv3CreateTemplateRequest.md)
 - [Templatesv3CreateTemplateResponse](docs/Templatesv3CreateTemplateResponse.md)
 - [Templatesv3DefaultContent](docs/Templatesv3DefaultContent.md)
 - [Templatesv3DeleteIntegrationResponse](docs/Templatesv3DeleteIntegrationResponse.md)
 - [Templatesv3DeleteTemplateResponse](docs/Templatesv3DeleteTemplateResponse.md)
 - [Templatesv3GetOriginDefaultContentResponse](docs/Templatesv3GetOriginDefaultContentResponse.md)
 - [Templatesv3GetOriginFieldsResponse](docs/Templatesv3GetOriginFieldsResponse.md)
 - [Templatesv3GetTemplateResponse](docs/Templatesv3GetTemplateResponse.md)
 - [Templatesv3GetTemplatesResponse](docs/Templatesv3GetTemplatesResponse.md)
 - [Templatesv3Integration](docs/Templatesv3Integration.md)
 - [Templatesv3MIMEType](docs/Templatesv3MIMEType.md)
 - [Templatesv3Origin](docs/Templatesv3Origin.md)
 - [Templatesv3SimpleRecipient](docs/Templatesv3SimpleRecipient.md)
 - [Templatesv3Template](docs/Templatesv3Template.md)
 - [Templatesv3TestTemplateRequest](docs/Templatesv3TestTemplateRequest.md)
 - [Templatesv3TestTemplateResponse](docs/Templatesv3TestTemplateResponse.md)
 - [Templatesv3TransformTemplateJSONRequest](docs/Templatesv3TransformTemplateJSONRequest.md)
 - [Templatesv3TransformTemplateJSONResponse](docs/Templatesv3TransformTemplateJSONResponse.md)
 - [Templatesv3TransformTemplateRequest](docs/Templatesv3TransformTemplateRequest.md)
 - [Templatesv3TransformTemplateResponse](docs/Templatesv3TransformTemplateResponse.md)
 - [Templatesv3UpdateTemplateRequest](docs/Templatesv3UpdateTemplateRequest.md)
 - [Templatesv3UpdateTemplateResponse](docs/Templatesv3UpdateTemplateResponse.md)
 - [TenantInfo](docs/TenantInfo.md)
 - [Tenantuserv3Apikey](docs/Tenantuserv3Apikey.md)
 - [Tenantuserv3AuthResponse](docs/Tenantuserv3AuthResponse.md)
 - [Tenantuserv3BasicPrivilege](docs/Tenantuserv3BasicPrivilege.md)
 - [Tenantuserv3CreateApiKeyRequest](docs/Tenantuserv3CreateApiKeyRequest.md)
 - [Tenantuserv3CreateApiKeyResponse](docs/Tenantuserv3CreateApiKeyResponse.md)
 - [Tenantuserv3CurrentUser](docs/Tenantuserv3CurrentUser.md)
 - [Tenantuserv3CurrentUserTenant](docs/Tenantuserv3CurrentUserTenant.md)
 - [Tenantuserv3DisableUsersBulkResponse](docs/Tenantuserv3DisableUsersBulkResponse.md)
 - [Tenantuserv3ExternalMetadata](docs/Tenantuserv3ExternalMetadata.md)
 - [Tenantuserv3FullUser](docs/Tenantuserv3FullUser.md)
 - [Tenantuserv3GetApiKeysResponse](docs/Tenantuserv3GetApiKeysResponse.md)
 - [Tenantuserv3GetCurrentUserResponse](docs/Tenantuserv3GetCurrentUserResponse.md)
 - [Tenantuserv3GetPrivilegeResponse](docs/Tenantuserv3GetPrivilegeResponse.md)
 - [Tenantuserv3GetPrivilegesResponse](docs/Tenantuserv3GetPrivilegesResponse.md)
 - [Tenantuserv3GetRolesResponse](docs/Tenantuserv3GetRolesResponse.md)
 - [Tenantuserv3GetTenantPartNumbersDiffResponse](docs/Tenantuserv3GetTenantPartNumbersDiffResponse.md)
 - [Tenantuserv3GetTenantResponse](docs/Tenantuserv3GetTenantResponse.md)
 - [Tenantuserv3GetTenantsResponse](docs/Tenantuserv3GetTenantsResponse.md)
 - [Tenantuserv3GetUserNamesRequest](docs/Tenantuserv3GetUserNamesRequest.md)
 - [Tenantuserv3GetUserNamesResponse](docs/Tenantuserv3GetUserNamesResponse.md)
 - [Tenantuserv3GetUserResponse](docs/Tenantuserv3GetUserResponse.md)
 - [Tenantuserv3GetUserTenantResponse](docs/Tenantuserv3GetUserTenantResponse.md)
 - [Tenantuserv3GetUsersResponse](docs/Tenantuserv3GetUsersResponse.md)
 - [Tenantuserv3PostPrivilegesBulkRequest](docs/Tenantuserv3PostPrivilegesBulkRequest.md)
 - [Tenantuserv3PostPrivilegesBulkResponse](docs/Tenantuserv3PostPrivilegesBulkResponse.md)
 - [Tenantuserv3PostRoleRequest](docs/Tenantuserv3PostRoleRequest.md)
 - [Tenantuserv3PostRoleResponse](docs/Tenantuserv3PostRoleResponse.md)
 - [Tenantuserv3PostTenantsResponse](docs/Tenantuserv3PostTenantsResponse.md)
 - [Tenantuserv3PostUsersBulkResponse](docs/Tenantuserv3PostUsersBulkResponse.md)
 - [Tenantuserv3Privilege](docs/Tenantuserv3Privilege.md)
 - [Tenantuserv3Prometheus](docs/Tenantuserv3Prometheus.md)
 - [Tenantuserv3Role](docs/Tenantuserv3Role.md)
 - [Tenantuserv3Tenant](docs/Tenantuserv3Tenant.md)
 - [Tenantuserv3TenantCapabilityPartNumbers](docs/Tenantuserv3TenantCapabilityPartNumbers.md)
 - [Tenantuserv3UniquePrivilege](docs/Tenantuserv3UniquePrivilege.md)
 - [Tenantuserv3UpdatePrivilegeRequest](docs/Tenantuserv3UpdatePrivilegeRequest.md)
 - [Tenantuserv3UpdatePrivilegeResponse](docs/Tenantuserv3UpdatePrivilegeResponse.md)
 - [Tenantuserv3UpdatePrivilegesBulkRequest](docs/Tenantuserv3UpdatePrivilegesBulkRequest.md)
 - [Tenantuserv3UpdatePrivilegesBulkResponse](docs/Tenantuserv3UpdatePrivilegesBulkResponse.md)
 - [Tenantuserv3UpdateRoleRequest](docs/Tenantuserv3UpdateRoleRequest.md)
 - [Tenantuserv3UpdateRoleResponse](docs/Tenantuserv3UpdateRoleResponse.md)
 - [Tenantuserv3UpdateTenantResponse](docs/Tenantuserv3UpdateTenantResponse.md)
 - [Tenantuserv3UpdateUserRoleBulkRequest](docs/Tenantuserv3UpdateUserRoleBulkRequest.md)
 - [Tenantuserv3UpdateUserRoleBulkResponse](docs/Tenantuserv3UpdateUserRoleBulkResponse.md)
 - [Tenantuserv3UpdateUsersBulkResponse](docs/Tenantuserv3UpdateUsersBulkResponse.md)
 - [Tenantuserv3User](docs/Tenantuserv3User.md)
 - [Tenantuserv3UserState](docs/Tenantuserv3UserState.md)
 - [Tenantuserv3UserTenant](docs/Tenantuserv3UserTenant.md)
 - [TokenExpiryInfo](docs/TokenExpiryInfo.md)
 - [Trustee](docs/Trustee.md)
 - [TypesCountInner](docs/TypesCountInner.md)
 - [Universalconnectormanagerv3ConnectionRoute](docs/Universalconnectormanagerv3ConnectionRoute.md)
 - [Universalconnectormanagerv3ConnectionStatus](docs/Universalconnectormanagerv3ConnectionStatus.md)
 - [Universalconnectormanagerv3ConnectionSummary](docs/Universalconnectormanagerv3ConnectionSummary.md)
 - [Universalconnectormanagerv3ConnectivityState](docs/Universalconnectormanagerv3ConnectivityState.md)
 - [Universalconnectormanagerv3ConnectorSummary](docs/Universalconnectormanagerv3ConnectorSummary.md)
 - [Universalconnectormanagerv3DatasourceDefinition](docs/Universalconnectormanagerv3DatasourceDefinition.md)
 - [Universalconnectormanagerv3DatasourceResponse](docs/Universalconnectormanagerv3DatasourceResponse.md)
 - [Universalconnectormanagerv3DatasourceType](docs/Universalconnectormanagerv3DatasourceType.md)
 - [Universalconnectormanagerv3DatasourcesResponse](docs/Universalconnectormanagerv3DatasourcesResponse.md)
 - [Universalconnectormanagerv3File](docs/Universalconnectormanagerv3File.md)
 - [Universalconnectormanagerv3FileResponse](docs/Universalconnectormanagerv3FileResponse.md)
 - [Universalconnectormanagerv3GetConnectorsResponse](docs/Universalconnectormanagerv3GetConnectorsResponse.md)
 - [Universalconnectormanagerv3GetUCSetupResponse](docs/Universalconnectormanagerv3GetUCSetupResponse.md)
 - [Universalconnectormanagerv3ListConnectionsResponse](docs/Universalconnectormanagerv3ListConnectionsResponse.md)
 - [Universalconnectormanagerv3PluginDefinition](docs/Universalconnectormanagerv3PluginDefinition.md)
 - [Universalconnectormanagerv3PluginsListResponse](docs/Universalconnectormanagerv3PluginsListResponse.md)
 - [Universalconnectormanagerv3UploadPluginRequest](docs/Universalconnectormanagerv3UploadPluginRequest.md)
 - [Universalconnectormanagerv3User](docs/Universalconnectormanagerv3User.md)
 - [UpdateCommentBody](docs/UpdateCommentBody.md)
 - [UpdateCustodianBody](docs/UpdateCustodianBody.md)
 - [UpdateDatastoreCustodian200Response](docs/UpdateDatastoreCustodian200Response.md)
 - [UpdateResourceReviewBody](docs/UpdateResourceReviewBody.md)
 - [UpdateResourceReviewStatus200Response](docs/UpdateResourceReviewStatus200Response.md)
 - [UserEntitlementInfo](docs/UserEntitlementInfo.md)
 - [UserEntitlementsUserSensitiveCategoriesOptionsUserIdParameter](docs/UserEntitlementsUserSensitiveCategoriesOptionsUserIdParameter.md)
 - [UserSensitiveCategories](docs/UserSensitiveCategories.md)
 - [UserSensitiveCategories200Response](docs/UserSensitiveCategories200Response.md)
 - [UserSensitiveCategoriesSensitiveCategoriesInner](docs/UserSensitiveCategoriesSensitiveCategoriesInner.md)
 - [UserStores200Response](docs/UserStores200Response.md)
 - [Vendor](docs/Vendor.md)
 - [VendorAccount](docs/VendorAccount.md)
 - [VendorCertificate](docs/VendorCertificate.md)
 - [VendorDataStore](docs/VendorDataStore.md)
 - [VendorSummary](docs/VendorSummary.md)
 - [VulnerabilitiesByDataStoreFilterOptions](docs/VulnerabilitiesByDataStoreFilterOptions.md)
 - [VulnerabilitiesCriticalityCountInner](docs/VulnerabilitiesCriticalityCountInner.md)
 - [VulnerabilitiesFilterOptions](docs/VulnerabilitiesFilterOptions.md)
 - [VulnerabilitiesSummary](docs/VulnerabilitiesSummary.md)
 - [VulnerabilitiesSummaryAffectedDataStoreSummary](docs/VulnerabilitiesSummaryAffectedDataStoreSummary.md)
 - [VulnerabilitiesSummaryAffectedDataStoreSummaryCloudAccountIdsCountInner](docs/VulnerabilitiesSummaryAffectedDataStoreSummaryCloudAccountIdsCountInner.md)
 - [VulnerabilitiesSummaryAffectedDataStoreSummaryCloudRegionsCountInner](docs/VulnerabilitiesSummaryAffectedDataStoreSummaryCloudRegionsCountInner.md)
 - [VulnerabilitiesSummaryAffectedDataStoreSummaryDataStoreTypesInner](docs/VulnerabilitiesSummaryAffectedDataStoreSummaryDataStoreTypesInner.md)
 - [VulnerabilitiesSummaryStatusSummary](docs/VulnerabilitiesSummaryStatusSummary.md)
 - [VulnerabilitiesSummaryStatusTypeCountInner](docs/VulnerabilitiesSummaryStatusTypeCountInner.md)
 - [VulnerabilitiesSummaryVulnerabilityTypeCountInner](docs/VulnerabilitiesSummaryVulnerabilityTypeCountInner.md)
 - [Vulnerability](docs/Vulnerability.md)
 - [VulnerabilityAffectedDataStoreFilterOptions](docs/VulnerabilityAffectedDataStoreFilterOptions.md)
 - [VulnerabilityByDataStoreListItem](docs/VulnerabilityByDataStoreListItem.md)
 - [VulnerabilityCriticality](docs/VulnerabilityCriticality.md)
 - [VulnerabilityFlowRef](docs/VulnerabilityFlowRef.md)
 - [VulnerabilityListItem](docs/VulnerabilityListItem.md)
 - [VulnerabilityRelatedAsset](docs/VulnerabilityRelatedAsset.md)
 - [VulnerabilityRemediation](docs/VulnerabilityRemediation.md)
 - [VulnerabilityStatus](docs/VulnerabilityStatus.md)
 - [VulnerabilityStatusComment](docs/VulnerabilityStatusComment.md)
 - [VulnerabilityStatusType](docs/VulnerabilityStatusType.md)
 - [VulnerabilityStatusTypeFamily](docs/VulnerabilityStatusTypeFamily.md)
 - [VulnerabilityThreatCategory](docs/VulnerabilityThreatCategory.md)
 - [VulnerabilityType](docs/VulnerabilityType.md)
 - [Workflowv3Case](docs/Workflowv3Case.md)
 - [Workflowv3CaseEdit](docs/Workflowv3CaseEdit.md)
 - [Workflowv3CaseListResponse](docs/Workflowv3CaseListResponse.md)
 - [Workflowv3Comment](docs/Workflowv3Comment.md)
 - [Workflowv3CreateCaseRequest](docs/Workflowv3CreateCaseRequest.md)
 - [Workflowv3CreateCaseResponse](docs/Workflowv3CreateCaseResponse.md)
 - [Workflowv3CreateTaskRequest](docs/Workflowv3CreateTaskRequest.md)
 - [Workflowv3CreateTaskResponse](docs/Workflowv3CreateTaskResponse.md)
 - [Workflowv3DeleteCasesResponse](docs/Workflowv3DeleteCasesResponse.md)
 - [Workflowv3DeleteTasksResponse](docs/Workflowv3DeleteTasksResponse.md)
 - [Workflowv3Entity](docs/Workflowv3Entity.md)
 - [Workflowv3EntityType](docs/Workflowv3EntityType.md)
 - [Workflowv3Filter](docs/Workflowv3Filter.md)
 - [Workflowv3FilterColumn](docs/Workflowv3FilterColumn.md)
 - [Workflowv3FilterOperator](docs/Workflowv3FilterOperator.md)
 - [Workflowv3GetCasesCountRequest](docs/Workflowv3GetCasesCountRequest.md)
 - [Workflowv3GetCasesCountResponse](docs/Workflowv3GetCasesCountResponse.md)
 - [Workflowv3GetFilenameResponse](docs/Workflowv3GetFilenameResponse.md)
 - [Workflowv3GetJobsCountRequest](docs/Workflowv3GetJobsCountRequest.md)
 - [Workflowv3GetJobsCountResponse](docs/Workflowv3GetJobsCountResponse.md)
 - [Workflowv3GetReportResultResponse](docs/Workflowv3GetReportResultResponse.md)
 - [Workflowv3GetTasksCountRequest](docs/Workflowv3GetTasksCountRequest.md)
 - [Workflowv3GetTasksCountResponse](docs/Workflowv3GetTasksCountResponse.md)
 - [Workflowv3JobCount](docs/Workflowv3JobCount.md)
 - [Workflowv3OperatorType](docs/Workflowv3OperatorType.md)
 - [Workflowv3Origin](docs/Workflowv3Origin.md)
 - [Workflowv3Priority](docs/Workflowv3Priority.md)
 - [Workflowv3ReportMetadata](docs/Workflowv3ReportMetadata.md)
 - [Workflowv3ReportResult](docs/Workflowv3ReportResult.md)
 - [Workflowv3ReportResultHeader](docs/Workflowv3ReportResultHeader.md)
 - [Workflowv3ReportResultRow](docs/Workflowv3ReportResultRow.md)
 - [Workflowv3ReportRun](docs/Workflowv3ReportRun.md)
 - [Workflowv3SearchCasesRequest](docs/Workflowv3SearchCasesRequest.md)
 - [Workflowv3SearchReportsResponse](docs/Workflowv3SearchReportsResponse.md)
 - [Workflowv3SearchTasksRequest](docs/Workflowv3SearchTasksRequest.md)
 - [Workflowv3Status](docs/Workflowv3Status.md)
 - [Workflowv3StatusCount](docs/Workflowv3StatusCount.md)
 - [Workflowv3Task](docs/Workflowv3Task.md)
 - [Workflowv3TaskCount](docs/Workflowv3TaskCount.md)
 - [Workflowv3TaskCreate](docs/Workflowv3TaskCreate.md)
 - [Workflowv3TaskEdit](docs/Workflowv3TaskEdit.md)
 - [Workflowv3TaskListResponse](docs/Workflowv3TaskListResponse.md)
 - [Workflowv3UpdateCasesRequest](docs/Workflowv3UpdateCasesRequest.md)
 - [Workflowv3UpdateCasesResponse](docs/Workflowv3UpdateCasesResponse.md)
 - [Workflowv3UpdateTasksRequest](docs/Workflowv3UpdateTasksRequest.md)
 - [Workflowv3UpdateTasksResponse](docs/Workflowv3UpdateTasksResponse.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="ApiKeyAuth"></a>
### ApiKeyAuth

- **Type**: API key
- **API key parameter name**: authorization
- **Location**: HTTP header

<a id="BasicAuth"></a>
### BasicAuth

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



</details>
