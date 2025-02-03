// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile, HttpInfo} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


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
import { Reportsv3DeleteCategoryResponse } from '../models/Reportsv3DeleteCategoryResponse';
import { Reportsv3DeleteChartResponse } from '../models/Reportsv3DeleteChartResponse';
import { Reportsv3DeleteChartTemplatev2Response } from '../models/Reportsv3DeleteChartTemplatev2Response';
import { Reportsv3DeleteChartv2Response } from '../models/Reportsv3DeleteChartv2Response';
import { Reportsv3DeleteFieldsByCategoryResponse } from '../models/Reportsv3DeleteFieldsByCategoryResponse';
import { Reportsv3DeleteJoinResponse } from '../models/Reportsv3DeleteJoinResponse';
import { Reportsv3DeleteReportResponse } from '../models/Reportsv3DeleteReportResponse';
import { Reportsv3DeleteVariantResponse } from '../models/Reportsv3DeleteVariantResponse';
import { Reportsv3GetCategoriesResponse } from '../models/Reportsv3GetCategoriesResponse';
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
import { Reportsv3PartialChartUpdateRequest } from '../models/Reportsv3PartialChartUpdateRequest';
import { Reportsv3PartialChartUpdateResponse } from '../models/Reportsv3PartialChartUpdateResponse';
import { Reportsv3PartialReportUpdateRequest } from '../models/Reportsv3PartialReportUpdateRequest';
import { Reportsv3PartialReportUpdateResponse } from '../models/Reportsv3PartialReportUpdateResponse';
import { Reportsv3RunReportResponse } from '../models/Reportsv3RunReportResponse';
import { Reportsv3RunVariantOperationRequest } from '../models/Reportsv3RunVariantOperationRequest';
import { Reportsv3RunVariantOperationResponse } from '../models/Reportsv3RunVariantOperationResponse';
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
import { RuntimeError } from '../models/RuntimeError';

/**
 * no description
 */
export class ReportsServiceApiRequestFactory extends BaseAPIRequestFactory {

