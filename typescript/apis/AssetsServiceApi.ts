// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile, HttpInfo} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { Assetsv3AssetFilterTemplateRequest } from '../models/Assetsv3AssetFilterTemplateRequest';
import { Assetsv3AssetIngestionRequest } from '../models/Assetsv3AssetIngestionRequest';
import { Assetsv3AssetIngestionResponse } from '../models/Assetsv3AssetIngestionResponse';
import { Assetsv3AssetOverviewResponse } from '../models/Assetsv3AssetOverviewResponse';
import { Assetsv3ClonePolicyRequest } from '../models/Assetsv3ClonePolicyRequest';
import { Assetsv3CreateUpdatePolicyRequest } from '../models/Assetsv3CreateUpdatePolicyRequest';
import { Assetsv3CreateUpdatePolicyResponse } from '../models/Assetsv3CreateUpdatePolicyResponse';
import { Assetsv3FetchAssetChangeLogRequest } from '../models/Assetsv3FetchAssetChangeLogRequest';
import { Assetsv3FetchAssetChangeLogResponse } from '../models/Assetsv3FetchAssetChangeLogResponse';
import { Assetsv3FetchAssetDashboardResponse } from '../models/Assetsv3FetchAssetDashboardResponse';
import { Assetsv3FetchAssetListRequest } from '../models/Assetsv3FetchAssetListRequest';
import { Assetsv3FetchAssetListResponse } from '../models/Assetsv3FetchAssetListResponse';
import { Assetsv3FetchAssetsForMergeSplitResponse } from '../models/Assetsv3FetchAssetsForMergeSplitResponse';
import { Assetsv3FindAssetNameResponse } from '../models/Assetsv3FindAssetNameResponse';
import { Assetsv3GetAssetTopologyRequest } from '../models/Assetsv3GetAssetTopologyRequest';
import { Assetsv3GetAssetTopologyResponse } from '../models/Assetsv3GetAssetTopologyResponse';
import { Assetsv3GetFilterTemplateResponse } from '../models/Assetsv3GetFilterTemplateResponse';
import { Assetsv3GetFiltersDataResponse } from '../models/Assetsv3GetFiltersDataResponse';
import { Assetsv3ListPolicyResponse } from '../models/Assetsv3ListPolicyResponse';
import { Assetsv3ListRuleResponse } from '../models/Assetsv3ListRuleResponse';
import { Assetsv3ListTagDomainsResponse } from '../models/Assetsv3ListTagDomainsResponse';
import { Assetsv3ListTagsResponse } from '../models/Assetsv3ListTagsResponse';
import { Assetsv3MergeOrSplitAssetsRequest } from '../models/Assetsv3MergeOrSplitAssetsRequest';
import { Assetsv3SaveAssignedTagsRequest } from '../models/Assetsv3SaveAssignedTagsRequest';
import { Assetsv3SaveTagConceptDataRequest } from '../models/Assetsv3SaveTagConceptDataRequest';
import { Assetsv3SaveTagDomainDataRequest } from '../models/Assetsv3SaveTagDomainDataRequest';
import { Assetsv3SaveUpdateFilterTemplateRequest } from '../models/Assetsv3SaveUpdateFilterTemplateRequest';
import { Assetsv3SaveUpdateFilterTemplateResponse } from '../models/Assetsv3SaveUpdateFilterTemplateResponse';
import { Assetsv3SetBannerStateRequest } from '../models/Assetsv3SetBannerStateRequest';
import { Assetsv3UpdateAssetNameRequest } from '../models/Assetsv3UpdateAssetNameRequest';
import { Assetsv3UpdatePolicyRequest } from '../models/Assetsv3UpdatePolicyRequest';
import { RuntimeError } from '../models/RuntimeError';

/**
 * no description
 */
export class AssetsServiceApiRequestFactory extends BaseAPIRequestFactory {

