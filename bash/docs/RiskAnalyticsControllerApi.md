# RiskAnalyticsControllerApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**riskAnalyticsControllerEnableDisableRiskEventFeedback**](RiskAnalyticsControllerApi.md#riskAnalyticsControllerEnableDisableRiskEventFeedback) | **PUT** /api/v3/risk_feedback/status | Summary: Enable disable risk rvent feedback
Description: Enable or disable the collect feedback process.
[**riskAnalyticsControllerEnableDisableRiskEventProcess**](RiskAnalyticsControllerApi.md#riskAnalyticsControllerEnableDisableRiskEventProcess) | **PUT** /api/v3/risk_process/status | Summary: Enable disable risk event process
Description: Enable or disable the risk event process.
[**riskAnalyticsControllerGetAllClassificationsList**](RiskAnalyticsControllerApi.md#riskAnalyticsControllerGetAllClassificationsList) | **GET** /api/v3/risk_events/classifications | Summary: Get all classifications
Description: Get all possible classifications for a risk event.
[**riskAnalyticsControllerGetRiskEventClassificationsList**](RiskAnalyticsControllerApi.md#riskAnalyticsControllerGetRiskEventClassificationsList) | **GET** /api/v3/risk_events/feedback/{risk_id} | Summary: Get risk event classifications list
Description: retrieves the ClassificationMatchDetails for a given risk id – classification that did not matched will be with class_value 0.
[**riskAnalyticsControllerGetRiskEventDataForSummarization**](RiskAnalyticsControllerApi.md#riskAnalyticsControllerGetRiskEventDataForSummarization) | **GET** /api/v3/risk_events/summarization/data/{risk_id} | Summary: Get risk event data needed for summarization task
Description: Retrieve the full information about this risk event including all findings data
[**riskAnalyticsControllerGetRiskEventDetails**](RiskAnalyticsControllerApi.md#riskAnalyticsControllerGetRiskEventDetails) | **GET** /api/v3/risk_events/details/{risk_id} | Summary: Get risk event details
Description: Return the details of a risk event, including risk general info and a list of observations.
[**riskAnalyticsControllerGetRiskEventProcessStatus**](RiskAnalyticsControllerApi.md#riskAnalyticsControllerGetRiskEventProcessStatus) | **GET** /api/v3/risk_process/status | Summary: Get risk event process status
Description: Get the risk event process status.
[**riskAnalyticsControllerGetRiskEventRow**](RiskAnalyticsControllerApi.md#riskAnalyticsControllerGetRiskEventRow) | **GET** /api/v3/risk_events | Summary: Get risk event row
Description: Return a list of risk events.
[**riskAnalyticsControllerGetRiskEventVulnerabilityAssessmentDetails**](RiskAnalyticsControllerApi.md#riskAnalyticsControllerGetRiskEventVulnerabilityAssessmentDetails) | **PUT** /api/v3/risk_events/va/{risk_id} | Summary: Get vulnerability assessment details for a given risk event
Description: Retrieve the information about failed VA tests for assets database and db user
[**riskAnalyticsControllerGetRiskFeedback**](RiskAnalyticsControllerApi.md#riskAnalyticsControllerGetRiskFeedback) | **GET** /api/v3/risk_events/feedback | Summary: Get risk feedback
Description: Get all feedbacks that are in status NEW/WIP and change them to status WIP.
[**riskAnalyticsControllerGetRiskObservationDetails**](RiskAnalyticsControllerApi.md#riskAnalyticsControllerGetRiskObservationDetails) | **GET** /api/v3/risk_events/observations | Summary: Get risk observation details
Description: Return details of a single risk observation.
[**riskAnalyticsControllerGetUserUISettings**](RiskAnalyticsControllerApi.md#riskAnalyticsControllerGetUserUISettings) | **GET** /api/v3/risk_events/user_ui_settings | Summary: Get user UI settings
Description: Get the user settings by user id to display the risk in the UI.
[**riskAnalyticsControllerRiskEventTuning**](RiskAnalyticsControllerApi.md#riskAnalyticsControllerRiskEventTuning) | **PUT** /api/v3/risk_events/tuning | Summary: Risk event tuning
Description: Perform tuning risk event actions.
[**riskAnalyticsControllerSetRiskEventStatus**](RiskAnalyticsControllerApi.md#riskAnalyticsControllerSetRiskEventStatus) | **PUT** /api/v3/risk_events/status | Summary: Set risk event status
Description: Update the risk status and justification.
[**riskAnalyticsControllerSetUserUISettings**](RiskAnalyticsControllerApi.md#riskAnalyticsControllerSetUserUISettings) | **PUT** /api/v3/risk_events/user_ui_settings | Summary: Set user UI settings
Description: Set the user settings by user id in the mongo collection. WARNING: this API should not be used manually or by a system external to Guardium Insights. Using this API to change a user settings may prevent the user from using the Risk Event function within Guardium Insights.
[**riskAnalyticsControllerUpdateRiskFeedback**](RiskAnalyticsControllerApi.md#riskAnalyticsControllerUpdateRiskFeedback) | **PUT** /api/v3/risk_events/feedback | Summary: Update risk feedback
Description: Provide feedback for one or more risk events



## riskAnalyticsControllerEnableDisableRiskEventFeedback

Summary: Enable disable risk rvent feedback
Description: Enable or disable the collect feedback process.

### Example

```bash
 riskAnalyticsControllerEnableDisableRiskEventFeedback
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest** | [**Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest**](Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest.md) |  |

### Return type

[**Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackResponse**](Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## riskAnalyticsControllerEnableDisableRiskEventProcess

Summary: Enable disable risk event process
Description: Enable or disable the risk event process.

### Example

```bash
 riskAnalyticsControllerEnableDisableRiskEventProcess
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest** | [**Riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest**](Riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest.md) |  |

### Return type

[**Riskanalyticscontrollerv3EnableDisableRiskEventProcessResponse**](Riskanalyticscontrollerv3EnableDisableRiskEventProcessResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## riskAnalyticsControllerGetAllClassificationsList

Summary: Get all classifications
Description: Get all possible classifications for a risk event.

### Example

```bash
 riskAnalyticsControllerGetAllClassificationsList
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Riskanalyticscontrollerv3GetAllClassificationsListResponse**](Riskanalyticscontrollerv3GetAllClassificationsListResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## riskAnalyticsControllerGetRiskEventClassificationsList

Summary: Get risk event classifications list
Description: retrieves the ClassificationMatchDetails for a given risk id – classification that did not matched will be with class_value 0.

### Example

```bash
 riskAnalyticsControllerGetRiskEventClassificationsList risk_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **riskId** | **integer** | Risk id | [default to null]

### Return type

[**Riskanalyticscontrollerv3GetRiskEventClassificationsListResponse**](Riskanalyticscontrollerv3GetRiskEventClassificationsListResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## riskAnalyticsControllerGetRiskEventDataForSummarization

Summary: Get risk event data needed for summarization task
Description: Retrieve the full information about this risk event including all findings data

### Example

```bash
 riskAnalyticsControllerGetRiskEventDataForSummarization risk_id=value  include_indicators=value  num_findings_limit=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **riskId** | **integer** | Risk ID | [default to null]
 **includeIndicators** | **boolean** | Indicates whether to include indicators in the response or not. | [optional] [default to null]
 **numFindingsLimit** | **integer** | Max number of hours to get for the risk. | [optional] [default to null]

### Return type

[**Riskanalyticscontrollerv3RiskEventSummarizationDataResponse**](Riskanalyticscontrollerv3RiskEventSummarizationDataResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## riskAnalyticsControllerGetRiskEventDetails

Summary: Get risk event details
Description: Return the details of a risk event, including risk general info and a list of observations.

### Example

```bash
 riskAnalyticsControllerGetRiskEventDetails risk_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **riskId** | **integer** | Risk id. | [default to null]

### Return type

[**Riskanalyticscontrollerv3GetRiskEventDetailsResponse**](Riskanalyticscontrollerv3GetRiskEventDetailsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## riskAnalyticsControllerGetRiskEventProcessStatus

Summary: Get risk event process status
Description: Get the risk event process status.

### Example

```bash
 riskAnalyticsControllerGetRiskEventProcessStatus
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse**](Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## riskAnalyticsControllerGetRiskEventRow

Summary: Get risk event row
Description: Return a list of risk events.

### Example

```bash
 riskAnalyticsControllerGetRiskEventRow  status=value  date_from=value  date_to=value  pivot.type=value  pivot.id=value  pivot.db_user=value  pivot.database=value  pivot.server_ip=value  pivot.os_user=value  pivot.database_source_field=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | **string** | Status to retrieve only the status events, blank to retrieve all. | [optional] [default to UNDEFINED_STATUS]
 **dateFrom** | **string** | The API retrieves risk events that were open in a time range. date_from defines the start of this time range. format YYYY-MM-DDTHH:mm:ssZ. | [optional] [default to null]
 **dateTo** | **string** | The API retrieves risk events that were open in a time range. date_to defines the end of this time range. format YYYY-MM-DDTHH:mm:ssZ. | [optional] [default to null]
 **pivotPeriodtype** | **string** | Pivot type - enum. | [optional] [default to UNDEFINED_PIVOT_TYPE]
 **pivotPeriodid** | **string** | Pivot id -  all pivot fields separated by semicolon. | [optional] [default to null]
 **pivotPerioddbUser** | **string** | Optional db_user - if pivot is db user. | [optional] [default to null]
 **pivotPerioddatabase** | **string** | Optional database - if pivot is db user / database. | [optional] [default to null]
 **pivotPeriodserverIp** | **string** | Optional server_ip - if pivot is db user / database. | [optional] [default to null]
 **pivotPeriodosUser** | **string** | Optional os_user - if pivot is os user. | [optional] [default to null]
 **pivotPerioddatabaseSourceField** | **string** | Optional database_source_field (values database name/service name depends on the server type) - if pivot is db user / database. | [optional] [default to UNDEFINED]

### Return type

[**Riskanalyticscontrollerv3GetRiskEventRowResponse**](Riskanalyticscontrollerv3GetRiskEventRowResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## riskAnalyticsControllerGetRiskEventVulnerabilityAssessmentDetails

Summary: Get vulnerability assessment details for a given risk event
Description: Retrieve the information about failed VA tests for assets database and db user

### Example

```bash
 riskAnalyticsControllerGetRiskEventVulnerabilityAssessmentDetails risk_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **riskId** | **integer** | Risk ID | [default to null]

### Return type

[**Riskanalyticscontrollerv3RiskEventVulnerabilityAssessmentDetailsResponse**](Riskanalyticscontrollerv3RiskEventVulnerabilityAssessmentDetailsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## riskAnalyticsControllerGetRiskFeedback

Summary: Get risk feedback
Description: Get all feedbacks that are in status NEW/WIP and change them to status WIP.

### Example

```bash
 riskAnalyticsControllerGetRiskFeedback
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Riskanalyticscontrollerv3GetRiskFeedbackResponse**](Riskanalyticscontrollerv3GetRiskFeedbackResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## riskAnalyticsControllerGetRiskObservationDetails

Summary: Get risk observation details
Description: Return details of a single risk observation.

### Example

```bash
 riskAnalyticsControllerGetRiskObservationDetails  lead_feature_id=value  observation_type=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **leadFeatureId** | **integer** | Lead feature id. | [optional] [default to null]
 **observationType** | **string** | Observation type. | [optional] [default to UNDEFINED_OBSERVATION_TYPE]

### Return type

[**Riskanalyticscontrollerv3GetRiskObservationDetailsResponse**](Riskanalyticscontrollerv3GetRiskObservationDetailsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## riskAnalyticsControllerGetUserUISettings

Summary: Get user UI settings
Description: Get the user settings by user id to display the risk in the UI.

### Example

```bash
 riskAnalyticsControllerGetUserUISettings
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Riskanalyticscontrollerv3GetUserUISettingsResponse**](Riskanalyticscontrollerv3GetUserUISettingsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## riskAnalyticsControllerRiskEventTuning

Summary: Risk event tuning
Description: Perform tuning risk event actions.

### Example

```bash
 riskAnalyticsControllerRiskEventTuning
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **riskanalyticscontrollerv3RiskEventTuningRequest** | [**Riskanalyticscontrollerv3RiskEventTuningRequest**](Riskanalyticscontrollerv3RiskEventTuningRequest.md) |  |

### Return type

[**Riskanalyticscontrollerv3RiskEventTuningResponse**](Riskanalyticscontrollerv3RiskEventTuningResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## riskAnalyticsControllerSetRiskEventStatus

Summary: Set risk event status
Description: Update the risk status and justification.

### Example

```bash
 riskAnalyticsControllerSetRiskEventStatus
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **riskanalyticscontrollerv3SetRiskEventStatusRequest** | [**Riskanalyticscontrollerv3SetRiskEventStatusRequest**](Riskanalyticscontrollerv3SetRiskEventStatusRequest.md) |  |

### Return type

[**Riskanalyticscontrollerv3SetRiskEventStatusResponse**](Riskanalyticscontrollerv3SetRiskEventStatusResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## riskAnalyticsControllerSetUserUISettings

Summary: Set user UI settings
Description: Set the user settings by user id in the mongo collection. WARNING: this API should not be used manually or by a system external to Guardium Insights. Using this API to change a user settings may prevent the user from using the Risk Event function within Guardium Insights.

### Example

```bash
 riskAnalyticsControllerSetUserUISettings
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **riskanalyticscontrollerv3SetUserUISettingsRequest** | [**Riskanalyticscontrollerv3SetUserUISettingsRequest**](Riskanalyticscontrollerv3SetUserUISettingsRequest.md) |  |

### Return type

[**Riskanalyticscontrollerv3SetUserUISettingsResponse**](Riskanalyticscontrollerv3SetUserUISettingsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## riskAnalyticsControllerUpdateRiskFeedback

Summary: Update risk feedback
Description: Provide feedback for one or more risk events

### Example

```bash
 riskAnalyticsControllerUpdateRiskFeedback
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **riskanalyticscontrollerv3UpdateRiskFeedbackRequest** | [**Riskanalyticscontrollerv3UpdateRiskFeedbackRequest**](Riskanalyticscontrollerv3UpdateRiskFeedbackRequest.md) |  |

### Return type

[**Riskanalyticscontrollerv3UpdateRiskFeedbackResponse**](Riskanalyticscontrollerv3UpdateRiskFeedbackResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

