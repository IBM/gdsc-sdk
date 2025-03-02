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
import com.ibm.security.guardium.Reportsv3CreateCategoryRequest;
import com.ibm.security.guardium.Reportsv3CreateCategoryResponse;
import com.ibm.security.guardium.Reportsv3CreateChartRequest;
import com.ibm.security.guardium.Reportsv3CreateChartResponse;
import com.ibm.security.guardium.Reportsv3CreateChartTemplatev2Request;
import com.ibm.security.guardium.Reportsv3CreateChartTemplatev2Response;
import com.ibm.security.guardium.Reportsv3CreateChartv2Request;
import com.ibm.security.guardium.Reportsv3CreateChartv2Response;
import com.ibm.security.guardium.Reportsv3CreateFieldsByCategoryRequest;
import com.ibm.security.guardium.Reportsv3CreateFieldsByCategoryResponse;
import com.ibm.security.guardium.Reportsv3CreateJoinRequest;
import com.ibm.security.guardium.Reportsv3CreateJoinResponse;
import com.ibm.security.guardium.Reportsv3CreateReportRequest;
import com.ibm.security.guardium.Reportsv3CreateReportResponse;
import com.ibm.security.guardium.Reportsv3CreateVariantRequest;
import com.ibm.security.guardium.Reportsv3CreateVariantResponse;
import com.ibm.security.guardium.Reportsv3DeleteCategoryResponse;
import com.ibm.security.guardium.Reportsv3DeleteChartResponse;
import com.ibm.security.guardium.Reportsv3DeleteChartTemplatev2Response;
import com.ibm.security.guardium.Reportsv3DeleteChartv2Response;
import com.ibm.security.guardium.Reportsv3DeleteFieldsByCategoryResponse;
import com.ibm.security.guardium.Reportsv3DeleteJoinResponse;
import com.ibm.security.guardium.Reportsv3DeleteReportResponse;
import com.ibm.security.guardium.Reportsv3DeleteVariantResponse;
import com.ibm.security.guardium.Reportsv3GetCategoriesResponse;
import com.ibm.security.guardium.Reportsv3GetChartSettingsResponse;
import com.ibm.security.guardium.Reportsv3GetChartSettingsv2Response;
import com.ibm.security.guardium.Reportsv3GetChartTemplatesv2Response;
import com.ibm.security.guardium.Reportsv3GetFieldsByCategoriesResponse;
import com.ibm.security.guardium.Reportsv3GetFieldsByCategoryResponse;
import com.ibm.security.guardium.Reportsv3GetJoinsResponse;
import com.ibm.security.guardium.Reportsv3GetQueryByReportDefinitionRequest;
import com.ibm.security.guardium.Reportsv3GetQueryByReportIDRequest;
import com.ibm.security.guardium.Reportsv3GetReportDefinitionResponse;
import com.ibm.security.guardium.Reportsv3GetReportGroupsResponse;
import com.ibm.security.guardium.Reportsv3GetReportQueryResponse;
import com.ibm.security.guardium.Reportsv3GetReportSynopsisResponse;
import com.ibm.security.guardium.Reportsv3GetReportTimestampHeaderResponse;
import com.ibm.security.guardium.Reportsv3GetReportsForJoinResponse;
import com.ibm.security.guardium.Reportsv3GetReportsResponse;
import com.ibm.security.guardium.Reportsv3GetReportsTagsResponse;
import com.ibm.security.guardium.Reportsv3GetVariantResponse;
import com.ibm.security.guardium.Reportsv3GetVariantsResponse;
import com.ibm.security.guardium.Reportsv3PartialChartUpdateRequest;
import com.ibm.security.guardium.Reportsv3PartialChartUpdateResponse;
import com.ibm.security.guardium.Reportsv3PartialReportUpdateRequest;
import com.ibm.security.guardium.Reportsv3PartialReportUpdateResponse;
import com.ibm.security.guardium.Reportsv3RunReportResponse;
import com.ibm.security.guardium.Reportsv3RunVariantOperationRequest;
import com.ibm.security.guardium.Reportsv3RunVariantOperationResponse;
import com.ibm.security.guardium.Reportsv3TransposeRequest;
import com.ibm.security.guardium.Reportsv3UpdateChartRequest;
import com.ibm.security.guardium.Reportsv3UpdateChartResponse;
import com.ibm.security.guardium.Reportsv3UpdateChartv2Request;
import com.ibm.security.guardium.Reportsv3UpdateChartv2Response;
import com.ibm.security.guardium.Reportsv3UpdateJoinRequest;
import com.ibm.security.guardium.Reportsv3UpdateJoinResponse;
import com.ibm.security.guardium.Reportsv3UpdateReportRequest;
import com.ibm.security.guardium.Reportsv3UpdateReportResponse;
import com.ibm.security.guardium.Reportsv3UpdateVariantOverrideRequest;
import com.ibm.security.guardium.Reportsv3UpdateVariantOverrideResponse;
import com.ibm.security.guardium.RuntimeError;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ReportsServiceApi
 */
