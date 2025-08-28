// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile, HttpInfo} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { Policybuilderv3ClonePolicyRequest } from '../models/Policybuilderv3ClonePolicyRequest';
import { Policybuilderv3CreateUpdatePolicyRequest } from '../models/Policybuilderv3CreateUpdatePolicyRequest';
import { Policybuilderv3CreateUpdatePolicyResponse } from '../models/Policybuilderv3CreateUpdatePolicyResponse';
import { Policybuilderv3DeleteGdpPolicySyncResponse } from '../models/Policybuilderv3DeleteGdpPolicySyncResponse';
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
import { Policybuilderv3InsertGdpPolicyMetaDataRequest } from '../models/Policybuilderv3InsertGdpPolicyMetaDataRequest';
import { Policybuilderv3InsertGdpPolicyMetaDataResponse } from '../models/Policybuilderv3InsertGdpPolicyMetaDataResponse';
import { Policybuilderv3InsertGdpPolicySyncRequest } from '../models/Policybuilderv3InsertGdpPolicySyncRequest';
import { Policybuilderv3InsertGdpPolicySyncResponse } from '../models/Policybuilderv3InsertGdpPolicySyncResponse';
import { Policybuilderv3InstallPoliciesRequest } from '../models/Policybuilderv3InstallPoliciesRequest';
import { Policybuilderv3RuleMetadataResponse } from '../models/Policybuilderv3RuleMetadataResponse';
import { Policybuilderv3StandardCRUDResponse } from '../models/Policybuilderv3StandardCRUDResponse';
import { Policybuilderv3StatusResponseBase } from '../models/Policybuilderv3StatusResponseBase';
import { Policybuilderv3StorePolicyGdpRequest } from '../models/Policybuilderv3StorePolicyGdpRequest';
import { Policybuilderv3StorePolicyGdpResponse } from '../models/Policybuilderv3StorePolicyGdpResponse';
import { RuntimeError } from '../models/RuntimeError';

/**
 * no description
 */
export class PolicyBuilderApiRequestFactory extends BaseAPIRequestFactory {

