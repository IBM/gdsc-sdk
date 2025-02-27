# .RiskAnalyticsControllerApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**riskAnalyticsControllerEnableDisableRiskEventFeedback**](RiskAnalyticsControllerApi.md#riskAnalyticsControllerEnableDisableRiskEventFeedback) | **PUT** /api/v3/risk_feedback/status | Summary: Enable disable risk rvent feedback Description: Enable or disable the collect feedback process.
[**riskAnalyticsControllerEnableDisableRiskEventProcess**](RiskAnalyticsControllerApi.md#riskAnalyticsControllerEnableDisableRiskEventProcess) | **PUT** /api/v3/risk_process/status | Summary: Enable disable risk event process Description: Enable or disable the risk event process.
[**riskAnalyticsControllerGetAllClassificationsList**](RiskAnalyticsControllerApi.md#riskAnalyticsControllerGetAllClassificationsList) | **GET** /api/v3/risk_events/classifications | Summary: Get all classifications Description: Get all possible classifications for a risk event.
[**riskAnalyticsControllerGetRiskEventClassificationsList**](RiskAnalyticsControllerApi.md#riskAnalyticsControllerGetRiskEventClassificationsList) | **GET** /api/v3/risk_events/{risk_id}/feedback | Summary: Get risk event classifications list Description: retrieves the ClassificationMatchDetails for a given risk id; classification that did not matched will be with class_value 0.
[**riskAnalyticsControllerGetRiskEventDataForSummarization**](RiskAnalyticsControllerApi.md#riskAnalyticsControllerGetRiskEventDataForSummarization) | **GET** /api/v3/risk_events/{risk_id}/summarization/data | Summary: Get risk event data needed for summarization task Description: Retrieve the full information about this risk event including all findings data
[**riskAnalyticsControllerGetRiskEventDetails**](RiskAnalyticsControllerApi.md#riskAnalyticsControllerGetRiskEventDetails) | **GET** /api/v3/risk_events/{risk_id}/details | Summary: Get risk event details Description: Return the details of a risk event, including risk general info and a list of observations.
[**riskAnalyticsControllerGetRiskEventProcessStatus**](RiskAnalyticsControllerApi.md#riskAnalyticsControllerGetRiskEventProcessStatus) | **GET** /api/v3/risk_process/status | Summary: Get risk event process status Description: Get the risk event process status.
[**riskAnalyticsControllerGetRiskEventRow**](RiskAnalyticsControllerApi.md#riskAnalyticsControllerGetRiskEventRow) | **GET** /api/v3/risk_events | Summary: Get risk event row Description: Return a list of risk events.
[**riskAnalyticsControllerGetRiskEventVulnerabilityAssessmentDetails**](RiskAnalyticsControllerApi.md#riskAnalyticsControllerGetRiskEventVulnerabilityAssessmentDetails) | **PUT** /api/v3/risk_events/{risk_id}/va | Summary: Get vulnerability assessment details for a given risk event Description: Retrieve the information about failed VA tests for assets database and db user
[**riskAnalyticsControllerGetRiskFeedback**](RiskAnalyticsControllerApi.md#riskAnalyticsControllerGetRiskFeedback) | **GET** /api/v3/risk_events/feedback | Summary: Get risk feedback Description: Get all feedbacks that are in status NEW/WIP and change them to status WIP.
[**riskAnalyticsControllerGetRiskObservationDetails**](RiskAnalyticsControllerApi.md#riskAnalyticsControllerGetRiskObservationDetails) | **GET** /api/v3/risk_events/observations | Summary: Get risk observation details Description: Return details of a single risk observation.
[**riskAnalyticsControllerGetUserUISettings**](RiskAnalyticsControllerApi.md#riskAnalyticsControllerGetUserUISettings) | **GET** /api/v3/risk_events/user_ui_settings | Summary: Get user UI settings Description: Get the user settings by user id to display the risk in the UI.
[**riskAnalyticsControllerRiskEventTuning**](RiskAnalyticsControllerApi.md#riskAnalyticsControllerRiskEventTuning) | **PUT** /api/v3/risk_events/tuning | Summary: Risk event tuning Description: Perform tuning risk event actions.
[**riskAnalyticsControllerSetRiskEventStatus**](RiskAnalyticsControllerApi.md#riskAnalyticsControllerSetRiskEventStatus) | **PUT** /api/v3/risk_events/status | Summary: Set risk event status Description: Update the risk status and justification.
[**riskAnalyticsControllerSetUserUISettings**](RiskAnalyticsControllerApi.md#riskAnalyticsControllerSetUserUISettings) | **PUT** /api/v3/risk_events/user_ui_settings | Summary: Set user UI settings Description: Set the user settings by user id in the mongo collection. WARNING: this API should not be used manually or by a system external to GDSC. Using this API to change a user settings may prevent the user from using the Risk Event function within GDSC.
[**riskAnalyticsControllerUpdateRiskFeedback**](RiskAnalyticsControllerApi.md#riskAnalyticsControllerUpdateRiskFeedback) | **PUT** /api/v3/risk_events/feedback | Summary: Update risk feedback Description: Provide feedback for one or more risk events


# **riskAnalyticsControllerEnableDisableRiskEventFeedback**
> Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackResponse riskAnalyticsControllerEnableDisableRiskEventFeedback(riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .RiskAnalyticsControllerApi(configuration);

let body:.RiskAnalyticsControllerApiRiskAnalyticsControllerEnableDisableRiskEventFeedbackRequest = {
  // Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest
  riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest: {
    action: "UNDEFINED_ACTION_TYPE",
  },
};

apiInstance.riskAnalyticsControllerEnableDisableRiskEventFeedback(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest** | **Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest**|  |


### Return type

**Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **riskAnalyticsControllerEnableDisableRiskEventProcess**
> Riskanalyticscontrollerv3EnableDisableRiskEventProcessResponse riskAnalyticsControllerEnableDisableRiskEventProcess(riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .RiskAnalyticsControllerApi(configuration);

let body:.RiskAnalyticsControllerApiRiskAnalyticsControllerEnableDisableRiskEventProcessRequest = {
  // Riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest
  riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest: {
    action: "UNDEFINED_ACTION_TYPE",
  },
};

apiInstance.riskAnalyticsControllerEnableDisableRiskEventProcess(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest** | **Riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest**|  |


### Return type

**Riskanalyticscontrollerv3EnableDisableRiskEventProcessResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **riskAnalyticsControllerGetAllClassificationsList**
> Riskanalyticscontrollerv3GetAllClassificationsListResponse riskAnalyticsControllerGetAllClassificationsList()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .RiskAnalyticsControllerApi(configuration);

let body:any = {};

apiInstance.riskAnalyticsControllerGetAllClassificationsList(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Riskanalyticscontrollerv3GetAllClassificationsListResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **riskAnalyticsControllerGetRiskEventClassificationsList**
> Riskanalyticscontrollerv3GetRiskEventClassificationsListResponse riskAnalyticsControllerGetRiskEventClassificationsList()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .RiskAnalyticsControllerApi(configuration);

let body:.RiskAnalyticsControllerApiRiskAnalyticsControllerGetRiskEventClassificationsListRequest = {
  // number | Risk id
  riskId: 1,
};

apiInstance.riskAnalyticsControllerGetRiskEventClassificationsList(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **riskId** | [**number**] | Risk id | defaults to undefined


### Return type

**Riskanalyticscontrollerv3GetRiskEventClassificationsListResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **riskAnalyticsControllerGetRiskEventDataForSummarization**
> Riskanalyticscontrollerv3RiskEventSummarizationDataResponse riskAnalyticsControllerGetRiskEventDataForSummarization()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .RiskAnalyticsControllerApi(configuration);

let body:.RiskAnalyticsControllerApiRiskAnalyticsControllerGetRiskEventDataForSummarizationRequest = {
  // number | Risk ID
  riskId: 1,
  // boolean | Indicates whether to include indicators in the response or not. (optional)
  includeIndicators: true,
  // number | Max number of hours to get for the risk. (optional)
  numFindingsLimit: 1,
};

apiInstance.riskAnalyticsControllerGetRiskEventDataForSummarization(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **riskId** | [**number**] | Risk ID | defaults to undefined
 **includeIndicators** | [**boolean**] | Indicates whether to include indicators in the response or not. | (optional) defaults to undefined
 **numFindingsLimit** | [**number**] | Max number of hours to get for the risk. | (optional) defaults to undefined


### Return type

**Riskanalyticscontrollerv3RiskEventSummarizationDataResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **riskAnalyticsControllerGetRiskEventDetails**
> Riskanalyticscontrollerv3GetRiskEventDetailsResponse riskAnalyticsControllerGetRiskEventDetails()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .RiskAnalyticsControllerApi(configuration);

let body:.RiskAnalyticsControllerApiRiskAnalyticsControllerGetRiskEventDetailsRequest = {
  // number | Risk id.
  riskId: 1,
};

apiInstance.riskAnalyticsControllerGetRiskEventDetails(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **riskId** | [**number**] | Risk id. | defaults to undefined


### Return type

**Riskanalyticscontrollerv3GetRiskEventDetailsResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **riskAnalyticsControllerGetRiskEventProcessStatus**
> Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse riskAnalyticsControllerGetRiskEventProcessStatus()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .RiskAnalyticsControllerApi(configuration);

let body:any = {};

apiInstance.riskAnalyticsControllerGetRiskEventProcessStatus(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **riskAnalyticsControllerGetRiskEventRow**
> Riskanalyticscontrollerv3GetRiskEventRowResponse riskAnalyticsControllerGetRiskEventRow()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .RiskAnalyticsControllerApi(configuration);

let body:.RiskAnalyticsControllerApiRiskAnalyticsControllerGetRiskEventRowRequest = {
  // 'UNDEFINED_STATUS' | 'OPENED' | 'CLOSED' | 'DELEGATED' | 'FOLLOWUP' | Status to retrieve only the status events, blank to retrieve all. (optional)
  status: "UNDEFINED_STATUS",
  // Date | The API retrieves risk events that were open in a time range. date_from defines the start of this time range. format YYYY-MM-DDTHH:mm:ssZ. (optional)
  dateFrom: new Date('1970-01-01T00:00:00.00Z'),
  // Date | The API retrieves risk events that were open in a time range. date_to defines the end of this time range. format YYYY-MM-DDTHH:mm:ssZ. (optional)
  dateTo: new Date('1970-01-01T00:00:00.00Z'),
  // 'UNDEFINED_PIVOT_TYPE' | 'DATABASE' | 'DB_USER' | 'OS_USER' | 'GLOBAL' | Pivot type - enum. (optional)
  pivotType: "UNDEFINED_PIVOT_TYPE",
  // string | Pivot id -  all pivot fields separated by semicolon. (optional)
  pivotId: "pivot.id_example",
  // string | Optional db_user - if pivot is db user. (optional)
  pivotDbUser: "pivot.db_user_example",
  // string | Optional database - if pivot is db user / database. (optional)
  pivotDatabase: "pivot.database_example",
  // string | Optional server_ip - if pivot is db user / database. (optional)
  pivotServerIp: "pivot.server_ip_example",
  // string | Optional os_user - if pivot is os user. (optional)
  pivotOsUser: "pivot.os_user_example",
  // 'UNDEFINED' | 'DATABASE_NAME' | 'SERVICE_NAME' | Optional database_source_field (values database name/service name depends on the server type) - if pivot is db user / database. (optional)
  pivotDatabaseSourceField: "UNDEFINED",
};

apiInstance.riskAnalyticsControllerGetRiskEventRow(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | [**&#39;UNDEFINED_STATUS&#39; | &#39;OPENED&#39; | &#39;CLOSED&#39; | &#39;DELEGATED&#39; | &#39;FOLLOWUP&#39;**]**Array<&#39;UNDEFINED_STATUS&#39; &#124; &#39;OPENED&#39; &#124; &#39;CLOSED&#39; &#124; &#39;DELEGATED&#39; &#124; &#39;FOLLOWUP&#39;>** | Status to retrieve only the status events, blank to retrieve all. | (optional) defaults to 'UNDEFINED_STATUS'
 **dateFrom** | [**Date**] | The API retrieves risk events that were open in a time range. date_from defines the start of this time range. format YYYY-MM-DDTHH:mm:ssZ. | (optional) defaults to undefined
 **dateTo** | [**Date**] | The API retrieves risk events that were open in a time range. date_to defines the end of this time range. format YYYY-MM-DDTHH:mm:ssZ. | (optional) defaults to undefined
 **pivotType** | [**&#39;UNDEFINED_PIVOT_TYPE&#39; | &#39;DATABASE&#39; | &#39;DB_USER&#39; | &#39;OS_USER&#39; | &#39;GLOBAL&#39;**]**Array<&#39;UNDEFINED_PIVOT_TYPE&#39; &#124; &#39;DATABASE&#39; &#124; &#39;DB_USER&#39; &#124; &#39;OS_USER&#39; &#124; &#39;GLOBAL&#39;>** | Pivot type - enum. | (optional) defaults to 'UNDEFINED_PIVOT_TYPE'
 **pivotId** | [**string**] | Pivot id -  all pivot fields separated by semicolon. | (optional) defaults to undefined
 **pivotDbUser** | [**string**] | Optional db_user - if pivot is db user. | (optional) defaults to undefined
 **pivotDatabase** | [**string**] | Optional database - if pivot is db user / database. | (optional) defaults to undefined
 **pivotServerIp** | [**string**] | Optional server_ip - if pivot is db user / database. | (optional) defaults to undefined
 **pivotOsUser** | [**string**] | Optional os_user - if pivot is os user. | (optional) defaults to undefined
 **pivotDatabaseSourceField** | [**&#39;UNDEFINED&#39; | &#39;DATABASE_NAME&#39; | &#39;SERVICE_NAME&#39;**]**Array<&#39;UNDEFINED&#39; &#124; &#39;DATABASE_NAME&#39; &#124; &#39;SERVICE_NAME&#39;>** | Optional database_source_field (values database name/service name depends on the server type) - if pivot is db user / database. | (optional) defaults to 'UNDEFINED'


### Return type

**Riskanalyticscontrollerv3GetRiskEventRowResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **riskAnalyticsControllerGetRiskEventVulnerabilityAssessmentDetails**
> Riskanalyticscontrollerv3RiskEventVulnerabilityAssessmentDetailsResponse riskAnalyticsControllerGetRiskEventVulnerabilityAssessmentDetails()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .RiskAnalyticsControllerApi(configuration);

let body:.RiskAnalyticsControllerApiRiskAnalyticsControllerGetRiskEventVulnerabilityAssessmentDetailsRequest = {
  // number | Risk ID
  riskId: 1,
};

apiInstance.riskAnalyticsControllerGetRiskEventVulnerabilityAssessmentDetails(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **riskId** | [**number**] | Risk ID | defaults to undefined


### Return type

**Riskanalyticscontrollerv3RiskEventVulnerabilityAssessmentDetailsResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **riskAnalyticsControllerGetRiskFeedback**
> Riskanalyticscontrollerv3GetRiskFeedbackResponse riskAnalyticsControllerGetRiskFeedback()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .RiskAnalyticsControllerApi(configuration);

let body:any = {};

apiInstance.riskAnalyticsControllerGetRiskFeedback(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Riskanalyticscontrollerv3GetRiskFeedbackResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **riskAnalyticsControllerGetRiskObservationDetails**
> Riskanalyticscontrollerv3GetRiskObservationDetailsResponse riskAnalyticsControllerGetRiskObservationDetails()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .RiskAnalyticsControllerApi(configuration);

let body:.RiskAnalyticsControllerApiRiskAnalyticsControllerGetRiskObservationDetailsRequest = {
  // number | Lead feature id. (optional)
  leadFeatureId: 1,
  // 'UNDEFINED_OBSERVATION_TYPE' | 'ACTIVITY' | 'EXCEPTION' | 'VIOLATION' | 'OUTLIER' | 'ANOMALY' | Observation type. (optional)
  observationType: "UNDEFINED_OBSERVATION_TYPE",
};

apiInstance.riskAnalyticsControllerGetRiskObservationDetails(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **leadFeatureId** | [**number**] | Lead feature id. | (optional) defaults to undefined
 **observationType** | [**&#39;UNDEFINED_OBSERVATION_TYPE&#39; | &#39;ACTIVITY&#39; | &#39;EXCEPTION&#39; | &#39;VIOLATION&#39; | &#39;OUTLIER&#39; | &#39;ANOMALY&#39;**]**Array<&#39;UNDEFINED_OBSERVATION_TYPE&#39; &#124; &#39;ACTIVITY&#39; &#124; &#39;EXCEPTION&#39; &#124; &#39;VIOLATION&#39; &#124; &#39;OUTLIER&#39; &#124; &#39;ANOMALY&#39;>** | Observation type. | (optional) defaults to 'UNDEFINED_OBSERVATION_TYPE'


### Return type

**Riskanalyticscontrollerv3GetRiskObservationDetailsResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **riskAnalyticsControllerGetUserUISettings**
> Riskanalyticscontrollerv3GetUserUISettingsResponse riskAnalyticsControllerGetUserUISettings()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .RiskAnalyticsControllerApi(configuration);

let body:any = {};

apiInstance.riskAnalyticsControllerGetUserUISettings(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Riskanalyticscontrollerv3GetUserUISettingsResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **riskAnalyticsControllerRiskEventTuning**
> Riskanalyticscontrollerv3RiskEventTuningResponse riskAnalyticsControllerRiskEventTuning(riskanalyticscontrollerv3RiskEventTuningRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .RiskAnalyticsControllerApi(configuration);

let body:.RiskAnalyticsControllerApiRiskAnalyticsControllerRiskEventTuningRequest = {
  // Riskanalyticscontrollerv3RiskEventTuningRequest
  riskanalyticscontrollerv3RiskEventTuningRequest: {
    excludedItems: [
      {
        excludedItemType: "UNDEFINED_EXCLUDED_ITEM_TYPE",
        key: "key_example",
      },
    ],
  },
};

apiInstance.riskAnalyticsControllerRiskEventTuning(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **riskanalyticscontrollerv3RiskEventTuningRequest** | **Riskanalyticscontrollerv3RiskEventTuningRequest**|  |


### Return type

**Riskanalyticscontrollerv3RiskEventTuningResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **riskAnalyticsControllerSetRiskEventStatus**
> Riskanalyticscontrollerv3SetRiskEventStatusResponse riskAnalyticsControllerSetRiskEventStatus(riskanalyticscontrollerv3SetRiskEventStatusRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .RiskAnalyticsControllerApi(configuration);

let body:.RiskAnalyticsControllerApiRiskAnalyticsControllerSetRiskEventStatusRequest = {
  // Riskanalyticscontrollerv3SetRiskEventStatusRequest
  riskanalyticscontrollerv3SetRiskEventStatusRequest: {
    justification: "justification_example",
    riskIds: [
      1,
    ],
    status: "UNDEFINED_STATUS",
  },
};

apiInstance.riskAnalyticsControllerSetRiskEventStatus(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **riskanalyticscontrollerv3SetRiskEventStatusRequest** | **Riskanalyticscontrollerv3SetRiskEventStatusRequest**|  |


### Return type

**Riskanalyticscontrollerv3SetRiskEventStatusResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **riskAnalyticsControllerSetUserUISettings**
> Riskanalyticscontrollerv3SetUserUISettingsResponse riskAnalyticsControllerSetUserUISettings(riskanalyticscontrollerv3SetUserUISettingsRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .RiskAnalyticsControllerApi(configuration);

let body:.RiskAnalyticsControllerApiRiskAnalyticsControllerSetUserUISettingsRequest = {
  // Riskanalyticscontrollerv3SetUserUISettingsRequest
  riskanalyticscontrollerv3SetUserUISettingsRequest: {
    userUiSettings: {
      cardSettings: [
        {
          filters: [
            {
              headerId: "headerId_example",
              values: [
                "values_example",
              ],
            },
          ],
          headers: [
            "headers_example",
          ],
          id: "id_example",
          name: "name_example",
          orderBy: "UNDEFINED_ORDER_BY",
          sequenceOrder: 1,
          sortedBy: "sortedBy_example",
        },
      ],
      showBanner: true,
    },
  },
};

apiInstance.riskAnalyticsControllerSetUserUISettings(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **riskanalyticscontrollerv3SetUserUISettingsRequest** | **Riskanalyticscontrollerv3SetUserUISettingsRequest**|  |


### Return type

**Riskanalyticscontrollerv3SetUserUISettingsResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **riskAnalyticsControllerUpdateRiskFeedback**
> Riskanalyticscontrollerv3UpdateRiskFeedbackResponse riskAnalyticsControllerUpdateRiskFeedback(riskanalyticscontrollerv3UpdateRiskFeedbackRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .RiskAnalyticsControllerApi(configuration);

let body:.RiskAnalyticsControllerApiRiskAnalyticsControllerUpdateRiskFeedbackRequest = {
  // Riskanalyticscontrollerv3UpdateRiskFeedbackRequest
  riskanalyticscontrollerv3UpdateRiskFeedbackRequest: {
    comment: "comment_example",
    feedbackClassificationKey: "feedbackClassificationKey_example",
    originalClassificationKey: "originalClassificationKey_example",
    riskIds: [
      1,
    ],
  },
};

apiInstance.riskAnalyticsControllerUpdateRiskFeedback(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **riskanalyticscontrollerv3UpdateRiskFeedbackRequest** | **Riskanalyticscontrollerv3UpdateRiskFeedbackRequest**|  |


### Return type

**Riskanalyticscontrollerv3UpdateRiskFeedbackResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