@Disabled
public class ReportsServiceApiTest {

    private final ReportsServiceApi api = new ReportsServiceApi();

    /**
     * Summary: Create a category Description: Create a report category
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reportsServiceCreateCategoryTest() throws ApiException {
        Reportsv3CreateCategoryRequest reportsv3CreateCategoryRequest = null;
        Reportsv3CreateCategoryResponse response = api.reportsServiceCreateCategory(reportsv3CreateCategoryRequest);
        // TODO: test validations
    }

    /**
     * Summary: Create chart Description: Create custom chart based on provided properties.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reportsServiceCreateChartTest() throws ApiException {
        Reportsv3CreateChartRequest reportsv3CreateChartRequest = null;
        Reportsv3CreateChartResponse response = api.reportsServiceCreateChart(reportsv3CreateChartRequest);
        // TODO: test validations
    }

    /**
     * Summary: Create chart template v2 Description: Create custom VEGA chart template.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reportsServiceCreateChartTemplatev2Test() throws ApiException {
        Reportsv3CreateChartTemplatev2Request reportsv3CreateChartTemplatev2Request = null;
        Reportsv3CreateChartTemplatev2Response response = api.reportsServiceCreateChartTemplatev2(reportsv3CreateChartTemplatev2Request);
        // TODO: test validations
    }

    /**
     * Summary: Create chart v2 Description: Create custom VEGA chart based on provided properties.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reportsServiceCreateChartv2Test() throws ApiException {
        Reportsv3CreateChartv2Request reportsv3CreateChartv2Request = null;
        Reportsv3CreateChartv2Response response = api.reportsServiceCreateChartv2(reportsv3CreateChartv2Request);
        // TODO: test validations
    }

    /**
     * Summary - Create fields by category Description: Cteate category fields based on provided properties.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reportsServiceCreateFieldsByCategoryTest() throws ApiException {
        Reportsv3CreateFieldsByCategoryRequest reportsv3CreateFieldsByCategoryRequest = null;
        Reportsv3CreateFieldsByCategoryResponse response = api.reportsServiceCreateFieldsByCategory(reportsv3CreateFieldsByCategoryRequest);
        // TODO: test validations
    }

    /**
     * Summary: Create a join Description: Create a custom report join
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reportsServiceCreateJoinTest() throws ApiException {
        Reportsv3CreateJoinRequest reportsv3CreateJoinRequest = null;
        Reportsv3CreateJoinResponse response = api.reportsServiceCreateJoin(reportsv3CreateJoinRequest);
        // TODO: test validations
    }

    /**
     * Summary: Create report Description: Create custom report based on provided properties.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reportsServiceCreateReportTest() throws ApiException {
        Reportsv3CreateReportRequest reportsv3CreateReportRequest = null;
        Reportsv3CreateReportResponse response = api.reportsServiceCreateReport(reportsv3CreateReportRequest);
        // TODO: test validations
    }

    /**
     * Summary: Create a variant Description: Create a variant for reports
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reportsServiceCreateVariantTest() throws ApiException {
        Reportsv3CreateVariantRequest reportsv3CreateVariantRequest = null;
        Reportsv3CreateVariantResponse response = api.reportsServiceCreateVariant(reportsv3CreateVariantRequest);
        // TODO: test validations
    }

    /**
     * Summary: Delete a category Description: Delete a report category
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reportsServiceDeleteCategoryTest() throws ApiException {
        String categoryId = null;
        String tableName = null;
        Reportsv3DeleteCategoryResponse response = api.reportsServiceDeleteCategory(categoryId, tableName);
        // TODO: test validations
    }

    /**
     * Summary: Delete chart Description: Delete a custom chart.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reportsServiceDeleteChartTest() throws ApiException {
        String chartId = null;
        Reportsv3DeleteChartResponse response = api.reportsServiceDeleteChart(chartId);
        // TODO: test validations
    }

    /**
     * Summary: Delete chart template v2 Description: Delete a custom VEGA chart template.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reportsServiceDeleteChartTemplatev2Test() throws ApiException {
        String templateId = null;
        Reportsv3DeleteChartTemplatev2Response response = api.reportsServiceDeleteChartTemplatev2(templateId);
        // TODO: test validations
    }

    /**
     * Summary: Delete chart v2 Description: Delete a custom VEGA chart.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reportsServiceDeleteChartv2Test() throws ApiException {
        String chartId = null;
        Reportsv3DeleteChartv2Response response = api.reportsServiceDeleteChartv2(chartId);
        // TODO: test validations
    }

    /**
     * Summary - Delete fields by category Description: Delete category fields based on provided properties.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reportsServiceDeleteFieldsByCategoryTest() throws ApiException {
        List<String> headerIds = null;
        String tableName = null;
        Reportsv3DeleteFieldsByCategoryResponse response = api.reportsServiceDeleteFieldsByCategory(headerIds, tableName);
        // TODO: test validations
    }

    /**
     * Summary: Delete a join Description: Delete a custom join
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reportsServiceDeleteJoinTest() throws ApiException {
        String joinId = null;
        Reportsv3DeleteJoinResponse response = api.reportsServiceDeleteJoin(joinId);
        // TODO: test validations
    }

    /**
     * Summary: Delete report Description: Delete a custom report.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reportsServiceDeleteReportTest() throws ApiException {
        String reportId = null;
        Reportsv3DeleteReportResponse response = api.reportsServiceDeleteReport(reportId);
        // TODO: test validations
    }

    /**
     * Summary: Delete a variant Description: Delete a variant
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reportsServiceDeleteVariantTest() throws ApiException {
        String variantId = null;
        Reportsv3DeleteVariantResponse response = api.reportsServiceDeleteVariant(variantId);
        // TODO: test validations
    }

    /**
     * Summary:  Get all available report categories. Description: Get all category related fields or all possible fields.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reportsServiceGetCategoriesTest() throws ApiException {
        String reportId = null;
        Reportsv3GetCategoriesResponse response = api.reportsServiceGetCategories(reportId);
        // TODO: test validations
    }

    /**
     * Summary: Get chart settings Description: Get a custom chart based on provided report id.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reportsServiceGetChartSettingsTest() throws ApiException {
        String chartId = null;
        String reportId = null;
        Reportsv3GetChartSettingsResponse response = api.reportsServiceGetChartSettings(chartId, reportId);
        // TODO: test validations
    }

    /**
     * Summary: Get chart settings v2 Description: Get a custom VEGA chart based on provided report id.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reportsServiceGetChartSettingsv2Test() throws ApiException {
        String chartId = null;
        String reportId = null;
        Reportsv3GetChartSettingsv2Response response = api.reportsServiceGetChartSettingsv2(chartId, reportId);
        // TODO: test validations
    }

    /**
     * Summary: Get chart template v2 Description: Get all custom VEGA chart templates.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reportsServiceGetChartTemplatesv2Test() throws ApiException {
        Reportsv3GetChartTemplatesv2Response response = api.reportsServiceGetChartTemplatesv2();
        // TODO: test validations
    }

    /**
     * Summary: Get fields by categories Description: Get all category related fields or all possible fields based on a list of categories.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reportsServiceGetFieldsByCategoriesTest() throws ApiException {
        List<String> categoryIds = null;
        Reportsv3GetFieldsByCategoriesResponse response = api.reportsServiceGetFieldsByCategories(categoryIds);
        // TODO: test validations
    }

    /**
     * Summary: Get fields by category Description: Get all category related fields or all possible fields.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reportsServiceGetFieldsByCategoryTest() throws ApiException {
        String categoryId = null;
        String reportId = null;
        String tableName = null;
        Reportsv3GetFieldsByCategoryResponse response = api.reportsServiceGetFieldsByCategory(categoryId, reportId, tableName);
        // TODO: test validations
    }

    /**
     * Summary: Get all joins Description: Get all custom joins.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reportsServiceGetJoinsTest() throws ApiException {
        String categoryId = null;
        Reportsv3GetJoinsResponse response = api.reportsServiceGetJoins(categoryId);
        // TODO: test validations
    }

    /**
     * Summary: Get query by report definition Description: Get query by report definition.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reportsServiceGetQueryByReportDefinitionTest() throws ApiException {
        Reportsv3GetQueryByReportDefinitionRequest reportsv3GetQueryByReportDefinitionRequest = null;
        Reportsv3GetReportQueryResponse response = api.reportsServiceGetQueryByReportDefinition(reportsv3GetQueryByReportDefinitionRequest);
        // TODO: test validations
    }

    /**
     * Summary: Get query by report ID Description: Get query by report ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reportsServiceGetQueryByReportIDTest() throws ApiException {
        Reportsv3GetQueryByReportIDRequest reportsv3GetQueryByReportIDRequest = null;
        Reportsv3GetReportQueryResponse response = api.reportsServiceGetQueryByReportID(reportsv3GetQueryByReportIDRequest);
        // TODO: test validations
    }

    /**
     * Summary: Get report definition Description: Get report definition.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reportsServiceGetReportDefinitionTest() throws ApiException {
        String reportId = null;
        Reportsv3GetReportDefinitionResponse response = api.reportsServiceGetReportDefinition(reportId);
        // TODO: test validations
    }

    /**
     * Summary: Get report groups Description: Get reports used by the provided groups.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reportsServiceGetReportGroupsTest() throws ApiException {
        List<String> groups = null;
        Reportsv3GetReportGroupsResponse response = api.reportsServiceGetReportGroups(groups);
        // TODO: test validations
    }

    /**
     * Summary: Get report synopsis Description: Return BriefReport.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reportsServiceGetReportSynopsisTest() throws ApiException {
        String reportId = null;
        Reportsv3GetReportSynopsisResponse response = api.reportsServiceGetReportSynopsis(reportId);
        // TODO: test validations
    }

    /**
     * Summary: Get report timestamp header Description: Get where to take a report timestamp given an entity.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reportsServiceGetReportTimestampHeaderTest() throws ApiException {
        String categoryId = null;
        List<String> tableNames = null;
        Reportsv3GetReportTimestampHeaderResponse response = api.reportsServiceGetReportTimestampHeader(categoryId, tableNames);
        // TODO: test validations
    }

    /**
     * Summary: Get reports Description: Get reports list.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reportsServiceGetReportsTest() throws ApiException {
        String categoryId = null;
        String tableName = null;
        Reportsv3GetReportsResponse response = api.reportsServiceGetReports(categoryId, tableName);
        // TODO: test validations
    }

    /**
     * Summary: Get the reports that use a join Description: Get the reports that use a join and the headers that are imported by the reports using the join
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reportsServiceGetReportsForJoinTest() throws ApiException {
        String joinId = null;
        Reportsv3GetReportsForJoinResponse response = api.reportsServiceGetReportsForJoin(joinId);
        // TODO: test validations
    }

    /**
     * Summary: Get reports tags Description: Get all report distinct tags.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reportsServiceGetReportsTagsTest() throws ApiException {
        Reportsv3GetReportsTagsResponse response = api.reportsServiceGetReportsTags();
        // TODO: test validations
    }

    /**
     * Summary: Get a variant Description: Get a given variant
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reportsServiceGetVariantTest() throws ApiException {
        String variantId = null;
        Reportsv3GetVariantResponse response = api.reportsServiceGetVariant(variantId);
        // TODO: test validations
    }

    /**
     * Summary: Get all variants Description: Get all variants in reports
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reportsServiceGetVariantsTest() throws ApiException {
        Reportsv3GetVariantsResponse response = api.reportsServiceGetVariants();
        // TODO: test validations
    }

    /**
     * Summary: Partial chart update Description: Update a custom chart with partial information.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reportsServicePartialChartUpdateTest() throws ApiException {
        String chartId = null;
        Reportsv3PartialChartUpdateRequest reportsv3PartialChartUpdateRequest = null;
        Reportsv3PartialChartUpdateResponse response = api.reportsServicePartialChartUpdate(chartId, reportsv3PartialChartUpdateRequest);
        // TODO: test validations
    }

    /**
     * Summary: Partial report update Description: Update a custom report with partial information.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reportsServicePartialReportUpdateTest() throws ApiException {
        String reportId = null;
        Reportsv3PartialReportUpdateRequest reportsv3PartialReportUpdateRequest = null;
        Reportsv3PartialReportUpdateResponse response = api.reportsServicePartialReportUpdate(reportId, reportsv3PartialReportUpdateRequest);
        // TODO: test validations
    }

    /**
     * Summary: Run a variant Description: Run the operations in a variant
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reportsServiceRunVariantOperationTest() throws ApiException {
        Reportsv3RunVariantOperationRequest reportsv3RunVariantOperationRequest = null;
        Reportsv3RunVariantOperationResponse response = api.reportsServiceRunVariantOperation(reportsv3RunVariantOperationRequest);
        // TODO: test validations
    }

    /**
     * Summary: Transpose Description: Return the corresponding full sql data.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reportsServiceTransposeTest() throws ApiException {
        Reportsv3TransposeRequest reportsv3TransposeRequest = null;
        Reportsv3RunReportResponse response = api.reportsServiceTranspose(reportsv3TransposeRequest);
        // TODO: test validations
    }

    /**
     * Summary: Update chart Description: Update a custom chart.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reportsServiceUpdateChartTest() throws ApiException {
        String chartId = null;
        Reportsv3UpdateChartRequest reportsv3UpdateChartRequest = null;
        Reportsv3UpdateChartResponse response = api.reportsServiceUpdateChart(chartId, reportsv3UpdateChartRequest);
        // TODO: test validations
    }

    /**
     * Summary: Update chart v2 Description: Update a custom VEGA chart.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reportsServiceUpdateChartv2Test() throws ApiException {
        String chartId = null;
        Reportsv3UpdateChartv2Request reportsv3UpdateChartv2Request = null;
        Reportsv3UpdateChartv2Response response = api.reportsServiceUpdateChartv2(chartId, reportsv3UpdateChartv2Request);
        // TODO: test validations
    }

    /**
     * Summary: Update a join Description: Update a custom join
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reportsServiceUpdateJoinTest() throws ApiException {
        String joinId = null;
        Reportsv3UpdateJoinRequest reportsv3UpdateJoinRequest = null;
        Reportsv3UpdateJoinResponse response = api.reportsServiceUpdateJoin(joinId, reportsv3UpdateJoinRequest);
        // TODO: test validations
    }

    /**
     * Summary: Update report Description: Update a custom report.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reportsServiceUpdateReportTest() throws ApiException {
        String reportId = null;
        Reportsv3UpdateReportRequest reportsv3UpdateReportRequest = null;
        Reportsv3UpdateReportResponse response = api.reportsServiceUpdateReport(reportId, reportsv3UpdateReportRequest);
        // TODO: test validations
    }

    /**
     * Summary: Update a variant Description: Update a variant with a custom override
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reportsServiceUpdateVariantOverrideTest() throws ApiException {
        String variantId = null;
        Reportsv3UpdateVariantOverrideRequest reportsv3UpdateVariantOverrideRequest = null;
        Reportsv3UpdateVariantOverrideResponse response = api.reportsServiceUpdateVariantOverride(variantId, reportsv3UpdateVariantOverrideRequest);
        // TODO: test validations
    }

}