    /**
     * Summary: Clone policy Description: Clone a policy.
     * @param policyId Policy id that needs to be cloned.
     * @param policybuilderv3ClonePolicyRequest 
     */
    public async policyBuilderClonePolicy(policyId: string, policybuilderv3ClonePolicyRequest: Policybuilderv3ClonePolicyRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'policyId' is not null or undefined
        if (policyId === null || policyId === undefined) {
            throw new RequiredError("PolicyBuilderApi", "policyBuilderClonePolicy", "policyId");
        }


        // verify required parameter 'policybuilderv3ClonePolicyRequest' is not null or undefined
        if (policybuilderv3ClonePolicyRequest === null || policybuilderv3ClonePolicyRequest === undefined) {
            throw new RequiredError("PolicyBuilderApi", "policyBuilderClonePolicy", "policybuilderv3ClonePolicyRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/policies/clone/{policy_id}'
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
            ObjectSerializer.serialize(policybuilderv3ClonePolicyRequest, "Policybuilderv3ClonePolicyRequest", ""),
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
     * Summary: Create policy Description: Create Policy returns response code and message.
     * @param policybuilderv3CreateUpdatePolicyRequest 
     */
    public async policyBuilderCreatePolicy(policybuilderv3CreateUpdatePolicyRequest: Policybuilderv3CreateUpdatePolicyRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'policybuilderv3CreateUpdatePolicyRequest' is not null or undefined
        if (policybuilderv3CreateUpdatePolicyRequest === null || policybuilderv3CreateUpdatePolicyRequest === undefined) {
            throw new RequiredError("PolicyBuilderApi", "policyBuilderCreatePolicy", "policybuilderv3CreateUpdatePolicyRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/policies';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(policybuilderv3CreateUpdatePolicyRequest, "Policybuilderv3CreateUpdatePolicyRequest", ""),
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
     * Summary: Delete GDP policy sync entry Description: Deletes GDP policy from sync collection
     * @param syncIds Policy sync entry id to delete from sync.
     */
    public async policyBuilderDeleteGdpSyncEntry(syncIds?: Array<string>, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;


        // Path Params
        const localVarPath = '/api/v3/policies/sync_entry';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.DELETE);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (syncIds !== undefined) {
            requestContext.setQueryParam("sync_ids", ObjectSerializer.serialize(syncIds, "Array<string>", ""));
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
     * Summary: Delete policies Description: Delete Policy returns response code and message.
     * @param policyIds Policy ids.
     */
    public async policyBuilderDeletePolicies(policyIds?: Array<string>, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;


        // Path Params
        const localVarPath = '/api/v3/policies';

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
     * Summary: Get GDP policy summary information Description: Get GDP\'s CM\'s policy summary from mogodb
     */
    public async policyBuilderGetGdpPolicyMetaData(_options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // Path Params
        const localVarPath = '/api/v3/policies/metadata_list';

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
     * Summary: Get policies Description: Return a list of policies to the caller.
     */
    public async policyBuilderGetPolicies(_options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // Path Params
        const localVarPath = '/api/v3/policies';

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
     * Summary: Get policy details Description: Return a list of rules inside the policy.
     * @param policyId Policy id.
     */
    public async policyBuilderGetPolicyDetails(policyId: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'policyId' is not null or undefined
        if (policyId === null || policyId === undefined) {
            throw new RequiredError("PolicyBuilderApi", "policyBuilderGetPolicyDetails", "policyId");
        }


        // Path Params
        const localVarPath = '/api/v3/policies/{policy_id}/details'
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
     * Summary: GetPolicy names from rule IDs Description: Return a map where the key is the rule ID and value is the policy name that has the rule ID.
     * @param policybuilderv3GetPolicyNamesFromRuleIDsRequest 
     */
    public async policyBuilderGetPolicyNamesFromRuleIDs(policybuilderv3GetPolicyNamesFromRuleIDsRequest: Policybuilderv3GetPolicyNamesFromRuleIDsRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'policybuilderv3GetPolicyNamesFromRuleIDsRequest' is not null or undefined
        if (policybuilderv3GetPolicyNamesFromRuleIDsRequest === null || policybuilderv3GetPolicyNamesFromRuleIDsRequest === undefined) {
            throw new RequiredError("PolicyBuilderApi", "policyBuilderGetPolicyNamesFromRuleIDs", "policybuilderv3GetPolicyNamesFromRuleIDsRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/policies/policy_names';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(policybuilderv3GetPolicyNamesFromRuleIDsRequest, "Policybuilderv3GetPolicyNamesFromRuleIDsRequest", ""),
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
     * Summary: Get list of synced polices Description: Returns the list and status of sync entries
     */
    public async policyBuilderGetPolicySyncList(_options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // Path Params
        const localVarPath = '/api/v3/policies/sync_list';

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
     * Summary: Get a particular version of the policy Description: Returns a particular version of policy and response code and message
     * @param policyId Policy id of the requested policy
     * @param version Requested version number of the policy
     */
    public async policyBuilderGetPolicyVersion(policyId: string, version: number, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'policyId' is not null or undefined
        if (policyId === null || policyId === undefined) {
            throw new RequiredError("PolicyBuilderApi", "policyBuilderGetPolicyVersion", "policyId");
        }


        // verify required parameter 'version' is not null or undefined
        if (version === null || version === undefined) {
            throw new RequiredError("PolicyBuilderApi", "policyBuilderGetPolicyVersion", "version");
        }


        // Path Params
        const localVarPath = '/api/v3/policies/{policy_id}/details/versions/{version}'
            .replace('{' + 'policy_id' + '}', encodeURIComponent(String(policyId)))
            .replace('{' + 'version' + '}', encodeURIComponent(String(version)));

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
     * Summary: Gets policy versions info Description: Returns information of all versions of a policy and response code and message
     * @param policyId Policy id of the requested policy
     */
    public async policyBuilderGetPolicyVersionsInfo(policyId: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'policyId' is not null or undefined
        if (policyId === null || policyId === undefined) {
            throw new RequiredError("PolicyBuilderApi", "policyBuilderGetPolicyVersionsInfo", "policyId");
        }


        // Path Params
        const localVarPath = '/api/v3/policies/{policy_id}/versions/metdata'
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
     * Summary: Get receivers Description: Get all the receivers associated with actions.
     * @param actionId Action id.
     * @param validateCache Flag that indicates if cache needs to be validated.
     */
    public async policyBuilderGetReceivers(actionId?: Array<string>, validateCache?: boolean, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;



        // Path Params
        const localVarPath = '/api/v3/policies/receivers';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (actionId !== undefined) {
            requestContext.setQueryParam("action_id", ObjectSerializer.serialize(actionId, "Array<string>", "int64"));
        }

        // Query Params
        if (validateCache !== undefined) {
            requestContext.setQueryParam("validate_cache", ObjectSerializer.serialize(validateCache, "boolean", ""));
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
     * Summary: Get rule metadata Description: Return a list of rule parameters and actions to the caller.
     * @param ruleType Rule type integer to indicate rule type.
     */
    public async policyBuilderGetRuleMetadata(ruleType?: 'ACCESS' | 'EXCEPTION' | 'RESULT_SET', _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;


        // Path Params
        const localVarPath = '/api/v3/rules/metadata';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (ruleType !== undefined) {
            requestContext.setQueryParam("rule_type", ObjectSerializer.serialize(ruleType, "'ACCESS' | 'EXCEPTION' | 'RESULT_SET'", ""));
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
     * Summary: Insert GDP policy sync entry Description: Inserts GDP policy\'s name into sync collection
     * @param policybuilderv3InsertGdpPolicySyncRequest 
     */
    public async policyBuilderInsertGdpPolicy(policybuilderv3InsertGdpPolicySyncRequest: Policybuilderv3InsertGdpPolicySyncRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'policybuilderv3InsertGdpPolicySyncRequest' is not null or undefined
        if (policybuilderv3InsertGdpPolicySyncRequest === null || policybuilderv3InsertGdpPolicySyncRequest === undefined) {
            throw new RequiredError("PolicyBuilderApi", "policyBuilderInsertGdpPolicy", "policybuilderv3InsertGdpPolicySyncRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/policies/sync_entry';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(policybuilderv3InsertGdpPolicySyncRequest, "Policybuilderv3InsertGdpPolicySyncRequest", ""),
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
     * Summary: Insert GDP policy summaries Description: Inserts GDP\'s CM\'s policy summary information into mogodb. (This API is called from GDP only)
     * @param centralManagerId ID of central manager.
     * @param policybuilderv3InsertGdpPolicyMetaDataRequest 
     */
    public async policyBuilderInsertGdpPolicyMetaData(centralManagerId: string, policybuilderv3InsertGdpPolicyMetaDataRequest: Policybuilderv3InsertGdpPolicyMetaDataRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'centralManagerId' is not null or undefined
        if (centralManagerId === null || centralManagerId === undefined) {
            throw new RequiredError("PolicyBuilderApi", "policyBuilderInsertGdpPolicyMetaData", "centralManagerId");
        }


        // verify required parameter 'policybuilderv3InsertGdpPolicyMetaDataRequest' is not null or undefined
        if (policybuilderv3InsertGdpPolicyMetaDataRequest === null || policybuilderv3InsertGdpPolicyMetaDataRequest === undefined) {
            throw new RequiredError("PolicyBuilderApi", "policyBuilderInsertGdpPolicyMetaData", "policybuilderv3InsertGdpPolicyMetaDataRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/central_managers/{central_manager_id}/policies/policy_metadata'
            .replace('{' + 'central_manager_id' + '}', encodeURIComponent(String(centralManagerId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(policybuilderv3InsertGdpPolicyMetaDataRequest, "Policybuilderv3InsertGdpPolicyMetaDataRequest", ""),
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
     * Summary: Install policies Description: Activate Policies request performs activations.
     * @param policybuilderv3InstallPoliciesRequest 
     */
    public async policyBuilderInstallPolicies(policybuilderv3InstallPoliciesRequest: Policybuilderv3InstallPoliciesRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'policybuilderv3InstallPoliciesRequest' is not null or undefined
        if (policybuilderv3InstallPoliciesRequest === null || policybuilderv3InstallPoliciesRequest === undefined) {
            throw new RequiredError("PolicyBuilderApi", "policyBuilderInstallPolicies", "policybuilderv3InstallPoliciesRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/policies/install';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PUT);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(policybuilderv3InstallPoliciesRequest, "Policybuilderv3InstallPoliciesRequest", ""),
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
     * Summary: Integration check Description: Check if integration id is being used in policies.
     * @param integrationId Integration Id to check if it is being used in policies.
     * @param templateId Template Id to check if it is being used in policies.
     */
    public async policyBuilderIntegrationCheck(integrationId: string, templateId?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'integrationId' is not null or undefined
        if (integrationId === null || integrationId === undefined) {
            throw new RequiredError("PolicyBuilderApi", "policyBuilderIntegrationCheck", "integrationId");
        }



        // Path Params
        const localVarPath = '/api/v3/policies/integration_check/{integration_id}'
            .replace('{' + 'integration_id' + '}', encodeURIComponent(String(integrationId)));

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
     * Summary: Policies groups Description: Get policy groups.
     * @param groupIds Group ids to check if they are being used in policies.
     */
    public async policyBuilderPoliciesGroups(groupIds?: Array<string>, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;


        // Path Params
        const localVarPath = '/api/v3/policies/groups';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (groupIds !== undefined) {
            requestContext.setQueryParam("group_ids", ObjectSerializer.serialize(groupIds, "Array<string>", ""));
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
     * Summary: Rule validation Description: Validate a rule parameters and actions.
     * @param policybuilderv3GetRuleValidationRequest 
     */
    public async policyBuilderRuleValidation(policybuilderv3GetRuleValidationRequest: Policybuilderv3GetRuleValidationRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'policybuilderv3GetRuleValidationRequest' is not null or undefined
        if (policybuilderv3GetRuleValidationRequest === null || policybuilderv3GetRuleValidationRequest === undefined) {
            throw new RequiredError("PolicyBuilderApi", "policyBuilderRuleValidation", "policybuilderv3GetRuleValidationRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/rules/validate';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(policybuilderv3GetRuleValidationRequest, "Policybuilderv3GetRuleValidationRequest", ""),
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
     * Summary: Store policies Gdp Description: Store policies.  (This API is called from GDP only)
     * @param centralManagerId ID of central manager.
     * @param policybuilderv3StorePolicyGdpRequest 
     */
    public async policyBuilderStorePoliciesGdp(centralManagerId: string, policybuilderv3StorePolicyGdpRequest: Policybuilderv3StorePolicyGdpRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'centralManagerId' is not null or undefined
        if (centralManagerId === null || centralManagerId === undefined) {
            throw new RequiredError("PolicyBuilderApi", "policyBuilderStorePoliciesGdp", "centralManagerId");
        }


        // verify required parameter 'policybuilderv3StorePolicyGdpRequest' is not null or undefined
        if (policybuilderv3StorePolicyGdpRequest === null || policybuilderv3StorePolicyGdpRequest === undefined) {
            throw new RequiredError("PolicyBuilderApi", "policyBuilderStorePoliciesGdp", "policybuilderv3StorePolicyGdpRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/policies/{central_manager_id}'
            .replace('{' + 'central_manager_id' + '}', encodeURIComponent(String(centralManagerId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(policybuilderv3StorePolicyGdpRequest, "Policybuilderv3StorePolicyGdpRequest", ""),
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
     * Summary: Update policy Description: Update Policy returns response code and message.
     * @param policybuilderv3CreateUpdatePolicyRequest 
     */
    public async policyBuilderUpdatePolicy(policybuilderv3CreateUpdatePolicyRequest: Policybuilderv3CreateUpdatePolicyRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'policybuilderv3CreateUpdatePolicyRequest' is not null or undefined
        if (policybuilderv3CreateUpdatePolicyRequest === null || policybuilderv3CreateUpdatePolicyRequest === undefined) {
            throw new RequiredError("PolicyBuilderApi", "policyBuilderUpdatePolicy", "policybuilderv3CreateUpdatePolicyRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/policies';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PUT);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(policybuilderv3CreateUpdatePolicyRequest, "Policybuilderv3CreateUpdatePolicyRequest", ""),
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

export class PolicyBuilderApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to policyBuilderClonePolicy
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async policyBuilderClonePolicyWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Policybuilderv3StandardCRUDResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Policybuilderv3StandardCRUDResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Policybuilderv3StandardCRUDResponse", ""
            ) as Policybuilderv3StandardCRUDResponse;
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
            const body: Policybuilderv3StandardCRUDResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Policybuilderv3StandardCRUDResponse", ""
            ) as Policybuilderv3StandardCRUDResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to policyBuilderCreatePolicy
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async policyBuilderCreatePolicyWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Policybuilderv3CreateUpdatePolicyResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Policybuilderv3CreateUpdatePolicyResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Policybuilderv3CreateUpdatePolicyResponse", ""
            ) as Policybuilderv3CreateUpdatePolicyResponse;
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
            const body: Policybuilderv3CreateUpdatePolicyResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Policybuilderv3CreateUpdatePolicyResponse", ""
            ) as Policybuilderv3CreateUpdatePolicyResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to policyBuilderDeleteGdpSyncEntry
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async policyBuilderDeleteGdpSyncEntryWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Policybuilderv3DeleteGdpPolicySyncResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Policybuilderv3DeleteGdpPolicySyncResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Policybuilderv3DeleteGdpPolicySyncResponse", ""
            ) as Policybuilderv3DeleteGdpPolicySyncResponse;
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
            const body: Policybuilderv3DeleteGdpPolicySyncResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Policybuilderv3DeleteGdpPolicySyncResponse", ""
            ) as Policybuilderv3DeleteGdpPolicySyncResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to policyBuilderDeletePolicies
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async policyBuilderDeletePoliciesWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Policybuilderv3StandardCRUDResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Policybuilderv3StandardCRUDResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Policybuilderv3StandardCRUDResponse", ""
            ) as Policybuilderv3StandardCRUDResponse;
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
            const body: Policybuilderv3StandardCRUDResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Policybuilderv3StandardCRUDResponse", ""
            ) as Policybuilderv3StandardCRUDResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to policyBuilderGetGdpPolicyMetaData
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async policyBuilderGetGdpPolicyMetaDataWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Policybuilderv3GetGdpPolicyMetaDataResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Policybuilderv3GetGdpPolicyMetaDataResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Policybuilderv3GetGdpPolicyMetaDataResponse", ""
            ) as Policybuilderv3GetGdpPolicyMetaDataResponse;
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
            const body: Policybuilderv3GetGdpPolicyMetaDataResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Policybuilderv3GetGdpPolicyMetaDataResponse", ""
            ) as Policybuilderv3GetGdpPolicyMetaDataResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to policyBuilderGetPolicies
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async policyBuilderGetPoliciesWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Policybuilderv3GetPoliciesResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Policybuilderv3GetPoliciesResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Policybuilderv3GetPoliciesResponse", ""
            ) as Policybuilderv3GetPoliciesResponse;
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
            const body: Policybuilderv3GetPoliciesResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Policybuilderv3GetPoliciesResponse", ""
            ) as Policybuilderv3GetPoliciesResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to policyBuilderGetPolicyDetails
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async policyBuilderGetPolicyDetailsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Policybuilderv3GetPolicyDetailsResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Policybuilderv3GetPolicyDetailsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Policybuilderv3GetPolicyDetailsResponse", ""
            ) as Policybuilderv3GetPolicyDetailsResponse;
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
            const body: Policybuilderv3GetPolicyDetailsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Policybuilderv3GetPolicyDetailsResponse", ""
            ) as Policybuilderv3GetPolicyDetailsResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to policyBuilderGetPolicyNamesFromRuleIDs
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async policyBuilderGetPolicyNamesFromRuleIDsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Policybuilderv3GetPolicyNamesFromRuleIDsResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Policybuilderv3GetPolicyNamesFromRuleIDsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Policybuilderv3GetPolicyNamesFromRuleIDsResponse", ""
            ) as Policybuilderv3GetPolicyNamesFromRuleIDsResponse;
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
            const body: Policybuilderv3GetPolicyNamesFromRuleIDsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Policybuilderv3GetPolicyNamesFromRuleIDsResponse", ""
            ) as Policybuilderv3GetPolicyNamesFromRuleIDsResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to policyBuilderGetPolicySyncList
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async policyBuilderGetPolicySyncListWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Policybuilderv3GetPolicySyncListResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Policybuilderv3GetPolicySyncListResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Policybuilderv3GetPolicySyncListResponse", ""
            ) as Policybuilderv3GetPolicySyncListResponse;
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
            const body: Policybuilderv3GetPolicySyncListResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Policybuilderv3GetPolicySyncListResponse", ""
            ) as Policybuilderv3GetPolicySyncListResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to policyBuilderGetPolicyVersion
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async policyBuilderGetPolicyVersionWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Policybuilderv3GetPolicyVersionResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Policybuilderv3GetPolicyVersionResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Policybuilderv3GetPolicyVersionResponse", ""
            ) as Policybuilderv3GetPolicyVersionResponse;
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
            const body: Policybuilderv3GetPolicyVersionResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Policybuilderv3GetPolicyVersionResponse", ""
            ) as Policybuilderv3GetPolicyVersionResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to policyBuilderGetPolicyVersionsInfo
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async policyBuilderGetPolicyVersionsInfoWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Policybuilderv3GetPolicyVersionsInfoResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Policybuilderv3GetPolicyVersionsInfoResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Policybuilderv3GetPolicyVersionsInfoResponse", ""
            ) as Policybuilderv3GetPolicyVersionsInfoResponse;
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
            const body: Policybuilderv3GetPolicyVersionsInfoResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Policybuilderv3GetPolicyVersionsInfoResponse", ""
            ) as Policybuilderv3GetPolicyVersionsInfoResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to policyBuilderGetReceivers
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async policyBuilderGetReceiversWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Policybuilderv3GetReceiversResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Policybuilderv3GetReceiversResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Policybuilderv3GetReceiversResponse", ""
            ) as Policybuilderv3GetReceiversResponse;
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
            const body: Policybuilderv3GetReceiversResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Policybuilderv3GetReceiversResponse", ""
            ) as Policybuilderv3GetReceiversResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to policyBuilderGetRuleMetadata
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async policyBuilderGetRuleMetadataWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Policybuilderv3RuleMetadataResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Policybuilderv3RuleMetadataResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Policybuilderv3RuleMetadataResponse", ""
            ) as Policybuilderv3RuleMetadataResponse;
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
            const body: Policybuilderv3RuleMetadataResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Policybuilderv3RuleMetadataResponse", ""
            ) as Policybuilderv3RuleMetadataResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to policyBuilderInsertGdpPolicy
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async policyBuilderInsertGdpPolicyWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Policybuilderv3InsertGdpPolicySyncResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Policybuilderv3InsertGdpPolicySyncResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Policybuilderv3InsertGdpPolicySyncResponse", ""
            ) as Policybuilderv3InsertGdpPolicySyncResponse;
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
            const body: Policybuilderv3InsertGdpPolicySyncResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Policybuilderv3InsertGdpPolicySyncResponse", ""
            ) as Policybuilderv3InsertGdpPolicySyncResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to policyBuilderInsertGdpPolicyMetaData
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async policyBuilderInsertGdpPolicyMetaDataWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Policybuilderv3InsertGdpPolicyMetaDataResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Policybuilderv3InsertGdpPolicyMetaDataResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Policybuilderv3InsertGdpPolicyMetaDataResponse", ""
            ) as Policybuilderv3InsertGdpPolicyMetaDataResponse;
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
            const body: Policybuilderv3InsertGdpPolicyMetaDataResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Policybuilderv3InsertGdpPolicyMetaDataResponse", ""
            ) as Policybuilderv3InsertGdpPolicyMetaDataResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to policyBuilderInstallPolicies
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async policyBuilderInstallPoliciesWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Policybuilderv3StatusResponseBase >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Policybuilderv3StatusResponseBase = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Policybuilderv3StatusResponseBase", ""
            ) as Policybuilderv3StatusResponseBase;
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
            const body: Policybuilderv3StatusResponseBase = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Policybuilderv3StatusResponseBase", ""
            ) as Policybuilderv3StatusResponseBase;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to policyBuilderIntegrationCheck
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async policyBuilderIntegrationCheckWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Policybuilderv3GetIntegrationCheckResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Policybuilderv3GetIntegrationCheckResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Policybuilderv3GetIntegrationCheckResponse", ""
            ) as Policybuilderv3GetIntegrationCheckResponse;
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
            const body: Policybuilderv3GetIntegrationCheckResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Policybuilderv3GetIntegrationCheckResponse", ""
            ) as Policybuilderv3GetIntegrationCheckResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to policyBuilderPoliciesGroups
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async policyBuilderPoliciesGroupsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Policybuilderv3GetPoliciesGroupsResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Policybuilderv3GetPoliciesGroupsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Policybuilderv3GetPoliciesGroupsResponse", ""
            ) as Policybuilderv3GetPoliciesGroupsResponse;
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
            const body: Policybuilderv3GetPoliciesGroupsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Policybuilderv3GetPoliciesGroupsResponse", ""
            ) as Policybuilderv3GetPoliciesGroupsResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to policyBuilderRuleValidation
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async policyBuilderRuleValidationWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Policybuilderv3StandardCRUDResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Policybuilderv3StandardCRUDResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Policybuilderv3StandardCRUDResponse", ""
            ) as Policybuilderv3StandardCRUDResponse;
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
            const body: Policybuilderv3StandardCRUDResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Policybuilderv3StandardCRUDResponse", ""
            ) as Policybuilderv3StandardCRUDResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to policyBuilderStorePoliciesGdp
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async policyBuilderStorePoliciesGdpWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Policybuilderv3StorePolicyGdpResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Policybuilderv3StorePolicyGdpResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Policybuilderv3StorePolicyGdpResponse", ""
            ) as Policybuilderv3StorePolicyGdpResponse;
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
            const body: Policybuilderv3StorePolicyGdpResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Policybuilderv3StorePolicyGdpResponse", ""
            ) as Policybuilderv3StorePolicyGdpResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to policyBuilderUpdatePolicy
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async policyBuilderUpdatePolicyWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Policybuilderv3CreateUpdatePolicyResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Policybuilderv3CreateUpdatePolicyResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Policybuilderv3CreateUpdatePolicyResponse", ""
            ) as Policybuilderv3CreateUpdatePolicyResponse;
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
            const body: Policybuilderv3CreateUpdatePolicyResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Policybuilderv3CreateUpdatePolicyResponse", ""
            ) as Policybuilderv3CreateUpdatePolicyResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