    /**
     * Summary: Create a category Description: Create a report category
     * @param reportsv3CreateCategoryRequest 
     */
    public async reportsServiceCreateCategory(reportsv3CreateCategoryRequest: Reportsv3CreateCategoryRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'reportsv3CreateCategoryRequest' is not null or undefined
        if (reportsv3CreateCategoryRequest === null || reportsv3CreateCategoryRequest === undefined) {
            throw new RequiredError("ReportsServiceApi", "reportsServiceCreateCategory", "reportsv3CreateCategoryRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/reports/categories';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(reportsv3CreateCategoryRequest, "Reportsv3CreateCategoryRequest", ""),
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
     * Summary: Create chart Description: Create custom chart based on provided properties.
     * @param reportsv3CreateChartRequest 
     */
    public async reportsServiceCreateChart(reportsv3CreateChartRequest: Reportsv3CreateChartRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'reportsv3CreateChartRequest' is not null or undefined
        if (reportsv3CreateChartRequest === null || reportsv3CreateChartRequest === undefined) {
            throw new RequiredError("ReportsServiceApi", "reportsServiceCreateChart", "reportsv3CreateChartRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/charts';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(reportsv3CreateChartRequest, "Reportsv3CreateChartRequest", ""),
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
     * Summary: Create chart template v2 Description: Create custom VEGA chart template.
     * @param reportsv3CreateChartTemplatev2Request 
     */
    public async reportsServiceCreateChartTemplatev2(reportsv3CreateChartTemplatev2Request: Reportsv3CreateChartTemplatev2Request, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'reportsv3CreateChartTemplatev2Request' is not null or undefined
        if (reportsv3CreateChartTemplatev2Request === null || reportsv3CreateChartTemplatev2Request === undefined) {
            throw new RequiredError("ReportsServiceApi", "reportsServiceCreateChartTemplatev2", "reportsv3CreateChartTemplatev2Request");
        }


        // Path Params
        const localVarPath = '/api/v3/flex-charts/templates';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(reportsv3CreateChartTemplatev2Request, "Reportsv3CreateChartTemplatev2Request", ""),
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
     * Summary: Create chart v2 Description: Create custom VEGA chart based on provided properties.
     * @param reportsv3CreateChartv2Request 
     */
    public async reportsServiceCreateChartv2(reportsv3CreateChartv2Request: Reportsv3CreateChartv2Request, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'reportsv3CreateChartv2Request' is not null or undefined
        if (reportsv3CreateChartv2Request === null || reportsv3CreateChartv2Request === undefined) {
            throw new RequiredError("ReportsServiceApi", "reportsServiceCreateChartv2", "reportsv3CreateChartv2Request");
        }


        // Path Params
        const localVarPath = '/api/v3/flex-charts';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(reportsv3CreateChartv2Request, "Reportsv3CreateChartv2Request", ""),
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
     * Summary - Create fields by category Description: Cteate category fields based on provided properties.
     * @param reportsv3CreateFieldsByCategoryRequest 
     */
    public async reportsServiceCreateFieldsByCategory(reportsv3CreateFieldsByCategoryRequest: Reportsv3CreateFieldsByCategoryRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'reportsv3CreateFieldsByCategoryRequest' is not null or undefined
        if (reportsv3CreateFieldsByCategoryRequest === null || reportsv3CreateFieldsByCategoryRequest === undefined) {
            throw new RequiredError("ReportsServiceApi", "reportsServiceCreateFieldsByCategory", "reportsv3CreateFieldsByCategoryRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/reports/fields';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(reportsv3CreateFieldsByCategoryRequest, "Reportsv3CreateFieldsByCategoryRequest", ""),
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
     * Summary: Create a join Description: Create a custom report join
     * @param reportsv3CreateJoinRequest 
     */
    public async reportsServiceCreateJoin(reportsv3CreateJoinRequest: Reportsv3CreateJoinRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'reportsv3CreateJoinRequest' is not null or undefined
        if (reportsv3CreateJoinRequest === null || reportsv3CreateJoinRequest === undefined) {
            throw new RequiredError("ReportsServiceApi", "reportsServiceCreateJoin", "reportsv3CreateJoinRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/reports/categories/joins';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(reportsv3CreateJoinRequest, "Reportsv3CreateJoinRequest", ""),
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
     * Summary: Create report Description: Create custom report based on provided properties.
     * @param reportsv3CreateReportRequest 
     */
    public async reportsServiceCreateReport(reportsv3CreateReportRequest: Reportsv3CreateReportRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'reportsv3CreateReportRequest' is not null or undefined
        if (reportsv3CreateReportRequest === null || reportsv3CreateReportRequest === undefined) {
            throw new RequiredError("ReportsServiceApi", "reportsServiceCreateReport", "reportsv3CreateReportRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/reports';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(reportsv3CreateReportRequest, "Reportsv3CreateReportRequest", ""),
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
     * Summary: Create a variant Description: Create a variant for reports
     * @param reportsv3CreateVariantRequest 
     */
    public async reportsServiceCreateVariant(reportsv3CreateVariantRequest: Reportsv3CreateVariantRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'reportsv3CreateVariantRequest' is not null or undefined
        if (reportsv3CreateVariantRequest === null || reportsv3CreateVariantRequest === undefined) {
            throw new RequiredError("ReportsServiceApi", "reportsServiceCreateVariant", "reportsv3CreateVariantRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/reports/variants';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(reportsv3CreateVariantRequest, "Reportsv3CreateVariantRequest", ""),
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
     * Summary: Delete a category Description: Delete a report category
     * @param categoryId category id.
     * @param tableName table name.
     */
    public async reportsServiceDeleteCategory(categoryId?: string, tableName?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;



        // Path Params
        const localVarPath = '/api/v3/reports/categories';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.DELETE);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (categoryId !== undefined) {
            requestContext.setQueryParam("category_id", ObjectSerializer.serialize(categoryId, "string", ""));
        }

        // Query Params
        if (tableName !== undefined) {
            requestContext.setQueryParam("table_name", ObjectSerializer.serialize(tableName, "string", ""));
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
     * Summary: Delete chart Description: Delete a custom chart.
     * @param chartId The id of the chart to be deleted.
     */
    public async reportsServiceDeleteChart(chartId: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'chartId' is not null or undefined
        if (chartId === null || chartId === undefined) {
            throw new RequiredError("ReportsServiceApi", "reportsServiceDeleteChart", "chartId");
        }


        // Path Params
        const localVarPath = '/api/v3/charts/{chart_id}'
            .replace('{' + 'chart_id' + '}', encodeURIComponent(String(chartId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.DELETE);
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
     * Summary: Delete chart template v2 Description: Delete a custom VEGA chart template.
     * @param templateId Unique template ID.
     */
    public async reportsServiceDeleteChartTemplatev2(templateId: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'templateId' is not null or undefined
        if (templateId === null || templateId === undefined) {
            throw new RequiredError("ReportsServiceApi", "reportsServiceDeleteChartTemplatev2", "templateId");
        }


        // Path Params
        const localVarPath = '/api/v3/flex-charts/templates/{template_id}'
            .replace('{' + 'template_id' + '}', encodeURIComponent(String(templateId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.DELETE);
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
     * Summary: Delete chart v2 Description: Delete a custom VEGA chart.
     * @param chartId The ID of the chart for deletion.
     */
    public async reportsServiceDeleteChartv2(chartId: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'chartId' is not null or undefined
        if (chartId === null || chartId === undefined) {
            throw new RequiredError("ReportsServiceApi", "reportsServiceDeleteChartv2", "chartId");
        }


        // Path Params
        const localVarPath = '/api/v3/flex-charts/{chart_id}'
            .replace('{' + 'chart_id' + '}', encodeURIComponent(String(chartId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.DELETE);
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
     * Summary - Delete fields by category Description: Delete category fields based on provided properties.
     * @param headerIds Header ids.
     * @param tableName table name.
     */
    public async reportsServiceDeleteFieldsByCategory(headerIds?: Array<string>, tableName?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;



        // Path Params
        const localVarPath = '/api/v3/reports/fields';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.DELETE);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (headerIds !== undefined) {
            requestContext.setQueryParam("header_ids", ObjectSerializer.serialize(headerIds, "Array<string>", ""));
        }

        // Query Params
        if (tableName !== undefined) {
            requestContext.setQueryParam("table_name", ObjectSerializer.serialize(tableName, "string", ""));
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
     * Summary: Delete a join Description: Delete a custom join
     * @param joinId The id of the join to be deleted.
     */
    public async reportsServiceDeleteJoin(joinId: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'joinId' is not null or undefined
        if (joinId === null || joinId === undefined) {
            throw new RequiredError("ReportsServiceApi", "reportsServiceDeleteJoin", "joinId");
        }


        // Path Params
        const localVarPath = '/api/v3/reports/categories/joins/{join_id}'
            .replace('{' + 'join_id' + '}', encodeURIComponent(String(joinId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.DELETE);
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
     * Summary: Delete report Description: Delete a custom report.
     * @param reportId The id of the Report to be deleted.
     */
    public async reportsServiceDeleteReport(reportId: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'reportId' is not null or undefined
        if (reportId === null || reportId === undefined) {
            throw new RequiredError("ReportsServiceApi", "reportsServiceDeleteReport", "reportId");
        }


        // Path Params
        const localVarPath = '/api/v3/reports/{report_id}'
            .replace('{' + 'report_id' + '}', encodeURIComponent(String(reportId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.DELETE);
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
     * Summary: Delete a variant Description: Delete a variant
     * @param variantId The id of the variant to delete
     */
    public async reportsServiceDeleteVariant(variantId: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'variantId' is not null or undefined
        if (variantId === null || variantId === undefined) {
            throw new RequiredError("ReportsServiceApi", "reportsServiceDeleteVariant", "variantId");
        }


        // Path Params
        const localVarPath = '/api/v3/reports/variants/{variant_id}'
            .replace('{' + 'variant_id' + '}', encodeURIComponent(String(variantId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.DELETE);
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
     * Summary:  Get all available report categories. Description: Get all category related fields or all possible fields.
     * @param reportId Report ID.
     */
    public async reportsServiceGetCategories(reportId?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;


        // Path Params
        const localVarPath = '/api/v3/reports/categories';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (reportId !== undefined) {
            requestContext.setQueryParam("report_id", ObjectSerializer.serialize(reportId, "string", ""));
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
     * Summary: Get chart settings Description: Get a custom chart based on provided report id.
     * @param chartId Unique Chart ID.
     * @param reportId Unique Report ID.
     */
    public async reportsServiceGetChartSettings(chartId?: string, reportId?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;



        // Path Params
        const localVarPath = '/api/v3/charts';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (chartId !== undefined) {
            requestContext.setQueryParam("chart_id", ObjectSerializer.serialize(chartId, "string", ""));
        }

        // Query Params
        if (reportId !== undefined) {
            requestContext.setQueryParam("report_id", ObjectSerializer.serialize(reportId, "string", ""));
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
     * Summary: Get chart settings v2 Description: Get a custom VEGA chart based on provided report id.
     * @param chartId Unique Chart ID.
     * @param reportId Unique Report ID.
     */
    public async reportsServiceGetChartSettingsv2(chartId?: string, reportId?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;



        // Path Params
        const localVarPath = '/api/v3/flex-charts';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (chartId !== undefined) {
            requestContext.setQueryParam("chart_id", ObjectSerializer.serialize(chartId, "string", ""));
        }

        // Query Params
        if (reportId !== undefined) {
            requestContext.setQueryParam("report_id", ObjectSerializer.serialize(reportId, "string", ""));
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
     * Summary: Get chart template v2 Description: Get all custom VEGA chart templates.
     */
    public async reportsServiceGetChartTemplatesv2(_options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // Path Params
        const localVarPath = '/api/v3/flex-charts/templates';

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
     * Summary: Get fields by categories Description: Get all category related fields or all possible fields based on a list of categories.
     * @param categoryIds Category IDs.
     */
    public async reportsServiceGetFieldsByCategories(categoryIds?: Array<string>, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;


        // Path Params
        const localVarPath = '/api/v3/reports/fields/categories';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (categoryIds !== undefined) {
            requestContext.setQueryParam("category_ids", ObjectSerializer.serialize(categoryIds, "Array<string>", ""));
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
     * Summary: Get fields by category Description: Get all category related fields or all possible fields.
     * @param categoryId Category ID.
     * @param reportId Report ID.
     * @param tableName optional table name parameter.
     */
    public async reportsServiceGetFieldsByCategory(categoryId?: string, reportId?: string, tableName?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;




        // Path Params
        const localVarPath = '/api/v3/reports/fields';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (categoryId !== undefined) {
            requestContext.setQueryParam("category_id", ObjectSerializer.serialize(categoryId, "string", ""));
        }

        // Query Params
        if (reportId !== undefined) {
            requestContext.setQueryParam("report_id", ObjectSerializer.serialize(reportId, "string", ""));
        }

        // Query Params
        if (tableName !== undefined) {
            requestContext.setQueryParam("table_name", ObjectSerializer.serialize(tableName, "string", ""));
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
     * Summary: Get all joins Description: Get all custom joins.
     * @param categoryId Category ID (Optional).
     */
    public async reportsServiceGetJoins(categoryId?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;


        // Path Params
        const localVarPath = '/api/v3/reports/categories/joins';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (categoryId !== undefined) {
            requestContext.setQueryParam("category_id", ObjectSerializer.serialize(categoryId, "string", ""));
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
     * Summary: Get query by report definition Description: Get query by report definition.
     * @param reportsv3GetQueryByReportDefinitionRequest 
     */
    public async reportsServiceGetQueryByReportDefinition(reportsv3GetQueryByReportDefinitionRequest: Reportsv3GetQueryByReportDefinitionRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'reportsv3GetQueryByReportDefinitionRequest' is not null or undefined
        if (reportsv3GetQueryByReportDefinitionRequest === null || reportsv3GetQueryByReportDefinitionRequest === undefined) {
            throw new RequiredError("ReportsServiceApi", "reportsServiceGetQueryByReportDefinition", "reportsv3GetQueryByReportDefinitionRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/reports/query/definition';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(reportsv3GetQueryByReportDefinitionRequest, "Reportsv3GetQueryByReportDefinitionRequest", ""),
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
     * Summary: Get query by report ID Description: Get query by report ID.
     * @param reportsv3GetQueryByReportIDRequest 
     */
    public async reportsServiceGetQueryByReportID(reportsv3GetQueryByReportIDRequest: Reportsv3GetQueryByReportIDRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'reportsv3GetQueryByReportIDRequest' is not null or undefined
        if (reportsv3GetQueryByReportIDRequest === null || reportsv3GetQueryByReportIDRequest === undefined) {
            throw new RequiredError("ReportsServiceApi", "reportsServiceGetQueryByReportID", "reportsv3GetQueryByReportIDRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/reports/query/id';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(reportsv3GetQueryByReportIDRequest, "Reportsv3GetQueryByReportIDRequest", ""),
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
     * Summary: Get report definition Description: Get report definition.
     * @param reportId Unique Report ID.
     */
    public async reportsServiceGetReportDefinition(reportId: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'reportId' is not null or undefined
        if (reportId === null || reportId === undefined) {
            throw new RequiredError("ReportsServiceApi", "reportsServiceGetReportDefinition", "reportId");
        }


        // Path Params
        const localVarPath = '/api/v3/reports/{report_id}/definition'
            .replace('{' + 'report_id' + '}', encodeURIComponent(String(reportId)));

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
     * Summary: Get report groups Description: Get reports used by the provided groups.
     * @param groups List of group IDs that should be checked for usage in each report.
     */
    public async reportsServiceGetReportGroups(groups?: Array<string>, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;


        // Path Params
        const localVarPath = '/api/v3/reports_groups';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (groups !== undefined) {
            requestContext.setQueryParam("groups", ObjectSerializer.serialize(groups, "Array<string>", ""));
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
     * Summary: Get report synopsis Description: Return BriefReport.
     * @param reportId Unique Report ID.
     */
    public async reportsServiceGetReportSynopsis(reportId: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'reportId' is not null or undefined
        if (reportId === null || reportId === undefined) {
            throw new RequiredError("ReportsServiceApi", "reportsServiceGetReportSynopsis", "reportId");
        }


        // Path Params
        const localVarPath = '/api/v3/reports/{report_id}/synopsis'
            .replace('{' + 'report_id' + '}', encodeURIComponent(String(reportId)));

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
     * Summary: Get report timestamp header Description: Get where to take a report timestamp given an entity.
     * @param categoryId Category ID parameter.
     * @param tableNames List of all header tables.
     */
    public async reportsServiceGetReportTimestampHeader(categoryId?: string, tableNames?: Array<string>, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;



        // Path Params
        const localVarPath = '/api/v3/reports/headers/timestamp/default';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (categoryId !== undefined) {
            requestContext.setQueryParam("category_id", ObjectSerializer.serialize(categoryId, "string", ""));
        }

        // Query Params
        if (tableNames !== undefined) {
            requestContext.setQueryParam("table_names", ObjectSerializer.serialize(tableNames, "Array<string>", ""));
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
     * Summary: Get reports Description: Get reports list.
     * @param categoryId Optional Category ID parameter.
     * @param tableName Optional table name parameter.
     */
    public async reportsServiceGetReports(categoryId?: string, tableName?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;



        // Path Params
        const localVarPath = '/api/v3/reports';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (categoryId !== undefined) {
            requestContext.setQueryParam("category_id", ObjectSerializer.serialize(categoryId, "string", ""));
        }

        // Query Params
        if (tableName !== undefined) {
            requestContext.setQueryParam("table_name", ObjectSerializer.serialize(tableName, "string", ""));
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
     * Summary: Get the reports that use a join Description: Get the reports that use a join and the headers that are imported by the reports using the join
     * @param joinId 
     */
    public async reportsServiceGetReportsForJoin(joinId: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'joinId' is not null or undefined
        if (joinId === null || joinId === undefined) {
            throw new RequiredError("ReportsServiceApi", "reportsServiceGetReportsForJoin", "joinId");
        }


        // Path Params
        const localVarPath = '/api/v3/reports/categories/joins/{join_id}/reports'
            .replace('{' + 'join_id' + '}', encodeURIComponent(String(joinId)));

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
     * Summary: Get reports tags Description: Get all report distinct tags.
     */
    public async reportsServiceGetReportsTags(_options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // Path Params
        const localVarPath = '/api/v3/reports/tags';

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
     * Summary: Get a variant Description: Get a given variant
     * @param variantId The variant id
     */
    public async reportsServiceGetVariant(variantId: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'variantId' is not null or undefined
        if (variantId === null || variantId === undefined) {
            throw new RequiredError("ReportsServiceApi", "reportsServiceGetVariant", "variantId");
        }


        // Path Params
        const localVarPath = '/api/v3/reports/variants/{variant_id}'
            .replace('{' + 'variant_id' + '}', encodeURIComponent(String(variantId)));

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
     * Summary: Get all variants Description: Get all variants in reports
     */
    public async reportsServiceGetVariants(_options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // Path Params
        const localVarPath = '/api/v3/reports/variants';

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
     * Summary: Partial chart update Description: Update a custom chart with partial information.
     * @param chartId Unique chart ID.
     * @param reportsv3PartialChartUpdateRequest 
     */
    public async reportsServicePartialChartUpdate(chartId: string, reportsv3PartialChartUpdateRequest: Reportsv3PartialChartUpdateRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'chartId' is not null or undefined
        if (chartId === null || chartId === undefined) {
            throw new RequiredError("ReportsServiceApi", "reportsServicePartialChartUpdate", "chartId");
        }


        // verify required parameter 'reportsv3PartialChartUpdateRequest' is not null or undefined
        if (reportsv3PartialChartUpdateRequest === null || reportsv3PartialChartUpdateRequest === undefined) {
            throw new RequiredError("ReportsServiceApi", "reportsServicePartialChartUpdate", "reportsv3PartialChartUpdateRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/charts/{chart_id}'
            .replace('{' + 'chart_id' + '}', encodeURIComponent(String(chartId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PATCH);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(reportsv3PartialChartUpdateRequest, "Reportsv3PartialChartUpdateRequest", ""),
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
     * Summary: Partial report update Description: Update a custom report with partial information.
     * @param reportId Unique Report ID.
     * @param reportsv3PartialReportUpdateRequest 
     */
    public async reportsServicePartialReportUpdate(reportId: string, reportsv3PartialReportUpdateRequest: Reportsv3PartialReportUpdateRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'reportId' is not null or undefined
        if (reportId === null || reportId === undefined) {
            throw new RequiredError("ReportsServiceApi", "reportsServicePartialReportUpdate", "reportId");
        }


        // verify required parameter 'reportsv3PartialReportUpdateRequest' is not null or undefined
        if (reportsv3PartialReportUpdateRequest === null || reportsv3PartialReportUpdateRequest === undefined) {
            throw new RequiredError("ReportsServiceApi", "reportsServicePartialReportUpdate", "reportsv3PartialReportUpdateRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/reports/{report_id}'
            .replace('{' + 'report_id' + '}', encodeURIComponent(String(reportId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PATCH);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(reportsv3PartialReportUpdateRequest, "Reportsv3PartialReportUpdateRequest", ""),
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
     * Summary: Run a variant Description: Run the operations in a variant
     * @param reportsv3RunVariantOperationRequest 
     */
    public async reportsServiceRunVariantOperation(reportsv3RunVariantOperationRequest: Reportsv3RunVariantOperationRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'reportsv3RunVariantOperationRequest' is not null or undefined
        if (reportsv3RunVariantOperationRequest === null || reportsv3RunVariantOperationRequest === undefined) {
            throw new RequiredError("ReportsServiceApi", "reportsServiceRunVariantOperation", "reportsv3RunVariantOperationRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/reports/variants/run';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(reportsv3RunVariantOperationRequest, "Reportsv3RunVariantOperationRequest", ""),
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
     * Summary: Transpose Description: Return the corresponding full sql data.
     * @param reportsv3TransposeRequest 
     */
    public async reportsServiceTranspose(reportsv3TransposeRequest: Reportsv3TransposeRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'reportsv3TransposeRequest' is not null or undefined
        if (reportsv3TransposeRequest === null || reportsv3TransposeRequest === undefined) {
            throw new RequiredError("ReportsServiceApi", "reportsServiceTranspose", "reportsv3TransposeRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/reports/transpose';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(reportsv3TransposeRequest, "Reportsv3TransposeRequest", ""),
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
     * Summary: Update chart Description: Update a custom chart.
     * @param chartId Unique chart ID.
     * @param reportsv3UpdateChartRequest 
     */
    public async reportsServiceUpdateChart(chartId: string, reportsv3UpdateChartRequest: Reportsv3UpdateChartRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'chartId' is not null or undefined
        if (chartId === null || chartId === undefined) {
            throw new RequiredError("ReportsServiceApi", "reportsServiceUpdateChart", "chartId");
        }


        // verify required parameter 'reportsv3UpdateChartRequest' is not null or undefined
        if (reportsv3UpdateChartRequest === null || reportsv3UpdateChartRequest === undefined) {
            throw new RequiredError("ReportsServiceApi", "reportsServiceUpdateChart", "reportsv3UpdateChartRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/charts/{chart_id}'
            .replace('{' + 'chart_id' + '}', encodeURIComponent(String(chartId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PUT);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(reportsv3UpdateChartRequest, "Reportsv3UpdateChartRequest", ""),
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
     * Summary: Update chart v2 Description: Update a custom VEGA chart.
     * @param chartId Unique chart ID.
     * @param reportsv3UpdateChartv2Request 
     */
    public async reportsServiceUpdateChartv2(chartId: string, reportsv3UpdateChartv2Request: Reportsv3UpdateChartv2Request, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'chartId' is not null or undefined
        if (chartId === null || chartId === undefined) {
            throw new RequiredError("ReportsServiceApi", "reportsServiceUpdateChartv2", "chartId");
        }


        // verify required parameter 'reportsv3UpdateChartv2Request' is not null or undefined
        if (reportsv3UpdateChartv2Request === null || reportsv3UpdateChartv2Request === undefined) {
            throw new RequiredError("ReportsServiceApi", "reportsServiceUpdateChartv2", "reportsv3UpdateChartv2Request");
        }


        // Path Params
        const localVarPath = '/api/v3/flex-charts/{chart_id}'
            .replace('{' + 'chart_id' + '}', encodeURIComponent(String(chartId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PUT);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(reportsv3UpdateChartv2Request, "Reportsv3UpdateChartv2Request", ""),
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
     * Summary: Update a join Description: Update a custom join
     * @param joinId Unique join ID.
     * @param reportsv3UpdateJoinRequest 
     */
    public async reportsServiceUpdateJoin(joinId: string, reportsv3UpdateJoinRequest: Reportsv3UpdateJoinRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'joinId' is not null or undefined
        if (joinId === null || joinId === undefined) {
            throw new RequiredError("ReportsServiceApi", "reportsServiceUpdateJoin", "joinId");
        }


        // verify required parameter 'reportsv3UpdateJoinRequest' is not null or undefined
        if (reportsv3UpdateJoinRequest === null || reportsv3UpdateJoinRequest === undefined) {
            throw new RequiredError("ReportsServiceApi", "reportsServiceUpdateJoin", "reportsv3UpdateJoinRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/reports/categories/joins/{join_id}'
            .replace('{' + 'join_id' + '}', encodeURIComponent(String(joinId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PUT);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(reportsv3UpdateJoinRequest, "Reportsv3UpdateJoinRequest", ""),
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
     * Summary: Update report Description: Update a custom report.
     * @param reportId Unique Report ID.
     * @param reportsv3UpdateReportRequest 
     */
    public async reportsServiceUpdateReport(reportId: string, reportsv3UpdateReportRequest: Reportsv3UpdateReportRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'reportId' is not null or undefined
        if (reportId === null || reportId === undefined) {
            throw new RequiredError("ReportsServiceApi", "reportsServiceUpdateReport", "reportId");
        }


        // verify required parameter 'reportsv3UpdateReportRequest' is not null or undefined
        if (reportsv3UpdateReportRequest === null || reportsv3UpdateReportRequest === undefined) {
            throw new RequiredError("ReportsServiceApi", "reportsServiceUpdateReport", "reportsv3UpdateReportRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/reports/{report_id}'
            .replace('{' + 'report_id' + '}', encodeURIComponent(String(reportId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PUT);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(reportsv3UpdateReportRequest, "Reportsv3UpdateReportRequest", ""),
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
     * Summary: Update a variant Description: Update a variant with a custom override
     * @param variantId The variant id
     * @param reportsv3UpdateVariantOverrideRequest 
     */
    public async reportsServiceUpdateVariantOverride(variantId: string, reportsv3UpdateVariantOverrideRequest: Reportsv3UpdateVariantOverrideRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'variantId' is not null or undefined
        if (variantId === null || variantId === undefined) {
            throw new RequiredError("ReportsServiceApi", "reportsServiceUpdateVariantOverride", "variantId");
        }


        // verify required parameter 'reportsv3UpdateVariantOverrideRequest' is not null or undefined
        if (reportsv3UpdateVariantOverrideRequest === null || reportsv3UpdateVariantOverrideRequest === undefined) {
            throw new RequiredError("ReportsServiceApi", "reportsServiceUpdateVariantOverride", "reportsv3UpdateVariantOverrideRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/reports/variants/{variant_id}'
            .replace('{' + 'variant_id' + '}', encodeURIComponent(String(variantId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PUT);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(reportsv3UpdateVariantOverrideRequest, "Reportsv3UpdateVariantOverrideRequest", ""),
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

export class ReportsServiceApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to reportsServiceCreateCategory
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async reportsServiceCreateCategoryWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Reportsv3CreateCategoryResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Reportsv3CreateCategoryResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3CreateCategoryResponse", ""
            ) as Reportsv3CreateCategoryResponse;
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
            const body: Reportsv3CreateCategoryResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3CreateCategoryResponse", ""
            ) as Reportsv3CreateCategoryResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to reportsServiceCreateChart
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async reportsServiceCreateChartWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Reportsv3CreateChartResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Reportsv3CreateChartResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3CreateChartResponse", ""
            ) as Reportsv3CreateChartResponse;
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
            const body: Reportsv3CreateChartResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3CreateChartResponse", ""
            ) as Reportsv3CreateChartResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to reportsServiceCreateChartTemplatev2
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async reportsServiceCreateChartTemplatev2WithHttpInfo(response: ResponseContext): Promise<HttpInfo<Reportsv3CreateChartTemplatev2Response >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Reportsv3CreateChartTemplatev2Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3CreateChartTemplatev2Response", ""
            ) as Reportsv3CreateChartTemplatev2Response;
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
            const body: Reportsv3CreateChartTemplatev2Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3CreateChartTemplatev2Response", ""
            ) as Reportsv3CreateChartTemplatev2Response;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to reportsServiceCreateChartv2
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async reportsServiceCreateChartv2WithHttpInfo(response: ResponseContext): Promise<HttpInfo<Reportsv3CreateChartv2Response >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Reportsv3CreateChartv2Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3CreateChartv2Response", ""
            ) as Reportsv3CreateChartv2Response;
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
            const body: Reportsv3CreateChartv2Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3CreateChartv2Response", ""
            ) as Reportsv3CreateChartv2Response;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to reportsServiceCreateFieldsByCategory
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async reportsServiceCreateFieldsByCategoryWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Reportsv3CreateFieldsByCategoryResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Reportsv3CreateFieldsByCategoryResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3CreateFieldsByCategoryResponse", ""
            ) as Reportsv3CreateFieldsByCategoryResponse;
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
            const body: Reportsv3CreateFieldsByCategoryResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3CreateFieldsByCategoryResponse", ""
            ) as Reportsv3CreateFieldsByCategoryResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to reportsServiceCreateJoin
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async reportsServiceCreateJoinWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Reportsv3CreateJoinResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Reportsv3CreateJoinResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3CreateJoinResponse", ""
            ) as Reportsv3CreateJoinResponse;
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
            const body: Reportsv3CreateJoinResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3CreateJoinResponse", ""
            ) as Reportsv3CreateJoinResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to reportsServiceCreateReport
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async reportsServiceCreateReportWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Reportsv3CreateReportResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Reportsv3CreateReportResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3CreateReportResponse", ""
            ) as Reportsv3CreateReportResponse;
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
            const body: Reportsv3CreateReportResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3CreateReportResponse", ""
            ) as Reportsv3CreateReportResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to reportsServiceCreateVariant
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async reportsServiceCreateVariantWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Reportsv3CreateVariantResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Reportsv3CreateVariantResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3CreateVariantResponse", ""
            ) as Reportsv3CreateVariantResponse;
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
            const body: Reportsv3CreateVariantResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3CreateVariantResponse", ""
            ) as Reportsv3CreateVariantResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to reportsServiceDeleteCategory
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async reportsServiceDeleteCategoryWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Reportsv3DeleteCategoryResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Reportsv3DeleteCategoryResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3DeleteCategoryResponse", ""
            ) as Reportsv3DeleteCategoryResponse;
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
            const body: Reportsv3DeleteCategoryResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3DeleteCategoryResponse", ""
            ) as Reportsv3DeleteCategoryResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to reportsServiceDeleteChart
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async reportsServiceDeleteChartWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Reportsv3DeleteChartResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Reportsv3DeleteChartResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3DeleteChartResponse", ""
            ) as Reportsv3DeleteChartResponse;
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
            const body: Reportsv3DeleteChartResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3DeleteChartResponse", ""
            ) as Reportsv3DeleteChartResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to reportsServiceDeleteChartTemplatev2
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async reportsServiceDeleteChartTemplatev2WithHttpInfo(response: ResponseContext): Promise<HttpInfo<Reportsv3DeleteChartTemplatev2Response >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Reportsv3DeleteChartTemplatev2Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3DeleteChartTemplatev2Response", ""
            ) as Reportsv3DeleteChartTemplatev2Response;
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
            const body: Reportsv3DeleteChartTemplatev2Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3DeleteChartTemplatev2Response", ""
            ) as Reportsv3DeleteChartTemplatev2Response;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to reportsServiceDeleteChartv2
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async reportsServiceDeleteChartv2WithHttpInfo(response: ResponseContext): Promise<HttpInfo<Reportsv3DeleteChartv2Response >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Reportsv3DeleteChartv2Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3DeleteChartv2Response", ""
            ) as Reportsv3DeleteChartv2Response;
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
            const body: Reportsv3DeleteChartv2Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3DeleteChartv2Response", ""
            ) as Reportsv3DeleteChartv2Response;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to reportsServiceDeleteFieldsByCategory
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async reportsServiceDeleteFieldsByCategoryWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Reportsv3DeleteFieldsByCategoryResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Reportsv3DeleteFieldsByCategoryResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3DeleteFieldsByCategoryResponse", ""
            ) as Reportsv3DeleteFieldsByCategoryResponse;
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
            const body: Reportsv3DeleteFieldsByCategoryResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3DeleteFieldsByCategoryResponse", ""
            ) as Reportsv3DeleteFieldsByCategoryResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to reportsServiceDeleteJoin
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async reportsServiceDeleteJoinWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Reportsv3DeleteJoinResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Reportsv3DeleteJoinResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3DeleteJoinResponse", ""
            ) as Reportsv3DeleteJoinResponse;
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
            const body: Reportsv3DeleteJoinResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3DeleteJoinResponse", ""
            ) as Reportsv3DeleteJoinResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to reportsServiceDeleteReport
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async reportsServiceDeleteReportWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Reportsv3DeleteReportResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Reportsv3DeleteReportResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3DeleteReportResponse", ""
            ) as Reportsv3DeleteReportResponse;
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
            const body: Reportsv3DeleteReportResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3DeleteReportResponse", ""
            ) as Reportsv3DeleteReportResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to reportsServiceDeleteVariant
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async reportsServiceDeleteVariantWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Reportsv3DeleteVariantResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Reportsv3DeleteVariantResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3DeleteVariantResponse", ""
            ) as Reportsv3DeleteVariantResponse;
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
            const body: Reportsv3DeleteVariantResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3DeleteVariantResponse", ""
            ) as Reportsv3DeleteVariantResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to reportsServiceGetCategories
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async reportsServiceGetCategoriesWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Reportsv3GetCategoriesResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Reportsv3GetCategoriesResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3GetCategoriesResponse", ""
            ) as Reportsv3GetCategoriesResponse;
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
            const body: Reportsv3GetCategoriesResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3GetCategoriesResponse", ""
            ) as Reportsv3GetCategoriesResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to reportsServiceGetChartSettings
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async reportsServiceGetChartSettingsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Reportsv3GetChartSettingsResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Reportsv3GetChartSettingsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3GetChartSettingsResponse", ""
            ) as Reportsv3GetChartSettingsResponse;
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
            const body: Reportsv3GetChartSettingsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3GetChartSettingsResponse", ""
            ) as Reportsv3GetChartSettingsResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to reportsServiceGetChartSettingsv2
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async reportsServiceGetChartSettingsv2WithHttpInfo(response: ResponseContext): Promise<HttpInfo<Reportsv3GetChartSettingsv2Response >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Reportsv3GetChartSettingsv2Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3GetChartSettingsv2Response", ""
            ) as Reportsv3GetChartSettingsv2Response;
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
            const body: Reportsv3GetChartSettingsv2Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3GetChartSettingsv2Response", ""
            ) as Reportsv3GetChartSettingsv2Response;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to reportsServiceGetChartTemplatesv2
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async reportsServiceGetChartTemplatesv2WithHttpInfo(response: ResponseContext): Promise<HttpInfo<Reportsv3GetChartTemplatesv2Response >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Reportsv3GetChartTemplatesv2Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3GetChartTemplatesv2Response", ""
            ) as Reportsv3GetChartTemplatesv2Response;
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
            const body: Reportsv3GetChartTemplatesv2Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3GetChartTemplatesv2Response", ""
            ) as Reportsv3GetChartTemplatesv2Response;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to reportsServiceGetFieldsByCategories
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async reportsServiceGetFieldsByCategoriesWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Reportsv3GetFieldsByCategoriesResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Reportsv3GetFieldsByCategoriesResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3GetFieldsByCategoriesResponse", ""
            ) as Reportsv3GetFieldsByCategoriesResponse;
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
            const body: Reportsv3GetFieldsByCategoriesResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3GetFieldsByCategoriesResponse", ""
            ) as Reportsv3GetFieldsByCategoriesResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to reportsServiceGetFieldsByCategory
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async reportsServiceGetFieldsByCategoryWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Reportsv3GetFieldsByCategoryResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Reportsv3GetFieldsByCategoryResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3GetFieldsByCategoryResponse", ""
            ) as Reportsv3GetFieldsByCategoryResponse;
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
            const body: Reportsv3GetFieldsByCategoryResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3GetFieldsByCategoryResponse", ""
            ) as Reportsv3GetFieldsByCategoryResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to reportsServiceGetJoins
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async reportsServiceGetJoinsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Reportsv3GetJoinsResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Reportsv3GetJoinsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3GetJoinsResponse", ""
            ) as Reportsv3GetJoinsResponse;
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
            const body: Reportsv3GetJoinsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3GetJoinsResponse", ""
            ) as Reportsv3GetJoinsResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to reportsServiceGetQueryByReportDefinition
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async reportsServiceGetQueryByReportDefinitionWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Reportsv3GetReportQueryResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Reportsv3GetReportQueryResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3GetReportQueryResponse", ""
            ) as Reportsv3GetReportQueryResponse;
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
            const body: Reportsv3GetReportQueryResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3GetReportQueryResponse", ""
            ) as Reportsv3GetReportQueryResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to reportsServiceGetQueryByReportID
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async reportsServiceGetQueryByReportIDWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Reportsv3GetReportQueryResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Reportsv3GetReportQueryResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3GetReportQueryResponse", ""
            ) as Reportsv3GetReportQueryResponse;
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
            const body: Reportsv3GetReportQueryResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3GetReportQueryResponse", ""
            ) as Reportsv3GetReportQueryResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to reportsServiceGetReportDefinition
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async reportsServiceGetReportDefinitionWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Reportsv3GetReportDefinitionResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Reportsv3GetReportDefinitionResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3GetReportDefinitionResponse", ""
            ) as Reportsv3GetReportDefinitionResponse;
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
            const body: Reportsv3GetReportDefinitionResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3GetReportDefinitionResponse", ""
            ) as Reportsv3GetReportDefinitionResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to reportsServiceGetReportGroups
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async reportsServiceGetReportGroupsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Reportsv3GetReportGroupsResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Reportsv3GetReportGroupsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3GetReportGroupsResponse", ""
            ) as Reportsv3GetReportGroupsResponse;
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
            const body: Reportsv3GetReportGroupsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3GetReportGroupsResponse", ""
            ) as Reportsv3GetReportGroupsResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to reportsServiceGetReportSynopsis
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async reportsServiceGetReportSynopsisWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Reportsv3GetReportSynopsisResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Reportsv3GetReportSynopsisResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3GetReportSynopsisResponse", ""
            ) as Reportsv3GetReportSynopsisResponse;
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
            const body: Reportsv3GetReportSynopsisResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3GetReportSynopsisResponse", ""
            ) as Reportsv3GetReportSynopsisResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to reportsServiceGetReportTimestampHeader
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async reportsServiceGetReportTimestampHeaderWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Reportsv3GetReportTimestampHeaderResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Reportsv3GetReportTimestampHeaderResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3GetReportTimestampHeaderResponse", ""
            ) as Reportsv3GetReportTimestampHeaderResponse;
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
            const body: Reportsv3GetReportTimestampHeaderResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3GetReportTimestampHeaderResponse", ""
            ) as Reportsv3GetReportTimestampHeaderResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to reportsServiceGetReports
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async reportsServiceGetReportsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Reportsv3GetReportsResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Reportsv3GetReportsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3GetReportsResponse", ""
            ) as Reportsv3GetReportsResponse;
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
            const body: Reportsv3GetReportsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3GetReportsResponse", ""
            ) as Reportsv3GetReportsResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to reportsServiceGetReportsForJoin
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async reportsServiceGetReportsForJoinWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Reportsv3GetReportsForJoinResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Reportsv3GetReportsForJoinResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3GetReportsForJoinResponse", ""
            ) as Reportsv3GetReportsForJoinResponse;
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
            const body: Reportsv3GetReportsForJoinResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3GetReportsForJoinResponse", ""
            ) as Reportsv3GetReportsForJoinResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to reportsServiceGetReportsTags
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async reportsServiceGetReportsTagsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Reportsv3GetReportsTagsResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Reportsv3GetReportsTagsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3GetReportsTagsResponse", ""
            ) as Reportsv3GetReportsTagsResponse;
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
            const body: Reportsv3GetReportsTagsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3GetReportsTagsResponse", ""
            ) as Reportsv3GetReportsTagsResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to reportsServiceGetVariant
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async reportsServiceGetVariantWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Reportsv3GetVariantResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Reportsv3GetVariantResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3GetVariantResponse", ""
            ) as Reportsv3GetVariantResponse;
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
            const body: Reportsv3GetVariantResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3GetVariantResponse", ""
            ) as Reportsv3GetVariantResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to reportsServiceGetVariants
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async reportsServiceGetVariantsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Reportsv3GetVariantsResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Reportsv3GetVariantsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3GetVariantsResponse", ""
            ) as Reportsv3GetVariantsResponse;
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
            const body: Reportsv3GetVariantsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3GetVariantsResponse", ""
            ) as Reportsv3GetVariantsResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to reportsServicePartialChartUpdate
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async reportsServicePartialChartUpdateWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Reportsv3PartialChartUpdateResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Reportsv3PartialChartUpdateResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3PartialChartUpdateResponse", ""
            ) as Reportsv3PartialChartUpdateResponse;
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
            const body: Reportsv3PartialChartUpdateResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3PartialChartUpdateResponse", ""
            ) as Reportsv3PartialChartUpdateResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to reportsServicePartialReportUpdate
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async reportsServicePartialReportUpdateWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Reportsv3PartialReportUpdateResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Reportsv3PartialReportUpdateResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3PartialReportUpdateResponse", ""
            ) as Reportsv3PartialReportUpdateResponse;
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
            const body: Reportsv3PartialReportUpdateResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3PartialReportUpdateResponse", ""
            ) as Reportsv3PartialReportUpdateResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to reportsServiceRunVariantOperation
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async reportsServiceRunVariantOperationWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Reportsv3RunVariantOperationResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Reportsv3RunVariantOperationResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3RunVariantOperationResponse", ""
            ) as Reportsv3RunVariantOperationResponse;
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
            const body: Reportsv3RunVariantOperationResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3RunVariantOperationResponse", ""
            ) as Reportsv3RunVariantOperationResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to reportsServiceTranspose
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async reportsServiceTransposeWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Reportsv3RunReportResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Reportsv3RunReportResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3RunReportResponse", ""
            ) as Reportsv3RunReportResponse;
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
            const body: Reportsv3RunReportResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3RunReportResponse", ""
            ) as Reportsv3RunReportResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to reportsServiceUpdateChart
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async reportsServiceUpdateChartWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Reportsv3UpdateChartResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Reportsv3UpdateChartResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3UpdateChartResponse", ""
            ) as Reportsv3UpdateChartResponse;
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
            const body: Reportsv3UpdateChartResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3UpdateChartResponse", ""
            ) as Reportsv3UpdateChartResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to reportsServiceUpdateChartv2
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async reportsServiceUpdateChartv2WithHttpInfo(response: ResponseContext): Promise<HttpInfo<Reportsv3UpdateChartv2Response >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Reportsv3UpdateChartv2Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3UpdateChartv2Response", ""
            ) as Reportsv3UpdateChartv2Response;
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
            const body: Reportsv3UpdateChartv2Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3UpdateChartv2Response", ""
            ) as Reportsv3UpdateChartv2Response;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to reportsServiceUpdateJoin
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async reportsServiceUpdateJoinWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Reportsv3UpdateJoinResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Reportsv3UpdateJoinResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3UpdateJoinResponse", ""
            ) as Reportsv3UpdateJoinResponse;
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
            const body: Reportsv3UpdateJoinResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3UpdateJoinResponse", ""
            ) as Reportsv3UpdateJoinResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to reportsServiceUpdateReport
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async reportsServiceUpdateReportWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Reportsv3UpdateReportResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Reportsv3UpdateReportResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3UpdateReportResponse", ""
            ) as Reportsv3UpdateReportResponse;
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
            const body: Reportsv3UpdateReportResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3UpdateReportResponse", ""
            ) as Reportsv3UpdateReportResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to reportsServiceUpdateVariantOverride
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async reportsServiceUpdateVariantOverrideWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Reportsv3UpdateVariantOverrideResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Reportsv3UpdateVariantOverrideResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3UpdateVariantOverrideResponse", ""
            ) as Reportsv3UpdateVariantOverrideResponse;
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
            const body: Reportsv3UpdateVariantOverrideResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Reportsv3UpdateVariantOverrideResponse", ""
            ) as Reportsv3UpdateVariantOverrideResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
