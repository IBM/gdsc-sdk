# .SchedulerServiceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**schedulerServiceCreateScheduledJob**](SchedulerServiceApi.md#schedulerServiceCreateScheduledJob) | **POST** /api/v3/schedules | Summary: Create scheduled job Description: Create a new scheduled job with tasks.
[**schedulerServiceDeleteScheduledJob**](SchedulerServiceApi.md#schedulerServiceDeleteScheduledJob) | **DELETE** /api/v3/schedules/{schedule_id} | Summary: Delete scheduled job Description: Delete a single scheduled job.
[**schedulerServiceGetDependencies**](SchedulerServiceApi.md#schedulerServiceGetDependencies) | **GET** /api/v3/schedules/dependencies | Summary: Get dependencies Description: returns IDs of distribution rules, response templates, or processing rules that are in use
[**schedulerServiceGetDistributionRules**](SchedulerServiceApi.md#schedulerServiceGetDistributionRules) | **GET** /api/v3/schedules/distribution_rules | Summary: Get distribution rules Description: Return a list of distribution rule IDs that are used by the scheduler Distribution rules can\&#39;t be edited if it is used by a scheduled job.
[**schedulerServiceGetScheduledJobDetails**](SchedulerServiceApi.md#schedulerServiceGetScheduledJobDetails) | **GET** /api/v3/schedules/{schedule_id}/details | Summary: Get scheduled job Description: Return a single ScheduledJob in detail.
[**schedulerServiceGetScheduledJobs**](SchedulerServiceApi.md#schedulerServiceGetScheduledJobs) | **GET** /api/v3/schedules | Summary: Get scheduled jobs Description: Return a list of scheduled jobs and the linked tasks.
[**schedulerServiceGetSchedulesByReport**](SchedulerServiceApi.md#schedulerServiceGetSchedulesByReport) | **POST** /api/v3/schedules/searchByReport/{report_id} | Summary: Get schedules by report Description: Return an array of scheduled job IDs that run the report_id.  An empty array is returned if the report_id is not scheduled.
[**schedulerServiceGetTags**](SchedulerServiceApi.md#schedulerServiceGetTags) | **GET** /api/v3/schedules/tags | Summary: Get tags Description: Return an array of all the unique tags from scheduled jobs.
[**schedulerServiceSearchScheduledJobs**](SchedulerServiceApi.md#schedulerServiceSearchScheduledJobs) | **POST** /api/v3/schedules/search | Summary: Search scheduled jobs Description: Return a filtered list of scheduled jobs and the linked tasks.
[**schedulerServiceSearchScheduledTaskRuns**](SchedulerServiceApi.md#schedulerServiceSearchScheduledTaskRuns) | **POST** /api/v3/schedules/runs/search | Summary: Search scheduled task runs Description: Return a list of scheduled task run, start date, end date, status
[**schedulerServiceUpdateScheduledJob**](SchedulerServiceApi.md#schedulerServiceUpdateScheduledJob) | **PATCH** /api/v3/schedules/{schedule_id} | Summary: Update scheduled job Description: Update a single schedule job.


# **schedulerServiceCreateScheduledJob**
> Schedulerv3CreateScheduledJobResponse schedulerServiceCreateScheduledJob(schedulerv3CreateScheduledJobRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .SchedulerServiceApi(configuration);

let body:.SchedulerServiceApiSchedulerServiceCreateScheduledJobRequest = {
  // Schedulerv3CreateScheduledJobRequest
  schedulerv3CreateScheduledJobRequest: {
    description: "description_example",
    enabled: true,
    instructions: "instructions_example",
    internalAudit: "UNDEFINED_TYPE",
    name: "name_example",
    notification: "UNDEFINED_NOTIFICATION",
    origin: "origin_example",
    recipient: {
      integrationId: "integrationId_example",
      label: "label_example",
      templateId: "templateId_example",
      type: "UNDEFINED_RECTYPE",
      value: "value_example",
    },
    recipients: [
      {
        integrationId: "integrationId_example",
        label: "label_example",
        templateId: "templateId_example",
        type: "UNDEFINED_RECTYPE",
        value: "value_example",
      },
    ],
    retention: {
      archive: true,
      days: 1,
    },
    scheduler: {
      beginSchedule: new Date('1970-01-01T00:00:00.00Z'),
      byDayOfMonth: true,
      dayOfMonth: "dayOfMonth_example",
      dayOfWeek: [
        "UNDEFINED_DAY",
      ],
      dayOrder: "UNDEFINED_ORDER",
      dayOrderDayOfWeek: "UNDEFINED_DAY",
      endSchedule: new Date('1970-01-01T00:00:00.00Z'),
      frequency: "UNDEFINED_FREQUENCY",
      months: [
        "EVERYMONTH",
      ],
      neverEnd: true,
      repeat: 1,
      repeatBegin: {
        hour: 1,
        minute: 1,
        timezone: "timezone_example",
      },
      repeatEnd: {
        hour: 1,
        minute: 1,
        timezone: "timezone_example",
      },
      repeatMinutes: 1,
      runOnceNow: true,
    },
    tags: [
      "tags_example",
    ],
    tasks: [
      {
        auditType: "UNDEFINED_TYPE",
        deliveryMethod: {
          fileFormat: "UNDEFINED_FORMAT",
          reportTimeZone: "reportTimeZone_example",
        },
        distributionRuleIds: [
          "distributionRuleIds_example",
        ],
        emailSubject: "emailSubject_example",
        instructions: "instructions_example",
        name: "name_example",
        parameter: {
          dataImportParameter: {
            extraDetail: "extraDetail_example",
            integrationId: "integrationId_example",
            templateId: "templateId_example",
            value: "value_example",
          },
          reportParameter: {
            extraDetail: "extraDetail_example",
            reportId: "reportId_example",
            reportName: "reportName_example",
            runtimeParameters: [
              {
                key: "key_example",
                label: "label_example",
                operatorType: "UNDEFINED_OPERATOR_TYPE",
                runtimeParameterType: "UNDEFINED_TYPE",
                runtimeParameterTypeLength: 1,
                value: "value_example",
              },
            ],
            syncExecutionDate: true,
            threshold: 1,
          },
        },
        recipients: [
          {
            integrationId: "integrationId_example",
            label: "label_example",
            templateId: "templateId_example",
            type: "UNDEFINED_RECTYPE",
            value: "value_example",
          },
        ],
        reportFilters: {
          bracketsId: 1,
          filterName: "filterName_example",
          filtersArray: [
            {
              brackets: ,
              condition: {
                caseInsensitive: true,
                fieldNlsTranslationKey: "fieldNlsTranslationKey_example",
                filterId: 1,
                groupTypeId: 1,
                headerId: "headerId_example",
                headerName: "headerName_example",
                headerType: "UNDEFINED_TYPE",
                inReportDateRange: {
                  endDate: "endDate_example",
                  endNumber: 1,
                  endUnit: "UNDEFINED_UINT_TYPE",
                  startDate: "startDate_example",
                  startNumber: 1,
                  startUnit: "UNDEFINED_UINT_TYPE",
                  type: "UNDEFINED_DATE_RANGE_TYPE",
                },
                inReportFieldNlsKey: "inReportFieldNlsKey_example",
                inReportHeaderId: "inReportHeaderId_example",
                inReportHeaderName: "inReportHeaderName_example",
                inReportId: "inReportId_example",
                inReportName: "inReportName_example",
                inReportTableName: "inReportTableName_example",
                isTuple: true,
                operatorType: "UNDEFINED_OPERATOR_TYPE",
                parameterType: "UNDEFINED_PARAM_TYPE",
                schemaName: "schemaName_example",
                sequence: 1,
                tableName: "tableName_example",
                tupleType: "tupleType_example",
                values: [
                  "values_example",
                ],
              },
            },
          ],
          havingArray: [
            {
              condition: {
                aggregationType: "UNDEFINED_AGG_TYPE",
                headerId: "headerId_example",
                headerName: "headerName_example",
                operatorType: "UNDEFINED_OPERATOR_TYPE",
                tableName: "tableName_example",
                value: "value_example",
              },
            },
          ],
          isCustom: true,
          optionType: "UNDEFINED_OPTION_TYPE",
          sequence: 1,
        },
        scheduledTaskId: "scheduledTaskId_example",
        type: "UNDEFINED_JOBTYPE",
        workflowInvestigationLinks: [
          {
            display: "display_example",
            id: "id_example",
            type: "type_example",
          },
        ],
        workflowResponseTemplate: {
          display: "display_example",
          id: "id_example",
          type: "type_example",
        },
        workflowType: "REVIEW_NONE",
        workflowUniqueFields: [
          "workflowUniqueFields_example",
        ],
      },
    ],
  },
};

apiInstance.schedulerServiceCreateScheduledJob(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **schedulerv3CreateScheduledJobRequest** | **Schedulerv3CreateScheduledJobRequest**|  |


### Return type

**Schedulerv3CreateScheduledJobResponse**

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

# **schedulerServiceDeleteScheduledJob**
> Schedulerv3DeleteScheduledJobResponse schedulerServiceDeleteScheduledJob()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .SchedulerServiceApi(configuration);

let body:.SchedulerServiceApiSchedulerServiceDeleteScheduledJobRequest = {
  // string | Unique ID, required for delete.
  scheduleId: "schedule_id_example",
};

apiInstance.schedulerServiceDeleteScheduledJob(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scheduleId** | [**string**] | Unique ID, required for delete. | defaults to undefined


### Return type

**Schedulerv3DeleteScheduledJobResponse**

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

# **schedulerServiceGetDependencies**
> Schedulerv3GetDependenciesResponse schedulerServiceGetDependencies()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .SchedulerServiceApi(configuration);

let body:.SchedulerServiceApiSchedulerServiceGetDependenciesRequest = {
  // string | specify the configuration entry type: Distribution.Rule, workflow_investigation_link, workflow_response_template, etc. (optional)
  configType: "config_type_example",
};

apiInstance.schedulerServiceGetDependencies(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configType** | [**string**] | specify the configuration entry type: Distribution.Rule, workflow_investigation_link, workflow_response_template, etc. | (optional) defaults to undefined


### Return type

**Schedulerv3GetDependenciesResponse**

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

# **schedulerServiceGetDistributionRules**
> Schedulerv3GetDistributionRulesResponse schedulerServiceGetDistributionRules()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .SchedulerServiceApi(configuration);

let body:any = {};

apiInstance.schedulerServiceGetDistributionRules(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Schedulerv3GetDistributionRulesResponse**

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

# **schedulerServiceGetScheduledJobDetails**
> Schedulerv3GetScheduledJobResponse schedulerServiceGetScheduledJobDetails()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .SchedulerServiceApi(configuration);

let body:.SchedulerServiceApiSchedulerServiceGetScheduledJobDetailsRequest = {
  // string | Used to return a single scheduledjob.
  scheduleId: "schedule_id_example",
};

apiInstance.schedulerServiceGetScheduledJobDetails(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scheduleId** | [**string**] | Used to return a single scheduledjob. | defaults to undefined


### Return type

**Schedulerv3GetScheduledJobResponse**

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

# **schedulerServiceGetScheduledJobs**
> Schedulerv3ScheduledJobSummaryResponse schedulerServiceGetScheduledJobs()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .SchedulerServiceApi(configuration);

let body:.SchedulerServiceApiSchedulerServiceGetScheduledJobsRequest = {
  // number | Optional: the amount to offset the rows by for pagination. (optional)
  offset: 1,
  // number | Optional: the max amount of rows to return for pagination. (optional)
  limit: 1,
};

apiInstance.schedulerServiceGetScheduledJobs(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | [**number**] | Optional: the amount to offset the rows by for pagination. | (optional) defaults to undefined
 **limit** | [**number**] | Optional: the max amount of rows to return for pagination. | (optional) defaults to undefined


### Return type

**Schedulerv3ScheduledJobSummaryResponse**

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

# **schedulerServiceGetSchedulesByReport**
> Schedulerv3GetSchedulesByReportResponse schedulerServiceGetSchedulesByReport(schedulerv3GetSchedulesByReportRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .SchedulerServiceApi(configuration);

let body:.SchedulerServiceApiSchedulerServiceGetSchedulesByReportRequest = {
  // string | Report ID for the scheduled report.
  reportId: "report_id_example",
  // Schedulerv3GetSchedulesByReportRequest
  schedulerv3GetSchedulesByReportRequest: {
    reportId: "reportId_example",
  },
};

apiInstance.schedulerServiceGetSchedulesByReport(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **schedulerv3GetSchedulesByReportRequest** | **Schedulerv3GetSchedulesByReportRequest**|  |
 **reportId** | [**string**] | Report ID for the scheduled report. | defaults to undefined


### Return type

**Schedulerv3GetSchedulesByReportResponse**

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

# **schedulerServiceGetTags**
> Schedulerv3GetTagsResponse schedulerServiceGetTags()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .SchedulerServiceApi(configuration);

let body:any = {};

apiInstance.schedulerServiceGetTags(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Schedulerv3GetTagsResponse**

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

# **schedulerServiceSearchScheduledJobs**
> Schedulerv3ScheduledJobSummaryResponse schedulerServiceSearchScheduledJobs(schedulerv3SearchScheduledJobsRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .SchedulerServiceApi(configuration);

let body:.SchedulerServiceApiSchedulerServiceSearchScheduledJobsRequest = {
  // Schedulerv3SearchScheduledJobsRequest
  schedulerv3SearchScheduledJobsRequest: {
    limit: 1,
    offset: 1,
    filter: {
      enabled: "enabled_example",
      endTime: new Date('1970-01-01T00:00:00.00Z'),
      ignoreAcl: true,
      nameFilter: [
        "nameFilter_example",
      ],
      startTime: new Date('1970-01-01T00:00:00.00Z'),
      statusFilter: [
        "UNDEFINED",
      ],
      tagFilter: "tagFilter_example",
    },
  },
};

apiInstance.schedulerServiceSearchScheduledJobs(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **schedulerv3SearchScheduledJobsRequest** | **Schedulerv3SearchScheduledJobsRequest**|  |


### Return type

**Schedulerv3ScheduledJobSummaryResponse**

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

# **schedulerServiceSearchScheduledTaskRuns**
> Schedulerv3SearchScheduledTaskRunsResponse schedulerServiceSearchScheduledTaskRuns(schedulerv3SearchScheduledTaskRunsRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .SchedulerServiceApi(configuration);

let body:.SchedulerServiceApiSchedulerServiceSearchScheduledTaskRunsRequest = {
  // Schedulerv3SearchScheduledTaskRunsRequest
  schedulerv3SearchScheduledTaskRunsRequest: {
    limit: 1,
    offset: 1,
    scheduledJobId: [
      "scheduledJobId_example",
    ],
    withLatest: true,
  },
};

apiInstance.schedulerServiceSearchScheduledTaskRuns(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **schedulerv3SearchScheduledTaskRunsRequest** | **Schedulerv3SearchScheduledTaskRunsRequest**|  |


### Return type

**Schedulerv3SearchScheduledTaskRunsResponse**

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

# **schedulerServiceUpdateScheduledJob**
> Schedulerv3UpdateScheduledJobResponse schedulerServiceUpdateScheduledJob(schedulerv3UpdateScheduledJobRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .SchedulerServiceApi(configuration);

let body:.SchedulerServiceApiSchedulerServiceUpdateScheduledJobRequest = {
  // string | Unique ID, required for update.
  scheduleId: "schedule_id_example",
  // Schedulerv3UpdateScheduledJobRequest
  schedulerv3UpdateScheduledJobRequest: {
    query: {
      "key": "key_example",
    },
    scheduleId: "scheduleId_example",
    scheduledJob: {
      description: "description_example",
      enabled: true,
      instructions: "instructions_example",
      internalAudit: "UNDEFINED_TYPE",
      name: "name_example",
      notification: "UNDEFINED_NOTIFICATION",
      origin: "origin_example",
      recipient: {
        integrationId: "integrationId_example",
        label: "label_example",
        templateId: "templateId_example",
        type: "UNDEFINED_RECTYPE",
        value: "value_example",
      },
      recipients: [
        {
          integrationId: "integrationId_example",
          label: "label_example",
          templateId: "templateId_example",
          type: "UNDEFINED_RECTYPE",
          value: "value_example",
        },
      ],
      retention: {
        archive: true,
        days: 1,
      },
      scheduler: {
        beginSchedule: new Date('1970-01-01T00:00:00.00Z'),
        byDayOfMonth: true,
        dayOfMonth: "dayOfMonth_example",
        dayOfWeek: [
          "UNDEFINED_DAY",
        ],
        dayOrder: "UNDEFINED_ORDER",
        dayOrderDayOfWeek: "UNDEFINED_DAY",
        endSchedule: new Date('1970-01-01T00:00:00.00Z'),
        frequency: "UNDEFINED_FREQUENCY",
        months: [
          "EVERYMONTH",
        ],
        neverEnd: true,
        repeat: 1,
        repeatBegin: {
          hour: 1,
          minute: 1,
          timezone: "timezone_example",
        },
        repeatEnd: {
          hour: 1,
          minute: 1,
          timezone: "timezone_example",
        },
        repeatMinutes: 1,
        runOnceNow: true,
      },
      tags: [
        "tags_example",
      ],
      tasks: [
        {
          auditType: "UNDEFINED_TYPE",
          deliveryMethod: {
            fileFormat: "UNDEFINED_FORMAT",
            reportTimeZone: "reportTimeZone_example",
          },
          distributionRuleIds: [
            "distributionRuleIds_example",
          ],
          emailSubject: "emailSubject_example",
          instructions: "instructions_example",
          name: "name_example",
          parameter: {
            dataImportParameter: {
              extraDetail: "extraDetail_example",
              integrationId: "integrationId_example",
              templateId: "templateId_example",
              value: "value_example",
            },
            reportParameter: {
              extraDetail: "extraDetail_example",
              reportId: "reportId_example",
              reportName: "reportName_example",
              runtimeParameters: [
                {
                  key: "key_example",
                  label: "label_example",
                  operatorType: "UNDEFINED_OPERATOR_TYPE",
                  runtimeParameterType: "UNDEFINED_TYPE",
                  runtimeParameterTypeLength: 1,
                  value: "value_example",
                },
              ],
              syncExecutionDate: true,
              threshold: 1,
            },
          },
          recipients: [
            {
              integrationId: "integrationId_example",
              label: "label_example",
              templateId: "templateId_example",
              type: "UNDEFINED_RECTYPE",
              value: "value_example",
            },
          ],
          reportFilters: {
            bracketsId: 1,
            filterName: "filterName_example",
            filtersArray: [
              {
                brackets: ,
                condition: {
                  caseInsensitive: true,
                  fieldNlsTranslationKey: "fieldNlsTranslationKey_example",
                  filterId: 1,
                  groupTypeId: 1,
                  headerId: "headerId_example",
                  headerName: "headerName_example",
                  headerType: "UNDEFINED_TYPE",
                  inReportDateRange: {
                    endDate: "endDate_example",
                    endNumber: 1,
                    endUnit: "UNDEFINED_UINT_TYPE",
                    startDate: "startDate_example",
                    startNumber: 1,
                    startUnit: "UNDEFINED_UINT_TYPE",
                    type: "UNDEFINED_DATE_RANGE_TYPE",
                  },
                  inReportFieldNlsKey: "inReportFieldNlsKey_example",
                  inReportHeaderId: "inReportHeaderId_example",
                  inReportHeaderName: "inReportHeaderName_example",
                  inReportId: "inReportId_example",
                  inReportName: "inReportName_example",
                  inReportTableName: "inReportTableName_example",
                  isTuple: true,
                  operatorType: "UNDEFINED_OPERATOR_TYPE",
                  parameterType: "UNDEFINED_PARAM_TYPE",
                  schemaName: "schemaName_example",
                  sequence: 1,
                  tableName: "tableName_example",
                  tupleType: "tupleType_example",
                  values: [
                    "values_example",
                  ],
                },
              },
            ],
            havingArray: [
              {
                condition: {
                  aggregationType: "UNDEFINED_AGG_TYPE",
                  headerId: "headerId_example",
                  headerName: "headerName_example",
                  operatorType: "UNDEFINED_OPERATOR_TYPE",
                  tableName: "tableName_example",
                  value: "value_example",
                },
              },
            ],
            isCustom: true,
            optionType: "UNDEFINED_OPTION_TYPE",
            sequence: 1,
          },
          scheduledTaskId: "scheduledTaskId_example",
          type: "UNDEFINED_JOBTYPE",
          workflowInvestigationLinks: [
            {
              display: "display_example",
              id: "id_example",
              type: "type_example",
            },
          ],
          workflowResponseTemplate: {
            display: "display_example",
            id: "id_example",
            type: "type_example",
          },
          workflowType: "REVIEW_NONE",
          workflowUniqueFields: [
            "workflowUniqueFields_example",
          ],
        },
      ],
    },
  },
};

apiInstance.schedulerServiceUpdateScheduledJob(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **schedulerv3UpdateScheduledJobRequest** | **Schedulerv3UpdateScheduledJobRequest**|  |
 **scheduleId** | [**string**] | Unique ID, required for update. | defaults to undefined


### Return type

**Schedulerv3UpdateScheduledJobResponse**

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


