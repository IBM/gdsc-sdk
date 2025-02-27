# IBM Guardium Data Security Center Python client

## Requirements.

Python 3.7+

## Installation & Usage
### pip install

If the python package is hosted on a repository, you can install directly using:

```sh
pip install ibm-gdsc-sdk-saas==3.0.20250227
```
(you may need to run `pip` with root permission: `sudo pip install ibm-gdsc-sdk-saas==3.0.20250227`)

Then import the package:
```python
import ibm_gdsc_sdk_saas
```
## Getting Started

Please follow the [installation procedure](https://github.com/IBM/gdsc-sdk) and then run the following:

```python

import os
import ibm_gdsc_sdk_saas
from ibm_gdsc_sdk_saas.models.tenantuserv3_get_users_response import Tenantuserv3GetUsersResponse
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint



# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = os.environ['URL'],
    username = os.environ['API_USERNAME'],
    password = os.environ['API_PASSWORD']
)

# Configure API key authorization: ApiKeyAuth
#configuration.api_key['ApiKeyAuth'] = os.environ['API_KEY']
configuration.verify_ssl = False
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
#configuration.api_key_prefix['ApiKeyAuth'] = "Basic"
# Enter a context with an instance of the API client

with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.JumpboxServiceApi(api_client)
    uid = '' # str | Email. (optional)

    try:
        # Summary: Get users Description: Get all users base on a tenantID.
        api_response = api_instance.jumpbox_service_get_users(uid=uid)
        print("The response of JumpboxServiceApi->jumpbox_service_get_users:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling JumpboxServiceApi->jumpbox_service_get_users: %s\n" % e)

```


<details><summary>Documentation for API Endpoints</summary>

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AssetsServiceApi* | [**assets_service_asset_ingestion**](docs/AssetsServiceApi.md#assets_service_asset_ingestion) | **POST** /api/v3/assets/ingestion | AssetIngestion - Asset Ingestion Api to ingest assets from different applications including asset extensibility assets.
*AssetsServiceApi* | [**assets_service_asset_ingestion_manual_trigger**](docs/AssetsServiceApi.md#assets_service_asset_ingestion_manual_trigger) | **POST** /api/v3/assets/ingestion/trigger | AssetIngestionManualTrigger - Manual trigger for Scheduled Asset Ingestion of databases.
*AssetsServiceApi* | [**assets_service_clone_policy**](docs/AssetsServiceApi.md#assets_service_clone_policy) | **POST** /api/v3/assets/policies/{policy_id}/clone | ClonePolicy - Clone a policy.
*AssetsServiceApi* | [**assets_service_create_update_policy**](docs/AssetsServiceApi.md#assets_service_create_update_policy) | **POST** /api/v3/assets/policies | CreateUpdatePolicy - Create/update new Policy.
*AssetsServiceApi* | [**assets_service_delete_filter_template_for_assets**](docs/AssetsServiceApi.md#assets_service_delete_filter_template_for_assets) | **DELETE** /api/v3/assets/filters/template/{template_id} | DeleteFilterTemplateForAssets - Deleting a template using TemplateID in manage assets.
*AssetsServiceApi* | [**assets_service_delete_policies**](docs/AssetsServiceApi.md#assets_service_delete_policies) | **DELETE** /api/v3/assets/policies | DeletePolicies - Delete Policy returns response code and message.
*AssetsServiceApi* | [**assets_service_fetch_asset_change_log**](docs/AssetsServiceApi.md#assets_service_fetch_asset_change_log) | **POST** /api/v3/assets/logs | FetchAssetChangeLog - Fetch the logs for any actions performed on assets.
*AssetsServiceApi* | [**assets_service_fetch_asset_dashboard**](docs/AssetsServiceApi.md#assets_service_fetch_asset_dashboard) | **GET** /api/v3/assets/dashboard/{widget_type} | FetchAssetDashboard - Gets Filter Templates for Dshboard Widgets.
*AssetsServiceApi* | [**assets_service_fetch_asset_list**](docs/AssetsServiceApi.md#assets_service_fetch_asset_list) | **POST** /api/v3/assets | FetchAssetList - Asset Fetch Api .
*AssetsServiceApi* | [**assets_service_fetch_assets_for_merge_split**](docs/AssetsServiceApi.md#assets_service_fetch_assets_for_merge_split) | **GET** /api/v3/assets/configuration | FetchAssetsForMergeSplit : Fetch assets for Merge and Split.
*AssetsServiceApi* | [**assets_service_find_asset_name**](docs/AssetsServiceApi.md#assets_service_find_asset_name) | **GET** /api/v3/assets/name | FindAssetName - Checks if the given Asset Name has already been assigned to an asset.
*AssetsServiceApi* | [**assets_service_get_asset_overview**](docs/AssetsServiceApi.md#assets_service_get_asset_overview) | **GET** /api/v3/assets/overview | GetAssetOverview - Get asset overview widgets data for a particular asset.
*AssetsServiceApi* | [**assets_service_get_asset_topology**](docs/AssetsServiceApi.md#assets_service_get_asset_topology) | **POST** /api/v3/assets/topology | GetAssetTopology- Get list of topology for a parent asset.
*AssetsServiceApi* | [**assets_service_get_filter_template_for_assets**](docs/AssetsServiceApi.md#assets_service_get_filter_template_for_assets) | **GET** /api/v3/assets/filters/templates | GetFilterTemplateForAssets - Get list of filters query templates for manage assets.
*AssetsServiceApi* | [**assets_service_get_filters_for_assets**](docs/AssetsServiceApi.md#assets_service_get_filters_for_assets) | **GET** /api/v3/assets/filters | GetFiltersForAssets - Get a list of filters category and sub category with all data.
*AssetsServiceApi* | [**assets_service_list_policy**](docs/AssetsServiceApi.md#assets_service_list_policy) | **GET** /api/v3/assets/policies | ListPolicy - List all policies.
*AssetsServiceApi* | [**assets_service_list_rule**](docs/AssetsServiceApi.md#assets_service_list_rule) | **GET** /api/v3/assets/policies/{policy_id}/rules | ListRule - List all rules for a policy.
*AssetsServiceApi* | [**assets_service_list_tag_domains**](docs/AssetsServiceApi.md#assets_service_list_tag_domains) | **GET** /api/v3/assets/tags/categories | ListTagDomains - Get Tag categories by request parameters .
*AssetsServiceApi* | [**assets_service_list_tags**](docs/AssetsServiceApi.md#assets_service_list_tags) | **GET** /api/v3/assets/tags | ListTags - Get Tags for Manage Tags listing screen .
*AssetsServiceApi* | [**assets_service_merge_or_split_assets**](docs/AssetsServiceApi.md#assets_service_merge_or_split_assets) | **POST** /api/v3/assets/configuration | MergeOrSplitAssets - Merge or split the selected assets.
*AssetsServiceApi* | [**assets_service_save_assigned_tags**](docs/AssetsServiceApi.md#assets_service_save_assigned_tags) | **POST** /api/v3/assets/tags/assign | SaveAssignedTags - Save Assigned Tags to TAG_DSDEF_MAP table.
*AssetsServiceApi* | [**assets_service_save_tag_concept_data**](docs/AssetsServiceApi.md#assets_service_save_tag_concept_data) | **POST** /api/v3/assets/tags | SaveTagConceptData - creates a custom tag
*AssetsServiceApi* | [**assets_service_save_tag_domain_data**](docs/AssetsServiceApi.md#assets_service_save_tag_domain_data) | **POST** /api/v3/assets/tags/categories | SaveTagDomainData - creates a custom category to be assigned to a tag
*AssetsServiceApi* | [**assets_service_save_update_filter_template_for_assets**](docs/AssetsServiceApi.md#assets_service_save_update_filter_template_for_assets) | **POST** /api/v3/assets/filters/templates | SaveUpdateFilterTemplateForAssets - Save/Update a filters query to use as template in manage assets along with reordering of template list.
*AssetsServiceApi* | [**assets_service_set_banner_state**](docs/AssetsServiceApi.md#assets_service_set_banner_state) | **PUT** /api/v3/assets/banner | SetBannerState - Set banner state for asset inventory page.
*AssetsServiceApi* | [**assets_service_update_asset_name**](docs/AssetsServiceApi.md#assets_service_update_asset_name) | **PUT** /api/v3/assets/name | UpdateAssetName - Udates the name of the asset as given by the user.
*AssetsServiceApi* | [**assets_service_update_policy**](docs/AssetsServiceApi.md#assets_service_update_policy) | **PUT** /api/v3/assets/policies | UpdatePolicy - Update existing Policy status.
*AuditServiceApi* | [**audit_service_get_activity_records**](docs/AuditServiceApi.md#audit_service_get_activity_records) | **GET** /api/v3/activity | Summary: Get activity records Description: Return activity records that match the arguments passed in the request.  Multiple values can be passed to the (UID, Context, ActionTaken, PerformedBy) fields by supplying a  comma-separated list to the corresponding fields in the request.  For instance to check for  multiple Contexts set the field to \&quot;op1, op2, op3\&quot;.
*AuditServiceApi* | [**audit_service_put_download_activity_record**](docs/AuditServiceApi.md#audit_service_put_download_activity_record) | **POST** /api/v3/activity | Summary: Put download activity record Description: Create an activity log record with the arguments passed in the request.
*AuthServerServiceApi* | [**auth_server_service_create_oauth_client**](docs/AuthServerServiceApi.md#auth_server_service_create_oauth_client) | **POST** /api/v3/oauth/clients | Summary: Create Oauth client Description: Create/register new Oauth client.
*AuthServerServiceApi* | [**auth_server_service_delete_oauth_client**](docs/AuthServerServiceApi.md#auth_server_service_delete_oauth_client) | **DELETE** /api/v3/oauth/clients/{client_id} | Summary: Delete Oauth client Description: Delete registered Oauth client by clientId.
*AuthServerServiceApi* | [**auth_server_service_get_access_token**](docs/AuthServerServiceApi.md#auth_server_service_get_access_token) | **GET** /api/v3/oauth/token | Summary: Get access token Description: Get access token from passed clientId and secret.
*AuthServerServiceApi* | [**auth_server_service_get_oauth_client**](docs/AuthServerServiceApi.md#auth_server_service_get_oauth_client) | **GET** /api/v3/oauth/clients/{client_id} | Summary: Get Oauth client Description: Get registered Oauth client by clientId.
*AuthServerServiceApi* | [**auth_server_service_get_user**](docs/AuthServerServiceApi.md#auth_server_service_get_user) | **GET** /api/v3/auth/user | Summary: Get user Description: Get user.
*AuthServerServiceApi* | [**auth_server_service_list_oauth_client**](docs/AuthServerServiceApi.md#auth_server_service_list_oauth_client) | **GET** /api/v3/oauth/clients | Summary: List Oauth client Description: List all registered Oauth client.
*CloudAccountsApi* | [**add_analyzed_region**](docs/CloudAccountsApi.md#add_analyzed_region) | **POST** /api/v1/dspm/cloudAccounts/cloudProviders/analyzedRegions | Add a new region for data classification
*CloudAccountsApi* | [**add_cloud_accounts**](docs/CloudAccountsApi.md#add_cloud_accounts) | **POST** /api/v1/dspm/cloudAccounts/cloudProviders | Add cloud account connections to DSPM
*CloudAccountsApi* | [**generate_atlassian_confluence_auth_url**](docs/CloudAccountsApi.md#generate_atlassian_confluence_auth_url) | **GET** /api/v1/dspm/cloudAccounts/saasApps/atlassian-confluence/generateAuthUrl | Generate a Confluence authentication URL
*CloudAccountsApi* | [**generate_atlassian_jira_auth_url**](docs/CloudAccountsApi.md#generate_atlassian_jira_auth_url) | **GET** /api/v1/dspm/cloudAccounts/saasApps/atlassian-jira/generateAuthUrl | Generate a JIRA authentication URL
*CloudAccountsApi* | [**generate_azure_auth_url**](docs/CloudAccountsApi.md#generate_azure_auth_url) | **GET** /api/v1/dspm/cloudAccounts/azure/generateAuthUrl | Generate azure authorization url
*CloudAccountsApi* | [**generate_office365_auth_url**](docs/CloudAccountsApi.md#generate_office365_auth_url) | **GET** /api/v1/dspm/cloudAccounts/saasApps/office365/generateAuthUrl | Generate a Microsoft 365 consent URL
*CloudAccountsApi* | [**generate_slack_auth_url**](docs/CloudAccountsApi.md#generate_slack_auth_url) | **GET** /api/v1/dspm/cloudAccounts/saasApps/slack/generateAuthUrl | Generate a Slack authentication URL
*CloudAccountsApi* | [**generate_snowflake_auth_url**](docs/CloudAccountsApi.md#generate_snowflake_auth_url) | **POST** /api/v1/dspm/cloudAccounts/saasApps/snowflake/generateAuthUrl | Validate and Generate a Snowflake OAuth URL
*CloudAccountsApi* | [**get_analyzed_region_status**](docs/CloudAccountsApi.md#get_analyzed_region_status) | **GET** /api/v1/dspm/cloudAccounts/cloudProviders/analyzedRegions/status | Get the status of analyzer installation for a region
*CloudAccountsApi* | [**get_azure_admin_consent_status**](docs/CloudAccountsApi.md#get_azure_admin_consent_status) | **GET** /api/v1/dspm/cloudAccounts/azure/getAdminConsentStatus | Get Azure admin consent status
*CloudAccountsApi* | [**get_cloud_account_installation_status**](docs/CloudAccountsApi.md#get_cloud_account_installation_status) | **GET** /api/v1/dspm/cloudAccounts/{cloudProvider}/{cloudAccountId}/installationStatus | Get the installation status of a cloud account
*CloudAccountsApi* | [**get_refresh_token_expiry**](docs/CloudAccountsApi.md#get_refresh_token_expiry) | **GET** /api/v1/dspm/cloudAccounts/saasApps/snowflake/getRefreshTokenExpiry/{providerId} | Get Snowflake Refresh Token Expiry date
*CloudAccountsApi* | [**list_linked_accounts**](docs/CloudAccountsApi.md#list_linked_accounts) | **GET** /api/v1/dspm/cloudAccounts/linkedAccounts | List cloud accounts connected to DSPM
*CloudAccountsApi* | [**remove_accounts**](docs/CloudAccountsApi.md#remove_accounts) | **DELETE** /api/v1/dspm/cloudAccounts/removeAccounts | Post cloud account ID connections to be removed
*CloudAccountsApi* | [**remove_accounts_instructions**](docs/CloudAccountsApi.md#remove_accounts_instructions) | **GET** /api/v1/dspm/cloudAccounts/removeAccountsInstructions | Post cloud account IDs and get instructions to remove the accounts
*CloudAccountsApi* | [**retrieve_service_account_id**](docs/CloudAccountsApi.md#retrieve_service_account_id) | **GET** /api/v1/dspm/cloudAccounts/saasApps/google/retrieveServiceAccountId | Get Google Workspace authentication
*CloudAccountsApi* | [**snowflake_integration_script**](docs/CloudAccountsApi.md#snowflake_integration_script) | **GET** /api/v1/dspm/cloudAccounts/saasApps/snowflake/snowflakeIntegrationScript | Generate Snowflake Integration Script
*CloudAccountsApi* | [**submit_google_workspace_admin_email**](docs/CloudAccountsApi.md#submit_google_workspace_admin_email) | **POST** /api/v1/dspm/cloudAccounts/saasApps/google/submitAdminEmail | Submit email for service account authorization
*CloudAccountsApi* | [**submit_office365_tenant_info**](docs/CloudAccountsApi.md#submit_office365_tenant_info) | **POST** /api/v1/dspm/cloudAccounts/saasApps/office365/submitTenantInfo | Submit Microsoft 365 customer information
*CloudAccountsApi* | [**submit_slack_auth_code**](docs/CloudAccountsApi.md#submit_slack_auth_code) | **POST** /api/v1/dspm/cloudAccounts/saasApps/slack/submitAuthCode | Submit a Slack authentication code
*CloudAccountsApi* | [**submit_snowflake_auth_code**](docs/CloudAccountsApi.md#submit_snowflake_auth_code) | **POST** /api/v1/dspm/cloudAccounts/saasApps/snowflake/submitAuthCode | Submit Snowflake oAuth code
*ComplianceAcceleratorApi* | [**compliance_accelerator_create_workspace**](docs/ComplianceAcceleratorApi.md#compliance_accelerator_create_workspace) | **POST** /api/v3/compliance/workspace | Summary: Create workspace Description: Create a workspace.
*ComplianceAcceleratorApi* | [**compliance_accelerator_delete_compliance_workspaces**](docs/ComplianceAcceleratorApi.md#compliance_accelerator_delete_compliance_workspaces) | **DELETE** /api/v3/compliance | Summary: Delete compliance workspaces Description: Delete workspaces.
*ComplianceAcceleratorApi* | [**compliance_accelerator_get_compliance_info**](docs/ComplianceAcceleratorApi.md#compliance_accelerator_get_compliance_info) | **GET** /api/v3/compliance | Summary: Get compliance info Description: Return stored compliance data.
*ComplianceAcceleratorApi* | [**compliance_accelerator_hydrate_workspace**](docs/ComplianceAcceleratorApi.md#compliance_accelerator_hydrate_workspace) | **POST** /api/v3/compliance/workspace/hydrate | HydrateWorkspace - Hydrates specified objects within a workspace
*ComplianceAcceleratorApi* | [**compliance_accelerator_store_compliance_info**](docs/ComplianceAcceleratorApi.md#compliance_accelerator_store_compliance_info) | **POST** /api/v3/compliance | Summary: Store compliance info Description: Store compliance data.
*ConnectionsServiceApi* | [**connections_service_create_connections_accounts**](docs/ConnectionsServiceApi.md#connections_service_create_connections_accounts) | **POST** /api/v3/connections/accounts | Summary: Create Connections accounts Description: Create Connections acccounts.
*ConnectionsServiceApi* | [**connections_service_create_connections_configs**](docs/ConnectionsServiceApi.md#connections_service_create_connections_configs) | **POST** /api/v3/connections/configs | Summary: Create connections configs Description: Create Connection config by connection type.
*ConnectionsServiceApi* | [**connections_service_create_plugin**](docs/ConnectionsServiceApi.md#connections_service_create_plugin) | **POST** /api/v3/connections/plugins | Summary: Create plugin Description: Create UC generic plugin
*ConnectionsServiceApi* | [**connections_service_create_settings**](docs/ConnectionsServiceApi.md#connections_service_create_settings) | **POST** /api/v3/connections/settings | Summary: Create settings Description: Create Settings.
*ConnectionsServiceApi* | [**connections_service_delete_connections_accounts**](docs/ConnectionsServiceApi.md#connections_service_delete_connections_accounts) | **DELETE** /api/v3/connections/accounts/{account_id} | Summary: Delete Connections accounts Description: Delete Connections acccounts.
*ConnectionsServiceApi* | [**connections_service_delete_connections_configs**](docs/ConnectionsServiceApi.md#connections_service_delete_connections_configs) | **DELETE** /api/v3/connections/configs/{connection_id} | Summary: Delete connections configs Description: Delete Connection config by connection id.
*ConnectionsServiceApi* | [**connections_service_delete_connector**](docs/ConnectionsServiceApi.md#connections_service_delete_connector) | **DELETE** /api/v3/connections/{connection_id} | Summary: Delete connector Description: Delete a Connection.
*ConnectionsServiceApi* | [**connections_service_delete_plugin**](docs/ConnectionsServiceApi.md#connections_service_delete_plugin) | **DELETE** /api/v3/connections/plugins/{id} | Summary: Delete plugin. Description: Delete plugin.
*ConnectionsServiceApi* | [**connections_service_generate_package**](docs/ConnectionsServiceApi.md#connections_service_generate_package) | **PUT** /api/v3/connections/plugins/{id}/package | Summary: Generate package. Description: Generate package.
*ConnectionsServiceApi* | [**connections_service_get_banner_state**](docs/ConnectionsServiceApi.md#connections_service_get_banner_state) | **GET** /api/v3/connections/banner | Summary: Get banner state for object verb page.  Description: Get banner state for object verb page.
*ConnectionsServiceApi* | [**connections_service_get_connections_accounts**](docs/ConnectionsServiceApi.md#connections_service_get_connections_accounts) | **GET** /api/v3/connections/accounts | Summary: Get Connections accounts Description: Get Connections acccounts.
*ConnectionsServiceApi* | [**connections_service_get_connections_configs**](docs/ConnectionsServiceApi.md#connections_service_get_connections_configs) | **GET** /api/v3/connections/configs | Summary: Get connections configs Description: Get Connection config by connection type.
*ConnectionsServiceApi* | [**connections_service_get_connections_with_filters**](docs/ConnectionsServiceApi.md#connections_service_get_connections_with_filters) | **POST** /api/v3/connections | Summary: Get connections with filters Description: Get connections with filters.
*ConnectionsServiceApi* | [**connections_service_get_connectors_summary**](docs/ConnectionsServiceApi.md#connections_service_get_connectors_summary) | **GET** /api/v3/connections/summary | Summary: Get connectors summary Description: Get a summary of Connectors.
*ConnectionsServiceApi* | [**connections_service_get_data_sources**](docs/ConnectionsServiceApi.md#connections_service_get_data_sources) | **GET** /api/v3/connections/datasources | Summary: Get data sources Description: Get a list of data sources.
*ConnectionsServiceApi* | [**connections_service_get_guard_record_fields**](docs/ConnectionsServiceApi.md#connections_service_get_guard_record_fields) | **GET** /api/v3/connections/fields | Summary: Get list of guard record fields.  Description: Get list of guard record fields.
*ConnectionsServiceApi* | [**connections_service_get_headers**](docs/ConnectionsServiceApi.md#connections_service_get_headers) | **GET** /api/v3/connections/headers | Summary: Get headers Description: Get a list of Headers.
*ConnectionsServiceApi* | [**connections_service_get_plugins**](docs/ConnectionsServiceApi.md#connections_service_get_plugins) | **GET** /api/v3/connections/plugins | Summary: Get plugins  Description: Get custom universal connector plugins
*ConnectionsServiceApi* | [**connections_service_get_settings**](docs/ConnectionsServiceApi.md#connections_service_get_settings) | **GET** /api/v3/connections/settings | Summary: Get settings Description: Get a list of Settings.
*ConnectionsServiceApi* | [**connections_service_partial_update_connectors**](docs/ConnectionsServiceApi.md#connections_service_partial_update_connectors) | **PATCH** /api/v3/connections | Summary: Partial update connectors Description: Partial update of Connectors.
*ConnectionsServiceApi* | [**connections_service_post_stap_command**](docs/ConnectionsServiceApi.md#connections_service_post_stap_command) | **POST** /api/v3/stap/commands | Summary: Post stap command Description: Send a STAP command down to kafka for snif-assist.
*ConnectionsServiceApi* | [**connections_service_update_banner_state**](docs/ConnectionsServiceApi.md#connections_service_update_banner_state) | **PUT** /api/v3/connections/banner | Summary: Update banner state for object verb page.  Description: Update banner state for object verb page.
*ConnectionsServiceApi* | [**connections_service_update_connections_accounts**](docs/ConnectionsServiceApi.md#connections_service_update_connections_accounts) | **PUT** /api/v3/connections/accounts | Summary: Update Connections accounts Description: Update Connections acccounts.
*ConnectionsServiceApi* | [**connections_service_update_connections_configs**](docs/ConnectionsServiceApi.md#connections_service_update_connections_configs) | **PATCH** /api/v3/connections/configs | Summary: Update connections configs Description: Update Connection config by connection id.
*ConnectionsServiceApi* | [**connections_service_update_connectors**](docs/ConnectionsServiceApi.md#connections_service_update_connectors) | **PUT** /api/v3/connections | Summary: Update connectors Description: Update a list of Connectors.
*ConnectionsServiceApi* | [**connections_service_update_plugin**](docs/ConnectionsServiceApi.md#connections_service_update_plugin) | **PUT** /api/v3/connections/plugins/{id} | Summary: Update plugin. Description: Update plugin.
*ConnectionsServiceApi* | [**connections_service_update_settings**](docs/ConnectionsServiceApi.md#connections_service_update_settings) | **PUT** /api/v3/connections/settings | Summary: Update settings Description: Update Settings.
*ConnectionsServiceApi* | [**connections_service_validate_aws_connection**](docs/ConnectionsServiceApi.md#connections_service_validate_aws_connection) | **POST** /api/v3/connections/validate/aws | Summary: Validate an AWS connection. Description: Validate an AWS connection.
*DashboardsServiceApi* | [**dashboards_service_create_dashboard**](docs/DashboardsServiceApi.md#dashboards_service_create_dashboard) | **POST** /api/v3/dashboards | Summary: Create dashboard Description: Create a unique dashboard.
*DashboardsServiceApi* | [**dashboards_service_delete_dashboard**](docs/DashboardsServiceApi.md#dashboards_service_delete_dashboard) | **DELETE** /api/v3/dashboards/{dashboard_id} | Summary: Delete dashboard Description: Delete a unique dashboard.
*DashboardsServiceApi* | [**dashboards_service_get_dashboards**](docs/DashboardsServiceApi.md#dashboards_service_get_dashboards) | **GET** /api/v3/dashboards | Summary: Get dashboards Description: Get a list of dashboards with all data.
*DashboardsServiceApi* | [**dashboards_service_update_dashboard**](docs/DashboardsServiceApi.md#dashboards_service_update_dashboard) | **PUT** /api/v3/dashboards/{dashboard_id} | Summary: Update dashboard Description: Update a dashboard.
*DataMovementsApi* | [**get_actual_flow**](docs/DataMovementsApi.md#get_actual_flow) | **GET** /api/v1/dspm/dataMovements/actualFlows/{id} | Get actual flow by providing its ID
*DataMovementsApi* | [**get_actual_flows_summary**](docs/DataMovementsApi.md#get_actual_flows_summary) | **GET** /api/v1/dspm/dataMovements/actualFlows/summary | Get summary of actual flows
*DataMovementsApi* | [**get_potential_flow**](docs/DataMovementsApi.md#get_potential_flow) | **GET** /api/v1/dspm/dataMovements/potentialFlows/{flowId} | Get potential flow by providing its ID
*DataMovementsApi* | [**get_potential_flow_path**](docs/DataMovementsApi.md#get_potential_flow_path) | **GET** /api/v1/dspm/dataMovements/potentialFlows/paths/{flowPathId} | Get potential flow path by providing its ID
*DataMovementsApi* | [**get_potential_flows_summary**](docs/DataMovementsApi.md#get_potential_flows_summary) | **GET** /api/v1/dspm/dataMovements/potentialFlows/summary | Get summary of potential flows according to the filter applied
*DataMovementsApi* | [**list_actual_flow_paths**](docs/DataMovementsApi.md#list_actual_flow_paths) | **GET** /api/v1/dspm/dataMovements/actualFlowPaths | Get summary of actual flows according to the filter applied
*DataMovementsApi* | [**list_actual_flows**](docs/DataMovementsApi.md#list_actual_flows) | **GET** /api/v1/dspm/dataMovements/actualFlows | List actual flows
*DataMovementsApi* | [**list_potential_flows**](docs/DataMovementsApi.md#list_potential_flows) | **GET** /api/v1/dspm/dataMovements/potentialFlows | List potential flows
*DataMovementsApi* | [**list_potential_flows_paths**](docs/DataMovementsApi.md#list_potential_flows_paths) | **GET** /api/v1/dspm/dataMovements/potentialFlows/paths | List potential flow paths
*DataResourcesApi* | [**get_data_resource**](docs/DataResourcesApi.md#get_data_resource) | **GET** /api/v1/dspm/dataResources/{dataResourceId} | Get a specific data resource by its ID
*DataResourcesApi* | [**get_data_resources_summary**](docs/DataResourcesApi.md#get_data_resources_summary) | **GET** /api/v1/dspm/dataResources/summary | Data resources summary
*DataResourcesApi* | [**list_data_resources**](docs/DataResourcesApi.md#list_data_resources) | **GET** /api/v1/dspm/dataResources | List data resources that match a given filter
*DataResourcesApi* | [**list_data_resources_names**](docs/DataResourcesApi.md#list_data_resources_names) | **GET** /api/v1/dspm/dataResources/names | List names of data resources
*DataResourcesApi* | [**remove_resource**](docs/DataResourcesApi.md#remove_resource) | **DELETE** /api/v1/dspm/dataResources/{dataResourceId}/removeResource | Remove resource from DSPM
*DataResourcesApi* | [**update_resource_review_status**](docs/DataResourcesApi.md#update_resource_review_status) | **PUT** /api/v1/dspm/dataResources/{dataResourceId}/reviewed | Set review status of a data resource
*DataSensitivitiesApi* | [**get_sensitivities_summary**](docs/DataSensitivitiesApi.md#get_sensitivities_summary) | **GET** /api/v1/dspm/sensitivities/summary | Get the summary of sensitivities
*DataSensitivitiesApi* | [**get_sensitivity**](docs/DataSensitivitiesApi.md#get_sensitivity) | **GET** /api/v1/dspm/sensitivities/{sensitivityId} | Get sensitivity details by providing its ID
*DataSensitivitiesApi* | [**list_sensitivities**](docs/DataSensitivitiesApi.md#list_sensitivities) | **GET** /api/v1/dspm/sensitivities | List sensitivities
*DataStoresApi* | [**get_data_store**](docs/DataStoresApi.md#get_data_store) | **GET** /api/v1/dspm/dataStores/{dataStoreId} | Get a data store by its ID
*DataStoresApi* | [**get_data_stores_summary**](docs/DataStoresApi.md#get_data_stores_summary) | **GET** /api/v1/dspm/dataStores/summary | Get summary of data stores
*DataStoresApi* | [**list_all_data_stores_labels**](docs/DataStoresApi.md#list_all_data_stores_labels) | **GET** /api/v1/dspm/dataStores/labels | List labels of data stores.
*DataStoresApi* | [**list_data_stores**](docs/DataStoresApi.md#list_data_stores) | **GET** /api/v1/dspm/dataStores | List data stores
*DataStoresApi* | [**list_data_stores_cloud_tags_keys**](docs/DataStoresApi.md#list_data_stores_cloud_tags_keys) | **GET** /api/v1/dspm/dataStores/cloudTags/keys | List the cloud tag keys of data stores that can be filtered on the basis of prefixes.
*DataStoresApi* | [**list_data_stores_cloud_tags_values**](docs/DataStoresApi.md#list_data_stores_cloud_tags_values) | **GET** /api/v1/dspm/dataStores/cloudTags/values | List the cloud tag values of data stores that can be filtered on the basis of prefixes and cloud tag key names.
*DataStoresApi* | [**list_data_stores_names**](docs/DataStoresApi.md#list_data_stores_names) | **GET** /api/v1/dspm/dataStores/filters/name | List name of filterable data stores
*DataStoresApi* | [**rescan_data_store**](docs/DataStoresApi.md#rescan_data_store) | **POST** /api/v1/dspm/dataStores/rescan | Post data store rescan request
*DataStoresApi* | [**set_data_store_label**](docs/DataStoresApi.md#set_data_store_label) | **PUT** /api/v1/dspm/dataStores/{dataStoreId}/labels | Label a data store with an existing or new label
*DataStoresApi* | [**update_datastore_custodian**](docs/DataStoresApi.md#update_datastore_custodian) | **POST** /api/v1/dspm/dataStores/custodian | Update the name of a Data store custodian
*DataVulnerabilitiesApi* | [**add_vulnerability_status_comment**](docs/DataVulnerabilitiesApi.md#add_vulnerability_status_comment) | **POST** /api/v1/dspm/vulnerabilities/{vulnerabilityId}/statuses/{statusId}/comments | Add vulnerability status comment
*DataVulnerabilitiesApi* | [**get_vulnerabilities_summary**](docs/DataVulnerabilitiesApi.md#get_vulnerabilities_summary) | **GET** /api/v1/dspm/vulnerabilities/summary | Get vulnerabilities summary
*DataVulnerabilitiesApi* | [**get_vulnerability**](docs/DataVulnerabilitiesApi.md#get_vulnerability) | **GET** /api/v1/dspm/vulnerabilities/{vulnerabilityId} | Get vulnerability details by ID
*DataVulnerabilitiesApi* | [**list_vulnerabilities**](docs/DataVulnerabilitiesApi.md#list_vulnerabilities) | **GET** /api/v1/dspm/vulnerabilities | List vulnerabilities based on an applied filter
*DataVulnerabilitiesApi* | [**list_vulnerabilities_by_data_store**](docs/DataVulnerabilitiesApi.md#list_vulnerabilities_by_data_store) | **GET** /api/v1/dspm/vulnerabilities/byDataStore | List vulnerabilities of data stores
*DataVulnerabilitiesApi* | [**remove_vulnerability_status_comment**](docs/DataVulnerabilitiesApi.md#remove_vulnerability_status_comment) | **DELETE** /api/v1/dspm/vulnerabilities/{vulnerabilityId}/statuses/{statusId}/comments/{commentId} | Delete vulnerability status comment
*DataVulnerabilitiesApi* | [**set_vulnerability_status**](docs/DataVulnerabilitiesApi.md#set_vulnerability_status) | **POST** /api/v1/dspm/vulnerabilities/{vulnerabilityId}/statuses | Set status of a vulnerability
*DataVulnerabilitiesApi* | [**update_vulnerability_status_comment**](docs/DataVulnerabilitiesApi.md#update_vulnerability_status_comment) | **PUT** /api/v1/dspm/vulnerabilities/{vulnerabilityId}/statuses/{statusId}/comments/{commentId} | Set vulnerability status
*DatabootstrapperServiceApi* | [**databootstrapper_service_load_data**](docs/DatabootstrapperServiceApi.md#databootstrapper_service_load_data) | **POST** /api/v3/databootstrapper/data | Summary: Load data Description: Load data for a tenant.
*DatamartProcessorServiceApi* | [**datamart_processor_service_get_datamart_info**](docs/DatamartProcessorServiceApi.md#datamart_processor_service_get_datamart_info) | **GET** /api/v3/datamarts/info | Summary: Get datamarts Description: Return a list of files inside a datamart to the caller.
*DatamartProcessorServiceApi* | [**datamart_processor_service_get_datamarts**](docs/DatamartProcessorServiceApi.md#datamart_processor_service_get_datamarts) | **GET** /api/v3/datamarts | Summary: Get datamarts Description: Return a list of datamarts for a time interval to the caller.
*DatamartProcessorServiceApi* | [**datamart_processor_service_get_earliest_start_time**](docs/DatamartProcessorServiceApi.md#datamart_processor_service_get_earliest_start_time) | **GET** /api/v3/datamarts/earliest_start_time | Summary: Get rarliest start time Description: Return the earliest time period of data available in database.
*DatamartProcessorServiceApi* | [**datamart_processor_service_send_all_complete_files_to_queue**](docs/DatamartProcessorServiceApi.md#datamart_processor_service_send_all_complete_files_to_queue) | **POST** /api/v3/datamarts/repush_files | 
*DatamartProcessorServiceApi* | [**datamart_processor_service_store_extraction_logs**](docs/DatamartProcessorServiceApi.md#datamart_processor_service_store_extraction_logs) | **POST** /api/v3/datamarts/{request_id}/dm_extraction_logs | Summary: Store extraction logs Description: Store the datamart extraction logs inside GI.
*DatamartProcessorServiceApi* | [**upload_datamart**](docs/DatamartProcessorServiceApi.md#upload_datamart) | **POST** /api/v3/datamarts/upload | Summary: Upload datamart Description: Upload datamart file for ingestion.
*EcosystemServiceApi* | [**ecosystem_service_create_dataset**](docs/EcosystemServiceApi.md#ecosystem_service_create_dataset) | **POST** /api/v3/integrations/datasets | Summary: Create dataset Description: Save a definition in the database.
*EcosystemServiceApi* | [**ecosystem_service_data_insert**](docs/EcosystemServiceApi.md#ecosystem_service_data_insert) | **POST** /api/v3/integrations/datasets/{dataset_name} | Summary: Data insert Description: Process Data received from webhook API and insert.
*EcosystemServiceApi* | [**ecosystem_service_delete_datasets**](docs/EcosystemServiceApi.md#ecosystem_service_delete_datasets) | **DELETE** /api/v3/integrations/datasets | Summary: Delete datasets Description: Delete an array of datasets.
*EcosystemServiceApi* | [**ecosystem_service_get_dataset_data**](docs/EcosystemServiceApi.md#ecosystem_service_get_dataset_data) | **GET** /api/v3/integrations/datasets/{dataset_name}/data | Summary: Get dataset data Description: Return data report for a given dataset.
*EcosystemServiceApi* | [**ecosystem_service_get_dataset_detail**](docs/EcosystemServiceApi.md#ecosystem_service_get_dataset_detail) | **GET** /api/v3/integrations/datasets/{dataset_name}/details | Summary: Get dataset detail Description: Return detail on a dataset definition.
*EcosystemServiceApi* | [**ecosystem_service_get_datasets**](docs/EcosystemServiceApi.md#ecosystem_service_get_datasets) | **GET** /api/v3/integrations/datasets | Summary: Get datasets Description: Return dataset list that matches the specified filter.
*EcosystemServiceApi* | [**ecosystem_service_get_purgable_rows**](docs/EcosystemServiceApi.md#ecosystem_service_get_purgable_rows) | **POST** /api/v3/integrations/purge | Summary: Get purgable rows Description: Check the number of rows that can be purged.
*EcosystemServiceApi* | [**ecosystem_service_purge_data**](docs/EcosystemServiceApi.md#ecosystem_service_purge_data) | **DELETE** /api/v3/integrations/datasets/data | Summary: Purge data Description: Purge data.
*EcosystemServiceApi* | [**ecosystem_service_test_integration**](docs/EcosystemServiceApi.md#ecosystem_service_test_integration) | **POST** /api/v3/integrations/setup/test | Summary: Test integration Description: Test the integration connection with the arguments passed in the TestIntegrationRequest.  When possible a test message is sent to the integration to ensure it is functional. Currently this API only supports API_IMPORT type integrations
*FeatureFlagsServiceApi* | [**feature_flags_service_delete_feature_flag_overrides**](docs/FeatureFlagsServiceApi.md#feature_flags_service_delete_feature_flag_overrides) | **DELETE** /api/v3/feature_flags/overrides | Summary: Delete feature Flag overrides Description: Delete feature Flag overrides from database.
*FeatureFlagsServiceApi* | [**feature_flags_service_get_feature_flag_overrides**](docs/FeatureFlagsServiceApi.md#feature_flags_service_get_feature_flag_overrides) | **GET** /api/v3/feature_flags/overrides | Summary: Get feature Flag overrides Description: Get feature Flag overrides by Feature Flag Name.
*FeatureFlagsServiceApi* | [**feature_flags_service_get_feature_flags**](docs/FeatureFlagsServiceApi.md#feature_flags_service_get_feature_flags) | **GET** /api/v3/feature_flags | Summary: Get feature flags Description: Get feature flags by Feature Flag Name.
*FeatureFlagsServiceApi* | [**feature_flags_service_update_feature_flag_overrides**](docs/FeatureFlagsServiceApi.md#feature_flags_service_update_feature_flag_overrides) | **PUT** /api/v3/feature_flags/overrides | Summary: Update feature Flag overrides Description: Update feature Flag overrides in the database.
*GroupBuilderApi* | [**group_builder_cancel_import_group**](docs/GroupBuilderApi.md#group_builder_cancel_import_group) | **DELETE** /api/v3/groups_import | Summary: Cancel import group Description: Cancel import refresh for selected groups.
*GroupBuilderApi* | [**group_builder_create_group**](docs/GroupBuilderApi.md#group_builder_create_group) | **POST** /api/v3/groups | Summary: Create group Description: Create new groups.
*GroupBuilderApi* | [**group_builder_delete_group**](docs/GroupBuilderApi.md#group_builder_delete_group) | **DELETE** /api/v3/groups | Summary: Delete group Description: Delete specified groups if the group ID is not used for reports.
*GroupBuilderApi* | [**group_builder_edit_group**](docs/GroupBuilderApi.md#group_builder_edit_group) | **PATCH** /api/v3/groups/{group_id} | Summary: Edit group Description: Add or delete group members.
*GroupBuilderApi* | [**group_builder_export_group**](docs/GroupBuilderApi.md#group_builder_export_group) | **POST** /api/v3/groups_export | Summary: Export group Description: Export group content to a file based on a group ID.
*GroupBuilderApi* | [**group_builder_get_group_details**](docs/GroupBuilderApi.md#group_builder_get_group_details) | **GET** /api/v3/groups/{group_id} | Summary: Get group details Description: Get details of group specified by group ID.
*GroupBuilderApi* | [**group_builder_get_group_members**](docs/GroupBuilderApi.md#group_builder_get_group_members) | **POST** /api/v3/groups/search | Summary: Get group members Description: Get members of all the group ids provided in the request. To be consumed by policy builder ms.
*GroupBuilderApi* | [**group_builder_get_group_sync_mapping**](docs/GroupBuilderApi.md#group_builder_get_group_sync_mapping) | **GET** /api/v3/groups/mappings/sync | Summary: Get GDP to gi group mapping Description: Get GDSC to GDP group sync mapping.
*GroupBuilderApi* | [**group_builder_get_group_type_mapping**](docs/GroupBuilderApi.md#group_builder_get_group_type_mapping) | **GET** /api/v3/groups-mappings | Summary: Get group type mapping Description: Get GDSC to GDP group types mapping.
*GroupBuilderApi* | [**group_builder_get_group_types**](docs/GroupBuilderApi.md#group_builder_get_group_types) | **GET** /api/v3/group_types | Summary: Get group types Description: Get a list of available group types.
*GroupBuilderApi* | [**group_builder_get_groups**](docs/GroupBuilderApi.md#group_builder_get_groups) | **GET** /api/v3/groups | Summary: Get groups Description: Get a list of imported group members.
*GroupBuilderApi* | [**group_builder_get_import_groups**](docs/GroupBuilderApi.md#group_builder_get_import_groups) | **GET** /api/v3/groups_import | Summary: Get import groups Description: Get unsynchronized groups from a central manager.
*GroupBuilderApi* | [**group_builder_import_group**](docs/GroupBuilderApi.md#group_builder_import_group) | **POST** /api/v3/groups_import | Summary: Import group Description: Import selected groups from a central manager. (This API is called from GDP only)
*GroupBuilderApi* | [**group_builder_refresh_groups**](docs/GroupBuilderApi.md#group_builder_refresh_groups) | **POST** /api/v3/groups/refresh | Summary: Refresh groups Description: Refresh tenants selected imported groups.
*GroupBuilderApi* | [**group_builder_reset_groups**](docs/GroupBuilderApi.md#group_builder_reset_groups) | **POST** /api/v3/groups/reset | Summary: Reset groups Description: Resets tenants selected predefined groups.
*GroupBuilderApi* | [**group_builder_store_group_members_gdp**](docs/GroupBuilderApi.md#group_builder_store_group_members_gdp) | **POST** /api/v3/central_managers/{central_manager_id}/groups/members | Summary: Store group members Gdp Description: Store GDP groups. (This API is called from GDP only)
*GroupBuilderApi* | [**group_builder_store_groups_gdp**](docs/GroupBuilderApi.md#group_builder_store_groups_gdp) | **POST** /api/v3/central_managers/{central_manager_id}/groups | Summary: Store groups Gdp Description: Store GDP groups. (This API is called from GDP only)
*GuardiumConnectorApi* | [**guardium_connector_add_cm**](docs/GuardiumConnectorApi.md#guardium_connector_add_cm) | **POST** /api/v3/central_managers | Summary: Add CM Description: Add a Central Manager to the tenant database.
*GuardiumConnectorApi* | [**guardium_connector_add_datamarts**](docs/GuardiumConnectorApi.md#guardium_connector_add_datamarts) | **POST** /api/v3/central_managers/{central_manager_id}/datamarts | Description: stores datamarts details from GDP. (This API is called from GDP only)
*GuardiumConnectorApi* | [**guardium_connector_add_dm_exclusion**](docs/GuardiumConnectorApi.md#guardium_connector_add_dm_exclusion) | **POST** /api/v3/datamarts/exclusion_list | Summary: Add DM exclusion Description: Add datamart to exclusion list.
*GuardiumConnectorApi* | [**guardium_connector_add_task**](docs/GuardiumConnectorApi.md#guardium_connector_add_task) | **POST** /api/v3/central_managers/{central_manager_id}/tasks | Summary: Add task Description: Add a task to be executed on GDP. (This API is called from GDP only)
*GuardiumConnectorApi* | [**guardium_connector_block_user**](docs/GuardiumConnectorApi.md#guardium_connector_block_user) | **POST** /api/v3/block_user | Summary: Block user Description: Block a database user on Guardium Data Protection or on a supported Database as a Service instance.
*GuardiumConnectorApi* | [**guardium_connector_configure_aggregator_export**](docs/GuardiumConnectorApi.md#guardium_connector_configure_aggregator_export) | **PUT** /api/v3/central_managers/{central_manager_id}/aggregator_config_export | Summary: Configure aggregator export Description: Configure datamart export from the Aggregators to GI.
*GuardiumConnectorApi* | [**guardium_connector_configure_collector_export**](docs/GuardiumConnectorApi.md#guardium_connector_configure_collector_export) | **PUT** /api/v3/central_managers/{central_manager_id}/collector_config_export | Summary: Configure collector export Description: Schedule export historical data for collectors.
*GuardiumConnectorApi* | [**guardium_connector_configure_streaming**](docs/GuardiumConnectorApi.md#guardium_connector_configure_streaming) | **POST** /api/v3/central_managers/{central_manager_id}/streaming | Summary: Configure streaming Description: Enable or disable streaming.
*GuardiumConnectorApi* | [**guardium_connector_datamart_version_check**](docs/GuardiumConnectorApi.md#guardium_connector_datamart_version_check) | **POST** /api/v3/central_managers/{central_manager_id}/datamart_version | Description: validates if central manager has v5 datamart support. (This API is called from GDP only)
*GuardiumConnectorApi* | [**guardium_connector_delete_cm**](docs/GuardiumConnectorApi.md#guardium_connector_delete_cm) | **DELETE** /api/v3/central_managers/{central_manager_id} | Summary: Delete CM Description: Delete a Central Manager by ID (Name, Hostname or IP).
*GuardiumConnectorApi* | [**guardium_connector_delete_dm_exclusion**](docs/GuardiumConnectorApi.md#guardium_connector_delete_dm_exclusion) | **DELETE** /api/v3/datamarts/exclusion_list | Summary: Delete DM exclusion Description: Delete a datamart from exclusion list.
*GuardiumConnectorApi* | [**guardium_connector_delete_task**](docs/GuardiumConnectorApi.md#guardium_connector_delete_task) | **DELETE** /api/v3/central_managers/{central_manager_id}/tasks/{task_id} | Summary: Delete task Description: Delete a task by central manager id and task id. (This API is called from GDP only)
*GuardiumConnectorApi* | [**guardium_connector_delete_tasks**](docs/GuardiumConnectorApi.md#guardium_connector_delete_tasks) | **DELETE** /api/v3/central_managers/{central_manager_id}/tasks | Summary: Delete tasks Description: Delete a central manager&#39;s tasks by central manager id. (This API is called from GDP only)
*GuardiumConnectorApi* | [**guardium_connector_get_aggregators_config**](docs/GuardiumConnectorApi.md#guardium_connector_get_aggregators_config) | **GET** /api/v3/central_managers/{central_manager_id}/aggregators_config | Summary: Get aggregators config Description: Return a list of managed units from the config collection in tenant database.
*GuardiumConnectorApi* | [**guardium_connector_get_cms**](docs/GuardiumConnectorApi.md#guardium_connector_get_cms) | **GET** /api/v3/central_managers | Summary: Get CMs Description: Return a list of Central Managers from the tenant database with additional processing.
*GuardiumConnectorApi* | [**guardium_connector_get_cms_config**](docs/GuardiumConnectorApi.md#guardium_connector_get_cms_config) | **GET** /api/v3/central_managers_config | Summary: Get CMs config Description: Return a list of Central Managers from the tenant database.
*GuardiumConnectorApi* | [**guardium_connector_get_collectors_config**](docs/GuardiumConnectorApi.md#guardium_connector_get_collectors_config) | **GET** /api/v3/central_managers/{central_manager_id}/collectors_config | Summary: Get collectors config Description: Return the list of collectors configuration from the tenant database.
*GuardiumConnectorApi* | [**guardium_connector_get_datamarts**](docs/GuardiumConnectorApi.md#guardium_connector_get_datamarts) | **GET** /api/v3/central_managers/{central_manager_id}/datamarts | Description: returns full list of supported datamarts including type (historical or non-historical)
*GuardiumConnectorApi* | [**guardium_connector_get_dm_exclusion**](docs/GuardiumConnectorApi.md#guardium_connector_get_dm_exclusion) | **GET** /api/v3/datamarts/exclusion_list | Summary: Get DM exclusion Description: Return datamarts in the exclusion list.
*GuardiumConnectorApi* | [**guardium_connector_get_gdp_policy_info**](docs/GuardiumConnectorApi.md#guardium_connector_get_gdp_policy_info) | **GET** /api/v3/central_managers/{central_manager_id}/policies/info | Summary: Get guardium policy definition Description: returns the policy definition on the cm
*GuardiumConnectorApi* | [**guardium_connector_get_gdp_policy_summaries**](docs/GuardiumConnectorApi.md#guardium_connector_get_gdp_policy_summaries) | **GET** /api/v3/central_managers/{central_manager_id}/policies/summaries | Summary: Get guardium policy summary Description: returns the summaries of all policies on that central manager
*GuardiumConnectorApi* | [**guardium_connector_get_health_info**](docs/GuardiumConnectorApi.md#guardium_connector_get_health_info) | **GET** /api/v3/central_managers/{central_manager_id}/health_info | Summary: Get health info Description: Get health information from Guardium Data Protection central mamangers. (This API is for CMs registered in legacy pull mode. Supported on-premises only)
*GuardiumConnectorApi* | [**guardium_connector_get_latest_dm_extraction_profile**](docs/GuardiumConnectorApi.md#guardium_connector_get_latest_dm_extraction_profile) | **GET** /api/v3/central_managers/{central_manager_id}/datamart_extraction_profile | Summary: Get latest DM extraction profile Description: Return the Datamart Extraction Profile for GDSC.
*GuardiumConnectorApi* | [**guardium_connector_get_streaming_status**](docs/GuardiumConnectorApi.md#guardium_connector_get_streaming_status) | **GET** /api/v3/central_managers/{central_manager_id}/streaming | Summary: Get streaming status Description: Return the streaming configuration.
*GuardiumConnectorApi* | [**guardium_connector_get_sync_dms**](docs/GuardiumConnectorApi.md#guardium_connector_get_sync_dms) | **GET** /api/v3/central_managers/{central_manager_id}/sync | Summary: Get sync DMs Description: Return the list of tasks from a central manager. (This API is called from GDP only)
*GuardiumConnectorApi* | [**guardium_connector_get_task_types**](docs/GuardiumConnectorApi.md#guardium_connector_get_task_types) | **GET** /api/v3/central_managers/task_types | Summary: Get task types Description: Return the list of supported task types.
*GuardiumConnectorApi* | [**guardium_connector_get_tasks**](docs/GuardiumConnectorApi.md#guardium_connector_get_tasks) | **GET** /api/v3/central_managers/{central_manager_id}/tasks | Summary: Get tasks Description: Return the list of tasks from a central manager. (This API is called from GDP only)
*GuardiumConnectorApi* | [**guardium_connector_run_gdp_report**](docs/GuardiumConnectorApi.md#guardium_connector_run_gdp_report) | **POST** /api/v3/central_managers/{central_manager_id}/run_report | Summary: Run GDP report Description: Run GDP report. (This API is for CMs registered in legacy pull mode. Supported on-premises only)
*GuardiumConnectorApi* | [**guardium_connector_setup_cm**](docs/GuardiumConnectorApi.md#guardium_connector_setup_cm) | **POST** /api/v3/central_managers/setup | Summary: Setup CM Description: Set up the registration between a GDP Central manager and GDSC. (This API is called from GDP only)
*GuardiumConnectorApi* | [**guardium_connector_setup_datamarts**](docs/GuardiumConnectorApi.md#guardium_connector_setup_datamarts) | **POST** /api/v3/central_managers/{central_manager_id}/datamarts/setup | Description: setup custom datamart execution mode
*GuardiumConnectorApi* | [**guardium_connector_task_error**](docs/GuardiumConnectorApi.md#guardium_connector_task_error) | **POST** /api/v3/central_managers/{central_manager_id}/tasks/error | Summary: Task error Description: Log error messages from GDP task execution. (This API is called from GDP only)
*GuardiumConnectorApi* | [**guardium_connector_test_database_connection**](docs/GuardiumConnectorApi.md#guardium_connector_test_database_connection) | **POST** /api/v3/test_database | Summary: Test database connection Description: Return database connection results.
*GuardiumConnectorApi* | [**guardium_connector_update_dm_exclusion**](docs/GuardiumConnectorApi.md#guardium_connector_update_dm_exclusion) | **PUT** /api/v3/datamarts/exclusion_list | Summary: Update DM exclusion Description: Update the atamart exclusion list.
*GuardiumConnectorApi* | [**guardium_connector_update_streaming**](docs/GuardiumConnectorApi.md#guardium_connector_update_streaming) | **PUT** /api/v3/central_managers/{central_manager_id}/streaming | Summary: Update streaming Description: Update streaming status into GI. (This API is called from GDP only)
*GuardiumConnectorApi* | [**guardium_connector_update_task**](docs/GuardiumConnectorApi.md#guardium_connector_update_task) | **PUT** /api/v3/central_managers/{central_manager_id}/tasks/{task_id} | Summary: Update task Description: Update a task that gets executed on GDP. (This API is called from GDP only)
*HealthCollectorApi* | [**health_collector_get_data_warehouse_usage**](docs/HealthCollectorApi.md#health_collector_get_data_warehouse_usage) | **GET** /api/v3/metrics/warehouse/{type} | Summary: Get data warehouse usage info Description: Get information from data warehouse related to usage
*HealthCollectorApi* | [**health_collector_get_gdp_health_info**](docs/HealthCollectorApi.md#health_collector_get_gdp_health_info) | **GET** /api/v3/health | Summary: Get GDP health info Description: Get information from MongoDB for Guardium central managers using health-connector service.
*HealthCollectorApi* | [**health_collector_get_historical_health_info**](docs/HealthCollectorApi.md#health_collector_get_historical_health_info) | **GET** /api/v3/health/history | Summary: Get historical health info Description: Retrieve historical s-tap related statistics from health-collector service.
*HealthCollectorApi* | [**health_collector_get_object_storage_usage**](docs/HealthCollectorApi.md#health_collector_get_object_storage_usage) | **GET** /api/v3/metrics/object_storage/{type} | Summary: Get object storage usage info Description: Get information from object storage about tenant bucket usage
*HealthCollectorApi* | [**health_collector_get_pod_restarts**](docs/HealthCollectorApi.md#health_collector_get_pod_restarts) | **GET** /api/v3/metrics/pods/{type} | Summary: Get the pod restart information Description: Get information about the number of restarts by pod in OCP
*HealthCollectorApi* | [**health_collector_get_pvc_usage**](docs/HealthCollectorApi.md#health_collector_get_pvc_usage) | **GET** /api/v3/metrics/pvc/{type} | Summary: Get the PVC usage information Description: Get information about the PVC usage in the OCP cluster
*HealthCollectorApi* | [**health_collector_get_streams_ingestion**](docs/HealthCollectorApi.md#health_collector_get_streams_ingestion) | **GET** /api/v3/metrics/streams/{type} | Summary: Get streams ingestion volume over a given time Description: Get information about streams ingestion volume
*HealthCollectorApi* | [**health_collector_get_top_gdp_collectors**](docs/HealthCollectorApi.md#health_collector_get_top_gdp_collectors) | **GET** /api/v3/metrics/collectors/{type} | Summary: Get the top GDP collectors which send data to GI Description: Get information about the top GDP collectors
*HealthCollectorApi* | [**health_collector_store_health_info**](docs/HealthCollectorApi.md#health_collector_store_health_info) | **POST** /api/v3/health/central_managers/{central_manager_id}/health_info | Summary: Store health info Description: Store health info from GDP into GI. (This API is called from GDP only)
*JumpboxServiceApi* | [**jumpbox_service_authorize**](docs/JumpboxServiceApi.md#jumpbox_service_authorize) | **POST** /api/v3/authorization | Summary: Authorize Description: Authenticate a user and return a JWT.
*JumpboxServiceApi* | [**jumpbox_service_delete_tenant**](docs/JumpboxServiceApi.md#jumpbox_service_delete_tenant) | **DELETE** /api/v3/tenants/{tenant_id} | Summary: Delete tenant Description: Delete a tenant.
*JumpboxServiceApi* | [**jumpbox_service_delete_user**](docs/JumpboxServiceApi.md#jumpbox_service_delete_user) | **DELETE** /api/v3/users/{user_id} | Summary: Delete user Description: Delete the user.
*JumpboxServiceApi* | [**jumpbox_service_get_tenant**](docs/JumpboxServiceApi.md#jumpbox_service_get_tenant) | **GET** /api/v3/tenants/{tenant_id} | Summary: Get tenant Description: Get a tenant.
*JumpboxServiceApi* | [**jumpbox_service_get_tenants**](docs/JumpboxServiceApi.md#jumpbox_service_get_tenants) | **GET** /api/v3/tenants | Summary: Get tenants Description: Get all tenant base on UID.
*JumpboxServiceApi* | [**jumpbox_service_get_users**](docs/JumpboxServiceApi.md#jumpbox_service_get_users) | **GET** /api/v3/users | Summary: Get users Description: Get all users base on a tenantID.
*JumpboxServiceApi* | [**jumpbox_service_post_tenants**](docs/JumpboxServiceApi.md#jumpbox_service_post_tenants) | **POST** /api/v3/tenants | Summary: Post tenants Description: Create a tenant.
*JumpboxServiceApi* | [**jumpbox_service_post_users**](docs/JumpboxServiceApi.md#jumpbox_service_post_users) | **POST** /api/v3/users | Summary: Post users Description: Create users.
*JumpboxServiceApi* | [**jumpbox_service_search_users**](docs/JumpboxServiceApi.md#jumpbox_service_search_users) | **POST** /api/v3/users/search | Summary: Search users Description: Search for all users matching the provided string.
*JumpboxServiceApi* | [**jumpbox_service_test_user**](docs/JumpboxServiceApi.md#jumpbox_service_test_user) | **POST** /api/v3/users/test | Summary: Test user Description: Test a user lookup to a given LDAP.
*JumpboxServiceApi* | [**jumpbox_service_update_tenant**](docs/JumpboxServiceApi.md#jumpbox_service_update_tenant) | **PATCH** /api/v3/tenants/{tenant_id} | Summary: Update tenant Description: Update a tenant.
*JumpboxServiceApi* | [**jumpbox_service_update_users**](docs/JumpboxServiceApi.md#jumpbox_service_update_users) | **PATCH** /api/v3/users | Summary: Update users Description: Update an array of users.
*NotificationsServiceApi* | [**notifications_service_create_ticket**](docs/NotificationsServiceApi.md#notifications_service_create_ticket) | **POST** /api/v3/integrations/ticket | Summary: Create ticket Description: Create ticket based on information passed in.
*NotificationsServiceApi* | [**notifications_service_get_folders**](docs/NotificationsServiceApi.md#notifications_service_get_folders) | **POST** /api/v3/integrations/folders | Summary: Get folders Description: Get folder for the integration connection provided.
*NotificationsServiceApi* | [**notifications_service_get_notification_filename**](docs/NotificationsServiceApi.md#notifications_service_get_notification_filename) | **GET** /api/v3/notifications/filename | Summary: Get notification filename Description: Return filename associated with the notifications record referenced in the associated context record. The notification id is required but may be set in the associated authentication token or explicitly in the request.
*NotificationsServiceApi* | [**notifications_service_get_notification_record**](docs/NotificationsServiceApi.md#notifications_service_get_notification_record) | **GET** /api/v3/notifications/details/{notification_id} | Summary: Get notification record Description: Return notifications record with the specified ID.
*NotificationsServiceApi* | [**notifications_service_get_notification_records**](docs/NotificationsServiceApi.md#notifications_service_get_notification_records) | **GET** /api/v3/notifications | Summary: Get notification records Description: Return notifications records that match the specified filter.
*NotificationsServiceApi* | [**notifications_service_get_ticket_status**](docs/NotificationsServiceApi.md#notifications_service_get_ticket_status) | **GET** /api/v3/integrations/ticket/status | Summary: Get ticket status Description: Get the status of the given ticket
*NotificationsServiceApi* | [**notifications_service_post_notification_record**](docs/NotificationsServiceApi.md#notifications_service_post_notification_record) | **POST** /api/v3/notifications | Summary: For PostNotificationRecord notification only Description: Sends notification with recipients and returns a status
*NotificationsServiceApi* | [**notifications_service_search_notification_records**](docs/NotificationsServiceApi.md#notifications_service_search_notification_records) | **POST** /api/v3/notifications/search | Summary: Search notification records Description: Return notification records using pipeline of filters
*NotificationsServiceApi* | [**notifications_service_test_integration**](docs/NotificationsServiceApi.md#notifications_service_test_integration) | **POST** /api/v3/integrations/test | Summary: Test integration Description: Test the integration connection with the arguments passed in the TestIntegrationRequest.  When possible a test message is sent to the integration to ensure it is functional.
*NotificationsServiceApi* | [**notifications_service_update_notification_record**](docs/NotificationsServiceApi.md#notifications_service_update_notification_record) | **PUT** /api/v3/notifications | Summary: Update notification record Description: Update a notification record with the specified values.  The ID field is required and must match an existing notification. All fields other than the ID are optional. Creation timestamp, user and other administrative fields can not updated.
*OutliersEngineApi* | [**outliers_engine_get_source_statistics**](docs/OutliersEngineApi.md#outliers_engine_get_source_statistics) | **GET** /api/v3/outliers/source/statistics | Summary: Get source statistics Description: Return statistics regarding the input source, including distribution of verbs, source program, working hours etc.
*OutliersEngineApi* | [**outliers_engine_get_statistics**](docs/OutliersEngineApi.md#outliers_engine_get_statistics) | **GET** /api/v3/outliers/statistics | Summary: Get statistics Description: Return statistics regarding number of outliers, clusters and un/completed periods.
*OutliersEngineApi* | [**outliers_engine_get_working_hours_periods**](docs/OutliersEngineApi.md#outliers_engine_get_working_hours_periods) | **GET** /api/v3/outliers/working_hours_periods | Summary: Get working hours periods Description: Get a list of the working hours periods.
*OutliersEngineApi* | [**outliers_engine_run_simulator**](docs/OutliersEngineApi.md#outliers_engine_run_simulator) | **POST** /api/v3/outliers/simulator | Summary: Run simulator Description: Run outlier simulator.
*OutliersEngineApi* | [**outliers_engine_update_working_hours_periods**](docs/OutliersEngineApi.md#outliers_engine_update_working_hours_periods) | **PUT** /api/v3/outliers/working_hours_periods | Summary: Update working hours periods Description: Update the working hours periods values.
*OutliersEngineApi* | [**outliers_engine_upload_and_analyze_period**](docs/OutliersEngineApi.md#outliers_engine_upload_and_analyze_period) | **POST** /api/v3/outliers | Summary: Upload and analyze period Description: Run outliers detection on ready periods.
*OutliersEngineApi* | [**outliers_engine_user_clustering**](docs/OutliersEngineApi.md#outliers_engine_user_clustering) | **POST** /api/v3/outliers/clusters | Summary: User clustering Description: Run user-clustering on current sources.
*PipelineconfigServiceApi* | [**pipelineconfig_service_delete_tenant_resources**](docs/PipelineconfigServiceApi.md#pipelineconfig_service_delete_tenant_resources) | **DELETE** /api/v3/resources/{tenant_id}/{resource} | Summary: Delete a tenant resource Description: Delete tenant specific resources such as data warehouse, mongo, postgres and s3.
*PolicyBuilderApi* | [**policy_builder_clone_policy**](docs/PolicyBuilderApi.md#policy_builder_clone_policy) | **POST** /api/v3/policies/clone/{policy_id} | Summary: Clone policy Description: Clone a policy.
*PolicyBuilderApi* | [**policy_builder_create_policy**](docs/PolicyBuilderApi.md#policy_builder_create_policy) | **POST** /api/v3/policies | Summary: Create policy Description: Create Policy returns response code and message.
*PolicyBuilderApi* | [**policy_builder_delete_gdp_sync_entry**](docs/PolicyBuilderApi.md#policy_builder_delete_gdp_sync_entry) | **DELETE** /api/v3/policies/sync_entry | Summary: Delete GDP policy sync entry Description: Deletes GDP policy from sync collection
*PolicyBuilderApi* | [**policy_builder_delete_policies**](docs/PolicyBuilderApi.md#policy_builder_delete_policies) | **DELETE** /api/v3/policies | Summary: Delete policies Description: Delete Policy returns response code and message.
*PolicyBuilderApi* | [**policy_builder_get_gdp_policy_meta_data**](docs/PolicyBuilderApi.md#policy_builder_get_gdp_policy_meta_data) | **GET** /api/v3/policies/metadata_list | Summary: Get GDP policy summary information Description: Get GDP&#39;s CM&#39;s policy summary from mogodb
*PolicyBuilderApi* | [**policy_builder_get_policies**](docs/PolicyBuilderApi.md#policy_builder_get_policies) | **GET** /api/v3/policies | Summary: Get policies Description: Return a list of policies to the caller.
*PolicyBuilderApi* | [**policy_builder_get_policy_details**](docs/PolicyBuilderApi.md#policy_builder_get_policy_details) | **GET** /api/v3/policies/{policy_id}/details | Summary: Get policy details Description: Return a list of rules inside the policy.
*PolicyBuilderApi* | [**policy_builder_get_policy_names_from_rule_ids**](docs/PolicyBuilderApi.md#policy_builder_get_policy_names_from_rule_ids) | **POST** /api/v3/policies/policy_names | Summary: GetPolicy names from rule IDs Description: Return a map where the key is the rule ID and value is the policy name that has the rule ID.
*PolicyBuilderApi* | [**policy_builder_get_policy_sync_list**](docs/PolicyBuilderApi.md#policy_builder_get_policy_sync_list) | **GET** /api/v3/policies/sync_list | Summary: Get list of synced polices Description: Returns the list and status of sync entries
*PolicyBuilderApi* | [**policy_builder_get_receivers**](docs/PolicyBuilderApi.md#policy_builder_get_receivers) | **GET** /api/v3/policies/receivers | Summary: Get receivers Description: Get all the receivers associated with actions.
*PolicyBuilderApi* | [**policy_builder_get_rule_metadata**](docs/PolicyBuilderApi.md#policy_builder_get_rule_metadata) | **GET** /api/v3/rules/metadata | Summary: Get rule metadata Description: Return a list of rule parameters and actions to the caller.
*PolicyBuilderApi* | [**policy_builder_insert_gdp_policy**](docs/PolicyBuilderApi.md#policy_builder_insert_gdp_policy) | **POST** /api/v3/policies/sync_entry | Summary: Insert GDP policy sync entry Description: Inserts GDP policy&#39;s name into sync collection
*PolicyBuilderApi* | [**policy_builder_insert_gdp_policy_meta_data**](docs/PolicyBuilderApi.md#policy_builder_insert_gdp_policy_meta_data) | **POST** /api/v3/central_managers/{central_manager_id}/policies/policy_metadata | Summary: Insert GDP policy summaries Description: Inserts GDP&#39;s CM&#39;s policy summary information into mogodb. (This API is called from GDP only)
*PolicyBuilderApi* | [**policy_builder_install_policies**](docs/PolicyBuilderApi.md#policy_builder_install_policies) | **PUT** /api/v3/policies/install | Summary: Install policies Description: Activate Policies request performs activations.
*PolicyBuilderApi* | [**policy_builder_integration_check**](docs/PolicyBuilderApi.md#policy_builder_integration_check) | **GET** /api/v3/policies/integration_check/{integration_id} | Summary: Integration check Description: Check if integration id is being used in policies.
*PolicyBuilderApi* | [**policy_builder_policies_groups**](docs/PolicyBuilderApi.md#policy_builder_policies_groups) | **GET** /api/v3/policies/groups | Summary: Policies groups Description: Get policy groups.
*PolicyBuilderApi* | [**policy_builder_rule_validation**](docs/PolicyBuilderApi.md#policy_builder_rule_validation) | **POST** /api/v3/rules/validate | Summary: Rule validation Description: Validate a rule parameters and actions.
*PolicyBuilderApi* | [**policy_builder_store_policies_gdp**](docs/PolicyBuilderApi.md#policy_builder_store_policies_gdp) | **POST** /api/v3/policies/{central_manager_id} | Summary: Store policies Gdp Description: Store policies.  (This API is called from GDP only)
*QSDataLoaderApi* | [**q_s_data_loader_q_sfile_validator**](docs/QSDataLoaderApi.md#q_s_data_loader_q_sfile_validator) | **POST** /api/v3/data/validation | QSfileValidator - validate the files before insert happend .
*QSDataLoaderApi* | [**q_s_data_loader_upload_synthetic_data_loader**](docs/QSDataLoaderApi.md#q_s_data_loader_upload_synthetic_data_loader) | **POST** /api/v3/data/synthetic | UploadSyntheticDataLoader - Insert data into Db after read from .sql file .
*QSDataManagerApi* | [**q_s_data_manager_get_master_data**](docs/QSDataManagerApi.md#q_s_data_manager_get_master_data) | **GET** /api/v3/datamanager/master-data | Summary: master data for all entities Description: Retrieves All Dimension and Fact tables data.
*QSDataManagerApi* | [**q_s_data_manager_get_plugin_data**](docs/QSDataManagerApi.md#q_s_data_manager_get_plugin_data) | **GET** /api/v3/datamanager/plugin | Summary: Plugins Details Description: Retrieves All plugins information.
*QSDataManagerApi* | [**q_s_data_manager_register_scan**](docs/QSDataManagerApi.md#q_s_data_manager_register_scan) | **POST** /api/v3/datamanager/scan | Summary: Insert ScanDetails Description: Register new data into scan dimension table.
*QSDataManagerApi* | [**q_s_data_manager_retrieve_scan**](docs/QSDataManagerApi.md#q_s_data_manager_retrieve_scan) | **GET** /api/v3/datamanager/scan/{scan_id}/data | Summary: Fetch ScanDetails Description: Fetch details from scan dimension table.
*QSPluginManagerApi* | [**q_s_plugin_manager_invoke_app_prov**](docs/QSPluginManagerApi.md#q_s_plugin_manager_invoke_app_prov) | **POST** /api/v3/plugins/{plugin_id}/application | Summary: Invoke only application provisioning data plugin Description:Parses app input file and triggers dataload
*QSPluginManagerApi* | [**q_s_plugin_manager_invoke_explorer_v1**](docs/QSPluginManagerApi.md#q_s_plugin_manager_invoke_explorer_v1) | **POST** /api/v3/plugins/{plugin_id}/explorer | Summary: Invoke only explorer inventory data plugin Description:Parses explorer input file and triggers dataload
*QSPluginManagerApi* | [**q_s_plugin_manager_invoke_explorer_v2**](docs/QSPluginManagerApi.md#q_s_plugin_manager_invoke_explorer_v2) | **POST** /api/v3/plugins/{plugin_id}/explorer/analytics | Summary: Invoke only explorer analytics data plugin Description:Parses explorer input file and triggers dataload
*QSPluginManagerApi* | [**q_s_plugin_manager_invoke_plugin**](docs/QSPluginManagerApi.md#q_s_plugin_manager_invoke_plugin) | **POST** /api/v3/plugins/{plugin_id}/network | Summary: Invoke consolidated or only network data plugin Description:Parses input files and triggers dataload
*QSPluginManagerApi* | [**q_s_plugin_manager_invoke_policy**](docs/QSPluginManagerApi.md#q_s_plugin_manager_invoke_policy) | **POST** /api/v3/plugins/{plugin_id}/policy | Summary: Invoke only policy data plugin Description:Parses policy input file and triggers dataload
*QSPolicyManagerApi* | [**q_s_policy_manager_batch_status_update**](docs/QSPolicyManagerApi.md#q_s_policy_manager_batch_status_update) | **PUT** /api/v3/policy_manager/tickets/status | BatchStatusUpdate - trigger the batch to update the status of the Ticket .
*QSPolicyManagerApi* | [**q_s_policy_manager_config_update**](docs/QSPolicyManagerApi.md#q_s_policy_manager_config_update) | **PATCH** /api/v3/policy_manager/configs | ConfigUpdate - this function update Crypto Risk Factor Weight in Db2 as well as Mongodb.
*QSPolicyManagerApi* | [**q_s_policy_manager_create_ticket**](docs/QSPolicyManagerApi.md#q_s_policy_manager_create_ticket) | **POST** /api/v3/policy_manager/ticket | CreateTicket - Create a new Incident .
*QSPolicyManagerApi* | [**q_s_policy_manager_fetch_filesfrom_buckets**](docs/QSPolicyManagerApi.md#q_s_policy_manager_fetch_filesfrom_buckets) | **GET** /api/v3/policy_manager/os-files | FetchFilesfromBuckets - fetch the file(s) from bucket of the object storage
*QSPolicyManagerApi* | [**q_s_policy_manager_process_policy_dimention_records**](docs/QSPolicyManagerApi.md#q_s_policy_manager_process_policy_dimention_records) | **POST** /api/v3/policy_manager/policy/process | ProcessPolicyDimentionRecords - fetch the records from Policy Dimention and update Policy Fact table
*QSPolicyManagerApi* | [**q_s_policy_manager_update_ticket_status**](docs/QSPolicyManagerApi.md#q_s_policy_manager_update_ticket_status) | **PUT** /api/v3/policy_manager/ticket/status | UpdateTicketStatus - Update the ticket status based on the IntegrationId and TicketId .
*ReportsRunnerApi* | [**reports_runner_get_active_queries**](docs/ReportsRunnerApi.md#reports_runner_get_active_queries) | **POST** /api/v3/queries/search | Summary: Get running queries Description: Get queries that are running more than certain time
*ReportsRunnerApi* | [**reports_runner_get_audit_data_count**](docs/ReportsRunnerApi.md#reports_runner_get_audit_data_count) | **POST** /api/v3/reports/{report_id}/audit_count | Summary: Get audit data count Description: Get audit data.
*ReportsRunnerApi* | [**reports_runner_get_chart_data**](docs/ReportsRunnerApi.md#reports_runner_get_chart_data) | **POST** /api/v3/charts/run | Summary: Get chart data Description: Get Chart data by chart ID or by specifying report definition and chart settings.
*ReportsRunnerApi* | [**reports_runner_get_chart_datav2**](docs/ReportsRunnerApi.md#reports_runner_get_chart_datav2) | **POST** /api/v3/flex-charts/run | 
*ReportsRunnerApi* | [**reports_runner_get_report_column_facet**](docs/ReportsRunnerApi.md#reports_runner_get_report_column_facet) | **POST** /api/v3/reports/facet | Summary: Get report column facet Description: Get counts that is group by values for the selected column.
*ReportsRunnerApi* | [**reports_runner_get_report_data_count**](docs/ReportsRunnerApi.md#reports_runner_get_report_data_count) | **POST** /api/v3/reports/count | Summary: Get report data count Description: Get report data.
*ReportsRunnerApi* | [**reports_runner_run_audit_report**](docs/ReportsRunnerApi.md#reports_runner_run_audit_report) | **POST** /api/v3/audit/{report_id}/run | Summary: Run audit report Description: Run task report by SQL based ob report ID and filter definition.
*ReportsRunnerApi* | [**reports_runner_run_report**](docs/ReportsRunnerApi.md#reports_runner_run_report) | **POST** /api/v3/reports/run | Summary: Run report Description: Run report by report ID or by specifying report definition.
*ReportsRunnerApi* | [**reports_runner_stop_query**](docs/ReportsRunnerApi.md#reports_runner_stop_query) | **POST** /api/v3/queries/stop | Summary: Stop query Description: Stop a query based on the id
*ReportsServiceApi* | [**reports_service_create_category**](docs/ReportsServiceApi.md#reports_service_create_category) | **POST** /api/v3/reports/categories | Summary: Create a category Description: Create a report category
*ReportsServiceApi* | [**reports_service_create_chart**](docs/ReportsServiceApi.md#reports_service_create_chart) | **POST** /api/v3/charts | Summary: Create chart Description: Create custom chart based on provided properties.
*ReportsServiceApi* | [**reports_service_create_chart_templatev2**](docs/ReportsServiceApi.md#reports_service_create_chart_templatev2) | **POST** /api/v3/flex-charts/templates | Summary: Create chart template v2 Description: Create custom VEGA chart template.
*ReportsServiceApi* | [**reports_service_create_chartv2**](docs/ReportsServiceApi.md#reports_service_create_chartv2) | **POST** /api/v3/flex-charts | Summary: Create chart v2 Description: Create custom VEGA chart based on provided properties.
*ReportsServiceApi* | [**reports_service_create_fields_by_category**](docs/ReportsServiceApi.md#reports_service_create_fields_by_category) | **POST** /api/v3/reports/fields | Summary - Create fields by category Description: Cteate category fields based on provided properties.
*ReportsServiceApi* | [**reports_service_create_join**](docs/ReportsServiceApi.md#reports_service_create_join) | **POST** /api/v3/reports/categories/joins | Summary: Create a join Description: Create a custom report join
*ReportsServiceApi* | [**reports_service_create_report**](docs/ReportsServiceApi.md#reports_service_create_report) | **POST** /api/v3/reports | Summary: Create report Description: Create custom report based on provided properties.
*ReportsServiceApi* | [**reports_service_create_variant**](docs/ReportsServiceApi.md#reports_service_create_variant) | **POST** /api/v3/reports/variants | Summary: Create a variant Description: Create a variant for reports
*ReportsServiceApi* | [**reports_service_delete_category**](docs/ReportsServiceApi.md#reports_service_delete_category) | **DELETE** /api/v3/reports/categories | Summary: Delete a category Description: Delete a report category
*ReportsServiceApi* | [**reports_service_delete_chart**](docs/ReportsServiceApi.md#reports_service_delete_chart) | **DELETE** /api/v3/charts/{chart_id} | Summary: Delete chart Description: Delete a custom chart.
*ReportsServiceApi* | [**reports_service_delete_chart_templatev2**](docs/ReportsServiceApi.md#reports_service_delete_chart_templatev2) | **DELETE** /api/v3/flex-charts/templates/{template_id} | Summary: Delete chart template v2 Description: Delete a custom VEGA chart template.
*ReportsServiceApi* | [**reports_service_delete_chartv2**](docs/ReportsServiceApi.md#reports_service_delete_chartv2) | **DELETE** /api/v3/flex-charts/{chart_id} | Summary: Delete chart v2 Description: Delete a custom VEGA chart.
*ReportsServiceApi* | [**reports_service_delete_fields_by_category**](docs/ReportsServiceApi.md#reports_service_delete_fields_by_category) | **DELETE** /api/v3/reports/fields | Summary - Delete fields by category Description: Delete category fields based on provided properties.
*ReportsServiceApi* | [**reports_service_delete_join**](docs/ReportsServiceApi.md#reports_service_delete_join) | **DELETE** /api/v3/reports/categories/joins/{join_id} | Summary: Delete a join Description: Delete a custom join
*ReportsServiceApi* | [**reports_service_delete_report**](docs/ReportsServiceApi.md#reports_service_delete_report) | **DELETE** /api/v3/reports/{report_id} | Summary: Delete report Description: Delete a custom report.
*ReportsServiceApi* | [**reports_service_delete_variant**](docs/ReportsServiceApi.md#reports_service_delete_variant) | **DELETE** /api/v3/reports/variants/{variant_id} | Summary: Delete a variant Description: Delete a variant
*ReportsServiceApi* | [**reports_service_get_categories**](docs/ReportsServiceApi.md#reports_service_get_categories) | **GET** /api/v3/reports/categories | Summary:  Get all available report categories. Description: Get all category related fields or all possible fields.
*ReportsServiceApi* | [**reports_service_get_chart_settings**](docs/ReportsServiceApi.md#reports_service_get_chart_settings) | **GET** /api/v3/charts | Summary: Get chart settings Description: Get a custom chart based on provided report id.
*ReportsServiceApi* | [**reports_service_get_chart_settingsv2**](docs/ReportsServiceApi.md#reports_service_get_chart_settingsv2) | **GET** /api/v3/flex-charts | Summary: Get chart settings v2 Description: Get a custom VEGA chart based on provided report id.
*ReportsServiceApi* | [**reports_service_get_chart_templatesv2**](docs/ReportsServiceApi.md#reports_service_get_chart_templatesv2) | **GET** /api/v3/flex-charts/templates | Summary: Get chart template v2 Description: Get all custom VEGA chart templates.
*ReportsServiceApi* | [**reports_service_get_fields_by_categories**](docs/ReportsServiceApi.md#reports_service_get_fields_by_categories) | **GET** /api/v3/reports/fields/categories | Summary: Get fields by categories Description: Get all category related fields or all possible fields based on a list of categories.
*ReportsServiceApi* | [**reports_service_get_fields_by_category**](docs/ReportsServiceApi.md#reports_service_get_fields_by_category) | **GET** /api/v3/reports/fields | Summary: Get fields by category Description: Get all category related fields or all possible fields.
*ReportsServiceApi* | [**reports_service_get_joins**](docs/ReportsServiceApi.md#reports_service_get_joins) | **GET** /api/v3/reports/categories/joins | Summary: Get all joins Description: Get all custom joins.
*ReportsServiceApi* | [**reports_service_get_query_by_report_definition**](docs/ReportsServiceApi.md#reports_service_get_query_by_report_definition) | **POST** /api/v3/reports/query/definition | Summary: Get query by report definition Description: Get query by report definition.
*ReportsServiceApi* | [**reports_service_get_query_by_report_id**](docs/ReportsServiceApi.md#reports_service_get_query_by_report_id) | **POST** /api/v3/reports/query/id | Summary: Get query by report ID Description: Get query by report ID.
*ReportsServiceApi* | [**reports_service_get_report_definition**](docs/ReportsServiceApi.md#reports_service_get_report_definition) | **GET** /api/v3/reports/{report_id}/definition | Summary: Get report definition Description: Get report definition.
*ReportsServiceApi* | [**reports_service_get_report_groups**](docs/ReportsServiceApi.md#reports_service_get_report_groups) | **GET** /api/v3/reports_groups | Summary: Get report groups Description: Get reports used by the provided groups.
*ReportsServiceApi* | [**reports_service_get_report_synopsis**](docs/ReportsServiceApi.md#reports_service_get_report_synopsis) | **GET** /api/v3/reports/{report_id}/synopsis | Summary: Get report synopsis Description: Return BriefReport.
*ReportsServiceApi* | [**reports_service_get_report_timestamp_header**](docs/ReportsServiceApi.md#reports_service_get_report_timestamp_header) | **GET** /api/v3/reports/headers/timestamp/default | Summary: Get report timestamp header Description: Get where to take a report timestamp given an entity.
*ReportsServiceApi* | [**reports_service_get_reports**](docs/ReportsServiceApi.md#reports_service_get_reports) | **GET** /api/v3/reports | Summary: Get reports Description: Get reports list.
*ReportsServiceApi* | [**reports_service_get_reports_for_join**](docs/ReportsServiceApi.md#reports_service_get_reports_for_join) | **GET** /api/v3/reports/categories/joins/{join_id}/reports | Summary: Get the reports that use a join Description: Get the reports that use a join and the headers that are imported by the reports using the join
*ReportsServiceApi* | [**reports_service_get_reports_tags**](docs/ReportsServiceApi.md#reports_service_get_reports_tags) | **GET** /api/v3/reports/tags | Summary: Get reports tags Description: Get all report distinct tags.
*ReportsServiceApi* | [**reports_service_get_variant**](docs/ReportsServiceApi.md#reports_service_get_variant) | **GET** /api/v3/reports/variants/{variant_id} | Summary: Get a variant Description: Get a given variant
*ReportsServiceApi* | [**reports_service_get_variants**](docs/ReportsServiceApi.md#reports_service_get_variants) | **GET** /api/v3/reports/variants | Summary: Get all variants Description: Get all variants in reports
*ReportsServiceApi* | [**reports_service_partial_chart_update**](docs/ReportsServiceApi.md#reports_service_partial_chart_update) | **PATCH** /api/v3/charts/{chart_id} | Summary: Partial chart update Description: Update a custom chart with partial information.
*ReportsServiceApi* | [**reports_service_partial_report_update**](docs/ReportsServiceApi.md#reports_service_partial_report_update) | **PATCH** /api/v3/reports/{report_id} | Summary: Partial report update Description: Update a custom report with partial information.
*ReportsServiceApi* | [**reports_service_run_variant_operation**](docs/ReportsServiceApi.md#reports_service_run_variant_operation) | **POST** /api/v3/reports/variants/run | Summary: Run a variant Description: Run the operations in a variant
*ReportsServiceApi* | [**reports_service_transpose**](docs/ReportsServiceApi.md#reports_service_transpose) | **POST** /api/v3/reports/transpose | Summary: Transpose Description: Return the corresponding full sql data.
*ReportsServiceApi* | [**reports_service_update_chart**](docs/ReportsServiceApi.md#reports_service_update_chart) | **PUT** /api/v3/charts/{chart_id} | Summary: Update chart Description: Update a custom chart.
*ReportsServiceApi* | [**reports_service_update_chartv2**](docs/ReportsServiceApi.md#reports_service_update_chartv2) | **PUT** /api/v3/flex-charts/{chart_id} | Summary: Update chart v2 Description: Update a custom VEGA chart.
*ReportsServiceApi* | [**reports_service_update_join**](docs/ReportsServiceApi.md#reports_service_update_join) | **PUT** /api/v3/reports/categories/joins/{join_id} | Summary: Update a join Description: Update a custom join
*ReportsServiceApi* | [**reports_service_update_report**](docs/ReportsServiceApi.md#reports_service_update_report) | **PUT** /api/v3/reports/{report_id} | Summary: Update report Description: Update a custom report.
*ReportsServiceApi* | [**reports_service_update_variant_override**](docs/ReportsServiceApi.md#reports_service_update_variant_override) | **PUT** /api/v3/reports/variants/{variant_id} | Summary: Update a variant Description: Update a variant with a custom override
*ResourceControllerK8ServiceApi* | [**resource_controller_k8_service_create_controller**](docs/ResourceControllerK8ServiceApi.md#resource_controller_k8_service_create_controller) | **POST** /api/v3/edge_manager/controllers | CreateController - Add a new controller.
*ResourceControllerK8ServiceApi* | [**resource_controller_k8_service_create_heart_beat**](docs/ResourceControllerK8ServiceApi.md#resource_controller_k8_service_create_heart_beat) | **POST** /api/v3/edge_manager/controllers/{controller_id}/heartbeat | CreateHeartBeat - Create a heartbeat for the controller.
*ResourceControllerK8ServiceApi* | [**resource_controller_k8_service_create_heart_beat_ex**](docs/ResourceControllerK8ServiceApi.md#resource_controller_k8_service_create_heart_beat_ex) | **POST** /api/v3/edge_manager/controllers/{controller_id}/heartbeat_ex | CreateHeartBeatEx - Create a heartbeat for the controller with extended information.
*ResourceControllerK8ServiceApi* | [**resource_controller_k8_service_create_job**](docs/ResourceControllerK8ServiceApi.md#resource_controller_k8_service_create_job) | **POST** /api/v3/edge_manager/jobs | //////////////////////////////////////////////////////////////// Interface to the controllers and apps api in the App-Manager microservice CreateJob - Create a job definition. Files and secrets contained within will also be created.
*ResourceControllerK8ServiceApi* | [**resource_controller_k8_service_create_job_execution**](docs/ResourceControllerK8ServiceApi.md#resource_controller_k8_service_create_job_execution) | **POST** /api/v3/edge_manager/job_executions | CreateJobExecution - Create a job execution.
*ResourceControllerK8ServiceApi* | [**resource_controller_k8_service_create_keypair**](docs/ResourceControllerK8ServiceApi.md#resource_controller_k8_service_create_keypair) | **POST** /api/v3/edge_manager/controllers/{controller_id}/keypair | CreateKeypair - Create a new keypair for the controller.
*ResourceControllerK8ServiceApi* | [**resource_controller_k8_service_delete_controller**](docs/ResourceControllerK8ServiceApi.md#resource_controller_k8_service_delete_controller) | **DELETE** /api/v3/edge_manager/controllers/{controller_id} | DeleteController - Delete a controller.
*ResourceControllerK8ServiceApi* | [**resource_controller_k8_service_delete_edge_tenant**](docs/ResourceControllerK8ServiceApi.md#resource_controller_k8_service_delete_edge_tenant) | **DELETE** /api/v3/edge_manager/tenants/{tenant_id} | DeleteEdgeTenant - deletes an edge tenant providing edge tenant id
*ResourceControllerK8ServiceApi* | [**resource_controller_k8_service_delete_edge_tenant_request**](docs/ResourceControllerK8ServiceApi.md#resource_controller_k8_service_delete_edge_tenant_request) | **DELETE** /api/v3/edges | DeleteEdgeTenantRequest to deletes gi and tnt CR on edge
*ResourceControllerK8ServiceApi* | [**resource_controller_k8_service_delete_job**](docs/ResourceControllerK8ServiceApi.md#resource_controller_k8_service_delete_job) | **DELETE** /api/v3/edge_manager/jobs/{job_id} | DeleteJob - Delete a job.
*ResourceControllerK8ServiceApi* | [**resource_controller_k8_service_download_controller_logs**](docs/ResourceControllerK8ServiceApi.md#resource_controller_k8_service_download_controller_logs) | **POST** /api/v3/edge_manager/controllers/{controller_id}/logs | DownloadControllerLogs - Download the controller logs for a running controller.
*ResourceControllerK8ServiceApi* | [**resource_controller_k8_service_get_controller_apps**](docs/ResourceControllerK8ServiceApi.md#resource_controller_k8_service_get_controller_apps) | **GET** /api/v3/edge_manager/controllers/{controller_id}/apps | GetControllerApps - Get the apps for the given controller.
*ResourceControllerK8ServiceApi* | [**resource_controller_k8_service_get_controller_commands**](docs/ResourceControllerK8ServiceApi.md#resource_controller_k8_service_get_controller_commands) | **GET** /api/v3/edge_manager/controllers/{controller_id}/commands | GetControllerCommands - Get the commands for the controller to execute.
*ResourceControllerK8ServiceApi* | [**resource_controller_k8_service_get_controller_jobs**](docs/ResourceControllerK8ServiceApi.md#resource_controller_k8_service_get_controller_jobs) | **GET** /api/v3/edge_manager/controllers/{controller_id}/jobs | GetControllerJobs - Get the jobs for the controller to execute.
*ResourceControllerK8ServiceApi* | [**resource_controller_k8_service_get_controller_status**](docs/ResourceControllerK8ServiceApi.md#resource_controller_k8_service_get_controller_status) | **GET** /api/v3/edge_manager/controllers/{controller_id}/status | GetControllerStatus - Get the status for the given controller.
*ResourceControllerK8ServiceApi* | [**resource_controller_k8_service_get_controllers**](docs/ResourceControllerK8ServiceApi.md#resource_controller_k8_service_get_controllers) | **GET** /api/v3/edge_manager/tenants/{tenant_id}/controllers | GetControllers - Get the controllers for the given tenant.
*ResourceControllerK8ServiceApi* | [**resource_controller_k8_service_get_controllers_with_status**](docs/ResourceControllerK8ServiceApi.md#resource_controller_k8_service_get_controllers_with_status) | **GET** /api/v3/edge_manager/tenants/{tenant_id}/controller_status | GetControllersWithStatus - Get the controllers for the given tenant with computed status.
*ResourceControllerK8ServiceApi* | [**resource_controller_k8_service_get_job**](docs/ResourceControllerK8ServiceApi.md#resource_controller_k8_service_get_job) | **GET** /api/v3/edge_manager/jobs/{job_id} | GetJob - Get the job.
*ResourceControllerK8ServiceApi* | [**resource_controller_k8_service_get_job_execution**](docs/ResourceControllerK8ServiceApi.md#resource_controller_k8_service_get_job_execution) | **GET** /api/v3/edge_manager/job_executions/{jobexe_id} | GetJobExecution - Get a job execution.
*ResourceControllerK8ServiceApi* | [**resource_controller_k8_service_get_job_executions**](docs/ResourceControllerK8ServiceApi.md#resource_controller_k8_service_get_job_executions) | **GET** /api/v3/edge_manager/jobs/{job_id}/executions | GetJobExecutions - Get the job executions.
*ResourceControllerK8ServiceApi* | [**resource_controller_k8_service_get_job_status**](docs/ResourceControllerK8ServiceApi.md#resource_controller_k8_service_get_job_status) | **GET** /api/v3/edge_manager/jobs/{job_id}/status | GetJobStatus - Get the job&#39;s status.
*ResourceControllerK8ServiceApi* | [**resource_controller_k8_service_get_tenant_app**](docs/ResourceControllerK8ServiceApi.md#resource_controller_k8_service_get_tenant_app) | **GET** /api/v3/edge_manager/tenants/{tenant_id}/apps/{app_name} | GetTenantApp - Get a specific app for the given tenant.
*ResourceControllerK8ServiceApi* | [**resource_controller_k8_service_get_tenant_apps**](docs/ResourceControllerK8ServiceApi.md#resource_controller_k8_service_get_tenant_apps) | **GET** /api/v3/edge_manager/tenants/{tenant_id}/apps | GetTenantApps - Get the apps for the given tenant.
*ResourceControllerK8ServiceApi* | [**resource_controller_k8_service_get_tenant_jobs**](docs/ResourceControllerK8ServiceApi.md#resource_controller_k8_service_get_tenant_jobs) | **GET** /api/v3/edge_manager/tenants/{tenant_id}/jobs | GetTenantJobs - Get jobs for the given tenant.
*ResourceControllerK8ServiceApi* | [**resource_controller_k8_service_get_version**](docs/ResourceControllerK8ServiceApi.md#resource_controller_k8_service_get_version) | **GET** /api/v3/edge_manager/system/version | GetVersion - Get the system version information for the service.
*ResourceControllerK8ServiceApi* | [**resource_controller_k8_service_install_edge_tenant_request**](docs/ResourceControllerK8ServiceApi.md#resource_controller_k8_service_install_edge_tenant_request) | **POST** /api/v3/edges | InstallEdgeTenantRequest to Create gi and tnt CRs on edge
*ResourceControllerK8ServiceApi* | [**resource_controller_k8_service_query_controller_logs**](docs/ResourceControllerK8ServiceApi.md#resource_controller_k8_service_query_controller_logs) | **POST** /api/v3/edge_manager/controllers/{controller_id}/logs/query | QueryControllerLogs - Query for the controller logs for a running controller.
*ResourceControllerK8ServiceApi* | [**resource_controller_k8_service_update_command**](docs/ResourceControllerK8ServiceApi.md#resource_controller_k8_service_update_command) | **PUT** /api/v3/edge_manager/commands/{id} | UpdateCommand - Update the command.
*ResourceControllerK8ServiceApi* | [**resource_controller_k8_service_update_controller**](docs/ResourceControllerK8ServiceApi.md#resource_controller_k8_service_update_controller) | **PUT** /api/v3/edge_manager/controllers/{id} | UpdateController - Update an existing controller.
*ResourceControllerK8ServiceApi* | [**resource_controller_k8_service_update_controller_status**](docs/ResourceControllerK8ServiceApi.md#resource_controller_k8_service_update_controller_status) | **PUT** /api/v3/edge_manager/controllers/{id}/status | UpdateControllerStatus - Updates the status for the given controller.
*ResourceControllerK8ServiceApi* | [**resource_controller_k8_service_update_edge_tenant_request**](docs/ResourceControllerK8ServiceApi.md#resource_controller_k8_service_update_edge_tenant_request) | **PATCH** /api/v3/edges/{edge_id} | UpdateEdgeTenantRequest to update gi and tnt CRs on edge
*ResourceControllerK8ServiceApi* | [**resource_controller_k8_service_update_job**](docs/ResourceControllerK8ServiceApi.md#resource_controller_k8_service_update_job) | **PUT** /api/v3/edge_manager/jobs/{id} | UpdateJob - Update a job.
*ResourceControllerK8ServiceApi* | [**resource_controller_k8_service_update_job_execution**](docs/ResourceControllerK8ServiceApi.md#resource_controller_k8_service_update_job_execution) | **PUT** /api/v3/edge_manager/job_executions/{id} | UpdateJobExecution - Update a job execution.
*ResourceControllerK8ServiceApi* | [**resource_controller_k8_service_update_job_status**](docs/ResourceControllerK8ServiceApi.md#resource_controller_k8_service_update_job_status) | **PUT** /api/v3/edge_manager/jobs/{job_id}/status | UpdateJobStatus - Updates the status for the given Job.
*RiskAnalyticsControllerApi* | [**risk_analytics_controller_enable_disable_risk_event_feedback**](docs/RiskAnalyticsControllerApi.md#risk_analytics_controller_enable_disable_risk_event_feedback) | **PUT** /api/v3/risk_feedback/status | Summary: Enable disable risk rvent feedback Description: Enable or disable the collect feedback process.
*RiskAnalyticsControllerApi* | [**risk_analytics_controller_enable_disable_risk_event_process**](docs/RiskAnalyticsControllerApi.md#risk_analytics_controller_enable_disable_risk_event_process) | **PUT** /api/v3/risk_process/status | Summary: Enable disable risk event process Description: Enable or disable the risk event process.
*RiskAnalyticsControllerApi* | [**risk_analytics_controller_get_all_classifications_list**](docs/RiskAnalyticsControllerApi.md#risk_analytics_controller_get_all_classifications_list) | **GET** /api/v3/risk_events/classifications | Summary: Get all classifications Description: Get all possible classifications for a risk event.
*RiskAnalyticsControllerApi* | [**risk_analytics_controller_get_risk_event_classifications_list**](docs/RiskAnalyticsControllerApi.md#risk_analytics_controller_get_risk_event_classifications_list) | **GET** /api/v3/risk_events/{risk_id}/feedback | Summary: Get risk event classifications list Description: retrieves the ClassificationMatchDetails for a given risk id; classification that did not matched will be with class_value 0.
*RiskAnalyticsControllerApi* | [**risk_analytics_controller_get_risk_event_data_for_summarization**](docs/RiskAnalyticsControllerApi.md#risk_analytics_controller_get_risk_event_data_for_summarization) | **GET** /api/v3/risk_events/{risk_id}/summarization/data | Summary: Get risk event data needed for summarization task Description: Retrieve the full information about this risk event including all findings data
*RiskAnalyticsControllerApi* | [**risk_analytics_controller_get_risk_event_details**](docs/RiskAnalyticsControllerApi.md#risk_analytics_controller_get_risk_event_details) | **GET** /api/v3/risk_events/{risk_id}/details | Summary: Get risk event details Description: Return the details of a risk event, including risk general info and a list of observations.
*RiskAnalyticsControllerApi* | [**risk_analytics_controller_get_risk_event_process_status**](docs/RiskAnalyticsControllerApi.md#risk_analytics_controller_get_risk_event_process_status) | **GET** /api/v3/risk_process/status | Summary: Get risk event process status Description: Get the risk event process status.
*RiskAnalyticsControllerApi* | [**risk_analytics_controller_get_risk_event_row**](docs/RiskAnalyticsControllerApi.md#risk_analytics_controller_get_risk_event_row) | **GET** /api/v3/risk_events | Summary: Get risk event row Description: Return a list of risk events.
*RiskAnalyticsControllerApi* | [**risk_analytics_controller_get_risk_event_vulnerability_assessment_details**](docs/RiskAnalyticsControllerApi.md#risk_analytics_controller_get_risk_event_vulnerability_assessment_details) | **PUT** /api/v3/risk_events/{risk_id}/va | Summary: Get vulnerability assessment details for a given risk event Description: Retrieve the information about failed VA tests for assets database and db user
*RiskAnalyticsControllerApi* | [**risk_analytics_controller_get_risk_feedback**](docs/RiskAnalyticsControllerApi.md#risk_analytics_controller_get_risk_feedback) | **GET** /api/v3/risk_events/feedback | Summary: Get risk feedback Description: Get all feedbacks that are in status NEW/WIP and change them to status WIP.
*RiskAnalyticsControllerApi* | [**risk_analytics_controller_get_risk_observation_details**](docs/RiskAnalyticsControllerApi.md#risk_analytics_controller_get_risk_observation_details) | **GET** /api/v3/risk_events/observations | Summary: Get risk observation details Description: Return details of a single risk observation.
*RiskAnalyticsControllerApi* | [**risk_analytics_controller_get_user_ui_settings**](docs/RiskAnalyticsControllerApi.md#risk_analytics_controller_get_user_ui_settings) | **GET** /api/v3/risk_events/user_ui_settings | Summary: Get user UI settings Description: Get the user settings by user id to display the risk in the UI.
*RiskAnalyticsControllerApi* | [**risk_analytics_controller_risk_event_tuning**](docs/RiskAnalyticsControllerApi.md#risk_analytics_controller_risk_event_tuning) | **PUT** /api/v3/risk_events/tuning | Summary: Risk event tuning Description: Perform tuning risk event actions.
*RiskAnalyticsControllerApi* | [**risk_analytics_controller_set_risk_event_status**](docs/RiskAnalyticsControllerApi.md#risk_analytics_controller_set_risk_event_status) | **PUT** /api/v3/risk_events/status | Summary: Set risk event status Description: Update the risk status and justification.
*RiskAnalyticsControllerApi* | [**risk_analytics_controller_set_user_ui_settings**](docs/RiskAnalyticsControllerApi.md#risk_analytics_controller_set_user_ui_settings) | **PUT** /api/v3/risk_events/user_ui_settings | Summary: Set user UI settings Description: Set the user settings by user id in the mongo collection. WARNING: this API should not be used manually or by a system external to GDSC. Using this API to change a user settings may prevent the user from using the Risk Event function within GDSC.
*RiskAnalyticsControllerApi* | [**risk_analytics_controller_update_risk_feedback**](docs/RiskAnalyticsControllerApi.md#risk_analytics_controller_update_risk_feedback) | **PUT** /api/v3/risk_events/feedback | Summary: Update risk feedback Description: Provide feedback for one or more risk events
*RiskAnalyticsDataProcessorApi* | [**risk_analytics_data_processor_get_risk_context**](docs/RiskAnalyticsDataProcessorApi.md#risk_analytics_data_processor_get_risk_context) | **GET** /api/v3/risk_events/{risk_id}/context | Summary: Get Risk Event Context Description: Retrieve the context of the given risk ID. This context will be used for LLM interactions.
*RiskAnalyticsDataProcessorApi* | [**risk_analytics_data_processor_get_risk_predefined_questions**](docs/RiskAnalyticsDataProcessorApi.md#risk_analytics_data_processor_get_risk_predefined_questions) | **GET** /api/v3/risk_events/{risk_id}/questions | Summary: Get Risk Event Predefined Questions Description: Retrieve the Predefined Questions of the given risk ID. This Predefined Questions will be used quick actions recommendations.
*RiskAnalyticsEngineApi* | [**risk_analytics_engine_get_lead_generator_config**](docs/RiskAnalyticsEngineApi.md#risk_analytics_engine_get_lead_generator_config) | **GET** /api/v3/risk/lead_generator | Summary: Get lead generator config Description: Retrieve the configuration of a lead generator.
*RiskAnalyticsEngineApi* | [**risk_analytics_engine_update_lead_generator_config**](docs/RiskAnalyticsEngineApi.md#risk_analytics_engine_update_lead_generator_config) | **PUT** /api/v3/risk/lead_generator | Summary: Update lead generator config Description: Update the configuration of a leads generator.
*RiskAnalyticsMlClassificationApi* | [**risk_analytics_ml_classification_reset_model_to_defaults**](docs/RiskAnalyticsMlClassificationApi.md#risk_analytics_ml_classification_reset_model_to_defaults) | **POST** /api/v3/classification/ml/models/reset | Summary: Reset the model to its default weights. Description: Load the initial model instead of the existing model - this action is irreversible.
*SchedulerServiceApi* | [**scheduler_service_create_scheduled_job**](docs/SchedulerServiceApi.md#scheduler_service_create_scheduled_job) | **POST** /api/v3/schedules | Summary: Create scheduled job Description: Create a new scheduled job with tasks.
*SchedulerServiceApi* | [**scheduler_service_delete_scheduled_job**](docs/SchedulerServiceApi.md#scheduler_service_delete_scheduled_job) | **DELETE** /api/v3/schedules/{schedule_id} | Summary: Delete scheduled job Description: Delete a single scheduled job.
*SchedulerServiceApi* | [**scheduler_service_get_dependencies**](docs/SchedulerServiceApi.md#scheduler_service_get_dependencies) | **GET** /api/v3/schedules/dependencies | Summary: Get dependencies Description: returns IDs of distribution rules, response templates, or processing rules that are in use
*SchedulerServiceApi* | [**scheduler_service_get_distribution_rules**](docs/SchedulerServiceApi.md#scheduler_service_get_distribution_rules) | **GET** /api/v3/schedules/distribution_rules | Summary: Get distribution rules Description: Return a list of distribution rule IDs that are used by the scheduler Distribution rules can&#39;t be edited if it is used by a scheduled job.
*SchedulerServiceApi* | [**scheduler_service_get_scheduled_job_details**](docs/SchedulerServiceApi.md#scheduler_service_get_scheduled_job_details) | **GET** /api/v3/schedules/{schedule_id}/details | Summary: Get scheduled job Description: Return a single ScheduledJob in detail.
*SchedulerServiceApi* | [**scheduler_service_get_scheduled_jobs**](docs/SchedulerServiceApi.md#scheduler_service_get_scheduled_jobs) | **GET** /api/v3/schedules | Summary: Get scheduled jobs Description: Return a list of scheduled jobs and the linked tasks.
*SchedulerServiceApi* | [**scheduler_service_get_schedules_by_report**](docs/SchedulerServiceApi.md#scheduler_service_get_schedules_by_report) | **POST** /api/v3/schedules/searchByReport/{report_id} | Summary: Get schedules by report Description: Return an array of scheduled job IDs that run the report_id.  An empty array is returned if the report_id is not scheduled.
*SchedulerServiceApi* | [**scheduler_service_get_tags**](docs/SchedulerServiceApi.md#scheduler_service_get_tags) | **GET** /api/v3/schedules/tags | Summary: Get tags Description: Return an array of all the unique tags from scheduled jobs.
*SchedulerServiceApi* | [**scheduler_service_search_scheduled_jobs**](docs/SchedulerServiceApi.md#scheduler_service_search_scheduled_jobs) | **POST** /api/v3/schedules/search | Summary: Search scheduled jobs Description: Return a filtered list of scheduled jobs and the linked tasks.
*SchedulerServiceApi* | [**scheduler_service_search_scheduled_task_runs**](docs/SchedulerServiceApi.md#scheduler_service_search_scheduled_task_runs) | **POST** /api/v3/schedules/runs/search | Summary: Search scheduled task runs Description: Return a list of scheduled task run, start date, end date, status
*SchedulerServiceApi* | [**scheduler_service_update_scheduled_job**](docs/SchedulerServiceApi.md#scheduler_service_update_scheduled_job) | **PATCH** /api/v3/schedules/{schedule_id} | Summary: Update scheduled job Description: Update a single schedule job.
*SnifAssistServiceApi* | [**snif_assist_service_get_snif_config**](docs/SnifAssistServiceApi.md#snif_assist_service_get_snif_config) | **GET** /api/v3/snif/config | Summary: Get sniffer configuration parameters Description: Get edge sniffer configuration parameters from GI-mothership.
*SnifAssistServiceApi* | [**snif_assist_service_get_snif_policy**](docs/SnifAssistServiceApi.md#snif_assist_service_get_snif_policy) | **GET** /api/v3/snif/policy | Summary: Get sniffer policy Description: Get edge sniffer policy from GI-mothership.
*SnifAssistServiceApi* | [**snif_assist_service_post_snif_feedback**](docs/SnifAssistServiceApi.md#snif_assist_service_post_snif_feedback) | **POST** /api/v3/snif/feedback | Summary: Post sniffer feedback Description: Post policy installation feedback to policy-builder service.
*SnifAssistServiceApi* | [**snif_assist_service_test_regex**](docs/SnifAssistServiceApi.md#snif_assist_service_test_regex) | **POST** /api/v3/snif/test_regex | Summary: Test regex Description: Match a text string with a regular expression using the same sniffer  code used in production to match a regex.
*StreamsServiceApi* | [**streams_service_check_aws_credentials**](docs/StreamsServiceApi.md#streams_service_check_aws_credentials) | **POST** /api/v3/streams/credentials | Summary: Check AWS credentials Description: Service to verify AWS credentials.
*StreamsServiceApi* | [**streams_service_check_azure_event_hub**](docs/StreamsServiceApi.md#streams_service_check_azure_event_hub) | **POST** /api/v3/streams/azure_eventhub | Summary: Check Azure event hub Description: Service to check Azure event hub.
*StreamsServiceApi* | [**streams_service_check_azure_storage_string**](docs/StreamsServiceApi.md#streams_service_check_azure_storage_string) | **POST** /api/v3/streams/azure_storage | Summary: Check Azure storage string Description: Service to verify Azure storage connection.
*StreamsServiceApi* | [**streams_service_get_aws_regions**](docs/StreamsServiceApi.md#streams_service_get_aws_regions) | **GET** /api/v3/streams/regions | Summary: Get AWS regions Description: Service to get AWS regions.
*StreamsServiceApi* | [**streams_service_list_aws_streams**](docs/StreamsServiceApi.md#streams_service_list_aws_streams) | **POST** /api/v3/streams | Summary: List AWS streams Description: Service to list AWS Kinesis streams.
*TemplatesServiceApi* | [**templates_service_create_integration**](docs/TemplatesServiceApi.md#templates_service_create_integration) | **POST** /api/v3/templates/integration | Summary: Create integration Description: Create a set of new templates for a new integration.
*TemplatesServiceApi* | [**templates_service_create_template**](docs/TemplatesServiceApi.md#templates_service_create_template) | **POST** /api/v3/templates | Summary: Create template Description: Create a new template.
*TemplatesServiceApi* | [**templates_service_delete_integration**](docs/TemplatesServiceApi.md#templates_service_delete_integration) | **DELETE** /api/v3/templates/integrations/{integration_id} | Summary: Delete integration Description: Delete all templates associated with an integration.
*TemplatesServiceApi* | [**templates_service_delete_template**](docs/TemplatesServiceApi.md#templates_service_delete_template) | **DELETE** /api/v3/templates/{template_id} | Summary: Delete template Description: Delete a specific template.
*TemplatesServiceApi* | [**templates_service_get_origin_default_content**](docs/TemplatesServiceApi.md#templates_service_get_origin_default_content) | **GET** /api/v3/templates/origins/{origin}/content | Summary: Get origin default content Description: Return the default content for a template with a specified origin and MIME type.
*TemplatesServiceApi* | [**templates_service_get_origin_fields**](docs/TemplatesServiceApi.md#templates_service_get_origin_fields) | **GET** /api/v3/templates/origins/{origin}/fields | Summary: Get origin fields Description: Return the fields available with a specific origin.
*TemplatesServiceApi* | [**templates_service_get_template**](docs/TemplatesServiceApi.md#templates_service_get_template) | **GET** /api/v3/templates/{template_id} | Summary: Get template Description: Return a specific template by id.
*TemplatesServiceApi* | [**templates_service_get_templates**](docs/TemplatesServiceApi.md#templates_service_get_templates) | **GET** /api/v3/templates | Summary: Get templates Description: Return all templates based on supplied filters.
*TemplatesServiceApi* | [**templates_service_get_templates_for_edge**](docs/TemplatesServiceApi.md#templates_service_get_templates_for_edge) | **GET** /api/v3/templates/edge | Summary: Get templates for edge Description: Return all templates based on supplied filters.
*TemplatesServiceApi* | [**templates_service_test_template**](docs/TemplatesServiceApi.md#templates_service_test_template) | **POST** /api/v3/templates/test | Summary: Test template Description: Analyze a specified template to ensure will function correctly when utilized.
*TemplatesServiceApi* | [**templates_service_transform_template**](docs/TemplatesServiceApi.md#templates_service_transform_template) | **POST** /api/v3/templates/transform | Summary: Transform template Description: Process the specified template and returns the Title and Content based on supplied data.
*TemplatesServiceApi* | [**templates_service_transform_template_json**](docs/TemplatesServiceApi.md#templates_service_transform_template_json) | **POST** /api/v3/templates/transformjson | Summary: Transform template JSON Description: Process the specified template and returns the Title and Content based on supplied json data string.
*TemplatesServiceApi* | [**templates_service_update_template**](docs/TemplatesServiceApi.md#templates_service_update_template) | **PATCH** /api/v3/templates/{template_id} | Summary: Update template Description: Update a single template.
*TenantuserApi* | [**tenantuser_create_api_key**](docs/TenantuserApi.md#tenantuser_create_api_key) | **POST** /api/v3/apikeys | Summary: Create API key Description: Create API Key.
*TenantuserApi* | [**tenantuser_delete_api_key**](docs/TenantuserApi.md#tenantuser_delete_api_key) | **DELETE** /api/v3/apikeys/{id} | Summary: Delete API key Description: Delete APIKey Document based on the document id.
*TenantuserApi* | [**tenantuser_delete_role**](docs/TenantuserApi.md#tenantuser_delete_role) | **DELETE** /api/v3/roles/{role_id} | Summary: Delete role Description: Delete a role.
*TenantuserApi* | [**tenantuser_get_api_keys**](docs/TenantuserApi.md#tenantuser_get_api_keys) | **GET** /api/v3/apikeys | Summary: Get API keys Description: Get all APIKeys base on a tenant ID.
*TenantuserApi* | [**tenantuser_get_current_user**](docs/TenantuserApi.md#tenantuser_get_current_user) | **GET** /api/v3/currentuser | Summary: Get current user Description: Return the currently authenticated user.
*TenantuserApi* | [**tenantuser_get_privilege**](docs/TenantuserApi.md#tenantuser_get_privilege) | **GET** /api/v3/privileges/{privilege.privilege_id} | Summary: Get privilege Description: Return privilege.
*TenantuserApi* | [**tenantuser_get_privileges**](docs/TenantuserApi.md#tenantuser_get_privileges) | **GET** /api/v3/privileges | Summary: Get privileges Description: Return all available privileges (pages, restapi, reports, etc) if no roles are specified If roles are specified, returns cumulative privileges for the list of roles.
*TenantuserApi* | [**tenantuser_get_role**](docs/TenantuserApi.md#tenantuser_get_role) | **GET** /api/v3/roles/{role_id} | Summary: Get role Description: Return single role.
*TenantuserApi* | [**tenantuser_get_roles**](docs/TenantuserApi.md#tenantuser_get_roles) | **GET** /api/v3/roles | Summary: Get roles Description: Return all roles without privileges.
*TenantuserApi* | [**tenantuser_get_user**](docs/TenantuserApi.md#tenantuser_get_user) | **GET** /api/v3/users/user/{user_id} | Summary: Get user Description: Return full user for specified user_id.
*TenantuserApi* | [**tenantuser_get_user_names**](docs/TenantuserApi.md#tenantuser_get_user_names) | **POST** /api/v3/users/names | Summary: Get user names Description: Get user names.
*TenantuserApi* | [**tenantuser_get_user_tenant**](docs/TenantuserApi.md#tenantuser_get_user_tenant) | **GET** /api/v3/users/tenant/{user_id} | Summary: Get user tenant Description: Return the user plus tenant information.
*TenantuserApi* | [**tenantuser_post_privileges_bulk**](docs/TenantuserApi.md#tenantuser_post_privileges_bulk) | **POST** /api/v3/privileges | Summary: Post privileges bulk Description: Perform bulk user add preivilege.
*TenantuserApi* | [**tenantuser_post_role**](docs/TenantuserApi.md#tenantuser_post_role) | **POST** /api/v3/roles | Summary: Post role Description: Create a new role.
*TenantuserApi* | [**tenantuser_update_privilege**](docs/TenantuserApi.md#tenantuser_update_privilege) | **PATCH** /api/v3/privileges/{privilege_id} | Summary: Update privilege Description: Update privilege.
*TenantuserApi* | [**tenantuser_update_privileges_role_bulk**](docs/TenantuserApi.md#tenantuser_update_privileges_role_bulk) | **PATCH** /api/v3/privileges | Summary: Update privileges role bulk Description: Perform bulk user update role.
*TenantuserApi* | [**tenantuser_update_role**](docs/TenantuserApi.md#tenantuser_update_role) | **PATCH** /api/v3/roles/{role_id} | Summary: Update role Description: Update single role.
*TenantuserApi* | [**tenantuser_update_user_role_bulk**](docs/TenantuserApi.md#tenantuser_update_user_role_bulk) | **PATCH** /api/v3/users/role | Summary: Update user role bulk Description: Perform bulk user add or remove role.
*ThirdPartyVendorsApi* | [**get_linked_vendor**](docs/ThirdPartyVendorsApi.md#get_linked_vendor) | **GET** /api/v1/dspm/linkedVendors/{vendorId}/cloudAccounts | Get additional details of a specific third party vendor
*ThirdPartyVendorsApi* | [**get_single_linked_vendor**](docs/ThirdPartyVendorsApi.md#get_single_linked_vendor) | **GET** /api/v1/dspm/linkedVendors/{vendorId} | Get the third party vendors list
*ThirdPartyVendorsApi* | [**list_linked_vendor_data_stores**](docs/ThirdPartyVendorsApi.md#list_linked_vendor_data_stores) | **GET** /api/v1/dspm/linkedVendors/{vendorId}/dataStores | Get the data stores associated with a third party vendor
*ThirdPartyVendorsApi* | [**list_linked_vendors**](docs/ThirdPartyVendorsApi.md#list_linked_vendors) | **GET** /api/v1/dspm/linkedVendors | Get the summary of a third party vendor
*ThirdPartyVendorsApi* | [**list_trusted_assets**](docs/ThirdPartyVendorsApi.md#list_trusted_assets) | **GET** /api/v1/dspm/linkedVendors/trustedAssets | Get a list of all the actual trusted assets
*UniversalConnectorManagerApi* | [**universal_connector_manager_get_certificate**](docs/UniversalConnectorManagerApi.md#universal_connector_manager_get_certificate) | **GET** /api/v3/certificates | Summary: Get certificate Description: Get the certificate that allows secure communication between data sources and universal connections in GDSC.
*UniversalConnectorManagerApi* | [**universal_connector_manager_get_connectors**](docs/UniversalConnectorManagerApi.md#universal_connector_manager_get_connectors) | **GET** /api/v3/connectors | Summary: Get connectors Description: Get all the connectors Universal Connector can support. Includes a list of event pipelines (input--filter pairs), along with the supported data source types and platforms.
*UniversalConnectorManagerApi* | [**universal_connector_manager_get_uc_setup**](docs/UniversalConnectorManagerApi.md#universal_connector_manager_get_uc_setup) | **GET** /api/v3/universal_connections/configurations/{plugin_id} | Gets information to setup the new Universal connection.
*UniversalConnectorManagerApi* | [**universal_connector_manager_list_connections_summary**](docs/UniversalConnectorManagerApi.md#universal_connector_manager_list_connections_summary) | **GET** /api/v3/universal_connections | Summary: List connections summary Description: List a summary of Universal Connector configured connections (AKA datasources).
*UniversalConnectorManagerApi* | [**universal_connector_manager_plugins_list**](docs/UniversalConnectorManagerApi.md#universal_connector_manager_plugins_list) | **GET** /api/v3/plugins | Summary: Plugins list Description: List of all universal connector plugins.
*UniversalConnectorManagerApi* | [**universal_connector_manager_upload_plugin**](docs/UniversalConnectorManagerApi.md#universal_connector_manager_upload_plugin) | **POST** /api/v3/plugins | Summary: Upload plugin Description: Upload a plugin-package for Universal Connector.
*WorkflowApi* | [**workflow_create_case**](docs/WorkflowApi.md#workflow_create_case) | **POST** /api/v3/cases | Summary: Create case Description: Create single case.
*WorkflowApi* | [**workflow_create_product_entity**](docs/WorkflowApi.md#workflow_create_product_entity) | **POST** /api/v3/workflow/productentities | Summary: Create product entity Description: Create single product entity.
*WorkflowApi* | [**workflow_create_task**](docs/WorkflowApi.md#workflow_create_task) | **POST** /api/v3/cases/{case_id}/tasks | Summary: Create task Description: Create single task within a parent case.
*WorkflowApi* | [**workflow_create_workflow_event**](docs/WorkflowApi.md#workflow_create_workflow_event) | **POST** /api/v3/workflow/event | Summary: Post event for processing by workflow rules Description: Find matching workflow rule and run it
*WorkflowApi* | [**workflow_delete_product_entity**](docs/WorkflowApi.md#workflow_delete_product_entity) | **DELETE** /api/v3/workflow/productentities/{entity_id} | Summary: Delete a product entity Description: Delete a single product entity.
*WorkflowApi* | [**workflow_get_cases**](docs/WorkflowApi.md#workflow_get_cases) | **GET** /api/v3/cases | Summary: Get cases Description: Return all cases requested.
*WorkflowApi* | [**workflow_get_cases_count**](docs/WorkflowApi.md#workflow_get_cases_count) | **POST** /api/v3/cases/count | Summary: Get cases count Description: Get case count.
*WorkflowApi* | [**workflow_get_filename**](docs/WorkflowApi.md#workflow_get_filename) | **GET** /api/v3/cases/{case_id}/tasks/{task_id}/filename | Summary: Get filename Description: Return filename associated with the task referenced in the associated context record.
*WorkflowApi* | [**workflow_get_jobs_count**](docs/WorkflowApi.md#workflow_get_jobs_count) | **POST** /api/v3/cases/{case_id}/jobs/count | Summary: Get jobs count Description: Get jobs count.
*WorkflowApi* | [**workflow_get_product_entities**](docs/WorkflowApi.md#workflow_get_product_entities) | **GET** /api/v3/workflow/productentities | Summary: Get products and their associated event entities Description: Return a list of integrated products and their associated event entities
*WorkflowApi* | [**workflow_get_product_entity**](docs/WorkflowApi.md#workflow_get_product_entity) | **GET** /api/v3/workflow/productentities/{entity_id} | Summary: Get event entity field names, field labels, and field data types Description: Return a list of fields similar to report headers
*WorkflowApi* | [**workflow_get_report_result**](docs/WorkflowApi.md#workflow_get_report_result) | **GET** /api/v3/cases/{case_id}/tasks/{task_id}/result | Summary: Get report result Description: Return a page of results.
*WorkflowApi* | [**workflow_get_tasks**](docs/WorkflowApi.md#workflow_get_tasks) | **GET** /api/v3/cases/{case_id}/tasks | Summary: Get tasks Description: Return all tasks requested.
*WorkflowApi* | [**workflow_get_tasks_count**](docs/WorkflowApi.md#workflow_get_tasks_count) | **POST** /api/v3/cases/{case_id}/tasks/count | Summary: Get cases count Description: Get case count.
*WorkflowApi* | [**workflow_search_cases**](docs/WorkflowApi.md#workflow_search_cases) | **POST** /api/v3/cases/search | Summary: Search cases Description: Return a subset of cases.
*WorkflowApi* | [**workflow_search_reports**](docs/WorkflowApi.md#workflow_search_reports) | **POST** /api/v3/cases/reports | Summary: Get a list of report IDs Description: Returns a list of report IDs referenced in all cases and tasks
*WorkflowApi* | [**workflow_search_tasks**](docs/WorkflowApi.md#workflow_search_tasks) | **POST** /api/v3/cases/{case_id}/tasks/search | Summary: Search cases Description: Return a subset of cases.
*WorkflowApi* | [**workflow_update_cases**](docs/WorkflowApi.md#workflow_update_cases) | **PUT** /api/v3/cases | Summary: Update cases Description: Update multiple cases in one request.
*WorkflowApi* | [**workflow_update_product_entity**](docs/WorkflowApi.md#workflow_update_product_entity) | **PUT** /api/v3/workflow/productentities/{entity_id} | Summary: Update a product entity Description: Update a single product entity.
*WorkflowApi* | [**workflow_update_tasks**](docs/WorkflowApi.md#workflow_update_tasks) | **PUT** /api/v3/cases/{case_id}/tasks | Summary: Update tasks Description: Update multiple tasks for the same parent in one request.
*EdgeSchedulerServiceApi* | [**edge_scheduler_service_get_edge_query_status**](docs/EdgeSchedulerServiceApi.md#edge_scheduler_service_get_edge_query_status) | **GET** /api/v3/edges/{edge_id}/query/status | Summary: Get edge query status Description: Get the status of a queued edge query
*EdgeSchedulerServiceApi* | [**edge_scheduler_service_monitoring_pending_request_for_edge_query**](docs/EdgeSchedulerServiceApi.md#edge_scheduler_service_monitoring_pending_request_for_edge_query) | **GET** /api/v3/edges/query | Summary: Monitor for a pending edge query request Description: monitor edge query pending request
*EdgeSchedulerServiceApi* | [**edge_scheduler_service_schedule_edge_query**](docs/EdgeSchedulerServiceApi.md#edge_scheduler_service_schedule_edge_query) | **POST** /api/v3/edges/{edge_id}/query/schedule | Summary: Schedule an edge query  Description: Schedule an edge query via data warehouse queue


## Documentation For Models

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
 - [Connectionsv3EdgeDeploymentServer](docs/Connectionsv3EdgeDeploymentServer.md)
 - [Connectionsv3GeneratePackageRequest](docs/Connectionsv3GeneratePackageRequest.md)
 - [Connectionsv3GeneratePackageResponse](docs/Connectionsv3GeneratePackageResponse.md)
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
 - [Connectionsv3ValidateAwsConnectionRequest](docs/Connectionsv3ValidateAwsConnectionRequest.md)
 - [Connectionsv3ValidateConnectionResponse](docs/Connectionsv3ValidateConnectionResponse.md)
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
 - [Ecosystemv3TestIntegrationRequest](docs/Ecosystemv3TestIntegrationRequest.md)
 - [Ecosystemv3TestIntegrationResponse](docs/Ecosystemv3TestIntegrationResponse.md)
 - [Ecosystemv3ValidateCSVContentResponse](docs/Ecosystemv3ValidateCSVContentResponse.md)
 - [Edgeschedulerv3GetEdgeQueryStatusResponse](docs/Edgeschedulerv3GetEdgeQueryStatusResponse.md)
 - [Edgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse](docs/Edgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse.md)
 - [Edgeschedulerv3ScheduleEdgeQueryRequest](docs/Edgeschedulerv3ScheduleEdgeQueryRequest.md)
 - [Edgeschedulerv3ScheduleEdgeQueryResponse](docs/Edgeschedulerv3ScheduleEdgeQueryResponse.md)
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
 - [Notificationsv3PipelineQueryOperator](docs/Notificationsv3PipelineQueryOperator.md)
 - [Notificationsv3PostNotificationRecordRequest](docs/Notificationsv3PostNotificationRecordRequest.md)
 - [Notificationsv3PostNotificationRecordResponse](docs/Notificationsv3PostNotificationRecordResponse.md)
 - [Notificationsv3PutNotificationRecordResponse](docs/Notificationsv3PutNotificationRecordResponse.md)
 - [Notificationsv3SearchNotificationRecordsRequest](docs/Notificationsv3SearchNotificationRecordsRequest.md)
 - [Notificationsv3SearchNotificationRecordsResponse](docs/Notificationsv3SearchNotificationRecordsResponse.md)
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
 - [Policybuilderv3ActivationStatus](docs/Policybuilderv3ActivationStatus.md)
 - [Policybuilderv3ClonePolicyRequest](docs/Policybuilderv3ClonePolicyRequest.md)
 - [Policybuilderv3ControlFlow](docs/Policybuilderv3ControlFlow.md)
 - [Policybuilderv3CreateUpdatePolicyRequest](docs/Policybuilderv3CreateUpdatePolicyRequest.md)
 - [Policybuilderv3CreateUpdatePolicyResponse](docs/Policybuilderv3CreateUpdatePolicyResponse.md)
 - [Policybuilderv3DeleteGdpPolicySyncResponse](docs/Policybuilderv3DeleteGdpPolicySyncResponse.md)
 - [Policybuilderv3EdgeActivationObject](docs/Policybuilderv3EdgeActivationObject.md)
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
 - [Qsdataloaderv3QSfileValidatorExternalParamRequest](docs/Qsdataloaderv3QSfileValidatorExternalParamRequest.md)
 - [Qsdataloaderv3QSfileValidatorRequest](docs/Qsdataloaderv3QSfileValidatorRequest.md)
 - [Qsdataloaderv3QSfileValidatorResonse](docs/Qsdataloaderv3QSfileValidatorResonse.md)
 - [Qsdataloaderv3QSyntheticDataLoaderResonse](docs/Qsdataloaderv3QSyntheticDataLoaderResonse.md)
 - [Qspmdatamanagerv3AppData](docs/Qspmdatamanagerv3AppData.md)
 - [Qspmdatamanagerv3AppDataResponse](docs/Qspmdatamanagerv3AppDataResponse.md)
 - [Qspmdatamanagerv3MasterDataModel](docs/Qspmdatamanagerv3MasterDataModel.md)
 - [Qspmdatamanagerv3MasterDataResponse](docs/Qspmdatamanagerv3MasterDataResponse.md)
 - [Qspmdatamanagerv3NetlocData](docs/Qspmdatamanagerv3NetlocData.md)
 - [Qspmdatamanagerv3NetlocDataResponse](docs/Qspmdatamanagerv3NetlocDataResponse.md)
 - [Qspmdatamanagerv3PluginDataModel](docs/Qspmdatamanagerv3PluginDataModel.md)
 - [Qspmdatamanagerv3PluginDataResponse](docs/Qspmdatamanagerv3PluginDataResponse.md)
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
 - [Qspmpolicymanagerv3APIResonse](docs/Qspmpolicymanagerv3APIResonse.md)
 - [Qspmpolicymanagerv3CreateTicketRequest](docs/Qspmpolicymanagerv3CreateTicketRequest.md)
 - [Qspmpolicymanagerv3CreateTicketResponse](docs/Qspmpolicymanagerv3CreateTicketResponse.md)
 - [Qspmpolicymanagerv3FetchObjectStoreFileResponse](docs/Qspmpolicymanagerv3FetchObjectStoreFileResponse.md)
 - [Qspmpolicymanagerv3FileName](docs/Qspmpolicymanagerv3FileName.md)
 - [Qspmpolicymanagerv3NotificationSeverity](docs/Qspmpolicymanagerv3NotificationSeverity.md)
 - [Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest](docs/Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest.md)
 - [Qspmpolicymanagerv3ProcessPolicyDimentionRecordsResonse](docs/Qspmpolicymanagerv3ProcessPolicyDimentionRecordsResonse.md)
 - [Qspmpolicymanagerv3StandardEmptyResponse](docs/Qspmpolicymanagerv3StandardEmptyResponse.md)
 - [Qspmpolicymanagerv3UpdateConfigsRequest](docs/Qspmpolicymanagerv3UpdateConfigsRequest.md)
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
 - [Resourcecontrollerk8v3App](docs/Resourcecontrollerk8v3App.md)
 - [Resourcecontrollerk8v3AppDeployment](docs/Resourcecontrollerk8v3AppDeployment.md)
 - [Resourcecontrollerk8v3AppFile](docs/Resourcecontrollerk8v3AppFile.md)
 - [Resourcecontrollerk8v3AppHpa](docs/Resourcecontrollerk8v3AppHpa.md)
 - [Resourcecontrollerk8v3AppSecret](docs/Resourcecontrollerk8v3AppSecret.md)
 - [Resourcecontrollerk8v3Container](docs/Resourcecontrollerk8v3Container.md)
 - [Resourcecontrollerk8v3ContainerResources](docs/Resourcecontrollerk8v3ContainerResources.md)
 - [Resourcecontrollerk8v3ContainerResourcesQuantity](docs/Resourcecontrollerk8v3ContainerResourcesQuantity.md)
 - [Resourcecontrollerk8v3Controller](docs/Resourcecontrollerk8v3Controller.md)
 - [Resourcecontrollerk8v3ControllerApp](docs/Resourcecontrollerk8v3ControllerApp.md)
 - [Resourcecontrollerk8v3ControllerAppFile](docs/Resourcecontrollerk8v3ControllerAppFile.md)
 - [Resourcecontrollerk8v3ControllerAppSecret](docs/Resourcecontrollerk8v3ControllerAppSecret.md)
 - [Resourcecontrollerk8v3ControllerCommand](docs/Resourcecontrollerk8v3ControllerCommand.md)
 - [Resourcecontrollerk8v3ControllerHeartbeat](docs/Resourcecontrollerk8v3ControllerHeartbeat.md)
 - [Resourcecontrollerk8v3ControllerResources](docs/Resourcecontrollerk8v3ControllerResources.md)
 - [Resourcecontrollerk8v3ControllerStatus](docs/Resourcecontrollerk8v3ControllerStatus.md)
 - [Resourcecontrollerk8v3CreateControllerRequest](docs/Resourcecontrollerk8v3CreateControllerRequest.md)
 - [Resourcecontrollerk8v3CreateHeartBeatExResponse](docs/Resourcecontrollerk8v3CreateHeartBeatExResponse.md)
 - [Resourcecontrollerk8v3CreateHeartBeatRequest](docs/Resourcecontrollerk8v3CreateHeartBeatRequest.md)
 - [Resourcecontrollerk8v3CreateHeartBeatResponse](docs/Resourcecontrollerk8v3CreateHeartBeatResponse.md)
 - [Resourcecontrollerk8v3CreateKeypairRequest](docs/Resourcecontrollerk8v3CreateKeypairRequest.md)
 - [Resourcecontrollerk8v3CreateKeypairResponse](docs/Resourcecontrollerk8v3CreateKeypairResponse.md)
 - [Resourcecontrollerk8v3Cron](docs/Resourcecontrollerk8v3Cron.md)
 - [Resourcecontrollerk8v3DeleteControllerRequest](docs/Resourcecontrollerk8v3DeleteControllerRequest.md)
 - [Resourcecontrollerk8v3DeleteControllerResponse](docs/Resourcecontrollerk8v3DeleteControllerResponse.md)
 - [Resourcecontrollerk8v3DeleteEdgeTenantRequestApphost](docs/Resourcecontrollerk8v3DeleteEdgeTenantRequestApphost.md)
 - [Resourcecontrollerk8v3DeleteEdgeTenantResponse](docs/Resourcecontrollerk8v3DeleteEdgeTenantResponse.md)
 - [Resourcecontrollerk8v3DeleteJobRequest](docs/Resourcecontrollerk8v3DeleteJobRequest.md)
 - [Resourcecontrollerk8v3DeleteJobResponse](docs/Resourcecontrollerk8v3DeleteJobResponse.md)
 - [Resourcecontrollerk8v3DownloadControllerLogsRequest](docs/Resourcecontrollerk8v3DownloadControllerLogsRequest.md)
 - [Resourcecontrollerk8v3DownloadControllerLogsResponse](docs/Resourcecontrollerk8v3DownloadControllerLogsResponse.md)
 - [Resourcecontrollerk8v3EdgeResourceResponse](docs/Resourcecontrollerk8v3EdgeResourceResponse.md)
 - [Resourcecontrollerk8v3EdgeTenantRequest](docs/Resourcecontrollerk8v3EdgeTenantRequest.md)
 - [Resourcecontrollerk8v3File](docs/Resourcecontrollerk8v3File.md)
 - [Resourcecontrollerk8v3GUCStatefulsetState](docs/Resourcecontrollerk8v3GUCStatefulsetState.md)
 - [Resourcecontrollerk8v3GetControllerAppsResponse](docs/Resourcecontrollerk8v3GetControllerAppsResponse.md)
 - [Resourcecontrollerk8v3GetControllerCommandsResponse](docs/Resourcecontrollerk8v3GetControllerCommandsResponse.md)
 - [Resourcecontrollerk8v3GetControllerJobsResponse](docs/Resourcecontrollerk8v3GetControllerJobsResponse.md)
 - [Resourcecontrollerk8v3GetControllersResponse](docs/Resourcecontrollerk8v3GetControllersResponse.md)
 - [Resourcecontrollerk8v3GetControllersWithStatusResponse](docs/Resourcecontrollerk8v3GetControllersWithStatusResponse.md)
 - [Resourcecontrollerk8v3GetJobExecutionsResponse](docs/Resourcecontrollerk8v3GetJobExecutionsResponse.md)
 - [Resourcecontrollerk8v3GetTenantAppsResponse](docs/Resourcecontrollerk8v3GetTenantAppsResponse.md)
 - [Resourcecontrollerk8v3GetTenantJobsResponse](docs/Resourcecontrollerk8v3GetTenantJobsResponse.md)
 - [Resourcecontrollerk8v3InitContainer](docs/Resourcecontrollerk8v3InitContainer.md)
 - [Resourcecontrollerk8v3Job](docs/Resourcecontrollerk8v3Job.md)
 - [Resourcecontrollerk8v3JobExecution](docs/Resourcecontrollerk8v3JobExecution.md)
 - [Resourcecontrollerk8v3JobStatusDTO](docs/Resourcecontrollerk8v3JobStatusDTO.md)
 - [Resourcecontrollerk8v3KeyPair](docs/Resourcecontrollerk8v3KeyPair.md)
 - [Resourcecontrollerk8v3QueryControllerLogsRequest](docs/Resourcecontrollerk8v3QueryControllerLogsRequest.md)
 - [Resourcecontrollerk8v3QueryControllerLogsResponse](docs/Resourcecontrollerk8v3QueryControllerLogsResponse.md)
 - [Resourcecontrollerk8v3QueryLogs](docs/Resourcecontrollerk8v3QueryLogs.md)
 - [Resourcecontrollerk8v3Rule](docs/Resourcecontrollerk8v3Rule.md)
 - [Resourcecontrollerk8v3Secret](docs/Resourcecontrollerk8v3Secret.md)
 - [Resourcecontrollerk8v3TenantGUCCreateResponse](docs/Resourcecontrollerk8v3TenantGUCCreateResponse.md)
 - [Resourcecontrollerk8v3TenantGUCStatusResponse](docs/Resourcecontrollerk8v3TenantGUCStatusResponse.md)
 - [Resourcecontrollerk8v3TenantLifecycleResponse](docs/Resourcecontrollerk8v3TenantLifecycleResponse.md)
 - [Resourcecontrollerk8v3TenantResourceResponse](docs/Resourcecontrollerk8v3TenantResourceResponse.md)
 - [Resourcecontrollerk8v3TextContent](docs/Resourcecontrollerk8v3TextContent.md)
 - [Resourcecontrollerk8v3UpdateJobExecutionRequest](docs/Resourcecontrollerk8v3UpdateJobExecutionRequest.md)
 - [Resourcecontrollerk8v3UpdateJobStatusRequest](docs/Resourcecontrollerk8v3UpdateJobStatusRequest.md)
 - [Resourcecontrollerk8v3Version](docs/Resourcecontrollerk8v3Version.md)
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
 - [Riskanalyticscontrollerv3FindingReferenceLink](docs/Riskanalyticscontrollerv3FindingReferenceLink.md)
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
 - [Riskanalyticscontrollerv3Statistics](docs/Riskanalyticscontrollerv3Statistics.md)
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
 - [Snifassistv3Feedback](docs/Snifassistv3Feedback.md)
 - [Snifassistv3FeedbackStatus](docs/Snifassistv3FeedbackStatus.md)
 - [Snifassistv3GetSnifConfigResponse](docs/Snifassistv3GetSnifConfigResponse.md)
 - [Snifassistv3PostSnifFeedbackRequest](docs/Snifassistv3PostSnifFeedbackRequest.md)
 - [Snifassistv3SnifAssistResponse](docs/Snifassistv3SnifAssistResponse.md)
 - [Snifassistv3SnifAssistType](docs/Snifassistv3SnifAssistType.md)
 - [Snifassistv3StapConfig](docs/Snifassistv3StapConfig.md)
 - [Snifassistv3StapHeartBeat](docs/Snifassistv3StapHeartBeat.md)
 - [Snifassistv3StapOperation](docs/Snifassistv3StapOperation.md)
 - [Snifassistv3StatusResponseBase](docs/Snifassistv3StatusResponseBase.md)
 - [Snifassistv3TestRegexRequest](docs/Snifassistv3TestRegexRequest.md)
 - [SortOrder](docs/SortOrder.md)
 - [StreamResultOfComplianceacceleratorv3CreateWorkspaceResponse](docs/StreamResultOfComplianceacceleratorv3CreateWorkspaceResponse.md)
 - [StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse](docs/StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse.md)
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
 - [Templatesv3GetTemplatesForEdgeResponse](docs/Templatesv3GetTemplatesForEdgeResponse.md)
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
 - [Tenantuserv3GetAPIPrivilegesResponse](docs/Tenantuserv3GetAPIPrivilegesResponse.md)
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
 - [Workflowv3CreateProductEntityResponse](docs/Workflowv3CreateProductEntityResponse.md)
 - [Workflowv3CreateTaskRequest](docs/Workflowv3CreateTaskRequest.md)
 - [Workflowv3CreateTaskResponse](docs/Workflowv3CreateTaskResponse.md)
 - [Workflowv3DeleteCasesResponse](docs/Workflowv3DeleteCasesResponse.md)
 - [Workflowv3DeleteProductEntityResponse](docs/Workflowv3DeleteProductEntityResponse.md)
 - [Workflowv3DeleteTasksResponse](docs/Workflowv3DeleteTasksResponse.md)
 - [Workflowv3Entity](docs/Workflowv3Entity.md)
 - [Workflowv3EntityDefinition](docs/Workflowv3EntityDefinition.md)
 - [Workflowv3EntityHeader](docs/Workflowv3EntityHeader.md)
 - [Workflowv3EntityHeaderType](docs/Workflowv3EntityHeaderType.md)
 - [Workflowv3EntityType](docs/Workflowv3EntityType.md)
 - [Workflowv3EntityValueChoice](docs/Workflowv3EntityValueChoice.md)
 - [Workflowv3Filter](docs/Workflowv3Filter.md)
 - [Workflowv3FilterColumn](docs/Workflowv3FilterColumn.md)
 - [Workflowv3FilterOperator](docs/Workflowv3FilterOperator.md)
 - [Workflowv3GetCasesCountRequest](docs/Workflowv3GetCasesCountRequest.md)
 - [Workflowv3GetCasesCountResponse](docs/Workflowv3GetCasesCountResponse.md)
 - [Workflowv3GetFilenameResponse](docs/Workflowv3GetFilenameResponse.md)
 - [Workflowv3GetJobsCountRequest](docs/Workflowv3GetJobsCountRequest.md)
 - [Workflowv3GetJobsCountResponse](docs/Workflowv3GetJobsCountResponse.md)
 - [Workflowv3GetProductEntitiesResponse](docs/Workflowv3GetProductEntitiesResponse.md)
 - [Workflowv3GetReportResultResponse](docs/Workflowv3GetReportResultResponse.md)
 - [Workflowv3GetTasksCountRequest](docs/Workflowv3GetTasksCountRequest.md)
 - [Workflowv3GetTasksCountResponse](docs/Workflowv3GetTasksCountResponse.md)
 - [Workflowv3JobCount](docs/Workflowv3JobCount.md)
 - [Workflowv3OperatorType](docs/Workflowv3OperatorType.md)
 - [Workflowv3Origin](docs/Workflowv3Origin.md)
 - [Workflowv3Priority](docs/Workflowv3Priority.md)
 - [Workflowv3ProductEntity](docs/Workflowv3ProductEntity.md)
 - [Workflowv3ProductWorkflow](docs/Workflowv3ProductWorkflow.md)
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
 - [Workflowv3UpdateProductEntityRequest](docs/Workflowv3UpdateProductEntityRequest.md)
 - [Workflowv3UpdateProductEntityResponse](docs/Workflowv3UpdateProductEntityResponse.md)
 - [Workflowv3UpdateTasksRequest](docs/Workflowv3UpdateTasksRequest.md)
 - [Workflowv3UpdateTasksResponse](docs/Workflowv3UpdateTasksResponse.md)
 - [Workflowv3WorkflowEvent](docs/Workflowv3WorkflowEvent.md)
 - [Workflowv3WorkflowEventResponse](docs/Workflowv3WorkflowEventResponse.md)


<a id="documentation-for-authorization"></a>
## Documentation For Authorization


Authentication schemes defined for the API:
<a id="ApiKeyAuth"></a>
### ApiKeyAuth

- **Type**: API key
- **API key parameter name**: authorization
- **Location**: HTTP header

<a id="BasicAuth"></a>
### BasicAuth

- **Type**: HTTP basic authentication


## Author




</details>
</details>