    /**
     * AssetIngestion - Asset Ingestion Api to ingest assets from different applications including asset extensibility assets.
     * @param assetsv3AssetIngestionRequest 
     */
    public async assetsServiceAssetIngestion(assetsv3AssetIngestionRequest: Assetsv3AssetIngestionRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'assetsv3AssetIngestionRequest' is not null or undefined
        if (assetsv3AssetIngestionRequest === null || assetsv3AssetIngestionRequest === undefined) {
            throw new RequiredError("AssetsServiceApi", "assetsServiceAssetIngestion", "assetsv3AssetIngestionRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/assets/ingestion';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(assetsv3AssetIngestionRequest, "Assetsv3AssetIngestionRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["BasicAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * AssetIngestionManualTrigger - Manual trigger for Scheduled Asset Ingestion of databases.
     * @param body 
     */
    public async assetsServiceAssetIngestionManualTrigger(body: any, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'body' is not null or undefined
        if (body === null || body === undefined) {
            throw new RequiredError("AssetsServiceApi", "assetsServiceAssetIngestionManualTrigger", "body");
        }


        // Path Params
        const localVarPath = '/api/v3/assets/ingestion/trigger';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(body, "any", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["BasicAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * ClonePolicy - Clone a policy.
     * @param policyId Policy id that needs to be cloned.
     * @param assetsv3ClonePolicyRequest 
     */
    public async assetsServiceClonePolicy(policyId: string, assetsv3ClonePolicyRequest: Assetsv3ClonePolicyRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'policyId' is not null or undefined
        if (policyId === null || policyId === undefined) {
            throw new RequiredError("AssetsServiceApi", "assetsServiceClonePolicy", "policyId");
        }


        // verify required parameter 'assetsv3ClonePolicyRequest' is not null or undefined
        if (assetsv3ClonePolicyRequest === null || assetsv3ClonePolicyRequest === undefined) {
            throw new RequiredError("AssetsServiceApi", "assetsServiceClonePolicy", "assetsv3ClonePolicyRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/assets/policies/{policy_id}/clone'
            .replace('{' + 'policy_id' + '}', encodeURIComponent(String(policyId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(assetsv3ClonePolicyRequest, "Assetsv3ClonePolicyRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["BasicAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * CreateUpdatePolicy - Create/update new Policy.
     * @param assetsv3CreateUpdatePolicyRequest 
     */
    public async assetsServiceCreateUpdatePolicy(assetsv3CreateUpdatePolicyRequest: Assetsv3CreateUpdatePolicyRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'assetsv3CreateUpdatePolicyRequest' is not null or undefined
        if (assetsv3CreateUpdatePolicyRequest === null || assetsv3CreateUpdatePolicyRequest === undefined) {
            throw new RequiredError("AssetsServiceApi", "assetsServiceCreateUpdatePolicy", "assetsv3CreateUpdatePolicyRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/assets/policies';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(assetsv3CreateUpdatePolicyRequest, "Assetsv3CreateUpdatePolicyRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["BasicAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * DeleteFilterTemplateForAssets - Deleting a template using TemplateID in manage assets.
     * @param templateId template id to be deleted
     * @param assetsv3AssetFilterTemplateRequest 
     */
    public async assetsServiceDeleteFilterTemplateForAssets(templateId: string, assetsv3AssetFilterTemplateRequest: Assetsv3AssetFilterTemplateRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'templateId' is not null or undefined
        if (templateId === null || templateId === undefined) {
            throw new RequiredError("AssetsServiceApi", "assetsServiceDeleteFilterTemplateForAssets", "templateId");
        }


        // verify required parameter 'assetsv3AssetFilterTemplateRequest' is not null or undefined
        if (assetsv3AssetFilterTemplateRequest === null || assetsv3AssetFilterTemplateRequest === undefined) {
            throw new RequiredError("AssetsServiceApi", "assetsServiceDeleteFilterTemplateForAssets", "assetsv3AssetFilterTemplateRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/assets/filters/template/{template_id}'
            .replace('{' + 'template_id' + '}', encodeURIComponent(String(templateId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.DELETE);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(assetsv3AssetFilterTemplateRequest, "Assetsv3AssetFilterTemplateRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["BasicAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * DeletePolicies - Delete Policy returns response code and message.
     * @param policyIds Policy ids.
     */
    public async assetsServiceDeletePolicies(policyIds?: Array<string>, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;


        // Path Params
        const localVarPath = '/api/v3/assets/policies';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.DELETE);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (policyIds !== undefined) {
            requestContext.setQueryParam("policy_ids", ObjectSerializer.serialize(policyIds, "Array<string>", ""));
        }


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["BasicAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * FetchAssetChangeLog - Fetch the logs for any actions performed on assets.
     * @param assetsv3FetchAssetChangeLogRequest 
     */
    public async assetsServiceFetchAssetChangeLog(assetsv3FetchAssetChangeLogRequest: Assetsv3FetchAssetChangeLogRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'assetsv3FetchAssetChangeLogRequest' is not null or undefined
        if (assetsv3FetchAssetChangeLogRequest === null || assetsv3FetchAssetChangeLogRequest === undefined) {
            throw new RequiredError("AssetsServiceApi", "assetsServiceFetchAssetChangeLog", "assetsv3FetchAssetChangeLogRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/assets/logs';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(assetsv3FetchAssetChangeLogRequest, "Assetsv3FetchAssetChangeLogRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["BasicAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
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
    public async assetsServiceFetchAssetDashboard(widgetType: string, dateRangeStart?: string, dateRangeEnd?: string, dateRangeType?: string, dateRangeKey?: string, dateRangeError?: string, dateRangeStartNumber?: number, dateRangeStartUnit?: string, dateRangeEndNumber?: number, dateRangeEndUnit?: string, timelineValueSelected?: string, tagId?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'widgetType' is not null or undefined
        if (widgetType === null || widgetType === undefined) {
            throw new RequiredError("AssetsServiceApi", "assetsServiceFetchAssetDashboard", "widgetType");
        }













        // Path Params
        const localVarPath = '/api/v3/assets/dashboard/{widget_type}'
            .replace('{' + 'widget_type' + '}', encodeURIComponent(String(widgetType)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (dateRangeStart !== undefined) {
            requestContext.setQueryParam("date_range.start", ObjectSerializer.serialize(dateRangeStart, "string", ""));
        }

        // Query Params
        if (dateRangeEnd !== undefined) {
            requestContext.setQueryParam("date_range.end", ObjectSerializer.serialize(dateRangeEnd, "string", ""));
        }

        // Query Params
        if (dateRangeType !== undefined) {
            requestContext.setQueryParam("date_range.type", ObjectSerializer.serialize(dateRangeType, "string", ""));
        }

        // Query Params
        if (dateRangeKey !== undefined) {
            requestContext.setQueryParam("date_range.key", ObjectSerializer.serialize(dateRangeKey, "string", ""));
        }

        // Query Params
        if (dateRangeError !== undefined) {
            requestContext.setQueryParam("date_range.error", ObjectSerializer.serialize(dateRangeError, "string", ""));
        }

        // Query Params
        if (dateRangeStartNumber !== undefined) {
            requestContext.setQueryParam("date_range.start_number", ObjectSerializer.serialize(dateRangeStartNumber, "number", "int32"));
        }

        // Query Params
        if (dateRangeStartUnit !== undefined) {
            requestContext.setQueryParam("date_range.start_unit", ObjectSerializer.serialize(dateRangeStartUnit, "string", ""));
        }

        // Query Params
        if (dateRangeEndNumber !== undefined) {
            requestContext.setQueryParam("date_range.end_number", ObjectSerializer.serialize(dateRangeEndNumber, "number", "int32"));
        }

        // Query Params
        if (dateRangeEndUnit !== undefined) {
            requestContext.setQueryParam("date_range.end_unit", ObjectSerializer.serialize(dateRangeEndUnit, "string", ""));
        }

        // Query Params
        if (timelineValueSelected !== undefined) {
            requestContext.setQueryParam("timeline_value_selected", ObjectSerializer.serialize(timelineValueSelected, "string", ""));
        }

        // Query Params
        if (tagId !== undefined) {
            requestContext.setQueryParam("tag_id", ObjectSerializer.serialize(tagId, "string", ""));
        }


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["BasicAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * FetchAssetList - Asset Fetch Api .
     * @param assetsv3FetchAssetListRequest 
     */
    public async assetsServiceFetchAssetList(assetsv3FetchAssetListRequest: Assetsv3FetchAssetListRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'assetsv3FetchAssetListRequest' is not null or undefined
        if (assetsv3FetchAssetListRequest === null || assetsv3FetchAssetListRequest === undefined) {
            throw new RequiredError("AssetsServiceApi", "assetsServiceFetchAssetList", "assetsv3FetchAssetListRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/assets';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(assetsv3FetchAssetListRequest, "Assetsv3FetchAssetListRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["BasicAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * FetchAssetsForMergeSplit : Fetch assets for Merge and Split.
     * @param assetId Asset grouper Id.
     * @param pageNumber Page number.
     * @param pageSize Page size.
     * @param action Action : merge or split.
     * @param searchKey Search from the list based on asset name, database name, ip or host.
     */
    public async assetsServiceFetchAssetsForMergeSplit(assetId?: string, pageNumber?: number, pageSize?: number, action?: string, searchKey?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;






        // Path Params
        const localVarPath = '/api/v3/assets/configuration';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (assetId !== undefined) {
            requestContext.setQueryParam("asset_id", ObjectSerializer.serialize(assetId, "string", ""));
        }

        // Query Params
        if (pageNumber !== undefined) {
            requestContext.setQueryParam("page_number", ObjectSerializer.serialize(pageNumber, "number", "int32"));
        }

        // Query Params
        if (pageSize !== undefined) {
            requestContext.setQueryParam("page_size", ObjectSerializer.serialize(pageSize, "number", "int32"));
        }

        // Query Params
        if (action !== undefined) {
            requestContext.setQueryParam("action", ObjectSerializer.serialize(action, "string", ""));
        }

        // Query Params
        if (searchKey !== undefined) {
            requestContext.setQueryParam("search_key", ObjectSerializer.serialize(searchKey, "string", ""));
        }


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["BasicAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * FindAssetName - Checks if the given Asset Name has already been assigned to an asset.
     * @param assetName Name of asset.
     */
    public async assetsServiceFindAssetName(assetName?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;


        // Path Params
        const localVarPath = '/api/v3/assets/name';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (assetName !== undefined) {
            requestContext.setQueryParam("asset_name", ObjectSerializer.serialize(assetName, "string", ""));
        }


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["BasicAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
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
    public async assetsServiceGetAssetOverview(assetId?: string, pageNumber?: number, size?: number, widget?: 'ALL' | 'CLASSIFICATION' | 'TAG' | 'RESOURCE', ip?: string, host?: string, database?: string, assetEntityType?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;









        // Path Params
        const localVarPath = '/api/v3/assets/overview';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (assetId !== undefined) {
            requestContext.setQueryParam("asset_id", ObjectSerializer.serialize(assetId, "string", ""));
        }

        // Query Params
        if (pageNumber !== undefined) {
            requestContext.setQueryParam("page_number", ObjectSerializer.serialize(pageNumber, "number", "int32"));
        }

        // Query Params
        if (size !== undefined) {
            requestContext.setQueryParam("size", ObjectSerializer.serialize(size, "number", "int32"));
        }

        // Query Params
        if (widget !== undefined) {
            requestContext.setQueryParam("widget", ObjectSerializer.serialize(widget, "'ALL' | 'CLASSIFICATION' | 'TAG' | 'RESOURCE'", ""));
        }

        // Query Params
        if (ip !== undefined) {
            requestContext.setQueryParam("ip", ObjectSerializer.serialize(ip, "string", ""));
        }

        // Query Params
        if (host !== undefined) {
            requestContext.setQueryParam("host", ObjectSerializer.serialize(host, "string", ""));
        }

        // Query Params
        if (database !== undefined) {
            requestContext.setQueryParam("database", ObjectSerializer.serialize(database, "string", ""));
        }

        // Query Params
        if (assetEntityType !== undefined) {
            requestContext.setQueryParam("asset_entity_type", ObjectSerializer.serialize(assetEntityType, "string", ""));
        }


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["BasicAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * GetAssetTopology- Get list of topology for a parent asset.
     * @param assetsv3GetAssetTopologyRequest 
     */
    public async assetsServiceGetAssetTopology(assetsv3GetAssetTopologyRequest: Assetsv3GetAssetTopologyRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'assetsv3GetAssetTopologyRequest' is not null or undefined
        if (assetsv3GetAssetTopologyRequest === null || assetsv3GetAssetTopologyRequest === undefined) {
            throw new RequiredError("AssetsServiceApi", "assetsServiceGetAssetTopology", "assetsv3GetAssetTopologyRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/assets/topology';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(assetsv3GetAssetTopologyRequest, "Assetsv3GetAssetTopologyRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["BasicAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * GetFilterTemplateForAssets - Get list of filters query templates for manage assets.
     * @param templateId template id to be deleted.
     */
    public async assetsServiceGetFilterTemplateForAssets(templateId?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;


        // Path Params
        const localVarPath = '/api/v3/assets/filters/templates';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (templateId !== undefined) {
            requestContext.setQueryParam("template_id", ObjectSerializer.serialize(templateId, "string", ""));
        }


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["BasicAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * GetFiltersForAssets - Get a list of filters category and sub category with all data.
     */
    public async assetsServiceGetFiltersForAssets(_options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // Path Params
        const localVarPath = '/api/v3/assets/filters';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["BasicAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * ListPolicy - List all policies.
     */
    public async assetsServiceListPolicy(_options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // Path Params
        const localVarPath = '/api/v3/assets/policies';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["BasicAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * ListRule - List all rules for a policy.
     * @param policyId Policy ID
     */
    public async assetsServiceListRule(policyId: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'policyId' is not null or undefined
        if (policyId === null || policyId === undefined) {
            throw new RequiredError("AssetsServiceApi", "assetsServiceListRule", "policyId");
        }


        // Path Params
        const localVarPath = '/api/v3/assets/policies/{policy_id}/rules'
            .replace('{' + 'policy_id' + '}', encodeURIComponent(String(policyId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["BasicAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * ListTagDomains - Get Tag categories by request parameters .
     * @param domGrouper Optional: dom_grouper required if we want to fetch domains based on the group.
     * @param purpose Optional: purpose required if we want to fetch domains based on the purpose.
     * @param needTag Optional: If we need Tag  based on the Domains.
     */
    public async assetsServiceListTagDomains(domGrouper?: string, purpose?: string, needTag?: boolean, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;




        // Path Params
        const localVarPath = '/api/v3/assets/tags/categories';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (domGrouper !== undefined) {
            requestContext.setQueryParam("dom_grouper", ObjectSerializer.serialize(domGrouper, "string", ""));
        }

        // Query Params
        if (purpose !== undefined) {
            requestContext.setQueryParam("purpose", ObjectSerializer.serialize(purpose, "string", ""));
        }

        // Query Params
        if (needTag !== undefined) {
            requestContext.setQueryParam("need_tag", ObjectSerializer.serialize(needTag, "boolean", ""));
        }


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["BasicAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * ListTags - Get Tags for Manage Tags listing screen .
     * @param assetId asset id - Asset ID.
     */
    public async assetsServiceListTags(assetId?: Array<string>, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;


        // Path Params
        const localVarPath = '/api/v3/assets/tags';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (assetId !== undefined) {
            requestContext.setQueryParam("asset_id", ObjectSerializer.serialize(assetId, "Array<string>", ""));
        }


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["BasicAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * MergeOrSplitAssets - Merge or split the selected assets.
     * @param assetsv3MergeOrSplitAssetsRequest 
     */
    public async assetsServiceMergeOrSplitAssets(assetsv3MergeOrSplitAssetsRequest: Assetsv3MergeOrSplitAssetsRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'assetsv3MergeOrSplitAssetsRequest' is not null or undefined
        if (assetsv3MergeOrSplitAssetsRequest === null || assetsv3MergeOrSplitAssetsRequest === undefined) {
            throw new RequiredError("AssetsServiceApi", "assetsServiceMergeOrSplitAssets", "assetsv3MergeOrSplitAssetsRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/assets/configuration';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(assetsv3MergeOrSplitAssetsRequest, "Assetsv3MergeOrSplitAssetsRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["BasicAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * SaveAssignedTags - Save Assigned Tags to TAG_DSDEF_MAP table.
     * @param assetsv3SaveAssignedTagsRequest 
     */
    public async assetsServiceSaveAssignedTags(assetsv3SaveAssignedTagsRequest: Assetsv3SaveAssignedTagsRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'assetsv3SaveAssignedTagsRequest' is not null or undefined
        if (assetsv3SaveAssignedTagsRequest === null || assetsv3SaveAssignedTagsRequest === undefined) {
            throw new RequiredError("AssetsServiceApi", "assetsServiceSaveAssignedTags", "assetsv3SaveAssignedTagsRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/assets/tags/assign';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(assetsv3SaveAssignedTagsRequest, "Assetsv3SaveAssignedTagsRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["BasicAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * SaveTagConceptData - creates a custom tag
     * @param assetsv3SaveTagConceptDataRequest 
     */
    public async assetsServiceSaveTagConceptData(assetsv3SaveTagConceptDataRequest: Assetsv3SaveTagConceptDataRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'assetsv3SaveTagConceptDataRequest' is not null or undefined
        if (assetsv3SaveTagConceptDataRequest === null || assetsv3SaveTagConceptDataRequest === undefined) {
            throw new RequiredError("AssetsServiceApi", "assetsServiceSaveTagConceptData", "assetsv3SaveTagConceptDataRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/assets/tags';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(assetsv3SaveTagConceptDataRequest, "Assetsv3SaveTagConceptDataRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["BasicAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * SaveTagDomainData - creates a custom category to be assigned to a tag
     * @param assetsv3SaveTagDomainDataRequest 
     */
    public async assetsServiceSaveTagDomainData(assetsv3SaveTagDomainDataRequest: Assetsv3SaveTagDomainDataRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'assetsv3SaveTagDomainDataRequest' is not null or undefined
        if (assetsv3SaveTagDomainDataRequest === null || assetsv3SaveTagDomainDataRequest === undefined) {
            throw new RequiredError("AssetsServiceApi", "assetsServiceSaveTagDomainData", "assetsv3SaveTagDomainDataRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/assets/tags/categories';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(assetsv3SaveTagDomainDataRequest, "Assetsv3SaveTagDomainDataRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["BasicAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * SaveUpdateFilterTemplateForAssets - Save/Update a filters query to use as template in manage assets along with reordering of template list.
     * @param assetsv3SaveUpdateFilterTemplateRequest 
     */
    public async assetsServiceSaveUpdateFilterTemplateForAssets(assetsv3SaveUpdateFilterTemplateRequest: Assetsv3SaveUpdateFilterTemplateRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'assetsv3SaveUpdateFilterTemplateRequest' is not null or undefined
        if (assetsv3SaveUpdateFilterTemplateRequest === null || assetsv3SaveUpdateFilterTemplateRequest === undefined) {
            throw new RequiredError("AssetsServiceApi", "assetsServiceSaveUpdateFilterTemplateForAssets", "assetsv3SaveUpdateFilterTemplateRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/assets/filters/templates';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(assetsv3SaveUpdateFilterTemplateRequest, "Assetsv3SaveUpdateFilterTemplateRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["BasicAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * SetBannerState - Set banner state for asset inventory page.
     * @param assetsv3SetBannerStateRequest 
     */
    public async assetsServiceSetBannerState(assetsv3SetBannerStateRequest: Assetsv3SetBannerStateRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'assetsv3SetBannerStateRequest' is not null or undefined
        if (assetsv3SetBannerStateRequest === null || assetsv3SetBannerStateRequest === undefined) {
            throw new RequiredError("AssetsServiceApi", "assetsServiceSetBannerState", "assetsv3SetBannerStateRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/assets/banner';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PUT);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(assetsv3SetBannerStateRequest, "Assetsv3SetBannerStateRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["BasicAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * UpdateAssetName - Udates the name of the asset as given by the user.
     * @param assetsv3UpdateAssetNameRequest 
     */
    public async assetsServiceUpdateAssetName(assetsv3UpdateAssetNameRequest: Assetsv3UpdateAssetNameRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'assetsv3UpdateAssetNameRequest' is not null or undefined
        if (assetsv3UpdateAssetNameRequest === null || assetsv3UpdateAssetNameRequest === undefined) {
            throw new RequiredError("AssetsServiceApi", "assetsServiceUpdateAssetName", "assetsv3UpdateAssetNameRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/assets/name';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PUT);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(assetsv3UpdateAssetNameRequest, "Assetsv3UpdateAssetNameRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["BasicAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * UpdatePolicy - Update existing Policy status.
     * @param assetsv3UpdatePolicyRequest 
     */
    public async assetsServiceUpdatePolicy(assetsv3UpdatePolicyRequest: Assetsv3UpdatePolicyRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'assetsv3UpdatePolicyRequest' is not null or undefined
        if (assetsv3UpdatePolicyRequest === null || assetsv3UpdatePolicyRequest === undefined) {
            throw new RequiredError("AssetsServiceApi", "assetsServiceUpdatePolicy", "assetsv3UpdatePolicyRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/assets/policies';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PUT);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(assetsv3UpdatePolicyRequest, "Assetsv3UpdatePolicyRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["BasicAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

}

export class AssetsServiceApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to assetsServiceAssetIngestion
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async assetsServiceAssetIngestionWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Assetsv3AssetIngestionResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Assetsv3AssetIngestionResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Assetsv3AssetIngestionResponse", ""
            ) as Assetsv3AssetIngestionResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: RuntimeError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RuntimeError", ""
            ) as RuntimeError;
            throw new ApiException<RuntimeError>(response.httpStatusCode, "An unexpected error response.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: Assetsv3AssetIngestionResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Assetsv3AssetIngestionResponse", ""
            ) as Assetsv3AssetIngestionResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to assetsServiceAssetIngestionManualTrigger
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async assetsServiceAssetIngestionManualTriggerWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Assetsv3AssetIngestionResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Assetsv3AssetIngestionResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Assetsv3AssetIngestionResponse", ""
            ) as Assetsv3AssetIngestionResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: RuntimeError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RuntimeError", ""
            ) as RuntimeError;
            throw new ApiException<RuntimeError>(response.httpStatusCode, "An unexpected error response.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: Assetsv3AssetIngestionResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Assetsv3AssetIngestionResponse", ""
            ) as Assetsv3AssetIngestionResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to assetsServiceClonePolicy
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async assetsServiceClonePolicyWithHttpInfo(response: ResponseContext): Promise<HttpInfo<any >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: any = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "any", ""
            ) as any;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: RuntimeError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RuntimeError", ""
            ) as RuntimeError;
            throw new ApiException<RuntimeError>(response.httpStatusCode, "An unexpected error response.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: any = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "any", ""
            ) as any;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to assetsServiceCreateUpdatePolicy
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async assetsServiceCreateUpdatePolicyWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Assetsv3CreateUpdatePolicyResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Assetsv3CreateUpdatePolicyResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Assetsv3CreateUpdatePolicyResponse", ""
            ) as Assetsv3CreateUpdatePolicyResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: RuntimeError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RuntimeError", ""
            ) as RuntimeError;
            throw new ApiException<RuntimeError>(response.httpStatusCode, "An unexpected error response.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: Assetsv3CreateUpdatePolicyResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Assetsv3CreateUpdatePolicyResponse", ""
            ) as Assetsv3CreateUpdatePolicyResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to assetsServiceDeleteFilterTemplateForAssets
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async assetsServiceDeleteFilterTemplateForAssetsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<any >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: any = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "any", ""
            ) as any;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: RuntimeError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RuntimeError", ""
            ) as RuntimeError;
            throw new ApiException<RuntimeError>(response.httpStatusCode, "An unexpected error response.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: any = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "any", ""
            ) as any;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to assetsServiceDeletePolicies
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async assetsServiceDeletePoliciesWithHttpInfo(response: ResponseContext): Promise<HttpInfo<any >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: any = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "any", ""
            ) as any;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: RuntimeError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RuntimeError", ""
            ) as RuntimeError;
            throw new ApiException<RuntimeError>(response.httpStatusCode, "An unexpected error response.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: any = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "any", ""
            ) as any;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to assetsServiceFetchAssetChangeLog
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async assetsServiceFetchAssetChangeLogWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Assetsv3FetchAssetChangeLogResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Assetsv3FetchAssetChangeLogResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Assetsv3FetchAssetChangeLogResponse", ""
            ) as Assetsv3FetchAssetChangeLogResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: RuntimeError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RuntimeError", ""
            ) as RuntimeError;
            throw new ApiException<RuntimeError>(response.httpStatusCode, "An unexpected error response.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: Assetsv3FetchAssetChangeLogResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Assetsv3FetchAssetChangeLogResponse", ""
            ) as Assetsv3FetchAssetChangeLogResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to assetsServiceFetchAssetDashboard
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async assetsServiceFetchAssetDashboardWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Assetsv3FetchAssetDashboardResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Assetsv3FetchAssetDashboardResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Assetsv3FetchAssetDashboardResponse", ""
            ) as Assetsv3FetchAssetDashboardResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: RuntimeError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RuntimeError", ""
            ) as RuntimeError;
            throw new ApiException<RuntimeError>(response.httpStatusCode, "An unexpected error response.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: Assetsv3FetchAssetDashboardResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Assetsv3FetchAssetDashboardResponse", ""
            ) as Assetsv3FetchAssetDashboardResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to assetsServiceFetchAssetList
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async assetsServiceFetchAssetListWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Assetsv3FetchAssetListResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Assetsv3FetchAssetListResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Assetsv3FetchAssetListResponse", ""
            ) as Assetsv3FetchAssetListResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: RuntimeError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RuntimeError", ""
            ) as RuntimeError;
            throw new ApiException<RuntimeError>(response.httpStatusCode, "An unexpected error response.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: Assetsv3FetchAssetListResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Assetsv3FetchAssetListResponse", ""
            ) as Assetsv3FetchAssetListResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to assetsServiceFetchAssetsForMergeSplit
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async assetsServiceFetchAssetsForMergeSplitWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Assetsv3FetchAssetsForMergeSplitResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Assetsv3FetchAssetsForMergeSplitResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Assetsv3FetchAssetsForMergeSplitResponse", ""
            ) as Assetsv3FetchAssetsForMergeSplitResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: RuntimeError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RuntimeError", ""
            ) as RuntimeError;
            throw new ApiException<RuntimeError>(response.httpStatusCode, "An unexpected error response.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: Assetsv3FetchAssetsForMergeSplitResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Assetsv3FetchAssetsForMergeSplitResponse", ""
            ) as Assetsv3FetchAssetsForMergeSplitResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to assetsServiceFindAssetName
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async assetsServiceFindAssetNameWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Assetsv3FindAssetNameResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Assetsv3FindAssetNameResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Assetsv3FindAssetNameResponse", ""
            ) as Assetsv3FindAssetNameResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: RuntimeError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RuntimeError", ""
            ) as RuntimeError;
            throw new ApiException<RuntimeError>(response.httpStatusCode, "An unexpected error response.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: Assetsv3FindAssetNameResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Assetsv3FindAssetNameResponse", ""
            ) as Assetsv3FindAssetNameResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to assetsServiceGetAssetOverview
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async assetsServiceGetAssetOverviewWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Assetsv3AssetOverviewResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Assetsv3AssetOverviewResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Assetsv3AssetOverviewResponse", ""
            ) as Assetsv3AssetOverviewResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: RuntimeError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RuntimeError", ""
            ) as RuntimeError;
            throw new ApiException<RuntimeError>(response.httpStatusCode, "An unexpected error response.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: Assetsv3AssetOverviewResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Assetsv3AssetOverviewResponse", ""
            ) as Assetsv3AssetOverviewResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to assetsServiceGetAssetTopology
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async assetsServiceGetAssetTopologyWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Assetsv3GetAssetTopologyResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Assetsv3GetAssetTopologyResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Assetsv3GetAssetTopologyResponse", ""
            ) as Assetsv3GetAssetTopologyResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: RuntimeError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RuntimeError", ""
            ) as RuntimeError;
            throw new ApiException<RuntimeError>(response.httpStatusCode, "An unexpected error response.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: Assetsv3GetAssetTopologyResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Assetsv3GetAssetTopologyResponse", ""
            ) as Assetsv3GetAssetTopologyResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to assetsServiceGetFilterTemplateForAssets
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async assetsServiceGetFilterTemplateForAssetsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Assetsv3GetFilterTemplateResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Assetsv3GetFilterTemplateResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Assetsv3GetFilterTemplateResponse", ""
            ) as Assetsv3GetFilterTemplateResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: RuntimeError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RuntimeError", ""
            ) as RuntimeError;
            throw new ApiException<RuntimeError>(response.httpStatusCode, "An unexpected error response.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: Assetsv3GetFilterTemplateResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Assetsv3GetFilterTemplateResponse", ""
            ) as Assetsv3GetFilterTemplateResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to assetsServiceGetFiltersForAssets
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async assetsServiceGetFiltersForAssetsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Assetsv3GetFiltersDataResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Assetsv3GetFiltersDataResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Assetsv3GetFiltersDataResponse", ""
            ) as Assetsv3GetFiltersDataResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: RuntimeError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RuntimeError", ""
            ) as RuntimeError;
            throw new ApiException<RuntimeError>(response.httpStatusCode, "An unexpected error response.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: Assetsv3GetFiltersDataResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Assetsv3GetFiltersDataResponse", ""
            ) as Assetsv3GetFiltersDataResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to assetsServiceListPolicy
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async assetsServiceListPolicyWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Assetsv3ListPolicyResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Assetsv3ListPolicyResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Assetsv3ListPolicyResponse", ""
            ) as Assetsv3ListPolicyResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: RuntimeError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RuntimeError", ""
            ) as RuntimeError;
            throw new ApiException<RuntimeError>(response.httpStatusCode, "An unexpected error response.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: Assetsv3ListPolicyResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Assetsv3ListPolicyResponse", ""
            ) as Assetsv3ListPolicyResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to assetsServiceListRule
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async assetsServiceListRuleWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Assetsv3ListRuleResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Assetsv3ListRuleResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Assetsv3ListRuleResponse", ""
            ) as Assetsv3ListRuleResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: RuntimeError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RuntimeError", ""
            ) as RuntimeError;
            throw new ApiException<RuntimeError>(response.httpStatusCode, "An unexpected error response.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: Assetsv3ListRuleResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Assetsv3ListRuleResponse", ""
            ) as Assetsv3ListRuleResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to assetsServiceListTagDomains
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async assetsServiceListTagDomainsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Assetsv3ListTagDomainsResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Assetsv3ListTagDomainsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Assetsv3ListTagDomainsResponse", ""
            ) as Assetsv3ListTagDomainsResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: RuntimeError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RuntimeError", ""
            ) as RuntimeError;
            throw new ApiException<RuntimeError>(response.httpStatusCode, "An unexpected error response.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: Assetsv3ListTagDomainsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Assetsv3ListTagDomainsResponse", ""
            ) as Assetsv3ListTagDomainsResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to assetsServiceListTags
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async assetsServiceListTagsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Assetsv3ListTagsResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Assetsv3ListTagsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Assetsv3ListTagsResponse", ""
            ) as Assetsv3ListTagsResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: RuntimeError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RuntimeError", ""
            ) as RuntimeError;
            throw new ApiException<RuntimeError>(response.httpStatusCode, "An unexpected error response.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: Assetsv3ListTagsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Assetsv3ListTagsResponse", ""
            ) as Assetsv3ListTagsResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to assetsServiceMergeOrSplitAssets
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async assetsServiceMergeOrSplitAssetsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<any >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: any = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "any", ""
            ) as any;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: RuntimeError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RuntimeError", ""
            ) as RuntimeError;
            throw new ApiException<RuntimeError>(response.httpStatusCode, "An unexpected error response.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: any = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "any", ""
            ) as any;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to assetsServiceSaveAssignedTags
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async assetsServiceSaveAssignedTagsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<any >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: any = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "any", ""
            ) as any;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: RuntimeError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RuntimeError", ""
            ) as RuntimeError;
            throw new ApiException<RuntimeError>(response.httpStatusCode, "An unexpected error response.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: any = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "any", ""
            ) as any;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to assetsServiceSaveTagConceptData
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async assetsServiceSaveTagConceptDataWithHttpInfo(response: ResponseContext): Promise<HttpInfo<any >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: any = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "any", ""
            ) as any;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: RuntimeError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RuntimeError", ""
            ) as RuntimeError;
            throw new ApiException<RuntimeError>(response.httpStatusCode, "An unexpected error response.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: any = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "any", ""
            ) as any;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to assetsServiceSaveTagDomainData
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async assetsServiceSaveTagDomainDataWithHttpInfo(response: ResponseContext): Promise<HttpInfo<any >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: any = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "any", ""
            ) as any;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: RuntimeError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RuntimeError", ""
            ) as RuntimeError;
            throw new ApiException<RuntimeError>(response.httpStatusCode, "An unexpected error response.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: any = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "any", ""
            ) as any;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to assetsServiceSaveUpdateFilterTemplateForAssets
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async assetsServiceSaveUpdateFilterTemplateForAssetsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Assetsv3SaveUpdateFilterTemplateResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Assetsv3SaveUpdateFilterTemplateResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Assetsv3SaveUpdateFilterTemplateResponse", ""
            ) as Assetsv3SaveUpdateFilterTemplateResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: RuntimeError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RuntimeError", ""
            ) as RuntimeError;
            throw new ApiException<RuntimeError>(response.httpStatusCode, "An unexpected error response.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: Assetsv3SaveUpdateFilterTemplateResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Assetsv3SaveUpdateFilterTemplateResponse", ""
            ) as Assetsv3SaveUpdateFilterTemplateResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to assetsServiceSetBannerState
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async assetsServiceSetBannerStateWithHttpInfo(response: ResponseContext): Promise<HttpInfo<any >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: any = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "any", ""
            ) as any;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: RuntimeError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RuntimeError", ""
            ) as RuntimeError;
            throw new ApiException<RuntimeError>(response.httpStatusCode, "An unexpected error response.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: any = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "any", ""
            ) as any;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to assetsServiceUpdateAssetName
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async assetsServiceUpdateAssetNameWithHttpInfo(response: ResponseContext): Promise<HttpInfo<any >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: any = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "any", ""
            ) as any;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: RuntimeError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RuntimeError", ""
            ) as RuntimeError;
            throw new ApiException<RuntimeError>(response.httpStatusCode, "An unexpected error response.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: any = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "any", ""
            ) as any;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to assetsServiceUpdatePolicy
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async assetsServiceUpdatePolicyWithHttpInfo(response: ResponseContext): Promise<HttpInfo<any >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: any = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "any", ""
            ) as any;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: RuntimeError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RuntimeError", ""
            ) as RuntimeError;
            throw new ApiException<RuntimeError>(response.httpStatusCode, "An unexpected error response.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: any = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "any", ""
            ) as any;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
