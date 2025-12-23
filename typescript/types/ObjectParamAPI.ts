import { ResponseContext, RequestContext, HttpFile, HttpInfo } from '../http/http';
import { Configuration, ConfigurationOptions } from '../configuration'
import type { Middleware } from '../middleware';

import { AccessType } from '../models/AccessType';
import { AccessTypeCountInner } from '../models/AccessTypeCountInner';
import { AccessibleDataStores } from '../models/AccessibleDataStores';
import { AccessiblePermissionsConfigurations } from '../models/AccessiblePermissionsConfigurations';
import { ActualFlow } from '../models/ActualFlow';
import { ActualFlowPath } from '../models/ActualFlowPath';
import { ActualFlowsSummary } from '../models/ActualFlowsSummary';
import { AddAnalyzedRegion200Response } from '../models/AddAnalyzedRegion200Response';
import { AddAnalyzedRegionRequest } from '../models/AddAnalyzedRegionRequest';
import { AddCloudAccounts200Response } from '../models/AddCloudAccounts200Response';
import { AddCloudAccountsRequest } from '../models/AddCloudAccountsRequest';
import { AddCloudAccountsRequestCloudAccountsInner } from '../models/AddCloudAccountsRequestCloudAccountsInner';
import { AddCommentBody } from '../models/AddCommentBody';
import { AddJiraIntegrationParametersRequest } from '../models/AddJiraIntegrationParametersRequest';
import { AnalyzedRegion } from '../models/AnalyzedRegion';
import { AnalyzedRegionValidationResults } from '../models/AnalyzedRegionValidationResults';
import { Assetsv3AccountVertex } from '../models/Assetsv3AccountVertex';
import { Assetsv3Action } from '../models/Assetsv3Action';
import { Assetsv3ApplicationVertex } from '../models/Assetsv3ApplicationVertex';
import { Assetsv3Asset } from '../models/Assetsv3Asset';
import { Assetsv3AssetChangeLog } from '../models/Assetsv3AssetChangeLog';
import { Assetsv3AssetClassification } from '../models/Assetsv3AssetClassification';
import { Assetsv3AssetControl } from '../models/Assetsv3AssetControl';
import { Assetsv3AssetEndpoint } from '../models/Assetsv3AssetEndpoint';
import { Assetsv3AssetForMergeSplit } from '../models/Assetsv3AssetForMergeSplit';
import { Assetsv3AssetInformation } from '../models/Assetsv3AssetInformation';
import { Assetsv3AssetIngestionRequest } from '../models/Assetsv3AssetIngestionRequest';
import { Assetsv3AssetIngestionResponse } from '../models/Assetsv3AssetIngestionResponse';
import { Assetsv3AssetOpenRiskEvent } from '../models/Assetsv3AssetOpenRiskEvent';
import { Assetsv3AssetOpenRiskEventList } from '../models/Assetsv3AssetOpenRiskEventList';
import { Assetsv3AssetOverviewResponse } from '../models/Assetsv3AssetOverviewResponse';
import { Assetsv3AssetResourcesInfo } from '../models/Assetsv3AssetResourcesInfo';
import { Assetsv3AssetRiskEvents } from '../models/Assetsv3AssetRiskEvents';
import { Assetsv3AssetSubscription } from '../models/Assetsv3AssetSubscription';
import { Assetsv3AssetTags } from '../models/Assetsv3AssetTags';
import { Assetsv3AssetVa } from '../models/Assetsv3AssetVa';
import { Assetsv3AssetView } from '../models/Assetsv3AssetView';
import { Assetsv3AssetsForMergeSplitResponse } from '../models/Assetsv3AssetsForMergeSplitResponse';
import { Assetsv3AssetsWithOpenVulnerabilities } from '../models/Assetsv3AssetsWithOpenVulnerabilities';
import { Assetsv3AssignedTags } from '../models/Assetsv3AssignedTags';
import { Assetsv3Attributes } from '../models/Assetsv3Attributes';
import { Assetsv3BeforeAfter } from '../models/Assetsv3BeforeAfter';
import { Assetsv3CSVRow } from '../models/Assetsv3CSVRow';
import { Assetsv3Category } from '../models/Assetsv3Category';
import { Assetsv3ChildCategory } from '../models/Assetsv3ChildCategory';
import { Assetsv3ClassificationData } from '../models/Assetsv3ClassificationData';
import { Assetsv3ClassificationScanStatus } from '../models/Assetsv3ClassificationScanStatus';
import { Assetsv3ClonePolicyRequest } from '../models/Assetsv3ClonePolicyRequest';
import { Assetsv3CompareCSVResponse } from '../models/Assetsv3CompareCSVResponse';
import { Assetsv3ConnectionEdge } from '../models/Assetsv3ConnectionEdge';
import { Assetsv3CreateUpdatePolicyRequest } from '../models/Assetsv3CreateUpdatePolicyRequest';
import { Assetsv3CreateUpdatePolicyResponse } from '../models/Assetsv3CreateUpdatePolicyResponse';
import { Assetsv3CustomProperty } from '../models/Assetsv3CustomProperty';
import { Assetsv3DatabaseVertex } from '../models/Assetsv3DatabaseVertex';
import { Assetsv3DeploymentVertex } from '../models/Assetsv3DeploymentVertex';
import { Assetsv3EndpointVertex } from '../models/Assetsv3EndpointVertex';
import { Assetsv3ExtendedProp } from '../models/Assetsv3ExtendedProp';
import { Assetsv3FetchAssetChangeLogRequest } from '../models/Assetsv3FetchAssetChangeLogRequest';
import { Assetsv3FetchAssetChangeLogResponse } from '../models/Assetsv3FetchAssetChangeLogResponse';
import { Assetsv3FetchAssetDashboardResponse } from '../models/Assetsv3FetchAssetDashboardResponse';
import { Assetsv3FetchAssetListRequest } from '../models/Assetsv3FetchAssetListRequest';
import { Assetsv3FetchAssetListResponse } from '../models/Assetsv3FetchAssetListResponse';
import { Assetsv3FetchAssetsForMergeSplitResponse } from '../models/Assetsv3FetchAssetsForMergeSplitResponse';
import { Assetsv3FilterCatagory } from '../models/Assetsv3FilterCatagory';
import { Assetsv3FilterSubCatagory } from '../models/Assetsv3FilterSubCatagory';
import { Assetsv3FilterSubCatagoryChild } from '../models/Assetsv3FilterSubCatagoryChild';
import { Assetsv3FilterTemplate } from '../models/Assetsv3FilterTemplate';
import { Assetsv3FindAssetNameResponse } from '../models/Assetsv3FindAssetNameResponse';
import { Assetsv3GetAssetTopologyRequest } from '../models/Assetsv3GetAssetTopologyRequest';
import { Assetsv3GetAssetTopologyResponse } from '../models/Assetsv3GetAssetTopologyResponse';
import { Assetsv3GetFilterTemplateResponse } from '../models/Assetsv3GetFilterTemplateResponse';
import { Assetsv3GetFiltersDataResponse } from '../models/Assetsv3GetFiltersDataResponse';
import { Assetsv3GroupedAsset } from '../models/Assetsv3GroupedAsset';
import { Assetsv3HealthType } from '../models/Assetsv3HealthType';
import { Assetsv3HighestAssetTagCounts } from '../models/Assetsv3HighestAssetTagCounts';
import { Assetsv3HostVertex } from '../models/Assetsv3HostVertex';
import { Assetsv3IPVertex } from '../models/Assetsv3IPVertex';
import { Assetsv3ImportCSVRequest } from '../models/Assetsv3ImportCSVRequest';
import { Assetsv3ImportCSVResponse } from '../models/Assetsv3ImportCSVResponse';
import { Assetsv3IpHost } from '../models/Assetsv3IpHost';
import { Assetsv3Level } from '../models/Assetsv3Level';
import { Assetsv3ListPolicyResponse } from '../models/Assetsv3ListPolicyResponse';
import { Assetsv3ListRuleResponse } from '../models/Assetsv3ListRuleResponse';
import { Assetsv3ListTagDomainsResponse } from '../models/Assetsv3ListTagDomainsResponse';
import { Assetsv3ListTagsResponse } from '../models/Assetsv3ListTagsResponse';
import { Assetsv3MappedEntities } from '../models/Assetsv3MappedEntities';
import { Assetsv3MergeOrSplitAssetsRequest } from '../models/Assetsv3MergeOrSplitAssetsRequest';
import { Assetsv3ModelApplication } from '../models/Assetsv3ModelApplication';
import { Assetsv3ModelData } from '../models/Assetsv3ModelData';
import { Assetsv3ModelVertex } from '../models/Assetsv3ModelVertex';
import { Assetsv3OverviewParameter } from '../models/Assetsv3OverviewParameter';
import { Assetsv3Policy } from '../models/Assetsv3Policy';
import { Assetsv3PolicyApplied } from '../models/Assetsv3PolicyApplied';
import { Assetsv3PolicyUpdate } from '../models/Assetsv3PolicyUpdate';
import { Assetsv3PortVertex } from '../models/Assetsv3PortVertex';
import { Assetsv3ResourceData } from '../models/Assetsv3ResourceData';
import { Assetsv3ResourcesVertex } from '../models/Assetsv3ResourcesVertex';
import { Assetsv3Rule } from '../models/Assetsv3Rule';
import { Assetsv3RuleLog } from '../models/Assetsv3RuleLog';
import { Assetsv3RuleParameter } from '../models/Assetsv3RuleParameter';
import { Assetsv3RuleType } from '../models/Assetsv3RuleType';
import { Assetsv3SaveAssignedTagsRequest } from '../models/Assetsv3SaveAssignedTagsRequest';
import { Assetsv3SaveTagConceptDataRequest } from '../models/Assetsv3SaveTagConceptDataRequest';
import { Assetsv3SaveTagDomainDataRequest } from '../models/Assetsv3SaveTagDomainDataRequest';
import { Assetsv3SaveUpdateFilterTemplateRequest } from '../models/Assetsv3SaveUpdateFilterTemplateRequest';
import { Assetsv3SaveUpdateFilterTemplateResponse } from '../models/Assetsv3SaveUpdateFilterTemplateResponse';
import { Assetsv3SensitivityInfo } from '../models/Assetsv3SensitivityInfo';
import { Assetsv3SetBannerStateRequest } from '../models/Assetsv3SetBannerStateRequest';
import { Assetsv3StatusType } from '../models/Assetsv3StatusType';
import { Assetsv3StorageVertex } from '../models/Assetsv3StorageVertex';
import { Assetsv3SubCategory } from '../models/Assetsv3SubCategory';
import { Assetsv3SubscriptionVertex } from '../models/Assetsv3SubscriptionVertex';
import { Assetsv3SuggestionsTags } from '../models/Assetsv3SuggestionsTags';
import { Assetsv3TableColumn } from '../models/Assetsv3TableColumn';
import { Assetsv3Tag } from '../models/Assetsv3Tag';
import { Assetsv3TagCategoriesData } from '../models/Assetsv3TagCategoriesData';
import { Assetsv3TagCategory } from '../models/Assetsv3TagCategory';
import { Assetsv3TagsAssigned } from '../models/Assetsv3TagsAssigned';
import { Assetsv3TagsData } from '../models/Assetsv3TagsData';
import { Assetsv3TagsFilterData } from '../models/Assetsv3TagsFilterData';
import { Assetsv3TemplateType } from '../models/Assetsv3TemplateType';
import { Assetsv3TimelineDateRange } from '../models/Assetsv3TimelineDateRange';
import { Assetsv3UnassignedTags } from '../models/Assetsv3UnassignedTags';
import { Assetsv3UpdateAssetNameRequest } from '../models/Assetsv3UpdateAssetNameRequest';
import { Assetsv3UpdatePolicyRequest } from '../models/Assetsv3UpdatePolicyRequest';
import { Assetsv3VulnerabilityScanStatus } from '../models/Assetsv3VulnerabilityScanStatus';
import { Assetsv3VulnerabilityTrend } from '../models/Assetsv3VulnerabilityTrend';
import { Assetsv3WidgetType } from '../models/Assetsv3WidgetType';
import { Auditv3ActivityRecord } from '../models/Auditv3ActivityRecord';
import { Auditv3Filter } from '../models/Auditv3Filter';
import { Auditv3FilterField } from '../models/Auditv3FilterField';
import { Auditv3GetActivityRecordsResponse } from '../models/Auditv3GetActivityRecordsResponse';
import { Auditv3PutActivityRecordRequest } from '../models/Auditv3PutActivityRecordRequest';
import { Auditv3PutActivityRecordResponse } from '../models/Auditv3PutActivityRecordResponse';
import { AuthCode } from '../models/AuthCode';
import { AuthInfo } from '../models/AuthInfo';
import { AuthUrl } from '../models/AuthUrl';
import { Authenticate200Response } from '../models/Authenticate200Response';
import { Authenticate400Response } from '../models/Authenticate400Response';
import { AuthenticateRequest } from '../models/AuthenticateRequest';
import { AuthserverCheckPermissionForOAuthTokenResponse } from '../models/AuthserverCheckPermissionForOAuthTokenResponse';
import { AuthserverCreateOauthClientRequest } from '../models/AuthserverCreateOauthClientRequest';
import { AuthserverCreateOauthClientResponse } from '../models/AuthserverCreateOauthClientResponse';
import { AuthserverGetAccessTokenResponse } from '../models/AuthserverGetAccessTokenResponse';
import { AuthserverGetOauthClientResponse } from '../models/AuthserverGetOauthClientResponse';
import { AuthserverGetPrivilegesResponse } from '../models/AuthserverGetPrivilegesResponse';
import { AuthserverGetUserResponse } from '../models/AuthserverGetUserResponse';
import { AuthserverListOauthClientResponse } from '../models/AuthserverListOauthClientResponse';
import { AuthserverOauthClient } from '../models/AuthserverOauthClient';
import { ClientInfo } from '../models/ClientInfo';
import { CloudAccountCountInner } from '../models/CloudAccountCountInner';
import { CloudAccountDetails } from '../models/CloudAccountDetails';
import { CloudAccountInstallationStatus } from '../models/CloudAccountInstallationStatus';
import { CloudAccountsCloudProvidersAnalyzedRegionsOptionsRequest } from '../models/CloudAccountsCloudProvidersAnalyzedRegionsOptionsRequest';
import { CloudAccountsCloudProvidersOptionsRequest } from '../models/CloudAccountsCloudProvidersOptionsRequest';
import { CloudAccountsCloudProvidersOptionsRequestCloudAccountsInner } from '../models/CloudAccountsCloudProvidersOptionsRequestCloudAccountsInner';
import { CloudRegionCountInner } from '../models/CloudRegionCountInner';
import { CloudServiceProvider } from '../models/CloudServiceProvider';
import { Comparator } from '../models/Comparator';
import { Compliance } from '../models/Compliance';
import { Complianceacceleratorv3Action } from '../models/Complianceacceleratorv3Action';
import { Complianceacceleratorv3AuditConfig } from '../models/Complianceacceleratorv3AuditConfig';
import { Complianceacceleratorv3AuditScheduler } from '../models/Complianceacceleratorv3AuditScheduler';
import { Complianceacceleratorv3ComplianceInfo } from '../models/Complianceacceleratorv3ComplianceInfo';
import { Complianceacceleratorv3CreateWorkspaceRequest } from '../models/Complianceacceleratorv3CreateWorkspaceRequest';
import { Complianceacceleratorv3CreateWorkspaceResponse } from '../models/Complianceacceleratorv3CreateWorkspaceResponse';
import { Complianceacceleratorv3DashboardObject } from '../models/Complianceacceleratorv3DashboardObject';
import { Complianceacceleratorv3DashboardType } from '../models/Complianceacceleratorv3DashboardType';
import { Complianceacceleratorv3DeleteComplianceWorkspacesResponse } from '../models/Complianceacceleratorv3DeleteComplianceWorkspacesResponse';
import { Complianceacceleratorv3EmailConfig } from '../models/Complianceacceleratorv3EmailConfig';
import { Complianceacceleratorv3GetComplianceInfoResponse } from '../models/Complianceacceleratorv3GetComplianceInfoResponse';
import { Complianceacceleratorv3Group } from '../models/Complianceacceleratorv3Group';
import { Complianceacceleratorv3HydrateComplianceWorkspacesRequest } from '../models/Complianceacceleratorv3HydrateComplianceWorkspacesRequest';
import { Complianceacceleratorv3HydrateComplianceWorkspacesResponse } from '../models/Complianceacceleratorv3HydrateComplianceWorkspacesResponse';
import { Complianceacceleratorv3Options } from '../models/Complianceacceleratorv3Options';
import { Complianceacceleratorv3RecipientType } from '../models/Complianceacceleratorv3RecipientType';
import { Complianceacceleratorv3Report } from '../models/Complianceacceleratorv3Report';
import { Complianceacceleratorv3ReportStatus } from '../models/Complianceacceleratorv3ReportStatus';
import { Complianceacceleratorv3Reports } from '../models/Complianceacceleratorv3Reports';
import { Complianceacceleratorv3RuleAndAction } from '../models/Complianceacceleratorv3RuleAndAction';
import { Complianceacceleratorv3StatusResponseBase } from '../models/Complianceacceleratorv3StatusResponseBase';
import { Complianceacceleratorv3StoreComplianceInfoRequest } from '../models/Complianceacceleratorv3StoreComplianceInfoRequest';
import { Complianceacceleratorv3StoreComplianceInfoResponse } from '../models/Complianceacceleratorv3StoreComplianceInfoResponse';
import { Complianceacceleratorv3SyslogConfig } from '../models/Complianceacceleratorv3SyslogConfig';
import { Complianceacceleratorv3TaskStatus } from '../models/Complianceacceleratorv3TaskStatus';
import { Complianceacceleratorv3Workspace } from '../models/Complianceacceleratorv3Workspace';
import { Complianceacceleratorv3WorkspaceCreationStatus } from '../models/Complianceacceleratorv3WorkspaceCreationStatus';
import { ConfigureSSORequest } from '../models/ConfigureSSORequest';
import { ConfigureSSORequestIdpMetadata } from '../models/ConfigureSSORequestIdpMetadata';
import { Connectionsv3Account } from '../models/Connectionsv3Account';
import { Connectionsv3AccountConfig } from '../models/Connectionsv3AccountConfig';
import { Connectionsv3Connector } from '../models/Connectionsv3Connector';
import { Connectionsv3ConnectorAttribute } from '../models/Connectionsv3ConnectorAttribute';
import { Connectionsv3ConnectorColumn } from '../models/Connectionsv3ConnectorColumn';
import { Connectionsv3ConnectorFilter } from '../models/Connectionsv3ConnectorFilter';
import { Connectionsv3ConnectorFilterHeader } from '../models/Connectionsv3ConnectorFilterHeader';
import { Connectionsv3ConnectorHeader } from '../models/Connectionsv3ConnectorHeader';
import { Connectionsv3ConnectorSetting } from '../models/Connectionsv3ConnectorSetting';
import { Connectionsv3ConnectorSettingStat } from '../models/Connectionsv3ConnectorSettingStat';
import { Connectionsv3ConnectorSummary } from '../models/Connectionsv3ConnectorSummary';
import { Connectionsv3ConnectorType } from '../models/Connectionsv3ConnectorType';
import { Connectionsv3CreateAttributesResponse } from '../models/Connectionsv3CreateAttributesResponse';
import { Connectionsv3CreateConnectionsAccountsRequest } from '../models/Connectionsv3CreateConnectionsAccountsRequest';
import { Connectionsv3CreateConnectionsAccountsResponse } from '../models/Connectionsv3CreateConnectionsAccountsResponse';
import { Connectionsv3CreateConnectionsConfigsRequest } from '../models/Connectionsv3CreateConnectionsConfigsRequest';
import { Connectionsv3CreateConnectionsConfigsResponse } from '../models/Connectionsv3CreateConnectionsConfigsResponse';
import { Connectionsv3CreatePluginRequest } from '../models/Connectionsv3CreatePluginRequest';
import { Connectionsv3CreatePluginResponse } from '../models/Connectionsv3CreatePluginResponse';
import { Connectionsv3CreateSettingsRequest } from '../models/Connectionsv3CreateSettingsRequest';
import { Connectionsv3DataSource } from '../models/Connectionsv3DataSource';
import { Connectionsv3DeleteAttributesResponse } from '../models/Connectionsv3DeleteAttributesResponse';
import { Connectionsv3DeleteConnectionsAccountsResponse } from '../models/Connectionsv3DeleteConnectionsAccountsResponse';
import { Connectionsv3DeleteConnectionsConfigsResponse } from '../models/Connectionsv3DeleteConnectionsConfigsResponse';
import { Connectionsv3DeletePluginResponse } from '../models/Connectionsv3DeletePluginResponse';
import { Connectionsv3EdgeDeploymentServer } from '../models/Connectionsv3EdgeDeploymentServer';
import { Connectionsv3GeneratePackageRequest } from '../models/Connectionsv3GeneratePackageRequest';
import { Connectionsv3GeneratePackageResponse } from '../models/Connectionsv3GeneratePackageResponse';
import { Connectionsv3GetAttributesResponse } from '../models/Connectionsv3GetAttributesResponse';
import { Connectionsv3GetBannerStateResponse } from '../models/Connectionsv3GetBannerStateResponse';
import { Connectionsv3GetConnectionsAccountsResponse } from '../models/Connectionsv3GetConnectionsAccountsResponse';
import { Connectionsv3GetConnectionsConfigsResponse } from '../models/Connectionsv3GetConnectionsConfigsResponse';
import { Connectionsv3GetConnectionsWithFiltersRequest } from '../models/Connectionsv3GetConnectionsWithFiltersRequest';
import { Connectionsv3GetConnectionsWithFiltersResponse } from '../models/Connectionsv3GetConnectionsWithFiltersResponse';
import { Connectionsv3GetConnectorsSummaryResponse } from '../models/Connectionsv3GetConnectorsSummaryResponse';
import { Connectionsv3GetDataSourcesResponse } from '../models/Connectionsv3GetDataSourcesResponse';
import { Connectionsv3GetGuardRecordFieldsResponse } from '../models/Connectionsv3GetGuardRecordFieldsResponse';
import { Connectionsv3GetHeadersResponse } from '../models/Connectionsv3GetHeadersResponse';
import { Connectionsv3GetPluginsResponse } from '../models/Connectionsv3GetPluginsResponse';
import { Connectionsv3GetSettingsResponse } from '../models/Connectionsv3GetSettingsResponse';
import { Connectionsv3GuardRecordField } from '../models/Connectionsv3GuardRecordField';
import { Connectionsv3HeaderFilter } from '../models/Connectionsv3HeaderFilter';
import { Connectionsv3InternalCreateConnectionConfigResponse } from '../models/Connectionsv3InternalCreateConnectionConfigResponse';
import { Connectionsv3InternalGetStreamingConnectionsResponse } from '../models/Connectionsv3InternalGetStreamingConnectionsResponse';
import { Connectionsv3InternalSearchConnectionResponse } from '../models/Connectionsv3InternalSearchConnectionResponse';
import { Connectionsv3OrderType } from '../models/Connectionsv3OrderType';
import { Connectionsv3PartialConnector } from '../models/Connectionsv3PartialConnector';
import { Connectionsv3PartialUpdateConnectorsRequest } from '../models/Connectionsv3PartialUpdateConnectorsRequest';
import { Connectionsv3PartialUpdateConnectorsResponse } from '../models/Connectionsv3PartialUpdateConnectorsResponse';
import { Connectionsv3PluginConfiguration } from '../models/Connectionsv3PluginConfiguration';
import { Connectionsv3PluginRecord } from '../models/Connectionsv3PluginRecord';
import { Connectionsv3StapCommandRequest } from '../models/Connectionsv3StapCommandRequest';
import { Connectionsv3StapOperation } from '../models/Connectionsv3StapOperation';
import { Connectionsv3Status } from '../models/Connectionsv3Status';
import { Connectionsv3StatusResponseBase } from '../models/Connectionsv3StatusResponseBase';
import { Connectionsv3StreamConnection } from '../models/Connectionsv3StreamConnection';
import { Connectionsv3StreamConnectionConfig } from '../models/Connectionsv3StreamConnectionConfig';
import { Connectionsv3StreamingConfigs } from '../models/Connectionsv3StreamingConfigs';
import { Connectionsv3StreamingConfigsByTenant } from '../models/Connectionsv3StreamingConfigsByTenant';
import { Connectionsv3UCConnectionConfig } from '../models/Connectionsv3UCConnectionConfig';
import { Connectionsv3UCConnectionSummary } from '../models/Connectionsv3UCConnectionSummary';
import { Connectionsv3UpdateAttributesResponse } from '../models/Connectionsv3UpdateAttributesResponse';
import { Connectionsv3UpdateBannerStateRequest } from '../models/Connectionsv3UpdateBannerStateRequest';
import { Connectionsv3UpdateBannerStateResponse } from '../models/Connectionsv3UpdateBannerStateResponse';
import { Connectionsv3UpdateConnectionsAccountsRequest } from '../models/Connectionsv3UpdateConnectionsAccountsRequest';
import { Connectionsv3UpdateConnectionsAccountsResponse } from '../models/Connectionsv3UpdateConnectionsAccountsResponse';
import { Connectionsv3UpdateConnectionsConfigsRequest } from '../models/Connectionsv3UpdateConnectionsConfigsRequest';
import { Connectionsv3UpdateConnectionsConfigsResponse } from '../models/Connectionsv3UpdateConnectionsConfigsResponse';
import { Connectionsv3UpdateConnectorsRequest } from '../models/Connectionsv3UpdateConnectorsRequest';
import { Connectionsv3UpdatePluginRequest } from '../models/Connectionsv3UpdatePluginRequest';
import { Connectionsv3UpdatePluginResponse } from '../models/Connectionsv3UpdatePluginResponse';
import { Connectionsv3UpdateSettingsRequest } from '../models/Connectionsv3UpdateSettingsRequest';
import { Connectionsv3ValidateAwsConnectionRequest } from '../models/Connectionsv3ValidateAwsConnectionRequest';
import { Connectionsv3ValidateAzureConnectionRequest } from '../models/Connectionsv3ValidateAzureConnectionRequest';
import { Connectionsv3ValidateConnectionResponse } from '../models/Connectionsv3ValidateConnectionResponse';
import { Connectionsv3ValidateGcpConnectionRequest } from '../models/Connectionsv3ValidateGcpConnectionRequest';
import { DBMetadataInfo } from '../models/DBMetadataInfo';
import { Dashboardsv3Card } from '../models/Dashboardsv3Card';
import { Dashboardsv3CardPosition } from '../models/Dashboardsv3CardPosition';
import { Dashboardsv3CardType } from '../models/Dashboardsv3CardType';
import { Dashboardsv3CreateDashboardResponse } from '../models/Dashboardsv3CreateDashboardResponse';
import { Dashboardsv3Dashboard } from '../models/Dashboardsv3Dashboard';
import { Dashboardsv3DeleteDashboardRequest } from '../models/Dashboardsv3DeleteDashboardRequest';
import { Dashboardsv3DeleteDashboardResponse } from '../models/Dashboardsv3DeleteDashboardResponse';
import { Dashboardsv3GetDashboardsResponse } from '../models/Dashboardsv3GetDashboardsResponse';
import { Dashboardsv3ReportGlobalFilter } from '../models/Dashboardsv3ReportGlobalFilter';
import { Dashboardsv3ReportOperator } from '../models/Dashboardsv3ReportOperator';
import { Dashboardsv3ReportParameters } from '../models/Dashboardsv3ReportParameters';
import { Dashboardsv3TimeRange } from '../models/Dashboardsv3TimeRange';
import { Dashboardsv3UpdateDashboardRequest } from '../models/Dashboardsv3UpdateDashboardRequest';
import { Dashboardsv3UpdateDashboardResponse } from '../models/Dashboardsv3UpdateDashboardResponse';
import { Dashboardsv3UpdateType } from '../models/Dashboardsv3UpdateType';
import { DataResource } from '../models/DataResource';
import { DataResourceStats } from '../models/DataResourceStats';
import { DataResourcesSummary } from '../models/DataResourcesSummary';
import { DataResourcesSummaryResourceOwnersInner } from '../models/DataResourcesSummaryResourceOwnersInner';
import { DataResourcesSummaryResourceTypesInner } from '../models/DataResourcesSummaryResourceTypesInner';
import { DataStore } from '../models/DataStore';
import { DataStoreEncryptionStatus } from '../models/DataStoreEncryptionStatus';
import { DataStoreSource } from '../models/DataStoreSource';
import { DataStoreStats } from '../models/DataStoreStats';
import { DataStoresSummary } from '../models/DataStoresSummary';
import { DataStoresSummaryCloudLocationsInner } from '../models/DataStoresSummaryCloudLocationsInner';
import { DataStoresSummaryServiceProvidersInner } from '../models/DataStoresSummaryServiceProvidersInner';
import { DataStoresSummaryStoreTypesInner } from '../models/DataStoresSummaryStoreTypesInner';
import { Databootstrapperv3LoadDataRequest } from '../models/Databootstrapperv3LoadDataRequest';
import { Databootstrapperv3LoadDataResponse } from '../models/Databootstrapperv3LoadDataResponse';
import { Datamartprocessorv3DMExtractionLogsRequest } from '../models/Datamartprocessorv3DMExtractionLogsRequest';
import { Datamartprocessorv3DMExtractionLogsResponse } from '../models/Datamartprocessorv3DMExtractionLogsResponse';
import { Datamartprocessorv3DatamartFileInfo } from '../models/Datamartprocessorv3DatamartFileInfo';
import { Datamartprocessorv3DatamartInfo } from '../models/Datamartprocessorv3DatamartInfo';
import { Datamartprocessorv3GetDatamartInfoResponse } from '../models/Datamartprocessorv3GetDatamartInfoResponse';
import { Datamartprocessorv3GetDatamartResponse } from '../models/Datamartprocessorv3GetDatamartResponse';
import { Datamartprocessorv3GetEarliestStartTimeResponse } from '../models/Datamartprocessorv3GetEarliestStartTimeResponse';
import { Datamartprocessorv3StatusResponseBase } from '../models/Datamartprocessorv3StatusResponseBase';
import { DbInfo } from '../models/DbInfo';
import { Ecosystemv3ColumnDefinition } from '../models/Ecosystemv3ColumnDefinition';
import { Ecosystemv3CreateDatasetRequest } from '../models/Ecosystemv3CreateDatasetRequest';
import { Ecosystemv3CreateDatasetResponse } from '../models/Ecosystemv3CreateDatasetResponse';
import { Ecosystemv3DataEntry } from '../models/Ecosystemv3DataEntry';
import { Ecosystemv3DataInsertRequest } from '../models/Ecosystemv3DataInsertRequest';
import { Ecosystemv3DataInsertResponse } from '../models/Ecosystemv3DataInsertResponse';
import { Ecosystemv3DataType } from '../models/Ecosystemv3DataType';
import { Ecosystemv3DatasetDetail } from '../models/Ecosystemv3DatasetDetail';
import { Ecosystemv3DatasetRecord } from '../models/Ecosystemv3DatasetRecord';
import { Ecosystemv3DatasetsFilter } from '../models/Ecosystemv3DatasetsFilter';
import { Ecosystemv3DeleteDatasetsResponse } from '../models/Ecosystemv3DeleteDatasetsResponse';
import { Ecosystemv3Filter } from '../models/Ecosystemv3Filter';
import { Ecosystemv3FilterField } from '../models/Ecosystemv3FilterField';
import { Ecosystemv3GetDatasetDataResponse } from '../models/Ecosystemv3GetDatasetDataResponse';
import { Ecosystemv3GetDatasetDetailResponse } from '../models/Ecosystemv3GetDatasetDetailResponse';
import { Ecosystemv3GetDatasetsResponse } from '../models/Ecosystemv3GetDatasetsResponse';
import { Ecosystemv3GetPurgableRowsRequest } from '../models/Ecosystemv3GetPurgableRowsRequest';
import { Ecosystemv3GetPurgableRowsResponse } from '../models/Ecosystemv3GetPurgableRowsResponse';
import { Ecosystemv3OrderType } from '../models/Ecosystemv3OrderType';
import { Ecosystemv3PurgeDataResponse } from '../models/Ecosystemv3PurgeDataResponse';
import { Ecosystemv3TestIntegrationRequest } from '../models/Ecosystemv3TestIntegrationRequest';
import { Ecosystemv3TestIntegrationResponse } from '../models/Ecosystemv3TestIntegrationResponse';
import { Ecosystemv3ValidateCSVContentResponse } from '../models/Ecosystemv3ValidateCSVContentResponse';
import { Environment } from '../models/Environment';
import { Featureflagsv3DeleteFeatureFlagOverridesResponse } from '../models/Featureflagsv3DeleteFeatureFlagOverridesResponse';
import { Featureflagsv3FeatureFlag } from '../models/Featureflagsv3FeatureFlag';
import { Featureflagsv3FeatureFlagOverrides } from '../models/Featureflagsv3FeatureFlagOverrides';
import { Featureflagsv3FeatureFlagValue } from '../models/Featureflagsv3FeatureFlagValue';
import { Featureflagsv3GetFeatureFlagOverridesResponse } from '../models/Featureflagsv3GetFeatureFlagOverridesResponse';
import { Featureflagsv3GetFeatureFlagsResponse } from '../models/Featureflagsv3GetFeatureFlagsResponse';
import { Featureflagsv3UpdateFeatureFlagOverridesRequest } from '../models/Featureflagsv3UpdateFeatureFlagOverridesRequest';
import { Featureflagsv3UpdateFeatureFlagOverridesResponse } from '../models/Featureflagsv3UpdateFeatureFlagOverridesResponse';
import { FlowNode } from '../models/FlowNode';
import { FlowNodeResource } from '../models/FlowNodeResource';
import { FlowNodeSummary } from '../models/FlowNodeSummary';
import { FlowType } from '../models/FlowType';
import { GetAnalyzedRegionStatus200Response } from '../models/GetAnalyzedRegionStatus200Response';
import { GetJiraIntegrationParameters200Response } from '../models/GetJiraIntegrationParameters200Response';
import { GetReportGroupsResponseReportGroups } from '../models/GetReportGroupsResponseReportGroups';
import { GetSSODetails200Response } from '../models/GetSSODetails200Response';
import { GooglerpcStatus } from '../models/GooglerpcStatus';
import { Groupbuilderv3CancelGroupImportResponse } from '../models/Groupbuilderv3CancelGroupImportResponse';
import { Groupbuilderv3CreateGroupRequest } from '../models/Groupbuilderv3CreateGroupRequest';
import { Groupbuilderv3CreateGroupResponse } from '../models/Groupbuilderv3CreateGroupResponse';
import { Groupbuilderv3DeleteGroupResponse } from '../models/Groupbuilderv3DeleteGroupResponse';
import { Groupbuilderv3EditGroupRequest } from '../models/Groupbuilderv3EditGroupRequest';
import { Groupbuilderv3EditGroupResponse } from '../models/Groupbuilderv3EditGroupResponse';
import { Groupbuilderv3GdpGroup } from '../models/Groupbuilderv3GdpGroup';
import { Groupbuilderv3GetExportGroupRequest } from '../models/Groupbuilderv3GetExportGroupRequest';
import { Groupbuilderv3GetExportGroupResponse } from '../models/Groupbuilderv3GetExportGroupResponse';
import { Groupbuilderv3GetGroupDetailResponse } from '../models/Groupbuilderv3GetGroupDetailResponse';
import { Groupbuilderv3GetGroupMembersRequest } from '../models/Groupbuilderv3GetGroupMembersRequest';
import { Groupbuilderv3GetGroupMembersResponse } from '../models/Groupbuilderv3GetGroupMembersResponse';
import { Groupbuilderv3GetGroupSyncMappingResponse } from '../models/Groupbuilderv3GetGroupSyncMappingResponse';
import { Groupbuilderv3GetGroupTypeMappingResponse } from '../models/Groupbuilderv3GetGroupTypeMappingResponse';
import { Groupbuilderv3GetGroupTypesResponse } from '../models/Groupbuilderv3GetGroupTypesResponse';
import { Groupbuilderv3GetGroupsRequestGdp } from '../models/Groupbuilderv3GetGroupsRequestGdp';
import { Groupbuilderv3GetGroupsResponse } from '../models/Groupbuilderv3GetGroupsResponse';
import { Groupbuilderv3GetGroupsResponseGdp } from '../models/Groupbuilderv3GetGroupsResponseGdp';
import { Groupbuilderv3GetImportGroupsResponse } from '../models/Groupbuilderv3GetImportGroupsResponse';
import { Groupbuilderv3Group } from '../models/Groupbuilderv3Group';
import { Groupbuilderv3GroupMember } from '../models/Groupbuilderv3GroupMember';
import { Groupbuilderv3GroupType } from '../models/Groupbuilderv3GroupType';
import { Groupbuilderv3ImportGroupRequest } from '../models/Groupbuilderv3ImportGroupRequest';
import { Groupbuilderv3ImportGroupResponse } from '../models/Groupbuilderv3ImportGroupResponse';
import { Groupbuilderv3LdapConfig } from '../models/Groupbuilderv3LdapConfig';
import { Groupbuilderv3NestedGroupMember } from '../models/Groupbuilderv3NestedGroupMember';
import { Groupbuilderv3RefreshGroupsRequest } from '../models/Groupbuilderv3RefreshGroupsRequest';
import { Groupbuilderv3RefreshGroupsResponse } from '../models/Groupbuilderv3RefreshGroupsResponse';
import { Groupbuilderv3ResetGroupsRequest } from '../models/Groupbuilderv3ResetGroupsRequest';
import { Groupbuilderv3ResetGroupsResponse } from '../models/Groupbuilderv3ResetGroupsResponse';
import { Groupbuilderv3StatusResponseBase } from '../models/Groupbuilderv3StatusResponseBase';
import { Groupbuilderv3StoreGroupMembersGdpRequest } from '../models/Groupbuilderv3StoreGroupMembersGdpRequest';
import { Groupbuilderv3StoreGroupMembersGdpResponse } from '../models/Groupbuilderv3StoreGroupMembersGdpResponse';
import { Guardiumconnectorv3Action } from '../models/Guardiumconnectorv3Action';
import { Guardiumconnectorv3ActionNotifications } from '../models/Guardiumconnectorv3ActionNotifications';
import { Guardiumconnectorv3ActionParameter } from '../models/Guardiumconnectorv3ActionParameter';
import { Guardiumconnectorv3AddCMRequest } from '../models/Guardiumconnectorv3AddCMRequest';
import { Guardiumconnectorv3AddCMResponse } from '../models/Guardiumconnectorv3AddCMResponse';
import { Guardiumconnectorv3AddDatamartsRequest } from '../models/Guardiumconnectorv3AddDatamartsRequest';
import { Guardiumconnectorv3AddDatamartsResponse } from '../models/Guardiumconnectorv3AddDatamartsResponse';
import { Guardiumconnectorv3AddDmExclusionRequest } from '../models/Guardiumconnectorv3AddDmExclusionRequest';
import { Guardiumconnectorv3AddDmExclusionResponse } from '../models/Guardiumconnectorv3AddDmExclusionResponse';
import { Guardiumconnectorv3AddTaskRequest } from '../models/Guardiumconnectorv3AddTaskRequest';
import { Guardiumconnectorv3AddTaskResponse } from '../models/Guardiumconnectorv3AddTaskResponse';
import { Guardiumconnectorv3AggregationViewListObject } from '../models/Guardiumconnectorv3AggregationViewListObject';
import { Guardiumconnectorv3AggregatorConfig } from '../models/Guardiumconnectorv3AggregatorConfig';
import { Guardiumconnectorv3Attribute } from '../models/Guardiumconnectorv3Attribute';
import { Guardiumconnectorv3BlockUserRequest } from '../models/Guardiumconnectorv3BlockUserRequest';
import { Guardiumconnectorv3BlockUserResponse } from '../models/Guardiumconnectorv3BlockUserResponse';
import { Guardiumconnectorv3BlockWhat } from '../models/Guardiumconnectorv3BlockWhat';
import { Guardiumconnectorv3BlockWhere } from '../models/Guardiumconnectorv3BlockWhere';
import { Guardiumconnectorv3CM } from '../models/Guardiumconnectorv3CM';
import { Guardiumconnectorv3CollectorConfig } from '../models/Guardiumconnectorv3CollectorConfig';
import { Guardiumconnectorv3ConfigureAggregatorExportRequest } from '../models/Guardiumconnectorv3ConfigureAggregatorExportRequest';
import { Guardiumconnectorv3ConfigureAggregatorExportResponse } from '../models/Guardiumconnectorv3ConfigureAggregatorExportResponse';
import { Guardiumconnectorv3ConfigureCollectorExportRequest } from '../models/Guardiumconnectorv3ConfigureCollectorExportRequest';
import { Guardiumconnectorv3ConfigureCollectorExportResponse } from '../models/Guardiumconnectorv3ConfigureCollectorExportResponse';
import { Guardiumconnectorv3ConfigureStreamingRequest } from '../models/Guardiumconnectorv3ConfigureStreamingRequest';
import { Guardiumconnectorv3ConfigureStreamingResponse } from '../models/Guardiumconnectorv3ConfigureStreamingResponse';
import { Guardiumconnectorv3DatabaseConnectionStringRequest } from '../models/Guardiumconnectorv3DatabaseConnectionStringRequest';
import { Guardiumconnectorv3DatabaseResultResponse } from '../models/Guardiumconnectorv3DatabaseResultResponse';
import { Guardiumconnectorv3DatamartExecutionMode } from '../models/Guardiumconnectorv3DatamartExecutionMode';
import { Guardiumconnectorv3DatamartVersionRequest } from '../models/Guardiumconnectorv3DatamartVersionRequest';
import { Guardiumconnectorv3DatamartVersionResponse } from '../models/Guardiumconnectorv3DatamartVersionResponse';
import { Guardiumconnectorv3Datamarts } from '../models/Guardiumconnectorv3Datamarts';
import { Guardiumconnectorv3DeleteCMResponse } from '../models/Guardiumconnectorv3DeleteCMResponse';
import { Guardiumconnectorv3DeleteDmExclusionResponse } from '../models/Guardiumconnectorv3DeleteDmExclusionResponse';
import { Guardiumconnectorv3DeleteTaskResponse } from '../models/Guardiumconnectorv3DeleteTaskResponse';
import { Guardiumconnectorv3DeleteTasksResponse } from '../models/Guardiumconnectorv3DeleteTasksResponse';
import { Guardiumconnectorv3ExtractionProfile } from '../models/Guardiumconnectorv3ExtractionProfile';
import { Guardiumconnectorv3GDPReportParameter } from '../models/Guardiumconnectorv3GDPReportParameter';
import { Guardiumconnectorv3GDPReportResultColumn } from '../models/Guardiumconnectorv3GDPReportResultColumn';
import { Guardiumconnectorv3GDPReportResultRow } from '../models/Guardiumconnectorv3GDPReportResultRow';
import { Guardiumconnectorv3GdpPolicyObject } from '../models/Guardiumconnectorv3GdpPolicyObject';
import { Guardiumconnectorv3GeneralDetailsObject } from '../models/Guardiumconnectorv3GeneralDetailsObject';
import { Guardiumconnectorv3GetAggregatorsConfigResponse } from '../models/Guardiumconnectorv3GetAggregatorsConfigResponse';
import { Guardiumconnectorv3GetCMsConfigResponse } from '../models/Guardiumconnectorv3GetCMsConfigResponse';
import { Guardiumconnectorv3GetCMsResponse } from '../models/Guardiumconnectorv3GetCMsResponse';
import { Guardiumconnectorv3GetCollectorsConfigResponse } from '../models/Guardiumconnectorv3GetCollectorsConfigResponse';
import { Guardiumconnectorv3GetDatamartsResponse } from '../models/Guardiumconnectorv3GetDatamartsResponse';
import { Guardiumconnectorv3GetDmExclusionResponse } from '../models/Guardiumconnectorv3GetDmExclusionResponse';
import { Guardiumconnectorv3GetGroupMembersResponse } from '../models/Guardiumconnectorv3GetGroupMembersResponse';
import { Guardiumconnectorv3GetGroupsResponse } from '../models/Guardiumconnectorv3GetGroupsResponse';
import { Guardiumconnectorv3GetHealthInfoResponse } from '../models/Guardiumconnectorv3GetHealthInfoResponse';
import { Guardiumconnectorv3GetLatestDMExtractionProfileResponse } from '../models/Guardiumconnectorv3GetLatestDMExtractionProfileResponse';
import { Guardiumconnectorv3GetPolicyInfoResponse } from '../models/Guardiumconnectorv3GetPolicyInfoResponse';
import { Guardiumconnectorv3GetPolicySummariesResponse } from '../models/Guardiumconnectorv3GetPolicySummariesResponse';
import { Guardiumconnectorv3GetStreamingStatusResponse } from '../models/Guardiumconnectorv3GetStreamingStatusResponse';
import { Guardiumconnectorv3GetSyncDMsResponse } from '../models/Guardiumconnectorv3GetSyncDMsResponse';
import { Guardiumconnectorv3GetTaskTypesResponse } from '../models/Guardiumconnectorv3GetTaskTypesResponse';
import { Guardiumconnectorv3GetTasksResponse } from '../models/Guardiumconnectorv3GetTasksResponse';
import { Guardiumconnectorv3Group } from '../models/Guardiumconnectorv3Group';
import { Guardiumconnectorv3GroupMember } from '../models/Guardiumconnectorv3GroupMember';
import { Guardiumconnectorv3InspectionEngineDetails } from '../models/Guardiumconnectorv3InspectionEngineDetails';
import { Guardiumconnectorv3InspectionEngineObject } from '../models/Guardiumconnectorv3InspectionEngineObject';
import { Guardiumconnectorv3MUDetailsObj } from '../models/Guardiumconnectorv3MUDetailsObj';
import { Guardiumconnectorv3ManagedUnitObject } from '../models/Guardiumconnectorv3ManagedUnitObject';
import { Guardiumconnectorv3NestedGroupMember } from '../models/Guardiumconnectorv3NestedGroupMember';
import { Guardiumconnectorv3Params } from '../models/Guardiumconnectorv3Params';
import { Guardiumconnectorv3PolicyData } from '../models/Guardiumconnectorv3PolicyData';
import { Guardiumconnectorv3Rule } from '../models/Guardiumconnectorv3Rule';
import { Guardiumconnectorv3RuleParameter } from '../models/Guardiumconnectorv3RuleParameter';
import { Guardiumconnectorv3RunGDPReportRequest } from '../models/Guardiumconnectorv3RunGDPReportRequest';
import { Guardiumconnectorv3RunGDPReportResponse } from '../models/Guardiumconnectorv3RunGDPReportResponse';
import { Guardiumconnectorv3SetupCMRequest } from '../models/Guardiumconnectorv3SetupCMRequest';
import { Guardiumconnectorv3SetupCMResponse } from '../models/Guardiumconnectorv3SetupCMResponse';
import { Guardiumconnectorv3SetupDatamartsRequest } from '../models/Guardiumconnectorv3SetupDatamartsRequest';
import { Guardiumconnectorv3SetupDatamartsResponse } from '../models/Guardiumconnectorv3SetupDatamartsResponse';
import { Guardiumconnectorv3StapDetailsObject } from '../models/Guardiumconnectorv3StapDetailsObject';
import { Guardiumconnectorv3StapLiveInfoObject } from '../models/Guardiumconnectorv3StapLiveInfoObject';
import { Guardiumconnectorv3StapObject } from '../models/Guardiumconnectorv3StapObject';
import { Guardiumconnectorv3StatusAttribute } from '../models/Guardiumconnectorv3StatusAttribute';
import { Guardiumconnectorv3StatusRecord } from '../models/Guardiumconnectorv3StatusRecord';
import { Guardiumconnectorv3StatusResponseBase } from '../models/Guardiumconnectorv3StatusResponseBase';
import { Guardiumconnectorv3StreamingStatusRecord } from '../models/Guardiumconnectorv3StreamingStatusRecord';
import { Guardiumconnectorv3SubTaskObject } from '../models/Guardiumconnectorv3SubTaskObject';
import { Guardiumconnectorv3TaskDefinition } from '../models/Guardiumconnectorv3TaskDefinition';
import { Guardiumconnectorv3TaskDefinitionObject } from '../models/Guardiumconnectorv3TaskDefinitionObject';
import { Guardiumconnectorv3TaskErrorRequest } from '../models/Guardiumconnectorv3TaskErrorRequest';
import { Guardiumconnectorv3TaskErrorResponse } from '../models/Guardiumconnectorv3TaskErrorResponse';
import { Guardiumconnectorv3TaskObject } from '../models/Guardiumconnectorv3TaskObject';
import { Guardiumconnectorv3TaskParamsObject } from '../models/Guardiumconnectorv3TaskParamsObject';
import { Guardiumconnectorv3TaskType } from '../models/Guardiumconnectorv3TaskType';
import { Guardiumconnectorv3UpdateDmExclusionRequest } from '../models/Guardiumconnectorv3UpdateDmExclusionRequest';
import { Guardiumconnectorv3UpdateDmExclusionResponse } from '../models/Guardiumconnectorv3UpdateDmExclusionResponse';
import { Guardiumconnectorv3UpdateStreamingRequest } from '../models/Guardiumconnectorv3UpdateStreamingRequest';
import { Guardiumconnectorv3UpdateStreamingResponse } from '../models/Guardiumconnectorv3UpdateStreamingResponse';
import { Guardiumconnectorv3UpdateTaskRequest } from '../models/Guardiumconnectorv3UpdateTaskRequest';
import { Guardiumconnectorv3UpdateTaskResponse } from '../models/Guardiumconnectorv3UpdateTaskResponse';
import { Guardiumconnectorv3UtilizationParameterObject } from '../models/Guardiumconnectorv3UtilizationParameterObject';
import { Healthcollectorv3AggregationDetailsObject } from '../models/Healthcollectorv3AggregationDetailsObject';
import { Healthcollectorv3AggregationDetailsObjectGdp } from '../models/Healthcollectorv3AggregationDetailsObjectGdp';
import { Healthcollectorv3CMNodeObject } from '../models/Healthcollectorv3CMNodeObject';
import { Healthcollectorv3CountObject } from '../models/Healthcollectorv3CountObject';
import { Healthcollectorv3GeneralDetailsObject } from '../models/Healthcollectorv3GeneralDetailsObject';
import { Healthcollectorv3GetDataWarehouseUsageResponse } from '../models/Healthcollectorv3GetDataWarehouseUsageResponse';
import { Healthcollectorv3GetGDPHealthInfoResponse } from '../models/Healthcollectorv3GetGDPHealthInfoResponse';
import { Healthcollectorv3GetHistoricalHealthInfoResponse } from '../models/Healthcollectorv3GetHistoricalHealthInfoResponse';
import { Healthcollectorv3GetObjectStorageUsageResponse } from '../models/Healthcollectorv3GetObjectStorageUsageResponse';
import { Healthcollectorv3GetPVCUsageResponse } from '../models/Healthcollectorv3GetPVCUsageResponse';
import { Healthcollectorv3GetPodRestartsResponse } from '../models/Healthcollectorv3GetPodRestartsResponse';
import { Healthcollectorv3GetStreamsIngestionResponse } from '../models/Healthcollectorv3GetStreamsIngestionResponse';
import { Healthcollectorv3GetTopGDPCollectorsResponse } from '../models/Healthcollectorv3GetTopGDPCollectorsResponse';
import { Healthcollectorv3HealthInfoObject } from '../models/Healthcollectorv3HealthInfoObject';
import { Healthcollectorv3HistoricalDataObject } from '../models/Healthcollectorv3HistoricalDataObject';
import { Healthcollectorv3InspectionEngineDetails } from '../models/Healthcollectorv3InspectionEngineDetails';
import { Healthcollectorv3InspectionEngineDetailsGdp } from '../models/Healthcollectorv3InspectionEngineDetailsGdp';
import { Healthcollectorv3InspectionEngineObjectGdp } from '../models/Healthcollectorv3InspectionEngineObjectGdp';
import { Healthcollectorv3InspectionEnginePresentDetails } from '../models/Healthcollectorv3InspectionEnginePresentDetails';
import { Healthcollectorv3MUDetailsObj } from '../models/Healthcollectorv3MUDetailsObj';
import { Healthcollectorv3MUDetailsObjGdp } from '../models/Healthcollectorv3MUDetailsObjGdp';
import { Healthcollectorv3ManagedUnitObject } from '../models/Healthcollectorv3ManagedUnitObject';
import { Healthcollectorv3ManagedUnitObjectGdp } from '../models/Healthcollectorv3ManagedUnitObjectGdp';
import { Healthcollectorv3StapDetailsObject } from '../models/Healthcollectorv3StapDetailsObject';
import { Healthcollectorv3StapDetailsObjectGdp } from '../models/Healthcollectorv3StapDetailsObjectGdp';
import { Healthcollectorv3StapInformationObject } from '../models/Healthcollectorv3StapInformationObject';
import { Healthcollectorv3StapLiveInfoObject } from '../models/Healthcollectorv3StapLiveInfoObject';
import { Healthcollectorv3StapObject } from '../models/Healthcollectorv3StapObject';
import { Healthcollectorv3StapObjectGdp } from '../models/Healthcollectorv3StapObjectGdp';
import { Healthcollectorv3StatusResponseBase } from '../models/Healthcollectorv3StatusResponseBase';
import { Healthcollectorv3StoreHealthInfoRequest } from '../models/Healthcollectorv3StoreHealthInfoRequest';
import { Healthcollectorv3StoreHealthInfoResponse } from '../models/Healthcollectorv3StoreHealthInfoResponse';
import { Healthcollectorv3UnitType } from '../models/Healthcollectorv3UnitType';
import { Healthcollectorv3Usage } from '../models/Healthcollectorv3Usage';
import { Healthcollectorv3UtilizationParameterObject } from '../models/Healthcollectorv3UtilizationParameterObject';
import { Healthcollectorv3UtilizationParameterObjectGdp } from '../models/Healthcollectorv3UtilizationParameterObjectGdp';
import { IdpMetadataContent } from '../models/IdpMetadataContent';
import { IdpMetadataUrl } from '../models/IdpMetadataUrl';
import { InstallationStatus } from '../models/InstallationStatus';
import { IntegrationTypes } from '../models/IntegrationTypes';
import { InviteUserBodyParams } from '../models/InviteUserBodyParams';
import { Jumpboxv3AuthorizeRequest } from '../models/Jumpboxv3AuthorizeRequest';
import { Jumpboxv3AuthorizeResponse } from '../models/Jumpboxv3AuthorizeResponse';
import { Jumpboxv3DeleteAccountResponse } from '../models/Jumpboxv3DeleteAccountResponse';
import { Jumpboxv3DirectoryEntry } from '../models/Jumpboxv3DirectoryEntry';
import { Jumpboxv3DisableUsersBulkResponse } from '../models/Jumpboxv3DisableUsersBulkResponse';
import { Jumpboxv3GetAccountResponse } from '../models/Jumpboxv3GetAccountResponse';
import { Jumpboxv3GetAccountsResponse } from '../models/Jumpboxv3GetAccountsResponse';
import { Jumpboxv3GetTenantResponse } from '../models/Jumpboxv3GetTenantResponse';
import { Jumpboxv3GetTenantsResponse } from '../models/Jumpboxv3GetTenantsResponse';
import { Jumpboxv3PostAccountRequest } from '../models/Jumpboxv3PostAccountRequest';
import { Jumpboxv3PostAccountResponse } from '../models/Jumpboxv3PostAccountResponse';
import { Jumpboxv3PostTenantsRequest } from '../models/Jumpboxv3PostTenantsRequest';
import { Jumpboxv3PostTenantsResponse } from '../models/Jumpboxv3PostTenantsResponse';
import { Jumpboxv3PostUsersBulkRequest } from '../models/Jumpboxv3PostUsersBulkRequest';
import { Jumpboxv3PostUsersBulkResponse } from '../models/Jumpboxv3PostUsersBulkResponse';
import { Jumpboxv3ResumeAccountResponse } from '../models/Jumpboxv3ResumeAccountResponse';
import { Jumpboxv3SearchUsersRequest } from '../models/Jumpboxv3SearchUsersRequest';
import { Jumpboxv3SearchUsersResponse } from '../models/Jumpboxv3SearchUsersResponse';
import { Jumpboxv3SuspendAccountResponse } from '../models/Jumpboxv3SuspendAccountResponse';
import { Jumpboxv3Tenant } from '../models/Jumpboxv3Tenant';
import { Jumpboxv3TestUserRequest } from '../models/Jumpboxv3TestUserRequest';
import { Jumpboxv3TestUserResponse } from '../models/Jumpboxv3TestUserResponse';
import { Jumpboxv3UpdateAccountRequest } from '../models/Jumpboxv3UpdateAccountRequest';
import { Jumpboxv3UpdateAccountResponse } from '../models/Jumpboxv3UpdateAccountResponse';
import { Jumpboxv3UpdateTenantRequest } from '../models/Jumpboxv3UpdateTenantRequest';
import { Jumpboxv3UpdateTenantResponse } from '../models/Jumpboxv3UpdateTenantResponse';
import { Jumpboxv3UpdateUsersBulkRequest } from '../models/Jumpboxv3UpdateUsersBulkRequest';
import { Jumpboxv3UpdateUsersBulkResponse } from '../models/Jumpboxv3UpdateUsersBulkResponse';
import { Jumpboxv3User } from '../models/Jumpboxv3User';
import { Jumpboxv3UserState } from '../models/Jumpboxv3UserState';
import { LastSeenSortSchema } from '../models/LastSeenSortSchema';
import { LinkedAccounts } from '../models/LinkedAccounts';
import { LinkedVendor } from '../models/LinkedVendor';
import { ListActualFlowPaths200Response } from '../models/ListActualFlowPaths200Response';
import { ListActualFlowPathsFilterParameter } from '../models/ListActualFlowPathsFilterParameter';
import { ListActualFlowPathsSortParameter } from '../models/ListActualFlowPathsSortParameter';
import { ListActualFlows200Response } from '../models/ListActualFlows200Response';
import { ListActualFlowsFilterParameter } from '../models/ListActualFlowsFilterParameter';
import { ListActualFlowsSortParameter } from '../models/ListActualFlowsSortParameter';
import { ListDataResources200Response } from '../models/ListDataResources200Response';
import { ListDataResourcesFilterParameter } from '../models/ListDataResourcesFilterParameter';
import { ListDataResourcesSortParameter } from '../models/ListDataResourcesSortParameter';
import { ListDataStores200Response } from '../models/ListDataStores200Response';
import { ListDataStoresFilterParameter } from '../models/ListDataStoresFilterParameter';
import { ListDataStoresSortParameter } from '../models/ListDataStoresSortParameter';
import { ListLinkedVendorDataStores200Response } from '../models/ListLinkedVendorDataStores200Response';
import { ListLinkedVendorDataStoresSortParameter } from '../models/ListLinkedVendorDataStoresSortParameter';
import { ListPotentialFlows200Response } from '../models/ListPotentialFlows200Response';
import { ListPotentialFlowsPaths200Response } from '../models/ListPotentialFlowsPaths200Response';
import { ListSensitivities200Response } from '../models/ListSensitivities200Response';
import { ListSensitivitiesFilterParameter } from '../models/ListSensitivitiesFilterParameter';
import { ListTrusteesFilterParameter } from '../models/ListTrusteesFilterParameter';
import { ListUsersEntitlements200Response } from '../models/ListUsersEntitlements200Response';
import { ListUsersEntitlements200ResponseResultsInner } from '../models/ListUsersEntitlements200ResponseResultsInner';
import { ListVendorDataStoresFilterParameter } from '../models/ListVendorDataStoresFilterParameter';
import { ListVulnerabilities200Response } from '../models/ListVulnerabilities200Response';
import { ListVulnerabilitiesByDataStore200Response } from '../models/ListVulnerabilitiesByDataStore200Response';
import { ListVulnerabilitiesByDataStoreSortParameter } from '../models/ListVulnerabilitiesByDataStoreSortParameter';
import { ListVulnerabilitiesSortParameter } from '../models/ListVulnerabilitiesSortParameter';
import { NotificationRecordsFilterStateFilter } from '../models/NotificationRecordsFilterStateFilter';
import { Notificationsv3CreateTicketRequest } from '../models/Notificationsv3CreateTicketRequest';
import { Notificationsv3CreateTicketResponse } from '../models/Notificationsv3CreateTicketResponse';
import { Notificationsv3Filter } from '../models/Notificationsv3Filter';
import { Notificationsv3FilterField } from '../models/Notificationsv3FilterField';
import { Notificationsv3GetFoldersRequest } from '../models/Notificationsv3GetFoldersRequest';
import { Notificationsv3GetFoldersResponse } from '../models/Notificationsv3GetFoldersResponse';
import { Notificationsv3GetNotificationFilenameResponse } from '../models/Notificationsv3GetNotificationFilenameResponse';
import { Notificationsv3GetNotificationRecordResponse } from '../models/Notificationsv3GetNotificationRecordResponse';
import { Notificationsv3GetNotificationRecordsResponse } from '../models/Notificationsv3GetNotificationRecordsResponse';
import { Notificationsv3GetTicketStatusResponse } from '../models/Notificationsv3GetTicketStatusResponse';
import { Notificationsv3NotificationRecord } from '../models/Notificationsv3NotificationRecord';
import { Notificationsv3NotificationRecordsFilter } from '../models/Notificationsv3NotificationRecordsFilter';
import { Notificationsv3NotificationSeverity } from '../models/Notificationsv3NotificationSeverity';
import { Notificationsv3NotificationState } from '../models/Notificationsv3NotificationState';
import { Notificationsv3Origin } from '../models/Notificationsv3Origin';
import { Notificationsv3PipelineQueryOperator } from '../models/Notificationsv3PipelineQueryOperator';
import { Notificationsv3PostNotificationRecordRequest } from '../models/Notificationsv3PostNotificationRecordRequest';
import { Notificationsv3PostNotificationRecordResponse } from '../models/Notificationsv3PostNotificationRecordResponse';
import { Notificationsv3PutNotificationRecordResponse } from '../models/Notificationsv3PutNotificationRecordResponse';
import { Notificationsv3SearchNotificationRecordsRequest } from '../models/Notificationsv3SearchNotificationRecordsRequest';
import { Notificationsv3SearchNotificationRecordsResponse } from '../models/Notificationsv3SearchNotificationRecordsResponse';
import { Notificationsv3TemplateProperty } from '../models/Notificationsv3TemplateProperty';
import { Notificationsv3TestIntegrationRequest } from '../models/Notificationsv3TestIntegrationRequest';
import { Notificationsv3TestIntegrationResponse } from '../models/Notificationsv3TestIntegrationResponse';
import { Notificationsv3UpdateNotificationRecordRequest } from '../models/Notificationsv3UpdateNotificationRecordRequest';
import { Notificationsv3UpdateNotificationRecordResponse } from '../models/Notificationsv3UpdateNotificationRecordResponse';
import { Office365TenantInfo } from '../models/Office365TenantInfo';
import { Operator } from '../models/Operator';
import { Outliersenginev3AnalysisPerformanceStats } from '../models/Outliersenginev3AnalysisPerformanceStats';
import { Outliersenginev3AnalysisStatisticsMessage } from '../models/Outliersenginev3AnalysisStatisticsMessage';
import { Outliersenginev3AttributeStatistics } from '../models/Outliersenginev3AttributeStatistics';
import { Outliersenginev3DatasourcesCoverageStats } from '../models/Outliersenginev3DatasourcesCoverageStats';
import { Outliersenginev3GetSourceStatisticsResponse } from '../models/Outliersenginev3GetSourceStatisticsResponse';
import { Outliersenginev3GetWorkingHoursPeriodsResponse } from '../models/Outliersenginev3GetWorkingHoursPeriodsResponse';
import { Outliersenginev3OutlierResponse } from '../models/Outliersenginev3OutlierResponse';
import { Outliersenginev3OutlierTypeStats } from '../models/Outliersenginev3OutlierTypeStats';
import { Outliersenginev3OutliersStats } from '../models/Outliersenginev3OutliersStats';
import { Outliersenginev3QueueStatisticsMessage } from '../models/Outliersenginev3QueueStatisticsMessage';
import { Outliersenginev3RunSimulatorRequest } from '../models/Outliersenginev3RunSimulatorRequest';
import { Outliersenginev3Source } from '../models/Outliersenginev3Source';
import { Outliersenginev3SourceAttributeType } from '../models/Outliersenginev3SourceAttributeType';
import { Outliersenginev3SourceAttributesStatistics } from '../models/Outliersenginev3SourceAttributesStatistics';
import { Outliersenginev3SourcesStats } from '../models/Outliersenginev3SourcesStats';
import { Outliersenginev3StatisticsResponse } from '../models/Outliersenginev3StatisticsResponse';
import { Outliersenginev3UpdateWorkingHoursPeriodsRequest } from '../models/Outliersenginev3UpdateWorkingHoursPeriodsRequest';
import { Outliersenginev3WorkingHoursPeriod } from '../models/Outliersenginev3WorkingHoursPeriod';
import { PermissionsConfigurations } from '../models/PermissionsConfigurations';
import { Pipelineconfigv3DeleteTenantResponse } from '../models/Pipelineconfigv3DeleteTenantResponse';
import { Policybuilderv3Action } from '../models/Policybuilderv3Action';
import { Policybuilderv3ActionMetadata } from '../models/Policybuilderv3ActionMetadata';
import { Policybuilderv3ActionNotificationObject } from '../models/Policybuilderv3ActionNotificationObject';
import { Policybuilderv3ActionParameter } from '../models/Policybuilderv3ActionParameter';
import { Policybuilderv3ActionParameterMetadata } from '../models/Policybuilderv3ActionParameterMetadata';
import { Policybuilderv3ActionType } from '../models/Policybuilderv3ActionType';
import { Policybuilderv3ActivationStatus } from '../models/Policybuilderv3ActivationStatus';
import { Policybuilderv3ClonePolicyRequest } from '../models/Policybuilderv3ClonePolicyRequest';
import { Policybuilderv3ControlFlow } from '../models/Policybuilderv3ControlFlow';
import { Policybuilderv3CreateUpdatePolicyRequest } from '../models/Policybuilderv3CreateUpdatePolicyRequest';
import { Policybuilderv3CreateUpdatePolicyResponse } from '../models/Policybuilderv3CreateUpdatePolicyResponse';
import { Policybuilderv3DeleteGdpPolicySyncResponse } from '../models/Policybuilderv3DeleteGdpPolicySyncResponse';
import { Policybuilderv3EdgeActivationObject } from '../models/Policybuilderv3EdgeActivationObject';
import { Policybuilderv3GDPSyncEntry } from '../models/Policybuilderv3GDPSyncEntry';
import { Policybuilderv3GdpPolicyObject } from '../models/Policybuilderv3GdpPolicyObject';
import { Policybuilderv3GdpPolicyObjectWithCm } from '../models/Policybuilderv3GdpPolicyObjectWithCm';
import { Policybuilderv3GdpPolicySyncRes } from '../models/Policybuilderv3GdpPolicySyncRes';
import { Policybuilderv3GetGdpPolicyMetaDataResponse } from '../models/Policybuilderv3GetGdpPolicyMetaDataResponse';
import { Policybuilderv3GetIntegrationCheckResponse } from '../models/Policybuilderv3GetIntegrationCheckResponse';
import { Policybuilderv3GetPoliciesGroupsResponse } from '../models/Policybuilderv3GetPoliciesGroupsResponse';
import { Policybuilderv3GetPoliciesResponse } from '../models/Policybuilderv3GetPoliciesResponse';
import { Policybuilderv3GetPolicyDetailsResponse } from '../models/Policybuilderv3GetPolicyDetailsResponse';
import { Policybuilderv3GetPolicyNamesFromRuleIDsRequest } from '../models/Policybuilderv3GetPolicyNamesFromRuleIDsRequest';
import { Policybuilderv3GetPolicyNamesFromRuleIDsResponse } from '../models/Policybuilderv3GetPolicyNamesFromRuleIDsResponse';
import { Policybuilderv3GetPolicySyncListResponse } from '../models/Policybuilderv3GetPolicySyncListResponse';
import { Policybuilderv3GetPolicyVersionResponse } from '../models/Policybuilderv3GetPolicyVersionResponse';
import { Policybuilderv3GetPolicyVersionsInfoResponse } from '../models/Policybuilderv3GetPolicyVersionsInfoResponse';
import { Policybuilderv3GetReceiversResponse } from '../models/Policybuilderv3GetReceiversResponse';
import { Policybuilderv3GetRuleValidationRequest } from '../models/Policybuilderv3GetRuleValidationRequest';
import { Policybuilderv3ImportIssue } from '../models/Policybuilderv3ImportIssue';
import { Policybuilderv3ImportState } from '../models/Policybuilderv3ImportState';
import { Policybuilderv3InsertGdpPolicyMetaDataRequest } from '../models/Policybuilderv3InsertGdpPolicyMetaDataRequest';
import { Policybuilderv3InsertGdpPolicyMetaDataResponse } from '../models/Policybuilderv3InsertGdpPolicyMetaDataResponse';
import { Policybuilderv3InsertGdpPolicySyncRequest } from '../models/Policybuilderv3InsertGdpPolicySyncRequest';
import { Policybuilderv3InsertGdpPolicySyncResponse } from '../models/Policybuilderv3InsertGdpPolicySyncResponse';
import { Policybuilderv3InstallPoliciesRequest } from '../models/Policybuilderv3InstallPoliciesRequest';
import { Policybuilderv3InstallationAndSequenceObject } from '../models/Policybuilderv3InstallationAndSequenceObject';
import { Policybuilderv3ParameterOperator } from '../models/Policybuilderv3ParameterOperator';
import { Policybuilderv3ParameterRelationShip } from '../models/Policybuilderv3ParameterRelationShip';
import { Policybuilderv3Policy } from '../models/Policybuilderv3Policy';
import { Policybuilderv3PolicyDetailsForGroups } from '../models/Policybuilderv3PolicyDetailsForGroups';
import { Policybuilderv3PolicyGroups } from '../models/Policybuilderv3PolicyGroups';
import { Policybuilderv3PolicyType } from '../models/Policybuilderv3PolicyType';
import { Policybuilderv3PolicyUpdate } from '../models/Policybuilderv3PolicyUpdate';
import { Policybuilderv3PossibleValueObj } from '../models/Policybuilderv3PossibleValueObj';
import { Policybuilderv3ProductType } from '../models/Policybuilderv3ProductType';
import { Policybuilderv3RecipientType } from '../models/Policybuilderv3RecipientType';
import { Policybuilderv3Rule } from '../models/Policybuilderv3Rule';
import { Policybuilderv3RuleMetadataResponse } from '../models/Policybuilderv3RuleMetadataResponse';
import { Policybuilderv3RuleParameter } from '../models/Policybuilderv3RuleParameter';
import { Policybuilderv3RuleParameterMetadata } from '../models/Policybuilderv3RuleParameterMetadata';
import { Policybuilderv3RuleSeverity } from '../models/Policybuilderv3RuleSeverity';
import { Policybuilderv3RuleType } from '../models/Policybuilderv3RuleType';
import { Policybuilderv3StandardCRUDResponse } from '../models/Policybuilderv3StandardCRUDResponse';
import { Policybuilderv3StatusResponseBase } from '../models/Policybuilderv3StatusResponseBase';
import { Policybuilderv3StorePolicyGdpRequest } from '../models/Policybuilderv3StorePolicyGdpRequest';
import { Policybuilderv3StorePolicyGdpResponse } from '../models/Policybuilderv3StorePolicyGdpResponse';
import { Policybuilderv3SyncStatusType } from '../models/Policybuilderv3SyncStatusType';
import { Policybuilderv3TargetReceiver } from '../models/Policybuilderv3TargetReceiver';
import { Policybuilderv3VersionInfo } from '../models/Policybuilderv3VersionInfo';
import { PotentialFlow } from '../models/PotentialFlow';
import { PotentialFlowListItem } from '../models/PotentialFlowListItem';
import { PotentialFlowPath } from '../models/PotentialFlowPath';
import { PotentialFlowPathListItem } from '../models/PotentialFlowPathListItem';
import { PotentialFlowType } from '../models/PotentialFlowType';
import { PotentialFlowsFilterOptions } from '../models/PotentialFlowsFilterOptions';
import { PotentialFlowsPathsFilterOptions } from '../models/PotentialFlowsPathsFilterOptions';
import { PotentialFlowsSummary } from '../models/PotentialFlowsSummary';
import { ProtobufAny } from '../models/ProtobufAny';
import { ProtobufFieldMask } from '../models/ProtobufFieldMask';
import { ProtobufNullValue } from '../models/ProtobufNullValue';
import { Qsdataloaderv3QSfileValidatorExternalParamRequest } from '../models/Qsdataloaderv3QSfileValidatorExternalParamRequest';
import { Qsdataloaderv3QSfileValidatorRequest } from '../models/Qsdataloaderv3QSfileValidatorRequest';
import { Qsdataloaderv3QSfileValidatorResonse } from '../models/Qsdataloaderv3QSfileValidatorResonse';
import { Qsdataloaderv3QSyntheticDataLoaderResonse } from '../models/Qsdataloaderv3QSyntheticDataLoaderResonse';
import { Qspmdatamanagerv3AppData } from '../models/Qspmdatamanagerv3AppData';
import { Qspmdatamanagerv3AppDataResponse } from '../models/Qspmdatamanagerv3AppDataResponse';
import { Qspmdatamanagerv3MasterDataModel } from '../models/Qspmdatamanagerv3MasterDataModel';
import { Qspmdatamanagerv3MasterDataResponse } from '../models/Qspmdatamanagerv3MasterDataResponse';
import { Qspmdatamanagerv3NetlocData } from '../models/Qspmdatamanagerv3NetlocData';
import { Qspmdatamanagerv3NetlocDataResponse } from '../models/Qspmdatamanagerv3NetlocDataResponse';
import { Qspmdatamanagerv3PluginDataModel } from '../models/Qspmdatamanagerv3PluginDataModel';
import { Qspmdatamanagerv3PluginDataResponse } from '../models/Qspmdatamanagerv3PluginDataResponse';
import { Qspmdatamanagerv3Row } from '../models/Qspmdatamanagerv3Row';
import { Qspmdatamanagerv3ScanRequest } from '../models/Qspmdatamanagerv3ScanRequest';
import { Qspmdatamanagerv3ScanResponse } from '../models/Qspmdatamanagerv3ScanResponse';
import { Qspmdatamanagerv3SearchEntityDataResponse } from '../models/Qspmdatamanagerv3SearchEntityDataResponse';
import { Qspmdatamanagerv3UpdateNetLocResponse } from '../models/Qspmdatamanagerv3UpdateNetLocResponse';
import { Qspmpluginmanagerv3EntityNewSchema } from '../models/Qspmpluginmanagerv3EntityNewSchema';
import { Qspmpluginmanagerv3PluginRQ } from '../models/Qspmpluginmanagerv3PluginRQ';
import { Qspmpluginmanagerv3PluginRS } from '../models/Qspmpluginmanagerv3PluginRS';
import { Qspmpluginmanagerv3PolicyPluginRQ } from '../models/Qspmpluginmanagerv3PolicyPluginRQ';
import { Qspmpluginmanagerv3PolicyPluginRS } from '../models/Qspmpluginmanagerv3PolicyPluginRS';
import { Qspmpluginmanagerv3ValidationResult } from '../models/Qspmpluginmanagerv3ValidationResult';
import { Qspmpolicymanagerv3APIResonse } from '../models/Qspmpolicymanagerv3APIResonse';
import { Qspmpolicymanagerv3CreateTicketRequest } from '../models/Qspmpolicymanagerv3CreateTicketRequest';
import { Qspmpolicymanagerv3CreateTicketResponse } from '../models/Qspmpolicymanagerv3CreateTicketResponse';
import { Qspmpolicymanagerv3FetchObjectStoreFileResponse } from '../models/Qspmpolicymanagerv3FetchObjectStoreFileResponse';
import { Qspmpolicymanagerv3FileName } from '../models/Qspmpolicymanagerv3FileName';
import { Qspmpolicymanagerv3NotificationSeverity } from '../models/Qspmpolicymanagerv3NotificationSeverity';
import { Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest } from '../models/Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest';
import { Qspmpolicymanagerv3ProcessPolicyDimentionRecordsResonse } from '../models/Qspmpolicymanagerv3ProcessPolicyDimentionRecordsResonse';
import { Qspmpolicymanagerv3StandardEmptyResponse } from '../models/Qspmpolicymanagerv3StandardEmptyResponse';
import { Qspmpolicymanagerv3UpdateConfigsRequest } from '../models/Qspmpolicymanagerv3UpdateConfigsRequest';
import { Qspmpolicymanagerv3UpdateTicketStatusRequest } from '../models/Qspmpolicymanagerv3UpdateTicketStatusRequest';
import { Qspmpolicymanagerv3UpdateTicketStatusResponse } from '../models/Qspmpolicymanagerv3UpdateTicketStatusResponse';
import { QuestionType } from '../models/QuestionType';
import { RemoveAccountsInstructions200Response } from '../models/RemoveAccountsInstructions200Response';
import { RemoveResource200Response } from '../models/RemoveResource200Response';
import { ReportGroupsReport } from '../models/ReportGroupsReport';
import { Reportsrunnerv3ActiveQuery } from '../models/Reportsrunnerv3ActiveQuery';
import { Reportsrunnerv3DataRow } from '../models/Reportsrunnerv3DataRow';
import { Reportsrunnerv3ExportJobStatus } from '../models/Reportsrunnerv3ExportJobStatus';
import { Reportsrunnerv3FileType } from '../models/Reportsrunnerv3FileType';
import { Reportsrunnerv3Filter } from '../models/Reportsrunnerv3Filter';
import { Reportsrunnerv3FilterHeaders } from '../models/Reportsrunnerv3FilterHeaders';
import { Reportsrunnerv3GetActiveQueriesRequest } from '../models/Reportsrunnerv3GetActiveQueriesRequest';
import { Reportsrunnerv3GetActiveQueriesResponse } from '../models/Reportsrunnerv3GetActiveQueriesResponse';
import { Reportsrunnerv3GetAuditDataCountRequest } from '../models/Reportsrunnerv3GetAuditDataCountRequest';
import { Reportsrunnerv3GetChartDataRequest } from '../models/Reportsrunnerv3GetChartDataRequest';
import { Reportsrunnerv3GetChartDataRequestv2 } from '../models/Reportsrunnerv3GetChartDataRequestv2';
import { Reportsrunnerv3GetChartDataResponse } from '../models/Reportsrunnerv3GetChartDataResponse';
import { Reportsrunnerv3GetChartDataResponsev2 } from '../models/Reportsrunnerv3GetChartDataResponsev2';
import { Reportsrunnerv3GetExportReportJobStatusResponse } from '../models/Reportsrunnerv3GetExportReportJobStatusResponse';
import { Reportsrunnerv3GetReportColumnFacetRequest } from '../models/Reportsrunnerv3GetReportColumnFacetRequest';
import { Reportsrunnerv3GetReportColumnFacetResponse } from '../models/Reportsrunnerv3GetReportColumnFacetResponse';
import { Reportsrunnerv3GetReportDataCountRequest } from '../models/Reportsrunnerv3GetReportDataCountRequest';
import { Reportsrunnerv3GetReportDataCountResponse } from '../models/Reportsrunnerv3GetReportDataCountResponse';
import { Reportsrunnerv3JobType } from '../models/Reportsrunnerv3JobType';
import { Reportsrunnerv3RunAuditReportRequest } from '../models/Reportsrunnerv3RunAuditReportRequest';
import { Reportsrunnerv3RunReportRequest } from '../models/Reportsrunnerv3RunReportRequest';
import { Reportsrunnerv3RunReportResponse } from '../models/Reportsrunnerv3RunReportResponse';
import { Reportsrunnerv3StopExportReportJobResponse } from '../models/Reportsrunnerv3StopExportReportJobResponse';
import { Reportsrunnerv3StopQueryRequest } from '../models/Reportsrunnerv3StopQueryRequest';
import { Reportsrunnerv3StopQueryResponse } from '../models/Reportsrunnerv3StopQueryResponse';
import { Reportsrunnerv3WriteResultsToFileResponse } from '../models/Reportsrunnerv3WriteResultsToFileResponse';
import { Reportsrunnerv3WriteResultsToGroupResponse } from '../models/Reportsrunnerv3WriteResultsToGroupResponse';
import { Reportsv3AggregationType } from '../models/Reportsv3AggregationType';
import { Reportsv3Artifact } from '../models/Reportsv3Artifact';
import { Reportsv3ArtifactType } from '../models/Reportsv3ArtifactType';
import { Reportsv3BriefReport } from '../models/Reportsv3BriefReport';
import { Reportsv3Category } from '../models/Reportsv3Category';
import { Reportsv3CategoryDetail } from '../models/Reportsv3CategoryDetail';
import { Reportsv3CategoryField } from '../models/Reportsv3CategoryField';
import { Reportsv3CategoryVersion } from '../models/Reportsv3CategoryVersion';
import { Reportsv3ChartDisplayLayout } from '../models/Reportsv3ChartDisplayLayout';
import { Reportsv3ChartSettings } from '../models/Reportsv3ChartSettings';
import { Reportsv3ChartSettingsv2 } from '../models/Reportsv3ChartSettingsv2';
import { Reportsv3ChartType } from '../models/Reportsv3ChartType';
import { Reportsv3ContributionPointersInfoObject } from '../models/Reportsv3ContributionPointersInfoObject';
import { Reportsv3Control } from '../models/Reportsv3Control';
import { Reportsv3CreateCategoryRequest } from '../models/Reportsv3CreateCategoryRequest';
import { Reportsv3CreateCategoryResponse } from '../models/Reportsv3CreateCategoryResponse';
import { Reportsv3CreateChartRequest } from '../models/Reportsv3CreateChartRequest';
import { Reportsv3CreateChartResponse } from '../models/Reportsv3CreateChartResponse';
import { Reportsv3CreateChartTemplatev2Request } from '../models/Reportsv3CreateChartTemplatev2Request';
import { Reportsv3CreateChartTemplatev2Response } from '../models/Reportsv3CreateChartTemplatev2Response';
import { Reportsv3CreateChartv2Request } from '../models/Reportsv3CreateChartv2Request';
import { Reportsv3CreateChartv2Response } from '../models/Reportsv3CreateChartv2Response';
import { Reportsv3CreateControlRequest } from '../models/Reportsv3CreateControlRequest';
import { Reportsv3CreateControlResponse } from '../models/Reportsv3CreateControlResponse';
import { Reportsv3CreateFieldsByCategoryRequest } from '../models/Reportsv3CreateFieldsByCategoryRequest';
import { Reportsv3CreateFieldsByCategoryResponse } from '../models/Reportsv3CreateFieldsByCategoryResponse';
import { Reportsv3CreateGradeRequest } from '../models/Reportsv3CreateGradeRequest';
import { Reportsv3CreateGradeResponse } from '../models/Reportsv3CreateGradeResponse';
import { Reportsv3CreateJoinRequest } from '../models/Reportsv3CreateJoinRequest';
import { Reportsv3CreateJoinResponse } from '../models/Reportsv3CreateJoinResponse';
import { Reportsv3CreateMeasureRequest } from '../models/Reportsv3CreateMeasureRequest';
import { Reportsv3CreateMeasureResponse } from '../models/Reportsv3CreateMeasureResponse';
import { Reportsv3CreateMetricRequest } from '../models/Reportsv3CreateMetricRequest';
import { Reportsv3CreateMetricResponse } from '../models/Reportsv3CreateMetricResponse';
import { Reportsv3CreateProgramRequest } from '../models/Reportsv3CreateProgramRequest';
import { Reportsv3CreateProgramResponse } from '../models/Reportsv3CreateProgramResponse';
import { Reportsv3CreateReportRequest } from '../models/Reportsv3CreateReportRequest';
import { Reportsv3CreateReportResponse } from '../models/Reportsv3CreateReportResponse';
import { Reportsv3CreateRequirementRequest } from '../models/Reportsv3CreateRequirementRequest';
import { Reportsv3CreateRequirementResponse } from '../models/Reportsv3CreateRequirementResponse';
import { Reportsv3CreateVariantRequest } from '../models/Reportsv3CreateVariantRequest';
import { Reportsv3CreateVariantResponse } from '../models/Reportsv3CreateVariantResponse';
import { Reportsv3CustomChartTemplatev2 } from '../models/Reportsv3CustomChartTemplatev2';
import { Reportsv3DateRange } from '../models/Reportsv3DateRange';
import { Reportsv3DateRangeType } from '../models/Reportsv3DateRangeType';
import { Reportsv3DateRangeUnit } from '../models/Reportsv3DateRangeUnit';
import { Reportsv3DeleteCategoryResponse } from '../models/Reportsv3DeleteCategoryResponse';
import { Reportsv3DeleteChartResponse } from '../models/Reportsv3DeleteChartResponse';
import { Reportsv3DeleteChartTemplatev2Response } from '../models/Reportsv3DeleteChartTemplatev2Response';
import { Reportsv3DeleteChartv2Response } from '../models/Reportsv3DeleteChartv2Response';
import { Reportsv3DeleteControlRequest } from '../models/Reportsv3DeleteControlRequest';
import { Reportsv3DeleteControlResponse } from '../models/Reportsv3DeleteControlResponse';
import { Reportsv3DeleteFieldsByCategoryResponse } from '../models/Reportsv3DeleteFieldsByCategoryResponse';
import { Reportsv3DeleteGradeRequest } from '../models/Reportsv3DeleteGradeRequest';
import { Reportsv3DeleteGradeResponse } from '../models/Reportsv3DeleteGradeResponse';
import { Reportsv3DeleteJoinResponse } from '../models/Reportsv3DeleteJoinResponse';
import { Reportsv3DeleteMeasureRequest } from '../models/Reportsv3DeleteMeasureRequest';
import { Reportsv3DeleteMeasureResponse } from '../models/Reportsv3DeleteMeasureResponse';
import { Reportsv3DeleteMetricRequest } from '../models/Reportsv3DeleteMetricRequest';
import { Reportsv3DeleteMetricResponse } from '../models/Reportsv3DeleteMetricResponse';
import { Reportsv3DeleteProgramRequest } from '../models/Reportsv3DeleteProgramRequest';
import { Reportsv3DeleteProgramResponse } from '../models/Reportsv3DeleteProgramResponse';
import { Reportsv3DeleteReportResponse } from '../models/Reportsv3DeleteReportResponse';
import { Reportsv3DeleteRequirementRequest } from '../models/Reportsv3DeleteRequirementRequest';
import { Reportsv3DeleteRequirementResponse } from '../models/Reportsv3DeleteRequirementResponse';
import { Reportsv3DeleteVariantResponse } from '../models/Reportsv3DeleteVariantResponse';
import { Reportsv3DisplayHeader } from '../models/Reportsv3DisplayHeader';
import { Reportsv3FieldName } from '../models/Reportsv3FieldName';
import { Reportsv3Filter } from '../models/Reportsv3Filter';
import { Reportsv3FilterHeaders } from '../models/Reportsv3FilterHeaders';
import { Reportsv3GetCategoriesResponse } from '../models/Reportsv3GetCategoriesResponse';
import { Reportsv3GetChartQueryResponse } from '../models/Reportsv3GetChartQueryResponse';
import { Reportsv3GetChartQueryResponsev2 } from '../models/Reportsv3GetChartQueryResponsev2';
import { Reportsv3GetChartSettingsResponse } from '../models/Reportsv3GetChartSettingsResponse';
import { Reportsv3GetChartSettingsv2Response } from '../models/Reportsv3GetChartSettingsv2Response';
import { Reportsv3GetChartTemplatesv2Response } from '../models/Reportsv3GetChartTemplatesv2Response';
import { Reportsv3GetControlsResponse } from '../models/Reportsv3GetControlsResponse';
import { Reportsv3GetFieldsByCategoriesResponse } from '../models/Reportsv3GetFieldsByCategoriesResponse';
import { Reportsv3GetFieldsByCategoryResponse } from '../models/Reportsv3GetFieldsByCategoryResponse';
import { Reportsv3GetGradesResponse } from '../models/Reportsv3GetGradesResponse';
import { Reportsv3GetJoinsResponse } from '../models/Reportsv3GetJoinsResponse';
import { Reportsv3GetMeasuresResponse } from '../models/Reportsv3GetMeasuresResponse';
import { Reportsv3GetMetricsResponse } from '../models/Reportsv3GetMetricsResponse';
import { Reportsv3GetProgramsResponse } from '../models/Reportsv3GetProgramsResponse';
import { Reportsv3GetQueryByReportDefinitionRequest } from '../models/Reportsv3GetQueryByReportDefinitionRequest';
import { Reportsv3GetQueryByReportIDRequest } from '../models/Reportsv3GetQueryByReportIDRequest';
import { Reportsv3GetReportDefinitionResponse } from '../models/Reportsv3GetReportDefinitionResponse';
import { Reportsv3GetReportGroupsResponse } from '../models/Reportsv3GetReportGroupsResponse';
import { Reportsv3GetReportQueryResponse } from '../models/Reportsv3GetReportQueryResponse';
import { Reportsv3GetReportSynopsisResponse } from '../models/Reportsv3GetReportSynopsisResponse';
import { Reportsv3GetReportTimestampHeaderResponse } from '../models/Reportsv3GetReportTimestampHeaderResponse';
import { Reportsv3GetReportsForJoinResponse } from '../models/Reportsv3GetReportsForJoinResponse';
import { Reportsv3GetReportsResponse } from '../models/Reportsv3GetReportsResponse';
import { Reportsv3GetReportsTagsResponse } from '../models/Reportsv3GetReportsTagsResponse';
import { Reportsv3GetRequirementsResponse } from '../models/Reportsv3GetRequirementsResponse';
import { Reportsv3GetVariantResponse } from '../models/Reportsv3GetVariantResponse';
import { Reportsv3GetVariantsResponse } from '../models/Reportsv3GetVariantsResponse';
import { Reportsv3Grade } from '../models/Reportsv3Grade';
import { Reportsv3GradeThreshold } from '../models/Reportsv3GradeThreshold';
import { Reportsv3Header } from '../models/Reportsv3Header';
import { Reportsv3HeaderDataType } from '../models/Reportsv3HeaderDataType';
import { Reportsv3HeaderDescription } from '../models/Reportsv3HeaderDescription';
import { Reportsv3HeaderPair } from '../models/Reportsv3HeaderPair';
import { Reportsv3HeaderType } from '../models/Reportsv3HeaderType';
import { Reportsv3InReportAdditionalParameter } from '../models/Reportsv3InReportAdditionalParameter';
import { Reportsv3JobType } from '../models/Reportsv3JobType';
import { Reportsv3JoinDefinition } from '../models/Reportsv3JoinDefinition';
import { Reportsv3JoinDefinitionWithID } from '../models/Reportsv3JoinDefinitionWithID';
import { Reportsv3Literal } from '../models/Reportsv3Literal';
import { Reportsv3Measure } from '../models/Reportsv3Measure';
import { Reportsv3MeasureType } from '../models/Reportsv3MeasureType';
import { Reportsv3Metric } from '../models/Reportsv3Metric';
import { Reportsv3MetricType } from '../models/Reportsv3MetricType';
import { Reportsv3MetricsColumn } from '../models/Reportsv3MetricsColumn';
import { Reportsv3ModelType } from '../models/Reportsv3ModelType';
import { Reportsv3OperatorType } from '../models/Reportsv3OperatorType';
import { Reportsv3OptionType } from '../models/Reportsv3OptionType';
import { Reportsv3OrderBy } from '../models/Reportsv3OrderBy';
import { Reportsv3ParameterType } from '../models/Reportsv3ParameterType';
import { Reportsv3PartialChartUpdateRequest } from '../models/Reportsv3PartialChartUpdateRequest';
import { Reportsv3PartialChartUpdateResponse } from '../models/Reportsv3PartialChartUpdateResponse';
import { Reportsv3PartialReportUpdateRequest } from '../models/Reportsv3PartialReportUpdateRequest';
import { Reportsv3PartialReportUpdateResponse } from '../models/Reportsv3PartialReportUpdateResponse';
import { Reportsv3Program } from '../models/Reportsv3Program';
import { Reportsv3ReportAggFilter } from '../models/Reportsv3ReportAggFilter';
import { Reportsv3ReportAggFilterCondition } from '../models/Reportsv3ReportAggFilterCondition';
import { Reportsv3ReportDefinition } from '../models/Reportsv3ReportDefinition';
import { Reportsv3ReportDisplayLayout } from '../models/Reportsv3ReportDisplayLayout';
import { Reportsv3ReportFilter } from '../models/Reportsv3ReportFilter';
import { Reportsv3ReportFilterBrackets } from '../models/Reportsv3ReportFilterBrackets';
import { Reportsv3ReportFilterCondition } from '../models/Reportsv3ReportFilterCondition';
import { Reportsv3ReportHeader } from '../models/Reportsv3ReportHeader';
import { Reportsv3ReportResult } from '../models/Reportsv3ReportResult';
import { Reportsv3ReportTag } from '../models/Reportsv3ReportTag';
import { Reportsv3ReportUsedInJoin } from '../models/Reportsv3ReportUsedInJoin';
import { Reportsv3Requirement } from '../models/Reportsv3Requirement';
import { Reportsv3RunGradesRequest } from '../models/Reportsv3RunGradesRequest';
import { Reportsv3RunGradesResponse } from '../models/Reportsv3RunGradesResponse';
import { Reportsv3RunReportResponse } from '../models/Reportsv3RunReportResponse';
import { Reportsv3RunTimeParameter } from '../models/Reportsv3RunTimeParameter';
import { Reportsv3RunVariantOperationRequest } from '../models/Reportsv3RunVariantOperationRequest';
import { Reportsv3RunVariantOperationResponse } from '../models/Reportsv3RunVariantOperationResponse';
import { Reportsv3SqlType } from '../models/Reportsv3SqlType';
import { Reportsv3TableNames } from '../models/Reportsv3TableNames';
import { Reportsv3TimestampMapping } from '../models/Reportsv3TimestampMapping';
import { Reportsv3TransposeRequest } from '../models/Reportsv3TransposeRequest';
import { Reportsv3UpdateChartRequest } from '../models/Reportsv3UpdateChartRequest';
import { Reportsv3UpdateChartResponse } from '../models/Reportsv3UpdateChartResponse';
import { Reportsv3UpdateChartv2Request } from '../models/Reportsv3UpdateChartv2Request';
import { Reportsv3UpdateChartv2Response } from '../models/Reportsv3UpdateChartv2Response';
import { Reportsv3UpdateControlRequest } from '../models/Reportsv3UpdateControlRequest';
import { Reportsv3UpdateControlResponse } from '../models/Reportsv3UpdateControlResponse';
import { Reportsv3UpdateGradeRequest } from '../models/Reportsv3UpdateGradeRequest';
import { Reportsv3UpdateGradeResponse } from '../models/Reportsv3UpdateGradeResponse';
import { Reportsv3UpdateJoinRequest } from '../models/Reportsv3UpdateJoinRequest';
import { Reportsv3UpdateJoinResponse } from '../models/Reportsv3UpdateJoinResponse';
import { Reportsv3UpdateMeasureRequest } from '../models/Reportsv3UpdateMeasureRequest';
import { Reportsv3UpdateMeasureResponse } from '../models/Reportsv3UpdateMeasureResponse';
import { Reportsv3UpdateMetricRequest } from '../models/Reportsv3UpdateMetricRequest';
import { Reportsv3UpdateMetricResponse } from '../models/Reportsv3UpdateMetricResponse';
import { Reportsv3UpdateProgramRequest } from '../models/Reportsv3UpdateProgramRequest';
import { Reportsv3UpdateProgramResponse } from '../models/Reportsv3UpdateProgramResponse';
import { Reportsv3UpdateReportRequest } from '../models/Reportsv3UpdateReportRequest';
import { Reportsv3UpdateReportResponse } from '../models/Reportsv3UpdateReportResponse';
import { Reportsv3UpdateRequirementRequest } from '../models/Reportsv3UpdateRequirementRequest';
import { Reportsv3UpdateRequirementResponse } from '../models/Reportsv3UpdateRequirementResponse';
import { Reportsv3UpdateVariantOverrideRequest } from '../models/Reportsv3UpdateVariantOverrideRequest';
import { Reportsv3UpdateVariantOverrideResponse } from '../models/Reportsv3UpdateVariantOverrideResponse';
import { Reportsv3Variant } from '../models/Reportsv3Variant';
import { Reportsv3VariantDetails } from '../models/Reportsv3VariantDetails';
import { Reportsv3VariantRule } from '../models/Reportsv3VariantRule';
import { Reportsv3VariantRuleCondition } from '../models/Reportsv3VariantRuleCondition';
import { Reportsv3VariantRuleType } from '../models/Reportsv3VariantRuleType';
import { RescanDataStoreRequest } from '../models/RescanDataStoreRequest';
import { ResetPasswordRequest } from '../models/ResetPasswordRequest';
import { Resourcecontrollerk8v3GUCStatefulsetState } from '../models/Resourcecontrollerk8v3GUCStatefulsetState';
import { Resourcecontrollerk8v3TenantGUCCreateResponse } from '../models/Resourcecontrollerk8v3TenantGUCCreateResponse';
import { Resourcecontrollerk8v3TenantGUCStatusResponse } from '../models/Resourcecontrollerk8v3TenantGUCStatusResponse';
import { Resourcecontrollerk8v3TenantLifecycleResponse } from '../models/Resourcecontrollerk8v3TenantLifecycleResponse';
import { Resourcecontrollerk8v3TenantResourceResponse } from '../models/Resourcecontrollerk8v3TenantResourceResponse';
import { Riskanalyticscontrollerv3Action } from '../models/Riskanalyticscontrollerv3Action';
import { Riskanalyticscontrollerv3CardSettings } from '../models/Riskanalyticscontrollerv3CardSettings';
import { Riskanalyticscontrollerv3DetailToCount } from '../models/Riskanalyticscontrollerv3DetailToCount';
import { Riskanalyticscontrollerv3EmergingRiskDetails } from '../models/Riskanalyticscontrollerv3EmergingRiskDetails';
import { Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest } from '../models/Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest';
import { Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackResponse } from '../models/Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackResponse';
import { Riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest } from '../models/Riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest';
import { Riskanalyticscontrollerv3EnableDisableRiskEventProcessResponse } from '../models/Riskanalyticscontrollerv3EnableDisableRiskEventProcessResponse';
import { Riskanalyticscontrollerv3ExcludedItem } from '../models/Riskanalyticscontrollerv3ExcludedItem';
import { Riskanalyticscontrollerv3ExcludedItemType } from '../models/Riskanalyticscontrollerv3ExcludedItemType';
import { Riskanalyticscontrollerv3FailedVATests } from '../models/Riskanalyticscontrollerv3FailedVATests';
import { Riskanalyticscontrollerv3Filter } from '../models/Riskanalyticscontrollerv3Filter';
import { Riskanalyticscontrollerv3Finding } from '../models/Riskanalyticscontrollerv3Finding';
import { Riskanalyticscontrollerv3FindingDetails } from '../models/Riskanalyticscontrollerv3FindingDetails';
import { Riskanalyticscontrollerv3FindingDetailsMap } from '../models/Riskanalyticscontrollerv3FindingDetailsMap';
import { Riskanalyticscontrollerv3FindingReferenceLink } from '../models/Riskanalyticscontrollerv3FindingReferenceLink';
import { Riskanalyticscontrollerv3GetAllClassificationsListResponse } from '../models/Riskanalyticscontrollerv3GetAllClassificationsListResponse';
import { Riskanalyticscontrollerv3GetRiskEventClassificationsListResponse } from '../models/Riskanalyticscontrollerv3GetRiskEventClassificationsListResponse';
import { Riskanalyticscontrollerv3GetRiskEventDetailsResponse } from '../models/Riskanalyticscontrollerv3GetRiskEventDetailsResponse';
import { Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse } from '../models/Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse';
import { Riskanalyticscontrollerv3GetRiskEventRowResponse } from '../models/Riskanalyticscontrollerv3GetRiskEventRowResponse';
import { Riskanalyticscontrollerv3GetRiskFeedbackResponse } from '../models/Riskanalyticscontrollerv3GetRiskFeedbackResponse';
import { Riskanalyticscontrollerv3GetRiskObservationDetailsResponse } from '../models/Riskanalyticscontrollerv3GetRiskObservationDetailsResponse';
import { Riskanalyticscontrollerv3GetUserUISettingsResponse } from '../models/Riskanalyticscontrollerv3GetUserUISettingsResponse';
import { Riskanalyticscontrollerv3Indicator } from '../models/Riskanalyticscontrollerv3Indicator';
import { Riskanalyticscontrollerv3Observation } from '../models/Riskanalyticscontrollerv3Observation';
import { Riskanalyticscontrollerv3ObservationReportFilter } from '../models/Riskanalyticscontrollerv3ObservationReportFilter';
import { Riskanalyticscontrollerv3ObservationType } from '../models/Riskanalyticscontrollerv3ObservationType';
import { Riskanalyticscontrollerv3OrderBy } from '../models/Riskanalyticscontrollerv3OrderBy';
import { Riskanalyticscontrollerv3ProcessStatus } from '../models/Riskanalyticscontrollerv3ProcessStatus';
import { Riskanalyticscontrollerv3RiskEvent } from '../models/Riskanalyticscontrollerv3RiskEvent';
import { Riskanalyticscontrollerv3RiskEventFormerHours } from '../models/Riskanalyticscontrollerv3RiskEventFormerHours';
import { Riskanalyticscontrollerv3RiskEventHourlyFindings } from '../models/Riskanalyticscontrollerv3RiskEventHourlyFindings';
import { Riskanalyticscontrollerv3RiskEventSummarizationDataResponse } from '../models/Riskanalyticscontrollerv3RiskEventSummarizationDataResponse';
import { Riskanalyticscontrollerv3RiskEventTuningRequest } from '../models/Riskanalyticscontrollerv3RiskEventTuningRequest';
import { Riskanalyticscontrollerv3RiskEventTuningResponse } from '../models/Riskanalyticscontrollerv3RiskEventTuningResponse';
import { Riskanalyticscontrollerv3RiskEventVulnerabilityAssessmentDetailsResponse } from '../models/Riskanalyticscontrollerv3RiskEventVulnerabilityAssessmentDetailsResponse';
import { Riskanalyticscontrollerv3RiskFeedback } from '../models/Riskanalyticscontrollerv3RiskFeedback';
import { Riskanalyticscontrollerv3RiskObservationDetails } from '../models/Riskanalyticscontrollerv3RiskObservationDetails';
import { Riskanalyticscontrollerv3SetRiskEventStatusRequest } from '../models/Riskanalyticscontrollerv3SetRiskEventStatusRequest';
import { Riskanalyticscontrollerv3SetRiskEventStatusResponse } from '../models/Riskanalyticscontrollerv3SetRiskEventStatusResponse';
import { Riskanalyticscontrollerv3SetUserUISettingsRequest } from '../models/Riskanalyticscontrollerv3SetUserUISettingsRequest';
import { Riskanalyticscontrollerv3SetUserUISettingsResponse } from '../models/Riskanalyticscontrollerv3SetUserUISettingsResponse';
import { Riskanalyticscontrollerv3ShortObservation } from '../models/Riskanalyticscontrollerv3ShortObservation';
import { Riskanalyticscontrollerv3Statistics } from '../models/Riskanalyticscontrollerv3Statistics';
import { Riskanalyticscontrollerv3Status } from '../models/Riskanalyticscontrollerv3Status';
import { Riskanalyticscontrollerv3UpdateRiskFeedbackRequest } from '../models/Riskanalyticscontrollerv3UpdateRiskFeedbackRequest';
import { Riskanalyticscontrollerv3UpdateRiskFeedbackResponse } from '../models/Riskanalyticscontrollerv3UpdateRiskFeedbackResponse';
import { Riskanalyticscontrollerv3UserUISettings } from '../models/Riskanalyticscontrollerv3UserUISettings';
import { Riskanalyticsdataprocessorv3GetRiskContextResponse } from '../models/Riskanalyticsdataprocessorv3GetRiskContextResponse';
import { Riskanalyticsdataprocessorv3GetRiskPredefinedQuestionsResponse } from '../models/Riskanalyticsdataprocessorv3GetRiskPredefinedQuestionsResponse';
import { Riskanalyticsdataprocessorv3Question } from '../models/Riskanalyticsdataprocessorv3Question';
import { Riskanalyticsenginev3AdditionalInfo } from '../models/Riskanalyticsenginev3AdditionalInfo';
import { Riskanalyticsenginev3ClassificationDetails } from '../models/Riskanalyticsenginev3ClassificationDetails';
import { Riskanalyticsenginev3ClassificationMatchDetails } from '../models/Riskanalyticsenginev3ClassificationMatchDetails';
import { Riskanalyticsenginev3ClassificationObservation } from '../models/Riskanalyticsenginev3ClassificationObservation';
import { Riskanalyticsenginev3DatabaseSourceField } from '../models/Riskanalyticsenginev3DatabaseSourceField';
import { Riskanalyticsenginev3Feature } from '../models/Riskanalyticsenginev3Feature';
import { Riskanalyticsenginev3FeatureSet } from '../models/Riskanalyticsenginev3FeatureSet';
import { Riskanalyticsenginev3FieldType } from '../models/Riskanalyticsenginev3FieldType';
import { Riskanalyticsenginev3GenerateFeaturesForRisksGroupResponse } from '../models/Riskanalyticsenginev3GenerateFeaturesForRisksGroupResponse';
import { Riskanalyticsenginev3GenerateLeadsResponse } from '../models/Riskanalyticsenginev3GenerateLeadsResponse';
import { Riskanalyticsenginev3GetLeadGeneratorConfigResponse } from '../models/Riskanalyticsenginev3GetLeadGeneratorConfigResponse';
import { Riskanalyticsenginev3Lead } from '../models/Riskanalyticsenginev3Lead';
import { Riskanalyticsenginev3LeadGeneratorConfig } from '../models/Riskanalyticsenginev3LeadGeneratorConfig';
import { Riskanalyticsenginev3LeadGeneratorConfigParamValue } from '../models/Riskanalyticsenginev3LeadGeneratorConfigParamValue';
import { Riskanalyticsenginev3LeadType } from '../models/Riskanalyticsenginev3LeadType';
import { Riskanalyticsenginev3MethodType } from '../models/Riskanalyticsenginev3MethodType';
import { Riskanalyticsenginev3Pivot } from '../models/Riskanalyticsenginev3Pivot';
import { Riskanalyticsenginev3PivotType } from '../models/Riskanalyticsenginev3PivotType';
import { Riskanalyticsenginev3Risk } from '../models/Riskanalyticsenginev3Risk';
import { Riskanalyticsenginev3SeverityLevel } from '../models/Riskanalyticsenginev3SeverityLevel';
import { Riskanalyticsenginev3UpdateLeadGeneratorConfigRequest } from '../models/Riskanalyticsenginev3UpdateLeadGeneratorConfigRequest';
import { Riskanalyticsenginev3UpdateLeadGeneratorConfigResponse } from '../models/Riskanalyticsenginev3UpdateLeadGeneratorConfigResponse';
import { Riskanalyticsmlclassificationv3ClassModelExplained } from '../models/Riskanalyticsmlclassificationv3ClassModelExplained';
import { Riskanalyticsmlclassificationv3ClassificationDefinition } from '../models/Riskanalyticsmlclassificationv3ClassificationDefinition';
import { Riskanalyticsmlclassificationv3GetClassificationModelResponse } from '../models/Riskanalyticsmlclassificationv3GetClassificationModelResponse';
import { Riskanalyticsmlclassificationv3GetClassificationResponse } from '../models/Riskanalyticsmlclassificationv3GetClassificationResponse';
import { Riskanalyticsmlclassificationv3GetClassificationsListResponse } from '../models/Riskanalyticsmlclassificationv3GetClassificationsListResponse';
import { Riskanalyticsmlclassificationv3ResetModelToDefaultsResponse } from '../models/Riskanalyticsmlclassificationv3ResetModelToDefaultsResponse';
import { Riskanalyticsmlclassificationv3RuleSet } from '../models/Riskanalyticsmlclassificationv3RuleSet';
import { Riskanalyticsmlclassificationv3RuleSetList } from '../models/Riskanalyticsmlclassificationv3RuleSetList';
import { RpcStatus } from '../models/RpcStatus';
import { RunGDPReportRequestSortOrder } from '../models/RunGDPReportRequestSortOrder';
import { RuntimeError } from '../models/RuntimeError';
import { RuntimeStreamError } from '../models/RuntimeStreamError';
import { Schedulerv3AuditType } from '../models/Schedulerv3AuditType';
import { Schedulerv3ConfigurationItem } from '../models/Schedulerv3ConfigurationItem';
import { Schedulerv3CreateScheduledJobRequest } from '../models/Schedulerv3CreateScheduledJobRequest';
import { Schedulerv3CreateScheduledJobResponse } from '../models/Schedulerv3CreateScheduledJobResponse';
import { Schedulerv3DayOfWeek } from '../models/Schedulerv3DayOfWeek';
import { Schedulerv3DayOrder } from '../models/Schedulerv3DayOrder';
import { Schedulerv3DeleteScheduledJobResponse } from '../models/Schedulerv3DeleteScheduledJobResponse';
import { Schedulerv3DeliveryMethod } from '../models/Schedulerv3DeliveryMethod';
import { Schedulerv3Dependency } from '../models/Schedulerv3Dependency';
import { Schedulerv3ExecutionStatus } from '../models/Schedulerv3ExecutionStatus';
import { Schedulerv3FileFormat } from '../models/Schedulerv3FileFormat';
import { Schedulerv3Frequency } from '../models/Schedulerv3Frequency';
import { Schedulerv3GetDependenciesResponse } from '../models/Schedulerv3GetDependenciesResponse';
import { Schedulerv3GetDistributionRulesResponse } from '../models/Schedulerv3GetDistributionRulesResponse';
import { Schedulerv3GetScheduledJobResponse } from '../models/Schedulerv3GetScheduledJobResponse';
import { Schedulerv3GetSchedulesByReportRequest } from '../models/Schedulerv3GetSchedulesByReportRequest';
import { Schedulerv3GetSchedulesByReportResponse } from '../models/Schedulerv3GetSchedulesByReportResponse';
import { Schedulerv3GetTagsResponse } from '../models/Schedulerv3GetTagsResponse';
import { Schedulerv3IntegrationParameter } from '../models/Schedulerv3IntegrationParameter';
import { Schedulerv3Month } from '../models/Schedulerv3Month';
import { Schedulerv3NotificationType } from '../models/Schedulerv3NotificationType';
import { Schedulerv3Recipient } from '../models/Schedulerv3Recipient';
import { Schedulerv3RecipientType } from '../models/Schedulerv3RecipientType';
import { Schedulerv3RepeatBegin } from '../models/Schedulerv3RepeatBegin';
import { Schedulerv3RepeatEnd } from '../models/Schedulerv3RepeatEnd';
import { Schedulerv3ReportArray } from '../models/Schedulerv3ReportArray';
import { Schedulerv3ReportParameter } from '../models/Schedulerv3ReportParameter';
import { Schedulerv3Retention } from '../models/Schedulerv3Retention';
import { Schedulerv3ScheduledJob } from '../models/Schedulerv3ScheduledJob';
import { Schedulerv3ScheduledJobRun } from '../models/Schedulerv3ScheduledJobRun';
import { Schedulerv3ScheduledJobSummary } from '../models/Schedulerv3ScheduledJobSummary';
import { Schedulerv3ScheduledJobSummaryResponse } from '../models/Schedulerv3ScheduledJobSummaryResponse';
import { Schedulerv3ScheduledJobsFilter } from '../models/Schedulerv3ScheduledJobsFilter';
import { Schedulerv3ScheduledTask } from '../models/Schedulerv3ScheduledTask';
import { Schedulerv3ScheduledTaskSummary } from '../models/Schedulerv3ScheduledTaskSummary';
import { Schedulerv3Scheduler } from '../models/Schedulerv3Scheduler';
import { Schedulerv3SearchScheduledJobsRequest } from '../models/Schedulerv3SearchScheduledJobsRequest';
import { Schedulerv3SearchScheduledTaskRunsRequest } from '../models/Schedulerv3SearchScheduledTaskRunsRequest';
import { Schedulerv3SearchScheduledTaskRunsResponse } from '../models/Schedulerv3SearchScheduledTaskRunsResponse';
import { Schedulerv3TaskParameter } from '../models/Schedulerv3TaskParameter';
import { Schedulerv3TaskType } from '../models/Schedulerv3TaskType';
import { Schedulerv3UpdateScheduledJobRequest } from '../models/Schedulerv3UpdateScheduledJobRequest';
import { Schedulerv3UpdateScheduledJobResponse } from '../models/Schedulerv3UpdateScheduledJobResponse';
import { Schedulerv3WorkflowType } from '../models/Schedulerv3WorkflowType';
import { Script } from '../models/Script';
import { SensitivitiesItemsInner } from '../models/SensitivitiesItemsInner';
import { SensitivitiesSummary } from '../models/SensitivitiesSummary';
import { Sensitivity } from '../models/Sensitivity';
import { SensitivityCategory } from '../models/SensitivityCategory';
import { SensitivityListItem } from '../models/SensitivityListItem';
import { SensitivitySummary } from '../models/SensitivitySummary';
import { ServiceAccountClientId } from '../models/ServiceAccountClientId';
import { ServiceAccountInstallationStatus } from '../models/ServiceAccountInstallationStatus';
import { ServiceProvider } from '../models/ServiceProvider';
import { SetDataStoreLabelRequest } from '../models/SetDataStoreLabelRequest';
import { SetQuestionBodyParams } from '../models/SetQuestionBodyParams';
import { SetVulnerabilityStatusRequest } from '../models/SetVulnerabilityStatusRequest';
import { SignupRequest } from '../models/SignupRequest';
import { Snifassistv3Feedback } from '../models/Snifassistv3Feedback';
import { Snifassistv3FeedbackStatus } from '../models/Snifassistv3FeedbackStatus';
import { Snifassistv3GetSnifConfigResponse } from '../models/Snifassistv3GetSnifConfigResponse';
import { Snifassistv3PostSnifFeedbackRequest } from '../models/Snifassistv3PostSnifFeedbackRequest';
import { Snifassistv3SnifAssistResponse } from '../models/Snifassistv3SnifAssistResponse';
import { Snifassistv3SnifAssistType } from '../models/Snifassistv3SnifAssistType';
import { Snifassistv3StapConfig } from '../models/Snifassistv3StapConfig';
import { Snifassistv3StapHeartBeat } from '../models/Snifassistv3StapHeartBeat';
import { Snifassistv3StapOperation } from '../models/Snifassistv3StapOperation';
import { Snifassistv3StatusResponseBase } from '../models/Snifassistv3StatusResponseBase';
import { Snifassistv3TestRegexRequest } from '../models/Snifassistv3TestRegexRequest';
import { SortOrder } from '../models/SortOrder';
import { StoreClassificationStatus } from '../models/StoreClassificationStatus';
import { StreamResultOfComplianceacceleratorv3CreateWorkspaceResponse } from '../models/StreamResultOfComplianceacceleratorv3CreateWorkspaceResponse';
import { StreamResultOfReportsrunnerv3RunReportResponse } from '../models/StreamResultOfReportsrunnerv3RunReportResponse';
import { Streamsv3AWSCheckStreamStatus } from '../models/Streamsv3AWSCheckStreamStatus';
import { Streamsv3AuthType } from '../models/Streamsv3AuthType';
import { Streamsv3AzureCheckStatus } from '../models/Streamsv3AzureCheckStatus';
import { Streamsv3CheckAWSCredentialsRequest } from '../models/Streamsv3CheckAWSCredentialsRequest';
import { Streamsv3CheckAWSCredentialsResponse } from '../models/Streamsv3CheckAWSCredentialsResponse';
import { Streamsv3CheckAzureEventHubRequest } from '../models/Streamsv3CheckAzureEventHubRequest';
import { Streamsv3CheckAzureEventHubResponse } from '../models/Streamsv3CheckAzureEventHubResponse';
import { Streamsv3CheckAzureStorageStringRequest } from '../models/Streamsv3CheckAzureStorageStringRequest';
import { Streamsv3CheckAzureStorageStringResponse } from '../models/Streamsv3CheckAzureStorageStringResponse';
import { Streamsv3GetAWSRegionsResponse } from '../models/Streamsv3GetAWSRegionsResponse';
import { Streamsv3ListAWSStreamsRequest } from '../models/Streamsv3ListAWSStreamsRequest';
import { Streamsv3ListAWSStreamsResponse } from '../models/Streamsv3ListAWSStreamsResponse';
import { Streamsv3StreamByRegion } from '../models/Streamsv3StreamByRegion';
import { Streamsv3StreamType } from '../models/Streamsv3StreamType';
import { StringKeyValue } from '../models/StringKeyValue';
import { SubmitAdminEmailParams } from '../models/SubmitAdminEmailParams';
import { SubmitAuthCode } from '../models/SubmitAuthCode';
import { SubmitPasswordRequest } from '../models/SubmitPasswordRequest';
import { Tags } from '../models/Tags';
import { TenantInfo } from '../models/TenantInfo';
import { Tenantuserv3Apikey } from '../models/Tenantuserv3Apikey';
import { Tenantuserv3AuthResponse } from '../models/Tenantuserv3AuthResponse';
import { Tenantuserv3BasicPrivilege } from '../models/Tenantuserv3BasicPrivilege';
import { Tenantuserv3CreateApiKeyRequest } from '../models/Tenantuserv3CreateApiKeyRequest';
import { Tenantuserv3CreateApiKeyResponse } from '../models/Tenantuserv3CreateApiKeyResponse';
import { Tenantuserv3CurrentUser } from '../models/Tenantuserv3CurrentUser';
import { Tenantuserv3CurrentUserTenant } from '../models/Tenantuserv3CurrentUserTenant';
import { Tenantuserv3DisableUsersBulkResponse } from '../models/Tenantuserv3DisableUsersBulkResponse';
import { Tenantuserv3ExternalMetadata } from '../models/Tenantuserv3ExternalMetadata';
import { Tenantuserv3FullUser } from '../models/Tenantuserv3FullUser';
import { Tenantuserv3GetAPIPrivilegesResponse } from '../models/Tenantuserv3GetAPIPrivilegesResponse';
import { Tenantuserv3GetApiKeysResponse } from '../models/Tenantuserv3GetApiKeysResponse';
import { Tenantuserv3GetCurrentUserResponse } from '../models/Tenantuserv3GetCurrentUserResponse';
import { Tenantuserv3GetPrivilegeResponse } from '../models/Tenantuserv3GetPrivilegeResponse';
import { Tenantuserv3GetPrivilegesResponse } from '../models/Tenantuserv3GetPrivilegesResponse';
import { Tenantuserv3GetRolesResponse } from '../models/Tenantuserv3GetRolesResponse';
import { Tenantuserv3GetTenantPartNumbersDiffResponse } from '../models/Tenantuserv3GetTenantPartNumbersDiffResponse';
import { Tenantuserv3GetTenantResponse } from '../models/Tenantuserv3GetTenantResponse';
import { Tenantuserv3GetTenantsResponse } from '../models/Tenantuserv3GetTenantsResponse';
import { Tenantuserv3GetUserNamesRequest } from '../models/Tenantuserv3GetUserNamesRequest';
import { Tenantuserv3GetUserNamesResponse } from '../models/Tenantuserv3GetUserNamesResponse';
import { Tenantuserv3GetUserResponse } from '../models/Tenantuserv3GetUserResponse';
import { Tenantuserv3GetUserTenantResponse } from '../models/Tenantuserv3GetUserTenantResponse';
import { Tenantuserv3GetUsersResponse } from '../models/Tenantuserv3GetUsersResponse';
import { Tenantuserv3PostPrivilegesBulkRequest } from '../models/Tenantuserv3PostPrivilegesBulkRequest';
import { Tenantuserv3PostPrivilegesBulkResponse } from '../models/Tenantuserv3PostPrivilegesBulkResponse';
import { Tenantuserv3PostRoleRequest } from '../models/Tenantuserv3PostRoleRequest';
import { Tenantuserv3PostRoleResponse } from '../models/Tenantuserv3PostRoleResponse';
import { Tenantuserv3PostTenantsResponse } from '../models/Tenantuserv3PostTenantsResponse';
import { Tenantuserv3PostUsersBulkResponse } from '../models/Tenantuserv3PostUsersBulkResponse';
import { Tenantuserv3Privilege } from '../models/Tenantuserv3Privilege';
import { Tenantuserv3Prometheus } from '../models/Tenantuserv3Prometheus';
import { Tenantuserv3Role } from '../models/Tenantuserv3Role';
import { Tenantuserv3Tenant } from '../models/Tenantuserv3Tenant';
import { Tenantuserv3TenantCapabilityPartNumbers } from '../models/Tenantuserv3TenantCapabilityPartNumbers';
import { Tenantuserv3UniquePrivilege } from '../models/Tenantuserv3UniquePrivilege';
import { Tenantuserv3UpdatePrivilegeRequest } from '../models/Tenantuserv3UpdatePrivilegeRequest';
import { Tenantuserv3UpdatePrivilegeResponse } from '../models/Tenantuserv3UpdatePrivilegeResponse';
import { Tenantuserv3UpdatePrivilegesBulkRequest } from '../models/Tenantuserv3UpdatePrivilegesBulkRequest';
import { Tenantuserv3UpdatePrivilegesBulkResponse } from '../models/Tenantuserv3UpdatePrivilegesBulkResponse';
import { Tenantuserv3UpdateRoleRequest } from '../models/Tenantuserv3UpdateRoleRequest';
import { Tenantuserv3UpdateRoleResponse } from '../models/Tenantuserv3UpdateRoleResponse';
import { Tenantuserv3UpdateTenantResponse } from '../models/Tenantuserv3UpdateTenantResponse';
import { Tenantuserv3UpdateUserRoleBulkRequest } from '../models/Tenantuserv3UpdateUserRoleBulkRequest';
import { Tenantuserv3UpdateUserRoleBulkResponse } from '../models/Tenantuserv3UpdateUserRoleBulkResponse';
import { Tenantuserv3UpdateUsersBulkResponse } from '../models/Tenantuserv3UpdateUsersBulkResponse';
import { Tenantuserv3User } from '../models/Tenantuserv3User';
import { Tenantuserv3UserState } from '../models/Tenantuserv3UserState';
import { Tenantuserv3UserTenant } from '../models/Tenantuserv3UserTenant';
import { TokenExpiryInfo } from '../models/TokenExpiryInfo';
import { Trustee } from '../models/Trustee';
import { TypesCountInner } from '../models/TypesCountInner';
import { Universalconnectormanagerv3ConnectionRoute } from '../models/Universalconnectormanagerv3ConnectionRoute';
import { Universalconnectormanagerv3ConnectionStatus } from '../models/Universalconnectormanagerv3ConnectionStatus';
import { Universalconnectormanagerv3ConnectionSummary } from '../models/Universalconnectormanagerv3ConnectionSummary';
import { Universalconnectormanagerv3ConnectivityState } from '../models/Universalconnectormanagerv3ConnectivityState';
import { Universalconnectormanagerv3ConnectorSummary } from '../models/Universalconnectormanagerv3ConnectorSummary';
import { Universalconnectormanagerv3DatasourceDefinition } from '../models/Universalconnectormanagerv3DatasourceDefinition';
import { Universalconnectormanagerv3DatasourceResponse } from '../models/Universalconnectormanagerv3DatasourceResponse';
import { Universalconnectormanagerv3DatasourceType } from '../models/Universalconnectormanagerv3DatasourceType';
import { Universalconnectormanagerv3DatasourcesResponse } from '../models/Universalconnectormanagerv3DatasourcesResponse';
import { Universalconnectormanagerv3File } from '../models/Universalconnectormanagerv3File';
import { Universalconnectormanagerv3FileResponse } from '../models/Universalconnectormanagerv3FileResponse';
import { Universalconnectormanagerv3GetConnectorsResponse } from '../models/Universalconnectormanagerv3GetConnectorsResponse';
import { Universalconnectormanagerv3GetUCSetupResponse } from '../models/Universalconnectormanagerv3GetUCSetupResponse';
import { Universalconnectormanagerv3ListConnectionsResponse } from '../models/Universalconnectormanagerv3ListConnectionsResponse';
import { Universalconnectormanagerv3PluginDefinition } from '../models/Universalconnectormanagerv3PluginDefinition';
import { Universalconnectormanagerv3PluginsListResponse } from '../models/Universalconnectormanagerv3PluginsListResponse';
import { Universalconnectormanagerv3UploadPluginRequest } from '../models/Universalconnectormanagerv3UploadPluginRequest';
import { Universalconnectormanagerv3User } from '../models/Universalconnectormanagerv3User';
import { UpdateCommentBody } from '../models/UpdateCommentBody';
import { UpdateCustodianBody } from '../models/UpdateCustodianBody';
import { UpdateDatastoreCustodian200Response } from '../models/UpdateDatastoreCustodian200Response';
import { UpdateResourceReviewBody } from '../models/UpdateResourceReviewBody';
import { UpdateResourceReviewStatus200Response } from '../models/UpdateResourceReviewStatus200Response';
import { UserEntitlementInfo } from '../models/UserEntitlementInfo';
import { UserEntitlementsUserSensitiveCategoriesOptionsUserIdParameter } from '../models/UserEntitlementsUserSensitiveCategoriesOptionsUserIdParameter';
import { UserSensitiveCategories } from '../models/UserSensitiveCategories';
import { UserSensitiveCategories200Response } from '../models/UserSensitiveCategories200Response';
import { UserSensitiveCategoriesSensitiveCategoriesInner } from '../models/UserSensitiveCategoriesSensitiveCategoriesInner';
import { UserStores200Response } from '../models/UserStores200Response';
import { Vendor } from '../models/Vendor';
import { VendorAccount } from '../models/VendorAccount';
import { VendorCertificate } from '../models/VendorCertificate';
import { VendorDataStore } from '../models/VendorDataStore';
import { VendorSummary } from '../models/VendorSummary';
import { Vulmanagementv3ActionType } from '../models/Vulmanagementv3ActionType';
import { Vulmanagementv3AssetTags } from '../models/Vulmanagementv3AssetTags';
import { Vulmanagementv3Category } from '../models/Vulmanagementv3Category';
import { Vulmanagementv3ChildCategory } from '../models/Vulmanagementv3ChildCategory';
import { Vulmanagementv3CreateVulnerabilityRequest } from '../models/Vulmanagementv3CreateVulnerabilityRequest';
import { Vulmanagementv3CreateVulnerabilityResponse } from '../models/Vulmanagementv3CreateVulnerabilityResponse';
import { Vulmanagementv3FilterCategory } from '../models/Vulmanagementv3FilterCategory';
import { Vulmanagementv3GetFiltersDataResponse } from '../models/Vulmanagementv3GetFiltersDataResponse';
import { Vulmanagementv3GetVulnerabilitiesRequest } from '../models/Vulmanagementv3GetVulnerabilitiesRequest';
import { Vulmanagementv3GetVulnerabilitiesResponse } from '../models/Vulmanagementv3GetVulnerabilitiesResponse';
import { Vulmanagementv3GetVulnerabilityResponse } from '../models/Vulmanagementv3GetVulnerabilityResponse';
import { Vulmanagementv3Severity } from '../models/Vulmanagementv3Severity';
import { Vulmanagementv3SortOrder } from '../models/Vulmanagementv3SortOrder';
import { Vulmanagementv3SourceType } from '../models/Vulmanagementv3SourceType';
import { Vulmanagementv3Status } from '../models/Vulmanagementv3Status';
import { Vulmanagementv3SubCategory } from '../models/Vulmanagementv3SubCategory';
import { Vulmanagementv3UpdateVulnerabilitiesRequest } from '../models/Vulmanagementv3UpdateVulnerabilitiesRequest';
import { Vulmanagementv3UpdateVulnerabilitiesResponse } from '../models/Vulmanagementv3UpdateVulnerabilitiesResponse';
import { Vulmanagementv3VulnerabilitiesStatsDataResponse } from '../models/Vulmanagementv3VulnerabilitiesStatsDataResponse';
import { Vulmanagementv3Vulnerability } from '../models/Vulmanagementv3Vulnerability';
import { Vulmanagementv3VulnerabilityAudit } from '../models/Vulmanagementv3VulnerabilityAudit';
import { Vulmanagementv3VulnerabilityIngestionResponse } from '../models/Vulmanagementv3VulnerabilityIngestionResponse';
import { Vulmanagementv3VulnerabilityUpdate } from '../models/Vulmanagementv3VulnerabilityUpdate';
import { VulnerabilitiesByDataStoreFilterOptions } from '../models/VulnerabilitiesByDataStoreFilterOptions';
import { VulnerabilitiesCriticalityCountInner } from '../models/VulnerabilitiesCriticalityCountInner';
import { VulnerabilitiesFilterOptions } from '../models/VulnerabilitiesFilterOptions';
import { VulnerabilitiesSummary } from '../models/VulnerabilitiesSummary';
import { VulnerabilitiesSummaryAffectedDataStoreSummary } from '../models/VulnerabilitiesSummaryAffectedDataStoreSummary';
import { VulnerabilitiesSummaryAffectedDataStoreSummaryCloudAccountIdsCountInner } from '../models/VulnerabilitiesSummaryAffectedDataStoreSummaryCloudAccountIdsCountInner';
import { VulnerabilitiesSummaryAffectedDataStoreSummaryCloudRegionsCountInner } from '../models/VulnerabilitiesSummaryAffectedDataStoreSummaryCloudRegionsCountInner';
import { VulnerabilitiesSummaryAffectedDataStoreSummaryDataStoreTypesInner } from '../models/VulnerabilitiesSummaryAffectedDataStoreSummaryDataStoreTypesInner';
import { VulnerabilitiesSummaryStatusSummary } from '../models/VulnerabilitiesSummaryStatusSummary';
import { VulnerabilitiesSummaryStatusTypeCountInner } from '../models/VulnerabilitiesSummaryStatusTypeCountInner';
import { VulnerabilitiesSummaryVulnerabilityTypeCountInner } from '../models/VulnerabilitiesSummaryVulnerabilityTypeCountInner';
import { Vulnerability } from '../models/Vulnerability';
import { VulnerabilityAffectedDataStoreFilterOptions } from '../models/VulnerabilityAffectedDataStoreFilterOptions';
import { VulnerabilityByDataStoreListItem } from '../models/VulnerabilityByDataStoreListItem';
import { VulnerabilityCriticality } from '../models/VulnerabilityCriticality';
import { VulnerabilityFlowRef } from '../models/VulnerabilityFlowRef';
import { VulnerabilityListItem } from '../models/VulnerabilityListItem';
import { VulnerabilityRelatedAsset } from '../models/VulnerabilityRelatedAsset';
import { VulnerabilityRemediation } from '../models/VulnerabilityRemediation';
import { VulnerabilityStatus } from '../models/VulnerabilityStatus';
import { VulnerabilityStatusComment } from '../models/VulnerabilityStatusComment';
import { VulnerabilityStatusType } from '../models/VulnerabilityStatusType';
import { VulnerabilityStatusTypeFamily } from '../models/VulnerabilityStatusTypeFamily';
import { VulnerabilityThreatCategory } from '../models/VulnerabilityThreatCategory';
import { VulnerabilityType } from '../models/VulnerabilityType';
import { Workflowv3Case } from '../models/Workflowv3Case';
import { Workflowv3CaseEdit } from '../models/Workflowv3CaseEdit';
import { Workflowv3CaseListResponse } from '../models/Workflowv3CaseListResponse';
import { Workflowv3Comment } from '../models/Workflowv3Comment';
import { Workflowv3CreateCaseRequest } from '../models/Workflowv3CreateCaseRequest';
import { Workflowv3CreateCaseResponse } from '../models/Workflowv3CreateCaseResponse';
import { Workflowv3CreateProductEntityResponse } from '../models/Workflowv3CreateProductEntityResponse';
import { Workflowv3CreateTaskRequest } from '../models/Workflowv3CreateTaskRequest';
import { Workflowv3CreateTaskResponse } from '../models/Workflowv3CreateTaskResponse';
import { Workflowv3DeleteCasesResponse } from '../models/Workflowv3DeleteCasesResponse';
import { Workflowv3DeleteProductEntityResponse } from '../models/Workflowv3DeleteProductEntityResponse';
import { Workflowv3DeleteTasksResponse } from '../models/Workflowv3DeleteTasksResponse';
import { Workflowv3Entity } from '../models/Workflowv3Entity';
import { Workflowv3EntityDefinition } from '../models/Workflowv3EntityDefinition';
import { Workflowv3EntityHeader } from '../models/Workflowv3EntityHeader';
import { Workflowv3EntityHeaderType } from '../models/Workflowv3EntityHeaderType';
import { Workflowv3EntityType } from '../models/Workflowv3EntityType';
import { Workflowv3EntityValueChoice } from '../models/Workflowv3EntityValueChoice';
import { Workflowv3Filter } from '../models/Workflowv3Filter';
import { Workflowv3FilterColumn } from '../models/Workflowv3FilterColumn';
import { Workflowv3FilterOperator } from '../models/Workflowv3FilterOperator';
import { Workflowv3GetCasesCountRequest } from '../models/Workflowv3GetCasesCountRequest';
import { Workflowv3GetCasesCountResponse } from '../models/Workflowv3GetCasesCountResponse';
import { Workflowv3GetFilenameResponse } from '../models/Workflowv3GetFilenameResponse';
import { Workflowv3GetJobsCountRequest } from '../models/Workflowv3GetJobsCountRequest';
import { Workflowv3GetJobsCountResponse } from '../models/Workflowv3GetJobsCountResponse';
import { Workflowv3GetProductEntitiesResponse } from '../models/Workflowv3GetProductEntitiesResponse';
import { Workflowv3GetReportResultResponse } from '../models/Workflowv3GetReportResultResponse';
import { Workflowv3GetTasksCountRequest } from '../models/Workflowv3GetTasksCountRequest';
import { Workflowv3GetTasksCountResponse } from '../models/Workflowv3GetTasksCountResponse';
import { Workflowv3JobCount } from '../models/Workflowv3JobCount';
import { Workflowv3OperatorType } from '../models/Workflowv3OperatorType';
import { Workflowv3Origin } from '../models/Workflowv3Origin';
import { Workflowv3Priority } from '../models/Workflowv3Priority';
import { Workflowv3ProductEntity } from '../models/Workflowv3ProductEntity';
import { Workflowv3ProductWorkflow } from '../models/Workflowv3ProductWorkflow';
import { Workflowv3ReportMetadata } from '../models/Workflowv3ReportMetadata';
import { Workflowv3ReportResult } from '../models/Workflowv3ReportResult';
import { Workflowv3ReportResultHeader } from '../models/Workflowv3ReportResultHeader';
import { Workflowv3ReportResultRow } from '../models/Workflowv3ReportResultRow';
import { Workflowv3ReportRun } from '../models/Workflowv3ReportRun';
import { Workflowv3SearchCasesRequest } from '../models/Workflowv3SearchCasesRequest';
import { Workflowv3SearchReportsResponse } from '../models/Workflowv3SearchReportsResponse';
import { Workflowv3SearchTasksRequest } from '../models/Workflowv3SearchTasksRequest';
import { Workflowv3Status } from '../models/Workflowv3Status';
import { Workflowv3StatusCount } from '../models/Workflowv3StatusCount';
import { Workflowv3Task } from '../models/Workflowv3Task';
import { Workflowv3TaskCount } from '../models/Workflowv3TaskCount';
import { Workflowv3TaskCreate } from '../models/Workflowv3TaskCreate';
import { Workflowv3TaskEdit } from '../models/Workflowv3TaskEdit';
import { Workflowv3TaskListResponse } from '../models/Workflowv3TaskListResponse';
import { Workflowv3UpdateCasesRequest } from '../models/Workflowv3UpdateCasesRequest';
import { Workflowv3UpdateCasesResponse } from '../models/Workflowv3UpdateCasesResponse';
import { Workflowv3UpdateProductEntityRequest } from '../models/Workflowv3UpdateProductEntityRequest';
import { Workflowv3UpdateProductEntityResponse } from '../models/Workflowv3UpdateProductEntityResponse';
import { Workflowv3UpdateTasksRequest } from '../models/Workflowv3UpdateTasksRequest';
import { Workflowv3UpdateTasksResponse } from '../models/Workflowv3UpdateTasksResponse';
import { Workflowv3WorkflowEvent } from '../models/Workflowv3WorkflowEvent';
import { Workflowv3WorkflowEventResponse } from '../models/Workflowv3WorkflowEventResponse';

import { ObservableAssetsServiceApi } from "./ObservableAPI";
import { AssetsServiceApiRequestFactory, AssetsServiceApiResponseProcessor} from "../apis/AssetsServiceApi";

export interface AssetsServiceApiAssetsServiceAssetIngestionRequest {
    /**
     * 
     * @type Assetsv3AssetIngestionRequest
     * @memberof AssetsServiceApiassetsServiceAssetIngestion
     */
    assetsv3AssetIngestionRequest: Assetsv3AssetIngestionRequest
}

export interface AssetsServiceApiAssetsServiceAssetIngestionManualTriggerRequest {
    /**
     * 
     * @type any
     * @memberof AssetsServiceApiassetsServiceAssetIngestionManualTrigger
     */
    body: any
}

export interface AssetsServiceApiAssetsServiceCancelCSVImportRequest {
    /**
     * unique id of the csv
     * Defaults to: undefined
     * @type string
     * @memberof AssetsServiceApiassetsServiceCancelCSVImport
     */
    csvId: string
}

export interface AssetsServiceApiAssetsServiceClonePolicyRequest {
    /**
     * Policy id that needs to be cloned.
     * Defaults to: undefined
     * @type string
     * @memberof AssetsServiceApiassetsServiceClonePolicy
     */
    policyId: string
    /**
     * 
     * @type Assetsv3ClonePolicyRequest
     * @memberof AssetsServiceApiassetsServiceClonePolicy
     */
    assetsv3ClonePolicyRequest: Assetsv3ClonePolicyRequest
}

export interface AssetsServiceApiAssetsServiceCompareCSVToExistingAssetsRequest {
    /**
     * unique id of the csv
     * Defaults to: undefined
     * @type string
     * @memberof AssetsServiceApiassetsServiceCompareCSVToExistingAssets
     */
    csvId: string
    /**
     * which rows are required, existing or new or all.
     * Defaults to: undefined
     * @type string
     * @memberof AssetsServiceApiassetsServiceCompareCSVToExistingAssets
     */
    rowsRequired?: string
    /**
     * page number.
     * Defaults to: undefined
     * @type number
     * @memberof AssetsServiceApiassetsServiceCompareCSVToExistingAssets
     */
    pageNumber?: number
    /**
     * page size.
     * Defaults to: undefined
     * @type number
     * @memberof AssetsServiceApiassetsServiceCompareCSVToExistingAssets
     */
    pageSize?: number
    /**
     * Asset CSV template type.   - DATABASE: Template for database
     * Defaults to: &#39;DATABASE&#39;
     * @type &#39;DATABASE&#39;
     * @memberof AssetsServiceApiassetsServiceCompareCSVToExistingAssets
     */
    templateType?: 'DATABASE'
}

export interface AssetsServiceApiAssetsServiceCreateUpdatePolicyRequest {
    /**
     * 
     * @type Assetsv3CreateUpdatePolicyRequest
     * @memberof AssetsServiceApiassetsServiceCreateUpdatePolicy
     */
    assetsv3CreateUpdatePolicyRequest: Assetsv3CreateUpdatePolicyRequest
}

export interface AssetsServiceApiAssetsServiceDeleteFilterTemplateForAssetsRequest {
    /**
     * template id to be deleted
     * Defaults to: undefined
     * @type string
     * @memberof AssetsServiceApiassetsServiceDeleteFilterTemplateForAssets
     */
    templateId: string
}

export interface AssetsServiceApiAssetsServiceDeletePoliciesRequest {
    /**
     * Policy ids.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof AssetsServiceApiassetsServiceDeletePolicies
     */
    policyIds?: Array<string>
}

export interface AssetsServiceApiAssetsServiceFetchAssetChangeLogRequest {
    /**
     * 
     * @type Assetsv3FetchAssetChangeLogRequest
     * @memberof AssetsServiceApiassetsServiceFetchAssetChangeLog
     */
    assetsv3FetchAssetChangeLogRequest: Assetsv3FetchAssetChangeLogRequest
}

export interface AssetsServiceApiAssetsServiceFetchAssetDashboardRequest {
    /**
     * ID of the Dashboard Widget
     * Defaults to: undefined
     * @type string
     * @memberof AssetsServiceApiassetsServiceFetchAssetDashboard
     */
    widgetType: string
    /**
     * start of date range for ui widget.
     * Defaults to: undefined
     * @type string
     * @memberof AssetsServiceApiassetsServiceFetchAssetDashboard
     */
    dateRangeStart?: string
    /**
     * end of date range for ui widget.
     * Defaults to: undefined
     * @type string
     * @memberof AssetsServiceApiassetsServiceFetchAssetDashboard
     */
    dateRangeEnd?: string
    /**
     * type of date range for ui widget.
     * Defaults to: undefined
     * @type string
     * @memberof AssetsServiceApiassetsServiceFetchAssetDashboard
     */
    dateRangeType?: string
    /**
     * key for ui widget.
     * Defaults to: undefined
     * @type string
     * @memberof AssetsServiceApiassetsServiceFetchAssetDashboard
     */
    dateRangeKey?: string
    /**
     * error for ui widget.
     * Defaults to: undefined
     * @type string
     * @memberof AssetsServiceApiassetsServiceFetchAssetDashboard
     */
    dateRangeError?: string
    /**
     * start_number for ui widget.
     * Defaults to: undefined
     * @type number
     * @memberof AssetsServiceApiassetsServiceFetchAssetDashboard
     */
    dateRangeStartNumber?: number
    /**
     * start of date range for ui widget.
     * Defaults to: undefined
     * @type string
     * @memberof AssetsServiceApiassetsServiceFetchAssetDashboard
     */
    dateRangeStartUnit?: string
    /**
     * start of date range for ui widget.
     * Defaults to: undefined
     * @type number
     * @memberof AssetsServiceApiassetsServiceFetchAssetDashboard
     */
    dateRangeEndNumber?: number
    /**
     * start of date range for ui widget.
     * Defaults to: undefined
     * @type string
     * @memberof AssetsServiceApiassetsServiceFetchAssetDashboard
     */
    dateRangeEndUnit?: string
    /**
     * Name of the timeline value selected from drop down.
     * Defaults to: undefined
     * @type string
     * @memberof AssetsServiceApiassetsServiceFetchAssetDashboard
     */
    timelineValueSelected?: string
    /**
     * Tag ID.
     * Defaults to: undefined
     * @type string
     * @memberof AssetsServiceApiassetsServiceFetchAssetDashboard
     */
    tagId?: string
}

export interface AssetsServiceApiAssetsServiceFetchAssetListRequest {
    /**
     * 
     * @type Assetsv3FetchAssetListRequest
     * @memberof AssetsServiceApiassetsServiceFetchAssetList
     */
    assetsv3FetchAssetListRequest: Assetsv3FetchAssetListRequest
}

export interface AssetsServiceApiAssetsServiceFetchAssetsForMergeSplitRequest {
    /**
     * Asset grouper Id.
     * Defaults to: undefined
     * @type string
     * @memberof AssetsServiceApiassetsServiceFetchAssetsForMergeSplit
     */
    assetId?: string
    /**
     * Page number.
     * Defaults to: undefined
     * @type number
     * @memberof AssetsServiceApiassetsServiceFetchAssetsForMergeSplit
     */
    pageNumber?: number
    /**
     * Page size.
     * Defaults to: undefined
     * @type number
     * @memberof AssetsServiceApiassetsServiceFetchAssetsForMergeSplit
     */
    pageSize?: number
    /**
     * Action : merge or split.
     * Defaults to: undefined
     * @type string
     * @memberof AssetsServiceApiassetsServiceFetchAssetsForMergeSplit
     */
    action?: string
    /**
     * Search from the list based on asset name, database name, ip or host.
     * Defaults to: undefined
     * @type string
     * @memberof AssetsServiceApiassetsServiceFetchAssetsForMergeSplit
     */
    searchKey?: string
}

export interface AssetsServiceApiAssetsServiceFindAssetNameRequest {
    /**
     * Name of asset.
     * Defaults to: undefined
     * @type string
     * @memberof AssetsServiceApiassetsServiceFindAssetName
     */
    assetName?: string
}

export interface AssetsServiceApiAssetsServiceGetAssetOverviewRequest {
    /**
     * Asset grouper Id.
     * Defaults to: undefined
     * @type string
     * @memberof AssetsServiceApiassetsServiceGetAssetOverview
     */
    assetId?: string
    /**
     * Page number.
     * Defaults to: undefined
     * @type number
     * @memberof AssetsServiceApiassetsServiceGetAssetOverview
     */
    pageNumber?: number
    /**
     * Page size.
     * Defaults to: undefined
     * @type number
     * @memberof AssetsServiceApiassetsServiceGetAssetOverview
     */
    size?: number
    /**
     * Widget type.   - ALL: All Asset Overview Widgets.  - CLASSIFICATION: Classification Asset Overview Widgets.  - TAG: Tag Asset Overview Widgets.  - RESOURCE: Resource Asset Overview Widgets.
     * Defaults to: &#39;ALL&#39;
     * @type &#39;ALL&#39; | &#39;CLASSIFICATION&#39; | &#39;TAG&#39; | &#39;RESOURCE&#39;
     * @memberof AssetsServiceApiassetsServiceGetAssetOverview
     */
    widget?: 'ALL' | 'CLASSIFICATION' | 'TAG' | 'RESOURCE'
    /**
     * Asset IP.
     * Defaults to: undefined
     * @type string
     * @memberof AssetsServiceApiassetsServiceGetAssetOverview
     */
    ip?: string
    /**
     * Asset Host.
     * Defaults to: undefined
     * @type string
     * @memberof AssetsServiceApiassetsServiceGetAssetOverview
     */
    host?: string
    /**
     * Database Name.
     * Defaults to: undefined
     * @type string
     * @memberof AssetsServiceApiassetsServiceGetAssetOverview
     */
    database?: string
    /**
     * asset entity type.
     * Defaults to: undefined
     * @type string
     * @memberof AssetsServiceApiassetsServiceGetAssetOverview
     */
    assetEntityType?: string
}

export interface AssetsServiceApiAssetsServiceGetAssetTopologyRequest {
    /**
     * 
     * @type Assetsv3GetAssetTopologyRequest
     * @memberof AssetsServiceApiassetsServiceGetAssetTopology
     */
    assetsv3GetAssetTopologyRequest: Assetsv3GetAssetTopologyRequest
}

export interface AssetsServiceApiAssetsServiceGetFilterTemplateForAssetsRequest {
    /**
     * template id to be deleted.
     * Defaults to: undefined
     * @type string
     * @memberof AssetsServiceApiassetsServiceGetFilterTemplateForAssets
     */
    templateId?: string
}

export interface AssetsServiceApiAssetsServiceGetFiltersForAssetsRequest {
}

export interface AssetsServiceApiAssetsServiceImportCSVRequest {
    /**
     * unique id of the csv
     * Defaults to: undefined
     * @type string
     * @memberof AssetsServiceApiassetsServiceImportCSV
     */
    csvId: string
    /**
     * 
     * @type Assetsv3ImportCSVRequest
     * @memberof AssetsServiceApiassetsServiceImportCSV
     */
    assetsv3ImportCSVRequest: Assetsv3ImportCSVRequest
}

export interface AssetsServiceApiAssetsServiceListPolicyRequest {
}

export interface AssetsServiceApiAssetsServiceListRuleRequest {
    /**
     * Policy ID
     * Defaults to: undefined
     * @type string
     * @memberof AssetsServiceApiassetsServiceListRule
     */
    policyId: string
}

export interface AssetsServiceApiAssetsServiceListTagDomainsRequest {
    /**
     * Optional: dom_grouper required if we want to fetch domains based on the group.
     * Defaults to: undefined
     * @type string
     * @memberof AssetsServiceApiassetsServiceListTagDomains
     */
    domGrouper?: string
    /**
     * Optional: purpose required if we want to fetch domains based on the purpose.
     * Defaults to: undefined
     * @type string
     * @memberof AssetsServiceApiassetsServiceListTagDomains
     */
    purpose?: string
    /**
     * Optional: If we need Tag  based on the Domains.
     * Defaults to: undefined
     * @type boolean
     * @memberof AssetsServiceApiassetsServiceListTagDomains
     */
    needTag?: boolean
}

export interface AssetsServiceApiAssetsServiceListTagsRequest {
    /**
     * asset id - Asset ID.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof AssetsServiceApiassetsServiceListTags
     */
    assetId?: Array<string>
}

export interface AssetsServiceApiAssetsServiceMergeOrSplitAssetsRequest {
    /**
     * 
     * @type Assetsv3MergeOrSplitAssetsRequest
     * @memberof AssetsServiceApiassetsServiceMergeOrSplitAssets
     */
    assetsv3MergeOrSplitAssetsRequest: Assetsv3MergeOrSplitAssetsRequest
}

export interface AssetsServiceApiAssetsServiceSaveAssignedTagsRequest {
    /**
     * 
     * @type Assetsv3SaveAssignedTagsRequest
     * @memberof AssetsServiceApiassetsServiceSaveAssignedTags
     */
    assetsv3SaveAssignedTagsRequest: Assetsv3SaveAssignedTagsRequest
}

export interface AssetsServiceApiAssetsServiceSaveTagConceptDataRequest {
    /**
     * 
     * @type Assetsv3SaveTagConceptDataRequest
     * @memberof AssetsServiceApiassetsServiceSaveTagConceptData
     */
    assetsv3SaveTagConceptDataRequest: Assetsv3SaveTagConceptDataRequest
}

export interface AssetsServiceApiAssetsServiceSaveTagDomainDataRequest {
    /**
     * 
     * @type Assetsv3SaveTagDomainDataRequest
     * @memberof AssetsServiceApiassetsServiceSaveTagDomainData
     */
    assetsv3SaveTagDomainDataRequest: Assetsv3SaveTagDomainDataRequest
}

export interface AssetsServiceApiAssetsServiceSaveUpdateFilterTemplateForAssetsRequest {
    /**
     * 
     * @type Assetsv3SaveUpdateFilterTemplateRequest
     * @memberof AssetsServiceApiassetsServiceSaveUpdateFilterTemplateForAssets
     */
    assetsv3SaveUpdateFilterTemplateRequest: Assetsv3SaveUpdateFilterTemplateRequest
}

export interface AssetsServiceApiAssetsServiceSetBannerStateRequest {
    /**
     * 
     * @type Assetsv3SetBannerStateRequest
     * @memberof AssetsServiceApiassetsServiceSetBannerState
     */
    assetsv3SetBannerStateRequest: Assetsv3SetBannerStateRequest
}

export interface AssetsServiceApiAssetsServiceUpdateAssetNameRequest {
    /**
     * 
     * @type Assetsv3UpdateAssetNameRequest
     * @memberof AssetsServiceApiassetsServiceUpdateAssetName
     */
    assetsv3UpdateAssetNameRequest: Assetsv3UpdateAssetNameRequest
}

export interface AssetsServiceApiAssetsServiceUpdatePolicyRequest {
    /**
     * 
     * @type Assetsv3UpdatePolicyRequest
     * @memberof AssetsServiceApiassetsServiceUpdatePolicy
     */
    assetsv3UpdatePolicyRequest: Assetsv3UpdatePolicyRequest
}

export class ObjectAssetsServiceApi {
    private api: ObservableAssetsServiceApi

    public constructor(configuration: Configuration, requestFactory?: AssetsServiceApiRequestFactory, responseProcessor?: AssetsServiceApiResponseProcessor) {
        this.api = new ObservableAssetsServiceApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * AssetIngestion - Asset Ingestion Api to ingest assets from different applications including asset extensibility assets.
     * @param param the request object
     */
    public assetsServiceAssetIngestionWithHttpInfo(param: AssetsServiceApiAssetsServiceAssetIngestionRequest, options?: ConfigurationOptions): Promise<HttpInfo<Assetsv3AssetIngestionResponse>> {
        return this.api.assetsServiceAssetIngestionWithHttpInfo(param.assetsv3AssetIngestionRequest,  options).toPromise();
    }

    /**
     * AssetIngestion - Asset Ingestion Api to ingest assets from different applications including asset extensibility assets.
     * @param param the request object
     */
    public assetsServiceAssetIngestion(param: AssetsServiceApiAssetsServiceAssetIngestionRequest, options?: ConfigurationOptions): Promise<Assetsv3AssetIngestionResponse> {
        return this.api.assetsServiceAssetIngestion(param.assetsv3AssetIngestionRequest,  options).toPromise();
    }

    /**
     * AssetIngestionManualTrigger - Manual trigger for Scheduled Asset Ingestion of databases.
     * @param param the request object
     */
    public assetsServiceAssetIngestionManualTriggerWithHttpInfo(param: AssetsServiceApiAssetsServiceAssetIngestionManualTriggerRequest, options?: ConfigurationOptions): Promise<HttpInfo<Assetsv3AssetIngestionResponse>> {
        return this.api.assetsServiceAssetIngestionManualTriggerWithHttpInfo(param.body,  options).toPromise();
    }

    /**
     * AssetIngestionManualTrigger - Manual trigger for Scheduled Asset Ingestion of databases.
     * @param param the request object
     */
    public assetsServiceAssetIngestionManualTrigger(param: AssetsServiceApiAssetsServiceAssetIngestionManualTriggerRequest, options?: ConfigurationOptions): Promise<Assetsv3AssetIngestionResponse> {
        return this.api.assetsServiceAssetIngestionManualTrigger(param.body,  options).toPromise();
    }

    /**
     * CancelCSVImport - Cancel the import of CSV and update the status in import log table
     * @param param the request object
     */
    public assetsServiceCancelCSVImportWithHttpInfo(param: AssetsServiceApiAssetsServiceCancelCSVImportRequest, options?: ConfigurationOptions): Promise<HttpInfo<any>> {
        return this.api.assetsServiceCancelCSVImportWithHttpInfo(param.csvId,  options).toPromise();
    }

    /**
     * CancelCSVImport - Cancel the import of CSV and update the status in import log table
     * @param param the request object
     */
    public assetsServiceCancelCSVImport(param: AssetsServiceApiAssetsServiceCancelCSVImportRequest, options?: ConfigurationOptions): Promise<any> {
        return this.api.assetsServiceCancelCSVImport(param.csvId,  options).toPromise();
    }

    /**
     * ClonePolicy - Clone a policy.
     * @param param the request object
     */
    public assetsServiceClonePolicyWithHttpInfo(param: AssetsServiceApiAssetsServiceClonePolicyRequest, options?: ConfigurationOptions): Promise<HttpInfo<any>> {
        return this.api.assetsServiceClonePolicyWithHttpInfo(param.policyId, param.assetsv3ClonePolicyRequest,  options).toPromise();
    }

    /**
     * ClonePolicy - Clone a policy.
     * @param param the request object
     */
    public assetsServiceClonePolicy(param: AssetsServiceApiAssetsServiceClonePolicyRequest, options?: ConfigurationOptions): Promise<any> {
        return this.api.assetsServiceClonePolicy(param.policyId, param.assetsv3ClonePolicyRequest,  options).toPromise();
    }

    /**
     * CompareCSVToExistingAssets - Compare CSV with existing assets and return list of assets(existing/to be imported/both) on demand from csv.
     * @param param the request object
     */
    public assetsServiceCompareCSVToExistingAssetsWithHttpInfo(param: AssetsServiceApiAssetsServiceCompareCSVToExistingAssetsRequest, options?: ConfigurationOptions): Promise<HttpInfo<Assetsv3CompareCSVResponse>> {
        return this.api.assetsServiceCompareCSVToExistingAssetsWithHttpInfo(param.csvId, param.rowsRequired, param.pageNumber, param.pageSize, param.templateType,  options).toPromise();
    }

    /**
     * CompareCSVToExistingAssets - Compare CSV with existing assets and return list of assets(existing/to be imported/both) on demand from csv.
     * @param param the request object
     */
    public assetsServiceCompareCSVToExistingAssets(param: AssetsServiceApiAssetsServiceCompareCSVToExistingAssetsRequest, options?: ConfigurationOptions): Promise<Assetsv3CompareCSVResponse> {
        return this.api.assetsServiceCompareCSVToExistingAssets(param.csvId, param.rowsRequired, param.pageNumber, param.pageSize, param.templateType,  options).toPromise();
    }

    /**
     * CreateUpdatePolicy - Create/update new Policy.
     * @param param the request object
     */
    public assetsServiceCreateUpdatePolicyWithHttpInfo(param: AssetsServiceApiAssetsServiceCreateUpdatePolicyRequest, options?: ConfigurationOptions): Promise<HttpInfo<Assetsv3CreateUpdatePolicyResponse>> {
        return this.api.assetsServiceCreateUpdatePolicyWithHttpInfo(param.assetsv3CreateUpdatePolicyRequest,  options).toPromise();
    }

    /**
     * CreateUpdatePolicy - Create/update new Policy.
     * @param param the request object
     */
    public assetsServiceCreateUpdatePolicy(param: AssetsServiceApiAssetsServiceCreateUpdatePolicyRequest, options?: ConfigurationOptions): Promise<Assetsv3CreateUpdatePolicyResponse> {
        return this.api.assetsServiceCreateUpdatePolicy(param.assetsv3CreateUpdatePolicyRequest,  options).toPromise();
    }

    /**
     * DeleteFilterTemplateForAssets - Deleting a template using TemplateID in manage assets.
     * @param param the request object
     */
    public assetsServiceDeleteFilterTemplateForAssetsWithHttpInfo(param: AssetsServiceApiAssetsServiceDeleteFilterTemplateForAssetsRequest, options?: ConfigurationOptions): Promise<HttpInfo<any>> {
        return this.api.assetsServiceDeleteFilterTemplateForAssetsWithHttpInfo(param.templateId,  options).toPromise();
    }

    /**
     * DeleteFilterTemplateForAssets - Deleting a template using TemplateID in manage assets.
     * @param param the request object
     */
    public assetsServiceDeleteFilterTemplateForAssets(param: AssetsServiceApiAssetsServiceDeleteFilterTemplateForAssetsRequest, options?: ConfigurationOptions): Promise<any> {
        return this.api.assetsServiceDeleteFilterTemplateForAssets(param.templateId,  options).toPromise();
    }

    /**
     * DeletePolicies - Delete Policy returns response code and message.
     * @param param the request object
     */
    public assetsServiceDeletePoliciesWithHttpInfo(param: AssetsServiceApiAssetsServiceDeletePoliciesRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<any>> {
        return this.api.assetsServiceDeletePoliciesWithHttpInfo(param.policyIds,  options).toPromise();
    }

    /**
     * DeletePolicies - Delete Policy returns response code and message.
     * @param param the request object
     */
    public assetsServiceDeletePolicies(param: AssetsServiceApiAssetsServiceDeletePoliciesRequest = {}, options?: ConfigurationOptions): Promise<any> {
        return this.api.assetsServiceDeletePolicies(param.policyIds,  options).toPromise();
    }

    /**
     * FetchAssetChangeLog - Fetch the logs for any actions performed on assets.
     * @param param the request object
     */
    public assetsServiceFetchAssetChangeLogWithHttpInfo(param: AssetsServiceApiAssetsServiceFetchAssetChangeLogRequest, options?: ConfigurationOptions): Promise<HttpInfo<Assetsv3FetchAssetChangeLogResponse>> {
        return this.api.assetsServiceFetchAssetChangeLogWithHttpInfo(param.assetsv3FetchAssetChangeLogRequest,  options).toPromise();
    }

    /**
     * FetchAssetChangeLog - Fetch the logs for any actions performed on assets.
     * @param param the request object
     */
    public assetsServiceFetchAssetChangeLog(param: AssetsServiceApiAssetsServiceFetchAssetChangeLogRequest, options?: ConfigurationOptions): Promise<Assetsv3FetchAssetChangeLogResponse> {
        return this.api.assetsServiceFetchAssetChangeLog(param.assetsv3FetchAssetChangeLogRequest,  options).toPromise();
    }

    /**
     * FetchAssetDashboard - Gets Filter Templates for Dshboard Widgets.
     * @param param the request object
     */
    public assetsServiceFetchAssetDashboardWithHttpInfo(param: AssetsServiceApiAssetsServiceFetchAssetDashboardRequest, options?: ConfigurationOptions): Promise<HttpInfo<Assetsv3FetchAssetDashboardResponse>> {
        return this.api.assetsServiceFetchAssetDashboardWithHttpInfo(param.widgetType, param.dateRangeStart, param.dateRangeEnd, param.dateRangeType, param.dateRangeKey, param.dateRangeError, param.dateRangeStartNumber, param.dateRangeStartUnit, param.dateRangeEndNumber, param.dateRangeEndUnit, param.timelineValueSelected, param.tagId,  options).toPromise();
    }

    /**
     * FetchAssetDashboard - Gets Filter Templates for Dshboard Widgets.
     * @param param the request object
     */
    public assetsServiceFetchAssetDashboard(param: AssetsServiceApiAssetsServiceFetchAssetDashboardRequest, options?: ConfigurationOptions): Promise<Assetsv3FetchAssetDashboardResponse> {
        return this.api.assetsServiceFetchAssetDashboard(param.widgetType, param.dateRangeStart, param.dateRangeEnd, param.dateRangeType, param.dateRangeKey, param.dateRangeError, param.dateRangeStartNumber, param.dateRangeStartUnit, param.dateRangeEndNumber, param.dateRangeEndUnit, param.timelineValueSelected, param.tagId,  options).toPromise();
    }

    /**
     * FetchAssetList - Asset Fetch Api .
     * @param param the request object
     */
    public assetsServiceFetchAssetListWithHttpInfo(param: AssetsServiceApiAssetsServiceFetchAssetListRequest, options?: ConfigurationOptions): Promise<HttpInfo<Assetsv3FetchAssetListResponse>> {
        return this.api.assetsServiceFetchAssetListWithHttpInfo(param.assetsv3FetchAssetListRequest,  options).toPromise();
    }

    /**
     * FetchAssetList - Asset Fetch Api .
     * @param param the request object
     */
    public assetsServiceFetchAssetList(param: AssetsServiceApiAssetsServiceFetchAssetListRequest, options?: ConfigurationOptions): Promise<Assetsv3FetchAssetListResponse> {
        return this.api.assetsServiceFetchAssetList(param.assetsv3FetchAssetListRequest,  options).toPromise();
    }

    /**
     * FetchAssetsForMergeSplit : Fetch assets for Merge and Split.
     * @param param the request object
     */
    public assetsServiceFetchAssetsForMergeSplitWithHttpInfo(param: AssetsServiceApiAssetsServiceFetchAssetsForMergeSplitRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Assetsv3FetchAssetsForMergeSplitResponse>> {
        return this.api.assetsServiceFetchAssetsForMergeSplitWithHttpInfo(param.assetId, param.pageNumber, param.pageSize, param.action, param.searchKey,  options).toPromise();
    }

    /**
     * FetchAssetsForMergeSplit : Fetch assets for Merge and Split.
     * @param param the request object
     */
    public assetsServiceFetchAssetsForMergeSplit(param: AssetsServiceApiAssetsServiceFetchAssetsForMergeSplitRequest = {}, options?: ConfigurationOptions): Promise<Assetsv3FetchAssetsForMergeSplitResponse> {
        return this.api.assetsServiceFetchAssetsForMergeSplit(param.assetId, param.pageNumber, param.pageSize, param.action, param.searchKey,  options).toPromise();
    }

    /**
     * FindAssetName - Checks if the given Asset Name has already been assigned to an asset.
     * @param param the request object
     */
    public assetsServiceFindAssetNameWithHttpInfo(param: AssetsServiceApiAssetsServiceFindAssetNameRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Assetsv3FindAssetNameResponse>> {
        return this.api.assetsServiceFindAssetNameWithHttpInfo(param.assetName,  options).toPromise();
    }

    /**
     * FindAssetName - Checks if the given Asset Name has already been assigned to an asset.
     * @param param the request object
     */
    public assetsServiceFindAssetName(param: AssetsServiceApiAssetsServiceFindAssetNameRequest = {}, options?: ConfigurationOptions): Promise<Assetsv3FindAssetNameResponse> {
        return this.api.assetsServiceFindAssetName(param.assetName,  options).toPromise();
    }

    /**
     * GetAssetOverview - Get asset overview widgets data for a particular asset.
     * @param param the request object
     */
    public assetsServiceGetAssetOverviewWithHttpInfo(param: AssetsServiceApiAssetsServiceGetAssetOverviewRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Assetsv3AssetOverviewResponse>> {
        return this.api.assetsServiceGetAssetOverviewWithHttpInfo(param.assetId, param.pageNumber, param.size, param.widget, param.ip, param.host, param.database, param.assetEntityType,  options).toPromise();
    }

    /**
     * GetAssetOverview - Get asset overview widgets data for a particular asset.
     * @param param the request object
     */
    public assetsServiceGetAssetOverview(param: AssetsServiceApiAssetsServiceGetAssetOverviewRequest = {}, options?: ConfigurationOptions): Promise<Assetsv3AssetOverviewResponse> {
        return this.api.assetsServiceGetAssetOverview(param.assetId, param.pageNumber, param.size, param.widget, param.ip, param.host, param.database, param.assetEntityType,  options).toPromise();
    }

    /**
     * GetAssetTopology- Get list of topology for a parent asset.
     * @param param the request object
     */
    public assetsServiceGetAssetTopologyWithHttpInfo(param: AssetsServiceApiAssetsServiceGetAssetTopologyRequest, options?: ConfigurationOptions): Promise<HttpInfo<Assetsv3GetAssetTopologyResponse>> {
        return this.api.assetsServiceGetAssetTopologyWithHttpInfo(param.assetsv3GetAssetTopologyRequest,  options).toPromise();
    }

    /**
     * GetAssetTopology- Get list of topology for a parent asset.
     * @param param the request object
     */
    public assetsServiceGetAssetTopology(param: AssetsServiceApiAssetsServiceGetAssetTopologyRequest, options?: ConfigurationOptions): Promise<Assetsv3GetAssetTopologyResponse> {
        return this.api.assetsServiceGetAssetTopology(param.assetsv3GetAssetTopologyRequest,  options).toPromise();
    }

    /**
     * GetFilterTemplateForAssets - Get list of filters query templates for manage assets.
     * @param param the request object
     */
    public assetsServiceGetFilterTemplateForAssetsWithHttpInfo(param: AssetsServiceApiAssetsServiceGetFilterTemplateForAssetsRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Assetsv3GetFilterTemplateResponse>> {
        return this.api.assetsServiceGetFilterTemplateForAssetsWithHttpInfo(param.templateId,  options).toPromise();
    }

    /**
     * GetFilterTemplateForAssets - Get list of filters query templates for manage assets.
     * @param param the request object
     */
    public assetsServiceGetFilterTemplateForAssets(param: AssetsServiceApiAssetsServiceGetFilterTemplateForAssetsRequest = {}, options?: ConfigurationOptions): Promise<Assetsv3GetFilterTemplateResponse> {
        return this.api.assetsServiceGetFilterTemplateForAssets(param.templateId,  options).toPromise();
    }

    /**
     * GetFiltersForAssets - Get a list of filters category and sub category with all data.
     * @param param the request object
     */
    public assetsServiceGetFiltersForAssetsWithHttpInfo(param: AssetsServiceApiAssetsServiceGetFiltersForAssetsRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Assetsv3GetFiltersDataResponse>> {
        return this.api.assetsServiceGetFiltersForAssetsWithHttpInfo( options).toPromise();
    }

    /**
     * GetFiltersForAssets - Get a list of filters category and sub category with all data.
     * @param param the request object
     */
    public assetsServiceGetFiltersForAssets(param: AssetsServiceApiAssetsServiceGetFiltersForAssetsRequest = {}, options?: ConfigurationOptions): Promise<Assetsv3GetFiltersDataResponse> {
        return this.api.assetsServiceGetFiltersForAssets( options).toPromise();
    }

    /**
     * ImportCSV - Start the async asset import from CSV by starting the db procedure and send notification at the end.
     * @param param the request object
     */
    public assetsServiceImportCSVWithHttpInfo(param: AssetsServiceApiAssetsServiceImportCSVRequest, options?: ConfigurationOptions): Promise<HttpInfo<Assetsv3ImportCSVResponse>> {
        return this.api.assetsServiceImportCSVWithHttpInfo(param.csvId, param.assetsv3ImportCSVRequest,  options).toPromise();
    }

    /**
     * ImportCSV - Start the async asset import from CSV by starting the db procedure and send notification at the end.
     * @param param the request object
     */
    public assetsServiceImportCSV(param: AssetsServiceApiAssetsServiceImportCSVRequest, options?: ConfigurationOptions): Promise<Assetsv3ImportCSVResponse> {
        return this.api.assetsServiceImportCSV(param.csvId, param.assetsv3ImportCSVRequest,  options).toPromise();
    }

    /**
     * ListPolicy - List all policies.
     * @param param the request object
     */
    public assetsServiceListPolicyWithHttpInfo(param: AssetsServiceApiAssetsServiceListPolicyRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Assetsv3ListPolicyResponse>> {
        return this.api.assetsServiceListPolicyWithHttpInfo( options).toPromise();
    }

    /**
     * ListPolicy - List all policies.
     * @param param the request object
     */
    public assetsServiceListPolicy(param: AssetsServiceApiAssetsServiceListPolicyRequest = {}, options?: ConfigurationOptions): Promise<Assetsv3ListPolicyResponse> {
        return this.api.assetsServiceListPolicy( options).toPromise();
    }

    /**
     * ListRule - List all rules for a policy.
     * @param param the request object
     */
    public assetsServiceListRuleWithHttpInfo(param: AssetsServiceApiAssetsServiceListRuleRequest, options?: ConfigurationOptions): Promise<HttpInfo<Assetsv3ListRuleResponse>> {
        return this.api.assetsServiceListRuleWithHttpInfo(param.policyId,  options).toPromise();
    }

    /**
     * ListRule - List all rules for a policy.
     * @param param the request object
     */
    public assetsServiceListRule(param: AssetsServiceApiAssetsServiceListRuleRequest, options?: ConfigurationOptions): Promise<Assetsv3ListRuleResponse> {
        return this.api.assetsServiceListRule(param.policyId,  options).toPromise();
    }

    /**
     * ListTagDomains - Get Tag categories by request parameters .
     * @param param the request object
     */
    public assetsServiceListTagDomainsWithHttpInfo(param: AssetsServiceApiAssetsServiceListTagDomainsRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Assetsv3ListTagDomainsResponse>> {
        return this.api.assetsServiceListTagDomainsWithHttpInfo(param.domGrouper, param.purpose, param.needTag,  options).toPromise();
    }

    /**
     * ListTagDomains - Get Tag categories by request parameters .
     * @param param the request object
     */
    public assetsServiceListTagDomains(param: AssetsServiceApiAssetsServiceListTagDomainsRequest = {}, options?: ConfigurationOptions): Promise<Assetsv3ListTagDomainsResponse> {
        return this.api.assetsServiceListTagDomains(param.domGrouper, param.purpose, param.needTag,  options).toPromise();
    }

    /**
     * ListTags - Get Tags for Manage Tags listing screen .
     * @param param the request object
     */
    public assetsServiceListTagsWithHttpInfo(param: AssetsServiceApiAssetsServiceListTagsRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Assetsv3ListTagsResponse>> {
        return this.api.assetsServiceListTagsWithHttpInfo(param.assetId,  options).toPromise();
    }

    /**
     * ListTags - Get Tags for Manage Tags listing screen .
     * @param param the request object
     */
    public assetsServiceListTags(param: AssetsServiceApiAssetsServiceListTagsRequest = {}, options?: ConfigurationOptions): Promise<Assetsv3ListTagsResponse> {
        return this.api.assetsServiceListTags(param.assetId,  options).toPromise();
    }

    /**
     * MergeOrSplitAssets - Merge or split the selected assets.
     * @param param the request object
     */
    public assetsServiceMergeOrSplitAssetsWithHttpInfo(param: AssetsServiceApiAssetsServiceMergeOrSplitAssetsRequest, options?: ConfigurationOptions): Promise<HttpInfo<any>> {
        return this.api.assetsServiceMergeOrSplitAssetsWithHttpInfo(param.assetsv3MergeOrSplitAssetsRequest,  options).toPromise();
    }

    /**
     * MergeOrSplitAssets - Merge or split the selected assets.
     * @param param the request object
     */
    public assetsServiceMergeOrSplitAssets(param: AssetsServiceApiAssetsServiceMergeOrSplitAssetsRequest, options?: ConfigurationOptions): Promise<any> {
        return this.api.assetsServiceMergeOrSplitAssets(param.assetsv3MergeOrSplitAssetsRequest,  options).toPromise();
    }

    /**
     * SaveAssignedTags - Save Assigned Tags to TAG_DSDEF_MAP table.
     * @param param the request object
     */
    public assetsServiceSaveAssignedTagsWithHttpInfo(param: AssetsServiceApiAssetsServiceSaveAssignedTagsRequest, options?: ConfigurationOptions): Promise<HttpInfo<any>> {
        return this.api.assetsServiceSaveAssignedTagsWithHttpInfo(param.assetsv3SaveAssignedTagsRequest,  options).toPromise();
    }

    /**
     * SaveAssignedTags - Save Assigned Tags to TAG_DSDEF_MAP table.
     * @param param the request object
     */
    public assetsServiceSaveAssignedTags(param: AssetsServiceApiAssetsServiceSaveAssignedTagsRequest, options?: ConfigurationOptions): Promise<any> {
        return this.api.assetsServiceSaveAssignedTags(param.assetsv3SaveAssignedTagsRequest,  options).toPromise();
    }

    /**
     * SaveTagConceptData - creates a custom tag
     * @param param the request object
     */
    public assetsServiceSaveTagConceptDataWithHttpInfo(param: AssetsServiceApiAssetsServiceSaveTagConceptDataRequest, options?: ConfigurationOptions): Promise<HttpInfo<any>> {
        return this.api.assetsServiceSaveTagConceptDataWithHttpInfo(param.assetsv3SaveTagConceptDataRequest,  options).toPromise();
    }

    /**
     * SaveTagConceptData - creates a custom tag
     * @param param the request object
     */
    public assetsServiceSaveTagConceptData(param: AssetsServiceApiAssetsServiceSaveTagConceptDataRequest, options?: ConfigurationOptions): Promise<any> {
        return this.api.assetsServiceSaveTagConceptData(param.assetsv3SaveTagConceptDataRequest,  options).toPromise();
    }

    /**
     * SaveTagDomainData - creates a custom category to be assigned to a tag
     * @param param the request object
     */
    public assetsServiceSaveTagDomainDataWithHttpInfo(param: AssetsServiceApiAssetsServiceSaveTagDomainDataRequest, options?: ConfigurationOptions): Promise<HttpInfo<any>> {
        return this.api.assetsServiceSaveTagDomainDataWithHttpInfo(param.assetsv3SaveTagDomainDataRequest,  options).toPromise();
    }

    /**
     * SaveTagDomainData - creates a custom category to be assigned to a tag
     * @param param the request object
     */
    public assetsServiceSaveTagDomainData(param: AssetsServiceApiAssetsServiceSaveTagDomainDataRequest, options?: ConfigurationOptions): Promise<any> {
        return this.api.assetsServiceSaveTagDomainData(param.assetsv3SaveTagDomainDataRequest,  options).toPromise();
    }

    /**
     * SaveUpdateFilterTemplateForAssets - Save/Update a filters query to use as template in manage assets along with reordering of template list.
     * @param param the request object
     */
    public assetsServiceSaveUpdateFilterTemplateForAssetsWithHttpInfo(param: AssetsServiceApiAssetsServiceSaveUpdateFilterTemplateForAssetsRequest, options?: ConfigurationOptions): Promise<HttpInfo<Assetsv3SaveUpdateFilterTemplateResponse>> {
        return this.api.assetsServiceSaveUpdateFilterTemplateForAssetsWithHttpInfo(param.assetsv3SaveUpdateFilterTemplateRequest,  options).toPromise();
    }

    /**
     * SaveUpdateFilterTemplateForAssets - Save/Update a filters query to use as template in manage assets along with reordering of template list.
     * @param param the request object
     */
    public assetsServiceSaveUpdateFilterTemplateForAssets(param: AssetsServiceApiAssetsServiceSaveUpdateFilterTemplateForAssetsRequest, options?: ConfigurationOptions): Promise<Assetsv3SaveUpdateFilterTemplateResponse> {
        return this.api.assetsServiceSaveUpdateFilterTemplateForAssets(param.assetsv3SaveUpdateFilterTemplateRequest,  options).toPromise();
    }

    /**
     * SetBannerState - Set banner state for asset inventory page.
     * @param param the request object
     */
    public assetsServiceSetBannerStateWithHttpInfo(param: AssetsServiceApiAssetsServiceSetBannerStateRequest, options?: ConfigurationOptions): Promise<HttpInfo<any>> {
        return this.api.assetsServiceSetBannerStateWithHttpInfo(param.assetsv3SetBannerStateRequest,  options).toPromise();
    }

    /**
     * SetBannerState - Set banner state for asset inventory page.
     * @param param the request object
     */
    public assetsServiceSetBannerState(param: AssetsServiceApiAssetsServiceSetBannerStateRequest, options?: ConfigurationOptions): Promise<any> {
        return this.api.assetsServiceSetBannerState(param.assetsv3SetBannerStateRequest,  options).toPromise();
    }

    /**
     * UpdateAssetName - Udates the name of the asset as given by the user.
     * @param param the request object
     */
    public assetsServiceUpdateAssetNameWithHttpInfo(param: AssetsServiceApiAssetsServiceUpdateAssetNameRequest, options?: ConfigurationOptions): Promise<HttpInfo<any>> {
        return this.api.assetsServiceUpdateAssetNameWithHttpInfo(param.assetsv3UpdateAssetNameRequest,  options).toPromise();
    }

    /**
     * UpdateAssetName - Udates the name of the asset as given by the user.
     * @param param the request object
     */
    public assetsServiceUpdateAssetName(param: AssetsServiceApiAssetsServiceUpdateAssetNameRequest, options?: ConfigurationOptions): Promise<any> {
        return this.api.assetsServiceUpdateAssetName(param.assetsv3UpdateAssetNameRequest,  options).toPromise();
    }

    /**
     * UpdatePolicy - Update existing Policy status.
     * @param param the request object
     */
    public assetsServiceUpdatePolicyWithHttpInfo(param: AssetsServiceApiAssetsServiceUpdatePolicyRequest, options?: ConfigurationOptions): Promise<HttpInfo<any>> {
        return this.api.assetsServiceUpdatePolicyWithHttpInfo(param.assetsv3UpdatePolicyRequest,  options).toPromise();
    }

    /**
     * UpdatePolicy - Update existing Policy status.
     * @param param the request object
     */
    public assetsServiceUpdatePolicy(param: AssetsServiceApiAssetsServiceUpdatePolicyRequest, options?: ConfigurationOptions): Promise<any> {
        return this.api.assetsServiceUpdatePolicy(param.assetsv3UpdatePolicyRequest,  options).toPromise();
    }

}

import { ObservableAuditServiceApi } from "./ObservableAPI";
import { AuditServiceApiRequestFactory, AuditServiceApiResponseProcessor} from "../apis/AuditServiceApi";

export interface AuditServiceApiAuditServiceGetActivityRecordsRequest {
    /**
     * Return records starting at this time (&gt;&#x3D;).
     * Defaults to: undefined
     * @type Date
     * @memberof AuditServiceApiauditServiceGetActivityRecords
     */
    startTime?: Date
    /**
     * Return records ending before this time (&lt;).
     * Defaults to: undefined
     * @type Date
     * @memberof AuditServiceApiauditServiceGetActivityRecords
     */
    endTime?: Date
    /**
     * Return records with this service/collection id.
     * Defaults to: undefined
     * @type string
     * @memberof AuditServiceApiauditServiceGetActivityRecords
     */
    uid?: string
    /**
     * Return records matching this operation (CRUD or other action).
     * Defaults to: undefined
     * @type string
     * @memberof AuditServiceApiauditServiceGetActivityRecords
     */
    actionTaken?: string
    /**
     * Return records for this service/collection.
     * Defaults to: undefined
     * @type string
     * @memberof AuditServiceApiauditServiceGetActivityRecords
     */
    context?: string
    /**
     * Return records created only for this reason.
     * Defaults to: undefined
     * @type string
     * @memberof AuditServiceApiauditServiceGetActivityRecords
     */
    changesMade?: string
    /**
     * Return records originating with the specified user id.
     * Defaults to: undefined
     * @type string
     * @memberof AuditServiceApiauditServiceGetActivityRecords
     */
    performedBy?: string
    /**
     * Return records with this label.
     * Defaults to: undefined
     * @type string
     * @memberof AuditServiceApiauditServiceGetActivityRecords
     */
    contextDescription?: string
    /**
     * Return records based on the query.
     * Defaults to: undefined
     * @type string
     * @memberof AuditServiceApiauditServiceGetActivityRecords
     */
    query?: string
    /**
     * The amount to offset the rows by for pagination.
     * Defaults to: undefined
     * @type number
     * @memberof AuditServiceApiauditServiceGetActivityRecords
     */
    offset?: number
    /**
     * The max amount of rows to return for pagination.
     * Defaults to: undefined
     * @type number
     * @memberof AuditServiceApiauditServiceGetActivityRecords
     */
    limit?: number
    /**
     * Return eligable filters if this is true.
     * Defaults to: undefined
     * @type boolean
     * @memberof AuditServiceApiauditServiceGetActivityRecords
     */
    filter?: boolean
}

export interface AuditServiceApiAuditServicePutDownloadActivityRecordRequest {
    /**
     * 
     * @type Auditv3PutActivityRecordRequest
     * @memberof AuditServiceApiauditServicePutDownloadActivityRecord
     */
    auditv3PutActivityRecordRequest: Auditv3PutActivityRecordRequest
}

export class ObjectAuditServiceApi {
    private api: ObservableAuditServiceApi

    public constructor(configuration: Configuration, requestFactory?: AuditServiceApiRequestFactory, responseProcessor?: AuditServiceApiResponseProcessor) {
        this.api = new ObservableAuditServiceApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Summary: Get activity records Description: Return activity records that match the arguments passed in the request.  Multiple values can be passed to the (UID, Context, ActionTaken, PerformedBy) fields by supplying a  comma-separated list to the corresponding fields in the request.  For instance to check for  multiple Contexts set the field to \"op1, op2, op3\".
     * @param param the request object
     */
    public auditServiceGetActivityRecordsWithHttpInfo(param: AuditServiceApiAuditServiceGetActivityRecordsRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Auditv3GetActivityRecordsResponse>> {
        return this.api.auditServiceGetActivityRecordsWithHttpInfo(param.startTime, param.endTime, param.uid, param.actionTaken, param.context, param.changesMade, param.performedBy, param.contextDescription, param.query, param.offset, param.limit, param.filter,  options).toPromise();
    }

    /**
     * Summary: Get activity records Description: Return activity records that match the arguments passed in the request.  Multiple values can be passed to the (UID, Context, ActionTaken, PerformedBy) fields by supplying a  comma-separated list to the corresponding fields in the request.  For instance to check for  multiple Contexts set the field to \"op1, op2, op3\".
     * @param param the request object
     */
    public auditServiceGetActivityRecords(param: AuditServiceApiAuditServiceGetActivityRecordsRequest = {}, options?: ConfigurationOptions): Promise<Auditv3GetActivityRecordsResponse> {
        return this.api.auditServiceGetActivityRecords(param.startTime, param.endTime, param.uid, param.actionTaken, param.context, param.changesMade, param.performedBy, param.contextDescription, param.query, param.offset, param.limit, param.filter,  options).toPromise();
    }

    /**
     * Summary: Put download activity record Description: Create an activity log record with the arguments passed in the request.
     * @param param the request object
     */
    public auditServicePutDownloadActivityRecordWithHttpInfo(param: AuditServiceApiAuditServicePutDownloadActivityRecordRequest, options?: ConfigurationOptions): Promise<HttpInfo<Auditv3PutActivityRecordResponse>> {
        return this.api.auditServicePutDownloadActivityRecordWithHttpInfo(param.auditv3PutActivityRecordRequest,  options).toPromise();
    }

    /**
     * Summary: Put download activity record Description: Create an activity log record with the arguments passed in the request.
     * @param param the request object
     */
    public auditServicePutDownloadActivityRecord(param: AuditServiceApiAuditServicePutDownloadActivityRecordRequest, options?: ConfigurationOptions): Promise<Auditv3PutActivityRecordResponse> {
        return this.api.auditServicePutDownloadActivityRecord(param.auditv3PutActivityRecordRequest,  options).toPromise();
    }

}

import { ObservableAuthServerServiceApi } from "./ObservableAPI";
import { AuthServerServiceApiRequestFactory, AuthServerServiceApiResponseProcessor} from "../apis/AuthServerServiceApi";

export interface AuthServerServiceApiAuthServerServiceCreateOauthClientRequest {
    /**
     * 
     * @type AuthserverCreateOauthClientRequest
     * @memberof AuthServerServiceApiauthServerServiceCreateOauthClient
     */
    authserverCreateOauthClientRequest: AuthserverCreateOauthClientRequest
}

export interface AuthServerServiceApiAuthServerServiceDeleteOauthClientRequest {
    /**
     * ClientID of registered OAuth.
     * Defaults to: undefined
     * @type string
     * @memberof AuthServerServiceApiauthServerServiceDeleteOauthClient
     */
    clientId: string
}

export interface AuthServerServiceApiAuthServerServiceGetAccessTokenRequest {
}

export interface AuthServerServiceApiAuthServerServiceGetOauthClientRequest {
    /**
     * ClientID of registered OAuth.
     * Defaults to: undefined
     * @type string
     * @memberof AuthServerServiceApiauthServerServiceGetOauthClient
     */
    clientId: string
}

export interface AuthServerServiceApiAuthServerServiceGetUserRequest {
}

export interface AuthServerServiceApiAuthServerServiceListOauthClientRequest {
}

export class ObjectAuthServerServiceApi {
    private api: ObservableAuthServerServiceApi

    public constructor(configuration: Configuration, requestFactory?: AuthServerServiceApiRequestFactory, responseProcessor?: AuthServerServiceApiResponseProcessor) {
        this.api = new ObservableAuthServerServiceApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Summary: Create Oauth client Description: Create/register new Oauth client.
     * @param param the request object
     */
    public authServerServiceCreateOauthClientWithHttpInfo(param: AuthServerServiceApiAuthServerServiceCreateOauthClientRequest, options?: ConfigurationOptions): Promise<HttpInfo<AuthserverCreateOauthClientResponse>> {
        return this.api.authServerServiceCreateOauthClientWithHttpInfo(param.authserverCreateOauthClientRequest,  options).toPromise();
    }

    /**
     * Summary: Create Oauth client Description: Create/register new Oauth client.
     * @param param the request object
     */
    public authServerServiceCreateOauthClient(param: AuthServerServiceApiAuthServerServiceCreateOauthClientRequest, options?: ConfigurationOptions): Promise<AuthserverCreateOauthClientResponse> {
        return this.api.authServerServiceCreateOauthClient(param.authserverCreateOauthClientRequest,  options).toPromise();
    }

    /**
     * Summary: Delete Oauth client Description: Delete registered Oauth client by clientId.
     * @param param the request object
     */
    public authServerServiceDeleteOauthClientWithHttpInfo(param: AuthServerServiceApiAuthServerServiceDeleteOauthClientRequest, options?: ConfigurationOptions): Promise<HttpInfo<any>> {
        return this.api.authServerServiceDeleteOauthClientWithHttpInfo(param.clientId,  options).toPromise();
    }

    /**
     * Summary: Delete Oauth client Description: Delete registered Oauth client by clientId.
     * @param param the request object
     */
    public authServerServiceDeleteOauthClient(param: AuthServerServiceApiAuthServerServiceDeleteOauthClientRequest, options?: ConfigurationOptions): Promise<any> {
        return this.api.authServerServiceDeleteOauthClient(param.clientId,  options).toPromise();
    }

    /**
     * Summary: Get access token Description: Get access token from passed clientId and secret.
     * @param param the request object
     */
    public authServerServiceGetAccessTokenWithHttpInfo(param: AuthServerServiceApiAuthServerServiceGetAccessTokenRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<AuthserverGetAccessTokenResponse>> {
        return this.api.authServerServiceGetAccessTokenWithHttpInfo( options).toPromise();
    }

    /**
     * Summary: Get access token Description: Get access token from passed clientId and secret.
     * @param param the request object
     */
    public authServerServiceGetAccessToken(param: AuthServerServiceApiAuthServerServiceGetAccessTokenRequest = {}, options?: ConfigurationOptions): Promise<AuthserverGetAccessTokenResponse> {
        return this.api.authServerServiceGetAccessToken( options).toPromise();
    }

    /**
     * Summary: Get Oauth client Description: Get registered Oauth client by clientId.
     * @param param the request object
     */
    public authServerServiceGetOauthClientWithHttpInfo(param: AuthServerServiceApiAuthServerServiceGetOauthClientRequest, options?: ConfigurationOptions): Promise<HttpInfo<AuthserverGetOauthClientResponse>> {
        return this.api.authServerServiceGetOauthClientWithHttpInfo(param.clientId,  options).toPromise();
    }

    /**
     * Summary: Get Oauth client Description: Get registered Oauth client by clientId.
     * @param param the request object
     */
    public authServerServiceGetOauthClient(param: AuthServerServiceApiAuthServerServiceGetOauthClientRequest, options?: ConfigurationOptions): Promise<AuthserverGetOauthClientResponse> {
        return this.api.authServerServiceGetOauthClient(param.clientId,  options).toPromise();
    }

    /**
     * Summary: Get user Description: Get user.
     * @param param the request object
     */
    public authServerServiceGetUserWithHttpInfo(param: AuthServerServiceApiAuthServerServiceGetUserRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<AuthserverGetUserResponse>> {
        return this.api.authServerServiceGetUserWithHttpInfo( options).toPromise();
    }

    /**
     * Summary: Get user Description: Get user.
     * @param param the request object
     */
    public authServerServiceGetUser(param: AuthServerServiceApiAuthServerServiceGetUserRequest = {}, options?: ConfigurationOptions): Promise<AuthserverGetUserResponse> {
        return this.api.authServerServiceGetUser( options).toPromise();
    }

    /**
     * Summary: List Oauth client Description: List all registered Oauth client.
     * @param param the request object
     */
    public authServerServiceListOauthClientWithHttpInfo(param: AuthServerServiceApiAuthServerServiceListOauthClientRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<AuthserverListOauthClientResponse>> {
        return this.api.authServerServiceListOauthClientWithHttpInfo( options).toPromise();
    }

    /**
     * Summary: List Oauth client Description: List all registered Oauth client.
     * @param param the request object
     */
    public authServerServiceListOauthClient(param: AuthServerServiceApiAuthServerServiceListOauthClientRequest = {}, options?: ConfigurationOptions): Promise<AuthserverListOauthClientResponse> {
        return this.api.authServerServiceListOauthClient( options).toPromise();
    }

}

import { ObservableCloudAccountsApi } from "./ObservableAPI";
import { CloudAccountsApiRequestFactory, CloudAccountsApiResponseProcessor} from "../apis/CloudAccountsApi";

export interface CloudAccountsApiAddAnalyzedRegionRequest {
    /**
     * 
     * @type AddAnalyzedRegionRequest
     * @memberof CloudAccountsApiaddAnalyzedRegion
     */
    addAnalyzedRegionRequest: AddAnalyzedRegionRequest
}

export interface CloudAccountsApiAddCloudAccountsRequest {
    /**
     * 
     * @type AddCloudAccountsRequest
     * @memberof CloudAccountsApiaddCloudAccounts
     */
    addCloudAccountsRequest: AddCloudAccountsRequest
}

export interface CloudAccountsApiGenerateAtlassianConfluenceAuthUrlRequest {
}

export interface CloudAccountsApiGenerateAtlassianJiraAuthUrlRequest {
}

export interface CloudAccountsApiGenerateAzureAuthUrlRequest {
    /**
     * Tenant Id of the new Azure account, GUID format.
     * Defaults to: undefined
     * @type string
     * @memberof CloudAccountsApigenerateAzureAuthUrl
     */
    tenantId?: string
}

export interface CloudAccountsApiGenerateOffice365AuthUrlRequest {
}

export interface CloudAccountsApiGenerateSalesforceAuthUrlRequest {
}

export interface CloudAccountsApiGenerateSlackAuthUrlRequest {
}

export interface CloudAccountsApiGenerateSnowflakeAuthUrlRequest {
    /**
     * 
     * @type ClientInfo
     * @memberof CloudAccountsApigenerateSnowflakeAuthUrl
     */
    clientInfo: ClientInfo
}

export interface CloudAccountsApiGetAnalyzedRegionStatusRequest {
    /**
     * The cloud provider for the cloud account
     * Defaults to: undefined
     * @type CloudServiceProvider
     * @memberof CloudAccountsApigetAnalyzedRegionStatus
     */
    cloudProvider: CloudServiceProvider
    /**
     * The region code
     * Defaults to: undefined
     * @type string
     * @memberof CloudAccountsApigetAnalyzedRegionStatus
     */
    region: string
}

export interface CloudAccountsApiGetAzureAdminConsentStatusRequest {
}

export interface CloudAccountsApiGetCloudAccountInstallationStatusRequest {
    /**
     * The cloud provider of the cloud account
     * Defaults to: undefined
     * @type CloudServiceProvider
     * @memberof CloudAccountsApigetCloudAccountInstallationStatus
     */
    cloudProvider: CloudServiceProvider
    /**
     * The cloud account identifier
     * Defaults to: undefined
     * @type string
     * @memberof CloudAccountsApigetCloudAccountInstallationStatus
     */
    cloudAccountId: string
}

export interface CloudAccountsApiGetDatabaseMetadataRequest {
    /**
     * 
     * @type DbInfo
     * @memberof CloudAccountsApigetDatabaseMetadata
     */
    dbInfo: DbInfo
}

export interface CloudAccountsApiGetRefreshTokenExpiryRequest {
    /**
     * The ID of the provider
     * Defaults to: undefined
     * @type string
     * @memberof CloudAccountsApigetRefreshTokenExpiry
     */
    providerId: string
}

export interface CloudAccountsApiListLinkedAccountsRequest {
}

export interface CloudAccountsApiRemoveAccountsRequest {
    /**
     * 
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof CloudAccountsApiremoveAccounts
     */
    accountIds: Array<string>
    /**
     * 
     * Defaults to: undefined
     * @type ServiceProvider
     * @memberof CloudAccountsApiremoveAccounts
     */
    serviceProvider: ServiceProvider
}

export interface CloudAccountsApiRemoveAccountsInstructionsRequest {
    /**
     * 
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof CloudAccountsApiremoveAccountsInstructions
     */
    accountIds: Array<string>
    /**
     * 
     * Defaults to: undefined
     * @type ServiceProvider
     * @memberof CloudAccountsApiremoveAccountsInstructions
     */
    serviceProvider: ServiceProvider
}

export interface CloudAccountsApiRetrieveServiceAccountIdRequest {
}

export interface CloudAccountsApiSnowflakeIntegrationScriptRequest {
}

export interface CloudAccountsApiSubmitGoogleWorkspaceAdminEmailRequest {
    /**
     * 
     * @type SubmitAdminEmailParams
     * @memberof CloudAccountsApisubmitGoogleWorkspaceAdminEmail
     */
    submitAdminEmailParams: SubmitAdminEmailParams
}

export interface CloudAccountsApiSubmitOffice365TenantInfoRequest {
    /**
     * 
     * @type TenantInfo
     * @memberof CloudAccountsApisubmitOffice365TenantInfo
     */
    tenantInfo: TenantInfo
}

export interface CloudAccountsApiSubmitSalesforceAuthCodeRequest {
    /**
     * 
     * @type AuthCode
     * @memberof CloudAccountsApisubmitSalesforceAuthCode
     */
    authCode: AuthCode
}

export interface CloudAccountsApiSubmitSlackAuthCodeRequest {
    /**
     * 
     * @type SubmitAuthCode
     * @memberof CloudAccountsApisubmitSlackAuthCode
     */
    submitAuthCode: SubmitAuthCode
}

export interface CloudAccountsApiSubmitSnowflakeAuthCodeRequest {
    /**
     * 
     * @type AuthInfo
     * @memberof CloudAccountsApisubmitSnowflakeAuthCode
     */
    authInfo: AuthInfo
}

export class ObjectCloudAccountsApi {
    private api: ObservableCloudAccountsApi

    public constructor(configuration: Configuration, requestFactory?: CloudAccountsApiRequestFactory, responseProcessor?: CloudAccountsApiResponseProcessor) {
        this.api = new ObservableCloudAccountsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Install a new analyzer in the specified region to enable data classification in that region.
     * Add a new region for data classification
     * @param param the request object
     */
    public addAnalyzedRegionWithHttpInfo(param: CloudAccountsApiAddAnalyzedRegionRequest, options?: ConfigurationOptions): Promise<HttpInfo<AddAnalyzedRegion200Response>> {
        return this.api.addAnalyzedRegionWithHttpInfo(param.addAnalyzedRegionRequest,  options).toPromise();
    }

    /**
     * Install a new analyzer in the specified region to enable data classification in that region.
     * Add a new region for data classification
     * @param param the request object
     */
    public addAnalyzedRegion(param: CloudAccountsApiAddAnalyzedRegionRequest, options?: ConfigurationOptions): Promise<AddAnalyzedRegion200Response> {
        return this.api.addAnalyzedRegion(param.addAnalyzedRegionRequest,  options).toPromise();
    }

    /**
     * You can add a single or multiple cloud account connections from the same cloud provider.<BR>Adding these cloud account connections will trigger Guardium DSPM for data store discovery.<BR>To enable data classification, run the \'Add a new region for data classification\' API.
     * Add cloud account connections to DSPM
     * @param param the request object
     */
    public addCloudAccountsWithHttpInfo(param: CloudAccountsApiAddCloudAccountsRequest, options?: ConfigurationOptions): Promise<HttpInfo<AddCloudAccounts200Response>> {
        return this.api.addCloudAccountsWithHttpInfo(param.addCloudAccountsRequest,  options).toPromise();
    }

    /**
     * You can add a single or multiple cloud account connections from the same cloud provider.<BR>Adding these cloud account connections will trigger Guardium DSPM for data store discovery.<BR>To enable data classification, run the \'Add a new region for data classification\' API.
     * Add cloud account connections to DSPM
     * @param param the request object
     */
    public addCloudAccounts(param: CloudAccountsApiAddCloudAccountsRequest, options?: ConfigurationOptions): Promise<AddCloudAccounts200Response> {
        return this.api.addCloudAccounts(param.addCloudAccountsRequest,  options).toPromise();
    }

    /**
     * Generate an Atlassian authentication URL for Confluence integration.
     * Generate a Confluence authentication URL
     * @param param the request object
     */
    public generateAtlassianConfluenceAuthUrlWithHttpInfo(param: CloudAccountsApiGenerateAtlassianConfluenceAuthUrlRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<AuthUrl>> {
        return this.api.generateAtlassianConfluenceAuthUrlWithHttpInfo( options).toPromise();
    }

    /**
     * Generate an Atlassian authentication URL for Confluence integration.
     * Generate a Confluence authentication URL
     * @param param the request object
     */
    public generateAtlassianConfluenceAuthUrl(param: CloudAccountsApiGenerateAtlassianConfluenceAuthUrlRequest = {}, options?: ConfigurationOptions): Promise<AuthUrl> {
        return this.api.generateAtlassianConfluenceAuthUrl( options).toPromise();
    }

    /**
     * Generate an Atlassian authentication URL for JIRA integration.
     * Generate a JIRA authentication URL
     * @param param the request object
     */
    public generateAtlassianJiraAuthUrlWithHttpInfo(param: CloudAccountsApiGenerateAtlassianJiraAuthUrlRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<AuthUrl>> {
        return this.api.generateAtlassianJiraAuthUrlWithHttpInfo( options).toPromise();
    }

    /**
     * Generate an Atlassian authentication URL for JIRA integration.
     * Generate a JIRA authentication URL
     * @param param the request object
     */
    public generateAtlassianJiraAuthUrl(param: CloudAccountsApiGenerateAtlassianJiraAuthUrlRequest = {}, options?: ConfigurationOptions): Promise<AuthUrl> {
        return this.api.generateAtlassianJiraAuthUrl( options).toPromise();
    }

    /**
     * Generate azure authorization url.
     * Generate azure authorization url
     * @param param the request object
     */
    public generateAzureAuthUrlWithHttpInfo(param: CloudAccountsApiGenerateAzureAuthUrlRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<AuthUrl>> {
        return this.api.generateAzureAuthUrlWithHttpInfo(param.tenantId,  options).toPromise();
    }

    /**
     * Generate azure authorization url.
     * Generate azure authorization url
     * @param param the request object
     */
    public generateAzureAuthUrl(param: CloudAccountsApiGenerateAzureAuthUrlRequest = {}, options?: ConfigurationOptions): Promise<AuthUrl> {
        return this.api.generateAzureAuthUrl(param.tenantId,  options).toPromise();
    }

    /**
     * Generate an administrator consent URL for Microsoft 365 integration.
     * Generate a Microsoft 365 consent URL
     * @param param the request object
     */
    public generateOffice365AuthUrlWithHttpInfo(param: CloudAccountsApiGenerateOffice365AuthUrlRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<AuthUrl>> {
        return this.api.generateOffice365AuthUrlWithHttpInfo( options).toPromise();
    }

    /**
     * Generate an administrator consent URL for Microsoft 365 integration.
     * Generate a Microsoft 365 consent URL
     * @param param the request object
     */
    public generateOffice365AuthUrl(param: CloudAccountsApiGenerateOffice365AuthUrlRequest = {}, options?: ConfigurationOptions): Promise<AuthUrl> {
        return this.api.generateOffice365AuthUrl( options).toPromise();
    }

    /**
     * Generate an administrator consent URL for Salesforce integration.
     * Generate a Salesforce consent URL
     * @param param the request object
     */
    public generateSalesforceAuthUrlWithHttpInfo(param: CloudAccountsApiGenerateSalesforceAuthUrlRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<AuthUrl>> {
        return this.api.generateSalesforceAuthUrlWithHttpInfo( options).toPromise();
    }

    /**
     * Generate an administrator consent URL for Salesforce integration.
     * Generate a Salesforce consent URL
     * @param param the request object
     */
    public generateSalesforceAuthUrl(param: CloudAccountsApiGenerateSalesforceAuthUrlRequest = {}, options?: ConfigurationOptions): Promise<AuthUrl> {
        return this.api.generateSalesforceAuthUrl( options).toPromise();
    }

    /**
     * Generate a Slack authentication URL.
     * Generate a Slack authentication URL
     * @param param the request object
     */
    public generateSlackAuthUrlWithHttpInfo(param: CloudAccountsApiGenerateSlackAuthUrlRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<AuthUrl>> {
        return this.api.generateSlackAuthUrlWithHttpInfo( options).toPromise();
    }

    /**
     * Generate a Slack authentication URL.
     * Generate a Slack authentication URL
     * @param param the request object
     */
    public generateSlackAuthUrl(param: CloudAccountsApiGenerateSlackAuthUrlRequest = {}, options?: ConfigurationOptions): Promise<AuthUrl> {
        return this.api.generateSlackAuthUrl( options).toPromise();
    }

    /**
     * Generate an administrator consent URL for Snowflake integration.
     * Validate and Generate a Snowflake OAuth URL
     * @param param the request object
     */
    public generateSnowflakeAuthUrlWithHttpInfo(param: CloudAccountsApiGenerateSnowflakeAuthUrlRequest, options?: ConfigurationOptions): Promise<HttpInfo<AuthUrl>> {
        return this.api.generateSnowflakeAuthUrlWithHttpInfo(param.clientInfo,  options).toPromise();
    }

    /**
     * Generate an administrator consent URL for Snowflake integration.
     * Validate and Generate a Snowflake OAuth URL
     * @param param the request object
     */
    public generateSnowflakeAuthUrl(param: CloudAccountsApiGenerateSnowflakeAuthUrlRequest, options?: ConfigurationOptions): Promise<AuthUrl> {
        return this.api.generateSnowflakeAuthUrl(param.clientInfo,  options).toPromise();
    }

    /**
     * Get the installation status of Guardium DSPM for a region.
     * Get the status of analyzer installation for a region
     * @param param the request object
     */
    public getAnalyzedRegionStatusWithHttpInfo(param: CloudAccountsApiGetAnalyzedRegionStatusRequest, options?: ConfigurationOptions): Promise<HttpInfo<GetAnalyzedRegionStatus200Response>> {
        return this.api.getAnalyzedRegionStatusWithHttpInfo(param.cloudProvider, param.region,  options).toPromise();
    }

    /**
     * Get the installation status of Guardium DSPM for a region.
     * Get the status of analyzer installation for a region
     * @param param the request object
     */
    public getAnalyzedRegionStatus(param: CloudAccountsApiGetAnalyzedRegionStatusRequest, options?: ConfigurationOptions): Promise<GetAnalyzedRegionStatus200Response> {
        return this.api.getAnalyzedRegionStatus(param.cloudProvider, param.region,  options).toPromise();
    }

    /**
     * Get Azure admin consent status.
     * Get Azure admin consent status
     * @param param the request object
     */
    public getAzureAdminConsentStatusWithHttpInfo(param: CloudAccountsApiGetAzureAdminConsentStatusRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<boolean>> {
        return this.api.getAzureAdminConsentStatusWithHttpInfo( options).toPromise();
    }

    /**
     * Get Azure admin consent status.
     * Get Azure admin consent status
     * @param param the request object
     */
    public getAzureAdminConsentStatus(param: CloudAccountsApiGetAzureAdminConsentStatusRequest = {}, options?: ConfigurationOptions): Promise<boolean> {
        return this.api.getAzureAdminConsentStatus( options).toPromise();
    }

    /**
     * Get the installation status of a cloud account.
     * Get the installation status of a cloud account
     * @param param the request object
     */
    public getCloudAccountInstallationStatusWithHttpInfo(param: CloudAccountsApiGetCloudAccountInstallationStatusRequest, options?: ConfigurationOptions): Promise<HttpInfo<CloudAccountInstallationStatus>> {
        return this.api.getCloudAccountInstallationStatusWithHttpInfo(param.cloudProvider, param.cloudAccountId,  options).toPromise();
    }

    /**
     * Get the installation status of a cloud account.
     * Get the installation status of a cloud account
     * @param param the request object
     */
    public getCloudAccountInstallationStatus(param: CloudAccountsApiGetCloudAccountInstallationStatusRequest, options?: ConfigurationOptions): Promise<CloudAccountInstallationStatus> {
        return this.api.getCloudAccountInstallationStatus(param.cloudProvider, param.cloudAccountId,  options).toPromise();
    }

    /**
     * Get the metadata details of snowflake database from saas-asset-store.
     * Get the metadata details of snowflake database.
     * @param param the request object
     */
    public getDatabaseMetadataWithHttpInfo(param: CloudAccountsApiGetDatabaseMetadataRequest, options?: ConfigurationOptions): Promise<HttpInfo<DBMetadataInfo>> {
        return this.api.getDatabaseMetadataWithHttpInfo(param.dbInfo,  options).toPromise();
    }

    /**
     * Get the metadata details of snowflake database from saas-asset-store.
     * Get the metadata details of snowflake database.
     * @param param the request object
     */
    public getDatabaseMetadata(param: CloudAccountsApiGetDatabaseMetadataRequest, options?: ConfigurationOptions): Promise<DBMetadataInfo> {
        return this.api.getDatabaseMetadata(param.dbInfo,  options).toPromise();
    }

    /**
     * Get Snowflake Refresh Token Expiry date.
     * Get Snowflake Refresh Token Expiry date
     * @param param the request object
     */
    public getRefreshTokenExpiryWithHttpInfo(param: CloudAccountsApiGetRefreshTokenExpiryRequest, options?: ConfigurationOptions): Promise<HttpInfo<TokenExpiryInfo>> {
        return this.api.getRefreshTokenExpiryWithHttpInfo(param.providerId,  options).toPromise();
    }

    /**
     * Get Snowflake Refresh Token Expiry date.
     * Get Snowflake Refresh Token Expiry date
     * @param param the request object
     */
    public getRefreshTokenExpiry(param: CloudAccountsApiGetRefreshTokenExpiryRequest, options?: ConfigurationOptions): Promise<TokenExpiryInfo> {
        return this.api.getRefreshTokenExpiry(param.providerId,  options).toPromise();
    }

    /**
     * Get a list of all the connected cloud accounts monitored by Guardium DSPM.
     * List cloud accounts connected to DSPM
     * @param param the request object
     */
    public listLinkedAccountsWithHttpInfo(param: CloudAccountsApiListLinkedAccountsRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Array<LinkedAccounts>>> {
        return this.api.listLinkedAccountsWithHttpInfo( options).toPromise();
    }

    /**
     * Get a list of all the connected cloud accounts monitored by Guardium DSPM.
     * List cloud accounts connected to DSPM
     * @param param the request object
     */
    public listLinkedAccounts(param: CloudAccountsApiListLinkedAccountsRequest = {}, options?: ConfigurationOptions): Promise<Array<LinkedAccounts>> {
        return this.api.listLinkedAccounts( options).toPromise();
    }

    /**
     * Post cloud account ID connections to be removed from Guardium DSPM.
     * Post cloud account ID connections to be removed
     * @param param the request object
     */
    public removeAccountsWithHttpInfo(param: CloudAccountsApiRemoveAccountsRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.removeAccountsWithHttpInfo(param.accountIds, param.serviceProvider,  options).toPromise();
    }

    /**
     * Post cloud account ID connections to be removed from Guardium DSPM.
     * Post cloud account ID connections to be removed
     * @param param the request object
     */
    public removeAccounts(param: CloudAccountsApiRemoveAccountsRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.removeAccounts(param.accountIds, param.serviceProvider,  options).toPromise();
    }

    /**
     * Post cloud accounts IDs and get instructions to remove the accounts from the cloud service provider.
     * Post cloud account IDs and get instructions to remove the accounts
     * @param param the request object
     */
    public removeAccountsInstructionsWithHttpInfo(param: CloudAccountsApiRemoveAccountsInstructionsRequest, options?: ConfigurationOptions): Promise<HttpInfo<RemoveAccountsInstructions200Response>> {
        return this.api.removeAccountsInstructionsWithHttpInfo(param.accountIds, param.serviceProvider,  options).toPromise();
    }

    /**
     * Post cloud accounts IDs and get instructions to remove the accounts from the cloud service provider.
     * Post cloud account IDs and get instructions to remove the accounts
     * @param param the request object
     */
    public removeAccountsInstructions(param: CloudAccountsApiRemoveAccountsInstructionsRequest, options?: ConfigurationOptions): Promise<RemoveAccountsInstructions200Response> {
        return this.api.removeAccountsInstructions(param.accountIds, param.serviceProvider,  options).toPromise();
    }

    /**
     * Retrieve a service account ID to use it for Google Workspace authentication.
     * Get Google Workspace authentication
     * @param param the request object
     */
    public retrieveServiceAccountIdWithHttpInfo(param: CloudAccountsApiRetrieveServiceAccountIdRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<ServiceAccountClientId>> {
        return this.api.retrieveServiceAccountIdWithHttpInfo( options).toPromise();
    }

    /**
     * Retrieve a service account ID to use it for Google Workspace authentication.
     * Get Google Workspace authentication
     * @param param the request object
     */
    public retrieveServiceAccountId(param: CloudAccountsApiRetrieveServiceAccountIdRequest = {}, options?: ConfigurationOptions): Promise<ServiceAccountClientId> {
        return this.api.retrieveServiceAccountId( options).toPromise();
    }

    /**
     * Generate Snowflake integration Script.
     * Generate Snowflake Integration Script
     * @param param the request object
     */
    public snowflakeIntegrationScriptWithHttpInfo(param: CloudAccountsApiSnowflakeIntegrationScriptRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Script>> {
        return this.api.snowflakeIntegrationScriptWithHttpInfo( options).toPromise();
    }

    /**
     * Generate Snowflake integration Script.
     * Generate Snowflake Integration Script
     * @param param the request object
     */
    public snowflakeIntegrationScript(param: CloudAccountsApiSnowflakeIntegrationScriptRequest = {}, options?: ConfigurationOptions): Promise<Script> {
        return this.api.snowflakeIntegrationScript( options).toPromise();
    }

    /**
     * Submit admin email for service account authorization and return service-account authorization status.
     * Submit email for service account authorization
     * @param param the request object
     */
    public submitGoogleWorkspaceAdminEmailWithHttpInfo(param: CloudAccountsApiSubmitGoogleWorkspaceAdminEmailRequest, options?: ConfigurationOptions): Promise<HttpInfo<ServiceAccountInstallationStatus>> {
        return this.api.submitGoogleWorkspaceAdminEmailWithHttpInfo(param.submitAdminEmailParams,  options).toPromise();
    }

    /**
     * Submit admin email for service account authorization and return service-account authorization status.
     * Submit email for service account authorization
     * @param param the request object
     */
    public submitGoogleWorkspaceAdminEmail(param: CloudAccountsApiSubmitGoogleWorkspaceAdminEmailRequest, options?: ConfigurationOptions): Promise<ServiceAccountInstallationStatus> {
        return this.api.submitGoogleWorkspaceAdminEmail(param.submitAdminEmailParams,  options).toPromise();
    }

    /**
     * Submit customer information for Microsoft 365 integration.
     * Submit Microsoft 365 customer information
     * @param param the request object
     */
    public submitOffice365TenantInfoWithHttpInfo(param: CloudAccountsApiSubmitOffice365TenantInfoRequest, options?: ConfigurationOptions): Promise<HttpInfo<Office365TenantInfo>> {
        return this.api.submitOffice365TenantInfoWithHttpInfo(param.tenantInfo,  options).toPromise();
    }

    /**
     * Submit customer information for Microsoft 365 integration.
     * Submit Microsoft 365 customer information
     * @param param the request object
     */
    public submitOffice365TenantInfo(param: CloudAccountsApiSubmitOffice365TenantInfoRequest, options?: ConfigurationOptions): Promise<Office365TenantInfo> {
        return this.api.submitOffice365TenantInfo(param.tenantInfo,  options).toPromise();
    }

    /**
     * Submit customer information for Salesforce integration.
     * Submit Salesforce customer information
     * @param param the request object
     */
    public submitSalesforceAuthCodeWithHttpInfo(param: CloudAccountsApiSubmitSalesforceAuthCodeRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.submitSalesforceAuthCodeWithHttpInfo(param.authCode,  options).toPromise();
    }

    /**
     * Submit customer information for Salesforce integration.
     * Submit Salesforce customer information
     * @param param the request object
     */
    public submitSalesforceAuthCode(param: CloudAccountsApiSubmitSalesforceAuthCodeRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.submitSalesforceAuthCode(param.authCode,  options).toPromise();
    }

    /**
     * Submit a Slack authentication code.
     * Submit a Slack authentication code
     * @param param the request object
     */
    public submitSlackAuthCodeWithHttpInfo(param: CloudAccountsApiSubmitSlackAuthCodeRequest, options?: ConfigurationOptions): Promise<HttpInfo<any>> {
        return this.api.submitSlackAuthCodeWithHttpInfo(param.submitAuthCode,  options).toPromise();
    }

    /**
     * Submit a Slack authentication code.
     * Submit a Slack authentication code
     * @param param the request object
     */
    public submitSlackAuthCode(param: CloudAccountsApiSubmitSlackAuthCodeRequest, options?: ConfigurationOptions): Promise<any> {
        return this.api.submitSlackAuthCode(param.submitAuthCode,  options).toPromise();
    }

    /**
     * Storing code that is returned from Snowflake oAuth.
     * Submit Snowflake oAuth code
     * @param param the request object
     */
    public submitSnowflakeAuthCodeWithHttpInfo(param: CloudAccountsApiSubmitSnowflakeAuthCodeRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.submitSnowflakeAuthCodeWithHttpInfo(param.authInfo,  options).toPromise();
    }

    /**
     * Storing code that is returned from Snowflake oAuth.
     * Submit Snowflake oAuth code
     * @param param the request object
     */
    public submitSnowflakeAuthCode(param: CloudAccountsApiSubmitSnowflakeAuthCodeRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.submitSnowflakeAuthCode(param.authInfo,  options).toPromise();
    }

}

import { ObservableComplianceAcceleratorApi } from "./ObservableAPI";
import { ComplianceAcceleratorApiRequestFactory, ComplianceAcceleratorApiResponseProcessor} from "../apis/ComplianceAcceleratorApi";

export interface ComplianceAcceleratorApiComplianceAcceleratorCreateWorkspaceRequest {
    /**
     * 
     * @type Complianceacceleratorv3CreateWorkspaceRequest
     * @memberof ComplianceAcceleratorApicomplianceAcceleratorCreateWorkspace
     */
    complianceacceleratorv3CreateWorkspaceRequest: Complianceacceleratorv3CreateWorkspaceRequest
}

export interface ComplianceAcceleratorApiComplianceAcceleratorDeleteComplianceWorkspacesRequest {
    /**
     * Id to be deleted.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof ComplianceAcceleratorApicomplianceAcceleratorDeleteComplianceWorkspaces
     */
    regulations?: Array<string>
    /**
     * if you want to delete a whole configuration.
     * Defaults to: undefined
     * @type boolean
     * @memberof ComplianceAcceleratorApicomplianceAcceleratorDeleteComplianceWorkspaces
     */
    deleteAll?: boolean
}

export interface ComplianceAcceleratorApiComplianceAcceleratorGetComplianceInfoRequest {
    /**
     * gives compliance workspace data without reaching out to other services - meant to be quicker for dashboards.
     * Defaults to: undefined
     * @type boolean
     * @memberof ComplianceAcceleratorApicomplianceAcceleratorGetComplianceInfo
     */
    isBrief?: boolean
}

export interface ComplianceAcceleratorApiComplianceAcceleratorHydrateWorkspaceRequest {
    /**
     * 
     * @type Complianceacceleratorv3HydrateComplianceWorkspacesRequest
     * @memberof ComplianceAcceleratorApicomplianceAcceleratorHydrateWorkspace
     */
    complianceacceleratorv3HydrateComplianceWorkspacesRequest: Complianceacceleratorv3HydrateComplianceWorkspacesRequest
}

export interface ComplianceAcceleratorApiComplianceAcceleratorStoreComplianceInfoRequest {
    /**
     * 
     * @type Complianceacceleratorv3StoreComplianceInfoRequest
     * @memberof ComplianceAcceleratorApicomplianceAcceleratorStoreComplianceInfo
     */
    complianceacceleratorv3StoreComplianceInfoRequest: Complianceacceleratorv3StoreComplianceInfoRequest
}

export class ObjectComplianceAcceleratorApi {
    private api: ObservableComplianceAcceleratorApi

    public constructor(configuration: Configuration, requestFactory?: ComplianceAcceleratorApiRequestFactory, responseProcessor?: ComplianceAcceleratorApiResponseProcessor) {
        this.api = new ObservableComplianceAcceleratorApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Summary: Create workspace Description: Create a workspace.
     * @param param the request object
     */
    public complianceAcceleratorCreateWorkspaceWithHttpInfo(param: ComplianceAcceleratorApiComplianceAcceleratorCreateWorkspaceRequest, options?: ConfigurationOptions): Promise<HttpInfo<StreamResultOfComplianceacceleratorv3CreateWorkspaceResponse>> {
        return this.api.complianceAcceleratorCreateWorkspaceWithHttpInfo(param.complianceacceleratorv3CreateWorkspaceRequest,  options).toPromise();
    }

    /**
     * Summary: Create workspace Description: Create a workspace.
     * @param param the request object
     */
    public complianceAcceleratorCreateWorkspace(param: ComplianceAcceleratorApiComplianceAcceleratorCreateWorkspaceRequest, options?: ConfigurationOptions): Promise<StreamResultOfComplianceacceleratorv3CreateWorkspaceResponse> {
        return this.api.complianceAcceleratorCreateWorkspace(param.complianceacceleratorv3CreateWorkspaceRequest,  options).toPromise();
    }

    /**
     * Summary: Delete compliance workspaces Description: Delete workspaces.
     * @param param the request object
     */
    public complianceAcceleratorDeleteComplianceWorkspacesWithHttpInfo(param: ComplianceAcceleratorApiComplianceAcceleratorDeleteComplianceWorkspacesRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Complianceacceleratorv3DeleteComplianceWorkspacesResponse>> {
        return this.api.complianceAcceleratorDeleteComplianceWorkspacesWithHttpInfo(param.regulations, param.deleteAll,  options).toPromise();
    }

    /**
     * Summary: Delete compliance workspaces Description: Delete workspaces.
     * @param param the request object
     */
    public complianceAcceleratorDeleteComplianceWorkspaces(param: ComplianceAcceleratorApiComplianceAcceleratorDeleteComplianceWorkspacesRequest = {}, options?: ConfigurationOptions): Promise<Complianceacceleratorv3DeleteComplianceWorkspacesResponse> {
        return this.api.complianceAcceleratorDeleteComplianceWorkspaces(param.regulations, param.deleteAll,  options).toPromise();
    }

    /**
     * Summary: Get compliance info Description: Return stored compliance data.
     * @param param the request object
     */
    public complianceAcceleratorGetComplianceInfoWithHttpInfo(param: ComplianceAcceleratorApiComplianceAcceleratorGetComplianceInfoRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Complianceacceleratorv3GetComplianceInfoResponse>> {
        return this.api.complianceAcceleratorGetComplianceInfoWithHttpInfo(param.isBrief,  options).toPromise();
    }

    /**
     * Summary: Get compliance info Description: Return stored compliance data.
     * @param param the request object
     */
    public complianceAcceleratorGetComplianceInfo(param: ComplianceAcceleratorApiComplianceAcceleratorGetComplianceInfoRequest = {}, options?: ConfigurationOptions): Promise<Complianceacceleratorv3GetComplianceInfoResponse> {
        return this.api.complianceAcceleratorGetComplianceInfo(param.isBrief,  options).toPromise();
    }

    /**
     * HydrateWorkspace - Hydrates specified objects within a workspace
     * @param param the request object
     */
    public complianceAcceleratorHydrateWorkspaceWithHttpInfo(param: ComplianceAcceleratorApiComplianceAcceleratorHydrateWorkspaceRequest, options?: ConfigurationOptions): Promise<HttpInfo<Complianceacceleratorv3HydrateComplianceWorkspacesResponse>> {
        return this.api.complianceAcceleratorHydrateWorkspaceWithHttpInfo(param.complianceacceleratorv3HydrateComplianceWorkspacesRequest,  options).toPromise();
    }

    /**
     * HydrateWorkspace - Hydrates specified objects within a workspace
     * @param param the request object
     */
    public complianceAcceleratorHydrateWorkspace(param: ComplianceAcceleratorApiComplianceAcceleratorHydrateWorkspaceRequest, options?: ConfigurationOptions): Promise<Complianceacceleratorv3HydrateComplianceWorkspacesResponse> {
        return this.api.complianceAcceleratorHydrateWorkspace(param.complianceacceleratorv3HydrateComplianceWorkspacesRequest,  options).toPromise();
    }

    /**
     * Summary: Store compliance info Description: Store compliance data.
     * @param param the request object
     */
    public complianceAcceleratorStoreComplianceInfoWithHttpInfo(param: ComplianceAcceleratorApiComplianceAcceleratorStoreComplianceInfoRequest, options?: ConfigurationOptions): Promise<HttpInfo<Complianceacceleratorv3StoreComplianceInfoResponse>> {
        return this.api.complianceAcceleratorStoreComplianceInfoWithHttpInfo(param.complianceacceleratorv3StoreComplianceInfoRequest,  options).toPromise();
    }

    /**
     * Summary: Store compliance info Description: Store compliance data.
     * @param param the request object
     */
    public complianceAcceleratorStoreComplianceInfo(param: ComplianceAcceleratorApiComplianceAcceleratorStoreComplianceInfoRequest, options?: ConfigurationOptions): Promise<Complianceacceleratorv3StoreComplianceInfoResponse> {
        return this.api.complianceAcceleratorStoreComplianceInfo(param.complianceacceleratorv3StoreComplianceInfoRequest,  options).toPromise();
    }

}

import { ObservableConnectionsServiceApi } from "./ObservableAPI";
import { ConnectionsServiceApiRequestFactory, ConnectionsServiceApiResponseProcessor} from "../apis/ConnectionsServiceApi";

export interface ConnectionsServiceApiConnectionsServiceCreateConnectionsAccountsRequest {
    /**
     * 
     * @type Connectionsv3CreateConnectionsAccountsRequest
     * @memberof ConnectionsServiceApiconnectionsServiceCreateConnectionsAccounts
     */
    connectionsv3CreateConnectionsAccountsRequest: Connectionsv3CreateConnectionsAccountsRequest
}

export interface ConnectionsServiceApiConnectionsServiceCreateConnectionsConfigsRequest {
    /**
     * 
     * @type Connectionsv3CreateConnectionsConfigsRequest
     * @memberof ConnectionsServiceApiconnectionsServiceCreateConnectionsConfigs
     */
    connectionsv3CreateConnectionsConfigsRequest: Connectionsv3CreateConnectionsConfigsRequest
}

export interface ConnectionsServiceApiConnectionsServiceCreatePluginRequest {
    /**
     * 
     * @type Connectionsv3CreatePluginRequest
     * @memberof ConnectionsServiceApiconnectionsServiceCreatePlugin
     */
    connectionsv3CreatePluginRequest: Connectionsv3CreatePluginRequest
}

export interface ConnectionsServiceApiConnectionsServiceCreateSettingsRequest {
    /**
     * 
     * @type Connectionsv3CreateSettingsRequest
     * @memberof ConnectionsServiceApiconnectionsServiceCreateSettings
     */
    connectionsv3CreateSettingsRequest: Connectionsv3CreateSettingsRequest
}

export interface ConnectionsServiceApiConnectionsServiceDeleteConnectionsAccountsRequest {
    /**
     * Account id.
     * Defaults to: undefined
     * @type string
     * @memberof ConnectionsServiceApiconnectionsServiceDeleteConnectionsAccounts
     */
    accountId: string
}

export interface ConnectionsServiceApiConnectionsServiceDeleteConnectionsConfigsRequest {
    /**
     * Connection id.
     * Defaults to: undefined
     * @type string
     * @memberof ConnectionsServiceApiconnectionsServiceDeleteConnectionsConfigs
     */
    connectionId: string
}

export interface ConnectionsServiceApiConnectionsServiceDeleteConnectorRequest {
    /**
     * The connection id
     * Defaults to: undefined
     * @type string
     * @memberof ConnectionsServiceApiconnectionsServiceDeleteConnector
     */
    connectionId: string
}

export interface ConnectionsServiceApiConnectionsServiceDeletePluginRequest {
    /**
     * plugin id
     * Defaults to: undefined
     * @type string
     * @memberof ConnectionsServiceApiconnectionsServiceDeletePlugin
     */
    id: string
}

export interface ConnectionsServiceApiConnectionsServiceGeneratePackageRequest {
    /**
     * id
     * Defaults to: undefined
     * @type string
     * @memberof ConnectionsServiceApiconnectionsServiceGeneratePackage
     */
    id: string
    /**
     * 
     * @type Connectionsv3GeneratePackageRequest
     * @memberof ConnectionsServiceApiconnectionsServiceGeneratePackage
     */
    connectionsv3GeneratePackageRequest: Connectionsv3GeneratePackageRequest
}

export interface ConnectionsServiceApiConnectionsServiceGetBannerStateRequest {
}

export interface ConnectionsServiceApiConnectionsServiceGetConnectionsAccountsRequest {
    /**
     * Optional: account id.
     * Defaults to: undefined
     * @type string
     * @memberof ConnectionsServiceApiconnectionsServiceGetConnectionsAccounts
     */
    accountId?: string
    /**
     * Optional: acccount access key.
     * Defaults to: undefined
     * @type string
     * @memberof ConnectionsServiceApiconnectionsServiceGetConnectionsAccounts
     */
    accessKey?: string
}

export interface ConnectionsServiceApiConnectionsServiceGetConnectionsConfigsRequest {
    /**
     * The type of connector.
     * Defaults to: &#39;UNDEFINED_TYPE&#39;
     * @type &#39;UNDEFINED_TYPE&#39; | &#39;AWS&#39; | &#39;AZURE&#39; | &#39;UC&#39; | &#39;STAP&#39;
     * @memberof ConnectionsServiceApiconnectionsServiceGetConnectionsConfigs
     */
    type?: 'UNDEFINED_TYPE' | 'AWS' | 'AZURE' | 'UC' | 'STAP'
    /**
     * Optional: if connection id did not provide then return all connections.
     * Defaults to: undefined
     * @type string
     * @memberof ConnectionsServiceApiconnectionsServiceGetConnectionsConfigs
     */
    connectionId?: string
}

export interface ConnectionsServiceApiConnectionsServiceGetConnectionsWithFiltersRequest {
    /**
     * 
     * @type Connectionsv3GetConnectionsWithFiltersRequest
     * @memberof ConnectionsServiceApiconnectionsServiceGetConnectionsWithFilters
     */
    connectionsv3GetConnectionsWithFiltersRequest: Connectionsv3GetConnectionsWithFiltersRequest
}

export interface ConnectionsServiceApiConnectionsServiceGetConnectorsSummaryRequest {
}

export interface ConnectionsServiceApiConnectionsServiceGetDataSourcesRequest {
}

export interface ConnectionsServiceApiConnectionsServiceGetGuardRecordFieldsRequest {
}

export interface ConnectionsServiceApiConnectionsServiceGetHeadersRequest {
}

export interface ConnectionsServiceApiConnectionsServiceGetPluginsRequest {
    /**
     * Optional: if no plug-in id is provided, returns list of all plug-ins.
     * Defaults to: undefined
     * @type string
     * @memberof ConnectionsServiceApiconnectionsServiceGetPlugins
     */
    id?: string
}

export interface ConnectionsServiceApiConnectionsServiceGetSettingsRequest {
}

export interface ConnectionsServiceApiConnectionsServicePartialUpdateConnectorsRequest {
    /**
     * 
     * @type Connectionsv3PartialUpdateConnectorsRequest
     * @memberof ConnectionsServiceApiconnectionsServicePartialUpdateConnectors
     */
    connectionsv3PartialUpdateConnectorsRequest: Connectionsv3PartialUpdateConnectorsRequest
}

export interface ConnectionsServiceApiConnectionsServicePostStapCommandRequest {
    /**
     * 
     * @type Connectionsv3StapCommandRequest
     * @memberof ConnectionsServiceApiconnectionsServicePostStapCommand
     */
    connectionsv3StapCommandRequest: Connectionsv3StapCommandRequest
}

export interface ConnectionsServiceApiConnectionsServiceUpdateBannerStateRequest {
    /**
     * 
     * @type Connectionsv3UpdateBannerStateRequest
     * @memberof ConnectionsServiceApiconnectionsServiceUpdateBannerState
     */
    connectionsv3UpdateBannerStateRequest: Connectionsv3UpdateBannerStateRequest
}

export interface ConnectionsServiceApiConnectionsServiceUpdateConnectionsAccountsRequest {
    /**
     * 
     * @type Connectionsv3UpdateConnectionsAccountsRequest
     * @memberof ConnectionsServiceApiconnectionsServiceUpdateConnectionsAccounts
     */
    connectionsv3UpdateConnectionsAccountsRequest: Connectionsv3UpdateConnectionsAccountsRequest
}

export interface ConnectionsServiceApiConnectionsServiceUpdateConnectionsConfigsRequest {
    /**
     * 
     * @type Connectionsv3UpdateConnectionsConfigsRequest
     * @memberof ConnectionsServiceApiconnectionsServiceUpdateConnectionsConfigs
     */
    connectionsv3UpdateConnectionsConfigsRequest: Connectionsv3UpdateConnectionsConfigsRequest
}

export interface ConnectionsServiceApiConnectionsServiceUpdateConnectorsRequest {
    /**
     * 
     * @type Connectionsv3UpdateConnectorsRequest
     * @memberof ConnectionsServiceApiconnectionsServiceUpdateConnectors
     */
    connectionsv3UpdateConnectorsRequest: Connectionsv3UpdateConnectorsRequest
}

export interface ConnectionsServiceApiConnectionsServiceUpdatePluginRequest {
    /**
     * id
     * Defaults to: undefined
     * @type string
     * @memberof ConnectionsServiceApiconnectionsServiceUpdatePlugin
     */
    id: string
    /**
     * 
     * @type Connectionsv3UpdatePluginRequest
     * @memberof ConnectionsServiceApiconnectionsServiceUpdatePlugin
     */
    connectionsv3UpdatePluginRequest: Connectionsv3UpdatePluginRequest
}

export interface ConnectionsServiceApiConnectionsServiceUpdateSettingsRequest {
    /**
     * 
     * @type Connectionsv3UpdateSettingsRequest
     * @memberof ConnectionsServiceApiconnectionsServiceUpdateSettings
     */
    connectionsv3UpdateSettingsRequest: Connectionsv3UpdateSettingsRequest
}

export interface ConnectionsServiceApiConnectionsServiceValidateAwsConnectionRequest {
    /**
     * 
     * @type Connectionsv3ValidateAwsConnectionRequest
     * @memberof ConnectionsServiceApiconnectionsServiceValidateAwsConnection
     */
    connectionsv3ValidateAwsConnectionRequest: Connectionsv3ValidateAwsConnectionRequest
}

export interface ConnectionsServiceApiConnectionsServiceValidateAzureConnectionRequest {
    /**
     * 
     * @type Connectionsv3ValidateAzureConnectionRequest
     * @memberof ConnectionsServiceApiconnectionsServiceValidateAzureConnection
     */
    connectionsv3ValidateAzureConnectionRequest: Connectionsv3ValidateAzureConnectionRequest
}

export interface ConnectionsServiceApiConnectionsServiceValidateGcpConnectionRequest {
    /**
     * 
     * @type Connectionsv3ValidateGcpConnectionRequest
     * @memberof ConnectionsServiceApiconnectionsServiceValidateGcpConnection
     */
    connectionsv3ValidateGcpConnectionRequest: Connectionsv3ValidateGcpConnectionRequest
}

export class ObjectConnectionsServiceApi {
    private api: ObservableConnectionsServiceApi

    public constructor(configuration: Configuration, requestFactory?: ConnectionsServiceApiRequestFactory, responseProcessor?: ConnectionsServiceApiResponseProcessor) {
        this.api = new ObservableConnectionsServiceApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Summary: Create Connections accounts Description: Create Connections acccounts.
     * @param param the request object
     */
    public connectionsServiceCreateConnectionsAccountsWithHttpInfo(param: ConnectionsServiceApiConnectionsServiceCreateConnectionsAccountsRequest, options?: ConfigurationOptions): Promise<HttpInfo<Connectionsv3CreateConnectionsAccountsResponse>> {
        return this.api.connectionsServiceCreateConnectionsAccountsWithHttpInfo(param.connectionsv3CreateConnectionsAccountsRequest,  options).toPromise();
    }

    /**
     * Summary: Create Connections accounts Description: Create Connections acccounts.
     * @param param the request object
     */
    public connectionsServiceCreateConnectionsAccounts(param: ConnectionsServiceApiConnectionsServiceCreateConnectionsAccountsRequest, options?: ConfigurationOptions): Promise<Connectionsv3CreateConnectionsAccountsResponse> {
        return this.api.connectionsServiceCreateConnectionsAccounts(param.connectionsv3CreateConnectionsAccountsRequest,  options).toPromise();
    }

    /**
     * Summary: Create connections configs Description: Create Connection config by connection type.
     * @param param the request object
     */
    public connectionsServiceCreateConnectionsConfigsWithHttpInfo(param: ConnectionsServiceApiConnectionsServiceCreateConnectionsConfigsRequest, options?: ConfigurationOptions): Promise<HttpInfo<Connectionsv3CreateConnectionsConfigsResponse>> {
        return this.api.connectionsServiceCreateConnectionsConfigsWithHttpInfo(param.connectionsv3CreateConnectionsConfigsRequest,  options).toPromise();
    }

    /**
     * Summary: Create connections configs Description: Create Connection config by connection type.
     * @param param the request object
     */
    public connectionsServiceCreateConnectionsConfigs(param: ConnectionsServiceApiConnectionsServiceCreateConnectionsConfigsRequest, options?: ConfigurationOptions): Promise<Connectionsv3CreateConnectionsConfigsResponse> {
        return this.api.connectionsServiceCreateConnectionsConfigs(param.connectionsv3CreateConnectionsConfigsRequest,  options).toPromise();
    }

    /**
     * Summary: Create plugin Description: Create UC generic plugin
     * @param param the request object
     */
    public connectionsServiceCreatePluginWithHttpInfo(param: ConnectionsServiceApiConnectionsServiceCreatePluginRequest, options?: ConfigurationOptions): Promise<HttpInfo<Connectionsv3CreatePluginResponse>> {
        return this.api.connectionsServiceCreatePluginWithHttpInfo(param.connectionsv3CreatePluginRequest,  options).toPromise();
    }

    /**
     * Summary: Create plugin Description: Create UC generic plugin
     * @param param the request object
     */
    public connectionsServiceCreatePlugin(param: ConnectionsServiceApiConnectionsServiceCreatePluginRequest, options?: ConfigurationOptions): Promise<Connectionsv3CreatePluginResponse> {
        return this.api.connectionsServiceCreatePlugin(param.connectionsv3CreatePluginRequest,  options).toPromise();
    }

    /**
     * Summary: Create settings Description: Create Settings.
     * @param param the request object
     */
    public connectionsServiceCreateSettingsWithHttpInfo(param: ConnectionsServiceApiConnectionsServiceCreateSettingsRequest, options?: ConfigurationOptions): Promise<HttpInfo<any>> {
        return this.api.connectionsServiceCreateSettingsWithHttpInfo(param.connectionsv3CreateSettingsRequest,  options).toPromise();
    }

    /**
     * Summary: Create settings Description: Create Settings.
     * @param param the request object
     */
    public connectionsServiceCreateSettings(param: ConnectionsServiceApiConnectionsServiceCreateSettingsRequest, options?: ConfigurationOptions): Promise<any> {
        return this.api.connectionsServiceCreateSettings(param.connectionsv3CreateSettingsRequest,  options).toPromise();
    }

    /**
     * Summary: Delete Connections accounts Description: Delete Connections acccounts.
     * @param param the request object
     */
    public connectionsServiceDeleteConnectionsAccountsWithHttpInfo(param: ConnectionsServiceApiConnectionsServiceDeleteConnectionsAccountsRequest, options?: ConfigurationOptions): Promise<HttpInfo<Connectionsv3DeleteConnectionsAccountsResponse>> {
        return this.api.connectionsServiceDeleteConnectionsAccountsWithHttpInfo(param.accountId,  options).toPromise();
    }

    /**
     * Summary: Delete Connections accounts Description: Delete Connections acccounts.
     * @param param the request object
     */
    public connectionsServiceDeleteConnectionsAccounts(param: ConnectionsServiceApiConnectionsServiceDeleteConnectionsAccountsRequest, options?: ConfigurationOptions): Promise<Connectionsv3DeleteConnectionsAccountsResponse> {
        return this.api.connectionsServiceDeleteConnectionsAccounts(param.accountId,  options).toPromise();
    }

    /**
     * Summary: Delete connections configs Description: Delete Connection config by connection id.
     * @param param the request object
     */
    public connectionsServiceDeleteConnectionsConfigsWithHttpInfo(param: ConnectionsServiceApiConnectionsServiceDeleteConnectionsConfigsRequest, options?: ConfigurationOptions): Promise<HttpInfo<Connectionsv3DeleteConnectionsConfigsResponse>> {
        return this.api.connectionsServiceDeleteConnectionsConfigsWithHttpInfo(param.connectionId,  options).toPromise();
    }

    /**
     * Summary: Delete connections configs Description: Delete Connection config by connection id.
     * @param param the request object
     */
    public connectionsServiceDeleteConnectionsConfigs(param: ConnectionsServiceApiConnectionsServiceDeleteConnectionsConfigsRequest, options?: ConfigurationOptions): Promise<Connectionsv3DeleteConnectionsConfigsResponse> {
        return this.api.connectionsServiceDeleteConnectionsConfigs(param.connectionId,  options).toPromise();
    }

    /**
     * Summary: Delete connector Description: Delete a Connection.
     * @param param the request object
     */
    public connectionsServiceDeleteConnectorWithHttpInfo(param: ConnectionsServiceApiConnectionsServiceDeleteConnectorRequest, options?: ConfigurationOptions): Promise<HttpInfo<any>> {
        return this.api.connectionsServiceDeleteConnectorWithHttpInfo(param.connectionId,  options).toPromise();
    }

    /**
     * Summary: Delete connector Description: Delete a Connection.
     * @param param the request object
     */
    public connectionsServiceDeleteConnector(param: ConnectionsServiceApiConnectionsServiceDeleteConnectorRequest, options?: ConfigurationOptions): Promise<any> {
        return this.api.connectionsServiceDeleteConnector(param.connectionId,  options).toPromise();
    }

    /**
     * Summary: Delete plugin. Description: Delete plugin.
     * @param param the request object
     */
    public connectionsServiceDeletePluginWithHttpInfo(param: ConnectionsServiceApiConnectionsServiceDeletePluginRequest, options?: ConfigurationOptions): Promise<HttpInfo<Connectionsv3DeletePluginResponse>> {
        return this.api.connectionsServiceDeletePluginWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * Summary: Delete plugin. Description: Delete plugin.
     * @param param the request object
     */
    public connectionsServiceDeletePlugin(param: ConnectionsServiceApiConnectionsServiceDeletePluginRequest, options?: ConfigurationOptions): Promise<Connectionsv3DeletePluginResponse> {
        return this.api.connectionsServiceDeletePlugin(param.id,  options).toPromise();
    }

    /**
     * Summary: Generate package. Description: Generate package.
     * @param param the request object
     */
    public connectionsServiceGeneratePackageWithHttpInfo(param: ConnectionsServiceApiConnectionsServiceGeneratePackageRequest, options?: ConfigurationOptions): Promise<HttpInfo<Connectionsv3GeneratePackageResponse>> {
        return this.api.connectionsServiceGeneratePackageWithHttpInfo(param.id, param.connectionsv3GeneratePackageRequest,  options).toPromise();
    }

    /**
     * Summary: Generate package. Description: Generate package.
     * @param param the request object
     */
    public connectionsServiceGeneratePackage(param: ConnectionsServiceApiConnectionsServiceGeneratePackageRequest, options?: ConfigurationOptions): Promise<Connectionsv3GeneratePackageResponse> {
        return this.api.connectionsServiceGeneratePackage(param.id, param.connectionsv3GeneratePackageRequest,  options).toPromise();
    }

    /**
     * Summary: Get banner state for object verb page.  Description: Get banner state for object verb page.
     * @param param the request object
     */
    public connectionsServiceGetBannerStateWithHttpInfo(param: ConnectionsServiceApiConnectionsServiceGetBannerStateRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Connectionsv3GetBannerStateResponse>> {
        return this.api.connectionsServiceGetBannerStateWithHttpInfo( options).toPromise();
    }

    /**
     * Summary: Get banner state for object verb page.  Description: Get banner state for object verb page.
     * @param param the request object
     */
    public connectionsServiceGetBannerState(param: ConnectionsServiceApiConnectionsServiceGetBannerStateRequest = {}, options?: ConfigurationOptions): Promise<Connectionsv3GetBannerStateResponse> {
        return this.api.connectionsServiceGetBannerState( options).toPromise();
    }

    /**
     * Summary: Get Connections accounts Description: Get Connections acccounts.
     * @param param the request object
     */
    public connectionsServiceGetConnectionsAccountsWithHttpInfo(param: ConnectionsServiceApiConnectionsServiceGetConnectionsAccountsRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Connectionsv3GetConnectionsAccountsResponse>> {
        return this.api.connectionsServiceGetConnectionsAccountsWithHttpInfo(param.accountId, param.accessKey,  options).toPromise();
    }

    /**
     * Summary: Get Connections accounts Description: Get Connections acccounts.
     * @param param the request object
     */
    public connectionsServiceGetConnectionsAccounts(param: ConnectionsServiceApiConnectionsServiceGetConnectionsAccountsRequest = {}, options?: ConfigurationOptions): Promise<Connectionsv3GetConnectionsAccountsResponse> {
        return this.api.connectionsServiceGetConnectionsAccounts(param.accountId, param.accessKey,  options).toPromise();
    }

    /**
     * Summary: Get connections configs Description: Get Connection config by connection type.
     * @param param the request object
     */
    public connectionsServiceGetConnectionsConfigsWithHttpInfo(param: ConnectionsServiceApiConnectionsServiceGetConnectionsConfigsRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Connectionsv3GetConnectionsConfigsResponse>> {
        return this.api.connectionsServiceGetConnectionsConfigsWithHttpInfo(param.type, param.connectionId,  options).toPromise();
    }

    /**
     * Summary: Get connections configs Description: Get Connection config by connection type.
     * @param param the request object
     */
    public connectionsServiceGetConnectionsConfigs(param: ConnectionsServiceApiConnectionsServiceGetConnectionsConfigsRequest = {}, options?: ConfigurationOptions): Promise<Connectionsv3GetConnectionsConfigsResponse> {
        return this.api.connectionsServiceGetConnectionsConfigs(param.type, param.connectionId,  options).toPromise();
    }

    /**
     * Summary: Get connections with filters Description: Get connections with filters.
     * @param param the request object
     */
    public connectionsServiceGetConnectionsWithFiltersWithHttpInfo(param: ConnectionsServiceApiConnectionsServiceGetConnectionsWithFiltersRequest, options?: ConfigurationOptions): Promise<HttpInfo<Connectionsv3GetConnectionsWithFiltersResponse>> {
        return this.api.connectionsServiceGetConnectionsWithFiltersWithHttpInfo(param.connectionsv3GetConnectionsWithFiltersRequest,  options).toPromise();
    }

    /**
     * Summary: Get connections with filters Description: Get connections with filters.
     * @param param the request object
     */
    public connectionsServiceGetConnectionsWithFilters(param: ConnectionsServiceApiConnectionsServiceGetConnectionsWithFiltersRequest, options?: ConfigurationOptions): Promise<Connectionsv3GetConnectionsWithFiltersResponse> {
        return this.api.connectionsServiceGetConnectionsWithFilters(param.connectionsv3GetConnectionsWithFiltersRequest,  options).toPromise();
    }

    /**
     * Summary: Get connectors summary Description: Get a summary of Connectors.
     * @param param the request object
     */
    public connectionsServiceGetConnectorsSummaryWithHttpInfo(param: ConnectionsServiceApiConnectionsServiceGetConnectorsSummaryRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Connectionsv3GetConnectorsSummaryResponse>> {
        return this.api.connectionsServiceGetConnectorsSummaryWithHttpInfo( options).toPromise();
    }

    /**
     * Summary: Get connectors summary Description: Get a summary of Connectors.
     * @param param the request object
     */
    public connectionsServiceGetConnectorsSummary(param: ConnectionsServiceApiConnectionsServiceGetConnectorsSummaryRequest = {}, options?: ConfigurationOptions): Promise<Connectionsv3GetConnectorsSummaryResponse> {
        return this.api.connectionsServiceGetConnectorsSummary( options).toPromise();
    }

    /**
     * Summary: Get data sources Description: Get a list of data sources.
     * @param param the request object
     */
    public connectionsServiceGetDataSourcesWithHttpInfo(param: ConnectionsServiceApiConnectionsServiceGetDataSourcesRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Connectionsv3GetDataSourcesResponse>> {
        return this.api.connectionsServiceGetDataSourcesWithHttpInfo( options).toPromise();
    }

    /**
     * Summary: Get data sources Description: Get a list of data sources.
     * @param param the request object
     */
    public connectionsServiceGetDataSources(param: ConnectionsServiceApiConnectionsServiceGetDataSourcesRequest = {}, options?: ConfigurationOptions): Promise<Connectionsv3GetDataSourcesResponse> {
        return this.api.connectionsServiceGetDataSources( options).toPromise();
    }

    /**
     * Summary: Get list of guard record fields.  Description: Get list of guard record fields.
     * @param param the request object
     */
    public connectionsServiceGetGuardRecordFieldsWithHttpInfo(param: ConnectionsServiceApiConnectionsServiceGetGuardRecordFieldsRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Connectionsv3GetGuardRecordFieldsResponse>> {
        return this.api.connectionsServiceGetGuardRecordFieldsWithHttpInfo( options).toPromise();
    }

    /**
     * Summary: Get list of guard record fields.  Description: Get list of guard record fields.
     * @param param the request object
     */
    public connectionsServiceGetGuardRecordFields(param: ConnectionsServiceApiConnectionsServiceGetGuardRecordFieldsRequest = {}, options?: ConfigurationOptions): Promise<Connectionsv3GetGuardRecordFieldsResponse> {
        return this.api.connectionsServiceGetGuardRecordFields( options).toPromise();
    }

    /**
     * Summary: Get headers Description: Get a list of Headers.
     * @param param the request object
     */
    public connectionsServiceGetHeadersWithHttpInfo(param: ConnectionsServiceApiConnectionsServiceGetHeadersRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Connectionsv3GetHeadersResponse>> {
        return this.api.connectionsServiceGetHeadersWithHttpInfo( options).toPromise();
    }

    /**
     * Summary: Get headers Description: Get a list of Headers.
     * @param param the request object
     */
    public connectionsServiceGetHeaders(param: ConnectionsServiceApiConnectionsServiceGetHeadersRequest = {}, options?: ConfigurationOptions): Promise<Connectionsv3GetHeadersResponse> {
        return this.api.connectionsServiceGetHeaders( options).toPromise();
    }

    /**
     * Summary: Get plugins  Description: Get custom universal connector plugins
     * @param param the request object
     */
    public connectionsServiceGetPluginsWithHttpInfo(param: ConnectionsServiceApiConnectionsServiceGetPluginsRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Connectionsv3GetPluginsResponse>> {
        return this.api.connectionsServiceGetPluginsWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * Summary: Get plugins  Description: Get custom universal connector plugins
     * @param param the request object
     */
    public connectionsServiceGetPlugins(param: ConnectionsServiceApiConnectionsServiceGetPluginsRequest = {}, options?: ConfigurationOptions): Promise<Connectionsv3GetPluginsResponse> {
        return this.api.connectionsServiceGetPlugins(param.id,  options).toPromise();
    }

    /**
     * Summary: Get settings Description: Get a list of Settings.
     * @param param the request object
     */
    public connectionsServiceGetSettingsWithHttpInfo(param: ConnectionsServiceApiConnectionsServiceGetSettingsRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Connectionsv3GetSettingsResponse>> {
        return this.api.connectionsServiceGetSettingsWithHttpInfo( options).toPromise();
    }

    /**
     * Summary: Get settings Description: Get a list of Settings.
     * @param param the request object
     */
    public connectionsServiceGetSettings(param: ConnectionsServiceApiConnectionsServiceGetSettingsRequest = {}, options?: ConfigurationOptions): Promise<Connectionsv3GetSettingsResponse> {
        return this.api.connectionsServiceGetSettings( options).toPromise();
    }

    /**
     * Summary: Partial update connectors Description: Partial update of Connectors.
     * @param param the request object
     */
    public connectionsServicePartialUpdateConnectorsWithHttpInfo(param: ConnectionsServiceApiConnectionsServicePartialUpdateConnectorsRequest, options?: ConfigurationOptions): Promise<HttpInfo<Connectionsv3PartialUpdateConnectorsResponse>> {
        return this.api.connectionsServicePartialUpdateConnectorsWithHttpInfo(param.connectionsv3PartialUpdateConnectorsRequest,  options).toPromise();
    }

    /**
     * Summary: Partial update connectors Description: Partial update of Connectors.
     * @param param the request object
     */
    public connectionsServicePartialUpdateConnectors(param: ConnectionsServiceApiConnectionsServicePartialUpdateConnectorsRequest, options?: ConfigurationOptions): Promise<Connectionsv3PartialUpdateConnectorsResponse> {
        return this.api.connectionsServicePartialUpdateConnectors(param.connectionsv3PartialUpdateConnectorsRequest,  options).toPromise();
    }

    /**
     * Summary: Post stap command Description: Send a STAP command down to kafka for snif-assist.
     * @param param the request object
     */
    public connectionsServicePostStapCommandWithHttpInfo(param: ConnectionsServiceApiConnectionsServicePostStapCommandRequest, options?: ConfigurationOptions): Promise<HttpInfo<Connectionsv3StatusResponseBase>> {
        return this.api.connectionsServicePostStapCommandWithHttpInfo(param.connectionsv3StapCommandRequest,  options).toPromise();
    }

    /**
     * Summary: Post stap command Description: Send a STAP command down to kafka for snif-assist.
     * @param param the request object
     */
    public connectionsServicePostStapCommand(param: ConnectionsServiceApiConnectionsServicePostStapCommandRequest, options?: ConfigurationOptions): Promise<Connectionsv3StatusResponseBase> {
        return this.api.connectionsServicePostStapCommand(param.connectionsv3StapCommandRequest,  options).toPromise();
    }

    /**
     * Summary: Update banner state for object verb page.  Description: Update banner state for object verb page.
     * @param param the request object
     */
    public connectionsServiceUpdateBannerStateWithHttpInfo(param: ConnectionsServiceApiConnectionsServiceUpdateBannerStateRequest, options?: ConfigurationOptions): Promise<HttpInfo<Connectionsv3UpdateBannerStateResponse>> {
        return this.api.connectionsServiceUpdateBannerStateWithHttpInfo(param.connectionsv3UpdateBannerStateRequest,  options).toPromise();
    }

    /**
     * Summary: Update banner state for object verb page.  Description: Update banner state for object verb page.
     * @param param the request object
     */
    public connectionsServiceUpdateBannerState(param: ConnectionsServiceApiConnectionsServiceUpdateBannerStateRequest, options?: ConfigurationOptions): Promise<Connectionsv3UpdateBannerStateResponse> {
        return this.api.connectionsServiceUpdateBannerState(param.connectionsv3UpdateBannerStateRequest,  options).toPromise();
    }

    /**
     * Summary: Update Connections accounts Description: Update Connections acccounts.
     * @param param the request object
     */
    public connectionsServiceUpdateConnectionsAccountsWithHttpInfo(param: ConnectionsServiceApiConnectionsServiceUpdateConnectionsAccountsRequest, options?: ConfigurationOptions): Promise<HttpInfo<Connectionsv3UpdateConnectionsAccountsResponse>> {
        return this.api.connectionsServiceUpdateConnectionsAccountsWithHttpInfo(param.connectionsv3UpdateConnectionsAccountsRequest,  options).toPromise();
    }

    /**
     * Summary: Update Connections accounts Description: Update Connections acccounts.
     * @param param the request object
     */
    public connectionsServiceUpdateConnectionsAccounts(param: ConnectionsServiceApiConnectionsServiceUpdateConnectionsAccountsRequest, options?: ConfigurationOptions): Promise<Connectionsv3UpdateConnectionsAccountsResponse> {
        return this.api.connectionsServiceUpdateConnectionsAccounts(param.connectionsv3UpdateConnectionsAccountsRequest,  options).toPromise();
    }

    /**
     * Summary: Update connections configs Description: Update Connection config by connection id.
     * @param param the request object
     */
    public connectionsServiceUpdateConnectionsConfigsWithHttpInfo(param: ConnectionsServiceApiConnectionsServiceUpdateConnectionsConfigsRequest, options?: ConfigurationOptions): Promise<HttpInfo<Connectionsv3UpdateConnectionsConfigsResponse>> {
        return this.api.connectionsServiceUpdateConnectionsConfigsWithHttpInfo(param.connectionsv3UpdateConnectionsConfigsRequest,  options).toPromise();
    }

    /**
     * Summary: Update connections configs Description: Update Connection config by connection id.
     * @param param the request object
     */
    public connectionsServiceUpdateConnectionsConfigs(param: ConnectionsServiceApiConnectionsServiceUpdateConnectionsConfigsRequest, options?: ConfigurationOptions): Promise<Connectionsv3UpdateConnectionsConfigsResponse> {
        return this.api.connectionsServiceUpdateConnectionsConfigs(param.connectionsv3UpdateConnectionsConfigsRequest,  options).toPromise();
    }

    /**
     * Summary: Update connectors Description: Update a list of Connectors.
     * @param param the request object
     */
    public connectionsServiceUpdateConnectorsWithHttpInfo(param: ConnectionsServiceApiConnectionsServiceUpdateConnectorsRequest, options?: ConfigurationOptions): Promise<HttpInfo<any>> {
        return this.api.connectionsServiceUpdateConnectorsWithHttpInfo(param.connectionsv3UpdateConnectorsRequest,  options).toPromise();
    }

    /**
     * Summary: Update connectors Description: Update a list of Connectors.
     * @param param the request object
     */
    public connectionsServiceUpdateConnectors(param: ConnectionsServiceApiConnectionsServiceUpdateConnectorsRequest, options?: ConfigurationOptions): Promise<any> {
        return this.api.connectionsServiceUpdateConnectors(param.connectionsv3UpdateConnectorsRequest,  options).toPromise();
    }

    /**
     * Summary: Update plugin. Description: Update plugin.
     * @param param the request object
     */
    public connectionsServiceUpdatePluginWithHttpInfo(param: ConnectionsServiceApiConnectionsServiceUpdatePluginRequest, options?: ConfigurationOptions): Promise<HttpInfo<Connectionsv3UpdatePluginResponse>> {
        return this.api.connectionsServiceUpdatePluginWithHttpInfo(param.id, param.connectionsv3UpdatePluginRequest,  options).toPromise();
    }

    /**
     * Summary: Update plugin. Description: Update plugin.
     * @param param the request object
     */
    public connectionsServiceUpdatePlugin(param: ConnectionsServiceApiConnectionsServiceUpdatePluginRequest, options?: ConfigurationOptions): Promise<Connectionsv3UpdatePluginResponse> {
        return this.api.connectionsServiceUpdatePlugin(param.id, param.connectionsv3UpdatePluginRequest,  options).toPromise();
    }

    /**
     * Summary: Update settings Description: Update Settings.
     * @param param the request object
     */
    public connectionsServiceUpdateSettingsWithHttpInfo(param: ConnectionsServiceApiConnectionsServiceUpdateSettingsRequest, options?: ConfigurationOptions): Promise<HttpInfo<any>> {
        return this.api.connectionsServiceUpdateSettingsWithHttpInfo(param.connectionsv3UpdateSettingsRequest,  options).toPromise();
    }

    /**
     * Summary: Update settings Description: Update Settings.
     * @param param the request object
     */
    public connectionsServiceUpdateSettings(param: ConnectionsServiceApiConnectionsServiceUpdateSettingsRequest, options?: ConfigurationOptions): Promise<any> {
        return this.api.connectionsServiceUpdateSettings(param.connectionsv3UpdateSettingsRequest,  options).toPromise();
    }

    /**
     * Summary: Validate an AWS connection. Description: Validate an AWS connection.
     * @param param the request object
     */
    public connectionsServiceValidateAwsConnectionWithHttpInfo(param: ConnectionsServiceApiConnectionsServiceValidateAwsConnectionRequest, options?: ConfigurationOptions): Promise<HttpInfo<Connectionsv3ValidateConnectionResponse>> {
        return this.api.connectionsServiceValidateAwsConnectionWithHttpInfo(param.connectionsv3ValidateAwsConnectionRequest,  options).toPromise();
    }

    /**
     * Summary: Validate an AWS connection. Description: Validate an AWS connection.
     * @param param the request object
     */
    public connectionsServiceValidateAwsConnection(param: ConnectionsServiceApiConnectionsServiceValidateAwsConnectionRequest, options?: ConfigurationOptions): Promise<Connectionsv3ValidateConnectionResponse> {
        return this.api.connectionsServiceValidateAwsConnection(param.connectionsv3ValidateAwsConnectionRequest,  options).toPromise();
    }

    /**
     * Summary: Validate an Azure connection. Description: Validate an Azure connection.
     * @param param the request object
     */
    public connectionsServiceValidateAzureConnectionWithHttpInfo(param: ConnectionsServiceApiConnectionsServiceValidateAzureConnectionRequest, options?: ConfigurationOptions): Promise<HttpInfo<Connectionsv3ValidateConnectionResponse>> {
        return this.api.connectionsServiceValidateAzureConnectionWithHttpInfo(param.connectionsv3ValidateAzureConnectionRequest,  options).toPromise();
    }

    /**
     * Summary: Validate an Azure connection. Description: Validate an Azure connection.
     * @param param the request object
     */
    public connectionsServiceValidateAzureConnection(param: ConnectionsServiceApiConnectionsServiceValidateAzureConnectionRequest, options?: ConfigurationOptions): Promise<Connectionsv3ValidateConnectionResponse> {
        return this.api.connectionsServiceValidateAzureConnection(param.connectionsv3ValidateAzureConnectionRequest,  options).toPromise();
    }

    /**
     * Summary: Validate a GCP connection. Description: Validate a GCP connection.
     * @param param the request object
     */
    public connectionsServiceValidateGcpConnectionWithHttpInfo(param: ConnectionsServiceApiConnectionsServiceValidateGcpConnectionRequest, options?: ConfigurationOptions): Promise<HttpInfo<Connectionsv3ValidateConnectionResponse>> {
        return this.api.connectionsServiceValidateGcpConnectionWithHttpInfo(param.connectionsv3ValidateGcpConnectionRequest,  options).toPromise();
    }

    /**
     * Summary: Validate a GCP connection. Description: Validate a GCP connection.
     * @param param the request object
     */
    public connectionsServiceValidateGcpConnection(param: ConnectionsServiceApiConnectionsServiceValidateGcpConnectionRequest, options?: ConfigurationOptions): Promise<Connectionsv3ValidateConnectionResponse> {
        return this.api.connectionsServiceValidateGcpConnection(param.connectionsv3ValidateGcpConnectionRequest,  options).toPromise();
    }

}

import { ObservableDashboardsServiceApi } from "./ObservableAPI";
import { DashboardsServiceApiRequestFactory, DashboardsServiceApiResponseProcessor} from "../apis/DashboardsServiceApi";

export interface DashboardsServiceApiDashboardsServiceCreateDashboardRequest {
    /**
     * Unique dashboard.
     * @type Dashboardsv3Dashboard
     * @memberof DashboardsServiceApidashboardsServiceCreateDashboard
     */
    dashboardsv3Dashboard: Dashboardsv3Dashboard
}

export interface DashboardsServiceApiDashboardsServiceDeleteDashboardRequest {
    /**
     * The id of the dashboard to be deleted.
     * Defaults to: undefined
     * @type string
     * @memberof DashboardsServiceApidashboardsServiceDeleteDashboard
     */
    dashboardId: string
    /**
     * 
     * @type Dashboardsv3DeleteDashboardRequest
     * @memberof DashboardsServiceApidashboardsServiceDeleteDashboard
     */
    dashboardsv3DeleteDashboardRequest: Dashboardsv3DeleteDashboardRequest
}

export interface DashboardsServiceApiDashboardsServiceGetDashboardsRequest {
}

export interface DashboardsServiceApiDashboardsServiceUpdateDashboardRequest {
    /**
     * The id of the dashboard that was updated.
     * Defaults to: undefined
     * @type string
     * @memberof DashboardsServiceApidashboardsServiceUpdateDashboard
     */
    dashboardId: string
    /**
     * 
     * @type Dashboardsv3UpdateDashboardRequest
     * @memberof DashboardsServiceApidashboardsServiceUpdateDashboard
     */
    dashboardsv3UpdateDashboardRequest: Dashboardsv3UpdateDashboardRequest
}

export class ObjectDashboardsServiceApi {
    private api: ObservableDashboardsServiceApi

    public constructor(configuration: Configuration, requestFactory?: DashboardsServiceApiRequestFactory, responseProcessor?: DashboardsServiceApiResponseProcessor) {
        this.api = new ObservableDashboardsServiceApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Summary: Create dashboard Description: Create a unique dashboard.
     * @param param the request object
     */
    public dashboardsServiceCreateDashboardWithHttpInfo(param: DashboardsServiceApiDashboardsServiceCreateDashboardRequest, options?: ConfigurationOptions): Promise<HttpInfo<Dashboardsv3CreateDashboardResponse>> {
        return this.api.dashboardsServiceCreateDashboardWithHttpInfo(param.dashboardsv3Dashboard,  options).toPromise();
    }

    /**
     * Summary: Create dashboard Description: Create a unique dashboard.
     * @param param the request object
     */
    public dashboardsServiceCreateDashboard(param: DashboardsServiceApiDashboardsServiceCreateDashboardRequest, options?: ConfigurationOptions): Promise<Dashboardsv3CreateDashboardResponse> {
        return this.api.dashboardsServiceCreateDashboard(param.dashboardsv3Dashboard,  options).toPromise();
    }

    /**
     * Summary: Delete dashboard Description: Delete a unique dashboard.
     * @param param the request object
     */
    public dashboardsServiceDeleteDashboardWithHttpInfo(param: DashboardsServiceApiDashboardsServiceDeleteDashboardRequest, options?: ConfigurationOptions): Promise<HttpInfo<Dashboardsv3DeleteDashboardResponse>> {
        return this.api.dashboardsServiceDeleteDashboardWithHttpInfo(param.dashboardId, param.dashboardsv3DeleteDashboardRequest,  options).toPromise();
    }

    /**
     * Summary: Delete dashboard Description: Delete a unique dashboard.
     * @param param the request object
     */
    public dashboardsServiceDeleteDashboard(param: DashboardsServiceApiDashboardsServiceDeleteDashboardRequest, options?: ConfigurationOptions): Promise<Dashboardsv3DeleteDashboardResponse> {
        return this.api.dashboardsServiceDeleteDashboard(param.dashboardId, param.dashboardsv3DeleteDashboardRequest,  options).toPromise();
    }

    /**
     * Summary: Get dashboards Description: Get a list of dashboards with all data.
     * @param param the request object
     */
    public dashboardsServiceGetDashboardsWithHttpInfo(param: DashboardsServiceApiDashboardsServiceGetDashboardsRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Dashboardsv3GetDashboardsResponse>> {
        return this.api.dashboardsServiceGetDashboardsWithHttpInfo( options).toPromise();
    }

    /**
     * Summary: Get dashboards Description: Get a list of dashboards with all data.
     * @param param the request object
     */
    public dashboardsServiceGetDashboards(param: DashboardsServiceApiDashboardsServiceGetDashboardsRequest = {}, options?: ConfigurationOptions): Promise<Dashboardsv3GetDashboardsResponse> {
        return this.api.dashboardsServiceGetDashboards( options).toPromise();
    }

    /**
     * Summary: Update dashboard Description: Update a dashboard.
     * @param param the request object
     */
    public dashboardsServiceUpdateDashboardWithHttpInfo(param: DashboardsServiceApiDashboardsServiceUpdateDashboardRequest, options?: ConfigurationOptions): Promise<HttpInfo<Dashboardsv3UpdateDashboardResponse>> {
        return this.api.dashboardsServiceUpdateDashboardWithHttpInfo(param.dashboardId, param.dashboardsv3UpdateDashboardRequest,  options).toPromise();
    }

    /**
     * Summary: Update dashboard Description: Update a dashboard.
     * @param param the request object
     */
    public dashboardsServiceUpdateDashboard(param: DashboardsServiceApiDashboardsServiceUpdateDashboardRequest, options?: ConfigurationOptions): Promise<Dashboardsv3UpdateDashboardResponse> {
        return this.api.dashboardsServiceUpdateDashboard(param.dashboardId, param.dashboardsv3UpdateDashboardRequest,  options).toPromise();
    }

}

import { ObservableDataMovementsApi } from "./ObservableAPI";
import { DataMovementsApiRequestFactory, DataMovementsApiResponseProcessor} from "../apis/DataMovementsApi";

export interface DataMovementsApiGetActualFlowRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DataMovementsApigetActualFlow
     */
    id: string
}

export interface DataMovementsApiGetActualFlowsSummaryRequest {
    /**
     * 
     * Defaults to: undefined
     * @type ListActualFlowsFilterParameter
     * @memberof DataMovementsApigetActualFlowsSummary
     */
    filter?: ListActualFlowsFilterParameter
}

export interface DataMovementsApiGetPotentialFlowRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DataMovementsApigetPotentialFlow
     */
    flowId: string
}

export interface DataMovementsApiGetPotentialFlowPathRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DataMovementsApigetPotentialFlowPath
     */
    flowPathId: string
}

export interface DataMovementsApiGetPotentialFlowsSummaryRequest {
    /**
     * 
     * Defaults to: undefined
     * @type PotentialFlowsFilterOptions
     * @memberof DataMovementsApigetPotentialFlowsSummary
     */
    filter?: PotentialFlowsFilterOptions
}

export interface DataMovementsApiListActualFlowPathsRequest {
    /**
     * 
     * Defaults to: undefined
     * @type ListActualFlowPathsSortParameter
     * @memberof DataMovementsApilistActualFlowPaths
     */
    sort?: ListActualFlowPathsSortParameter
    /**
     * 
     * Defaults to: undefined
     * @type ListActualFlowPathsFilterParameter
     * @memberof DataMovementsApilistActualFlowPaths
     */
    filter?: ListActualFlowPathsFilterParameter
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof DataMovementsApilistActualFlowPaths
     */
    pageSize?: number
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DataMovementsApilistActualFlowPaths
     */
    nextToken?: string
}

export interface DataMovementsApiListActualFlowsRequest {
    /**
     * 
     * Defaults to: undefined
     * @type ListActualFlowsSortParameter
     * @memberof DataMovementsApilistActualFlows
     */
    sort?: ListActualFlowsSortParameter
    /**
     * 
     * Defaults to: undefined
     * @type ListActualFlowsFilterParameter
     * @memberof DataMovementsApilistActualFlows
     */
    filter?: ListActualFlowsFilterParameter
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof DataMovementsApilistActualFlows
     */
    pageSize?: number
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DataMovementsApilistActualFlows
     */
    nextToken?: string
}

export interface DataMovementsApiListPotentialFlowsRequest {
    /**
     * 
     * Defaults to: undefined
     * @type PotentialFlowsFilterOptions
     * @memberof DataMovementsApilistPotentialFlows
     */
    filter?: PotentialFlowsFilterOptions
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof DataMovementsApilistPotentialFlows
     */
    pageSize?: number
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DataMovementsApilistPotentialFlows
     */
    nextToken?: string
}

export interface DataMovementsApiListPotentialFlowsPathsRequest {
    /**
     * 
     * Defaults to: undefined
     * @type PotentialFlowsPathsFilterOptions
     * @memberof DataMovementsApilistPotentialFlowsPaths
     */
    filter?: PotentialFlowsPathsFilterOptions
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof DataMovementsApilistPotentialFlowsPaths
     */
    pageSize?: number
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DataMovementsApilistPotentialFlowsPaths
     */
    nextToken?: string
}

export class ObjectDataMovementsApi {
    private api: ObservableDataMovementsApi

    public constructor(configuration: Configuration, requestFactory?: DataMovementsApiRequestFactory, responseProcessor?: DataMovementsApiResponseProcessor) {
        this.api = new ObservableDataMovementsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Get a detailed information about an actual flow by providing its ID.
     * Get actual flow by providing its ID
     * @param param the request object
     */
    public getActualFlowWithHttpInfo(param: DataMovementsApiGetActualFlowRequest, options?: ConfigurationOptions): Promise<HttpInfo<ActualFlow>> {
        return this.api.getActualFlowWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * Get a detailed information about an actual flow by providing its ID.
     * Get actual flow by providing its ID
     * @param param the request object
     */
    public getActualFlow(param: DataMovementsApiGetActualFlowRequest, options?: ConfigurationOptions): Promise<ActualFlow> {
        return this.api.getActualFlow(param.id,  options).toPromise();
    }

    /**
     * Get a summary of all the actual flows discovered by Guardium DSPM, that is, details about source and destination, and other information.
     * Get summary of actual flows
     * @param param the request object
     */
    public getActualFlowsSummaryWithHttpInfo(param: DataMovementsApiGetActualFlowsSummaryRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<ActualFlowsSummary>> {
        return this.api.getActualFlowsSummaryWithHttpInfo(param.filter,  options).toPromise();
    }

    /**
     * Get a summary of all the actual flows discovered by Guardium DSPM, that is, details about source and destination, and other information.
     * Get summary of actual flows
     * @param param the request object
     */
    public getActualFlowsSummary(param: DataMovementsApiGetActualFlowsSummaryRequest = {}, options?: ConfigurationOptions): Promise<ActualFlowsSummary> {
        return this.api.getActualFlowsSummary(param.filter,  options).toPromise();
    }

    /**
     * Get a detailed information about a potential flow by providing the flow ID.
     * Get potential flow by providing its ID
     * @param param the request object
     */
    public getPotentialFlowWithHttpInfo(param: DataMovementsApiGetPotentialFlowRequest, options?: ConfigurationOptions): Promise<HttpInfo<PotentialFlow>> {
        return this.api.getPotentialFlowWithHttpInfo(param.flowId,  options).toPromise();
    }

    /**
     * Get a detailed information about a potential flow by providing the flow ID.
     * Get potential flow by providing its ID
     * @param param the request object
     */
    public getPotentialFlow(param: DataMovementsApiGetPotentialFlowRequest, options?: ConfigurationOptions): Promise<PotentialFlow> {
        return this.api.getPotentialFlow(param.flowId,  options).toPromise();
    }

    /**
     * Get details of a specific potential flow of data by providing its ID.
     * Get potential flow path by providing its ID
     * @param param the request object
     */
    public getPotentialFlowPathWithHttpInfo(param: DataMovementsApiGetPotentialFlowPathRequest, options?: ConfigurationOptions): Promise<HttpInfo<PotentialFlowPath>> {
        return this.api.getPotentialFlowPathWithHttpInfo(param.flowPathId,  options).toPromise();
    }

    /**
     * Get details of a specific potential flow of data by providing its ID.
     * Get potential flow path by providing its ID
     * @param param the request object
     */
    public getPotentialFlowPath(param: DataMovementsApiGetPotentialFlowPathRequest, options?: ConfigurationOptions): Promise<PotentialFlowPath> {
        return this.api.getPotentialFlowPath(param.flowPathId,  options).toPromise();
    }

    /**
     * Get a summary of all the potential flows based on a filter applied.
     * Get summary of potential flows according to the filter applied
     * @param param the request object
     */
    public getPotentialFlowsSummaryWithHttpInfo(param: DataMovementsApiGetPotentialFlowsSummaryRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<PotentialFlowsSummary>> {
        return this.api.getPotentialFlowsSummaryWithHttpInfo(param.filter,  options).toPromise();
    }

    /**
     * Get a summary of all the potential flows based on a filter applied.
     * Get summary of potential flows according to the filter applied
     * @param param the request object
     */
    public getPotentialFlowsSummary(param: DataMovementsApiGetPotentialFlowsSummaryRequest = {}, options?: ConfigurationOptions): Promise<PotentialFlowsSummary> {
        return this.api.getPotentialFlowsSummary(param.filter,  options).toPromise();
    }

    /**
     * Get detailed information about the actual flows according to the filter applied.
     * Get summary of actual flows according to the filter applied
     * @param param the request object
     */
    public listActualFlowPathsWithHttpInfo(param: DataMovementsApiListActualFlowPathsRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<ListActualFlowPaths200Response>> {
        return this.api.listActualFlowPathsWithHttpInfo(param.sort, param.filter, param.pageSize, param.nextToken,  options).toPromise();
    }

    /**
     * Get detailed information about the actual flows according to the filter applied.
     * Get summary of actual flows according to the filter applied
     * @param param the request object
     */
    public listActualFlowPaths(param: DataMovementsApiListActualFlowPathsRequest = {}, options?: ConfigurationOptions): Promise<ListActualFlowPaths200Response> {
        return this.api.listActualFlowPaths(param.sort, param.filter, param.pageSize, param.nextToken,  options).toPromise();
    }

    /**
     * List all the actual flows (based on logs) of users and services across your entire cloud accounts and SasS applications.
     * List actual flows
     * @param param the request object
     */
    public listActualFlowsWithHttpInfo(param: DataMovementsApiListActualFlowsRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<ListActualFlows200Response>> {
        return this.api.listActualFlowsWithHttpInfo(param.sort, param.filter, param.pageSize, param.nextToken,  options).toPromise();
    }

    /**
     * List all the actual flows (based on logs) of users and services across your entire cloud accounts and SasS applications.
     * List actual flows
     * @param param the request object
     */
    public listActualFlows(param: DataMovementsApiListActualFlowsRequest = {}, options?: ConfigurationOptions): Promise<ListActualFlows200Response> {
        return this.api.listActualFlows(param.sort, param.filter, param.pageSize, param.nextToken,  options).toPromise();
    }

    /**
     * List all the potential flows of users and services across your entire cloud accounts and SaaS applications.
     * List potential flows
     * @param param the request object
     */
    public listPotentialFlowsWithHttpInfo(param: DataMovementsApiListPotentialFlowsRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<ListPotentialFlows200Response>> {
        return this.api.listPotentialFlowsWithHttpInfo(param.filter, param.pageSize, param.nextToken,  options).toPromise();
    }

    /**
     * List all the potential flows of users and services across your entire cloud accounts and SaaS applications.
     * List potential flows
     * @param param the request object
     */
    public listPotentialFlows(param: DataMovementsApiListPotentialFlowsRequest = {}, options?: ConfigurationOptions): Promise<ListPotentialFlows200Response> {
        return this.api.listPotentialFlows(param.filter, param.pageSize, param.nextToken,  options).toPromise();
    }

    /**
     * List all the potential flow paths based on an applied filter.
     * List potential flow paths
     * @param param the request object
     */
    public listPotentialFlowsPathsWithHttpInfo(param: DataMovementsApiListPotentialFlowsPathsRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<ListPotentialFlowsPaths200Response>> {
        return this.api.listPotentialFlowsPathsWithHttpInfo(param.filter, param.pageSize, param.nextToken,  options).toPromise();
    }

    /**
     * List all the potential flow paths based on an applied filter.
     * List potential flow paths
     * @param param the request object
     */
    public listPotentialFlowsPaths(param: DataMovementsApiListPotentialFlowsPathsRequest = {}, options?: ConfigurationOptions): Promise<ListPotentialFlowsPaths200Response> {
        return this.api.listPotentialFlowsPaths(param.filter, param.pageSize, param.nextToken,  options).toPromise();
    }

}

import { ObservableDataResourcesApi } from "./ObservableAPI";
import { DataResourcesApiRequestFactory, DataResourcesApiResponseProcessor} from "../apis/DataResourcesApi";

export interface DataResourcesApiGetDataResourceRequest {
    /**
     * Data resource ID
     * Defaults to: undefined
     * @type string
     * @memberof DataResourcesApigetDataResource
     */
    dataResourceId: string
}

export interface DataResourcesApiGetDataResourcesSummaryRequest {
    /**
     * Data store id
     * Defaults to: undefined
     * @type string
     * @memberof DataResourcesApigetDataResourcesSummary
     */
    dataStoreId?: string
    /**
     * 
     * Defaults to: undefined
     * @type ListDataResourcesFilterParameter
     * @memberof DataResourcesApigetDataResourcesSummary
     */
    filter?: ListDataResourcesFilterParameter
}

export interface DataResourcesApiListDataResourcesRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DataResourcesApilistDataResources
     */
    dataStoreId?: string
    /**
     * 
     * Defaults to: undefined
     * @type ListDataResourcesFilterParameter
     * @memberof DataResourcesApilistDataResources
     */
    filter?: ListDataResourcesFilterParameter
    /**
     * 
     * Defaults to: undefined
     * @type ListDataResourcesSortParameter
     * @memberof DataResourcesApilistDataResources
     */
    sort?: ListDataResourcesSortParameter
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof DataResourcesApilistDataResources
     */
    pageSize?: number
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DataResourcesApilistDataResources
     */
    nextToken?: string
}

export interface DataResourcesApiListDataResourcesNamesRequest {
    /**
     * Prefix of data resource name
     * Defaults to: undefined
     * @type string
     * @memberof DataResourcesApilistDataResourcesNames
     */
    prefix: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DataResourcesApilistDataResourcesNames
     */
    dataStoreId?: string
}

export interface DataResourcesApiRemoveResourceRequest {
    /**
     * Data resource ID
     * Defaults to: undefined
     * @type string
     * @memberof DataResourcesApiremoveResource
     */
    dataResourceId: string
    /**
     * Data store ID
     * Defaults to: undefined
     * @type string
     * @memberof DataResourcesApiremoveResource
     */
    dataStoreId: string
}

export interface DataResourcesApiUpdateResourceReviewStatusRequest {
    /**
     * Data resource id
     * Defaults to: undefined
     * @type string
     * @memberof DataResourcesApiupdateResourceReviewStatus
     */
    dataResourceId: string
    /**
     * 
     * @type UpdateResourceReviewBody
     * @memberof DataResourcesApiupdateResourceReviewStatus
     */
    updateResourceReviewBody: UpdateResourceReviewBody
}

export class ObjectDataResourcesApi {
    private api: ObservableDataResourcesApi

    public constructor(configuration: Configuration, requestFactory?: DataResourcesApiRequestFactory, responseProcessor?: DataResourcesApiResponseProcessor) {
        this.api = new ObservableDataResourcesApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Get additional details on a specific data resource by providing its ID.
     * Get a specific data resource by its ID
     * @param param the request object
     */
    public getDataResourceWithHttpInfo(param: DataResourcesApiGetDataResourceRequest, options?: ConfigurationOptions): Promise<HttpInfo<DataResource>> {
        return this.api.getDataResourceWithHttpInfo(param.dataResourceId,  options).toPromise();
    }

    /**
     * Get additional details on a specific data resource by providing its ID.
     * Get a specific data resource by its ID
     * @param param the request object
     */
    public getDataResource(param: DataResourcesApiGetDataResourceRequest, options?: ConfigurationOptions): Promise<DataResource> {
        return this.api.getDataResource(param.dataResourceId,  options).toPromise();
    }

    /**
     * Get a summary of all the data resource, that is, number of data resources, types of data resources, and other information.
     * Data resources summary
     * @param param the request object
     */
    public getDataResourcesSummaryWithHttpInfo(param: DataResourcesApiGetDataResourcesSummaryRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<DataResourcesSummary>> {
        return this.api.getDataResourcesSummaryWithHttpInfo(param.dataStoreId, param.filter,  options).toPromise();
    }

    /**
     * Get a summary of all the data resource, that is, number of data resources, types of data resources, and other information.
     * Data resources summary
     * @param param the request object
     */
    public getDataResourcesSummary(param: DataResourcesApiGetDataResourcesSummaryRequest = {}, options?: ConfigurationOptions): Promise<DataResourcesSummary> {
        return this.api.getDataResourcesSummary(param.dataStoreId, param.filter,  options).toPromise();
    }

    /**
     * Get a list of data resources based on the filter applied. You can filter by data store ID, data resource ID, data resource name, and more.<BR><B>Note:</B> Filter needs to be HTML encoded.
     * List data resources that match a given filter
     * @param param the request object
     */
    public listDataResourcesWithHttpInfo(param: DataResourcesApiListDataResourcesRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<ListDataResources200Response>> {
        return this.api.listDataResourcesWithHttpInfo(param.dataStoreId, param.filter, param.sort, param.pageSize, param.nextToken,  options).toPromise();
    }

    /**
     * Get a list of data resources based on the filter applied. You can filter by data store ID, data resource ID, data resource name, and more.<BR><B>Note:</B> Filter needs to be HTML encoded.
     * List data resources that match a given filter
     * @param param the request object
     */
    public listDataResources(param: DataResourcesApiListDataResourcesRequest = {}, options?: ConfigurationOptions): Promise<ListDataResources200Response> {
        return this.api.listDataResources(param.dataStoreId, param.filter, param.sort, param.pageSize, param.nextToken,  options).toPromise();
    }

    /**
     * List and filter data resources by their names
     * List names of data resources
     * @param param the request object
     */
    public listDataResourcesNamesWithHttpInfo(param: DataResourcesApiListDataResourcesNamesRequest, options?: ConfigurationOptions): Promise<HttpInfo<Array<string>>> {
        return this.api.listDataResourcesNamesWithHttpInfo(param.prefix, param.dataStoreId,  options).toPromise();
    }

    /**
     * List and filter data resources by their names
     * List names of data resources
     * @param param the request object
     */
    public listDataResourcesNames(param: DataResourcesApiListDataResourcesNamesRequest, options?: ConfigurationOptions): Promise<Array<string>> {
        return this.api.listDataResourcesNames(param.prefix, param.dataStoreId,  options).toPromise();
    }

    /**
     * Removes a resource, with all its sensitivities, from Guardium DSPM dashboard. This action does not remove the resource from the resource\'s source environment.
     * Remove resource from DSPM
     * @param param the request object
     */
    public removeResourceWithHttpInfo(param: DataResourcesApiRemoveResourceRequest, options?: ConfigurationOptions): Promise<HttpInfo<RemoveResource200Response>> {
        return this.api.removeResourceWithHttpInfo(param.dataResourceId, param.dataStoreId,  options).toPromise();
    }

    /**
     * Removes a resource, with all its sensitivities, from Guardium DSPM dashboard. This action does not remove the resource from the resource\'s source environment.
     * Remove resource from DSPM
     * @param param the request object
     */
    public removeResource(param: DataResourcesApiRemoveResourceRequest, options?: ConfigurationOptions): Promise<RemoveResource200Response> {
        return this.api.removeResource(param.dataResourceId, param.dataStoreId,  options).toPromise();
    }

    /**
     * Set the review status of a specific data resource in a specific data store.
     * Set review status of a data resource
     * @param param the request object
     */
    public updateResourceReviewStatusWithHttpInfo(param: DataResourcesApiUpdateResourceReviewStatusRequest, options?: ConfigurationOptions): Promise<HttpInfo<UpdateResourceReviewStatus200Response>> {
        return this.api.updateResourceReviewStatusWithHttpInfo(param.dataResourceId, param.updateResourceReviewBody,  options).toPromise();
    }

    /**
     * Set the review status of a specific data resource in a specific data store.
     * Set review status of a data resource
     * @param param the request object
     */
    public updateResourceReviewStatus(param: DataResourcesApiUpdateResourceReviewStatusRequest, options?: ConfigurationOptions): Promise<UpdateResourceReviewStatus200Response> {
        return this.api.updateResourceReviewStatus(param.dataResourceId, param.updateResourceReviewBody,  options).toPromise();
    }

}

import { ObservableDataSensitivitiesApi } from "./ObservableAPI";
import { DataSensitivitiesApiRequestFactory, DataSensitivitiesApiResponseProcessor} from "../apis/DataSensitivitiesApi";

export interface DataSensitivitiesApiGetSensitivitiesSummaryRequest {
    /**
     * 
     * Defaults to: undefined
     * @type ListSensitivitiesFilterParameter
     * @memberof DataSensitivitiesApigetSensitivitiesSummary
     */
    filter?: ListSensitivitiesFilterParameter
}

export interface DataSensitivitiesApiGetSensitivityRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DataSensitivitiesApigetSensitivity
     */
    sensitivityId: string
}

export interface DataSensitivitiesApiListSensitivitiesRequest {
    /**
     * 
     * Defaults to: undefined
     * @type ListSensitivitiesFilterParameter
     * @memberof DataSensitivitiesApilistSensitivities
     */
    filter?: ListSensitivitiesFilterParameter
    /**
     * 
     * Defaults to: undefined
     * @type LastSeenSortSchema
     * @memberof DataSensitivitiesApilistSensitivities
     */
    sort?: LastSeenSortSchema
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof DataSensitivitiesApilistSensitivities
     */
    pageSize?: number
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DataSensitivitiesApilistSensitivities
     */
    nextToken?: string
}

export class ObjectDataSensitivitiesApi {
    private api: ObservableDataSensitivitiesApi

    public constructor(configuration: Configuration, requestFactory?: DataSensitivitiesApiRequestFactory, responseProcessor?: DataSensitivitiesApiResponseProcessor) {
        this.api = new ObservableDataSensitivitiesApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Get a summarised information about all sensitivities classified by Guardium DSPM.
     * Get the summary of sensitivities
     * @param param the request object
     */
    public getSensitivitiesSummaryWithHttpInfo(param: DataSensitivitiesApiGetSensitivitiesSummaryRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<SensitivitiesSummary>> {
        return this.api.getSensitivitiesSummaryWithHttpInfo(param.filter,  options).toPromise();
    }

    /**
     * Get a summarised information about all sensitivities classified by Guardium DSPM.
     * Get the summary of sensitivities
     * @param param the request object
     */
    public getSensitivitiesSummary(param: DataSensitivitiesApiGetSensitivitiesSummaryRequest = {}, options?: ConfigurationOptions): Promise<SensitivitiesSummary> {
        return this.api.getSensitivitiesSummary(param.filter,  options).toPromise();
    }

    /**
     * Get details of a sensitivity by providing its ID.
     * Get sensitivity details by providing its ID
     * @param param the request object
     */
    public getSensitivityWithHttpInfo(param: DataSensitivitiesApiGetSensitivityRequest, options?: ConfigurationOptions): Promise<HttpInfo<Sensitivity>> {
        return this.api.getSensitivityWithHttpInfo(param.sensitivityId,  options).toPromise();
    }

    /**
     * Get details of a sensitivity by providing its ID.
     * Get sensitivity details by providing its ID
     * @param param the request object
     */
    public getSensitivity(param: DataSensitivitiesApiGetSensitivityRequest, options?: ConfigurationOptions): Promise<Sensitivity> {
        return this.api.getSensitivity(param.sensitivityId,  options).toPromise();
    }

    /**
     * Get a list of all the sensitivities based on an applied filter.
     * List sensitivities
     * @param param the request object
     */
    public listSensitivitiesWithHttpInfo(param: DataSensitivitiesApiListSensitivitiesRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<ListSensitivities200Response>> {
        return this.api.listSensitivitiesWithHttpInfo(param.filter, param.sort, param.pageSize, param.nextToken,  options).toPromise();
    }

    /**
     * Get a list of all the sensitivities based on an applied filter.
     * List sensitivities
     * @param param the request object
     */
    public listSensitivities(param: DataSensitivitiesApiListSensitivitiesRequest = {}, options?: ConfigurationOptions): Promise<ListSensitivities200Response> {
        return this.api.listSensitivities(param.filter, param.sort, param.pageSize, param.nextToken,  options).toPromise();
    }

}

import { ObservableDataStoresApi } from "./ObservableAPI";
import { DataStoresApiRequestFactory, DataStoresApiResponseProcessor} from "../apis/DataStoresApi";

export interface DataStoresApiGetDataStoreRequest {
    /**
     * ID of the data store
     * Defaults to: undefined
     * @type string
     * @memberof DataStoresApigetDataStore
     */
    dataStoreId: string
}

export interface DataStoresApiGetDataStoresSummaryRequest {
    /**
     * 
     * Defaults to: undefined
     * @type ListDataStoresFilterParameter
     * @memberof DataStoresApigetDataStoresSummary
     */
    filter?: ListDataStoresFilterParameter
}

export interface DataStoresApiListAllDataStoresLabelsRequest {
    /**
     * Prefix of data store label
     * Defaults to: undefined
     * @type string
     * @memberof DataStoresApilistAllDataStoresLabels
     */
    prefix?: string
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof DataStoresApilistAllDataStoresLabels
     */
    maxResults?: number
}

export interface DataStoresApiListDataStoresRequest {
    /**
     * 
     * Defaults to: undefined
     * @type ListDataStoresFilterParameter
     * @memberof DataStoresApilistDataStores
     */
    filter?: ListDataStoresFilterParameter
    /**
     * 
     * Defaults to: undefined
     * @type ListDataStoresSortParameter
     * @memberof DataStoresApilistDataStores
     */
    sort?: ListDataStoresSortParameter
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof DataStoresApilistDataStores
     */
    pageSize?: number
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DataStoresApilistDataStores
     */
    nextToken?: string
}

export interface DataStoresApiListDataStoresCloudTagsKeysRequest {
    /**
     * Prefix of cloud tag key
     * Defaults to: undefined
     * @type string
     * @memberof DataStoresApilistDataStoresCloudTagsKeys
     */
    prefix: string
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof DataStoresApilistDataStoresCloudTagsKeys
     */
    maxResults?: number
}

export interface DataStoresApiListDataStoresCloudTagsValuesRequest {
    /**
     * Prefix of cloud tag value
     * Defaults to: undefined
     * @type string
     * @memberof DataStoresApilistDataStoresCloudTagsValues
     */
    prefix: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DataStoresApilistDataStoresCloudTagsValues
     */
    tagKey: string
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof DataStoresApilistDataStoresCloudTagsValues
     */
    maxResults?: number
}

export interface DataStoresApiListDataStoresNamesRequest {
    /**
     * Prefix of data store name
     * Defaults to: undefined
     * @type string
     * @memberof DataStoresApilistDataStoresNames
     */
    prefix: string
}

export interface DataStoresApiRescanDataStoreRequest {
    /**
     * 
     * @type RescanDataStoreRequest
     * @memberof DataStoresApirescanDataStore
     */
    rescanDataStoreRequest: RescanDataStoreRequest
}

export interface DataStoresApiSetDataStoreLabelRequest {
    /**
     * Data store ID
     * Defaults to: undefined
     * @type string
     * @memberof DataStoresApisetDataStoreLabel
     */
    dataStoreId: string
    /**
     * 
     * @type SetDataStoreLabelRequest
     * @memberof DataStoresApisetDataStoreLabel
     */
    setDataStoreLabelRequest: SetDataStoreLabelRequest
}

export interface DataStoresApiUpdateDatastoreCustodianRequest {
    /**
     * 
     * @type UpdateCustodianBody
     * @memberof DataStoresApiupdateDatastoreCustodian
     */
    updateCustodianBody: UpdateCustodianBody
}

export class ObjectDataStoresApi {
    private api: ObservableDataStoresApi

    public constructor(configuration: Configuration, requestFactory?: DataStoresApiRequestFactory, responseProcessor?: DataStoresApiResponseProcessor) {
        this.api = new ObservableDataStoresApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Get details of a specific data store by its ID.
     * Get a data store by its ID
     * @param param the request object
     */
    public getDataStoreWithHttpInfo(param: DataStoresApiGetDataStoreRequest, options?: ConfigurationOptions): Promise<HttpInfo<DataStore>> {
        return this.api.getDataStoreWithHttpInfo(param.dataStoreId,  options).toPromise();
    }

    /**
     * Get details of a specific data store by its ID.
     * Get a data store by its ID
     * @param param the request object
     */
    public getDataStore(param: DataStoresApiGetDataStoreRequest, options?: ConfigurationOptions): Promise<DataStore> {
        return this.api.getDataStore(param.dataStoreId,  options).toPromise();
    }

    /**
     * Get a summary of all the data stores, that is, name of data resources, types of data stores, and other information.
     * Get summary of data stores
     * @param param the request object
     */
    public getDataStoresSummaryWithHttpInfo(param: DataStoresApiGetDataStoresSummaryRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<DataStoresSummary>> {
        return this.api.getDataStoresSummaryWithHttpInfo(param.filter,  options).toPromise();
    }

    /**
     * Get a summary of all the data stores, that is, name of data resources, types of data stores, and other information.
     * Get summary of data stores
     * @param param the request object
     */
    public getDataStoresSummary(param: DataStoresApiGetDataStoresSummaryRequest = {}, options?: ConfigurationOptions): Promise<DataStoresSummary> {
        return this.api.getDataStoresSummary(param.filter,  options).toPromise();
    }

    /**
     * Get a list of all the labels of custom data stores.
     * List labels of data stores.
     * @param param the request object
     */
    public listAllDataStoresLabelsWithHttpInfo(param: DataStoresApiListAllDataStoresLabelsRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Array<string>>> {
        return this.api.listAllDataStoresLabelsWithHttpInfo(param.prefix, param.maxResults,  options).toPromise();
    }

    /**
     * Get a list of all the labels of custom data stores.
     * List labels of data stores.
     * @param param the request object
     */
    public listAllDataStoresLabels(param: DataStoresApiListAllDataStoresLabelsRequest = {}, options?: ConfigurationOptions): Promise<Array<string>> {
        return this.api.listAllDataStoresLabels(param.prefix, param.maxResults,  options).toPromise();
    }

    /**
     * List all data stores discovered by Guardium DSPM.
     * List data stores
     * @param param the request object
     */
    public listDataStoresWithHttpInfo(param: DataStoresApiListDataStoresRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<ListDataStores200Response>> {
        return this.api.listDataStoresWithHttpInfo(param.filter, param.sort, param.pageSize, param.nextToken,  options).toPromise();
    }

    /**
     * List all data stores discovered by Guardium DSPM.
     * List data stores
     * @param param the request object
     */
    public listDataStores(param: DataStoresApiListDataStoresRequest = {}, options?: ConfigurationOptions): Promise<ListDataStores200Response> {
        return this.api.listDataStores(param.filter, param.sort, param.pageSize, param.nextToken,  options).toPromise();
    }

    /**
     * Get a list of the available cloud tag keys of data stores that can be filtered on the basis of prefixes.
     * List the cloud tag keys of data stores that can be filtered on the basis of prefixes.
     * @param param the request object
     */
    public listDataStoresCloudTagsKeysWithHttpInfo(param: DataStoresApiListDataStoresCloudTagsKeysRequest, options?: ConfigurationOptions): Promise<HttpInfo<Array<string>>> {
        return this.api.listDataStoresCloudTagsKeysWithHttpInfo(param.prefix, param.maxResults,  options).toPromise();
    }

    /**
     * Get a list of the available cloud tag keys of data stores that can be filtered on the basis of prefixes.
     * List the cloud tag keys of data stores that can be filtered on the basis of prefixes.
     * @param param the request object
     */
    public listDataStoresCloudTagsKeys(param: DataStoresApiListDataStoresCloudTagsKeysRequest, options?: ConfigurationOptions): Promise<Array<string>> {
        return this.api.listDataStoresCloudTagsKeys(param.prefix, param.maxResults,  options).toPromise();
    }

    /**
     * Get a list of the available cloud tag values of data stores that can be filtered on the basis of prefixes and cloud tag key names.
     * List the cloud tag values of data stores that can be filtered on the basis of prefixes and cloud tag key names.
     * @param param the request object
     */
    public listDataStoresCloudTagsValuesWithHttpInfo(param: DataStoresApiListDataStoresCloudTagsValuesRequest, options?: ConfigurationOptions): Promise<HttpInfo<Array<string>>> {
        return this.api.listDataStoresCloudTagsValuesWithHttpInfo(param.prefix, param.tagKey, param.maxResults,  options).toPromise();
    }

    /**
     * Get a list of the available cloud tag values of data stores that can be filtered on the basis of prefixes and cloud tag key names.
     * List the cloud tag values of data stores that can be filtered on the basis of prefixes and cloud tag key names.
     * @param param the request object
     */
    public listDataStoresCloudTagsValues(param: DataStoresApiListDataStoresCloudTagsValuesRequest, options?: ConfigurationOptions): Promise<Array<string>> {
        return this.api.listDataStoresCloudTagsValues(param.prefix, param.tagKey, param.maxResults,  options).toPromise();
    }

    /**
     * Lists the data stores that can be filtered or classified.
     * List name of filterable data stores
     * @param param the request object
     */
    public listDataStoresNamesWithHttpInfo(param: DataStoresApiListDataStoresNamesRequest, options?: ConfigurationOptions): Promise<HttpInfo<Array<string>>> {
        return this.api.listDataStoresNamesWithHttpInfo(param.prefix,  options).toPromise();
    }

    /**
     * Lists the data stores that can be filtered or classified.
     * List name of filterable data stores
     * @param param the request object
     */
    public listDataStoresNames(param: DataStoresApiListDataStoresNamesRequest, options?: ConfigurationOptions): Promise<Array<string>> {
        return this.api.listDataStoresNames(param.prefix,  options).toPromise();
    }

    /**
     * Post the request for a data store rescan.
     * Post data store rescan request
     * @param param the request object
     */
    public rescanDataStoreWithHttpInfo(param: DataStoresApiRescanDataStoreRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.rescanDataStoreWithHttpInfo(param.rescanDataStoreRequest,  options).toPromise();
    }

    /**
     * Post the request for a data store rescan.
     * Post data store rescan request
     * @param param the request object
     */
    public rescanDataStore(param: DataStoresApiRescanDataStoreRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.rescanDataStore(param.rescanDataStoreRequest,  options).toPromise();
    }

    /**
     * Add or update a custom label for a data store.
     * Label a data store with an existing or new label
     * @param param the request object
     */
    public setDataStoreLabelWithHttpInfo(param: DataStoresApiSetDataStoreLabelRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.setDataStoreLabelWithHttpInfo(param.dataStoreId, param.setDataStoreLabelRequest,  options).toPromise();
    }

    /**
     * Add or update a custom label for a data store.
     * Label a data store with an existing or new label
     * @param param the request object
     */
    public setDataStoreLabel(param: DataStoresApiSetDataStoreLabelRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.setDataStoreLabel(param.dataStoreId, param.setDataStoreLabelRequest,  options).toPromise();
    }

    /**
     * Add or update the name of a specific data store.
     * Update the name of a Data store custodian
     * @param param the request object
     */
    public updateDatastoreCustodianWithHttpInfo(param: DataStoresApiUpdateDatastoreCustodianRequest, options?: ConfigurationOptions): Promise<HttpInfo<UpdateDatastoreCustodian200Response>> {
        return this.api.updateDatastoreCustodianWithHttpInfo(param.updateCustodianBody,  options).toPromise();
    }

    /**
     * Add or update the name of a specific data store.
     * Update the name of a Data store custodian
     * @param param the request object
     */
    public updateDatastoreCustodian(param: DataStoresApiUpdateDatastoreCustodianRequest, options?: ConfigurationOptions): Promise<UpdateDatastoreCustodian200Response> {
        return this.api.updateDatastoreCustodian(param.updateCustodianBody,  options).toPromise();
    }

}

import { ObservableDataVulnerabilitiesApi } from "./ObservableAPI";
import { DataVulnerabilitiesApiRequestFactory, DataVulnerabilitiesApiResponseProcessor} from "../apis/DataVulnerabilitiesApi";

export interface DataVulnerabilitiesApiAddVulnerabilityStatusCommentRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DataVulnerabilitiesApiaddVulnerabilityStatusComment
     */
    vulnerabilityId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DataVulnerabilitiesApiaddVulnerabilityStatusComment
     */
    statusId: string
    /**
     * 
     * @type AddCommentBody
     * @memberof DataVulnerabilitiesApiaddVulnerabilityStatusComment
     */
    addCommentBody: AddCommentBody
}

export interface DataVulnerabilitiesApiGetVulnerabilitiesSummaryRequest {
    /**
     * 
     * Defaults to: undefined
     * @type VulnerabilitiesFilterOptions
     * @memberof DataVulnerabilitiesApigetVulnerabilitiesSummary
     */
    filter?: VulnerabilitiesFilterOptions
}

export interface DataVulnerabilitiesApiGetVulnerabilityRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DataVulnerabilitiesApigetVulnerability
     */
    vulnerabilityId: string
}

export interface DataVulnerabilitiesApiListVulnerabilitiesRequest {
    /**
     * 
     * Defaults to: undefined
     * @type VulnerabilitiesFilterOptions
     * @memberof DataVulnerabilitiesApilistVulnerabilities
     */
    filter?: VulnerabilitiesFilterOptions
    /**
     * 
     * Defaults to: undefined
     * @type ListVulnerabilitiesSortParameter
     * @memberof DataVulnerabilitiesApilistVulnerabilities
     */
    sort?: ListVulnerabilitiesSortParameter
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof DataVulnerabilitiesApilistVulnerabilities
     */
    pageSize?: number
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DataVulnerabilitiesApilistVulnerabilities
     */
    nextToken?: string
}

export interface DataVulnerabilitiesApiListVulnerabilitiesByDataStoreRequest {
    /**
     * 
     * Defaults to: undefined
     * @type VulnerabilitiesByDataStoreFilterOptions
     * @memberof DataVulnerabilitiesApilistVulnerabilitiesByDataStore
     */
    filter?: VulnerabilitiesByDataStoreFilterOptions
    /**
     * 
     * Defaults to: undefined
     * @type ListVulnerabilitiesByDataStoreSortParameter
     * @memberof DataVulnerabilitiesApilistVulnerabilitiesByDataStore
     */
    sort?: ListVulnerabilitiesByDataStoreSortParameter
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof DataVulnerabilitiesApilistVulnerabilitiesByDataStore
     */
    pageSize?: number
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DataVulnerabilitiesApilistVulnerabilitiesByDataStore
     */
    nextToken?: string
}

export interface DataVulnerabilitiesApiRemoveVulnerabilityStatusCommentRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DataVulnerabilitiesApiremoveVulnerabilityStatusComment
     */
    vulnerabilityId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DataVulnerabilitiesApiremoveVulnerabilityStatusComment
     */
    statusId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DataVulnerabilitiesApiremoveVulnerabilityStatusComment
     */
    commentId: string
}

export interface DataVulnerabilitiesApiSetVulnerabilityStatusRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DataVulnerabilitiesApisetVulnerabilityStatus
     */
    vulnerabilityId: string
    /**
     * 
     * @type SetVulnerabilityStatusRequest
     * @memberof DataVulnerabilitiesApisetVulnerabilityStatus
     */
    setVulnerabilityStatusRequest: SetVulnerabilityStatusRequest
}

export interface DataVulnerabilitiesApiUpdateVulnerabilityStatusCommentRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DataVulnerabilitiesApiupdateVulnerabilityStatusComment
     */
    vulnerabilityId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DataVulnerabilitiesApiupdateVulnerabilityStatusComment
     */
    statusId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DataVulnerabilitiesApiupdateVulnerabilityStatusComment
     */
    commentId: string
    /**
     * 
     * @type UpdateCommentBody
     * @memberof DataVulnerabilitiesApiupdateVulnerabilityStatusComment
     */
    updateCommentBody: UpdateCommentBody
}

export class ObjectDataVulnerabilitiesApi {
    private api: ObservableDataVulnerabilitiesApi

    public constructor(configuration: Configuration, requestFactory?: DataVulnerabilitiesApiRequestFactory, responseProcessor?: DataVulnerabilitiesApiResponseProcessor) {
        this.api = new ObservableDataVulnerabilitiesApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Add or update the status comment of a vulnerability status to keep track of the workflow progress.
     * Add vulnerability status comment
     * @param param the request object
     */
    public addVulnerabilityStatusCommentWithHttpInfo(param: DataVulnerabilitiesApiAddVulnerabilityStatusCommentRequest, options?: ConfigurationOptions): Promise<HttpInfo<VulnerabilityStatus>> {
        return this.api.addVulnerabilityStatusCommentWithHttpInfo(param.vulnerabilityId, param.statusId, param.addCommentBody,  options).toPromise();
    }

    /**
     * Add or update the status comment of a vulnerability status to keep track of the workflow progress.
     * Add vulnerability status comment
     * @param param the request object
     */
    public addVulnerabilityStatusComment(param: DataVulnerabilitiesApiAddVulnerabilityStatusCommentRequest, options?: ConfigurationOptions): Promise<VulnerabilityStatus> {
        return this.api.addVulnerabilityStatusComment(param.vulnerabilityId, param.statusId, param.addCommentBody,  options).toPromise();
    }

    /**
     * Get a summary of all the vulnerabilities. You can also filter the results of the vulnerabilities based on the vulnerebility\'s type, threat, status, and so on.<BR><B>Note:</B> Filter needs to be HTML Encoded.
     * Get vulnerabilities summary
     * @param param the request object
     */
    public getVulnerabilitiesSummaryWithHttpInfo(param: DataVulnerabilitiesApiGetVulnerabilitiesSummaryRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<VulnerabilitiesSummary>> {
        return this.api.getVulnerabilitiesSummaryWithHttpInfo(param.filter,  options).toPromise();
    }

    /**
     * Get a summary of all the vulnerabilities. You can also filter the results of the vulnerabilities based on the vulnerebility\'s type, threat, status, and so on.<BR><B>Note:</B> Filter needs to be HTML Encoded.
     * Get vulnerabilities summary
     * @param param the request object
     */
    public getVulnerabilitiesSummary(param: DataVulnerabilitiesApiGetVulnerabilitiesSummaryRequest = {}, options?: ConfigurationOptions): Promise<VulnerabilitiesSummary> {
        return this.api.getVulnerabilitiesSummary(param.filter,  options).toPromise();
    }

    /**
     * Get vulnerability details by providing its ID.
     * Get vulnerability details by ID
     * @param param the request object
     */
    public getVulnerabilityWithHttpInfo(param: DataVulnerabilitiesApiGetVulnerabilityRequest, options?: ConfigurationOptions): Promise<HttpInfo<Vulnerability>> {
        return this.api.getVulnerabilityWithHttpInfo(param.vulnerabilityId,  options).toPromise();
    }

    /**
     * Get vulnerability details by providing its ID.
     * Get vulnerability details by ID
     * @param param the request object
     */
    public getVulnerability(param: DataVulnerabilitiesApiGetVulnerabilityRequest, options?: ConfigurationOptions): Promise<Vulnerability> {
        return this.api.getVulnerability(param.vulnerabilityId,  options).toPromise();
    }

    /**
     * Get a list of data vulnerabilities based on a filter applied. You can filter by ID of the vulnerability, type of the vulnerability, and so on.<BR><B>Note:</B> Filter needs to be HTML encoded.
     * List vulnerabilities based on an applied filter
     * @param param the request object
     */
    public listVulnerabilitiesWithHttpInfo(param: DataVulnerabilitiesApiListVulnerabilitiesRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<ListVulnerabilities200Response>> {
        return this.api.listVulnerabilitiesWithHttpInfo(param.filter, param.sort, param.pageSize, param.nextToken,  options).toPromise();
    }

    /**
     * Get a list of data vulnerabilities based on a filter applied. You can filter by ID of the vulnerability, type of the vulnerability, and so on.<BR><B>Note:</B> Filter needs to be HTML encoded.
     * List vulnerabilities based on an applied filter
     * @param param the request object
     */
    public listVulnerabilities(param: DataVulnerabilitiesApiListVulnerabilitiesRequest = {}, options?: ConfigurationOptions): Promise<ListVulnerabilities200Response> {
        return this.api.listVulnerabilities(param.filter, param.sort, param.pageSize, param.nextToken,  options).toPromise();
    }

    /**
     * Get a list of all the vulnerabilities of data stores.
     * List vulnerabilities of data stores
     * @param param the request object
     */
    public listVulnerabilitiesByDataStoreWithHttpInfo(param: DataVulnerabilitiesApiListVulnerabilitiesByDataStoreRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<ListVulnerabilitiesByDataStore200Response>> {
        return this.api.listVulnerabilitiesByDataStoreWithHttpInfo(param.filter, param.sort, param.pageSize, param.nextToken,  options).toPromise();
    }

    /**
     * Get a list of all the vulnerabilities of data stores.
     * List vulnerabilities of data stores
     * @param param the request object
     */
    public listVulnerabilitiesByDataStore(param: DataVulnerabilitiesApiListVulnerabilitiesByDataStoreRequest = {}, options?: ConfigurationOptions): Promise<ListVulnerabilitiesByDataStore200Response> {
        return this.api.listVulnerabilitiesByDataStore(param.filter, param.sort, param.pageSize, param.nextToken,  options).toPromise();
    }

    /**
     * Delete a status comment of a vulnerability status.
     * Delete vulnerability status comment
     * @param param the request object
     */
    public removeVulnerabilityStatusCommentWithHttpInfo(param: DataVulnerabilitiesApiRemoveVulnerabilityStatusCommentRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.removeVulnerabilityStatusCommentWithHttpInfo(param.vulnerabilityId, param.statusId, param.commentId,  options).toPromise();
    }

    /**
     * Delete a status comment of a vulnerability status.
     * Delete vulnerability status comment
     * @param param the request object
     */
    public removeVulnerabilityStatusComment(param: DataVulnerabilitiesApiRemoveVulnerabilityStatusCommentRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.removeVulnerabilityStatusComment(param.vulnerabilityId, param.statusId, param.commentId,  options).toPromise();
    }

    /**
     * Add or update the status of a vulnerability to track its progress.
     * Set status of a vulnerability
     * @param param the request object
     */
    public setVulnerabilityStatusWithHttpInfo(param: DataVulnerabilitiesApiSetVulnerabilityStatusRequest, options?: ConfigurationOptions): Promise<HttpInfo<VulnerabilityStatus>> {
        return this.api.setVulnerabilityStatusWithHttpInfo(param.vulnerabilityId, param.setVulnerabilityStatusRequest,  options).toPromise();
    }

    /**
     * Add or update the status of a vulnerability to track its progress.
     * Set status of a vulnerability
     * @param param the request object
     */
    public setVulnerabilityStatus(param: DataVulnerabilitiesApiSetVulnerabilityStatusRequest, options?: ConfigurationOptions): Promise<VulnerabilityStatus> {
        return this.api.setVulnerabilityStatus(param.vulnerabilityId, param.setVulnerabilityStatusRequest,  options).toPromise();
    }

    /**
     * Set a vulnerability status of a vulnerability.
     * Set vulnerability status
     * @param param the request object
     */
    public updateVulnerabilityStatusCommentWithHttpInfo(param: DataVulnerabilitiesApiUpdateVulnerabilityStatusCommentRequest, options?: ConfigurationOptions): Promise<HttpInfo<VulnerabilityStatusComment>> {
        return this.api.updateVulnerabilityStatusCommentWithHttpInfo(param.vulnerabilityId, param.statusId, param.commentId, param.updateCommentBody,  options).toPromise();
    }

    /**
     * Set a vulnerability status of a vulnerability.
     * Set vulnerability status
     * @param param the request object
     */
    public updateVulnerabilityStatusComment(param: DataVulnerabilitiesApiUpdateVulnerabilityStatusCommentRequest, options?: ConfigurationOptions): Promise<VulnerabilityStatusComment> {
        return this.api.updateVulnerabilityStatusComment(param.vulnerabilityId, param.statusId, param.commentId, param.updateCommentBody,  options).toPromise();
    }

}

import { ObservableDatabootstrapperServiceApi } from "./ObservableAPI";
import { DatabootstrapperServiceApiRequestFactory, DatabootstrapperServiceApiResponseProcessor} from "../apis/DatabootstrapperServiceApi";

export interface DatabootstrapperServiceApiDatabootstrapperServiceLoadDataRequest {
    /**
     * 
     * @type Databootstrapperv3LoadDataRequest
     * @memberof DatabootstrapperServiceApidatabootstrapperServiceLoadData
     */
    databootstrapperv3LoadDataRequest: Databootstrapperv3LoadDataRequest
}

export class ObjectDatabootstrapperServiceApi {
    private api: ObservableDatabootstrapperServiceApi

    public constructor(configuration: Configuration, requestFactory?: DatabootstrapperServiceApiRequestFactory, responseProcessor?: DatabootstrapperServiceApiResponseProcessor) {
        this.api = new ObservableDatabootstrapperServiceApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Summary: Load data Description: Load data for a tenant.
     * @param param the request object
     */
    public databootstrapperServiceLoadDataWithHttpInfo(param: DatabootstrapperServiceApiDatabootstrapperServiceLoadDataRequest, options?: ConfigurationOptions): Promise<HttpInfo<Databootstrapperv3LoadDataResponse>> {
        return this.api.databootstrapperServiceLoadDataWithHttpInfo(param.databootstrapperv3LoadDataRequest,  options).toPromise();
    }

    /**
     * Summary: Load data Description: Load data for a tenant.
     * @param param the request object
     */
    public databootstrapperServiceLoadData(param: DatabootstrapperServiceApiDatabootstrapperServiceLoadDataRequest, options?: ConfigurationOptions): Promise<Databootstrapperv3LoadDataResponse> {
        return this.api.databootstrapperServiceLoadData(param.databootstrapperv3LoadDataRequest,  options).toPromise();
    }

}

import { ObservableDatamartProcessorServiceApi } from "./ObservableAPI";
import { DatamartProcessorServiceApiRequestFactory, DatamartProcessorServiceApiResponseProcessor} from "../apis/DatamartProcessorServiceApi";

export interface DatamartProcessorServiceApiDatamartProcessorServiceGetDatamartInfoRequest {
    /**
     * Ingestion id.
     * Defaults to: undefined
     * @type string
     * @memberof DatamartProcessorServiceApidatamartProcessorServiceGetDatamartInfo
     */
    ingestionId?: string
}

export interface DatamartProcessorServiceApiDatamartProcessorServiceGetDatamartsRequest {
    /**
     * Data starting time period in UTC.
     * Defaults to: undefined
     * @type Date
     * @memberof DatamartProcessorServiceApidatamartProcessorServiceGetDatamarts
     */
    periodStart?: Date
    /**
     * Data ending time period in UTC.
     * Defaults to: undefined
     * @type Date
     * @memberof DatamartProcessorServiceApidatamartProcessorServiceGetDatamarts
     */
    periodEnd?: Date
}

export interface DatamartProcessorServiceApiDatamartProcessorServiceGetEarliestStartTimeRequest {
}

export interface DatamartProcessorServiceApiDatamartProcessorServiceSendAllCompleteFilesToQueueRequest {
    /**
     * 
     * @type any
     * @memberof DatamartProcessorServiceApidatamartProcessorServiceSendAllCompleteFilesToQueue
     */
    body: any
}

export interface DatamartProcessorServiceApiDatamartProcessorServiceStoreExtractionLogsRequest {
    /**
     * Request id which co-relates to request.
     * Defaults to: undefined
     * @type string
     * @memberof DatamartProcessorServiceApidatamartProcessorServiceStoreExtractionLogs
     */
    requestId: string
    /**
     * 
     * @type Datamartprocessorv3DMExtractionLogsRequest
     * @memberof DatamartProcessorServiceApidatamartProcessorServiceStoreExtractionLogs
     */
    datamartprocessorv3DMExtractionLogsRequest: Datamartprocessorv3DMExtractionLogsRequest
}

export interface DatamartProcessorServiceApiUploadDatamartRequest {
    /**
     * The file to upload.
     * Defaults to: undefined
     * @type HttpFile
     * @memberof DatamartProcessorServiceApiuploadDatamart
     */
    file: HttpFile
}

export class ObjectDatamartProcessorServiceApi {
    private api: ObservableDatamartProcessorServiceApi

    public constructor(configuration: Configuration, requestFactory?: DatamartProcessorServiceApiRequestFactory, responseProcessor?: DatamartProcessorServiceApiResponseProcessor) {
        this.api = new ObservableDatamartProcessorServiceApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Summary: Get datamarts Description: Return a list of files inside a datamart to the caller.
     * @param param the request object
     */
    public datamartProcessorServiceGetDatamartInfoWithHttpInfo(param: DatamartProcessorServiceApiDatamartProcessorServiceGetDatamartInfoRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Datamartprocessorv3GetDatamartInfoResponse>> {
        return this.api.datamartProcessorServiceGetDatamartInfoWithHttpInfo(param.ingestionId,  options).toPromise();
    }

    /**
     * Summary: Get datamarts Description: Return a list of files inside a datamart to the caller.
     * @param param the request object
     */
    public datamartProcessorServiceGetDatamartInfo(param: DatamartProcessorServiceApiDatamartProcessorServiceGetDatamartInfoRequest = {}, options?: ConfigurationOptions): Promise<Datamartprocessorv3GetDatamartInfoResponse> {
        return this.api.datamartProcessorServiceGetDatamartInfo(param.ingestionId,  options).toPromise();
    }

    /**
     * Summary: Get datamarts Description: Return a list of datamarts for a time interval to the caller.
     * @param param the request object
     */
    public datamartProcessorServiceGetDatamartsWithHttpInfo(param: DatamartProcessorServiceApiDatamartProcessorServiceGetDatamartsRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Datamartprocessorv3GetDatamartResponse>> {
        return this.api.datamartProcessorServiceGetDatamartsWithHttpInfo(param.periodStart, param.periodEnd,  options).toPromise();
    }

    /**
     * Summary: Get datamarts Description: Return a list of datamarts for a time interval to the caller.
     * @param param the request object
     */
    public datamartProcessorServiceGetDatamarts(param: DatamartProcessorServiceApiDatamartProcessorServiceGetDatamartsRequest = {}, options?: ConfigurationOptions): Promise<Datamartprocessorv3GetDatamartResponse> {
        return this.api.datamartProcessorServiceGetDatamarts(param.periodStart, param.periodEnd,  options).toPromise();
    }

    /**
     * Summary: Get rarliest start time Description: Return the earliest time period of data available in database.
     * @param param the request object
     */
    public datamartProcessorServiceGetEarliestStartTimeWithHttpInfo(param: DatamartProcessorServiceApiDatamartProcessorServiceGetEarliestStartTimeRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Datamartprocessorv3GetEarliestStartTimeResponse>> {
        return this.api.datamartProcessorServiceGetEarliestStartTimeWithHttpInfo( options).toPromise();
    }

    /**
     * Summary: Get rarliest start time Description: Return the earliest time period of data available in database.
     * @param param the request object
     */
    public datamartProcessorServiceGetEarliestStartTime(param: DatamartProcessorServiceApiDatamartProcessorServiceGetEarliestStartTimeRequest = {}, options?: ConfigurationOptions): Promise<Datamartprocessorv3GetEarliestStartTimeResponse> {
        return this.api.datamartProcessorServiceGetEarliestStartTime( options).toPromise();
    }

    /**
     * @param param the request object
     */
    public datamartProcessorServiceSendAllCompleteFilesToQueueWithHttpInfo(param: DatamartProcessorServiceApiDatamartProcessorServiceSendAllCompleteFilesToQueueRequest, options?: ConfigurationOptions): Promise<HttpInfo<Datamartprocessorv3StatusResponseBase>> {
        return this.api.datamartProcessorServiceSendAllCompleteFilesToQueueWithHttpInfo(param.body,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public datamartProcessorServiceSendAllCompleteFilesToQueue(param: DatamartProcessorServiceApiDatamartProcessorServiceSendAllCompleteFilesToQueueRequest, options?: ConfigurationOptions): Promise<Datamartprocessorv3StatusResponseBase> {
        return this.api.datamartProcessorServiceSendAllCompleteFilesToQueue(param.body,  options).toPromise();
    }

    /**
     * Summary: Store extraction logs Description: Store the datamart extraction logs inside GI.
     * @param param the request object
     */
    public datamartProcessorServiceStoreExtractionLogsWithHttpInfo(param: DatamartProcessorServiceApiDatamartProcessorServiceStoreExtractionLogsRequest, options?: ConfigurationOptions): Promise<HttpInfo<Datamartprocessorv3DMExtractionLogsResponse>> {
        return this.api.datamartProcessorServiceStoreExtractionLogsWithHttpInfo(param.requestId, param.datamartprocessorv3DMExtractionLogsRequest,  options).toPromise();
    }

    /**
     * Summary: Store extraction logs Description: Store the datamart extraction logs inside GI.
     * @param param the request object
     */
    public datamartProcessorServiceStoreExtractionLogs(param: DatamartProcessorServiceApiDatamartProcessorServiceStoreExtractionLogsRequest, options?: ConfigurationOptions): Promise<Datamartprocessorv3DMExtractionLogsResponse> {
        return this.api.datamartProcessorServiceStoreExtractionLogs(param.requestId, param.datamartprocessorv3DMExtractionLogsRequest,  options).toPromise();
    }

    /**
     * Summary: Upload datamart Description: Upload datamart file for ingestion.
     * @param param the request object
     */
    public uploadDatamartWithHttpInfo(param: DatamartProcessorServiceApiUploadDatamartRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.uploadDatamartWithHttpInfo(param.file,  options).toPromise();
    }

    /**
     * Summary: Upload datamart Description: Upload datamart file for ingestion.
     * @param param the request object
     */
    public uploadDatamart(param: DatamartProcessorServiceApiUploadDatamartRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.uploadDatamart(param.file,  options).toPromise();
    }

}

import { ObservableEcosystemServiceApi } from "./ObservableAPI";
import { EcosystemServiceApiRequestFactory, EcosystemServiceApiResponseProcessor} from "../apis/EcosystemServiceApi";

export interface EcosystemServiceApiEcosystemServiceCreateDatasetRequest {
    /**
     * 
     * @type Ecosystemv3CreateDatasetRequest
     * @memberof EcosystemServiceApiecosystemServiceCreateDataset
     */
    ecosystemv3CreateDatasetRequest: Ecosystemv3CreateDatasetRequest
}

export interface EcosystemServiceApiEcosystemServiceDataInsertRequest {
    /**
     * Data set target name.
     * Defaults to: undefined
     * @type string
     * @memberof EcosystemServiceApiecosystemServiceDataInsert
     */
    datasetName: string
    /**
     * 
     * @type Ecosystemv3DataInsertRequest
     * @memberof EcosystemServiceApiecosystemServiceDataInsert
     */
    ecosystemv3DataInsertRequest: Ecosystemv3DataInsertRequest
}

export interface EcosystemServiceApiEcosystemServiceDeleteDatasetsRequest {
    /**
     * Name of the dataset, required field.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof EcosystemServiceApiecosystemServiceDeleteDatasets
     */
    datasetNames?: Array<string>
}

export interface EcosystemServiceApiEcosystemServiceGetDatasetDataRequest {
    /**
     * Name of the dataset.
     * Defaults to: undefined
     * @type string
     * @memberof EcosystemServiceApiecosystemServiceGetDatasetData
     */
    datasetName: string
    /**
     * The amount to offset the rows by for pagination.
     * Defaults to: undefined
     * @type number
     * @memberof EcosystemServiceApiecosystemServiceGetDatasetData
     */
    offset?: number
    /**
     * The max amount of rows to return for pagination.
     * Defaults to: undefined
     * @type number
     * @memberof EcosystemServiceApiecosystemServiceGetDatasetData
     */
    limit?: number
    /**
     * If needs to return header information. It is for pagination. The first page needs header, the rest doesn\&#39;t need.
     * Defaults to: undefined
     * @type boolean
     * @memberof EcosystemServiceApiecosystemServiceGetDatasetData
     */
    returnHeader?: boolean
    /**
     * Search field.
     * Defaults to: undefined
     * @type string
     * @memberof EcosystemServiceApiecosystemServiceGetDatasetData
     */
    field?: string
    /**
     * Search value.
     * Defaults to: undefined
     * @type string
     * @memberof EcosystemServiceApiecosystemServiceGetDatasetData
     */
    value?: string
    /**
     * Field to sort.
     * Defaults to: undefined
     * @type string
     * @memberof EcosystemServiceApiecosystemServiceGetDatasetData
     */
    sortField?: string
    /**
     * Sort order.
     * Defaults to: &#39;NONE&#39;
     * @type &#39;NONE&#39; | &#39;ASC&#39; | &#39;DESC&#39;
     * @memberof EcosystemServiceApiecosystemServiceGetDatasetData
     */
    sortOrder?: 'NONE' | 'ASC' | 'DESC'
}

export interface EcosystemServiceApiEcosystemServiceGetDatasetDetailRequest {
    /**
     * Name of the dataset.
     * Defaults to: undefined
     * @type string
     * @memberof EcosystemServiceApiecosystemServiceGetDatasetDetail
     */
    datasetName: string
}

export interface EcosystemServiceApiEcosystemServiceGetDatasetsRequest {
    /**
     * Return datasets created at this time or later (&gt;&#x3D;).
     * Defaults to: undefined
     * @type Date
     * @memberof EcosystemServiceApiecosystemServiceGetDatasets
     */
    filterStartTime?: Date
    /**
     * Return datasets created before this time (&lt;).
     * Defaults to: undefined
     * @type Date
     * @memberof EcosystemServiceApiecosystemServiceGetDatasets
     */
    filterEndTime?: Date
    /**
     * The state filter groups commonly paired states. Only returns records that include the specified names.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof EcosystemServiceApiecosystemServiceGetDatasets
     */
    filterDatasetNames?: Array<string>
    /**
     * The amount to offset the rows by for pagination.
     * Defaults to: undefined
     * @type number
     * @memberof EcosystemServiceApiecosystemServiceGetDatasets
     */
    offset?: number
    /**
     * The max amount of rows to return for pagination.
     * Defaults to: undefined
     * @type number
     * @memberof EcosystemServiceApiecosystemServiceGetDatasets
     */
    limit?: number
    /**
     * Computing the filter counts is relatively expensive, only compute when needed.
     * Defaults to: undefined
     * @type boolean
     * @memberof EcosystemServiceApiecosystemServiceGetDatasets
     */
    includeFilterCounts?: boolean
}

export interface EcosystemServiceApiEcosystemServiceGetPurgableRowsRequest {
    /**
     * 
     * @type Ecosystemv3GetPurgableRowsRequest
     * @memberof EcosystemServiceApiecosystemServiceGetPurgableRows
     */
    ecosystemv3GetPurgableRowsRequest: Ecosystemv3GetPurgableRowsRequest
}

export interface EcosystemServiceApiEcosystemServicePurgeDataRequest {
    /**
     * Name of the datasets, required field.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof EcosystemServiceApiecosystemServicePurgeData
     */
    datasetNames?: Array<string>
}

export interface EcosystemServiceApiEcosystemServiceTestIntegrationRequest {
    /**
     * 
     * @type Ecosystemv3TestIntegrationRequest
     * @memberof EcosystemServiceApiecosystemServiceTestIntegration
     */
    ecosystemv3TestIntegrationRequest: Ecosystemv3TestIntegrationRequest
}

export class ObjectEcosystemServiceApi {
    private api: ObservableEcosystemServiceApi

    public constructor(configuration: Configuration, requestFactory?: EcosystemServiceApiRequestFactory, responseProcessor?: EcosystemServiceApiResponseProcessor) {
        this.api = new ObservableEcosystemServiceApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Summary: Create dataset Description: Save a definition in the database.
     * @param param the request object
     */
    public ecosystemServiceCreateDatasetWithHttpInfo(param: EcosystemServiceApiEcosystemServiceCreateDatasetRequest, options?: ConfigurationOptions): Promise<HttpInfo<Ecosystemv3CreateDatasetResponse>> {
        return this.api.ecosystemServiceCreateDatasetWithHttpInfo(param.ecosystemv3CreateDatasetRequest,  options).toPromise();
    }

    /**
     * Summary: Create dataset Description: Save a definition in the database.
     * @param param the request object
     */
    public ecosystemServiceCreateDataset(param: EcosystemServiceApiEcosystemServiceCreateDatasetRequest, options?: ConfigurationOptions): Promise<Ecosystemv3CreateDatasetResponse> {
        return this.api.ecosystemServiceCreateDataset(param.ecosystemv3CreateDatasetRequest,  options).toPromise();
    }

    /**
     * Summary: Data insert Description: Process Data received from webhook API and insert.
     * @param param the request object
     */
    public ecosystemServiceDataInsertWithHttpInfo(param: EcosystemServiceApiEcosystemServiceDataInsertRequest, options?: ConfigurationOptions): Promise<HttpInfo<Ecosystemv3DataInsertResponse>> {
        return this.api.ecosystemServiceDataInsertWithHttpInfo(param.datasetName, param.ecosystemv3DataInsertRequest,  options).toPromise();
    }

    /**
     * Summary: Data insert Description: Process Data received from webhook API and insert.
     * @param param the request object
     */
    public ecosystemServiceDataInsert(param: EcosystemServiceApiEcosystemServiceDataInsertRequest, options?: ConfigurationOptions): Promise<Ecosystemv3DataInsertResponse> {
        return this.api.ecosystemServiceDataInsert(param.datasetName, param.ecosystemv3DataInsertRequest,  options).toPromise();
    }

    /**
     * Summary: Delete datasets Description: Delete an array of datasets.
     * @param param the request object
     */
    public ecosystemServiceDeleteDatasetsWithHttpInfo(param: EcosystemServiceApiEcosystemServiceDeleteDatasetsRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Ecosystemv3DeleteDatasetsResponse>> {
        return this.api.ecosystemServiceDeleteDatasetsWithHttpInfo(param.datasetNames,  options).toPromise();
    }

    /**
     * Summary: Delete datasets Description: Delete an array of datasets.
     * @param param the request object
     */
    public ecosystemServiceDeleteDatasets(param: EcosystemServiceApiEcosystemServiceDeleteDatasetsRequest = {}, options?: ConfigurationOptions): Promise<Ecosystemv3DeleteDatasetsResponse> {
        return this.api.ecosystemServiceDeleteDatasets(param.datasetNames,  options).toPromise();
    }

    /**
     * Summary: Get dataset data Description: Return data report for a given dataset.
     * @param param the request object
     */
    public ecosystemServiceGetDatasetDataWithHttpInfo(param: EcosystemServiceApiEcosystemServiceGetDatasetDataRequest, options?: ConfigurationOptions): Promise<HttpInfo<Ecosystemv3GetDatasetDataResponse>> {
        return this.api.ecosystemServiceGetDatasetDataWithHttpInfo(param.datasetName, param.offset, param.limit, param.returnHeader, param.field, param.value, param.sortField, param.sortOrder,  options).toPromise();
    }

    /**
     * Summary: Get dataset data Description: Return data report for a given dataset.
     * @param param the request object
     */
    public ecosystemServiceGetDatasetData(param: EcosystemServiceApiEcosystemServiceGetDatasetDataRequest, options?: ConfigurationOptions): Promise<Ecosystemv3GetDatasetDataResponse> {
        return this.api.ecosystemServiceGetDatasetData(param.datasetName, param.offset, param.limit, param.returnHeader, param.field, param.value, param.sortField, param.sortOrder,  options).toPromise();
    }

    /**
     * Summary: Get dataset detail Description: Return detail on a dataset definition.
     * @param param the request object
     */
    public ecosystemServiceGetDatasetDetailWithHttpInfo(param: EcosystemServiceApiEcosystemServiceGetDatasetDetailRequest, options?: ConfigurationOptions): Promise<HttpInfo<Ecosystemv3GetDatasetDetailResponse>> {
        return this.api.ecosystemServiceGetDatasetDetailWithHttpInfo(param.datasetName,  options).toPromise();
    }

    /**
     * Summary: Get dataset detail Description: Return detail on a dataset definition.
     * @param param the request object
     */
    public ecosystemServiceGetDatasetDetail(param: EcosystemServiceApiEcosystemServiceGetDatasetDetailRequest, options?: ConfigurationOptions): Promise<Ecosystemv3GetDatasetDetailResponse> {
        return this.api.ecosystemServiceGetDatasetDetail(param.datasetName,  options).toPromise();
    }

    /**
     * Summary: Get datasets Description: Return dataset list that matches the specified filter.
     * @param param the request object
     */
    public ecosystemServiceGetDatasetsWithHttpInfo(param: EcosystemServiceApiEcosystemServiceGetDatasetsRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Ecosystemv3GetDatasetsResponse>> {
        return this.api.ecosystemServiceGetDatasetsWithHttpInfo(param.filterStartTime, param.filterEndTime, param.filterDatasetNames, param.offset, param.limit, param.includeFilterCounts,  options).toPromise();
    }

    /**
     * Summary: Get datasets Description: Return dataset list that matches the specified filter.
     * @param param the request object
     */
    public ecosystemServiceGetDatasets(param: EcosystemServiceApiEcosystemServiceGetDatasetsRequest = {}, options?: ConfigurationOptions): Promise<Ecosystemv3GetDatasetsResponse> {
        return this.api.ecosystemServiceGetDatasets(param.filterStartTime, param.filterEndTime, param.filterDatasetNames, param.offset, param.limit, param.includeFilterCounts,  options).toPromise();
    }

    /**
     * Summary: Get purgable rows Description: Check the number of rows that can be purged.
     * @param param the request object
     */
    public ecosystemServiceGetPurgableRowsWithHttpInfo(param: EcosystemServiceApiEcosystemServiceGetPurgableRowsRequest, options?: ConfigurationOptions): Promise<HttpInfo<Ecosystemv3GetPurgableRowsResponse>> {
        return this.api.ecosystemServiceGetPurgableRowsWithHttpInfo(param.ecosystemv3GetPurgableRowsRequest,  options).toPromise();
    }

    /**
     * Summary: Get purgable rows Description: Check the number of rows that can be purged.
     * @param param the request object
     */
    public ecosystemServiceGetPurgableRows(param: EcosystemServiceApiEcosystemServiceGetPurgableRowsRequest, options?: ConfigurationOptions): Promise<Ecosystemv3GetPurgableRowsResponse> {
        return this.api.ecosystemServiceGetPurgableRows(param.ecosystemv3GetPurgableRowsRequest,  options).toPromise();
    }

    /**
     * Summary: Purge data Description: Purge data.
     * @param param the request object
     */
    public ecosystemServicePurgeDataWithHttpInfo(param: EcosystemServiceApiEcosystemServicePurgeDataRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Ecosystemv3PurgeDataResponse>> {
        return this.api.ecosystemServicePurgeDataWithHttpInfo(param.datasetNames,  options).toPromise();
    }

    /**
     * Summary: Purge data Description: Purge data.
     * @param param the request object
     */
    public ecosystemServicePurgeData(param: EcosystemServiceApiEcosystemServicePurgeDataRequest = {}, options?: ConfigurationOptions): Promise<Ecosystemv3PurgeDataResponse> {
        return this.api.ecosystemServicePurgeData(param.datasetNames,  options).toPromise();
    }

    /**
     * Summary: Test integration Description: Test the integration connection with the arguments passed in the TestIntegrationRequest.  When possible a test message is sent to the integration to ensure it is functional. Currently this API only supports API_IMPORT type integrations
     * @param param the request object
     */
    public ecosystemServiceTestIntegrationWithHttpInfo(param: EcosystemServiceApiEcosystemServiceTestIntegrationRequest, options?: ConfigurationOptions): Promise<HttpInfo<Ecosystemv3TestIntegrationResponse>> {
        return this.api.ecosystemServiceTestIntegrationWithHttpInfo(param.ecosystemv3TestIntegrationRequest,  options).toPromise();
    }

    /**
     * Summary: Test integration Description: Test the integration connection with the arguments passed in the TestIntegrationRequest.  When possible a test message is sent to the integration to ensure it is functional. Currently this API only supports API_IMPORT type integrations
     * @param param the request object
     */
    public ecosystemServiceTestIntegration(param: EcosystemServiceApiEcosystemServiceTestIntegrationRequest, options?: ConfigurationOptions): Promise<Ecosystemv3TestIntegrationResponse> {
        return this.api.ecosystemServiceTestIntegration(param.ecosystemv3TestIntegrationRequest,  options).toPromise();
    }

}

import { ObservableFeatureFlagsServiceApi } from "./ObservableAPI";
import { FeatureFlagsServiceApiRequestFactory, FeatureFlagsServiceApiResponseProcessor} from "../apis/FeatureFlagsServiceApi";

export interface FeatureFlagsServiceApiFeatureFlagsServiceDeleteFeatureFlagOverridesRequest {
    /**
     * Flag name.
     * Defaults to: undefined
     * @type string
     * @memberof FeatureFlagsServiceApifeatureFlagsServiceDeleteFeatureFlagOverrides
     */
    flagName?: string
    /**
     * Optional tenant id.
     * Defaults to: undefined
     * @type string
     * @memberof FeatureFlagsServiceApifeatureFlagsServiceDeleteFeatureFlagOverrides
     */
    tenantId?: string
}

export interface FeatureFlagsServiceApiFeatureFlagsServiceGetFeatureFlagOverridesRequest {
    /**
     * Optional tenant id.
     * Defaults to: undefined
     * @type string
     * @memberof FeatureFlagsServiceApifeatureFlagsServiceGetFeatureFlagOverrides
     */
    tenantId?: string
    /**
     * Optional flag names; if empty then return all flag.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof FeatureFlagsServiceApifeatureFlagsServiceGetFeatureFlagOverrides
     */
    flagNames?: Array<string>
}

export interface FeatureFlagsServiceApiFeatureFlagsServiceGetFeatureFlagsRequest {
    /**
     * Tenant id.
     * Defaults to: undefined
     * @type string
     * @memberof FeatureFlagsServiceApifeatureFlagsServiceGetFeatureFlags
     */
    tenantId?: string
    /**
     * Optional flag names; if empty then return all flag.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof FeatureFlagsServiceApifeatureFlagsServiceGetFeatureFlags
     */
    flagNames?: Array<string>
}

export interface FeatureFlagsServiceApiFeatureFlagsServiceUpdateFeatureFlagOverridesRequest {
    /**
     * 
     * @type Featureflagsv3UpdateFeatureFlagOverridesRequest
     * @memberof FeatureFlagsServiceApifeatureFlagsServiceUpdateFeatureFlagOverrides
     */
    featureflagsv3UpdateFeatureFlagOverridesRequest: Featureflagsv3UpdateFeatureFlagOverridesRequest
}

export class ObjectFeatureFlagsServiceApi {
    private api: ObservableFeatureFlagsServiceApi

    public constructor(configuration: Configuration, requestFactory?: FeatureFlagsServiceApiRequestFactory, responseProcessor?: FeatureFlagsServiceApiResponseProcessor) {
        this.api = new ObservableFeatureFlagsServiceApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Summary: Delete feature Flag overrides Description: Delete feature Flag overrides from database.
     * @param param the request object
     */
    public featureFlagsServiceDeleteFeatureFlagOverridesWithHttpInfo(param: FeatureFlagsServiceApiFeatureFlagsServiceDeleteFeatureFlagOverridesRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Featureflagsv3DeleteFeatureFlagOverridesResponse>> {
        return this.api.featureFlagsServiceDeleteFeatureFlagOverridesWithHttpInfo(param.flagName, param.tenantId,  options).toPromise();
    }

    /**
     * Summary: Delete feature Flag overrides Description: Delete feature Flag overrides from database.
     * @param param the request object
     */
    public featureFlagsServiceDeleteFeatureFlagOverrides(param: FeatureFlagsServiceApiFeatureFlagsServiceDeleteFeatureFlagOverridesRequest = {}, options?: ConfigurationOptions): Promise<Featureflagsv3DeleteFeatureFlagOverridesResponse> {
        return this.api.featureFlagsServiceDeleteFeatureFlagOverrides(param.flagName, param.tenantId,  options).toPromise();
    }

    /**
     * Summary: Get feature Flag overrides Description: Get feature Flag overrides by Feature Flag Name.
     * @param param the request object
     */
    public featureFlagsServiceGetFeatureFlagOverridesWithHttpInfo(param: FeatureFlagsServiceApiFeatureFlagsServiceGetFeatureFlagOverridesRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Featureflagsv3GetFeatureFlagOverridesResponse>> {
        return this.api.featureFlagsServiceGetFeatureFlagOverridesWithHttpInfo(param.tenantId, param.flagNames,  options).toPromise();
    }

    /**
     * Summary: Get feature Flag overrides Description: Get feature Flag overrides by Feature Flag Name.
     * @param param the request object
     */
    public featureFlagsServiceGetFeatureFlagOverrides(param: FeatureFlagsServiceApiFeatureFlagsServiceGetFeatureFlagOverridesRequest = {}, options?: ConfigurationOptions): Promise<Featureflagsv3GetFeatureFlagOverridesResponse> {
        return this.api.featureFlagsServiceGetFeatureFlagOverrides(param.tenantId, param.flagNames,  options).toPromise();
    }

    /**
     * Summary: Get feature flags Description: Get feature flags by Feature Flag Name.
     * @param param the request object
     */
    public featureFlagsServiceGetFeatureFlagsWithHttpInfo(param: FeatureFlagsServiceApiFeatureFlagsServiceGetFeatureFlagsRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Featureflagsv3GetFeatureFlagsResponse>> {
        return this.api.featureFlagsServiceGetFeatureFlagsWithHttpInfo(param.tenantId, param.flagNames,  options).toPromise();
    }

    /**
     * Summary: Get feature flags Description: Get feature flags by Feature Flag Name.
     * @param param the request object
     */
    public featureFlagsServiceGetFeatureFlags(param: FeatureFlagsServiceApiFeatureFlagsServiceGetFeatureFlagsRequest = {}, options?: ConfigurationOptions): Promise<Featureflagsv3GetFeatureFlagsResponse> {
        return this.api.featureFlagsServiceGetFeatureFlags(param.tenantId, param.flagNames,  options).toPromise();
    }

    /**
     * Summary: Update feature Flag overrides Description: Update feature Flag overrides in the database.
     * @param param the request object
     */
    public featureFlagsServiceUpdateFeatureFlagOverridesWithHttpInfo(param: FeatureFlagsServiceApiFeatureFlagsServiceUpdateFeatureFlagOverridesRequest, options?: ConfigurationOptions): Promise<HttpInfo<Featureflagsv3UpdateFeatureFlagOverridesResponse>> {
        return this.api.featureFlagsServiceUpdateFeatureFlagOverridesWithHttpInfo(param.featureflagsv3UpdateFeatureFlagOverridesRequest,  options).toPromise();
    }

    /**
     * Summary: Update feature Flag overrides Description: Update feature Flag overrides in the database.
     * @param param the request object
     */
    public featureFlagsServiceUpdateFeatureFlagOverrides(param: FeatureFlagsServiceApiFeatureFlagsServiceUpdateFeatureFlagOverridesRequest, options?: ConfigurationOptions): Promise<Featureflagsv3UpdateFeatureFlagOverridesResponse> {
        return this.api.featureFlagsServiceUpdateFeatureFlagOverrides(param.featureflagsv3UpdateFeatureFlagOverridesRequest,  options).toPromise();
    }

}

import { ObservableGroupBuilderApi } from "./ObservableAPI";
import { GroupBuilderApiRequestFactory, GroupBuilderApiResponseProcessor} from "../apis/GroupBuilderApi";

export interface GroupBuilderApiGroupBuilderCancelImportGroupRequest {
    /**
     * Group IDs to delete.
     * Defaults to: undefined
     * @type Array&lt;number&gt;
     * @memberof GroupBuilderApigroupBuilderCancelImportGroup
     */
    groupIds?: Array<number>
}

export interface GroupBuilderApiGroupBuilderCreateGroupRequest {
    /**
     * 
     * @type Groupbuilderv3CreateGroupRequest
     * @memberof GroupBuilderApigroupBuilderCreateGroup
     */
    groupbuilderv3CreateGroupRequest: Groupbuilderv3CreateGroupRequest
}

export interface GroupBuilderApiGroupBuilderDeleteGroupRequest {
    /**
     * Group IDs to delete.
     * Defaults to: undefined
     * @type Array&lt;number&gt;
     * @memberof GroupBuilderApigroupBuilderDeleteGroup
     */
    groupIds?: Array<number>
}

export interface GroupBuilderApiGroupBuilderEditGroupRequest {
    /**
     * Group ID.
     * Defaults to: undefined
     * @type number
     * @memberof GroupBuilderApigroupBuilderEditGroup
     */
    groupId: number
    /**
     * 
     * @type Groupbuilderv3EditGroupRequest
     * @memberof GroupBuilderApigroupBuilderEditGroup
     */
    groupbuilderv3EditGroupRequest: Groupbuilderv3EditGroupRequest
}

export interface GroupBuilderApiGroupBuilderExportGroupRequest {
    /**
     * 
     * @type Groupbuilderv3GetExportGroupRequest
     * @memberof GroupBuilderApigroupBuilderExportGroup
     */
    groupbuilderv3GetExportGroupRequest: Groupbuilderv3GetExportGroupRequest
}

export interface GroupBuilderApiGroupBuilderGetGroupDetailsRequest {
    /**
     * Group ID.
     * Defaults to: undefined
     * @type number
     * @memberof GroupBuilderApigroupBuilderGetGroupDetails
     */
    groupId: number
    /**
     * Filter by group member name.
     * Defaults to: undefined
     * @type string
     * @memberof GroupBuilderApigroupBuilderGetGroupDetails
     */
    filter?: string
    /**
     * Order by ascending (ASC) or descending (DESC).
     * Defaults to: undefined
     * @type string
     * @memberof GroupBuilderApigroupBuilderGetGroupDetails
     */
    order?: string
}

export interface GroupBuilderApiGroupBuilderGetGroupMembersRequest {
    /**
     * 
     * @type Groupbuilderv3GetGroupMembersRequest
     * @memberof GroupBuilderApigroupBuilderGetGroupMembers
     */
    groupbuilderv3GetGroupMembersRequest: Groupbuilderv3GetGroupMembersRequest
}

export interface GroupBuilderApiGroupBuilderGetGroupSyncMappingRequest {
    /**
     * Central manager.
     * Defaults to: undefined
     * @type string
     * @memberof GroupBuilderApigroupBuilderGetGroupSyncMapping
     */
    centralManagerId?: string
}

export interface GroupBuilderApiGroupBuilderGetGroupTypeMappingRequest {
}

export interface GroupBuilderApiGroupBuilderGetGroupTypesRequest {
}

export interface GroupBuilderApiGroupBuilderGetGroupsRequest {
    /**
     * Return group names, ID\&#39;s, type ID\&#39;s, nested bool, and tuple count only if the flag is true.
     * Defaults to: undefined
     * @type boolean
     * @memberof GroupBuilderApigroupBuilderGetGroups
     */
    doNotIncludeMemberCount?: boolean
    /**
     * Only return groups that user has full-access to.
     * Defaults to: undefined
     * @type boolean
     * @memberof GroupBuilderApigroupBuilderGetGroups
     */
    onlyFullAccess?: boolean
    /**
     * Only return non-nested groups.
     * Defaults to: undefined
     * @type boolean
     * @memberof GroupBuilderApigroupBuilderGetGroups
     */
    nonNested?: boolean
}

export interface GroupBuilderApiGroupBuilderGetImportGroupsRequest {
    /**
     * Central manager host name.
     * Defaults to: undefined
     * @type string
     * @memberof GroupBuilderApigroupBuilderGetImportGroups
     */
    centralManagerId?: string
}

export interface GroupBuilderApiGroupBuilderImportGroupRequest {
    /**
     * 
     * @type Groupbuilderv3ImportGroupRequest
     * @memberof GroupBuilderApigroupBuilderImportGroup
     */
    groupbuilderv3ImportGroupRequest: Groupbuilderv3ImportGroupRequest
}

export interface GroupBuilderApiGroupBuilderRefreshGroupsRequest {
    /**
     * 
     * @type Groupbuilderv3RefreshGroupsRequest
     * @memberof GroupBuilderApigroupBuilderRefreshGroups
     */
    groupbuilderv3RefreshGroupsRequest: Groupbuilderv3RefreshGroupsRequest
}

export interface GroupBuilderApiGroupBuilderResetGroupsRequest {
    /**
     * 
     * @type Groupbuilderv3ResetGroupsRequest
     * @memberof GroupBuilderApigroupBuilderResetGroups
     */
    groupbuilderv3ResetGroupsRequest: Groupbuilderv3ResetGroupsRequest
}

export interface GroupBuilderApiGroupBuilderStoreGroupMembersGdpRequest {
    /**
     * ID of central manager.
     * Defaults to: undefined
     * @type string
     * @memberof GroupBuilderApigroupBuilderStoreGroupMembersGdp
     */
    centralManagerId: string
    /**
     * 
     * @type Groupbuilderv3StoreGroupMembersGdpRequest
     * @memberof GroupBuilderApigroupBuilderStoreGroupMembersGdp
     */
    groupbuilderv3StoreGroupMembersGdpRequest: Groupbuilderv3StoreGroupMembersGdpRequest
}

export interface GroupBuilderApiGroupBuilderStoreGroupsGdpRequest {
    /**
     * ID of central manager.
     * Defaults to: undefined
     * @type string
     * @memberof GroupBuilderApigroupBuilderStoreGroupsGdp
     */
    centralManagerId: string
    /**
     * 
     * @type Groupbuilderv3GetGroupsRequestGdp
     * @memberof GroupBuilderApigroupBuilderStoreGroupsGdp
     */
    groupbuilderv3GetGroupsRequestGdp: Groupbuilderv3GetGroupsRequestGdp
}

export class ObjectGroupBuilderApi {
    private api: ObservableGroupBuilderApi

    public constructor(configuration: Configuration, requestFactory?: GroupBuilderApiRequestFactory, responseProcessor?: GroupBuilderApiResponseProcessor) {
        this.api = new ObservableGroupBuilderApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Summary: Cancel import group Description: Cancel import refresh for selected groups.
     * @param param the request object
     */
    public groupBuilderCancelImportGroupWithHttpInfo(param: GroupBuilderApiGroupBuilderCancelImportGroupRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Groupbuilderv3CancelGroupImportResponse>> {
        return this.api.groupBuilderCancelImportGroupWithHttpInfo(param.groupIds,  options).toPromise();
    }

    /**
     * Summary: Cancel import group Description: Cancel import refresh for selected groups.
     * @param param the request object
     */
    public groupBuilderCancelImportGroup(param: GroupBuilderApiGroupBuilderCancelImportGroupRequest = {}, options?: ConfigurationOptions): Promise<Groupbuilderv3CancelGroupImportResponse> {
        return this.api.groupBuilderCancelImportGroup(param.groupIds,  options).toPromise();
    }

    /**
     * Summary: Create group Description: Create new groups.
     * @param param the request object
     */
    public groupBuilderCreateGroupWithHttpInfo(param: GroupBuilderApiGroupBuilderCreateGroupRequest, options?: ConfigurationOptions): Promise<HttpInfo<Groupbuilderv3CreateGroupResponse>> {
        return this.api.groupBuilderCreateGroupWithHttpInfo(param.groupbuilderv3CreateGroupRequest,  options).toPromise();
    }

    /**
     * Summary: Create group Description: Create new groups.
     * @param param the request object
     */
    public groupBuilderCreateGroup(param: GroupBuilderApiGroupBuilderCreateGroupRequest, options?: ConfigurationOptions): Promise<Groupbuilderv3CreateGroupResponse> {
        return this.api.groupBuilderCreateGroup(param.groupbuilderv3CreateGroupRequest,  options).toPromise();
    }

    /**
     * Summary: Delete group Description: Delete specified groups if the group ID is not used for reports.
     * @param param the request object
     */
    public groupBuilderDeleteGroupWithHttpInfo(param: GroupBuilderApiGroupBuilderDeleteGroupRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Groupbuilderv3DeleteGroupResponse>> {
        return this.api.groupBuilderDeleteGroupWithHttpInfo(param.groupIds,  options).toPromise();
    }

    /**
     * Summary: Delete group Description: Delete specified groups if the group ID is not used for reports.
     * @param param the request object
     */
    public groupBuilderDeleteGroup(param: GroupBuilderApiGroupBuilderDeleteGroupRequest = {}, options?: ConfigurationOptions): Promise<Groupbuilderv3DeleteGroupResponse> {
        return this.api.groupBuilderDeleteGroup(param.groupIds,  options).toPromise();
    }

    /**
     * Summary: Edit group Description: Add or delete group members.
     * @param param the request object
     */
    public groupBuilderEditGroupWithHttpInfo(param: GroupBuilderApiGroupBuilderEditGroupRequest, options?: ConfigurationOptions): Promise<HttpInfo<Groupbuilderv3EditGroupResponse>> {
        return this.api.groupBuilderEditGroupWithHttpInfo(param.groupId, param.groupbuilderv3EditGroupRequest,  options).toPromise();
    }

    /**
     * Summary: Edit group Description: Add or delete group members.
     * @param param the request object
     */
    public groupBuilderEditGroup(param: GroupBuilderApiGroupBuilderEditGroupRequest, options?: ConfigurationOptions): Promise<Groupbuilderv3EditGroupResponse> {
        return this.api.groupBuilderEditGroup(param.groupId, param.groupbuilderv3EditGroupRequest,  options).toPromise();
    }

    /**
     * Summary: Export group Description: Export group content to a file based on a group ID.
     * @param param the request object
     */
    public groupBuilderExportGroupWithHttpInfo(param: GroupBuilderApiGroupBuilderExportGroupRequest, options?: ConfigurationOptions): Promise<HttpInfo<Groupbuilderv3GetExportGroupResponse>> {
        return this.api.groupBuilderExportGroupWithHttpInfo(param.groupbuilderv3GetExportGroupRequest,  options).toPromise();
    }

    /**
     * Summary: Export group Description: Export group content to a file based on a group ID.
     * @param param the request object
     */
    public groupBuilderExportGroup(param: GroupBuilderApiGroupBuilderExportGroupRequest, options?: ConfigurationOptions): Promise<Groupbuilderv3GetExportGroupResponse> {
        return this.api.groupBuilderExportGroup(param.groupbuilderv3GetExportGroupRequest,  options).toPromise();
    }

    /**
     * Summary: Get group details Description: Get details of group specified by group ID.
     * @param param the request object
     */
    public groupBuilderGetGroupDetailsWithHttpInfo(param: GroupBuilderApiGroupBuilderGetGroupDetailsRequest, options?: ConfigurationOptions): Promise<HttpInfo<Groupbuilderv3GetGroupDetailResponse>> {
        return this.api.groupBuilderGetGroupDetailsWithHttpInfo(param.groupId, param.filter, param.order,  options).toPromise();
    }

    /**
     * Summary: Get group details Description: Get details of group specified by group ID.
     * @param param the request object
     */
    public groupBuilderGetGroupDetails(param: GroupBuilderApiGroupBuilderGetGroupDetailsRequest, options?: ConfigurationOptions): Promise<Groupbuilderv3GetGroupDetailResponse> {
        return this.api.groupBuilderGetGroupDetails(param.groupId, param.filter, param.order,  options).toPromise();
    }

    /**
     * Summary: Get group members Description: Get members of all the group ids provided in the request. To be consumed by policy builder ms.
     * @param param the request object
     */
    public groupBuilderGetGroupMembersWithHttpInfo(param: GroupBuilderApiGroupBuilderGetGroupMembersRequest, options?: ConfigurationOptions): Promise<HttpInfo<Groupbuilderv3GetGroupMembersResponse>> {
        return this.api.groupBuilderGetGroupMembersWithHttpInfo(param.groupbuilderv3GetGroupMembersRequest,  options).toPromise();
    }

    /**
     * Summary: Get group members Description: Get members of all the group ids provided in the request. To be consumed by policy builder ms.
     * @param param the request object
     */
    public groupBuilderGetGroupMembers(param: GroupBuilderApiGroupBuilderGetGroupMembersRequest, options?: ConfigurationOptions): Promise<Groupbuilderv3GetGroupMembersResponse> {
        return this.api.groupBuilderGetGroupMembers(param.groupbuilderv3GetGroupMembersRequest,  options).toPromise();
    }

    /**
     * Summary: Get GDP to gi group mapping Description: Get GDSC to GDP group sync mapping.
     * @param param the request object
     */
    public groupBuilderGetGroupSyncMappingWithHttpInfo(param: GroupBuilderApiGroupBuilderGetGroupSyncMappingRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Groupbuilderv3GetGroupSyncMappingResponse>> {
        return this.api.groupBuilderGetGroupSyncMappingWithHttpInfo(param.centralManagerId,  options).toPromise();
    }

    /**
     * Summary: Get GDP to gi group mapping Description: Get GDSC to GDP group sync mapping.
     * @param param the request object
     */
    public groupBuilderGetGroupSyncMapping(param: GroupBuilderApiGroupBuilderGetGroupSyncMappingRequest = {}, options?: ConfigurationOptions): Promise<Groupbuilderv3GetGroupSyncMappingResponse> {
        return this.api.groupBuilderGetGroupSyncMapping(param.centralManagerId,  options).toPromise();
    }

    /**
     * Summary: Get group type mapping Description: Get GDSC to GDP group types mapping.
     * @param param the request object
     */
    public groupBuilderGetGroupTypeMappingWithHttpInfo(param: GroupBuilderApiGroupBuilderGetGroupTypeMappingRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Groupbuilderv3GetGroupTypeMappingResponse>> {
        return this.api.groupBuilderGetGroupTypeMappingWithHttpInfo( options).toPromise();
    }

    /**
     * Summary: Get group type mapping Description: Get GDSC to GDP group types mapping.
     * @param param the request object
     */
    public groupBuilderGetGroupTypeMapping(param: GroupBuilderApiGroupBuilderGetGroupTypeMappingRequest = {}, options?: ConfigurationOptions): Promise<Groupbuilderv3GetGroupTypeMappingResponse> {
        return this.api.groupBuilderGetGroupTypeMapping( options).toPromise();
    }

    /**
     * Summary: Get group types Description: Get a list of available group types.
     * @param param the request object
     */
    public groupBuilderGetGroupTypesWithHttpInfo(param: GroupBuilderApiGroupBuilderGetGroupTypesRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Groupbuilderv3GetGroupTypesResponse>> {
        return this.api.groupBuilderGetGroupTypesWithHttpInfo( options).toPromise();
    }

    /**
     * Summary: Get group types Description: Get a list of available group types.
     * @param param the request object
     */
    public groupBuilderGetGroupTypes(param: GroupBuilderApiGroupBuilderGetGroupTypesRequest = {}, options?: ConfigurationOptions): Promise<Groupbuilderv3GetGroupTypesResponse> {
        return this.api.groupBuilderGetGroupTypes( options).toPromise();
    }

    /**
     * Summary: Get groups Description: Get a list of imported group members.
     * @param param the request object
     */
    public groupBuilderGetGroupsWithHttpInfo(param: GroupBuilderApiGroupBuilderGetGroupsRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Groupbuilderv3GetGroupsResponse>> {
        return this.api.groupBuilderGetGroupsWithHttpInfo(param.doNotIncludeMemberCount, param.onlyFullAccess, param.nonNested,  options).toPromise();
    }

    /**
     * Summary: Get groups Description: Get a list of imported group members.
     * @param param the request object
     */
    public groupBuilderGetGroups(param: GroupBuilderApiGroupBuilderGetGroupsRequest = {}, options?: ConfigurationOptions): Promise<Groupbuilderv3GetGroupsResponse> {
        return this.api.groupBuilderGetGroups(param.doNotIncludeMemberCount, param.onlyFullAccess, param.nonNested,  options).toPromise();
    }

    /**
     * Summary: Get import groups Description: Get unsynchronized groups from a central manager.
     * @param param the request object
     */
    public groupBuilderGetImportGroupsWithHttpInfo(param: GroupBuilderApiGroupBuilderGetImportGroupsRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Groupbuilderv3GetImportGroupsResponse>> {
        return this.api.groupBuilderGetImportGroupsWithHttpInfo(param.centralManagerId,  options).toPromise();
    }

    /**
     * Summary: Get import groups Description: Get unsynchronized groups from a central manager.
     * @param param the request object
     */
    public groupBuilderGetImportGroups(param: GroupBuilderApiGroupBuilderGetImportGroupsRequest = {}, options?: ConfigurationOptions): Promise<Groupbuilderv3GetImportGroupsResponse> {
        return this.api.groupBuilderGetImportGroups(param.centralManagerId,  options).toPromise();
    }

    /**
     * Summary: Import group Description: Import selected groups from a central manager. (This API is called from GDP only)
     * @param param the request object
     */
    public groupBuilderImportGroupWithHttpInfo(param: GroupBuilderApiGroupBuilderImportGroupRequest, options?: ConfigurationOptions): Promise<HttpInfo<Groupbuilderv3ImportGroupResponse>> {
        return this.api.groupBuilderImportGroupWithHttpInfo(param.groupbuilderv3ImportGroupRequest,  options).toPromise();
    }

    /**
     * Summary: Import group Description: Import selected groups from a central manager. (This API is called from GDP only)
     * @param param the request object
     */
    public groupBuilderImportGroup(param: GroupBuilderApiGroupBuilderImportGroupRequest, options?: ConfigurationOptions): Promise<Groupbuilderv3ImportGroupResponse> {
        return this.api.groupBuilderImportGroup(param.groupbuilderv3ImportGroupRequest,  options).toPromise();
    }

    /**
     * Summary: Refresh groups Description: Refresh tenants selected imported groups.
     * @param param the request object
     */
    public groupBuilderRefreshGroupsWithHttpInfo(param: GroupBuilderApiGroupBuilderRefreshGroupsRequest, options?: ConfigurationOptions): Promise<HttpInfo<Groupbuilderv3RefreshGroupsResponse>> {
        return this.api.groupBuilderRefreshGroupsWithHttpInfo(param.groupbuilderv3RefreshGroupsRequest,  options).toPromise();
    }

    /**
     * Summary: Refresh groups Description: Refresh tenants selected imported groups.
     * @param param the request object
     */
    public groupBuilderRefreshGroups(param: GroupBuilderApiGroupBuilderRefreshGroupsRequest, options?: ConfigurationOptions): Promise<Groupbuilderv3RefreshGroupsResponse> {
        return this.api.groupBuilderRefreshGroups(param.groupbuilderv3RefreshGroupsRequest,  options).toPromise();
    }

    /**
     * Summary: Reset groups Description: Resets tenants selected predefined groups.
     * @param param the request object
     */
    public groupBuilderResetGroupsWithHttpInfo(param: GroupBuilderApiGroupBuilderResetGroupsRequest, options?: ConfigurationOptions): Promise<HttpInfo<Groupbuilderv3ResetGroupsResponse>> {
        return this.api.groupBuilderResetGroupsWithHttpInfo(param.groupbuilderv3ResetGroupsRequest,  options).toPromise();
    }

    /**
     * Summary: Reset groups Description: Resets tenants selected predefined groups.
     * @param param the request object
     */
    public groupBuilderResetGroups(param: GroupBuilderApiGroupBuilderResetGroupsRequest, options?: ConfigurationOptions): Promise<Groupbuilderv3ResetGroupsResponse> {
        return this.api.groupBuilderResetGroups(param.groupbuilderv3ResetGroupsRequest,  options).toPromise();
    }

    /**
     * Summary: Store group members Gdp Description: Store GDP groups. (This API is called from GDP only)
     * @param param the request object
     */
    public groupBuilderStoreGroupMembersGdpWithHttpInfo(param: GroupBuilderApiGroupBuilderStoreGroupMembersGdpRequest, options?: ConfigurationOptions): Promise<HttpInfo<Groupbuilderv3StoreGroupMembersGdpResponse>> {
        return this.api.groupBuilderStoreGroupMembersGdpWithHttpInfo(param.centralManagerId, param.groupbuilderv3StoreGroupMembersGdpRequest,  options).toPromise();
    }

    /**
     * Summary: Store group members Gdp Description: Store GDP groups. (This API is called from GDP only)
     * @param param the request object
     */
    public groupBuilderStoreGroupMembersGdp(param: GroupBuilderApiGroupBuilderStoreGroupMembersGdpRequest, options?: ConfigurationOptions): Promise<Groupbuilderv3StoreGroupMembersGdpResponse> {
        return this.api.groupBuilderStoreGroupMembersGdp(param.centralManagerId, param.groupbuilderv3StoreGroupMembersGdpRequest,  options).toPromise();
    }

    /**
     * Summary: Store groups Gdp Description: Store GDP groups. (This API is called from GDP only)
     * @param param the request object
     */
    public groupBuilderStoreGroupsGdpWithHttpInfo(param: GroupBuilderApiGroupBuilderStoreGroupsGdpRequest, options?: ConfigurationOptions): Promise<HttpInfo<Groupbuilderv3GetGroupsResponseGdp>> {
        return this.api.groupBuilderStoreGroupsGdpWithHttpInfo(param.centralManagerId, param.groupbuilderv3GetGroupsRequestGdp,  options).toPromise();
    }

    /**
     * Summary: Store groups Gdp Description: Store GDP groups. (This API is called from GDP only)
     * @param param the request object
     */
    public groupBuilderStoreGroupsGdp(param: GroupBuilderApiGroupBuilderStoreGroupsGdpRequest, options?: ConfigurationOptions): Promise<Groupbuilderv3GetGroupsResponseGdp> {
        return this.api.groupBuilderStoreGroupsGdp(param.centralManagerId, param.groupbuilderv3GetGroupsRequestGdp,  options).toPromise();
    }

}

import { ObservableGuardiumConnectorApi } from "./ObservableAPI";
import { GuardiumConnectorApiRequestFactory, GuardiumConnectorApiResponseProcessor} from "../apis/GuardiumConnectorApi";

export interface GuardiumConnectorApiGuardiumConnectorAddCMRequest {
    /**
     * 
     * @type Guardiumconnectorv3AddCMRequest
     * @memberof GuardiumConnectorApiguardiumConnectorAddCM
     */
    guardiumconnectorv3AddCMRequest: Guardiumconnectorv3AddCMRequest
}

export interface GuardiumConnectorApiGuardiumConnectorAddDatamartsRequest {
    /**
     * central manager
     * Defaults to: undefined
     * @type string
     * @memberof GuardiumConnectorApiguardiumConnectorAddDatamarts
     */
    centralManagerId: string
    /**
     * 
     * @type Guardiumconnectorv3AddDatamartsRequest
     * @memberof GuardiumConnectorApiguardiumConnectorAddDatamarts
     */
    guardiumconnectorv3AddDatamartsRequest: Guardiumconnectorv3AddDatamartsRequest
}

export interface GuardiumConnectorApiGuardiumConnectorAddDmExclusionRequest {
    /**
     * 
     * @type Guardiumconnectorv3AddDmExclusionRequest
     * @memberof GuardiumConnectorApiguardiumConnectorAddDmExclusion
     */
    guardiumconnectorv3AddDmExclusionRequest: Guardiumconnectorv3AddDmExclusionRequest
}

export interface GuardiumConnectorApiGuardiumConnectorAddTaskRequest {
    /**
     * ID of central manager.
     * Defaults to: undefined
     * @type string
     * @memberof GuardiumConnectorApiguardiumConnectorAddTask
     */
    centralManagerId: string
    /**
     * 
     * @type Guardiumconnectorv3AddTaskRequest
     * @memberof GuardiumConnectorApiguardiumConnectorAddTask
     */
    guardiumconnectorv3AddTaskRequest: Guardiumconnectorv3AddTaskRequest
}

export interface GuardiumConnectorApiGuardiumConnectorBlockUserRequest {
    /**
     * 
     * @type Guardiumconnectorv3BlockUserRequest
     * @memberof GuardiumConnectorApiguardiumConnectorBlockUser
     */
    guardiumconnectorv3BlockUserRequest: Guardiumconnectorv3BlockUserRequest
}

export interface GuardiumConnectorApiGuardiumConnectorConfigureAggregatorExportRequest {
    /**
     * Central Manager ID.
     * Defaults to: undefined
     * @type string
     * @memberof GuardiumConnectorApiguardiumConnectorConfigureAggregatorExport
     */
    centralManagerId: string
    /**
     * 
     * @type Guardiumconnectorv3ConfigureAggregatorExportRequest
     * @memberof GuardiumConnectorApiguardiumConnectorConfigureAggregatorExport
     */
    guardiumconnectorv3ConfigureAggregatorExportRequest: Guardiumconnectorv3ConfigureAggregatorExportRequest
}

export interface GuardiumConnectorApiGuardiumConnectorConfigureCollectorExportRequest {
    /**
     * Central Manager ID.
     * Defaults to: undefined
     * @type string
     * @memberof GuardiumConnectorApiguardiumConnectorConfigureCollectorExport
     */
    centralManagerId: string
    /**
     * 
     * @type Guardiumconnectorv3ConfigureCollectorExportRequest
     * @memberof GuardiumConnectorApiguardiumConnectorConfigureCollectorExport
     */
    guardiumconnectorv3ConfigureCollectorExportRequest: Guardiumconnectorv3ConfigureCollectorExportRequest
}

export interface GuardiumConnectorApiGuardiumConnectorConfigureStreamingRequest {
    /**
     * Central Manager ID.
     * Defaults to: undefined
     * @type string
     * @memberof GuardiumConnectorApiguardiumConnectorConfigureStreaming
     */
    centralManagerId: string
    /**
     * 
     * @type Guardiumconnectorv3ConfigureStreamingRequest
     * @memberof GuardiumConnectorApiguardiumConnectorConfigureStreaming
     */
    guardiumconnectorv3ConfigureStreamingRequest: Guardiumconnectorv3ConfigureStreamingRequest
}

export interface GuardiumConnectorApiGuardiumConnectorDatamartVersionCheckRequest {
    /**
     * Central manager
     * Defaults to: undefined
     * @type string
     * @memberof GuardiumConnectorApiguardiumConnectorDatamartVersionCheck
     */
    centralManagerId: string
    /**
     * 
     * @type Guardiumconnectorv3DatamartVersionRequest
     * @memberof GuardiumConnectorApiguardiumConnectorDatamartVersionCheck
     */
    guardiumconnectorv3DatamartVersionRequest: Guardiumconnectorv3DatamartVersionRequest
}

export interface GuardiumConnectorApiGuardiumConnectorDeleteCMRequest {
    /**
     * Central Manager ID.
     * Defaults to: undefined
     * @type string
     * @memberof GuardiumConnectorApiguardiumConnectorDeleteCM
     */
    centralManagerId: string
    /**
     * Flag to force delete CM and associated tasks (0&#x3D;validate CM is online before deleting, 1&#x3D;force delete CM).
     * Defaults to: undefined
     * @type number
     * @memberof GuardiumConnectorApiguardiumConnectorDeleteCM
     */
    force?: number
}

export interface GuardiumConnectorApiGuardiumConnectorDeleteDmExclusionRequest {
    /**
     * Datamart name.
     * Defaults to: undefined
     * @type string
     * @memberof GuardiumConnectorApiguardiumConnectorDeleteDmExclusion
     */
    datamart?: string
}

export interface GuardiumConnectorApiGuardiumConnectorDeleteTaskRequest {
    /**
     * ID of central manager.
     * Defaults to: undefined
     * @type string
     * @memberof GuardiumConnectorApiguardiumConnectorDeleteTask
     */
    centralManagerId: string
    /**
     * ID of task being deleted.
     * Defaults to: undefined
     * @type string
     * @memberof GuardiumConnectorApiguardiumConnectorDeleteTask
     */
    taskId: string
}

export interface GuardiumConnectorApiGuardiumConnectorDeleteTasksRequest {
    /**
     * ID of central manager.
     * Defaults to: undefined
     * @type string
     * @memberof GuardiumConnectorApiguardiumConnectorDeleteTasks
     */
    centralManagerId: string
}

export interface GuardiumConnectorApiGuardiumConnectorGetAggregatorsConfigRequest {
    /**
     * Central Manager ID.
     * Defaults to: undefined
     * @type string
     * @memberof GuardiumConnectorApiguardiumConnectorGetAggregatorsConfig
     */
    centralManagerId: string
}

export interface GuardiumConnectorApiGuardiumConnectorGetCMsRequest {
    /**
     * Retrieve the streaming status for all Managed Units that are reporting to a particular Central Manager.
     * Defaults to: undefined
     * @type boolean
     * @memberof GuardiumConnectorApiguardiumConnectorGetCMs
     */
    runAdditionalChecks?: boolean
}

export interface GuardiumConnectorApiGuardiumConnectorGetCMsConfigRequest {
}

export interface GuardiumConnectorApiGuardiumConnectorGetCollectorsConfigRequest {
    /**
     * Central Manager ID.
     * Defaults to: undefined
     * @type string
     * @memberof GuardiumConnectorApiguardiumConnectorGetCollectorsConfig
     */
    centralManagerId: string
}

export interface GuardiumConnectorApiGuardiumConnectorGetDatamartsRequest {
    /**
     * central manager hostname
     * Defaults to: undefined
     * @type string
     * @memberof GuardiumConnectorApiguardiumConnectorGetDatamarts
     */
    centralManagerId: string
}

export interface GuardiumConnectorApiGuardiumConnectorGetDmExclusionRequest {
}

export interface GuardiumConnectorApiGuardiumConnectorGetGdpPolicyInfoRequest {
    /**
     * Central manager hostname
     * Defaults to: undefined
     * @type string
     * @memberof GuardiumConnectorApiguardiumConnectorGetGdpPolicyInfo
     */
    centralManagerId: string
    /**
     * Policy name.
     * Defaults to: undefined
     * @type string
     * @memberof GuardiumConnectorApiguardiumConnectorGetGdpPolicyInfo
     */
    policyName?: string
}

export interface GuardiumConnectorApiGuardiumConnectorGetGdpPolicySummariesRequest {
    /**
     * Central manager hostname
     * Defaults to: undefined
     * @type string
     * @memberof GuardiumConnectorApiguardiumConnectorGetGdpPolicySummaries
     */
    centralManagerId: string
}

export interface GuardiumConnectorApiGuardiumConnectorGetHealthInfoRequest {
    /**
     * Central Manager ID.
     * Defaults to: undefined
     * @type string
     * @memberof GuardiumConnectorApiguardiumConnectorGetHealthInfo
     */
    centralManagerId: string
    /**
     * Flag indicating if the older GDP api is to be called in case it doesn\&#39;t support new api.
     * Defaults to: undefined
     * @type boolean
     * @memberof GuardiumConnectorApiguardiumConnectorGetHealthInfo
     */
    useFallback?: boolean
}

export interface GuardiumConnectorApiGuardiumConnectorGetLatestDMExtractionProfileRequest {
    /**
     * Central Manager ID.
     * Defaults to: undefined
     * @type string
     * @memberof GuardiumConnectorApiguardiumConnectorGetLatestDMExtractionProfile
     */
    centralManagerId: string
}

export interface GuardiumConnectorApiGuardiumConnectorGetStreamingStatusRequest {
    /**
     * Central Manager ID.
     * Defaults to: undefined
     * @type string
     * @memberof GuardiumConnectorApiguardiumConnectorGetStreamingStatus
     */
    centralManagerId: string
}

export interface GuardiumConnectorApiGuardiumConnectorGetSyncDMsRequest {
    /**
     * ID of central manager.
     * Defaults to: undefined
     * @type string
     * @memberof GuardiumConnectorApiguardiumConnectorGetSyncDMs
     */
    centralManagerId: string
}

export interface GuardiumConnectorApiGuardiumConnectorGetTaskTypesRequest {
}

export interface GuardiumConnectorApiGuardiumConnectorGetTasksRequest {
    /**
     * ID of central manager.
     * Defaults to: undefined
     * @type string
     * @memberof GuardiumConnectorApiguardiumConnectorGetTasks
     */
    centralManagerId: string
    /**
     * ID of task.
     * Defaults to: undefined
     * @type string
     * @memberof GuardiumConnectorApiguardiumConnectorGetTasks
     */
    taskId?: string
    /**
     * Type of task.
     * Defaults to: undefined
     * @type string
     * @memberof GuardiumConnectorApiguardiumConnectorGetTasks
     */
    taskType?: string
    /**
     * Key object.
     * Defaults to: undefined
     * @type string
     * @memberof GuardiumConnectorApiguardiumConnectorGetTasks
     */
    keyObject?: string
}

export interface GuardiumConnectorApiGuardiumConnectorRunGDPReportRequest {
    /**
     * Central Manager ID.
     * Defaults to: undefined
     * @type string
     * @memberof GuardiumConnectorApiguardiumConnectorRunGDPReport
     */
    centralManagerId: string
    /**
     * 
     * @type Guardiumconnectorv3RunGDPReportRequest
     * @memberof GuardiumConnectorApiguardiumConnectorRunGDPReport
     */
    guardiumconnectorv3RunGDPReportRequest: Guardiumconnectorv3RunGDPReportRequest
}

export interface GuardiumConnectorApiGuardiumConnectorSetupCMRequest {
    /**
     * 
     * @type Guardiumconnectorv3SetupCMRequest
     * @memberof GuardiumConnectorApiguardiumConnectorSetupCM
     */
    guardiumconnectorv3SetupCMRequest: Guardiumconnectorv3SetupCMRequest
}

export interface GuardiumConnectorApiGuardiumConnectorSetupDatamartsRequest {
    /**
     * central manager
     * Defaults to: undefined
     * @type string
     * @memberof GuardiumConnectorApiguardiumConnectorSetupDatamarts
     */
    centralManagerId: string
    /**
     * 
     * @type Guardiumconnectorv3SetupDatamartsRequest
     * @memberof GuardiumConnectorApiguardiumConnectorSetupDatamarts
     */
    guardiumconnectorv3SetupDatamartsRequest: Guardiumconnectorv3SetupDatamartsRequest
}

export interface GuardiumConnectorApiGuardiumConnectorTaskErrorRequest {
    /**
     * ID of central manager.
     * Defaults to: undefined
     * @type string
     * @memberof GuardiumConnectorApiguardiumConnectorTaskError
     */
    centralManagerId: string
    /**
     * 
     * @type Guardiumconnectorv3TaskErrorRequest
     * @memberof GuardiumConnectorApiguardiumConnectorTaskError
     */
    guardiumconnectorv3TaskErrorRequest: Guardiumconnectorv3TaskErrorRequest
}

export interface GuardiumConnectorApiGuardiumConnectorTestDatabaseConnectionRequest {
    /**
     * 
     * @type Guardiumconnectorv3DatabaseConnectionStringRequest
     * @memberof GuardiumConnectorApiguardiumConnectorTestDatabaseConnection
     */
    guardiumconnectorv3DatabaseConnectionStringRequest: Guardiumconnectorv3DatabaseConnectionStringRequest
}

export interface GuardiumConnectorApiGuardiumConnectorUpdateDmExclusionRequest {
    /**
     * 
     * @type Guardiumconnectorv3UpdateDmExclusionRequest
     * @memberof GuardiumConnectorApiguardiumConnectorUpdateDmExclusion
     */
    guardiumconnectorv3UpdateDmExclusionRequest: Guardiumconnectorv3UpdateDmExclusionRequest
}

export interface GuardiumConnectorApiGuardiumConnectorUpdateStreamingRequest {
    /**
     * ID of central manager.
     * Defaults to: undefined
     * @type string
     * @memberof GuardiumConnectorApiguardiumConnectorUpdateStreaming
     */
    centralManagerId: string
    /**
     * 
     * @type Guardiumconnectorv3UpdateStreamingRequest
     * @memberof GuardiumConnectorApiguardiumConnectorUpdateStreaming
     */
    guardiumconnectorv3UpdateStreamingRequest: Guardiumconnectorv3UpdateStreamingRequest
}

export interface GuardiumConnectorApiGuardiumConnectorUpdateTaskRequest {
    /**
     * ID of central manager.
     * Defaults to: undefined
     * @type string
     * @memberof GuardiumConnectorApiguardiumConnectorUpdateTask
     */
    centralManagerId: string
    /**
     * ID of task being updated.
     * Defaults to: undefined
     * @type string
     * @memberof GuardiumConnectorApiguardiumConnectorUpdateTask
     */
    taskId: string
    /**
     * 
     * @type Guardiumconnectorv3UpdateTaskRequest
     * @memberof GuardiumConnectorApiguardiumConnectorUpdateTask
     */
    guardiumconnectorv3UpdateTaskRequest: Guardiumconnectorv3UpdateTaskRequest
}

export class ObjectGuardiumConnectorApi {
    private api: ObservableGuardiumConnectorApi

    public constructor(configuration: Configuration, requestFactory?: GuardiumConnectorApiRequestFactory, responseProcessor?: GuardiumConnectorApiResponseProcessor) {
        this.api = new ObservableGuardiumConnectorApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Summary: Add CM Description: Add a Central Manager to the tenant database.
     * @param param the request object
     */
    public guardiumConnectorAddCMWithHttpInfo(param: GuardiumConnectorApiGuardiumConnectorAddCMRequest, options?: ConfigurationOptions): Promise<HttpInfo<Guardiumconnectorv3AddCMResponse>> {
        return this.api.guardiumConnectorAddCMWithHttpInfo(param.guardiumconnectorv3AddCMRequest,  options).toPromise();
    }

    /**
     * Summary: Add CM Description: Add a Central Manager to the tenant database.
     * @param param the request object
     */
    public guardiumConnectorAddCM(param: GuardiumConnectorApiGuardiumConnectorAddCMRequest, options?: ConfigurationOptions): Promise<Guardiumconnectorv3AddCMResponse> {
        return this.api.guardiumConnectorAddCM(param.guardiumconnectorv3AddCMRequest,  options).toPromise();
    }

    /**
     * Description: stores datamarts details from GDP. (This API is called from GDP only)
     * @param param the request object
     */
    public guardiumConnectorAddDatamartsWithHttpInfo(param: GuardiumConnectorApiGuardiumConnectorAddDatamartsRequest, options?: ConfigurationOptions): Promise<HttpInfo<Guardiumconnectorv3AddDatamartsResponse>> {
        return this.api.guardiumConnectorAddDatamartsWithHttpInfo(param.centralManagerId, param.guardiumconnectorv3AddDatamartsRequest,  options).toPromise();
    }

    /**
     * Description: stores datamarts details from GDP. (This API is called from GDP only)
     * @param param the request object
     */
    public guardiumConnectorAddDatamarts(param: GuardiumConnectorApiGuardiumConnectorAddDatamartsRequest, options?: ConfigurationOptions): Promise<Guardiumconnectorv3AddDatamartsResponse> {
        return this.api.guardiumConnectorAddDatamarts(param.centralManagerId, param.guardiumconnectorv3AddDatamartsRequest,  options).toPromise();
    }

    /**
     * Summary: Add DM exclusion Description: Add datamart to exclusion list.
     * @param param the request object
     */
    public guardiumConnectorAddDmExclusionWithHttpInfo(param: GuardiumConnectorApiGuardiumConnectorAddDmExclusionRequest, options?: ConfigurationOptions): Promise<HttpInfo<Guardiumconnectorv3AddDmExclusionResponse>> {
        return this.api.guardiumConnectorAddDmExclusionWithHttpInfo(param.guardiumconnectorv3AddDmExclusionRequest,  options).toPromise();
    }

    /**
     * Summary: Add DM exclusion Description: Add datamart to exclusion list.
     * @param param the request object
     */
    public guardiumConnectorAddDmExclusion(param: GuardiumConnectorApiGuardiumConnectorAddDmExclusionRequest, options?: ConfigurationOptions): Promise<Guardiumconnectorv3AddDmExclusionResponse> {
        return this.api.guardiumConnectorAddDmExclusion(param.guardiumconnectorv3AddDmExclusionRequest,  options).toPromise();
    }

    /**
     * Summary: Add task Description: Add a task to be executed on GDP. (This API is called from GDP only)
     * @param param the request object
     */
    public guardiumConnectorAddTaskWithHttpInfo(param: GuardiumConnectorApiGuardiumConnectorAddTaskRequest, options?: ConfigurationOptions): Promise<HttpInfo<Guardiumconnectorv3AddTaskResponse>> {
        return this.api.guardiumConnectorAddTaskWithHttpInfo(param.centralManagerId, param.guardiumconnectorv3AddTaskRequest,  options).toPromise();
    }

    /**
     * Summary: Add task Description: Add a task to be executed on GDP. (This API is called from GDP only)
     * @param param the request object
     */
    public guardiumConnectorAddTask(param: GuardiumConnectorApiGuardiumConnectorAddTaskRequest, options?: ConfigurationOptions): Promise<Guardiumconnectorv3AddTaskResponse> {
        return this.api.guardiumConnectorAddTask(param.centralManagerId, param.guardiumconnectorv3AddTaskRequest,  options).toPromise();
    }

    /**
     * Summary: Block user Description: Block a database user on Guardium Data Protection or on a supported Database as a Service instance.
     * @param param the request object
     */
    public guardiumConnectorBlockUserWithHttpInfo(param: GuardiumConnectorApiGuardiumConnectorBlockUserRequest, options?: ConfigurationOptions): Promise<HttpInfo<Guardiumconnectorv3BlockUserResponse>> {
        return this.api.guardiumConnectorBlockUserWithHttpInfo(param.guardiumconnectorv3BlockUserRequest,  options).toPromise();
    }

    /**
     * Summary: Block user Description: Block a database user on Guardium Data Protection or on a supported Database as a Service instance.
     * @param param the request object
     */
    public guardiumConnectorBlockUser(param: GuardiumConnectorApiGuardiumConnectorBlockUserRequest, options?: ConfigurationOptions): Promise<Guardiumconnectorv3BlockUserResponse> {
        return this.api.guardiumConnectorBlockUser(param.guardiumconnectorv3BlockUserRequest,  options).toPromise();
    }

    /**
     * Summary: Configure aggregator export Description: Configure datamart export from the Aggregators to GI.
     * @param param the request object
     */
    public guardiumConnectorConfigureAggregatorExportWithHttpInfo(param: GuardiumConnectorApiGuardiumConnectorConfigureAggregatorExportRequest, options?: ConfigurationOptions): Promise<HttpInfo<Guardiumconnectorv3ConfigureAggregatorExportResponse>> {
        return this.api.guardiumConnectorConfigureAggregatorExportWithHttpInfo(param.centralManagerId, param.guardiumconnectorv3ConfigureAggregatorExportRequest,  options).toPromise();
    }

    /**
     * Summary: Configure aggregator export Description: Configure datamart export from the Aggregators to GI.
     * @param param the request object
     */
    public guardiumConnectorConfigureAggregatorExport(param: GuardiumConnectorApiGuardiumConnectorConfigureAggregatorExportRequest, options?: ConfigurationOptions): Promise<Guardiumconnectorv3ConfigureAggregatorExportResponse> {
        return this.api.guardiumConnectorConfigureAggregatorExport(param.centralManagerId, param.guardiumconnectorv3ConfigureAggregatorExportRequest,  options).toPromise();
    }

    /**
     * Summary: Configure collector export Description: Schedule export historical data for collectors.
     * @param param the request object
     */
    public guardiumConnectorConfigureCollectorExportWithHttpInfo(param: GuardiumConnectorApiGuardiumConnectorConfigureCollectorExportRequest, options?: ConfigurationOptions): Promise<HttpInfo<Guardiumconnectorv3ConfigureCollectorExportResponse>> {
        return this.api.guardiumConnectorConfigureCollectorExportWithHttpInfo(param.centralManagerId, param.guardiumconnectorv3ConfigureCollectorExportRequest,  options).toPromise();
    }

    /**
     * Summary: Configure collector export Description: Schedule export historical data for collectors.
     * @param param the request object
     */
    public guardiumConnectorConfigureCollectorExport(param: GuardiumConnectorApiGuardiumConnectorConfigureCollectorExportRequest, options?: ConfigurationOptions): Promise<Guardiumconnectorv3ConfigureCollectorExportResponse> {
        return this.api.guardiumConnectorConfigureCollectorExport(param.centralManagerId, param.guardiumconnectorv3ConfigureCollectorExportRequest,  options).toPromise();
    }

    /**
     * Summary: Configure streaming Description: Enable or disable streaming.
     * @param param the request object
     */
    public guardiumConnectorConfigureStreamingWithHttpInfo(param: GuardiumConnectorApiGuardiumConnectorConfigureStreamingRequest, options?: ConfigurationOptions): Promise<HttpInfo<Guardiumconnectorv3ConfigureStreamingResponse>> {
        return this.api.guardiumConnectorConfigureStreamingWithHttpInfo(param.centralManagerId, param.guardiumconnectorv3ConfigureStreamingRequest,  options).toPromise();
    }

    /**
     * Summary: Configure streaming Description: Enable or disable streaming.
     * @param param the request object
     */
    public guardiumConnectorConfigureStreaming(param: GuardiumConnectorApiGuardiumConnectorConfigureStreamingRequest, options?: ConfigurationOptions): Promise<Guardiumconnectorv3ConfigureStreamingResponse> {
        return this.api.guardiumConnectorConfigureStreaming(param.centralManagerId, param.guardiumconnectorv3ConfigureStreamingRequest,  options).toPromise();
    }

    /**
     * Description: validates if central manager has v5 datamart support. (This API is called from GDP only)
     * @param param the request object
     */
    public guardiumConnectorDatamartVersionCheckWithHttpInfo(param: GuardiumConnectorApiGuardiumConnectorDatamartVersionCheckRequest, options?: ConfigurationOptions): Promise<HttpInfo<Guardiumconnectorv3DatamartVersionResponse>> {
        return this.api.guardiumConnectorDatamartVersionCheckWithHttpInfo(param.centralManagerId, param.guardiumconnectorv3DatamartVersionRequest,  options).toPromise();
    }

    /**
     * Description: validates if central manager has v5 datamart support. (This API is called from GDP only)
     * @param param the request object
     */
    public guardiumConnectorDatamartVersionCheck(param: GuardiumConnectorApiGuardiumConnectorDatamartVersionCheckRequest, options?: ConfigurationOptions): Promise<Guardiumconnectorv3DatamartVersionResponse> {
        return this.api.guardiumConnectorDatamartVersionCheck(param.centralManagerId, param.guardiumconnectorv3DatamartVersionRequest,  options).toPromise();
    }

    /**
     * Summary: Delete CM Description: Delete a Central Manager by ID (Name, Hostname or IP).
     * @param param the request object
     */
    public guardiumConnectorDeleteCMWithHttpInfo(param: GuardiumConnectorApiGuardiumConnectorDeleteCMRequest, options?: ConfigurationOptions): Promise<HttpInfo<Guardiumconnectorv3DeleteCMResponse>> {
        return this.api.guardiumConnectorDeleteCMWithHttpInfo(param.centralManagerId, param.force,  options).toPromise();
    }

    /**
     * Summary: Delete CM Description: Delete a Central Manager by ID (Name, Hostname or IP).
     * @param param the request object
     */
    public guardiumConnectorDeleteCM(param: GuardiumConnectorApiGuardiumConnectorDeleteCMRequest, options?: ConfigurationOptions): Promise<Guardiumconnectorv3DeleteCMResponse> {
        return this.api.guardiumConnectorDeleteCM(param.centralManagerId, param.force,  options).toPromise();
    }

    /**
     * Summary: Delete DM exclusion Description: Delete a datamart from exclusion list.
     * @param param the request object
     */
    public guardiumConnectorDeleteDmExclusionWithHttpInfo(param: GuardiumConnectorApiGuardiumConnectorDeleteDmExclusionRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Guardiumconnectorv3DeleteDmExclusionResponse>> {
        return this.api.guardiumConnectorDeleteDmExclusionWithHttpInfo(param.datamart,  options).toPromise();
    }

    /**
     * Summary: Delete DM exclusion Description: Delete a datamart from exclusion list.
     * @param param the request object
     */
    public guardiumConnectorDeleteDmExclusion(param: GuardiumConnectorApiGuardiumConnectorDeleteDmExclusionRequest = {}, options?: ConfigurationOptions): Promise<Guardiumconnectorv3DeleteDmExclusionResponse> {
        return this.api.guardiumConnectorDeleteDmExclusion(param.datamart,  options).toPromise();
    }

    /**
     * Summary: Delete task Description: Delete a task by central manager id and task id. (This API is called from GDP only)
     * @param param the request object
     */
    public guardiumConnectorDeleteTaskWithHttpInfo(param: GuardiumConnectorApiGuardiumConnectorDeleteTaskRequest, options?: ConfigurationOptions): Promise<HttpInfo<Guardiumconnectorv3DeleteTaskResponse>> {
        return this.api.guardiumConnectorDeleteTaskWithHttpInfo(param.centralManagerId, param.taskId,  options).toPromise();
    }

    /**
     * Summary: Delete task Description: Delete a task by central manager id and task id. (This API is called from GDP only)
     * @param param the request object
     */
    public guardiumConnectorDeleteTask(param: GuardiumConnectorApiGuardiumConnectorDeleteTaskRequest, options?: ConfigurationOptions): Promise<Guardiumconnectorv3DeleteTaskResponse> {
        return this.api.guardiumConnectorDeleteTask(param.centralManagerId, param.taskId,  options).toPromise();
    }

    /**
     * Summary: Delete tasks Description: Delete a central manager\'s tasks by central manager id. (This API is called from GDP only)
     * @param param the request object
     */
    public guardiumConnectorDeleteTasksWithHttpInfo(param: GuardiumConnectorApiGuardiumConnectorDeleteTasksRequest, options?: ConfigurationOptions): Promise<HttpInfo<Guardiumconnectorv3DeleteTasksResponse>> {
        return this.api.guardiumConnectorDeleteTasksWithHttpInfo(param.centralManagerId,  options).toPromise();
    }

    /**
     * Summary: Delete tasks Description: Delete a central manager\'s tasks by central manager id. (This API is called from GDP only)
     * @param param the request object
     */
    public guardiumConnectorDeleteTasks(param: GuardiumConnectorApiGuardiumConnectorDeleteTasksRequest, options?: ConfigurationOptions): Promise<Guardiumconnectorv3DeleteTasksResponse> {
        return this.api.guardiumConnectorDeleteTasks(param.centralManagerId,  options).toPromise();
    }

    /**
     * Summary: Get aggregators config Description: Return a list of managed units from the config collection in tenant database.
     * @param param the request object
     */
    public guardiumConnectorGetAggregatorsConfigWithHttpInfo(param: GuardiumConnectorApiGuardiumConnectorGetAggregatorsConfigRequest, options?: ConfigurationOptions): Promise<HttpInfo<Guardiumconnectorv3GetAggregatorsConfigResponse>> {
        return this.api.guardiumConnectorGetAggregatorsConfigWithHttpInfo(param.centralManagerId,  options).toPromise();
    }

    /**
     * Summary: Get aggregators config Description: Return a list of managed units from the config collection in tenant database.
     * @param param the request object
     */
    public guardiumConnectorGetAggregatorsConfig(param: GuardiumConnectorApiGuardiumConnectorGetAggregatorsConfigRequest, options?: ConfigurationOptions): Promise<Guardiumconnectorv3GetAggregatorsConfigResponse> {
        return this.api.guardiumConnectorGetAggregatorsConfig(param.centralManagerId,  options).toPromise();
    }

    /**
     * Summary: Get CMs Description: Return a list of Central Managers from the tenant database with additional processing.
     * @param param the request object
     */
    public guardiumConnectorGetCMsWithHttpInfo(param: GuardiumConnectorApiGuardiumConnectorGetCMsRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Guardiumconnectorv3GetCMsResponse>> {
        return this.api.guardiumConnectorGetCMsWithHttpInfo(param.runAdditionalChecks,  options).toPromise();
    }

    /**
     * Summary: Get CMs Description: Return a list of Central Managers from the tenant database with additional processing.
     * @param param the request object
     */
    public guardiumConnectorGetCMs(param: GuardiumConnectorApiGuardiumConnectorGetCMsRequest = {}, options?: ConfigurationOptions): Promise<Guardiumconnectorv3GetCMsResponse> {
        return this.api.guardiumConnectorGetCMs(param.runAdditionalChecks,  options).toPromise();
    }

    /**
     * Summary: Get CMs config Description: Return a list of Central Managers from the tenant database.
     * @param param the request object
     */
    public guardiumConnectorGetCMsConfigWithHttpInfo(param: GuardiumConnectorApiGuardiumConnectorGetCMsConfigRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Guardiumconnectorv3GetCMsConfigResponse>> {
        return this.api.guardiumConnectorGetCMsConfigWithHttpInfo( options).toPromise();
    }

    /**
     * Summary: Get CMs config Description: Return a list of Central Managers from the tenant database.
     * @param param the request object
     */
    public guardiumConnectorGetCMsConfig(param: GuardiumConnectorApiGuardiumConnectorGetCMsConfigRequest = {}, options?: ConfigurationOptions): Promise<Guardiumconnectorv3GetCMsConfigResponse> {
        return this.api.guardiumConnectorGetCMsConfig( options).toPromise();
    }

    /**
     * Summary: Get collectors config Description: Return the list of collectors configuration from the tenant database.
     * @param param the request object
     */
    public guardiumConnectorGetCollectorsConfigWithHttpInfo(param: GuardiumConnectorApiGuardiumConnectorGetCollectorsConfigRequest, options?: ConfigurationOptions): Promise<HttpInfo<Guardiumconnectorv3GetCollectorsConfigResponse>> {
        return this.api.guardiumConnectorGetCollectorsConfigWithHttpInfo(param.centralManagerId,  options).toPromise();
    }

    /**
     * Summary: Get collectors config Description: Return the list of collectors configuration from the tenant database.
     * @param param the request object
     */
    public guardiumConnectorGetCollectorsConfig(param: GuardiumConnectorApiGuardiumConnectorGetCollectorsConfigRequest, options?: ConfigurationOptions): Promise<Guardiumconnectorv3GetCollectorsConfigResponse> {
        return this.api.guardiumConnectorGetCollectorsConfig(param.centralManagerId,  options).toPromise();
    }

    /**
     * Description: returns full list of supported datamarts including type (historical or non-historical)
     * @param param the request object
     */
    public guardiumConnectorGetDatamartsWithHttpInfo(param: GuardiumConnectorApiGuardiumConnectorGetDatamartsRequest, options?: ConfigurationOptions): Promise<HttpInfo<Guardiumconnectorv3GetDatamartsResponse>> {
        return this.api.guardiumConnectorGetDatamartsWithHttpInfo(param.centralManagerId,  options).toPromise();
    }

    /**
     * Description: returns full list of supported datamarts including type (historical or non-historical)
     * @param param the request object
     */
    public guardiumConnectorGetDatamarts(param: GuardiumConnectorApiGuardiumConnectorGetDatamartsRequest, options?: ConfigurationOptions): Promise<Guardiumconnectorv3GetDatamartsResponse> {
        return this.api.guardiumConnectorGetDatamarts(param.centralManagerId,  options).toPromise();
    }

    /**
     * Summary: Get DM exclusion Description: Return datamarts in the exclusion list.
     * @param param the request object
     */
    public guardiumConnectorGetDmExclusionWithHttpInfo(param: GuardiumConnectorApiGuardiumConnectorGetDmExclusionRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Guardiumconnectorv3GetDmExclusionResponse>> {
        return this.api.guardiumConnectorGetDmExclusionWithHttpInfo( options).toPromise();
    }

    /**
     * Summary: Get DM exclusion Description: Return datamarts in the exclusion list.
     * @param param the request object
     */
    public guardiumConnectorGetDmExclusion(param: GuardiumConnectorApiGuardiumConnectorGetDmExclusionRequest = {}, options?: ConfigurationOptions): Promise<Guardiumconnectorv3GetDmExclusionResponse> {
        return this.api.guardiumConnectorGetDmExclusion( options).toPromise();
    }

    /**
     * Summary: Get guardium policy definition Description: returns the policy definition on the cm
     * @param param the request object
     */
    public guardiumConnectorGetGdpPolicyInfoWithHttpInfo(param: GuardiumConnectorApiGuardiumConnectorGetGdpPolicyInfoRequest, options?: ConfigurationOptions): Promise<HttpInfo<Guardiumconnectorv3GetPolicyInfoResponse>> {
        return this.api.guardiumConnectorGetGdpPolicyInfoWithHttpInfo(param.centralManagerId, param.policyName,  options).toPromise();
    }

    /**
     * Summary: Get guardium policy definition Description: returns the policy definition on the cm
     * @param param the request object
     */
    public guardiumConnectorGetGdpPolicyInfo(param: GuardiumConnectorApiGuardiumConnectorGetGdpPolicyInfoRequest, options?: ConfigurationOptions): Promise<Guardiumconnectorv3GetPolicyInfoResponse> {
        return this.api.guardiumConnectorGetGdpPolicyInfo(param.centralManagerId, param.policyName,  options).toPromise();
    }

    /**
     * Summary: Get guardium policy summary Description: returns the summaries of all policies on that central manager
     * @param param the request object
     */
    public guardiumConnectorGetGdpPolicySummariesWithHttpInfo(param: GuardiumConnectorApiGuardiumConnectorGetGdpPolicySummariesRequest, options?: ConfigurationOptions): Promise<HttpInfo<Guardiumconnectorv3GetPolicySummariesResponse>> {
        return this.api.guardiumConnectorGetGdpPolicySummariesWithHttpInfo(param.centralManagerId,  options).toPromise();
    }

    /**
     * Summary: Get guardium policy summary Description: returns the summaries of all policies on that central manager
     * @param param the request object
     */
    public guardiumConnectorGetGdpPolicySummaries(param: GuardiumConnectorApiGuardiumConnectorGetGdpPolicySummariesRequest, options?: ConfigurationOptions): Promise<Guardiumconnectorv3GetPolicySummariesResponse> {
        return this.api.guardiumConnectorGetGdpPolicySummaries(param.centralManagerId,  options).toPromise();
    }

    /**
     * Summary: Get health info Description: Get health information from Guardium Data Protection central mamangers. (This API is for CMs registered in legacy pull mode. Supported on-premises only)
     * @param param the request object
     */
    public guardiumConnectorGetHealthInfoWithHttpInfo(param: GuardiumConnectorApiGuardiumConnectorGetHealthInfoRequest, options?: ConfigurationOptions): Promise<HttpInfo<Guardiumconnectorv3GetHealthInfoResponse>> {
        return this.api.guardiumConnectorGetHealthInfoWithHttpInfo(param.centralManagerId, param.useFallback,  options).toPromise();
    }

    /**
     * Summary: Get health info Description: Get health information from Guardium Data Protection central mamangers. (This API is for CMs registered in legacy pull mode. Supported on-premises only)
     * @param param the request object
     */
    public guardiumConnectorGetHealthInfo(param: GuardiumConnectorApiGuardiumConnectorGetHealthInfoRequest, options?: ConfigurationOptions): Promise<Guardiumconnectorv3GetHealthInfoResponse> {
        return this.api.guardiumConnectorGetHealthInfo(param.centralManagerId, param.useFallback,  options).toPromise();
    }

    /**
     * Summary: Get latest DM extraction profile Description: Return the Datamart Extraction Profile for GDSC.
     * @param param the request object
     */
    public guardiumConnectorGetLatestDMExtractionProfileWithHttpInfo(param: GuardiumConnectorApiGuardiumConnectorGetLatestDMExtractionProfileRequest, options?: ConfigurationOptions): Promise<HttpInfo<Guardiumconnectorv3GetLatestDMExtractionProfileResponse>> {
        return this.api.guardiumConnectorGetLatestDMExtractionProfileWithHttpInfo(param.centralManagerId,  options).toPromise();
    }

    /**
     * Summary: Get latest DM extraction profile Description: Return the Datamart Extraction Profile for GDSC.
     * @param param the request object
     */
    public guardiumConnectorGetLatestDMExtractionProfile(param: GuardiumConnectorApiGuardiumConnectorGetLatestDMExtractionProfileRequest, options?: ConfigurationOptions): Promise<Guardiumconnectorv3GetLatestDMExtractionProfileResponse> {
        return this.api.guardiumConnectorGetLatestDMExtractionProfile(param.centralManagerId,  options).toPromise();
    }

    /**
     * Summary: Get streaming status Description: Return the streaming configuration.
     * @param param the request object
     */
    public guardiumConnectorGetStreamingStatusWithHttpInfo(param: GuardiumConnectorApiGuardiumConnectorGetStreamingStatusRequest, options?: ConfigurationOptions): Promise<HttpInfo<Guardiumconnectorv3GetStreamingStatusResponse>> {
        return this.api.guardiumConnectorGetStreamingStatusWithHttpInfo(param.centralManagerId,  options).toPromise();
    }

    /**
     * Summary: Get streaming status Description: Return the streaming configuration.
     * @param param the request object
     */
    public guardiumConnectorGetStreamingStatus(param: GuardiumConnectorApiGuardiumConnectorGetStreamingStatusRequest, options?: ConfigurationOptions): Promise<Guardiumconnectorv3GetStreamingStatusResponse> {
        return this.api.guardiumConnectorGetStreamingStatus(param.centralManagerId,  options).toPromise();
    }

    /**
     * Summary: Get sync DMs Description: Return the list of tasks from a central manager. (This API is called from GDP only)
     * @param param the request object
     */
    public guardiumConnectorGetSyncDMsWithHttpInfo(param: GuardiumConnectorApiGuardiumConnectorGetSyncDMsRequest, options?: ConfigurationOptions): Promise<HttpInfo<Guardiumconnectorv3GetSyncDMsResponse>> {
        return this.api.guardiumConnectorGetSyncDMsWithHttpInfo(param.centralManagerId,  options).toPromise();
    }

    /**
     * Summary: Get sync DMs Description: Return the list of tasks from a central manager. (This API is called from GDP only)
     * @param param the request object
     */
    public guardiumConnectorGetSyncDMs(param: GuardiumConnectorApiGuardiumConnectorGetSyncDMsRequest, options?: ConfigurationOptions): Promise<Guardiumconnectorv3GetSyncDMsResponse> {
        return this.api.guardiumConnectorGetSyncDMs(param.centralManagerId,  options).toPromise();
    }

    /**
     * Summary: Get task types Description: Return the list of supported task types.
     * @param param the request object
     */
    public guardiumConnectorGetTaskTypesWithHttpInfo(param: GuardiumConnectorApiGuardiumConnectorGetTaskTypesRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Guardiumconnectorv3GetTaskTypesResponse>> {
        return this.api.guardiumConnectorGetTaskTypesWithHttpInfo( options).toPromise();
    }

    /**
     * Summary: Get task types Description: Return the list of supported task types.
     * @param param the request object
     */
    public guardiumConnectorGetTaskTypes(param: GuardiumConnectorApiGuardiumConnectorGetTaskTypesRequest = {}, options?: ConfigurationOptions): Promise<Guardiumconnectorv3GetTaskTypesResponse> {
        return this.api.guardiumConnectorGetTaskTypes( options).toPromise();
    }

    /**
     * Summary: Get tasks Description: Return the list of tasks from a central manager. (This API is called from GDP only)
     * @param param the request object
     */
    public guardiumConnectorGetTasksWithHttpInfo(param: GuardiumConnectorApiGuardiumConnectorGetTasksRequest, options?: ConfigurationOptions): Promise<HttpInfo<Guardiumconnectorv3GetTasksResponse>> {
        return this.api.guardiumConnectorGetTasksWithHttpInfo(param.centralManagerId, param.taskId, param.taskType, param.keyObject,  options).toPromise();
    }

    /**
     * Summary: Get tasks Description: Return the list of tasks from a central manager. (This API is called from GDP only)
     * @param param the request object
     */
    public guardiumConnectorGetTasks(param: GuardiumConnectorApiGuardiumConnectorGetTasksRequest, options?: ConfigurationOptions): Promise<Guardiumconnectorv3GetTasksResponse> {
        return this.api.guardiumConnectorGetTasks(param.centralManagerId, param.taskId, param.taskType, param.keyObject,  options).toPromise();
    }

    /**
     * Summary: Run GDP report Description: Run GDP report. (This API is for CMs registered in legacy pull mode. Supported on-premises only)
     * @param param the request object
     */
    public guardiumConnectorRunGDPReportWithHttpInfo(param: GuardiumConnectorApiGuardiumConnectorRunGDPReportRequest, options?: ConfigurationOptions): Promise<HttpInfo<Guardiumconnectorv3RunGDPReportResponse>> {
        return this.api.guardiumConnectorRunGDPReportWithHttpInfo(param.centralManagerId, param.guardiumconnectorv3RunGDPReportRequest,  options).toPromise();
    }

    /**
     * Summary: Run GDP report Description: Run GDP report. (This API is for CMs registered in legacy pull mode. Supported on-premises only)
     * @param param the request object
     */
    public guardiumConnectorRunGDPReport(param: GuardiumConnectorApiGuardiumConnectorRunGDPReportRequest, options?: ConfigurationOptions): Promise<Guardiumconnectorv3RunGDPReportResponse> {
        return this.api.guardiumConnectorRunGDPReport(param.centralManagerId, param.guardiumconnectorv3RunGDPReportRequest,  options).toPromise();
    }

    /**
     * Summary: Setup CM Description: Set up the registration between a GDP Central manager and GDSC. (This API is called from GDP only)
     * @param param the request object
     */
    public guardiumConnectorSetupCMWithHttpInfo(param: GuardiumConnectorApiGuardiumConnectorSetupCMRequest, options?: ConfigurationOptions): Promise<HttpInfo<Guardiumconnectorv3SetupCMResponse>> {
        return this.api.guardiumConnectorSetupCMWithHttpInfo(param.guardiumconnectorv3SetupCMRequest,  options).toPromise();
    }

    /**
     * Summary: Setup CM Description: Set up the registration between a GDP Central manager and GDSC. (This API is called from GDP only)
     * @param param the request object
     */
    public guardiumConnectorSetupCM(param: GuardiumConnectorApiGuardiumConnectorSetupCMRequest, options?: ConfigurationOptions): Promise<Guardiumconnectorv3SetupCMResponse> {
        return this.api.guardiumConnectorSetupCM(param.guardiumconnectorv3SetupCMRequest,  options).toPromise();
    }

    /**
     * Description: setup custom datamart execution mode
     * @param param the request object
     */
    public guardiumConnectorSetupDatamartsWithHttpInfo(param: GuardiumConnectorApiGuardiumConnectorSetupDatamartsRequest, options?: ConfigurationOptions): Promise<HttpInfo<Guardiumconnectorv3SetupDatamartsResponse>> {
        return this.api.guardiumConnectorSetupDatamartsWithHttpInfo(param.centralManagerId, param.guardiumconnectorv3SetupDatamartsRequest,  options).toPromise();
    }

    /**
     * Description: setup custom datamart execution mode
     * @param param the request object
     */
    public guardiumConnectorSetupDatamarts(param: GuardiumConnectorApiGuardiumConnectorSetupDatamartsRequest, options?: ConfigurationOptions): Promise<Guardiumconnectorv3SetupDatamartsResponse> {
        return this.api.guardiumConnectorSetupDatamarts(param.centralManagerId, param.guardiumconnectorv3SetupDatamartsRequest,  options).toPromise();
    }

    /**
     * Summary: Task error Description: Log error messages from GDP task execution. (This API is called from GDP only)
     * @param param the request object
     */
    public guardiumConnectorTaskErrorWithHttpInfo(param: GuardiumConnectorApiGuardiumConnectorTaskErrorRequest, options?: ConfigurationOptions): Promise<HttpInfo<Guardiumconnectorv3TaskErrorResponse>> {
        return this.api.guardiumConnectorTaskErrorWithHttpInfo(param.centralManagerId, param.guardiumconnectorv3TaskErrorRequest,  options).toPromise();
    }

    /**
     * Summary: Task error Description: Log error messages from GDP task execution. (This API is called from GDP only)
     * @param param the request object
     */
    public guardiumConnectorTaskError(param: GuardiumConnectorApiGuardiumConnectorTaskErrorRequest, options?: ConfigurationOptions): Promise<Guardiumconnectorv3TaskErrorResponse> {
        return this.api.guardiumConnectorTaskError(param.centralManagerId, param.guardiumconnectorv3TaskErrorRequest,  options).toPromise();
    }

    /**
     * Summary: Test database connection Description: Return database connection results.
     * @param param the request object
     */
    public guardiumConnectorTestDatabaseConnectionWithHttpInfo(param: GuardiumConnectorApiGuardiumConnectorTestDatabaseConnectionRequest, options?: ConfigurationOptions): Promise<HttpInfo<Guardiumconnectorv3DatabaseResultResponse>> {
        return this.api.guardiumConnectorTestDatabaseConnectionWithHttpInfo(param.guardiumconnectorv3DatabaseConnectionStringRequest,  options).toPromise();
    }

    /**
     * Summary: Test database connection Description: Return database connection results.
     * @param param the request object
     */
    public guardiumConnectorTestDatabaseConnection(param: GuardiumConnectorApiGuardiumConnectorTestDatabaseConnectionRequest, options?: ConfigurationOptions): Promise<Guardiumconnectorv3DatabaseResultResponse> {
        return this.api.guardiumConnectorTestDatabaseConnection(param.guardiumconnectorv3DatabaseConnectionStringRequest,  options).toPromise();
    }

    /**
     * Summary: Update DM exclusion Description: Update the atamart exclusion list.
     * @param param the request object
     */
    public guardiumConnectorUpdateDmExclusionWithHttpInfo(param: GuardiumConnectorApiGuardiumConnectorUpdateDmExclusionRequest, options?: ConfigurationOptions): Promise<HttpInfo<Guardiumconnectorv3UpdateDmExclusionResponse>> {
        return this.api.guardiumConnectorUpdateDmExclusionWithHttpInfo(param.guardiumconnectorv3UpdateDmExclusionRequest,  options).toPromise();
    }

    /**
     * Summary: Update DM exclusion Description: Update the atamart exclusion list.
     * @param param the request object
     */
    public guardiumConnectorUpdateDmExclusion(param: GuardiumConnectorApiGuardiumConnectorUpdateDmExclusionRequest, options?: ConfigurationOptions): Promise<Guardiumconnectorv3UpdateDmExclusionResponse> {
        return this.api.guardiumConnectorUpdateDmExclusion(param.guardiumconnectorv3UpdateDmExclusionRequest,  options).toPromise();
    }

    /**
     * Summary: Update streaming Description: Update streaming status into GI. (This API is called from GDP only)
     * @param param the request object
     */
    public guardiumConnectorUpdateStreamingWithHttpInfo(param: GuardiumConnectorApiGuardiumConnectorUpdateStreamingRequest, options?: ConfigurationOptions): Promise<HttpInfo<Guardiumconnectorv3UpdateStreamingResponse>> {
        return this.api.guardiumConnectorUpdateStreamingWithHttpInfo(param.centralManagerId, param.guardiumconnectorv3UpdateStreamingRequest,  options).toPromise();
    }

    /**
     * Summary: Update streaming Description: Update streaming status into GI. (This API is called from GDP only)
     * @param param the request object
     */
    public guardiumConnectorUpdateStreaming(param: GuardiumConnectorApiGuardiumConnectorUpdateStreamingRequest, options?: ConfigurationOptions): Promise<Guardiumconnectorv3UpdateStreamingResponse> {
        return this.api.guardiumConnectorUpdateStreaming(param.centralManagerId, param.guardiumconnectorv3UpdateStreamingRequest,  options).toPromise();
    }

    /**
     * Summary: Update task Description: Update a task that gets executed on GDP. (This API is called from GDP only)
     * @param param the request object
     */
    public guardiumConnectorUpdateTaskWithHttpInfo(param: GuardiumConnectorApiGuardiumConnectorUpdateTaskRequest, options?: ConfigurationOptions): Promise<HttpInfo<Guardiumconnectorv3UpdateTaskResponse>> {
        return this.api.guardiumConnectorUpdateTaskWithHttpInfo(param.centralManagerId, param.taskId, param.guardiumconnectorv3UpdateTaskRequest,  options).toPromise();
    }

    /**
     * Summary: Update task Description: Update a task that gets executed on GDP. (This API is called from GDP only)
     * @param param the request object
     */
    public guardiumConnectorUpdateTask(param: GuardiumConnectorApiGuardiumConnectorUpdateTaskRequest, options?: ConfigurationOptions): Promise<Guardiumconnectorv3UpdateTaskResponse> {
        return this.api.guardiumConnectorUpdateTask(param.centralManagerId, param.taskId, param.guardiumconnectorv3UpdateTaskRequest,  options).toPromise();
    }

}

import { ObservableHealthCollectorApi } from "./ObservableAPI";
import { HealthCollectorApiRequestFactory, HealthCollectorApiResponseProcessor} from "../apis/HealthCollectorApi";

export interface HealthCollectorApiHealthCollectorGetDataWarehouseUsageRequest {
    /**
     * The type of metric to retrieve
     * Defaults to: undefined
     * @type string
     * @memberof HealthCollectorApihealthCollectorGetDataWarehouseUsage
     */
    type: string
    /**
     * The start time from which the data needs to be calculated.
     * Defaults to: undefined
     * @type Date
     * @memberof HealthCollectorApihealthCollectorGetDataWarehouseUsage
     */
    startTime?: Date
    /**
     * The end time from which the data needs to be calculated.
     * Defaults to: undefined
     * @type Date
     * @memberof HealthCollectorApihealthCollectorGetDataWarehouseUsage
     */
    endTime?: Date
}

export interface HealthCollectorApiHealthCollectorGetGDPHealthInfoRequest {
}

export interface HealthCollectorApiHealthCollectorGetHistoricalHealthInfoRequest {
    /**
     * Type of unit for which data needs to be retrieved.
     * Defaults to: &#39;UNKNOWN_UNIT&#39;
     * @type &#39;UNKNOWN_UNIT&#39; | &#39;STAP&#39;
     * @memberof HealthCollectorApihealthCollectorGetHistoricalHealthInfo
     */
    unit?: 'UNKNOWN_UNIT' | 'STAP'
    /**
     * Optional value if the data is for a particular cm. If it is empty the data for all cms would be retrieved.
     * Defaults to: undefined
     * @type string
     * @memberof HealthCollectorApihealthCollectorGetHistoricalHealthInfo
     */
    cmId?: string
    /**
     * The start time from which the data needs to be calculated.
     * Defaults to: undefined
     * @type Date
     * @memberof HealthCollectorApihealthCollectorGetHistoricalHealthInfo
     */
    startTime?: Date
    /**
     * The end time from which the data needs to be calculated.
     * Defaults to: undefined
     * @type Date
     * @memberof HealthCollectorApihealthCollectorGetHistoricalHealthInfo
     */
    endTime?: Date
}

export interface HealthCollectorApiHealthCollectorGetObjectStorageUsageRequest {
    /**
     * The type of metric to retrieve
     * Defaults to: undefined
     * @type string
     * @memberof HealthCollectorApihealthCollectorGetObjectStorageUsage
     */
    type: string
    /**
     * The start time from which the data needs to be calculated.
     * Defaults to: undefined
     * @type Date
     * @memberof HealthCollectorApihealthCollectorGetObjectStorageUsage
     */
    startTime?: Date
    /**
     * The end time from which the data needs to be calculated.
     * Defaults to: undefined
     * @type Date
     * @memberof HealthCollectorApihealthCollectorGetObjectStorageUsage
     */
    endTime?: Date
}

export interface HealthCollectorApiHealthCollectorGetPVCUsageRequest {
    /**
     * The type of metric to retrieve
     * Defaults to: undefined
     * @type string
     * @memberof HealthCollectorApihealthCollectorGetPVCUsage
     */
    type: string
    /**
     * The start time from which the data needs to be calculated.
     * Defaults to: undefined
     * @type Date
     * @memberof HealthCollectorApihealthCollectorGetPVCUsage
     */
    startTime?: Date
    /**
     * The end time from which the data needs to be calculated.
     * Defaults to: undefined
     * @type Date
     * @memberof HealthCollectorApihealthCollectorGetPVCUsage
     */
    endTime?: Date
}

export interface HealthCollectorApiHealthCollectorGetPodRestartsRequest {
    /**
     * The type of metric to retrieve
     * Defaults to: undefined
     * @type string
     * @memberof HealthCollectorApihealthCollectorGetPodRestarts
     */
    type: string
    /**
     * The start time from which the data needs to be calculated.
     * Defaults to: undefined
     * @type Date
     * @memberof HealthCollectorApihealthCollectorGetPodRestarts
     */
    startTime?: Date
    /**
     * The end time from which the data needs to be calculated.
     * Defaults to: undefined
     * @type Date
     * @memberof HealthCollectorApihealthCollectorGetPodRestarts
     */
    endTime?: Date
}

export interface HealthCollectorApiHealthCollectorGetStreamsIngestionRequest {
    /**
     * The type of metric to retrieve
     * Defaults to: undefined
     * @type string
     * @memberof HealthCollectorApihealthCollectorGetStreamsIngestion
     */
    type: string
    /**
     * The start time from which the data needs to be calculated.
     * Defaults to: undefined
     * @type Date
     * @memberof HealthCollectorApihealthCollectorGetStreamsIngestion
     */
    startTime?: Date
    /**
     * The end time from which the data needs to be calculated.
     * Defaults to: undefined
     * @type Date
     * @memberof HealthCollectorApihealthCollectorGetStreamsIngestion
     */
    endTime?: Date
}

export interface HealthCollectorApiHealthCollectorGetTopGDPCollectorsRequest {
    /**
     * The type of metric to retrieve
     * Defaults to: undefined
     * @type string
     * @memberof HealthCollectorApihealthCollectorGetTopGDPCollectors
     */
    type: string
    /**
     * The start time from which the data needs to be calculated.
     * Defaults to: undefined
     * @type Date
     * @memberof HealthCollectorApihealthCollectorGetTopGDPCollectors
     */
    startTime?: Date
    /**
     * The end time from which the data needs to be calculated.
     * Defaults to: undefined
     * @type Date
     * @memberof HealthCollectorApihealthCollectorGetTopGDPCollectors
     */
    endTime?: Date
}

export interface HealthCollectorApiHealthCollectorStoreHealthInfoRequest {
    /**
     * ID of central manager.
     * Defaults to: undefined
     * @type string
     * @memberof HealthCollectorApihealthCollectorStoreHealthInfo
     */
    centralManagerId: string
    /**
     * 
     * @type Healthcollectorv3StoreHealthInfoRequest
     * @memberof HealthCollectorApihealthCollectorStoreHealthInfo
     */
    healthcollectorv3StoreHealthInfoRequest: Healthcollectorv3StoreHealthInfoRequest
}

export class ObjectHealthCollectorApi {
    private api: ObservableHealthCollectorApi

    public constructor(configuration: Configuration, requestFactory?: HealthCollectorApiRequestFactory, responseProcessor?: HealthCollectorApiResponseProcessor) {
        this.api = new ObservableHealthCollectorApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Summary: Get data warehouse usage info Description: Get information from data warehouse related to usage
     * @param param the request object
     */
    public healthCollectorGetDataWarehouseUsageWithHttpInfo(param: HealthCollectorApiHealthCollectorGetDataWarehouseUsageRequest, options?: ConfigurationOptions): Promise<HttpInfo<Healthcollectorv3GetDataWarehouseUsageResponse>> {
        return this.api.healthCollectorGetDataWarehouseUsageWithHttpInfo(param.type, param.startTime, param.endTime,  options).toPromise();
    }

    /**
     * Summary: Get data warehouse usage info Description: Get information from data warehouse related to usage
     * @param param the request object
     */
    public healthCollectorGetDataWarehouseUsage(param: HealthCollectorApiHealthCollectorGetDataWarehouseUsageRequest, options?: ConfigurationOptions): Promise<Healthcollectorv3GetDataWarehouseUsageResponse> {
        return this.api.healthCollectorGetDataWarehouseUsage(param.type, param.startTime, param.endTime,  options).toPromise();
    }

    /**
     * Summary: Get GDP health info Description: Get information from MongoDB for Guardium central managers using health-connector service.
     * @param param the request object
     */
    public healthCollectorGetGDPHealthInfoWithHttpInfo(param: HealthCollectorApiHealthCollectorGetGDPHealthInfoRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Healthcollectorv3GetGDPHealthInfoResponse>> {
        return this.api.healthCollectorGetGDPHealthInfoWithHttpInfo( options).toPromise();
    }

    /**
     * Summary: Get GDP health info Description: Get information from MongoDB for Guardium central managers using health-connector service.
     * @param param the request object
     */
    public healthCollectorGetGDPHealthInfo(param: HealthCollectorApiHealthCollectorGetGDPHealthInfoRequest = {}, options?: ConfigurationOptions): Promise<Healthcollectorv3GetGDPHealthInfoResponse> {
        return this.api.healthCollectorGetGDPHealthInfo( options).toPromise();
    }

    /**
     * Summary: Get historical health info Description: Retrieve historical s-tap related statistics from health-collector service.
     * @param param the request object
     */
    public healthCollectorGetHistoricalHealthInfoWithHttpInfo(param: HealthCollectorApiHealthCollectorGetHistoricalHealthInfoRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Healthcollectorv3GetHistoricalHealthInfoResponse>> {
        return this.api.healthCollectorGetHistoricalHealthInfoWithHttpInfo(param.unit, param.cmId, param.startTime, param.endTime,  options).toPromise();
    }

    /**
     * Summary: Get historical health info Description: Retrieve historical s-tap related statistics from health-collector service.
     * @param param the request object
     */
    public healthCollectorGetHistoricalHealthInfo(param: HealthCollectorApiHealthCollectorGetHistoricalHealthInfoRequest = {}, options?: ConfigurationOptions): Promise<Healthcollectorv3GetHistoricalHealthInfoResponse> {
        return this.api.healthCollectorGetHistoricalHealthInfo(param.unit, param.cmId, param.startTime, param.endTime,  options).toPromise();
    }

    /**
     * Summary: Get object storage usage info Description: Get information from object storage about tenant bucket usage
     * @param param the request object
     */
    public healthCollectorGetObjectStorageUsageWithHttpInfo(param: HealthCollectorApiHealthCollectorGetObjectStorageUsageRequest, options?: ConfigurationOptions): Promise<HttpInfo<Healthcollectorv3GetObjectStorageUsageResponse>> {
        return this.api.healthCollectorGetObjectStorageUsageWithHttpInfo(param.type, param.startTime, param.endTime,  options).toPromise();
    }

    /**
     * Summary: Get object storage usage info Description: Get information from object storage about tenant bucket usage
     * @param param the request object
     */
    public healthCollectorGetObjectStorageUsage(param: HealthCollectorApiHealthCollectorGetObjectStorageUsageRequest, options?: ConfigurationOptions): Promise<Healthcollectorv3GetObjectStorageUsageResponse> {
        return this.api.healthCollectorGetObjectStorageUsage(param.type, param.startTime, param.endTime,  options).toPromise();
    }

    /**
     * Summary: Get the PVC usage information Description: Get information about the PVC usage in the OCP cluster
     * @param param the request object
     */
    public healthCollectorGetPVCUsageWithHttpInfo(param: HealthCollectorApiHealthCollectorGetPVCUsageRequest, options?: ConfigurationOptions): Promise<HttpInfo<Healthcollectorv3GetPVCUsageResponse>> {
        return this.api.healthCollectorGetPVCUsageWithHttpInfo(param.type, param.startTime, param.endTime,  options).toPromise();
    }

    /**
     * Summary: Get the PVC usage information Description: Get information about the PVC usage in the OCP cluster
     * @param param the request object
     */
    public healthCollectorGetPVCUsage(param: HealthCollectorApiHealthCollectorGetPVCUsageRequest, options?: ConfigurationOptions): Promise<Healthcollectorv3GetPVCUsageResponse> {
        return this.api.healthCollectorGetPVCUsage(param.type, param.startTime, param.endTime,  options).toPromise();
    }

    /**
     * Summary: Get the pod restart information Description: Get information about the number of restarts by pod in OCP
     * @param param the request object
     */
    public healthCollectorGetPodRestartsWithHttpInfo(param: HealthCollectorApiHealthCollectorGetPodRestartsRequest, options?: ConfigurationOptions): Promise<HttpInfo<Healthcollectorv3GetPodRestartsResponse>> {
        return this.api.healthCollectorGetPodRestartsWithHttpInfo(param.type, param.startTime, param.endTime,  options).toPromise();
    }

    /**
     * Summary: Get the pod restart information Description: Get information about the number of restarts by pod in OCP
     * @param param the request object
     */
    public healthCollectorGetPodRestarts(param: HealthCollectorApiHealthCollectorGetPodRestartsRequest, options?: ConfigurationOptions): Promise<Healthcollectorv3GetPodRestartsResponse> {
        return this.api.healthCollectorGetPodRestarts(param.type, param.startTime, param.endTime,  options).toPromise();
    }

    /**
     * Summary: Get streams ingestion volume over a given time Description: Get information about streams ingestion volume
     * @param param the request object
     */
    public healthCollectorGetStreamsIngestionWithHttpInfo(param: HealthCollectorApiHealthCollectorGetStreamsIngestionRequest, options?: ConfigurationOptions): Promise<HttpInfo<Healthcollectorv3GetStreamsIngestionResponse>> {
        return this.api.healthCollectorGetStreamsIngestionWithHttpInfo(param.type, param.startTime, param.endTime,  options).toPromise();
    }

    /**
     * Summary: Get streams ingestion volume over a given time Description: Get information about streams ingestion volume
     * @param param the request object
     */
    public healthCollectorGetStreamsIngestion(param: HealthCollectorApiHealthCollectorGetStreamsIngestionRequest, options?: ConfigurationOptions): Promise<Healthcollectorv3GetStreamsIngestionResponse> {
        return this.api.healthCollectorGetStreamsIngestion(param.type, param.startTime, param.endTime,  options).toPromise();
    }

    /**
     * Summary: Get the top GDP collectors which send data to GI Description: Get information about the top GDP collectors
     * @param param the request object
     */
    public healthCollectorGetTopGDPCollectorsWithHttpInfo(param: HealthCollectorApiHealthCollectorGetTopGDPCollectorsRequest, options?: ConfigurationOptions): Promise<HttpInfo<Healthcollectorv3GetTopGDPCollectorsResponse>> {
        return this.api.healthCollectorGetTopGDPCollectorsWithHttpInfo(param.type, param.startTime, param.endTime,  options).toPromise();
    }

    /**
     * Summary: Get the top GDP collectors which send data to GI Description: Get information about the top GDP collectors
     * @param param the request object
     */
    public healthCollectorGetTopGDPCollectors(param: HealthCollectorApiHealthCollectorGetTopGDPCollectorsRequest, options?: ConfigurationOptions): Promise<Healthcollectorv3GetTopGDPCollectorsResponse> {
        return this.api.healthCollectorGetTopGDPCollectors(param.type, param.startTime, param.endTime,  options).toPromise();
    }

    /**
     * Summary: Store health info Description: Store health info from GDP into GI. (This API is called from GDP only)
     * @param param the request object
     */
    public healthCollectorStoreHealthInfoWithHttpInfo(param: HealthCollectorApiHealthCollectorStoreHealthInfoRequest, options?: ConfigurationOptions): Promise<HttpInfo<Healthcollectorv3StoreHealthInfoResponse>> {
        return this.api.healthCollectorStoreHealthInfoWithHttpInfo(param.centralManagerId, param.healthcollectorv3StoreHealthInfoRequest,  options).toPromise();
    }

    /**
     * Summary: Store health info Description: Store health info from GDP into GI. (This API is called from GDP only)
     * @param param the request object
     */
    public healthCollectorStoreHealthInfo(param: HealthCollectorApiHealthCollectorStoreHealthInfoRequest, options?: ConfigurationOptions): Promise<Healthcollectorv3StoreHealthInfoResponse> {
        return this.api.healthCollectorStoreHealthInfo(param.centralManagerId, param.healthcollectorv3StoreHealthInfoRequest,  options).toPromise();
    }

}

import { ObservableJumpboxServiceApi } from "./ObservableAPI";
import { JumpboxServiceApiRequestFactory, JumpboxServiceApiResponseProcessor} from "../apis/JumpboxServiceApi";

export interface JumpboxServiceApiJumpboxServiceAuthorizeRequest {
    /**
     * 
     * @type Jumpboxv3AuthorizeRequest
     * @memberof JumpboxServiceApijumpboxServiceAuthorize
     */
    jumpboxv3AuthorizeRequest: Jumpboxv3AuthorizeRequest
}

export interface JumpboxServiceApiJumpboxServiceDeleteAccountRequest {
    /**
     * Account id.
     * Defaults to: undefined
     * @type string
     * @memberof JumpboxServiceApijumpboxServiceDeleteAccount
     */
    accountId: string
}

export interface JumpboxServiceApiJumpboxServiceDeleteTenantRequest {
    /**
     * Tenant id.
     * Defaults to: undefined
     * @type string
     * @memberof JumpboxServiceApijumpboxServiceDeleteTenant
     */
    tenantId: string
    /**
     * Delete tenant permanently if true.
     * Defaults to: undefined
     * @type boolean
     * @memberof JumpboxServiceApijumpboxServiceDeleteTenant
     */
    isPermanentDelete?: boolean
    /**
     * Async.
     * Defaults to: undefined
     * @type boolean
     * @memberof JumpboxServiceApijumpboxServiceDeleteTenant
     */
    async?: boolean
}

export interface JumpboxServiceApiJumpboxServiceDeleteUserRequest {
    /**
     * The user id.
     * Defaults to: undefined
     * @type string
     * @memberof JumpboxServiceApijumpboxServiceDeleteUser
     */
    userId: string
}

export interface JumpboxServiceApiJumpboxServiceGetAccountRequest {
    /**
     * Account id.
     * Defaults to: undefined
     * @type string
     * @memberof JumpboxServiceApijumpboxServiceGetAccount
     */
    accountId: string
    /**
     * Include inactive.
     * Defaults to: undefined
     * @type boolean
     * @memberof JumpboxServiceApijumpboxServiceGetAccount
     */
    includeInactive?: boolean
    /**
     * Include tenants that are not ready(are in state of being created or deleted).
     * Defaults to: undefined
     * @type boolean
     * @memberof JumpboxServiceApijumpboxServiceGetAccount
     */
    includeNotReady?: boolean
}

export interface JumpboxServiceApiJumpboxServiceGetAccountsRequest {
    /**
     * Email.
     * Defaults to: undefined
     * @type string
     * @memberof JumpboxServiceApijumpboxServiceGetAccounts
     */
    uid?: string
    /**
     * External id.
     * Defaults to: undefined
     * @type string
     * @memberof JumpboxServiceApijumpboxServiceGetAccounts
     */
    externalId?: string
    /**
     * Include inactive.
     * Defaults to: undefined
     * @type boolean
     * @memberof JumpboxServiceApijumpboxServiceGetAccounts
     */
    includeInactive?: boolean
    /**
     * Include tenants that are not ready(are in state of being created or deleted).
     * Defaults to: undefined
     * @type boolean
     * @memberof JumpboxServiceApijumpboxServiceGetAccounts
     */
    includeNotReady?: boolean
}

export interface JumpboxServiceApiJumpboxServiceGetTenantRequest {
    /**
     * Tenant id.
     * Defaults to: undefined
     * @type string
     * @memberof JumpboxServiceApijumpboxServiceGetTenant
     */
    tenantId: string
    /**
     * Include inactive.
     * Defaults to: undefined
     * @type boolean
     * @memberof JumpboxServiceApijumpboxServiceGetTenant
     */
    includeInactive?: boolean
    /**
     * Include tenants that are not ready(are in state of being created or deleted).
     * Defaults to: undefined
     * @type boolean
     * @memberof JumpboxServiceApijumpboxServiceGetTenant
     */
    includeNotReady?: boolean
}

export interface JumpboxServiceApiJumpboxServiceGetTenantsRequest {
    /**
     * Email.
     * Defaults to: undefined
     * @type string
     * @memberof JumpboxServiceApijumpboxServiceGetTenants
     */
    uid?: string
    /**
     * External id.
     * Defaults to: undefined
     * @type string
     * @memberof JumpboxServiceApijumpboxServiceGetTenants
     */
    externalId?: string
    /**
     * Include inactive.
     * Defaults to: undefined
     * @type boolean
     * @memberof JumpboxServiceApijumpboxServiceGetTenants
     */
    includeInactive?: boolean
    /**
     * Include tenants that are not ready(are in state of being created or deleted).
     * Defaults to: undefined
     * @type boolean
     * @memberof JumpboxServiceApijumpboxServiceGetTenants
     */
    includeNotReady?: boolean
}

export interface JumpboxServiceApiJumpboxServiceGetUsersRequest {
    /**
     * Email.
     * Defaults to: undefined
     * @type string
     * @memberof JumpboxServiceApijumpboxServiceGetUsers
     */
    uid?: string
}

export interface JumpboxServiceApiJumpboxServicePostAccountRequest {
    /**
     * 
     * @type Jumpboxv3PostAccountRequest
     * @memberof JumpboxServiceApijumpboxServicePostAccount
     */
    jumpboxv3PostAccountRequest: Jumpboxv3PostAccountRequest
}

export interface JumpboxServiceApiJumpboxServicePostTenantsRequest {
    /**
     * 
     * @type Jumpboxv3PostTenantsRequest
     * @memberof JumpboxServiceApijumpboxServicePostTenants
     */
    jumpboxv3PostTenantsRequest: Jumpboxv3PostTenantsRequest
}

export interface JumpboxServiceApiJumpboxServicePostUsersRequest {
    /**
     * 
     * @type Jumpboxv3PostUsersBulkRequest
     * @memberof JumpboxServiceApijumpboxServicePostUsers
     */
    jumpboxv3PostUsersBulkRequest: Jumpboxv3PostUsersBulkRequest
}

export interface JumpboxServiceApiJumpboxServiceResumeAccountRequest {
    /**
     * account_id represents the user\&#39;s account ID
     * Defaults to: undefined
     * @type string
     * @memberof JumpboxServiceApijumpboxServiceResumeAccount
     */
    accountId: string
}

export interface JumpboxServiceApiJumpboxServiceSearchUsersRequest {
    /**
     * 
     * @type Jumpboxv3SearchUsersRequest
     * @memberof JumpboxServiceApijumpboxServiceSearchUsers
     */
    jumpboxv3SearchUsersRequest: Jumpboxv3SearchUsersRequest
}

export interface JumpboxServiceApiJumpboxServiceSuspendAccountRequest {
    /**
     * account_id represents the user\&#39;s account ID
     * Defaults to: undefined
     * @type string
     * @memberof JumpboxServiceApijumpboxServiceSuspendAccount
     */
    accountId: string
}

export interface JumpboxServiceApiJumpboxServiceTestUserRequest {
    /**
     * 
     * @type Jumpboxv3TestUserRequest
     * @memberof JumpboxServiceApijumpboxServiceTestUser
     */
    jumpboxv3TestUserRequest: Jumpboxv3TestUserRequest
}

export interface JumpboxServiceApiJumpboxServiceUpdateAccountRequest {
    /**
     * Account id.
     * Defaults to: undefined
     * @type string
     * @memberof JumpboxServiceApijumpboxServiceUpdateAccount
     */
    accountId: string
    /**
     * 
     * @type Jumpboxv3UpdateAccountRequest
     * @memberof JumpboxServiceApijumpboxServiceUpdateAccount
     */
    jumpboxv3UpdateAccountRequest: Jumpboxv3UpdateAccountRequest
}

export interface JumpboxServiceApiJumpboxServiceUpdateTenantRequest {
    /**
     * Tenant id.
     * Defaults to: undefined
     * @type string
     * @memberof JumpboxServiceApijumpboxServiceUpdateTenant
     */
    tenantId: string
    /**
     * 
     * @type Jumpboxv3UpdateTenantRequest
     * @memberof JumpboxServiceApijumpboxServiceUpdateTenant
     */
    jumpboxv3UpdateTenantRequest: Jumpboxv3UpdateTenantRequest
}

export interface JumpboxServiceApiJumpboxServiceUpdateUsersRequest {
    /**
     * 
     * @type Jumpboxv3UpdateUsersBulkRequest
     * @memberof JumpboxServiceApijumpboxServiceUpdateUsers
     */
    jumpboxv3UpdateUsersBulkRequest: Jumpboxv3UpdateUsersBulkRequest
}

export class ObjectJumpboxServiceApi {
    private api: ObservableJumpboxServiceApi

    public constructor(configuration: Configuration, requestFactory?: JumpboxServiceApiRequestFactory, responseProcessor?: JumpboxServiceApiResponseProcessor) {
        this.api = new ObservableJumpboxServiceApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Summary: Authorize Description: Authenticate a user and return a JWT.
     * @param param the request object
     */
    public jumpboxServiceAuthorizeWithHttpInfo(param: JumpboxServiceApiJumpboxServiceAuthorizeRequest, options?: ConfigurationOptions): Promise<HttpInfo<Jumpboxv3AuthorizeResponse>> {
        return this.api.jumpboxServiceAuthorizeWithHttpInfo(param.jumpboxv3AuthorizeRequest,  options).toPromise();
    }

    /**
     * Summary: Authorize Description: Authenticate a user and return a JWT.
     * @param param the request object
     */
    public jumpboxServiceAuthorize(param: JumpboxServiceApiJumpboxServiceAuthorizeRequest, options?: ConfigurationOptions): Promise<Jumpboxv3AuthorizeResponse> {
        return this.api.jumpboxServiceAuthorize(param.jumpboxv3AuthorizeRequest,  options).toPromise();
    }

    /**
     * Summary: Delete account Description: Delete an account.
     * @param param the request object
     */
    public jumpboxServiceDeleteAccountWithHttpInfo(param: JumpboxServiceApiJumpboxServiceDeleteAccountRequest, options?: ConfigurationOptions): Promise<HttpInfo<Jumpboxv3DeleteAccountResponse>> {
        return this.api.jumpboxServiceDeleteAccountWithHttpInfo(param.accountId,  options).toPromise();
    }

    /**
     * Summary: Delete account Description: Delete an account.
     * @param param the request object
     */
    public jumpboxServiceDeleteAccount(param: JumpboxServiceApiJumpboxServiceDeleteAccountRequest, options?: ConfigurationOptions): Promise<Jumpboxv3DeleteAccountResponse> {
        return this.api.jumpboxServiceDeleteAccount(param.accountId,  options).toPromise();
    }

    /**
     * Summary: Delete tenant Description: Delete a tenant.
     * @param param the request object
     */
    public jumpboxServiceDeleteTenantWithHttpInfo(param: JumpboxServiceApiJumpboxServiceDeleteTenantRequest, options?: ConfigurationOptions): Promise<HttpInfo<any>> {
        return this.api.jumpboxServiceDeleteTenantWithHttpInfo(param.tenantId, param.isPermanentDelete, param.async,  options).toPromise();
    }

    /**
     * Summary: Delete tenant Description: Delete a tenant.
     * @param param the request object
     */
    public jumpboxServiceDeleteTenant(param: JumpboxServiceApiJumpboxServiceDeleteTenantRequest, options?: ConfigurationOptions): Promise<any> {
        return this.api.jumpboxServiceDeleteTenant(param.tenantId, param.isPermanentDelete, param.async,  options).toPromise();
    }

    /**
     * Summary: Delete user Description: Delete the user.
     * @param param the request object
     */
    public jumpboxServiceDeleteUserWithHttpInfo(param: JumpboxServiceApiJumpboxServiceDeleteUserRequest, options?: ConfigurationOptions): Promise<HttpInfo<any>> {
        return this.api.jumpboxServiceDeleteUserWithHttpInfo(param.userId,  options).toPromise();
    }

    /**
     * Summary: Delete user Description: Delete the user.
     * @param param the request object
     */
    public jumpboxServiceDeleteUser(param: JumpboxServiceApiJumpboxServiceDeleteUserRequest, options?: ConfigurationOptions): Promise<any> {
        return this.api.jumpboxServiceDeleteUser(param.userId,  options).toPromise();
    }

    /**
     * Summary: Get account Description: Get an account.
     * @param param the request object
     */
    public jumpboxServiceGetAccountWithHttpInfo(param: JumpboxServiceApiJumpboxServiceGetAccountRequest, options?: ConfigurationOptions): Promise<HttpInfo<Jumpboxv3GetAccountResponse>> {
        return this.api.jumpboxServiceGetAccountWithHttpInfo(param.accountId, param.includeInactive, param.includeNotReady,  options).toPromise();
    }

    /**
     * Summary: Get account Description: Get an account.
     * @param param the request object
     */
    public jumpboxServiceGetAccount(param: JumpboxServiceApiJumpboxServiceGetAccountRequest, options?: ConfigurationOptions): Promise<Jumpboxv3GetAccountResponse> {
        return this.api.jumpboxServiceGetAccount(param.accountId, param.includeInactive, param.includeNotReady,  options).toPromise();
    }

    /**
     * Summary: Get accounts Description: Get all accounts based on UID.
     * @param param the request object
     */
    public jumpboxServiceGetAccountsWithHttpInfo(param: JumpboxServiceApiJumpboxServiceGetAccountsRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Jumpboxv3GetAccountsResponse>> {
        return this.api.jumpboxServiceGetAccountsWithHttpInfo(param.uid, param.externalId, param.includeInactive, param.includeNotReady,  options).toPromise();
    }

    /**
     * Summary: Get accounts Description: Get all accounts based on UID.
     * @param param the request object
     */
    public jumpboxServiceGetAccounts(param: JumpboxServiceApiJumpboxServiceGetAccountsRequest = {}, options?: ConfigurationOptions): Promise<Jumpboxv3GetAccountsResponse> {
        return this.api.jumpboxServiceGetAccounts(param.uid, param.externalId, param.includeInactive, param.includeNotReady,  options).toPromise();
    }

    /**
     * Summary: Get tenant Description: Get a tenant.
     * @param param the request object
     */
    public jumpboxServiceGetTenantWithHttpInfo(param: JumpboxServiceApiJumpboxServiceGetTenantRequest, options?: ConfigurationOptions): Promise<HttpInfo<Jumpboxv3GetTenantResponse>> {
        return this.api.jumpboxServiceGetTenantWithHttpInfo(param.tenantId, param.includeInactive, param.includeNotReady,  options).toPromise();
    }

    /**
     * Summary: Get tenant Description: Get a tenant.
     * @param param the request object
     */
    public jumpboxServiceGetTenant(param: JumpboxServiceApiJumpboxServiceGetTenantRequest, options?: ConfigurationOptions): Promise<Jumpboxv3GetTenantResponse> {
        return this.api.jumpboxServiceGetTenant(param.tenantId, param.includeInactive, param.includeNotReady,  options).toPromise();
    }

    /**
     * Summary: Get tenants Description: Get all tenant base on UID.
     * @param param the request object
     */
    public jumpboxServiceGetTenantsWithHttpInfo(param: JumpboxServiceApiJumpboxServiceGetTenantsRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Jumpboxv3GetTenantsResponse>> {
        return this.api.jumpboxServiceGetTenantsWithHttpInfo(param.uid, param.externalId, param.includeInactive, param.includeNotReady,  options).toPromise();
    }

    /**
     * Summary: Get tenants Description: Get all tenant base on UID.
     * @param param the request object
     */
    public jumpboxServiceGetTenants(param: JumpboxServiceApiJumpboxServiceGetTenantsRequest = {}, options?: ConfigurationOptions): Promise<Jumpboxv3GetTenantsResponse> {
        return this.api.jumpboxServiceGetTenants(param.uid, param.externalId, param.includeInactive, param.includeNotReady,  options).toPromise();
    }

    /**
     * Summary: Get users Description: Get all users base on a tenantID.
     * @param param the request object
     */
    public jumpboxServiceGetUsersWithHttpInfo(param: JumpboxServiceApiJumpboxServiceGetUsersRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Tenantuserv3GetUsersResponse>> {
        return this.api.jumpboxServiceGetUsersWithHttpInfo(param.uid,  options).toPromise();
    }

    /**
     * Summary: Get users Description: Get all users base on a tenantID.
     * @param param the request object
     */
    public jumpboxServiceGetUsers(param: JumpboxServiceApiJumpboxServiceGetUsersRequest = {}, options?: ConfigurationOptions): Promise<Tenantuserv3GetUsersResponse> {
        return this.api.jumpboxServiceGetUsers(param.uid,  options).toPromise();
    }

    /**
     * Summary: Post account Description: Create an Account.
     * @param param the request object
     */
    public jumpboxServicePostAccountWithHttpInfo(param: JumpboxServiceApiJumpboxServicePostAccountRequest, options?: ConfigurationOptions): Promise<HttpInfo<Jumpboxv3PostAccountResponse>> {
        return this.api.jumpboxServicePostAccountWithHttpInfo(param.jumpboxv3PostAccountRequest,  options).toPromise();
    }

    /**
     * Summary: Post account Description: Create an Account.
     * @param param the request object
     */
    public jumpboxServicePostAccount(param: JumpboxServiceApiJumpboxServicePostAccountRequest, options?: ConfigurationOptions): Promise<Jumpboxv3PostAccountResponse> {
        return this.api.jumpboxServicePostAccount(param.jumpboxv3PostAccountRequest,  options).toPromise();
    }

    /**
     * Summary: Post tenants Description: Create a tenant.
     * @param param the request object
     */
    public jumpboxServicePostTenantsWithHttpInfo(param: JumpboxServiceApiJumpboxServicePostTenantsRequest, options?: ConfigurationOptions): Promise<HttpInfo<Jumpboxv3PostTenantsResponse>> {
        return this.api.jumpboxServicePostTenantsWithHttpInfo(param.jumpboxv3PostTenantsRequest,  options).toPromise();
    }

    /**
     * Summary: Post tenants Description: Create a tenant.
     * @param param the request object
     */
    public jumpboxServicePostTenants(param: JumpboxServiceApiJumpboxServicePostTenantsRequest, options?: ConfigurationOptions): Promise<Jumpboxv3PostTenantsResponse> {
        return this.api.jumpboxServicePostTenants(param.jumpboxv3PostTenantsRequest,  options).toPromise();
    }

    /**
     * Summary: Post users Description: Create users.
     * @param param the request object
     */
    public jumpboxServicePostUsersWithHttpInfo(param: JumpboxServiceApiJumpboxServicePostUsersRequest, options?: ConfigurationOptions): Promise<HttpInfo<Jumpboxv3PostUsersBulkResponse>> {
        return this.api.jumpboxServicePostUsersWithHttpInfo(param.jumpboxv3PostUsersBulkRequest,  options).toPromise();
    }

    /**
     * Summary: Post users Description: Create users.
     * @param param the request object
     */
    public jumpboxServicePostUsers(param: JumpboxServiceApiJumpboxServicePostUsersRequest, options?: ConfigurationOptions): Promise<Jumpboxv3PostUsersBulkResponse> {
        return this.api.jumpboxServicePostUsers(param.jumpboxv3PostUsersBulkRequest,  options).toPromise();
    }

    /**
     * Summary: Resume account Description: Resume an account.
     * @param param the request object
     */
    public jumpboxServiceResumeAccountWithHttpInfo(param: JumpboxServiceApiJumpboxServiceResumeAccountRequest, options?: ConfigurationOptions): Promise<HttpInfo<Jumpboxv3ResumeAccountResponse>> {
        return this.api.jumpboxServiceResumeAccountWithHttpInfo(param.accountId,  options).toPromise();
    }

    /**
     * Summary: Resume account Description: Resume an account.
     * @param param the request object
     */
    public jumpboxServiceResumeAccount(param: JumpboxServiceApiJumpboxServiceResumeAccountRequest, options?: ConfigurationOptions): Promise<Jumpboxv3ResumeAccountResponse> {
        return this.api.jumpboxServiceResumeAccount(param.accountId,  options).toPromise();
    }

    /**
     * Summary: Search users Description: Search for all users matching the provided string.
     * @param param the request object
     */
    public jumpboxServiceSearchUsersWithHttpInfo(param: JumpboxServiceApiJumpboxServiceSearchUsersRequest, options?: ConfigurationOptions): Promise<HttpInfo<Jumpboxv3SearchUsersResponse>> {
        return this.api.jumpboxServiceSearchUsersWithHttpInfo(param.jumpboxv3SearchUsersRequest,  options).toPromise();
    }

    /**
     * Summary: Search users Description: Search for all users matching the provided string.
     * @param param the request object
     */
    public jumpboxServiceSearchUsers(param: JumpboxServiceApiJumpboxServiceSearchUsersRequest, options?: ConfigurationOptions): Promise<Jumpboxv3SearchUsersResponse> {
        return this.api.jumpboxServiceSearchUsers(param.jumpboxv3SearchUsersRequest,  options).toPromise();
    }

    /**
     * Summary: Suspend Account Description: Suspend an account
     * @param param the request object
     */
    public jumpboxServiceSuspendAccountWithHttpInfo(param: JumpboxServiceApiJumpboxServiceSuspendAccountRequest, options?: ConfigurationOptions): Promise<HttpInfo<Jumpboxv3SuspendAccountResponse>> {
        return this.api.jumpboxServiceSuspendAccountWithHttpInfo(param.accountId,  options).toPromise();
    }

    /**
     * Summary: Suspend Account Description: Suspend an account
     * @param param the request object
     */
    public jumpboxServiceSuspendAccount(param: JumpboxServiceApiJumpboxServiceSuspendAccountRequest, options?: ConfigurationOptions): Promise<Jumpboxv3SuspendAccountResponse> {
        return this.api.jumpboxServiceSuspendAccount(param.accountId,  options).toPromise();
    }

    /**
     * Summary: Test user Description: Test a user lookup to a given LDAP.
     * @param param the request object
     */
    public jumpboxServiceTestUserWithHttpInfo(param: JumpboxServiceApiJumpboxServiceTestUserRequest, options?: ConfigurationOptions): Promise<HttpInfo<Jumpboxv3TestUserResponse>> {
        return this.api.jumpboxServiceTestUserWithHttpInfo(param.jumpboxv3TestUserRequest,  options).toPromise();
    }

    /**
     * Summary: Test user Description: Test a user lookup to a given LDAP.
     * @param param the request object
     */
    public jumpboxServiceTestUser(param: JumpboxServiceApiJumpboxServiceTestUserRequest, options?: ConfigurationOptions): Promise<Jumpboxv3TestUserResponse> {
        return this.api.jumpboxServiceTestUser(param.jumpboxv3TestUserRequest,  options).toPromise();
    }

    /**
     * Summary: Update Account Description: Updates an account.
     * @param param the request object
     */
    public jumpboxServiceUpdateAccountWithHttpInfo(param: JumpboxServiceApiJumpboxServiceUpdateAccountRequest, options?: ConfigurationOptions): Promise<HttpInfo<Jumpboxv3UpdateAccountResponse>> {
        return this.api.jumpboxServiceUpdateAccountWithHttpInfo(param.accountId, param.jumpboxv3UpdateAccountRequest,  options).toPromise();
    }

    /**
     * Summary: Update Account Description: Updates an account.
     * @param param the request object
     */
    public jumpboxServiceUpdateAccount(param: JumpboxServiceApiJumpboxServiceUpdateAccountRequest, options?: ConfigurationOptions): Promise<Jumpboxv3UpdateAccountResponse> {
        return this.api.jumpboxServiceUpdateAccount(param.accountId, param.jumpboxv3UpdateAccountRequest,  options).toPromise();
    }

    /**
     * Summary: Update tenant Description: Update a tenant.
     * @param param the request object
     */
    public jumpboxServiceUpdateTenantWithHttpInfo(param: JumpboxServiceApiJumpboxServiceUpdateTenantRequest, options?: ConfigurationOptions): Promise<HttpInfo<Jumpboxv3UpdateTenantResponse>> {
        return this.api.jumpboxServiceUpdateTenantWithHttpInfo(param.tenantId, param.jumpboxv3UpdateTenantRequest,  options).toPromise();
    }

    /**
     * Summary: Update tenant Description: Update a tenant.
     * @param param the request object
     */
    public jumpboxServiceUpdateTenant(param: JumpboxServiceApiJumpboxServiceUpdateTenantRequest, options?: ConfigurationOptions): Promise<Jumpboxv3UpdateTenantResponse> {
        return this.api.jumpboxServiceUpdateTenant(param.tenantId, param.jumpboxv3UpdateTenantRequest,  options).toPromise();
    }

    /**
     * Summary: Update users Description: Update an array of users.
     * @param param the request object
     */
    public jumpboxServiceUpdateUsersWithHttpInfo(param: JumpboxServiceApiJumpboxServiceUpdateUsersRequest, options?: ConfigurationOptions): Promise<HttpInfo<Jumpboxv3UpdateUsersBulkResponse>> {
        return this.api.jumpboxServiceUpdateUsersWithHttpInfo(param.jumpboxv3UpdateUsersBulkRequest,  options).toPromise();
    }

    /**
     * Summary: Update users Description: Update an array of users.
     * @param param the request object
     */
    public jumpboxServiceUpdateUsers(param: JumpboxServiceApiJumpboxServiceUpdateUsersRequest, options?: ConfigurationOptions): Promise<Jumpboxv3UpdateUsersBulkResponse> {
        return this.api.jumpboxServiceUpdateUsers(param.jumpboxv3UpdateUsersBulkRequest,  options).toPromise();
    }

}

import { ObservableNotificationsServiceApi } from "./ObservableAPI";
import { NotificationsServiceApiRequestFactory, NotificationsServiceApiResponseProcessor} from "../apis/NotificationsServiceApi";

export interface NotificationsServiceApiNotificationsServiceCreateTicketRequest {
    /**
     * 
     * @type Notificationsv3CreateTicketRequest
     * @memberof NotificationsServiceApinotificationsServiceCreateTicket
     */
    notificationsv3CreateTicketRequest: Notificationsv3CreateTicketRequest
}

export interface NotificationsServiceApiNotificationsServiceGetFoldersRequest {
    /**
     * 
     * @type Notificationsv3GetFoldersRequest
     * @memberof NotificationsServiceApinotificationsServiceGetFolders
     */
    notificationsv3GetFoldersRequest: Notificationsv3GetFoldersRequest
}

export interface NotificationsServiceApiNotificationsServiceGetNotificationFilenameRequest {
    /**
     * Params are located in the requests context (tenant id, user email, notification id).
     * Defaults to: undefined
     * @type string
     * @memberof NotificationsServiceApinotificationsServiceGetNotificationFilename
     */
    notificationId?: string
}

export interface NotificationsServiceApiNotificationsServiceGetNotificationRecordRequest {
    /**
     * ID for the record to return.
     * Defaults to: undefined
     * @type string
     * @memberof NotificationsServiceApinotificationsServiceGetNotificationRecord
     */
    notificationId: string
}

export interface NotificationsServiceApiNotificationsServiceGetNotificationRecordsRequest {
    /**
     * Return records created at this time or later (&gt;&#x3D;).
     * Defaults to: undefined
     * @type Date
     * @memberof NotificationsServiceApinotificationsServiceGetNotificationRecords
     */
    filterStartTime?: Date
    /**
     * Return records created before this time (&lt;).
     * Defaults to: undefined
     * @type Date
     * @memberof NotificationsServiceApinotificationsServiceGetNotificationRecords
     */
    filterEndTime?: Date
    /**
     * Only return record that include the specified state.
     * Defaults to: &#39;INCLUDE_ALL&#39;
     * @type &#39;INCLUDE_ALL&#39; | &#39;UNREAD_ONLY&#39; | &#39;READ_ONLY&#39; | &#39;COMPLETE_ONLY&#39; | &#39;NOT_COMPLETE&#39;
     * @memberof NotificationsServiceApinotificationsServiceGetNotificationRecords
     */
    filterState?: 'INCLUDE_ALL' | 'UNREAD_ONLY' | 'READ_ONLY' | 'COMPLETE_ONLY' | 'NOT_COMPLETE'
    /**
     * Only return record that includes the specified origins.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof NotificationsServiceApinotificationsServiceGetNotificationRecords
     */
    filterOrigins?: Array<string>
    /**
     * Only return record that with the specified origin_data.
     * Defaults to: undefined
     * @type string
     * @memberof NotificationsServiceApinotificationsServiceGetNotificationRecords
     */
    filterOriginData?: string
    /**
     * The max amount of rows to return for this single query.
     * Defaults to: undefined
     * @type number
     * @memberof NotificationsServiceApinotificationsServiceGetNotificationRecords
     */
    filterLimit?: number
    /**
     * The amount to offset the rows by for pagination.
     * Defaults to: undefined
     * @type number
     * @memberof NotificationsServiceApinotificationsServiceGetNotificationRecords
     */
    offset?: number
    /**
     * The max amount of rows to return for pagination.
     * Defaults to: undefined
     * @type number
     * @memberof NotificationsServiceApinotificationsServiceGetNotificationRecords
     */
    limit?: number
    /**
     * Computing the filter counts is relatively expensive, only compute when needed.
     * Defaults to: undefined
     * @type boolean
     * @memberof NotificationsServiceApinotificationsServiceGetNotificationRecords
     */
    includeFilterCounts?: boolean
}

export interface NotificationsServiceApiNotificationsServiceGetTicketStatusRequest {
    /**
     * The ID of the ticket to fetch.
     * Defaults to: undefined
     * @type string
     * @memberof NotificationsServiceApinotificationsServiceGetTicketStatus
     */
    ticketId?: string
    /**
     * The ID of the ticketing integration.
     * Defaults to: undefined
     * @type string
     * @memberof NotificationsServiceApinotificationsServiceGetTicketStatus
     */
    integrationId?: string
}

export interface NotificationsServiceApiNotificationsServicePostNotificationRecordRequest {
    /**
     * 
     * @type Notificationsv3PostNotificationRecordRequest
     * @memberof NotificationsServiceApinotificationsServicePostNotificationRecord
     */
    notificationsv3PostNotificationRecordRequest: Notificationsv3PostNotificationRecordRequest
}

export interface NotificationsServiceApiNotificationsServiceSearchNotificationRecordsRequest {
    /**
     * 
     * @type Notificationsv3SearchNotificationRecordsRequest
     * @memberof NotificationsServiceApinotificationsServiceSearchNotificationRecords
     */
    notificationsv3SearchNotificationRecordsRequest: Notificationsv3SearchNotificationRecordsRequest
}

export interface NotificationsServiceApiNotificationsServiceTestIntegrationRequest {
    /**
     * 
     * @type Notificationsv3TestIntegrationRequest
     * @memberof NotificationsServiceApinotificationsServiceTestIntegration
     */
    notificationsv3TestIntegrationRequest: Notificationsv3TestIntegrationRequest
}

export interface NotificationsServiceApiNotificationsServiceUpdateNotificationRecordRequest {
    /**
     * 
     * @type Notificationsv3UpdateNotificationRecordRequest
     * @memberof NotificationsServiceApinotificationsServiceUpdateNotificationRecord
     */
    notificationsv3UpdateNotificationRecordRequest: Notificationsv3UpdateNotificationRecordRequest
}

export class ObjectNotificationsServiceApi {
    private api: ObservableNotificationsServiceApi

    public constructor(configuration: Configuration, requestFactory?: NotificationsServiceApiRequestFactory, responseProcessor?: NotificationsServiceApiResponseProcessor) {
        this.api = new ObservableNotificationsServiceApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Summary: Create ticket Description: Create ticket based on information passed in.
     * @param param the request object
     */
    public notificationsServiceCreateTicketWithHttpInfo(param: NotificationsServiceApiNotificationsServiceCreateTicketRequest, options?: ConfigurationOptions): Promise<HttpInfo<Notificationsv3CreateTicketResponse>> {
        return this.api.notificationsServiceCreateTicketWithHttpInfo(param.notificationsv3CreateTicketRequest,  options).toPromise();
    }

    /**
     * Summary: Create ticket Description: Create ticket based on information passed in.
     * @param param the request object
     */
    public notificationsServiceCreateTicket(param: NotificationsServiceApiNotificationsServiceCreateTicketRequest, options?: ConfigurationOptions): Promise<Notificationsv3CreateTicketResponse> {
        return this.api.notificationsServiceCreateTicket(param.notificationsv3CreateTicketRequest,  options).toPromise();
    }

    /**
     * Summary: Get folders Description: Get folder for the integration connection provided.
     * @param param the request object
     */
    public notificationsServiceGetFoldersWithHttpInfo(param: NotificationsServiceApiNotificationsServiceGetFoldersRequest, options?: ConfigurationOptions): Promise<HttpInfo<Notificationsv3GetFoldersResponse>> {
        return this.api.notificationsServiceGetFoldersWithHttpInfo(param.notificationsv3GetFoldersRequest,  options).toPromise();
    }

    /**
     * Summary: Get folders Description: Get folder for the integration connection provided.
     * @param param the request object
     */
    public notificationsServiceGetFolders(param: NotificationsServiceApiNotificationsServiceGetFoldersRequest, options?: ConfigurationOptions): Promise<Notificationsv3GetFoldersResponse> {
        return this.api.notificationsServiceGetFolders(param.notificationsv3GetFoldersRequest,  options).toPromise();
    }

    /**
     * Summary: Get notification filename Description: Return filename associated with the notifications record referenced in the associated context record. The notification id is required but may be set in the associated authentication token or explicitly in the request.
     * @param param the request object
     */
    public notificationsServiceGetNotificationFilenameWithHttpInfo(param: NotificationsServiceApiNotificationsServiceGetNotificationFilenameRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Notificationsv3GetNotificationFilenameResponse>> {
        return this.api.notificationsServiceGetNotificationFilenameWithHttpInfo(param.notificationId,  options).toPromise();
    }

    /**
     * Summary: Get notification filename Description: Return filename associated with the notifications record referenced in the associated context record. The notification id is required but may be set in the associated authentication token or explicitly in the request.
     * @param param the request object
     */
    public notificationsServiceGetNotificationFilename(param: NotificationsServiceApiNotificationsServiceGetNotificationFilenameRequest = {}, options?: ConfigurationOptions): Promise<Notificationsv3GetNotificationFilenameResponse> {
        return this.api.notificationsServiceGetNotificationFilename(param.notificationId,  options).toPromise();
    }

    /**
     * Summary: Get notification record Description: Return notifications record with the specified ID.
     * @param param the request object
     */
    public notificationsServiceGetNotificationRecordWithHttpInfo(param: NotificationsServiceApiNotificationsServiceGetNotificationRecordRequest, options?: ConfigurationOptions): Promise<HttpInfo<Notificationsv3GetNotificationRecordResponse>> {
        return this.api.notificationsServiceGetNotificationRecordWithHttpInfo(param.notificationId,  options).toPromise();
    }

    /**
     * Summary: Get notification record Description: Return notifications record with the specified ID.
     * @param param the request object
     */
    public notificationsServiceGetNotificationRecord(param: NotificationsServiceApiNotificationsServiceGetNotificationRecordRequest, options?: ConfigurationOptions): Promise<Notificationsv3GetNotificationRecordResponse> {
        return this.api.notificationsServiceGetNotificationRecord(param.notificationId,  options).toPromise();
    }

    /**
     * Summary: Get notification records Description: Return notifications records that match the specified filter.
     * @param param the request object
     */
    public notificationsServiceGetNotificationRecordsWithHttpInfo(param: NotificationsServiceApiNotificationsServiceGetNotificationRecordsRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Notificationsv3GetNotificationRecordsResponse>> {
        return this.api.notificationsServiceGetNotificationRecordsWithHttpInfo(param.filterStartTime, param.filterEndTime, param.filterState, param.filterOrigins, param.filterOriginData, param.filterLimit, param.offset, param.limit, param.includeFilterCounts,  options).toPromise();
    }

    /**
     * Summary: Get notification records Description: Return notifications records that match the specified filter.
     * @param param the request object
     */
    public notificationsServiceGetNotificationRecords(param: NotificationsServiceApiNotificationsServiceGetNotificationRecordsRequest = {}, options?: ConfigurationOptions): Promise<Notificationsv3GetNotificationRecordsResponse> {
        return this.api.notificationsServiceGetNotificationRecords(param.filterStartTime, param.filterEndTime, param.filterState, param.filterOrigins, param.filterOriginData, param.filterLimit, param.offset, param.limit, param.includeFilterCounts,  options).toPromise();
    }

    /**
     * Summary: Get ticket status Description: Get the status of the given ticket
     * @param param the request object
     */
    public notificationsServiceGetTicketStatusWithHttpInfo(param: NotificationsServiceApiNotificationsServiceGetTicketStatusRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Notificationsv3GetTicketStatusResponse>> {
        return this.api.notificationsServiceGetTicketStatusWithHttpInfo(param.ticketId, param.integrationId,  options).toPromise();
    }

    /**
     * Summary: Get ticket status Description: Get the status of the given ticket
     * @param param the request object
     */
    public notificationsServiceGetTicketStatus(param: NotificationsServiceApiNotificationsServiceGetTicketStatusRequest = {}, options?: ConfigurationOptions): Promise<Notificationsv3GetTicketStatusResponse> {
        return this.api.notificationsServiceGetTicketStatus(param.ticketId, param.integrationId,  options).toPromise();
    }

    /**
     * Summary: For PostNotificationRecord notification only Description: Sends notification with recipients and returns a status
     * @param param the request object
     */
    public notificationsServicePostNotificationRecordWithHttpInfo(param: NotificationsServiceApiNotificationsServicePostNotificationRecordRequest, options?: ConfigurationOptions): Promise<HttpInfo<Notificationsv3PostNotificationRecordResponse>> {
        return this.api.notificationsServicePostNotificationRecordWithHttpInfo(param.notificationsv3PostNotificationRecordRequest,  options).toPromise();
    }

    /**
     * Summary: For PostNotificationRecord notification only Description: Sends notification with recipients and returns a status
     * @param param the request object
     */
    public notificationsServicePostNotificationRecord(param: NotificationsServiceApiNotificationsServicePostNotificationRecordRequest, options?: ConfigurationOptions): Promise<Notificationsv3PostNotificationRecordResponse> {
        return this.api.notificationsServicePostNotificationRecord(param.notificationsv3PostNotificationRecordRequest,  options).toPromise();
    }

    /**
     * Summary: Search notification records Description: Return notification records using pipeline of filters
     * @param param the request object
     */
    public notificationsServiceSearchNotificationRecordsWithHttpInfo(param: NotificationsServiceApiNotificationsServiceSearchNotificationRecordsRequest, options?: ConfigurationOptions): Promise<HttpInfo<Notificationsv3SearchNotificationRecordsResponse>> {
        return this.api.notificationsServiceSearchNotificationRecordsWithHttpInfo(param.notificationsv3SearchNotificationRecordsRequest,  options).toPromise();
    }

    /**
     * Summary: Search notification records Description: Return notification records using pipeline of filters
     * @param param the request object
     */
    public notificationsServiceSearchNotificationRecords(param: NotificationsServiceApiNotificationsServiceSearchNotificationRecordsRequest, options?: ConfigurationOptions): Promise<Notificationsv3SearchNotificationRecordsResponse> {
        return this.api.notificationsServiceSearchNotificationRecords(param.notificationsv3SearchNotificationRecordsRequest,  options).toPromise();
    }

    /**
     * Summary: Test integration Description: Test the integration connection with the arguments passed in the TestIntegrationRequest.  When possible a test message is sent to the integration to ensure it is functional.
     * @param param the request object
     */
    public notificationsServiceTestIntegrationWithHttpInfo(param: NotificationsServiceApiNotificationsServiceTestIntegrationRequest, options?: ConfigurationOptions): Promise<HttpInfo<Notificationsv3TestIntegrationResponse>> {
        return this.api.notificationsServiceTestIntegrationWithHttpInfo(param.notificationsv3TestIntegrationRequest,  options).toPromise();
    }

    /**
     * Summary: Test integration Description: Test the integration connection with the arguments passed in the TestIntegrationRequest.  When possible a test message is sent to the integration to ensure it is functional.
     * @param param the request object
     */
    public notificationsServiceTestIntegration(param: NotificationsServiceApiNotificationsServiceTestIntegrationRequest, options?: ConfigurationOptions): Promise<Notificationsv3TestIntegrationResponse> {
        return this.api.notificationsServiceTestIntegration(param.notificationsv3TestIntegrationRequest,  options).toPromise();
    }

    /**
     * Summary: Update notification record Description: Update a notification record with the specified values.  The ID field is required and must match an existing notification. All fields other than the ID are optional. Creation timestamp, user and other administrative fields can not updated.
     * @param param the request object
     */
    public notificationsServiceUpdateNotificationRecordWithHttpInfo(param: NotificationsServiceApiNotificationsServiceUpdateNotificationRecordRequest, options?: ConfigurationOptions): Promise<HttpInfo<Notificationsv3UpdateNotificationRecordResponse>> {
        return this.api.notificationsServiceUpdateNotificationRecordWithHttpInfo(param.notificationsv3UpdateNotificationRecordRequest,  options).toPromise();
    }

    /**
     * Summary: Update notification record Description: Update a notification record with the specified values.  The ID field is required and must match an existing notification. All fields other than the ID are optional. Creation timestamp, user and other administrative fields can not updated.
     * @param param the request object
     */
    public notificationsServiceUpdateNotificationRecord(param: NotificationsServiceApiNotificationsServiceUpdateNotificationRecordRequest, options?: ConfigurationOptions): Promise<Notificationsv3UpdateNotificationRecordResponse> {
        return this.api.notificationsServiceUpdateNotificationRecord(param.notificationsv3UpdateNotificationRecordRequest,  options).toPromise();
    }

}

import { ObservableOutliersEngineApi } from "./ObservableAPI";
import { OutliersEngineApiRequestFactory, OutliersEngineApiResponseProcessor} from "../apis/OutliersEngineApi";

export interface OutliersEngineApiOutliersEngineGetSourceStatisticsRequest {
    /**
     * server ip.
     * Defaults to: undefined
     * @type string
     * @memberof OutliersEngineApioutliersEngineGetSourceStatistics
     */
    sourceServerIp?: string
    /**
     * database name.
     * Defaults to: undefined
     * @type string
     * @memberof OutliersEngineApioutliersEngineGetSourceStatistics
     */
    sourceDatabaseName?: string
    /**
     * db user name (optional).
     * Defaults to: undefined
     * @type string
     * @memberof OutliersEngineApioutliersEngineGetSourceStatistics
     */
    sourceDbUser?: string
    /**
     * The number of attributes to return for each SourceAttributeType - optional.
     * Defaults to: undefined
     * @type number
     * @memberof OutliersEngineApioutliersEngineGetSourceStatistics
     */
    attributesLimit?: number
}

export interface OutliersEngineApiOutliersEngineGetStatisticsRequest {
}

export interface OutliersEngineApiOutliersEngineGetWorkingHoursPeriodsRequest {
}

export interface OutliersEngineApiOutliersEngineRunSimulatorRequest {
    /**
     * 
     * @type Outliersenginev3RunSimulatorRequest
     * @memberof OutliersEngineApioutliersEngineRunSimulator
     */
    outliersenginev3RunSimulatorRequest: Outliersenginev3RunSimulatorRequest
}

export interface OutliersEngineApiOutliersEngineUpdateWorkingHoursPeriodsRequest {
    /**
     * 
     * @type Outliersenginev3UpdateWorkingHoursPeriodsRequest
     * @memberof OutliersEngineApioutliersEngineUpdateWorkingHoursPeriods
     */
    outliersenginev3UpdateWorkingHoursPeriodsRequest: Outliersenginev3UpdateWorkingHoursPeriodsRequest
}

export interface OutliersEngineApiOutliersEngineUploadAndAnalyzePeriodRequest {
    /**
     * 
     * @type any
     * @memberof OutliersEngineApioutliersEngineUploadAndAnalyzePeriod
     */
    body: any
}

export interface OutliersEngineApiOutliersEngineUserClusteringRequest {
    /**
     * 
     * @type any
     * @memberof OutliersEngineApioutliersEngineUserClustering
     */
    body: any
}

export class ObjectOutliersEngineApi {
    private api: ObservableOutliersEngineApi

    public constructor(configuration: Configuration, requestFactory?: OutliersEngineApiRequestFactory, responseProcessor?: OutliersEngineApiResponseProcessor) {
        this.api = new ObservableOutliersEngineApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Summary: Get source statistics Description: Return statistics regarding the input source, including distribution of verbs, source program, working hours etc.
     * @param param the request object
     */
    public outliersEngineGetSourceStatisticsWithHttpInfo(param: OutliersEngineApiOutliersEngineGetSourceStatisticsRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Outliersenginev3GetSourceStatisticsResponse>> {
        return this.api.outliersEngineGetSourceStatisticsWithHttpInfo(param.sourceServerIp, param.sourceDatabaseName, param.sourceDbUser, param.attributesLimit,  options).toPromise();
    }

    /**
     * Summary: Get source statistics Description: Return statistics regarding the input source, including distribution of verbs, source program, working hours etc.
     * @param param the request object
     */
    public outliersEngineGetSourceStatistics(param: OutliersEngineApiOutliersEngineGetSourceStatisticsRequest = {}, options?: ConfigurationOptions): Promise<Outliersenginev3GetSourceStatisticsResponse> {
        return this.api.outliersEngineGetSourceStatistics(param.sourceServerIp, param.sourceDatabaseName, param.sourceDbUser, param.attributesLimit,  options).toPromise();
    }

    /**
     * Summary: Get statistics Description: Return statistics regarding number of outliers, clusters and un/completed periods.
     * @param param the request object
     */
    public outliersEngineGetStatisticsWithHttpInfo(param: OutliersEngineApiOutliersEngineGetStatisticsRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Outliersenginev3StatisticsResponse>> {
        return this.api.outliersEngineGetStatisticsWithHttpInfo( options).toPromise();
    }

    /**
     * Summary: Get statistics Description: Return statistics regarding number of outliers, clusters and un/completed periods.
     * @param param the request object
     */
    public outliersEngineGetStatistics(param: OutliersEngineApiOutliersEngineGetStatisticsRequest = {}, options?: ConfigurationOptions): Promise<Outliersenginev3StatisticsResponse> {
        return this.api.outliersEngineGetStatistics( options).toPromise();
    }

    /**
     * Summary: Get working hours periods Description: Get a list of the working hours periods.
     * @param param the request object
     */
    public outliersEngineGetWorkingHoursPeriodsWithHttpInfo(param: OutliersEngineApiOutliersEngineGetWorkingHoursPeriodsRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Outliersenginev3GetWorkingHoursPeriodsResponse>> {
        return this.api.outliersEngineGetWorkingHoursPeriodsWithHttpInfo( options).toPromise();
    }

    /**
     * Summary: Get working hours periods Description: Get a list of the working hours periods.
     * @param param the request object
     */
    public outliersEngineGetWorkingHoursPeriods(param: OutliersEngineApiOutliersEngineGetWorkingHoursPeriodsRequest = {}, options?: ConfigurationOptions): Promise<Outliersenginev3GetWorkingHoursPeriodsResponse> {
        return this.api.outliersEngineGetWorkingHoursPeriods( options).toPromise();
    }

    /**
     * Summary: Run simulator Description: Run outlier simulator.
     * @param param the request object
     */
    public outliersEngineRunSimulatorWithHttpInfo(param: OutliersEngineApiOutliersEngineRunSimulatorRequest, options?: ConfigurationOptions): Promise<HttpInfo<RpcStatus>> {
        return this.api.outliersEngineRunSimulatorWithHttpInfo(param.outliersenginev3RunSimulatorRequest,  options).toPromise();
    }

    /**
     * Summary: Run simulator Description: Run outlier simulator.
     * @param param the request object
     */
    public outliersEngineRunSimulator(param: OutliersEngineApiOutliersEngineRunSimulatorRequest, options?: ConfigurationOptions): Promise<RpcStatus> {
        return this.api.outliersEngineRunSimulator(param.outliersenginev3RunSimulatorRequest,  options).toPromise();
    }

    /**
     * Summary: Update working hours periods Description: Update the working hours periods values.
     * @param param the request object
     */
    public outliersEngineUpdateWorkingHoursPeriodsWithHttpInfo(param: OutliersEngineApiOutliersEngineUpdateWorkingHoursPeriodsRequest, options?: ConfigurationOptions): Promise<HttpInfo<Outliersenginev3OutlierResponse>> {
        return this.api.outliersEngineUpdateWorkingHoursPeriodsWithHttpInfo(param.outliersenginev3UpdateWorkingHoursPeriodsRequest,  options).toPromise();
    }

    /**
     * Summary: Update working hours periods Description: Update the working hours periods values.
     * @param param the request object
     */
    public outliersEngineUpdateWorkingHoursPeriods(param: OutliersEngineApiOutliersEngineUpdateWorkingHoursPeriodsRequest, options?: ConfigurationOptions): Promise<Outliersenginev3OutlierResponse> {
        return this.api.outliersEngineUpdateWorkingHoursPeriods(param.outliersenginev3UpdateWorkingHoursPeriodsRequest,  options).toPromise();
    }

    /**
     * Summary: Upload and analyze period Description: Run outliers detection on ready periods.
     * @param param the request object
     */
    public outliersEngineUploadAndAnalyzePeriodWithHttpInfo(param: OutliersEngineApiOutliersEngineUploadAndAnalyzePeriodRequest, options?: ConfigurationOptions): Promise<HttpInfo<RpcStatus>> {
        return this.api.outliersEngineUploadAndAnalyzePeriodWithHttpInfo(param.body,  options).toPromise();
    }

    /**
     * Summary: Upload and analyze period Description: Run outliers detection on ready periods.
     * @param param the request object
     */
    public outliersEngineUploadAndAnalyzePeriod(param: OutliersEngineApiOutliersEngineUploadAndAnalyzePeriodRequest, options?: ConfigurationOptions): Promise<RpcStatus> {
        return this.api.outliersEngineUploadAndAnalyzePeriod(param.body,  options).toPromise();
    }

    /**
     * Summary: User clustering Description: Run user-clustering on current sources.
     * @param param the request object
     */
    public outliersEngineUserClusteringWithHttpInfo(param: OutliersEngineApiOutliersEngineUserClusteringRequest, options?: ConfigurationOptions): Promise<HttpInfo<RpcStatus>> {
        return this.api.outliersEngineUserClusteringWithHttpInfo(param.body,  options).toPromise();
    }

    /**
     * Summary: User clustering Description: Run user-clustering on current sources.
     * @param param the request object
     */
    public outliersEngineUserClustering(param: OutliersEngineApiOutliersEngineUserClusteringRequest, options?: ConfigurationOptions): Promise<RpcStatus> {
        return this.api.outliersEngineUserClustering(param.body,  options).toPromise();
    }

}

import { ObservablePipelineconfigServiceApi } from "./ObservableAPI";
import { PipelineconfigServiceApiRequestFactory, PipelineconfigServiceApiResponseProcessor} from "../apis/PipelineconfigServiceApi";

export interface PipelineconfigServiceApiPipelineconfigServiceDeleteTenantResourcesRequest {
    /**
     * unique tenant ID
     * Defaults to: undefined
     * @type string
     * @memberof PipelineconfigServiceApipipelineconfigServiceDeleteTenantResources
     */
    tenantId: string
    /**
     * resource specifies the specific resource to delete
     * Defaults to: undefined
     * @type string
     * @memberof PipelineconfigServiceApipipelineconfigServiceDeleteTenantResources
     */
    resource: string
}

export class ObjectPipelineconfigServiceApi {
    private api: ObservablePipelineconfigServiceApi

    public constructor(configuration: Configuration, requestFactory?: PipelineconfigServiceApiRequestFactory, responseProcessor?: PipelineconfigServiceApiResponseProcessor) {
        this.api = new ObservablePipelineconfigServiceApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Summary: Delete a tenant resource Description: Delete tenant specific resources such as data warehouse, mongo, postgres and s3.
     * @param param the request object
     */
    public pipelineconfigServiceDeleteTenantResourcesWithHttpInfo(param: PipelineconfigServiceApiPipelineconfigServiceDeleteTenantResourcesRequest, options?: ConfigurationOptions): Promise<HttpInfo<Pipelineconfigv3DeleteTenantResponse>> {
        return this.api.pipelineconfigServiceDeleteTenantResourcesWithHttpInfo(param.tenantId, param.resource,  options).toPromise();
    }

    /**
     * Summary: Delete a tenant resource Description: Delete tenant specific resources such as data warehouse, mongo, postgres and s3.
     * @param param the request object
     */
    public pipelineconfigServiceDeleteTenantResources(param: PipelineconfigServiceApiPipelineconfigServiceDeleteTenantResourcesRequest, options?: ConfigurationOptions): Promise<Pipelineconfigv3DeleteTenantResponse> {
        return this.api.pipelineconfigServiceDeleteTenantResources(param.tenantId, param.resource,  options).toPromise();
    }

}

import { ObservablePolicyBuilderApi } from "./ObservableAPI";
import { PolicyBuilderApiRequestFactory, PolicyBuilderApiResponseProcessor} from "../apis/PolicyBuilderApi";

export interface PolicyBuilderApiPolicyBuilderClonePolicyRequest {
    /**
     * Policy id that needs to be cloned.
     * Defaults to: undefined
     * @type string
     * @memberof PolicyBuilderApipolicyBuilderClonePolicy
     */
    policyId: string
    /**
     * 
     * @type Policybuilderv3ClonePolicyRequest
     * @memberof PolicyBuilderApipolicyBuilderClonePolicy
     */
    policybuilderv3ClonePolicyRequest: Policybuilderv3ClonePolicyRequest
}

export interface PolicyBuilderApiPolicyBuilderCreatePolicyRequest {
    /**
     * 
     * @type Policybuilderv3CreateUpdatePolicyRequest
     * @memberof PolicyBuilderApipolicyBuilderCreatePolicy
     */
    policybuilderv3CreateUpdatePolicyRequest: Policybuilderv3CreateUpdatePolicyRequest
}

export interface PolicyBuilderApiPolicyBuilderDeleteGdpSyncEntryRequest {
    /**
     * Policy sync entry id to delete from sync.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof PolicyBuilderApipolicyBuilderDeleteGdpSyncEntry
     */
    syncIds?: Array<string>
}

export interface PolicyBuilderApiPolicyBuilderDeletePoliciesRequest {
    /**
     * Policy ids.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof PolicyBuilderApipolicyBuilderDeletePolicies
     */
    policyIds?: Array<string>
}

export interface PolicyBuilderApiPolicyBuilderGetGdpPolicyMetaDataRequest {
}

export interface PolicyBuilderApiPolicyBuilderGetPoliciesRequest {
}

export interface PolicyBuilderApiPolicyBuilderGetPolicyDetailsRequest {
    /**
     * Policy id.
     * Defaults to: undefined
     * @type string
     * @memberof PolicyBuilderApipolicyBuilderGetPolicyDetails
     */
    policyId: string
}

export interface PolicyBuilderApiPolicyBuilderGetPolicyNamesFromRuleIDsRequest {
    /**
     * 
     * @type Policybuilderv3GetPolicyNamesFromRuleIDsRequest
     * @memberof PolicyBuilderApipolicyBuilderGetPolicyNamesFromRuleIDs
     */
    policybuilderv3GetPolicyNamesFromRuleIDsRequest: Policybuilderv3GetPolicyNamesFromRuleIDsRequest
}

export interface PolicyBuilderApiPolicyBuilderGetPolicySyncListRequest {
}

export interface PolicyBuilderApiPolicyBuilderGetPolicyVersionRequest {
    /**
     * Policy id of the requested policy
     * Defaults to: undefined
     * @type string
     * @memberof PolicyBuilderApipolicyBuilderGetPolicyVersion
     */
    policyId: string
    /**
     * Requested version number of the policy
     * Defaults to: undefined
     * @type number
     * @memberof PolicyBuilderApipolicyBuilderGetPolicyVersion
     */
    version: number
}

export interface PolicyBuilderApiPolicyBuilderGetPolicyVersionsInfoRequest {
    /**
     * Policy id of the requested policy
     * Defaults to: undefined
     * @type string
     * @memberof PolicyBuilderApipolicyBuilderGetPolicyVersionsInfo
     */
    policyId: string
}

export interface PolicyBuilderApiPolicyBuilderGetReceiversRequest {
    /**
     * Action id.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof PolicyBuilderApipolicyBuilderGetReceivers
     */
    actionId?: Array<string>
    /**
     * Flag that indicates if cache needs to be validated.
     * Defaults to: undefined
     * @type boolean
     * @memberof PolicyBuilderApipolicyBuilderGetReceivers
     */
    validateCache?: boolean
}

export interface PolicyBuilderApiPolicyBuilderGetRuleMetadataRequest {
    /**
     * Rule type integer to indicate rule type.
     * Defaults to: &#39;ACCESS&#39;
     * @type &#39;ACCESS&#39; | &#39;EXCEPTION&#39; | &#39;RESULT_SET&#39;
     * @memberof PolicyBuilderApipolicyBuilderGetRuleMetadata
     */
    ruleType?: 'ACCESS' | 'EXCEPTION' | 'RESULT_SET'
}

export interface PolicyBuilderApiPolicyBuilderInsertGdpPolicyRequest {
    /**
     * 
     * @type Policybuilderv3InsertGdpPolicySyncRequest
     * @memberof PolicyBuilderApipolicyBuilderInsertGdpPolicy
     */
    policybuilderv3InsertGdpPolicySyncRequest: Policybuilderv3InsertGdpPolicySyncRequest
}

export interface PolicyBuilderApiPolicyBuilderInsertGdpPolicyMetaDataRequest {
    /**
     * ID of central manager.
     * Defaults to: undefined
     * @type string
     * @memberof PolicyBuilderApipolicyBuilderInsertGdpPolicyMetaData
     */
    centralManagerId: string
    /**
     * 
     * @type Policybuilderv3InsertGdpPolicyMetaDataRequest
     * @memberof PolicyBuilderApipolicyBuilderInsertGdpPolicyMetaData
     */
    policybuilderv3InsertGdpPolicyMetaDataRequest: Policybuilderv3InsertGdpPolicyMetaDataRequest
}

export interface PolicyBuilderApiPolicyBuilderInstallPoliciesRequest {
    /**
     * 
     * @type Policybuilderv3InstallPoliciesRequest
     * @memberof PolicyBuilderApipolicyBuilderInstallPolicies
     */
    policybuilderv3InstallPoliciesRequest: Policybuilderv3InstallPoliciesRequest
}

export interface PolicyBuilderApiPolicyBuilderIntegrationCheckRequest {
    /**
     * Integration Id to check if it is being used in policies.
     * Defaults to: undefined
     * @type string
     * @memberof PolicyBuilderApipolicyBuilderIntegrationCheck
     */
    integrationId: string
    /**
     * Template Id to check if it is being used in policies.
     * Defaults to: undefined
     * @type string
     * @memberof PolicyBuilderApipolicyBuilderIntegrationCheck
     */
    templateId?: string
}

export interface PolicyBuilderApiPolicyBuilderPoliciesGroupsRequest {
    /**
     * Group ids to check if they are being used in policies.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof PolicyBuilderApipolicyBuilderPoliciesGroups
     */
    groupIds?: Array<string>
}

export interface PolicyBuilderApiPolicyBuilderRuleValidationRequest {
    /**
     * 
     * @type Policybuilderv3GetRuleValidationRequest
     * @memberof PolicyBuilderApipolicyBuilderRuleValidation
     */
    policybuilderv3GetRuleValidationRequest: Policybuilderv3GetRuleValidationRequest
}

export interface PolicyBuilderApiPolicyBuilderStorePoliciesGdpRequest {
    /**
     * ID of central manager.
     * Defaults to: undefined
     * @type string
     * @memberof PolicyBuilderApipolicyBuilderStorePoliciesGdp
     */
    centralManagerId: string
    /**
     * 
     * @type Policybuilderv3StorePolicyGdpRequest
     * @memberof PolicyBuilderApipolicyBuilderStorePoliciesGdp
     */
    policybuilderv3StorePolicyGdpRequest: Policybuilderv3StorePolicyGdpRequest
}

export interface PolicyBuilderApiPolicyBuilderUpdatePolicyRequest {
    /**
     * 
     * @type Policybuilderv3CreateUpdatePolicyRequest
     * @memberof PolicyBuilderApipolicyBuilderUpdatePolicy
     */
    policybuilderv3CreateUpdatePolicyRequest: Policybuilderv3CreateUpdatePolicyRequest
}

export class ObjectPolicyBuilderApi {
    private api: ObservablePolicyBuilderApi

    public constructor(configuration: Configuration, requestFactory?: PolicyBuilderApiRequestFactory, responseProcessor?: PolicyBuilderApiResponseProcessor) {
        this.api = new ObservablePolicyBuilderApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Summary: Clone policy Description: Clone a policy.
     * @param param the request object
     */
    public policyBuilderClonePolicyWithHttpInfo(param: PolicyBuilderApiPolicyBuilderClonePolicyRequest, options?: ConfigurationOptions): Promise<HttpInfo<Policybuilderv3StandardCRUDResponse>> {
        return this.api.policyBuilderClonePolicyWithHttpInfo(param.policyId, param.policybuilderv3ClonePolicyRequest,  options).toPromise();
    }

    /**
     * Summary: Clone policy Description: Clone a policy.
     * @param param the request object
     */
    public policyBuilderClonePolicy(param: PolicyBuilderApiPolicyBuilderClonePolicyRequest, options?: ConfigurationOptions): Promise<Policybuilderv3StandardCRUDResponse> {
        return this.api.policyBuilderClonePolicy(param.policyId, param.policybuilderv3ClonePolicyRequest,  options).toPromise();
    }

    /**
     * Summary: Create policy Description: Create Policy returns response code and message.
     * @param param the request object
     */
    public policyBuilderCreatePolicyWithHttpInfo(param: PolicyBuilderApiPolicyBuilderCreatePolicyRequest, options?: ConfigurationOptions): Promise<HttpInfo<Policybuilderv3CreateUpdatePolicyResponse>> {
        return this.api.policyBuilderCreatePolicyWithHttpInfo(param.policybuilderv3CreateUpdatePolicyRequest,  options).toPromise();
    }

    /**
     * Summary: Create policy Description: Create Policy returns response code and message.
     * @param param the request object
     */
    public policyBuilderCreatePolicy(param: PolicyBuilderApiPolicyBuilderCreatePolicyRequest, options?: ConfigurationOptions): Promise<Policybuilderv3CreateUpdatePolicyResponse> {
        return this.api.policyBuilderCreatePolicy(param.policybuilderv3CreateUpdatePolicyRequest,  options).toPromise();
    }

    /**
     * Summary: Delete GDP policy sync entry Description: Deletes GDP policy from sync collection
     * @param param the request object
     */
    public policyBuilderDeleteGdpSyncEntryWithHttpInfo(param: PolicyBuilderApiPolicyBuilderDeleteGdpSyncEntryRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Policybuilderv3DeleteGdpPolicySyncResponse>> {
        return this.api.policyBuilderDeleteGdpSyncEntryWithHttpInfo(param.syncIds,  options).toPromise();
    }

    /**
     * Summary: Delete GDP policy sync entry Description: Deletes GDP policy from sync collection
     * @param param the request object
     */
    public policyBuilderDeleteGdpSyncEntry(param: PolicyBuilderApiPolicyBuilderDeleteGdpSyncEntryRequest = {}, options?: ConfigurationOptions): Promise<Policybuilderv3DeleteGdpPolicySyncResponse> {
        return this.api.policyBuilderDeleteGdpSyncEntry(param.syncIds,  options).toPromise();
    }

    /**
     * Summary: Delete policies Description: Delete Policy returns response code and message.
     * @param param the request object
     */
    public policyBuilderDeletePoliciesWithHttpInfo(param: PolicyBuilderApiPolicyBuilderDeletePoliciesRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Policybuilderv3StandardCRUDResponse>> {
        return this.api.policyBuilderDeletePoliciesWithHttpInfo(param.policyIds,  options).toPromise();
    }

    /**
     * Summary: Delete policies Description: Delete Policy returns response code and message.
     * @param param the request object
     */
    public policyBuilderDeletePolicies(param: PolicyBuilderApiPolicyBuilderDeletePoliciesRequest = {}, options?: ConfigurationOptions): Promise<Policybuilderv3StandardCRUDResponse> {
        return this.api.policyBuilderDeletePolicies(param.policyIds,  options).toPromise();
    }

    /**
     * Summary: Get GDP policy summary information Description: Get GDP\'s CM\'s policy summary from mogodb
     * @param param the request object
     */
    public policyBuilderGetGdpPolicyMetaDataWithHttpInfo(param: PolicyBuilderApiPolicyBuilderGetGdpPolicyMetaDataRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Policybuilderv3GetGdpPolicyMetaDataResponse>> {
        return this.api.policyBuilderGetGdpPolicyMetaDataWithHttpInfo( options).toPromise();
    }

    /**
     * Summary: Get GDP policy summary information Description: Get GDP\'s CM\'s policy summary from mogodb
     * @param param the request object
     */
    public policyBuilderGetGdpPolicyMetaData(param: PolicyBuilderApiPolicyBuilderGetGdpPolicyMetaDataRequest = {}, options?: ConfigurationOptions): Promise<Policybuilderv3GetGdpPolicyMetaDataResponse> {
        return this.api.policyBuilderGetGdpPolicyMetaData( options).toPromise();
    }

    /**
     * Summary: Get policies Description: Return a list of policies to the caller.
     * @param param the request object
     */
    public policyBuilderGetPoliciesWithHttpInfo(param: PolicyBuilderApiPolicyBuilderGetPoliciesRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Policybuilderv3GetPoliciesResponse>> {
        return this.api.policyBuilderGetPoliciesWithHttpInfo( options).toPromise();
    }

    /**
     * Summary: Get policies Description: Return a list of policies to the caller.
     * @param param the request object
     */
    public policyBuilderGetPolicies(param: PolicyBuilderApiPolicyBuilderGetPoliciesRequest = {}, options?: ConfigurationOptions): Promise<Policybuilderv3GetPoliciesResponse> {
        return this.api.policyBuilderGetPolicies( options).toPromise();
    }

    /**
     * Summary: Get policy details Description: Return a list of rules inside the policy.
     * @param param the request object
     */
    public policyBuilderGetPolicyDetailsWithHttpInfo(param: PolicyBuilderApiPolicyBuilderGetPolicyDetailsRequest, options?: ConfigurationOptions): Promise<HttpInfo<Policybuilderv3GetPolicyDetailsResponse>> {
        return this.api.policyBuilderGetPolicyDetailsWithHttpInfo(param.policyId,  options).toPromise();
    }

    /**
     * Summary: Get policy details Description: Return a list of rules inside the policy.
     * @param param the request object
     */
    public policyBuilderGetPolicyDetails(param: PolicyBuilderApiPolicyBuilderGetPolicyDetailsRequest, options?: ConfigurationOptions): Promise<Policybuilderv3GetPolicyDetailsResponse> {
        return this.api.policyBuilderGetPolicyDetails(param.policyId,  options).toPromise();
    }

    /**
     * Summary: GetPolicy names from rule IDs Description: Return a map where the key is the rule ID and value is the policy name that has the rule ID.
     * @param param the request object
     */
    public policyBuilderGetPolicyNamesFromRuleIDsWithHttpInfo(param: PolicyBuilderApiPolicyBuilderGetPolicyNamesFromRuleIDsRequest, options?: ConfigurationOptions): Promise<HttpInfo<Policybuilderv3GetPolicyNamesFromRuleIDsResponse>> {
        return this.api.policyBuilderGetPolicyNamesFromRuleIDsWithHttpInfo(param.policybuilderv3GetPolicyNamesFromRuleIDsRequest,  options).toPromise();
    }

    /**
     * Summary: GetPolicy names from rule IDs Description: Return a map where the key is the rule ID and value is the policy name that has the rule ID.
     * @param param the request object
     */
    public policyBuilderGetPolicyNamesFromRuleIDs(param: PolicyBuilderApiPolicyBuilderGetPolicyNamesFromRuleIDsRequest, options?: ConfigurationOptions): Promise<Policybuilderv3GetPolicyNamesFromRuleIDsResponse> {
        return this.api.policyBuilderGetPolicyNamesFromRuleIDs(param.policybuilderv3GetPolicyNamesFromRuleIDsRequest,  options).toPromise();
    }

    /**
     * Summary: Get list of synced polices Description: Returns the list and status of sync entries
     * @param param the request object
     */
    public policyBuilderGetPolicySyncListWithHttpInfo(param: PolicyBuilderApiPolicyBuilderGetPolicySyncListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Policybuilderv3GetPolicySyncListResponse>> {
        return this.api.policyBuilderGetPolicySyncListWithHttpInfo( options).toPromise();
    }

    /**
     * Summary: Get list of synced polices Description: Returns the list and status of sync entries
     * @param param the request object
     */
    public policyBuilderGetPolicySyncList(param: PolicyBuilderApiPolicyBuilderGetPolicySyncListRequest = {}, options?: ConfigurationOptions): Promise<Policybuilderv3GetPolicySyncListResponse> {
        return this.api.policyBuilderGetPolicySyncList( options).toPromise();
    }

    /**
     * Summary: Get a particular version of the policy Description: Returns a particular version of policy and response code and message
     * @param param the request object
     */
    public policyBuilderGetPolicyVersionWithHttpInfo(param: PolicyBuilderApiPolicyBuilderGetPolicyVersionRequest, options?: ConfigurationOptions): Promise<HttpInfo<Policybuilderv3GetPolicyVersionResponse>> {
        return this.api.policyBuilderGetPolicyVersionWithHttpInfo(param.policyId, param.version,  options).toPromise();
    }

    /**
     * Summary: Get a particular version of the policy Description: Returns a particular version of policy and response code and message
     * @param param the request object
     */
    public policyBuilderGetPolicyVersion(param: PolicyBuilderApiPolicyBuilderGetPolicyVersionRequest, options?: ConfigurationOptions): Promise<Policybuilderv3GetPolicyVersionResponse> {
        return this.api.policyBuilderGetPolicyVersion(param.policyId, param.version,  options).toPromise();
    }

    /**
     * Summary: Gets policy versions info Description: Returns information of all versions of a policy and response code and message
     * @param param the request object
     */
    public policyBuilderGetPolicyVersionsInfoWithHttpInfo(param: PolicyBuilderApiPolicyBuilderGetPolicyVersionsInfoRequest, options?: ConfigurationOptions): Promise<HttpInfo<Policybuilderv3GetPolicyVersionsInfoResponse>> {
        return this.api.policyBuilderGetPolicyVersionsInfoWithHttpInfo(param.policyId,  options).toPromise();
    }

    /**
     * Summary: Gets policy versions info Description: Returns information of all versions of a policy and response code and message
     * @param param the request object
     */
    public policyBuilderGetPolicyVersionsInfo(param: PolicyBuilderApiPolicyBuilderGetPolicyVersionsInfoRequest, options?: ConfigurationOptions): Promise<Policybuilderv3GetPolicyVersionsInfoResponse> {
        return this.api.policyBuilderGetPolicyVersionsInfo(param.policyId,  options).toPromise();
    }

    /**
     * Summary: Get receivers Description: Get all the receivers associated with actions.
     * @param param the request object
     */
    public policyBuilderGetReceiversWithHttpInfo(param: PolicyBuilderApiPolicyBuilderGetReceiversRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Policybuilderv3GetReceiversResponse>> {
        return this.api.policyBuilderGetReceiversWithHttpInfo(param.actionId, param.validateCache,  options).toPromise();
    }

    /**
     * Summary: Get receivers Description: Get all the receivers associated with actions.
     * @param param the request object
     */
    public policyBuilderGetReceivers(param: PolicyBuilderApiPolicyBuilderGetReceiversRequest = {}, options?: ConfigurationOptions): Promise<Policybuilderv3GetReceiversResponse> {
        return this.api.policyBuilderGetReceivers(param.actionId, param.validateCache,  options).toPromise();
    }

    /**
     * Summary: Get rule metadata Description: Return a list of rule parameters and actions to the caller.
     * @param param the request object
     */
    public policyBuilderGetRuleMetadataWithHttpInfo(param: PolicyBuilderApiPolicyBuilderGetRuleMetadataRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Policybuilderv3RuleMetadataResponse>> {
        return this.api.policyBuilderGetRuleMetadataWithHttpInfo(param.ruleType,  options).toPromise();
    }

    /**
     * Summary: Get rule metadata Description: Return a list of rule parameters and actions to the caller.
     * @param param the request object
     */
    public policyBuilderGetRuleMetadata(param: PolicyBuilderApiPolicyBuilderGetRuleMetadataRequest = {}, options?: ConfigurationOptions): Promise<Policybuilderv3RuleMetadataResponse> {
        return this.api.policyBuilderGetRuleMetadata(param.ruleType,  options).toPromise();
    }

    /**
     * Summary: Insert GDP policy sync entry Description: Inserts GDP policy\'s name into sync collection
     * @param param the request object
     */
    public policyBuilderInsertGdpPolicyWithHttpInfo(param: PolicyBuilderApiPolicyBuilderInsertGdpPolicyRequest, options?: ConfigurationOptions): Promise<HttpInfo<Policybuilderv3InsertGdpPolicySyncResponse>> {
        return this.api.policyBuilderInsertGdpPolicyWithHttpInfo(param.policybuilderv3InsertGdpPolicySyncRequest,  options).toPromise();
    }

    /**
     * Summary: Insert GDP policy sync entry Description: Inserts GDP policy\'s name into sync collection
     * @param param the request object
     */
    public policyBuilderInsertGdpPolicy(param: PolicyBuilderApiPolicyBuilderInsertGdpPolicyRequest, options?: ConfigurationOptions): Promise<Policybuilderv3InsertGdpPolicySyncResponse> {
        return this.api.policyBuilderInsertGdpPolicy(param.policybuilderv3InsertGdpPolicySyncRequest,  options).toPromise();
    }

    /**
     * Summary: Insert GDP policy summaries Description: Inserts GDP\'s CM\'s policy summary information into mogodb. (This API is called from GDP only)
     * @param param the request object
     */
    public policyBuilderInsertGdpPolicyMetaDataWithHttpInfo(param: PolicyBuilderApiPolicyBuilderInsertGdpPolicyMetaDataRequest, options?: ConfigurationOptions): Promise<HttpInfo<Policybuilderv3InsertGdpPolicyMetaDataResponse>> {
        return this.api.policyBuilderInsertGdpPolicyMetaDataWithHttpInfo(param.centralManagerId, param.policybuilderv3InsertGdpPolicyMetaDataRequest,  options).toPromise();
    }

    /**
     * Summary: Insert GDP policy summaries Description: Inserts GDP\'s CM\'s policy summary information into mogodb. (This API is called from GDP only)
     * @param param the request object
     */
    public policyBuilderInsertGdpPolicyMetaData(param: PolicyBuilderApiPolicyBuilderInsertGdpPolicyMetaDataRequest, options?: ConfigurationOptions): Promise<Policybuilderv3InsertGdpPolicyMetaDataResponse> {
        return this.api.policyBuilderInsertGdpPolicyMetaData(param.centralManagerId, param.policybuilderv3InsertGdpPolicyMetaDataRequest,  options).toPromise();
    }

    /**
     * Summary: Install policies Description: Activate Policies request performs activations.
     * @param param the request object
     */
    public policyBuilderInstallPoliciesWithHttpInfo(param: PolicyBuilderApiPolicyBuilderInstallPoliciesRequest, options?: ConfigurationOptions): Promise<HttpInfo<Policybuilderv3StatusResponseBase>> {
        return this.api.policyBuilderInstallPoliciesWithHttpInfo(param.policybuilderv3InstallPoliciesRequest,  options).toPromise();
    }

    /**
     * Summary: Install policies Description: Activate Policies request performs activations.
     * @param param the request object
     */
    public policyBuilderInstallPolicies(param: PolicyBuilderApiPolicyBuilderInstallPoliciesRequest, options?: ConfigurationOptions): Promise<Policybuilderv3StatusResponseBase> {
        return this.api.policyBuilderInstallPolicies(param.policybuilderv3InstallPoliciesRequest,  options).toPromise();
    }

    /**
     * Summary: Integration check Description: Check if integration id is being used in policies.
     * @param param the request object
     */
    public policyBuilderIntegrationCheckWithHttpInfo(param: PolicyBuilderApiPolicyBuilderIntegrationCheckRequest, options?: ConfigurationOptions): Promise<HttpInfo<Policybuilderv3GetIntegrationCheckResponse>> {
        return this.api.policyBuilderIntegrationCheckWithHttpInfo(param.integrationId, param.templateId,  options).toPromise();
    }

    /**
     * Summary: Integration check Description: Check if integration id is being used in policies.
     * @param param the request object
     */
    public policyBuilderIntegrationCheck(param: PolicyBuilderApiPolicyBuilderIntegrationCheckRequest, options?: ConfigurationOptions): Promise<Policybuilderv3GetIntegrationCheckResponse> {
        return this.api.policyBuilderIntegrationCheck(param.integrationId, param.templateId,  options).toPromise();
    }

    /**
     * Summary: Policies groups Description: Get policy groups.
     * @param param the request object
     */
    public policyBuilderPoliciesGroupsWithHttpInfo(param: PolicyBuilderApiPolicyBuilderPoliciesGroupsRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Policybuilderv3GetPoliciesGroupsResponse>> {
        return this.api.policyBuilderPoliciesGroupsWithHttpInfo(param.groupIds,  options).toPromise();
    }

    /**
     * Summary: Policies groups Description: Get policy groups.
     * @param param the request object
     */
    public policyBuilderPoliciesGroups(param: PolicyBuilderApiPolicyBuilderPoliciesGroupsRequest = {}, options?: ConfigurationOptions): Promise<Policybuilderv3GetPoliciesGroupsResponse> {
        return this.api.policyBuilderPoliciesGroups(param.groupIds,  options).toPromise();
    }

    /**
     * Summary: Rule validation Description: Validate a rule parameters and actions.
     * @param param the request object
     */
    public policyBuilderRuleValidationWithHttpInfo(param: PolicyBuilderApiPolicyBuilderRuleValidationRequest, options?: ConfigurationOptions): Promise<HttpInfo<Policybuilderv3StandardCRUDResponse>> {
        return this.api.policyBuilderRuleValidationWithHttpInfo(param.policybuilderv3GetRuleValidationRequest,  options).toPromise();
    }

    /**
     * Summary: Rule validation Description: Validate a rule parameters and actions.
     * @param param the request object
     */
    public policyBuilderRuleValidation(param: PolicyBuilderApiPolicyBuilderRuleValidationRequest, options?: ConfigurationOptions): Promise<Policybuilderv3StandardCRUDResponse> {
        return this.api.policyBuilderRuleValidation(param.policybuilderv3GetRuleValidationRequest,  options).toPromise();
    }

    /**
     * Summary: Store policies Gdp Description: Store policies.  (This API is called from GDP only)
     * @param param the request object
     */
    public policyBuilderStorePoliciesGdpWithHttpInfo(param: PolicyBuilderApiPolicyBuilderStorePoliciesGdpRequest, options?: ConfigurationOptions): Promise<HttpInfo<Policybuilderv3StorePolicyGdpResponse>> {
        return this.api.policyBuilderStorePoliciesGdpWithHttpInfo(param.centralManagerId, param.policybuilderv3StorePolicyGdpRequest,  options).toPromise();
    }

    /**
     * Summary: Store policies Gdp Description: Store policies.  (This API is called from GDP only)
     * @param param the request object
     */
    public policyBuilderStorePoliciesGdp(param: PolicyBuilderApiPolicyBuilderStorePoliciesGdpRequest, options?: ConfigurationOptions): Promise<Policybuilderv3StorePolicyGdpResponse> {
        return this.api.policyBuilderStorePoliciesGdp(param.centralManagerId, param.policybuilderv3StorePolicyGdpRequest,  options).toPromise();
    }

    /**
     * Summary: Update policy Description: Update Policy returns response code and message.
     * @param param the request object
     */
    public policyBuilderUpdatePolicyWithHttpInfo(param: PolicyBuilderApiPolicyBuilderUpdatePolicyRequest, options?: ConfigurationOptions): Promise<HttpInfo<Policybuilderv3CreateUpdatePolicyResponse>> {
        return this.api.policyBuilderUpdatePolicyWithHttpInfo(param.policybuilderv3CreateUpdatePolicyRequest,  options).toPromise();
    }

    /**
     * Summary: Update policy Description: Update Policy returns response code and message.
     * @param param the request object
     */
    public policyBuilderUpdatePolicy(param: PolicyBuilderApiPolicyBuilderUpdatePolicyRequest, options?: ConfigurationOptions): Promise<Policybuilderv3CreateUpdatePolicyResponse> {
        return this.api.policyBuilderUpdatePolicy(param.policybuilderv3CreateUpdatePolicyRequest,  options).toPromise();
    }

}

import { ObservableQSDataLoaderApi } from "./ObservableAPI";
import { QSDataLoaderApiRequestFactory, QSDataLoaderApiResponseProcessor} from "../apis/QSDataLoaderApi";

export interface QSDataLoaderApiQSDataLoaderQSfileValidatorRequest {
    /**
     * 
     * @type Qsdataloaderv3QSfileValidatorRequest
     * @memberof QSDataLoaderApiqSDataLoaderQSfileValidator
     */
    qsdataloaderv3QSfileValidatorRequest: Qsdataloaderv3QSfileValidatorRequest
}

export interface QSDataLoaderApiQSDataLoaderUploadSyntheticDataLoaderRequest {
    /**
     * 
     * @type any
     * @memberof QSDataLoaderApiqSDataLoaderUploadSyntheticDataLoader
     */
    body: any
}

export class ObjectQSDataLoaderApi {
    private api: ObservableQSDataLoaderApi

    public constructor(configuration: Configuration, requestFactory?: QSDataLoaderApiRequestFactory, responseProcessor?: QSDataLoaderApiResponseProcessor) {
        this.api = new ObservableQSDataLoaderApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * QSfileValidator - validate the files before insert happend .
     * @param param the request object
     */
    public qSDataLoaderQSfileValidatorWithHttpInfo(param: QSDataLoaderApiQSDataLoaderQSfileValidatorRequest, options?: ConfigurationOptions): Promise<HttpInfo<Qsdataloaderv3QSfileValidatorResonse>> {
        return this.api.qSDataLoaderQSfileValidatorWithHttpInfo(param.qsdataloaderv3QSfileValidatorRequest,  options).toPromise();
    }

    /**
     * QSfileValidator - validate the files before insert happend .
     * @param param the request object
     */
    public qSDataLoaderQSfileValidator(param: QSDataLoaderApiQSDataLoaderQSfileValidatorRequest, options?: ConfigurationOptions): Promise<Qsdataloaderv3QSfileValidatorResonse> {
        return this.api.qSDataLoaderQSfileValidator(param.qsdataloaderv3QSfileValidatorRequest,  options).toPromise();
    }

    /**
     * UploadSyntheticDataLoader - Insert data into Db after read from .sql file .
     * @param param the request object
     */
    public qSDataLoaderUploadSyntheticDataLoaderWithHttpInfo(param: QSDataLoaderApiQSDataLoaderUploadSyntheticDataLoaderRequest, options?: ConfigurationOptions): Promise<HttpInfo<Qsdataloaderv3QSyntheticDataLoaderResonse>> {
        return this.api.qSDataLoaderUploadSyntheticDataLoaderWithHttpInfo(param.body,  options).toPromise();
    }

    /**
     * UploadSyntheticDataLoader - Insert data into Db after read from .sql file .
     * @param param the request object
     */
    public qSDataLoaderUploadSyntheticDataLoader(param: QSDataLoaderApiQSDataLoaderUploadSyntheticDataLoaderRequest, options?: ConfigurationOptions): Promise<Qsdataloaderv3QSyntheticDataLoaderResonse> {
        return this.api.qSDataLoaderUploadSyntheticDataLoader(param.body,  options).toPromise();
    }

}

import { ObservableQSDataManagerApi } from "./ObservableAPI";
import { QSDataManagerApiRequestFactory, QSDataManagerApiResponseProcessor} from "../apis/QSDataManagerApi";

export interface QSDataManagerApiQSDataManagerGetMasterDataRequest {
}

export interface QSDataManagerApiQSDataManagerGetPluginDataRequest {
}

export interface QSDataManagerApiQSDataManagerRegisterScanRequest {
    /**
     * 
     * @type Qspmdatamanagerv3ScanRequest
     * @memberof QSDataManagerApiqSDataManagerRegisterScan
     */
    qspmdatamanagerv3ScanRequest: Qspmdatamanagerv3ScanRequest
}

export interface QSDataManagerApiQSDataManagerRetrieveScanRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof QSDataManagerApiqSDataManagerRetrieveScan
     */
    scanId: string
}

export class ObjectQSDataManagerApi {
    private api: ObservableQSDataManagerApi

    public constructor(configuration: Configuration, requestFactory?: QSDataManagerApiRequestFactory, responseProcessor?: QSDataManagerApiResponseProcessor) {
        this.api = new ObservableQSDataManagerApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Summary: master data for all entities Description: Retrieves All Dimension and Fact tables data.
     * @param param the request object
     */
    public qSDataManagerGetMasterDataWithHttpInfo(param: QSDataManagerApiQSDataManagerGetMasterDataRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Qspmdatamanagerv3MasterDataResponse>> {
        return this.api.qSDataManagerGetMasterDataWithHttpInfo( options).toPromise();
    }

    /**
     * Summary: master data for all entities Description: Retrieves All Dimension and Fact tables data.
     * @param param the request object
     */
    public qSDataManagerGetMasterData(param: QSDataManagerApiQSDataManagerGetMasterDataRequest = {}, options?: ConfigurationOptions): Promise<Qspmdatamanagerv3MasterDataResponse> {
        return this.api.qSDataManagerGetMasterData( options).toPromise();
    }

    /**
     * Summary: Plugins Details Description: Retrieves All plugins information.
     * @param param the request object
     */
    public qSDataManagerGetPluginDataWithHttpInfo(param: QSDataManagerApiQSDataManagerGetPluginDataRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Qspmdatamanagerv3PluginDataResponse>> {
        return this.api.qSDataManagerGetPluginDataWithHttpInfo( options).toPromise();
    }

    /**
     * Summary: Plugins Details Description: Retrieves All plugins information.
     * @param param the request object
     */
    public qSDataManagerGetPluginData(param: QSDataManagerApiQSDataManagerGetPluginDataRequest = {}, options?: ConfigurationOptions): Promise<Qspmdatamanagerv3PluginDataResponse> {
        return this.api.qSDataManagerGetPluginData( options).toPromise();
    }

    /**
     * Summary: Insert ScanDetails Description: Register new data into scan dimension table.
     * @param param the request object
     */
    public qSDataManagerRegisterScanWithHttpInfo(param: QSDataManagerApiQSDataManagerRegisterScanRequest, options?: ConfigurationOptions): Promise<HttpInfo<Qspmdatamanagerv3ScanResponse>> {
        return this.api.qSDataManagerRegisterScanWithHttpInfo(param.qspmdatamanagerv3ScanRequest,  options).toPromise();
    }

    /**
     * Summary: Insert ScanDetails Description: Register new data into scan dimension table.
     * @param param the request object
     */
    public qSDataManagerRegisterScan(param: QSDataManagerApiQSDataManagerRegisterScanRequest, options?: ConfigurationOptions): Promise<Qspmdatamanagerv3ScanResponse> {
        return this.api.qSDataManagerRegisterScan(param.qspmdatamanagerv3ScanRequest,  options).toPromise();
    }

    /**
     * Summary: Fetch ScanDetails Description: Fetch details from scan dimension table.
     * @param param the request object
     */
    public qSDataManagerRetrieveScanWithHttpInfo(param: QSDataManagerApiQSDataManagerRetrieveScanRequest, options?: ConfigurationOptions): Promise<HttpInfo<Qspmdatamanagerv3ScanResponse>> {
        return this.api.qSDataManagerRetrieveScanWithHttpInfo(param.scanId,  options).toPromise();
    }

    /**
     * Summary: Fetch ScanDetails Description: Fetch details from scan dimension table.
     * @param param the request object
     */
    public qSDataManagerRetrieveScan(param: QSDataManagerApiQSDataManagerRetrieveScanRequest, options?: ConfigurationOptions): Promise<Qspmdatamanagerv3ScanResponse> {
        return this.api.qSDataManagerRetrieveScan(param.scanId,  options).toPromise();
    }

}

import { ObservableQSPluginManagerApi } from "./ObservableAPI";
import { QSPluginManagerApiRequestFactory, QSPluginManagerApiResponseProcessor} from "../apis/QSPluginManagerApi";

export interface QSPluginManagerApiQSPluginManagerInvokeAppProvRequest {
    /**
     * Unique identifier for the plugin
     * Defaults to: undefined
     * @type string
     * @memberof QSPluginManagerApiqSPluginManagerInvokeAppProv
     */
    pluginId: string
    /**
     * 
     * @type Qspmpluginmanagerv3PluginRQ
     * @memberof QSPluginManagerApiqSPluginManagerInvokeAppProv
     */
    qspmpluginmanagerv3PluginRQ: Qspmpluginmanagerv3PluginRQ
}

export interface QSPluginManagerApiQSPluginManagerInvokeExplorerV1Request {
    /**
     * Unique identifier for the plugin
     * Defaults to: undefined
     * @type string
     * @memberof QSPluginManagerApiqSPluginManagerInvokeExplorerV1
     */
    pluginId: string
    /**
     * 
     * @type Qspmpluginmanagerv3PluginRQ
     * @memberof QSPluginManagerApiqSPluginManagerInvokeExplorerV1
     */
    qspmpluginmanagerv3PluginRQ: Qspmpluginmanagerv3PluginRQ
}

export interface QSPluginManagerApiQSPluginManagerInvokeExplorerV2Request {
    /**
     * Unique identifier for the plugin
     * Defaults to: undefined
     * @type string
     * @memberof QSPluginManagerApiqSPluginManagerInvokeExplorerV2
     */
    pluginId: string
    /**
     * 
     * @type Qspmpluginmanagerv3PluginRQ
     * @memberof QSPluginManagerApiqSPluginManagerInvokeExplorerV2
     */
    qspmpluginmanagerv3PluginRQ: Qspmpluginmanagerv3PluginRQ
}

export interface QSPluginManagerApiQSPluginManagerInvokePluginRequest {
    /**
     * Unique identifier for the plugin
     * Defaults to: undefined
     * @type string
     * @memberof QSPluginManagerApiqSPluginManagerInvokePlugin
     */
    pluginId: string
    /**
     * 
     * @type Qspmpluginmanagerv3PluginRQ
     * @memberof QSPluginManagerApiqSPluginManagerInvokePlugin
     */
    qspmpluginmanagerv3PluginRQ: Qspmpluginmanagerv3PluginRQ
}

export interface QSPluginManagerApiQSPluginManagerInvokePolicyRequest {
    /**
     * Unique identifier for the plugin
     * Defaults to: undefined
     * @type string
     * @memberof QSPluginManagerApiqSPluginManagerInvokePolicy
     */
    pluginId: string
    /**
     * 
     * @type Qspmpluginmanagerv3PolicyPluginRQ
     * @memberof QSPluginManagerApiqSPluginManagerInvokePolicy
     */
    qspmpluginmanagerv3PolicyPluginRQ: Qspmpluginmanagerv3PolicyPluginRQ
}

export class ObjectQSPluginManagerApi {
    private api: ObservableQSPluginManagerApi

    public constructor(configuration: Configuration, requestFactory?: QSPluginManagerApiRequestFactory, responseProcessor?: QSPluginManagerApiResponseProcessor) {
        this.api = new ObservableQSPluginManagerApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Summary: Invoke only application provisioning data plugin Description:Parses app input file and triggers dataload
     * @param param the request object
     */
    public qSPluginManagerInvokeAppProvWithHttpInfo(param: QSPluginManagerApiQSPluginManagerInvokeAppProvRequest, options?: ConfigurationOptions): Promise<HttpInfo<Qspmpluginmanagerv3PluginRS>> {
        return this.api.qSPluginManagerInvokeAppProvWithHttpInfo(param.pluginId, param.qspmpluginmanagerv3PluginRQ,  options).toPromise();
    }

    /**
     * Summary: Invoke only application provisioning data plugin Description:Parses app input file and triggers dataload
     * @param param the request object
     */
    public qSPluginManagerInvokeAppProv(param: QSPluginManagerApiQSPluginManagerInvokeAppProvRequest, options?: ConfigurationOptions): Promise<Qspmpluginmanagerv3PluginRS> {
        return this.api.qSPluginManagerInvokeAppProv(param.pluginId, param.qspmpluginmanagerv3PluginRQ,  options).toPromise();
    }

    /**
     * Summary: Invoke only explorer inventory data plugin Description:Parses explorer input file and triggers dataload
     * @param param the request object
     */
    public qSPluginManagerInvokeExplorerV1WithHttpInfo(param: QSPluginManagerApiQSPluginManagerInvokeExplorerV1Request, options?: ConfigurationOptions): Promise<HttpInfo<Qspmpluginmanagerv3PluginRS>> {
        return this.api.qSPluginManagerInvokeExplorerV1WithHttpInfo(param.pluginId, param.qspmpluginmanagerv3PluginRQ,  options).toPromise();
    }

    /**
     * Summary: Invoke only explorer inventory data plugin Description:Parses explorer input file and triggers dataload
     * @param param the request object
     */
    public qSPluginManagerInvokeExplorerV1(param: QSPluginManagerApiQSPluginManagerInvokeExplorerV1Request, options?: ConfigurationOptions): Promise<Qspmpluginmanagerv3PluginRS> {
        return this.api.qSPluginManagerInvokeExplorerV1(param.pluginId, param.qspmpluginmanagerv3PluginRQ,  options).toPromise();
    }

    /**
     * Summary: Invoke only explorer analytics data plugin Description:Parses explorer input file and triggers dataload
     * @param param the request object
     */
    public qSPluginManagerInvokeExplorerV2WithHttpInfo(param: QSPluginManagerApiQSPluginManagerInvokeExplorerV2Request, options?: ConfigurationOptions): Promise<HttpInfo<Qspmpluginmanagerv3PluginRS>> {
        return this.api.qSPluginManagerInvokeExplorerV2WithHttpInfo(param.pluginId, param.qspmpluginmanagerv3PluginRQ,  options).toPromise();
    }

    /**
     * Summary: Invoke only explorer analytics data plugin Description:Parses explorer input file and triggers dataload
     * @param param the request object
     */
    public qSPluginManagerInvokeExplorerV2(param: QSPluginManagerApiQSPluginManagerInvokeExplorerV2Request, options?: ConfigurationOptions): Promise<Qspmpluginmanagerv3PluginRS> {
        return this.api.qSPluginManagerInvokeExplorerV2(param.pluginId, param.qspmpluginmanagerv3PluginRQ,  options).toPromise();
    }

    /**
     * Summary: Invoke consolidated or only network data plugin Description:Parses input files and triggers dataload
     * @param param the request object
     */
    public qSPluginManagerInvokePluginWithHttpInfo(param: QSPluginManagerApiQSPluginManagerInvokePluginRequest, options?: ConfigurationOptions): Promise<HttpInfo<Qspmpluginmanagerv3PluginRS>> {
        return this.api.qSPluginManagerInvokePluginWithHttpInfo(param.pluginId, param.qspmpluginmanagerv3PluginRQ,  options).toPromise();
    }

    /**
     * Summary: Invoke consolidated or only network data plugin Description:Parses input files and triggers dataload
     * @param param the request object
     */
    public qSPluginManagerInvokePlugin(param: QSPluginManagerApiQSPluginManagerInvokePluginRequest, options?: ConfigurationOptions): Promise<Qspmpluginmanagerv3PluginRS> {
        return this.api.qSPluginManagerInvokePlugin(param.pluginId, param.qspmpluginmanagerv3PluginRQ,  options).toPromise();
    }

    /**
     * Summary: Invoke only policy data plugin Description:Parses policy input file and triggers dataload
     * @param param the request object
     */
    public qSPluginManagerInvokePolicyWithHttpInfo(param: QSPluginManagerApiQSPluginManagerInvokePolicyRequest, options?: ConfigurationOptions): Promise<HttpInfo<Qspmpluginmanagerv3PolicyPluginRS>> {
        return this.api.qSPluginManagerInvokePolicyWithHttpInfo(param.pluginId, param.qspmpluginmanagerv3PolicyPluginRQ,  options).toPromise();
    }

    /**
     * Summary: Invoke only policy data plugin Description:Parses policy input file and triggers dataload
     * @param param the request object
     */
    public qSPluginManagerInvokePolicy(param: QSPluginManagerApiQSPluginManagerInvokePolicyRequest, options?: ConfigurationOptions): Promise<Qspmpluginmanagerv3PolicyPluginRS> {
        return this.api.qSPluginManagerInvokePolicy(param.pluginId, param.qspmpluginmanagerv3PolicyPluginRQ,  options).toPromise();
    }

}

import { ObservableQSPolicyManagerApi } from "./ObservableAPI";
import { QSPolicyManagerApiRequestFactory, QSPolicyManagerApiResponseProcessor} from "../apis/QSPolicyManagerApi";

export interface QSPolicyManagerApiQSPolicyManagerBatchStatusUpdateRequest {
    /**
     * 
     * @type any
     * @memberof QSPolicyManagerApiqSPolicyManagerBatchStatusUpdate
     */
    body: any
}

export interface QSPolicyManagerApiQSPolicyManagerConfigUpdateRequest {
    /**
     * 
     * @type Qspmpolicymanagerv3UpdateConfigsRequest
     * @memberof QSPolicyManagerApiqSPolicyManagerConfigUpdate
     */
    qspmpolicymanagerv3UpdateConfigsRequest: Qspmpolicymanagerv3UpdateConfigsRequest
}

export interface QSPolicyManagerApiQSPolicyManagerCreateTicketRequest {
    /**
     * 
     * @type Qspmpolicymanagerv3CreateTicketRequest
     * @memberof QSPolicyManagerApiqSPolicyManagerCreateTicket
     */
    qspmpolicymanagerv3CreateTicketRequest: Qspmpolicymanagerv3CreateTicketRequest
}

export interface QSPolicyManagerApiQSPolicyManagerFetchFilesfromBucketsRequest {
}

export interface QSPolicyManagerApiQSPolicyManagerProcessPolicyDimentionRecordsRequest {
    /**
     * 
     * @type Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest
     * @memberof QSPolicyManagerApiqSPolicyManagerProcessPolicyDimentionRecords
     */
    qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest: Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest
}

export interface QSPolicyManagerApiQSPolicyManagerUpdateTicketStatusRequest {
    /**
     * 
     * @type Qspmpolicymanagerv3UpdateTicketStatusRequest
     * @memberof QSPolicyManagerApiqSPolicyManagerUpdateTicketStatus
     */
    qspmpolicymanagerv3UpdateTicketStatusRequest: Qspmpolicymanagerv3UpdateTicketStatusRequest
}

export class ObjectQSPolicyManagerApi {
    private api: ObservableQSPolicyManagerApi

    public constructor(configuration: Configuration, requestFactory?: QSPolicyManagerApiRequestFactory, responseProcessor?: QSPolicyManagerApiResponseProcessor) {
        this.api = new ObservableQSPolicyManagerApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * BatchStatusUpdate - trigger the batch to update the status of the Ticket .
     * @param param the request object
     */
    public qSPolicyManagerBatchStatusUpdateWithHttpInfo(param: QSPolicyManagerApiQSPolicyManagerBatchStatusUpdateRequest, options?: ConfigurationOptions): Promise<HttpInfo<Qspmpolicymanagerv3StandardEmptyResponse>> {
        return this.api.qSPolicyManagerBatchStatusUpdateWithHttpInfo(param.body,  options).toPromise();
    }

    /**
     * BatchStatusUpdate - trigger the batch to update the status of the Ticket .
     * @param param the request object
     */
    public qSPolicyManagerBatchStatusUpdate(param: QSPolicyManagerApiQSPolicyManagerBatchStatusUpdateRequest, options?: ConfigurationOptions): Promise<Qspmpolicymanagerv3StandardEmptyResponse> {
        return this.api.qSPolicyManagerBatchStatusUpdate(param.body,  options).toPromise();
    }

    /**
     * ConfigUpdate - this function update Crypto Risk Factor Weight in Db2 as well as Mongodb.
     * @param param the request object
     */
    public qSPolicyManagerConfigUpdateWithHttpInfo(param: QSPolicyManagerApiQSPolicyManagerConfigUpdateRequest, options?: ConfigurationOptions): Promise<HttpInfo<Qspmpolicymanagerv3APIResonse>> {
        return this.api.qSPolicyManagerConfigUpdateWithHttpInfo(param.qspmpolicymanagerv3UpdateConfigsRequest,  options).toPromise();
    }

    /**
     * ConfigUpdate - this function update Crypto Risk Factor Weight in Db2 as well as Mongodb.
     * @param param the request object
     */
    public qSPolicyManagerConfigUpdate(param: QSPolicyManagerApiQSPolicyManagerConfigUpdateRequest, options?: ConfigurationOptions): Promise<Qspmpolicymanagerv3APIResonse> {
        return this.api.qSPolicyManagerConfigUpdate(param.qspmpolicymanagerv3UpdateConfigsRequest,  options).toPromise();
    }

    /**
     * CreateTicket - Create a new Incident .
     * @param param the request object
     */
    public qSPolicyManagerCreateTicketWithHttpInfo(param: QSPolicyManagerApiQSPolicyManagerCreateTicketRequest, options?: ConfigurationOptions): Promise<HttpInfo<Qspmpolicymanagerv3CreateTicketResponse>> {
        return this.api.qSPolicyManagerCreateTicketWithHttpInfo(param.qspmpolicymanagerv3CreateTicketRequest,  options).toPromise();
    }

    /**
     * CreateTicket - Create a new Incident .
     * @param param the request object
     */
    public qSPolicyManagerCreateTicket(param: QSPolicyManagerApiQSPolicyManagerCreateTicketRequest, options?: ConfigurationOptions): Promise<Qspmpolicymanagerv3CreateTicketResponse> {
        return this.api.qSPolicyManagerCreateTicket(param.qspmpolicymanagerv3CreateTicketRequest,  options).toPromise();
    }

    /**
     * FetchFilesfromBuckets - fetch the file(s) from bucket of the object storage
     * @param param the request object
     */
    public qSPolicyManagerFetchFilesfromBucketsWithHttpInfo(param: QSPolicyManagerApiQSPolicyManagerFetchFilesfromBucketsRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Qspmpolicymanagerv3FetchObjectStoreFileResponse>> {
        return this.api.qSPolicyManagerFetchFilesfromBucketsWithHttpInfo( options).toPromise();
    }

    /**
     * FetchFilesfromBuckets - fetch the file(s) from bucket of the object storage
     * @param param the request object
     */
    public qSPolicyManagerFetchFilesfromBuckets(param: QSPolicyManagerApiQSPolicyManagerFetchFilesfromBucketsRequest = {}, options?: ConfigurationOptions): Promise<Qspmpolicymanagerv3FetchObjectStoreFileResponse> {
        return this.api.qSPolicyManagerFetchFilesfromBuckets( options).toPromise();
    }

    /**
     * ProcessPolicyDimentionRecords - fetch the records from Policy Dimention and update Policy Fact table
     * @param param the request object
     */
    public qSPolicyManagerProcessPolicyDimentionRecordsWithHttpInfo(param: QSPolicyManagerApiQSPolicyManagerProcessPolicyDimentionRecordsRequest, options?: ConfigurationOptions): Promise<HttpInfo<Qspmpolicymanagerv3ProcessPolicyDimentionRecordsResonse>> {
        return this.api.qSPolicyManagerProcessPolicyDimentionRecordsWithHttpInfo(param.qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest,  options).toPromise();
    }

    /**
     * ProcessPolicyDimentionRecords - fetch the records from Policy Dimention and update Policy Fact table
     * @param param the request object
     */
    public qSPolicyManagerProcessPolicyDimentionRecords(param: QSPolicyManagerApiQSPolicyManagerProcessPolicyDimentionRecordsRequest, options?: ConfigurationOptions): Promise<Qspmpolicymanagerv3ProcessPolicyDimentionRecordsResonse> {
        return this.api.qSPolicyManagerProcessPolicyDimentionRecords(param.qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest,  options).toPromise();
    }

    /**
     * UpdateTicketStatus - Update the ticket status based on the IntegrationId and TicketId .
     * @param param the request object
     */
    public qSPolicyManagerUpdateTicketStatusWithHttpInfo(param: QSPolicyManagerApiQSPolicyManagerUpdateTicketStatusRequest, options?: ConfigurationOptions): Promise<HttpInfo<Qspmpolicymanagerv3UpdateTicketStatusResponse>> {
        return this.api.qSPolicyManagerUpdateTicketStatusWithHttpInfo(param.qspmpolicymanagerv3UpdateTicketStatusRequest,  options).toPromise();
    }

    /**
     * UpdateTicketStatus - Update the ticket status based on the IntegrationId and TicketId .
     * @param param the request object
     */
    public qSPolicyManagerUpdateTicketStatus(param: QSPolicyManagerApiQSPolicyManagerUpdateTicketStatusRequest, options?: ConfigurationOptions): Promise<Qspmpolicymanagerv3UpdateTicketStatusResponse> {
        return this.api.qSPolicyManagerUpdateTicketStatus(param.qspmpolicymanagerv3UpdateTicketStatusRequest,  options).toPromise();
    }

}

import { ObservableReportsRunnerApi } from "./ObservableAPI";
import { ReportsRunnerApiRequestFactory, ReportsRunnerApiResponseProcessor} from "../apis/ReportsRunnerApi";

export interface ReportsRunnerApiReportsRunnerGetActiveQueriesRequest {
    /**
     * 
     * @type Reportsrunnerv3GetActiveQueriesRequest
     * @memberof ReportsRunnerApireportsRunnerGetActiveQueries
     */
    reportsrunnerv3GetActiveQueriesRequest: Reportsrunnerv3GetActiveQueriesRequest
}

export interface ReportsRunnerApiReportsRunnerGetAuditDataCountRequest {
    /**
     * Optional: the ID of the Report we wish to run (e.g. 000000000000000000000905).
     * Defaults to: undefined
     * @type string
     * @memberof ReportsRunnerApireportsRunnerGetAuditDataCount
     */
    reportId: string
    /**
     * 
     * @type Reportsrunnerv3GetAuditDataCountRequest
     * @memberof ReportsRunnerApireportsRunnerGetAuditDataCount
     */
    reportsrunnerv3GetAuditDataCountRequest: Reportsrunnerv3GetAuditDataCountRequest
}

export interface ReportsRunnerApiReportsRunnerGetChartDataRequest {
    /**
     * 
     * @type Reportsrunnerv3GetChartDataRequest
     * @memberof ReportsRunnerApireportsRunnerGetChartData
     */
    reportsrunnerv3GetChartDataRequest: Reportsrunnerv3GetChartDataRequest
}

export interface ReportsRunnerApiReportsRunnerGetChartDatav2Request {
    /**
     * 
     * @type Reportsrunnerv3GetChartDataRequestv2
     * @memberof ReportsRunnerApireportsRunnerGetChartDatav2
     */
    reportsrunnerv3GetChartDataRequestv2: Reportsrunnerv3GetChartDataRequestv2
}

export interface ReportsRunnerApiReportsRunnerGetReportColumnFacetRequest {
    /**
     * 
     * @type Reportsrunnerv3GetReportColumnFacetRequest
     * @memberof ReportsRunnerApireportsRunnerGetReportColumnFacet
     */
    reportsrunnerv3GetReportColumnFacetRequest: Reportsrunnerv3GetReportColumnFacetRequest
}

export interface ReportsRunnerApiReportsRunnerGetReportDataCountRequest {
    /**
     * 
     * @type Reportsrunnerv3GetReportDataCountRequest
     * @memberof ReportsRunnerApireportsRunnerGetReportDataCount
     */
    reportsrunnerv3GetReportDataCountRequest: Reportsrunnerv3GetReportDataCountRequest
}

export interface ReportsRunnerApiReportsRunnerRunAuditReportRequest {
    /**
     * The ID of the Report we wish to run (e.g. 000000000000000000000905).
     * Defaults to: undefined
     * @type string
     * @memberof ReportsRunnerApireportsRunnerRunAuditReport
     */
    reportId: string
    /**
     * 
     * @type Reportsrunnerv3RunAuditReportRequest
     * @memberof ReportsRunnerApireportsRunnerRunAuditReport
     */
    reportsrunnerv3RunAuditReportRequest: Reportsrunnerv3RunAuditReportRequest
}

export interface ReportsRunnerApiReportsRunnerRunReportRequest {
    /**
     * 
     * @type Reportsrunnerv3RunReportRequest
     * @memberof ReportsRunnerApireportsRunnerRunReport
     */
    reportsrunnerv3RunReportRequest: Reportsrunnerv3RunReportRequest
}

export interface ReportsRunnerApiReportsRunnerStopQueryRequest {
    /**
     * 
     * @type Reportsrunnerv3StopQueryRequest
     * @memberof ReportsRunnerApireportsRunnerStopQuery
     */
    reportsrunnerv3StopQueryRequest: Reportsrunnerv3StopQueryRequest
}

export class ObjectReportsRunnerApi {
    private api: ObservableReportsRunnerApi

    public constructor(configuration: Configuration, requestFactory?: ReportsRunnerApiRequestFactory, responseProcessor?: ReportsRunnerApiResponseProcessor) {
        this.api = new ObservableReportsRunnerApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Summary: Get running queries Description: Get queries that are running more than certain time
     * @param param the request object
     */
    public reportsRunnerGetActiveQueriesWithHttpInfo(param: ReportsRunnerApiReportsRunnerGetActiveQueriesRequest, options?: ConfigurationOptions): Promise<HttpInfo<Reportsrunnerv3GetActiveQueriesResponse>> {
        return this.api.reportsRunnerGetActiveQueriesWithHttpInfo(param.reportsrunnerv3GetActiveQueriesRequest,  options).toPromise();
    }

    /**
     * Summary: Get running queries Description: Get queries that are running more than certain time
     * @param param the request object
     */
    public reportsRunnerGetActiveQueries(param: ReportsRunnerApiReportsRunnerGetActiveQueriesRequest, options?: ConfigurationOptions): Promise<Reportsrunnerv3GetActiveQueriesResponse> {
        return this.api.reportsRunnerGetActiveQueries(param.reportsrunnerv3GetActiveQueriesRequest,  options).toPromise();
    }

    /**
     * Summary: Get audit data count Description: Get audit data.
     * @param param the request object
     */
    public reportsRunnerGetAuditDataCountWithHttpInfo(param: ReportsRunnerApiReportsRunnerGetAuditDataCountRequest, options?: ConfigurationOptions): Promise<HttpInfo<Reportsrunnerv3GetReportDataCountResponse>> {
        return this.api.reportsRunnerGetAuditDataCountWithHttpInfo(param.reportId, param.reportsrunnerv3GetAuditDataCountRequest,  options).toPromise();
    }

    /**
     * Summary: Get audit data count Description: Get audit data.
     * @param param the request object
     */
    public reportsRunnerGetAuditDataCount(param: ReportsRunnerApiReportsRunnerGetAuditDataCountRequest, options?: ConfigurationOptions): Promise<Reportsrunnerv3GetReportDataCountResponse> {
        return this.api.reportsRunnerGetAuditDataCount(param.reportId, param.reportsrunnerv3GetAuditDataCountRequest,  options).toPromise();
    }

    /**
     * Summary: Get chart data Description: Get Chart data by chart ID or by specifying report definition and chart settings.
     * @param param the request object
     */
    public reportsRunnerGetChartDataWithHttpInfo(param: ReportsRunnerApiReportsRunnerGetChartDataRequest, options?: ConfigurationOptions): Promise<HttpInfo<Reportsrunnerv3GetChartDataResponse>> {
        return this.api.reportsRunnerGetChartDataWithHttpInfo(param.reportsrunnerv3GetChartDataRequest,  options).toPromise();
    }

    /**
     * Summary: Get chart data Description: Get Chart data by chart ID or by specifying report definition and chart settings.
     * @param param the request object
     */
    public reportsRunnerGetChartData(param: ReportsRunnerApiReportsRunnerGetChartDataRequest, options?: ConfigurationOptions): Promise<Reportsrunnerv3GetChartDataResponse> {
        return this.api.reportsRunnerGetChartData(param.reportsrunnerv3GetChartDataRequest,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public reportsRunnerGetChartDatav2WithHttpInfo(param: ReportsRunnerApiReportsRunnerGetChartDatav2Request, options?: ConfigurationOptions): Promise<HttpInfo<Reportsrunnerv3GetChartDataResponsev2>> {
        return this.api.reportsRunnerGetChartDatav2WithHttpInfo(param.reportsrunnerv3GetChartDataRequestv2,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public reportsRunnerGetChartDatav2(param: ReportsRunnerApiReportsRunnerGetChartDatav2Request, options?: ConfigurationOptions): Promise<Reportsrunnerv3GetChartDataResponsev2> {
        return this.api.reportsRunnerGetChartDatav2(param.reportsrunnerv3GetChartDataRequestv2,  options).toPromise();
    }

    /**
     * Summary: Get report column facet Description: Get counts that is group by values for the selected column.
     * @param param the request object
     */
    public reportsRunnerGetReportColumnFacetWithHttpInfo(param: ReportsRunnerApiReportsRunnerGetReportColumnFacetRequest, options?: ConfigurationOptions): Promise<HttpInfo<Reportsrunnerv3GetReportColumnFacetResponse>> {
        return this.api.reportsRunnerGetReportColumnFacetWithHttpInfo(param.reportsrunnerv3GetReportColumnFacetRequest,  options).toPromise();
    }

    /**
     * Summary: Get report column facet Description: Get counts that is group by values for the selected column.
     * @param param the request object
     */
    public reportsRunnerGetReportColumnFacet(param: ReportsRunnerApiReportsRunnerGetReportColumnFacetRequest, options?: ConfigurationOptions): Promise<Reportsrunnerv3GetReportColumnFacetResponse> {
        return this.api.reportsRunnerGetReportColumnFacet(param.reportsrunnerv3GetReportColumnFacetRequest,  options).toPromise();
    }

    /**
     * Summary: Get report data count Description: Get report data.
     * @param param the request object
     */
    public reportsRunnerGetReportDataCountWithHttpInfo(param: ReportsRunnerApiReportsRunnerGetReportDataCountRequest, options?: ConfigurationOptions): Promise<HttpInfo<Reportsrunnerv3GetReportDataCountResponse>> {
        return this.api.reportsRunnerGetReportDataCountWithHttpInfo(param.reportsrunnerv3GetReportDataCountRequest,  options).toPromise();
    }

    /**
     * Summary: Get report data count Description: Get report data.
     * @param param the request object
     */
    public reportsRunnerGetReportDataCount(param: ReportsRunnerApiReportsRunnerGetReportDataCountRequest, options?: ConfigurationOptions): Promise<Reportsrunnerv3GetReportDataCountResponse> {
        return this.api.reportsRunnerGetReportDataCount(param.reportsrunnerv3GetReportDataCountRequest,  options).toPromise();
    }

    /**
     * Summary: Run audit report Description: Run task report by SQL based ob report ID and filter definition.
     * @param param the request object
     */
    public reportsRunnerRunAuditReportWithHttpInfo(param: ReportsRunnerApiReportsRunnerRunAuditReportRequest, options?: ConfigurationOptions): Promise<HttpInfo<StreamResultOfReportsrunnerv3RunReportResponse>> {
        return this.api.reportsRunnerRunAuditReportWithHttpInfo(param.reportId, param.reportsrunnerv3RunAuditReportRequest,  options).toPromise();
    }

    /**
     * Summary: Run audit report Description: Run task report by SQL based ob report ID and filter definition.
     * @param param the request object
     */
    public reportsRunnerRunAuditReport(param: ReportsRunnerApiReportsRunnerRunAuditReportRequest, options?: ConfigurationOptions): Promise<StreamResultOfReportsrunnerv3RunReportResponse> {
        return this.api.reportsRunnerRunAuditReport(param.reportId, param.reportsrunnerv3RunAuditReportRequest,  options).toPromise();
    }

    /**
     * Summary: Run report Description: Run report by report ID or by specifying report definition.
     * @param param the request object
     */
    public reportsRunnerRunReportWithHttpInfo(param: ReportsRunnerApiReportsRunnerRunReportRequest, options?: ConfigurationOptions): Promise<HttpInfo<StreamResultOfReportsrunnerv3RunReportResponse>> {
        return this.api.reportsRunnerRunReportWithHttpInfo(param.reportsrunnerv3RunReportRequest,  options).toPromise();
    }

    /**
     * Summary: Run report Description: Run report by report ID or by specifying report definition.
     * @param param the request object
     */
    public reportsRunnerRunReport(param: ReportsRunnerApiReportsRunnerRunReportRequest, options?: ConfigurationOptions): Promise<StreamResultOfReportsrunnerv3RunReportResponse> {
        return this.api.reportsRunnerRunReport(param.reportsrunnerv3RunReportRequest,  options).toPromise();
    }

    /**
     * Summary: Stop query Description: Stop a query based on the id
     * @param param the request object
     */
    public reportsRunnerStopQueryWithHttpInfo(param: ReportsRunnerApiReportsRunnerStopQueryRequest, options?: ConfigurationOptions): Promise<HttpInfo<Reportsrunnerv3StopQueryResponse>> {
        return this.api.reportsRunnerStopQueryWithHttpInfo(param.reportsrunnerv3StopQueryRequest,  options).toPromise();
    }

    /**
     * Summary: Stop query Description: Stop a query based on the id
     * @param param the request object
     */
    public reportsRunnerStopQuery(param: ReportsRunnerApiReportsRunnerStopQueryRequest, options?: ConfigurationOptions): Promise<Reportsrunnerv3StopQueryResponse> {
        return this.api.reportsRunnerStopQuery(param.reportsrunnerv3StopQueryRequest,  options).toPromise();
    }

}

import { ObservableReportsServiceApi } from "./ObservableAPI";
import { ReportsServiceApiRequestFactory, ReportsServiceApiResponseProcessor} from "../apis/ReportsServiceApi";

export interface ReportsServiceApiReportsServiceCreateCategoryRequest {
    /**
     * 
     * @type Reportsv3CreateCategoryRequest
     * @memberof ReportsServiceApireportsServiceCreateCategory
     */
    reportsv3CreateCategoryRequest: Reportsv3CreateCategoryRequest
}

export interface ReportsServiceApiReportsServiceCreateChartRequest {
    /**
     * 
     * @type Reportsv3CreateChartRequest
     * @memberof ReportsServiceApireportsServiceCreateChart
     */
    reportsv3CreateChartRequest: Reportsv3CreateChartRequest
}

export interface ReportsServiceApiReportsServiceCreateChartTemplatev2Request {
    /**
     * 
     * @type Reportsv3CreateChartTemplatev2Request
     * @memberof ReportsServiceApireportsServiceCreateChartTemplatev2
     */
    reportsv3CreateChartTemplatev2Request: Reportsv3CreateChartTemplatev2Request
}

export interface ReportsServiceApiReportsServiceCreateChartv2Request {
    /**
     * 
     * @type Reportsv3CreateChartv2Request
     * @memberof ReportsServiceApireportsServiceCreateChartv2
     */
    reportsv3CreateChartv2Request: Reportsv3CreateChartv2Request
}

export interface ReportsServiceApiReportsServiceCreateControlRequest {
    /**
     * 
     * @type Reportsv3CreateControlRequest
     * @memberof ReportsServiceApireportsServiceCreateControl
     */
    reportsv3CreateControlRequest: Reportsv3CreateControlRequest
}

export interface ReportsServiceApiReportsServiceCreateFieldsByCategoryRequest {
    /**
     * 
     * @type Reportsv3CreateFieldsByCategoryRequest
     * @memberof ReportsServiceApireportsServiceCreateFieldsByCategory
     */
    reportsv3CreateFieldsByCategoryRequest: Reportsv3CreateFieldsByCategoryRequest
}

export interface ReportsServiceApiReportsServiceCreateGradeRequest {
    /**
     * 
     * @type Reportsv3CreateGradeRequest
     * @memberof ReportsServiceApireportsServiceCreateGrade
     */
    reportsv3CreateGradeRequest: Reportsv3CreateGradeRequest
}

export interface ReportsServiceApiReportsServiceCreateJoinRequest {
    /**
     * 
     * @type Reportsv3CreateJoinRequest
     * @memberof ReportsServiceApireportsServiceCreateJoin
     */
    reportsv3CreateJoinRequest: Reportsv3CreateJoinRequest
}

export interface ReportsServiceApiReportsServiceCreateMeasureRequest {
    /**
     * 
     * @type Reportsv3CreateMeasureRequest
     * @memberof ReportsServiceApireportsServiceCreateMeasure
     */
    reportsv3CreateMeasureRequest: Reportsv3CreateMeasureRequest
}

export interface ReportsServiceApiReportsServiceCreateMetricRequest {
    /**
     * 
     * @type Reportsv3CreateMetricRequest
     * @memberof ReportsServiceApireportsServiceCreateMetric
     */
    reportsv3CreateMetricRequest: Reportsv3CreateMetricRequest
}

export interface ReportsServiceApiReportsServiceCreateProgramRequest {
    /**
     * 
     * @type Reportsv3CreateProgramRequest
     * @memberof ReportsServiceApireportsServiceCreateProgram
     */
    reportsv3CreateProgramRequest: Reportsv3CreateProgramRequest
}

export interface ReportsServiceApiReportsServiceCreateReportRequest {
    /**
     * 
     * @type Reportsv3CreateReportRequest
     * @memberof ReportsServiceApireportsServiceCreateReport
     */
    reportsv3CreateReportRequest: Reportsv3CreateReportRequest
}

export interface ReportsServiceApiReportsServiceCreateRequirementRequest {
    /**
     * 
     * @type Reportsv3CreateRequirementRequest
     * @memberof ReportsServiceApireportsServiceCreateRequirement
     */
    reportsv3CreateRequirementRequest: Reportsv3CreateRequirementRequest
}

export interface ReportsServiceApiReportsServiceCreateVariantRequest {
    /**
     * 
     * @type Reportsv3CreateVariantRequest
     * @memberof ReportsServiceApireportsServiceCreateVariant
     */
    reportsv3CreateVariantRequest: Reportsv3CreateVariantRequest
}

export interface ReportsServiceApiReportsServiceDeleteCategoryRequest {
    /**
     * category id.
     * Defaults to: undefined
     * @type string
     * @memberof ReportsServiceApireportsServiceDeleteCategory
     */
    categoryId?: string
    /**
     * table name.
     * Defaults to: undefined
     * @type string
     * @memberof ReportsServiceApireportsServiceDeleteCategory
     */
    tableName?: string
}

export interface ReportsServiceApiReportsServiceDeleteChartRequest {
    /**
     * The id of the chart to be deleted.
     * Defaults to: undefined
     * @type string
     * @memberof ReportsServiceApireportsServiceDeleteChart
     */
    chartId: string
}

export interface ReportsServiceApiReportsServiceDeleteChartTemplatev2Request {
    /**
     * Unique template ID.
     * Defaults to: undefined
     * @type string
     * @memberof ReportsServiceApireportsServiceDeleteChartTemplatev2
     */
    templateId: string
}

export interface ReportsServiceApiReportsServiceDeleteChartv2Request {
    /**
     * The ID of the chart for deletion.
     * Defaults to: undefined
     * @type string
     * @memberof ReportsServiceApireportsServiceDeleteChartv2
     */
    chartId: string
}

export interface ReportsServiceApiReportsServiceDeleteControlRequest {
    /**
     * The ID of the control to delete
     * Defaults to: undefined
     * @type number
     * @memberof ReportsServiceApireportsServiceDeleteControl
     */
    controlId: number
    /**
     * 
     * @type Reportsv3DeleteControlRequest
     * @memberof ReportsServiceApireportsServiceDeleteControl
     */
    reportsv3DeleteControlRequest: Reportsv3DeleteControlRequest
}

export interface ReportsServiceApiReportsServiceDeleteFieldsByCategoryRequest {
    /**
     * Header ids.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof ReportsServiceApireportsServiceDeleteFieldsByCategory
     */
    headerIds?: Array<string>
    /**
     * table name.
     * Defaults to: undefined
     * @type string
     * @memberof ReportsServiceApireportsServiceDeleteFieldsByCategory
     */
    tableName?: string
}

export interface ReportsServiceApiReportsServiceDeleteGradeRequest {
    /**
     * The id of the grade to be deleted.
     * Defaults to: undefined
     * @type number
     * @memberof ReportsServiceApireportsServiceDeleteGrade
     */
    gradeId: number
    /**
     * 
     * @type Reportsv3DeleteGradeRequest
     * @memberof ReportsServiceApireportsServiceDeleteGrade
     */
    reportsv3DeleteGradeRequest: Reportsv3DeleteGradeRequest
}

export interface ReportsServiceApiReportsServiceDeleteJoinRequest {
    /**
     * The id of the join to be deleted.
     * Defaults to: undefined
     * @type string
     * @memberof ReportsServiceApireportsServiceDeleteJoin
     */
    joinId: string
}

export interface ReportsServiceApiReportsServiceDeleteMeasureRequest {
    /**
     * The id of the measure to be deleted.
     * Defaults to: undefined
     * @type number
     * @memberof ReportsServiceApireportsServiceDeleteMeasure
     */
    measureId: number
    /**
     * 
     * @type Reportsv3DeleteMeasureRequest
     * @memberof ReportsServiceApireportsServiceDeleteMeasure
     */
    reportsv3DeleteMeasureRequest: Reportsv3DeleteMeasureRequest
}

export interface ReportsServiceApiReportsServiceDeleteMetricRequest {
    /**
     * The id of the metric to be deleted.
     * Defaults to: undefined
     * @type number
     * @memberof ReportsServiceApireportsServiceDeleteMetric
     */
    metricId: number
    /**
     * 
     * @type Reportsv3DeleteMetricRequest
     * @memberof ReportsServiceApireportsServiceDeleteMetric
     */
    reportsv3DeleteMetricRequest: Reportsv3DeleteMetricRequest
}

export interface ReportsServiceApiReportsServiceDeleteProgramRequest {
    /**
     * The ID of the program to delete
     * Defaults to: undefined
     * @type number
     * @memberof ReportsServiceApireportsServiceDeleteProgram
     */
    programId: number
    /**
     * 
     * @type Reportsv3DeleteProgramRequest
     * @memberof ReportsServiceApireportsServiceDeleteProgram
     */
    reportsv3DeleteProgramRequest: Reportsv3DeleteProgramRequest
}

export interface ReportsServiceApiReportsServiceDeleteReportRequest {
    /**
     * The id of the Report to be deleted.
     * Defaults to: undefined
     * @type string
     * @memberof ReportsServiceApireportsServiceDeleteReport
     */
    reportId: string
}

export interface ReportsServiceApiReportsServiceDeleteRequirementRequest {
    /**
     * The requirement to delete\&#39;s ID
     * Defaults to: undefined
     * @type number
     * @memberof ReportsServiceApireportsServiceDeleteRequirement
     */
    requirementId: number
    /**
     * 
     * @type Reportsv3DeleteRequirementRequest
     * @memberof ReportsServiceApireportsServiceDeleteRequirement
     */
    reportsv3DeleteRequirementRequest: Reportsv3DeleteRequirementRequest
}

export interface ReportsServiceApiReportsServiceDeleteVariantRequest {
    /**
     * The id of the variant to delete
     * Defaults to: undefined
     * @type string
     * @memberof ReportsServiceApireportsServiceDeleteVariant
     */
    variantId: string
}

export interface ReportsServiceApiReportsServiceGetCategoriesRequest {
    /**
     * Report ID.
     * Defaults to: undefined
     * @type string
     * @memberof ReportsServiceApireportsServiceGetCategories
     */
    reportId?: string
}

export interface ReportsServiceApiReportsServiceGetChartSettingsRequest {
    /**
     * Unique Chart ID.
     * Defaults to: undefined
     * @type string
     * @memberof ReportsServiceApireportsServiceGetChartSettings
     */
    chartId?: string
    /**
     * Unique Report ID.
     * Defaults to: undefined
     * @type string
     * @memberof ReportsServiceApireportsServiceGetChartSettings
     */
    reportId?: string
}

export interface ReportsServiceApiReportsServiceGetChartSettingsv2Request {
    /**
     * Unique Chart ID.
     * Defaults to: undefined
     * @type string
     * @memberof ReportsServiceApireportsServiceGetChartSettingsv2
     */
    chartId?: string
    /**
     * Unique Report ID.
     * Defaults to: undefined
     * @type string
     * @memberof ReportsServiceApireportsServiceGetChartSettingsv2
     */
    reportId?: string
}

export interface ReportsServiceApiReportsServiceGetChartTemplatesv2Request {
}

export interface ReportsServiceApiReportsServiceGetControlsRequest {
}

export interface ReportsServiceApiReportsServiceGetFieldsByCategoriesRequest {
    /**
     * Category IDs.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof ReportsServiceApireportsServiceGetFieldsByCategories
     */
    categoryIds?: Array<string>
}

export interface ReportsServiceApiReportsServiceGetFieldsByCategoryRequest {
    /**
     * Category ID.
     * Defaults to: undefined
     * @type string
     * @memberof ReportsServiceApireportsServiceGetFieldsByCategory
     */
    categoryId?: string
    /**
     * Report ID.
     * Defaults to: undefined
     * @type string
     * @memberof ReportsServiceApireportsServiceGetFieldsByCategory
     */
    reportId?: string
    /**
     * optional table name parameter.
     * Defaults to: undefined
     * @type string
     * @memberof ReportsServiceApireportsServiceGetFieldsByCategory
     */
    tableName?: string
}

export interface ReportsServiceApiReportsServiceGetGradesRequest {
}

export interface ReportsServiceApiReportsServiceGetJoinsRequest {
    /**
     * Category ID (Optional).
     * Defaults to: undefined
     * @type string
     * @memberof ReportsServiceApireportsServiceGetJoins
     */
    categoryId?: string
}

export interface ReportsServiceApiReportsServiceGetMeasuresRequest {
}

export interface ReportsServiceApiReportsServiceGetMetricsRequest {
}

export interface ReportsServiceApiReportsServiceGetProgramsRequest {
}

export interface ReportsServiceApiReportsServiceGetQueryByReportDefinitionRequest {
    /**
     * 
     * @type Reportsv3GetQueryByReportDefinitionRequest
     * @memberof ReportsServiceApireportsServiceGetQueryByReportDefinition
     */
    reportsv3GetQueryByReportDefinitionRequest: Reportsv3GetQueryByReportDefinitionRequest
}

export interface ReportsServiceApiReportsServiceGetQueryByReportIDRequest {
    /**
     * 
     * @type Reportsv3GetQueryByReportIDRequest
     * @memberof ReportsServiceApireportsServiceGetQueryByReportID
     */
    reportsv3GetQueryByReportIDRequest: Reportsv3GetQueryByReportIDRequest
}

export interface ReportsServiceApiReportsServiceGetReportDefinitionRequest {
    /**
     * Unique Report ID.
     * Defaults to: undefined
     * @type string
     * @memberof ReportsServiceApireportsServiceGetReportDefinition
     */
    reportId: string
}

export interface ReportsServiceApiReportsServiceGetReportGroupsRequest {
    /**
     * List of group IDs that should be checked for usage in each report.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof ReportsServiceApireportsServiceGetReportGroups
     */
    groups?: Array<string>
}

export interface ReportsServiceApiReportsServiceGetReportSynopsisRequest {
    /**
     * Unique Report ID.
     * Defaults to: undefined
     * @type string
     * @memberof ReportsServiceApireportsServiceGetReportSynopsis
     */
    reportId: string
}

export interface ReportsServiceApiReportsServiceGetReportTimestampHeaderRequest {
    /**
     * Category ID parameter.
     * Defaults to: undefined
     * @type string
     * @memberof ReportsServiceApireportsServiceGetReportTimestampHeader
     */
    categoryId?: string
    /**
     * List of all header tables.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof ReportsServiceApireportsServiceGetReportTimestampHeader
     */
    tableNames?: Array<string>
}

export interface ReportsServiceApiReportsServiceGetReportsRequest {
    /**
     * Optional Category ID parameter.
     * Defaults to: undefined
     * @type string
     * @memberof ReportsServiceApireportsServiceGetReports
     */
    categoryId?: string
    /**
     * Optional table name parameter.
     * Defaults to: undefined
     * @type string
     * @memberof ReportsServiceApireportsServiceGetReports
     */
    tableName?: string
}

export interface ReportsServiceApiReportsServiceGetReportsForJoinRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof ReportsServiceApireportsServiceGetReportsForJoin
     */
    joinId: string
}

export interface ReportsServiceApiReportsServiceGetReportsTagsRequest {
}

export interface ReportsServiceApiReportsServiceGetRequirementsRequest {
}

export interface ReportsServiceApiReportsServiceGetVariantRequest {
    /**
     * The variant id
     * Defaults to: undefined
     * @type string
     * @memberof ReportsServiceApireportsServiceGetVariant
     */
    variantId: string
}

export interface ReportsServiceApiReportsServiceGetVariantsRequest {
}

export interface ReportsServiceApiReportsServicePartialChartUpdateRequest {
    /**
     * Unique chart ID.
     * Defaults to: undefined
     * @type string
     * @memberof ReportsServiceApireportsServicePartialChartUpdate
     */
    chartId: string
    /**
     * 
     * @type Reportsv3PartialChartUpdateRequest
     * @memberof ReportsServiceApireportsServicePartialChartUpdate
     */
    reportsv3PartialChartUpdateRequest: Reportsv3PartialChartUpdateRequest
}

export interface ReportsServiceApiReportsServicePartialReportUpdateRequest {
    /**
     * Unique Report ID.
     * Defaults to: undefined
     * @type string
     * @memberof ReportsServiceApireportsServicePartialReportUpdate
     */
    reportId: string
    /**
     * 
     * @type Reportsv3PartialReportUpdateRequest
     * @memberof ReportsServiceApireportsServicePartialReportUpdate
     */
    reportsv3PartialReportUpdateRequest: Reportsv3PartialReportUpdateRequest
}

export interface ReportsServiceApiReportsServiceRunGradesRequest {
    /**
     * 
     * @type Reportsv3RunGradesRequest
     * @memberof ReportsServiceApireportsServiceRunGrades
     */
    reportsv3RunGradesRequest: Reportsv3RunGradesRequest
}

export interface ReportsServiceApiReportsServiceRunVariantOperationRequest {
    /**
     * 
     * @type Reportsv3RunVariantOperationRequest
     * @memberof ReportsServiceApireportsServiceRunVariantOperation
     */
    reportsv3RunVariantOperationRequest: Reportsv3RunVariantOperationRequest
}

export interface ReportsServiceApiReportsServiceTransposeRequest {
    /**
     * 
     * @type Reportsv3TransposeRequest
     * @memberof ReportsServiceApireportsServiceTranspose
     */
    reportsv3TransposeRequest: Reportsv3TransposeRequest
}

export interface ReportsServiceApiReportsServiceUpdateChartRequest {
    /**
     * Unique chart ID.
     * Defaults to: undefined
     * @type string
     * @memberof ReportsServiceApireportsServiceUpdateChart
     */
    chartId: string
    /**
     * 
     * @type Reportsv3UpdateChartRequest
     * @memberof ReportsServiceApireportsServiceUpdateChart
     */
    reportsv3UpdateChartRequest: Reportsv3UpdateChartRequest
}

export interface ReportsServiceApiReportsServiceUpdateChartv2Request {
    /**
     * Unique chart ID.
     * Defaults to: undefined
     * @type string
     * @memberof ReportsServiceApireportsServiceUpdateChartv2
     */
    chartId: string
    /**
     * 
     * @type Reportsv3UpdateChartv2Request
     * @memberof ReportsServiceApireportsServiceUpdateChartv2
     */
    reportsv3UpdateChartv2Request: Reportsv3UpdateChartv2Request
}

export interface ReportsServiceApiReportsServiceUpdateControlRequest {
    /**
     * The id of the control that was updated.
     * Defaults to: undefined
     * @type number
     * @memberof ReportsServiceApireportsServiceUpdateControl
     */
    controlId: number
    /**
     * 
     * @type Reportsv3UpdateControlRequest
     * @memberof ReportsServiceApireportsServiceUpdateControl
     */
    reportsv3UpdateControlRequest: Reportsv3UpdateControlRequest
}

export interface ReportsServiceApiReportsServiceUpdateGradeRequest {
    /**
     * The id of the grade that was updated.
     * Defaults to: undefined
     * @type number
     * @memberof ReportsServiceApireportsServiceUpdateGrade
     */
    gradeId: number
    /**
     * 
     * @type Reportsv3UpdateGradeRequest
     * @memberof ReportsServiceApireportsServiceUpdateGrade
     */
    reportsv3UpdateGradeRequest: Reportsv3UpdateGradeRequest
}

export interface ReportsServiceApiReportsServiceUpdateJoinRequest {
    /**
     * Unique join ID.
     * Defaults to: undefined
     * @type string
     * @memberof ReportsServiceApireportsServiceUpdateJoin
     */
    joinId: string
    /**
     * 
     * @type Reportsv3UpdateJoinRequest
     * @memberof ReportsServiceApireportsServiceUpdateJoin
     */
    reportsv3UpdateJoinRequest: Reportsv3UpdateJoinRequest
}

export interface ReportsServiceApiReportsServiceUpdateMeasureRequest {
    /**
     * The id of the measure that was updated.
     * Defaults to: undefined
     * @type number
     * @memberof ReportsServiceApireportsServiceUpdateMeasure
     */
    measureId: number
    /**
     * 
     * @type Reportsv3UpdateMeasureRequest
     * @memberof ReportsServiceApireportsServiceUpdateMeasure
     */
    reportsv3UpdateMeasureRequest: Reportsv3UpdateMeasureRequest
}

export interface ReportsServiceApiReportsServiceUpdateMetricRequest {
    /**
     * The id of the metric that was updated.
     * Defaults to: undefined
     * @type number
     * @memberof ReportsServiceApireportsServiceUpdateMetric
     */
    metricId: number
    /**
     * 
     * @type Reportsv3UpdateMetricRequest
     * @memberof ReportsServiceApireportsServiceUpdateMetric
     */
    reportsv3UpdateMetricRequest: Reportsv3UpdateMetricRequest
}

export interface ReportsServiceApiReportsServiceUpdateProgramRequest {
    /**
     * The id of the programs that was updated.
     * Defaults to: undefined
     * @type number
     * @memberof ReportsServiceApireportsServiceUpdateProgram
     */
    programId: number
    /**
     * 
     * @type Reportsv3UpdateProgramRequest
     * @memberof ReportsServiceApireportsServiceUpdateProgram
     */
    reportsv3UpdateProgramRequest: Reportsv3UpdateProgramRequest
}

export interface ReportsServiceApiReportsServiceUpdateReportRequest {
    /**
     * Unique Report ID.
     * Defaults to: undefined
     * @type string
     * @memberof ReportsServiceApireportsServiceUpdateReport
     */
    reportId: string
    /**
     * 
     * @type Reportsv3UpdateReportRequest
     * @memberof ReportsServiceApireportsServiceUpdateReport
     */
    reportsv3UpdateReportRequest: Reportsv3UpdateReportRequest
}

export interface ReportsServiceApiReportsServiceUpdateRequirementRequest {
    /**
     * The id of the requirements that was updated.
     * Defaults to: undefined
     * @type number
     * @memberof ReportsServiceApireportsServiceUpdateRequirement
     */
    requirementId: number
    /**
     * 
     * @type Reportsv3UpdateRequirementRequest
     * @memberof ReportsServiceApireportsServiceUpdateRequirement
     */
    reportsv3UpdateRequirementRequest: Reportsv3UpdateRequirementRequest
}

export interface ReportsServiceApiReportsServiceUpdateVariantOverrideRequest {
    /**
     * The variant id
     * Defaults to: undefined
     * @type string
     * @memberof ReportsServiceApireportsServiceUpdateVariantOverride
     */
    variantId: string
    /**
     * 
     * @type Reportsv3UpdateVariantOverrideRequest
     * @memberof ReportsServiceApireportsServiceUpdateVariantOverride
     */
    reportsv3UpdateVariantOverrideRequest: Reportsv3UpdateVariantOverrideRequest
}

export class ObjectReportsServiceApi {
    private api: ObservableReportsServiceApi

    public constructor(configuration: Configuration, requestFactory?: ReportsServiceApiRequestFactory, responseProcessor?: ReportsServiceApiResponseProcessor) {
        this.api = new ObservableReportsServiceApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Summary: Create a category Description: Create a report category
     * @param param the request object
     */
    public reportsServiceCreateCategoryWithHttpInfo(param: ReportsServiceApiReportsServiceCreateCategoryRequest, options?: ConfigurationOptions): Promise<HttpInfo<Reportsv3CreateCategoryResponse>> {
        return this.api.reportsServiceCreateCategoryWithHttpInfo(param.reportsv3CreateCategoryRequest,  options).toPromise();
    }

    /**
     * Summary: Create a category Description: Create a report category
     * @param param the request object
     */
    public reportsServiceCreateCategory(param: ReportsServiceApiReportsServiceCreateCategoryRequest, options?: ConfigurationOptions): Promise<Reportsv3CreateCategoryResponse> {
        return this.api.reportsServiceCreateCategory(param.reportsv3CreateCategoryRequest,  options).toPromise();
    }

    /**
     * Summary: Create chart Description: Create custom chart based on provided properties.
     * @param param the request object
     */
    public reportsServiceCreateChartWithHttpInfo(param: ReportsServiceApiReportsServiceCreateChartRequest, options?: ConfigurationOptions): Promise<HttpInfo<Reportsv3CreateChartResponse>> {
        return this.api.reportsServiceCreateChartWithHttpInfo(param.reportsv3CreateChartRequest,  options).toPromise();
    }

    /**
     * Summary: Create chart Description: Create custom chart based on provided properties.
     * @param param the request object
     */
    public reportsServiceCreateChart(param: ReportsServiceApiReportsServiceCreateChartRequest, options?: ConfigurationOptions): Promise<Reportsv3CreateChartResponse> {
        return this.api.reportsServiceCreateChart(param.reportsv3CreateChartRequest,  options).toPromise();
    }

    /**
     * Summary: Create chart template v2 Description: Create custom VEGA chart template.
     * @param param the request object
     */
    public reportsServiceCreateChartTemplatev2WithHttpInfo(param: ReportsServiceApiReportsServiceCreateChartTemplatev2Request, options?: ConfigurationOptions): Promise<HttpInfo<Reportsv3CreateChartTemplatev2Response>> {
        return this.api.reportsServiceCreateChartTemplatev2WithHttpInfo(param.reportsv3CreateChartTemplatev2Request,  options).toPromise();
    }

    /**
     * Summary: Create chart template v2 Description: Create custom VEGA chart template.
     * @param param the request object
     */
    public reportsServiceCreateChartTemplatev2(param: ReportsServiceApiReportsServiceCreateChartTemplatev2Request, options?: ConfigurationOptions): Promise<Reportsv3CreateChartTemplatev2Response> {
        return this.api.reportsServiceCreateChartTemplatev2(param.reportsv3CreateChartTemplatev2Request,  options).toPromise();
    }

    /**
     * Summary: Create chart v2 Description: Create custom VEGA chart based on provided properties.
     * @param param the request object
     */
    public reportsServiceCreateChartv2WithHttpInfo(param: ReportsServiceApiReportsServiceCreateChartv2Request, options?: ConfigurationOptions): Promise<HttpInfo<Reportsv3CreateChartv2Response>> {
        return this.api.reportsServiceCreateChartv2WithHttpInfo(param.reportsv3CreateChartv2Request,  options).toPromise();
    }

    /**
     * Summary: Create chart v2 Description: Create custom VEGA chart based on provided properties.
     * @param param the request object
     */
    public reportsServiceCreateChartv2(param: ReportsServiceApiReportsServiceCreateChartv2Request, options?: ConfigurationOptions): Promise<Reportsv3CreateChartv2Response> {
        return this.api.reportsServiceCreateChartv2(param.reportsv3CreateChartv2Request,  options).toPromise();
    }

    /**
     * Summary: Create Control. Description: Create a unique Control.
     * @param param the request object
     */
    public reportsServiceCreateControlWithHttpInfo(param: ReportsServiceApiReportsServiceCreateControlRequest, options?: ConfigurationOptions): Promise<HttpInfo<Reportsv3CreateControlResponse>> {
        return this.api.reportsServiceCreateControlWithHttpInfo(param.reportsv3CreateControlRequest,  options).toPromise();
    }

    /**
     * Summary: Create Control. Description: Create a unique Control.
     * @param param the request object
     */
    public reportsServiceCreateControl(param: ReportsServiceApiReportsServiceCreateControlRequest, options?: ConfigurationOptions): Promise<Reportsv3CreateControlResponse> {
        return this.api.reportsServiceCreateControl(param.reportsv3CreateControlRequest,  options).toPromise();
    }

    /**
     * Summary - Create fields by category Description: Cteate category fields based on provided properties.
     * @param param the request object
     */
    public reportsServiceCreateFieldsByCategoryWithHttpInfo(param: ReportsServiceApiReportsServiceCreateFieldsByCategoryRequest, options?: ConfigurationOptions): Promise<HttpInfo<Reportsv3CreateFieldsByCategoryResponse>> {
        return this.api.reportsServiceCreateFieldsByCategoryWithHttpInfo(param.reportsv3CreateFieldsByCategoryRequest,  options).toPromise();
    }

    /**
     * Summary - Create fields by category Description: Cteate category fields based on provided properties.
     * @param param the request object
     */
    public reportsServiceCreateFieldsByCategory(param: ReportsServiceApiReportsServiceCreateFieldsByCategoryRequest, options?: ConfigurationOptions): Promise<Reportsv3CreateFieldsByCategoryResponse> {
        return this.api.reportsServiceCreateFieldsByCategory(param.reportsv3CreateFieldsByCategoryRequest,  options).toPromise();
    }

    /**
     * Summary: Create Grade. Description: Create a unique Grade.
     * @param param the request object
     */
    public reportsServiceCreateGradeWithHttpInfo(param: ReportsServiceApiReportsServiceCreateGradeRequest, options?: ConfigurationOptions): Promise<HttpInfo<Reportsv3CreateGradeResponse>> {
        return this.api.reportsServiceCreateGradeWithHttpInfo(param.reportsv3CreateGradeRequest,  options).toPromise();
    }

    /**
     * Summary: Create Grade. Description: Create a unique Grade.
     * @param param the request object
     */
    public reportsServiceCreateGrade(param: ReportsServiceApiReportsServiceCreateGradeRequest, options?: ConfigurationOptions): Promise<Reportsv3CreateGradeResponse> {
        return this.api.reportsServiceCreateGrade(param.reportsv3CreateGradeRequest,  options).toPromise();
    }

    /**
     * Summary: Create a join Description: Create a custom report join
     * @param param the request object
     */
    public reportsServiceCreateJoinWithHttpInfo(param: ReportsServiceApiReportsServiceCreateJoinRequest, options?: ConfigurationOptions): Promise<HttpInfo<Reportsv3CreateJoinResponse>> {
        return this.api.reportsServiceCreateJoinWithHttpInfo(param.reportsv3CreateJoinRequest,  options).toPromise();
    }

    /**
     * Summary: Create a join Description: Create a custom report join
     * @param param the request object
     */
    public reportsServiceCreateJoin(param: ReportsServiceApiReportsServiceCreateJoinRequest, options?: ConfigurationOptions): Promise<Reportsv3CreateJoinResponse> {
        return this.api.reportsServiceCreateJoin(param.reportsv3CreateJoinRequest,  options).toPromise();
    }

    /**
     * Summary: Create measure. Description: Create a unique measure.
     * @param param the request object
     */
    public reportsServiceCreateMeasureWithHttpInfo(param: ReportsServiceApiReportsServiceCreateMeasureRequest, options?: ConfigurationOptions): Promise<HttpInfo<Reportsv3CreateMeasureResponse>> {
        return this.api.reportsServiceCreateMeasureWithHttpInfo(param.reportsv3CreateMeasureRequest,  options).toPromise();
    }

    /**
     * Summary: Create measure. Description: Create a unique measure.
     * @param param the request object
     */
    public reportsServiceCreateMeasure(param: ReportsServiceApiReportsServiceCreateMeasureRequest, options?: ConfigurationOptions): Promise<Reportsv3CreateMeasureResponse> {
        return this.api.reportsServiceCreateMeasure(param.reportsv3CreateMeasureRequest,  options).toPromise();
    }

    /**
     * Summary: Create metric. Description: Create a unique metric.
     * @param param the request object
     */
    public reportsServiceCreateMetricWithHttpInfo(param: ReportsServiceApiReportsServiceCreateMetricRequest, options?: ConfigurationOptions): Promise<HttpInfo<Reportsv3CreateMetricResponse>> {
        return this.api.reportsServiceCreateMetricWithHttpInfo(param.reportsv3CreateMetricRequest,  options).toPromise();
    }

    /**
     * Summary: Create metric. Description: Create a unique metric.
     * @param param the request object
     */
    public reportsServiceCreateMetric(param: ReportsServiceApiReportsServiceCreateMetricRequest, options?: ConfigurationOptions): Promise<Reportsv3CreateMetricResponse> {
        return this.api.reportsServiceCreateMetric(param.reportsv3CreateMetricRequest,  options).toPromise();
    }

    /**
     * Summary: Create Program. Description: Create a unique Program.
     * @param param the request object
     */
    public reportsServiceCreateProgramWithHttpInfo(param: ReportsServiceApiReportsServiceCreateProgramRequest, options?: ConfigurationOptions): Promise<HttpInfo<Reportsv3CreateProgramResponse>> {
        return this.api.reportsServiceCreateProgramWithHttpInfo(param.reportsv3CreateProgramRequest,  options).toPromise();
    }

    /**
     * Summary: Create Program. Description: Create a unique Program.
     * @param param the request object
     */
    public reportsServiceCreateProgram(param: ReportsServiceApiReportsServiceCreateProgramRequest, options?: ConfigurationOptions): Promise<Reportsv3CreateProgramResponse> {
        return this.api.reportsServiceCreateProgram(param.reportsv3CreateProgramRequest,  options).toPromise();
    }

    /**
     * Summary: Create report Description: Create custom report based on provided properties.
     * @param param the request object
     */
    public reportsServiceCreateReportWithHttpInfo(param: ReportsServiceApiReportsServiceCreateReportRequest, options?: ConfigurationOptions): Promise<HttpInfo<Reportsv3CreateReportResponse>> {
        return this.api.reportsServiceCreateReportWithHttpInfo(param.reportsv3CreateReportRequest,  options).toPromise();
    }

    /**
     * Summary: Create report Description: Create custom report based on provided properties.
     * @param param the request object
     */
    public reportsServiceCreateReport(param: ReportsServiceApiReportsServiceCreateReportRequest, options?: ConfigurationOptions): Promise<Reportsv3CreateReportResponse> {
        return this.api.reportsServiceCreateReport(param.reportsv3CreateReportRequest,  options).toPromise();
    }

    /**
     * Summary: Create Requirement. Description: Create a unique Requirement.
     * @param param the request object
     */
    public reportsServiceCreateRequirementWithHttpInfo(param: ReportsServiceApiReportsServiceCreateRequirementRequest, options?: ConfigurationOptions): Promise<HttpInfo<Reportsv3CreateRequirementResponse>> {
        return this.api.reportsServiceCreateRequirementWithHttpInfo(param.reportsv3CreateRequirementRequest,  options).toPromise();
    }

    /**
     * Summary: Create Requirement. Description: Create a unique Requirement.
     * @param param the request object
     */
    public reportsServiceCreateRequirement(param: ReportsServiceApiReportsServiceCreateRequirementRequest, options?: ConfigurationOptions): Promise<Reportsv3CreateRequirementResponse> {
        return this.api.reportsServiceCreateRequirement(param.reportsv3CreateRequirementRequest,  options).toPromise();
    }

    /**
     * Summary: Create a variant Description: Create a variant for reports
     * @param param the request object
     */
    public reportsServiceCreateVariantWithHttpInfo(param: ReportsServiceApiReportsServiceCreateVariantRequest, options?: ConfigurationOptions): Promise<HttpInfo<Reportsv3CreateVariantResponse>> {
        return this.api.reportsServiceCreateVariantWithHttpInfo(param.reportsv3CreateVariantRequest,  options).toPromise();
    }

    /**
     * Summary: Create a variant Description: Create a variant for reports
     * @param param the request object
     */
    public reportsServiceCreateVariant(param: ReportsServiceApiReportsServiceCreateVariantRequest, options?: ConfigurationOptions): Promise<Reportsv3CreateVariantResponse> {
        return this.api.reportsServiceCreateVariant(param.reportsv3CreateVariantRequest,  options).toPromise();
    }

    /**
     * Summary: Delete a category Description: Delete a report category
     * @param param the request object
     */
    public reportsServiceDeleteCategoryWithHttpInfo(param: ReportsServiceApiReportsServiceDeleteCategoryRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Reportsv3DeleteCategoryResponse>> {
        return this.api.reportsServiceDeleteCategoryWithHttpInfo(param.categoryId, param.tableName,  options).toPromise();
    }

    /**
     * Summary: Delete a category Description: Delete a report category
     * @param param the request object
     */
    public reportsServiceDeleteCategory(param: ReportsServiceApiReportsServiceDeleteCategoryRequest = {}, options?: ConfigurationOptions): Promise<Reportsv3DeleteCategoryResponse> {
        return this.api.reportsServiceDeleteCategory(param.categoryId, param.tableName,  options).toPromise();
    }

    /**
     * Summary: Delete chart Description: Delete a custom chart.
     * @param param the request object
     */
    public reportsServiceDeleteChartWithHttpInfo(param: ReportsServiceApiReportsServiceDeleteChartRequest, options?: ConfigurationOptions): Promise<HttpInfo<Reportsv3DeleteChartResponse>> {
        return this.api.reportsServiceDeleteChartWithHttpInfo(param.chartId,  options).toPromise();
    }

    /**
     * Summary: Delete chart Description: Delete a custom chart.
     * @param param the request object
     */
    public reportsServiceDeleteChart(param: ReportsServiceApiReportsServiceDeleteChartRequest, options?: ConfigurationOptions): Promise<Reportsv3DeleteChartResponse> {
        return this.api.reportsServiceDeleteChart(param.chartId,  options).toPromise();
    }

    /**
     * Summary: Delete chart template v2 Description: Delete a custom VEGA chart template.
     * @param param the request object
     */
    public reportsServiceDeleteChartTemplatev2WithHttpInfo(param: ReportsServiceApiReportsServiceDeleteChartTemplatev2Request, options?: ConfigurationOptions): Promise<HttpInfo<Reportsv3DeleteChartTemplatev2Response>> {
        return this.api.reportsServiceDeleteChartTemplatev2WithHttpInfo(param.templateId,  options).toPromise();
    }

    /**
     * Summary: Delete chart template v2 Description: Delete a custom VEGA chart template.
     * @param param the request object
     */
    public reportsServiceDeleteChartTemplatev2(param: ReportsServiceApiReportsServiceDeleteChartTemplatev2Request, options?: ConfigurationOptions): Promise<Reportsv3DeleteChartTemplatev2Response> {
        return this.api.reportsServiceDeleteChartTemplatev2(param.templateId,  options).toPromise();
    }

    /**
     * Summary: Delete chart v2 Description: Delete a custom VEGA chart.
     * @param param the request object
     */
    public reportsServiceDeleteChartv2WithHttpInfo(param: ReportsServiceApiReportsServiceDeleteChartv2Request, options?: ConfigurationOptions): Promise<HttpInfo<Reportsv3DeleteChartv2Response>> {
        return this.api.reportsServiceDeleteChartv2WithHttpInfo(param.chartId,  options).toPromise();
    }

    /**
     * Summary: Delete chart v2 Description: Delete a custom VEGA chart.
     * @param param the request object
     */
    public reportsServiceDeleteChartv2(param: ReportsServiceApiReportsServiceDeleteChartv2Request, options?: ConfigurationOptions): Promise<Reportsv3DeleteChartv2Response> {
        return this.api.reportsServiceDeleteChartv2(param.chartId,  options).toPromise();
    }

    /**
     * Summary: Delete Control Description: Delete a Control.
     * @param param the request object
     */
    public reportsServiceDeleteControlWithHttpInfo(param: ReportsServiceApiReportsServiceDeleteControlRequest, options?: ConfigurationOptions): Promise<HttpInfo<Reportsv3DeleteControlResponse>> {
        return this.api.reportsServiceDeleteControlWithHttpInfo(param.controlId, param.reportsv3DeleteControlRequest,  options).toPromise();
    }

    /**
     * Summary: Delete Control Description: Delete a Control.
     * @param param the request object
     */
    public reportsServiceDeleteControl(param: ReportsServiceApiReportsServiceDeleteControlRequest, options?: ConfigurationOptions): Promise<Reportsv3DeleteControlResponse> {
        return this.api.reportsServiceDeleteControl(param.controlId, param.reportsv3DeleteControlRequest,  options).toPromise();
    }

    /**
     * Summary - Delete fields by category Description: Delete category fields based on provided properties.
     * @param param the request object
     */
    public reportsServiceDeleteFieldsByCategoryWithHttpInfo(param: ReportsServiceApiReportsServiceDeleteFieldsByCategoryRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Reportsv3DeleteFieldsByCategoryResponse>> {
        return this.api.reportsServiceDeleteFieldsByCategoryWithHttpInfo(param.headerIds, param.tableName,  options).toPromise();
    }

    /**
     * Summary - Delete fields by category Description: Delete category fields based on provided properties.
     * @param param the request object
     */
    public reportsServiceDeleteFieldsByCategory(param: ReportsServiceApiReportsServiceDeleteFieldsByCategoryRequest = {}, options?: ConfigurationOptions): Promise<Reportsv3DeleteFieldsByCategoryResponse> {
        return this.api.reportsServiceDeleteFieldsByCategory(param.headerIds, param.tableName,  options).toPromise();
    }

    /**
     * Summary: Delete Grade Description: Delete a Grade.
     * @param param the request object
     */
    public reportsServiceDeleteGradeWithHttpInfo(param: ReportsServiceApiReportsServiceDeleteGradeRequest, options?: ConfigurationOptions): Promise<HttpInfo<Reportsv3DeleteGradeResponse>> {
        return this.api.reportsServiceDeleteGradeWithHttpInfo(param.gradeId, param.reportsv3DeleteGradeRequest,  options).toPromise();
    }

    /**
     * Summary: Delete Grade Description: Delete a Grade.
     * @param param the request object
     */
    public reportsServiceDeleteGrade(param: ReportsServiceApiReportsServiceDeleteGradeRequest, options?: ConfigurationOptions): Promise<Reportsv3DeleteGradeResponse> {
        return this.api.reportsServiceDeleteGrade(param.gradeId, param.reportsv3DeleteGradeRequest,  options).toPromise();
    }

    /**
     * Summary: Delete a join Description: Delete a custom join
     * @param param the request object
     */
    public reportsServiceDeleteJoinWithHttpInfo(param: ReportsServiceApiReportsServiceDeleteJoinRequest, options?: ConfigurationOptions): Promise<HttpInfo<Reportsv3DeleteJoinResponse>> {
        return this.api.reportsServiceDeleteJoinWithHttpInfo(param.joinId,  options).toPromise();
    }

    /**
     * Summary: Delete a join Description: Delete a custom join
     * @param param the request object
     */
    public reportsServiceDeleteJoin(param: ReportsServiceApiReportsServiceDeleteJoinRequest, options?: ConfigurationOptions): Promise<Reportsv3DeleteJoinResponse> {
        return this.api.reportsServiceDeleteJoin(param.joinId,  options).toPromise();
    }

    /**
     * Summary: Delete measure Description: Delete a measure.
     * @param param the request object
     */
    public reportsServiceDeleteMeasureWithHttpInfo(param: ReportsServiceApiReportsServiceDeleteMeasureRequest, options?: ConfigurationOptions): Promise<HttpInfo<Reportsv3DeleteMeasureResponse>> {
        return this.api.reportsServiceDeleteMeasureWithHttpInfo(param.measureId, param.reportsv3DeleteMeasureRequest,  options).toPromise();
    }

    /**
     * Summary: Delete measure Description: Delete a measure.
     * @param param the request object
     */
    public reportsServiceDeleteMeasure(param: ReportsServiceApiReportsServiceDeleteMeasureRequest, options?: ConfigurationOptions): Promise<Reportsv3DeleteMeasureResponse> {
        return this.api.reportsServiceDeleteMeasure(param.measureId, param.reportsv3DeleteMeasureRequest,  options).toPromise();
    }

    /**
     * Summary: Delete metric Description: Delete a metric.
     * @param param the request object
     */
    public reportsServiceDeleteMetricWithHttpInfo(param: ReportsServiceApiReportsServiceDeleteMetricRequest, options?: ConfigurationOptions): Promise<HttpInfo<Reportsv3DeleteMetricResponse>> {
        return this.api.reportsServiceDeleteMetricWithHttpInfo(param.metricId, param.reportsv3DeleteMetricRequest,  options).toPromise();
    }

    /**
     * Summary: Delete metric Description: Delete a metric.
     * @param param the request object
     */
    public reportsServiceDeleteMetric(param: ReportsServiceApiReportsServiceDeleteMetricRequest, options?: ConfigurationOptions): Promise<Reportsv3DeleteMetricResponse> {
        return this.api.reportsServiceDeleteMetric(param.metricId, param.reportsv3DeleteMetricRequest,  options).toPromise();
    }

    /**
     * Summary: Delete Program Description: Delete a Program.
     * @param param the request object
     */
    public reportsServiceDeleteProgramWithHttpInfo(param: ReportsServiceApiReportsServiceDeleteProgramRequest, options?: ConfigurationOptions): Promise<HttpInfo<Reportsv3DeleteProgramResponse>> {
        return this.api.reportsServiceDeleteProgramWithHttpInfo(param.programId, param.reportsv3DeleteProgramRequest,  options).toPromise();
    }

    /**
     * Summary: Delete Program Description: Delete a Program.
     * @param param the request object
     */
    public reportsServiceDeleteProgram(param: ReportsServiceApiReportsServiceDeleteProgramRequest, options?: ConfigurationOptions): Promise<Reportsv3DeleteProgramResponse> {
        return this.api.reportsServiceDeleteProgram(param.programId, param.reportsv3DeleteProgramRequest,  options).toPromise();
    }

    /**
     * Summary: Delete report Description: Delete a custom report.
     * @param param the request object
     */
    public reportsServiceDeleteReportWithHttpInfo(param: ReportsServiceApiReportsServiceDeleteReportRequest, options?: ConfigurationOptions): Promise<HttpInfo<Reportsv3DeleteReportResponse>> {
        return this.api.reportsServiceDeleteReportWithHttpInfo(param.reportId,  options).toPromise();
    }

    /**
     * Summary: Delete report Description: Delete a custom report.
     * @param param the request object
     */
    public reportsServiceDeleteReport(param: ReportsServiceApiReportsServiceDeleteReportRequest, options?: ConfigurationOptions): Promise<Reportsv3DeleteReportResponse> {
        return this.api.reportsServiceDeleteReport(param.reportId,  options).toPromise();
    }

    /**
     * Summary: Delete Requirement Description: Delete a Requirement.
     * @param param the request object
     */
    public reportsServiceDeleteRequirementWithHttpInfo(param: ReportsServiceApiReportsServiceDeleteRequirementRequest, options?: ConfigurationOptions): Promise<HttpInfo<Reportsv3DeleteRequirementResponse>> {
        return this.api.reportsServiceDeleteRequirementWithHttpInfo(param.requirementId, param.reportsv3DeleteRequirementRequest,  options).toPromise();
    }

    /**
     * Summary: Delete Requirement Description: Delete a Requirement.
     * @param param the request object
     */
    public reportsServiceDeleteRequirement(param: ReportsServiceApiReportsServiceDeleteRequirementRequest, options?: ConfigurationOptions): Promise<Reportsv3DeleteRequirementResponse> {
        return this.api.reportsServiceDeleteRequirement(param.requirementId, param.reportsv3DeleteRequirementRequest,  options).toPromise();
    }

    /**
     * Summary: Delete a variant Description: Delete a variant
     * @param param the request object
     */
    public reportsServiceDeleteVariantWithHttpInfo(param: ReportsServiceApiReportsServiceDeleteVariantRequest, options?: ConfigurationOptions): Promise<HttpInfo<Reportsv3DeleteVariantResponse>> {
        return this.api.reportsServiceDeleteVariantWithHttpInfo(param.variantId,  options).toPromise();
    }

    /**
     * Summary: Delete a variant Description: Delete a variant
     * @param param the request object
     */
    public reportsServiceDeleteVariant(param: ReportsServiceApiReportsServiceDeleteVariantRequest, options?: ConfigurationOptions): Promise<Reportsv3DeleteVariantResponse> {
        return this.api.reportsServiceDeleteVariant(param.variantId,  options).toPromise();
    }

    /**
     * Summary:  Get all available report categories. Description: Get all category related fields or all possible fields.
     * @param param the request object
     */
    public reportsServiceGetCategoriesWithHttpInfo(param: ReportsServiceApiReportsServiceGetCategoriesRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Reportsv3GetCategoriesResponse>> {
        return this.api.reportsServiceGetCategoriesWithHttpInfo(param.reportId,  options).toPromise();
    }

    /**
     * Summary:  Get all available report categories. Description: Get all category related fields or all possible fields.
     * @param param the request object
     */
    public reportsServiceGetCategories(param: ReportsServiceApiReportsServiceGetCategoriesRequest = {}, options?: ConfigurationOptions): Promise<Reportsv3GetCategoriesResponse> {
        return this.api.reportsServiceGetCategories(param.reportId,  options).toPromise();
    }

    /**
     * Summary: Get chart settings Description: Get a custom chart based on provided report id.
     * @param param the request object
     */
    public reportsServiceGetChartSettingsWithHttpInfo(param: ReportsServiceApiReportsServiceGetChartSettingsRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Reportsv3GetChartSettingsResponse>> {
        return this.api.reportsServiceGetChartSettingsWithHttpInfo(param.chartId, param.reportId,  options).toPromise();
    }

    /**
     * Summary: Get chart settings Description: Get a custom chart based on provided report id.
     * @param param the request object
     */
    public reportsServiceGetChartSettings(param: ReportsServiceApiReportsServiceGetChartSettingsRequest = {}, options?: ConfigurationOptions): Promise<Reportsv3GetChartSettingsResponse> {
        return this.api.reportsServiceGetChartSettings(param.chartId, param.reportId,  options).toPromise();
    }

    /**
     * Summary: Get chart settings v2 Description: Get a custom VEGA chart based on provided report id.
     * @param param the request object
     */
    public reportsServiceGetChartSettingsv2WithHttpInfo(param: ReportsServiceApiReportsServiceGetChartSettingsv2Request = {}, options?: ConfigurationOptions): Promise<HttpInfo<Reportsv3GetChartSettingsv2Response>> {
        return this.api.reportsServiceGetChartSettingsv2WithHttpInfo(param.chartId, param.reportId,  options).toPromise();
    }

    /**
     * Summary: Get chart settings v2 Description: Get a custom VEGA chart based on provided report id.
     * @param param the request object
     */
    public reportsServiceGetChartSettingsv2(param: ReportsServiceApiReportsServiceGetChartSettingsv2Request = {}, options?: ConfigurationOptions): Promise<Reportsv3GetChartSettingsv2Response> {
        return this.api.reportsServiceGetChartSettingsv2(param.chartId, param.reportId,  options).toPromise();
    }

    /**
     * Summary: Get chart template v2 Description: Get all custom VEGA chart templates.
     * @param param the request object
     */
    public reportsServiceGetChartTemplatesv2WithHttpInfo(param: ReportsServiceApiReportsServiceGetChartTemplatesv2Request = {}, options?: ConfigurationOptions): Promise<HttpInfo<Reportsv3GetChartTemplatesv2Response>> {
        return this.api.reportsServiceGetChartTemplatesv2WithHttpInfo( options).toPromise();
    }

    /**
     * Summary: Get chart template v2 Description: Get all custom VEGA chart templates.
     * @param param the request object
     */
    public reportsServiceGetChartTemplatesv2(param: ReportsServiceApiReportsServiceGetChartTemplatesv2Request = {}, options?: ConfigurationOptions): Promise<Reportsv3GetChartTemplatesv2Response> {
        return this.api.reportsServiceGetChartTemplatesv2( options).toPromise();
    }

    /**
     * Summary: Get controls Description: Get a list of controls with all data.
     * @param param the request object
     */
    public reportsServiceGetControlsWithHttpInfo(param: ReportsServiceApiReportsServiceGetControlsRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Reportsv3GetControlsResponse>> {
        return this.api.reportsServiceGetControlsWithHttpInfo( options).toPromise();
    }

    /**
     * Summary: Get controls Description: Get a list of controls with all data.
     * @param param the request object
     */
    public reportsServiceGetControls(param: ReportsServiceApiReportsServiceGetControlsRequest = {}, options?: ConfigurationOptions): Promise<Reportsv3GetControlsResponse> {
        return this.api.reportsServiceGetControls( options).toPromise();
    }

    /**
     * Summary: Get fields by categories Description: Get all category related fields or all possible fields based on a list of categories.
     * @param param the request object
     */
    public reportsServiceGetFieldsByCategoriesWithHttpInfo(param: ReportsServiceApiReportsServiceGetFieldsByCategoriesRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Reportsv3GetFieldsByCategoriesResponse>> {
        return this.api.reportsServiceGetFieldsByCategoriesWithHttpInfo(param.categoryIds,  options).toPromise();
    }

    /**
     * Summary: Get fields by categories Description: Get all category related fields or all possible fields based on a list of categories.
     * @param param the request object
     */
    public reportsServiceGetFieldsByCategories(param: ReportsServiceApiReportsServiceGetFieldsByCategoriesRequest = {}, options?: ConfigurationOptions): Promise<Reportsv3GetFieldsByCategoriesResponse> {
        return this.api.reportsServiceGetFieldsByCategories(param.categoryIds,  options).toPromise();
    }

    /**
     * Summary: Get fields by category Description: Get all category related fields or all possible fields.
     * @param param the request object
     */
    public reportsServiceGetFieldsByCategoryWithHttpInfo(param: ReportsServiceApiReportsServiceGetFieldsByCategoryRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Reportsv3GetFieldsByCategoryResponse>> {
        return this.api.reportsServiceGetFieldsByCategoryWithHttpInfo(param.categoryId, param.reportId, param.tableName,  options).toPromise();
    }

    /**
     * Summary: Get fields by category Description: Get all category related fields or all possible fields.
     * @param param the request object
     */
    public reportsServiceGetFieldsByCategory(param: ReportsServiceApiReportsServiceGetFieldsByCategoryRequest = {}, options?: ConfigurationOptions): Promise<Reportsv3GetFieldsByCategoryResponse> {
        return this.api.reportsServiceGetFieldsByCategory(param.categoryId, param.reportId, param.tableName,  options).toPromise();
    }

    /**
     * Summary: Get grades Description: Get a list of grades with all data.
     * @param param the request object
     */
    public reportsServiceGetGradesWithHttpInfo(param: ReportsServiceApiReportsServiceGetGradesRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Reportsv3GetGradesResponse>> {
        return this.api.reportsServiceGetGradesWithHttpInfo( options).toPromise();
    }

    /**
     * Summary: Get grades Description: Get a list of grades with all data.
     * @param param the request object
     */
    public reportsServiceGetGrades(param: ReportsServiceApiReportsServiceGetGradesRequest = {}, options?: ConfigurationOptions): Promise<Reportsv3GetGradesResponse> {
        return this.api.reportsServiceGetGrades( options).toPromise();
    }

    /**
     * Summary: Get all joins Description: Get all custom joins.
     * @param param the request object
     */
    public reportsServiceGetJoinsWithHttpInfo(param: ReportsServiceApiReportsServiceGetJoinsRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Reportsv3GetJoinsResponse>> {
        return this.api.reportsServiceGetJoinsWithHttpInfo(param.categoryId,  options).toPromise();
    }

    /**
     * Summary: Get all joins Description: Get all custom joins.
     * @param param the request object
     */
    public reportsServiceGetJoins(param: ReportsServiceApiReportsServiceGetJoinsRequest = {}, options?: ConfigurationOptions): Promise<Reportsv3GetJoinsResponse> {
        return this.api.reportsServiceGetJoins(param.categoryId,  options).toPromise();
    }

    /**
     * Summary: Get measures Description: Get a list of measures with all data.
     * @param param the request object
     */
    public reportsServiceGetMeasuresWithHttpInfo(param: ReportsServiceApiReportsServiceGetMeasuresRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Reportsv3GetMeasuresResponse>> {
        return this.api.reportsServiceGetMeasuresWithHttpInfo( options).toPromise();
    }

    /**
     * Summary: Get measures Description: Get a list of measures with all data.
     * @param param the request object
     */
    public reportsServiceGetMeasures(param: ReportsServiceApiReportsServiceGetMeasuresRequest = {}, options?: ConfigurationOptions): Promise<Reportsv3GetMeasuresResponse> {
        return this.api.reportsServiceGetMeasures( options).toPromise();
    }

    /**
     * Summary: Get metrics Description: Get a list of metrics with all data.
     * @param param the request object
     */
    public reportsServiceGetMetricsWithHttpInfo(param: ReportsServiceApiReportsServiceGetMetricsRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Reportsv3GetMetricsResponse>> {
        return this.api.reportsServiceGetMetricsWithHttpInfo( options).toPromise();
    }

    /**
     * Summary: Get metrics Description: Get a list of metrics with all data.
     * @param param the request object
     */
    public reportsServiceGetMetrics(param: ReportsServiceApiReportsServiceGetMetricsRequest = {}, options?: ConfigurationOptions): Promise<Reportsv3GetMetricsResponse> {
        return this.api.reportsServiceGetMetrics( options).toPromise();
    }

    /**
     * Summary: Get controls Description: Get a list of controls with all data.
     * @param param the request object
     */
    public reportsServiceGetProgramsWithHttpInfo(param: ReportsServiceApiReportsServiceGetProgramsRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Reportsv3GetProgramsResponse>> {
        return this.api.reportsServiceGetProgramsWithHttpInfo( options).toPromise();
    }

    /**
     * Summary: Get controls Description: Get a list of controls with all data.
     * @param param the request object
     */
    public reportsServiceGetPrograms(param: ReportsServiceApiReportsServiceGetProgramsRequest = {}, options?: ConfigurationOptions): Promise<Reportsv3GetProgramsResponse> {
        return this.api.reportsServiceGetPrograms( options).toPromise();
    }

    /**
     * Summary: Get query by report definition Description: Get query by report definition.
     * @param param the request object
     */
    public reportsServiceGetQueryByReportDefinitionWithHttpInfo(param: ReportsServiceApiReportsServiceGetQueryByReportDefinitionRequest, options?: ConfigurationOptions): Promise<HttpInfo<Reportsv3GetReportQueryResponse>> {
        return this.api.reportsServiceGetQueryByReportDefinitionWithHttpInfo(param.reportsv3GetQueryByReportDefinitionRequest,  options).toPromise();
    }

    /**
     * Summary: Get query by report definition Description: Get query by report definition.
     * @param param the request object
     */
    public reportsServiceGetQueryByReportDefinition(param: ReportsServiceApiReportsServiceGetQueryByReportDefinitionRequest, options?: ConfigurationOptions): Promise<Reportsv3GetReportQueryResponse> {
        return this.api.reportsServiceGetQueryByReportDefinition(param.reportsv3GetQueryByReportDefinitionRequest,  options).toPromise();
    }

    /**
     * Summary: Get query by report ID Description: Get query by report ID.
     * @param param the request object
     */
    public reportsServiceGetQueryByReportIDWithHttpInfo(param: ReportsServiceApiReportsServiceGetQueryByReportIDRequest, options?: ConfigurationOptions): Promise<HttpInfo<Reportsv3GetReportQueryResponse>> {
        return this.api.reportsServiceGetQueryByReportIDWithHttpInfo(param.reportsv3GetQueryByReportIDRequest,  options).toPromise();
    }

    /**
     * Summary: Get query by report ID Description: Get query by report ID.
     * @param param the request object
     */
    public reportsServiceGetQueryByReportID(param: ReportsServiceApiReportsServiceGetQueryByReportIDRequest, options?: ConfigurationOptions): Promise<Reportsv3GetReportQueryResponse> {
        return this.api.reportsServiceGetQueryByReportID(param.reportsv3GetQueryByReportIDRequest,  options).toPromise();
    }

    /**
     * Summary: Get report definition Description: Get report definition.
     * @param param the request object
     */
    public reportsServiceGetReportDefinitionWithHttpInfo(param: ReportsServiceApiReportsServiceGetReportDefinitionRequest, options?: ConfigurationOptions): Promise<HttpInfo<Reportsv3GetReportDefinitionResponse>> {
        return this.api.reportsServiceGetReportDefinitionWithHttpInfo(param.reportId,  options).toPromise();
    }

    /**
     * Summary: Get report definition Description: Get report definition.
     * @param param the request object
     */
    public reportsServiceGetReportDefinition(param: ReportsServiceApiReportsServiceGetReportDefinitionRequest, options?: ConfigurationOptions): Promise<Reportsv3GetReportDefinitionResponse> {
        return this.api.reportsServiceGetReportDefinition(param.reportId,  options).toPromise();
    }

    /**
     * Summary: Get report groups Description: Get reports used by the provided groups.
     * @param param the request object
     */
    public reportsServiceGetReportGroupsWithHttpInfo(param: ReportsServiceApiReportsServiceGetReportGroupsRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Reportsv3GetReportGroupsResponse>> {
        return this.api.reportsServiceGetReportGroupsWithHttpInfo(param.groups,  options).toPromise();
    }

    /**
     * Summary: Get report groups Description: Get reports used by the provided groups.
     * @param param the request object
     */
    public reportsServiceGetReportGroups(param: ReportsServiceApiReportsServiceGetReportGroupsRequest = {}, options?: ConfigurationOptions): Promise<Reportsv3GetReportGroupsResponse> {
        return this.api.reportsServiceGetReportGroups(param.groups,  options).toPromise();
    }

    /**
     * Summary: Get report synopsis Description: Return BriefReport.
     * @param param the request object
     */
    public reportsServiceGetReportSynopsisWithHttpInfo(param: ReportsServiceApiReportsServiceGetReportSynopsisRequest, options?: ConfigurationOptions): Promise<HttpInfo<Reportsv3GetReportSynopsisResponse>> {
        return this.api.reportsServiceGetReportSynopsisWithHttpInfo(param.reportId,  options).toPromise();
    }

    /**
     * Summary: Get report synopsis Description: Return BriefReport.
     * @param param the request object
     */
    public reportsServiceGetReportSynopsis(param: ReportsServiceApiReportsServiceGetReportSynopsisRequest, options?: ConfigurationOptions): Promise<Reportsv3GetReportSynopsisResponse> {
        return this.api.reportsServiceGetReportSynopsis(param.reportId,  options).toPromise();
    }

    /**
     * Summary: Get report timestamp header Description: Get where to take a report timestamp given an entity.
     * @param param the request object
     */
    public reportsServiceGetReportTimestampHeaderWithHttpInfo(param: ReportsServiceApiReportsServiceGetReportTimestampHeaderRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Reportsv3GetReportTimestampHeaderResponse>> {
        return this.api.reportsServiceGetReportTimestampHeaderWithHttpInfo(param.categoryId, param.tableNames,  options).toPromise();
    }

    /**
     * Summary: Get report timestamp header Description: Get where to take a report timestamp given an entity.
     * @param param the request object
     */
    public reportsServiceGetReportTimestampHeader(param: ReportsServiceApiReportsServiceGetReportTimestampHeaderRequest = {}, options?: ConfigurationOptions): Promise<Reportsv3GetReportTimestampHeaderResponse> {
        return this.api.reportsServiceGetReportTimestampHeader(param.categoryId, param.tableNames,  options).toPromise();
    }

    /**
     * Summary: Get reports Description: Get reports list.
     * @param param the request object
     */
    public reportsServiceGetReportsWithHttpInfo(param: ReportsServiceApiReportsServiceGetReportsRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Reportsv3GetReportsResponse>> {
        return this.api.reportsServiceGetReportsWithHttpInfo(param.categoryId, param.tableName,  options).toPromise();
    }

    /**
     * Summary: Get reports Description: Get reports list.
     * @param param the request object
     */
    public reportsServiceGetReports(param: ReportsServiceApiReportsServiceGetReportsRequest = {}, options?: ConfigurationOptions): Promise<Reportsv3GetReportsResponse> {
        return this.api.reportsServiceGetReports(param.categoryId, param.tableName,  options).toPromise();
    }

    /**
     * Summary: Get the reports that use a join Description: Get the reports that use a join and the headers that are imported by the reports using the join
     * @param param the request object
     */
    public reportsServiceGetReportsForJoinWithHttpInfo(param: ReportsServiceApiReportsServiceGetReportsForJoinRequest, options?: ConfigurationOptions): Promise<HttpInfo<Reportsv3GetReportsForJoinResponse>> {
        return this.api.reportsServiceGetReportsForJoinWithHttpInfo(param.joinId,  options).toPromise();
    }

    /**
     * Summary: Get the reports that use a join Description: Get the reports that use a join and the headers that are imported by the reports using the join
     * @param param the request object
     */
    public reportsServiceGetReportsForJoin(param: ReportsServiceApiReportsServiceGetReportsForJoinRequest, options?: ConfigurationOptions): Promise<Reportsv3GetReportsForJoinResponse> {
        return this.api.reportsServiceGetReportsForJoin(param.joinId,  options).toPromise();
    }

    /**
     * Summary: Get reports tags Description: Get all report distinct tags.
     * @param param the request object
     */
    public reportsServiceGetReportsTagsWithHttpInfo(param: ReportsServiceApiReportsServiceGetReportsTagsRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Reportsv3GetReportsTagsResponse>> {
        return this.api.reportsServiceGetReportsTagsWithHttpInfo( options).toPromise();
    }

    /**
     * Summary: Get reports tags Description: Get all report distinct tags.
     * @param param the request object
     */
    public reportsServiceGetReportsTags(param: ReportsServiceApiReportsServiceGetReportsTagsRequest = {}, options?: ConfigurationOptions): Promise<Reportsv3GetReportsTagsResponse> {
        return this.api.reportsServiceGetReportsTags( options).toPromise();
    }

    /**
     * Summary: Get requirements Description: Get a list of requirements with all data.
     * @param param the request object
     */
    public reportsServiceGetRequirementsWithHttpInfo(param: ReportsServiceApiReportsServiceGetRequirementsRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Reportsv3GetRequirementsResponse>> {
        return this.api.reportsServiceGetRequirementsWithHttpInfo( options).toPromise();
    }

    /**
     * Summary: Get requirements Description: Get a list of requirements with all data.
     * @param param the request object
     */
    public reportsServiceGetRequirements(param: ReportsServiceApiReportsServiceGetRequirementsRequest = {}, options?: ConfigurationOptions): Promise<Reportsv3GetRequirementsResponse> {
        return this.api.reportsServiceGetRequirements( options).toPromise();
    }

    /**
     * Summary: Get a variant Description: Get a given variant
     * @param param the request object
     */
    public reportsServiceGetVariantWithHttpInfo(param: ReportsServiceApiReportsServiceGetVariantRequest, options?: ConfigurationOptions): Promise<HttpInfo<Reportsv3GetVariantResponse>> {
        return this.api.reportsServiceGetVariantWithHttpInfo(param.variantId,  options).toPromise();
    }

    /**
     * Summary: Get a variant Description: Get a given variant
     * @param param the request object
     */
    public reportsServiceGetVariant(param: ReportsServiceApiReportsServiceGetVariantRequest, options?: ConfigurationOptions): Promise<Reportsv3GetVariantResponse> {
        return this.api.reportsServiceGetVariant(param.variantId,  options).toPromise();
    }

    /**
     * Summary: Get all variants Description: Get all variants in reports
     * @param param the request object
     */
    public reportsServiceGetVariantsWithHttpInfo(param: ReportsServiceApiReportsServiceGetVariantsRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Reportsv3GetVariantsResponse>> {
        return this.api.reportsServiceGetVariantsWithHttpInfo( options).toPromise();
    }

    /**
     * Summary: Get all variants Description: Get all variants in reports
     * @param param the request object
     */
    public reportsServiceGetVariants(param: ReportsServiceApiReportsServiceGetVariantsRequest = {}, options?: ConfigurationOptions): Promise<Reportsv3GetVariantsResponse> {
        return this.api.reportsServiceGetVariants( options).toPromise();
    }

    /**
     * Summary: Partial chart update Description: Update a custom chart with partial information.
     * @param param the request object
     */
    public reportsServicePartialChartUpdateWithHttpInfo(param: ReportsServiceApiReportsServicePartialChartUpdateRequest, options?: ConfigurationOptions): Promise<HttpInfo<Reportsv3PartialChartUpdateResponse>> {
        return this.api.reportsServicePartialChartUpdateWithHttpInfo(param.chartId, param.reportsv3PartialChartUpdateRequest,  options).toPromise();
    }

    /**
     * Summary: Partial chart update Description: Update a custom chart with partial information.
     * @param param the request object
     */
    public reportsServicePartialChartUpdate(param: ReportsServiceApiReportsServicePartialChartUpdateRequest, options?: ConfigurationOptions): Promise<Reportsv3PartialChartUpdateResponse> {
        return this.api.reportsServicePartialChartUpdate(param.chartId, param.reportsv3PartialChartUpdateRequest,  options).toPromise();
    }

    /**
     * Summary: Partial report update Description: Update a custom report with partial information.
     * @param param the request object
     */
    public reportsServicePartialReportUpdateWithHttpInfo(param: ReportsServiceApiReportsServicePartialReportUpdateRequest, options?: ConfigurationOptions): Promise<HttpInfo<Reportsv3PartialReportUpdateResponse>> {
        return this.api.reportsServicePartialReportUpdateWithHttpInfo(param.reportId, param.reportsv3PartialReportUpdateRequest,  options).toPromise();
    }

    /**
     * Summary: Partial report update Description: Update a custom report with partial information.
     * @param param the request object
     */
    public reportsServicePartialReportUpdate(param: ReportsServiceApiReportsServicePartialReportUpdateRequest, options?: ConfigurationOptions): Promise<Reportsv3PartialReportUpdateResponse> {
        return this.api.reportsServicePartialReportUpdate(param.reportId, param.reportsv3PartialReportUpdateRequest,  options).toPromise();
    }

    /**
     * Summary: Refresh metrics via grades. Description: Refresh metrics via grades.
     * @param param the request object
     */
    public reportsServiceRunGradesWithHttpInfo(param: ReportsServiceApiReportsServiceRunGradesRequest, options?: ConfigurationOptions): Promise<HttpInfo<Reportsv3RunGradesResponse>> {
        return this.api.reportsServiceRunGradesWithHttpInfo(param.reportsv3RunGradesRequest,  options).toPromise();
    }

    /**
     * Summary: Refresh metrics via grades. Description: Refresh metrics via grades.
     * @param param the request object
     */
    public reportsServiceRunGrades(param: ReportsServiceApiReportsServiceRunGradesRequest, options?: ConfigurationOptions): Promise<Reportsv3RunGradesResponse> {
        return this.api.reportsServiceRunGrades(param.reportsv3RunGradesRequest,  options).toPromise();
    }

    /**
     * Summary: Run a variant Description: Run the operations in a variant
     * @param param the request object
     */
    public reportsServiceRunVariantOperationWithHttpInfo(param: ReportsServiceApiReportsServiceRunVariantOperationRequest, options?: ConfigurationOptions): Promise<HttpInfo<Reportsv3RunVariantOperationResponse>> {
        return this.api.reportsServiceRunVariantOperationWithHttpInfo(param.reportsv3RunVariantOperationRequest,  options).toPromise();
    }

    /**
     * Summary: Run a variant Description: Run the operations in a variant
     * @param param the request object
     */
    public reportsServiceRunVariantOperation(param: ReportsServiceApiReportsServiceRunVariantOperationRequest, options?: ConfigurationOptions): Promise<Reportsv3RunVariantOperationResponse> {
        return this.api.reportsServiceRunVariantOperation(param.reportsv3RunVariantOperationRequest,  options).toPromise();
    }

    /**
     * Summary: Transpose Description: Return the corresponding full sql data.
     * @param param the request object
     */
    public reportsServiceTransposeWithHttpInfo(param: ReportsServiceApiReportsServiceTransposeRequest, options?: ConfigurationOptions): Promise<HttpInfo<Reportsv3RunReportResponse>> {
        return this.api.reportsServiceTransposeWithHttpInfo(param.reportsv3TransposeRequest,  options).toPromise();
    }

    /**
     * Summary: Transpose Description: Return the corresponding full sql data.
     * @param param the request object
     */
    public reportsServiceTranspose(param: ReportsServiceApiReportsServiceTransposeRequest, options?: ConfigurationOptions): Promise<Reportsv3RunReportResponse> {
        return this.api.reportsServiceTranspose(param.reportsv3TransposeRequest,  options).toPromise();
    }

    /**
     * Summary: Update chart Description: Update a custom chart.
     * @param param the request object
     */
    public reportsServiceUpdateChartWithHttpInfo(param: ReportsServiceApiReportsServiceUpdateChartRequest, options?: ConfigurationOptions): Promise<HttpInfo<Reportsv3UpdateChartResponse>> {
        return this.api.reportsServiceUpdateChartWithHttpInfo(param.chartId, param.reportsv3UpdateChartRequest,  options).toPromise();
    }

    /**
     * Summary: Update chart Description: Update a custom chart.
     * @param param the request object
     */
    public reportsServiceUpdateChart(param: ReportsServiceApiReportsServiceUpdateChartRequest, options?: ConfigurationOptions): Promise<Reportsv3UpdateChartResponse> {
        return this.api.reportsServiceUpdateChart(param.chartId, param.reportsv3UpdateChartRequest,  options).toPromise();
    }

    /**
     * Summary: Update chart v2 Description: Update a custom VEGA chart.
     * @param param the request object
     */
    public reportsServiceUpdateChartv2WithHttpInfo(param: ReportsServiceApiReportsServiceUpdateChartv2Request, options?: ConfigurationOptions): Promise<HttpInfo<Reportsv3UpdateChartv2Response>> {
        return this.api.reportsServiceUpdateChartv2WithHttpInfo(param.chartId, param.reportsv3UpdateChartv2Request,  options).toPromise();
    }

    /**
     * Summary: Update chart v2 Description: Update a custom VEGA chart.
     * @param param the request object
     */
    public reportsServiceUpdateChartv2(param: ReportsServiceApiReportsServiceUpdateChartv2Request, options?: ConfigurationOptions): Promise<Reportsv3UpdateChartv2Response> {
        return this.api.reportsServiceUpdateChartv2(param.chartId, param.reportsv3UpdateChartv2Request,  options).toPromise();
    }

    /**
     * Summary: Update Control. Description: Update a Control.
     * @param param the request object
     */
    public reportsServiceUpdateControlWithHttpInfo(param: ReportsServiceApiReportsServiceUpdateControlRequest, options?: ConfigurationOptions): Promise<HttpInfo<Reportsv3UpdateControlResponse>> {
        return this.api.reportsServiceUpdateControlWithHttpInfo(param.controlId, param.reportsv3UpdateControlRequest,  options).toPromise();
    }

    /**
     * Summary: Update Control. Description: Update a Control.
     * @param param the request object
     */
    public reportsServiceUpdateControl(param: ReportsServiceApiReportsServiceUpdateControlRequest, options?: ConfigurationOptions): Promise<Reportsv3UpdateControlResponse> {
        return this.api.reportsServiceUpdateControl(param.controlId, param.reportsv3UpdateControlRequest,  options).toPromise();
    }

    /**
     * Summary: Update Grade. Description: Update a Grade.
     * @param param the request object
     */
    public reportsServiceUpdateGradeWithHttpInfo(param: ReportsServiceApiReportsServiceUpdateGradeRequest, options?: ConfigurationOptions): Promise<HttpInfo<Reportsv3UpdateGradeResponse>> {
        return this.api.reportsServiceUpdateGradeWithHttpInfo(param.gradeId, param.reportsv3UpdateGradeRequest,  options).toPromise();
    }

    /**
     * Summary: Update Grade. Description: Update a Grade.
     * @param param the request object
     */
    public reportsServiceUpdateGrade(param: ReportsServiceApiReportsServiceUpdateGradeRequest, options?: ConfigurationOptions): Promise<Reportsv3UpdateGradeResponse> {
        return this.api.reportsServiceUpdateGrade(param.gradeId, param.reportsv3UpdateGradeRequest,  options).toPromise();
    }

    /**
     * Summary: Update a join Description: Update a custom join
     * @param param the request object
     */
    public reportsServiceUpdateJoinWithHttpInfo(param: ReportsServiceApiReportsServiceUpdateJoinRequest, options?: ConfigurationOptions): Promise<HttpInfo<Reportsv3UpdateJoinResponse>> {
        return this.api.reportsServiceUpdateJoinWithHttpInfo(param.joinId, param.reportsv3UpdateJoinRequest,  options).toPromise();
    }

    /**
     * Summary: Update a join Description: Update a custom join
     * @param param the request object
     */
    public reportsServiceUpdateJoin(param: ReportsServiceApiReportsServiceUpdateJoinRequest, options?: ConfigurationOptions): Promise<Reportsv3UpdateJoinResponse> {
        return this.api.reportsServiceUpdateJoin(param.joinId, param.reportsv3UpdateJoinRequest,  options).toPromise();
    }

    /**
     * Summary: Update measure. Description: Update a measure.
     * @param param the request object
     */
    public reportsServiceUpdateMeasureWithHttpInfo(param: ReportsServiceApiReportsServiceUpdateMeasureRequest, options?: ConfigurationOptions): Promise<HttpInfo<Reportsv3UpdateMeasureResponse>> {
        return this.api.reportsServiceUpdateMeasureWithHttpInfo(param.measureId, param.reportsv3UpdateMeasureRequest,  options).toPromise();
    }

    /**
     * Summary: Update measure. Description: Update a measure.
     * @param param the request object
     */
    public reportsServiceUpdateMeasure(param: ReportsServiceApiReportsServiceUpdateMeasureRequest, options?: ConfigurationOptions): Promise<Reportsv3UpdateMeasureResponse> {
        return this.api.reportsServiceUpdateMeasure(param.measureId, param.reportsv3UpdateMeasureRequest,  options).toPromise();
    }

    /**
     * Summary: Update metric. Description: Update a metric.
     * @param param the request object
     */
    public reportsServiceUpdateMetricWithHttpInfo(param: ReportsServiceApiReportsServiceUpdateMetricRequest, options?: ConfigurationOptions): Promise<HttpInfo<Reportsv3UpdateMetricResponse>> {
        return this.api.reportsServiceUpdateMetricWithHttpInfo(param.metricId, param.reportsv3UpdateMetricRequest,  options).toPromise();
    }

    /**
     * Summary: Update metric. Description: Update a metric.
     * @param param the request object
     */
    public reportsServiceUpdateMetric(param: ReportsServiceApiReportsServiceUpdateMetricRequest, options?: ConfigurationOptions): Promise<Reportsv3UpdateMetricResponse> {
        return this.api.reportsServiceUpdateMetric(param.metricId, param.reportsv3UpdateMetricRequest,  options).toPromise();
    }

    /**
     * Summary: Update Program. Description: Update a Program.
     * @param param the request object
     */
    public reportsServiceUpdateProgramWithHttpInfo(param: ReportsServiceApiReportsServiceUpdateProgramRequest, options?: ConfigurationOptions): Promise<HttpInfo<Reportsv3UpdateProgramResponse>> {
        return this.api.reportsServiceUpdateProgramWithHttpInfo(param.programId, param.reportsv3UpdateProgramRequest,  options).toPromise();
    }

    /**
     * Summary: Update Program. Description: Update a Program.
     * @param param the request object
     */
    public reportsServiceUpdateProgram(param: ReportsServiceApiReportsServiceUpdateProgramRequest, options?: ConfigurationOptions): Promise<Reportsv3UpdateProgramResponse> {
        return this.api.reportsServiceUpdateProgram(param.programId, param.reportsv3UpdateProgramRequest,  options).toPromise();
    }

    /**
     * Summary: Update report Description: Update a custom report.
     * @param param the request object
     */
    public reportsServiceUpdateReportWithHttpInfo(param: ReportsServiceApiReportsServiceUpdateReportRequest, options?: ConfigurationOptions): Promise<HttpInfo<Reportsv3UpdateReportResponse>> {
        return this.api.reportsServiceUpdateReportWithHttpInfo(param.reportId, param.reportsv3UpdateReportRequest,  options).toPromise();
    }

    /**
     * Summary: Update report Description: Update a custom report.
     * @param param the request object
     */
    public reportsServiceUpdateReport(param: ReportsServiceApiReportsServiceUpdateReportRequest, options?: ConfigurationOptions): Promise<Reportsv3UpdateReportResponse> {
        return this.api.reportsServiceUpdateReport(param.reportId, param.reportsv3UpdateReportRequest,  options).toPromise();
    }

    /**
     * Summary: Update Requirement. Description: Update a Requirement.
     * @param param the request object
     */
    public reportsServiceUpdateRequirementWithHttpInfo(param: ReportsServiceApiReportsServiceUpdateRequirementRequest, options?: ConfigurationOptions): Promise<HttpInfo<Reportsv3UpdateRequirementResponse>> {
        return this.api.reportsServiceUpdateRequirementWithHttpInfo(param.requirementId, param.reportsv3UpdateRequirementRequest,  options).toPromise();
    }

    /**
     * Summary: Update Requirement. Description: Update a Requirement.
     * @param param the request object
     */
    public reportsServiceUpdateRequirement(param: ReportsServiceApiReportsServiceUpdateRequirementRequest, options?: ConfigurationOptions): Promise<Reportsv3UpdateRequirementResponse> {
        return this.api.reportsServiceUpdateRequirement(param.requirementId, param.reportsv3UpdateRequirementRequest,  options).toPromise();
    }

    /**
     * Summary: Update a variant Description: Update a variant with a custom override
     * @param param the request object
     */
    public reportsServiceUpdateVariantOverrideWithHttpInfo(param: ReportsServiceApiReportsServiceUpdateVariantOverrideRequest, options?: ConfigurationOptions): Promise<HttpInfo<Reportsv3UpdateVariantOverrideResponse>> {
        return this.api.reportsServiceUpdateVariantOverrideWithHttpInfo(param.variantId, param.reportsv3UpdateVariantOverrideRequest,  options).toPromise();
    }

    /**
     * Summary: Update a variant Description: Update a variant with a custom override
     * @param param the request object
     */
    public reportsServiceUpdateVariantOverride(param: ReportsServiceApiReportsServiceUpdateVariantOverrideRequest, options?: ConfigurationOptions): Promise<Reportsv3UpdateVariantOverrideResponse> {
        return this.api.reportsServiceUpdateVariantOverride(param.variantId, param.reportsv3UpdateVariantOverrideRequest,  options).toPromise();
    }

}

import { ObservableRiskAnalyticsControllerApi } from "./ObservableAPI";
import { RiskAnalyticsControllerApiRequestFactory, RiskAnalyticsControllerApiResponseProcessor} from "../apis/RiskAnalyticsControllerApi";

export interface RiskAnalyticsControllerApiRiskAnalyticsControllerEnableDisableRiskEventFeedbackRequest {
    /**
     * 
     * @type Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest
     * @memberof RiskAnalyticsControllerApiriskAnalyticsControllerEnableDisableRiskEventFeedback
     */
    riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest: Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest
}

export interface RiskAnalyticsControllerApiRiskAnalyticsControllerEnableDisableRiskEventProcessRequest {
    /**
     * 
     * @type Riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest
     * @memberof RiskAnalyticsControllerApiriskAnalyticsControllerEnableDisableRiskEventProcess
     */
    riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest: Riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest
}

export interface RiskAnalyticsControllerApiRiskAnalyticsControllerGetAllClassificationsListRequest {
}

export interface RiskAnalyticsControllerApiRiskAnalyticsControllerGetRiskEventClassificationsListRequest {
    /**
     * Risk id
     * Defaults to: undefined
     * @type number
     * @memberof RiskAnalyticsControllerApiriskAnalyticsControllerGetRiskEventClassificationsList
     */
    riskId: number
}

export interface RiskAnalyticsControllerApiRiskAnalyticsControllerGetRiskEventDataForSummarizationRequest {
    /**
     * Risk ID
     * Defaults to: undefined
     * @type number
     * @memberof RiskAnalyticsControllerApiriskAnalyticsControllerGetRiskEventDataForSummarization
     */
    riskId: number
    /**
     * Indicates whether to include indicators in the response or not.
     * Defaults to: undefined
     * @type boolean
     * @memberof RiskAnalyticsControllerApiriskAnalyticsControllerGetRiskEventDataForSummarization
     */
    includeIndicators?: boolean
    /**
     * Max number of hours to get for the risk.
     * Defaults to: undefined
     * @type number
     * @memberof RiskAnalyticsControllerApiriskAnalyticsControllerGetRiskEventDataForSummarization
     */
    numFindingsLimit?: number
}

export interface RiskAnalyticsControllerApiRiskAnalyticsControllerGetRiskEventDetailsRequest {
    /**
     * Risk id.
     * Defaults to: undefined
     * @type number
     * @memberof RiskAnalyticsControllerApiriskAnalyticsControllerGetRiskEventDetails
     */
    riskId: number
}

export interface RiskAnalyticsControllerApiRiskAnalyticsControllerGetRiskEventProcessStatusRequest {
}

export interface RiskAnalyticsControllerApiRiskAnalyticsControllerGetRiskEventRowRequest {
    /**
     * Status to retrieve only the status events, blank to retrieve all.
     * Defaults to: &#39;UNDEFINED_STATUS&#39;
     * @type &#39;UNDEFINED_STATUS&#39; | &#39;OPENED&#39; | &#39;CLOSED&#39; | &#39;DELEGATED&#39; | &#39;FOLLOWUP&#39;
     * @memberof RiskAnalyticsControllerApiriskAnalyticsControllerGetRiskEventRow
     */
    status?: 'UNDEFINED_STATUS' | 'OPENED' | 'CLOSED' | 'DELEGATED' | 'FOLLOWUP'
    /**
     * The API retrieves risk events that were open in a time range. date_from defines the start of this time range. format YYYY-MM-DDTHH:mm:ssZ.
     * Defaults to: undefined
     * @type Date
     * @memberof RiskAnalyticsControllerApiriskAnalyticsControllerGetRiskEventRow
     */
    dateFrom?: Date
    /**
     * The API retrieves risk events that were open in a time range. date_to defines the end of this time range. format YYYY-MM-DDTHH:mm:ssZ.
     * Defaults to: undefined
     * @type Date
     * @memberof RiskAnalyticsControllerApiriskAnalyticsControllerGetRiskEventRow
     */
    dateTo?: Date
    /**
     * Pivot type - enum.
     * Defaults to: &#39;UNDEFINED_PIVOT_TYPE&#39;
     * @type &#39;UNDEFINED_PIVOT_TYPE&#39; | &#39;DATABASE&#39; | &#39;DB_USER&#39; | &#39;OS_USER&#39; | &#39;GLOBAL&#39;
     * @memberof RiskAnalyticsControllerApiriskAnalyticsControllerGetRiskEventRow
     */
    pivotType?: 'UNDEFINED_PIVOT_TYPE' | 'DATABASE' | 'DB_USER' | 'OS_USER' | 'GLOBAL'
    /**
     * Pivot id -  all pivot fields separated by semicolon.
     * Defaults to: undefined
     * @type string
     * @memberof RiskAnalyticsControllerApiriskAnalyticsControllerGetRiskEventRow
     */
    pivotId?: string
    /**
     * Optional db_user - if pivot is db user.
     * Defaults to: undefined
     * @type string
     * @memberof RiskAnalyticsControllerApiriskAnalyticsControllerGetRiskEventRow
     */
    pivotDbUser?: string
    /**
     * Optional database - if pivot is db user / database.
     * Defaults to: undefined
     * @type string
     * @memberof RiskAnalyticsControllerApiriskAnalyticsControllerGetRiskEventRow
     */
    pivotDatabase?: string
    /**
     * Optional server_ip - if pivot is db user / database.
     * Defaults to: undefined
     * @type string
     * @memberof RiskAnalyticsControllerApiriskAnalyticsControllerGetRiskEventRow
     */
    pivotServerIp?: string
    /**
     * Optional os_user - if pivot is os user.
     * Defaults to: undefined
     * @type string
     * @memberof RiskAnalyticsControllerApiriskAnalyticsControllerGetRiskEventRow
     */
    pivotOsUser?: string
    /**
     * Optional database_source_field (values database name/service name depends on the server type) - if pivot is db user / database.
     * Defaults to: &#39;UNDEFINED&#39;
     * @type &#39;UNDEFINED&#39; | &#39;DATABASE_NAME&#39; | &#39;SERVICE_NAME&#39;
     * @memberof RiskAnalyticsControllerApiriskAnalyticsControllerGetRiskEventRow
     */
    pivotDatabaseSourceField?: 'UNDEFINED' | 'DATABASE_NAME' | 'SERVICE_NAME'
}

export interface RiskAnalyticsControllerApiRiskAnalyticsControllerGetRiskEventVulnerabilityAssessmentDetailsRequest {
    /**
     * Risk ID
     * Defaults to: undefined
     * @type number
     * @memberof RiskAnalyticsControllerApiriskAnalyticsControllerGetRiskEventVulnerabilityAssessmentDetails
     */
    riskId: number
}

export interface RiskAnalyticsControllerApiRiskAnalyticsControllerGetRiskFeedbackRequest {
}

export interface RiskAnalyticsControllerApiRiskAnalyticsControllerGetRiskObservationDetailsRequest {
    /**
     * Lead feature id.
     * Defaults to: undefined
     * @type number
     * @memberof RiskAnalyticsControllerApiriskAnalyticsControllerGetRiskObservationDetails
     */
    leadFeatureId?: number
    /**
     * Observation type.
     * Defaults to: &#39;UNDEFINED_OBSERVATION_TYPE&#39;
     * @type &#39;UNDEFINED_OBSERVATION_TYPE&#39; | &#39;ACTIVITY&#39; | &#39;EXCEPTION&#39; | &#39;VIOLATION&#39; | &#39;OUTLIER&#39; | &#39;ANOMALY&#39;
     * @memberof RiskAnalyticsControllerApiriskAnalyticsControllerGetRiskObservationDetails
     */
    observationType?: 'UNDEFINED_OBSERVATION_TYPE' | 'ACTIVITY' | 'EXCEPTION' | 'VIOLATION' | 'OUTLIER' | 'ANOMALY'
}

export interface RiskAnalyticsControllerApiRiskAnalyticsControllerGetUserUISettingsRequest {
}

export interface RiskAnalyticsControllerApiRiskAnalyticsControllerRiskEventTuningRequest {
    /**
     * 
     * @type Riskanalyticscontrollerv3RiskEventTuningRequest
     * @memberof RiskAnalyticsControllerApiriskAnalyticsControllerRiskEventTuning
     */
    riskanalyticscontrollerv3RiskEventTuningRequest: Riskanalyticscontrollerv3RiskEventTuningRequest
}

export interface RiskAnalyticsControllerApiRiskAnalyticsControllerSetRiskEventStatusRequest {
    /**
     * 
     * @type Riskanalyticscontrollerv3SetRiskEventStatusRequest
     * @memberof RiskAnalyticsControllerApiriskAnalyticsControllerSetRiskEventStatus
     */
    riskanalyticscontrollerv3SetRiskEventStatusRequest: Riskanalyticscontrollerv3SetRiskEventStatusRequest
}

export interface RiskAnalyticsControllerApiRiskAnalyticsControllerSetUserUISettingsRequest {
    /**
     * 
     * @type Riskanalyticscontrollerv3SetUserUISettingsRequest
     * @memberof RiskAnalyticsControllerApiriskAnalyticsControllerSetUserUISettings
     */
    riskanalyticscontrollerv3SetUserUISettingsRequest: Riskanalyticscontrollerv3SetUserUISettingsRequest
}

export interface RiskAnalyticsControllerApiRiskAnalyticsControllerUpdateRiskFeedbackRequest {
    /**
     * 
     * @type Riskanalyticscontrollerv3UpdateRiskFeedbackRequest
     * @memberof RiskAnalyticsControllerApiriskAnalyticsControllerUpdateRiskFeedback
     */
    riskanalyticscontrollerv3UpdateRiskFeedbackRequest: Riskanalyticscontrollerv3UpdateRiskFeedbackRequest
}

export class ObjectRiskAnalyticsControllerApi {
    private api: ObservableRiskAnalyticsControllerApi

    public constructor(configuration: Configuration, requestFactory?: RiskAnalyticsControllerApiRequestFactory, responseProcessor?: RiskAnalyticsControllerApiResponseProcessor) {
        this.api = new ObservableRiskAnalyticsControllerApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Summary: Enable disable risk rvent feedback Description: Enable or disable the collect feedback process.
     * @param param the request object
     */
    public riskAnalyticsControllerEnableDisableRiskEventFeedbackWithHttpInfo(param: RiskAnalyticsControllerApiRiskAnalyticsControllerEnableDisableRiskEventFeedbackRequest, options?: ConfigurationOptions): Promise<HttpInfo<Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackResponse>> {
        return this.api.riskAnalyticsControllerEnableDisableRiskEventFeedbackWithHttpInfo(param.riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest,  options).toPromise();
    }

    /**
     * Summary: Enable disable risk rvent feedback Description: Enable or disable the collect feedback process.
     * @param param the request object
     */
    public riskAnalyticsControllerEnableDisableRiskEventFeedback(param: RiskAnalyticsControllerApiRiskAnalyticsControllerEnableDisableRiskEventFeedbackRequest, options?: ConfigurationOptions): Promise<Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackResponse> {
        return this.api.riskAnalyticsControllerEnableDisableRiskEventFeedback(param.riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest,  options).toPromise();
    }

    /**
     * Summary: Enable disable risk event process Description: Enable or disable the risk event process.
     * @param param the request object
     */
    public riskAnalyticsControllerEnableDisableRiskEventProcessWithHttpInfo(param: RiskAnalyticsControllerApiRiskAnalyticsControllerEnableDisableRiskEventProcessRequest, options?: ConfigurationOptions): Promise<HttpInfo<Riskanalyticscontrollerv3EnableDisableRiskEventProcessResponse>> {
        return this.api.riskAnalyticsControllerEnableDisableRiskEventProcessWithHttpInfo(param.riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest,  options).toPromise();
    }

    /**
     * Summary: Enable disable risk event process Description: Enable or disable the risk event process.
     * @param param the request object
     */
    public riskAnalyticsControllerEnableDisableRiskEventProcess(param: RiskAnalyticsControllerApiRiskAnalyticsControllerEnableDisableRiskEventProcessRequest, options?: ConfigurationOptions): Promise<Riskanalyticscontrollerv3EnableDisableRiskEventProcessResponse> {
        return this.api.riskAnalyticsControllerEnableDisableRiskEventProcess(param.riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest,  options).toPromise();
    }

    /**
     * Summary: Get all classifications Description: Get all possible classifications for a risk event.
     * @param param the request object
     */
    public riskAnalyticsControllerGetAllClassificationsListWithHttpInfo(param: RiskAnalyticsControllerApiRiskAnalyticsControllerGetAllClassificationsListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Riskanalyticscontrollerv3GetAllClassificationsListResponse>> {
        return this.api.riskAnalyticsControllerGetAllClassificationsListWithHttpInfo( options).toPromise();
    }

    /**
     * Summary: Get all classifications Description: Get all possible classifications for a risk event.
     * @param param the request object
     */
    public riskAnalyticsControllerGetAllClassificationsList(param: RiskAnalyticsControllerApiRiskAnalyticsControllerGetAllClassificationsListRequest = {}, options?: ConfigurationOptions): Promise<Riskanalyticscontrollerv3GetAllClassificationsListResponse> {
        return this.api.riskAnalyticsControllerGetAllClassificationsList( options).toPromise();
    }

    /**
     * Summary: Get risk event classifications list Description: retrieves the ClassificationMatchDetails for a given risk id; classification that did not matched will be with class_value 0.
     * @param param the request object
     */
    public riskAnalyticsControllerGetRiskEventClassificationsListWithHttpInfo(param: RiskAnalyticsControllerApiRiskAnalyticsControllerGetRiskEventClassificationsListRequest, options?: ConfigurationOptions): Promise<HttpInfo<Riskanalyticscontrollerv3GetRiskEventClassificationsListResponse>> {
        return this.api.riskAnalyticsControllerGetRiskEventClassificationsListWithHttpInfo(param.riskId,  options).toPromise();
    }

    /**
     * Summary: Get risk event classifications list Description: retrieves the ClassificationMatchDetails for a given risk id; classification that did not matched will be with class_value 0.
     * @param param the request object
     */
    public riskAnalyticsControllerGetRiskEventClassificationsList(param: RiskAnalyticsControllerApiRiskAnalyticsControllerGetRiskEventClassificationsListRequest, options?: ConfigurationOptions): Promise<Riskanalyticscontrollerv3GetRiskEventClassificationsListResponse> {
        return this.api.riskAnalyticsControllerGetRiskEventClassificationsList(param.riskId,  options).toPromise();
    }

    /**
     * Summary: Get risk event data needed for summarization task Description: Retrieve the full information about this risk event including all findings data
     * @param param the request object
     */
    public riskAnalyticsControllerGetRiskEventDataForSummarizationWithHttpInfo(param: RiskAnalyticsControllerApiRiskAnalyticsControllerGetRiskEventDataForSummarizationRequest, options?: ConfigurationOptions): Promise<HttpInfo<Riskanalyticscontrollerv3RiskEventSummarizationDataResponse>> {
        return this.api.riskAnalyticsControllerGetRiskEventDataForSummarizationWithHttpInfo(param.riskId, param.includeIndicators, param.numFindingsLimit,  options).toPromise();
    }

    /**
     * Summary: Get risk event data needed for summarization task Description: Retrieve the full information about this risk event including all findings data
     * @param param the request object
     */
    public riskAnalyticsControllerGetRiskEventDataForSummarization(param: RiskAnalyticsControllerApiRiskAnalyticsControllerGetRiskEventDataForSummarizationRequest, options?: ConfigurationOptions): Promise<Riskanalyticscontrollerv3RiskEventSummarizationDataResponse> {
        return this.api.riskAnalyticsControllerGetRiskEventDataForSummarization(param.riskId, param.includeIndicators, param.numFindingsLimit,  options).toPromise();
    }

    /**
     * Summary: Get risk event details Description: Return the details of a risk event, including risk general info and a list of observations.
     * @param param the request object
     */
    public riskAnalyticsControllerGetRiskEventDetailsWithHttpInfo(param: RiskAnalyticsControllerApiRiskAnalyticsControllerGetRiskEventDetailsRequest, options?: ConfigurationOptions): Promise<HttpInfo<Riskanalyticscontrollerv3GetRiskEventDetailsResponse>> {
        return this.api.riskAnalyticsControllerGetRiskEventDetailsWithHttpInfo(param.riskId,  options).toPromise();
    }

    /**
     * Summary: Get risk event details Description: Return the details of a risk event, including risk general info and a list of observations.
     * @param param the request object
     */
    public riskAnalyticsControllerGetRiskEventDetails(param: RiskAnalyticsControllerApiRiskAnalyticsControllerGetRiskEventDetailsRequest, options?: ConfigurationOptions): Promise<Riskanalyticscontrollerv3GetRiskEventDetailsResponse> {
        return this.api.riskAnalyticsControllerGetRiskEventDetails(param.riskId,  options).toPromise();
    }

    /**
     * Summary: Get risk event process status Description: Get the risk event process status.
     * @param param the request object
     */
    public riskAnalyticsControllerGetRiskEventProcessStatusWithHttpInfo(param: RiskAnalyticsControllerApiRiskAnalyticsControllerGetRiskEventProcessStatusRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse>> {
        return this.api.riskAnalyticsControllerGetRiskEventProcessStatusWithHttpInfo( options).toPromise();
    }

    /**
     * Summary: Get risk event process status Description: Get the risk event process status.
     * @param param the request object
     */
    public riskAnalyticsControllerGetRiskEventProcessStatus(param: RiskAnalyticsControllerApiRiskAnalyticsControllerGetRiskEventProcessStatusRequest = {}, options?: ConfigurationOptions): Promise<Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse> {
        return this.api.riskAnalyticsControllerGetRiskEventProcessStatus( options).toPromise();
    }

    /**
     * Summary: Get risk event row Description: Return a list of risk events.
     * @param param the request object
     */
    public riskAnalyticsControllerGetRiskEventRowWithHttpInfo(param: RiskAnalyticsControllerApiRiskAnalyticsControllerGetRiskEventRowRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Riskanalyticscontrollerv3GetRiskEventRowResponse>> {
        return this.api.riskAnalyticsControllerGetRiskEventRowWithHttpInfo(param.status, param.dateFrom, param.dateTo, param.pivotType, param.pivotId, param.pivotDbUser, param.pivotDatabase, param.pivotServerIp, param.pivotOsUser, param.pivotDatabaseSourceField,  options).toPromise();
    }

    /**
     * Summary: Get risk event row Description: Return a list of risk events.
     * @param param the request object
     */
    public riskAnalyticsControllerGetRiskEventRow(param: RiskAnalyticsControllerApiRiskAnalyticsControllerGetRiskEventRowRequest = {}, options?: ConfigurationOptions): Promise<Riskanalyticscontrollerv3GetRiskEventRowResponse> {
        return this.api.riskAnalyticsControllerGetRiskEventRow(param.status, param.dateFrom, param.dateTo, param.pivotType, param.pivotId, param.pivotDbUser, param.pivotDatabase, param.pivotServerIp, param.pivotOsUser, param.pivotDatabaseSourceField,  options).toPromise();
    }

    /**
     * Summary: Get vulnerability assessment details for a given risk event Description: Retrieve the information about failed VA tests for assets database and db user
     * @param param the request object
     */
    public riskAnalyticsControllerGetRiskEventVulnerabilityAssessmentDetailsWithHttpInfo(param: RiskAnalyticsControllerApiRiskAnalyticsControllerGetRiskEventVulnerabilityAssessmentDetailsRequest, options?: ConfigurationOptions): Promise<HttpInfo<Riskanalyticscontrollerv3RiskEventVulnerabilityAssessmentDetailsResponse>> {
        return this.api.riskAnalyticsControllerGetRiskEventVulnerabilityAssessmentDetailsWithHttpInfo(param.riskId,  options).toPromise();
    }

    /**
     * Summary: Get vulnerability assessment details for a given risk event Description: Retrieve the information about failed VA tests for assets database and db user
     * @param param the request object
     */
    public riskAnalyticsControllerGetRiskEventVulnerabilityAssessmentDetails(param: RiskAnalyticsControllerApiRiskAnalyticsControllerGetRiskEventVulnerabilityAssessmentDetailsRequest, options?: ConfigurationOptions): Promise<Riskanalyticscontrollerv3RiskEventVulnerabilityAssessmentDetailsResponse> {
        return this.api.riskAnalyticsControllerGetRiskEventVulnerabilityAssessmentDetails(param.riskId,  options).toPromise();
    }

    /**
     * Summary: Get risk feedback Description: Get all feedbacks that are in status NEW/WIP and change them to status WIP.
     * @param param the request object
     */
    public riskAnalyticsControllerGetRiskFeedbackWithHttpInfo(param: RiskAnalyticsControllerApiRiskAnalyticsControllerGetRiskFeedbackRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Riskanalyticscontrollerv3GetRiskFeedbackResponse>> {
        return this.api.riskAnalyticsControllerGetRiskFeedbackWithHttpInfo( options).toPromise();
    }

    /**
     * Summary: Get risk feedback Description: Get all feedbacks that are in status NEW/WIP and change them to status WIP.
     * @param param the request object
     */
    public riskAnalyticsControllerGetRiskFeedback(param: RiskAnalyticsControllerApiRiskAnalyticsControllerGetRiskFeedbackRequest = {}, options?: ConfigurationOptions): Promise<Riskanalyticscontrollerv3GetRiskFeedbackResponse> {
        return this.api.riskAnalyticsControllerGetRiskFeedback( options).toPromise();
    }

    /**
     * Summary: Get risk observation details Description: Return details of a single risk observation.
     * @param param the request object
     */
    public riskAnalyticsControllerGetRiskObservationDetailsWithHttpInfo(param: RiskAnalyticsControllerApiRiskAnalyticsControllerGetRiskObservationDetailsRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Riskanalyticscontrollerv3GetRiskObservationDetailsResponse>> {
        return this.api.riskAnalyticsControllerGetRiskObservationDetailsWithHttpInfo(param.leadFeatureId, param.observationType,  options).toPromise();
    }

    /**
     * Summary: Get risk observation details Description: Return details of a single risk observation.
     * @param param the request object
     */
    public riskAnalyticsControllerGetRiskObservationDetails(param: RiskAnalyticsControllerApiRiskAnalyticsControllerGetRiskObservationDetailsRequest = {}, options?: ConfigurationOptions): Promise<Riskanalyticscontrollerv3GetRiskObservationDetailsResponse> {
        return this.api.riskAnalyticsControllerGetRiskObservationDetails(param.leadFeatureId, param.observationType,  options).toPromise();
    }

    /**
     * Summary: Get user UI settings Description: Get the user settings by user id to display the risk in the UI.
     * @param param the request object
     */
    public riskAnalyticsControllerGetUserUISettingsWithHttpInfo(param: RiskAnalyticsControllerApiRiskAnalyticsControllerGetUserUISettingsRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Riskanalyticscontrollerv3GetUserUISettingsResponse>> {
        return this.api.riskAnalyticsControllerGetUserUISettingsWithHttpInfo( options).toPromise();
    }

    /**
     * Summary: Get user UI settings Description: Get the user settings by user id to display the risk in the UI.
     * @param param the request object
     */
    public riskAnalyticsControllerGetUserUISettings(param: RiskAnalyticsControllerApiRiskAnalyticsControllerGetUserUISettingsRequest = {}, options?: ConfigurationOptions): Promise<Riskanalyticscontrollerv3GetUserUISettingsResponse> {
        return this.api.riskAnalyticsControllerGetUserUISettings( options).toPromise();
    }

    /**
     * Summary: Risk event tuning Description: Perform tuning risk event actions.
     * @param param the request object
     */
    public riskAnalyticsControllerRiskEventTuningWithHttpInfo(param: RiskAnalyticsControllerApiRiskAnalyticsControllerRiskEventTuningRequest, options?: ConfigurationOptions): Promise<HttpInfo<Riskanalyticscontrollerv3RiskEventTuningResponse>> {
        return this.api.riskAnalyticsControllerRiskEventTuningWithHttpInfo(param.riskanalyticscontrollerv3RiskEventTuningRequest,  options).toPromise();
    }

    /**
     * Summary: Risk event tuning Description: Perform tuning risk event actions.
     * @param param the request object
     */
    public riskAnalyticsControllerRiskEventTuning(param: RiskAnalyticsControllerApiRiskAnalyticsControllerRiskEventTuningRequest, options?: ConfigurationOptions): Promise<Riskanalyticscontrollerv3RiskEventTuningResponse> {
        return this.api.riskAnalyticsControllerRiskEventTuning(param.riskanalyticscontrollerv3RiskEventTuningRequest,  options).toPromise();
    }

    /**
     * Summary: Set risk event status Description: Update the risk status and justification.
     * @param param the request object
     */
    public riskAnalyticsControllerSetRiskEventStatusWithHttpInfo(param: RiskAnalyticsControllerApiRiskAnalyticsControllerSetRiskEventStatusRequest, options?: ConfigurationOptions): Promise<HttpInfo<Riskanalyticscontrollerv3SetRiskEventStatusResponse>> {
        return this.api.riskAnalyticsControllerSetRiskEventStatusWithHttpInfo(param.riskanalyticscontrollerv3SetRiskEventStatusRequest,  options).toPromise();
    }

    /**
     * Summary: Set risk event status Description: Update the risk status and justification.
     * @param param the request object
     */
    public riskAnalyticsControllerSetRiskEventStatus(param: RiskAnalyticsControllerApiRiskAnalyticsControllerSetRiskEventStatusRequest, options?: ConfigurationOptions): Promise<Riskanalyticscontrollerv3SetRiskEventStatusResponse> {
        return this.api.riskAnalyticsControllerSetRiskEventStatus(param.riskanalyticscontrollerv3SetRiskEventStatusRequest,  options).toPromise();
    }

    /**
     * Summary: Set user UI settings Description: Set the user settings by user id in the mongo collection. WARNING: this API should not be used manually or by a system external to GDSC. Using this API to change a user settings may prevent the user from using the Risk Event function within GDSC.
     * @param param the request object
     */
    public riskAnalyticsControllerSetUserUISettingsWithHttpInfo(param: RiskAnalyticsControllerApiRiskAnalyticsControllerSetUserUISettingsRequest, options?: ConfigurationOptions): Promise<HttpInfo<Riskanalyticscontrollerv3SetUserUISettingsResponse>> {
        return this.api.riskAnalyticsControllerSetUserUISettingsWithHttpInfo(param.riskanalyticscontrollerv3SetUserUISettingsRequest,  options).toPromise();
    }

    /**
     * Summary: Set user UI settings Description: Set the user settings by user id in the mongo collection. WARNING: this API should not be used manually or by a system external to GDSC. Using this API to change a user settings may prevent the user from using the Risk Event function within GDSC.
     * @param param the request object
     */
    public riskAnalyticsControllerSetUserUISettings(param: RiskAnalyticsControllerApiRiskAnalyticsControllerSetUserUISettingsRequest, options?: ConfigurationOptions): Promise<Riskanalyticscontrollerv3SetUserUISettingsResponse> {
        return this.api.riskAnalyticsControllerSetUserUISettings(param.riskanalyticscontrollerv3SetUserUISettingsRequest,  options).toPromise();
    }

    /**
     * Summary: Update risk feedback Description: Provide feedback for one or more risk events
     * @param param the request object
     */
    public riskAnalyticsControllerUpdateRiskFeedbackWithHttpInfo(param: RiskAnalyticsControllerApiRiskAnalyticsControllerUpdateRiskFeedbackRequest, options?: ConfigurationOptions): Promise<HttpInfo<Riskanalyticscontrollerv3UpdateRiskFeedbackResponse>> {
        return this.api.riskAnalyticsControllerUpdateRiskFeedbackWithHttpInfo(param.riskanalyticscontrollerv3UpdateRiskFeedbackRequest,  options).toPromise();
    }

    /**
     * Summary: Update risk feedback Description: Provide feedback for one or more risk events
     * @param param the request object
     */
    public riskAnalyticsControllerUpdateRiskFeedback(param: RiskAnalyticsControllerApiRiskAnalyticsControllerUpdateRiskFeedbackRequest, options?: ConfigurationOptions): Promise<Riskanalyticscontrollerv3UpdateRiskFeedbackResponse> {
        return this.api.riskAnalyticsControllerUpdateRiskFeedback(param.riskanalyticscontrollerv3UpdateRiskFeedbackRequest,  options).toPromise();
    }

}

import { ObservableRiskAnalyticsDataProcessorApi } from "./ObservableAPI";
import { RiskAnalyticsDataProcessorApiRequestFactory, RiskAnalyticsDataProcessorApiResponseProcessor} from "../apis/RiskAnalyticsDataProcessorApi";

export interface RiskAnalyticsDataProcessorApiRiskAnalyticsDataProcessorGetRiskContextRequest {
    /**
     * Risk id.
     * Defaults to: undefined
     * @type number
     * @memberof RiskAnalyticsDataProcessorApiriskAnalyticsDataProcessorGetRiskContext
     */
    riskId: number
    /**
     * Timezone in IANA format.
     * Defaults to: undefined
     * @type string
     * @memberof RiskAnalyticsDataProcessorApiriskAnalyticsDataProcessorGetRiskContext
     */
    timezone?: string
}

export interface RiskAnalyticsDataProcessorApiRiskAnalyticsDataProcessorGetRiskPredefinedQuestionsRequest {
    /**
     * Risk id.
     * Defaults to: undefined
     * @type number
     * @memberof RiskAnalyticsDataProcessorApiriskAnalyticsDataProcessorGetRiskPredefinedQuestions
     */
    riskId: number
}

export class ObjectRiskAnalyticsDataProcessorApi {
    private api: ObservableRiskAnalyticsDataProcessorApi

    public constructor(configuration: Configuration, requestFactory?: RiskAnalyticsDataProcessorApiRequestFactory, responseProcessor?: RiskAnalyticsDataProcessorApiResponseProcessor) {
        this.api = new ObservableRiskAnalyticsDataProcessorApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Summary: Get Risk Event Context Description: Retrieve the context of the given risk ID. This context will be used for LLM interactions.
     * @param param the request object
     */
    public riskAnalyticsDataProcessorGetRiskContextWithHttpInfo(param: RiskAnalyticsDataProcessorApiRiskAnalyticsDataProcessorGetRiskContextRequest, options?: ConfigurationOptions): Promise<HttpInfo<Riskanalyticsdataprocessorv3GetRiskContextResponse>> {
        return this.api.riskAnalyticsDataProcessorGetRiskContextWithHttpInfo(param.riskId, param.timezone,  options).toPromise();
    }

    /**
     * Summary: Get Risk Event Context Description: Retrieve the context of the given risk ID. This context will be used for LLM interactions.
     * @param param the request object
     */
    public riskAnalyticsDataProcessorGetRiskContext(param: RiskAnalyticsDataProcessorApiRiskAnalyticsDataProcessorGetRiskContextRequest, options?: ConfigurationOptions): Promise<Riskanalyticsdataprocessorv3GetRiskContextResponse> {
        return this.api.riskAnalyticsDataProcessorGetRiskContext(param.riskId, param.timezone,  options).toPromise();
    }

    /**
     * Summary: Get Risk Event Predefined Questions Description: Retrieve the Predefined Questions of the given risk ID. This Predefined Questions will be used quick actions recommendations.
     * @param param the request object
     */
    public riskAnalyticsDataProcessorGetRiskPredefinedQuestionsWithHttpInfo(param: RiskAnalyticsDataProcessorApiRiskAnalyticsDataProcessorGetRiskPredefinedQuestionsRequest, options?: ConfigurationOptions): Promise<HttpInfo<Riskanalyticsdataprocessorv3GetRiskPredefinedQuestionsResponse>> {
        return this.api.riskAnalyticsDataProcessorGetRiskPredefinedQuestionsWithHttpInfo(param.riskId,  options).toPromise();
    }

    /**
     * Summary: Get Risk Event Predefined Questions Description: Retrieve the Predefined Questions of the given risk ID. This Predefined Questions will be used quick actions recommendations.
     * @param param the request object
     */
    public riskAnalyticsDataProcessorGetRiskPredefinedQuestions(param: RiskAnalyticsDataProcessorApiRiskAnalyticsDataProcessorGetRiskPredefinedQuestionsRequest, options?: ConfigurationOptions): Promise<Riskanalyticsdataprocessorv3GetRiskPredefinedQuestionsResponse> {
        return this.api.riskAnalyticsDataProcessorGetRiskPredefinedQuestions(param.riskId,  options).toPromise();
    }

}

import { ObservableRiskAnalyticsEngineApi } from "./ObservableAPI";
import { RiskAnalyticsEngineApiRequestFactory, RiskAnalyticsEngineApiResponseProcessor} from "../apis/RiskAnalyticsEngineApi";

export interface RiskAnalyticsEngineApiRiskAnalyticsEngineGetLeadGeneratorConfigRequest {
}

export interface RiskAnalyticsEngineApiRiskAnalyticsEngineUpdateLeadGeneratorConfigRequest {
    /**
     * 
     * @type Riskanalyticsenginev3UpdateLeadGeneratorConfigRequest
     * @memberof RiskAnalyticsEngineApiriskAnalyticsEngineUpdateLeadGeneratorConfig
     */
    riskanalyticsenginev3UpdateLeadGeneratorConfigRequest: Riskanalyticsenginev3UpdateLeadGeneratorConfigRequest
}

export class ObjectRiskAnalyticsEngineApi {
    private api: ObservableRiskAnalyticsEngineApi

    public constructor(configuration: Configuration, requestFactory?: RiskAnalyticsEngineApiRequestFactory, responseProcessor?: RiskAnalyticsEngineApiResponseProcessor) {
        this.api = new ObservableRiskAnalyticsEngineApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Summary: Get lead generator config Description: Retrieve the configuration of a lead generator.
     * @param param the request object
     */
    public riskAnalyticsEngineGetLeadGeneratorConfigWithHttpInfo(param: RiskAnalyticsEngineApiRiskAnalyticsEngineGetLeadGeneratorConfigRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Riskanalyticsenginev3GetLeadGeneratorConfigResponse>> {
        return this.api.riskAnalyticsEngineGetLeadGeneratorConfigWithHttpInfo( options).toPromise();
    }

    /**
     * Summary: Get lead generator config Description: Retrieve the configuration of a lead generator.
     * @param param the request object
     */
    public riskAnalyticsEngineGetLeadGeneratorConfig(param: RiskAnalyticsEngineApiRiskAnalyticsEngineGetLeadGeneratorConfigRequest = {}, options?: ConfigurationOptions): Promise<Riskanalyticsenginev3GetLeadGeneratorConfigResponse> {
        return this.api.riskAnalyticsEngineGetLeadGeneratorConfig( options).toPromise();
    }

    /**
     * Summary: Update lead generator config Description: Update the configuration of a leads generator.
     * @param param the request object
     */
    public riskAnalyticsEngineUpdateLeadGeneratorConfigWithHttpInfo(param: RiskAnalyticsEngineApiRiskAnalyticsEngineUpdateLeadGeneratorConfigRequest, options?: ConfigurationOptions): Promise<HttpInfo<Riskanalyticsenginev3UpdateLeadGeneratorConfigResponse>> {
        return this.api.riskAnalyticsEngineUpdateLeadGeneratorConfigWithHttpInfo(param.riskanalyticsenginev3UpdateLeadGeneratorConfigRequest,  options).toPromise();
    }

    /**
     * Summary: Update lead generator config Description: Update the configuration of a leads generator.
     * @param param the request object
     */
    public riskAnalyticsEngineUpdateLeadGeneratorConfig(param: RiskAnalyticsEngineApiRiskAnalyticsEngineUpdateLeadGeneratorConfigRequest, options?: ConfigurationOptions): Promise<Riskanalyticsenginev3UpdateLeadGeneratorConfigResponse> {
        return this.api.riskAnalyticsEngineUpdateLeadGeneratorConfig(param.riskanalyticsenginev3UpdateLeadGeneratorConfigRequest,  options).toPromise();
    }

}

import { ObservableRiskAnalyticsMlClassificationApi } from "./ObservableAPI";
import { RiskAnalyticsMlClassificationApiRequestFactory, RiskAnalyticsMlClassificationApiResponseProcessor} from "../apis/RiskAnalyticsMlClassificationApi";

export interface RiskAnalyticsMlClassificationApiRiskAnalyticsMlClassificationResetModelToDefaultsRequest {
}

export class ObjectRiskAnalyticsMlClassificationApi {
    private api: ObservableRiskAnalyticsMlClassificationApi

    public constructor(configuration: Configuration, requestFactory?: RiskAnalyticsMlClassificationApiRequestFactory, responseProcessor?: RiskAnalyticsMlClassificationApiResponseProcessor) {
        this.api = new ObservableRiskAnalyticsMlClassificationApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Summary: Reset the model to its default weights. Description: Load the initial model instead of the existing model - this action is irreversible.
     * @param param the request object
     */
    public riskAnalyticsMlClassificationResetModelToDefaultsWithHttpInfo(param: RiskAnalyticsMlClassificationApiRiskAnalyticsMlClassificationResetModelToDefaultsRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Riskanalyticsmlclassificationv3ResetModelToDefaultsResponse>> {
        return this.api.riskAnalyticsMlClassificationResetModelToDefaultsWithHttpInfo( options).toPromise();
    }

    /**
     * Summary: Reset the model to its default weights. Description: Load the initial model instead of the existing model - this action is irreversible.
     * @param param the request object
     */
    public riskAnalyticsMlClassificationResetModelToDefaults(param: RiskAnalyticsMlClassificationApiRiskAnalyticsMlClassificationResetModelToDefaultsRequest = {}, options?: ConfigurationOptions): Promise<Riskanalyticsmlclassificationv3ResetModelToDefaultsResponse> {
        return this.api.riskAnalyticsMlClassificationResetModelToDefaults( options).toPromise();
    }

}

import { ObservableSchedulerServiceApi } from "./ObservableAPI";
import { SchedulerServiceApiRequestFactory, SchedulerServiceApiResponseProcessor} from "../apis/SchedulerServiceApi";

export interface SchedulerServiceApiSchedulerServiceCreateScheduledJobRequest {
    /**
     * 
     * @type Schedulerv3CreateScheduledJobRequest
     * @memberof SchedulerServiceApischedulerServiceCreateScheduledJob
     */
    schedulerv3CreateScheduledJobRequest: Schedulerv3CreateScheduledJobRequest
}

export interface SchedulerServiceApiSchedulerServiceDeleteScheduledJobRequest {
    /**
     * Unique ID, required for delete.
     * Defaults to: undefined
     * @type string
     * @memberof SchedulerServiceApischedulerServiceDeleteScheduledJob
     */
    scheduleId: string
}

export interface SchedulerServiceApiSchedulerServiceGetDependenciesRequest {
    /**
     * specify the configuration entry type: Distribution.Rule, workflow_investigation_link, workflow_response_template, etc.
     * Defaults to: undefined
     * @type string
     * @memberof SchedulerServiceApischedulerServiceGetDependencies
     */
    configType?: string
}

export interface SchedulerServiceApiSchedulerServiceGetDistributionRulesRequest {
}

export interface SchedulerServiceApiSchedulerServiceGetScheduledJobDetailsRequest {
    /**
     * Used to return a single scheduledjob.
     * Defaults to: undefined
     * @type string
     * @memberof SchedulerServiceApischedulerServiceGetScheduledJobDetails
     */
    scheduleId: string
}

export interface SchedulerServiceApiSchedulerServiceGetScheduledJobsRequest {
    /**
     * Optional: the amount to offset the rows by for pagination.
     * Defaults to: undefined
     * @type number
     * @memberof SchedulerServiceApischedulerServiceGetScheduledJobs
     */
    offset?: number
    /**
     * Optional: the max amount of rows to return for pagination.
     * Defaults to: undefined
     * @type number
     * @memberof SchedulerServiceApischedulerServiceGetScheduledJobs
     */
    limit?: number
}

export interface SchedulerServiceApiSchedulerServiceGetSchedulesByReportRequest {
    /**
     * Report ID for the scheduled report.
     * Defaults to: undefined
     * @type string
     * @memberof SchedulerServiceApischedulerServiceGetSchedulesByReport
     */
    reportId: string
    /**
     * 
     * @type Schedulerv3GetSchedulesByReportRequest
     * @memberof SchedulerServiceApischedulerServiceGetSchedulesByReport
     */
    schedulerv3GetSchedulesByReportRequest: Schedulerv3GetSchedulesByReportRequest
}

export interface SchedulerServiceApiSchedulerServiceGetTagsRequest {
}

export interface SchedulerServiceApiSchedulerServiceSearchScheduledJobsRequest {
    /**
     * 
     * @type Schedulerv3SearchScheduledJobsRequest
     * @memberof SchedulerServiceApischedulerServiceSearchScheduledJobs
     */
    schedulerv3SearchScheduledJobsRequest: Schedulerv3SearchScheduledJobsRequest
}

export interface SchedulerServiceApiSchedulerServiceSearchScheduledTaskRunsRequest {
    /**
     * 
     * @type Schedulerv3SearchScheduledTaskRunsRequest
     * @memberof SchedulerServiceApischedulerServiceSearchScheduledTaskRuns
     */
    schedulerv3SearchScheduledTaskRunsRequest: Schedulerv3SearchScheduledTaskRunsRequest
}

export interface SchedulerServiceApiSchedulerServiceUpdateScheduledJobRequest {
    /**
     * Unique ID, required for update.
     * Defaults to: undefined
     * @type string
     * @memberof SchedulerServiceApischedulerServiceUpdateScheduledJob
     */
    scheduleId: string
    /**
     * 
     * @type Schedulerv3UpdateScheduledJobRequest
     * @memberof SchedulerServiceApischedulerServiceUpdateScheduledJob
     */
    schedulerv3UpdateScheduledJobRequest: Schedulerv3UpdateScheduledJobRequest
}

export class ObjectSchedulerServiceApi {
    private api: ObservableSchedulerServiceApi

    public constructor(configuration: Configuration, requestFactory?: SchedulerServiceApiRequestFactory, responseProcessor?: SchedulerServiceApiResponseProcessor) {
        this.api = new ObservableSchedulerServiceApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Summary: Create scheduled job Description: Create a new scheduled job with tasks.
     * @param param the request object
     */
    public schedulerServiceCreateScheduledJobWithHttpInfo(param: SchedulerServiceApiSchedulerServiceCreateScheduledJobRequest, options?: ConfigurationOptions): Promise<HttpInfo<Schedulerv3CreateScheduledJobResponse>> {
        return this.api.schedulerServiceCreateScheduledJobWithHttpInfo(param.schedulerv3CreateScheduledJobRequest,  options).toPromise();
    }

    /**
     * Summary: Create scheduled job Description: Create a new scheduled job with tasks.
     * @param param the request object
     */
    public schedulerServiceCreateScheduledJob(param: SchedulerServiceApiSchedulerServiceCreateScheduledJobRequest, options?: ConfigurationOptions): Promise<Schedulerv3CreateScheduledJobResponse> {
        return this.api.schedulerServiceCreateScheduledJob(param.schedulerv3CreateScheduledJobRequest,  options).toPromise();
    }

    /**
     * Summary: Delete scheduled job Description: Delete a single scheduled job.
     * @param param the request object
     */
    public schedulerServiceDeleteScheduledJobWithHttpInfo(param: SchedulerServiceApiSchedulerServiceDeleteScheduledJobRequest, options?: ConfigurationOptions): Promise<HttpInfo<Schedulerv3DeleteScheduledJobResponse>> {
        return this.api.schedulerServiceDeleteScheduledJobWithHttpInfo(param.scheduleId,  options).toPromise();
    }

    /**
     * Summary: Delete scheduled job Description: Delete a single scheduled job.
     * @param param the request object
     */
    public schedulerServiceDeleteScheduledJob(param: SchedulerServiceApiSchedulerServiceDeleteScheduledJobRequest, options?: ConfigurationOptions): Promise<Schedulerv3DeleteScheduledJobResponse> {
        return this.api.schedulerServiceDeleteScheduledJob(param.scheduleId,  options).toPromise();
    }

    /**
     * Summary: Get dependencies Description: returns IDs of distribution rules, response templates, or processing rules that are in use
     * @param param the request object
     */
    public schedulerServiceGetDependenciesWithHttpInfo(param: SchedulerServiceApiSchedulerServiceGetDependenciesRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Schedulerv3GetDependenciesResponse>> {
        return this.api.schedulerServiceGetDependenciesWithHttpInfo(param.configType,  options).toPromise();
    }

    /**
     * Summary: Get dependencies Description: returns IDs of distribution rules, response templates, or processing rules that are in use
     * @param param the request object
     */
    public schedulerServiceGetDependencies(param: SchedulerServiceApiSchedulerServiceGetDependenciesRequest = {}, options?: ConfigurationOptions): Promise<Schedulerv3GetDependenciesResponse> {
        return this.api.schedulerServiceGetDependencies(param.configType,  options).toPromise();
    }

    /**
     * Summary: Get distribution rules Description: Return a list of distribution rule IDs that are used by the scheduler Distribution rules can\'t be edited if it is used by a scheduled job.
     * @param param the request object
     */
    public schedulerServiceGetDistributionRulesWithHttpInfo(param: SchedulerServiceApiSchedulerServiceGetDistributionRulesRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Schedulerv3GetDistributionRulesResponse>> {
        return this.api.schedulerServiceGetDistributionRulesWithHttpInfo( options).toPromise();
    }

    /**
     * Summary: Get distribution rules Description: Return a list of distribution rule IDs that are used by the scheduler Distribution rules can\'t be edited if it is used by a scheduled job.
     * @param param the request object
     */
    public schedulerServiceGetDistributionRules(param: SchedulerServiceApiSchedulerServiceGetDistributionRulesRequest = {}, options?: ConfigurationOptions): Promise<Schedulerv3GetDistributionRulesResponse> {
        return this.api.schedulerServiceGetDistributionRules( options).toPromise();
    }

    /**
     * Summary: Get scheduled job Description: Return a single ScheduledJob in detail.
     * @param param the request object
     */
    public schedulerServiceGetScheduledJobDetailsWithHttpInfo(param: SchedulerServiceApiSchedulerServiceGetScheduledJobDetailsRequest, options?: ConfigurationOptions): Promise<HttpInfo<Schedulerv3GetScheduledJobResponse>> {
        return this.api.schedulerServiceGetScheduledJobDetailsWithHttpInfo(param.scheduleId,  options).toPromise();
    }

    /**
     * Summary: Get scheduled job Description: Return a single ScheduledJob in detail.
     * @param param the request object
     */
    public schedulerServiceGetScheduledJobDetails(param: SchedulerServiceApiSchedulerServiceGetScheduledJobDetailsRequest, options?: ConfigurationOptions): Promise<Schedulerv3GetScheduledJobResponse> {
        return this.api.schedulerServiceGetScheduledJobDetails(param.scheduleId,  options).toPromise();
    }

    /**
     * Summary: Get scheduled jobs Description: Return a list of scheduled jobs and the linked tasks.
     * @param param the request object
     */
    public schedulerServiceGetScheduledJobsWithHttpInfo(param: SchedulerServiceApiSchedulerServiceGetScheduledJobsRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Schedulerv3ScheduledJobSummaryResponse>> {
        return this.api.schedulerServiceGetScheduledJobsWithHttpInfo(param.offset, param.limit,  options).toPromise();
    }

    /**
     * Summary: Get scheduled jobs Description: Return a list of scheduled jobs and the linked tasks.
     * @param param the request object
     */
    public schedulerServiceGetScheduledJobs(param: SchedulerServiceApiSchedulerServiceGetScheduledJobsRequest = {}, options?: ConfigurationOptions): Promise<Schedulerv3ScheduledJobSummaryResponse> {
        return this.api.schedulerServiceGetScheduledJobs(param.offset, param.limit,  options).toPromise();
    }

    /**
     * Summary: Get schedules by report Description: Return an array of scheduled job IDs that run the report_id.  An empty array is returned if the report_id is not scheduled.
     * @param param the request object
     */
    public schedulerServiceGetSchedulesByReportWithHttpInfo(param: SchedulerServiceApiSchedulerServiceGetSchedulesByReportRequest, options?: ConfigurationOptions): Promise<HttpInfo<Schedulerv3GetSchedulesByReportResponse>> {
        return this.api.schedulerServiceGetSchedulesByReportWithHttpInfo(param.reportId, param.schedulerv3GetSchedulesByReportRequest,  options).toPromise();
    }

    /**
     * Summary: Get schedules by report Description: Return an array of scheduled job IDs that run the report_id.  An empty array is returned if the report_id is not scheduled.
     * @param param the request object
     */
    public schedulerServiceGetSchedulesByReport(param: SchedulerServiceApiSchedulerServiceGetSchedulesByReportRequest, options?: ConfigurationOptions): Promise<Schedulerv3GetSchedulesByReportResponse> {
        return this.api.schedulerServiceGetSchedulesByReport(param.reportId, param.schedulerv3GetSchedulesByReportRequest,  options).toPromise();
    }

    /**
     * Summary: Get tags Description: Return an array of all the unique tags from scheduled jobs.
     * @param param the request object
     */
    public schedulerServiceGetTagsWithHttpInfo(param: SchedulerServiceApiSchedulerServiceGetTagsRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Schedulerv3GetTagsResponse>> {
        return this.api.schedulerServiceGetTagsWithHttpInfo( options).toPromise();
    }

    /**
     * Summary: Get tags Description: Return an array of all the unique tags from scheduled jobs.
     * @param param the request object
     */
    public schedulerServiceGetTags(param: SchedulerServiceApiSchedulerServiceGetTagsRequest = {}, options?: ConfigurationOptions): Promise<Schedulerv3GetTagsResponse> {
        return this.api.schedulerServiceGetTags( options).toPromise();
    }

    /**
     * Summary: Search scheduled jobs Description: Return a filtered list of scheduled jobs and the linked tasks.
     * @param param the request object
     */
    public schedulerServiceSearchScheduledJobsWithHttpInfo(param: SchedulerServiceApiSchedulerServiceSearchScheduledJobsRequest, options?: ConfigurationOptions): Promise<HttpInfo<Schedulerv3ScheduledJobSummaryResponse>> {
        return this.api.schedulerServiceSearchScheduledJobsWithHttpInfo(param.schedulerv3SearchScheduledJobsRequest,  options).toPromise();
    }

    /**
     * Summary: Search scheduled jobs Description: Return a filtered list of scheduled jobs and the linked tasks.
     * @param param the request object
     */
    public schedulerServiceSearchScheduledJobs(param: SchedulerServiceApiSchedulerServiceSearchScheduledJobsRequest, options?: ConfigurationOptions): Promise<Schedulerv3ScheduledJobSummaryResponse> {
        return this.api.schedulerServiceSearchScheduledJobs(param.schedulerv3SearchScheduledJobsRequest,  options).toPromise();
    }

    /**
     * Summary: Search scheduled task runs Description: Return a list of scheduled task run, start date, end date, status
     * @param param the request object
     */
    public schedulerServiceSearchScheduledTaskRunsWithHttpInfo(param: SchedulerServiceApiSchedulerServiceSearchScheduledTaskRunsRequest, options?: ConfigurationOptions): Promise<HttpInfo<Schedulerv3SearchScheduledTaskRunsResponse>> {
        return this.api.schedulerServiceSearchScheduledTaskRunsWithHttpInfo(param.schedulerv3SearchScheduledTaskRunsRequest,  options).toPromise();
    }

    /**
     * Summary: Search scheduled task runs Description: Return a list of scheduled task run, start date, end date, status
     * @param param the request object
     */
    public schedulerServiceSearchScheduledTaskRuns(param: SchedulerServiceApiSchedulerServiceSearchScheduledTaskRunsRequest, options?: ConfigurationOptions): Promise<Schedulerv3SearchScheduledTaskRunsResponse> {
        return this.api.schedulerServiceSearchScheduledTaskRuns(param.schedulerv3SearchScheduledTaskRunsRequest,  options).toPromise();
    }

    /**
     * Summary: Update scheduled job Description: Update a single schedule job.
     * @param param the request object
     */
    public schedulerServiceUpdateScheduledJobWithHttpInfo(param: SchedulerServiceApiSchedulerServiceUpdateScheduledJobRequest, options?: ConfigurationOptions): Promise<HttpInfo<Schedulerv3UpdateScheduledJobResponse>> {
        return this.api.schedulerServiceUpdateScheduledJobWithHttpInfo(param.scheduleId, param.schedulerv3UpdateScheduledJobRequest,  options).toPromise();
    }

    /**
     * Summary: Update scheduled job Description: Update a single schedule job.
     * @param param the request object
     */
    public schedulerServiceUpdateScheduledJob(param: SchedulerServiceApiSchedulerServiceUpdateScheduledJobRequest, options?: ConfigurationOptions): Promise<Schedulerv3UpdateScheduledJobResponse> {
        return this.api.schedulerServiceUpdateScheduledJob(param.scheduleId, param.schedulerv3UpdateScheduledJobRequest,  options).toPromise();
    }

}

import { ObservableSnifAssistServiceApi } from "./ObservableAPI";
import { SnifAssistServiceApiRequestFactory, SnifAssistServiceApiResponseProcessor} from "../apis/SnifAssistServiceApi";

export interface SnifAssistServiceApiSnifAssistServiceGetSnifConfigRequest {
    /**
     * Provide tenant_id.
     * Defaults to: undefined
     * @type string
     * @memberof SnifAssistServiceApisnifAssistServiceGetSnifConfig
     */
    tenantId?: string
    /**
     * Provide edge_id.
     * Defaults to: undefined
     * @type string
     * @memberof SnifAssistServiceApisnifAssistServiceGetSnifConfig
     */
    edgeId?: string
    /**
     * Provide configuration type.
     * Defaults to: undefined
     * @type string
     * @memberof SnifAssistServiceApisnifAssistServiceGetSnifConfig
     */
    configType?: string
    /**
     * Specify config_id provided by configuration service.
     * Defaults to: undefined
     * @type string
     * @memberof SnifAssistServiceApisnifAssistServiceGetSnifConfig
     */
    configId?: string
    /**
     * Provide CRC value of configuration parameters that sniffer is currently using.
     * Defaults to: undefined
     * @type number
     * @memberof SnifAssistServiceApisnifAssistServiceGetSnifConfig
     */
    configurationParametersCrc?: number
}

export interface SnifAssistServiceApiSnifAssistServiceGetSnifPolicyRequest {
    /**
     * Specify tenant_id.
     * Defaults to: undefined
     * @type string
     * @memberof SnifAssistServiceApisnifAssistServiceGetSnifPolicy
     */
    tenantId?: string
    /**
     * Specify edge_id if known.
     * Defaults to: undefined
     * @type string
     * @memberof SnifAssistServiceApisnifAssistServiceGetSnifPolicy
     */
    edgeId?: string
    /**
     * Provide CRC value of installed policy that sniffer is currently using.
     * Defaults to: undefined
     * @type number
     * @memberof SnifAssistServiceApisnifAssistServiceGetSnifPolicy
     */
    policyCrc?: number
}

export interface SnifAssistServiceApiSnifAssistServicePostSnifFeedbackRequest {
    /**
     * 
     * @type Snifassistv3PostSnifFeedbackRequest
     * @memberof SnifAssistServiceApisnifAssistServicePostSnifFeedback
     */
    snifassistv3PostSnifFeedbackRequest: Snifassistv3PostSnifFeedbackRequest
}

export interface SnifAssistServiceApiSnifAssistServiceTestRegexRequest {
    /**
     * 
     * @type Snifassistv3TestRegexRequest
     * @memberof SnifAssistServiceApisnifAssistServiceTestRegex
     */
    snifassistv3TestRegexRequest: Snifassistv3TestRegexRequest
}

export class ObjectSnifAssistServiceApi {
    private api: ObservableSnifAssistServiceApi

    public constructor(configuration: Configuration, requestFactory?: SnifAssistServiceApiRequestFactory, responseProcessor?: SnifAssistServiceApiResponseProcessor) {
        this.api = new ObservableSnifAssistServiceApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Summary: Get sniffer configuration parameters Description: Get edge sniffer configuration parameters from GI-mothership.
     * @param param the request object
     */
    public snifAssistServiceGetSnifConfigWithHttpInfo(param: SnifAssistServiceApiSnifAssistServiceGetSnifConfigRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Snifassistv3GetSnifConfigResponse>> {
        return this.api.snifAssistServiceGetSnifConfigWithHttpInfo(param.tenantId, param.edgeId, param.configType, param.configId, param.configurationParametersCrc,  options).toPromise();
    }

    /**
     * Summary: Get sniffer configuration parameters Description: Get edge sniffer configuration parameters from GI-mothership.
     * @param param the request object
     */
    public snifAssistServiceGetSnifConfig(param: SnifAssistServiceApiSnifAssistServiceGetSnifConfigRequest = {}, options?: ConfigurationOptions): Promise<Snifassistv3GetSnifConfigResponse> {
        return this.api.snifAssistServiceGetSnifConfig(param.tenantId, param.edgeId, param.configType, param.configId, param.configurationParametersCrc,  options).toPromise();
    }

    /**
     * Summary: Get sniffer policy Description: Get edge sniffer policy from GI-mothership.
     * @param param the request object
     */
    public snifAssistServiceGetSnifPolicyWithHttpInfo(param: SnifAssistServiceApiSnifAssistServiceGetSnifPolicyRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Snifassistv3StatusResponseBase>> {
        return this.api.snifAssistServiceGetSnifPolicyWithHttpInfo(param.tenantId, param.edgeId, param.policyCrc,  options).toPromise();
    }

    /**
     * Summary: Get sniffer policy Description: Get edge sniffer policy from GI-mothership.
     * @param param the request object
     */
    public snifAssistServiceGetSnifPolicy(param: SnifAssistServiceApiSnifAssistServiceGetSnifPolicyRequest = {}, options?: ConfigurationOptions): Promise<Snifassistv3StatusResponseBase> {
        return this.api.snifAssistServiceGetSnifPolicy(param.tenantId, param.edgeId, param.policyCrc,  options).toPromise();
    }

    /**
     * Summary: Post sniffer feedback Description: Post policy installation feedback to policy-builder service.
     * @param param the request object
     */
    public snifAssistServicePostSnifFeedbackWithHttpInfo(param: SnifAssistServiceApiSnifAssistServicePostSnifFeedbackRequest, options?: ConfigurationOptions): Promise<HttpInfo<Snifassistv3StatusResponseBase>> {
        return this.api.snifAssistServicePostSnifFeedbackWithHttpInfo(param.snifassistv3PostSnifFeedbackRequest,  options).toPromise();
    }

    /**
     * Summary: Post sniffer feedback Description: Post policy installation feedback to policy-builder service.
     * @param param the request object
     */
    public snifAssistServicePostSnifFeedback(param: SnifAssistServiceApiSnifAssistServicePostSnifFeedbackRequest, options?: ConfigurationOptions): Promise<Snifassistv3StatusResponseBase> {
        return this.api.snifAssistServicePostSnifFeedback(param.snifassistv3PostSnifFeedbackRequest,  options).toPromise();
    }

    /**
     * Summary: Test regex Description: Match a text string with a regular expression using the same sniffer  code used in production to match a regex.
     * @param param the request object
     */
    public snifAssistServiceTestRegexWithHttpInfo(param: SnifAssistServiceApiSnifAssistServiceTestRegexRequest, options?: ConfigurationOptions): Promise<HttpInfo<Snifassistv3StatusResponseBase>> {
        return this.api.snifAssistServiceTestRegexWithHttpInfo(param.snifassistv3TestRegexRequest,  options).toPromise();
    }

    /**
     * Summary: Test regex Description: Match a text string with a regular expression using the same sniffer  code used in production to match a regex.
     * @param param the request object
     */
    public snifAssistServiceTestRegex(param: SnifAssistServiceApiSnifAssistServiceTestRegexRequest, options?: ConfigurationOptions): Promise<Snifassistv3StatusResponseBase> {
        return this.api.snifAssistServiceTestRegex(param.snifassistv3TestRegexRequest,  options).toPromise();
    }

}

import { ObservableStreamsServiceApi } from "./ObservableAPI";
import { StreamsServiceApiRequestFactory, StreamsServiceApiResponseProcessor} from "../apis/StreamsServiceApi";

export interface StreamsServiceApiStreamsServiceCheckAWSCredentialsRequest {
    /**
     * 
     * @type Streamsv3CheckAWSCredentialsRequest
     * @memberof StreamsServiceApistreamsServiceCheckAWSCredentials
     */
    streamsv3CheckAWSCredentialsRequest: Streamsv3CheckAWSCredentialsRequest
}

export interface StreamsServiceApiStreamsServiceCheckAzureEventHubRequest {
    /**
     * 
     * @type Streamsv3CheckAzureEventHubRequest
     * @memberof StreamsServiceApistreamsServiceCheckAzureEventHub
     */
    streamsv3CheckAzureEventHubRequest: Streamsv3CheckAzureEventHubRequest
}

export interface StreamsServiceApiStreamsServiceCheckAzureStorageStringRequest {
    /**
     * 
     * @type Streamsv3CheckAzureStorageStringRequest
     * @memberof StreamsServiceApistreamsServiceCheckAzureStorageString
     */
    streamsv3CheckAzureStorageStringRequest: Streamsv3CheckAzureStorageStringRequest
}

export interface StreamsServiceApiStreamsServiceGetAWSRegionsRequest {
}

export interface StreamsServiceApiStreamsServiceListAWSStreamsRequest {
    /**
     * 
     * @type Streamsv3ListAWSStreamsRequest
     * @memberof StreamsServiceApistreamsServiceListAWSStreams
     */
    streamsv3ListAWSStreamsRequest: Streamsv3ListAWSStreamsRequest
}

export class ObjectStreamsServiceApi {
    private api: ObservableStreamsServiceApi

    public constructor(configuration: Configuration, requestFactory?: StreamsServiceApiRequestFactory, responseProcessor?: StreamsServiceApiResponseProcessor) {
        this.api = new ObservableStreamsServiceApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Summary: Check AWS credentials Description: Service to verify AWS credentials.
     * @param param the request object
     */
    public streamsServiceCheckAWSCredentialsWithHttpInfo(param: StreamsServiceApiStreamsServiceCheckAWSCredentialsRequest, options?: ConfigurationOptions): Promise<HttpInfo<Streamsv3CheckAWSCredentialsResponse>> {
        return this.api.streamsServiceCheckAWSCredentialsWithHttpInfo(param.streamsv3CheckAWSCredentialsRequest,  options).toPromise();
    }

    /**
     * Summary: Check AWS credentials Description: Service to verify AWS credentials.
     * @param param the request object
     */
    public streamsServiceCheckAWSCredentials(param: StreamsServiceApiStreamsServiceCheckAWSCredentialsRequest, options?: ConfigurationOptions): Promise<Streamsv3CheckAWSCredentialsResponse> {
        return this.api.streamsServiceCheckAWSCredentials(param.streamsv3CheckAWSCredentialsRequest,  options).toPromise();
    }

    /**
     * Summary: Check Azure event hub Description: Service to check Azure event hub.
     * @param param the request object
     */
    public streamsServiceCheckAzureEventHubWithHttpInfo(param: StreamsServiceApiStreamsServiceCheckAzureEventHubRequest, options?: ConfigurationOptions): Promise<HttpInfo<Streamsv3CheckAzureEventHubResponse>> {
        return this.api.streamsServiceCheckAzureEventHubWithHttpInfo(param.streamsv3CheckAzureEventHubRequest,  options).toPromise();
    }

    /**
     * Summary: Check Azure event hub Description: Service to check Azure event hub.
     * @param param the request object
     */
    public streamsServiceCheckAzureEventHub(param: StreamsServiceApiStreamsServiceCheckAzureEventHubRequest, options?: ConfigurationOptions): Promise<Streamsv3CheckAzureEventHubResponse> {
        return this.api.streamsServiceCheckAzureEventHub(param.streamsv3CheckAzureEventHubRequest,  options).toPromise();
    }

    /**
     * Summary: Check Azure storage string Description: Service to verify Azure storage connection.
     * @param param the request object
     */
    public streamsServiceCheckAzureStorageStringWithHttpInfo(param: StreamsServiceApiStreamsServiceCheckAzureStorageStringRequest, options?: ConfigurationOptions): Promise<HttpInfo<Streamsv3CheckAzureStorageStringResponse>> {
        return this.api.streamsServiceCheckAzureStorageStringWithHttpInfo(param.streamsv3CheckAzureStorageStringRequest,  options).toPromise();
    }

    /**
     * Summary: Check Azure storage string Description: Service to verify Azure storage connection.
     * @param param the request object
     */
    public streamsServiceCheckAzureStorageString(param: StreamsServiceApiStreamsServiceCheckAzureStorageStringRequest, options?: ConfigurationOptions): Promise<Streamsv3CheckAzureStorageStringResponse> {
        return this.api.streamsServiceCheckAzureStorageString(param.streamsv3CheckAzureStorageStringRequest,  options).toPromise();
    }

    /**
     * Summary: Get AWS regions Description: Service to get AWS regions.
     * @param param the request object
     */
    public streamsServiceGetAWSRegionsWithHttpInfo(param: StreamsServiceApiStreamsServiceGetAWSRegionsRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Streamsv3GetAWSRegionsResponse>> {
        return this.api.streamsServiceGetAWSRegionsWithHttpInfo( options).toPromise();
    }

    /**
     * Summary: Get AWS regions Description: Service to get AWS regions.
     * @param param the request object
     */
    public streamsServiceGetAWSRegions(param: StreamsServiceApiStreamsServiceGetAWSRegionsRequest = {}, options?: ConfigurationOptions): Promise<Streamsv3GetAWSRegionsResponse> {
        return this.api.streamsServiceGetAWSRegions( options).toPromise();
    }

    /**
     * Summary: List AWS streams Description: Service to list AWS Kinesis streams.
     * @param param the request object
     */
    public streamsServiceListAWSStreamsWithHttpInfo(param: StreamsServiceApiStreamsServiceListAWSStreamsRequest, options?: ConfigurationOptions): Promise<HttpInfo<Streamsv3ListAWSStreamsResponse>> {
        return this.api.streamsServiceListAWSStreamsWithHttpInfo(param.streamsv3ListAWSStreamsRequest,  options).toPromise();
    }

    /**
     * Summary: List AWS streams Description: Service to list AWS Kinesis streams.
     * @param param the request object
     */
    public streamsServiceListAWSStreams(param: StreamsServiceApiStreamsServiceListAWSStreamsRequest, options?: ConfigurationOptions): Promise<Streamsv3ListAWSStreamsResponse> {
        return this.api.streamsServiceListAWSStreams(param.streamsv3ListAWSStreamsRequest,  options).toPromise();
    }

}

import { ObservableTenantuserApi } from "./ObservableAPI";
import { TenantuserApiRequestFactory, TenantuserApiResponseProcessor} from "../apis/TenantuserApi";

export interface TenantuserApiTenantuserCreateAPIKeyRequest {
    /**
     * 
     * @type Tenantuserv3CreateApiKeyRequest
     * @memberof TenantuserApitenantuserCreateAPIKey
     */
    tenantuserv3CreateApiKeyRequest: Tenantuserv3CreateApiKeyRequest
}

export interface TenantuserApiTenantuserDeleteAPIKeyRequest {
    /**
     * Apikey id.
     * Defaults to: undefined
     * @type string
     * @memberof TenantuserApitenantuserDeleteAPIKey
     */
    id: string
}

export interface TenantuserApiTenantuserDeleteRoleRequest {
    /**
     * ID or role deleted.
     * Defaults to: undefined
     * @type string
     * @memberof TenantuserApitenantuserDeleteRole
     */
    roleId: string
}

export interface TenantuserApiTenantuserGetAPIKeysRequest {
}

export interface TenantuserApiTenantuserGetCurrentUserRequest {
}

export interface TenantuserApiTenantuserGetPrivilegeRequest {
    /**
     * Privilege ID.
     * Defaults to: undefined
     * @type string
     * @memberof TenantuserApitenantuserGetPrivilege
     */
    privilegePrivilegeId: string
    /**
     * Privilege Type - a report, group, and datasource may have the same ID. By passing type, the artifact can be uniquely determined.
     * Defaults to: undefined
     * @type string
     * @memberof TenantuserApitenantuserGetPrivilege
     */
    privilegeType?: string
}

export interface TenantuserApiTenantuserGetPrivilegesRequest {
    /**
     * If empty, will return all privileges.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof TenantuserApitenantuserGetPrivileges
     */
    roles?: Array<string>
    /**
     * Type of privilege to return: group, page, permission, report, restapi, etc.
     * Defaults to: undefined
     * @type string
     * @memberof TenantuserApitenantuserGetPrivileges
     */
    type?: string
}

export interface TenantuserApiTenantuserGetRoleRequest {
    /**
     * ID of role to be returned.
     * Defaults to: undefined
     * @type string
     * @memberof TenantuserApitenantuserGetRole
     */
    roleId: string
}

export interface TenantuserApiTenantuserGetRolesRequest {
}

export interface TenantuserApiTenantuserGetUserRequest {
    /**
     * User id defaults to the current user or specify \&quot;current\&quot; or an actual user id.
     * Defaults to: undefined
     * @type string
     * @memberof TenantuserApitenantuserGetUser
     */
    userId: string
}

export interface TenantuserApiTenantuserGetUserNamesRequest {
    /**
     * 
     * @type Tenantuserv3GetUserNamesRequest
     * @memberof TenantuserApitenantuserGetUserNames
     */
    tenantuserv3GetUserNamesRequest: Tenantuserv3GetUserNamesRequest
}

export interface TenantuserApiTenantuserGetUserTenantRequest {
    /**
     * User id defaults to the current user or specify \&quot;current\&quot; or an actual user id.
     * Defaults to: undefined
     * @type string
     * @memberof TenantuserApitenantuserGetUserTenant
     */
    userId: string
}

export interface TenantuserApiTenantuserPostPrivilegesBulkRequest {
    /**
     * 
     * @type Tenantuserv3PostPrivilegesBulkRequest
     * @memberof TenantuserApitenantuserPostPrivilegesBulk
     */
    tenantuserv3PostPrivilegesBulkRequest: Tenantuserv3PostPrivilegesBulkRequest
}

export interface TenantuserApiTenantuserPostRoleRequest {
    /**
     * 
     * @type Tenantuserv3PostRoleRequest
     * @memberof TenantuserApitenantuserPostRole
     */
    tenantuserv3PostRoleRequest: Tenantuserv3PostRoleRequest
}

export interface TenantuserApiTenantuserUpdatePrivilegeRequest {
    /**
     * Permanent id of the privilege to be updated or created.
     * Defaults to: undefined
     * @type string
     * @memberof TenantuserApitenantuserUpdatePrivilege
     */
    privilegeId: string
    /**
     * 
     * @type Tenantuserv3UpdatePrivilegeRequest
     * @memberof TenantuserApitenantuserUpdatePrivilege
     */
    tenantuserv3UpdatePrivilegeRequest: Tenantuserv3UpdatePrivilegeRequest
}

export interface TenantuserApiTenantuserUpdatePrivilegesRoleBulkRequest {
    /**
     * 
     * @type Tenantuserv3UpdatePrivilegesBulkRequest
     * @memberof TenantuserApitenantuserUpdatePrivilegesRoleBulk
     */
    tenantuserv3UpdatePrivilegesBulkRequest: Tenantuserv3UpdatePrivilegesBulkRequest
}

export interface TenantuserApiTenantuserUpdateRoleRequest {
    /**
     * Permanent id of the role.
     * Defaults to: undefined
     * @type string
     * @memberof TenantuserApitenantuserUpdateRole
     */
    roleId: string
    /**
     * 
     * @type Tenantuserv3UpdateRoleRequest
     * @memberof TenantuserApitenantuserUpdateRole
     */
    tenantuserv3UpdateRoleRequest: Tenantuserv3UpdateRoleRequest
}

export interface TenantuserApiTenantuserUpdateUserRoleBulkRequest {
    /**
     * 
     * @type Tenantuserv3UpdateUserRoleBulkRequest
     * @memberof TenantuserApitenantuserUpdateUserRoleBulk
     */
    tenantuserv3UpdateUserRoleBulkRequest: Tenantuserv3UpdateUserRoleBulkRequest
}

export class ObjectTenantuserApi {
    private api: ObservableTenantuserApi

    public constructor(configuration: Configuration, requestFactory?: TenantuserApiRequestFactory, responseProcessor?: TenantuserApiResponseProcessor) {
        this.api = new ObservableTenantuserApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Summary: Create API key Description: Create API Key.
     * @param param the request object
     */
    public tenantuserCreateAPIKeyWithHttpInfo(param: TenantuserApiTenantuserCreateAPIKeyRequest, options?: ConfigurationOptions): Promise<HttpInfo<Tenantuserv3CreateApiKeyResponse>> {
        return this.api.tenantuserCreateAPIKeyWithHttpInfo(param.tenantuserv3CreateApiKeyRequest,  options).toPromise();
    }

    /**
     * Summary: Create API key Description: Create API Key.
     * @param param the request object
     */
    public tenantuserCreateAPIKey(param: TenantuserApiTenantuserCreateAPIKeyRequest, options?: ConfigurationOptions): Promise<Tenantuserv3CreateApiKeyResponse> {
        return this.api.tenantuserCreateAPIKey(param.tenantuserv3CreateApiKeyRequest,  options).toPromise();
    }

    /**
     * Summary: Delete API key Description: Delete APIKey Document based on the document id.
     * @param param the request object
     */
    public tenantuserDeleteAPIKeyWithHttpInfo(param: TenantuserApiTenantuserDeleteAPIKeyRequest, options?: ConfigurationOptions): Promise<HttpInfo<any>> {
        return this.api.tenantuserDeleteAPIKeyWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * Summary: Delete API key Description: Delete APIKey Document based on the document id.
     * @param param the request object
     */
    public tenantuserDeleteAPIKey(param: TenantuserApiTenantuserDeleteAPIKeyRequest, options?: ConfigurationOptions): Promise<any> {
        return this.api.tenantuserDeleteAPIKey(param.id,  options).toPromise();
    }

    /**
     * Summary: Delete role Description: Delete a role.
     * @param param the request object
     */
    public tenantuserDeleteRoleWithHttpInfo(param: TenantuserApiTenantuserDeleteRoleRequest, options?: ConfigurationOptions): Promise<HttpInfo<any>> {
        return this.api.tenantuserDeleteRoleWithHttpInfo(param.roleId,  options).toPromise();
    }

    /**
     * Summary: Delete role Description: Delete a role.
     * @param param the request object
     */
    public tenantuserDeleteRole(param: TenantuserApiTenantuserDeleteRoleRequest, options?: ConfigurationOptions): Promise<any> {
        return this.api.tenantuserDeleteRole(param.roleId,  options).toPromise();
    }

    /**
     * Summary: Get API keys Description: Get all APIKeys base on a tenant ID.
     * @param param the request object
     */
    public tenantuserGetAPIKeysWithHttpInfo(param: TenantuserApiTenantuserGetAPIKeysRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Tenantuserv3GetApiKeysResponse>> {
        return this.api.tenantuserGetAPIKeysWithHttpInfo( options).toPromise();
    }

    /**
     * Summary: Get API keys Description: Get all APIKeys base on a tenant ID.
     * @param param the request object
     */
    public tenantuserGetAPIKeys(param: TenantuserApiTenantuserGetAPIKeysRequest = {}, options?: ConfigurationOptions): Promise<Tenantuserv3GetApiKeysResponse> {
        return this.api.tenantuserGetAPIKeys( options).toPromise();
    }

    /**
     * Summary: Get current user Description: Return the currently authenticated user.
     * @param param the request object
     */
    public tenantuserGetCurrentUserWithHttpInfo(param: TenantuserApiTenantuserGetCurrentUserRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Tenantuserv3GetCurrentUserResponse>> {
        return this.api.tenantuserGetCurrentUserWithHttpInfo( options).toPromise();
    }

    /**
     * Summary: Get current user Description: Return the currently authenticated user.
     * @param param the request object
     */
    public tenantuserGetCurrentUser(param: TenantuserApiTenantuserGetCurrentUserRequest = {}, options?: ConfigurationOptions): Promise<Tenantuserv3GetCurrentUserResponse> {
        return this.api.tenantuserGetCurrentUser( options).toPromise();
    }

    /**
     * Summary: Get privilege Description: Return privilege.
     * @param param the request object
     */
    public tenantuserGetPrivilegeWithHttpInfo(param: TenantuserApiTenantuserGetPrivilegeRequest, options?: ConfigurationOptions): Promise<HttpInfo<Tenantuserv3GetPrivilegeResponse>> {
        return this.api.tenantuserGetPrivilegeWithHttpInfo(param.privilegePrivilegeId, param.privilegeType,  options).toPromise();
    }

    /**
     * Summary: Get privilege Description: Return privilege.
     * @param param the request object
     */
    public tenantuserGetPrivilege(param: TenantuserApiTenantuserGetPrivilegeRequest, options?: ConfigurationOptions): Promise<Tenantuserv3GetPrivilegeResponse> {
        return this.api.tenantuserGetPrivilege(param.privilegePrivilegeId, param.privilegeType,  options).toPromise();
    }

    /**
     * Summary: Get privileges Description: Return all available privileges (pages, restapi, reports, etc) if no roles are specified If roles are specified, returns cumulative privileges for the list of roles.
     * @param param the request object
     */
    public tenantuserGetPrivilegesWithHttpInfo(param: TenantuserApiTenantuserGetPrivilegesRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Tenantuserv3GetPrivilegesResponse>> {
        return this.api.tenantuserGetPrivilegesWithHttpInfo(param.roles, param.type,  options).toPromise();
    }

    /**
     * Summary: Get privileges Description: Return all available privileges (pages, restapi, reports, etc) if no roles are specified If roles are specified, returns cumulative privileges for the list of roles.
     * @param param the request object
     */
    public tenantuserGetPrivileges(param: TenantuserApiTenantuserGetPrivilegesRequest = {}, options?: ConfigurationOptions): Promise<Tenantuserv3GetPrivilegesResponse> {
        return this.api.tenantuserGetPrivileges(param.roles, param.type,  options).toPromise();
    }

    /**
     * Summary: Get role Description: Return single role.
     * @param param the request object
     */
    public tenantuserGetRoleWithHttpInfo(param: TenantuserApiTenantuserGetRoleRequest, options?: ConfigurationOptions): Promise<HttpInfo<Tenantuserv3Role>> {
        return this.api.tenantuserGetRoleWithHttpInfo(param.roleId,  options).toPromise();
    }

    /**
     * Summary: Get role Description: Return single role.
     * @param param the request object
     */
    public tenantuserGetRole(param: TenantuserApiTenantuserGetRoleRequest, options?: ConfigurationOptions): Promise<Tenantuserv3Role> {
        return this.api.tenantuserGetRole(param.roleId,  options).toPromise();
    }

    /**
     * Summary: Get roles Description: Return all roles without privileges.
     * @param param the request object
     */
    public tenantuserGetRolesWithHttpInfo(param: TenantuserApiTenantuserGetRolesRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Tenantuserv3GetRolesResponse>> {
        return this.api.tenantuserGetRolesWithHttpInfo( options).toPromise();
    }

    /**
     * Summary: Get roles Description: Return all roles without privileges.
     * @param param the request object
     */
    public tenantuserGetRoles(param: TenantuserApiTenantuserGetRolesRequest = {}, options?: ConfigurationOptions): Promise<Tenantuserv3GetRolesResponse> {
        return this.api.tenantuserGetRoles( options).toPromise();
    }

    /**
     * Summary: Get user Description: Return full user for specified user_id.
     * @param param the request object
     */
    public tenantuserGetUserWithHttpInfo(param: TenantuserApiTenantuserGetUserRequest, options?: ConfigurationOptions): Promise<HttpInfo<Tenantuserv3GetUserResponse>> {
        return this.api.tenantuserGetUserWithHttpInfo(param.userId,  options).toPromise();
    }

    /**
     * Summary: Get user Description: Return full user for specified user_id.
     * @param param the request object
     */
    public tenantuserGetUser(param: TenantuserApiTenantuserGetUserRequest, options?: ConfigurationOptions): Promise<Tenantuserv3GetUserResponse> {
        return this.api.tenantuserGetUser(param.userId,  options).toPromise();
    }

    /**
     * Summary: Get user names Description: Get user names.
     * @param param the request object
     */
    public tenantuserGetUserNamesWithHttpInfo(param: TenantuserApiTenantuserGetUserNamesRequest, options?: ConfigurationOptions): Promise<HttpInfo<Tenantuserv3GetUserNamesResponse>> {
        return this.api.tenantuserGetUserNamesWithHttpInfo(param.tenantuserv3GetUserNamesRequest,  options).toPromise();
    }

    /**
     * Summary: Get user names Description: Get user names.
     * @param param the request object
     */
    public tenantuserGetUserNames(param: TenantuserApiTenantuserGetUserNamesRequest, options?: ConfigurationOptions): Promise<Tenantuserv3GetUserNamesResponse> {
        return this.api.tenantuserGetUserNames(param.tenantuserv3GetUserNamesRequest,  options).toPromise();
    }

    /**
     * Summary: Get user tenant Description: Return the user plus tenant information.
     * @param param the request object
     */
    public tenantuserGetUserTenantWithHttpInfo(param: TenantuserApiTenantuserGetUserTenantRequest, options?: ConfigurationOptions): Promise<HttpInfo<Tenantuserv3GetUserTenantResponse>> {
        return this.api.tenantuserGetUserTenantWithHttpInfo(param.userId,  options).toPromise();
    }

    /**
     * Summary: Get user tenant Description: Return the user plus tenant information.
     * @param param the request object
     */
    public tenantuserGetUserTenant(param: TenantuserApiTenantuserGetUserTenantRequest, options?: ConfigurationOptions): Promise<Tenantuserv3GetUserTenantResponse> {
        return this.api.tenantuserGetUserTenant(param.userId,  options).toPromise();
    }

    /**
     * Summary: Post privileges bulk Description: Perform bulk user add preivilege.
     * @param param the request object
     */
    public tenantuserPostPrivilegesBulkWithHttpInfo(param: TenantuserApiTenantuserPostPrivilegesBulkRequest, options?: ConfigurationOptions): Promise<HttpInfo<Tenantuserv3PostPrivilegesBulkResponse>> {
        return this.api.tenantuserPostPrivilegesBulkWithHttpInfo(param.tenantuserv3PostPrivilegesBulkRequest,  options).toPromise();
    }

    /**
     * Summary: Post privileges bulk Description: Perform bulk user add preivilege.
     * @param param the request object
     */
    public tenantuserPostPrivilegesBulk(param: TenantuserApiTenantuserPostPrivilegesBulkRequest, options?: ConfigurationOptions): Promise<Tenantuserv3PostPrivilegesBulkResponse> {
        return this.api.tenantuserPostPrivilegesBulk(param.tenantuserv3PostPrivilegesBulkRequest,  options).toPromise();
    }

    /**
     * Summary: Post role Description: Create a new role.
     * @param param the request object
     */
    public tenantuserPostRoleWithHttpInfo(param: TenantuserApiTenantuserPostRoleRequest, options?: ConfigurationOptions): Promise<HttpInfo<Tenantuserv3PostRoleResponse>> {
        return this.api.tenantuserPostRoleWithHttpInfo(param.tenantuserv3PostRoleRequest,  options).toPromise();
    }

    /**
     * Summary: Post role Description: Create a new role.
     * @param param the request object
     */
    public tenantuserPostRole(param: TenantuserApiTenantuserPostRoleRequest, options?: ConfigurationOptions): Promise<Tenantuserv3PostRoleResponse> {
        return this.api.tenantuserPostRole(param.tenantuserv3PostRoleRequest,  options).toPromise();
    }

    /**
     * Summary: Update privilege Description: Update privilege.
     * @param param the request object
     */
    public tenantuserUpdatePrivilegeWithHttpInfo(param: TenantuserApiTenantuserUpdatePrivilegeRequest, options?: ConfigurationOptions): Promise<HttpInfo<Tenantuserv3UpdatePrivilegeResponse>> {
        return this.api.tenantuserUpdatePrivilegeWithHttpInfo(param.privilegeId, param.tenantuserv3UpdatePrivilegeRequest,  options).toPromise();
    }

    /**
     * Summary: Update privilege Description: Update privilege.
     * @param param the request object
     */
    public tenantuserUpdatePrivilege(param: TenantuserApiTenantuserUpdatePrivilegeRequest, options?: ConfigurationOptions): Promise<Tenantuserv3UpdatePrivilegeResponse> {
        return this.api.tenantuserUpdatePrivilege(param.privilegeId, param.tenantuserv3UpdatePrivilegeRequest,  options).toPromise();
    }

    /**
     * Summary: Update privileges role bulk Description: Perform bulk user update role.
     * @param param the request object
     */
    public tenantuserUpdatePrivilegesRoleBulkWithHttpInfo(param: TenantuserApiTenantuserUpdatePrivilegesRoleBulkRequest, options?: ConfigurationOptions): Promise<HttpInfo<Tenantuserv3UpdatePrivilegesBulkResponse>> {
        return this.api.tenantuserUpdatePrivilegesRoleBulkWithHttpInfo(param.tenantuserv3UpdatePrivilegesBulkRequest,  options).toPromise();
    }

    /**
     * Summary: Update privileges role bulk Description: Perform bulk user update role.
     * @param param the request object
     */
    public tenantuserUpdatePrivilegesRoleBulk(param: TenantuserApiTenantuserUpdatePrivilegesRoleBulkRequest, options?: ConfigurationOptions): Promise<Tenantuserv3UpdatePrivilegesBulkResponse> {
        return this.api.tenantuserUpdatePrivilegesRoleBulk(param.tenantuserv3UpdatePrivilegesBulkRequest,  options).toPromise();
    }

    /**
     * Summary: Update role Description: Update single role.
     * @param param the request object
     */
    public tenantuserUpdateRoleWithHttpInfo(param: TenantuserApiTenantuserUpdateRoleRequest, options?: ConfigurationOptions): Promise<HttpInfo<Tenantuserv3UpdateRoleResponse>> {
        return this.api.tenantuserUpdateRoleWithHttpInfo(param.roleId, param.tenantuserv3UpdateRoleRequest,  options).toPromise();
    }

    /**
     * Summary: Update role Description: Update single role.
     * @param param the request object
     */
    public tenantuserUpdateRole(param: TenantuserApiTenantuserUpdateRoleRequest, options?: ConfigurationOptions): Promise<Tenantuserv3UpdateRoleResponse> {
        return this.api.tenantuserUpdateRole(param.roleId, param.tenantuserv3UpdateRoleRequest,  options).toPromise();
    }

    /**
     * Summary: Update user role bulk Description: Perform bulk user add or remove role.
     * @param param the request object
     */
    public tenantuserUpdateUserRoleBulkWithHttpInfo(param: TenantuserApiTenantuserUpdateUserRoleBulkRequest, options?: ConfigurationOptions): Promise<HttpInfo<Tenantuserv3UpdateUserRoleBulkResponse>> {
        return this.api.tenantuserUpdateUserRoleBulkWithHttpInfo(param.tenantuserv3UpdateUserRoleBulkRequest,  options).toPromise();
    }

    /**
     * Summary: Update user role bulk Description: Perform bulk user add or remove role.
     * @param param the request object
     */
    public tenantuserUpdateUserRoleBulk(param: TenantuserApiTenantuserUpdateUserRoleBulkRequest, options?: ConfigurationOptions): Promise<Tenantuserv3UpdateUserRoleBulkResponse> {
        return this.api.tenantuserUpdateUserRoleBulk(param.tenantuserv3UpdateUserRoleBulkRequest,  options).toPromise();
    }

}

import { ObservableThirdPartyVendorsApi } from "./ObservableAPI";
import { ThirdPartyVendorsApiRequestFactory, ThirdPartyVendorsApiResponseProcessor} from "../apis/ThirdPartyVendorsApi";

export interface ThirdPartyVendorsApiGetLinkedVendorRequest {
    /**
     * The third party vendor\&#39;s account ID
     * Defaults to: undefined
     * @type string
     * @memberof ThirdPartyVendorsApigetLinkedVendor
     */
    vendorId: string
}

export interface ThirdPartyVendorsApiGetSingleLinkedVendorRequest {
    /**
     * vendor id
     * Defaults to: undefined
     * @type string
     * @memberof ThirdPartyVendorsApigetSingleLinkedVendor
     */
    vendorId: string
}

export interface ThirdPartyVendorsApiListLinkedVendorDataStoresRequest {
    /**
     * The third party vendor\&#39;s account ID
     * Defaults to: undefined
     * @type string
     * @memberof ThirdPartyVendorsApilistLinkedVendorDataStores
     */
    vendorId: string
    /**
     * 
     * Defaults to: undefined
     * @type ListVendorDataStoresFilterParameter
     * @memberof ThirdPartyVendorsApilistLinkedVendorDataStores
     */
    filter?: ListVendorDataStoresFilterParameter
    /**
     * 
     * Defaults to: undefined
     * @type ListLinkedVendorDataStoresSortParameter
     * @memberof ThirdPartyVendorsApilistLinkedVendorDataStores
     */
    sort?: ListLinkedVendorDataStoresSortParameter
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof ThirdPartyVendorsApilistLinkedVendorDataStores
     */
    pageSize?: number
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof ThirdPartyVendorsApilistLinkedVendorDataStores
     */
    nextToken?: string
}

export interface ThirdPartyVendorsApiListLinkedVendorsRequest {
}

export interface ThirdPartyVendorsApiListTrustedAssetsRequest {
    /**
     * 
     * Defaults to: undefined
     * @type ListTrusteesFilterParameter
     * @memberof ThirdPartyVendorsApilistTrustedAssets
     */
    filter?: ListTrusteesFilterParameter
}

export class ObjectThirdPartyVendorsApi {
    private api: ObservableThirdPartyVendorsApi

    public constructor(configuration: Configuration, requestFactory?: ThirdPartyVendorsApiRequestFactory, responseProcessor?: ThirdPartyVendorsApiResponseProcessor) {
        this.api = new ObservableThirdPartyVendorsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Get additional details of a specific third party vendor, such as, customer account details, sensitivities summary, and so on.
     * Get additional details of a specific third party vendor
     * @param param the request object
     */
    public getLinkedVendorWithHttpInfo(param: ThirdPartyVendorsApiGetLinkedVendorRequest, options?: ConfigurationOptions): Promise<HttpInfo<Array<VendorSummary>>> {
        return this.api.getLinkedVendorWithHttpInfo(param.vendorId,  options).toPromise();
    }

    /**
     * Get additional details of a specific third party vendor, such as, customer account details, sensitivities summary, and so on.
     * Get additional details of a specific third party vendor
     * @param param the request object
     */
    public getLinkedVendor(param: ThirdPartyVendorsApiGetLinkedVendorRequest, options?: ConfigurationOptions): Promise<Array<VendorSummary>> {
        return this.api.getLinkedVendor(param.vendorId,  options).toPromise();
    }

    /**
     * Get details about a third party vendor.
     * Get the third party vendors list
     * @param param the request object
     */
    public getSingleLinkedVendorWithHttpInfo(param: ThirdPartyVendorsApiGetSingleLinkedVendorRequest, options?: ConfigurationOptions): Promise<HttpInfo<LinkedVendor>> {
        return this.api.getSingleLinkedVendorWithHttpInfo(param.vendorId,  options).toPromise();
    }

    /**
     * Get details about a third party vendor.
     * Get the third party vendors list
     * @param param the request object
     */
    public getSingleLinkedVendor(param: ThirdPartyVendorsApiGetSingleLinkedVendorRequest, options?: ConfigurationOptions): Promise<LinkedVendor> {
        return this.api.getSingleLinkedVendor(param.vendorId,  options).toPromise();
    }

    /**
     * Get a list of all the data stores that a third party vendor can access. Find out whether the data stores have sensitivities and which role can access the data stores.
     * Get the data stores associated with a third party vendor
     * @param param the request object
     */
    public listLinkedVendorDataStoresWithHttpInfo(param: ThirdPartyVendorsApiListLinkedVendorDataStoresRequest, options?: ConfigurationOptions): Promise<HttpInfo<ListLinkedVendorDataStores200Response>> {
        return this.api.listLinkedVendorDataStoresWithHttpInfo(param.vendorId, param.filter, param.sort, param.pageSize, param.nextToken,  options).toPromise();
    }

    /**
     * Get a list of all the data stores that a third party vendor can access. Find out whether the data stores have sensitivities and which role can access the data stores.
     * Get the data stores associated with a third party vendor
     * @param param the request object
     */
    public listLinkedVendorDataStores(param: ThirdPartyVendorsApiListLinkedVendorDataStoresRequest, options?: ConfigurationOptions): Promise<ListLinkedVendorDataStores200Response> {
        return this.api.listLinkedVendorDataStores(param.vendorId, param.filter, param.sort, param.pageSize, param.nextToken,  options).toPromise();
    }

    /**
     * Get a list of all third party vendors associated to your cloud environments (relevant for the cloud environments connected to Guardium DSPM only).
     * Get the summary of a third party vendor
     * @param param the request object
     */
    public listLinkedVendorsWithHttpInfo(param: ThirdPartyVendorsApiListLinkedVendorsRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Array<LinkedVendor>>> {
        return this.api.listLinkedVendorsWithHttpInfo( options).toPromise();
    }

    /**
     * Get a list of all third party vendors associated to your cloud environments (relevant for the cloud environments connected to Guardium DSPM only).
     * Get the summary of a third party vendor
     * @param param the request object
     */
    public listLinkedVendors(param: ThirdPartyVendorsApiListLinkedVendorsRequest = {}, options?: ConfigurationOptions): Promise<Array<LinkedVendor>> {
        return this.api.listLinkedVendors( options).toPromise();
    }

    /**
     * Get a list of roles, buckets or service principles, and their entitled permissions associated to your cloud environments connected to Guardium DSPM.
     * Get a list of all the actual trusted assets
     * @param param the request object
     */
    public listTrustedAssetsWithHttpInfo(param: ThirdPartyVendorsApiListTrustedAssetsRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Array<Trustee>>> {
        return this.api.listTrustedAssetsWithHttpInfo(param.filter,  options).toPromise();
    }

    /**
     * Get a list of roles, buckets or service principles, and their entitled permissions associated to your cloud environments connected to Guardium DSPM.
     * Get a list of all the actual trusted assets
     * @param param the request object
     */
    public listTrustedAssets(param: ThirdPartyVendorsApiListTrustedAssetsRequest = {}, options?: ConfigurationOptions): Promise<Array<Trustee>> {
        return this.api.listTrustedAssets(param.filter,  options).toPromise();
    }

}

import { ObservableUniversalConnectorManagerApi } from "./ObservableAPI";
import { UniversalConnectorManagerApiRequestFactory, UniversalConnectorManagerApiResponseProcessor} from "../apis/UniversalConnectorManagerApi";

export interface UniversalConnectorManagerApiUniversalConnectorManagerGetCertificateRequest {
}

export interface UniversalConnectorManagerApiUniversalConnectorManagerGetConnectorsRequest {
}

export interface UniversalConnectorManagerApiUniversalConnectorManagerGetUCSetupRequest {
    /**
     * UC plugin id.
     * Defaults to: undefined
     * @type number
     * @memberof UniversalConnectorManagerApiuniversalConnectorManagerGetUCSetup
     */
    pluginId: number
}

export interface UniversalConnectorManagerApiUniversalConnectorManagerListConnectionsSummaryRequest {
}

export interface UniversalConnectorManagerApiUniversalConnectorManagerPluginsListRequest {
}

export interface UniversalConnectorManagerApiUniversalConnectorManagerUploadPluginRequest {
    /**
     * 
     * @type Universalconnectormanagerv3UploadPluginRequest
     * @memberof UniversalConnectorManagerApiuniversalConnectorManagerUploadPlugin
     */
    universalconnectormanagerv3UploadPluginRequest: Universalconnectormanagerv3UploadPluginRequest
}

export class ObjectUniversalConnectorManagerApi {
    private api: ObservableUniversalConnectorManagerApi

    public constructor(configuration: Configuration, requestFactory?: UniversalConnectorManagerApiRequestFactory, responseProcessor?: UniversalConnectorManagerApiResponseProcessor) {
        this.api = new ObservableUniversalConnectorManagerApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Summary: Get certificate Description: Get the certificate that allows secure communication between data sources and universal connections in GDSC.
     * @param param the request object
     */
    public universalConnectorManagerGetCertificateWithHttpInfo(param: UniversalConnectorManagerApiUniversalConnectorManagerGetCertificateRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Universalconnectormanagerv3FileResponse>> {
        return this.api.universalConnectorManagerGetCertificateWithHttpInfo( options).toPromise();
    }

    /**
     * Summary: Get certificate Description: Get the certificate that allows secure communication between data sources and universal connections in GDSC.
     * @param param the request object
     */
    public universalConnectorManagerGetCertificate(param: UniversalConnectorManagerApiUniversalConnectorManagerGetCertificateRequest = {}, options?: ConfigurationOptions): Promise<Universalconnectormanagerv3FileResponse> {
        return this.api.universalConnectorManagerGetCertificate( options).toPromise();
    }

    /**
     * Summary: Get connectors Description: Get all the connectors Universal Connector can support. Includes a list of event pipelines (input--filter pairs), along with the supported data source types and platforms.
     * @param param the request object
     */
    public universalConnectorManagerGetConnectorsWithHttpInfo(param: UniversalConnectorManagerApiUniversalConnectorManagerGetConnectorsRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Universalconnectormanagerv3GetConnectorsResponse>> {
        return this.api.universalConnectorManagerGetConnectorsWithHttpInfo( options).toPromise();
    }

    /**
     * Summary: Get connectors Description: Get all the connectors Universal Connector can support. Includes a list of event pipelines (input--filter pairs), along with the supported data source types and platforms.
     * @param param the request object
     */
    public universalConnectorManagerGetConnectors(param: UniversalConnectorManagerApiUniversalConnectorManagerGetConnectorsRequest = {}, options?: ConfigurationOptions): Promise<Universalconnectormanagerv3GetConnectorsResponse> {
        return this.api.universalConnectorManagerGetConnectors( options).toPromise();
    }

    /**
     * Gets information to setup the new Universal connection.
     * @param param the request object
     */
    public universalConnectorManagerGetUCSetupWithHttpInfo(param: UniversalConnectorManagerApiUniversalConnectorManagerGetUCSetupRequest, options?: ConfigurationOptions): Promise<HttpInfo<Universalconnectormanagerv3GetUCSetupResponse>> {
        return this.api.universalConnectorManagerGetUCSetupWithHttpInfo(param.pluginId,  options).toPromise();
    }

    /**
     * Gets information to setup the new Universal connection.
     * @param param the request object
     */
    public universalConnectorManagerGetUCSetup(param: UniversalConnectorManagerApiUniversalConnectorManagerGetUCSetupRequest, options?: ConfigurationOptions): Promise<Universalconnectormanagerv3GetUCSetupResponse> {
        return this.api.universalConnectorManagerGetUCSetup(param.pluginId,  options).toPromise();
    }

    /**
     * Summary: List connections summary Description: List a summary of Universal Connector configured connections (AKA datasources).
     * @param param the request object
     */
    public universalConnectorManagerListConnectionsSummaryWithHttpInfo(param: UniversalConnectorManagerApiUniversalConnectorManagerListConnectionsSummaryRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Universalconnectormanagerv3ListConnectionsResponse>> {
        return this.api.universalConnectorManagerListConnectionsSummaryWithHttpInfo( options).toPromise();
    }

    /**
     * Summary: List connections summary Description: List a summary of Universal Connector configured connections (AKA datasources).
     * @param param the request object
     */
    public universalConnectorManagerListConnectionsSummary(param: UniversalConnectorManagerApiUniversalConnectorManagerListConnectionsSummaryRequest = {}, options?: ConfigurationOptions): Promise<Universalconnectormanagerv3ListConnectionsResponse> {
        return this.api.universalConnectorManagerListConnectionsSummary( options).toPromise();
    }

    /**
     * Summary: Plugins list Description: List of all universal connector plugins.
     * @param param the request object
     */
    public universalConnectorManagerPluginsListWithHttpInfo(param: UniversalConnectorManagerApiUniversalConnectorManagerPluginsListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Universalconnectormanagerv3PluginsListResponse>> {
        return this.api.universalConnectorManagerPluginsListWithHttpInfo( options).toPromise();
    }

    /**
     * Summary: Plugins list Description: List of all universal connector plugins.
     * @param param the request object
     */
    public universalConnectorManagerPluginsList(param: UniversalConnectorManagerApiUniversalConnectorManagerPluginsListRequest = {}, options?: ConfigurationOptions): Promise<Universalconnectormanagerv3PluginsListResponse> {
        return this.api.universalConnectorManagerPluginsList( options).toPromise();
    }

    /**
     * Summary: Upload plugin Description: Upload a plugin-package for Universal Connector.
     * @param param the request object
     */
    public universalConnectorManagerUploadPluginWithHttpInfo(param: UniversalConnectorManagerApiUniversalConnectorManagerUploadPluginRequest, options?: ConfigurationOptions): Promise<HttpInfo<RpcStatus>> {
        return this.api.universalConnectorManagerUploadPluginWithHttpInfo(param.universalconnectormanagerv3UploadPluginRequest,  options).toPromise();
    }

    /**
     * Summary: Upload plugin Description: Upload a plugin-package for Universal Connector.
     * @param param the request object
     */
    public universalConnectorManagerUploadPlugin(param: UniversalConnectorManagerApiUniversalConnectorManagerUploadPluginRequest, options?: ConfigurationOptions): Promise<RpcStatus> {
        return this.api.universalConnectorManagerUploadPlugin(param.universalconnectormanagerv3UploadPluginRequest,  options).toPromise();
    }

}

import { ObservableVulnerabilityManagementServiceApi } from "./ObservableAPI";
import { VulnerabilityManagementServiceApiRequestFactory, VulnerabilityManagementServiceApiResponseProcessor} from "../apis/VulnerabilityManagementServiceApi";

export interface VulnerabilityManagementServiceApiVulnerabilityManagementServiceCreateVulnerabilityRequest {
    /**
     * 
     * @type Vulmanagementv3CreateVulnerabilityRequest
     * @memberof VulnerabilityManagementServiceApivulnerabilityManagementServiceCreateVulnerability
     */
    vulmanagementv3CreateVulnerabilityRequest: Vulmanagementv3CreateVulnerabilityRequest
}

export interface VulnerabilityManagementServiceApiVulnerabilityManagementServiceGetFiltersForVulnerabilitiesRequest {
}

export interface VulnerabilityManagementServiceApiVulnerabilityManagementServiceGetVulnerabilitiesRequest {
    /**
     * 
     * @type Vulmanagementv3GetVulnerabilitiesRequest
     * @memberof VulnerabilityManagementServiceApivulnerabilityManagementServiceGetVulnerabilities
     */
    vulmanagementv3GetVulnerabilitiesRequest: Vulmanagementv3GetVulnerabilitiesRequest
}

export interface VulnerabilityManagementServiceApiVulnerabilityManagementServiceGetVulnerabilitiesStatsRequest {
}

export interface VulnerabilityManagementServiceApiVulnerabilityManagementServiceGetVulnerabilityRequest {
    /**
     * ID for the record to return.
     * Defaults to: undefined
     * @type string
     * @memberof VulnerabilityManagementServiceApivulnerabilityManagementServiceGetVulnerability
     */
    vulnerabilityId: string
}

export interface VulnerabilityManagementServiceApiVulnerabilityManagementServiceUpdateVulnerabilitiesRequest {
    /**
     * 
     * @type Vulmanagementv3UpdateVulnerabilitiesRequest
     * @memberof VulnerabilityManagementServiceApivulnerabilityManagementServiceUpdateVulnerabilities
     */
    vulmanagementv3UpdateVulnerabilitiesRequest: Vulmanagementv3UpdateVulnerabilitiesRequest
}

export interface VulnerabilityManagementServiceApiVulnerabilityManagementServiceVulnerabilityIngestionManualTriggerRequest {
    /**
     * 
     * @type any
     * @memberof VulnerabilityManagementServiceApivulnerabilityManagementServiceVulnerabilityIngestionManualTrigger
     */
    body: any
}

export class ObjectVulnerabilityManagementServiceApi {
    private api: ObservableVulnerabilityManagementServiceApi

    public constructor(configuration: Configuration, requestFactory?: VulnerabilityManagementServiceApiRequestFactory, responseProcessor?: VulnerabilityManagementServiceApiResponseProcessor) {
        this.api = new ObservableVulnerabilityManagementServiceApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Summary: Create a vulnerability Description: Create a vulnerability based on request
     * @param param the request object
     */
    public vulnerabilityManagementServiceCreateVulnerabilityWithHttpInfo(param: VulnerabilityManagementServiceApiVulnerabilityManagementServiceCreateVulnerabilityRequest, options?: ConfigurationOptions): Promise<HttpInfo<Vulmanagementv3CreateVulnerabilityResponse>> {
        return this.api.vulnerabilityManagementServiceCreateVulnerabilityWithHttpInfo(param.vulmanagementv3CreateVulnerabilityRequest,  options).toPromise();
    }

    /**
     * Summary: Create a vulnerability Description: Create a vulnerability based on request
     * @param param the request object
     */
    public vulnerabilityManagementServiceCreateVulnerability(param: VulnerabilityManagementServiceApiVulnerabilityManagementServiceCreateVulnerabilityRequest, options?: ConfigurationOptions): Promise<Vulmanagementv3CreateVulnerabilityResponse> {
        return this.api.vulnerabilityManagementServiceCreateVulnerability(param.vulmanagementv3CreateVulnerabilityRequest,  options).toPromise();
    }

    /**
     * Summary: Get filters for vulnerabilities Description: Get a list of filters category and sub category with all data.
     * @param param the request object
     */
    public vulnerabilityManagementServiceGetFiltersForVulnerabilitiesWithHttpInfo(param: VulnerabilityManagementServiceApiVulnerabilityManagementServiceGetFiltersForVulnerabilitiesRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Vulmanagementv3GetFiltersDataResponse>> {
        return this.api.vulnerabilityManagementServiceGetFiltersForVulnerabilitiesWithHttpInfo( options).toPromise();
    }

    /**
     * Summary: Get filters for vulnerabilities Description: Get a list of filters category and sub category with all data.
     * @param param the request object
     */
    public vulnerabilityManagementServiceGetFiltersForVulnerabilities(param: VulnerabilityManagementServiceApiVulnerabilityManagementServiceGetFiltersForVulnerabilitiesRequest = {}, options?: ConfigurationOptions): Promise<Vulmanagementv3GetFiltersDataResponse> {
        return this.api.vulnerabilityManagementServiceGetFiltersForVulnerabilities( options).toPromise();
    }

    /**
     * Summary: Get vulnerabilities Description: Returns a list of vulnerabilities.
     * @param param the request object
     */
    public vulnerabilityManagementServiceGetVulnerabilitiesWithHttpInfo(param: VulnerabilityManagementServiceApiVulnerabilityManagementServiceGetVulnerabilitiesRequest, options?: ConfigurationOptions): Promise<HttpInfo<Vulmanagementv3GetVulnerabilitiesResponse>> {
        return this.api.vulnerabilityManagementServiceGetVulnerabilitiesWithHttpInfo(param.vulmanagementv3GetVulnerabilitiesRequest,  options).toPromise();
    }

    /**
     * Summary: Get vulnerabilities Description: Returns a list of vulnerabilities.
     * @param param the request object
     */
    public vulnerabilityManagementServiceGetVulnerabilities(param: VulnerabilityManagementServiceApiVulnerabilityManagementServiceGetVulnerabilitiesRequest, options?: ConfigurationOptions): Promise<Vulmanagementv3GetVulnerabilitiesResponse> {
        return this.api.vulnerabilityManagementServiceGetVulnerabilities(param.vulmanagementv3GetVulnerabilitiesRequest,  options).toPromise();
    }

    /**
     * Summary: Get vulnerabilities stats Description: Get various vulnerabilities stats.
     * @param param the request object
     */
    public vulnerabilityManagementServiceGetVulnerabilitiesStatsWithHttpInfo(param: VulnerabilityManagementServiceApiVulnerabilityManagementServiceGetVulnerabilitiesStatsRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Vulmanagementv3VulnerabilitiesStatsDataResponse>> {
        return this.api.vulnerabilityManagementServiceGetVulnerabilitiesStatsWithHttpInfo( options).toPromise();
    }

    /**
     * Summary: Get vulnerabilities stats Description: Get various vulnerabilities stats.
     * @param param the request object
     */
    public vulnerabilityManagementServiceGetVulnerabilitiesStats(param: VulnerabilityManagementServiceApiVulnerabilityManagementServiceGetVulnerabilitiesStatsRequest = {}, options?: ConfigurationOptions): Promise<Vulmanagementv3VulnerabilitiesStatsDataResponse> {
        return this.api.vulnerabilityManagementServiceGetVulnerabilitiesStats( options).toPromise();
    }

    /**
     * Summary: Get vulnerability Description: Returns a vulnerability based on vulnerability.
     * @param param the request object
     */
    public vulnerabilityManagementServiceGetVulnerabilityWithHttpInfo(param: VulnerabilityManagementServiceApiVulnerabilityManagementServiceGetVulnerabilityRequest, options?: ConfigurationOptions): Promise<HttpInfo<Vulmanagementv3GetVulnerabilityResponse>> {
        return this.api.vulnerabilityManagementServiceGetVulnerabilityWithHttpInfo(param.vulnerabilityId,  options).toPromise();
    }

    /**
     * Summary: Get vulnerability Description: Returns a vulnerability based on vulnerability.
     * @param param the request object
     */
    public vulnerabilityManagementServiceGetVulnerability(param: VulnerabilityManagementServiceApiVulnerabilityManagementServiceGetVulnerabilityRequest, options?: ConfigurationOptions): Promise<Vulmanagementv3GetVulnerabilityResponse> {
        return this.api.vulnerabilityManagementServiceGetVulnerability(param.vulnerabilityId,  options).toPromise();
    }

    /**
     * Updates comments, assignee, and status for vulnerabilities
     * @param param the request object
     */
    public vulnerabilityManagementServiceUpdateVulnerabilitiesWithHttpInfo(param: VulnerabilityManagementServiceApiVulnerabilityManagementServiceUpdateVulnerabilitiesRequest, options?: ConfigurationOptions): Promise<HttpInfo<Vulmanagementv3UpdateVulnerabilitiesResponse>> {
        return this.api.vulnerabilityManagementServiceUpdateVulnerabilitiesWithHttpInfo(param.vulmanagementv3UpdateVulnerabilitiesRequest,  options).toPromise();
    }

    /**
     * Updates comments, assignee, and status for vulnerabilities
     * @param param the request object
     */
    public vulnerabilityManagementServiceUpdateVulnerabilities(param: VulnerabilityManagementServiceApiVulnerabilityManagementServiceUpdateVulnerabilitiesRequest, options?: ConfigurationOptions): Promise<Vulmanagementv3UpdateVulnerabilitiesResponse> {
        return this.api.vulnerabilityManagementServiceUpdateVulnerabilities(param.vulmanagementv3UpdateVulnerabilitiesRequest,  options).toPromise();
    }

    /**
     * Summary: Vulnerability ingest manual trigger Description: Manual trigger for Scheduled Vulnerability Ingestion.
     * @param param the request object
     */
    public vulnerabilityManagementServiceVulnerabilityIngestionManualTriggerWithHttpInfo(param: VulnerabilityManagementServiceApiVulnerabilityManagementServiceVulnerabilityIngestionManualTriggerRequest, options?: ConfigurationOptions): Promise<HttpInfo<Vulmanagementv3VulnerabilityIngestionResponse>> {
        return this.api.vulnerabilityManagementServiceVulnerabilityIngestionManualTriggerWithHttpInfo(param.body,  options).toPromise();
    }

    /**
     * Summary: Vulnerability ingest manual trigger Description: Manual trigger for Scheduled Vulnerability Ingestion.
     * @param param the request object
     */
    public vulnerabilityManagementServiceVulnerabilityIngestionManualTrigger(param: VulnerabilityManagementServiceApiVulnerabilityManagementServiceVulnerabilityIngestionManualTriggerRequest, options?: ConfigurationOptions): Promise<Vulmanagementv3VulnerabilityIngestionResponse> {
        return this.api.vulnerabilityManagementServiceVulnerabilityIngestionManualTrigger(param.body,  options).toPromise();
    }

}

import { ObservableWorkflowApi } from "./ObservableAPI";
import { WorkflowApiRequestFactory, WorkflowApiResponseProcessor} from "../apis/WorkflowApi";

export interface WorkflowApiWorkflowCreateCaseRequest {
    /**
     * 
     * @type Workflowv3CreateCaseRequest
     * @memberof WorkflowApiworkflowCreateCase
     */
    workflowv3CreateCaseRequest: Workflowv3CreateCaseRequest
}

export interface WorkflowApiWorkflowCreateProductEntityRequest {
    /**
     * 
     * @type Workflowv3ProductEntity
     * @memberof WorkflowApiworkflowCreateProductEntity
     */
    workflowv3ProductEntity: Workflowv3ProductEntity
}

export interface WorkflowApiWorkflowCreateTaskRequest {
    /**
     * Create tasks with common parent.
     * Defaults to: undefined
     * @type string
     * @memberof WorkflowApiworkflowCreateTask
     */
    caseId: string
    /**
     * 
     * @type Workflowv3CreateTaskRequest
     * @memberof WorkflowApiworkflowCreateTask
     */
    workflowv3CreateTaskRequest: Workflowv3CreateTaskRequest
}

export interface WorkflowApiWorkflowCreateWorkflowEventRequest {
    /**
     * 
     * @type Workflowv3WorkflowEvent
     * @memberof WorkflowApiworkflowCreateWorkflowEvent
     */
    workflowv3WorkflowEvent: Workflowv3WorkflowEvent
}

export interface WorkflowApiWorkflowDeleteProductEntityRequest {
    /**
     * Unique id for the product entity
     * Defaults to: undefined
     * @type string
     * @memberof WorkflowApiworkflowDeleteProductEntity
     */
    entityId: string
}

export interface WorkflowApiWorkflowGetCasesRequest {
    /**
     * Optional case_id to get a response of an array of one member.
     * Defaults to: undefined
     * @type string
     * @memberof WorkflowApiworkflowGetCases
     */
    caseId?: string
    /**
     * Optional field to sort by | first character determines ascending (&gt;) or descending (&lt;).
     * Defaults to: undefined
     * @type string
     * @memberof WorkflowApiworkflowGetCases
     */
    sortBy?: string
    /**
     * Optional starting point for the page of data.
     * Defaults to: undefined
     * @type number
     * @memberof WorkflowApiworkflowGetCases
     */
    offset?: number
    /**
     * Optional page size.
     * Defaults to: undefined
     * @type number
     * @memberof WorkflowApiworkflowGetCases
     */
    limit?: number
}

export interface WorkflowApiWorkflowGetCasesCountRequest {
    /**
     * 
     * @type Workflowv3GetCasesCountRequest
     * @memberof WorkflowApiworkflowGetCasesCount
     */
    workflowv3GetCasesCountRequest: Workflowv3GetCasesCountRequest
}

export interface WorkflowApiWorkflowGetFilenameRequest {
    /**
     * Can be \&quot;*\&quot; if JWT token contains the case_id.
     * Defaults to: undefined
     * @type string
     * @memberof WorkflowApiworkflowGetFilename
     */
    caseId: string
    /**
     * Can be \&quot;*\&quot; if JWT token contains the task_id.
     * Defaults to: undefined
     * @type string
     * @memberof WorkflowApiworkflowGetFilename
     */
    taskId: string
}

export interface WorkflowApiWorkflowGetJobsCountRequest {
    /**
     * Case ID - can be * for all
     * Defaults to: undefined
     * @type string
     * @memberof WorkflowApiworkflowGetJobsCount
     */
    caseId: string
    /**
     * 
     * @type Workflowv3GetJobsCountRequest
     * @memberof WorkflowApiworkflowGetJobsCount
     */
    workflowv3GetJobsCountRequest: Workflowv3GetJobsCountRequest
}

export interface WorkflowApiWorkflowGetProductEntitiesRequest {
    /**
     * Optional starting point for the page of data.
     * Defaults to: undefined
     * @type number
     * @memberof WorkflowApiworkflowGetProductEntities
     */
    offset?: number
    /**
     * Optional page size.
     * Defaults to: undefined
     * @type number
     * @memberof WorkflowApiworkflowGetProductEntities
     */
    limit?: number
}

export interface WorkflowApiWorkflowGetProductEntityRequest {
    /**
     * Unique id for the product entity
     * Defaults to: undefined
     * @type string
     * @memberof WorkflowApiworkflowGetProductEntity
     */
    entityId: string
}

export interface WorkflowApiWorkflowGetReportResultRequest {
    /**
     * ID to get the case  (read-only).
     * Defaults to: undefined
     * @type string
     * @memberof WorkflowApiworkflowGetReportResult
     */
    caseId: string
    /**
     * ID to get the task for case(read-only).
     * Defaults to: undefined
     * @type string
     * @memberof WorkflowApiworkflowGetReportResult
     */
    taskId: string
    /**
     * Optional starting point for the page of data.
     * Defaults to: undefined
     * @type number
     * @memberof WorkflowApiworkflowGetReportResult
     */
    offset?: number
    /**
     * Optional page size.
     * Defaults to: undefined
     * @type number
     * @memberof WorkflowApiworkflowGetReportResult
     */
    limit?: number
}

export interface WorkflowApiWorkflowGetTasksRequest {
    /**
     * Mandaroty: The parent case which contains the tasks.
     * Defaults to: undefined
     * @type string
     * @memberof WorkflowApiworkflowGetTasks
     */
    caseId: string
    /**
     * Optional: task_id to return an array of one.
     * Defaults to: undefined
     * @type string
     * @memberof WorkflowApiworkflowGetTasks
     */
    taskId?: string
}

export interface WorkflowApiWorkflowGetTasksCountRequest {
    /**
     * Case ID - can be * for all
     * Defaults to: undefined
     * @type string
     * @memberof WorkflowApiworkflowGetTasksCount
     */
    caseId: string
    /**
     * 
     * @type Workflowv3GetTasksCountRequest
     * @memberof WorkflowApiworkflowGetTasksCount
     */
    workflowv3GetTasksCountRequest: Workflowv3GetTasksCountRequest
}

export interface WorkflowApiWorkflowSearchCasesRequest {
    /**
     * 
     * @type Workflowv3SearchCasesRequest
     * @memberof WorkflowApiworkflowSearchCases
     */
    workflowv3SearchCasesRequest: Workflowv3SearchCasesRequest
}

export interface WorkflowApiWorkflowSearchReportsRequest {
    /**
     * 
     * @type Workflowv3SearchCasesRequest
     * @memberof WorkflowApiworkflowSearchReports
     */
    workflowv3SearchCasesRequest: Workflowv3SearchCasesRequest
}

export interface WorkflowApiWorkflowSearchTasksRequest {
    /**
     * Case ID - can be * for all
     * Defaults to: undefined
     * @type string
     * @memberof WorkflowApiworkflowSearchTasks
     */
    caseId: string
    /**
     * 
     * @type Workflowv3SearchTasksRequest
     * @memberof WorkflowApiworkflowSearchTasks
     */
    workflowv3SearchTasksRequest: Workflowv3SearchTasksRequest
}

export interface WorkflowApiWorkflowUpdateCasesRequest {
    /**
     * 
     * @type Workflowv3UpdateCasesRequest
     * @memberof WorkflowApiworkflowUpdateCases
     */
    workflowv3UpdateCasesRequest: Workflowv3UpdateCasesRequest
}

export interface WorkflowApiWorkflowUpdateProductEntityRequest {
    /**
     * Unique Entity id, required for update.
     * Defaults to: undefined
     * @type string
     * @memberof WorkflowApiworkflowUpdateProductEntity
     */
    entityId: string
    /**
     * 
     * @type Workflowv3UpdateProductEntityRequest
     * @memberof WorkflowApiworkflowUpdateProductEntity
     */
    workflowv3UpdateProductEntityRequest: Workflowv3UpdateProductEntityRequest
}

export interface WorkflowApiWorkflowUpdateTasksRequest {
    /**
     * Update tasks belonging to common parent.
     * Defaults to: undefined
     * @type string
     * @memberof WorkflowApiworkflowUpdateTasks
     */
    caseId: string
    /**
     * 
     * @type Workflowv3UpdateTasksRequest
     * @memberof WorkflowApiworkflowUpdateTasks
     */
    workflowv3UpdateTasksRequest: Workflowv3UpdateTasksRequest
}

export class ObjectWorkflowApi {
    private api: ObservableWorkflowApi

    public constructor(configuration: Configuration, requestFactory?: WorkflowApiRequestFactory, responseProcessor?: WorkflowApiResponseProcessor) {
        this.api = new ObservableWorkflowApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Summary: Create case Description: Create single case.
     * @param param the request object
     */
    public workflowCreateCaseWithHttpInfo(param: WorkflowApiWorkflowCreateCaseRequest, options?: ConfigurationOptions): Promise<HttpInfo<Workflowv3CreateCaseResponse>> {
        return this.api.workflowCreateCaseWithHttpInfo(param.workflowv3CreateCaseRequest,  options).toPromise();
    }

    /**
     * Summary: Create case Description: Create single case.
     * @param param the request object
     */
    public workflowCreateCase(param: WorkflowApiWorkflowCreateCaseRequest, options?: ConfigurationOptions): Promise<Workflowv3CreateCaseResponse> {
        return this.api.workflowCreateCase(param.workflowv3CreateCaseRequest,  options).toPromise();
    }

    /**
     * Summary: Create product entity Description: Create single product entity.
     * @param param the request object
     */
    public workflowCreateProductEntityWithHttpInfo(param: WorkflowApiWorkflowCreateProductEntityRequest, options?: ConfigurationOptions): Promise<HttpInfo<Workflowv3CreateProductEntityResponse>> {
        return this.api.workflowCreateProductEntityWithHttpInfo(param.workflowv3ProductEntity,  options).toPromise();
    }

    /**
     * Summary: Create product entity Description: Create single product entity.
     * @param param the request object
     */
    public workflowCreateProductEntity(param: WorkflowApiWorkflowCreateProductEntityRequest, options?: ConfigurationOptions): Promise<Workflowv3CreateProductEntityResponse> {
        return this.api.workflowCreateProductEntity(param.workflowv3ProductEntity,  options).toPromise();
    }

    /**
     * Summary: Create task Description: Create single task within a parent case.
     * @param param the request object
     */
    public workflowCreateTaskWithHttpInfo(param: WorkflowApiWorkflowCreateTaskRequest, options?: ConfigurationOptions): Promise<HttpInfo<Workflowv3CreateTaskResponse>> {
        return this.api.workflowCreateTaskWithHttpInfo(param.caseId, param.workflowv3CreateTaskRequest,  options).toPromise();
    }

    /**
     * Summary: Create task Description: Create single task within a parent case.
     * @param param the request object
     */
    public workflowCreateTask(param: WorkflowApiWorkflowCreateTaskRequest, options?: ConfigurationOptions): Promise<Workflowv3CreateTaskResponse> {
        return this.api.workflowCreateTask(param.caseId, param.workflowv3CreateTaskRequest,  options).toPromise();
    }

    /**
     * Summary: Post event for processing by workflow rules Description: Find matching workflow rule and run it
     * @param param the request object
     */
    public workflowCreateWorkflowEventWithHttpInfo(param: WorkflowApiWorkflowCreateWorkflowEventRequest, options?: ConfigurationOptions): Promise<HttpInfo<Workflowv3WorkflowEventResponse>> {
        return this.api.workflowCreateWorkflowEventWithHttpInfo(param.workflowv3WorkflowEvent,  options).toPromise();
    }

    /**
     * Summary: Post event for processing by workflow rules Description: Find matching workflow rule and run it
     * @param param the request object
     */
    public workflowCreateWorkflowEvent(param: WorkflowApiWorkflowCreateWorkflowEventRequest, options?: ConfigurationOptions): Promise<Workflowv3WorkflowEventResponse> {
        return this.api.workflowCreateWorkflowEvent(param.workflowv3WorkflowEvent,  options).toPromise();
    }

    /**
     * Summary: Delete a product entity Description: Delete a single product entity.
     * @param param the request object
     */
    public workflowDeleteProductEntityWithHttpInfo(param: WorkflowApiWorkflowDeleteProductEntityRequest, options?: ConfigurationOptions): Promise<HttpInfo<Workflowv3DeleteProductEntityResponse>> {
        return this.api.workflowDeleteProductEntityWithHttpInfo(param.entityId,  options).toPromise();
    }

    /**
     * Summary: Delete a product entity Description: Delete a single product entity.
     * @param param the request object
     */
    public workflowDeleteProductEntity(param: WorkflowApiWorkflowDeleteProductEntityRequest, options?: ConfigurationOptions): Promise<Workflowv3DeleteProductEntityResponse> {
        return this.api.workflowDeleteProductEntity(param.entityId,  options).toPromise();
    }

    /**
     * Summary: Get cases Description: Return all cases requested.
     * @param param the request object
     */
    public workflowGetCasesWithHttpInfo(param: WorkflowApiWorkflowGetCasesRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Workflowv3CaseListResponse>> {
        return this.api.workflowGetCasesWithHttpInfo(param.caseId, param.sortBy, param.offset, param.limit,  options).toPromise();
    }

    /**
     * Summary: Get cases Description: Return all cases requested.
     * @param param the request object
     */
    public workflowGetCases(param: WorkflowApiWorkflowGetCasesRequest = {}, options?: ConfigurationOptions): Promise<Workflowv3CaseListResponse> {
        return this.api.workflowGetCases(param.caseId, param.sortBy, param.offset, param.limit,  options).toPromise();
    }

    /**
     * Summary: Get cases count Description: Get case count.
     * @param param the request object
     */
    public workflowGetCasesCountWithHttpInfo(param: WorkflowApiWorkflowGetCasesCountRequest, options?: ConfigurationOptions): Promise<HttpInfo<Workflowv3GetCasesCountResponse>> {
        return this.api.workflowGetCasesCountWithHttpInfo(param.workflowv3GetCasesCountRequest,  options).toPromise();
    }

    /**
     * Summary: Get cases count Description: Get case count.
     * @param param the request object
     */
    public workflowGetCasesCount(param: WorkflowApiWorkflowGetCasesCountRequest, options?: ConfigurationOptions): Promise<Workflowv3GetCasesCountResponse> {
        return this.api.workflowGetCasesCount(param.workflowv3GetCasesCountRequest,  options).toPromise();
    }

    /**
     * Summary: Get filename Description: Return filename associated with the task referenced in the associated context record.
     * @param param the request object
     */
    public workflowGetFilenameWithHttpInfo(param: WorkflowApiWorkflowGetFilenameRequest, options?: ConfigurationOptions): Promise<HttpInfo<Workflowv3GetFilenameResponse>> {
        return this.api.workflowGetFilenameWithHttpInfo(param.caseId, param.taskId,  options).toPromise();
    }

    /**
     * Summary: Get filename Description: Return filename associated with the task referenced in the associated context record.
     * @param param the request object
     */
    public workflowGetFilename(param: WorkflowApiWorkflowGetFilenameRequest, options?: ConfigurationOptions): Promise<Workflowv3GetFilenameResponse> {
        return this.api.workflowGetFilename(param.caseId, param.taskId,  options).toPromise();
    }

    /**
     * Summary: Get jobs count Description: Get jobs count.
     * @param param the request object
     */
    public workflowGetJobsCountWithHttpInfo(param: WorkflowApiWorkflowGetJobsCountRequest, options?: ConfigurationOptions): Promise<HttpInfo<Workflowv3GetJobsCountResponse>> {
        return this.api.workflowGetJobsCountWithHttpInfo(param.caseId, param.workflowv3GetJobsCountRequest,  options).toPromise();
    }

    /**
     * Summary: Get jobs count Description: Get jobs count.
     * @param param the request object
     */
    public workflowGetJobsCount(param: WorkflowApiWorkflowGetJobsCountRequest, options?: ConfigurationOptions): Promise<Workflowv3GetJobsCountResponse> {
        return this.api.workflowGetJobsCount(param.caseId, param.workflowv3GetJobsCountRequest,  options).toPromise();
    }

    /**
     * Summary: Get products and their associated event entities Description: Return a list of integrated products and their associated event entities
     * @param param the request object
     */
    public workflowGetProductEntitiesWithHttpInfo(param: WorkflowApiWorkflowGetProductEntitiesRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<Workflowv3GetProductEntitiesResponse>> {
        return this.api.workflowGetProductEntitiesWithHttpInfo(param.offset, param.limit,  options).toPromise();
    }

    /**
     * Summary: Get products and their associated event entities Description: Return a list of integrated products and their associated event entities
     * @param param the request object
     */
    public workflowGetProductEntities(param: WorkflowApiWorkflowGetProductEntitiesRequest = {}, options?: ConfigurationOptions): Promise<Workflowv3GetProductEntitiesResponse> {
        return this.api.workflowGetProductEntities(param.offset, param.limit,  options).toPromise();
    }

    /**
     * Summary: Get event entity field names, field labels, and field data types Description: Return a list of fields similar to report headers
     * @param param the request object
     */
    public workflowGetProductEntityWithHttpInfo(param: WorkflowApiWorkflowGetProductEntityRequest, options?: ConfigurationOptions): Promise<HttpInfo<Workflowv3ProductEntity>> {
        return this.api.workflowGetProductEntityWithHttpInfo(param.entityId,  options).toPromise();
    }

    /**
     * Summary: Get event entity field names, field labels, and field data types Description: Return a list of fields similar to report headers
     * @param param the request object
     */
    public workflowGetProductEntity(param: WorkflowApiWorkflowGetProductEntityRequest, options?: ConfigurationOptions): Promise<Workflowv3ProductEntity> {
        return this.api.workflowGetProductEntity(param.entityId,  options).toPromise();
    }

    /**
     * Summary: Get report result Description: Return a page of results.
     * @param param the request object
     */
    public workflowGetReportResultWithHttpInfo(param: WorkflowApiWorkflowGetReportResultRequest, options?: ConfigurationOptions): Promise<HttpInfo<Workflowv3GetReportResultResponse>> {
        return this.api.workflowGetReportResultWithHttpInfo(param.caseId, param.taskId, param.offset, param.limit,  options).toPromise();
    }

    /**
     * Summary: Get report result Description: Return a page of results.
     * @param param the request object
     */
    public workflowGetReportResult(param: WorkflowApiWorkflowGetReportResultRequest, options?: ConfigurationOptions): Promise<Workflowv3GetReportResultResponse> {
        return this.api.workflowGetReportResult(param.caseId, param.taskId, param.offset, param.limit,  options).toPromise();
    }

    /**
     * Summary: Get tasks Description: Return all tasks requested.
     * @param param the request object
     */
    public workflowGetTasksWithHttpInfo(param: WorkflowApiWorkflowGetTasksRequest, options?: ConfigurationOptions): Promise<HttpInfo<Workflowv3TaskListResponse>> {
        return this.api.workflowGetTasksWithHttpInfo(param.caseId, param.taskId,  options).toPromise();
    }

    /**
     * Summary: Get tasks Description: Return all tasks requested.
     * @param param the request object
     */
    public workflowGetTasks(param: WorkflowApiWorkflowGetTasksRequest, options?: ConfigurationOptions): Promise<Workflowv3TaskListResponse> {
        return this.api.workflowGetTasks(param.caseId, param.taskId,  options).toPromise();
    }

    /**
     * Summary: Get cases count Description: Get case count.
     * @param param the request object
     */
    public workflowGetTasksCountWithHttpInfo(param: WorkflowApiWorkflowGetTasksCountRequest, options?: ConfigurationOptions): Promise<HttpInfo<Workflowv3GetTasksCountResponse>> {
        return this.api.workflowGetTasksCountWithHttpInfo(param.caseId, param.workflowv3GetTasksCountRequest,  options).toPromise();
    }

    /**
     * Summary: Get cases count Description: Get case count.
     * @param param the request object
     */
    public workflowGetTasksCount(param: WorkflowApiWorkflowGetTasksCountRequest, options?: ConfigurationOptions): Promise<Workflowv3GetTasksCountResponse> {
        return this.api.workflowGetTasksCount(param.caseId, param.workflowv3GetTasksCountRequest,  options).toPromise();
    }

    /**
     * Summary: Search cases Description: Return a subset of cases.
     * @param param the request object
     */
    public workflowSearchCasesWithHttpInfo(param: WorkflowApiWorkflowSearchCasesRequest, options?: ConfigurationOptions): Promise<HttpInfo<Workflowv3CaseListResponse>> {
        return this.api.workflowSearchCasesWithHttpInfo(param.workflowv3SearchCasesRequest,  options).toPromise();
    }

    /**
     * Summary: Search cases Description: Return a subset of cases.
     * @param param the request object
     */
    public workflowSearchCases(param: WorkflowApiWorkflowSearchCasesRequest, options?: ConfigurationOptions): Promise<Workflowv3CaseListResponse> {
        return this.api.workflowSearchCases(param.workflowv3SearchCasesRequest,  options).toPromise();
    }

    /**
     * Summary: Get a list of report IDs Description: Returns a list of report IDs referenced in all cases and tasks
     * @param param the request object
     */
    public workflowSearchReportsWithHttpInfo(param: WorkflowApiWorkflowSearchReportsRequest, options?: ConfigurationOptions): Promise<HttpInfo<Workflowv3SearchReportsResponse>> {
        return this.api.workflowSearchReportsWithHttpInfo(param.workflowv3SearchCasesRequest,  options).toPromise();
    }

    /**
     * Summary: Get a list of report IDs Description: Returns a list of report IDs referenced in all cases and tasks
     * @param param the request object
     */
    public workflowSearchReports(param: WorkflowApiWorkflowSearchReportsRequest, options?: ConfigurationOptions): Promise<Workflowv3SearchReportsResponse> {
        return this.api.workflowSearchReports(param.workflowv3SearchCasesRequest,  options).toPromise();
    }

    /**
     * Summary: Search cases Description: Return a subset of cases.
     * @param param the request object
     */
    public workflowSearchTasksWithHttpInfo(param: WorkflowApiWorkflowSearchTasksRequest, options?: ConfigurationOptions): Promise<HttpInfo<Workflowv3TaskListResponse>> {
        return this.api.workflowSearchTasksWithHttpInfo(param.caseId, param.workflowv3SearchTasksRequest,  options).toPromise();
    }

    /**
     * Summary: Search cases Description: Return a subset of cases.
     * @param param the request object
     */
    public workflowSearchTasks(param: WorkflowApiWorkflowSearchTasksRequest, options?: ConfigurationOptions): Promise<Workflowv3TaskListResponse> {
        return this.api.workflowSearchTasks(param.caseId, param.workflowv3SearchTasksRequest,  options).toPromise();
    }

    /**
     * Summary: Update cases Description: Update multiple cases in one request.
     * @param param the request object
     */
    public workflowUpdateCasesWithHttpInfo(param: WorkflowApiWorkflowUpdateCasesRequest, options?: ConfigurationOptions): Promise<HttpInfo<Workflowv3UpdateCasesResponse>> {
        return this.api.workflowUpdateCasesWithHttpInfo(param.workflowv3UpdateCasesRequest,  options).toPromise();
    }

    /**
     * Summary: Update cases Description: Update multiple cases in one request.
     * @param param the request object
     */
    public workflowUpdateCases(param: WorkflowApiWorkflowUpdateCasesRequest, options?: ConfigurationOptions): Promise<Workflowv3UpdateCasesResponse> {
        return this.api.workflowUpdateCases(param.workflowv3UpdateCasesRequest,  options).toPromise();
    }

    /**
     * Summary: Update a product entity Description: Update a single product entity.
     * @param param the request object
     */
    public workflowUpdateProductEntityWithHttpInfo(param: WorkflowApiWorkflowUpdateProductEntityRequest, options?: ConfigurationOptions): Promise<HttpInfo<Workflowv3UpdateProductEntityResponse>> {
        return this.api.workflowUpdateProductEntityWithHttpInfo(param.entityId, param.workflowv3UpdateProductEntityRequest,  options).toPromise();
    }

    /**
     * Summary: Update a product entity Description: Update a single product entity.
     * @param param the request object
     */
    public workflowUpdateProductEntity(param: WorkflowApiWorkflowUpdateProductEntityRequest, options?: ConfigurationOptions): Promise<Workflowv3UpdateProductEntityResponse> {
        return this.api.workflowUpdateProductEntity(param.entityId, param.workflowv3UpdateProductEntityRequest,  options).toPromise();
    }

    /**
     * Summary: Update tasks Description: Update multiple tasks for the same parent in one request.
     * @param param the request object
     */
    public workflowUpdateTasksWithHttpInfo(param: WorkflowApiWorkflowUpdateTasksRequest, options?: ConfigurationOptions): Promise<HttpInfo<Workflowv3UpdateTasksResponse>> {
        return this.api.workflowUpdateTasksWithHttpInfo(param.caseId, param.workflowv3UpdateTasksRequest,  options).toPromise();
    }

    /**
     * Summary: Update tasks Description: Update multiple tasks for the same parent in one request.
     * @param param the request object
     */
    public workflowUpdateTasks(param: WorkflowApiWorkflowUpdateTasksRequest, options?: ConfigurationOptions): Promise<Workflowv3UpdateTasksResponse> {
        return this.api.workflowUpdateTasks(param.caseId, param.workflowv3UpdateTasksRequest,  options).toPromise();
    }

}
