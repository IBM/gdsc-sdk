# {{classname}}

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**RiskAnalyticsControllerEnableDisableRiskEventFeedback**](RiskAnalyticsControllerApi.md#RiskAnalyticsControllerEnableDisableRiskEventFeedback) | **Put** /api/v3/risk_feedback/status | Summary: Enable disable risk rvent feedback Description: Enable or disable the collect feedback process.
[**RiskAnalyticsControllerEnableDisableRiskEventProcess**](RiskAnalyticsControllerApi.md#RiskAnalyticsControllerEnableDisableRiskEventProcess) | **Put** /api/v3/risk_process/status | Summary: Enable disable risk event process Description: Enable or disable the risk event process.
[**RiskAnalyticsControllerGetAllClassificationsList**](RiskAnalyticsControllerApi.md#RiskAnalyticsControllerGetAllClassificationsList) | **Get** /api/v3/risk_events/classifications | Summary: Get all classifications Description: Get all possible classifications for a risk event.
[**RiskAnalyticsControllerGetRiskEventClassificationsList**](RiskAnalyticsControllerApi.md#RiskAnalyticsControllerGetRiskEventClassificationsList) | **Get** /api/v3/risk_events/feedback/{risk_id} | Summary: Get risk event classifications list Description: retrieves the ClassificationMatchDetails for a given risk id – classification that did not matched will be with class_value 0.
[**RiskAnalyticsControllerGetRiskEventDataForSummarization**](RiskAnalyticsControllerApi.md#RiskAnalyticsControllerGetRiskEventDataForSummarization) | **Get** /api/v3/risk_events/summarization/data/{risk_id} | Summary: Get risk event data needed for summarization task Description: Retrieve the full information about this risk event including all findings data
[**RiskAnalyticsControllerGetRiskEventDetails**](RiskAnalyticsControllerApi.md#RiskAnalyticsControllerGetRiskEventDetails) | **Get** /api/v3/risk_events/details/{risk_id} | Summary: Get risk event details Description: Return the details of a risk event, including risk general info and a list of observations.
[**RiskAnalyticsControllerGetRiskEventProcessStatus**](RiskAnalyticsControllerApi.md#RiskAnalyticsControllerGetRiskEventProcessStatus) | **Get** /api/v3/risk_process/status | Summary: Get risk event process status Description: Get the risk event process status.
[**RiskAnalyticsControllerGetRiskEventRow**](RiskAnalyticsControllerApi.md#RiskAnalyticsControllerGetRiskEventRow) | **Get** /api/v3/risk_events | Summary: Get risk event row Description: Return a list of risk events.
[**RiskAnalyticsControllerGetRiskEventVulnerabilityAssessmentDetails**](RiskAnalyticsControllerApi.md#RiskAnalyticsControllerGetRiskEventVulnerabilityAssessmentDetails) | **Put** /api/v3/risk_events/va/{risk_id} | Summary: Get vulnerability assessment details for a given risk event Description: Retrieve the information about failed VA tests for assets database and db user
[**RiskAnalyticsControllerGetRiskFeedback**](RiskAnalyticsControllerApi.md#RiskAnalyticsControllerGetRiskFeedback) | **Get** /api/v3/risk_events/feedback | Summary: Get risk feedback Description: Get all feedbacks that are in status NEW/WIP and change them to status WIP.
[**RiskAnalyticsControllerGetRiskObservationDetails**](RiskAnalyticsControllerApi.md#RiskAnalyticsControllerGetRiskObservationDetails) | **Get** /api/v3/risk_events/observations | Summary: Get risk observation details Description: Return details of a single risk observation.
[**RiskAnalyticsControllerGetUserUISettings**](RiskAnalyticsControllerApi.md#RiskAnalyticsControllerGetUserUISettings) | **Get** /api/v3/risk_events/user_ui_settings | Summary: Get user UI settings Description: Get the user settings by user id to display the risk in the UI.
[**RiskAnalyticsControllerRiskEventTuning**](RiskAnalyticsControllerApi.md#RiskAnalyticsControllerRiskEventTuning) | **Put** /api/v3/risk_events/tuning | Summary: Risk event tuning Description: Perform tuning risk event actions.
[**RiskAnalyticsControllerSetRiskEventStatus**](RiskAnalyticsControllerApi.md#RiskAnalyticsControllerSetRiskEventStatus) | **Put** /api/v3/risk_events/status | Summary: Set risk event status Description: Update the risk status and justification.
[**RiskAnalyticsControllerSetUserUISettings**](RiskAnalyticsControllerApi.md#RiskAnalyticsControllerSetUserUISettings) | **Put** /api/v3/risk_events/user_ui_settings | Summary: Set user UI settings Description: Set the user settings by user id in the mongo collection. WARNING: this API should not be used manually or by a system external to Guardium Insights. Using this API to change a user settings may prevent the user from using the Risk Event function within Guardium Insights.
[**RiskAnalyticsControllerUpdateRiskFeedback**](RiskAnalyticsControllerApi.md#RiskAnalyticsControllerUpdateRiskFeedback) | **Put** /api/v3/risk_events/feedback | Summary: Update risk feedback Description: Provide feedback for one or more risk events

# **RiskAnalyticsControllerEnableDisableRiskEventFeedback**
> Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackResponse RiskAnalyticsControllerEnableDisableRiskEventFeedback(ctx, body)
Summary: Enable disable risk rvent feedback Description: Enable or disable the collect feedback process.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest**](Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest.md)|  | 

### Return type

[**Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackResponse**](riskanalyticscontrollerv3EnableDisableRiskEventFeedbackResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **RiskAnalyticsControllerEnableDisableRiskEventProcess**
> Riskanalyticscontrollerv3EnableDisableRiskEventProcessResponse RiskAnalyticsControllerEnableDisableRiskEventProcess(ctx, body)
Summary: Enable disable risk event process Description: Enable or disable the risk event process.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest**](Riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest.md)|  | 

### Return type

[**Riskanalyticscontrollerv3EnableDisableRiskEventProcessResponse**](riskanalyticscontrollerv3EnableDisableRiskEventProcessResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **RiskAnalyticsControllerGetAllClassificationsList**
> Riskanalyticscontrollerv3GetAllClassificationsListResponse RiskAnalyticsControllerGetAllClassificationsList(ctx, )
Summary: Get all classifications Description: Get all possible classifications for a risk event.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**Riskanalyticscontrollerv3GetAllClassificationsListResponse**](riskanalyticscontrollerv3GetAllClassificationsListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **RiskAnalyticsControllerGetRiskEventClassificationsList**
> Riskanalyticscontrollerv3GetRiskEventClassificationsListResponse RiskAnalyticsControllerGetRiskEventClassificationsList(ctx, riskId)
Summary: Get risk event classifications list Description: retrieves the ClassificationMatchDetails for a given risk id – classification that did not matched will be with class_value 0.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **riskId** | **int32**| Risk id | 

### Return type

[**Riskanalyticscontrollerv3GetRiskEventClassificationsListResponse**](riskanalyticscontrollerv3GetRiskEventClassificationsListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **RiskAnalyticsControllerGetRiskEventDataForSummarization**
> Riskanalyticscontrollerv3RiskEventSummarizationDataResponse RiskAnalyticsControllerGetRiskEventDataForSummarization(ctx, riskId, optional)
Summary: Get risk event data needed for summarization task Description: Retrieve the full information about this risk event including all findings data

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **riskId** | **int32**| Risk ID | 
 **optional** | ***RiskAnalyticsControllerApiRiskAnalyticsControllerGetRiskEventDataForSummarizationOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a RiskAnalyticsControllerApiRiskAnalyticsControllerGetRiskEventDataForSummarizationOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **includeIndicators** | **optional.Bool**| Indicates whether to include indicators in the response or not. | 
 **numFindingsLimit** | **optional.Int32**| Max number of hours to get for the risk. | 

### Return type

[**Riskanalyticscontrollerv3RiskEventSummarizationDataResponse**](riskanalyticscontrollerv3RiskEventSummarizationDataResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **RiskAnalyticsControllerGetRiskEventDetails**
> Riskanalyticscontrollerv3GetRiskEventDetailsResponse RiskAnalyticsControllerGetRiskEventDetails(ctx, riskId)
Summary: Get risk event details Description: Return the details of a risk event, including risk general info and a list of observations.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **riskId** | **int32**| Risk id. | 

### Return type

[**Riskanalyticscontrollerv3GetRiskEventDetailsResponse**](riskanalyticscontrollerv3GetRiskEventDetailsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **RiskAnalyticsControllerGetRiskEventProcessStatus**
> Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse RiskAnalyticsControllerGetRiskEventProcessStatus(ctx, )
Summary: Get risk event process status Description: Get the risk event process status.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse**](riskanalyticscontrollerv3GetRiskEventProcessStatusResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **RiskAnalyticsControllerGetRiskEventRow**
> Riskanalyticscontrollerv3GetRiskEventRowResponse RiskAnalyticsControllerGetRiskEventRow(ctx, optional)
Summary: Get risk event row Description: Return a list of risk events.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***RiskAnalyticsControllerApiRiskAnalyticsControllerGetRiskEventRowOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a RiskAnalyticsControllerApiRiskAnalyticsControllerGetRiskEventRowOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | **optional.String**| Status to retrieve only the status events, blank to retrieve all. | [default to UNDEFINED_STATUS]
 **dateFrom** | **optional.Time**| The API retrieves risk events that were open in a time range. date_from defines the start of this time range. format YYYY-MM-DDTHH:mm:ssZ. | 
 **dateTo** | **optional.Time**| The API retrieves risk events that were open in a time range. date_to defines the end of this time range. format YYYY-MM-DDTHH:mm:ssZ. | 
 **pivotType** | **optional.String**| Pivot type - enum. | [default to UNDEFINED_PIVOT_TYPE]
 **pivotId** | **optional.String**| Pivot id -  all pivot fields separated by semicolon. | 
 **pivotDbUser** | **optional.String**| Optional db_user - if pivot is db user. | 
 **pivotDatabase** | **optional.String**| Optional database - if pivot is db user / database. | 
 **pivotServerIp** | **optional.String**| Optional server_ip - if pivot is db user / database. | 
 **pivotOsUser** | **optional.String**| Optional os_user - if pivot is os user. | 
 **pivotDatabaseSourceField** | **optional.String**| Optional database_source_field (values database name/service name depends on the server type) - if pivot is db user / database. | [default to UNDEFINED]

### Return type

[**Riskanalyticscontrollerv3GetRiskEventRowResponse**](riskanalyticscontrollerv3GetRiskEventRowResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **RiskAnalyticsControllerGetRiskEventVulnerabilityAssessmentDetails**
> Riskanalyticscontrollerv3RiskEventVulnerabilityAssessmentDetailsResponse RiskAnalyticsControllerGetRiskEventVulnerabilityAssessmentDetails(ctx, riskId)
Summary: Get vulnerability assessment details for a given risk event Description: Retrieve the information about failed VA tests for assets database and db user

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **riskId** | **int32**| Risk ID | 

### Return type

[**Riskanalyticscontrollerv3RiskEventVulnerabilityAssessmentDetailsResponse**](riskanalyticscontrollerv3RiskEventVulnerabilityAssessmentDetailsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **RiskAnalyticsControllerGetRiskFeedback**
> Riskanalyticscontrollerv3GetRiskFeedbackResponse RiskAnalyticsControllerGetRiskFeedback(ctx, )
Summary: Get risk feedback Description: Get all feedbacks that are in status NEW/WIP and change them to status WIP.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**Riskanalyticscontrollerv3GetRiskFeedbackResponse**](riskanalyticscontrollerv3GetRiskFeedbackResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **RiskAnalyticsControllerGetRiskObservationDetails**
> Riskanalyticscontrollerv3GetRiskObservationDetailsResponse RiskAnalyticsControllerGetRiskObservationDetails(ctx, optional)
Summary: Get risk observation details Description: Return details of a single risk observation.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***RiskAnalyticsControllerApiRiskAnalyticsControllerGetRiskObservationDetailsOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a RiskAnalyticsControllerApiRiskAnalyticsControllerGetRiskObservationDetailsOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **leadFeatureId** | **optional.Int32**| Lead feature id. | 
 **observationType** | **optional.String**| Observation type. | [default to UNDEFINED_OBSERVATION_TYPE]

### Return type

[**Riskanalyticscontrollerv3GetRiskObservationDetailsResponse**](riskanalyticscontrollerv3GetRiskObservationDetailsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **RiskAnalyticsControllerGetUserUISettings**
> Riskanalyticscontrollerv3GetUserUiSettingsResponse RiskAnalyticsControllerGetUserUISettings(ctx, )
Summary: Get user UI settings Description: Get the user settings by user id to display the risk in the UI.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**Riskanalyticscontrollerv3GetUserUiSettingsResponse**](riskanalyticscontrollerv3GetUserUISettingsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **RiskAnalyticsControllerRiskEventTuning**
> Riskanalyticscontrollerv3RiskEventTuningResponse RiskAnalyticsControllerRiskEventTuning(ctx, body)
Summary: Risk event tuning Description: Perform tuning risk event actions.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Riskanalyticscontrollerv3RiskEventTuningRequest**](Riskanalyticscontrollerv3RiskEventTuningRequest.md)|  | 

### Return type

[**Riskanalyticscontrollerv3RiskEventTuningResponse**](riskanalyticscontrollerv3RiskEventTuningResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **RiskAnalyticsControllerSetRiskEventStatus**
> Riskanalyticscontrollerv3SetRiskEventStatusResponse RiskAnalyticsControllerSetRiskEventStatus(ctx, body)
Summary: Set risk event status Description: Update the risk status and justification.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Riskanalyticscontrollerv3SetRiskEventStatusRequest**](Riskanalyticscontrollerv3SetRiskEventStatusRequest.md)|  | 

### Return type

[**Riskanalyticscontrollerv3SetRiskEventStatusResponse**](riskanalyticscontrollerv3SetRiskEventStatusResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **RiskAnalyticsControllerSetUserUISettings**
> Riskanalyticscontrollerv3SetUserUiSettingsResponse RiskAnalyticsControllerSetUserUISettings(ctx, body)
Summary: Set user UI settings Description: Set the user settings by user id in the mongo collection. WARNING: this API should not be used manually or by a system external to Guardium Insights. Using this API to change a user settings may prevent the user from using the Risk Event function within Guardium Insights.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Riskanalyticscontrollerv3SetUserUiSettingsRequest**](Riskanalyticscontrollerv3SetUserUiSettingsRequest.md)|  | 

### Return type

[**Riskanalyticscontrollerv3SetUserUiSettingsResponse**](riskanalyticscontrollerv3SetUserUISettingsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **RiskAnalyticsControllerUpdateRiskFeedback**
> Riskanalyticscontrollerv3UpdateRiskFeedbackResponse RiskAnalyticsControllerUpdateRiskFeedback(ctx, body)
Summary: Update risk feedback Description: Provide feedback for one or more risk events

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Riskanalyticscontrollerv3UpdateRiskFeedbackRequest**](Riskanalyticscontrollerv3UpdateRiskFeedbackRequest.md)|  | 

### Return type

[**Riskanalyticscontrollerv3UpdateRiskFeedbackResponse**](riskanalyticscontrollerv3UpdateRiskFeedbackResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

