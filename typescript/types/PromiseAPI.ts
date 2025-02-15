import { ResponseContext, RequestContext, HttpFile, HttpInfo } from '../http/http';
import { Configuration} from '../configuration'

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
import { Analyticseventsv3DeleteCacheKeyRequest } from '../models/Analyticseventsv3DeleteCacheKeyRequest';
import { Analyticseventsv3DeleteCacheKeyResponse } from '../models/Analyticseventsv3DeleteCacheKeyResponse';
import { Analyticseventsv3PostQSAdvisorRiskRequest } from '../models/Analyticseventsv3PostQSAdvisorRiskRequest';
import { Analyticseventsv3PostQSAdvisorRiskResponse } from '../models/Analyticseventsv3PostQSAdvisorRiskResponse';
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
import { Assetsv3AssetFilterTemplateRequest } from '../models/Assetsv3AssetFilterTemplateRequest';
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
import { Assetsv3Category } from '../models/Assetsv3Category';
import { Assetsv3ChildCategory } from '../models/Assetsv3ChildCategory';
import { Assetsv3ClassificationData } from '../models/Assetsv3ClassificationData';
import { Assetsv3ClassificationScanStatus } from '../models/Assetsv3ClassificationScanStatus';
import { Assetsv3ClonePolicyRequest } from '../models/Assetsv3ClonePolicyRequest';
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
import { ClassificationStatus } from '../models/ClassificationStatus';
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
import { Complianceacceleratorv3GroupMember } from '../models/Complianceacceleratorv3GroupMember';
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
import { Jumpboxv3DirectoryEntry } from '../models/Jumpboxv3DirectoryEntry';
import { Jumpboxv3DisableUsersBulkResponse } from '../models/Jumpboxv3DisableUsersBulkResponse';
import { Jumpboxv3GetTenantResponse } from '../models/Jumpboxv3GetTenantResponse';
import { Jumpboxv3GetTenantsResponse } from '../models/Jumpboxv3GetTenantsResponse';
import { Jumpboxv3PostTenantsRequest } from '../models/Jumpboxv3PostTenantsRequest';
import { Jumpboxv3PostTenantsResponse } from '../models/Jumpboxv3PostTenantsResponse';
import { Jumpboxv3PostUsersBulkRequest } from '../models/Jumpboxv3PostUsersBulkRequest';
import { Jumpboxv3PostUsersBulkResponse } from '../models/Jumpboxv3PostUsersBulkResponse';
import { Jumpboxv3SearchUsersRequest } from '../models/Jumpboxv3SearchUsersRequest';
import { Jumpboxv3SearchUsersResponse } from '../models/Jumpboxv3SearchUsersResponse';
import { Jumpboxv3Tenant } from '../models/Jumpboxv3Tenant';
import { Jumpboxv3TestUserRequest } from '../models/Jumpboxv3TestUserRequest';
import { Jumpboxv3TestUserResponse } from '../models/Jumpboxv3TestUserResponse';
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
import { Notificationsv3PutNotificationRecordResponse } from '../models/Notificationsv3PutNotificationRecordResponse';
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
import { Policybuilderv3ClonePolicyRequest } from '../models/Policybuilderv3ClonePolicyRequest';
import { Policybuilderv3ControlFlow } from '../models/Policybuilderv3ControlFlow';
import { Policybuilderv3CreateUpdatePolicyRequest } from '../models/Policybuilderv3CreateUpdatePolicyRequest';
import { Policybuilderv3CreateUpdatePolicyResponse } from '../models/Policybuilderv3CreateUpdatePolicyResponse';
import { Policybuilderv3DeleteGdpPolicySyncResponse } from '../models/Policybuilderv3DeleteGdpPolicySyncResponse';
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
import { Qspmdatamanagerv3AppData } from '../models/Qspmdatamanagerv3AppData';
import { Qspmdatamanagerv3AppDataResponse } from '../models/Qspmdatamanagerv3AppDataResponse';
import { Qspmdatamanagerv3MasterDataModel } from '../models/Qspmdatamanagerv3MasterDataModel';
import { Qspmdatamanagerv3MasterDataResponse } from '../models/Qspmdatamanagerv3MasterDataResponse';
import { Qspmdatamanagerv3NetlocData } from '../models/Qspmdatamanagerv3NetlocData';
import { Qspmdatamanagerv3NetlocDataResponse } from '../models/Qspmdatamanagerv3NetlocDataResponse';
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
import { Qspmpolicymanagerv3CreateTicketRequest } from '../models/Qspmpolicymanagerv3CreateTicketRequest';
import { Qspmpolicymanagerv3CreateTicketResponse } from '../models/Qspmpolicymanagerv3CreateTicketResponse';
import { Qspmpolicymanagerv3FetchObjectStoreFileResponse } from '../models/Qspmpolicymanagerv3FetchObjectStoreFileResponse';
import { Qspmpolicymanagerv3NotificationSeverity } from '../models/Qspmpolicymanagerv3NotificationSeverity';
import { Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest } from '../models/Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest';
import { Qspmpolicymanagerv3ProcessPolicyDimentionRecordsResonse } from '../models/Qspmpolicymanagerv3ProcessPolicyDimentionRecordsResonse';
import { Qspmpolicymanagerv3StandardEmptyResponse } from '../models/Qspmpolicymanagerv3StandardEmptyResponse';
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
import { Reportsv3CreateCategoryRequest } from '../models/Reportsv3CreateCategoryRequest';
import { Reportsv3CreateCategoryResponse } from '../models/Reportsv3CreateCategoryResponse';
import { Reportsv3CreateChartRequest } from '../models/Reportsv3CreateChartRequest';
import { Reportsv3CreateChartResponse } from '../models/Reportsv3CreateChartResponse';
import { Reportsv3CreateChartTemplatev2Request } from '../models/Reportsv3CreateChartTemplatev2Request';
import { Reportsv3CreateChartTemplatev2Response } from '../models/Reportsv3CreateChartTemplatev2Response';
import { Reportsv3CreateChartv2Request } from '../models/Reportsv3CreateChartv2Request';
import { Reportsv3CreateChartv2Response } from '../models/Reportsv3CreateChartv2Response';
import { Reportsv3CreateFieldsByCategoryRequest } from '../models/Reportsv3CreateFieldsByCategoryRequest';
import { Reportsv3CreateFieldsByCategoryResponse } from '../models/Reportsv3CreateFieldsByCategoryResponse';
import { Reportsv3CreateJoinRequest } from '../models/Reportsv3CreateJoinRequest';
import { Reportsv3CreateJoinResponse } from '../models/Reportsv3CreateJoinResponse';
import { Reportsv3CreateReportRequest } from '../models/Reportsv3CreateReportRequest';
import { Reportsv3CreateReportResponse } from '../models/Reportsv3CreateReportResponse';
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
import { Reportsv3DeleteFieldsByCategoryResponse } from '../models/Reportsv3DeleteFieldsByCategoryResponse';
import { Reportsv3DeleteJoinResponse } from '../models/Reportsv3DeleteJoinResponse';
import { Reportsv3DeleteReportResponse } from '../models/Reportsv3DeleteReportResponse';
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
import { Reportsv3GetFieldsByCategoriesResponse } from '../models/Reportsv3GetFieldsByCategoriesResponse';
import { Reportsv3GetFieldsByCategoryResponse } from '../models/Reportsv3GetFieldsByCategoryResponse';
import { Reportsv3GetJoinsResponse } from '../models/Reportsv3GetJoinsResponse';
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
import { Reportsv3GetVariantResponse } from '../models/Reportsv3GetVariantResponse';
import { Reportsv3GetVariantsResponse } from '../models/Reportsv3GetVariantsResponse';
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
import { Reportsv3ModelType } from '../models/Reportsv3ModelType';
import { Reportsv3OperatorType } from '../models/Reportsv3OperatorType';
import { Reportsv3OptionType } from '../models/Reportsv3OptionType';
import { Reportsv3OrderBy } from '../models/Reportsv3OrderBy';
import { Reportsv3ParameterType } from '../models/Reportsv3ParameterType';
import { Reportsv3PartialChartUpdateRequest } from '../models/Reportsv3PartialChartUpdateRequest';
import { Reportsv3PartialChartUpdateResponse } from '../models/Reportsv3PartialChartUpdateResponse';
import { Reportsv3PartialReportUpdateRequest } from '../models/Reportsv3PartialReportUpdateRequest';
import { Reportsv3PartialReportUpdateResponse } from '../models/Reportsv3PartialReportUpdateResponse';
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
import { Reportsv3UpdateJoinRequest } from '../models/Reportsv3UpdateJoinRequest';
import { Reportsv3UpdateJoinResponse } from '../models/Reportsv3UpdateJoinResponse';
import { Reportsv3UpdateReportRequest } from '../models/Reportsv3UpdateReportRequest';
import { Reportsv3UpdateReportResponse } from '../models/Reportsv3UpdateReportResponse';
import { Reportsv3UpdateVariantOverrideRequest } from '../models/Reportsv3UpdateVariantOverrideRequest';
import { Reportsv3UpdateVariantOverrideResponse } from '../models/Reportsv3UpdateVariantOverrideResponse';
import { Reportsv3Variant } from '../models/Reportsv3Variant';
import { Reportsv3VariantDetails } from '../models/Reportsv3VariantDetails';
import { Reportsv3VariantRule } from '../models/Reportsv3VariantRule';
import { Reportsv3VariantRuleCondition } from '../models/Reportsv3VariantRuleCondition';
import { Reportsv3VariantRuleType } from '../models/Reportsv3VariantRuleType';
import { RescanDataStoreRequest } from '../models/RescanDataStoreRequest';
import { ResetPasswordRequest } from '../models/ResetPasswordRequest';
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
import { SimpleRecipientSimpleRecipientType } from '../models/SimpleRecipientSimpleRecipientType';
import { Snifassistv3SnifAssistResponse } from '../models/Snifassistv3SnifAssistResponse';
import { Snifassistv3SnifAssistType } from '../models/Snifassistv3SnifAssistType';
import { Snifassistv3StapConfig } from '../models/Snifassistv3StapConfig';
import { Snifassistv3StapHeartBeat } from '../models/Snifassistv3StapHeartBeat';
import { Snifassistv3StapOperation } from '../models/Snifassistv3StapOperation';
import { Snifassistv3StatusResponseBase } from '../models/Snifassistv3StatusResponseBase';
import { Snifassistv3TestRegexRequest } from '../models/Snifassistv3TestRegexRequest';
import { SortOrder } from '../models/SortOrder';
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
import { Templatesv3CreateIntegrationRequest } from '../models/Templatesv3CreateIntegrationRequest';
import { Templatesv3CreateIntegrationResponse } from '../models/Templatesv3CreateIntegrationResponse';
import { Templatesv3CreateTemplateRequest } from '../models/Templatesv3CreateTemplateRequest';
import { Templatesv3CreateTemplateResponse } from '../models/Templatesv3CreateTemplateResponse';
import { Templatesv3DefaultContent } from '../models/Templatesv3DefaultContent';
import { Templatesv3DeleteIntegrationResponse } from '../models/Templatesv3DeleteIntegrationResponse';
import { Templatesv3DeleteTemplateResponse } from '../models/Templatesv3DeleteTemplateResponse';
import { Templatesv3GetOriginDefaultContentResponse } from '../models/Templatesv3GetOriginDefaultContentResponse';
import { Templatesv3GetOriginFieldsResponse } from '../models/Templatesv3GetOriginFieldsResponse';
import { Templatesv3GetTemplateResponse } from '../models/Templatesv3GetTemplateResponse';
import { Templatesv3GetTemplatesResponse } from '../models/Templatesv3GetTemplatesResponse';
import { Templatesv3Integration } from '../models/Templatesv3Integration';
import { Templatesv3MIMEType } from '../models/Templatesv3MIMEType';
import { Templatesv3Origin } from '../models/Templatesv3Origin';
import { Templatesv3SimpleRecipient } from '../models/Templatesv3SimpleRecipient';
import { Templatesv3Template } from '../models/Templatesv3Template';
import { Templatesv3TestTemplateRequest } from '../models/Templatesv3TestTemplateRequest';
import { Templatesv3TestTemplateResponse } from '../models/Templatesv3TestTemplateResponse';
import { Templatesv3TransformTemplateJSONRequest } from '../models/Templatesv3TransformTemplateJSONRequest';
import { Templatesv3TransformTemplateJSONResponse } from '../models/Templatesv3TransformTemplateJSONResponse';
import { Templatesv3TransformTemplateRequest } from '../models/Templatesv3TransformTemplateRequest';
import { Templatesv3TransformTemplateResponse } from '../models/Templatesv3TransformTemplateResponse';
import { Templatesv3UpdateTemplateRequest } from '../models/Templatesv3UpdateTemplateRequest';
import { Templatesv3UpdateTemplateResponse } from '../models/Templatesv3UpdateTemplateResponse';
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
import { Workflowv3CreateTaskRequest } from '../models/Workflowv3CreateTaskRequest';
import { Workflowv3CreateTaskResponse } from '../models/Workflowv3CreateTaskResponse';
import { Workflowv3DeleteCasesResponse } from '../models/Workflowv3DeleteCasesResponse';
import { Workflowv3DeleteTasksResponse } from '../models/Workflowv3DeleteTasksResponse';
import { Workflowv3Entity } from '../models/Workflowv3Entity';
import { Workflowv3EntityType } from '../models/Workflowv3EntityType';
import { Workflowv3Filter } from '../models/Workflowv3Filter';
import { Workflowv3FilterColumn } from '../models/Workflowv3FilterColumn';
import { Workflowv3FilterOperator } from '../models/Workflowv3FilterOperator';
import { Workflowv3GetCasesCountRequest } from '../models/Workflowv3GetCasesCountRequest';
import { Workflowv3GetCasesCountResponse } from '../models/Workflowv3GetCasesCountResponse';
import { Workflowv3GetFilenameResponse } from '../models/Workflowv3GetFilenameResponse';
import { Workflowv3GetJobsCountRequest } from '../models/Workflowv3GetJobsCountRequest';
import { Workflowv3GetJobsCountResponse } from '../models/Workflowv3GetJobsCountResponse';
import { Workflowv3GetReportResultResponse } from '../models/Workflowv3GetReportResultResponse';
import { Workflowv3GetTasksCountRequest } from '../models/Workflowv3GetTasksCountRequest';
import { Workflowv3GetTasksCountResponse } from '../models/Workflowv3GetTasksCountResponse';
import { Workflowv3JobCount } from '../models/Workflowv3JobCount';
import { Workflowv3OperatorType } from '../models/Workflowv3OperatorType';
import { Workflowv3Origin } from '../models/Workflowv3Origin';
import { Workflowv3Priority } from '../models/Workflowv3Priority';
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
import { Workflowv3UpdateTasksRequest } from '../models/Workflowv3UpdateTasksRequest';
import { Workflowv3UpdateTasksResponse } from '../models/Workflowv3UpdateTasksResponse';
import { ObservableAnalyticsEventsServiceApi } from './ObservableAPI';

import { AnalyticsEventsServiceApiRequestFactory, AnalyticsEventsServiceApiResponseProcessor} from "../apis/AnalyticsEventsServiceApi";
export class PromiseAnalyticsEventsServiceApi {
    private api: ObservableAnalyticsEventsServiceApi

    public constructor(
        configuration: Configuration,
        requestFactory?: AnalyticsEventsServiceApiRequestFactory,
        responseProcessor?: AnalyticsEventsServiceApiResponseProcessor
    ) {
        this.api = new ObservableAnalyticsEventsServiceApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Summary: Delete cache key Description: Return delete key result message.
     * @param cacheKey The cache key to delete.
     * @param analyticseventsv3DeleteCacheKeyRequest 
     */
    public analyticsEventsServiceDeleteCacheKeyWithHttpInfo(cacheKey: string, analyticseventsv3DeleteCacheKeyRequest: Analyticseventsv3DeleteCacheKeyRequest, _options?: Configuration): Promise<HttpInfo<Analyticseventsv3DeleteCacheKeyResponse>> {
        const result = this.api.analyticsEventsServiceDeleteCacheKeyWithHttpInfo(cacheKey, analyticseventsv3DeleteCacheKeyRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Delete cache key Description: Return delete key result message.
     * @param cacheKey The cache key to delete.
     * @param analyticseventsv3DeleteCacheKeyRequest 
     */
    public analyticsEventsServiceDeleteCacheKey(cacheKey: string, analyticseventsv3DeleteCacheKeyRequest: Analyticseventsv3DeleteCacheKeyRequest, _options?: Configuration): Promise<Analyticseventsv3DeleteCacheKeyResponse> {
        const result = this.api.analyticsEventsServiceDeleteCacheKey(cacheKey, analyticseventsv3DeleteCacheKeyRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: For QS Advisor risk notification only Description: Sends QS Advisor risk notification with recipients and returns a status
     * @param analyticseventsv3PostQSAdvisorRiskRequest 
     */
    public analyticsEventsServicePostQSAdvisorRiskWithHttpInfo(analyticseventsv3PostQSAdvisorRiskRequest: Analyticseventsv3PostQSAdvisorRiskRequest, _options?: Configuration): Promise<HttpInfo<Analyticseventsv3PostQSAdvisorRiskResponse>> {
        const result = this.api.analyticsEventsServicePostQSAdvisorRiskWithHttpInfo(analyticseventsv3PostQSAdvisorRiskRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: For QS Advisor risk notification only Description: Sends QS Advisor risk notification with recipients and returns a status
     * @param analyticseventsv3PostQSAdvisorRiskRequest 
     */
    public analyticsEventsServicePostQSAdvisorRisk(analyticseventsv3PostQSAdvisorRiskRequest: Analyticseventsv3PostQSAdvisorRiskRequest, _options?: Configuration): Promise<Analyticseventsv3PostQSAdvisorRiskResponse> {
        const result = this.api.analyticsEventsServicePostQSAdvisorRisk(analyticseventsv3PostQSAdvisorRiskRequest, _options);
        return result.toPromise();
    }


}



import { ObservableAssetsServiceApi } from './ObservableAPI';

import { AssetsServiceApiRequestFactory, AssetsServiceApiResponseProcessor} from "../apis/AssetsServiceApi";
export class PromiseAssetsServiceApi {
    private api: ObservableAssetsServiceApi

    public constructor(
        configuration: Configuration,
        requestFactory?: AssetsServiceApiRequestFactory,
        responseProcessor?: AssetsServiceApiResponseProcessor
    ) {
        this.api = new ObservableAssetsServiceApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * AssetIngestion - Asset Ingestion Api to ingest assets from different applications including asset extensibility assets.
     * @param assetsv3AssetIngestionRequest 
     */
    public assetsServiceAssetIngestionWithHttpInfo(assetsv3AssetIngestionRequest: Assetsv3AssetIngestionRequest, _options?: Configuration): Promise<HttpInfo<Assetsv3AssetIngestionResponse>> {
        const result = this.api.assetsServiceAssetIngestionWithHttpInfo(assetsv3AssetIngestionRequest, _options);
        return result.toPromise();
    }

    /**
     * AssetIngestion - Asset Ingestion Api to ingest assets from different applications including asset extensibility assets.
     * @param assetsv3AssetIngestionRequest 
     */
    public assetsServiceAssetIngestion(assetsv3AssetIngestionRequest: Assetsv3AssetIngestionRequest, _options?: Configuration): Promise<Assetsv3AssetIngestionResponse> {
        const result = this.api.assetsServiceAssetIngestion(assetsv3AssetIngestionRequest, _options);
        return result.toPromise();
    }

    /**
     * AssetIngestionManualTrigger - Manual trigger for Scheduled Asset Ingestion of databases.
     * @param body 
     */
    public assetsServiceAssetIngestionManualTriggerWithHttpInfo(body: any, _options?: Configuration): Promise<HttpInfo<Assetsv3AssetIngestionResponse>> {
        const result = this.api.assetsServiceAssetIngestionManualTriggerWithHttpInfo(body, _options);
        return result.toPromise();
    }

    /**
     * AssetIngestionManualTrigger - Manual trigger for Scheduled Asset Ingestion of databases.
     * @param body 
     */
    public assetsServiceAssetIngestionManualTrigger(body: any, _options?: Configuration): Promise<Assetsv3AssetIngestionResponse> {
        const result = this.api.assetsServiceAssetIngestionManualTrigger(body, _options);
        return result.toPromise();
    }

    /**
     * ClonePolicy - Clone a policy.
     * @param policyId Policy id that needs to be cloned.
     * @param assetsv3ClonePolicyRequest 
     */
    public assetsServiceClonePolicyWithHttpInfo(policyId: string, assetsv3ClonePolicyRequest: Assetsv3ClonePolicyRequest, _options?: Configuration): Promise<HttpInfo<any>> {
        const result = this.api.assetsServiceClonePolicyWithHttpInfo(policyId, assetsv3ClonePolicyRequest, _options);
        return result.toPromise();
    }

    /**
     * ClonePolicy - Clone a policy.
     * @param policyId Policy id that needs to be cloned.
     * @param assetsv3ClonePolicyRequest 
     */
    public assetsServiceClonePolicy(policyId: string, assetsv3ClonePolicyRequest: Assetsv3ClonePolicyRequest, _options?: Configuration): Promise<any> {
        const result = this.api.assetsServiceClonePolicy(policyId, assetsv3ClonePolicyRequest, _options);
        return result.toPromise();
    }

    /**
     * CreateUpdatePolicy - Create/update new Policy.
     * @param assetsv3CreateUpdatePolicyRequest 
     */
    public assetsServiceCreateUpdatePolicyWithHttpInfo(assetsv3CreateUpdatePolicyRequest: Assetsv3CreateUpdatePolicyRequest, _options?: Configuration): Promise<HttpInfo<Assetsv3CreateUpdatePolicyResponse>> {
        const result = this.api.assetsServiceCreateUpdatePolicyWithHttpInfo(assetsv3CreateUpdatePolicyRequest, _options);
        return result.toPromise();
    }

    /**
     * CreateUpdatePolicy - Create/update new Policy.
     * @param assetsv3CreateUpdatePolicyRequest 
     */
    public assetsServiceCreateUpdatePolicy(assetsv3CreateUpdatePolicyRequest: Assetsv3CreateUpdatePolicyRequest, _options?: Configuration): Promise<Assetsv3CreateUpdatePolicyResponse> {
        const result = this.api.assetsServiceCreateUpdatePolicy(assetsv3CreateUpdatePolicyRequest, _options);
        return result.toPromise();
    }

    /**
     * DeleteFilterTemplateForAssets - Deleting a template using TemplateID in manage assets.
     * @param templateId template id to be deleted
     * @param assetsv3AssetFilterTemplateRequest 
     */
    public assetsServiceDeleteFilterTemplateForAssetsWithHttpInfo(templateId: string, assetsv3AssetFilterTemplateRequest: Assetsv3AssetFilterTemplateRequest, _options?: Configuration): Promise<HttpInfo<any>> {
        const result = this.api.assetsServiceDeleteFilterTemplateForAssetsWithHttpInfo(templateId, assetsv3AssetFilterTemplateRequest, _options);
        return result.toPromise();
    }

    /**
     * DeleteFilterTemplateForAssets - Deleting a template using TemplateID in manage assets.
     * @param templateId template id to be deleted
     * @param assetsv3AssetFilterTemplateRequest 
     */
    public assetsServiceDeleteFilterTemplateForAssets(templateId: string, assetsv3AssetFilterTemplateRequest: Assetsv3AssetFilterTemplateRequest, _options?: Configuration): Promise<any> {
        const result = this.api.assetsServiceDeleteFilterTemplateForAssets(templateId, assetsv3AssetFilterTemplateRequest, _options);
        return result.toPromise();
    }

    /**
     * DeletePolicies - Delete Policy returns response code and message.
     * @param policyIds Policy ids.
     */
    public assetsServiceDeletePoliciesWithHttpInfo(policyIds?: Array<string>, _options?: Configuration): Promise<HttpInfo<any>> {
        const result = this.api.assetsServiceDeletePoliciesWithHttpInfo(policyIds, _options);
        return result.toPromise();
    }

    /**
     * DeletePolicies - Delete Policy returns response code and message.
     * @param policyIds Policy ids.
     */
    public assetsServiceDeletePolicies(policyIds?: Array<string>, _options?: Configuration): Promise<any> {
        const result = this.api.assetsServiceDeletePolicies(policyIds, _options);
        return result.toPromise();
    }

    /**
     * FetchAssetChangeLog - Fetch the logs for any actions performed on assets.
     * @param assetsv3FetchAssetChangeLogRequest 
     */
    public assetsServiceFetchAssetChangeLogWithHttpInfo(assetsv3FetchAssetChangeLogRequest: Assetsv3FetchAssetChangeLogRequest, _options?: Configuration): Promise<HttpInfo<Assetsv3FetchAssetChangeLogResponse>> {
        const result = this.api.assetsServiceFetchAssetChangeLogWithHttpInfo(assetsv3FetchAssetChangeLogRequest, _options);
        return result.toPromise();
    }

    /**
     * FetchAssetChangeLog - Fetch the logs for any actions performed on assets.
     * @param assetsv3FetchAssetChangeLogRequest 
     */
    public assetsServiceFetchAssetChangeLog(assetsv3FetchAssetChangeLogRequest: Assetsv3FetchAssetChangeLogRequest, _options?: Configuration): Promise<Assetsv3FetchAssetChangeLogResponse> {
        const result = this.api.assetsServiceFetchAssetChangeLog(assetsv3FetchAssetChangeLogRequest, _options);
        return result.toPromise();
    }

    /**
     * FetchAssetDashboard - Gets Filter Templates for Dshboard Widgets.
     * @param widgetType ID of the Dashboard Widget
     * @param dateRangeStart start of date range for ui widget.
     * @param dateRangeEnd end of date range for ui widget.
     * @param dateRangeType type of date range for ui widget.
     * @param dateRangeKey key for ui widget.
     * @param dateRangeError error for ui widget.
     * @param dateRangeStartNumber start_number for ui widget.
     * @param dateRangeStartUnit start of date range for ui widget.
     * @param dateRangeEndNumber start of date range for ui widget.
     * @param dateRangeEndUnit start of date range for ui widget.
     * @param timelineValueSelected Name of the timeline value selected from drop down.
     * @param tagId Tag ID.
     */
    public assetsServiceFetchAssetDashboardWithHttpInfo(widgetType: string, dateRangeStart?: string, dateRangeEnd?: string, dateRangeType?: string, dateRangeKey?: string, dateRangeError?: string, dateRangeStartNumber?: number, dateRangeStartUnit?: string, dateRangeEndNumber?: number, dateRangeEndUnit?: string, timelineValueSelected?: string, tagId?: string, _options?: Configuration): Promise<HttpInfo<Assetsv3FetchAssetDashboardResponse>> {
        const result = this.api.assetsServiceFetchAssetDashboardWithHttpInfo(widgetType, dateRangeStart, dateRangeEnd, dateRangeType, dateRangeKey, dateRangeError, dateRangeStartNumber, dateRangeStartUnit, dateRangeEndNumber, dateRangeEndUnit, timelineValueSelected, tagId, _options);
        return result.toPromise();
    }

    /**
     * FetchAssetDashboard - Gets Filter Templates for Dshboard Widgets.
     * @param widgetType ID of the Dashboard Widget
     * @param dateRangeStart start of date range for ui widget.
     * @param dateRangeEnd end of date range for ui widget.
     * @param dateRangeType type of date range for ui widget.
     * @param dateRangeKey key for ui widget.
     * @param dateRangeError error for ui widget.
     * @param dateRangeStartNumber start_number for ui widget.
     * @param dateRangeStartUnit start of date range for ui widget.
     * @param dateRangeEndNumber start of date range for ui widget.
     * @param dateRangeEndUnit start of date range for ui widget.
     * @param timelineValueSelected Name of the timeline value selected from drop down.
     * @param tagId Tag ID.
     */
    public assetsServiceFetchAssetDashboard(widgetType: string, dateRangeStart?: string, dateRangeEnd?: string, dateRangeType?: string, dateRangeKey?: string, dateRangeError?: string, dateRangeStartNumber?: number, dateRangeStartUnit?: string, dateRangeEndNumber?: number, dateRangeEndUnit?: string, timelineValueSelected?: string, tagId?: string, _options?: Configuration): Promise<Assetsv3FetchAssetDashboardResponse> {
        const result = this.api.assetsServiceFetchAssetDashboard(widgetType, dateRangeStart, dateRangeEnd, dateRangeType, dateRangeKey, dateRangeError, dateRangeStartNumber, dateRangeStartUnit, dateRangeEndNumber, dateRangeEndUnit, timelineValueSelected, tagId, _options);
        return result.toPromise();
    }

    /**
     * FetchAssetList - Asset Fetch Api .
     * @param assetsv3FetchAssetListRequest 
     */
    public assetsServiceFetchAssetListWithHttpInfo(assetsv3FetchAssetListRequest: Assetsv3FetchAssetListRequest, _options?: Configuration): Promise<HttpInfo<Assetsv3FetchAssetListResponse>> {
        const result = this.api.assetsServiceFetchAssetListWithHttpInfo(assetsv3FetchAssetListRequest, _options);
        return result.toPromise();
    }

    /**
     * FetchAssetList - Asset Fetch Api .
     * @param assetsv3FetchAssetListRequest 
     */
    public assetsServiceFetchAssetList(assetsv3FetchAssetListRequest: Assetsv3FetchAssetListRequest, _options?: Configuration): Promise<Assetsv3FetchAssetListResponse> {
        const result = this.api.assetsServiceFetchAssetList(assetsv3FetchAssetListRequest, _options);
        return result.toPromise();
    }

    /**
     * FetchAssetsForMergeSplit : Fetch assets for Merge and Split.
     * @param assetId Asset grouper Id.
     * @param pageNumber Page number.
     * @param pageSize Page size.
     * @param action Action : merge or split.
     * @param searchKey Search from the list based on asset name, database name, ip or host.
     */
    public assetsServiceFetchAssetsForMergeSplitWithHttpInfo(assetId?: string, pageNumber?: number, pageSize?: number, action?: string, searchKey?: string, _options?: Configuration): Promise<HttpInfo<Assetsv3FetchAssetsForMergeSplitResponse>> {
        const result = this.api.assetsServiceFetchAssetsForMergeSplitWithHttpInfo(assetId, pageNumber, pageSize, action, searchKey, _options);
        return result.toPromise();
    }

    /**
     * FetchAssetsForMergeSplit : Fetch assets for Merge and Split.
     * @param assetId Asset grouper Id.
     * @param pageNumber Page number.
     * @param pageSize Page size.
     * @param action Action : merge or split.
     * @param searchKey Search from the list based on asset name, database name, ip or host.
     */
    public assetsServiceFetchAssetsForMergeSplit(assetId?: string, pageNumber?: number, pageSize?: number, action?: string, searchKey?: string, _options?: Configuration): Promise<Assetsv3FetchAssetsForMergeSplitResponse> {
        const result = this.api.assetsServiceFetchAssetsForMergeSplit(assetId, pageNumber, pageSize, action, searchKey, _options);
        return result.toPromise();
    }

    /**
     * FindAssetName - Checks if the given Asset Name has already been assigned to an asset.
     * @param assetName Name of asset.
     */
    public assetsServiceFindAssetNameWithHttpInfo(assetName?: string, _options?: Configuration): Promise<HttpInfo<Assetsv3FindAssetNameResponse>> {
        const result = this.api.assetsServiceFindAssetNameWithHttpInfo(assetName, _options);
        return result.toPromise();
    }

    /**
     * FindAssetName - Checks if the given Asset Name has already been assigned to an asset.
     * @param assetName Name of asset.
     */
    public assetsServiceFindAssetName(assetName?: string, _options?: Configuration): Promise<Assetsv3FindAssetNameResponse> {
        const result = this.api.assetsServiceFindAssetName(assetName, _options);
        return result.toPromise();
    }

    /**
     * GetAssetOverview - Get asset overview widgets data for a particular asset.
     * @param assetId Asset grouper Id.
     * @param pageNumber Page number.
     * @param size Page size.
     * @param widget Widget type.   - ALL: All Asset Overview Widgets.  - CLASSIFICATION: Classification Asset Overview Widgets.  - TAG: Tag Asset Overview Widgets.  - RESOURCE: Resource Asset Overview Widgets.
     * @param ip Asset IP.
     * @param host Asset Host.
     * @param database Database Name.
     * @param assetEntityType asset ntity type.
     */
    public assetsServiceGetAssetOverviewWithHttpInfo(assetId?: string, pageNumber?: number, size?: number, widget?: 'ALL' | 'CLASSIFICATION' | 'TAG' | 'RESOURCE', ip?: string, host?: string, database?: string, assetEntityType?: string, _options?: Configuration): Promise<HttpInfo<Assetsv3AssetOverviewResponse>> {
        const result = this.api.assetsServiceGetAssetOverviewWithHttpInfo(assetId, pageNumber, size, widget, ip, host, database, assetEntityType, _options);
        return result.toPromise();
    }

    /**
     * GetAssetOverview - Get asset overview widgets data for a particular asset.
     * @param assetId Asset grouper Id.
     * @param pageNumber Page number.
     * @param size Page size.
     * @param widget Widget type.   - ALL: All Asset Overview Widgets.  - CLASSIFICATION: Classification Asset Overview Widgets.  - TAG: Tag Asset Overview Widgets.  - RESOURCE: Resource Asset Overview Widgets.
     * @param ip Asset IP.
     * @param host Asset Host.
     * @param database Database Name.
     * @param assetEntityType asset ntity type.
     */
    public assetsServiceGetAssetOverview(assetId?: string, pageNumber?: number, size?: number, widget?: 'ALL' | 'CLASSIFICATION' | 'TAG' | 'RESOURCE', ip?: string, host?: string, database?: string, assetEntityType?: string, _options?: Configuration): Promise<Assetsv3AssetOverviewResponse> {
        const result = this.api.assetsServiceGetAssetOverview(assetId, pageNumber, size, widget, ip, host, database, assetEntityType, _options);
        return result.toPromise();
    }

    /**
     * GetAssetTopology- Get list of topology for a parent asset.
     * @param assetsv3GetAssetTopologyRequest 
     */
    public assetsServiceGetAssetTopologyWithHttpInfo(assetsv3GetAssetTopologyRequest: Assetsv3GetAssetTopologyRequest, _options?: Configuration): Promise<HttpInfo<Assetsv3GetAssetTopologyResponse>> {
        const result = this.api.assetsServiceGetAssetTopologyWithHttpInfo(assetsv3GetAssetTopologyRequest, _options);
        return result.toPromise();
    }

    /**
     * GetAssetTopology- Get list of topology for a parent asset.
     * @param assetsv3GetAssetTopologyRequest 
     */
    public assetsServiceGetAssetTopology(assetsv3GetAssetTopologyRequest: Assetsv3GetAssetTopologyRequest, _options?: Configuration): Promise<Assetsv3GetAssetTopologyResponse> {
        const result = this.api.assetsServiceGetAssetTopology(assetsv3GetAssetTopologyRequest, _options);
        return result.toPromise();
    }

    /**
     * GetFilterTemplateForAssets - Get list of filters query templates for manage assets.
     * @param templateId template id to be deleted.
     */
    public assetsServiceGetFilterTemplateForAssetsWithHttpInfo(templateId?: string, _options?: Configuration): Promise<HttpInfo<Assetsv3GetFilterTemplateResponse>> {
        const result = this.api.assetsServiceGetFilterTemplateForAssetsWithHttpInfo(templateId, _options);
        return result.toPromise();
    }

    /**
     * GetFilterTemplateForAssets - Get list of filters query templates for manage assets.
     * @param templateId template id to be deleted.
     */
    public assetsServiceGetFilterTemplateForAssets(templateId?: string, _options?: Configuration): Promise<Assetsv3GetFilterTemplateResponse> {
        const result = this.api.assetsServiceGetFilterTemplateForAssets(templateId, _options);
        return result.toPromise();
    }

    /**
     * GetFiltersForAssets - Get a list of filters category and sub category with all data.
     */
    public assetsServiceGetFiltersForAssetsWithHttpInfo(_options?: Configuration): Promise<HttpInfo<Assetsv3GetFiltersDataResponse>> {
        const result = this.api.assetsServiceGetFiltersForAssetsWithHttpInfo(_options);
        return result.toPromise();
    }

    /**
     * GetFiltersForAssets - Get a list of filters category and sub category with all data.
     */
    public assetsServiceGetFiltersForAssets(_options?: Configuration): Promise<Assetsv3GetFiltersDataResponse> {
        const result = this.api.assetsServiceGetFiltersForAssets(_options);
        return result.toPromise();
    }

    /**
     * ListPolicy - List all policies.
     */
    public assetsServiceListPolicyWithHttpInfo(_options?: Configuration): Promise<HttpInfo<Assetsv3ListPolicyResponse>> {
        const result = this.api.assetsServiceListPolicyWithHttpInfo(_options);
        return result.toPromise();
    }

    /**
     * ListPolicy - List all policies.
     */
    public assetsServiceListPolicy(_options?: Configuration): Promise<Assetsv3ListPolicyResponse> {
        const result = this.api.assetsServiceListPolicy(_options);
        return result.toPromise();
    }

    /**
     * ListRule - List all rules for a policy.
     * @param policyId Policy ID
     */
    public assetsServiceListRuleWithHttpInfo(policyId: string, _options?: Configuration): Promise<HttpInfo<Assetsv3ListRuleResponse>> {
        const result = this.api.assetsServiceListRuleWithHttpInfo(policyId, _options);
        return result.toPromise();
    }

    /**
     * ListRule - List all rules for a policy.
     * @param policyId Policy ID
     */
    public assetsServiceListRule(policyId: string, _options?: Configuration): Promise<Assetsv3ListRuleResponse> {
        const result = this.api.assetsServiceListRule(policyId, _options);
        return result.toPromise();
    }

    /**
     * ListTagDomains - Get Tag categories by request parameters .
     * @param domGrouper Optional: dom_grouper required if we want to fetch domains based on the group.
     * @param purpose Optional: purpose required if we want to fetch domains based on the purpose.
     * @param needTag Optional: If we need Tag  based on the Domains.
     */
    public assetsServiceListTagDomainsWithHttpInfo(domGrouper?: string, purpose?: string, needTag?: boolean, _options?: Configuration): Promise<HttpInfo<Assetsv3ListTagDomainsResponse>> {
        const result = this.api.assetsServiceListTagDomainsWithHttpInfo(domGrouper, purpose, needTag, _options);
        return result.toPromise();
    }

    /**
     * ListTagDomains - Get Tag categories by request parameters .
     * @param domGrouper Optional: dom_grouper required if we want to fetch domains based on the group.
     * @param purpose Optional: purpose required if we want to fetch domains based on the purpose.
     * @param needTag Optional: If we need Tag  based on the Domains.
     */
    public assetsServiceListTagDomains(domGrouper?: string, purpose?: string, needTag?: boolean, _options?: Configuration): Promise<Assetsv3ListTagDomainsResponse> {
        const result = this.api.assetsServiceListTagDomains(domGrouper, purpose, needTag, _options);
        return result.toPromise();
    }

    /**
     * ListTags - Get Tags for Manage Tags listing screen .
     * @param assetId asset id - Asset ID.
     */
    public assetsServiceListTagsWithHttpInfo(assetId?: Array<string>, _options?: Configuration): Promise<HttpInfo<Assetsv3ListTagsResponse>> {
        const result = this.api.assetsServiceListTagsWithHttpInfo(assetId, _options);
        return result.toPromise();
    }

    /**
     * ListTags - Get Tags for Manage Tags listing screen .
     * @param assetId asset id - Asset ID.
     */
    public assetsServiceListTags(assetId?: Array<string>, _options?: Configuration): Promise<Assetsv3ListTagsResponse> {
        const result = this.api.assetsServiceListTags(assetId, _options);
        return result.toPromise();
    }

    /**
     * MergeOrSplitAssets - Merge or split the selected assets.
     * @param assetsv3MergeOrSplitAssetsRequest 
     */
    public assetsServiceMergeOrSplitAssetsWithHttpInfo(assetsv3MergeOrSplitAssetsRequest: Assetsv3MergeOrSplitAssetsRequest, _options?: Configuration): Promise<HttpInfo<any>> {
        const result = this.api.assetsServiceMergeOrSplitAssetsWithHttpInfo(assetsv3MergeOrSplitAssetsRequest, _options);
        return result.toPromise();
    }

    /**
     * MergeOrSplitAssets - Merge or split the selected assets.
     * @param assetsv3MergeOrSplitAssetsRequest 
     */
    public assetsServiceMergeOrSplitAssets(assetsv3MergeOrSplitAssetsRequest: Assetsv3MergeOrSplitAssetsRequest, _options?: Configuration): Promise<any> {
        const result = this.api.assetsServiceMergeOrSplitAssets(assetsv3MergeOrSplitAssetsRequest, _options);
        return result.toPromise();
    }

    /**
     * SaveAssignedTags - Save Assigned Tags to TAG_DSDEF_MAP table.
     * @param assetsv3SaveAssignedTagsRequest 
     */
    public assetsServiceSaveAssignedTagsWithHttpInfo(assetsv3SaveAssignedTagsRequest: Assetsv3SaveAssignedTagsRequest, _options?: Configuration): Promise<HttpInfo<any>> {
        const result = this.api.assetsServiceSaveAssignedTagsWithHttpInfo(assetsv3SaveAssignedTagsRequest, _options);
        return result.toPromise();
    }

    /**
     * SaveAssignedTags - Save Assigned Tags to TAG_DSDEF_MAP table.
     * @param assetsv3SaveAssignedTagsRequest 
     */
    public assetsServiceSaveAssignedTags(assetsv3SaveAssignedTagsRequest: Assetsv3SaveAssignedTagsRequest, _options?: Configuration): Promise<any> {
        const result = this.api.assetsServiceSaveAssignedTags(assetsv3SaveAssignedTagsRequest, _options);
        return result.toPromise();
    }

    /**
     * SaveTagConceptData - creates a custom tag
     * @param assetsv3SaveTagConceptDataRequest 
     */
    public assetsServiceSaveTagConceptDataWithHttpInfo(assetsv3SaveTagConceptDataRequest: Assetsv3SaveTagConceptDataRequest, _options?: Configuration): Promise<HttpInfo<any>> {
        const result = this.api.assetsServiceSaveTagConceptDataWithHttpInfo(assetsv3SaveTagConceptDataRequest, _options);
        return result.toPromise();
    }

    /**
     * SaveTagConceptData - creates a custom tag
     * @param assetsv3SaveTagConceptDataRequest 
     */
    public assetsServiceSaveTagConceptData(assetsv3SaveTagConceptDataRequest: Assetsv3SaveTagConceptDataRequest, _options?: Configuration): Promise<any> {
        const result = this.api.assetsServiceSaveTagConceptData(assetsv3SaveTagConceptDataRequest, _options);
        return result.toPromise();
    }

    /**
     * SaveTagDomainData - creates a custom category to be assigned to a tag
     * @param assetsv3SaveTagDomainDataRequest 
     */
    public assetsServiceSaveTagDomainDataWithHttpInfo(assetsv3SaveTagDomainDataRequest: Assetsv3SaveTagDomainDataRequest, _options?: Configuration): Promise<HttpInfo<any>> {
        const result = this.api.assetsServiceSaveTagDomainDataWithHttpInfo(assetsv3SaveTagDomainDataRequest, _options);
        return result.toPromise();
    }

    /**
     * SaveTagDomainData - creates a custom category to be assigned to a tag
     * @param assetsv3SaveTagDomainDataRequest 
     */
    public assetsServiceSaveTagDomainData(assetsv3SaveTagDomainDataRequest: Assetsv3SaveTagDomainDataRequest, _options?: Configuration): Promise<any> {
        const result = this.api.assetsServiceSaveTagDomainData(assetsv3SaveTagDomainDataRequest, _options);
        return result.toPromise();
    }

    /**
     * SaveUpdateFilterTemplateForAssets - Save/Update a filters query to use as template in manage assets along with reordering of template list.
     * @param assetsv3SaveUpdateFilterTemplateRequest 
     */
    public assetsServiceSaveUpdateFilterTemplateForAssetsWithHttpInfo(assetsv3SaveUpdateFilterTemplateRequest: Assetsv3SaveUpdateFilterTemplateRequest, _options?: Configuration): Promise<HttpInfo<Assetsv3SaveUpdateFilterTemplateResponse>> {
        const result = this.api.assetsServiceSaveUpdateFilterTemplateForAssetsWithHttpInfo(assetsv3SaveUpdateFilterTemplateRequest, _options);
        return result.toPromise();
    }

    /**
     * SaveUpdateFilterTemplateForAssets - Save/Update a filters query to use as template in manage assets along with reordering of template list.
     * @param assetsv3SaveUpdateFilterTemplateRequest 
     */
    public assetsServiceSaveUpdateFilterTemplateForAssets(assetsv3SaveUpdateFilterTemplateRequest: Assetsv3SaveUpdateFilterTemplateRequest, _options?: Configuration): Promise<Assetsv3SaveUpdateFilterTemplateResponse> {
        const result = this.api.assetsServiceSaveUpdateFilterTemplateForAssets(assetsv3SaveUpdateFilterTemplateRequest, _options);
        return result.toPromise();
    }

    /**
     * SetBannerState - Set banner state for asset inventory page.
     * @param assetsv3SetBannerStateRequest 
     */
    public assetsServiceSetBannerStateWithHttpInfo(assetsv3SetBannerStateRequest: Assetsv3SetBannerStateRequest, _options?: Configuration): Promise<HttpInfo<any>> {
        const result = this.api.assetsServiceSetBannerStateWithHttpInfo(assetsv3SetBannerStateRequest, _options);
        return result.toPromise();
    }

    /**
     * SetBannerState - Set banner state for asset inventory page.
     * @param assetsv3SetBannerStateRequest 
     */
    public assetsServiceSetBannerState(assetsv3SetBannerStateRequest: Assetsv3SetBannerStateRequest, _options?: Configuration): Promise<any> {
        const result = this.api.assetsServiceSetBannerState(assetsv3SetBannerStateRequest, _options);
        return result.toPromise();
    }

    /**
     * UpdateAssetName - Udates the name of the asset as given by the user.
     * @param assetsv3UpdateAssetNameRequest 
     */
    public assetsServiceUpdateAssetNameWithHttpInfo(assetsv3UpdateAssetNameRequest: Assetsv3UpdateAssetNameRequest, _options?: Configuration): Promise<HttpInfo<any>> {
        const result = this.api.assetsServiceUpdateAssetNameWithHttpInfo(assetsv3UpdateAssetNameRequest, _options);
        return result.toPromise();
    }

    /**
     * UpdateAssetName - Udates the name of the asset as given by the user.
     * @param assetsv3UpdateAssetNameRequest 
     */
    public assetsServiceUpdateAssetName(assetsv3UpdateAssetNameRequest: Assetsv3UpdateAssetNameRequest, _options?: Configuration): Promise<any> {
        const result = this.api.assetsServiceUpdateAssetName(assetsv3UpdateAssetNameRequest, _options);
        return result.toPromise();
    }

    /**
     * UpdatePolicy - Update existing Policy status.
     * @param assetsv3UpdatePolicyRequest 
     */
    public assetsServiceUpdatePolicyWithHttpInfo(assetsv3UpdatePolicyRequest: Assetsv3UpdatePolicyRequest, _options?: Configuration): Promise<HttpInfo<any>> {
        const result = this.api.assetsServiceUpdatePolicyWithHttpInfo(assetsv3UpdatePolicyRequest, _options);
        return result.toPromise();
    }

    /**
     * UpdatePolicy - Update existing Policy status.
     * @param assetsv3UpdatePolicyRequest 
     */
    public assetsServiceUpdatePolicy(assetsv3UpdatePolicyRequest: Assetsv3UpdatePolicyRequest, _options?: Configuration): Promise<any> {
        const result = this.api.assetsServiceUpdatePolicy(assetsv3UpdatePolicyRequest, _options);
        return result.toPromise();
    }


}



import { ObservableAuditServiceApi } from './ObservableAPI';

import { AuditServiceApiRequestFactory, AuditServiceApiResponseProcessor} from "../apis/AuditServiceApi";
export class PromiseAuditServiceApi {
    private api: ObservableAuditServiceApi

    public constructor(
        configuration: Configuration,
        requestFactory?: AuditServiceApiRequestFactory,
        responseProcessor?: AuditServiceApiResponseProcessor
    ) {
        this.api = new ObservableAuditServiceApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Summary: Get activity records Description: Return activity records that match the arguments passed in the request.  Multiple values can be passed to the (UID, Context, ActionTaken, PerformedBy) fields by supplying a  comma-separated list to the corresponding fields in the request.  For instance to check for  multiple Contexts set the field to \"op1, op2, op3\".
     * @param startTime Return records starting at this time (&gt;&#x3D;).
     * @param endTime Return records ending before this time (&lt;).
     * @param uid Return records with this service/collection id.
     * @param actionTaken Return records matching this operation (CRUD or other action).
     * @param context Return records for this service/collection.
     * @param changesMade Return records created only for this reason.
     * @param performedBy Return records originating with the specified user id.
     * @param contextDescription Return records with this label.
     * @param query Return records based on the query.
     * @param offset The amount to offset the rows by for pagination.
     * @param limit The max amount of rows to return for pagination.
     * @param filter Return eligable filters if this is true.
     */
    public auditServiceGetActivityRecordsWithHttpInfo(startTime?: Date, endTime?: Date, uid?: string, actionTaken?: string, context?: string, changesMade?: string, performedBy?: string, contextDescription?: string, query?: string, offset?: number, limit?: number, filter?: boolean, _options?: Configuration): Promise<HttpInfo<Auditv3GetActivityRecordsResponse>> {
        const result = this.api.auditServiceGetActivityRecordsWithHttpInfo(startTime, endTime, uid, actionTaken, context, changesMade, performedBy, contextDescription, query, offset, limit, filter, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get activity records Description: Return activity records that match the arguments passed in the request.  Multiple values can be passed to the (UID, Context, ActionTaken, PerformedBy) fields by supplying a  comma-separated list to the corresponding fields in the request.  For instance to check for  multiple Contexts set the field to \"op1, op2, op3\".
     * @param startTime Return records starting at this time (&gt;&#x3D;).
     * @param endTime Return records ending before this time (&lt;).
     * @param uid Return records with this service/collection id.
     * @param actionTaken Return records matching this operation (CRUD or other action).
     * @param context Return records for this service/collection.
     * @param changesMade Return records created only for this reason.
     * @param performedBy Return records originating with the specified user id.
     * @param contextDescription Return records with this label.
     * @param query Return records based on the query.
     * @param offset The amount to offset the rows by for pagination.
     * @param limit The max amount of rows to return for pagination.
     * @param filter Return eligable filters if this is true.
     */
    public auditServiceGetActivityRecords(startTime?: Date, endTime?: Date, uid?: string, actionTaken?: string, context?: string, changesMade?: string, performedBy?: string, contextDescription?: string, query?: string, offset?: number, limit?: number, filter?: boolean, _options?: Configuration): Promise<Auditv3GetActivityRecordsResponse> {
        const result = this.api.auditServiceGetActivityRecords(startTime, endTime, uid, actionTaken, context, changesMade, performedBy, contextDescription, query, offset, limit, filter, _options);
        return result.toPromise();
    }

    /**
     * Summary: Put download activity record Description: Create an activity log record with the arguments passed in the request.
     * @param auditv3PutActivityRecordRequest 
     */
    public auditServicePutDownloadActivityRecordWithHttpInfo(auditv3PutActivityRecordRequest: Auditv3PutActivityRecordRequest, _options?: Configuration): Promise<HttpInfo<Auditv3PutActivityRecordResponse>> {
        const result = this.api.auditServicePutDownloadActivityRecordWithHttpInfo(auditv3PutActivityRecordRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Put download activity record Description: Create an activity log record with the arguments passed in the request.
     * @param auditv3PutActivityRecordRequest 
     */
    public auditServicePutDownloadActivityRecord(auditv3PutActivityRecordRequest: Auditv3PutActivityRecordRequest, _options?: Configuration): Promise<Auditv3PutActivityRecordResponse> {
        const result = this.api.auditServicePutDownloadActivityRecord(auditv3PutActivityRecordRequest, _options);
        return result.toPromise();
    }


}



import { ObservableAuthServerServiceApi } from './ObservableAPI';

import { AuthServerServiceApiRequestFactory, AuthServerServiceApiResponseProcessor} from "../apis/AuthServerServiceApi";
export class PromiseAuthServerServiceApi {
    private api: ObservableAuthServerServiceApi

    public constructor(
        configuration: Configuration,
        requestFactory?: AuthServerServiceApiRequestFactory,
        responseProcessor?: AuthServerServiceApiResponseProcessor
    ) {
        this.api = new ObservableAuthServerServiceApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Summary: Create Oauth client Description: Create/register new Oauth client.
     * @param authserverCreateOauthClientRequest 
     */
    public authServerServiceCreateOauthClientWithHttpInfo(authserverCreateOauthClientRequest: AuthserverCreateOauthClientRequest, _options?: Configuration): Promise<HttpInfo<AuthserverCreateOauthClientResponse>> {
        const result = this.api.authServerServiceCreateOauthClientWithHttpInfo(authserverCreateOauthClientRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Create Oauth client Description: Create/register new Oauth client.
     * @param authserverCreateOauthClientRequest 
     */
    public authServerServiceCreateOauthClient(authserverCreateOauthClientRequest: AuthserverCreateOauthClientRequest, _options?: Configuration): Promise<AuthserverCreateOauthClientResponse> {
        const result = this.api.authServerServiceCreateOauthClient(authserverCreateOauthClientRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Delete Oauth client Description: Delete registered Oauth client by clientId.
     * @param clientId ClientID of registered OAuth.
     */
    public authServerServiceDeleteOauthClientWithHttpInfo(clientId: string, _options?: Configuration): Promise<HttpInfo<any>> {
        const result = this.api.authServerServiceDeleteOauthClientWithHttpInfo(clientId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Delete Oauth client Description: Delete registered Oauth client by clientId.
     * @param clientId ClientID of registered OAuth.
     */
    public authServerServiceDeleteOauthClient(clientId: string, _options?: Configuration): Promise<any> {
        const result = this.api.authServerServiceDeleteOauthClient(clientId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get access token Description: Get access token from passed clientId and secret.
     */
    public authServerServiceGetAccessTokenWithHttpInfo(_options?: Configuration): Promise<HttpInfo<AuthserverGetAccessTokenResponse>> {
        const result = this.api.authServerServiceGetAccessTokenWithHttpInfo(_options);
        return result.toPromise();
    }

    /**
     * Summary: Get access token Description: Get access token from passed clientId and secret.
     */
    public authServerServiceGetAccessToken(_options?: Configuration): Promise<AuthserverGetAccessTokenResponse> {
        const result = this.api.authServerServiceGetAccessToken(_options);
        return result.toPromise();
    }

    /**
     * Summary: Get Oauth client Description: Get registered Oauth client by clientId.
     * @param clientId ClientID of registered OAuth.
     */
    public authServerServiceGetOauthClientWithHttpInfo(clientId: string, _options?: Configuration): Promise<HttpInfo<AuthserverGetOauthClientResponse>> {
        const result = this.api.authServerServiceGetOauthClientWithHttpInfo(clientId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get Oauth client Description: Get registered Oauth client by clientId.
     * @param clientId ClientID of registered OAuth.
     */
    public authServerServiceGetOauthClient(clientId: string, _options?: Configuration): Promise<AuthserverGetOauthClientResponse> {
        const result = this.api.authServerServiceGetOauthClient(clientId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get user Description: Get user.
     */
    public authServerServiceGetUserWithHttpInfo(_options?: Configuration): Promise<HttpInfo<AuthserverGetUserResponse>> {
        const result = this.api.authServerServiceGetUserWithHttpInfo(_options);
        return result.toPromise();
    }

    /**
     * Summary: Get user Description: Get user.
     */
    public authServerServiceGetUser(_options?: Configuration): Promise<AuthserverGetUserResponse> {
        const result = this.api.authServerServiceGetUser(_options);
        return result.toPromise();
    }

    /**
     * Summary: List Oauth client Description: List all registered Oauth client.
     */
    public authServerServiceListOauthClientWithHttpInfo(_options?: Configuration): Promise<HttpInfo<AuthserverListOauthClientResponse>> {
        const result = this.api.authServerServiceListOauthClientWithHttpInfo(_options);
        return result.toPromise();
    }

    /**
     * Summary: List Oauth client Description: List all registered Oauth client.
     */
    public authServerServiceListOauthClient(_options?: Configuration): Promise<AuthserverListOauthClientResponse> {
        const result = this.api.authServerServiceListOauthClient(_options);
        return result.toPromise();
    }


}



import { ObservableCloudAccountsApi } from './ObservableAPI';

import { CloudAccountsApiRequestFactory, CloudAccountsApiResponseProcessor} from "../apis/CloudAccountsApi";
export class PromiseCloudAccountsApi {
    private api: ObservableCloudAccountsApi

    public constructor(
        configuration: Configuration,
        requestFactory?: CloudAccountsApiRequestFactory,
        responseProcessor?: CloudAccountsApiResponseProcessor
    ) {
        this.api = new ObservableCloudAccountsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Install a new analyzer in the specified region to enable data classification in that region.
     * Add a new region for data classification
     * @param addAnalyzedRegionRequest 
     */
    public addAnalyzedRegionWithHttpInfo(addAnalyzedRegionRequest: AddAnalyzedRegionRequest, _options?: Configuration): Promise<HttpInfo<AddAnalyzedRegion200Response>> {
        const result = this.api.addAnalyzedRegionWithHttpInfo(addAnalyzedRegionRequest, _options);
        return result.toPromise();
    }

    /**
     * Install a new analyzer in the specified region to enable data classification in that region.
     * Add a new region for data classification
     * @param addAnalyzedRegionRequest 
     */
    public addAnalyzedRegion(addAnalyzedRegionRequest: AddAnalyzedRegionRequest, _options?: Configuration): Promise<AddAnalyzedRegion200Response> {
        const result = this.api.addAnalyzedRegion(addAnalyzedRegionRequest, _options);
        return result.toPromise();
    }

    /**
     * You can add a single or multiple cloud account connections from the same cloud provider.<BR>Adding these cloud account connections will trigger Guardium DSPM for data store discovery.<BR>To enable data classification, run the \'Add a new region for data classification\' API.
     * Add cloud account connections to DSPM
     * @param addCloudAccountsRequest 
     */
    public addCloudAccountsWithHttpInfo(addCloudAccountsRequest: AddCloudAccountsRequest, _options?: Configuration): Promise<HttpInfo<AddCloudAccounts200Response>> {
        const result = this.api.addCloudAccountsWithHttpInfo(addCloudAccountsRequest, _options);
        return result.toPromise();
    }

    /**
     * You can add a single or multiple cloud account connections from the same cloud provider.<BR>Adding these cloud account connections will trigger Guardium DSPM for data store discovery.<BR>To enable data classification, run the \'Add a new region for data classification\' API.
     * Add cloud account connections to DSPM
     * @param addCloudAccountsRequest 
     */
    public addCloudAccounts(addCloudAccountsRequest: AddCloudAccountsRequest, _options?: Configuration): Promise<AddCloudAccounts200Response> {
        const result = this.api.addCloudAccounts(addCloudAccountsRequest, _options);
        return result.toPromise();
    }

    /**
     * Generate an Atlassian authentication URL for Confluence integration.
     * Generate a Confluence authentication URL
     */
    public generateAtlassianConfluenceAuthUrlWithHttpInfo(_options?: Configuration): Promise<HttpInfo<AuthUrl>> {
        const result = this.api.generateAtlassianConfluenceAuthUrlWithHttpInfo(_options);
        return result.toPromise();
    }

    /**
     * Generate an Atlassian authentication URL for Confluence integration.
     * Generate a Confluence authentication URL
     */
    public generateAtlassianConfluenceAuthUrl(_options?: Configuration): Promise<AuthUrl> {
        const result = this.api.generateAtlassianConfluenceAuthUrl(_options);
        return result.toPromise();
    }

    /**
     * Generate an Atlassian authentication URL for JIRA integration.
     * Generate a JIRA authentication URL
     */
    public generateAtlassianJiraAuthUrlWithHttpInfo(_options?: Configuration): Promise<HttpInfo<AuthUrl>> {
        const result = this.api.generateAtlassianJiraAuthUrlWithHttpInfo(_options);
        return result.toPromise();
    }

    /**
     * Generate an Atlassian authentication URL for JIRA integration.
     * Generate a JIRA authentication URL
     */
    public generateAtlassianJiraAuthUrl(_options?: Configuration): Promise<AuthUrl> {
        const result = this.api.generateAtlassianJiraAuthUrl(_options);
        return result.toPromise();
    }

    /**
     * Generate azure authorization url.
     * Generate azure authorization url
     * @param tenantId Tenant Id of the new Azure account, GUID format.
     */
    public generateAzureAuthUrlWithHttpInfo(tenantId?: string, _options?: Configuration): Promise<HttpInfo<AuthUrl>> {
        const result = this.api.generateAzureAuthUrlWithHttpInfo(tenantId, _options);
        return result.toPromise();
    }

    /**
     * Generate azure authorization url.
     * Generate azure authorization url
     * @param tenantId Tenant Id of the new Azure account, GUID format.
     */
    public generateAzureAuthUrl(tenantId?: string, _options?: Configuration): Promise<AuthUrl> {
        const result = this.api.generateAzureAuthUrl(tenantId, _options);
        return result.toPromise();
    }

    /**
     * Generate an administrator consent URL for Microsoft 365 integration.
     * Generate a Microsoft 365 consent URL
     */
    public generateOffice365AuthUrlWithHttpInfo(_options?: Configuration): Promise<HttpInfo<AuthUrl>> {
        const result = this.api.generateOffice365AuthUrlWithHttpInfo(_options);
        return result.toPromise();
    }

    /**
     * Generate an administrator consent URL for Microsoft 365 integration.
     * Generate a Microsoft 365 consent URL
     */
    public generateOffice365AuthUrl(_options?: Configuration): Promise<AuthUrl> {
        const result = this.api.generateOffice365AuthUrl(_options);
        return result.toPromise();
    }

    /**
     * Generate a Slack authentication URL.
     * Generate a Slack authentication URL
     */
    public generateSlackAuthUrlWithHttpInfo(_options?: Configuration): Promise<HttpInfo<AuthUrl>> {
        const result = this.api.generateSlackAuthUrlWithHttpInfo(_options);
        return result.toPromise();
    }

    /**
     * Generate a Slack authentication URL.
     * Generate a Slack authentication URL
     */
    public generateSlackAuthUrl(_options?: Configuration): Promise<AuthUrl> {
        const result = this.api.generateSlackAuthUrl(_options);
        return result.toPromise();
    }

    /**
     * Generate an administrator consent URL for Snowflake integration.
     * Validate and Generate a Snowflake OAuth URL
     * @param clientInfo 
     */
    public generateSnowflakeAuthUrlWithHttpInfo(clientInfo: ClientInfo, _options?: Configuration): Promise<HttpInfo<AuthUrl>> {
        const result = this.api.generateSnowflakeAuthUrlWithHttpInfo(clientInfo, _options);
        return result.toPromise();
    }

    /**
     * Generate an administrator consent URL for Snowflake integration.
     * Validate and Generate a Snowflake OAuth URL
     * @param clientInfo 
     */
    public generateSnowflakeAuthUrl(clientInfo: ClientInfo, _options?: Configuration): Promise<AuthUrl> {
        const result = this.api.generateSnowflakeAuthUrl(clientInfo, _options);
        return result.toPromise();
    }

    /**
     * Get the installation status of Guardium DSPM for a region.
     * Get the status of analyzer installation for a region
     * @param cloudProvider The cloud provider for the cloud account
     * @param region The region code
     */
    public getAnalyzedRegionStatusWithHttpInfo(cloudProvider: CloudServiceProvider, region: string, _options?: Configuration): Promise<HttpInfo<GetAnalyzedRegionStatus200Response>> {
        const result = this.api.getAnalyzedRegionStatusWithHttpInfo(cloudProvider, region, _options);
        return result.toPromise();
    }

    /**
     * Get the installation status of Guardium DSPM for a region.
     * Get the status of analyzer installation for a region
     * @param cloudProvider The cloud provider for the cloud account
     * @param region The region code
     */
    public getAnalyzedRegionStatus(cloudProvider: CloudServiceProvider, region: string, _options?: Configuration): Promise<GetAnalyzedRegionStatus200Response> {
        const result = this.api.getAnalyzedRegionStatus(cloudProvider, region, _options);
        return result.toPromise();
    }

    /**
     * Get Azure admin consent status.
     * Get Azure admin consent status
     */
    public getAzureAdminConsentStatusWithHttpInfo(_options?: Configuration): Promise<HttpInfo<boolean>> {
        const result = this.api.getAzureAdminConsentStatusWithHttpInfo(_options);
        return result.toPromise();
    }

    /**
     * Get Azure admin consent status.
     * Get Azure admin consent status
     */
    public getAzureAdminConsentStatus(_options?: Configuration): Promise<boolean> {
        const result = this.api.getAzureAdminConsentStatus(_options);
        return result.toPromise();
    }

    /**
     * Get the installation status of a cloud account.
     * Get the installation status of a cloud account
     * @param cloudProvider The cloud provider of the cloud account
     * @param cloudAccountId The cloud account identifier
     */
    public getCloudAccountInstallationStatusWithHttpInfo(cloudProvider: CloudServiceProvider, cloudAccountId: string, _options?: Configuration): Promise<HttpInfo<CloudAccountInstallationStatus>> {
        const result = this.api.getCloudAccountInstallationStatusWithHttpInfo(cloudProvider, cloudAccountId, _options);
        return result.toPromise();
    }

    /**
     * Get the installation status of a cloud account.
     * Get the installation status of a cloud account
     * @param cloudProvider The cloud provider of the cloud account
     * @param cloudAccountId The cloud account identifier
     */
    public getCloudAccountInstallationStatus(cloudProvider: CloudServiceProvider, cloudAccountId: string, _options?: Configuration): Promise<CloudAccountInstallationStatus> {
        const result = this.api.getCloudAccountInstallationStatus(cloudProvider, cloudAccountId, _options);
        return result.toPromise();
    }

    /**
     * Get Snowflake Refresh Token Expiry date.
     * Get Snowflake Refresh Token Expiry date
     * @param providerId The ID of the provider
     */
    public getRefreshTokenExpiryWithHttpInfo(providerId: string, _options?: Configuration): Promise<HttpInfo<TokenExpiryInfo>> {
        const result = this.api.getRefreshTokenExpiryWithHttpInfo(providerId, _options);
        return result.toPromise();
    }

    /**
     * Get Snowflake Refresh Token Expiry date.
     * Get Snowflake Refresh Token Expiry date
     * @param providerId The ID of the provider
     */
    public getRefreshTokenExpiry(providerId: string, _options?: Configuration): Promise<TokenExpiryInfo> {
        const result = this.api.getRefreshTokenExpiry(providerId, _options);
        return result.toPromise();
    }

    /**
     * Get a list of all the connected cloud accounts monitored by Guardium DSPM.
     * List cloud accounts connected to DSPM
     */
    public listLinkedAccountsWithHttpInfo(_options?: Configuration): Promise<HttpInfo<Array<LinkedAccounts>>> {
        const result = this.api.listLinkedAccountsWithHttpInfo(_options);
        return result.toPromise();
    }

    /**
     * Get a list of all the connected cloud accounts monitored by Guardium DSPM.
     * List cloud accounts connected to DSPM
     */
    public listLinkedAccounts(_options?: Configuration): Promise<Array<LinkedAccounts>> {
        const result = this.api.listLinkedAccounts(_options);
        return result.toPromise();
    }

    /**
     * Post cloud account ID connections to be removed from Guardium DSPM.
     * Post cloud account ID connections to be removed
     * @param accountIds 
     * @param serviceProvider 
     */
    public removeAccountsWithHttpInfo(accountIds: Array<string>, serviceProvider: ServiceProvider, _options?: Configuration): Promise<HttpInfo<void>> {
        const result = this.api.removeAccountsWithHttpInfo(accountIds, serviceProvider, _options);
        return result.toPromise();
    }

    /**
     * Post cloud account ID connections to be removed from Guardium DSPM.
     * Post cloud account ID connections to be removed
     * @param accountIds 
     * @param serviceProvider 
     */
    public removeAccounts(accountIds: Array<string>, serviceProvider: ServiceProvider, _options?: Configuration): Promise<void> {
        const result = this.api.removeAccounts(accountIds, serviceProvider, _options);
        return result.toPromise();
    }

    /**
     * Post cloud accounts IDs and get instructions to remove the accounts from the cloud service provider.
     * Post cloud account IDs and get instructions to remove the accounts
     * @param accountIds 
     * @param serviceProvider 
     */
    public removeAccountsInstructionsWithHttpInfo(accountIds: Array<string>, serviceProvider: ServiceProvider, _options?: Configuration): Promise<HttpInfo<RemoveAccountsInstructions200Response>> {
        const result = this.api.removeAccountsInstructionsWithHttpInfo(accountIds, serviceProvider, _options);
        return result.toPromise();
    }

    /**
     * Post cloud accounts IDs and get instructions to remove the accounts from the cloud service provider.
     * Post cloud account IDs and get instructions to remove the accounts
     * @param accountIds 
     * @param serviceProvider 
     */
    public removeAccountsInstructions(accountIds: Array<string>, serviceProvider: ServiceProvider, _options?: Configuration): Promise<RemoveAccountsInstructions200Response> {
        const result = this.api.removeAccountsInstructions(accountIds, serviceProvider, _options);
        return result.toPromise();
    }

    /**
     * Retrieve a service account ID to use it for Google Workspace authentication.
     * Get Google Workspace authentication
     */
    public retrieveServiceAccountIdWithHttpInfo(_options?: Configuration): Promise<HttpInfo<ServiceAccountClientId>> {
        const result = this.api.retrieveServiceAccountIdWithHttpInfo(_options);
        return result.toPromise();
    }

    /**
     * Retrieve a service account ID to use it for Google Workspace authentication.
     * Get Google Workspace authentication
     */
    public retrieveServiceAccountId(_options?: Configuration): Promise<ServiceAccountClientId> {
        const result = this.api.retrieveServiceAccountId(_options);
        return result.toPromise();
    }

    /**
     * Generate Snowflake integration Script.
     * Generate Snowflake Integration Script
     */
    public snowflakeIntegrationScriptWithHttpInfo(_options?: Configuration): Promise<HttpInfo<Script>> {
        const result = this.api.snowflakeIntegrationScriptWithHttpInfo(_options);
        return result.toPromise();
    }

    /**
     * Generate Snowflake integration Script.
     * Generate Snowflake Integration Script
     */
    public snowflakeIntegrationScript(_options?: Configuration): Promise<Script> {
        const result = this.api.snowflakeIntegrationScript(_options);
        return result.toPromise();
    }

    /**
     * Submit admin email for service account authorization and return service-account authorization status.
     * Submit email for service account authorization
     * @param submitAdminEmailParams 
     */
    public submitGoogleWorkspaceAdminEmailWithHttpInfo(submitAdminEmailParams: SubmitAdminEmailParams, _options?: Configuration): Promise<HttpInfo<ServiceAccountInstallationStatus>> {
        const result = this.api.submitGoogleWorkspaceAdminEmailWithHttpInfo(submitAdminEmailParams, _options);
        return result.toPromise();
    }

    /**
     * Submit admin email for service account authorization and return service-account authorization status.
     * Submit email for service account authorization
     * @param submitAdminEmailParams 
     */
    public submitGoogleWorkspaceAdminEmail(submitAdminEmailParams: SubmitAdminEmailParams, _options?: Configuration): Promise<ServiceAccountInstallationStatus> {
        const result = this.api.submitGoogleWorkspaceAdminEmail(submitAdminEmailParams, _options);
        return result.toPromise();
    }

    /**
     * Submit customer information for Microsoft 365 integration.
     * Submit Microsoft 365 customer information
     * @param tenantInfo 
     */
    public submitOffice365TenantInfoWithHttpInfo(tenantInfo: TenantInfo, _options?: Configuration): Promise<HttpInfo<Office365TenantInfo>> {
        const result = this.api.submitOffice365TenantInfoWithHttpInfo(tenantInfo, _options);
        return result.toPromise();
    }

    /**
     * Submit customer information for Microsoft 365 integration.
     * Submit Microsoft 365 customer information
     * @param tenantInfo 
     */
    public submitOffice365TenantInfo(tenantInfo: TenantInfo, _options?: Configuration): Promise<Office365TenantInfo> {
        const result = this.api.submitOffice365TenantInfo(tenantInfo, _options);
        return result.toPromise();
    }

    /**
     * Submit a Slack authentication code.
     * Submit a Slack authentication code
     * @param submitAuthCode 
     */
    public submitSlackAuthCodeWithHttpInfo(submitAuthCode: SubmitAuthCode, _options?: Configuration): Promise<HttpInfo<any>> {
        const result = this.api.submitSlackAuthCodeWithHttpInfo(submitAuthCode, _options);
        return result.toPromise();
    }

    /**
     * Submit a Slack authentication code.
     * Submit a Slack authentication code
     * @param submitAuthCode 
     */
    public submitSlackAuthCode(submitAuthCode: SubmitAuthCode, _options?: Configuration): Promise<any> {
        const result = this.api.submitSlackAuthCode(submitAuthCode, _options);
        return result.toPromise();
    }

    /**
     * Storing code that is returned from Snowflake oAuth.
     * Submit Snowflake oAuth code
     * @param authInfo 
     */
    public submitSnowflakeAuthCodeWithHttpInfo(authInfo: AuthInfo, _options?: Configuration): Promise<HttpInfo<void>> {
        const result = this.api.submitSnowflakeAuthCodeWithHttpInfo(authInfo, _options);
        return result.toPromise();
    }

    /**
     * Storing code that is returned from Snowflake oAuth.
     * Submit Snowflake oAuth code
     * @param authInfo 
     */
    public submitSnowflakeAuthCode(authInfo: AuthInfo, _options?: Configuration): Promise<void> {
        const result = this.api.submitSnowflakeAuthCode(authInfo, _options);
        return result.toPromise();
    }


}



import { ObservableComplianceAcceleratorApi } from './ObservableAPI';

import { ComplianceAcceleratorApiRequestFactory, ComplianceAcceleratorApiResponseProcessor} from "../apis/ComplianceAcceleratorApi";
export class PromiseComplianceAcceleratorApi {
    private api: ObservableComplianceAcceleratorApi

    public constructor(
        configuration: Configuration,
        requestFactory?: ComplianceAcceleratorApiRequestFactory,
        responseProcessor?: ComplianceAcceleratorApiResponseProcessor
    ) {
        this.api = new ObservableComplianceAcceleratorApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Summary: Create workspace Description: Create a workspace.
     * @param complianceacceleratorv3CreateWorkspaceRequest 
     */
    public complianceAcceleratorCreateWorkspaceWithHttpInfo(complianceacceleratorv3CreateWorkspaceRequest: Complianceacceleratorv3CreateWorkspaceRequest, _options?: Configuration): Promise<HttpInfo<StreamResultOfComplianceacceleratorv3CreateWorkspaceResponse>> {
        const result = this.api.complianceAcceleratorCreateWorkspaceWithHttpInfo(complianceacceleratorv3CreateWorkspaceRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Create workspace Description: Create a workspace.
     * @param complianceacceleratorv3CreateWorkspaceRequest 
     */
    public complianceAcceleratorCreateWorkspace(complianceacceleratorv3CreateWorkspaceRequest: Complianceacceleratorv3CreateWorkspaceRequest, _options?: Configuration): Promise<StreamResultOfComplianceacceleratorv3CreateWorkspaceResponse> {
        const result = this.api.complianceAcceleratorCreateWorkspace(complianceacceleratorv3CreateWorkspaceRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Delete compliance workspaces Description: Delete workspaces.
     * @param regulations Id to be deleted.
     * @param deleteAll if you want to delete a whole configuration.
     */
    public complianceAcceleratorDeleteComplianceWorkspacesWithHttpInfo(regulations?: Array<string>, deleteAll?: boolean, _options?: Configuration): Promise<HttpInfo<Complianceacceleratorv3DeleteComplianceWorkspacesResponse>> {
        const result = this.api.complianceAcceleratorDeleteComplianceWorkspacesWithHttpInfo(regulations, deleteAll, _options);
        return result.toPromise();
    }

    /**
     * Summary: Delete compliance workspaces Description: Delete workspaces.
     * @param regulations Id to be deleted.
     * @param deleteAll if you want to delete a whole configuration.
     */
    public complianceAcceleratorDeleteComplianceWorkspaces(regulations?: Array<string>, deleteAll?: boolean, _options?: Configuration): Promise<Complianceacceleratorv3DeleteComplianceWorkspacesResponse> {
        const result = this.api.complianceAcceleratorDeleteComplianceWorkspaces(regulations, deleteAll, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get compliance info Description: Return stored compliance data.
     */
    public complianceAcceleratorGetComplianceInfoWithHttpInfo(_options?: Configuration): Promise<HttpInfo<Complianceacceleratorv3GetComplianceInfoResponse>> {
        const result = this.api.complianceAcceleratorGetComplianceInfoWithHttpInfo(_options);
        return result.toPromise();
    }

    /**
     * Summary: Get compliance info Description: Return stored compliance data.
     */
    public complianceAcceleratorGetComplianceInfo(_options?: Configuration): Promise<Complianceacceleratorv3GetComplianceInfoResponse> {
        const result = this.api.complianceAcceleratorGetComplianceInfo(_options);
        return result.toPromise();
    }

    /**
     * HydrateWorkspace - Hydrates specified objects within a workspace
     * @param complianceacceleratorv3HydrateComplianceWorkspacesRequest 
     */
    public complianceAcceleratorHydrateWorkspaceWithHttpInfo(complianceacceleratorv3HydrateComplianceWorkspacesRequest: Complianceacceleratorv3HydrateComplianceWorkspacesRequest, _options?: Configuration): Promise<HttpInfo<Complianceacceleratorv3HydrateComplianceWorkspacesResponse>> {
        const result = this.api.complianceAcceleratorHydrateWorkspaceWithHttpInfo(complianceacceleratorv3HydrateComplianceWorkspacesRequest, _options);
        return result.toPromise();
    }

    /**
     * HydrateWorkspace - Hydrates specified objects within a workspace
     * @param complianceacceleratorv3HydrateComplianceWorkspacesRequest 
     */
    public complianceAcceleratorHydrateWorkspace(complianceacceleratorv3HydrateComplianceWorkspacesRequest: Complianceacceleratorv3HydrateComplianceWorkspacesRequest, _options?: Configuration): Promise<Complianceacceleratorv3HydrateComplianceWorkspacesResponse> {
        const result = this.api.complianceAcceleratorHydrateWorkspace(complianceacceleratorv3HydrateComplianceWorkspacesRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Store compliance info Description: Store compliance data.
     * @param complianceacceleratorv3StoreComplianceInfoRequest 
     */
    public complianceAcceleratorStoreComplianceInfoWithHttpInfo(complianceacceleratorv3StoreComplianceInfoRequest: Complianceacceleratorv3StoreComplianceInfoRequest, _options?: Configuration): Promise<HttpInfo<Complianceacceleratorv3StoreComplianceInfoResponse>> {
        const result = this.api.complianceAcceleratorStoreComplianceInfoWithHttpInfo(complianceacceleratorv3StoreComplianceInfoRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Store compliance info Description: Store compliance data.
     * @param complianceacceleratorv3StoreComplianceInfoRequest 
     */
    public complianceAcceleratorStoreComplianceInfo(complianceacceleratorv3StoreComplianceInfoRequest: Complianceacceleratorv3StoreComplianceInfoRequest, _options?: Configuration): Promise<Complianceacceleratorv3StoreComplianceInfoResponse> {
        const result = this.api.complianceAcceleratorStoreComplianceInfo(complianceacceleratorv3StoreComplianceInfoRequest, _options);
        return result.toPromise();
    }


}



import { ObservableConnectionsServiceApi } from './ObservableAPI';

import { ConnectionsServiceApiRequestFactory, ConnectionsServiceApiResponseProcessor} from "../apis/ConnectionsServiceApi";
export class PromiseConnectionsServiceApi {
    private api: ObservableConnectionsServiceApi

    public constructor(
        configuration: Configuration,
        requestFactory?: ConnectionsServiceApiRequestFactory,
        responseProcessor?: ConnectionsServiceApiResponseProcessor
    ) {
        this.api = new ObservableConnectionsServiceApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Summary: Create Connections accounts Description: Create Connections acccounts.
     * @param connectionsv3CreateConnectionsAccountsRequest 
     */
    public connectionsServiceCreateConnectionsAccountsWithHttpInfo(connectionsv3CreateConnectionsAccountsRequest: Connectionsv3CreateConnectionsAccountsRequest, _options?: Configuration): Promise<HttpInfo<Connectionsv3CreateConnectionsAccountsResponse>> {
        const result = this.api.connectionsServiceCreateConnectionsAccountsWithHttpInfo(connectionsv3CreateConnectionsAccountsRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Create Connections accounts Description: Create Connections acccounts.
     * @param connectionsv3CreateConnectionsAccountsRequest 
     */
    public connectionsServiceCreateConnectionsAccounts(connectionsv3CreateConnectionsAccountsRequest: Connectionsv3CreateConnectionsAccountsRequest, _options?: Configuration): Promise<Connectionsv3CreateConnectionsAccountsResponse> {
        const result = this.api.connectionsServiceCreateConnectionsAccounts(connectionsv3CreateConnectionsAccountsRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Create connections configs Description: Create Connection config by connection type.
     * @param connectionsv3CreateConnectionsConfigsRequest 
     */
    public connectionsServiceCreateConnectionsConfigsWithHttpInfo(connectionsv3CreateConnectionsConfigsRequest: Connectionsv3CreateConnectionsConfigsRequest, _options?: Configuration): Promise<HttpInfo<Connectionsv3CreateConnectionsConfigsResponse>> {
        const result = this.api.connectionsServiceCreateConnectionsConfigsWithHttpInfo(connectionsv3CreateConnectionsConfigsRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Create connections configs Description: Create Connection config by connection type.
     * @param connectionsv3CreateConnectionsConfigsRequest 
     */
    public connectionsServiceCreateConnectionsConfigs(connectionsv3CreateConnectionsConfigsRequest: Connectionsv3CreateConnectionsConfigsRequest, _options?: Configuration): Promise<Connectionsv3CreateConnectionsConfigsResponse> {
        const result = this.api.connectionsServiceCreateConnectionsConfigs(connectionsv3CreateConnectionsConfigsRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Create plugin Description: Create UC generic plugin
     * @param connectionsv3CreatePluginRequest 
     */
    public connectionsServiceCreatePluginWithHttpInfo(connectionsv3CreatePluginRequest: Connectionsv3CreatePluginRequest, _options?: Configuration): Promise<HttpInfo<Connectionsv3CreatePluginResponse>> {
        const result = this.api.connectionsServiceCreatePluginWithHttpInfo(connectionsv3CreatePluginRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Create plugin Description: Create UC generic plugin
     * @param connectionsv3CreatePluginRequest 
     */
    public connectionsServiceCreatePlugin(connectionsv3CreatePluginRequest: Connectionsv3CreatePluginRequest, _options?: Configuration): Promise<Connectionsv3CreatePluginResponse> {
        const result = this.api.connectionsServiceCreatePlugin(connectionsv3CreatePluginRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Create settings Description: Create Settings.
     * @param connectionsv3CreateSettingsRequest 
     */
    public connectionsServiceCreateSettingsWithHttpInfo(connectionsv3CreateSettingsRequest: Connectionsv3CreateSettingsRequest, _options?: Configuration): Promise<HttpInfo<any>> {
        const result = this.api.connectionsServiceCreateSettingsWithHttpInfo(connectionsv3CreateSettingsRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Create settings Description: Create Settings.
     * @param connectionsv3CreateSettingsRequest 
     */
    public connectionsServiceCreateSettings(connectionsv3CreateSettingsRequest: Connectionsv3CreateSettingsRequest, _options?: Configuration): Promise<any> {
        const result = this.api.connectionsServiceCreateSettings(connectionsv3CreateSettingsRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Delete Connections accounts Description: Delete Connections acccounts.
     * @param accountId Account id.
     */
    public connectionsServiceDeleteConnectionsAccountsWithHttpInfo(accountId: string, _options?: Configuration): Promise<HttpInfo<Connectionsv3DeleteConnectionsAccountsResponse>> {
        const result = this.api.connectionsServiceDeleteConnectionsAccountsWithHttpInfo(accountId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Delete Connections accounts Description: Delete Connections acccounts.
     * @param accountId Account id.
     */
    public connectionsServiceDeleteConnectionsAccounts(accountId: string, _options?: Configuration): Promise<Connectionsv3DeleteConnectionsAccountsResponse> {
        const result = this.api.connectionsServiceDeleteConnectionsAccounts(accountId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Delete connections configs Description: Delete Connection config by connection id.
     * @param connectionId Connection id.
     */
    public connectionsServiceDeleteConnectionsConfigsWithHttpInfo(connectionId: string, _options?: Configuration): Promise<HttpInfo<Connectionsv3DeleteConnectionsConfigsResponse>> {
        const result = this.api.connectionsServiceDeleteConnectionsConfigsWithHttpInfo(connectionId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Delete connections configs Description: Delete Connection config by connection id.
     * @param connectionId Connection id.
     */
    public connectionsServiceDeleteConnectionsConfigs(connectionId: string, _options?: Configuration): Promise<Connectionsv3DeleteConnectionsConfigsResponse> {
        const result = this.api.connectionsServiceDeleteConnectionsConfigs(connectionId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Delete connector Description: Delete a Connection.
     * @param connectionId The connection id
     */
    public connectionsServiceDeleteConnectorWithHttpInfo(connectionId: string, _options?: Configuration): Promise<HttpInfo<any>> {
        const result = this.api.connectionsServiceDeleteConnectorWithHttpInfo(connectionId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Delete connector Description: Delete a Connection.
     * @param connectionId The connection id
     */
    public connectionsServiceDeleteConnector(connectionId: string, _options?: Configuration): Promise<any> {
        const result = this.api.connectionsServiceDeleteConnector(connectionId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Delete plugin. Description: Delete plugin.
     * @param id plugin id
     */
    public connectionsServiceDeletePluginWithHttpInfo(id: string, _options?: Configuration): Promise<HttpInfo<Connectionsv3DeletePluginResponse>> {
        const result = this.api.connectionsServiceDeletePluginWithHttpInfo(id, _options);
        return result.toPromise();
    }

    /**
     * Summary: Delete plugin. Description: Delete plugin.
     * @param id plugin id
     */
    public connectionsServiceDeletePlugin(id: string, _options?: Configuration): Promise<Connectionsv3DeletePluginResponse> {
        const result = this.api.connectionsServiceDeletePlugin(id, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get banner state for object verb page.  Description: Get banner state for object verb page.
     */
    public connectionsServiceGetBannerStateWithHttpInfo(_options?: Configuration): Promise<HttpInfo<Connectionsv3GetBannerStateResponse>> {
        const result = this.api.connectionsServiceGetBannerStateWithHttpInfo(_options);
        return result.toPromise();
    }

    /**
     * Summary: Get banner state for object verb page.  Description: Get banner state for object verb page.
     */
    public connectionsServiceGetBannerState(_options?: Configuration): Promise<Connectionsv3GetBannerStateResponse> {
        const result = this.api.connectionsServiceGetBannerState(_options);
        return result.toPromise();
    }

    /**
     * Summary: Get Connections accounts Description: Get Connections acccounts.
     * @param accountId Optional: account id.
     * @param accessKey Optional: acccount access key.
     */
    public connectionsServiceGetConnectionsAccountsWithHttpInfo(accountId?: string, accessKey?: string, _options?: Configuration): Promise<HttpInfo<Connectionsv3GetConnectionsAccountsResponse>> {
        const result = this.api.connectionsServiceGetConnectionsAccountsWithHttpInfo(accountId, accessKey, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get Connections accounts Description: Get Connections acccounts.
     * @param accountId Optional: account id.
     * @param accessKey Optional: acccount access key.
     */
    public connectionsServiceGetConnectionsAccounts(accountId?: string, accessKey?: string, _options?: Configuration): Promise<Connectionsv3GetConnectionsAccountsResponse> {
        const result = this.api.connectionsServiceGetConnectionsAccounts(accountId, accessKey, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get connections configs Description: Get Connection config by connection type.
     * @param type The type of connector.
     * @param connectionId Optional: if connection id did not provide then return all connections.
     */
    public connectionsServiceGetConnectionsConfigsWithHttpInfo(type?: 'UNDEFINED_TYPE' | 'AWS' | 'AZURE' | 'UC' | 'STAP', connectionId?: string, _options?: Configuration): Promise<HttpInfo<Connectionsv3GetConnectionsConfigsResponse>> {
        const result = this.api.connectionsServiceGetConnectionsConfigsWithHttpInfo(type, connectionId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get connections configs Description: Get Connection config by connection type.
     * @param type The type of connector.
     * @param connectionId Optional: if connection id did not provide then return all connections.
     */
    public connectionsServiceGetConnectionsConfigs(type?: 'UNDEFINED_TYPE' | 'AWS' | 'AZURE' | 'UC' | 'STAP', connectionId?: string, _options?: Configuration): Promise<Connectionsv3GetConnectionsConfigsResponse> {
        const result = this.api.connectionsServiceGetConnectionsConfigs(type, connectionId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get connections with filters Description: Get connections with filters.
     * @param connectionsv3GetConnectionsWithFiltersRequest 
     */
    public connectionsServiceGetConnectionsWithFiltersWithHttpInfo(connectionsv3GetConnectionsWithFiltersRequest: Connectionsv3GetConnectionsWithFiltersRequest, _options?: Configuration): Promise<HttpInfo<Connectionsv3GetConnectionsWithFiltersResponse>> {
        const result = this.api.connectionsServiceGetConnectionsWithFiltersWithHttpInfo(connectionsv3GetConnectionsWithFiltersRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get connections with filters Description: Get connections with filters.
     * @param connectionsv3GetConnectionsWithFiltersRequest 
     */
    public connectionsServiceGetConnectionsWithFilters(connectionsv3GetConnectionsWithFiltersRequest: Connectionsv3GetConnectionsWithFiltersRequest, _options?: Configuration): Promise<Connectionsv3GetConnectionsWithFiltersResponse> {
        const result = this.api.connectionsServiceGetConnectionsWithFilters(connectionsv3GetConnectionsWithFiltersRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get connectors summary Description: Get a summary of Connectors.
     */
    public connectionsServiceGetConnectorsSummaryWithHttpInfo(_options?: Configuration): Promise<HttpInfo<Connectionsv3GetConnectorsSummaryResponse>> {
        const result = this.api.connectionsServiceGetConnectorsSummaryWithHttpInfo(_options);
        return result.toPromise();
    }

    /**
     * Summary: Get connectors summary Description: Get a summary of Connectors.
     */
    public connectionsServiceGetConnectorsSummary(_options?: Configuration): Promise<Connectionsv3GetConnectorsSummaryResponse> {
        const result = this.api.connectionsServiceGetConnectorsSummary(_options);
        return result.toPromise();
    }

    /**
     * Summary: Get data sources Description: Get a list of data sources.
     */
    public connectionsServiceGetDataSourcesWithHttpInfo(_options?: Configuration): Promise<HttpInfo<Connectionsv3GetDataSourcesResponse>> {
        const result = this.api.connectionsServiceGetDataSourcesWithHttpInfo(_options);
        return result.toPromise();
    }

    /**
     * Summary: Get data sources Description: Get a list of data sources.
     */
    public connectionsServiceGetDataSources(_options?: Configuration): Promise<Connectionsv3GetDataSourcesResponse> {
        const result = this.api.connectionsServiceGetDataSources(_options);
        return result.toPromise();
    }

    /**
     * Summary: Get list of guard record fields.  Description: Get list of guard record fields.
     */
    public connectionsServiceGetGuardRecordFieldsWithHttpInfo(_options?: Configuration): Promise<HttpInfo<Connectionsv3GetGuardRecordFieldsResponse>> {
        const result = this.api.connectionsServiceGetGuardRecordFieldsWithHttpInfo(_options);
        return result.toPromise();
    }

    /**
     * Summary: Get list of guard record fields.  Description: Get list of guard record fields.
     */
    public connectionsServiceGetGuardRecordFields(_options?: Configuration): Promise<Connectionsv3GetGuardRecordFieldsResponse> {
        const result = this.api.connectionsServiceGetGuardRecordFields(_options);
        return result.toPromise();
    }

    /**
     * Summary: Get headers Description: Get a list of Headers.
     */
    public connectionsServiceGetHeadersWithHttpInfo(_options?: Configuration): Promise<HttpInfo<Connectionsv3GetHeadersResponse>> {
        const result = this.api.connectionsServiceGetHeadersWithHttpInfo(_options);
        return result.toPromise();
    }

    /**
     * Summary: Get headers Description: Get a list of Headers.
     */
    public connectionsServiceGetHeaders(_options?: Configuration): Promise<Connectionsv3GetHeadersResponse> {
        const result = this.api.connectionsServiceGetHeaders(_options);
        return result.toPromise();
    }

    /**
     * Summary: Get plugins  Description: Get custom universal connector plugins
     * @param id Optional: if no plug-in id is provided, returns list of all plug-ins.
     */
    public connectionsServiceGetPluginsWithHttpInfo(id?: string, _options?: Configuration): Promise<HttpInfo<Connectionsv3GetPluginsResponse>> {
        const result = this.api.connectionsServiceGetPluginsWithHttpInfo(id, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get plugins  Description: Get custom universal connector plugins
     * @param id Optional: if no plug-in id is provided, returns list of all plug-ins.
     */
    public connectionsServiceGetPlugins(id?: string, _options?: Configuration): Promise<Connectionsv3GetPluginsResponse> {
        const result = this.api.connectionsServiceGetPlugins(id, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get settings Description: Get a list of Settings.
     */
    public connectionsServiceGetSettingsWithHttpInfo(_options?: Configuration): Promise<HttpInfo<Connectionsv3GetSettingsResponse>> {
        const result = this.api.connectionsServiceGetSettingsWithHttpInfo(_options);
        return result.toPromise();
    }

    /**
     * Summary: Get settings Description: Get a list of Settings.
     */
    public connectionsServiceGetSettings(_options?: Configuration): Promise<Connectionsv3GetSettingsResponse> {
        const result = this.api.connectionsServiceGetSettings(_options);
        return result.toPromise();
    }

    /**
     * Summary: Partial update connectors Description: Partial update of Connectors.
     * @param connectionsv3PartialUpdateConnectorsRequest 
     */
    public connectionsServicePartialUpdateConnectorsWithHttpInfo(connectionsv3PartialUpdateConnectorsRequest: Connectionsv3PartialUpdateConnectorsRequest, _options?: Configuration): Promise<HttpInfo<Connectionsv3PartialUpdateConnectorsResponse>> {
        const result = this.api.connectionsServicePartialUpdateConnectorsWithHttpInfo(connectionsv3PartialUpdateConnectorsRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Partial update connectors Description: Partial update of Connectors.
     * @param connectionsv3PartialUpdateConnectorsRequest 
     */
    public connectionsServicePartialUpdateConnectors(connectionsv3PartialUpdateConnectorsRequest: Connectionsv3PartialUpdateConnectorsRequest, _options?: Configuration): Promise<Connectionsv3PartialUpdateConnectorsResponse> {
        const result = this.api.connectionsServicePartialUpdateConnectors(connectionsv3PartialUpdateConnectorsRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Post stap command Description: Send a STAP command down to kafka for snif-assist.
     * @param connectionsv3StapCommandRequest 
     */
    public connectionsServicePostStapCommandWithHttpInfo(connectionsv3StapCommandRequest: Connectionsv3StapCommandRequest, _options?: Configuration): Promise<HttpInfo<Connectionsv3StatusResponseBase>> {
        const result = this.api.connectionsServicePostStapCommandWithHttpInfo(connectionsv3StapCommandRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Post stap command Description: Send a STAP command down to kafka for snif-assist.
     * @param connectionsv3StapCommandRequest 
     */
    public connectionsServicePostStapCommand(connectionsv3StapCommandRequest: Connectionsv3StapCommandRequest, _options?: Configuration): Promise<Connectionsv3StatusResponseBase> {
        const result = this.api.connectionsServicePostStapCommand(connectionsv3StapCommandRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Update banner state for object verb page.  Description: Update banner state for object verb page.
     * @param connectionsv3UpdateBannerStateRequest 
     */
    public connectionsServiceUpdateBannerStateWithHttpInfo(connectionsv3UpdateBannerStateRequest: Connectionsv3UpdateBannerStateRequest, _options?: Configuration): Promise<HttpInfo<Connectionsv3UpdateBannerStateResponse>> {
        const result = this.api.connectionsServiceUpdateBannerStateWithHttpInfo(connectionsv3UpdateBannerStateRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Update banner state for object verb page.  Description: Update banner state for object verb page.
     * @param connectionsv3UpdateBannerStateRequest 
     */
    public connectionsServiceUpdateBannerState(connectionsv3UpdateBannerStateRequest: Connectionsv3UpdateBannerStateRequest, _options?: Configuration): Promise<Connectionsv3UpdateBannerStateResponse> {
        const result = this.api.connectionsServiceUpdateBannerState(connectionsv3UpdateBannerStateRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Update Connections accounts Description: Update Connections acccounts.
     * @param connectionsv3UpdateConnectionsAccountsRequest 
     */
    public connectionsServiceUpdateConnectionsAccountsWithHttpInfo(connectionsv3UpdateConnectionsAccountsRequest: Connectionsv3UpdateConnectionsAccountsRequest, _options?: Configuration): Promise<HttpInfo<Connectionsv3UpdateConnectionsAccountsResponse>> {
        const result = this.api.connectionsServiceUpdateConnectionsAccountsWithHttpInfo(connectionsv3UpdateConnectionsAccountsRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Update Connections accounts Description: Update Connections acccounts.
     * @param connectionsv3UpdateConnectionsAccountsRequest 
     */
    public connectionsServiceUpdateConnectionsAccounts(connectionsv3UpdateConnectionsAccountsRequest: Connectionsv3UpdateConnectionsAccountsRequest, _options?: Configuration): Promise<Connectionsv3UpdateConnectionsAccountsResponse> {
        const result = this.api.connectionsServiceUpdateConnectionsAccounts(connectionsv3UpdateConnectionsAccountsRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Update connections configs Description: Update Connection config by connection id.
     * @param connectionsv3UpdateConnectionsConfigsRequest 
     */
    public connectionsServiceUpdateConnectionsConfigsWithHttpInfo(connectionsv3UpdateConnectionsConfigsRequest: Connectionsv3UpdateConnectionsConfigsRequest, _options?: Configuration): Promise<HttpInfo<Connectionsv3UpdateConnectionsConfigsResponse>> {
        const result = this.api.connectionsServiceUpdateConnectionsConfigsWithHttpInfo(connectionsv3UpdateConnectionsConfigsRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Update connections configs Description: Update Connection config by connection id.
     * @param connectionsv3UpdateConnectionsConfigsRequest 
     */
    public connectionsServiceUpdateConnectionsConfigs(connectionsv3UpdateConnectionsConfigsRequest: Connectionsv3UpdateConnectionsConfigsRequest, _options?: Configuration): Promise<Connectionsv3UpdateConnectionsConfigsResponse> {
        const result = this.api.connectionsServiceUpdateConnectionsConfigs(connectionsv3UpdateConnectionsConfigsRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Update connectors Description: Update a list of Connectors.
     * @param connectionsv3UpdateConnectorsRequest 
     */
    public connectionsServiceUpdateConnectorsWithHttpInfo(connectionsv3UpdateConnectorsRequest: Connectionsv3UpdateConnectorsRequest, _options?: Configuration): Promise<HttpInfo<any>> {
        const result = this.api.connectionsServiceUpdateConnectorsWithHttpInfo(connectionsv3UpdateConnectorsRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Update connectors Description: Update a list of Connectors.
     * @param connectionsv3UpdateConnectorsRequest 
     */
    public connectionsServiceUpdateConnectors(connectionsv3UpdateConnectorsRequest: Connectionsv3UpdateConnectorsRequest, _options?: Configuration): Promise<any> {
        const result = this.api.connectionsServiceUpdateConnectors(connectionsv3UpdateConnectorsRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Update plugin. Description: Update plugin.
     * @param id id
     * @param connectionsv3UpdatePluginRequest 
     */
    public connectionsServiceUpdatePluginWithHttpInfo(id: string, connectionsv3UpdatePluginRequest: Connectionsv3UpdatePluginRequest, _options?: Configuration): Promise<HttpInfo<Connectionsv3UpdatePluginResponse>> {
        const result = this.api.connectionsServiceUpdatePluginWithHttpInfo(id, connectionsv3UpdatePluginRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Update plugin. Description: Update plugin.
     * @param id id
     * @param connectionsv3UpdatePluginRequest 
     */
    public connectionsServiceUpdatePlugin(id: string, connectionsv3UpdatePluginRequest: Connectionsv3UpdatePluginRequest, _options?: Configuration): Promise<Connectionsv3UpdatePluginResponse> {
        const result = this.api.connectionsServiceUpdatePlugin(id, connectionsv3UpdatePluginRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Update settings Description: Update Settings.
     * @param connectionsv3UpdateSettingsRequest 
     */
    public connectionsServiceUpdateSettingsWithHttpInfo(connectionsv3UpdateSettingsRequest: Connectionsv3UpdateSettingsRequest, _options?: Configuration): Promise<HttpInfo<any>> {
        const result = this.api.connectionsServiceUpdateSettingsWithHttpInfo(connectionsv3UpdateSettingsRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Update settings Description: Update Settings.
     * @param connectionsv3UpdateSettingsRequest 
     */
    public connectionsServiceUpdateSettings(connectionsv3UpdateSettingsRequest: Connectionsv3UpdateSettingsRequest, _options?: Configuration): Promise<any> {
        const result = this.api.connectionsServiceUpdateSettings(connectionsv3UpdateSettingsRequest, _options);
        return result.toPromise();
    }


}



import { ObservableDashboardsServiceApi } from './ObservableAPI';

import { DashboardsServiceApiRequestFactory, DashboardsServiceApiResponseProcessor} from "../apis/DashboardsServiceApi";
export class PromiseDashboardsServiceApi {
    private api: ObservableDashboardsServiceApi

    public constructor(
        configuration: Configuration,
        requestFactory?: DashboardsServiceApiRequestFactory,
        responseProcessor?: DashboardsServiceApiResponseProcessor
    ) {
        this.api = new ObservableDashboardsServiceApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Summary: Create dashboard Description: Create a unique dashboard.
     * @param dashboardsv3Dashboard Unique dashboard.
     */
    public dashboardsServiceCreateDashboardWithHttpInfo(dashboardsv3Dashboard: Dashboardsv3Dashboard, _options?: Configuration): Promise<HttpInfo<Dashboardsv3CreateDashboardResponse>> {
        const result = this.api.dashboardsServiceCreateDashboardWithHttpInfo(dashboardsv3Dashboard, _options);
        return result.toPromise();
    }

    /**
     * Summary: Create dashboard Description: Create a unique dashboard.
     * @param dashboardsv3Dashboard Unique dashboard.
     */
    public dashboardsServiceCreateDashboard(dashboardsv3Dashboard: Dashboardsv3Dashboard, _options?: Configuration): Promise<Dashboardsv3CreateDashboardResponse> {
        const result = this.api.dashboardsServiceCreateDashboard(dashboardsv3Dashboard, _options);
        return result.toPromise();
    }

    /**
     * Summary: Delete dashboard Description: Delete a unique dashboard.
     * @param dashboardId The id of the dashboard to be deleted.
     * @param dashboardsv3DeleteDashboardRequest 
     */
    public dashboardsServiceDeleteDashboardWithHttpInfo(dashboardId: string, dashboardsv3DeleteDashboardRequest: Dashboardsv3DeleteDashboardRequest, _options?: Configuration): Promise<HttpInfo<Dashboardsv3DeleteDashboardResponse>> {
        const result = this.api.dashboardsServiceDeleteDashboardWithHttpInfo(dashboardId, dashboardsv3DeleteDashboardRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Delete dashboard Description: Delete a unique dashboard.
     * @param dashboardId The id of the dashboard to be deleted.
     * @param dashboardsv3DeleteDashboardRequest 
     */
    public dashboardsServiceDeleteDashboard(dashboardId: string, dashboardsv3DeleteDashboardRequest: Dashboardsv3DeleteDashboardRequest, _options?: Configuration): Promise<Dashboardsv3DeleteDashboardResponse> {
        const result = this.api.dashboardsServiceDeleteDashboard(dashboardId, dashboardsv3DeleteDashboardRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get dashboards Description: Get a list of dashboards with all data.
     */
    public dashboardsServiceGetDashboardsWithHttpInfo(_options?: Configuration): Promise<HttpInfo<Dashboardsv3GetDashboardsResponse>> {
        const result = this.api.dashboardsServiceGetDashboardsWithHttpInfo(_options);
        return result.toPromise();
    }

    /**
     * Summary: Get dashboards Description: Get a list of dashboards with all data.
     */
    public dashboardsServiceGetDashboards(_options?: Configuration): Promise<Dashboardsv3GetDashboardsResponse> {
        const result = this.api.dashboardsServiceGetDashboards(_options);
        return result.toPromise();
    }

    /**
     * Summary: Update dashboard Description: Update a dashboard.
     * @param dashboardId The id of the dashboard that was updated.
     * @param dashboardsv3UpdateDashboardRequest 
     */
    public dashboardsServiceUpdateDashboardWithHttpInfo(dashboardId: string, dashboardsv3UpdateDashboardRequest: Dashboardsv3UpdateDashboardRequest, _options?: Configuration): Promise<HttpInfo<Dashboardsv3UpdateDashboardResponse>> {
        const result = this.api.dashboardsServiceUpdateDashboardWithHttpInfo(dashboardId, dashboardsv3UpdateDashboardRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Update dashboard Description: Update a dashboard.
     * @param dashboardId The id of the dashboard that was updated.
     * @param dashboardsv3UpdateDashboardRequest 
     */
    public dashboardsServiceUpdateDashboard(dashboardId: string, dashboardsv3UpdateDashboardRequest: Dashboardsv3UpdateDashboardRequest, _options?: Configuration): Promise<Dashboardsv3UpdateDashboardResponse> {
        const result = this.api.dashboardsServiceUpdateDashboard(dashboardId, dashboardsv3UpdateDashboardRequest, _options);
        return result.toPromise();
    }


}



import { ObservableDataMovementsApi } from './ObservableAPI';

import { DataMovementsApiRequestFactory, DataMovementsApiResponseProcessor} from "../apis/DataMovementsApi";
export class PromiseDataMovementsApi {
    private api: ObservableDataMovementsApi

    public constructor(
        configuration: Configuration,
        requestFactory?: DataMovementsApiRequestFactory,
        responseProcessor?: DataMovementsApiResponseProcessor
    ) {
        this.api = new ObservableDataMovementsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Get a detailed information about an actual flow by providing its ID.
     * Get actual flow by providing its ID
     * @param id 
     */
    public getActualFlowWithHttpInfo(id: string, _options?: Configuration): Promise<HttpInfo<ActualFlow>> {
        const result = this.api.getActualFlowWithHttpInfo(id, _options);
        return result.toPromise();
    }

    /**
     * Get a detailed information about an actual flow by providing its ID.
     * Get actual flow by providing its ID
     * @param id 
     */
    public getActualFlow(id: string, _options?: Configuration): Promise<ActualFlow> {
        const result = this.api.getActualFlow(id, _options);
        return result.toPromise();
    }

    /**
     * Get a summary of all the actual flows discovered by Guardium DSPM, that is, details about source and destination, and other information.
     * Get summary of actual flows
     * @param filter 
     */
    public getActualFlowsSummaryWithHttpInfo(filter?: ListActualFlowsFilterParameter, _options?: Configuration): Promise<HttpInfo<ActualFlowsSummary>> {
        const result = this.api.getActualFlowsSummaryWithHttpInfo(filter, _options);
        return result.toPromise();
    }

    /**
     * Get a summary of all the actual flows discovered by Guardium DSPM, that is, details about source and destination, and other information.
     * Get summary of actual flows
     * @param filter 
     */
    public getActualFlowsSummary(filter?: ListActualFlowsFilterParameter, _options?: Configuration): Promise<ActualFlowsSummary> {
        const result = this.api.getActualFlowsSummary(filter, _options);
        return result.toPromise();
    }

    /**
     * Get a detailed information about a potential flow by providing the flow ID.
     * Get potential flow by providing its ID
     * @param flowId 
     */
    public getPotentialFlowWithHttpInfo(flowId: string, _options?: Configuration): Promise<HttpInfo<PotentialFlow>> {
        const result = this.api.getPotentialFlowWithHttpInfo(flowId, _options);
        return result.toPromise();
    }

    /**
     * Get a detailed information about a potential flow by providing the flow ID.
     * Get potential flow by providing its ID
     * @param flowId 
     */
    public getPotentialFlow(flowId: string, _options?: Configuration): Promise<PotentialFlow> {
        const result = this.api.getPotentialFlow(flowId, _options);
        return result.toPromise();
    }

    /**
     * Get details of a specific potential flow of data by providing its ID.
     * Get potential flow path by providing its ID
     * @param flowPathId 
     */
    public getPotentialFlowPathWithHttpInfo(flowPathId: string, _options?: Configuration): Promise<HttpInfo<PotentialFlowPath>> {
        const result = this.api.getPotentialFlowPathWithHttpInfo(flowPathId, _options);
        return result.toPromise();
    }

    /**
     * Get details of a specific potential flow of data by providing its ID.
     * Get potential flow path by providing its ID
     * @param flowPathId 
     */
    public getPotentialFlowPath(flowPathId: string, _options?: Configuration): Promise<PotentialFlowPath> {
        const result = this.api.getPotentialFlowPath(flowPathId, _options);
        return result.toPromise();
    }

    /**
     * Get a summary of all the potential flows based on a filter applied.
     * Get summary of potential flows according to the filter applied
     * @param filter 
     */
    public getPotentialFlowsSummaryWithHttpInfo(filter?: PotentialFlowsFilterOptions, _options?: Configuration): Promise<HttpInfo<PotentialFlowsSummary>> {
        const result = this.api.getPotentialFlowsSummaryWithHttpInfo(filter, _options);
        return result.toPromise();
    }

    /**
     * Get a summary of all the potential flows based on a filter applied.
     * Get summary of potential flows according to the filter applied
     * @param filter 
     */
    public getPotentialFlowsSummary(filter?: PotentialFlowsFilterOptions, _options?: Configuration): Promise<PotentialFlowsSummary> {
        const result = this.api.getPotentialFlowsSummary(filter, _options);
        return result.toPromise();
    }

    /**
     * Get detailed information about the actual flows according to the filter applied.
     * Get summary of actual flows according to the filter applied
     * @param sort 
     * @param filter 
     * @param pageSize 
     * @param nextToken 
     */
    public listActualFlowPathsWithHttpInfo(sort?: ListActualFlowPathsSortParameter, filter?: ListActualFlowPathsFilterParameter, pageSize?: number, nextToken?: string, _options?: Configuration): Promise<HttpInfo<ListActualFlowPaths200Response>> {
        const result = this.api.listActualFlowPathsWithHttpInfo(sort, filter, pageSize, nextToken, _options);
        return result.toPromise();
    }

    /**
     * Get detailed information about the actual flows according to the filter applied.
     * Get summary of actual flows according to the filter applied
     * @param sort 
     * @param filter 
     * @param pageSize 
     * @param nextToken 
     */
    public listActualFlowPaths(sort?: ListActualFlowPathsSortParameter, filter?: ListActualFlowPathsFilterParameter, pageSize?: number, nextToken?: string, _options?: Configuration): Promise<ListActualFlowPaths200Response> {
        const result = this.api.listActualFlowPaths(sort, filter, pageSize, nextToken, _options);
        return result.toPromise();
    }

    /**
     * List all the actual flows (based on logs) of users and services across your entire cloud accounts and SasS applications.
     * List actual flows
     * @param sort 
     * @param filter 
     * @param pageSize 
     * @param nextToken 
     */
    public listActualFlowsWithHttpInfo(sort?: ListActualFlowsSortParameter, filter?: ListActualFlowsFilterParameter, pageSize?: number, nextToken?: string, _options?: Configuration): Promise<HttpInfo<ListActualFlows200Response>> {
        const result = this.api.listActualFlowsWithHttpInfo(sort, filter, pageSize, nextToken, _options);
        return result.toPromise();
    }

    /**
     * List all the actual flows (based on logs) of users and services across your entire cloud accounts and SasS applications.
     * List actual flows
     * @param sort 
     * @param filter 
     * @param pageSize 
     * @param nextToken 
     */
    public listActualFlows(sort?: ListActualFlowsSortParameter, filter?: ListActualFlowsFilterParameter, pageSize?: number, nextToken?: string, _options?: Configuration): Promise<ListActualFlows200Response> {
        const result = this.api.listActualFlows(sort, filter, pageSize, nextToken, _options);
        return result.toPromise();
    }

    /**
     * List all the potential flows of users and services across your entire cloud accounts and SaaS applications.
     * List potential flows
     * @param filter 
     * @param pageSize 
     * @param nextToken 
     */
    public listPotentialFlowsWithHttpInfo(filter?: PotentialFlowsFilterOptions, pageSize?: number, nextToken?: string, _options?: Configuration): Promise<HttpInfo<ListPotentialFlows200Response>> {
        const result = this.api.listPotentialFlowsWithHttpInfo(filter, pageSize, nextToken, _options);
        return result.toPromise();
    }

    /**
     * List all the potential flows of users and services across your entire cloud accounts and SaaS applications.
     * List potential flows
     * @param filter 
     * @param pageSize 
     * @param nextToken 
     */
    public listPotentialFlows(filter?: PotentialFlowsFilterOptions, pageSize?: number, nextToken?: string, _options?: Configuration): Promise<ListPotentialFlows200Response> {
        const result = this.api.listPotentialFlows(filter, pageSize, nextToken, _options);
        return result.toPromise();
    }

    /**
     * List all the potential flow paths based on an applied filter.
     * List potential flow paths
     * @param filter 
     * @param pageSize 
     * @param nextToken 
     */
    public listPotentialFlowsPathsWithHttpInfo(filter?: PotentialFlowsPathsFilterOptions, pageSize?: number, nextToken?: string, _options?: Configuration): Promise<HttpInfo<ListPotentialFlowsPaths200Response>> {
        const result = this.api.listPotentialFlowsPathsWithHttpInfo(filter, pageSize, nextToken, _options);
        return result.toPromise();
    }

    /**
     * List all the potential flow paths based on an applied filter.
     * List potential flow paths
     * @param filter 
     * @param pageSize 
     * @param nextToken 
     */
    public listPotentialFlowsPaths(filter?: PotentialFlowsPathsFilterOptions, pageSize?: number, nextToken?: string, _options?: Configuration): Promise<ListPotentialFlowsPaths200Response> {
        const result = this.api.listPotentialFlowsPaths(filter, pageSize, nextToken, _options);
        return result.toPromise();
    }


}



import { ObservableDataResourcesApi } from './ObservableAPI';

import { DataResourcesApiRequestFactory, DataResourcesApiResponseProcessor} from "../apis/DataResourcesApi";
export class PromiseDataResourcesApi {
    private api: ObservableDataResourcesApi

    public constructor(
        configuration: Configuration,
        requestFactory?: DataResourcesApiRequestFactory,
        responseProcessor?: DataResourcesApiResponseProcessor
    ) {
        this.api = new ObservableDataResourcesApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Get additional details on a specific data resource by providing its ID.
     * Get a specific data resource by its ID
     * @param dataResourceId Data resource ID
     */
    public getDataResourceWithHttpInfo(dataResourceId: string, _options?: Configuration): Promise<HttpInfo<DataResource>> {
        const result = this.api.getDataResourceWithHttpInfo(dataResourceId, _options);
        return result.toPromise();
    }

    /**
     * Get additional details on a specific data resource by providing its ID.
     * Get a specific data resource by its ID
     * @param dataResourceId Data resource ID
     */
    public getDataResource(dataResourceId: string, _options?: Configuration): Promise<DataResource> {
        const result = this.api.getDataResource(dataResourceId, _options);
        return result.toPromise();
    }

    /**
     * Get a summary of all the data resource, that is, number of data resources, types of data resources, and other information.
     * Data resources summary
     * @param dataStoreId Data store id
     * @param filter 
     */
    public getDataResourcesSummaryWithHttpInfo(dataStoreId?: string, filter?: ListDataResourcesFilterParameter, _options?: Configuration): Promise<HttpInfo<DataResourcesSummary>> {
        const result = this.api.getDataResourcesSummaryWithHttpInfo(dataStoreId, filter, _options);
        return result.toPromise();
    }

    /**
     * Get a summary of all the data resource, that is, number of data resources, types of data resources, and other information.
     * Data resources summary
     * @param dataStoreId Data store id
     * @param filter 
     */
    public getDataResourcesSummary(dataStoreId?: string, filter?: ListDataResourcesFilterParameter, _options?: Configuration): Promise<DataResourcesSummary> {
        const result = this.api.getDataResourcesSummary(dataStoreId, filter, _options);
        return result.toPromise();
    }

    /**
     * Get a list of data resources based on the filter applied. You can filter by data store ID, data resource ID, data resource name, and more.<BR><B>Note:</B> Filter needs to be HTML encoded.
     * List data resources that match a given filter
     * @param dataStoreId 
     * @param filter 
     * @param sort 
     * @param pageSize 
     * @param nextToken 
     */
    public listDataResourcesWithHttpInfo(dataStoreId?: string, filter?: ListDataResourcesFilterParameter, sort?: ListDataResourcesSortParameter, pageSize?: number, nextToken?: string, _options?: Configuration): Promise<HttpInfo<ListDataResources200Response>> {
        const result = this.api.listDataResourcesWithHttpInfo(dataStoreId, filter, sort, pageSize, nextToken, _options);
        return result.toPromise();
    }

    /**
     * Get a list of data resources based on the filter applied. You can filter by data store ID, data resource ID, data resource name, and more.<BR><B>Note:</B> Filter needs to be HTML encoded.
     * List data resources that match a given filter
     * @param dataStoreId 
     * @param filter 
     * @param sort 
     * @param pageSize 
     * @param nextToken 
     */
    public listDataResources(dataStoreId?: string, filter?: ListDataResourcesFilterParameter, sort?: ListDataResourcesSortParameter, pageSize?: number, nextToken?: string, _options?: Configuration): Promise<ListDataResources200Response> {
        const result = this.api.listDataResources(dataStoreId, filter, sort, pageSize, nextToken, _options);
        return result.toPromise();
    }

    /**
     * List and filter data resources by their names
     * List names of data resources
     * @param prefix Prefix of data resource name
     * @param dataStoreId 
     */
    public listDataResourcesNamesWithHttpInfo(prefix: string, dataStoreId?: string, _options?: Configuration): Promise<HttpInfo<Array<string>>> {
        const result = this.api.listDataResourcesNamesWithHttpInfo(prefix, dataStoreId, _options);
        return result.toPromise();
    }

    /**
     * List and filter data resources by their names
     * List names of data resources
     * @param prefix Prefix of data resource name
     * @param dataStoreId 
     */
    public listDataResourcesNames(prefix: string, dataStoreId?: string, _options?: Configuration): Promise<Array<string>> {
        const result = this.api.listDataResourcesNames(prefix, dataStoreId, _options);
        return result.toPromise();
    }

    /**
     * Removes a resource, with all its sensitivities, from Guardium DSPM dashboard. This action does not remove the resource from the resource\'s source environment.
     * Remove resource from DSPM
     * @param dataResourceId Data resource ID
     * @param dataStoreId Data store ID
     */
    public removeResourceWithHttpInfo(dataResourceId: string, dataStoreId: string, _options?: Configuration): Promise<HttpInfo<RemoveResource200Response>> {
        const result = this.api.removeResourceWithHttpInfo(dataResourceId, dataStoreId, _options);
        return result.toPromise();
    }

    /**
     * Removes a resource, with all its sensitivities, from Guardium DSPM dashboard. This action does not remove the resource from the resource\'s source environment.
     * Remove resource from DSPM
     * @param dataResourceId Data resource ID
     * @param dataStoreId Data store ID
     */
    public removeResource(dataResourceId: string, dataStoreId: string, _options?: Configuration): Promise<RemoveResource200Response> {
        const result = this.api.removeResource(dataResourceId, dataStoreId, _options);
        return result.toPromise();
    }

    /**
     * Set the review status of a specific data resource in a specific data store.
     * Set review status of a data resource
     * @param dataResourceId Data resource id
     * @param updateResourceReviewBody 
     */
    public updateResourceReviewStatusWithHttpInfo(dataResourceId: string, updateResourceReviewBody: UpdateResourceReviewBody, _options?: Configuration): Promise<HttpInfo<UpdateResourceReviewStatus200Response>> {
        const result = this.api.updateResourceReviewStatusWithHttpInfo(dataResourceId, updateResourceReviewBody, _options);
        return result.toPromise();
    }

    /**
     * Set the review status of a specific data resource in a specific data store.
     * Set review status of a data resource
     * @param dataResourceId Data resource id
     * @param updateResourceReviewBody 
     */
    public updateResourceReviewStatus(dataResourceId: string, updateResourceReviewBody: UpdateResourceReviewBody, _options?: Configuration): Promise<UpdateResourceReviewStatus200Response> {
        const result = this.api.updateResourceReviewStatus(dataResourceId, updateResourceReviewBody, _options);
        return result.toPromise();
    }


}



import { ObservableDataSensitivitiesApi } from './ObservableAPI';

import { DataSensitivitiesApiRequestFactory, DataSensitivitiesApiResponseProcessor} from "../apis/DataSensitivitiesApi";
export class PromiseDataSensitivitiesApi {
    private api: ObservableDataSensitivitiesApi

    public constructor(
        configuration: Configuration,
        requestFactory?: DataSensitivitiesApiRequestFactory,
        responseProcessor?: DataSensitivitiesApiResponseProcessor
    ) {
        this.api = new ObservableDataSensitivitiesApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Get a summarised information about all sensitivities classified by Guardium DSPM.
     * Get the summary of sensitivities
     * @param filter 
     */
    public getSensitivitiesSummaryWithHttpInfo(filter?: ListSensitivitiesFilterParameter, _options?: Configuration): Promise<HttpInfo<SensitivitiesSummary>> {
        const result = this.api.getSensitivitiesSummaryWithHttpInfo(filter, _options);
        return result.toPromise();
    }

    /**
     * Get a summarised information about all sensitivities classified by Guardium DSPM.
     * Get the summary of sensitivities
     * @param filter 
     */
    public getSensitivitiesSummary(filter?: ListSensitivitiesFilterParameter, _options?: Configuration): Promise<SensitivitiesSummary> {
        const result = this.api.getSensitivitiesSummary(filter, _options);
        return result.toPromise();
    }

    /**
     * Get details of a sensitivity by providing its ID.
     * Get sensitivity details by providing its ID
     * @param sensitivityId 
     */
    public getSensitivityWithHttpInfo(sensitivityId: string, _options?: Configuration): Promise<HttpInfo<Sensitivity>> {
        const result = this.api.getSensitivityWithHttpInfo(sensitivityId, _options);
        return result.toPromise();
    }

    /**
     * Get details of a sensitivity by providing its ID.
     * Get sensitivity details by providing its ID
     * @param sensitivityId 
     */
    public getSensitivity(sensitivityId: string, _options?: Configuration): Promise<Sensitivity> {
        const result = this.api.getSensitivity(sensitivityId, _options);
        return result.toPromise();
    }

    /**
     * Get a list of all the sensitivities based on an applied filter.
     * List sensitivities
     * @param filter 
     * @param sort 
     * @param pageSize 
     * @param nextToken 
     */
    public listSensitivitiesWithHttpInfo(filter?: ListSensitivitiesFilterParameter, sort?: LastSeenSortSchema, pageSize?: number, nextToken?: string, _options?: Configuration): Promise<HttpInfo<ListSensitivities200Response>> {
        const result = this.api.listSensitivitiesWithHttpInfo(filter, sort, pageSize, nextToken, _options);
        return result.toPromise();
    }

    /**
     * Get a list of all the sensitivities based on an applied filter.
     * List sensitivities
     * @param filter 
     * @param sort 
     * @param pageSize 
     * @param nextToken 
     */
    public listSensitivities(filter?: ListSensitivitiesFilterParameter, sort?: LastSeenSortSchema, pageSize?: number, nextToken?: string, _options?: Configuration): Promise<ListSensitivities200Response> {
        const result = this.api.listSensitivities(filter, sort, pageSize, nextToken, _options);
        return result.toPromise();
    }


}



import { ObservableDataStoresApi } from './ObservableAPI';

import { DataStoresApiRequestFactory, DataStoresApiResponseProcessor} from "../apis/DataStoresApi";
export class PromiseDataStoresApi {
    private api: ObservableDataStoresApi

    public constructor(
        configuration: Configuration,
        requestFactory?: DataStoresApiRequestFactory,
        responseProcessor?: DataStoresApiResponseProcessor
    ) {
        this.api = new ObservableDataStoresApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Get details of a specific data store by its ID.
     * Get a data store by its ID
     * @param dataStoreId ID of the data store
     */
    public getDataStoreWithHttpInfo(dataStoreId: string, _options?: Configuration): Promise<HttpInfo<DataStore>> {
        const result = this.api.getDataStoreWithHttpInfo(dataStoreId, _options);
        return result.toPromise();
    }

    /**
     * Get details of a specific data store by its ID.
     * Get a data store by its ID
     * @param dataStoreId ID of the data store
     */
    public getDataStore(dataStoreId: string, _options?: Configuration): Promise<DataStore> {
        const result = this.api.getDataStore(dataStoreId, _options);
        return result.toPromise();
    }

    /**
     * Get a summary of all the data stores, that is, name of data resources, types of data stores, and other information.
     * Get summary of data stores
     * @param filter 
     */
    public getDataStoresSummaryWithHttpInfo(filter?: ListDataStoresFilterParameter, _options?: Configuration): Promise<HttpInfo<DataStoresSummary>> {
        const result = this.api.getDataStoresSummaryWithHttpInfo(filter, _options);
        return result.toPromise();
    }

    /**
     * Get a summary of all the data stores, that is, name of data resources, types of data stores, and other information.
     * Get summary of data stores
     * @param filter 
     */
    public getDataStoresSummary(filter?: ListDataStoresFilterParameter, _options?: Configuration): Promise<DataStoresSummary> {
        const result = this.api.getDataStoresSummary(filter, _options);
        return result.toPromise();
    }

    /**
     * Get a list of all the labels of custom data stores.
     * List labels of data stores.
     * @param prefix Prefix of data store label
     * @param maxResults 
     */
    public listAllDataStoresLabelsWithHttpInfo(prefix?: string, maxResults?: number, _options?: Configuration): Promise<HttpInfo<Array<string>>> {
        const result = this.api.listAllDataStoresLabelsWithHttpInfo(prefix, maxResults, _options);
        return result.toPromise();
    }

    /**
     * Get a list of all the labels of custom data stores.
     * List labels of data stores.
     * @param prefix Prefix of data store label
     * @param maxResults 
     */
    public listAllDataStoresLabels(prefix?: string, maxResults?: number, _options?: Configuration): Promise<Array<string>> {
        const result = this.api.listAllDataStoresLabels(prefix, maxResults, _options);
        return result.toPromise();
    }

    /**
     * List all data stores discovered by Guardium DSPM.
     * List data stores
     * @param filter 
     * @param sort 
     * @param pageSize 
     * @param nextToken 
     */
    public listDataStoresWithHttpInfo(filter?: ListDataStoresFilterParameter, sort?: ListDataStoresSortParameter, pageSize?: number, nextToken?: string, _options?: Configuration): Promise<HttpInfo<ListDataStores200Response>> {
        const result = this.api.listDataStoresWithHttpInfo(filter, sort, pageSize, nextToken, _options);
        return result.toPromise();
    }

    /**
     * List all data stores discovered by Guardium DSPM.
     * List data stores
     * @param filter 
     * @param sort 
     * @param pageSize 
     * @param nextToken 
     */
    public listDataStores(filter?: ListDataStoresFilterParameter, sort?: ListDataStoresSortParameter, pageSize?: number, nextToken?: string, _options?: Configuration): Promise<ListDataStores200Response> {
        const result = this.api.listDataStores(filter, sort, pageSize, nextToken, _options);
        return result.toPromise();
    }

    /**
     * Get a list of the available cloud tag keys of data stores that can be filtered on the basis of prefixes.
     * List the cloud tag keys of data stores that can be filtered on the basis of prefixes.
     * @param prefix Prefix of cloud tag key
     * @param maxResults 
     */
    public listDataStoresCloudTagsKeysWithHttpInfo(prefix: string, maxResults?: number, _options?: Configuration): Promise<HttpInfo<Array<string>>> {
        const result = this.api.listDataStoresCloudTagsKeysWithHttpInfo(prefix, maxResults, _options);
        return result.toPromise();
    }

    /**
     * Get a list of the available cloud tag keys of data stores that can be filtered on the basis of prefixes.
     * List the cloud tag keys of data stores that can be filtered on the basis of prefixes.
     * @param prefix Prefix of cloud tag key
     * @param maxResults 
     */
    public listDataStoresCloudTagsKeys(prefix: string, maxResults?: number, _options?: Configuration): Promise<Array<string>> {
        const result = this.api.listDataStoresCloudTagsKeys(prefix, maxResults, _options);
        return result.toPromise();
    }

    /**
     * Get a list of the available cloud tag values of data stores that can be filtered on the basis of prefixes and cloud tag key names.
     * List the cloud tag values of data stores that can be filtered on the basis of prefixes and cloud tag key names.
     * @param prefix Prefix of cloud tag value
     * @param tagKey 
     * @param maxResults 
     */
    public listDataStoresCloudTagsValuesWithHttpInfo(prefix: string, tagKey: string, maxResults?: number, _options?: Configuration): Promise<HttpInfo<Array<string>>> {
        const result = this.api.listDataStoresCloudTagsValuesWithHttpInfo(prefix, tagKey, maxResults, _options);
        return result.toPromise();
    }

    /**
     * Get a list of the available cloud tag values of data stores that can be filtered on the basis of prefixes and cloud tag key names.
     * List the cloud tag values of data stores that can be filtered on the basis of prefixes and cloud tag key names.
     * @param prefix Prefix of cloud tag value
     * @param tagKey 
     * @param maxResults 
     */
    public listDataStoresCloudTagsValues(prefix: string, tagKey: string, maxResults?: number, _options?: Configuration): Promise<Array<string>> {
        const result = this.api.listDataStoresCloudTagsValues(prefix, tagKey, maxResults, _options);
        return result.toPromise();
    }

    /**
     * Lists the data stores that can be filtered or classified.
     * List name of filterable data stores
     * @param prefix Prefix of data store name
     */
    public listDataStoresNamesWithHttpInfo(prefix: string, _options?: Configuration): Promise<HttpInfo<Array<string>>> {
        const result = this.api.listDataStoresNamesWithHttpInfo(prefix, _options);
        return result.toPromise();
    }

    /**
     * Lists the data stores that can be filtered or classified.
     * List name of filterable data stores
     * @param prefix Prefix of data store name
     */
    public listDataStoresNames(prefix: string, _options?: Configuration): Promise<Array<string>> {
        const result = this.api.listDataStoresNames(prefix, _options);
        return result.toPromise();
    }

    /**
     * Post the request for a data store rescan.
     * Post data store rescan request
     * @param rescanDataStoreRequest 
     */
    public rescanDataStoreWithHttpInfo(rescanDataStoreRequest: RescanDataStoreRequest, _options?: Configuration): Promise<HttpInfo<void>> {
        const result = this.api.rescanDataStoreWithHttpInfo(rescanDataStoreRequest, _options);
        return result.toPromise();
    }

    /**
     * Post the request for a data store rescan.
     * Post data store rescan request
     * @param rescanDataStoreRequest 
     */
    public rescanDataStore(rescanDataStoreRequest: RescanDataStoreRequest, _options?: Configuration): Promise<void> {
        const result = this.api.rescanDataStore(rescanDataStoreRequest, _options);
        return result.toPromise();
    }

    /**
     * Add or update a custom label for a data store.
     * Label a data store with an existing or new label
     * @param dataStoreId Data store ID
     * @param setDataStoreLabelRequest 
     */
    public setDataStoreLabelWithHttpInfo(dataStoreId: string, setDataStoreLabelRequest: SetDataStoreLabelRequest, _options?: Configuration): Promise<HttpInfo<void>> {
        const result = this.api.setDataStoreLabelWithHttpInfo(dataStoreId, setDataStoreLabelRequest, _options);
        return result.toPromise();
    }

    /**
     * Add or update a custom label for a data store.
     * Label a data store with an existing or new label
     * @param dataStoreId Data store ID
     * @param setDataStoreLabelRequest 
     */
    public setDataStoreLabel(dataStoreId: string, setDataStoreLabelRequest: SetDataStoreLabelRequest, _options?: Configuration): Promise<void> {
        const result = this.api.setDataStoreLabel(dataStoreId, setDataStoreLabelRequest, _options);
        return result.toPromise();
    }

    /**
     * Add or update the name of a specific data store.
     * Update the name of a Data store custodian
     * @param updateCustodianBody 
     */
    public updateDatastoreCustodianWithHttpInfo(updateCustodianBody: UpdateCustodianBody, _options?: Configuration): Promise<HttpInfo<UpdateDatastoreCustodian200Response>> {
        const result = this.api.updateDatastoreCustodianWithHttpInfo(updateCustodianBody, _options);
        return result.toPromise();
    }

    /**
     * Add or update the name of a specific data store.
     * Update the name of a Data store custodian
     * @param updateCustodianBody 
     */
    public updateDatastoreCustodian(updateCustodianBody: UpdateCustodianBody, _options?: Configuration): Promise<UpdateDatastoreCustodian200Response> {
        const result = this.api.updateDatastoreCustodian(updateCustodianBody, _options);
        return result.toPromise();
    }


}



import { ObservableDataVulnerabilitiesApi } from './ObservableAPI';

import { DataVulnerabilitiesApiRequestFactory, DataVulnerabilitiesApiResponseProcessor} from "../apis/DataVulnerabilitiesApi";
export class PromiseDataVulnerabilitiesApi {
    private api: ObservableDataVulnerabilitiesApi

    public constructor(
        configuration: Configuration,
        requestFactory?: DataVulnerabilitiesApiRequestFactory,
        responseProcessor?: DataVulnerabilitiesApiResponseProcessor
    ) {
        this.api = new ObservableDataVulnerabilitiesApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Add or update the status comment of a vulnerability status to keep track of the workflow progress.
     * Add vulnerability status comment
     * @param vulnerabilityId 
     * @param statusId 
     * @param addCommentBody 
     */
    public addVulnerabilityStatusCommentWithHttpInfo(vulnerabilityId: string, statusId: string, addCommentBody: AddCommentBody, _options?: Configuration): Promise<HttpInfo<VulnerabilityStatus>> {
        const result = this.api.addVulnerabilityStatusCommentWithHttpInfo(vulnerabilityId, statusId, addCommentBody, _options);
        return result.toPromise();
    }

    /**
     * Add or update the status comment of a vulnerability status to keep track of the workflow progress.
     * Add vulnerability status comment
     * @param vulnerabilityId 
     * @param statusId 
     * @param addCommentBody 
     */
    public addVulnerabilityStatusComment(vulnerabilityId: string, statusId: string, addCommentBody: AddCommentBody, _options?: Configuration): Promise<VulnerabilityStatus> {
        const result = this.api.addVulnerabilityStatusComment(vulnerabilityId, statusId, addCommentBody, _options);
        return result.toPromise();
    }

    /**
     * Get a summary of all the vulnerabilities. You can also filter the results of the vulnerabilities based on the vulnerebility\'s type, threat, status, and so on.<BR><B>Note:</B> Filter needs to be HTML Encoded.
     * Get vulnerabilities summary
     * @param filter 
     */
    public getVulnerabilitiesSummaryWithHttpInfo(filter?: VulnerabilitiesFilterOptions, _options?: Configuration): Promise<HttpInfo<VulnerabilitiesSummary>> {
        const result = this.api.getVulnerabilitiesSummaryWithHttpInfo(filter, _options);
        return result.toPromise();
    }

    /**
     * Get a summary of all the vulnerabilities. You can also filter the results of the vulnerabilities based on the vulnerebility\'s type, threat, status, and so on.<BR><B>Note:</B> Filter needs to be HTML Encoded.
     * Get vulnerabilities summary
     * @param filter 
     */
    public getVulnerabilitiesSummary(filter?: VulnerabilitiesFilterOptions, _options?: Configuration): Promise<VulnerabilitiesSummary> {
        const result = this.api.getVulnerabilitiesSummary(filter, _options);
        return result.toPromise();
    }

    /**
     * Get vulnerability details by providing its ID.
     * Get vulnerability details by ID
     * @param vulnerabilityId 
     */
    public getVulnerabilityWithHttpInfo(vulnerabilityId: string, _options?: Configuration): Promise<HttpInfo<Vulnerability>> {
        const result = this.api.getVulnerabilityWithHttpInfo(vulnerabilityId, _options);
        return result.toPromise();
    }

    /**
     * Get vulnerability details by providing its ID.
     * Get vulnerability details by ID
     * @param vulnerabilityId 
     */
    public getVulnerability(vulnerabilityId: string, _options?: Configuration): Promise<Vulnerability> {
        const result = this.api.getVulnerability(vulnerabilityId, _options);
        return result.toPromise();
    }

    /**
     * Get a list of data vulnerabilities based on a filter applied. You can filter by ID of the vulnerability, type of the vulnerability, and so on.<BR><B>Note:</B> Filter needs to be HTML encoded.
     * List vulnerabilities based on an applied filter
     * @param filter 
     * @param sort 
     * @param pageSize 
     * @param nextToken 
     */
    public listVulnerabilitiesWithHttpInfo(filter?: VulnerabilitiesFilterOptions, sort?: ListVulnerabilitiesSortParameter, pageSize?: number, nextToken?: string, _options?: Configuration): Promise<HttpInfo<ListVulnerabilities200Response>> {
        const result = this.api.listVulnerabilitiesWithHttpInfo(filter, sort, pageSize, nextToken, _options);
        return result.toPromise();
    }

    /**
     * Get a list of data vulnerabilities based on a filter applied. You can filter by ID of the vulnerability, type of the vulnerability, and so on.<BR><B>Note:</B> Filter needs to be HTML encoded.
     * List vulnerabilities based on an applied filter
     * @param filter 
     * @param sort 
     * @param pageSize 
     * @param nextToken 
     */
    public listVulnerabilities(filter?: VulnerabilitiesFilterOptions, sort?: ListVulnerabilitiesSortParameter, pageSize?: number, nextToken?: string, _options?: Configuration): Promise<ListVulnerabilities200Response> {
        const result = this.api.listVulnerabilities(filter, sort, pageSize, nextToken, _options);
        return result.toPromise();
    }

    /**
     * Get a list of all the vulnerabilities of data stores.
     * List vulnerabilities of data stores
     * @param filter 
     * @param sort 
     * @param pageSize 
     * @param nextToken 
     */
    public listVulnerabilitiesByDataStoreWithHttpInfo(filter?: VulnerabilitiesByDataStoreFilterOptions, sort?: ListVulnerabilitiesByDataStoreSortParameter, pageSize?: number, nextToken?: string, _options?: Configuration): Promise<HttpInfo<ListVulnerabilitiesByDataStore200Response>> {
        const result = this.api.listVulnerabilitiesByDataStoreWithHttpInfo(filter, sort, pageSize, nextToken, _options);
        return result.toPromise();
    }

    /**
     * Get a list of all the vulnerabilities of data stores.
     * List vulnerabilities of data stores
     * @param filter 
     * @param sort 
     * @param pageSize 
     * @param nextToken 
     */
    public listVulnerabilitiesByDataStore(filter?: VulnerabilitiesByDataStoreFilterOptions, sort?: ListVulnerabilitiesByDataStoreSortParameter, pageSize?: number, nextToken?: string, _options?: Configuration): Promise<ListVulnerabilitiesByDataStore200Response> {
        const result = this.api.listVulnerabilitiesByDataStore(filter, sort, pageSize, nextToken, _options);
        return result.toPromise();
    }

    /**
     * Delete a status comment of a vulnerability status.
     * Delete vulnerability status comment
     * @param vulnerabilityId 
     * @param statusId 
     * @param commentId 
     */
    public removeVulnerabilityStatusCommentWithHttpInfo(vulnerabilityId: string, statusId: string, commentId: string, _options?: Configuration): Promise<HttpInfo<void>> {
        const result = this.api.removeVulnerabilityStatusCommentWithHttpInfo(vulnerabilityId, statusId, commentId, _options);
        return result.toPromise();
    }

    /**
     * Delete a status comment of a vulnerability status.
     * Delete vulnerability status comment
     * @param vulnerabilityId 
     * @param statusId 
     * @param commentId 
     */
    public removeVulnerabilityStatusComment(vulnerabilityId: string, statusId: string, commentId: string, _options?: Configuration): Promise<void> {
        const result = this.api.removeVulnerabilityStatusComment(vulnerabilityId, statusId, commentId, _options);
        return result.toPromise();
    }

    /**
     * Add or update the status of a vulnerability to track its progress.
     * Set status of a vulnerability
     * @param vulnerabilityId 
     * @param setVulnerabilityStatusRequest 
     */
    public setVulnerabilityStatusWithHttpInfo(vulnerabilityId: string, setVulnerabilityStatusRequest: SetVulnerabilityStatusRequest, _options?: Configuration): Promise<HttpInfo<VulnerabilityStatus>> {
        const result = this.api.setVulnerabilityStatusWithHttpInfo(vulnerabilityId, setVulnerabilityStatusRequest, _options);
        return result.toPromise();
    }

    /**
     * Add or update the status of a vulnerability to track its progress.
     * Set status of a vulnerability
     * @param vulnerabilityId 
     * @param setVulnerabilityStatusRequest 
     */
    public setVulnerabilityStatus(vulnerabilityId: string, setVulnerabilityStatusRequest: SetVulnerabilityStatusRequest, _options?: Configuration): Promise<VulnerabilityStatus> {
        const result = this.api.setVulnerabilityStatus(vulnerabilityId, setVulnerabilityStatusRequest, _options);
        return result.toPromise();
    }

    /**
     * Set a vulnerability status of a vulnerability.
     * Set vulnerability status
     * @param vulnerabilityId 
     * @param statusId 
     * @param commentId 
     * @param updateCommentBody 
     */
    public updateVulnerabilityStatusCommentWithHttpInfo(vulnerabilityId: string, statusId: string, commentId: string, updateCommentBody: UpdateCommentBody, _options?: Configuration): Promise<HttpInfo<VulnerabilityStatusComment>> {
        const result = this.api.updateVulnerabilityStatusCommentWithHttpInfo(vulnerabilityId, statusId, commentId, updateCommentBody, _options);
        return result.toPromise();
    }

    /**
     * Set a vulnerability status of a vulnerability.
     * Set vulnerability status
     * @param vulnerabilityId 
     * @param statusId 
     * @param commentId 
     * @param updateCommentBody 
     */
    public updateVulnerabilityStatusComment(vulnerabilityId: string, statusId: string, commentId: string, updateCommentBody: UpdateCommentBody, _options?: Configuration): Promise<VulnerabilityStatusComment> {
        const result = this.api.updateVulnerabilityStatusComment(vulnerabilityId, statusId, commentId, updateCommentBody, _options);
        return result.toPromise();
    }


}



import { ObservableDatabootstrapperServiceApi } from './ObservableAPI';

import { DatabootstrapperServiceApiRequestFactory, DatabootstrapperServiceApiResponseProcessor} from "../apis/DatabootstrapperServiceApi";
export class PromiseDatabootstrapperServiceApi {
    private api: ObservableDatabootstrapperServiceApi

    public constructor(
        configuration: Configuration,
        requestFactory?: DatabootstrapperServiceApiRequestFactory,
        responseProcessor?: DatabootstrapperServiceApiResponseProcessor
    ) {
        this.api = new ObservableDatabootstrapperServiceApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Summary: Load data Description: Load data for a tenant.
     * @param databootstrapperv3LoadDataRequest 
     */
    public databootstrapperServiceLoadDataWithHttpInfo(databootstrapperv3LoadDataRequest: Databootstrapperv3LoadDataRequest, _options?: Configuration): Promise<HttpInfo<Databootstrapperv3LoadDataResponse>> {
        const result = this.api.databootstrapperServiceLoadDataWithHttpInfo(databootstrapperv3LoadDataRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Load data Description: Load data for a tenant.
     * @param databootstrapperv3LoadDataRequest 
     */
    public databootstrapperServiceLoadData(databootstrapperv3LoadDataRequest: Databootstrapperv3LoadDataRequest, _options?: Configuration): Promise<Databootstrapperv3LoadDataResponse> {
        const result = this.api.databootstrapperServiceLoadData(databootstrapperv3LoadDataRequest, _options);
        return result.toPromise();
    }


}



import { ObservableDatamartProcessorServiceApi } from './ObservableAPI';

import { DatamartProcessorServiceApiRequestFactory, DatamartProcessorServiceApiResponseProcessor} from "../apis/DatamartProcessorServiceApi";
export class PromiseDatamartProcessorServiceApi {
    private api: ObservableDatamartProcessorServiceApi

    public constructor(
        configuration: Configuration,
        requestFactory?: DatamartProcessorServiceApiRequestFactory,
        responseProcessor?: DatamartProcessorServiceApiResponseProcessor
    ) {
        this.api = new ObservableDatamartProcessorServiceApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Summary: Get datamarts Description: Return a list of files inside a datamart to the caller.
     * @param ingestionId Ingestion id.
     */
    public datamartProcessorServiceGetDatamartInfoWithHttpInfo(ingestionId?: string, _options?: Configuration): Promise<HttpInfo<Datamartprocessorv3GetDatamartInfoResponse>> {
        const result = this.api.datamartProcessorServiceGetDatamartInfoWithHttpInfo(ingestionId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get datamarts Description: Return a list of files inside a datamart to the caller.
     * @param ingestionId Ingestion id.
     */
    public datamartProcessorServiceGetDatamartInfo(ingestionId?: string, _options?: Configuration): Promise<Datamartprocessorv3GetDatamartInfoResponse> {
        const result = this.api.datamartProcessorServiceGetDatamartInfo(ingestionId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get datamarts Description: Return a list of datamarts for a time interval to the caller.
     * @param periodStart Data starting time period in UTC.
     * @param periodEnd Data ending time period in UTC.
     */
    public datamartProcessorServiceGetDatamartsWithHttpInfo(periodStart?: Date, periodEnd?: Date, _options?: Configuration): Promise<HttpInfo<Datamartprocessorv3GetDatamartResponse>> {
        const result = this.api.datamartProcessorServiceGetDatamartsWithHttpInfo(periodStart, periodEnd, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get datamarts Description: Return a list of datamarts for a time interval to the caller.
     * @param periodStart Data starting time period in UTC.
     * @param periodEnd Data ending time period in UTC.
     */
    public datamartProcessorServiceGetDatamarts(periodStart?: Date, periodEnd?: Date, _options?: Configuration): Promise<Datamartprocessorv3GetDatamartResponse> {
        const result = this.api.datamartProcessorServiceGetDatamarts(periodStart, periodEnd, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get rarliest start time Description: Return the earliest time period of data available in database.
     */
    public datamartProcessorServiceGetEarliestStartTimeWithHttpInfo(_options?: Configuration): Promise<HttpInfo<Datamartprocessorv3GetEarliestStartTimeResponse>> {
        const result = this.api.datamartProcessorServiceGetEarliestStartTimeWithHttpInfo(_options);
        return result.toPromise();
    }

    /**
     * Summary: Get rarliest start time Description: Return the earliest time period of data available in database.
     */
    public datamartProcessorServiceGetEarliestStartTime(_options?: Configuration): Promise<Datamartprocessorv3GetEarliestStartTimeResponse> {
        const result = this.api.datamartProcessorServiceGetEarliestStartTime(_options);
        return result.toPromise();
    }

    /**
     * @param body 
     */
    public datamartProcessorServiceSendAllCompleteFilesToQueueWithHttpInfo(body: any, _options?: Configuration): Promise<HttpInfo<Datamartprocessorv3StatusResponseBase>> {
        const result = this.api.datamartProcessorServiceSendAllCompleteFilesToQueueWithHttpInfo(body, _options);
        return result.toPromise();
    }

    /**
     * @param body 
     */
    public datamartProcessorServiceSendAllCompleteFilesToQueue(body: any, _options?: Configuration): Promise<Datamartprocessorv3StatusResponseBase> {
        const result = this.api.datamartProcessorServiceSendAllCompleteFilesToQueue(body, _options);
        return result.toPromise();
    }

    /**
     * Summary: Store extraction logs Description: Store the datamart extraction logs inside GI.
     * @param requestId Request id which co-relates to request.
     * @param datamartprocessorv3DMExtractionLogsRequest 
     */
    public datamartProcessorServiceStoreExtractionLogsWithHttpInfo(requestId: string, datamartprocessorv3DMExtractionLogsRequest: Datamartprocessorv3DMExtractionLogsRequest, _options?: Configuration): Promise<HttpInfo<Datamartprocessorv3DMExtractionLogsResponse>> {
        const result = this.api.datamartProcessorServiceStoreExtractionLogsWithHttpInfo(requestId, datamartprocessorv3DMExtractionLogsRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Store extraction logs Description: Store the datamart extraction logs inside GI.
     * @param requestId Request id which co-relates to request.
     * @param datamartprocessorv3DMExtractionLogsRequest 
     */
    public datamartProcessorServiceStoreExtractionLogs(requestId: string, datamartprocessorv3DMExtractionLogsRequest: Datamartprocessorv3DMExtractionLogsRequest, _options?: Configuration): Promise<Datamartprocessorv3DMExtractionLogsResponse> {
        const result = this.api.datamartProcessorServiceStoreExtractionLogs(requestId, datamartprocessorv3DMExtractionLogsRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Upload datamart Description: Upload datamart file for ingestion.
     * @param file The file to upload.
     */
    public uploadDatamartWithHttpInfo(file: HttpFile, _options?: Configuration): Promise<HttpInfo<void>> {
        const result = this.api.uploadDatamartWithHttpInfo(file, _options);
        return result.toPromise();
    }

    /**
     * Summary: Upload datamart Description: Upload datamart file for ingestion.
     * @param file The file to upload.
     */
    public uploadDatamart(file: HttpFile, _options?: Configuration): Promise<void> {
        const result = this.api.uploadDatamart(file, _options);
        return result.toPromise();
    }


}



import { ObservableEcosystemServiceApi } from './ObservableAPI';

import { EcosystemServiceApiRequestFactory, EcosystemServiceApiResponseProcessor} from "../apis/EcosystemServiceApi";
export class PromiseEcosystemServiceApi {
    private api: ObservableEcosystemServiceApi

    public constructor(
        configuration: Configuration,
        requestFactory?: EcosystemServiceApiRequestFactory,
        responseProcessor?: EcosystemServiceApiResponseProcessor
    ) {
        this.api = new ObservableEcosystemServiceApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Summary: Create dataset Description: Save a definition in the database.
     * @param ecosystemv3CreateDatasetRequest 
     */
    public ecosystemServiceCreateDatasetWithHttpInfo(ecosystemv3CreateDatasetRequest: Ecosystemv3CreateDatasetRequest, _options?: Configuration): Promise<HttpInfo<Ecosystemv3CreateDatasetResponse>> {
        const result = this.api.ecosystemServiceCreateDatasetWithHttpInfo(ecosystemv3CreateDatasetRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Create dataset Description: Save a definition in the database.
     * @param ecosystemv3CreateDatasetRequest 
     */
    public ecosystemServiceCreateDataset(ecosystemv3CreateDatasetRequest: Ecosystemv3CreateDatasetRequest, _options?: Configuration): Promise<Ecosystemv3CreateDatasetResponse> {
        const result = this.api.ecosystemServiceCreateDataset(ecosystemv3CreateDatasetRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Data insert Description: Process Data received from webhook API and insert.
     * @param datasetName Data set target name.
     * @param ecosystemv3DataInsertRequest 
     */
    public ecosystemServiceDataInsertWithHttpInfo(datasetName: string, ecosystemv3DataInsertRequest: Ecosystemv3DataInsertRequest, _options?: Configuration): Promise<HttpInfo<Ecosystemv3DataInsertResponse>> {
        const result = this.api.ecosystemServiceDataInsertWithHttpInfo(datasetName, ecosystemv3DataInsertRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Data insert Description: Process Data received from webhook API and insert.
     * @param datasetName Data set target name.
     * @param ecosystemv3DataInsertRequest 
     */
    public ecosystemServiceDataInsert(datasetName: string, ecosystemv3DataInsertRequest: Ecosystemv3DataInsertRequest, _options?: Configuration): Promise<Ecosystemv3DataInsertResponse> {
        const result = this.api.ecosystemServiceDataInsert(datasetName, ecosystemv3DataInsertRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Delete datasets Description: Delete an array of datasets.
     * @param datasetNames Name of the dataset, required field.
     */
    public ecosystemServiceDeleteDatasetsWithHttpInfo(datasetNames?: Array<string>, _options?: Configuration): Promise<HttpInfo<Ecosystemv3DeleteDatasetsResponse>> {
        const result = this.api.ecosystemServiceDeleteDatasetsWithHttpInfo(datasetNames, _options);
        return result.toPromise();
    }

    /**
     * Summary: Delete datasets Description: Delete an array of datasets.
     * @param datasetNames Name of the dataset, required field.
     */
    public ecosystemServiceDeleteDatasets(datasetNames?: Array<string>, _options?: Configuration): Promise<Ecosystemv3DeleteDatasetsResponse> {
        const result = this.api.ecosystemServiceDeleteDatasets(datasetNames, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get dataset data Description: Return data report for a given dataset.
     * @param datasetName Name of the dataset.
     * @param offset The amount to offset the rows by for pagination.
     * @param limit The max amount of rows to return for pagination.
     * @param returnHeader If needs to return header information. It is for pagination. The first page needs header, the rest doesn\&#39;t need.
     * @param field Search field.
     * @param value Search value.
     * @param sortField Field to sort.
     * @param sortOrder Sort order.
     */
    public ecosystemServiceGetDatasetDataWithHttpInfo(datasetName: string, offset?: number, limit?: number, returnHeader?: boolean, field?: string, value?: string, sortField?: string, sortOrder?: 'NONE' | 'ASC' | 'DESC', _options?: Configuration): Promise<HttpInfo<Ecosystemv3GetDatasetDataResponse>> {
        const result = this.api.ecosystemServiceGetDatasetDataWithHttpInfo(datasetName, offset, limit, returnHeader, field, value, sortField, sortOrder, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get dataset data Description: Return data report for a given dataset.
     * @param datasetName Name of the dataset.
     * @param offset The amount to offset the rows by for pagination.
     * @param limit The max amount of rows to return for pagination.
     * @param returnHeader If needs to return header information. It is for pagination. The first page needs header, the rest doesn\&#39;t need.
     * @param field Search field.
     * @param value Search value.
     * @param sortField Field to sort.
     * @param sortOrder Sort order.
     */
    public ecosystemServiceGetDatasetData(datasetName: string, offset?: number, limit?: number, returnHeader?: boolean, field?: string, value?: string, sortField?: string, sortOrder?: 'NONE' | 'ASC' | 'DESC', _options?: Configuration): Promise<Ecosystemv3GetDatasetDataResponse> {
        const result = this.api.ecosystemServiceGetDatasetData(datasetName, offset, limit, returnHeader, field, value, sortField, sortOrder, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get dataset detail Description: Return detail on a dataset definition.
     * @param datasetName Name of the dataset.
     */
    public ecosystemServiceGetDatasetDetailWithHttpInfo(datasetName: string, _options?: Configuration): Promise<HttpInfo<Ecosystemv3GetDatasetDetailResponse>> {
        const result = this.api.ecosystemServiceGetDatasetDetailWithHttpInfo(datasetName, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get dataset detail Description: Return detail on a dataset definition.
     * @param datasetName Name of the dataset.
     */
    public ecosystemServiceGetDatasetDetail(datasetName: string, _options?: Configuration): Promise<Ecosystemv3GetDatasetDetailResponse> {
        const result = this.api.ecosystemServiceGetDatasetDetail(datasetName, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get datasets Description: Return dataset list that matches the specified filter.
     * @param filterStartTime Return datasets created at this time or later (&gt;&#x3D;).
     * @param filterEndTime Return datasets created before this time (&lt;).
     * @param filterDatasetNames The state filter groups commonly paired states. Only returns records that include the specified names.
     * @param offset The amount to offset the rows by for pagination.
     * @param limit The max amount of rows to return for pagination.
     * @param includeFilterCounts Computing the filter counts is relatively expensive, only compute when needed.
     */
    public ecosystemServiceGetDatasetsWithHttpInfo(filterStartTime?: Date, filterEndTime?: Date, filterDatasetNames?: Array<string>, offset?: number, limit?: number, includeFilterCounts?: boolean, _options?: Configuration): Promise<HttpInfo<Ecosystemv3GetDatasetsResponse>> {
        const result = this.api.ecosystemServiceGetDatasetsWithHttpInfo(filterStartTime, filterEndTime, filterDatasetNames, offset, limit, includeFilterCounts, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get datasets Description: Return dataset list that matches the specified filter.
     * @param filterStartTime Return datasets created at this time or later (&gt;&#x3D;).
     * @param filterEndTime Return datasets created before this time (&lt;).
     * @param filterDatasetNames The state filter groups commonly paired states. Only returns records that include the specified names.
     * @param offset The amount to offset the rows by for pagination.
     * @param limit The max amount of rows to return for pagination.
     * @param includeFilterCounts Computing the filter counts is relatively expensive, only compute when needed.
     */
    public ecosystemServiceGetDatasets(filterStartTime?: Date, filterEndTime?: Date, filterDatasetNames?: Array<string>, offset?: number, limit?: number, includeFilterCounts?: boolean, _options?: Configuration): Promise<Ecosystemv3GetDatasetsResponse> {
        const result = this.api.ecosystemServiceGetDatasets(filterStartTime, filterEndTime, filterDatasetNames, offset, limit, includeFilterCounts, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get purgable rows Description: Check the number of rows that can be purged.
     * @param ecosystemv3GetPurgableRowsRequest 
     */
    public ecosystemServiceGetPurgableRowsWithHttpInfo(ecosystemv3GetPurgableRowsRequest: Ecosystemv3GetPurgableRowsRequest, _options?: Configuration): Promise<HttpInfo<Ecosystemv3GetPurgableRowsResponse>> {
        const result = this.api.ecosystemServiceGetPurgableRowsWithHttpInfo(ecosystemv3GetPurgableRowsRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get purgable rows Description: Check the number of rows that can be purged.
     * @param ecosystemv3GetPurgableRowsRequest 
     */
    public ecosystemServiceGetPurgableRows(ecosystemv3GetPurgableRowsRequest: Ecosystemv3GetPurgableRowsRequest, _options?: Configuration): Promise<Ecosystemv3GetPurgableRowsResponse> {
        const result = this.api.ecosystemServiceGetPurgableRows(ecosystemv3GetPurgableRowsRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Purge data Description: Purge data.
     * @param datasetNames Name of the datasets, required field.
     */
    public ecosystemServicePurgeDataWithHttpInfo(datasetNames?: Array<string>, _options?: Configuration): Promise<HttpInfo<Ecosystemv3PurgeDataResponse>> {
        const result = this.api.ecosystemServicePurgeDataWithHttpInfo(datasetNames, _options);
        return result.toPromise();
    }

    /**
     * Summary: Purge data Description: Purge data.
     * @param datasetNames Name of the datasets, required field.
     */
    public ecosystemServicePurgeData(datasetNames?: Array<string>, _options?: Configuration): Promise<Ecosystemv3PurgeDataResponse> {
        const result = this.api.ecosystemServicePurgeData(datasetNames, _options);
        return result.toPromise();
    }


}



import { ObservableFeatureFlagsServiceApi } from './ObservableAPI';

import { FeatureFlagsServiceApiRequestFactory, FeatureFlagsServiceApiResponseProcessor} from "../apis/FeatureFlagsServiceApi";
export class PromiseFeatureFlagsServiceApi {
    private api: ObservableFeatureFlagsServiceApi

    public constructor(
        configuration: Configuration,
        requestFactory?: FeatureFlagsServiceApiRequestFactory,
        responseProcessor?: FeatureFlagsServiceApiResponseProcessor
    ) {
        this.api = new ObservableFeatureFlagsServiceApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Summary: Delete feature Flag overrides Description: Delete feature Flag overrides from database.
     * @param flagName Flag name.
     * @param tenantId Optional tenant id.
     */
    public featureFlagsServiceDeleteFeatureFlagOverridesWithHttpInfo(flagName?: string, tenantId?: string, _options?: Configuration): Promise<HttpInfo<Featureflagsv3DeleteFeatureFlagOverridesResponse>> {
        const result = this.api.featureFlagsServiceDeleteFeatureFlagOverridesWithHttpInfo(flagName, tenantId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Delete feature Flag overrides Description: Delete feature Flag overrides from database.
     * @param flagName Flag name.
     * @param tenantId Optional tenant id.
     */
    public featureFlagsServiceDeleteFeatureFlagOverrides(flagName?: string, tenantId?: string, _options?: Configuration): Promise<Featureflagsv3DeleteFeatureFlagOverridesResponse> {
        const result = this.api.featureFlagsServiceDeleteFeatureFlagOverrides(flagName, tenantId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get feature Flag overrides Description: Get feature Flag overrides by Feature Flag Name.
     * @param tenantId Optional tenant id.
     * @param flagNames Optional flag names; if empty then return all flag.
     */
    public featureFlagsServiceGetFeatureFlagOverridesWithHttpInfo(tenantId?: string, flagNames?: Array<string>, _options?: Configuration): Promise<HttpInfo<Featureflagsv3GetFeatureFlagOverridesResponse>> {
        const result = this.api.featureFlagsServiceGetFeatureFlagOverridesWithHttpInfo(tenantId, flagNames, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get feature Flag overrides Description: Get feature Flag overrides by Feature Flag Name.
     * @param tenantId Optional tenant id.
     * @param flagNames Optional flag names; if empty then return all flag.
     */
    public featureFlagsServiceGetFeatureFlagOverrides(tenantId?: string, flagNames?: Array<string>, _options?: Configuration): Promise<Featureflagsv3GetFeatureFlagOverridesResponse> {
        const result = this.api.featureFlagsServiceGetFeatureFlagOverrides(tenantId, flagNames, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get feature flags Description: Get feature flags by Feature Flag Name.
     * @param tenantId Tenant id.
     * @param flagNames Optional flag names; if empty then return all flag.
     */
    public featureFlagsServiceGetFeatureFlagsWithHttpInfo(tenantId?: string, flagNames?: Array<string>, _options?: Configuration): Promise<HttpInfo<Featureflagsv3GetFeatureFlagsResponse>> {
        const result = this.api.featureFlagsServiceGetFeatureFlagsWithHttpInfo(tenantId, flagNames, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get feature flags Description: Get feature flags by Feature Flag Name.
     * @param tenantId Tenant id.
     * @param flagNames Optional flag names; if empty then return all flag.
     */
    public featureFlagsServiceGetFeatureFlags(tenantId?: string, flagNames?: Array<string>, _options?: Configuration): Promise<Featureflagsv3GetFeatureFlagsResponse> {
        const result = this.api.featureFlagsServiceGetFeatureFlags(tenantId, flagNames, _options);
        return result.toPromise();
    }

    /**
     * Summary: Update feature Flag overrides Description: Update feature Flag overrides in the database.
     * @param featureflagsv3UpdateFeatureFlagOverridesRequest 
     */
    public featureFlagsServiceUpdateFeatureFlagOverridesWithHttpInfo(featureflagsv3UpdateFeatureFlagOverridesRequest: Featureflagsv3UpdateFeatureFlagOverridesRequest, _options?: Configuration): Promise<HttpInfo<Featureflagsv3UpdateFeatureFlagOverridesResponse>> {
        const result = this.api.featureFlagsServiceUpdateFeatureFlagOverridesWithHttpInfo(featureflagsv3UpdateFeatureFlagOverridesRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Update feature Flag overrides Description: Update feature Flag overrides in the database.
     * @param featureflagsv3UpdateFeatureFlagOverridesRequest 
     */
    public featureFlagsServiceUpdateFeatureFlagOverrides(featureflagsv3UpdateFeatureFlagOverridesRequest: Featureflagsv3UpdateFeatureFlagOverridesRequest, _options?: Configuration): Promise<Featureflagsv3UpdateFeatureFlagOverridesResponse> {
        const result = this.api.featureFlagsServiceUpdateFeatureFlagOverrides(featureflagsv3UpdateFeatureFlagOverridesRequest, _options);
        return result.toPromise();
    }


}



import { ObservableGroupBuilderApi } from './ObservableAPI';

import { GroupBuilderApiRequestFactory, GroupBuilderApiResponseProcessor} from "../apis/GroupBuilderApi";
export class PromiseGroupBuilderApi {
    private api: ObservableGroupBuilderApi

    public constructor(
        configuration: Configuration,
        requestFactory?: GroupBuilderApiRequestFactory,
        responseProcessor?: GroupBuilderApiResponseProcessor
    ) {
        this.api = new ObservableGroupBuilderApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Summary: Cancel import group Description: Cancel import refresh for selected groups.
     * @param groupIds Group IDs to delete.
     */
    public groupBuilderCancelImportGroupWithHttpInfo(groupIds?: Array<number>, _options?: Configuration): Promise<HttpInfo<Groupbuilderv3CancelGroupImportResponse>> {
        const result = this.api.groupBuilderCancelImportGroupWithHttpInfo(groupIds, _options);
        return result.toPromise();
    }

    /**
     * Summary: Cancel import group Description: Cancel import refresh for selected groups.
     * @param groupIds Group IDs to delete.
     */
    public groupBuilderCancelImportGroup(groupIds?: Array<number>, _options?: Configuration): Promise<Groupbuilderv3CancelGroupImportResponse> {
        const result = this.api.groupBuilderCancelImportGroup(groupIds, _options);
        return result.toPromise();
    }

    /**
     * Summary: Create group Description: Create new groups.
     * @param groupbuilderv3CreateGroupRequest 
     */
    public groupBuilderCreateGroupWithHttpInfo(groupbuilderv3CreateGroupRequest: Groupbuilderv3CreateGroupRequest, _options?: Configuration): Promise<HttpInfo<Groupbuilderv3CreateGroupResponse>> {
        const result = this.api.groupBuilderCreateGroupWithHttpInfo(groupbuilderv3CreateGroupRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Create group Description: Create new groups.
     * @param groupbuilderv3CreateGroupRequest 
     */
    public groupBuilderCreateGroup(groupbuilderv3CreateGroupRequest: Groupbuilderv3CreateGroupRequest, _options?: Configuration): Promise<Groupbuilderv3CreateGroupResponse> {
        const result = this.api.groupBuilderCreateGroup(groupbuilderv3CreateGroupRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Delete group Description: Delete specified groups if the group ID is not used for reports.
     * @param groupIds Group IDs to delete.
     */
    public groupBuilderDeleteGroupWithHttpInfo(groupIds?: Array<number>, _options?: Configuration): Promise<HttpInfo<Groupbuilderv3DeleteGroupResponse>> {
        const result = this.api.groupBuilderDeleteGroupWithHttpInfo(groupIds, _options);
        return result.toPromise();
    }

    /**
     * Summary: Delete group Description: Delete specified groups if the group ID is not used for reports.
     * @param groupIds Group IDs to delete.
     */
    public groupBuilderDeleteGroup(groupIds?: Array<number>, _options?: Configuration): Promise<Groupbuilderv3DeleteGroupResponse> {
        const result = this.api.groupBuilderDeleteGroup(groupIds, _options);
        return result.toPromise();
    }

    /**
     * Summary: Edit group Description: Add or delete group members.
     * @param groupId Group ID.
     * @param groupbuilderv3EditGroupRequest 
     */
    public groupBuilderEditGroupWithHttpInfo(groupId: number, groupbuilderv3EditGroupRequest: Groupbuilderv3EditGroupRequest, _options?: Configuration): Promise<HttpInfo<Groupbuilderv3EditGroupResponse>> {
        const result = this.api.groupBuilderEditGroupWithHttpInfo(groupId, groupbuilderv3EditGroupRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Edit group Description: Add or delete group members.
     * @param groupId Group ID.
     * @param groupbuilderv3EditGroupRequest 
     */
    public groupBuilderEditGroup(groupId: number, groupbuilderv3EditGroupRequest: Groupbuilderv3EditGroupRequest, _options?: Configuration): Promise<Groupbuilderv3EditGroupResponse> {
        const result = this.api.groupBuilderEditGroup(groupId, groupbuilderv3EditGroupRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Export group Description: Export group content to a file based on a group ID.
     * @param groupbuilderv3GetExportGroupRequest 
     */
    public groupBuilderExportGroupWithHttpInfo(groupbuilderv3GetExportGroupRequest: Groupbuilderv3GetExportGroupRequest, _options?: Configuration): Promise<HttpInfo<Groupbuilderv3GetExportGroupResponse>> {
        const result = this.api.groupBuilderExportGroupWithHttpInfo(groupbuilderv3GetExportGroupRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Export group Description: Export group content to a file based on a group ID.
     * @param groupbuilderv3GetExportGroupRequest 
     */
    public groupBuilderExportGroup(groupbuilderv3GetExportGroupRequest: Groupbuilderv3GetExportGroupRequest, _options?: Configuration): Promise<Groupbuilderv3GetExportGroupResponse> {
        const result = this.api.groupBuilderExportGroup(groupbuilderv3GetExportGroupRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get group details Description: Get details of group specified by group ID.
     * @param groupId Group ID.
     * @param filter Filter by group member name.
     * @param order Order by ascending (ASC) or descending (DESC).
     */
    public groupBuilderGetGroupDetailsWithHttpInfo(groupId: number, filter?: string, order?: string, _options?: Configuration): Promise<HttpInfo<Groupbuilderv3GetGroupDetailResponse>> {
        const result = this.api.groupBuilderGetGroupDetailsWithHttpInfo(groupId, filter, order, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get group details Description: Get details of group specified by group ID.
     * @param groupId Group ID.
     * @param filter Filter by group member name.
     * @param order Order by ascending (ASC) or descending (DESC).
     */
    public groupBuilderGetGroupDetails(groupId: number, filter?: string, order?: string, _options?: Configuration): Promise<Groupbuilderv3GetGroupDetailResponse> {
        const result = this.api.groupBuilderGetGroupDetails(groupId, filter, order, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get group members Description: Get members of all the group ids provided in the request. To be consumed by policy builder ms.
     * @param groupbuilderv3GetGroupMembersRequest 
     */
    public groupBuilderGetGroupMembersWithHttpInfo(groupbuilderv3GetGroupMembersRequest: Groupbuilderv3GetGroupMembersRequest, _options?: Configuration): Promise<HttpInfo<Groupbuilderv3GetGroupMembersResponse>> {
        const result = this.api.groupBuilderGetGroupMembersWithHttpInfo(groupbuilderv3GetGroupMembersRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get group members Description: Get members of all the group ids provided in the request. To be consumed by policy builder ms.
     * @param groupbuilderv3GetGroupMembersRequest 
     */
    public groupBuilderGetGroupMembers(groupbuilderv3GetGroupMembersRequest: Groupbuilderv3GetGroupMembersRequest, _options?: Configuration): Promise<Groupbuilderv3GetGroupMembersResponse> {
        const result = this.api.groupBuilderGetGroupMembers(groupbuilderv3GetGroupMembersRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get gdp to gi group mapping Description: Get insights to gdp group sync mapping.
     * @param centralManagerId Central manager.
     */
    public groupBuilderGetGroupSyncMappingWithHttpInfo(centralManagerId?: string, _options?: Configuration): Promise<HttpInfo<Groupbuilderv3GetGroupSyncMappingResponse>> {
        const result = this.api.groupBuilderGetGroupSyncMappingWithHttpInfo(centralManagerId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get gdp to gi group mapping Description: Get insights to gdp group sync mapping.
     * @param centralManagerId Central manager.
     */
    public groupBuilderGetGroupSyncMapping(centralManagerId?: string, _options?: Configuration): Promise<Groupbuilderv3GetGroupSyncMappingResponse> {
        const result = this.api.groupBuilderGetGroupSyncMapping(centralManagerId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get group type mapping Description: Get insights to gdp group types mapping.
     */
    public groupBuilderGetGroupTypeMappingWithHttpInfo(_options?: Configuration): Promise<HttpInfo<Groupbuilderv3GetGroupTypeMappingResponse>> {
        const result = this.api.groupBuilderGetGroupTypeMappingWithHttpInfo(_options);
        return result.toPromise();
    }

    /**
     * Summary: Get group type mapping Description: Get insights to gdp group types mapping.
     */
    public groupBuilderGetGroupTypeMapping(_options?: Configuration): Promise<Groupbuilderv3GetGroupTypeMappingResponse> {
        const result = this.api.groupBuilderGetGroupTypeMapping(_options);
        return result.toPromise();
    }

    /**
     * Summary: Get group types Description: Get a list of available group types.
     */
    public groupBuilderGetGroupTypesWithHttpInfo(_options?: Configuration): Promise<HttpInfo<Groupbuilderv3GetGroupTypesResponse>> {
        const result = this.api.groupBuilderGetGroupTypesWithHttpInfo(_options);
        return result.toPromise();
    }

    /**
     * Summary: Get group types Description: Get a list of available group types.
     */
    public groupBuilderGetGroupTypes(_options?: Configuration): Promise<Groupbuilderv3GetGroupTypesResponse> {
        const result = this.api.groupBuilderGetGroupTypes(_options);
        return result.toPromise();
    }

    /**
     * Summary: Get groups Description: Get a list of imported group members.
     * @param doNotIncludeMemberCount Return group names, ID\&#39;s, type ID\&#39;s, nested bool, and tuple count only if the flag is true.
     * @param onlyFullAccess Only return groups that user has full-access to.
     * @param nonNested Only return non-nested groups.
     */
    public groupBuilderGetGroupsWithHttpInfo(doNotIncludeMemberCount?: boolean, onlyFullAccess?: boolean, nonNested?: boolean, _options?: Configuration): Promise<HttpInfo<Groupbuilderv3GetGroupsResponse>> {
        const result = this.api.groupBuilderGetGroupsWithHttpInfo(doNotIncludeMemberCount, onlyFullAccess, nonNested, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get groups Description: Get a list of imported group members.
     * @param doNotIncludeMemberCount Return group names, ID\&#39;s, type ID\&#39;s, nested bool, and tuple count only if the flag is true.
     * @param onlyFullAccess Only return groups that user has full-access to.
     * @param nonNested Only return non-nested groups.
     */
    public groupBuilderGetGroups(doNotIncludeMemberCount?: boolean, onlyFullAccess?: boolean, nonNested?: boolean, _options?: Configuration): Promise<Groupbuilderv3GetGroupsResponse> {
        const result = this.api.groupBuilderGetGroups(doNotIncludeMemberCount, onlyFullAccess, nonNested, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get import groups Description: Get unsynchronized groups from a central manager.
     * @param centralManagerId Central manager host name.
     */
    public groupBuilderGetImportGroupsWithHttpInfo(centralManagerId?: string, _options?: Configuration): Promise<HttpInfo<Groupbuilderv3GetImportGroupsResponse>> {
        const result = this.api.groupBuilderGetImportGroupsWithHttpInfo(centralManagerId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get import groups Description: Get unsynchronized groups from a central manager.
     * @param centralManagerId Central manager host name.
     */
    public groupBuilderGetImportGroups(centralManagerId?: string, _options?: Configuration): Promise<Groupbuilderv3GetImportGroupsResponse> {
        const result = this.api.groupBuilderGetImportGroups(centralManagerId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Import group Description: Import selected groups from a central manager. (This API is called from GDP only)
     * @param groupbuilderv3ImportGroupRequest 
     */
    public groupBuilderImportGroupWithHttpInfo(groupbuilderv3ImportGroupRequest: Groupbuilderv3ImportGroupRequest, _options?: Configuration): Promise<HttpInfo<Groupbuilderv3ImportGroupResponse>> {
        const result = this.api.groupBuilderImportGroupWithHttpInfo(groupbuilderv3ImportGroupRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Import group Description: Import selected groups from a central manager. (This API is called from GDP only)
     * @param groupbuilderv3ImportGroupRequest 
     */
    public groupBuilderImportGroup(groupbuilderv3ImportGroupRequest: Groupbuilderv3ImportGroupRequest, _options?: Configuration): Promise<Groupbuilderv3ImportGroupResponse> {
        const result = this.api.groupBuilderImportGroup(groupbuilderv3ImportGroupRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Refresh groups Description: Refresh tenants selected imported groups.
     * @param groupbuilderv3RefreshGroupsRequest 
     */
    public groupBuilderRefreshGroupsWithHttpInfo(groupbuilderv3RefreshGroupsRequest: Groupbuilderv3RefreshGroupsRequest, _options?: Configuration): Promise<HttpInfo<Groupbuilderv3RefreshGroupsResponse>> {
        const result = this.api.groupBuilderRefreshGroupsWithHttpInfo(groupbuilderv3RefreshGroupsRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Refresh groups Description: Refresh tenants selected imported groups.
     * @param groupbuilderv3RefreshGroupsRequest 
     */
    public groupBuilderRefreshGroups(groupbuilderv3RefreshGroupsRequest: Groupbuilderv3RefreshGroupsRequest, _options?: Configuration): Promise<Groupbuilderv3RefreshGroupsResponse> {
        const result = this.api.groupBuilderRefreshGroups(groupbuilderv3RefreshGroupsRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Reset groups Description: Resets tenants selected predefined groups.
     * @param groupbuilderv3ResetGroupsRequest 
     */
    public groupBuilderResetGroupsWithHttpInfo(groupbuilderv3ResetGroupsRequest: Groupbuilderv3ResetGroupsRequest, _options?: Configuration): Promise<HttpInfo<Groupbuilderv3ResetGroupsResponse>> {
        const result = this.api.groupBuilderResetGroupsWithHttpInfo(groupbuilderv3ResetGroupsRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Reset groups Description: Resets tenants selected predefined groups.
     * @param groupbuilderv3ResetGroupsRequest 
     */
    public groupBuilderResetGroups(groupbuilderv3ResetGroupsRequest: Groupbuilderv3ResetGroupsRequest, _options?: Configuration): Promise<Groupbuilderv3ResetGroupsResponse> {
        const result = this.api.groupBuilderResetGroups(groupbuilderv3ResetGroupsRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Store group members Gdp Description: Store GDP groups. (This API is called from GDP only)
     * @param centralManagerId ID of central manager.
     * @param groupbuilderv3StoreGroupMembersGdpRequest 
     */
    public groupBuilderStoreGroupMembersGdpWithHttpInfo(centralManagerId: string, groupbuilderv3StoreGroupMembersGdpRequest: Groupbuilderv3StoreGroupMembersGdpRequest, _options?: Configuration): Promise<HttpInfo<Groupbuilderv3StoreGroupMembersGdpResponse>> {
        const result = this.api.groupBuilderStoreGroupMembersGdpWithHttpInfo(centralManagerId, groupbuilderv3StoreGroupMembersGdpRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Store group members Gdp Description: Store GDP groups. (This API is called from GDP only)
     * @param centralManagerId ID of central manager.
     * @param groupbuilderv3StoreGroupMembersGdpRequest 
     */
    public groupBuilderStoreGroupMembersGdp(centralManagerId: string, groupbuilderv3StoreGroupMembersGdpRequest: Groupbuilderv3StoreGroupMembersGdpRequest, _options?: Configuration): Promise<Groupbuilderv3StoreGroupMembersGdpResponse> {
        const result = this.api.groupBuilderStoreGroupMembersGdp(centralManagerId, groupbuilderv3StoreGroupMembersGdpRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Store groups Gdp Description: Store GDP groups. (This API is called from GDP only)
     * @param centralManagerId ID of central manager.
     * @param groupbuilderv3GetGroupsRequestGdp 
     */
    public groupBuilderStoreGroupsGdpWithHttpInfo(centralManagerId: string, groupbuilderv3GetGroupsRequestGdp: Groupbuilderv3GetGroupsRequestGdp, _options?: Configuration): Promise<HttpInfo<Groupbuilderv3GetGroupsResponseGdp>> {
        const result = this.api.groupBuilderStoreGroupsGdpWithHttpInfo(centralManagerId, groupbuilderv3GetGroupsRequestGdp, _options);
        return result.toPromise();
    }

    /**
     * Summary: Store groups Gdp Description: Store GDP groups. (This API is called from GDP only)
     * @param centralManagerId ID of central manager.
     * @param groupbuilderv3GetGroupsRequestGdp 
     */
    public groupBuilderStoreGroupsGdp(centralManagerId: string, groupbuilderv3GetGroupsRequestGdp: Groupbuilderv3GetGroupsRequestGdp, _options?: Configuration): Promise<Groupbuilderv3GetGroupsResponseGdp> {
        const result = this.api.groupBuilderStoreGroupsGdp(centralManagerId, groupbuilderv3GetGroupsRequestGdp, _options);
        return result.toPromise();
    }


}



import { ObservableGuardiumConnectorApi } from './ObservableAPI';

import { GuardiumConnectorApiRequestFactory, GuardiumConnectorApiResponseProcessor} from "../apis/GuardiumConnectorApi";
export class PromiseGuardiumConnectorApi {
    private api: ObservableGuardiumConnectorApi

    public constructor(
        configuration: Configuration,
        requestFactory?: GuardiumConnectorApiRequestFactory,
        responseProcessor?: GuardiumConnectorApiResponseProcessor
    ) {
        this.api = new ObservableGuardiumConnectorApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Summary: Add CM Description: Add a Central Manager to the tenant database.
     * @param guardiumconnectorv3AddCMRequest 
     */
    public guardiumConnectorAddCMWithHttpInfo(guardiumconnectorv3AddCMRequest: Guardiumconnectorv3AddCMRequest, _options?: Configuration): Promise<HttpInfo<Guardiumconnectorv3AddCMResponse>> {
        const result = this.api.guardiumConnectorAddCMWithHttpInfo(guardiumconnectorv3AddCMRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Add CM Description: Add a Central Manager to the tenant database.
     * @param guardiumconnectorv3AddCMRequest 
     */
    public guardiumConnectorAddCM(guardiumconnectorv3AddCMRequest: Guardiumconnectorv3AddCMRequest, _options?: Configuration): Promise<Guardiumconnectorv3AddCMResponse> {
        const result = this.api.guardiumConnectorAddCM(guardiumconnectorv3AddCMRequest, _options);
        return result.toPromise();
    }

    /**
     * Description: stores datamarts details from GDP
     * @param centralManagerId central manager
     * @param guardiumconnectorv3AddDatamartsRequest 
     */
    public guardiumConnectorAddDatamartsWithHttpInfo(centralManagerId: string, guardiumconnectorv3AddDatamartsRequest: Guardiumconnectorv3AddDatamartsRequest, _options?: Configuration): Promise<HttpInfo<Guardiumconnectorv3AddDatamartsResponse>> {
        const result = this.api.guardiumConnectorAddDatamartsWithHttpInfo(centralManagerId, guardiumconnectorv3AddDatamartsRequest, _options);
        return result.toPromise();
    }

    /**
     * Description: stores datamarts details from GDP
     * @param centralManagerId central manager
     * @param guardiumconnectorv3AddDatamartsRequest 
     */
    public guardiumConnectorAddDatamarts(centralManagerId: string, guardiumconnectorv3AddDatamartsRequest: Guardiumconnectorv3AddDatamartsRequest, _options?: Configuration): Promise<Guardiumconnectorv3AddDatamartsResponse> {
        const result = this.api.guardiumConnectorAddDatamarts(centralManagerId, guardiumconnectorv3AddDatamartsRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Add DM exclusion Description: Add datamart to exclusion list.
     * @param guardiumconnectorv3AddDmExclusionRequest 
     */
    public guardiumConnectorAddDmExclusionWithHttpInfo(guardiumconnectorv3AddDmExclusionRequest: Guardiumconnectorv3AddDmExclusionRequest, _options?: Configuration): Promise<HttpInfo<Guardiumconnectorv3AddDmExclusionResponse>> {
        const result = this.api.guardiumConnectorAddDmExclusionWithHttpInfo(guardiumconnectorv3AddDmExclusionRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Add DM exclusion Description: Add datamart to exclusion list.
     * @param guardiumconnectorv3AddDmExclusionRequest 
     */
    public guardiumConnectorAddDmExclusion(guardiumconnectorv3AddDmExclusionRequest: Guardiumconnectorv3AddDmExclusionRequest, _options?: Configuration): Promise<Guardiumconnectorv3AddDmExclusionResponse> {
        const result = this.api.guardiumConnectorAddDmExclusion(guardiumconnectorv3AddDmExclusionRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Add task Description: Add a task to be executed on GDP.
     * @param centralManagerId ID of central manager.
     * @param guardiumconnectorv3AddTaskRequest 
     */
    public guardiumConnectorAddTaskWithHttpInfo(centralManagerId: string, guardiumconnectorv3AddTaskRequest: Guardiumconnectorv3AddTaskRequest, _options?: Configuration): Promise<HttpInfo<Guardiumconnectorv3AddTaskResponse>> {
        const result = this.api.guardiumConnectorAddTaskWithHttpInfo(centralManagerId, guardiumconnectorv3AddTaskRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Add task Description: Add a task to be executed on GDP.
     * @param centralManagerId ID of central manager.
     * @param guardiumconnectorv3AddTaskRequest 
     */
    public guardiumConnectorAddTask(centralManagerId: string, guardiumconnectorv3AddTaskRequest: Guardiumconnectorv3AddTaskRequest, _options?: Configuration): Promise<Guardiumconnectorv3AddTaskResponse> {
        const result = this.api.guardiumConnectorAddTask(centralManagerId, guardiumconnectorv3AddTaskRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Block user Description: Block a database user on Guardium Data Protection or on a supported Database as a Service instance.
     * @param guardiumconnectorv3BlockUserRequest 
     */
    public guardiumConnectorBlockUserWithHttpInfo(guardiumconnectorv3BlockUserRequest: Guardiumconnectorv3BlockUserRequest, _options?: Configuration): Promise<HttpInfo<Guardiumconnectorv3BlockUserResponse>> {
        const result = this.api.guardiumConnectorBlockUserWithHttpInfo(guardiumconnectorv3BlockUserRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Block user Description: Block a database user on Guardium Data Protection or on a supported Database as a Service instance.
     * @param guardiumconnectorv3BlockUserRequest 
     */
    public guardiumConnectorBlockUser(guardiumconnectorv3BlockUserRequest: Guardiumconnectorv3BlockUserRequest, _options?: Configuration): Promise<Guardiumconnectorv3BlockUserResponse> {
        const result = this.api.guardiumConnectorBlockUser(guardiumconnectorv3BlockUserRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Configure aggregator export Description: Configure datamart export from the Aggregators to GI.
     * @param centralManagerId Central Manager ID.
     * @param guardiumconnectorv3ConfigureAggregatorExportRequest 
     */
    public guardiumConnectorConfigureAggregatorExportWithHttpInfo(centralManagerId: string, guardiumconnectorv3ConfigureAggregatorExportRequest: Guardiumconnectorv3ConfigureAggregatorExportRequest, _options?: Configuration): Promise<HttpInfo<Guardiumconnectorv3ConfigureAggregatorExportResponse>> {
        const result = this.api.guardiumConnectorConfigureAggregatorExportWithHttpInfo(centralManagerId, guardiumconnectorv3ConfigureAggregatorExportRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Configure aggregator export Description: Configure datamart export from the Aggregators to GI.
     * @param centralManagerId Central Manager ID.
     * @param guardiumconnectorv3ConfigureAggregatorExportRequest 
     */
    public guardiumConnectorConfigureAggregatorExport(centralManagerId: string, guardiumconnectorv3ConfigureAggregatorExportRequest: Guardiumconnectorv3ConfigureAggregatorExportRequest, _options?: Configuration): Promise<Guardiumconnectorv3ConfigureAggregatorExportResponse> {
        const result = this.api.guardiumConnectorConfigureAggregatorExport(centralManagerId, guardiumconnectorv3ConfigureAggregatorExportRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Configure collector export Description: Schedule export historical data for collectors.
     * @param centralManagerId Central Manager ID.
     * @param guardiumconnectorv3ConfigureCollectorExportRequest 
     */
    public guardiumConnectorConfigureCollectorExportWithHttpInfo(centralManagerId: string, guardiumconnectorv3ConfigureCollectorExportRequest: Guardiumconnectorv3ConfigureCollectorExportRequest, _options?: Configuration): Promise<HttpInfo<Guardiumconnectorv3ConfigureCollectorExportResponse>> {
        const result = this.api.guardiumConnectorConfigureCollectorExportWithHttpInfo(centralManagerId, guardiumconnectorv3ConfigureCollectorExportRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Configure collector export Description: Schedule export historical data for collectors.
     * @param centralManagerId Central Manager ID.
     * @param guardiumconnectorv3ConfigureCollectorExportRequest 
     */
    public guardiumConnectorConfigureCollectorExport(centralManagerId: string, guardiumconnectorv3ConfigureCollectorExportRequest: Guardiumconnectorv3ConfigureCollectorExportRequest, _options?: Configuration): Promise<Guardiumconnectorv3ConfigureCollectorExportResponse> {
        const result = this.api.guardiumConnectorConfigureCollectorExport(centralManagerId, guardiumconnectorv3ConfigureCollectorExportRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Configure streaming Description: Enable or disable streaming.
     * @param centralManagerId Central Manager ID.
     * @param guardiumconnectorv3ConfigureStreamingRequest 
     */
    public guardiumConnectorConfigureStreamingWithHttpInfo(centralManagerId: string, guardiumconnectorv3ConfigureStreamingRequest: Guardiumconnectorv3ConfigureStreamingRequest, _options?: Configuration): Promise<HttpInfo<Guardiumconnectorv3ConfigureStreamingResponse>> {
        const result = this.api.guardiumConnectorConfigureStreamingWithHttpInfo(centralManagerId, guardiumconnectorv3ConfigureStreamingRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Configure streaming Description: Enable or disable streaming.
     * @param centralManagerId Central Manager ID.
     * @param guardiumconnectorv3ConfigureStreamingRequest 
     */
    public guardiumConnectorConfigureStreaming(centralManagerId: string, guardiumconnectorv3ConfigureStreamingRequest: Guardiumconnectorv3ConfigureStreamingRequest, _options?: Configuration): Promise<Guardiumconnectorv3ConfigureStreamingResponse> {
        const result = this.api.guardiumConnectorConfigureStreaming(centralManagerId, guardiumconnectorv3ConfigureStreamingRequest, _options);
        return result.toPromise();
    }

    /**
     * Description: validates if central manager has datamart support for event model
     * @param centralManagerId Central manager
     * @param guardiumconnectorv3DatamartVersionRequest 
     */
    public guardiumConnectorDatamartVersionCheckWithHttpInfo(centralManagerId: string, guardiumconnectorv3DatamartVersionRequest: Guardiumconnectorv3DatamartVersionRequest, _options?: Configuration): Promise<HttpInfo<Guardiumconnectorv3DatamartVersionResponse>> {
        const result = this.api.guardiumConnectorDatamartVersionCheckWithHttpInfo(centralManagerId, guardiumconnectorv3DatamartVersionRequest, _options);
        return result.toPromise();
    }

    /**
     * Description: validates if central manager has datamart support for event model
     * @param centralManagerId Central manager
     * @param guardiumconnectorv3DatamartVersionRequest 
     */
    public guardiumConnectorDatamartVersionCheck(centralManagerId: string, guardiumconnectorv3DatamartVersionRequest: Guardiumconnectorv3DatamartVersionRequest, _options?: Configuration): Promise<Guardiumconnectorv3DatamartVersionResponse> {
        const result = this.api.guardiumConnectorDatamartVersionCheck(centralManagerId, guardiumconnectorv3DatamartVersionRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Delete CM Description: Delete a Central Manager by ID (Name, Hostname or IP).
     * @param centralManagerId Central Manager ID.
     * @param force Flag to force delete CM and associated tasks (0&#x3D;validate CM is online before deleting, 1&#x3D;force delete CM).
     */
    public guardiumConnectorDeleteCMWithHttpInfo(centralManagerId: string, force?: number, _options?: Configuration): Promise<HttpInfo<Guardiumconnectorv3DeleteCMResponse>> {
        const result = this.api.guardiumConnectorDeleteCMWithHttpInfo(centralManagerId, force, _options);
        return result.toPromise();
    }

    /**
     * Summary: Delete CM Description: Delete a Central Manager by ID (Name, Hostname or IP).
     * @param centralManagerId Central Manager ID.
     * @param force Flag to force delete CM and associated tasks (0&#x3D;validate CM is online before deleting, 1&#x3D;force delete CM).
     */
    public guardiumConnectorDeleteCM(centralManagerId: string, force?: number, _options?: Configuration): Promise<Guardiumconnectorv3DeleteCMResponse> {
        const result = this.api.guardiumConnectorDeleteCM(centralManagerId, force, _options);
        return result.toPromise();
    }

    /**
     * Summary: Delete DM exclusion Description: Delete a datamart from exclusion list.
     * @param datamart Datamart name.
     */
    public guardiumConnectorDeleteDmExclusionWithHttpInfo(datamart?: string, _options?: Configuration): Promise<HttpInfo<Guardiumconnectorv3DeleteDmExclusionResponse>> {
        const result = this.api.guardiumConnectorDeleteDmExclusionWithHttpInfo(datamart, _options);
        return result.toPromise();
    }

    /**
     * Summary: Delete DM exclusion Description: Delete a datamart from exclusion list.
     * @param datamart Datamart name.
     */
    public guardiumConnectorDeleteDmExclusion(datamart?: string, _options?: Configuration): Promise<Guardiumconnectorv3DeleteDmExclusionResponse> {
        const result = this.api.guardiumConnectorDeleteDmExclusion(datamart, _options);
        return result.toPromise();
    }

    /**
     * Summary: Delete task Description: Delete a task by central manager id and task id.
     * @param centralManagerId ID of central manager.
     * @param taskId ID of task being deleted.
     */
    public guardiumConnectorDeleteTaskWithHttpInfo(centralManagerId: string, taskId: string, _options?: Configuration): Promise<HttpInfo<Guardiumconnectorv3DeleteTaskResponse>> {
        const result = this.api.guardiumConnectorDeleteTaskWithHttpInfo(centralManagerId, taskId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Delete task Description: Delete a task by central manager id and task id.
     * @param centralManagerId ID of central manager.
     * @param taskId ID of task being deleted.
     */
    public guardiumConnectorDeleteTask(centralManagerId: string, taskId: string, _options?: Configuration): Promise<Guardiumconnectorv3DeleteTaskResponse> {
        const result = this.api.guardiumConnectorDeleteTask(centralManagerId, taskId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Delete tasks Description: Delete a central manager\'s tasks by central manager id.
     * @param centralManagerId ID of central manager.
     */
    public guardiumConnectorDeleteTasksWithHttpInfo(centralManagerId: string, _options?: Configuration): Promise<HttpInfo<Guardiumconnectorv3DeleteTasksResponse>> {
        const result = this.api.guardiumConnectorDeleteTasksWithHttpInfo(centralManagerId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Delete tasks Description: Delete a central manager\'s tasks by central manager id.
     * @param centralManagerId ID of central manager.
     */
    public guardiumConnectorDeleteTasks(centralManagerId: string, _options?: Configuration): Promise<Guardiumconnectorv3DeleteTasksResponse> {
        const result = this.api.guardiumConnectorDeleteTasks(centralManagerId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get aggregators config Description: Return a list of managed units from the config collection in tenant database.
     * @param centralManagerId Central Manager ID.
     */
    public guardiumConnectorGetAggregatorsConfigWithHttpInfo(centralManagerId: string, _options?: Configuration): Promise<HttpInfo<Guardiumconnectorv3GetAggregatorsConfigResponse>> {
        const result = this.api.guardiumConnectorGetAggregatorsConfigWithHttpInfo(centralManagerId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get aggregators config Description: Return a list of managed units from the config collection in tenant database.
     * @param centralManagerId Central Manager ID.
     */
    public guardiumConnectorGetAggregatorsConfig(centralManagerId: string, _options?: Configuration): Promise<Guardiumconnectorv3GetAggregatorsConfigResponse> {
        const result = this.api.guardiumConnectorGetAggregatorsConfig(centralManagerId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get CMs Description: Return a list of Central Managers from the tenant database with additional processing.
     * @param runAdditionalChecks Retrieve the streaming status for all Managed Units that are reporting to a particular Central Manager.
     */
    public guardiumConnectorGetCMsWithHttpInfo(runAdditionalChecks?: boolean, _options?: Configuration): Promise<HttpInfo<Guardiumconnectorv3GetCMsResponse>> {
        const result = this.api.guardiumConnectorGetCMsWithHttpInfo(runAdditionalChecks, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get CMs Description: Return a list of Central Managers from the tenant database with additional processing.
     * @param runAdditionalChecks Retrieve the streaming status for all Managed Units that are reporting to a particular Central Manager.
     */
    public guardiumConnectorGetCMs(runAdditionalChecks?: boolean, _options?: Configuration): Promise<Guardiumconnectorv3GetCMsResponse> {
        const result = this.api.guardiumConnectorGetCMs(runAdditionalChecks, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get CMs config Description: Return a list of Central Managers from the tenant database.
     */
    public guardiumConnectorGetCMsConfigWithHttpInfo(_options?: Configuration): Promise<HttpInfo<Guardiumconnectorv3GetCMsConfigResponse>> {
        const result = this.api.guardiumConnectorGetCMsConfigWithHttpInfo(_options);
        return result.toPromise();
    }

    /**
     * Summary: Get CMs config Description: Return a list of Central Managers from the tenant database.
     */
    public guardiumConnectorGetCMsConfig(_options?: Configuration): Promise<Guardiumconnectorv3GetCMsConfigResponse> {
        const result = this.api.guardiumConnectorGetCMsConfig(_options);
        return result.toPromise();
    }

    /**
     * Summary: Get collectors config Description: Return the list of collectors configuration from the tenant database.
     * @param centralManagerId Central Manager ID.
     */
    public guardiumConnectorGetCollectorsConfigWithHttpInfo(centralManagerId: string, _options?: Configuration): Promise<HttpInfo<Guardiumconnectorv3GetCollectorsConfigResponse>> {
        const result = this.api.guardiumConnectorGetCollectorsConfigWithHttpInfo(centralManagerId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get collectors config Description: Return the list of collectors configuration from the tenant database.
     * @param centralManagerId Central Manager ID.
     */
    public guardiumConnectorGetCollectorsConfig(centralManagerId: string, _options?: Configuration): Promise<Guardiumconnectorv3GetCollectorsConfigResponse> {
        const result = this.api.guardiumConnectorGetCollectorsConfig(centralManagerId, _options);
        return result.toPromise();
    }

    /**
     * Description: returns full list of supported datamarts including type (historical or non-historical)
     * @param centralManagerId central manager hostname
     */
    public guardiumConnectorGetDatamartsWithHttpInfo(centralManagerId: string, _options?: Configuration): Promise<HttpInfo<Guardiumconnectorv3GetDatamartsResponse>> {
        const result = this.api.guardiumConnectorGetDatamartsWithHttpInfo(centralManagerId, _options);
        return result.toPromise();
    }

    /**
     * Description: returns full list of supported datamarts including type (historical or non-historical)
     * @param centralManagerId central manager hostname
     */
    public guardiumConnectorGetDatamarts(centralManagerId: string, _options?: Configuration): Promise<Guardiumconnectorv3GetDatamartsResponse> {
        const result = this.api.guardiumConnectorGetDatamarts(centralManagerId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get DM exclusion Description: Return datamarts in the exclusion list.
     */
    public guardiumConnectorGetDmExclusionWithHttpInfo(_options?: Configuration): Promise<HttpInfo<Guardiumconnectorv3GetDmExclusionResponse>> {
        const result = this.api.guardiumConnectorGetDmExclusionWithHttpInfo(_options);
        return result.toPromise();
    }

    /**
     * Summary: Get DM exclusion Description: Return datamarts in the exclusion list.
     */
    public guardiumConnectorGetDmExclusion(_options?: Configuration): Promise<Guardiumconnectorv3GetDmExclusionResponse> {
        const result = this.api.guardiumConnectorGetDmExclusion(_options);
        return result.toPromise();
    }

    /**
     * Summary: Get guardium policy definition Description: returns the policy definition on the cm
     * @param centralManagerId Central manager hostname
     * @param policyName Policy name.
     */
    public guardiumConnectorGetGdpPolicyInfoWithHttpInfo(centralManagerId: string, policyName?: string, _options?: Configuration): Promise<HttpInfo<Guardiumconnectorv3GetPolicyInfoResponse>> {
        const result = this.api.guardiumConnectorGetGdpPolicyInfoWithHttpInfo(centralManagerId, policyName, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get guardium policy definition Description: returns the policy definition on the cm
     * @param centralManagerId Central manager hostname
     * @param policyName Policy name.
     */
    public guardiumConnectorGetGdpPolicyInfo(centralManagerId: string, policyName?: string, _options?: Configuration): Promise<Guardiumconnectorv3GetPolicyInfoResponse> {
        const result = this.api.guardiumConnectorGetGdpPolicyInfo(centralManagerId, policyName, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get guardium policy summary Description: returns the summaries of all policies on that central manager
     * @param centralManagerId Central manager hostname
     */
    public guardiumConnectorGetGdpPolicySummariesWithHttpInfo(centralManagerId: string, _options?: Configuration): Promise<HttpInfo<Guardiumconnectorv3GetPolicySummariesResponse>> {
        const result = this.api.guardiumConnectorGetGdpPolicySummariesWithHttpInfo(centralManagerId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get guardium policy summary Description: returns the summaries of all policies on that central manager
     * @param centralManagerId Central manager hostname
     */
    public guardiumConnectorGetGdpPolicySummaries(centralManagerId: string, _options?: Configuration): Promise<Guardiumconnectorv3GetPolicySummariesResponse> {
        const result = this.api.guardiumConnectorGetGdpPolicySummaries(centralManagerId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get gealth info Description: Get health information from Guardium Data Protection central mamangers.
     * @param centralManagerId Central Manager ID.
     * @param useFallback Flag indicating if the older gdp api is to be called in case it doesn\&#39;t support new api.
     */
    public guardiumConnectorGetHealthInfoWithHttpInfo(centralManagerId: string, useFallback?: boolean, _options?: Configuration): Promise<HttpInfo<Guardiumconnectorv3GetHealthInfoResponse>> {
        const result = this.api.guardiumConnectorGetHealthInfoWithHttpInfo(centralManagerId, useFallback, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get gealth info Description: Get health information from Guardium Data Protection central mamangers.
     * @param centralManagerId Central Manager ID.
     * @param useFallback Flag indicating if the older gdp api is to be called in case it doesn\&#39;t support new api.
     */
    public guardiumConnectorGetHealthInfo(centralManagerId: string, useFallback?: boolean, _options?: Configuration): Promise<Guardiumconnectorv3GetHealthInfoResponse> {
        const result = this.api.guardiumConnectorGetHealthInfo(centralManagerId, useFallback, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get latest DM extraction profile Description: Return the Datamart Extraction Profile for Guardium.
     * @param centralManagerId Central Manager ID.
     */
    public guardiumConnectorGetLatestDMExtractionProfileWithHttpInfo(centralManagerId: string, _options?: Configuration): Promise<HttpInfo<Guardiumconnectorv3GetLatestDMExtractionProfileResponse>> {
        const result = this.api.guardiumConnectorGetLatestDMExtractionProfileWithHttpInfo(centralManagerId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get latest DM extraction profile Description: Return the Datamart Extraction Profile for Guardium.
     * @param centralManagerId Central Manager ID.
     */
    public guardiumConnectorGetLatestDMExtractionProfile(centralManagerId: string, _options?: Configuration): Promise<Guardiumconnectorv3GetLatestDMExtractionProfileResponse> {
        const result = this.api.guardiumConnectorGetLatestDMExtractionProfile(centralManagerId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get streaming status Description: Return the streaming configuration.
     * @param centralManagerId Central Manager ID.
     */
    public guardiumConnectorGetStreamingStatusWithHttpInfo(centralManagerId: string, _options?: Configuration): Promise<HttpInfo<Guardiumconnectorv3GetStreamingStatusResponse>> {
        const result = this.api.guardiumConnectorGetStreamingStatusWithHttpInfo(centralManagerId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get streaming status Description: Return the streaming configuration.
     * @param centralManagerId Central Manager ID.
     */
    public guardiumConnectorGetStreamingStatus(centralManagerId: string, _options?: Configuration): Promise<Guardiumconnectorv3GetStreamingStatusResponse> {
        const result = this.api.guardiumConnectorGetStreamingStatus(centralManagerId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get sync DMs Description: Return the list of tasks from a central manager.
     * @param centralManagerId ID of central manager.
     */
    public guardiumConnectorGetSyncDMsWithHttpInfo(centralManagerId: string, _options?: Configuration): Promise<HttpInfo<Guardiumconnectorv3GetSyncDMsResponse>> {
        const result = this.api.guardiumConnectorGetSyncDMsWithHttpInfo(centralManagerId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get sync DMs Description: Return the list of tasks from a central manager.
     * @param centralManagerId ID of central manager.
     */
    public guardiumConnectorGetSyncDMs(centralManagerId: string, _options?: Configuration): Promise<Guardiumconnectorv3GetSyncDMsResponse> {
        const result = this.api.guardiumConnectorGetSyncDMs(centralManagerId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get task types Description: Return the list of supported task types.
     */
    public guardiumConnectorGetTaskTypesWithHttpInfo(_options?: Configuration): Promise<HttpInfo<Guardiumconnectorv3GetTaskTypesResponse>> {
        const result = this.api.guardiumConnectorGetTaskTypesWithHttpInfo(_options);
        return result.toPromise();
    }

    /**
     * Summary: Get task types Description: Return the list of supported task types.
     */
    public guardiumConnectorGetTaskTypes(_options?: Configuration): Promise<Guardiumconnectorv3GetTaskTypesResponse> {
        const result = this.api.guardiumConnectorGetTaskTypes(_options);
        return result.toPromise();
    }

    /**
     * Summary: Get tasks Description: Return the list of tasks from a central manager.
     * @param centralManagerId ID of central manager.
     * @param taskId ID of task.
     * @param taskType Type of task.
     * @param keyObject Key object.
     */
    public guardiumConnectorGetTasksWithHttpInfo(centralManagerId: string, taskId?: string, taskType?: string, keyObject?: string, _options?: Configuration): Promise<HttpInfo<Guardiumconnectorv3GetTasksResponse>> {
        const result = this.api.guardiumConnectorGetTasksWithHttpInfo(centralManagerId, taskId, taskType, keyObject, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get tasks Description: Return the list of tasks from a central manager.
     * @param centralManagerId ID of central manager.
     * @param taskId ID of task.
     * @param taskType Type of task.
     * @param keyObject Key object.
     */
    public guardiumConnectorGetTasks(centralManagerId: string, taskId?: string, taskType?: string, keyObject?: string, _options?: Configuration): Promise<Guardiumconnectorv3GetTasksResponse> {
        const result = this.api.guardiumConnectorGetTasks(centralManagerId, taskId, taskType, keyObject, _options);
        return result.toPromise();
    }

    /**
     * Summary: Run GDP report Description: Run GDP report.
     * @param centralManagerId Central Manager ID.
     * @param guardiumconnectorv3RunGDPReportRequest 
     */
    public guardiumConnectorRunGDPReportWithHttpInfo(centralManagerId: string, guardiumconnectorv3RunGDPReportRequest: Guardiumconnectorv3RunGDPReportRequest, _options?: Configuration): Promise<HttpInfo<Guardiumconnectorv3RunGDPReportResponse>> {
        const result = this.api.guardiumConnectorRunGDPReportWithHttpInfo(centralManagerId, guardiumconnectorv3RunGDPReportRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Run GDP report Description: Run GDP report.
     * @param centralManagerId Central Manager ID.
     * @param guardiumconnectorv3RunGDPReportRequest 
     */
    public guardiumConnectorRunGDPReport(centralManagerId: string, guardiumconnectorv3RunGDPReportRequest: Guardiumconnectorv3RunGDPReportRequest, _options?: Configuration): Promise<Guardiumconnectorv3RunGDPReportResponse> {
        const result = this.api.guardiumConnectorRunGDPReport(centralManagerId, guardiumconnectorv3RunGDPReportRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Setup CM Description: Set up the registration between a GDP Central manager and Guardium.
     * @param guardiumconnectorv3SetupCMRequest 
     */
    public guardiumConnectorSetupCMWithHttpInfo(guardiumconnectorv3SetupCMRequest: Guardiumconnectorv3SetupCMRequest, _options?: Configuration): Promise<HttpInfo<Guardiumconnectorv3SetupCMResponse>> {
        const result = this.api.guardiumConnectorSetupCMWithHttpInfo(guardiumconnectorv3SetupCMRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Setup CM Description: Set up the registration between a GDP Central manager and Guardium.
     * @param guardiumconnectorv3SetupCMRequest 
     */
    public guardiumConnectorSetupCM(guardiumconnectorv3SetupCMRequest: Guardiumconnectorv3SetupCMRequest, _options?: Configuration): Promise<Guardiumconnectorv3SetupCMResponse> {
        const result = this.api.guardiumConnectorSetupCM(guardiumconnectorv3SetupCMRequest, _options);
        return result.toPromise();
    }

    /**
     * Description: setup custom datamart execution mode
     * @param centralManagerId central manager
     * @param guardiumconnectorv3SetupDatamartsRequest 
     */
    public guardiumConnectorSetupDatamartsWithHttpInfo(centralManagerId: string, guardiumconnectorv3SetupDatamartsRequest: Guardiumconnectorv3SetupDatamartsRequest, _options?: Configuration): Promise<HttpInfo<Guardiumconnectorv3SetupDatamartsResponse>> {
        const result = this.api.guardiumConnectorSetupDatamartsWithHttpInfo(centralManagerId, guardiumconnectorv3SetupDatamartsRequest, _options);
        return result.toPromise();
    }

    /**
     * Description: setup custom datamart execution mode
     * @param centralManagerId central manager
     * @param guardiumconnectorv3SetupDatamartsRequest 
     */
    public guardiumConnectorSetupDatamarts(centralManagerId: string, guardiumconnectorv3SetupDatamartsRequest: Guardiumconnectorv3SetupDatamartsRequest, _options?: Configuration): Promise<Guardiumconnectorv3SetupDatamartsResponse> {
        const result = this.api.guardiumConnectorSetupDatamarts(centralManagerId, guardiumconnectorv3SetupDatamartsRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Task error Description: Log error messages from GDP task execution.
     * @param centralManagerId ID of central manager.
     * @param guardiumconnectorv3TaskErrorRequest 
     */
    public guardiumConnectorTaskErrorWithHttpInfo(centralManagerId: string, guardiumconnectorv3TaskErrorRequest: Guardiumconnectorv3TaskErrorRequest, _options?: Configuration): Promise<HttpInfo<Guardiumconnectorv3TaskErrorResponse>> {
        const result = this.api.guardiumConnectorTaskErrorWithHttpInfo(centralManagerId, guardiumconnectorv3TaskErrorRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Task error Description: Log error messages from GDP task execution.
     * @param centralManagerId ID of central manager.
     * @param guardiumconnectorv3TaskErrorRequest 
     */
    public guardiumConnectorTaskError(centralManagerId: string, guardiumconnectorv3TaskErrorRequest: Guardiumconnectorv3TaskErrorRequest, _options?: Configuration): Promise<Guardiumconnectorv3TaskErrorResponse> {
        const result = this.api.guardiumConnectorTaskError(centralManagerId, guardiumconnectorv3TaskErrorRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Test database connection Description: Return database connection results.
     * @param guardiumconnectorv3DatabaseConnectionStringRequest 
     */
    public guardiumConnectorTestDatabaseConnectionWithHttpInfo(guardiumconnectorv3DatabaseConnectionStringRequest: Guardiumconnectorv3DatabaseConnectionStringRequest, _options?: Configuration): Promise<HttpInfo<Guardiumconnectorv3DatabaseResultResponse>> {
        const result = this.api.guardiumConnectorTestDatabaseConnectionWithHttpInfo(guardiumconnectorv3DatabaseConnectionStringRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Test database connection Description: Return database connection results.
     * @param guardiumconnectorv3DatabaseConnectionStringRequest 
     */
    public guardiumConnectorTestDatabaseConnection(guardiumconnectorv3DatabaseConnectionStringRequest: Guardiumconnectorv3DatabaseConnectionStringRequest, _options?: Configuration): Promise<Guardiumconnectorv3DatabaseResultResponse> {
        const result = this.api.guardiumConnectorTestDatabaseConnection(guardiumconnectorv3DatabaseConnectionStringRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Update DM exclusion Description: Update the atamart exclusion list.
     * @param guardiumconnectorv3UpdateDmExclusionRequest 
     */
    public guardiumConnectorUpdateDmExclusionWithHttpInfo(guardiumconnectorv3UpdateDmExclusionRequest: Guardiumconnectorv3UpdateDmExclusionRequest, _options?: Configuration): Promise<HttpInfo<Guardiumconnectorv3UpdateDmExclusionResponse>> {
        const result = this.api.guardiumConnectorUpdateDmExclusionWithHttpInfo(guardiumconnectorv3UpdateDmExclusionRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Update DM exclusion Description: Update the atamart exclusion list.
     * @param guardiumconnectorv3UpdateDmExclusionRequest 
     */
    public guardiumConnectorUpdateDmExclusion(guardiumconnectorv3UpdateDmExclusionRequest: Guardiumconnectorv3UpdateDmExclusionRequest, _options?: Configuration): Promise<Guardiumconnectorv3UpdateDmExclusionResponse> {
        const result = this.api.guardiumConnectorUpdateDmExclusion(guardiumconnectorv3UpdateDmExclusionRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Update streaming Description: Update streaming status into GI.
     * @param centralManagerId ID of central manager.
     * @param guardiumconnectorv3UpdateStreamingRequest 
     */
    public guardiumConnectorUpdateStreamingWithHttpInfo(centralManagerId: string, guardiumconnectorv3UpdateStreamingRequest: Guardiumconnectorv3UpdateStreamingRequest, _options?: Configuration): Promise<HttpInfo<Guardiumconnectorv3UpdateStreamingResponse>> {
        const result = this.api.guardiumConnectorUpdateStreamingWithHttpInfo(centralManagerId, guardiumconnectorv3UpdateStreamingRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Update streaming Description: Update streaming status into GI.
     * @param centralManagerId ID of central manager.
     * @param guardiumconnectorv3UpdateStreamingRequest 
     */
    public guardiumConnectorUpdateStreaming(centralManagerId: string, guardiumconnectorv3UpdateStreamingRequest: Guardiumconnectorv3UpdateStreamingRequest, _options?: Configuration): Promise<Guardiumconnectorv3UpdateStreamingResponse> {
        const result = this.api.guardiumConnectorUpdateStreaming(centralManagerId, guardiumconnectorv3UpdateStreamingRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Update task Description: Update a task that gets executed on GDP.
     * @param centralManagerId ID of central manager.
     * @param taskId ID of task being updated.
     * @param guardiumconnectorv3UpdateTaskRequest 
     */
    public guardiumConnectorUpdateTaskWithHttpInfo(centralManagerId: string, taskId: string, guardiumconnectorv3UpdateTaskRequest: Guardiumconnectorv3UpdateTaskRequest, _options?: Configuration): Promise<HttpInfo<Guardiumconnectorv3UpdateTaskResponse>> {
        const result = this.api.guardiumConnectorUpdateTaskWithHttpInfo(centralManagerId, taskId, guardiumconnectorv3UpdateTaskRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Update task Description: Update a task that gets executed on GDP.
     * @param centralManagerId ID of central manager.
     * @param taskId ID of task being updated.
     * @param guardiumconnectorv3UpdateTaskRequest 
     */
    public guardiumConnectorUpdateTask(centralManagerId: string, taskId: string, guardiumconnectorv3UpdateTaskRequest: Guardiumconnectorv3UpdateTaskRequest, _options?: Configuration): Promise<Guardiumconnectorv3UpdateTaskResponse> {
        const result = this.api.guardiumConnectorUpdateTask(centralManagerId, taskId, guardiumconnectorv3UpdateTaskRequest, _options);
        return result.toPromise();
    }


}



import { ObservableHealthCollectorApi } from './ObservableAPI';

import { HealthCollectorApiRequestFactory, HealthCollectorApiResponseProcessor} from "../apis/HealthCollectorApi";
export class PromiseHealthCollectorApi {
    private api: ObservableHealthCollectorApi

    public constructor(
        configuration: Configuration,
        requestFactory?: HealthCollectorApiRequestFactory,
        responseProcessor?: HealthCollectorApiResponseProcessor
    ) {
        this.api = new ObservableHealthCollectorApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Summary: Get data warehouse usage info Description: Get information from Db2 related to usage
     * @param type The type of metric to retrieve
     * @param startTime The start time from which the data needs to be calculated.
     * @param endTime The end time from which the data needs to be calculated.
     */
    public healthCollectorGetDataWarehouseUsageWithHttpInfo(type: string, startTime?: Date, endTime?: Date, _options?: Configuration): Promise<HttpInfo<Healthcollectorv3GetDataWarehouseUsageResponse>> {
        const result = this.api.healthCollectorGetDataWarehouseUsageWithHttpInfo(type, startTime, endTime, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get data warehouse usage info Description: Get information from Db2 related to usage
     * @param type The type of metric to retrieve
     * @param startTime The start time from which the data needs to be calculated.
     * @param endTime The end time from which the data needs to be calculated.
     */
    public healthCollectorGetDataWarehouseUsage(type: string, startTime?: Date, endTime?: Date, _options?: Configuration): Promise<Healthcollectorv3GetDataWarehouseUsageResponse> {
        const result = this.api.healthCollectorGetDataWarehouseUsage(type, startTime, endTime, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get GDP health info Description: Get information from MongoDB for Guardium central managers using health-connector service.
     */
    public healthCollectorGetGDPHealthInfoWithHttpInfo(_options?: Configuration): Promise<HttpInfo<Healthcollectorv3GetGDPHealthInfoResponse>> {
        const result = this.api.healthCollectorGetGDPHealthInfoWithHttpInfo(_options);
        return result.toPromise();
    }

    /**
     * Summary: Get GDP health info Description: Get information from MongoDB for Guardium central managers using health-connector service.
     */
    public healthCollectorGetGDPHealthInfo(_options?: Configuration): Promise<Healthcollectorv3GetGDPHealthInfoResponse> {
        const result = this.api.healthCollectorGetGDPHealthInfo(_options);
        return result.toPromise();
    }

    /**
     * Summary: Get historical health info Description: Retrieve historical s-tap related statistics from health-collector service.
     * @param unit Type of unit for which data needs to be retrieved.
     * @param cmId Optional value if the data is for a particular cm. If it is empty the data for all cms would be retrieved.
     * @param startTime The start time from which the data needs to be calculated.
     * @param endTime The end time from which the data needs to be calculated.
     */
    public healthCollectorGetHistoricalHealthInfoWithHttpInfo(unit?: 'UNKNOWN_UNIT' | 'STAP', cmId?: string, startTime?: Date, endTime?: Date, _options?: Configuration): Promise<HttpInfo<Healthcollectorv3GetHistoricalHealthInfoResponse>> {
        const result = this.api.healthCollectorGetHistoricalHealthInfoWithHttpInfo(unit, cmId, startTime, endTime, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get historical health info Description: Retrieve historical s-tap related statistics from health-collector service.
     * @param unit Type of unit for which data needs to be retrieved.
     * @param cmId Optional value if the data is for a particular cm. If it is empty the data for all cms would be retrieved.
     * @param startTime The start time from which the data needs to be calculated.
     * @param endTime The end time from which the data needs to be calculated.
     */
    public healthCollectorGetHistoricalHealthInfo(unit?: 'UNKNOWN_UNIT' | 'STAP', cmId?: string, startTime?: Date, endTime?: Date, _options?: Configuration): Promise<Healthcollectorv3GetHistoricalHealthInfoResponse> {
        const result = this.api.healthCollectorGetHistoricalHealthInfo(unit, cmId, startTime, endTime, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get object storage usage info Description: Get information from object storage about tenant bucket usage
     * @param type The type of metric to retrieve
     * @param startTime The start time from which the data needs to be calculated.
     * @param endTime The end time from which the data needs to be calculated.
     */
    public healthCollectorGetObjectStorageUsageWithHttpInfo(type: string, startTime?: Date, endTime?: Date, _options?: Configuration): Promise<HttpInfo<Healthcollectorv3GetObjectStorageUsageResponse>> {
        const result = this.api.healthCollectorGetObjectStorageUsageWithHttpInfo(type, startTime, endTime, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get object storage usage info Description: Get information from object storage about tenant bucket usage
     * @param type The type of metric to retrieve
     * @param startTime The start time from which the data needs to be calculated.
     * @param endTime The end time from which the data needs to be calculated.
     */
    public healthCollectorGetObjectStorageUsage(type: string, startTime?: Date, endTime?: Date, _options?: Configuration): Promise<Healthcollectorv3GetObjectStorageUsageResponse> {
        const result = this.api.healthCollectorGetObjectStorageUsage(type, startTime, endTime, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get the PVC usage information Description: Get information about the PVC usage in the OCP cluster
     * @param type The type of metric to retrieve
     * @param startTime The start time from which the data needs to be calculated.
     * @param endTime The end time from which the data needs to be calculated.
     */
    public healthCollectorGetPVCUsageWithHttpInfo(type: string, startTime?: Date, endTime?: Date, _options?: Configuration): Promise<HttpInfo<Healthcollectorv3GetPVCUsageResponse>> {
        const result = this.api.healthCollectorGetPVCUsageWithHttpInfo(type, startTime, endTime, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get the PVC usage information Description: Get information about the PVC usage in the OCP cluster
     * @param type The type of metric to retrieve
     * @param startTime The start time from which the data needs to be calculated.
     * @param endTime The end time from which the data needs to be calculated.
     */
    public healthCollectorGetPVCUsage(type: string, startTime?: Date, endTime?: Date, _options?: Configuration): Promise<Healthcollectorv3GetPVCUsageResponse> {
        const result = this.api.healthCollectorGetPVCUsage(type, startTime, endTime, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get the pod restart information Description: Get information about the number of restarts by pod in OCP
     * @param type The type of metric to retrieve
     * @param startTime The start time from which the data needs to be calculated.
     * @param endTime The end time from which the data needs to be calculated.
     */
    public healthCollectorGetPodRestartsWithHttpInfo(type: string, startTime?: Date, endTime?: Date, _options?: Configuration): Promise<HttpInfo<Healthcollectorv3GetPodRestartsResponse>> {
        const result = this.api.healthCollectorGetPodRestartsWithHttpInfo(type, startTime, endTime, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get the pod restart information Description: Get information about the number of restarts by pod in OCP
     * @param type The type of metric to retrieve
     * @param startTime The start time from which the data needs to be calculated.
     * @param endTime The end time from which the data needs to be calculated.
     */
    public healthCollectorGetPodRestarts(type: string, startTime?: Date, endTime?: Date, _options?: Configuration): Promise<Healthcollectorv3GetPodRestartsResponse> {
        const result = this.api.healthCollectorGetPodRestarts(type, startTime, endTime, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get streams ingestion volume over a given time Description: Get information about streams ingestion volume
     * @param type The type of metric to retrieve
     * @param startTime The start time from which the data needs to be calculated.
     * @param endTime The end time from which the data needs to be calculated.
     */
    public healthCollectorGetStreamsIngestionWithHttpInfo(type: string, startTime?: Date, endTime?: Date, _options?: Configuration): Promise<HttpInfo<Healthcollectorv3GetStreamsIngestionResponse>> {
        const result = this.api.healthCollectorGetStreamsIngestionWithHttpInfo(type, startTime, endTime, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get streams ingestion volume over a given time Description: Get information about streams ingestion volume
     * @param type The type of metric to retrieve
     * @param startTime The start time from which the data needs to be calculated.
     * @param endTime The end time from which the data needs to be calculated.
     */
    public healthCollectorGetStreamsIngestion(type: string, startTime?: Date, endTime?: Date, _options?: Configuration): Promise<Healthcollectorv3GetStreamsIngestionResponse> {
        const result = this.api.healthCollectorGetStreamsIngestion(type, startTime, endTime, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get the top GDP collectors which send data to GI Description: Get information about the top GDP collectors
     * @param type The type of metric to retrieve
     * @param startTime The start time from which the data needs to be calculated.
     * @param endTime The end time from which the data needs to be calculated.
     */
    public healthCollectorGetTopGDPCollectorsWithHttpInfo(type: string, startTime?: Date, endTime?: Date, _options?: Configuration): Promise<HttpInfo<Healthcollectorv3GetTopGDPCollectorsResponse>> {
        const result = this.api.healthCollectorGetTopGDPCollectorsWithHttpInfo(type, startTime, endTime, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get the top GDP collectors which send data to GI Description: Get information about the top GDP collectors
     * @param type The type of metric to retrieve
     * @param startTime The start time from which the data needs to be calculated.
     * @param endTime The end time from which the data needs to be calculated.
     */
    public healthCollectorGetTopGDPCollectors(type: string, startTime?: Date, endTime?: Date, _options?: Configuration): Promise<Healthcollectorv3GetTopGDPCollectorsResponse> {
        const result = this.api.healthCollectorGetTopGDPCollectors(type, startTime, endTime, _options);
        return result.toPromise();
    }

    /**
     * Summary: Store health info Description: Store health info from GDP into GI. (This API is called from GDP only)
     * @param centralManagerId ID of central manager.
     * @param healthcollectorv3StoreHealthInfoRequest 
     */
    public healthCollectorStoreHealthInfoWithHttpInfo(centralManagerId: string, healthcollectorv3StoreHealthInfoRequest: Healthcollectorv3StoreHealthInfoRequest, _options?: Configuration): Promise<HttpInfo<Healthcollectorv3StoreHealthInfoResponse>> {
        const result = this.api.healthCollectorStoreHealthInfoWithHttpInfo(centralManagerId, healthcollectorv3StoreHealthInfoRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Store health info Description: Store health info from GDP into GI. (This API is called from GDP only)
     * @param centralManagerId ID of central manager.
     * @param healthcollectorv3StoreHealthInfoRequest 
     */
    public healthCollectorStoreHealthInfo(centralManagerId: string, healthcollectorv3StoreHealthInfoRequest: Healthcollectorv3StoreHealthInfoRequest, _options?: Configuration): Promise<Healthcollectorv3StoreHealthInfoResponse> {
        const result = this.api.healthCollectorStoreHealthInfo(centralManagerId, healthcollectorv3StoreHealthInfoRequest, _options);
        return result.toPromise();
    }


}



import { ObservableJumpboxServiceApi } from './ObservableAPI';

import { JumpboxServiceApiRequestFactory, JumpboxServiceApiResponseProcessor} from "../apis/JumpboxServiceApi";
export class PromiseJumpboxServiceApi {
    private api: ObservableJumpboxServiceApi

    public constructor(
        configuration: Configuration,
        requestFactory?: JumpboxServiceApiRequestFactory,
        responseProcessor?: JumpboxServiceApiResponseProcessor
    ) {
        this.api = new ObservableJumpboxServiceApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Summary: Authorize Description: Authenticate a user and return a JWT.
     * @param jumpboxv3AuthorizeRequest 
     */
    public jumpboxServiceAuthorizeWithHttpInfo(jumpboxv3AuthorizeRequest: Jumpboxv3AuthorizeRequest, _options?: Configuration): Promise<HttpInfo<Jumpboxv3AuthorizeResponse>> {
        const result = this.api.jumpboxServiceAuthorizeWithHttpInfo(jumpboxv3AuthorizeRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Authorize Description: Authenticate a user and return a JWT.
     * @param jumpboxv3AuthorizeRequest 
     */
    public jumpboxServiceAuthorize(jumpboxv3AuthorizeRequest: Jumpboxv3AuthorizeRequest, _options?: Configuration): Promise<Jumpboxv3AuthorizeResponse> {
        const result = this.api.jumpboxServiceAuthorize(jumpboxv3AuthorizeRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Delete tenant Description: Delete a tenant.
     * @param tenantId Tenant id.
     * @param isPermanentDelete Delete tenant permanently if true.
     * @param async Async.
     */
    public jumpboxServiceDeleteTenantWithHttpInfo(tenantId: string, isPermanentDelete?: boolean, async?: boolean, _options?: Configuration): Promise<HttpInfo<any>> {
        const result = this.api.jumpboxServiceDeleteTenantWithHttpInfo(tenantId, isPermanentDelete, async, _options);
        return result.toPromise();
    }

    /**
     * Summary: Delete tenant Description: Delete a tenant.
     * @param tenantId Tenant id.
     * @param isPermanentDelete Delete tenant permanently if true.
     * @param async Async.
     */
    public jumpboxServiceDeleteTenant(tenantId: string, isPermanentDelete?: boolean, async?: boolean, _options?: Configuration): Promise<any> {
        const result = this.api.jumpboxServiceDeleteTenant(tenantId, isPermanentDelete, async, _options);
        return result.toPromise();
    }

    /**
     * Summary: Delete user Description: Delete the user.
     * @param userId The user id.
     */
    public jumpboxServiceDeleteUserWithHttpInfo(userId: string, _options?: Configuration): Promise<HttpInfo<any>> {
        const result = this.api.jumpboxServiceDeleteUserWithHttpInfo(userId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Delete user Description: Delete the user.
     * @param userId The user id.
     */
    public jumpboxServiceDeleteUser(userId: string, _options?: Configuration): Promise<any> {
        const result = this.api.jumpboxServiceDeleteUser(userId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get tenant Description: Get a tenant.
     * @param tenantId Tenant id.
     * @param includeInactive Include inactive.
     * @param includeNotReady Include tenants that are not ready(are in state of being created or deleted).
     */
    public jumpboxServiceGetTenantWithHttpInfo(tenantId: string, includeInactive?: boolean, includeNotReady?: boolean, _options?: Configuration): Promise<HttpInfo<Jumpboxv3GetTenantResponse>> {
        const result = this.api.jumpboxServiceGetTenantWithHttpInfo(tenantId, includeInactive, includeNotReady, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get tenant Description: Get a tenant.
     * @param tenantId Tenant id.
     * @param includeInactive Include inactive.
     * @param includeNotReady Include tenants that are not ready(are in state of being created or deleted).
     */
    public jumpboxServiceGetTenant(tenantId: string, includeInactive?: boolean, includeNotReady?: boolean, _options?: Configuration): Promise<Jumpboxv3GetTenantResponse> {
        const result = this.api.jumpboxServiceGetTenant(tenantId, includeInactive, includeNotReady, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get tenants Description: Get all tenant base on UID.
     * @param uid Email.
     * @param externalId External id.
     * @param includeInactive Include inactive.
     * @param includeNotReady Include tenants that are not ready(are in state of being created or deleted).
     */
    public jumpboxServiceGetTenantsWithHttpInfo(uid?: string, externalId?: string, includeInactive?: boolean, includeNotReady?: boolean, _options?: Configuration): Promise<HttpInfo<Jumpboxv3GetTenantsResponse>> {
        const result = this.api.jumpboxServiceGetTenantsWithHttpInfo(uid, externalId, includeInactive, includeNotReady, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get tenants Description: Get all tenant base on UID.
     * @param uid Email.
     * @param externalId External id.
     * @param includeInactive Include inactive.
     * @param includeNotReady Include tenants that are not ready(are in state of being created or deleted).
     */
    public jumpboxServiceGetTenants(uid?: string, externalId?: string, includeInactive?: boolean, includeNotReady?: boolean, _options?: Configuration): Promise<Jumpboxv3GetTenantsResponse> {
        const result = this.api.jumpboxServiceGetTenants(uid, externalId, includeInactive, includeNotReady, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get users Description: Get all users base on a tenantID.
     * @param uid Email.
     */
    public jumpboxServiceGetUsersWithHttpInfo(uid?: string, _options?: Configuration): Promise<HttpInfo<Tenantuserv3GetUsersResponse>> {
        const result = this.api.jumpboxServiceGetUsersWithHttpInfo(uid, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get users Description: Get all users base on a tenantID.
     * @param uid Email.
     */
    public jumpboxServiceGetUsers(uid?: string, _options?: Configuration): Promise<Tenantuserv3GetUsersResponse> {
        const result = this.api.jumpboxServiceGetUsers(uid, _options);
        return result.toPromise();
    }

    /**
     * Summary: Post tenants Description: Create a tenant.
     * @param jumpboxv3PostTenantsRequest 
     */
    public jumpboxServicePostTenantsWithHttpInfo(jumpboxv3PostTenantsRequest: Jumpboxv3PostTenantsRequest, _options?: Configuration): Promise<HttpInfo<Jumpboxv3PostTenantsResponse>> {
        const result = this.api.jumpboxServicePostTenantsWithHttpInfo(jumpboxv3PostTenantsRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Post tenants Description: Create a tenant.
     * @param jumpboxv3PostTenantsRequest 
     */
    public jumpboxServicePostTenants(jumpboxv3PostTenantsRequest: Jumpboxv3PostTenantsRequest, _options?: Configuration): Promise<Jumpboxv3PostTenantsResponse> {
        const result = this.api.jumpboxServicePostTenants(jumpboxv3PostTenantsRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Post users Description: Create users.
     * @param jumpboxv3PostUsersBulkRequest 
     */
    public jumpboxServicePostUsersWithHttpInfo(jumpboxv3PostUsersBulkRequest: Jumpboxv3PostUsersBulkRequest, _options?: Configuration): Promise<HttpInfo<Jumpboxv3PostUsersBulkResponse>> {
        const result = this.api.jumpboxServicePostUsersWithHttpInfo(jumpboxv3PostUsersBulkRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Post users Description: Create users.
     * @param jumpboxv3PostUsersBulkRequest 
     */
    public jumpboxServicePostUsers(jumpboxv3PostUsersBulkRequest: Jumpboxv3PostUsersBulkRequest, _options?: Configuration): Promise<Jumpboxv3PostUsersBulkResponse> {
        const result = this.api.jumpboxServicePostUsers(jumpboxv3PostUsersBulkRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Search users Description: Search for all users matching the provided string.
     * @param jumpboxv3SearchUsersRequest 
     */
    public jumpboxServiceSearchUsersWithHttpInfo(jumpboxv3SearchUsersRequest: Jumpboxv3SearchUsersRequest, _options?: Configuration): Promise<HttpInfo<Jumpboxv3SearchUsersResponse>> {
        const result = this.api.jumpboxServiceSearchUsersWithHttpInfo(jumpboxv3SearchUsersRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Search users Description: Search for all users matching the provided string.
     * @param jumpboxv3SearchUsersRequest 
     */
    public jumpboxServiceSearchUsers(jumpboxv3SearchUsersRequest: Jumpboxv3SearchUsersRequest, _options?: Configuration): Promise<Jumpboxv3SearchUsersResponse> {
        const result = this.api.jumpboxServiceSearchUsers(jumpboxv3SearchUsersRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Test user Description: Test a user lookup to a given LDAP.
     * @param jumpboxv3TestUserRequest 
     */
    public jumpboxServiceTestUserWithHttpInfo(jumpboxv3TestUserRequest: Jumpboxv3TestUserRequest, _options?: Configuration): Promise<HttpInfo<Jumpboxv3TestUserResponse>> {
        const result = this.api.jumpboxServiceTestUserWithHttpInfo(jumpboxv3TestUserRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Test user Description: Test a user lookup to a given LDAP.
     * @param jumpboxv3TestUserRequest 
     */
    public jumpboxServiceTestUser(jumpboxv3TestUserRequest: Jumpboxv3TestUserRequest, _options?: Configuration): Promise<Jumpboxv3TestUserResponse> {
        const result = this.api.jumpboxServiceTestUser(jumpboxv3TestUserRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Update tenant Description: Update a tenant.
     * @param tenantId Tenant id.
     * @param jumpboxv3UpdateTenantRequest 
     */
    public jumpboxServiceUpdateTenantWithHttpInfo(tenantId: string, jumpboxv3UpdateTenantRequest: Jumpboxv3UpdateTenantRequest, _options?: Configuration): Promise<HttpInfo<Jumpboxv3UpdateTenantResponse>> {
        const result = this.api.jumpboxServiceUpdateTenantWithHttpInfo(tenantId, jumpboxv3UpdateTenantRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Update tenant Description: Update a tenant.
     * @param tenantId Tenant id.
     * @param jumpboxv3UpdateTenantRequest 
     */
    public jumpboxServiceUpdateTenant(tenantId: string, jumpboxv3UpdateTenantRequest: Jumpboxv3UpdateTenantRequest, _options?: Configuration): Promise<Jumpboxv3UpdateTenantResponse> {
        const result = this.api.jumpboxServiceUpdateTenant(tenantId, jumpboxv3UpdateTenantRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Update users Description: Update an array of users.
     * @param jumpboxv3UpdateUsersBulkRequest 
     */
    public jumpboxServiceUpdateUsersWithHttpInfo(jumpboxv3UpdateUsersBulkRequest: Jumpboxv3UpdateUsersBulkRequest, _options?: Configuration): Promise<HttpInfo<Jumpboxv3UpdateUsersBulkResponse>> {
        const result = this.api.jumpboxServiceUpdateUsersWithHttpInfo(jumpboxv3UpdateUsersBulkRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Update users Description: Update an array of users.
     * @param jumpboxv3UpdateUsersBulkRequest 
     */
    public jumpboxServiceUpdateUsers(jumpboxv3UpdateUsersBulkRequest: Jumpboxv3UpdateUsersBulkRequest, _options?: Configuration): Promise<Jumpboxv3UpdateUsersBulkResponse> {
        const result = this.api.jumpboxServiceUpdateUsers(jumpboxv3UpdateUsersBulkRequest, _options);
        return result.toPromise();
    }


}



import { ObservableNotificationsServiceApi } from './ObservableAPI';

import { NotificationsServiceApiRequestFactory, NotificationsServiceApiResponseProcessor} from "../apis/NotificationsServiceApi";
export class PromiseNotificationsServiceApi {
    private api: ObservableNotificationsServiceApi

    public constructor(
        configuration: Configuration,
        requestFactory?: NotificationsServiceApiRequestFactory,
        responseProcessor?: NotificationsServiceApiResponseProcessor
    ) {
        this.api = new ObservableNotificationsServiceApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Summary: Create ticket Description: Create ticket based on information passed in.
     * @param notificationsv3CreateTicketRequest 
     */
    public notificationsServiceCreateTicketWithHttpInfo(notificationsv3CreateTicketRequest: Notificationsv3CreateTicketRequest, _options?: Configuration): Promise<HttpInfo<Notificationsv3CreateTicketResponse>> {
        const result = this.api.notificationsServiceCreateTicketWithHttpInfo(notificationsv3CreateTicketRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Create ticket Description: Create ticket based on information passed in.
     * @param notificationsv3CreateTicketRequest 
     */
    public notificationsServiceCreateTicket(notificationsv3CreateTicketRequest: Notificationsv3CreateTicketRequest, _options?: Configuration): Promise<Notificationsv3CreateTicketResponse> {
        const result = this.api.notificationsServiceCreateTicket(notificationsv3CreateTicketRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get folders Description: Get folder for the integration connection provided.
     * @param notificationsv3GetFoldersRequest 
     */
    public notificationsServiceGetFoldersWithHttpInfo(notificationsv3GetFoldersRequest: Notificationsv3GetFoldersRequest, _options?: Configuration): Promise<HttpInfo<Notificationsv3GetFoldersResponse>> {
        const result = this.api.notificationsServiceGetFoldersWithHttpInfo(notificationsv3GetFoldersRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get folders Description: Get folder for the integration connection provided.
     * @param notificationsv3GetFoldersRequest 
     */
    public notificationsServiceGetFolders(notificationsv3GetFoldersRequest: Notificationsv3GetFoldersRequest, _options?: Configuration): Promise<Notificationsv3GetFoldersResponse> {
        const result = this.api.notificationsServiceGetFolders(notificationsv3GetFoldersRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get notification filename Description: Return filename associated with the notifications record referenced in the associated context record. The notification id is required but may be set in the associated authentication token or explicitly in the request.
     * @param notificationId Params are located in the requests context (tenant id, user email, notification id).
     */
    public notificationsServiceGetNotificationFilenameWithHttpInfo(notificationId?: string, _options?: Configuration): Promise<HttpInfo<Notificationsv3GetNotificationFilenameResponse>> {
        const result = this.api.notificationsServiceGetNotificationFilenameWithHttpInfo(notificationId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get notification filename Description: Return filename associated with the notifications record referenced in the associated context record. The notification id is required but may be set in the associated authentication token or explicitly in the request.
     * @param notificationId Params are located in the requests context (tenant id, user email, notification id).
     */
    public notificationsServiceGetNotificationFilename(notificationId?: string, _options?: Configuration): Promise<Notificationsv3GetNotificationFilenameResponse> {
        const result = this.api.notificationsServiceGetNotificationFilename(notificationId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get notification record Description: Return notifications record with the specified ID.
     * @param notificationId ID for the record to return.
     */
    public notificationsServiceGetNotificationRecordWithHttpInfo(notificationId: string, _options?: Configuration): Promise<HttpInfo<Notificationsv3GetNotificationRecordResponse>> {
        const result = this.api.notificationsServiceGetNotificationRecordWithHttpInfo(notificationId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get notification record Description: Return notifications record with the specified ID.
     * @param notificationId ID for the record to return.
     */
    public notificationsServiceGetNotificationRecord(notificationId: string, _options?: Configuration): Promise<Notificationsv3GetNotificationRecordResponse> {
        const result = this.api.notificationsServiceGetNotificationRecord(notificationId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get notification records Description: Return notifications records that match the specified filter.
     * @param filterStartTime Return records created at this time or later (&gt;&#x3D;).
     * @param filterEndTime Return records created before this time (&lt;).
     * @param filterState Only return record that include the specified state.
     * @param filterOrigins Only return record that includes the specified origins.
     * @param filterOriginData Only return record that with the specified origin_data.
     * @param offset The amount to offset the rows by for pagination.
     * @param limit The max amount of rows to return for pagination.
     * @param includeFilterCounts Computing the filter counts is relatively expensive, only compute when needed.
     */
    public notificationsServiceGetNotificationRecordsWithHttpInfo(filterStartTime?: Date, filterEndTime?: Date, filterState?: 'INCLUDE_ALL' | 'UNREAD_ONLY' | 'READ_ONLY' | 'COMPLETE_ONLY' | 'NOT_COMPLETE', filterOrigins?: Array<string>, filterOriginData?: string, offset?: number, limit?: number, includeFilterCounts?: boolean, _options?: Configuration): Promise<HttpInfo<Notificationsv3GetNotificationRecordsResponse>> {
        const result = this.api.notificationsServiceGetNotificationRecordsWithHttpInfo(filterStartTime, filterEndTime, filterState, filterOrigins, filterOriginData, offset, limit, includeFilterCounts, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get notification records Description: Return notifications records that match the specified filter.
     * @param filterStartTime Return records created at this time or later (&gt;&#x3D;).
     * @param filterEndTime Return records created before this time (&lt;).
     * @param filterState Only return record that include the specified state.
     * @param filterOrigins Only return record that includes the specified origins.
     * @param filterOriginData Only return record that with the specified origin_data.
     * @param offset The amount to offset the rows by for pagination.
     * @param limit The max amount of rows to return for pagination.
     * @param includeFilterCounts Computing the filter counts is relatively expensive, only compute when needed.
     */
    public notificationsServiceGetNotificationRecords(filterStartTime?: Date, filterEndTime?: Date, filterState?: 'INCLUDE_ALL' | 'UNREAD_ONLY' | 'READ_ONLY' | 'COMPLETE_ONLY' | 'NOT_COMPLETE', filterOrigins?: Array<string>, filterOriginData?: string, offset?: number, limit?: number, includeFilterCounts?: boolean, _options?: Configuration): Promise<Notificationsv3GetNotificationRecordsResponse> {
        const result = this.api.notificationsServiceGetNotificationRecords(filterStartTime, filterEndTime, filterState, filterOrigins, filterOriginData, offset, limit, includeFilterCounts, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get ticket status Description: Get the status of the given ticket
     * @param ticketId The ID of the ticket to fetch.
     * @param integrationId The ID of the ticketing integration.
     */
    public notificationsServiceGetTicketStatusWithHttpInfo(ticketId?: string, integrationId?: string, _options?: Configuration): Promise<HttpInfo<Notificationsv3GetTicketStatusResponse>> {
        const result = this.api.notificationsServiceGetTicketStatusWithHttpInfo(ticketId, integrationId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get ticket status Description: Get the status of the given ticket
     * @param ticketId The ID of the ticket to fetch.
     * @param integrationId The ID of the ticketing integration.
     */
    public notificationsServiceGetTicketStatus(ticketId?: string, integrationId?: string, _options?: Configuration): Promise<Notificationsv3GetTicketStatusResponse> {
        const result = this.api.notificationsServiceGetTicketStatus(ticketId, integrationId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Test integration Description: Test the integration connection with the arguments passed in the TestIntegrationRequest.  When possible a test message is sent to the integration to ensure it is functional.
     * @param notificationsv3TestIntegrationRequest 
     */
    public notificationsServiceTestIntegrationWithHttpInfo(notificationsv3TestIntegrationRequest: Notificationsv3TestIntegrationRequest, _options?: Configuration): Promise<HttpInfo<Notificationsv3TestIntegrationResponse>> {
        const result = this.api.notificationsServiceTestIntegrationWithHttpInfo(notificationsv3TestIntegrationRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Test integration Description: Test the integration connection with the arguments passed in the TestIntegrationRequest.  When possible a test message is sent to the integration to ensure it is functional.
     * @param notificationsv3TestIntegrationRequest 
     */
    public notificationsServiceTestIntegration(notificationsv3TestIntegrationRequest: Notificationsv3TestIntegrationRequest, _options?: Configuration): Promise<Notificationsv3TestIntegrationResponse> {
        const result = this.api.notificationsServiceTestIntegration(notificationsv3TestIntegrationRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Update notification record Description: Update a notification record with the specified values.  The ID field is required and must match an existing notification. All fields other than the ID are optional. Creation timestamp, user and other administrative fields can not updated.
     * @param notificationsv3UpdateNotificationRecordRequest 
     */
    public notificationsServiceUpdateNotificationRecordWithHttpInfo(notificationsv3UpdateNotificationRecordRequest: Notificationsv3UpdateNotificationRecordRequest, _options?: Configuration): Promise<HttpInfo<Notificationsv3UpdateNotificationRecordResponse>> {
        const result = this.api.notificationsServiceUpdateNotificationRecordWithHttpInfo(notificationsv3UpdateNotificationRecordRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Update notification record Description: Update a notification record with the specified values.  The ID field is required and must match an existing notification. All fields other than the ID are optional. Creation timestamp, user and other administrative fields can not updated.
     * @param notificationsv3UpdateNotificationRecordRequest 
     */
    public notificationsServiceUpdateNotificationRecord(notificationsv3UpdateNotificationRecordRequest: Notificationsv3UpdateNotificationRecordRequest, _options?: Configuration): Promise<Notificationsv3UpdateNotificationRecordResponse> {
        const result = this.api.notificationsServiceUpdateNotificationRecord(notificationsv3UpdateNotificationRecordRequest, _options);
        return result.toPromise();
    }


}



import { ObservableOutliersEngineApi } from './ObservableAPI';

import { OutliersEngineApiRequestFactory, OutliersEngineApiResponseProcessor} from "../apis/OutliersEngineApi";
export class PromiseOutliersEngineApi {
    private api: ObservableOutliersEngineApi

    public constructor(
        configuration: Configuration,
        requestFactory?: OutliersEngineApiRequestFactory,
        responseProcessor?: OutliersEngineApiResponseProcessor
    ) {
        this.api = new ObservableOutliersEngineApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Summary: Get source statistics Description: Return statistics regarding the input source, including distribution of verbs, source program, working hours etc.
     * @param sourceServerIp server ip.
     * @param sourceDatabaseName database name.
     * @param sourceDbUser db user name (optional).
     * @param attributesLimit The number of attributes to return for each SourceAttributeType - optional.
     */
    public outliersEngineGetSourceStatisticsWithHttpInfo(sourceServerIp?: string, sourceDatabaseName?: string, sourceDbUser?: string, attributesLimit?: number, _options?: Configuration): Promise<HttpInfo<Outliersenginev3GetSourceStatisticsResponse>> {
        const result = this.api.outliersEngineGetSourceStatisticsWithHttpInfo(sourceServerIp, sourceDatabaseName, sourceDbUser, attributesLimit, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get source statistics Description: Return statistics regarding the input source, including distribution of verbs, source program, working hours etc.
     * @param sourceServerIp server ip.
     * @param sourceDatabaseName database name.
     * @param sourceDbUser db user name (optional).
     * @param attributesLimit The number of attributes to return for each SourceAttributeType - optional.
     */
    public outliersEngineGetSourceStatistics(sourceServerIp?: string, sourceDatabaseName?: string, sourceDbUser?: string, attributesLimit?: number, _options?: Configuration): Promise<Outliersenginev3GetSourceStatisticsResponse> {
        const result = this.api.outliersEngineGetSourceStatistics(sourceServerIp, sourceDatabaseName, sourceDbUser, attributesLimit, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get statistics Description: Return statistics regarding number of outliers, clusters and un/completed periods.
     */
    public outliersEngineGetStatisticsWithHttpInfo(_options?: Configuration): Promise<HttpInfo<Outliersenginev3StatisticsResponse>> {
        const result = this.api.outliersEngineGetStatisticsWithHttpInfo(_options);
        return result.toPromise();
    }

    /**
     * Summary: Get statistics Description: Return statistics regarding number of outliers, clusters and un/completed periods.
     */
    public outliersEngineGetStatistics(_options?: Configuration): Promise<Outliersenginev3StatisticsResponse> {
        const result = this.api.outliersEngineGetStatistics(_options);
        return result.toPromise();
    }

    /**
     * Summary: Get working hours periods Description: Get a list of the working hours periods.
     */
    public outliersEngineGetWorkingHoursPeriodsWithHttpInfo(_options?: Configuration): Promise<HttpInfo<Outliersenginev3GetWorkingHoursPeriodsResponse>> {
        const result = this.api.outliersEngineGetWorkingHoursPeriodsWithHttpInfo(_options);
        return result.toPromise();
    }

    /**
     * Summary: Get working hours periods Description: Get a list of the working hours periods.
     */
    public outliersEngineGetWorkingHoursPeriods(_options?: Configuration): Promise<Outliersenginev3GetWorkingHoursPeriodsResponse> {
        const result = this.api.outliersEngineGetWorkingHoursPeriods(_options);
        return result.toPromise();
    }

    /**
     * Summary: Run simulator Description: Run outlier simulator.
     * @param outliersenginev3RunSimulatorRequest 
     */
    public outliersEngineRunSimulatorWithHttpInfo(outliersenginev3RunSimulatorRequest: Outliersenginev3RunSimulatorRequest, _options?: Configuration): Promise<HttpInfo<RpcStatus>> {
        const result = this.api.outliersEngineRunSimulatorWithHttpInfo(outliersenginev3RunSimulatorRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Run simulator Description: Run outlier simulator.
     * @param outliersenginev3RunSimulatorRequest 
     */
    public outliersEngineRunSimulator(outliersenginev3RunSimulatorRequest: Outliersenginev3RunSimulatorRequest, _options?: Configuration): Promise<RpcStatus> {
        const result = this.api.outliersEngineRunSimulator(outliersenginev3RunSimulatorRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Update working hours periods Description: Update the working hours periods values.
     * @param outliersenginev3UpdateWorkingHoursPeriodsRequest 
     */
    public outliersEngineUpdateWorkingHoursPeriodsWithHttpInfo(outliersenginev3UpdateWorkingHoursPeriodsRequest: Outliersenginev3UpdateWorkingHoursPeriodsRequest, _options?: Configuration): Promise<HttpInfo<Outliersenginev3OutlierResponse>> {
        const result = this.api.outliersEngineUpdateWorkingHoursPeriodsWithHttpInfo(outliersenginev3UpdateWorkingHoursPeriodsRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Update working hours periods Description: Update the working hours periods values.
     * @param outliersenginev3UpdateWorkingHoursPeriodsRequest 
     */
    public outliersEngineUpdateWorkingHoursPeriods(outliersenginev3UpdateWorkingHoursPeriodsRequest: Outliersenginev3UpdateWorkingHoursPeriodsRequest, _options?: Configuration): Promise<Outliersenginev3OutlierResponse> {
        const result = this.api.outliersEngineUpdateWorkingHoursPeriods(outliersenginev3UpdateWorkingHoursPeriodsRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Upload and analyze period Description: Run outliers detection on ready periods.
     * @param body 
     */
    public outliersEngineUploadAndAnalyzePeriodWithHttpInfo(body: any, _options?: Configuration): Promise<HttpInfo<RpcStatus>> {
        const result = this.api.outliersEngineUploadAndAnalyzePeriodWithHttpInfo(body, _options);
        return result.toPromise();
    }

    /**
     * Summary: Upload and analyze period Description: Run outliers detection on ready periods.
     * @param body 
     */
    public outliersEngineUploadAndAnalyzePeriod(body: any, _options?: Configuration): Promise<RpcStatus> {
        const result = this.api.outliersEngineUploadAndAnalyzePeriod(body, _options);
        return result.toPromise();
    }

    /**
     * Summary: User clustering Description: Run user-clustering on current sources.
     * @param body 
     */
    public outliersEngineUserClusteringWithHttpInfo(body: any, _options?: Configuration): Promise<HttpInfo<RpcStatus>> {
        const result = this.api.outliersEngineUserClusteringWithHttpInfo(body, _options);
        return result.toPromise();
    }

    /**
     * Summary: User clustering Description: Run user-clustering on current sources.
     * @param body 
     */
    public outliersEngineUserClustering(body: any, _options?: Configuration): Promise<RpcStatus> {
        const result = this.api.outliersEngineUserClustering(body, _options);
        return result.toPromise();
    }


}



import { ObservablePipelineconfigServiceApi } from './ObservableAPI';

import { PipelineconfigServiceApiRequestFactory, PipelineconfigServiceApiResponseProcessor} from "../apis/PipelineconfigServiceApi";
export class PromisePipelineconfigServiceApi {
    private api: ObservablePipelineconfigServiceApi

    public constructor(
        configuration: Configuration,
        requestFactory?: PipelineconfigServiceApiRequestFactory,
        responseProcessor?: PipelineconfigServiceApiResponseProcessor
    ) {
        this.api = new ObservablePipelineconfigServiceApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Summary: Delete a tenant resource Description: Delete tenant specific resources such as db2, mongo, postgres and s3.
     * @param tenantId unique tenant ID
     * @param resource resource specifies the specific resource to delete
     */
    public pipelineconfigServiceDeleteTenantResourcesWithHttpInfo(tenantId: string, resource: string, _options?: Configuration): Promise<HttpInfo<Pipelineconfigv3DeleteTenantResponse>> {
        const result = this.api.pipelineconfigServiceDeleteTenantResourcesWithHttpInfo(tenantId, resource, _options);
        return result.toPromise();
    }

    /**
     * Summary: Delete a tenant resource Description: Delete tenant specific resources such as db2, mongo, postgres and s3.
     * @param tenantId unique tenant ID
     * @param resource resource specifies the specific resource to delete
     */
    public pipelineconfigServiceDeleteTenantResources(tenantId: string, resource: string, _options?: Configuration): Promise<Pipelineconfigv3DeleteTenantResponse> {
        const result = this.api.pipelineconfigServiceDeleteTenantResources(tenantId, resource, _options);
        return result.toPromise();
    }


}



import { ObservablePolicyBuilderApi } from './ObservableAPI';

import { PolicyBuilderApiRequestFactory, PolicyBuilderApiResponseProcessor} from "../apis/PolicyBuilderApi";
export class PromisePolicyBuilderApi {
    private api: ObservablePolicyBuilderApi

    public constructor(
        configuration: Configuration,
        requestFactory?: PolicyBuilderApiRequestFactory,
        responseProcessor?: PolicyBuilderApiResponseProcessor
    ) {
        this.api = new ObservablePolicyBuilderApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Summary: Clone policy Description: Clone a policy.
     * @param policyId Policy id that needs to be cloned.
     * @param policybuilderv3ClonePolicyRequest 
     */
    public policyBuilderClonePolicyWithHttpInfo(policyId: string, policybuilderv3ClonePolicyRequest: Policybuilderv3ClonePolicyRequest, _options?: Configuration): Promise<HttpInfo<Policybuilderv3StandardCRUDResponse>> {
        const result = this.api.policyBuilderClonePolicyWithHttpInfo(policyId, policybuilderv3ClonePolicyRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Clone policy Description: Clone a policy.
     * @param policyId Policy id that needs to be cloned.
     * @param policybuilderv3ClonePolicyRequest 
     */
    public policyBuilderClonePolicy(policyId: string, policybuilderv3ClonePolicyRequest: Policybuilderv3ClonePolicyRequest, _options?: Configuration): Promise<Policybuilderv3StandardCRUDResponse> {
        const result = this.api.policyBuilderClonePolicy(policyId, policybuilderv3ClonePolicyRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Create policy Description: Create Policy returns response code and message.
     * @param policybuilderv3CreateUpdatePolicyRequest 
     */
    public policyBuilderCreatePolicyWithHttpInfo(policybuilderv3CreateUpdatePolicyRequest: Policybuilderv3CreateUpdatePolicyRequest, _options?: Configuration): Promise<HttpInfo<Policybuilderv3CreateUpdatePolicyResponse>> {
        const result = this.api.policyBuilderCreatePolicyWithHttpInfo(policybuilderv3CreateUpdatePolicyRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Create policy Description: Create Policy returns response code and message.
     * @param policybuilderv3CreateUpdatePolicyRequest 
     */
    public policyBuilderCreatePolicy(policybuilderv3CreateUpdatePolicyRequest: Policybuilderv3CreateUpdatePolicyRequest, _options?: Configuration): Promise<Policybuilderv3CreateUpdatePolicyResponse> {
        const result = this.api.policyBuilderCreatePolicy(policybuilderv3CreateUpdatePolicyRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Delete GDP policy sync entry Description: Deletes GDP policy from sync collection
     * @param syncIds Policy sync entry id to delete from sync.
     */
    public policyBuilderDeleteGdpSyncEntryWithHttpInfo(syncIds?: Array<string>, _options?: Configuration): Promise<HttpInfo<Policybuilderv3DeleteGdpPolicySyncResponse>> {
        const result = this.api.policyBuilderDeleteGdpSyncEntryWithHttpInfo(syncIds, _options);
        return result.toPromise();
    }

    /**
     * Summary: Delete GDP policy sync entry Description: Deletes GDP policy from sync collection
     * @param syncIds Policy sync entry id to delete from sync.
     */
    public policyBuilderDeleteGdpSyncEntry(syncIds?: Array<string>, _options?: Configuration): Promise<Policybuilderv3DeleteGdpPolicySyncResponse> {
        const result = this.api.policyBuilderDeleteGdpSyncEntry(syncIds, _options);
        return result.toPromise();
    }

    /**
     * Summary: Delete policies Description: Delete Policy returns response code and message.
     * @param policyIds Policy ids.
     */
    public policyBuilderDeletePoliciesWithHttpInfo(policyIds?: Array<string>, _options?: Configuration): Promise<HttpInfo<Policybuilderv3StandardCRUDResponse>> {
        const result = this.api.policyBuilderDeletePoliciesWithHttpInfo(policyIds, _options);
        return result.toPromise();
    }

    /**
     * Summary: Delete policies Description: Delete Policy returns response code and message.
     * @param policyIds Policy ids.
     */
    public policyBuilderDeletePolicies(policyIds?: Array<string>, _options?: Configuration): Promise<Policybuilderv3StandardCRUDResponse> {
        const result = this.api.policyBuilderDeletePolicies(policyIds, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get GDP policy summary information Description: Get GDP\'s CM\'s policy summary from mogodb
     */
    public policyBuilderGetGdpPolicyMetaDataWithHttpInfo(_options?: Configuration): Promise<HttpInfo<Policybuilderv3GetGdpPolicyMetaDataResponse>> {
        const result = this.api.policyBuilderGetGdpPolicyMetaDataWithHttpInfo(_options);
        return result.toPromise();
    }

    /**
     * Summary: Get GDP policy summary information Description: Get GDP\'s CM\'s policy summary from mogodb
     */
    public policyBuilderGetGdpPolicyMetaData(_options?: Configuration): Promise<Policybuilderv3GetGdpPolicyMetaDataResponse> {
        const result = this.api.policyBuilderGetGdpPolicyMetaData(_options);
        return result.toPromise();
    }

    /**
     * Summary: Get policies Description: Return a list of policies to the caller.
     */
    public policyBuilderGetPoliciesWithHttpInfo(_options?: Configuration): Promise<HttpInfo<Policybuilderv3GetPoliciesResponse>> {
        const result = this.api.policyBuilderGetPoliciesWithHttpInfo(_options);
        return result.toPromise();
    }

    /**
     * Summary: Get policies Description: Return a list of policies to the caller.
     */
    public policyBuilderGetPolicies(_options?: Configuration): Promise<Policybuilderv3GetPoliciesResponse> {
        const result = this.api.policyBuilderGetPolicies(_options);
        return result.toPromise();
    }

    /**
     * Summary: Get policy details Description: Return a list of rules inside the policy.
     * @param policyId Policy id.
     */
    public policyBuilderGetPolicyDetailsWithHttpInfo(policyId: string, _options?: Configuration): Promise<HttpInfo<Policybuilderv3GetPolicyDetailsResponse>> {
        const result = this.api.policyBuilderGetPolicyDetailsWithHttpInfo(policyId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get policy details Description: Return a list of rules inside the policy.
     * @param policyId Policy id.
     */
    public policyBuilderGetPolicyDetails(policyId: string, _options?: Configuration): Promise<Policybuilderv3GetPolicyDetailsResponse> {
        const result = this.api.policyBuilderGetPolicyDetails(policyId, _options);
        return result.toPromise();
    }

    /**
     * Summary: GetPolicy names from rule IDs Description: Return a map where the key is the rule ID and value is the policy name that has the rule ID.
     * @param policybuilderv3GetPolicyNamesFromRuleIDsRequest 
     */
    public policyBuilderGetPolicyNamesFromRuleIDsWithHttpInfo(policybuilderv3GetPolicyNamesFromRuleIDsRequest: Policybuilderv3GetPolicyNamesFromRuleIDsRequest, _options?: Configuration): Promise<HttpInfo<Policybuilderv3GetPolicyNamesFromRuleIDsResponse>> {
        const result = this.api.policyBuilderGetPolicyNamesFromRuleIDsWithHttpInfo(policybuilderv3GetPolicyNamesFromRuleIDsRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: GetPolicy names from rule IDs Description: Return a map where the key is the rule ID and value is the policy name that has the rule ID.
     * @param policybuilderv3GetPolicyNamesFromRuleIDsRequest 
     */
    public policyBuilderGetPolicyNamesFromRuleIDs(policybuilderv3GetPolicyNamesFromRuleIDsRequest: Policybuilderv3GetPolicyNamesFromRuleIDsRequest, _options?: Configuration): Promise<Policybuilderv3GetPolicyNamesFromRuleIDsResponse> {
        const result = this.api.policyBuilderGetPolicyNamesFromRuleIDs(policybuilderv3GetPolicyNamesFromRuleIDsRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get list of synced polices Description: Returns the list and status of sync entries
     */
    public policyBuilderGetPolicySyncListWithHttpInfo(_options?: Configuration): Promise<HttpInfo<Policybuilderv3GetPolicySyncListResponse>> {
        const result = this.api.policyBuilderGetPolicySyncListWithHttpInfo(_options);
        return result.toPromise();
    }

    /**
     * Summary: Get list of synced polices Description: Returns the list and status of sync entries
     */
    public policyBuilderGetPolicySyncList(_options?: Configuration): Promise<Policybuilderv3GetPolicySyncListResponse> {
        const result = this.api.policyBuilderGetPolicySyncList(_options);
        return result.toPromise();
    }

    /**
     * Summary: Get receivers Description: Get all the receivers associated with actions.
     * @param actionId Action id.
     * @param validateCache Flag that indicates if cache needs to be validated.
     */
    public policyBuilderGetReceiversWithHttpInfo(actionId?: Array<string>, validateCache?: boolean, _options?: Configuration): Promise<HttpInfo<Policybuilderv3GetReceiversResponse>> {
        const result = this.api.policyBuilderGetReceiversWithHttpInfo(actionId, validateCache, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get receivers Description: Get all the receivers associated with actions.
     * @param actionId Action id.
     * @param validateCache Flag that indicates if cache needs to be validated.
     */
    public policyBuilderGetReceivers(actionId?: Array<string>, validateCache?: boolean, _options?: Configuration): Promise<Policybuilderv3GetReceiversResponse> {
        const result = this.api.policyBuilderGetReceivers(actionId, validateCache, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get rule metadata Description: Return a list of rule parameters and actions to the caller.
     * @param ruleType Rule type integer to indicate rule type.
     */
    public policyBuilderGetRuleMetadataWithHttpInfo(ruleType?: 'ACCESS' | 'EXCEPTION' | 'RESULT_SET', _options?: Configuration): Promise<HttpInfo<Policybuilderv3RuleMetadataResponse>> {
        const result = this.api.policyBuilderGetRuleMetadataWithHttpInfo(ruleType, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get rule metadata Description: Return a list of rule parameters and actions to the caller.
     * @param ruleType Rule type integer to indicate rule type.
     */
    public policyBuilderGetRuleMetadata(ruleType?: 'ACCESS' | 'EXCEPTION' | 'RESULT_SET', _options?: Configuration): Promise<Policybuilderv3RuleMetadataResponse> {
        const result = this.api.policyBuilderGetRuleMetadata(ruleType, _options);
        return result.toPromise();
    }

    /**
     * Summary: Insert GDP policy sync entry Description: Inserts GDP policy\'s name into sync collection
     * @param policybuilderv3InsertGdpPolicySyncRequest 
     */
    public policyBuilderInsertGdpPolicyWithHttpInfo(policybuilderv3InsertGdpPolicySyncRequest: Policybuilderv3InsertGdpPolicySyncRequest, _options?: Configuration): Promise<HttpInfo<Policybuilderv3InsertGdpPolicySyncResponse>> {
        const result = this.api.policyBuilderInsertGdpPolicyWithHttpInfo(policybuilderv3InsertGdpPolicySyncRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Insert GDP policy sync entry Description: Inserts GDP policy\'s name into sync collection
     * @param policybuilderv3InsertGdpPolicySyncRequest 
     */
    public policyBuilderInsertGdpPolicy(policybuilderv3InsertGdpPolicySyncRequest: Policybuilderv3InsertGdpPolicySyncRequest, _options?: Configuration): Promise<Policybuilderv3InsertGdpPolicySyncResponse> {
        const result = this.api.policyBuilderInsertGdpPolicy(policybuilderv3InsertGdpPolicySyncRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Insert gdp policy summaries Description: Inserts GDP\'s CM\'s policy summary information into mogodb. (This API is called from GDP only)
     * @param centralManagerId ID of central manager.
     * @param policybuilderv3InsertGdpPolicyMetaDataRequest 
     */
    public policyBuilderInsertGdpPolicyMetaDataWithHttpInfo(centralManagerId: string, policybuilderv3InsertGdpPolicyMetaDataRequest: Policybuilderv3InsertGdpPolicyMetaDataRequest, _options?: Configuration): Promise<HttpInfo<Policybuilderv3InsertGdpPolicyMetaDataResponse>> {
        const result = this.api.policyBuilderInsertGdpPolicyMetaDataWithHttpInfo(centralManagerId, policybuilderv3InsertGdpPolicyMetaDataRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Insert gdp policy summaries Description: Inserts GDP\'s CM\'s policy summary information into mogodb. (This API is called from GDP only)
     * @param centralManagerId ID of central manager.
     * @param policybuilderv3InsertGdpPolicyMetaDataRequest 
     */
    public policyBuilderInsertGdpPolicyMetaData(centralManagerId: string, policybuilderv3InsertGdpPolicyMetaDataRequest: Policybuilderv3InsertGdpPolicyMetaDataRequest, _options?: Configuration): Promise<Policybuilderv3InsertGdpPolicyMetaDataResponse> {
        const result = this.api.policyBuilderInsertGdpPolicyMetaData(centralManagerId, policybuilderv3InsertGdpPolicyMetaDataRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Install policies Description: Activate Policies request performs activations.
     * @param policybuilderv3InstallPoliciesRequest 
     */
    public policyBuilderInstallPoliciesWithHttpInfo(policybuilderv3InstallPoliciesRequest: Policybuilderv3InstallPoliciesRequest, _options?: Configuration): Promise<HttpInfo<Policybuilderv3StatusResponseBase>> {
        const result = this.api.policyBuilderInstallPoliciesWithHttpInfo(policybuilderv3InstallPoliciesRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Install policies Description: Activate Policies request performs activations.
     * @param policybuilderv3InstallPoliciesRequest 
     */
    public policyBuilderInstallPolicies(policybuilderv3InstallPoliciesRequest: Policybuilderv3InstallPoliciesRequest, _options?: Configuration): Promise<Policybuilderv3StatusResponseBase> {
        const result = this.api.policyBuilderInstallPolicies(policybuilderv3InstallPoliciesRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Integration check Description: Check if integration id is being used in policies.
     * @param integrationId Integration Id to check if it is being used in policies.
     * @param templateId Template Id to check if it is being used in policies.
     */
    public policyBuilderIntegrationCheckWithHttpInfo(integrationId: string, templateId?: string, _options?: Configuration): Promise<HttpInfo<Policybuilderv3GetIntegrationCheckResponse>> {
        const result = this.api.policyBuilderIntegrationCheckWithHttpInfo(integrationId, templateId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Integration check Description: Check if integration id is being used in policies.
     * @param integrationId Integration Id to check if it is being used in policies.
     * @param templateId Template Id to check if it is being used in policies.
     */
    public policyBuilderIntegrationCheck(integrationId: string, templateId?: string, _options?: Configuration): Promise<Policybuilderv3GetIntegrationCheckResponse> {
        const result = this.api.policyBuilderIntegrationCheck(integrationId, templateId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Policies groups Description: Get policy groups.
     * @param groupIds Group ids to check if they are being used in policies.
     */
    public policyBuilderPoliciesGroupsWithHttpInfo(groupIds?: Array<string>, _options?: Configuration): Promise<HttpInfo<Policybuilderv3GetPoliciesGroupsResponse>> {
        const result = this.api.policyBuilderPoliciesGroupsWithHttpInfo(groupIds, _options);
        return result.toPromise();
    }

    /**
     * Summary: Policies groups Description: Get policy groups.
     * @param groupIds Group ids to check if they are being used in policies.
     */
    public policyBuilderPoliciesGroups(groupIds?: Array<string>, _options?: Configuration): Promise<Policybuilderv3GetPoliciesGroupsResponse> {
        const result = this.api.policyBuilderPoliciesGroups(groupIds, _options);
        return result.toPromise();
    }

    /**
     * Summary: Rule validation Description: Validate a rule parameters and actions.
     * @param policybuilderv3GetRuleValidationRequest 
     */
    public policyBuilderRuleValidationWithHttpInfo(policybuilderv3GetRuleValidationRequest: Policybuilderv3GetRuleValidationRequest, _options?: Configuration): Promise<HttpInfo<Policybuilderv3StandardCRUDResponse>> {
        const result = this.api.policyBuilderRuleValidationWithHttpInfo(policybuilderv3GetRuleValidationRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Rule validation Description: Validate a rule parameters and actions.
     * @param policybuilderv3GetRuleValidationRequest 
     */
    public policyBuilderRuleValidation(policybuilderv3GetRuleValidationRequest: Policybuilderv3GetRuleValidationRequest, _options?: Configuration): Promise<Policybuilderv3StandardCRUDResponse> {
        const result = this.api.policyBuilderRuleValidation(policybuilderv3GetRuleValidationRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Store policies Gdp Description: Store policies.  (This API is called from GDP only)
     * @param centralManagerId ID of central manager.
     * @param policybuilderv3StorePolicyGdpRequest 
     */
    public policyBuilderStorePoliciesGdpWithHttpInfo(centralManagerId: string, policybuilderv3StorePolicyGdpRequest: Policybuilderv3StorePolicyGdpRequest, _options?: Configuration): Promise<HttpInfo<Policybuilderv3StorePolicyGdpResponse>> {
        const result = this.api.policyBuilderStorePoliciesGdpWithHttpInfo(centralManagerId, policybuilderv3StorePolicyGdpRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Store policies Gdp Description: Store policies.  (This API is called from GDP only)
     * @param centralManagerId ID of central manager.
     * @param policybuilderv3StorePolicyGdpRequest 
     */
    public policyBuilderStorePoliciesGdp(centralManagerId: string, policybuilderv3StorePolicyGdpRequest: Policybuilderv3StorePolicyGdpRequest, _options?: Configuration): Promise<Policybuilderv3StorePolicyGdpResponse> {
        const result = this.api.policyBuilderStorePoliciesGdp(centralManagerId, policybuilderv3StorePolicyGdpRequest, _options);
        return result.toPromise();
    }


}



import { ObservableQSDataManagerApi } from './ObservableAPI';

import { QSDataManagerApiRequestFactory, QSDataManagerApiResponseProcessor} from "../apis/QSDataManagerApi";
export class PromiseQSDataManagerApi {
    private api: ObservableQSDataManagerApi

    public constructor(
        configuration: Configuration,
        requestFactory?: QSDataManagerApiRequestFactory,
        responseProcessor?: QSDataManagerApiResponseProcessor
    ) {
        this.api = new ObservableQSDataManagerApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Summary: master data for all entities Description: Retrieves All Dimension and Fact tables data.
     */
    public qSDataManagerGetMasterDataWithHttpInfo(_options?: Configuration): Promise<HttpInfo<Qspmdatamanagerv3MasterDataResponse>> {
        const result = this.api.qSDataManagerGetMasterDataWithHttpInfo(_options);
        return result.toPromise();
    }

    /**
     * Summary: master data for all entities Description: Retrieves All Dimension and Fact tables data.
     */
    public qSDataManagerGetMasterData(_options?: Configuration): Promise<Qspmdatamanagerv3MasterDataResponse> {
        const result = this.api.qSDataManagerGetMasterData(_options);
        return result.toPromise();
    }

    /**
     * Summary: Insert ScanDetails Description: Register new data into scan dimension table.
     * @param qspmdatamanagerv3ScanRequest 
     */
    public qSDataManagerRegisterScanWithHttpInfo(qspmdatamanagerv3ScanRequest: Qspmdatamanagerv3ScanRequest, _options?: Configuration): Promise<HttpInfo<Qspmdatamanagerv3ScanResponse>> {
        const result = this.api.qSDataManagerRegisterScanWithHttpInfo(qspmdatamanagerv3ScanRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Insert ScanDetails Description: Register new data into scan dimension table.
     * @param qspmdatamanagerv3ScanRequest 
     */
    public qSDataManagerRegisterScan(qspmdatamanagerv3ScanRequest: Qspmdatamanagerv3ScanRequest, _options?: Configuration): Promise<Qspmdatamanagerv3ScanResponse> {
        const result = this.api.qSDataManagerRegisterScan(qspmdatamanagerv3ScanRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Fetch ScanDetails Description: Fetch details from scan dimension table.
     * @param scanId 
     */
    public qSDataManagerRetrieveScanWithHttpInfo(scanId: string, _options?: Configuration): Promise<HttpInfo<Qspmdatamanagerv3ScanResponse>> {
        const result = this.api.qSDataManagerRetrieveScanWithHttpInfo(scanId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Fetch ScanDetails Description: Fetch details from scan dimension table.
     * @param scanId 
     */
    public qSDataManagerRetrieveScan(scanId: string, _options?: Configuration): Promise<Qspmdatamanagerv3ScanResponse> {
        const result = this.api.qSDataManagerRetrieveScan(scanId, _options);
        return result.toPromise();
    }


}



import { ObservableQSPluginManagerApi } from './ObservableAPI';

import { QSPluginManagerApiRequestFactory, QSPluginManagerApiResponseProcessor} from "../apis/QSPluginManagerApi";
export class PromiseQSPluginManagerApi {
    private api: ObservableQSPluginManagerApi

    public constructor(
        configuration: Configuration,
        requestFactory?: QSPluginManagerApiRequestFactory,
        responseProcessor?: QSPluginManagerApiResponseProcessor
    ) {
        this.api = new ObservableQSPluginManagerApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Summary: Invoke only application provisioning data plugin Description:Parses app input file and triggers dataload
     * @param pluginId Unique identifier for the plugin
     * @param qspmpluginmanagerv3PluginRQ 
     */
    public qSPluginManagerInvokeAppProvWithHttpInfo(pluginId: string, qspmpluginmanagerv3PluginRQ: Qspmpluginmanagerv3PluginRQ, _options?: Configuration): Promise<HttpInfo<Qspmpluginmanagerv3PluginRS>> {
        const result = this.api.qSPluginManagerInvokeAppProvWithHttpInfo(pluginId, qspmpluginmanagerv3PluginRQ, _options);
        return result.toPromise();
    }

    /**
     * Summary: Invoke only application provisioning data plugin Description:Parses app input file and triggers dataload
     * @param pluginId Unique identifier for the plugin
     * @param qspmpluginmanagerv3PluginRQ 
     */
    public qSPluginManagerInvokeAppProv(pluginId: string, qspmpluginmanagerv3PluginRQ: Qspmpluginmanagerv3PluginRQ, _options?: Configuration): Promise<Qspmpluginmanagerv3PluginRS> {
        const result = this.api.qSPluginManagerInvokeAppProv(pluginId, qspmpluginmanagerv3PluginRQ, _options);
        return result.toPromise();
    }

    /**
     * Summary: Invoke only explorer inventory data plugin Description:Parses explorer input file and triggers dataload
     * @param pluginId Unique identifier for the plugin
     * @param qspmpluginmanagerv3PluginRQ 
     */
    public qSPluginManagerInvokeExplorerV1WithHttpInfo(pluginId: string, qspmpluginmanagerv3PluginRQ: Qspmpluginmanagerv3PluginRQ, _options?: Configuration): Promise<HttpInfo<Qspmpluginmanagerv3PluginRS>> {
        const result = this.api.qSPluginManagerInvokeExplorerV1WithHttpInfo(pluginId, qspmpluginmanagerv3PluginRQ, _options);
        return result.toPromise();
    }

    /**
     * Summary: Invoke only explorer inventory data plugin Description:Parses explorer input file and triggers dataload
     * @param pluginId Unique identifier for the plugin
     * @param qspmpluginmanagerv3PluginRQ 
     */
    public qSPluginManagerInvokeExplorerV1(pluginId: string, qspmpluginmanagerv3PluginRQ: Qspmpluginmanagerv3PluginRQ, _options?: Configuration): Promise<Qspmpluginmanagerv3PluginRS> {
        const result = this.api.qSPluginManagerInvokeExplorerV1(pluginId, qspmpluginmanagerv3PluginRQ, _options);
        return result.toPromise();
    }

    /**
     * Summary: Invoke only explorer analytics data plugin Description:Parses explorer input file and triggers dataload
     * @param pluginId Unique identifier for the plugin
     * @param qspmpluginmanagerv3PluginRQ 
     */
    public qSPluginManagerInvokeExplorerV2WithHttpInfo(pluginId: string, qspmpluginmanagerv3PluginRQ: Qspmpluginmanagerv3PluginRQ, _options?: Configuration): Promise<HttpInfo<Qspmpluginmanagerv3PluginRS>> {
        const result = this.api.qSPluginManagerInvokeExplorerV2WithHttpInfo(pluginId, qspmpluginmanagerv3PluginRQ, _options);
        return result.toPromise();
    }

    /**
     * Summary: Invoke only explorer analytics data plugin Description:Parses explorer input file and triggers dataload
     * @param pluginId Unique identifier for the plugin
     * @param qspmpluginmanagerv3PluginRQ 
     */
    public qSPluginManagerInvokeExplorerV2(pluginId: string, qspmpluginmanagerv3PluginRQ: Qspmpluginmanagerv3PluginRQ, _options?: Configuration): Promise<Qspmpluginmanagerv3PluginRS> {
        const result = this.api.qSPluginManagerInvokeExplorerV2(pluginId, qspmpluginmanagerv3PluginRQ, _options);
        return result.toPromise();
    }

    /**
     * Summary: Invoke consolidated or only network data plugin Description:Parses input files and triggers dataload
     * @param pluginId Unique identifier for the plugin
     * @param qspmpluginmanagerv3PluginRQ 
     */
    public qSPluginManagerInvokePluginWithHttpInfo(pluginId: string, qspmpluginmanagerv3PluginRQ: Qspmpluginmanagerv3PluginRQ, _options?: Configuration): Promise<HttpInfo<Qspmpluginmanagerv3PluginRS>> {
        const result = this.api.qSPluginManagerInvokePluginWithHttpInfo(pluginId, qspmpluginmanagerv3PluginRQ, _options);
        return result.toPromise();
    }

    /**
     * Summary: Invoke consolidated or only network data plugin Description:Parses input files and triggers dataload
     * @param pluginId Unique identifier for the plugin
     * @param qspmpluginmanagerv3PluginRQ 
     */
    public qSPluginManagerInvokePlugin(pluginId: string, qspmpluginmanagerv3PluginRQ: Qspmpluginmanagerv3PluginRQ, _options?: Configuration): Promise<Qspmpluginmanagerv3PluginRS> {
        const result = this.api.qSPluginManagerInvokePlugin(pluginId, qspmpluginmanagerv3PluginRQ, _options);
        return result.toPromise();
    }

    /**
     * Summary: Invoke only policy data plugin Description:Parses policy input file and triggers dataload
     * @param pluginId Unique identifier for the plugin
     * @param qspmpluginmanagerv3PolicyPluginRQ 
     */
    public qSPluginManagerInvokePolicyWithHttpInfo(pluginId: string, qspmpluginmanagerv3PolicyPluginRQ: Qspmpluginmanagerv3PolicyPluginRQ, _options?: Configuration): Promise<HttpInfo<Qspmpluginmanagerv3PolicyPluginRS>> {
        const result = this.api.qSPluginManagerInvokePolicyWithHttpInfo(pluginId, qspmpluginmanagerv3PolicyPluginRQ, _options);
        return result.toPromise();
    }

    /**
     * Summary: Invoke only policy data plugin Description:Parses policy input file and triggers dataload
     * @param pluginId Unique identifier for the plugin
     * @param qspmpluginmanagerv3PolicyPluginRQ 
     */
    public qSPluginManagerInvokePolicy(pluginId: string, qspmpluginmanagerv3PolicyPluginRQ: Qspmpluginmanagerv3PolicyPluginRQ, _options?: Configuration): Promise<Qspmpluginmanagerv3PolicyPluginRS> {
        const result = this.api.qSPluginManagerInvokePolicy(pluginId, qspmpluginmanagerv3PolicyPluginRQ, _options);
        return result.toPromise();
    }


}



import { ObservableQSPolicyManagerApi } from './ObservableAPI';

import { QSPolicyManagerApiRequestFactory, QSPolicyManagerApiResponseProcessor} from "../apis/QSPolicyManagerApi";
export class PromiseQSPolicyManagerApi {
    private api: ObservableQSPolicyManagerApi

    public constructor(
        configuration: Configuration,
        requestFactory?: QSPolicyManagerApiRequestFactory,
        responseProcessor?: QSPolicyManagerApiResponseProcessor
    ) {
        this.api = new ObservableQSPolicyManagerApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * BatchStatusUpdate - trigger the batch to update the status of the Ticket .
     * @param body 
     */
    public qSPolicyManagerBatchStatusUpdateWithHttpInfo(body: any, _options?: Configuration): Promise<HttpInfo<Qspmpolicymanagerv3StandardEmptyResponse>> {
        const result = this.api.qSPolicyManagerBatchStatusUpdateWithHttpInfo(body, _options);
        return result.toPromise();
    }

    /**
     * BatchStatusUpdate - trigger the batch to update the status of the Ticket .
     * @param body 
     */
    public qSPolicyManagerBatchStatusUpdate(body: any, _options?: Configuration): Promise<Qspmpolicymanagerv3StandardEmptyResponse> {
        const result = this.api.qSPolicyManagerBatchStatusUpdate(body, _options);
        return result.toPromise();
    }

    /**
     * CreateTicket - Create a new Incident .
     * @param qspmpolicymanagerv3CreateTicketRequest 
     */
    public qSPolicyManagerCreateTicketWithHttpInfo(qspmpolicymanagerv3CreateTicketRequest: Qspmpolicymanagerv3CreateTicketRequest, _options?: Configuration): Promise<HttpInfo<Qspmpolicymanagerv3CreateTicketResponse>> {
        const result = this.api.qSPolicyManagerCreateTicketWithHttpInfo(qspmpolicymanagerv3CreateTicketRequest, _options);
        return result.toPromise();
    }

    /**
     * CreateTicket - Create a new Incident .
     * @param qspmpolicymanagerv3CreateTicketRequest 
     */
    public qSPolicyManagerCreateTicket(qspmpolicymanagerv3CreateTicketRequest: Qspmpolicymanagerv3CreateTicketRequest, _options?: Configuration): Promise<Qspmpolicymanagerv3CreateTicketResponse> {
        const result = this.api.qSPolicyManagerCreateTicket(qspmpolicymanagerv3CreateTicketRequest, _options);
        return result.toPromise();
    }

    /**
     * FetchFilesfromBuckets - fetch the file(s) from bucket of the object storage
     */
    public qSPolicyManagerFetchFilesfromBucketsWithHttpInfo(_options?: Configuration): Promise<HttpInfo<Qspmpolicymanagerv3FetchObjectStoreFileResponse>> {
        const result = this.api.qSPolicyManagerFetchFilesfromBucketsWithHttpInfo(_options);
        return result.toPromise();
    }

    /**
     * FetchFilesfromBuckets - fetch the file(s) from bucket of the object storage
     */
    public qSPolicyManagerFetchFilesfromBuckets(_options?: Configuration): Promise<Qspmpolicymanagerv3FetchObjectStoreFileResponse> {
        const result = this.api.qSPolicyManagerFetchFilesfromBuckets(_options);
        return result.toPromise();
    }

    /**
     * ProcessPolicyDimentionRecords - fetch the records from Policy Dimention and update Policy Fact table
     * @param qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest 
     */
    public qSPolicyManagerProcessPolicyDimentionRecordsWithHttpInfo(qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest: Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest, _options?: Configuration): Promise<HttpInfo<Qspmpolicymanagerv3ProcessPolicyDimentionRecordsResonse>> {
        const result = this.api.qSPolicyManagerProcessPolicyDimentionRecordsWithHttpInfo(qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest, _options);
        return result.toPromise();
    }

    /**
     * ProcessPolicyDimentionRecords - fetch the records from Policy Dimention and update Policy Fact table
     * @param qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest 
     */
    public qSPolicyManagerProcessPolicyDimentionRecords(qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest: Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest, _options?: Configuration): Promise<Qspmpolicymanagerv3ProcessPolicyDimentionRecordsResonse> {
        const result = this.api.qSPolicyManagerProcessPolicyDimentionRecords(qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest, _options);
        return result.toPromise();
    }

    /**
     * UpdateTicketStatus - Update the ticket status based on the IntegrationId and TicketId .
     * @param qspmpolicymanagerv3UpdateTicketStatusRequest 
     */
    public qSPolicyManagerUpdateTicketStatusWithHttpInfo(qspmpolicymanagerv3UpdateTicketStatusRequest: Qspmpolicymanagerv3UpdateTicketStatusRequest, _options?: Configuration): Promise<HttpInfo<Qspmpolicymanagerv3UpdateTicketStatusResponse>> {
        const result = this.api.qSPolicyManagerUpdateTicketStatusWithHttpInfo(qspmpolicymanagerv3UpdateTicketStatusRequest, _options);
        return result.toPromise();
    }

    /**
     * UpdateTicketStatus - Update the ticket status based on the IntegrationId and TicketId .
     * @param qspmpolicymanagerv3UpdateTicketStatusRequest 
     */
    public qSPolicyManagerUpdateTicketStatus(qspmpolicymanagerv3UpdateTicketStatusRequest: Qspmpolicymanagerv3UpdateTicketStatusRequest, _options?: Configuration): Promise<Qspmpolicymanagerv3UpdateTicketStatusResponse> {
        const result = this.api.qSPolicyManagerUpdateTicketStatus(qspmpolicymanagerv3UpdateTicketStatusRequest, _options);
        return result.toPromise();
    }


}



import { ObservableReportsRunnerApi } from './ObservableAPI';

import { ReportsRunnerApiRequestFactory, ReportsRunnerApiResponseProcessor} from "../apis/ReportsRunnerApi";
export class PromiseReportsRunnerApi {
    private api: ObservableReportsRunnerApi

    public constructor(
        configuration: Configuration,
        requestFactory?: ReportsRunnerApiRequestFactory,
        responseProcessor?: ReportsRunnerApiResponseProcessor
    ) {
        this.api = new ObservableReportsRunnerApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Summary: Get running queries Description: Get queries that are running more than certain time
     * @param reportsrunnerv3GetActiveQueriesRequest 
     */
    public reportsRunnerGetActiveQueriesWithHttpInfo(reportsrunnerv3GetActiveQueriesRequest: Reportsrunnerv3GetActiveQueriesRequest, _options?: Configuration): Promise<HttpInfo<Reportsrunnerv3GetActiveQueriesResponse>> {
        const result = this.api.reportsRunnerGetActiveQueriesWithHttpInfo(reportsrunnerv3GetActiveQueriesRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get running queries Description: Get queries that are running more than certain time
     * @param reportsrunnerv3GetActiveQueriesRequest 
     */
    public reportsRunnerGetActiveQueries(reportsrunnerv3GetActiveQueriesRequest: Reportsrunnerv3GetActiveQueriesRequest, _options?: Configuration): Promise<Reportsrunnerv3GetActiveQueriesResponse> {
        const result = this.api.reportsRunnerGetActiveQueries(reportsrunnerv3GetActiveQueriesRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get audit data count Description: Get audit data.
     * @param reportId Optional: the ID of the Report we wish to run (e.g. 000000000000000000000905).
     * @param reportsrunnerv3GetAuditDataCountRequest 
     */
    public reportsRunnerGetAuditDataCountWithHttpInfo(reportId: string, reportsrunnerv3GetAuditDataCountRequest: Reportsrunnerv3GetAuditDataCountRequest, _options?: Configuration): Promise<HttpInfo<Reportsrunnerv3GetReportDataCountResponse>> {
        const result = this.api.reportsRunnerGetAuditDataCountWithHttpInfo(reportId, reportsrunnerv3GetAuditDataCountRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get audit data count Description: Get audit data.
     * @param reportId Optional: the ID of the Report we wish to run (e.g. 000000000000000000000905).
     * @param reportsrunnerv3GetAuditDataCountRequest 
     */
    public reportsRunnerGetAuditDataCount(reportId: string, reportsrunnerv3GetAuditDataCountRequest: Reportsrunnerv3GetAuditDataCountRequest, _options?: Configuration): Promise<Reportsrunnerv3GetReportDataCountResponse> {
        const result = this.api.reportsRunnerGetAuditDataCount(reportId, reportsrunnerv3GetAuditDataCountRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get chart data Description: Get Chart data by chart ID or by specifying report definition and chart settings.
     * @param reportsrunnerv3GetChartDataRequest 
     */
    public reportsRunnerGetChartDataWithHttpInfo(reportsrunnerv3GetChartDataRequest: Reportsrunnerv3GetChartDataRequest, _options?: Configuration): Promise<HttpInfo<Reportsrunnerv3GetChartDataResponse>> {
        const result = this.api.reportsRunnerGetChartDataWithHttpInfo(reportsrunnerv3GetChartDataRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get chart data Description: Get Chart data by chart ID or by specifying report definition and chart settings.
     * @param reportsrunnerv3GetChartDataRequest 
     */
    public reportsRunnerGetChartData(reportsrunnerv3GetChartDataRequest: Reportsrunnerv3GetChartDataRequest, _options?: Configuration): Promise<Reportsrunnerv3GetChartDataResponse> {
        const result = this.api.reportsRunnerGetChartData(reportsrunnerv3GetChartDataRequest, _options);
        return result.toPromise();
    }

    /**
     * @param reportsrunnerv3GetChartDataRequestv2 
     */
    public reportsRunnerGetChartDatav2WithHttpInfo(reportsrunnerv3GetChartDataRequestv2: Reportsrunnerv3GetChartDataRequestv2, _options?: Configuration): Promise<HttpInfo<Reportsrunnerv3GetChartDataResponsev2>> {
        const result = this.api.reportsRunnerGetChartDatav2WithHttpInfo(reportsrunnerv3GetChartDataRequestv2, _options);
        return result.toPromise();
    }

    /**
     * @param reportsrunnerv3GetChartDataRequestv2 
     */
    public reportsRunnerGetChartDatav2(reportsrunnerv3GetChartDataRequestv2: Reportsrunnerv3GetChartDataRequestv2, _options?: Configuration): Promise<Reportsrunnerv3GetChartDataResponsev2> {
        const result = this.api.reportsRunnerGetChartDatav2(reportsrunnerv3GetChartDataRequestv2, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get report column facet Description: Get counts that is group by values for the selected column.
     * @param reportsrunnerv3GetReportColumnFacetRequest 
     */
    public reportsRunnerGetReportColumnFacetWithHttpInfo(reportsrunnerv3GetReportColumnFacetRequest: Reportsrunnerv3GetReportColumnFacetRequest, _options?: Configuration): Promise<HttpInfo<Reportsrunnerv3GetReportColumnFacetResponse>> {
        const result = this.api.reportsRunnerGetReportColumnFacetWithHttpInfo(reportsrunnerv3GetReportColumnFacetRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get report column facet Description: Get counts that is group by values for the selected column.
     * @param reportsrunnerv3GetReportColumnFacetRequest 
     */
    public reportsRunnerGetReportColumnFacet(reportsrunnerv3GetReportColumnFacetRequest: Reportsrunnerv3GetReportColumnFacetRequest, _options?: Configuration): Promise<Reportsrunnerv3GetReportColumnFacetResponse> {
        const result = this.api.reportsRunnerGetReportColumnFacet(reportsrunnerv3GetReportColumnFacetRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get report data count Description: Get report data.
     * @param reportsrunnerv3GetReportDataCountRequest 
     */
    public reportsRunnerGetReportDataCountWithHttpInfo(reportsrunnerv3GetReportDataCountRequest: Reportsrunnerv3GetReportDataCountRequest, _options?: Configuration): Promise<HttpInfo<Reportsrunnerv3GetReportDataCountResponse>> {
        const result = this.api.reportsRunnerGetReportDataCountWithHttpInfo(reportsrunnerv3GetReportDataCountRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get report data count Description: Get report data.
     * @param reportsrunnerv3GetReportDataCountRequest 
     */
    public reportsRunnerGetReportDataCount(reportsrunnerv3GetReportDataCountRequest: Reportsrunnerv3GetReportDataCountRequest, _options?: Configuration): Promise<Reportsrunnerv3GetReportDataCountResponse> {
        const result = this.api.reportsRunnerGetReportDataCount(reportsrunnerv3GetReportDataCountRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Run audit report Description: Run task report by SQL based ob report ID and filter definition.
     * @param reportId The ID of the Report we wish to run (e.g. 000000000000000000000905).
     * @param reportsrunnerv3RunAuditReportRequest 
     */
    public reportsRunnerRunAuditReportWithHttpInfo(reportId: string, reportsrunnerv3RunAuditReportRequest: Reportsrunnerv3RunAuditReportRequest, _options?: Configuration): Promise<HttpInfo<StreamResultOfReportsrunnerv3RunReportResponse>> {
        const result = this.api.reportsRunnerRunAuditReportWithHttpInfo(reportId, reportsrunnerv3RunAuditReportRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Run audit report Description: Run task report by SQL based ob report ID and filter definition.
     * @param reportId The ID of the Report we wish to run (e.g. 000000000000000000000905).
     * @param reportsrunnerv3RunAuditReportRequest 
     */
    public reportsRunnerRunAuditReport(reportId: string, reportsrunnerv3RunAuditReportRequest: Reportsrunnerv3RunAuditReportRequest, _options?: Configuration): Promise<StreamResultOfReportsrunnerv3RunReportResponse> {
        const result = this.api.reportsRunnerRunAuditReport(reportId, reportsrunnerv3RunAuditReportRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Run report Description: Run report by report ID or by specifying report definition.
     * @param reportsrunnerv3RunReportRequest 
     */
    public reportsRunnerRunReportWithHttpInfo(reportsrunnerv3RunReportRequest: Reportsrunnerv3RunReportRequest, _options?: Configuration): Promise<HttpInfo<StreamResultOfReportsrunnerv3RunReportResponse>> {
        const result = this.api.reportsRunnerRunReportWithHttpInfo(reportsrunnerv3RunReportRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Run report Description: Run report by report ID or by specifying report definition.
     * @param reportsrunnerv3RunReportRequest 
     */
    public reportsRunnerRunReport(reportsrunnerv3RunReportRequest: Reportsrunnerv3RunReportRequest, _options?: Configuration): Promise<StreamResultOfReportsrunnerv3RunReportResponse> {
        const result = this.api.reportsRunnerRunReport(reportsrunnerv3RunReportRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Stop query Description: Stop a query based on the id
     * @param reportsrunnerv3StopQueryRequest 
     */
    public reportsRunnerStopQueryWithHttpInfo(reportsrunnerv3StopQueryRequest: Reportsrunnerv3StopQueryRequest, _options?: Configuration): Promise<HttpInfo<Reportsrunnerv3StopQueryResponse>> {
        const result = this.api.reportsRunnerStopQueryWithHttpInfo(reportsrunnerv3StopQueryRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Stop query Description: Stop a query based on the id
     * @param reportsrunnerv3StopQueryRequest 
     */
    public reportsRunnerStopQuery(reportsrunnerv3StopQueryRequest: Reportsrunnerv3StopQueryRequest, _options?: Configuration): Promise<Reportsrunnerv3StopQueryResponse> {
        const result = this.api.reportsRunnerStopQuery(reportsrunnerv3StopQueryRequest, _options);
        return result.toPromise();
    }


}



import { ObservableReportsServiceApi } from './ObservableAPI';

import { ReportsServiceApiRequestFactory, ReportsServiceApiResponseProcessor} from "../apis/ReportsServiceApi";
export class PromiseReportsServiceApi {
    private api: ObservableReportsServiceApi

    public constructor(
        configuration: Configuration,
        requestFactory?: ReportsServiceApiRequestFactory,
        responseProcessor?: ReportsServiceApiResponseProcessor
    ) {
        this.api = new ObservableReportsServiceApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Summary: Create a category Description: Create a report category
     * @param reportsv3CreateCategoryRequest 
     */
    public reportsServiceCreateCategoryWithHttpInfo(reportsv3CreateCategoryRequest: Reportsv3CreateCategoryRequest, _options?: Configuration): Promise<HttpInfo<Reportsv3CreateCategoryResponse>> {
        const result = this.api.reportsServiceCreateCategoryWithHttpInfo(reportsv3CreateCategoryRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Create a category Description: Create a report category
     * @param reportsv3CreateCategoryRequest 
     */
    public reportsServiceCreateCategory(reportsv3CreateCategoryRequest: Reportsv3CreateCategoryRequest, _options?: Configuration): Promise<Reportsv3CreateCategoryResponse> {
        const result = this.api.reportsServiceCreateCategory(reportsv3CreateCategoryRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Create chart Description: Create custom chart based on provided properties.
     * @param reportsv3CreateChartRequest 
     */
    public reportsServiceCreateChartWithHttpInfo(reportsv3CreateChartRequest: Reportsv3CreateChartRequest, _options?: Configuration): Promise<HttpInfo<Reportsv3CreateChartResponse>> {
        const result = this.api.reportsServiceCreateChartWithHttpInfo(reportsv3CreateChartRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Create chart Description: Create custom chart based on provided properties.
     * @param reportsv3CreateChartRequest 
     */
    public reportsServiceCreateChart(reportsv3CreateChartRequest: Reportsv3CreateChartRequest, _options?: Configuration): Promise<Reportsv3CreateChartResponse> {
        const result = this.api.reportsServiceCreateChart(reportsv3CreateChartRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Create chart template v2 Description: Create custom VEGA chart template.
     * @param reportsv3CreateChartTemplatev2Request 
     */
    public reportsServiceCreateChartTemplatev2WithHttpInfo(reportsv3CreateChartTemplatev2Request: Reportsv3CreateChartTemplatev2Request, _options?: Configuration): Promise<HttpInfo<Reportsv3CreateChartTemplatev2Response>> {
        const result = this.api.reportsServiceCreateChartTemplatev2WithHttpInfo(reportsv3CreateChartTemplatev2Request, _options);
        return result.toPromise();
    }

    /**
     * Summary: Create chart template v2 Description: Create custom VEGA chart template.
     * @param reportsv3CreateChartTemplatev2Request 
     */
    public reportsServiceCreateChartTemplatev2(reportsv3CreateChartTemplatev2Request: Reportsv3CreateChartTemplatev2Request, _options?: Configuration): Promise<Reportsv3CreateChartTemplatev2Response> {
        const result = this.api.reportsServiceCreateChartTemplatev2(reportsv3CreateChartTemplatev2Request, _options);
        return result.toPromise();
    }

    /**
     * Summary: Create chart v2 Description: Create custom VEGA chart based on provided properties.
     * @param reportsv3CreateChartv2Request 
     */
    public reportsServiceCreateChartv2WithHttpInfo(reportsv3CreateChartv2Request: Reportsv3CreateChartv2Request, _options?: Configuration): Promise<HttpInfo<Reportsv3CreateChartv2Response>> {
        const result = this.api.reportsServiceCreateChartv2WithHttpInfo(reportsv3CreateChartv2Request, _options);
        return result.toPromise();
    }

    /**
     * Summary: Create chart v2 Description: Create custom VEGA chart based on provided properties.
     * @param reportsv3CreateChartv2Request 
     */
    public reportsServiceCreateChartv2(reportsv3CreateChartv2Request: Reportsv3CreateChartv2Request, _options?: Configuration): Promise<Reportsv3CreateChartv2Response> {
        const result = this.api.reportsServiceCreateChartv2(reportsv3CreateChartv2Request, _options);
        return result.toPromise();
    }

    /**
     * Summary - Create fields by category Description: Cteate category fields based on provided properties.
     * @param reportsv3CreateFieldsByCategoryRequest 
     */
    public reportsServiceCreateFieldsByCategoryWithHttpInfo(reportsv3CreateFieldsByCategoryRequest: Reportsv3CreateFieldsByCategoryRequest, _options?: Configuration): Promise<HttpInfo<Reportsv3CreateFieldsByCategoryResponse>> {
        const result = this.api.reportsServiceCreateFieldsByCategoryWithHttpInfo(reportsv3CreateFieldsByCategoryRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary - Create fields by category Description: Cteate category fields based on provided properties.
     * @param reportsv3CreateFieldsByCategoryRequest 
     */
    public reportsServiceCreateFieldsByCategory(reportsv3CreateFieldsByCategoryRequest: Reportsv3CreateFieldsByCategoryRequest, _options?: Configuration): Promise<Reportsv3CreateFieldsByCategoryResponse> {
        const result = this.api.reportsServiceCreateFieldsByCategory(reportsv3CreateFieldsByCategoryRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Create a join Description: Create a custom report join
     * @param reportsv3CreateJoinRequest 
     */
    public reportsServiceCreateJoinWithHttpInfo(reportsv3CreateJoinRequest: Reportsv3CreateJoinRequest, _options?: Configuration): Promise<HttpInfo<Reportsv3CreateJoinResponse>> {
        const result = this.api.reportsServiceCreateJoinWithHttpInfo(reportsv3CreateJoinRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Create a join Description: Create a custom report join
     * @param reportsv3CreateJoinRequest 
     */
    public reportsServiceCreateJoin(reportsv3CreateJoinRequest: Reportsv3CreateJoinRequest, _options?: Configuration): Promise<Reportsv3CreateJoinResponse> {
        const result = this.api.reportsServiceCreateJoin(reportsv3CreateJoinRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Create report Description: Create custom report based on provided properties.
     * @param reportsv3CreateReportRequest 
     */
    public reportsServiceCreateReportWithHttpInfo(reportsv3CreateReportRequest: Reportsv3CreateReportRequest, _options?: Configuration): Promise<HttpInfo<Reportsv3CreateReportResponse>> {
        const result = this.api.reportsServiceCreateReportWithHttpInfo(reportsv3CreateReportRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Create report Description: Create custom report based on provided properties.
     * @param reportsv3CreateReportRequest 
     */
    public reportsServiceCreateReport(reportsv3CreateReportRequest: Reportsv3CreateReportRequest, _options?: Configuration): Promise<Reportsv3CreateReportResponse> {
        const result = this.api.reportsServiceCreateReport(reportsv3CreateReportRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Create a variant Description: Create a variant for reports
     * @param reportsv3CreateVariantRequest 
     */
    public reportsServiceCreateVariantWithHttpInfo(reportsv3CreateVariantRequest: Reportsv3CreateVariantRequest, _options?: Configuration): Promise<HttpInfo<Reportsv3CreateVariantResponse>> {
        const result = this.api.reportsServiceCreateVariantWithHttpInfo(reportsv3CreateVariantRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Create a variant Description: Create a variant for reports
     * @param reportsv3CreateVariantRequest 
     */
    public reportsServiceCreateVariant(reportsv3CreateVariantRequest: Reportsv3CreateVariantRequest, _options?: Configuration): Promise<Reportsv3CreateVariantResponse> {
        const result = this.api.reportsServiceCreateVariant(reportsv3CreateVariantRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Delete a category Description: Delete a report category
     * @param categoryId category id.
     * @param tableName table name.
     */
    public reportsServiceDeleteCategoryWithHttpInfo(categoryId?: string, tableName?: string, _options?: Configuration): Promise<HttpInfo<Reportsv3DeleteCategoryResponse>> {
        const result = this.api.reportsServiceDeleteCategoryWithHttpInfo(categoryId, tableName, _options);
        return result.toPromise();
    }

    /**
     * Summary: Delete a category Description: Delete a report category
     * @param categoryId category id.
     * @param tableName table name.
     */
    public reportsServiceDeleteCategory(categoryId?: string, tableName?: string, _options?: Configuration): Promise<Reportsv3DeleteCategoryResponse> {
        const result = this.api.reportsServiceDeleteCategory(categoryId, tableName, _options);
        return result.toPromise();
    }

    /**
     * Summary: Delete chart Description: Delete a custom chart.
     * @param chartId The id of the chart to be deleted.
     */
    public reportsServiceDeleteChartWithHttpInfo(chartId: string, _options?: Configuration): Promise<HttpInfo<Reportsv3DeleteChartResponse>> {
        const result = this.api.reportsServiceDeleteChartWithHttpInfo(chartId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Delete chart Description: Delete a custom chart.
     * @param chartId The id of the chart to be deleted.
     */
    public reportsServiceDeleteChart(chartId: string, _options?: Configuration): Promise<Reportsv3DeleteChartResponse> {
        const result = this.api.reportsServiceDeleteChart(chartId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Delete chart template v2 Description: Delete a custom VEGA chart template.
     * @param templateId Unique template ID.
     */
    public reportsServiceDeleteChartTemplatev2WithHttpInfo(templateId: string, _options?: Configuration): Promise<HttpInfo<Reportsv3DeleteChartTemplatev2Response>> {
        const result = this.api.reportsServiceDeleteChartTemplatev2WithHttpInfo(templateId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Delete chart template v2 Description: Delete a custom VEGA chart template.
     * @param templateId Unique template ID.
     */
    public reportsServiceDeleteChartTemplatev2(templateId: string, _options?: Configuration): Promise<Reportsv3DeleteChartTemplatev2Response> {
        const result = this.api.reportsServiceDeleteChartTemplatev2(templateId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Delete chart v2 Description: Delete a custom VEGA chart.
     * @param chartId The ID of the chart for deletion.
     */
    public reportsServiceDeleteChartv2WithHttpInfo(chartId: string, _options?: Configuration): Promise<HttpInfo<Reportsv3DeleteChartv2Response>> {
        const result = this.api.reportsServiceDeleteChartv2WithHttpInfo(chartId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Delete chart v2 Description: Delete a custom VEGA chart.
     * @param chartId The ID of the chart for deletion.
     */
    public reportsServiceDeleteChartv2(chartId: string, _options?: Configuration): Promise<Reportsv3DeleteChartv2Response> {
        const result = this.api.reportsServiceDeleteChartv2(chartId, _options);
        return result.toPromise();
    }

    /**
     * Summary - Delete fields by category Description: Delete category fields based on provided properties.
     * @param headerIds Header ids.
     * @param tableName table name.
     */
    public reportsServiceDeleteFieldsByCategoryWithHttpInfo(headerIds?: Array<string>, tableName?: string, _options?: Configuration): Promise<HttpInfo<Reportsv3DeleteFieldsByCategoryResponse>> {
        const result = this.api.reportsServiceDeleteFieldsByCategoryWithHttpInfo(headerIds, tableName, _options);
        return result.toPromise();
    }

    /**
     * Summary - Delete fields by category Description: Delete category fields based on provided properties.
     * @param headerIds Header ids.
     * @param tableName table name.
     */
    public reportsServiceDeleteFieldsByCategory(headerIds?: Array<string>, tableName?: string, _options?: Configuration): Promise<Reportsv3DeleteFieldsByCategoryResponse> {
        const result = this.api.reportsServiceDeleteFieldsByCategory(headerIds, tableName, _options);
        return result.toPromise();
    }

    /**
     * Summary: Delete a join Description: Delete a custom join
     * @param joinId The id of the join to be deleted.
     */
    public reportsServiceDeleteJoinWithHttpInfo(joinId: string, _options?: Configuration): Promise<HttpInfo<Reportsv3DeleteJoinResponse>> {
        const result = this.api.reportsServiceDeleteJoinWithHttpInfo(joinId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Delete a join Description: Delete a custom join
     * @param joinId The id of the join to be deleted.
     */
    public reportsServiceDeleteJoin(joinId: string, _options?: Configuration): Promise<Reportsv3DeleteJoinResponse> {
        const result = this.api.reportsServiceDeleteJoin(joinId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Delete report Description: Delete a custom report.
     * @param reportId The id of the Report to be deleted.
     */
    public reportsServiceDeleteReportWithHttpInfo(reportId: string, _options?: Configuration): Promise<HttpInfo<Reportsv3DeleteReportResponse>> {
        const result = this.api.reportsServiceDeleteReportWithHttpInfo(reportId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Delete report Description: Delete a custom report.
     * @param reportId The id of the Report to be deleted.
     */
    public reportsServiceDeleteReport(reportId: string, _options?: Configuration): Promise<Reportsv3DeleteReportResponse> {
        const result = this.api.reportsServiceDeleteReport(reportId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Delete a variant Description: Delete a variant
     * @param variantId The id of the variant to delete
     */
    public reportsServiceDeleteVariantWithHttpInfo(variantId: string, _options?: Configuration): Promise<HttpInfo<Reportsv3DeleteVariantResponse>> {
        const result = this.api.reportsServiceDeleteVariantWithHttpInfo(variantId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Delete a variant Description: Delete a variant
     * @param variantId The id of the variant to delete
     */
    public reportsServiceDeleteVariant(variantId: string, _options?: Configuration): Promise<Reportsv3DeleteVariantResponse> {
        const result = this.api.reportsServiceDeleteVariant(variantId, _options);
        return result.toPromise();
    }

    /**
     * Summary:  Get all available report categories. Description: Get all category related fields or all possible fields.
     * @param reportId Report ID.
     */
    public reportsServiceGetCategoriesWithHttpInfo(reportId?: string, _options?: Configuration): Promise<HttpInfo<Reportsv3GetCategoriesResponse>> {
        const result = this.api.reportsServiceGetCategoriesWithHttpInfo(reportId, _options);
        return result.toPromise();
    }

    /**
     * Summary:  Get all available report categories. Description: Get all category related fields or all possible fields.
     * @param reportId Report ID.
     */
    public reportsServiceGetCategories(reportId?: string, _options?: Configuration): Promise<Reportsv3GetCategoriesResponse> {
        const result = this.api.reportsServiceGetCategories(reportId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get chart settings Description: Get a custom chart based on provided report id.
     * @param chartId Unique Chart ID.
     * @param reportId Unique Report ID.
     */
    public reportsServiceGetChartSettingsWithHttpInfo(chartId?: string, reportId?: string, _options?: Configuration): Promise<HttpInfo<Reportsv3GetChartSettingsResponse>> {
        const result = this.api.reportsServiceGetChartSettingsWithHttpInfo(chartId, reportId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get chart settings Description: Get a custom chart based on provided report id.
     * @param chartId Unique Chart ID.
     * @param reportId Unique Report ID.
     */
    public reportsServiceGetChartSettings(chartId?: string, reportId?: string, _options?: Configuration): Promise<Reportsv3GetChartSettingsResponse> {
        const result = this.api.reportsServiceGetChartSettings(chartId, reportId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get chart settings v2 Description: Get a custom VEGA chart based on provided report id.
     * @param chartId Unique Chart ID.
     * @param reportId Unique Report ID.
     */
    public reportsServiceGetChartSettingsv2WithHttpInfo(chartId?: string, reportId?: string, _options?: Configuration): Promise<HttpInfo<Reportsv3GetChartSettingsv2Response>> {
        const result = this.api.reportsServiceGetChartSettingsv2WithHttpInfo(chartId, reportId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get chart settings v2 Description: Get a custom VEGA chart based on provided report id.
     * @param chartId Unique Chart ID.
     * @param reportId Unique Report ID.
     */
    public reportsServiceGetChartSettingsv2(chartId?: string, reportId?: string, _options?: Configuration): Promise<Reportsv3GetChartSettingsv2Response> {
        const result = this.api.reportsServiceGetChartSettingsv2(chartId, reportId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get chart template v2 Description: Get all custom VEGA chart templates.
     */
    public reportsServiceGetChartTemplatesv2WithHttpInfo(_options?: Configuration): Promise<HttpInfo<Reportsv3GetChartTemplatesv2Response>> {
        const result = this.api.reportsServiceGetChartTemplatesv2WithHttpInfo(_options);
        return result.toPromise();
    }

    /**
     * Summary: Get chart template v2 Description: Get all custom VEGA chart templates.
     */
    public reportsServiceGetChartTemplatesv2(_options?: Configuration): Promise<Reportsv3GetChartTemplatesv2Response> {
        const result = this.api.reportsServiceGetChartTemplatesv2(_options);
        return result.toPromise();
    }

    /**
     * Summary: Get fields by categories Description: Get all category related fields or all possible fields based on a list of categories.
     * @param categoryIds Category IDs.
     */
    public reportsServiceGetFieldsByCategoriesWithHttpInfo(categoryIds?: Array<string>, _options?: Configuration): Promise<HttpInfo<Reportsv3GetFieldsByCategoriesResponse>> {
        const result = this.api.reportsServiceGetFieldsByCategoriesWithHttpInfo(categoryIds, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get fields by categories Description: Get all category related fields or all possible fields based on a list of categories.
     * @param categoryIds Category IDs.
     */
    public reportsServiceGetFieldsByCategories(categoryIds?: Array<string>, _options?: Configuration): Promise<Reportsv3GetFieldsByCategoriesResponse> {
        const result = this.api.reportsServiceGetFieldsByCategories(categoryIds, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get fields by category Description: Get all category related fields or all possible fields.
     * @param categoryId Category ID.
     * @param reportId Report ID.
     * @param tableName optional table name parameter.
     */
    public reportsServiceGetFieldsByCategoryWithHttpInfo(categoryId?: string, reportId?: string, tableName?: string, _options?: Configuration): Promise<HttpInfo<Reportsv3GetFieldsByCategoryResponse>> {
        const result = this.api.reportsServiceGetFieldsByCategoryWithHttpInfo(categoryId, reportId, tableName, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get fields by category Description: Get all category related fields or all possible fields.
     * @param categoryId Category ID.
     * @param reportId Report ID.
     * @param tableName optional table name parameter.
     */
    public reportsServiceGetFieldsByCategory(categoryId?: string, reportId?: string, tableName?: string, _options?: Configuration): Promise<Reportsv3GetFieldsByCategoryResponse> {
        const result = this.api.reportsServiceGetFieldsByCategory(categoryId, reportId, tableName, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get all joins Description: Get all custom joins.
     * @param categoryId Category ID (Optional).
     */
    public reportsServiceGetJoinsWithHttpInfo(categoryId?: string, _options?: Configuration): Promise<HttpInfo<Reportsv3GetJoinsResponse>> {
        const result = this.api.reportsServiceGetJoinsWithHttpInfo(categoryId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get all joins Description: Get all custom joins.
     * @param categoryId Category ID (Optional).
     */
    public reportsServiceGetJoins(categoryId?: string, _options?: Configuration): Promise<Reportsv3GetJoinsResponse> {
        const result = this.api.reportsServiceGetJoins(categoryId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get query by report definition Description: Get query by report definition.
     * @param reportsv3GetQueryByReportDefinitionRequest 
     */
    public reportsServiceGetQueryByReportDefinitionWithHttpInfo(reportsv3GetQueryByReportDefinitionRequest: Reportsv3GetQueryByReportDefinitionRequest, _options?: Configuration): Promise<HttpInfo<Reportsv3GetReportQueryResponse>> {
        const result = this.api.reportsServiceGetQueryByReportDefinitionWithHttpInfo(reportsv3GetQueryByReportDefinitionRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get query by report definition Description: Get query by report definition.
     * @param reportsv3GetQueryByReportDefinitionRequest 
     */
    public reportsServiceGetQueryByReportDefinition(reportsv3GetQueryByReportDefinitionRequest: Reportsv3GetQueryByReportDefinitionRequest, _options?: Configuration): Promise<Reportsv3GetReportQueryResponse> {
        const result = this.api.reportsServiceGetQueryByReportDefinition(reportsv3GetQueryByReportDefinitionRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get query by report ID Description: Get query by report ID.
     * @param reportsv3GetQueryByReportIDRequest 
     */
    public reportsServiceGetQueryByReportIDWithHttpInfo(reportsv3GetQueryByReportIDRequest: Reportsv3GetQueryByReportIDRequest, _options?: Configuration): Promise<HttpInfo<Reportsv3GetReportQueryResponse>> {
        const result = this.api.reportsServiceGetQueryByReportIDWithHttpInfo(reportsv3GetQueryByReportIDRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get query by report ID Description: Get query by report ID.
     * @param reportsv3GetQueryByReportIDRequest 
     */
    public reportsServiceGetQueryByReportID(reportsv3GetQueryByReportIDRequest: Reportsv3GetQueryByReportIDRequest, _options?: Configuration): Promise<Reportsv3GetReportQueryResponse> {
        const result = this.api.reportsServiceGetQueryByReportID(reportsv3GetQueryByReportIDRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get report definition Description: Get report definition.
     * @param reportId Unique Report ID.
     */
    public reportsServiceGetReportDefinitionWithHttpInfo(reportId: string, _options?: Configuration): Promise<HttpInfo<Reportsv3GetReportDefinitionResponse>> {
        const result = this.api.reportsServiceGetReportDefinitionWithHttpInfo(reportId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get report definition Description: Get report definition.
     * @param reportId Unique Report ID.
     */
    public reportsServiceGetReportDefinition(reportId: string, _options?: Configuration): Promise<Reportsv3GetReportDefinitionResponse> {
        const result = this.api.reportsServiceGetReportDefinition(reportId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get report groups Description: Get reports used by the provided groups.
     * @param groups List of group IDs that should be checked for usage in each report.
     */
    public reportsServiceGetReportGroupsWithHttpInfo(groups?: Array<string>, _options?: Configuration): Promise<HttpInfo<Reportsv3GetReportGroupsResponse>> {
        const result = this.api.reportsServiceGetReportGroupsWithHttpInfo(groups, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get report groups Description: Get reports used by the provided groups.
     * @param groups List of group IDs that should be checked for usage in each report.
     */
    public reportsServiceGetReportGroups(groups?: Array<string>, _options?: Configuration): Promise<Reportsv3GetReportGroupsResponse> {
        const result = this.api.reportsServiceGetReportGroups(groups, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get report synopsis Description: Return BriefReport.
     * @param reportId Unique Report ID.
     */
    public reportsServiceGetReportSynopsisWithHttpInfo(reportId: string, _options?: Configuration): Promise<HttpInfo<Reportsv3GetReportSynopsisResponse>> {
        const result = this.api.reportsServiceGetReportSynopsisWithHttpInfo(reportId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get report synopsis Description: Return BriefReport.
     * @param reportId Unique Report ID.
     */
    public reportsServiceGetReportSynopsis(reportId: string, _options?: Configuration): Promise<Reportsv3GetReportSynopsisResponse> {
        const result = this.api.reportsServiceGetReportSynopsis(reportId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get report timestamp header Description: Get where to take a report timestamp given an entity.
     * @param categoryId Category ID parameter.
     * @param tableNames List of all header tables.
     */
    public reportsServiceGetReportTimestampHeaderWithHttpInfo(categoryId?: string, tableNames?: Array<string>, _options?: Configuration): Promise<HttpInfo<Reportsv3GetReportTimestampHeaderResponse>> {
        const result = this.api.reportsServiceGetReportTimestampHeaderWithHttpInfo(categoryId, tableNames, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get report timestamp header Description: Get where to take a report timestamp given an entity.
     * @param categoryId Category ID parameter.
     * @param tableNames List of all header tables.
     */
    public reportsServiceGetReportTimestampHeader(categoryId?: string, tableNames?: Array<string>, _options?: Configuration): Promise<Reportsv3GetReportTimestampHeaderResponse> {
        const result = this.api.reportsServiceGetReportTimestampHeader(categoryId, tableNames, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get reports Description: Get reports list.
     * @param categoryId Optional Category ID parameter.
     * @param tableName Optional table name parameter.
     */
    public reportsServiceGetReportsWithHttpInfo(categoryId?: string, tableName?: string, _options?: Configuration): Promise<HttpInfo<Reportsv3GetReportsResponse>> {
        const result = this.api.reportsServiceGetReportsWithHttpInfo(categoryId, tableName, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get reports Description: Get reports list.
     * @param categoryId Optional Category ID parameter.
     * @param tableName Optional table name parameter.
     */
    public reportsServiceGetReports(categoryId?: string, tableName?: string, _options?: Configuration): Promise<Reportsv3GetReportsResponse> {
        const result = this.api.reportsServiceGetReports(categoryId, tableName, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get the reports that use a join Description: Get the reports that use a join and the headers that are imported by the reports using the join
     * @param joinId 
     */
    public reportsServiceGetReportsForJoinWithHttpInfo(joinId: string, _options?: Configuration): Promise<HttpInfo<Reportsv3GetReportsForJoinResponse>> {
        const result = this.api.reportsServiceGetReportsForJoinWithHttpInfo(joinId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get the reports that use a join Description: Get the reports that use a join and the headers that are imported by the reports using the join
     * @param joinId 
     */
    public reportsServiceGetReportsForJoin(joinId: string, _options?: Configuration): Promise<Reportsv3GetReportsForJoinResponse> {
        const result = this.api.reportsServiceGetReportsForJoin(joinId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get reports tags Description: Get all report distinct tags.
     */
    public reportsServiceGetReportsTagsWithHttpInfo(_options?: Configuration): Promise<HttpInfo<Reportsv3GetReportsTagsResponse>> {
        const result = this.api.reportsServiceGetReportsTagsWithHttpInfo(_options);
        return result.toPromise();
    }

    /**
     * Summary: Get reports tags Description: Get all report distinct tags.
     */
    public reportsServiceGetReportsTags(_options?: Configuration): Promise<Reportsv3GetReportsTagsResponse> {
        const result = this.api.reportsServiceGetReportsTags(_options);
        return result.toPromise();
    }

    /**
     * Summary: Get a variant Description: Get a given variant
     * @param variantId The variant id
     */
    public reportsServiceGetVariantWithHttpInfo(variantId: string, _options?: Configuration): Promise<HttpInfo<Reportsv3GetVariantResponse>> {
        const result = this.api.reportsServiceGetVariantWithHttpInfo(variantId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get a variant Description: Get a given variant
     * @param variantId The variant id
     */
    public reportsServiceGetVariant(variantId: string, _options?: Configuration): Promise<Reportsv3GetVariantResponse> {
        const result = this.api.reportsServiceGetVariant(variantId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get all variants Description: Get all variants in reports
     */
    public reportsServiceGetVariantsWithHttpInfo(_options?: Configuration): Promise<HttpInfo<Reportsv3GetVariantsResponse>> {
        const result = this.api.reportsServiceGetVariantsWithHttpInfo(_options);
        return result.toPromise();
    }

    /**
     * Summary: Get all variants Description: Get all variants in reports
     */
    public reportsServiceGetVariants(_options?: Configuration): Promise<Reportsv3GetVariantsResponse> {
        const result = this.api.reportsServiceGetVariants(_options);
        return result.toPromise();
    }

    /**
     * Summary: Partial chart update Description: Update a custom chart with partial information.
     * @param chartId Unique chart ID.
     * @param reportsv3PartialChartUpdateRequest 
     */
    public reportsServicePartialChartUpdateWithHttpInfo(chartId: string, reportsv3PartialChartUpdateRequest: Reportsv3PartialChartUpdateRequest, _options?: Configuration): Promise<HttpInfo<Reportsv3PartialChartUpdateResponse>> {
        const result = this.api.reportsServicePartialChartUpdateWithHttpInfo(chartId, reportsv3PartialChartUpdateRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Partial chart update Description: Update a custom chart with partial information.
     * @param chartId Unique chart ID.
     * @param reportsv3PartialChartUpdateRequest 
     */
    public reportsServicePartialChartUpdate(chartId: string, reportsv3PartialChartUpdateRequest: Reportsv3PartialChartUpdateRequest, _options?: Configuration): Promise<Reportsv3PartialChartUpdateResponse> {
        const result = this.api.reportsServicePartialChartUpdate(chartId, reportsv3PartialChartUpdateRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Partial report update Description: Update a custom report with partial information.
     * @param reportId Unique Report ID.
     * @param reportsv3PartialReportUpdateRequest 
     */
    public reportsServicePartialReportUpdateWithHttpInfo(reportId: string, reportsv3PartialReportUpdateRequest: Reportsv3PartialReportUpdateRequest, _options?: Configuration): Promise<HttpInfo<Reportsv3PartialReportUpdateResponse>> {
        const result = this.api.reportsServicePartialReportUpdateWithHttpInfo(reportId, reportsv3PartialReportUpdateRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Partial report update Description: Update a custom report with partial information.
     * @param reportId Unique Report ID.
     * @param reportsv3PartialReportUpdateRequest 
     */
    public reportsServicePartialReportUpdate(reportId: string, reportsv3PartialReportUpdateRequest: Reportsv3PartialReportUpdateRequest, _options?: Configuration): Promise<Reportsv3PartialReportUpdateResponse> {
        const result = this.api.reportsServicePartialReportUpdate(reportId, reportsv3PartialReportUpdateRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Run a variant Description: Run the operations in a variant
     * @param reportsv3RunVariantOperationRequest 
     */
    public reportsServiceRunVariantOperationWithHttpInfo(reportsv3RunVariantOperationRequest: Reportsv3RunVariantOperationRequest, _options?: Configuration): Promise<HttpInfo<Reportsv3RunVariantOperationResponse>> {
        const result = this.api.reportsServiceRunVariantOperationWithHttpInfo(reportsv3RunVariantOperationRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Run a variant Description: Run the operations in a variant
     * @param reportsv3RunVariantOperationRequest 
     */
    public reportsServiceRunVariantOperation(reportsv3RunVariantOperationRequest: Reportsv3RunVariantOperationRequest, _options?: Configuration): Promise<Reportsv3RunVariantOperationResponse> {
        const result = this.api.reportsServiceRunVariantOperation(reportsv3RunVariantOperationRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Transpose Description: Return the corresponding full sql data.
     * @param reportsv3TransposeRequest 
     */
    public reportsServiceTransposeWithHttpInfo(reportsv3TransposeRequest: Reportsv3TransposeRequest, _options?: Configuration): Promise<HttpInfo<Reportsv3RunReportResponse>> {
        const result = this.api.reportsServiceTransposeWithHttpInfo(reportsv3TransposeRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Transpose Description: Return the corresponding full sql data.
     * @param reportsv3TransposeRequest 
     */
    public reportsServiceTranspose(reportsv3TransposeRequest: Reportsv3TransposeRequest, _options?: Configuration): Promise<Reportsv3RunReportResponse> {
        const result = this.api.reportsServiceTranspose(reportsv3TransposeRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Update chart Description: Update a custom chart.
     * @param chartId Unique chart ID.
     * @param reportsv3UpdateChartRequest 
     */
    public reportsServiceUpdateChartWithHttpInfo(chartId: string, reportsv3UpdateChartRequest: Reportsv3UpdateChartRequest, _options?: Configuration): Promise<HttpInfo<Reportsv3UpdateChartResponse>> {
        const result = this.api.reportsServiceUpdateChartWithHttpInfo(chartId, reportsv3UpdateChartRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Update chart Description: Update a custom chart.
     * @param chartId Unique chart ID.
     * @param reportsv3UpdateChartRequest 
     */
    public reportsServiceUpdateChart(chartId: string, reportsv3UpdateChartRequest: Reportsv3UpdateChartRequest, _options?: Configuration): Promise<Reportsv3UpdateChartResponse> {
        const result = this.api.reportsServiceUpdateChart(chartId, reportsv3UpdateChartRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Update chart v2 Description: Update a custom VEGA chart.
     * @param chartId Unique chart ID.
     * @param reportsv3UpdateChartv2Request 
     */
    public reportsServiceUpdateChartv2WithHttpInfo(chartId: string, reportsv3UpdateChartv2Request: Reportsv3UpdateChartv2Request, _options?: Configuration): Promise<HttpInfo<Reportsv3UpdateChartv2Response>> {
        const result = this.api.reportsServiceUpdateChartv2WithHttpInfo(chartId, reportsv3UpdateChartv2Request, _options);
        return result.toPromise();
    }

    /**
     * Summary: Update chart v2 Description: Update a custom VEGA chart.
     * @param chartId Unique chart ID.
     * @param reportsv3UpdateChartv2Request 
     */
    public reportsServiceUpdateChartv2(chartId: string, reportsv3UpdateChartv2Request: Reportsv3UpdateChartv2Request, _options?: Configuration): Promise<Reportsv3UpdateChartv2Response> {
        const result = this.api.reportsServiceUpdateChartv2(chartId, reportsv3UpdateChartv2Request, _options);
        return result.toPromise();
    }

    /**
     * Summary: Update a join Description: Update a custom join
     * @param joinId Unique join ID.
     * @param reportsv3UpdateJoinRequest 
     */
    public reportsServiceUpdateJoinWithHttpInfo(joinId: string, reportsv3UpdateJoinRequest: Reportsv3UpdateJoinRequest, _options?: Configuration): Promise<HttpInfo<Reportsv3UpdateJoinResponse>> {
        const result = this.api.reportsServiceUpdateJoinWithHttpInfo(joinId, reportsv3UpdateJoinRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Update a join Description: Update a custom join
     * @param joinId Unique join ID.
     * @param reportsv3UpdateJoinRequest 
     */
    public reportsServiceUpdateJoin(joinId: string, reportsv3UpdateJoinRequest: Reportsv3UpdateJoinRequest, _options?: Configuration): Promise<Reportsv3UpdateJoinResponse> {
        const result = this.api.reportsServiceUpdateJoin(joinId, reportsv3UpdateJoinRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Update report Description: Update a custom report.
     * @param reportId Unique Report ID.
     * @param reportsv3UpdateReportRequest 
     */
    public reportsServiceUpdateReportWithHttpInfo(reportId: string, reportsv3UpdateReportRequest: Reportsv3UpdateReportRequest, _options?: Configuration): Promise<HttpInfo<Reportsv3UpdateReportResponse>> {
        const result = this.api.reportsServiceUpdateReportWithHttpInfo(reportId, reportsv3UpdateReportRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Update report Description: Update a custom report.
     * @param reportId Unique Report ID.
     * @param reportsv3UpdateReportRequest 
     */
    public reportsServiceUpdateReport(reportId: string, reportsv3UpdateReportRequest: Reportsv3UpdateReportRequest, _options?: Configuration): Promise<Reportsv3UpdateReportResponse> {
        const result = this.api.reportsServiceUpdateReport(reportId, reportsv3UpdateReportRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Update a variant Description: Update a variant with a custom override
     * @param variantId The variant id
     * @param reportsv3UpdateVariantOverrideRequest 
     */
    public reportsServiceUpdateVariantOverrideWithHttpInfo(variantId: string, reportsv3UpdateVariantOverrideRequest: Reportsv3UpdateVariantOverrideRequest, _options?: Configuration): Promise<HttpInfo<Reportsv3UpdateVariantOverrideResponse>> {
        const result = this.api.reportsServiceUpdateVariantOverrideWithHttpInfo(variantId, reportsv3UpdateVariantOverrideRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Update a variant Description: Update a variant with a custom override
     * @param variantId The variant id
     * @param reportsv3UpdateVariantOverrideRequest 
     */
    public reportsServiceUpdateVariantOverride(variantId: string, reportsv3UpdateVariantOverrideRequest: Reportsv3UpdateVariantOverrideRequest, _options?: Configuration): Promise<Reportsv3UpdateVariantOverrideResponse> {
        const result = this.api.reportsServiceUpdateVariantOverride(variantId, reportsv3UpdateVariantOverrideRequest, _options);
        return result.toPromise();
    }


}



import { ObservableRiskAnalyticsControllerApi } from './ObservableAPI';

import { RiskAnalyticsControllerApiRequestFactory, RiskAnalyticsControllerApiResponseProcessor} from "../apis/RiskAnalyticsControllerApi";
export class PromiseRiskAnalyticsControllerApi {
    private api: ObservableRiskAnalyticsControllerApi

    public constructor(
        configuration: Configuration,
        requestFactory?: RiskAnalyticsControllerApiRequestFactory,
        responseProcessor?: RiskAnalyticsControllerApiResponseProcessor
    ) {
        this.api = new ObservableRiskAnalyticsControllerApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Summary: Enable disable risk rvent feedback Description: Enable or disable the collect feedback process.
     * @param riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest 
     */
    public riskAnalyticsControllerEnableDisableRiskEventFeedbackWithHttpInfo(riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest: Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest, _options?: Configuration): Promise<HttpInfo<Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackResponse>> {
        const result = this.api.riskAnalyticsControllerEnableDisableRiskEventFeedbackWithHttpInfo(riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Enable disable risk rvent feedback Description: Enable or disable the collect feedback process.
     * @param riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest 
     */
    public riskAnalyticsControllerEnableDisableRiskEventFeedback(riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest: Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest, _options?: Configuration): Promise<Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackResponse> {
        const result = this.api.riskAnalyticsControllerEnableDisableRiskEventFeedback(riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Enable disable risk event process Description: Enable or disable the risk event process.
     * @param riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest 
     */
    public riskAnalyticsControllerEnableDisableRiskEventProcessWithHttpInfo(riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest: Riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest, _options?: Configuration): Promise<HttpInfo<Riskanalyticscontrollerv3EnableDisableRiskEventProcessResponse>> {
        const result = this.api.riskAnalyticsControllerEnableDisableRiskEventProcessWithHttpInfo(riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Enable disable risk event process Description: Enable or disable the risk event process.
     * @param riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest 
     */
    public riskAnalyticsControllerEnableDisableRiskEventProcess(riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest: Riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest, _options?: Configuration): Promise<Riskanalyticscontrollerv3EnableDisableRiskEventProcessResponse> {
        const result = this.api.riskAnalyticsControllerEnableDisableRiskEventProcess(riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get all classifications Description: Get all possible classifications for a risk event.
     */
    public riskAnalyticsControllerGetAllClassificationsListWithHttpInfo(_options?: Configuration): Promise<HttpInfo<Riskanalyticscontrollerv3GetAllClassificationsListResponse>> {
        const result = this.api.riskAnalyticsControllerGetAllClassificationsListWithHttpInfo(_options);
        return result.toPromise();
    }

    /**
     * Summary: Get all classifications Description: Get all possible classifications for a risk event.
     */
    public riskAnalyticsControllerGetAllClassificationsList(_options?: Configuration): Promise<Riskanalyticscontrollerv3GetAllClassificationsListResponse> {
        const result = this.api.riskAnalyticsControllerGetAllClassificationsList(_options);
        return result.toPromise();
    }

    /**
     * Summary: Get risk event classifications list Description: retrieves the ClassificationMatchDetails for a given risk id – classification that did not matched will be with class_value 0.
     * @param riskId Risk id
     */
    public riskAnalyticsControllerGetRiskEventClassificationsListWithHttpInfo(riskId: number, _options?: Configuration): Promise<HttpInfo<Riskanalyticscontrollerv3GetRiskEventClassificationsListResponse>> {
        const result = this.api.riskAnalyticsControllerGetRiskEventClassificationsListWithHttpInfo(riskId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get risk event classifications list Description: retrieves the ClassificationMatchDetails for a given risk id – classification that did not matched will be with class_value 0.
     * @param riskId Risk id
     */
    public riskAnalyticsControllerGetRiskEventClassificationsList(riskId: number, _options?: Configuration): Promise<Riskanalyticscontrollerv3GetRiskEventClassificationsListResponse> {
        const result = this.api.riskAnalyticsControllerGetRiskEventClassificationsList(riskId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get risk event data needed for summarization task Description: Retrieve the full information about this risk event including all findings data
     * @param riskId Risk ID
     * @param includeIndicators Indicates whether to include indicators in the response or not.
     * @param numFindingsLimit Max number of hours to get for the risk.
     */
    public riskAnalyticsControllerGetRiskEventDataForSummarizationWithHttpInfo(riskId: number, includeIndicators?: boolean, numFindingsLimit?: number, _options?: Configuration): Promise<HttpInfo<Riskanalyticscontrollerv3RiskEventSummarizationDataResponse>> {
        const result = this.api.riskAnalyticsControllerGetRiskEventDataForSummarizationWithHttpInfo(riskId, includeIndicators, numFindingsLimit, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get risk event data needed for summarization task Description: Retrieve the full information about this risk event including all findings data
     * @param riskId Risk ID
     * @param includeIndicators Indicates whether to include indicators in the response or not.
     * @param numFindingsLimit Max number of hours to get for the risk.
     */
    public riskAnalyticsControllerGetRiskEventDataForSummarization(riskId: number, includeIndicators?: boolean, numFindingsLimit?: number, _options?: Configuration): Promise<Riskanalyticscontrollerv3RiskEventSummarizationDataResponse> {
        const result = this.api.riskAnalyticsControllerGetRiskEventDataForSummarization(riskId, includeIndicators, numFindingsLimit, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get risk event details Description: Return the details of a risk event, including risk general info and a list of observations.
     * @param riskId Risk id.
     */
    public riskAnalyticsControllerGetRiskEventDetailsWithHttpInfo(riskId: number, _options?: Configuration): Promise<HttpInfo<Riskanalyticscontrollerv3GetRiskEventDetailsResponse>> {
        const result = this.api.riskAnalyticsControllerGetRiskEventDetailsWithHttpInfo(riskId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get risk event details Description: Return the details of a risk event, including risk general info and a list of observations.
     * @param riskId Risk id.
     */
    public riskAnalyticsControllerGetRiskEventDetails(riskId: number, _options?: Configuration): Promise<Riskanalyticscontrollerv3GetRiskEventDetailsResponse> {
        const result = this.api.riskAnalyticsControllerGetRiskEventDetails(riskId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get risk event process status Description: Get the risk event process status.
     */
    public riskAnalyticsControllerGetRiskEventProcessStatusWithHttpInfo(_options?: Configuration): Promise<HttpInfo<Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse>> {
        const result = this.api.riskAnalyticsControllerGetRiskEventProcessStatusWithHttpInfo(_options);
        return result.toPromise();
    }

    /**
     * Summary: Get risk event process status Description: Get the risk event process status.
     */
    public riskAnalyticsControllerGetRiskEventProcessStatus(_options?: Configuration): Promise<Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse> {
        const result = this.api.riskAnalyticsControllerGetRiskEventProcessStatus(_options);
        return result.toPromise();
    }

    /**
     * Summary: Get risk event row Description: Return a list of risk events.
     * @param status Status to retrieve only the status events, blank to retrieve all.
     * @param dateFrom The API retrieves risk events that were open in a time range. date_from defines the start of this time range. format YYYY-MM-DDTHH:mm:ssZ.
     * @param dateTo The API retrieves risk events that were open in a time range. date_to defines the end of this time range. format YYYY-MM-DDTHH:mm:ssZ.
     * @param pivotType Pivot type - enum.
     * @param pivotId Pivot id -  all pivot fields separated by semicolon.
     * @param pivotDbUser Optional db_user - if pivot is db user.
     * @param pivotDatabase Optional database - if pivot is db user / database.
     * @param pivotServerIp Optional server_ip - if pivot is db user / database.
     * @param pivotOsUser Optional os_user - if pivot is os user.
     * @param pivotDatabaseSourceField Optional database_source_field (values database name/service name depends on the server type) - if pivot is db user / database.
     */
    public riskAnalyticsControllerGetRiskEventRowWithHttpInfo(status?: 'UNDEFINED_STATUS' | 'OPENED' | 'CLOSED' | 'DELEGATED' | 'FOLLOWUP', dateFrom?: Date, dateTo?: Date, pivotType?: 'UNDEFINED_PIVOT_TYPE' | 'DATABASE' | 'DB_USER' | 'OS_USER' | 'GLOBAL', pivotId?: string, pivotDbUser?: string, pivotDatabase?: string, pivotServerIp?: string, pivotOsUser?: string, pivotDatabaseSourceField?: 'UNDEFINED' | 'DATABASE_NAME' | 'SERVICE_NAME', _options?: Configuration): Promise<HttpInfo<Riskanalyticscontrollerv3GetRiskEventRowResponse>> {
        const result = this.api.riskAnalyticsControllerGetRiskEventRowWithHttpInfo(status, dateFrom, dateTo, pivotType, pivotId, pivotDbUser, pivotDatabase, pivotServerIp, pivotOsUser, pivotDatabaseSourceField, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get risk event row Description: Return a list of risk events.
     * @param status Status to retrieve only the status events, blank to retrieve all.
     * @param dateFrom The API retrieves risk events that were open in a time range. date_from defines the start of this time range. format YYYY-MM-DDTHH:mm:ssZ.
     * @param dateTo The API retrieves risk events that were open in a time range. date_to defines the end of this time range. format YYYY-MM-DDTHH:mm:ssZ.
     * @param pivotType Pivot type - enum.
     * @param pivotId Pivot id -  all pivot fields separated by semicolon.
     * @param pivotDbUser Optional db_user - if pivot is db user.
     * @param pivotDatabase Optional database - if pivot is db user / database.
     * @param pivotServerIp Optional server_ip - if pivot is db user / database.
     * @param pivotOsUser Optional os_user - if pivot is os user.
     * @param pivotDatabaseSourceField Optional database_source_field (values database name/service name depends on the server type) - if pivot is db user / database.
     */
    public riskAnalyticsControllerGetRiskEventRow(status?: 'UNDEFINED_STATUS' | 'OPENED' | 'CLOSED' | 'DELEGATED' | 'FOLLOWUP', dateFrom?: Date, dateTo?: Date, pivotType?: 'UNDEFINED_PIVOT_TYPE' | 'DATABASE' | 'DB_USER' | 'OS_USER' | 'GLOBAL', pivotId?: string, pivotDbUser?: string, pivotDatabase?: string, pivotServerIp?: string, pivotOsUser?: string, pivotDatabaseSourceField?: 'UNDEFINED' | 'DATABASE_NAME' | 'SERVICE_NAME', _options?: Configuration): Promise<Riskanalyticscontrollerv3GetRiskEventRowResponse> {
        const result = this.api.riskAnalyticsControllerGetRiskEventRow(status, dateFrom, dateTo, pivotType, pivotId, pivotDbUser, pivotDatabase, pivotServerIp, pivotOsUser, pivotDatabaseSourceField, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get vulnerability assessment details for a given risk event Description: Retrieve the information about failed VA tests for assets database and db user
     * @param riskId Risk ID
     */
    public riskAnalyticsControllerGetRiskEventVulnerabilityAssessmentDetailsWithHttpInfo(riskId: number, _options?: Configuration): Promise<HttpInfo<Riskanalyticscontrollerv3RiskEventVulnerabilityAssessmentDetailsResponse>> {
        const result = this.api.riskAnalyticsControllerGetRiskEventVulnerabilityAssessmentDetailsWithHttpInfo(riskId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get vulnerability assessment details for a given risk event Description: Retrieve the information about failed VA tests for assets database and db user
     * @param riskId Risk ID
     */
    public riskAnalyticsControllerGetRiskEventVulnerabilityAssessmentDetails(riskId: number, _options?: Configuration): Promise<Riskanalyticscontrollerv3RiskEventVulnerabilityAssessmentDetailsResponse> {
        const result = this.api.riskAnalyticsControllerGetRiskEventVulnerabilityAssessmentDetails(riskId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get risk feedback Description: Get all feedbacks that are in status NEW/WIP and change them to status WIP.
     */
    public riskAnalyticsControllerGetRiskFeedbackWithHttpInfo(_options?: Configuration): Promise<HttpInfo<Riskanalyticscontrollerv3GetRiskFeedbackResponse>> {
        const result = this.api.riskAnalyticsControllerGetRiskFeedbackWithHttpInfo(_options);
        return result.toPromise();
    }

    /**
     * Summary: Get risk feedback Description: Get all feedbacks that are in status NEW/WIP and change them to status WIP.
     */
    public riskAnalyticsControllerGetRiskFeedback(_options?: Configuration): Promise<Riskanalyticscontrollerv3GetRiskFeedbackResponse> {
        const result = this.api.riskAnalyticsControllerGetRiskFeedback(_options);
        return result.toPromise();
    }

    /**
     * Summary: Get risk observation details Description: Return details of a single risk observation.
     * @param leadFeatureId Lead feature id.
     * @param observationType Observation type.
     */
    public riskAnalyticsControllerGetRiskObservationDetailsWithHttpInfo(leadFeatureId?: number, observationType?: 'UNDEFINED_OBSERVATION_TYPE' | 'ACTIVITY' | 'EXCEPTION' | 'VIOLATION' | 'OUTLIER' | 'ANOMALY', _options?: Configuration): Promise<HttpInfo<Riskanalyticscontrollerv3GetRiskObservationDetailsResponse>> {
        const result = this.api.riskAnalyticsControllerGetRiskObservationDetailsWithHttpInfo(leadFeatureId, observationType, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get risk observation details Description: Return details of a single risk observation.
     * @param leadFeatureId Lead feature id.
     * @param observationType Observation type.
     */
    public riskAnalyticsControllerGetRiskObservationDetails(leadFeatureId?: number, observationType?: 'UNDEFINED_OBSERVATION_TYPE' | 'ACTIVITY' | 'EXCEPTION' | 'VIOLATION' | 'OUTLIER' | 'ANOMALY', _options?: Configuration): Promise<Riskanalyticscontrollerv3GetRiskObservationDetailsResponse> {
        const result = this.api.riskAnalyticsControllerGetRiskObservationDetails(leadFeatureId, observationType, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get user UI settings Description: Get the user settings by user id to display the risk in the UI.
     */
    public riskAnalyticsControllerGetUserUISettingsWithHttpInfo(_options?: Configuration): Promise<HttpInfo<Riskanalyticscontrollerv3GetUserUISettingsResponse>> {
        const result = this.api.riskAnalyticsControllerGetUserUISettingsWithHttpInfo(_options);
        return result.toPromise();
    }

    /**
     * Summary: Get user UI settings Description: Get the user settings by user id to display the risk in the UI.
     */
    public riskAnalyticsControllerGetUserUISettings(_options?: Configuration): Promise<Riskanalyticscontrollerv3GetUserUISettingsResponse> {
        const result = this.api.riskAnalyticsControllerGetUserUISettings(_options);
        return result.toPromise();
    }

    /**
     * Summary: Risk event tuning Description: Perform tuning risk event actions.
     * @param riskanalyticscontrollerv3RiskEventTuningRequest 
     */
    public riskAnalyticsControllerRiskEventTuningWithHttpInfo(riskanalyticscontrollerv3RiskEventTuningRequest: Riskanalyticscontrollerv3RiskEventTuningRequest, _options?: Configuration): Promise<HttpInfo<Riskanalyticscontrollerv3RiskEventTuningResponse>> {
        const result = this.api.riskAnalyticsControllerRiskEventTuningWithHttpInfo(riskanalyticscontrollerv3RiskEventTuningRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Risk event tuning Description: Perform tuning risk event actions.
     * @param riskanalyticscontrollerv3RiskEventTuningRequest 
     */
    public riskAnalyticsControllerRiskEventTuning(riskanalyticscontrollerv3RiskEventTuningRequest: Riskanalyticscontrollerv3RiskEventTuningRequest, _options?: Configuration): Promise<Riskanalyticscontrollerv3RiskEventTuningResponse> {
        const result = this.api.riskAnalyticsControllerRiskEventTuning(riskanalyticscontrollerv3RiskEventTuningRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Set risk event status Description: Update the risk status and justification.
     * @param riskanalyticscontrollerv3SetRiskEventStatusRequest 
     */
    public riskAnalyticsControllerSetRiskEventStatusWithHttpInfo(riskanalyticscontrollerv3SetRiskEventStatusRequest: Riskanalyticscontrollerv3SetRiskEventStatusRequest, _options?: Configuration): Promise<HttpInfo<Riskanalyticscontrollerv3SetRiskEventStatusResponse>> {
        const result = this.api.riskAnalyticsControllerSetRiskEventStatusWithHttpInfo(riskanalyticscontrollerv3SetRiskEventStatusRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Set risk event status Description: Update the risk status and justification.
     * @param riskanalyticscontrollerv3SetRiskEventStatusRequest 
     */
    public riskAnalyticsControllerSetRiskEventStatus(riskanalyticscontrollerv3SetRiskEventStatusRequest: Riskanalyticscontrollerv3SetRiskEventStatusRequest, _options?: Configuration): Promise<Riskanalyticscontrollerv3SetRiskEventStatusResponse> {
        const result = this.api.riskAnalyticsControllerSetRiskEventStatus(riskanalyticscontrollerv3SetRiskEventStatusRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Set user UI settings Description: Set the user settings by user id in the mongo collection. WARNING: this API should not be used manually or by a system external to Guardium. Using this API to change a user settings may prevent the user from using the Risk Event function within Guardium.
     * @param riskanalyticscontrollerv3SetUserUISettingsRequest 
     */
    public riskAnalyticsControllerSetUserUISettingsWithHttpInfo(riskanalyticscontrollerv3SetUserUISettingsRequest: Riskanalyticscontrollerv3SetUserUISettingsRequest, _options?: Configuration): Promise<HttpInfo<Riskanalyticscontrollerv3SetUserUISettingsResponse>> {
        const result = this.api.riskAnalyticsControllerSetUserUISettingsWithHttpInfo(riskanalyticscontrollerv3SetUserUISettingsRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Set user UI settings Description: Set the user settings by user id in the mongo collection. WARNING: this API should not be used manually or by a system external to Guardium. Using this API to change a user settings may prevent the user from using the Risk Event function within Guardium.
     * @param riskanalyticscontrollerv3SetUserUISettingsRequest 
     */
    public riskAnalyticsControllerSetUserUISettings(riskanalyticscontrollerv3SetUserUISettingsRequest: Riskanalyticscontrollerv3SetUserUISettingsRequest, _options?: Configuration): Promise<Riskanalyticscontrollerv3SetUserUISettingsResponse> {
        const result = this.api.riskAnalyticsControllerSetUserUISettings(riskanalyticscontrollerv3SetUserUISettingsRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Update risk feedback Description: Provide feedback for one or more risk events
     * @param riskanalyticscontrollerv3UpdateRiskFeedbackRequest 
     */
    public riskAnalyticsControllerUpdateRiskFeedbackWithHttpInfo(riskanalyticscontrollerv3UpdateRiskFeedbackRequest: Riskanalyticscontrollerv3UpdateRiskFeedbackRequest, _options?: Configuration): Promise<HttpInfo<Riskanalyticscontrollerv3UpdateRiskFeedbackResponse>> {
        const result = this.api.riskAnalyticsControllerUpdateRiskFeedbackWithHttpInfo(riskanalyticscontrollerv3UpdateRiskFeedbackRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Update risk feedback Description: Provide feedback for one or more risk events
     * @param riskanalyticscontrollerv3UpdateRiskFeedbackRequest 
     */
    public riskAnalyticsControllerUpdateRiskFeedback(riskanalyticscontrollerv3UpdateRiskFeedbackRequest: Riskanalyticscontrollerv3UpdateRiskFeedbackRequest, _options?: Configuration): Promise<Riskanalyticscontrollerv3UpdateRiskFeedbackResponse> {
        const result = this.api.riskAnalyticsControllerUpdateRiskFeedback(riskanalyticscontrollerv3UpdateRiskFeedbackRequest, _options);
        return result.toPromise();
    }


}



import { ObservableRiskAnalyticsDataProcessorApi } from './ObservableAPI';

import { RiskAnalyticsDataProcessorApiRequestFactory, RiskAnalyticsDataProcessorApiResponseProcessor} from "../apis/RiskAnalyticsDataProcessorApi";
export class PromiseRiskAnalyticsDataProcessorApi {
    private api: ObservableRiskAnalyticsDataProcessorApi

    public constructor(
        configuration: Configuration,
        requestFactory?: RiskAnalyticsDataProcessorApiRequestFactory,
        responseProcessor?: RiskAnalyticsDataProcessorApiResponseProcessor
    ) {
        this.api = new ObservableRiskAnalyticsDataProcessorApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Summary: Get Risk Event Context Description: Retrieve the context of the given risk ID. This context will be used for LLM interactions.
     * @param riskId Risk id.
     * @param timezone Timezone in IANA format.
     */
    public riskAnalyticsDataProcessorGetRiskContextWithHttpInfo(riskId: number, timezone?: string, _options?: Configuration): Promise<HttpInfo<Riskanalyticsdataprocessorv3GetRiskContextResponse>> {
        const result = this.api.riskAnalyticsDataProcessorGetRiskContextWithHttpInfo(riskId, timezone, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get Risk Event Context Description: Retrieve the context of the given risk ID. This context will be used for LLM interactions.
     * @param riskId Risk id.
     * @param timezone Timezone in IANA format.
     */
    public riskAnalyticsDataProcessorGetRiskContext(riskId: number, timezone?: string, _options?: Configuration): Promise<Riskanalyticsdataprocessorv3GetRiskContextResponse> {
        const result = this.api.riskAnalyticsDataProcessorGetRiskContext(riskId, timezone, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get Risk Event Predefined Questions Description: Retrieve the Predefined Questions of the given risk ID. This Predefined Questions will be used quick actions recommendations.
     * @param riskId Risk id.
     */
    public riskAnalyticsDataProcessorGetRiskPredefinedQuestionsWithHttpInfo(riskId: number, _options?: Configuration): Promise<HttpInfo<Riskanalyticsdataprocessorv3GetRiskPredefinedQuestionsResponse>> {
        const result = this.api.riskAnalyticsDataProcessorGetRiskPredefinedQuestionsWithHttpInfo(riskId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get Risk Event Predefined Questions Description: Retrieve the Predefined Questions of the given risk ID. This Predefined Questions will be used quick actions recommendations.
     * @param riskId Risk id.
     */
    public riskAnalyticsDataProcessorGetRiskPredefinedQuestions(riskId: number, _options?: Configuration): Promise<Riskanalyticsdataprocessorv3GetRiskPredefinedQuestionsResponse> {
        const result = this.api.riskAnalyticsDataProcessorGetRiskPredefinedQuestions(riskId, _options);
        return result.toPromise();
    }


}



import { ObservableRiskAnalyticsEngineApi } from './ObservableAPI';

import { RiskAnalyticsEngineApiRequestFactory, RiskAnalyticsEngineApiResponseProcessor} from "../apis/RiskAnalyticsEngineApi";
export class PromiseRiskAnalyticsEngineApi {
    private api: ObservableRiskAnalyticsEngineApi

    public constructor(
        configuration: Configuration,
        requestFactory?: RiskAnalyticsEngineApiRequestFactory,
        responseProcessor?: RiskAnalyticsEngineApiResponseProcessor
    ) {
        this.api = new ObservableRiskAnalyticsEngineApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Summary: Get lead generator config Description: Retrieve the configuration of a lead generator.
     */
    public riskAnalyticsEngineGetLeadGeneratorConfigWithHttpInfo(_options?: Configuration): Promise<HttpInfo<Riskanalyticsenginev3GetLeadGeneratorConfigResponse>> {
        const result = this.api.riskAnalyticsEngineGetLeadGeneratorConfigWithHttpInfo(_options);
        return result.toPromise();
    }

    /**
     * Summary: Get lead generator config Description: Retrieve the configuration of a lead generator.
     */
    public riskAnalyticsEngineGetLeadGeneratorConfig(_options?: Configuration): Promise<Riskanalyticsenginev3GetLeadGeneratorConfigResponse> {
        const result = this.api.riskAnalyticsEngineGetLeadGeneratorConfig(_options);
        return result.toPromise();
    }

    /**
     * Summary: Update lead generator config Description: Update the configuration of a leads generator.
     * @param riskanalyticsenginev3UpdateLeadGeneratorConfigRequest 
     */
    public riskAnalyticsEngineUpdateLeadGeneratorConfigWithHttpInfo(riskanalyticsenginev3UpdateLeadGeneratorConfigRequest: Riskanalyticsenginev3UpdateLeadGeneratorConfigRequest, _options?: Configuration): Promise<HttpInfo<Riskanalyticsenginev3UpdateLeadGeneratorConfigResponse>> {
        const result = this.api.riskAnalyticsEngineUpdateLeadGeneratorConfigWithHttpInfo(riskanalyticsenginev3UpdateLeadGeneratorConfigRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Update lead generator config Description: Update the configuration of a leads generator.
     * @param riskanalyticsenginev3UpdateLeadGeneratorConfigRequest 
     */
    public riskAnalyticsEngineUpdateLeadGeneratorConfig(riskanalyticsenginev3UpdateLeadGeneratorConfigRequest: Riskanalyticsenginev3UpdateLeadGeneratorConfigRequest, _options?: Configuration): Promise<Riskanalyticsenginev3UpdateLeadGeneratorConfigResponse> {
        const result = this.api.riskAnalyticsEngineUpdateLeadGeneratorConfig(riskanalyticsenginev3UpdateLeadGeneratorConfigRequest, _options);
        return result.toPromise();
    }


}



import { ObservableRiskAnalyticsMlClassificationApi } from './ObservableAPI';

import { RiskAnalyticsMlClassificationApiRequestFactory, RiskAnalyticsMlClassificationApiResponseProcessor} from "../apis/RiskAnalyticsMlClassificationApi";
export class PromiseRiskAnalyticsMlClassificationApi {
    private api: ObservableRiskAnalyticsMlClassificationApi

    public constructor(
        configuration: Configuration,
        requestFactory?: RiskAnalyticsMlClassificationApiRequestFactory,
        responseProcessor?: RiskAnalyticsMlClassificationApiResponseProcessor
    ) {
        this.api = new ObservableRiskAnalyticsMlClassificationApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Summary: Reset the model to its default weights. Description: Load the initial model instead of the existing model - this action is irreversible.
     */
    public riskAnalyticsMlClassificationResetModelToDefaultsWithHttpInfo(_options?: Configuration): Promise<HttpInfo<Riskanalyticsmlclassificationv3ResetModelToDefaultsResponse>> {
        const result = this.api.riskAnalyticsMlClassificationResetModelToDefaultsWithHttpInfo(_options);
        return result.toPromise();
    }

    /**
     * Summary: Reset the model to its default weights. Description: Load the initial model instead of the existing model - this action is irreversible.
     */
    public riskAnalyticsMlClassificationResetModelToDefaults(_options?: Configuration): Promise<Riskanalyticsmlclassificationv3ResetModelToDefaultsResponse> {
        const result = this.api.riskAnalyticsMlClassificationResetModelToDefaults(_options);
        return result.toPromise();
    }


}



import { ObservableSchedulerServiceApi } from './ObservableAPI';

import { SchedulerServiceApiRequestFactory, SchedulerServiceApiResponseProcessor} from "../apis/SchedulerServiceApi";
export class PromiseSchedulerServiceApi {
    private api: ObservableSchedulerServiceApi

    public constructor(
        configuration: Configuration,
        requestFactory?: SchedulerServiceApiRequestFactory,
        responseProcessor?: SchedulerServiceApiResponseProcessor
    ) {
        this.api = new ObservableSchedulerServiceApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Summary: Create scheduled job Description: Create a new scheduled job with tasks.
     * @param schedulerv3CreateScheduledJobRequest 
     */
    public schedulerServiceCreateScheduledJobWithHttpInfo(schedulerv3CreateScheduledJobRequest: Schedulerv3CreateScheduledJobRequest, _options?: Configuration): Promise<HttpInfo<Schedulerv3CreateScheduledJobResponse>> {
        const result = this.api.schedulerServiceCreateScheduledJobWithHttpInfo(schedulerv3CreateScheduledJobRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Create scheduled job Description: Create a new scheduled job with tasks.
     * @param schedulerv3CreateScheduledJobRequest 
     */
    public schedulerServiceCreateScheduledJob(schedulerv3CreateScheduledJobRequest: Schedulerv3CreateScheduledJobRequest, _options?: Configuration): Promise<Schedulerv3CreateScheduledJobResponse> {
        const result = this.api.schedulerServiceCreateScheduledJob(schedulerv3CreateScheduledJobRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Delete scheduled job Description: Delete a single scheduled job.
     * @param scheduleId Unique ID, required for delete.
     */
    public schedulerServiceDeleteScheduledJobWithHttpInfo(scheduleId: string, _options?: Configuration): Promise<HttpInfo<Schedulerv3DeleteScheduledJobResponse>> {
        const result = this.api.schedulerServiceDeleteScheduledJobWithHttpInfo(scheduleId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Delete scheduled job Description: Delete a single scheduled job.
     * @param scheduleId Unique ID, required for delete.
     */
    public schedulerServiceDeleteScheduledJob(scheduleId: string, _options?: Configuration): Promise<Schedulerv3DeleteScheduledJobResponse> {
        const result = this.api.schedulerServiceDeleteScheduledJob(scheduleId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get dependencies Description: returns IDs of distribution rules, response templates, or processing rules that are in use
     * @param configType specify the configuration entry type: Distribution.Rule, workflow_investigation_link, workflow_response_template, etc.
     */
    public schedulerServiceGetDependenciesWithHttpInfo(configType?: string, _options?: Configuration): Promise<HttpInfo<Schedulerv3GetDependenciesResponse>> {
        const result = this.api.schedulerServiceGetDependenciesWithHttpInfo(configType, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get dependencies Description: returns IDs of distribution rules, response templates, or processing rules that are in use
     * @param configType specify the configuration entry type: Distribution.Rule, workflow_investigation_link, workflow_response_template, etc.
     */
    public schedulerServiceGetDependencies(configType?: string, _options?: Configuration): Promise<Schedulerv3GetDependenciesResponse> {
        const result = this.api.schedulerServiceGetDependencies(configType, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get distribution rules Description: Return a list of distribution rule IDs that are used by the scheduler Distribution rules can\'t be edited if it is used by a scheduled job.
     */
    public schedulerServiceGetDistributionRulesWithHttpInfo(_options?: Configuration): Promise<HttpInfo<Schedulerv3GetDistributionRulesResponse>> {
        const result = this.api.schedulerServiceGetDistributionRulesWithHttpInfo(_options);
        return result.toPromise();
    }

    /**
     * Summary: Get distribution rules Description: Return a list of distribution rule IDs that are used by the scheduler Distribution rules can\'t be edited if it is used by a scheduled job.
     */
    public schedulerServiceGetDistributionRules(_options?: Configuration): Promise<Schedulerv3GetDistributionRulesResponse> {
        const result = this.api.schedulerServiceGetDistributionRules(_options);
        return result.toPromise();
    }

    /**
     * Summary: Get scheduled job Description: Return a single ScheduledJob in detail.
     * @param scheduleId Used to return a single scheduledjob.
     */
    public schedulerServiceGetScheduledJobDetailsWithHttpInfo(scheduleId: string, _options?: Configuration): Promise<HttpInfo<Schedulerv3GetScheduledJobResponse>> {
        const result = this.api.schedulerServiceGetScheduledJobDetailsWithHttpInfo(scheduleId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get scheduled job Description: Return a single ScheduledJob in detail.
     * @param scheduleId Used to return a single scheduledjob.
     */
    public schedulerServiceGetScheduledJobDetails(scheduleId: string, _options?: Configuration): Promise<Schedulerv3GetScheduledJobResponse> {
        const result = this.api.schedulerServiceGetScheduledJobDetails(scheduleId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get scheduled jobs Description: Return a list of scheduled jobs and the linked tasks.
     * @param offset Optional: the amount to offset the rows by for pagination.
     * @param limit Optional: the max amount of rows to return for pagination.
     */
    public schedulerServiceGetScheduledJobsWithHttpInfo(offset?: number, limit?: number, _options?: Configuration): Promise<HttpInfo<Schedulerv3ScheduledJobSummaryResponse>> {
        const result = this.api.schedulerServiceGetScheduledJobsWithHttpInfo(offset, limit, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get scheduled jobs Description: Return a list of scheduled jobs and the linked tasks.
     * @param offset Optional: the amount to offset the rows by for pagination.
     * @param limit Optional: the max amount of rows to return for pagination.
     */
    public schedulerServiceGetScheduledJobs(offset?: number, limit?: number, _options?: Configuration): Promise<Schedulerv3ScheduledJobSummaryResponse> {
        const result = this.api.schedulerServiceGetScheduledJobs(offset, limit, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get schedules by report Description: Return an array of scheduled job IDs that run the report_id.  An empty array is returned if the report_id is not scheduled.
     * @param reportId Report ID for the scheduled report.
     * @param schedulerv3GetSchedulesByReportRequest 
     */
    public schedulerServiceGetSchedulesByReportWithHttpInfo(reportId: string, schedulerv3GetSchedulesByReportRequest: Schedulerv3GetSchedulesByReportRequest, _options?: Configuration): Promise<HttpInfo<Schedulerv3GetSchedulesByReportResponse>> {
        const result = this.api.schedulerServiceGetSchedulesByReportWithHttpInfo(reportId, schedulerv3GetSchedulesByReportRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get schedules by report Description: Return an array of scheduled job IDs that run the report_id.  An empty array is returned if the report_id is not scheduled.
     * @param reportId Report ID for the scheduled report.
     * @param schedulerv3GetSchedulesByReportRequest 
     */
    public schedulerServiceGetSchedulesByReport(reportId: string, schedulerv3GetSchedulesByReportRequest: Schedulerv3GetSchedulesByReportRequest, _options?: Configuration): Promise<Schedulerv3GetSchedulesByReportResponse> {
        const result = this.api.schedulerServiceGetSchedulesByReport(reportId, schedulerv3GetSchedulesByReportRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get tags Description: Return an array of all the unique tags from scheduled jobs.
     */
    public schedulerServiceGetTagsWithHttpInfo(_options?: Configuration): Promise<HttpInfo<Schedulerv3GetTagsResponse>> {
        const result = this.api.schedulerServiceGetTagsWithHttpInfo(_options);
        return result.toPromise();
    }

    /**
     * Summary: Get tags Description: Return an array of all the unique tags from scheduled jobs.
     */
    public schedulerServiceGetTags(_options?: Configuration): Promise<Schedulerv3GetTagsResponse> {
        const result = this.api.schedulerServiceGetTags(_options);
        return result.toPromise();
    }

    /**
     * Summary: Search scheduled jobs Description: Return a filtered list of scheduled jobs and the linked tasks.
     * @param schedulerv3SearchScheduledJobsRequest 
     */
    public schedulerServiceSearchScheduledJobsWithHttpInfo(schedulerv3SearchScheduledJobsRequest: Schedulerv3SearchScheduledJobsRequest, _options?: Configuration): Promise<HttpInfo<Schedulerv3ScheduledJobSummaryResponse>> {
        const result = this.api.schedulerServiceSearchScheduledJobsWithHttpInfo(schedulerv3SearchScheduledJobsRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Search scheduled jobs Description: Return a filtered list of scheduled jobs and the linked tasks.
     * @param schedulerv3SearchScheduledJobsRequest 
     */
    public schedulerServiceSearchScheduledJobs(schedulerv3SearchScheduledJobsRequest: Schedulerv3SearchScheduledJobsRequest, _options?: Configuration): Promise<Schedulerv3ScheduledJobSummaryResponse> {
        const result = this.api.schedulerServiceSearchScheduledJobs(schedulerv3SearchScheduledJobsRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Search scheduled task runs Description: Return a list of scheduled task run, start date, end date, status
     * @param schedulerv3SearchScheduledTaskRunsRequest 
     */
    public schedulerServiceSearchScheduledTaskRunsWithHttpInfo(schedulerv3SearchScheduledTaskRunsRequest: Schedulerv3SearchScheduledTaskRunsRequest, _options?: Configuration): Promise<HttpInfo<Schedulerv3SearchScheduledTaskRunsResponse>> {
        const result = this.api.schedulerServiceSearchScheduledTaskRunsWithHttpInfo(schedulerv3SearchScheduledTaskRunsRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Search scheduled task runs Description: Return a list of scheduled task run, start date, end date, status
     * @param schedulerv3SearchScheduledTaskRunsRequest 
     */
    public schedulerServiceSearchScheduledTaskRuns(schedulerv3SearchScheduledTaskRunsRequest: Schedulerv3SearchScheduledTaskRunsRequest, _options?: Configuration): Promise<Schedulerv3SearchScheduledTaskRunsResponse> {
        const result = this.api.schedulerServiceSearchScheduledTaskRuns(schedulerv3SearchScheduledTaskRunsRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Update scheduled job Description: Update a single schedule job.
     * @param scheduleId Unique ID, required for update.
     * @param schedulerv3UpdateScheduledJobRequest 
     */
    public schedulerServiceUpdateScheduledJobWithHttpInfo(scheduleId: string, schedulerv3UpdateScheduledJobRequest: Schedulerv3UpdateScheduledJobRequest, _options?: Configuration): Promise<HttpInfo<Schedulerv3UpdateScheduledJobResponse>> {
        const result = this.api.schedulerServiceUpdateScheduledJobWithHttpInfo(scheduleId, schedulerv3UpdateScheduledJobRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Update scheduled job Description: Update a single schedule job.
     * @param scheduleId Unique ID, required for update.
     * @param schedulerv3UpdateScheduledJobRequest 
     */
    public schedulerServiceUpdateScheduledJob(scheduleId: string, schedulerv3UpdateScheduledJobRequest: Schedulerv3UpdateScheduledJobRequest, _options?: Configuration): Promise<Schedulerv3UpdateScheduledJobResponse> {
        const result = this.api.schedulerServiceUpdateScheduledJob(scheduleId, schedulerv3UpdateScheduledJobRequest, _options);
        return result.toPromise();
    }


}



import { ObservableSnifAssistServiceApi } from './ObservableAPI';

import { SnifAssistServiceApiRequestFactory, SnifAssistServiceApiResponseProcessor} from "../apis/SnifAssistServiceApi";
export class PromiseSnifAssistServiceApi {
    private api: ObservableSnifAssistServiceApi

    public constructor(
        configuration: Configuration,
        requestFactory?: SnifAssistServiceApiRequestFactory,
        responseProcessor?: SnifAssistServiceApiResponseProcessor
    ) {
        this.api = new ObservableSnifAssistServiceApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Summary: Test regex Description: Match a text string with a regular expression using the same sniffer  code used in production to match a regex.
     * @param snifassistv3TestRegexRequest 
     */
    public snifAssistServiceTestRegexWithHttpInfo(snifassistv3TestRegexRequest: Snifassistv3TestRegexRequest, _options?: Configuration): Promise<HttpInfo<Snifassistv3StatusResponseBase>> {
        const result = this.api.snifAssistServiceTestRegexWithHttpInfo(snifassistv3TestRegexRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Test regex Description: Match a text string with a regular expression using the same sniffer  code used in production to match a regex.
     * @param snifassistv3TestRegexRequest 
     */
    public snifAssistServiceTestRegex(snifassistv3TestRegexRequest: Snifassistv3TestRegexRequest, _options?: Configuration): Promise<Snifassistv3StatusResponseBase> {
        const result = this.api.snifAssistServiceTestRegex(snifassistv3TestRegexRequest, _options);
        return result.toPromise();
    }


}



import { ObservableStreamsServiceApi } from './ObservableAPI';

import { StreamsServiceApiRequestFactory, StreamsServiceApiResponseProcessor} from "../apis/StreamsServiceApi";
export class PromiseStreamsServiceApi {
    private api: ObservableStreamsServiceApi

    public constructor(
        configuration: Configuration,
        requestFactory?: StreamsServiceApiRequestFactory,
        responseProcessor?: StreamsServiceApiResponseProcessor
    ) {
        this.api = new ObservableStreamsServiceApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Summary: Check AWS credentials Description: Service to verify AWS credentials.
     * @param streamsv3CheckAWSCredentialsRequest 
     */
    public streamsServiceCheckAWSCredentialsWithHttpInfo(streamsv3CheckAWSCredentialsRequest: Streamsv3CheckAWSCredentialsRequest, _options?: Configuration): Promise<HttpInfo<Streamsv3CheckAWSCredentialsResponse>> {
        const result = this.api.streamsServiceCheckAWSCredentialsWithHttpInfo(streamsv3CheckAWSCredentialsRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Check AWS credentials Description: Service to verify AWS credentials.
     * @param streamsv3CheckAWSCredentialsRequest 
     */
    public streamsServiceCheckAWSCredentials(streamsv3CheckAWSCredentialsRequest: Streamsv3CheckAWSCredentialsRequest, _options?: Configuration): Promise<Streamsv3CheckAWSCredentialsResponse> {
        const result = this.api.streamsServiceCheckAWSCredentials(streamsv3CheckAWSCredentialsRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Check Azure event hub Description: Service to check Azure event hub.
     * @param streamsv3CheckAzureEventHubRequest 
     */
    public streamsServiceCheckAzureEventHubWithHttpInfo(streamsv3CheckAzureEventHubRequest: Streamsv3CheckAzureEventHubRequest, _options?: Configuration): Promise<HttpInfo<Streamsv3CheckAzureEventHubResponse>> {
        const result = this.api.streamsServiceCheckAzureEventHubWithHttpInfo(streamsv3CheckAzureEventHubRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Check Azure event hub Description: Service to check Azure event hub.
     * @param streamsv3CheckAzureEventHubRequest 
     */
    public streamsServiceCheckAzureEventHub(streamsv3CheckAzureEventHubRequest: Streamsv3CheckAzureEventHubRequest, _options?: Configuration): Promise<Streamsv3CheckAzureEventHubResponse> {
        const result = this.api.streamsServiceCheckAzureEventHub(streamsv3CheckAzureEventHubRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Check Azure storage string Description: Service to verify Azure storage connection.
     * @param streamsv3CheckAzureStorageStringRequest 
     */
    public streamsServiceCheckAzureStorageStringWithHttpInfo(streamsv3CheckAzureStorageStringRequest: Streamsv3CheckAzureStorageStringRequest, _options?: Configuration): Promise<HttpInfo<Streamsv3CheckAzureStorageStringResponse>> {
        const result = this.api.streamsServiceCheckAzureStorageStringWithHttpInfo(streamsv3CheckAzureStorageStringRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Check Azure storage string Description: Service to verify Azure storage connection.
     * @param streamsv3CheckAzureStorageStringRequest 
     */
    public streamsServiceCheckAzureStorageString(streamsv3CheckAzureStorageStringRequest: Streamsv3CheckAzureStorageStringRequest, _options?: Configuration): Promise<Streamsv3CheckAzureStorageStringResponse> {
        const result = this.api.streamsServiceCheckAzureStorageString(streamsv3CheckAzureStorageStringRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get AWS regions Description: Service to get AWS regions.
     */
    public streamsServiceGetAWSRegionsWithHttpInfo(_options?: Configuration): Promise<HttpInfo<Streamsv3GetAWSRegionsResponse>> {
        const result = this.api.streamsServiceGetAWSRegionsWithHttpInfo(_options);
        return result.toPromise();
    }

    /**
     * Summary: Get AWS regions Description: Service to get AWS regions.
     */
    public streamsServiceGetAWSRegions(_options?: Configuration): Promise<Streamsv3GetAWSRegionsResponse> {
        const result = this.api.streamsServiceGetAWSRegions(_options);
        return result.toPromise();
    }

    /**
     * Summary: List AWS streams Description: Service to list AWS Kinesis streams.
     * @param streamsv3ListAWSStreamsRequest 
     */
    public streamsServiceListAWSStreamsWithHttpInfo(streamsv3ListAWSStreamsRequest: Streamsv3ListAWSStreamsRequest, _options?: Configuration): Promise<HttpInfo<Streamsv3ListAWSStreamsResponse>> {
        const result = this.api.streamsServiceListAWSStreamsWithHttpInfo(streamsv3ListAWSStreamsRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: List AWS streams Description: Service to list AWS Kinesis streams.
     * @param streamsv3ListAWSStreamsRequest 
     */
    public streamsServiceListAWSStreams(streamsv3ListAWSStreamsRequest: Streamsv3ListAWSStreamsRequest, _options?: Configuration): Promise<Streamsv3ListAWSStreamsResponse> {
        const result = this.api.streamsServiceListAWSStreams(streamsv3ListAWSStreamsRequest, _options);
        return result.toPromise();
    }


}



import { ObservableTemplatesServiceApi } from './ObservableAPI';

import { TemplatesServiceApiRequestFactory, TemplatesServiceApiResponseProcessor} from "../apis/TemplatesServiceApi";
export class PromiseTemplatesServiceApi {
    private api: ObservableTemplatesServiceApi

    public constructor(
        configuration: Configuration,
        requestFactory?: TemplatesServiceApiRequestFactory,
        responseProcessor?: TemplatesServiceApiResponseProcessor
    ) {
        this.api = new ObservableTemplatesServiceApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Summary: Create integration Description: Create a set of new templates for a new integration.
     * @param templatesv3CreateIntegrationRequest 
     */
    public templatesServiceCreateIntegrationWithHttpInfo(templatesv3CreateIntegrationRequest: Templatesv3CreateIntegrationRequest, _options?: Configuration): Promise<HttpInfo<Templatesv3CreateIntegrationResponse>> {
        const result = this.api.templatesServiceCreateIntegrationWithHttpInfo(templatesv3CreateIntegrationRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Create integration Description: Create a set of new templates for a new integration.
     * @param templatesv3CreateIntegrationRequest 
     */
    public templatesServiceCreateIntegration(templatesv3CreateIntegrationRequest: Templatesv3CreateIntegrationRequest, _options?: Configuration): Promise<Templatesv3CreateIntegrationResponse> {
        const result = this.api.templatesServiceCreateIntegration(templatesv3CreateIntegrationRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Create template Description: Create a new template.
     * @param templatesv3CreateTemplateRequest 
     */
    public templatesServiceCreateTemplateWithHttpInfo(templatesv3CreateTemplateRequest: Templatesv3CreateTemplateRequest, _options?: Configuration): Promise<HttpInfo<Templatesv3CreateTemplateResponse>> {
        const result = this.api.templatesServiceCreateTemplateWithHttpInfo(templatesv3CreateTemplateRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Create template Description: Create a new template.
     * @param templatesv3CreateTemplateRequest 
     */
    public templatesServiceCreateTemplate(templatesv3CreateTemplateRequest: Templatesv3CreateTemplateRequest, _options?: Configuration): Promise<Templatesv3CreateTemplateResponse> {
        const result = this.api.templatesServiceCreateTemplate(templatesv3CreateTemplateRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Delete integration Description: Delete all templates associated with an integration.
     * @param integrationId Delete the templates associated with the specified integration ID.
     */
    public templatesServiceDeleteIntegrationWithHttpInfo(integrationId: string, _options?: Configuration): Promise<HttpInfo<Templatesv3DeleteIntegrationResponse>> {
        const result = this.api.templatesServiceDeleteIntegrationWithHttpInfo(integrationId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Delete integration Description: Delete all templates associated with an integration.
     * @param integrationId Delete the templates associated with the specified integration ID.
     */
    public templatesServiceDeleteIntegration(integrationId: string, _options?: Configuration): Promise<Templatesv3DeleteIntegrationResponse> {
        const result = this.api.templatesServiceDeleteIntegration(integrationId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Delete template Description: Delete a specific template.
     * @param templateId Delete the template with the specified unique ID.
     */
    public templatesServiceDeleteTemplateWithHttpInfo(templateId: string, _options?: Configuration): Promise<HttpInfo<Templatesv3DeleteTemplateResponse>> {
        const result = this.api.templatesServiceDeleteTemplateWithHttpInfo(templateId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Delete template Description: Delete a specific template.
     * @param templateId Delete the template with the specified unique ID.
     */
    public templatesServiceDeleteTemplate(templateId: string, _options?: Configuration): Promise<Templatesv3DeleteTemplateResponse> {
        const result = this.api.templatesServiceDeleteTemplate(templateId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get origin default content Description: Return the default content for a template with a specified origin and MIME type.
     * @param origin Origin for the desired content.
     * @param integration Integration provides the context for the Request.
     * @param mimeType MIME type for the desired content.
     */
    public templatesServiceGetOriginDefaultContentWithHttpInfo(origin: 'UNDEFINED_ORIGIN' | 'GENERAL_NOTIFICATION' | 'ANOMALY_NOTIFICATION' | 'DATAMART_NOTIFICATION' | 'FETCH_NOTIFICATION' | 'POLICY_ALERT_NOTIFICATION' | 'RECOMMENDATION_NOTIFICATION' | 'REPORTS_NOTIFICATION' | 'SCHEDULED_REPORT_NOTIFICATION' | 'SCHEDULED_AUDIT_NOTIFICATION' | 'WELCOME_NOTIFICATION' | 'EMAIL_HEADER_AND_FOOTER' | 'RISK_NOTIFICATION' | 'SCHEDULED_JOB_SUMMARY' | 'INCIDENT_NOTIFICATION' | 'MAINTENANCE_NOTIFICATION' | 'QSPM_RISK' | 'POLICY_IMPORT_NOTIFICATION', integration?: 'UNDEFINED_INTEGRATION' | 'SMTP' | 'SNMP' | 'SYSLOG' | 'CASES' | 'SERVICE_NOW' | 'RESILIENT' | 'SOAR' | 'WEBHOOK' | 'SLACK' | 'TEAMS' | 'SMS' | 'JIRA', mimeType?: 'PLAIN_TEXT' | 'TEXT_HTML' | 'APPLICATION_CEF', _options?: Configuration): Promise<HttpInfo<Templatesv3GetOriginDefaultContentResponse>> {
        const result = this.api.templatesServiceGetOriginDefaultContentWithHttpInfo(origin, integration, mimeType, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get origin default content Description: Return the default content for a template with a specified origin and MIME type.
     * @param origin Origin for the desired content.
     * @param integration Integration provides the context for the Request.
     * @param mimeType MIME type for the desired content.
     */
    public templatesServiceGetOriginDefaultContent(origin: 'UNDEFINED_ORIGIN' | 'GENERAL_NOTIFICATION' | 'ANOMALY_NOTIFICATION' | 'DATAMART_NOTIFICATION' | 'FETCH_NOTIFICATION' | 'POLICY_ALERT_NOTIFICATION' | 'RECOMMENDATION_NOTIFICATION' | 'REPORTS_NOTIFICATION' | 'SCHEDULED_REPORT_NOTIFICATION' | 'SCHEDULED_AUDIT_NOTIFICATION' | 'WELCOME_NOTIFICATION' | 'EMAIL_HEADER_AND_FOOTER' | 'RISK_NOTIFICATION' | 'SCHEDULED_JOB_SUMMARY' | 'INCIDENT_NOTIFICATION' | 'MAINTENANCE_NOTIFICATION' | 'QSPM_RISK' | 'POLICY_IMPORT_NOTIFICATION', integration?: 'UNDEFINED_INTEGRATION' | 'SMTP' | 'SNMP' | 'SYSLOG' | 'CASES' | 'SERVICE_NOW' | 'RESILIENT' | 'SOAR' | 'WEBHOOK' | 'SLACK' | 'TEAMS' | 'SMS' | 'JIRA', mimeType?: 'PLAIN_TEXT' | 'TEXT_HTML' | 'APPLICATION_CEF', _options?: Configuration): Promise<Templatesv3GetOriginDefaultContentResponse> {
        const result = this.api.templatesServiceGetOriginDefaultContent(origin, integration, mimeType, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get origin fields Description: Return the fields available with a specific origin.
     * @param origin Origin for the desired fields.
     */
    public templatesServiceGetOriginFieldsWithHttpInfo(origin: 'UNDEFINED_ORIGIN' | 'GENERAL_NOTIFICATION' | 'ANOMALY_NOTIFICATION' | 'DATAMART_NOTIFICATION' | 'FETCH_NOTIFICATION' | 'POLICY_ALERT_NOTIFICATION' | 'RECOMMENDATION_NOTIFICATION' | 'REPORTS_NOTIFICATION' | 'SCHEDULED_REPORT_NOTIFICATION' | 'SCHEDULED_AUDIT_NOTIFICATION' | 'WELCOME_NOTIFICATION' | 'EMAIL_HEADER_AND_FOOTER' | 'RISK_NOTIFICATION' | 'SCHEDULED_JOB_SUMMARY' | 'INCIDENT_NOTIFICATION' | 'MAINTENANCE_NOTIFICATION' | 'QSPM_RISK' | 'POLICY_IMPORT_NOTIFICATION', _options?: Configuration): Promise<HttpInfo<Templatesv3GetOriginFieldsResponse>> {
        const result = this.api.templatesServiceGetOriginFieldsWithHttpInfo(origin, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get origin fields Description: Return the fields available with a specific origin.
     * @param origin Origin for the desired fields.
     */
    public templatesServiceGetOriginFields(origin: 'UNDEFINED_ORIGIN' | 'GENERAL_NOTIFICATION' | 'ANOMALY_NOTIFICATION' | 'DATAMART_NOTIFICATION' | 'FETCH_NOTIFICATION' | 'POLICY_ALERT_NOTIFICATION' | 'RECOMMENDATION_NOTIFICATION' | 'REPORTS_NOTIFICATION' | 'SCHEDULED_REPORT_NOTIFICATION' | 'SCHEDULED_AUDIT_NOTIFICATION' | 'WELCOME_NOTIFICATION' | 'EMAIL_HEADER_AND_FOOTER' | 'RISK_NOTIFICATION' | 'SCHEDULED_JOB_SUMMARY' | 'INCIDENT_NOTIFICATION' | 'MAINTENANCE_NOTIFICATION' | 'QSPM_RISK' | 'POLICY_IMPORT_NOTIFICATION', _options?: Configuration): Promise<Templatesv3GetOriginFieldsResponse> {
        const result = this.api.templatesServiceGetOriginFields(origin, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get template Description: Return a specific template by id.
     * @param templateId The unique ID for the template to fetch.
     * @param includeIntegrationName Include the Integration name in the returned template.
     */
    public templatesServiceGetTemplateWithHttpInfo(templateId: string, includeIntegrationName?: boolean, _options?: Configuration): Promise<HttpInfo<Templatesv3GetTemplateResponse>> {
        const result = this.api.templatesServiceGetTemplateWithHttpInfo(templateId, includeIntegrationName, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get template Description: Return a specific template by id.
     * @param templateId The unique ID for the template to fetch.
     * @param includeIntegrationName Include the Integration name in the returned template.
     */
    public templatesServiceGetTemplate(templateId: string, includeIntegrationName?: boolean, _options?: Configuration): Promise<Templatesv3GetTemplateResponse> {
        const result = this.api.templatesServiceGetTemplate(templateId, includeIntegrationName, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get templates Description: Return all templates based on supplied filters.
     * @param integrationId Filter on templates associated with a specific integration.
     * @param filterIntegration Filter on a set of integrations; ignored if empty.
     * @param filterOrigin Filter on a specific set of data origins; ignored if empty.
     * @param filterMimeType Filter on specific mime types; ignored if empty.
     * @param filterTags Filter on specific tags; ignored if empty.
     * @param filterEnabledOnly Filter on all templates instead of just the enabled templates.
     * @param includeIntegrationName Include the Integration name in the returned templates.
     */
    public templatesServiceGetTemplatesWithHttpInfo(integrationId?: string, filterIntegration?: Array<'UNDEFINED_INTEGRATION' | 'SMTP' | 'SNMP' | 'SYSLOG' | 'CASES' | 'SERVICE_NOW' | 'RESILIENT' | 'SOAR' | 'WEBHOOK' | 'SLACK' | 'TEAMS' | 'SMS' | 'JIRA'>, filterOrigin?: Array<'UNDEFINED_ORIGIN' | 'GENERAL_NOTIFICATION' | 'ANOMALY_NOTIFICATION' | 'DATAMART_NOTIFICATION' | 'FETCH_NOTIFICATION' | 'POLICY_ALERT_NOTIFICATION' | 'RECOMMENDATION_NOTIFICATION' | 'REPORTS_NOTIFICATION' | 'SCHEDULED_REPORT_NOTIFICATION' | 'SCHEDULED_AUDIT_NOTIFICATION' | 'WELCOME_NOTIFICATION' | 'EMAIL_HEADER_AND_FOOTER' | 'RISK_NOTIFICATION' | 'SCHEDULED_JOB_SUMMARY' | 'INCIDENT_NOTIFICATION' | 'MAINTENANCE_NOTIFICATION' | 'QSPM_RISK' | 'POLICY_IMPORT_NOTIFICATION'>, filterMimeType?: Array<'PLAIN_TEXT' | 'TEXT_HTML' | 'APPLICATION_CEF'>, filterTags?: Array<string>, filterEnabledOnly?: boolean, includeIntegrationName?: boolean, _options?: Configuration): Promise<HttpInfo<Templatesv3GetTemplatesResponse>> {
        const result = this.api.templatesServiceGetTemplatesWithHttpInfo(integrationId, filterIntegration, filterOrigin, filterMimeType, filterTags, filterEnabledOnly, includeIntegrationName, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get templates Description: Return all templates based on supplied filters.
     * @param integrationId Filter on templates associated with a specific integration.
     * @param filterIntegration Filter on a set of integrations; ignored if empty.
     * @param filterOrigin Filter on a specific set of data origins; ignored if empty.
     * @param filterMimeType Filter on specific mime types; ignored if empty.
     * @param filterTags Filter on specific tags; ignored if empty.
     * @param filterEnabledOnly Filter on all templates instead of just the enabled templates.
     * @param includeIntegrationName Include the Integration name in the returned templates.
     */
    public templatesServiceGetTemplates(integrationId?: string, filterIntegration?: Array<'UNDEFINED_INTEGRATION' | 'SMTP' | 'SNMP' | 'SYSLOG' | 'CASES' | 'SERVICE_NOW' | 'RESILIENT' | 'SOAR' | 'WEBHOOK' | 'SLACK' | 'TEAMS' | 'SMS' | 'JIRA'>, filterOrigin?: Array<'UNDEFINED_ORIGIN' | 'GENERAL_NOTIFICATION' | 'ANOMALY_NOTIFICATION' | 'DATAMART_NOTIFICATION' | 'FETCH_NOTIFICATION' | 'POLICY_ALERT_NOTIFICATION' | 'RECOMMENDATION_NOTIFICATION' | 'REPORTS_NOTIFICATION' | 'SCHEDULED_REPORT_NOTIFICATION' | 'SCHEDULED_AUDIT_NOTIFICATION' | 'WELCOME_NOTIFICATION' | 'EMAIL_HEADER_AND_FOOTER' | 'RISK_NOTIFICATION' | 'SCHEDULED_JOB_SUMMARY' | 'INCIDENT_NOTIFICATION' | 'MAINTENANCE_NOTIFICATION' | 'QSPM_RISK' | 'POLICY_IMPORT_NOTIFICATION'>, filterMimeType?: Array<'PLAIN_TEXT' | 'TEXT_HTML' | 'APPLICATION_CEF'>, filterTags?: Array<string>, filterEnabledOnly?: boolean, includeIntegrationName?: boolean, _options?: Configuration): Promise<Templatesv3GetTemplatesResponse> {
        const result = this.api.templatesServiceGetTemplates(integrationId, filterIntegration, filterOrigin, filterMimeType, filterTags, filterEnabledOnly, includeIntegrationName, _options);
        return result.toPromise();
    }

    /**
     * Summary: Test template Description: Analyze a specified template to ensure will function correctly when utilized.
     * @param templatesv3TestTemplateRequest 
     */
    public templatesServiceTestTemplateWithHttpInfo(templatesv3TestTemplateRequest: Templatesv3TestTemplateRequest, _options?: Configuration): Promise<HttpInfo<Templatesv3TestTemplateResponse>> {
        const result = this.api.templatesServiceTestTemplateWithHttpInfo(templatesv3TestTemplateRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Test template Description: Analyze a specified template to ensure will function correctly when utilized.
     * @param templatesv3TestTemplateRequest 
     */
    public templatesServiceTestTemplate(templatesv3TestTemplateRequest: Templatesv3TestTemplateRequest, _options?: Configuration): Promise<Templatesv3TestTemplateResponse> {
        const result = this.api.templatesServiceTestTemplate(templatesv3TestTemplateRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Transform template Description: Process the specified template and returns the Title and Content based on supplied data.
     * @param templatesv3TransformTemplateRequest 
     */
    public templatesServiceTransformTemplateWithHttpInfo(templatesv3TransformTemplateRequest: Templatesv3TransformTemplateRequest, _options?: Configuration): Promise<HttpInfo<Templatesv3TransformTemplateResponse>> {
        const result = this.api.templatesServiceTransformTemplateWithHttpInfo(templatesv3TransformTemplateRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Transform template Description: Process the specified template and returns the Title and Content based on supplied data.
     * @param templatesv3TransformTemplateRequest 
     */
    public templatesServiceTransformTemplate(templatesv3TransformTemplateRequest: Templatesv3TransformTemplateRequest, _options?: Configuration): Promise<Templatesv3TransformTemplateResponse> {
        const result = this.api.templatesServiceTransformTemplate(templatesv3TransformTemplateRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Transform template JSON Description: Process the specified template and returns the Title and Content based on supplied json data string.
     * @param templatesv3TransformTemplateJSONRequest 
     */
    public templatesServiceTransformTemplateJSONWithHttpInfo(templatesv3TransformTemplateJSONRequest: Templatesv3TransformTemplateJSONRequest, _options?: Configuration): Promise<HttpInfo<Templatesv3TransformTemplateJSONResponse>> {
        const result = this.api.templatesServiceTransformTemplateJSONWithHttpInfo(templatesv3TransformTemplateJSONRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Transform template JSON Description: Process the specified template and returns the Title and Content based on supplied json data string.
     * @param templatesv3TransformTemplateJSONRequest 
     */
    public templatesServiceTransformTemplateJSON(templatesv3TransformTemplateJSONRequest: Templatesv3TransformTemplateJSONRequest, _options?: Configuration): Promise<Templatesv3TransformTemplateJSONResponse> {
        const result = this.api.templatesServiceTransformTemplateJSON(templatesv3TransformTemplateJSONRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Update template Description: Update a single template.
     * @param templateId The template id to update.
     * @param templatesv3UpdateTemplateRequest 
     */
    public templatesServiceUpdateTemplateWithHttpInfo(templateId: string, templatesv3UpdateTemplateRequest: Templatesv3UpdateTemplateRequest, _options?: Configuration): Promise<HttpInfo<Templatesv3UpdateTemplateResponse>> {
        const result = this.api.templatesServiceUpdateTemplateWithHttpInfo(templateId, templatesv3UpdateTemplateRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Update template Description: Update a single template.
     * @param templateId The template id to update.
     * @param templatesv3UpdateTemplateRequest 
     */
    public templatesServiceUpdateTemplate(templateId: string, templatesv3UpdateTemplateRequest: Templatesv3UpdateTemplateRequest, _options?: Configuration): Promise<Templatesv3UpdateTemplateResponse> {
        const result = this.api.templatesServiceUpdateTemplate(templateId, templatesv3UpdateTemplateRequest, _options);
        return result.toPromise();
    }


}



import { ObservableTenantuserApi } from './ObservableAPI';

import { TenantuserApiRequestFactory, TenantuserApiResponseProcessor} from "../apis/TenantuserApi";
export class PromiseTenantuserApi {
    private api: ObservableTenantuserApi

    public constructor(
        configuration: Configuration,
        requestFactory?: TenantuserApiRequestFactory,
        responseProcessor?: TenantuserApiResponseProcessor
    ) {
        this.api = new ObservableTenantuserApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Summary: Create API key Description: Create API Key.
     * @param tenantuserv3CreateApiKeyRequest 
     */
    public tenantuserCreateAPIKeyWithHttpInfo(tenantuserv3CreateApiKeyRequest: Tenantuserv3CreateApiKeyRequest, _options?: Configuration): Promise<HttpInfo<Tenantuserv3CreateApiKeyResponse>> {
        const result = this.api.tenantuserCreateAPIKeyWithHttpInfo(tenantuserv3CreateApiKeyRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Create API key Description: Create API Key.
     * @param tenantuserv3CreateApiKeyRequest 
     */
    public tenantuserCreateAPIKey(tenantuserv3CreateApiKeyRequest: Tenantuserv3CreateApiKeyRequest, _options?: Configuration): Promise<Tenantuserv3CreateApiKeyResponse> {
        const result = this.api.tenantuserCreateAPIKey(tenantuserv3CreateApiKeyRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Delete API key Description: Delete APIKey Document based on the document id.
     * @param id Apikey id.
     */
    public tenantuserDeleteAPIKeyWithHttpInfo(id: string, _options?: Configuration): Promise<HttpInfo<any>> {
        const result = this.api.tenantuserDeleteAPIKeyWithHttpInfo(id, _options);
        return result.toPromise();
    }

    /**
     * Summary: Delete API key Description: Delete APIKey Document based on the document id.
     * @param id Apikey id.
     */
    public tenantuserDeleteAPIKey(id: string, _options?: Configuration): Promise<any> {
        const result = this.api.tenantuserDeleteAPIKey(id, _options);
        return result.toPromise();
    }

    /**
     * Summary: Delete role Description: Delete a role.
     * @param roleId ID or role deleted.
     */
    public tenantuserDeleteRoleWithHttpInfo(roleId: string, _options?: Configuration): Promise<HttpInfo<any>> {
        const result = this.api.tenantuserDeleteRoleWithHttpInfo(roleId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Delete role Description: Delete a role.
     * @param roleId ID or role deleted.
     */
    public tenantuserDeleteRole(roleId: string, _options?: Configuration): Promise<any> {
        const result = this.api.tenantuserDeleteRole(roleId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get API keys Description: Get all APIKeys base on a tenant ID.
     */
    public tenantuserGetAPIKeysWithHttpInfo(_options?: Configuration): Promise<HttpInfo<Tenantuserv3GetApiKeysResponse>> {
        const result = this.api.tenantuserGetAPIKeysWithHttpInfo(_options);
        return result.toPromise();
    }

    /**
     * Summary: Get API keys Description: Get all APIKeys base on a tenant ID.
     */
    public tenantuserGetAPIKeys(_options?: Configuration): Promise<Tenantuserv3GetApiKeysResponse> {
        const result = this.api.tenantuserGetAPIKeys(_options);
        return result.toPromise();
    }

    /**
     * Summary: Get current user Description: Return the currently authenticated user.
     */
    public tenantuserGetCurrentUserWithHttpInfo(_options?: Configuration): Promise<HttpInfo<Tenantuserv3GetCurrentUserResponse>> {
        const result = this.api.tenantuserGetCurrentUserWithHttpInfo(_options);
        return result.toPromise();
    }

    /**
     * Summary: Get current user Description: Return the currently authenticated user.
     */
    public tenantuserGetCurrentUser(_options?: Configuration): Promise<Tenantuserv3GetCurrentUserResponse> {
        const result = this.api.tenantuserGetCurrentUser(_options);
        return result.toPromise();
    }

    /**
     * Summary: Get privilege Description: Return privilege.
     * @param privilegePrivilegeId Privilege ID.
     * @param privilegeType Privilege Type - a report, group, and datasource may have the same ID. By passing type, the artifact can be uniquely determined.
     */
    public tenantuserGetPrivilegeWithHttpInfo(privilegePrivilegeId: string, privilegeType?: string, _options?: Configuration): Promise<HttpInfo<Tenantuserv3GetPrivilegeResponse>> {
        const result = this.api.tenantuserGetPrivilegeWithHttpInfo(privilegePrivilegeId, privilegeType, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get privilege Description: Return privilege.
     * @param privilegePrivilegeId Privilege ID.
     * @param privilegeType Privilege Type - a report, group, and datasource may have the same ID. By passing type, the artifact can be uniquely determined.
     */
    public tenantuserGetPrivilege(privilegePrivilegeId: string, privilegeType?: string, _options?: Configuration): Promise<Tenantuserv3GetPrivilegeResponse> {
        const result = this.api.tenantuserGetPrivilege(privilegePrivilegeId, privilegeType, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get privileges Description: Return all available privileges (pages, restapi, reports, etc) if no roles are specified If roles are specified, returns cumulative privileges for the list of roles.
     * @param roles If empty, will return all privileges.
     * @param type Type of privilege to return: group, page, permission, report, restapi, etc.
     */
    public tenantuserGetPrivilegesWithHttpInfo(roles?: Array<string>, type?: string, _options?: Configuration): Promise<HttpInfo<Tenantuserv3GetPrivilegesResponse>> {
        const result = this.api.tenantuserGetPrivilegesWithHttpInfo(roles, type, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get privileges Description: Return all available privileges (pages, restapi, reports, etc) if no roles are specified If roles are specified, returns cumulative privileges for the list of roles.
     * @param roles If empty, will return all privileges.
     * @param type Type of privilege to return: group, page, permission, report, restapi, etc.
     */
    public tenantuserGetPrivileges(roles?: Array<string>, type?: string, _options?: Configuration): Promise<Tenantuserv3GetPrivilegesResponse> {
        const result = this.api.tenantuserGetPrivileges(roles, type, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get role Description: Return single role.
     * @param roleId ID of role to be returned.
     */
    public tenantuserGetRoleWithHttpInfo(roleId: string, _options?: Configuration): Promise<HttpInfo<Tenantuserv3Role>> {
        const result = this.api.tenantuserGetRoleWithHttpInfo(roleId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get role Description: Return single role.
     * @param roleId ID of role to be returned.
     */
    public tenantuserGetRole(roleId: string, _options?: Configuration): Promise<Tenantuserv3Role> {
        const result = this.api.tenantuserGetRole(roleId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get roles Description: Return all roles without privileges.
     */
    public tenantuserGetRolesWithHttpInfo(_options?: Configuration): Promise<HttpInfo<Tenantuserv3GetRolesResponse>> {
        const result = this.api.tenantuserGetRolesWithHttpInfo(_options);
        return result.toPromise();
    }

    /**
     * Summary: Get roles Description: Return all roles without privileges.
     */
    public tenantuserGetRoles(_options?: Configuration): Promise<Tenantuserv3GetRolesResponse> {
        const result = this.api.tenantuserGetRoles(_options);
        return result.toPromise();
    }

    /**
     * Summary: Get user Description: Return full user for specified user_id.
     * @param userId User id defaults to the current user or specify \&quot;current\&quot; or an actual user id.
     */
    public tenantuserGetUserWithHttpInfo(userId: string, _options?: Configuration): Promise<HttpInfo<Tenantuserv3GetUserResponse>> {
        const result = this.api.tenantuserGetUserWithHttpInfo(userId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get user Description: Return full user for specified user_id.
     * @param userId User id defaults to the current user or specify \&quot;current\&quot; or an actual user id.
     */
    public tenantuserGetUser(userId: string, _options?: Configuration): Promise<Tenantuserv3GetUserResponse> {
        const result = this.api.tenantuserGetUser(userId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get user names Description: Get user names.
     * @param tenantuserv3GetUserNamesRequest 
     */
    public tenantuserGetUserNamesWithHttpInfo(tenantuserv3GetUserNamesRequest: Tenantuserv3GetUserNamesRequest, _options?: Configuration): Promise<HttpInfo<Tenantuserv3GetUserNamesResponse>> {
        const result = this.api.tenantuserGetUserNamesWithHttpInfo(tenantuserv3GetUserNamesRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get user names Description: Get user names.
     * @param tenantuserv3GetUserNamesRequest 
     */
    public tenantuserGetUserNames(tenantuserv3GetUserNamesRequest: Tenantuserv3GetUserNamesRequest, _options?: Configuration): Promise<Tenantuserv3GetUserNamesResponse> {
        const result = this.api.tenantuserGetUserNames(tenantuserv3GetUserNamesRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get user tenant Description: Return the user plus tenant information.
     * @param userId User id defaults to the current user or specify \&quot;current\&quot; or an actual user id.
     */
    public tenantuserGetUserTenantWithHttpInfo(userId: string, _options?: Configuration): Promise<HttpInfo<Tenantuserv3GetUserTenantResponse>> {
        const result = this.api.tenantuserGetUserTenantWithHttpInfo(userId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get user tenant Description: Return the user plus tenant information.
     * @param userId User id defaults to the current user or specify \&quot;current\&quot; or an actual user id.
     */
    public tenantuserGetUserTenant(userId: string, _options?: Configuration): Promise<Tenantuserv3GetUserTenantResponse> {
        const result = this.api.tenantuserGetUserTenant(userId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Post privileges bulk Description: Perform bulk user add preivilege.
     * @param tenantuserv3PostPrivilegesBulkRequest 
     */
    public tenantuserPostPrivilegesBulkWithHttpInfo(tenantuserv3PostPrivilegesBulkRequest: Tenantuserv3PostPrivilegesBulkRequest, _options?: Configuration): Promise<HttpInfo<Tenantuserv3PostPrivilegesBulkResponse>> {
        const result = this.api.tenantuserPostPrivilegesBulkWithHttpInfo(tenantuserv3PostPrivilegesBulkRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Post privileges bulk Description: Perform bulk user add preivilege.
     * @param tenantuserv3PostPrivilegesBulkRequest 
     */
    public tenantuserPostPrivilegesBulk(tenantuserv3PostPrivilegesBulkRequest: Tenantuserv3PostPrivilegesBulkRequest, _options?: Configuration): Promise<Tenantuserv3PostPrivilegesBulkResponse> {
        const result = this.api.tenantuserPostPrivilegesBulk(tenantuserv3PostPrivilegesBulkRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Post role Description: Create a new role.
     * @param tenantuserv3PostRoleRequest 
     */
    public tenantuserPostRoleWithHttpInfo(tenantuserv3PostRoleRequest: Tenantuserv3PostRoleRequest, _options?: Configuration): Promise<HttpInfo<Tenantuserv3PostRoleResponse>> {
        const result = this.api.tenantuserPostRoleWithHttpInfo(tenantuserv3PostRoleRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Post role Description: Create a new role.
     * @param tenantuserv3PostRoleRequest 
     */
    public tenantuserPostRole(tenantuserv3PostRoleRequest: Tenantuserv3PostRoleRequest, _options?: Configuration): Promise<Tenantuserv3PostRoleResponse> {
        const result = this.api.tenantuserPostRole(tenantuserv3PostRoleRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Update privilege Description: Update privilege.
     * @param privilegeId Permanent id of the privilege to be updated or created.
     * @param tenantuserv3UpdatePrivilegeRequest 
     */
    public tenantuserUpdatePrivilegeWithHttpInfo(privilegeId: string, tenantuserv3UpdatePrivilegeRequest: Tenantuserv3UpdatePrivilegeRequest, _options?: Configuration): Promise<HttpInfo<Tenantuserv3UpdatePrivilegeResponse>> {
        const result = this.api.tenantuserUpdatePrivilegeWithHttpInfo(privilegeId, tenantuserv3UpdatePrivilegeRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Update privilege Description: Update privilege.
     * @param privilegeId Permanent id of the privilege to be updated or created.
     * @param tenantuserv3UpdatePrivilegeRequest 
     */
    public tenantuserUpdatePrivilege(privilegeId: string, tenantuserv3UpdatePrivilegeRequest: Tenantuserv3UpdatePrivilegeRequest, _options?: Configuration): Promise<Tenantuserv3UpdatePrivilegeResponse> {
        const result = this.api.tenantuserUpdatePrivilege(privilegeId, tenantuserv3UpdatePrivilegeRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Update privileges role bulk Description: Perform bulk user update role.
     * @param tenantuserv3UpdatePrivilegesBulkRequest 
     */
    public tenantuserUpdatePrivilegesRoleBulkWithHttpInfo(tenantuserv3UpdatePrivilegesBulkRequest: Tenantuserv3UpdatePrivilegesBulkRequest, _options?: Configuration): Promise<HttpInfo<Tenantuserv3UpdatePrivilegesBulkResponse>> {
        const result = this.api.tenantuserUpdatePrivilegesRoleBulkWithHttpInfo(tenantuserv3UpdatePrivilegesBulkRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Update privileges role bulk Description: Perform bulk user update role.
     * @param tenantuserv3UpdatePrivilegesBulkRequest 
     */
    public tenantuserUpdatePrivilegesRoleBulk(tenantuserv3UpdatePrivilegesBulkRequest: Tenantuserv3UpdatePrivilegesBulkRequest, _options?: Configuration): Promise<Tenantuserv3UpdatePrivilegesBulkResponse> {
        const result = this.api.tenantuserUpdatePrivilegesRoleBulk(tenantuserv3UpdatePrivilegesBulkRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Update role Description: Update single role.
     * @param roleId Permanent id of the role.
     * @param tenantuserv3UpdateRoleRequest 
     */
    public tenantuserUpdateRoleWithHttpInfo(roleId: string, tenantuserv3UpdateRoleRequest: Tenantuserv3UpdateRoleRequest, _options?: Configuration): Promise<HttpInfo<Tenantuserv3UpdateRoleResponse>> {
        const result = this.api.tenantuserUpdateRoleWithHttpInfo(roleId, tenantuserv3UpdateRoleRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Update role Description: Update single role.
     * @param roleId Permanent id of the role.
     * @param tenantuserv3UpdateRoleRequest 
     */
    public tenantuserUpdateRole(roleId: string, tenantuserv3UpdateRoleRequest: Tenantuserv3UpdateRoleRequest, _options?: Configuration): Promise<Tenantuserv3UpdateRoleResponse> {
        const result = this.api.tenantuserUpdateRole(roleId, tenantuserv3UpdateRoleRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Update user role bulk Description: Perform bulk user add or remove role.
     * @param tenantuserv3UpdateUserRoleBulkRequest 
     */
    public tenantuserUpdateUserRoleBulkWithHttpInfo(tenantuserv3UpdateUserRoleBulkRequest: Tenantuserv3UpdateUserRoleBulkRequest, _options?: Configuration): Promise<HttpInfo<Tenantuserv3UpdateUserRoleBulkResponse>> {
        const result = this.api.tenantuserUpdateUserRoleBulkWithHttpInfo(tenantuserv3UpdateUserRoleBulkRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Update user role bulk Description: Perform bulk user add or remove role.
     * @param tenantuserv3UpdateUserRoleBulkRequest 
     */
    public tenantuserUpdateUserRoleBulk(tenantuserv3UpdateUserRoleBulkRequest: Tenantuserv3UpdateUserRoleBulkRequest, _options?: Configuration): Promise<Tenantuserv3UpdateUserRoleBulkResponse> {
        const result = this.api.tenantuserUpdateUserRoleBulk(tenantuserv3UpdateUserRoleBulkRequest, _options);
        return result.toPromise();
    }


}



import { ObservableThirdPartyVendorsApi } from './ObservableAPI';

import { ThirdPartyVendorsApiRequestFactory, ThirdPartyVendorsApiResponseProcessor} from "../apis/ThirdPartyVendorsApi";
export class PromiseThirdPartyVendorsApi {
    private api: ObservableThirdPartyVendorsApi

    public constructor(
        configuration: Configuration,
        requestFactory?: ThirdPartyVendorsApiRequestFactory,
        responseProcessor?: ThirdPartyVendorsApiResponseProcessor
    ) {
        this.api = new ObservableThirdPartyVendorsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Get additional details of a specific third party vendor, such as, customer account details, sensitivities summary, and so on.
     * Get additional details of a specific third party vendor
     * @param vendorId The third party vendor\&#39;s account ID
     */
    public getLinkedVendorWithHttpInfo(vendorId: string, _options?: Configuration): Promise<HttpInfo<Array<VendorSummary>>> {
        const result = this.api.getLinkedVendorWithHttpInfo(vendorId, _options);
        return result.toPromise();
    }

    /**
     * Get additional details of a specific third party vendor, such as, customer account details, sensitivities summary, and so on.
     * Get additional details of a specific third party vendor
     * @param vendorId The third party vendor\&#39;s account ID
     */
    public getLinkedVendor(vendorId: string, _options?: Configuration): Promise<Array<VendorSummary>> {
        const result = this.api.getLinkedVendor(vendorId, _options);
        return result.toPromise();
    }

    /**
     * Get details about a third party vendor.
     * Get the third party vendors list
     * @param vendorId vendor id
     */
    public getSingleLinkedVendorWithHttpInfo(vendorId: string, _options?: Configuration): Promise<HttpInfo<LinkedVendor>> {
        const result = this.api.getSingleLinkedVendorWithHttpInfo(vendorId, _options);
        return result.toPromise();
    }

    /**
     * Get details about a third party vendor.
     * Get the third party vendors list
     * @param vendorId vendor id
     */
    public getSingleLinkedVendor(vendorId: string, _options?: Configuration): Promise<LinkedVendor> {
        const result = this.api.getSingleLinkedVendor(vendorId, _options);
        return result.toPromise();
    }

    /**
     * Get a list of all the data stores that a third party vendor can access. Find out whether the data stores have sensitivities and which role can access the data stores.
     * Get the data stores associated with a third party vendor
     * @param vendorId The third party vendor\&#39;s account ID
     * @param filter 
     * @param sort 
     * @param pageSize 
     * @param nextToken 
     */
    public listLinkedVendorDataStoresWithHttpInfo(vendorId: string, filter?: ListVendorDataStoresFilterParameter, sort?: ListLinkedVendorDataStoresSortParameter, pageSize?: number, nextToken?: string, _options?: Configuration): Promise<HttpInfo<ListLinkedVendorDataStores200Response>> {
        const result = this.api.listLinkedVendorDataStoresWithHttpInfo(vendorId, filter, sort, pageSize, nextToken, _options);
        return result.toPromise();
    }

    /**
     * Get a list of all the data stores that a third party vendor can access. Find out whether the data stores have sensitivities and which role can access the data stores.
     * Get the data stores associated with a third party vendor
     * @param vendorId The third party vendor\&#39;s account ID
     * @param filter 
     * @param sort 
     * @param pageSize 
     * @param nextToken 
     */
    public listLinkedVendorDataStores(vendorId: string, filter?: ListVendorDataStoresFilterParameter, sort?: ListLinkedVendorDataStoresSortParameter, pageSize?: number, nextToken?: string, _options?: Configuration): Promise<ListLinkedVendorDataStores200Response> {
        const result = this.api.listLinkedVendorDataStores(vendorId, filter, sort, pageSize, nextToken, _options);
        return result.toPromise();
    }

    /**
     * Get a list of all third party vendors associated to your cloud environments (relevant for the cloud environments connected to Guardium DSPM only).
     * Get the summary of a third party vendor
     */
    public listLinkedVendorsWithHttpInfo(_options?: Configuration): Promise<HttpInfo<Array<LinkedVendor>>> {
        const result = this.api.listLinkedVendorsWithHttpInfo(_options);
        return result.toPromise();
    }

    /**
     * Get a list of all third party vendors associated to your cloud environments (relevant for the cloud environments connected to Guardium DSPM only).
     * Get the summary of a third party vendor
     */
    public listLinkedVendors(_options?: Configuration): Promise<Array<LinkedVendor>> {
        const result = this.api.listLinkedVendors(_options);
        return result.toPromise();
    }

    /**
     * Get a list of roles, buckets or service principles, and their entitled permissions associated to your cloud environments connected to Guardium DSPM.
     * Get a list of all the actual trusted assets
     * @param filter 
     */
    public listTrustedAssetsWithHttpInfo(filter?: ListTrusteesFilterParameter, _options?: Configuration): Promise<HttpInfo<Array<Trustee>>> {
        const result = this.api.listTrustedAssetsWithHttpInfo(filter, _options);
        return result.toPromise();
    }

    /**
     * Get a list of roles, buckets or service principles, and their entitled permissions associated to your cloud environments connected to Guardium DSPM.
     * Get a list of all the actual trusted assets
     * @param filter 
     */
    public listTrustedAssets(filter?: ListTrusteesFilterParameter, _options?: Configuration): Promise<Array<Trustee>> {
        const result = this.api.listTrustedAssets(filter, _options);
        return result.toPromise();
    }


}



import { ObservableUniversalConnectorManagerApi } from './ObservableAPI';

import { UniversalConnectorManagerApiRequestFactory, UniversalConnectorManagerApiResponseProcessor} from "../apis/UniversalConnectorManagerApi";
export class PromiseUniversalConnectorManagerApi {
    private api: ObservableUniversalConnectorManagerApi

    public constructor(
        configuration: Configuration,
        requestFactory?: UniversalConnectorManagerApiRequestFactory,
        responseProcessor?: UniversalConnectorManagerApiResponseProcessor
    ) {
        this.api = new ObservableUniversalConnectorManagerApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Summary: Get certificate Description: Get the certificate that allows secure communication between data sources and universal connections in Guardium.
     */
    public universalConnectorManagerGetCertificateWithHttpInfo(_options?: Configuration): Promise<HttpInfo<Universalconnectormanagerv3FileResponse>> {
        const result = this.api.universalConnectorManagerGetCertificateWithHttpInfo(_options);
        return result.toPromise();
    }

    /**
     * Summary: Get certificate Description: Get the certificate that allows secure communication between data sources and universal connections in Guardium.
     */
    public universalConnectorManagerGetCertificate(_options?: Configuration): Promise<Universalconnectormanagerv3FileResponse> {
        const result = this.api.universalConnectorManagerGetCertificate(_options);
        return result.toPromise();
    }

    /**
     * Summary: Get connectors Description: Get all the connectors Universal Connector can support. Includes a list of event pipelines (input--filter pairs), along with the supported data source types and platforms.
     */
    public universalConnectorManagerGetConnectorsWithHttpInfo(_options?: Configuration): Promise<HttpInfo<Universalconnectormanagerv3GetConnectorsResponse>> {
        const result = this.api.universalConnectorManagerGetConnectorsWithHttpInfo(_options);
        return result.toPromise();
    }

    /**
     * Summary: Get connectors Description: Get all the connectors Universal Connector can support. Includes a list of event pipelines (input--filter pairs), along with the supported data source types and platforms.
     */
    public universalConnectorManagerGetConnectors(_options?: Configuration): Promise<Universalconnectormanagerv3GetConnectorsResponse> {
        const result = this.api.universalConnectorManagerGetConnectors(_options);
        return result.toPromise();
    }

    /**
     * Summary: List connections summary Description: List a summary of Universal Connector configured connections (AKA datasources).
     */
    public universalConnectorManagerListConnectionsSummaryWithHttpInfo(_options?: Configuration): Promise<HttpInfo<Universalconnectormanagerv3ListConnectionsResponse>> {
        const result = this.api.universalConnectorManagerListConnectionsSummaryWithHttpInfo(_options);
        return result.toPromise();
    }

    /**
     * Summary: List connections summary Description: List a summary of Universal Connector configured connections (AKA datasources).
     */
    public universalConnectorManagerListConnectionsSummary(_options?: Configuration): Promise<Universalconnectormanagerv3ListConnectionsResponse> {
        const result = this.api.universalConnectorManagerListConnectionsSummary(_options);
        return result.toPromise();
    }

    /**
     * Summary: Plugins list Description: List of all universal connector plugins.
     */
    public universalConnectorManagerPluginsListWithHttpInfo(_options?: Configuration): Promise<HttpInfo<Universalconnectormanagerv3PluginsListResponse>> {
        const result = this.api.universalConnectorManagerPluginsListWithHttpInfo(_options);
        return result.toPromise();
    }

    /**
     * Summary: Plugins list Description: List of all universal connector plugins.
     */
    public universalConnectorManagerPluginsList(_options?: Configuration): Promise<Universalconnectormanagerv3PluginsListResponse> {
        const result = this.api.universalConnectorManagerPluginsList(_options);
        return result.toPromise();
    }

    /**
     * Summary: Upload plugin Description: Upload a plugin-package for Universal Connector.
     * @param universalconnectormanagerv3UploadPluginRequest 
     */
    public universalConnectorManagerUploadPluginWithHttpInfo(universalconnectormanagerv3UploadPluginRequest: Universalconnectormanagerv3UploadPluginRequest, _options?: Configuration): Promise<HttpInfo<RpcStatus>> {
        const result = this.api.universalConnectorManagerUploadPluginWithHttpInfo(universalconnectormanagerv3UploadPluginRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Upload plugin Description: Upload a plugin-package for Universal Connector.
     * @param universalconnectormanagerv3UploadPluginRequest 
     */
    public universalConnectorManagerUploadPlugin(universalconnectormanagerv3UploadPluginRequest: Universalconnectormanagerv3UploadPluginRequest, _options?: Configuration): Promise<RpcStatus> {
        const result = this.api.universalConnectorManagerUploadPlugin(universalconnectormanagerv3UploadPluginRequest, _options);
        return result.toPromise();
    }


}



import { ObservableWorkflowApi } from './ObservableAPI';

import { WorkflowApiRequestFactory, WorkflowApiResponseProcessor} from "../apis/WorkflowApi";
export class PromiseWorkflowApi {
    private api: ObservableWorkflowApi

    public constructor(
        configuration: Configuration,
        requestFactory?: WorkflowApiRequestFactory,
        responseProcessor?: WorkflowApiResponseProcessor
    ) {
        this.api = new ObservableWorkflowApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Summary: Create case Description: Create single case.
     * @param workflowv3CreateCaseRequest 
     */
    public workflowCreateCaseWithHttpInfo(workflowv3CreateCaseRequest: Workflowv3CreateCaseRequest, _options?: Configuration): Promise<HttpInfo<Workflowv3CreateCaseResponse>> {
        const result = this.api.workflowCreateCaseWithHttpInfo(workflowv3CreateCaseRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Create case Description: Create single case.
     * @param workflowv3CreateCaseRequest 
     */
    public workflowCreateCase(workflowv3CreateCaseRequest: Workflowv3CreateCaseRequest, _options?: Configuration): Promise<Workflowv3CreateCaseResponse> {
        const result = this.api.workflowCreateCase(workflowv3CreateCaseRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Create task Description: Create single task within a parent case.
     * @param caseId Create tasks with common parent.
     * @param workflowv3CreateTaskRequest 
     */
    public workflowCreateTaskWithHttpInfo(caseId: string, workflowv3CreateTaskRequest: Workflowv3CreateTaskRequest, _options?: Configuration): Promise<HttpInfo<Workflowv3CreateTaskResponse>> {
        const result = this.api.workflowCreateTaskWithHttpInfo(caseId, workflowv3CreateTaskRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Create task Description: Create single task within a parent case.
     * @param caseId Create tasks with common parent.
     * @param workflowv3CreateTaskRequest 
     */
    public workflowCreateTask(caseId: string, workflowv3CreateTaskRequest: Workflowv3CreateTaskRequest, _options?: Configuration): Promise<Workflowv3CreateTaskResponse> {
        const result = this.api.workflowCreateTask(caseId, workflowv3CreateTaskRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get cases Description: Return all cases requested.
     * @param caseId Optional case_id to get a response of an array of one member.
     * @param sortBy Optional field to sort by | first character determines ascending (&gt;) or descending (&lt;).
     * @param offset Optional starting point for the page of data.
     * @param limit Optional page size.
     */
    public workflowGetCasesWithHttpInfo(caseId?: string, sortBy?: string, offset?: number, limit?: number, _options?: Configuration): Promise<HttpInfo<Workflowv3CaseListResponse>> {
        const result = this.api.workflowGetCasesWithHttpInfo(caseId, sortBy, offset, limit, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get cases Description: Return all cases requested.
     * @param caseId Optional case_id to get a response of an array of one member.
     * @param sortBy Optional field to sort by | first character determines ascending (&gt;) or descending (&lt;).
     * @param offset Optional starting point for the page of data.
     * @param limit Optional page size.
     */
    public workflowGetCases(caseId?: string, sortBy?: string, offset?: number, limit?: number, _options?: Configuration): Promise<Workflowv3CaseListResponse> {
        const result = this.api.workflowGetCases(caseId, sortBy, offset, limit, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get cases count Description: Get case count.
     * @param workflowv3GetCasesCountRequest 
     */
    public workflowGetCasesCountWithHttpInfo(workflowv3GetCasesCountRequest: Workflowv3GetCasesCountRequest, _options?: Configuration): Promise<HttpInfo<Workflowv3GetCasesCountResponse>> {
        const result = this.api.workflowGetCasesCountWithHttpInfo(workflowv3GetCasesCountRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get cases count Description: Get case count.
     * @param workflowv3GetCasesCountRequest 
     */
    public workflowGetCasesCount(workflowv3GetCasesCountRequest: Workflowv3GetCasesCountRequest, _options?: Configuration): Promise<Workflowv3GetCasesCountResponse> {
        const result = this.api.workflowGetCasesCount(workflowv3GetCasesCountRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get filename Description: Return filename associated with the task referenced in the associated context record.
     * @param caseId Can be \&quot;*\&quot; if JWT token contains the case_id.
     * @param taskId Can be \&quot;*\&quot; if JWT token contains the task_id.
     */
    public workflowGetFilenameWithHttpInfo(caseId: string, taskId: string, _options?: Configuration): Promise<HttpInfo<Workflowv3GetFilenameResponse>> {
        const result = this.api.workflowGetFilenameWithHttpInfo(caseId, taskId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get filename Description: Return filename associated with the task referenced in the associated context record.
     * @param caseId Can be \&quot;*\&quot; if JWT token contains the case_id.
     * @param taskId Can be \&quot;*\&quot; if JWT token contains the task_id.
     */
    public workflowGetFilename(caseId: string, taskId: string, _options?: Configuration): Promise<Workflowv3GetFilenameResponse> {
        const result = this.api.workflowGetFilename(caseId, taskId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get jobs count Description: Get jobs count.
     * @param caseId Case ID - can be * for all
     * @param workflowv3GetJobsCountRequest 
     */
    public workflowGetJobsCountWithHttpInfo(caseId: string, workflowv3GetJobsCountRequest: Workflowv3GetJobsCountRequest, _options?: Configuration): Promise<HttpInfo<Workflowv3GetJobsCountResponse>> {
        const result = this.api.workflowGetJobsCountWithHttpInfo(caseId, workflowv3GetJobsCountRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get jobs count Description: Get jobs count.
     * @param caseId Case ID - can be * for all
     * @param workflowv3GetJobsCountRequest 
     */
    public workflowGetJobsCount(caseId: string, workflowv3GetJobsCountRequest: Workflowv3GetJobsCountRequest, _options?: Configuration): Promise<Workflowv3GetJobsCountResponse> {
        const result = this.api.workflowGetJobsCount(caseId, workflowv3GetJobsCountRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get report result Description: Return a page of results.
     * @param caseId ID to get the case  (read-only).
     * @param taskId ID to get the task for case(read-only).
     * @param offset Optional starting point for the page of data.
     * @param limit Optional page size.
     */
    public workflowGetReportResultWithHttpInfo(caseId: string, taskId: string, offset?: number, limit?: number, _options?: Configuration): Promise<HttpInfo<Workflowv3GetReportResultResponse>> {
        const result = this.api.workflowGetReportResultWithHttpInfo(caseId, taskId, offset, limit, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get report result Description: Return a page of results.
     * @param caseId ID to get the case  (read-only).
     * @param taskId ID to get the task for case(read-only).
     * @param offset Optional starting point for the page of data.
     * @param limit Optional page size.
     */
    public workflowGetReportResult(caseId: string, taskId: string, offset?: number, limit?: number, _options?: Configuration): Promise<Workflowv3GetReportResultResponse> {
        const result = this.api.workflowGetReportResult(caseId, taskId, offset, limit, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get tasks Description: Return all tasks requested.
     * @param caseId Mandaroty: The parent case which contains the tasks.
     * @param taskId Optional: task_id to return an array of one.
     */
    public workflowGetTasksWithHttpInfo(caseId: string, taskId?: string, _options?: Configuration): Promise<HttpInfo<Workflowv3TaskListResponse>> {
        const result = this.api.workflowGetTasksWithHttpInfo(caseId, taskId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get tasks Description: Return all tasks requested.
     * @param caseId Mandaroty: The parent case which contains the tasks.
     * @param taskId Optional: task_id to return an array of one.
     */
    public workflowGetTasks(caseId: string, taskId?: string, _options?: Configuration): Promise<Workflowv3TaskListResponse> {
        const result = this.api.workflowGetTasks(caseId, taskId, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get cases count Description: Get case count.
     * @param caseId Case ID - can be * for all
     * @param workflowv3GetTasksCountRequest 
     */
    public workflowGetTasksCountWithHttpInfo(caseId: string, workflowv3GetTasksCountRequest: Workflowv3GetTasksCountRequest, _options?: Configuration): Promise<HttpInfo<Workflowv3GetTasksCountResponse>> {
        const result = this.api.workflowGetTasksCountWithHttpInfo(caseId, workflowv3GetTasksCountRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get cases count Description: Get case count.
     * @param caseId Case ID - can be * for all
     * @param workflowv3GetTasksCountRequest 
     */
    public workflowGetTasksCount(caseId: string, workflowv3GetTasksCountRequest: Workflowv3GetTasksCountRequest, _options?: Configuration): Promise<Workflowv3GetTasksCountResponse> {
        const result = this.api.workflowGetTasksCount(caseId, workflowv3GetTasksCountRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Search cases Description: Return a subset of cases.
     * @param workflowv3SearchCasesRequest 
     */
    public workflowSearchCasesWithHttpInfo(workflowv3SearchCasesRequest: Workflowv3SearchCasesRequest, _options?: Configuration): Promise<HttpInfo<Workflowv3CaseListResponse>> {
        const result = this.api.workflowSearchCasesWithHttpInfo(workflowv3SearchCasesRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Search cases Description: Return a subset of cases.
     * @param workflowv3SearchCasesRequest 
     */
    public workflowSearchCases(workflowv3SearchCasesRequest: Workflowv3SearchCasesRequest, _options?: Configuration): Promise<Workflowv3CaseListResponse> {
        const result = this.api.workflowSearchCases(workflowv3SearchCasesRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get a list of report IDs Description: Returns a list of report IDs referenced in all cases and tasks
     * @param workflowv3SearchCasesRequest 
     */
    public workflowSearchReportsWithHttpInfo(workflowv3SearchCasesRequest: Workflowv3SearchCasesRequest, _options?: Configuration): Promise<HttpInfo<Workflowv3SearchReportsResponse>> {
        const result = this.api.workflowSearchReportsWithHttpInfo(workflowv3SearchCasesRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Get a list of report IDs Description: Returns a list of report IDs referenced in all cases and tasks
     * @param workflowv3SearchCasesRequest 
     */
    public workflowSearchReports(workflowv3SearchCasesRequest: Workflowv3SearchCasesRequest, _options?: Configuration): Promise<Workflowv3SearchReportsResponse> {
        const result = this.api.workflowSearchReports(workflowv3SearchCasesRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Search cases Description: Return a subset of cases.
     * @param caseId Case ID - can be * for all
     * @param workflowv3SearchTasksRequest 
     */
    public workflowSearchTasksWithHttpInfo(caseId: string, workflowv3SearchTasksRequest: Workflowv3SearchTasksRequest, _options?: Configuration): Promise<HttpInfo<Workflowv3TaskListResponse>> {
        const result = this.api.workflowSearchTasksWithHttpInfo(caseId, workflowv3SearchTasksRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Search cases Description: Return a subset of cases.
     * @param caseId Case ID - can be * for all
     * @param workflowv3SearchTasksRequest 
     */
    public workflowSearchTasks(caseId: string, workflowv3SearchTasksRequest: Workflowv3SearchTasksRequest, _options?: Configuration): Promise<Workflowv3TaskListResponse> {
        const result = this.api.workflowSearchTasks(caseId, workflowv3SearchTasksRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Update cases Description: Update multiple cases in one request.
     * @param workflowv3UpdateCasesRequest 
     */
    public workflowUpdateCasesWithHttpInfo(workflowv3UpdateCasesRequest: Workflowv3UpdateCasesRequest, _options?: Configuration): Promise<HttpInfo<Workflowv3UpdateCasesResponse>> {
        const result = this.api.workflowUpdateCasesWithHttpInfo(workflowv3UpdateCasesRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Update cases Description: Update multiple cases in one request.
     * @param workflowv3UpdateCasesRequest 
     */
    public workflowUpdateCases(workflowv3UpdateCasesRequest: Workflowv3UpdateCasesRequest, _options?: Configuration): Promise<Workflowv3UpdateCasesResponse> {
        const result = this.api.workflowUpdateCases(workflowv3UpdateCasesRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Update tasks Description: Update multiple tasks for the same parent in one request.
     * @param caseId Update tasks belonging to common parent.
     * @param workflowv3UpdateTasksRequest 
     */
    public workflowUpdateTasksWithHttpInfo(caseId: string, workflowv3UpdateTasksRequest: Workflowv3UpdateTasksRequest, _options?: Configuration): Promise<HttpInfo<Workflowv3UpdateTasksResponse>> {
        const result = this.api.workflowUpdateTasksWithHttpInfo(caseId, workflowv3UpdateTasksRequest, _options);
        return result.toPromise();
    }

    /**
     * Summary: Update tasks Description: Update multiple tasks for the same parent in one request.
     * @param caseId Update tasks belonging to common parent.
     * @param workflowv3UpdateTasksRequest 
     */
    public workflowUpdateTasks(caseId: string, workflowv3UpdateTasksRequest: Workflowv3UpdateTasksRequest, _options?: Configuration): Promise<Workflowv3UpdateTasksResponse> {
        const result = this.api.workflowUpdateTasks(caseId, workflowv3UpdateTasksRequest, _options);
        return result.toPromise();
    }


}



