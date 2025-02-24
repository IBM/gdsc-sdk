# .ComplianceAcceleratorApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**complianceAcceleratorCreateWorkspace**](ComplianceAcceleratorApi.md#complianceAcceleratorCreateWorkspace) | **POST** /api/v3/compliance/workspace | Summary: Create workspace Description: Create a workspace.
[**complianceAcceleratorDeleteComplianceWorkspaces**](ComplianceAcceleratorApi.md#complianceAcceleratorDeleteComplianceWorkspaces) | **DELETE** /api/v3/compliance | Summary: Delete compliance workspaces Description: Delete workspaces.
[**complianceAcceleratorGetComplianceInfo**](ComplianceAcceleratorApi.md#complianceAcceleratorGetComplianceInfo) | **GET** /api/v3/compliance | Summary: Get compliance info Description: Return stored compliance data.
[**complianceAcceleratorHydrateWorkspace**](ComplianceAcceleratorApi.md#complianceAcceleratorHydrateWorkspace) | **POST** /api/v3/compliance/workspace/hydrate | HydrateWorkspace - Hydrates specified objects within a workspace
[**complianceAcceleratorStoreComplianceInfo**](ComplianceAcceleratorApi.md#complianceAcceleratorStoreComplianceInfo) | **POST** /api/v3/compliance | Summary: Store compliance info Description: Store compliance data.


# **complianceAcceleratorCreateWorkspace**
> StreamResultOfComplianceacceleratorv3CreateWorkspaceResponse complianceAcceleratorCreateWorkspace(complianceacceleratorv3CreateWorkspaceRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ComplianceAcceleratorApi(configuration);

let body:.ComplianceAcceleratorApiComplianceAcceleratorCreateWorkspaceRequest = {
  // Complianceacceleratorv3CreateWorkspaceRequest
  complianceacceleratorv3CreateWorkspaceRequest: {
    complianceInfo: {
      options: {
        emailConfig: {
          integrationId: "integrationId_example",
          templateId: "templateId_example",
        },
        parentGroups: {
          "key": {
            desc: "desc_example",
            groupTypeId: 1,
            id: 1,
            ldapConfig: {
              attributes: [
                "attributes_example",
              ],
              bindGroupId: 1,
              bindPassword: "bindPassword_example",
              clearGroup: true,
              filter: "filter_example",
              filterScope: 1,
              importLimit: 1,
              ldapGroupName: "ldapGroupName_example",
              ldapId: "ldapId_example",
              memberPrefix: "memberPrefix_example",
            },
            members: [
              {
                memberId: "memberId_example",
                name: "name_example",
              },
            ],
            membersToAdd: [
              "membersToAdd_example",
            ],
            membersToDelete: [
              {
                memberId: "memberId_example",
                name: "name_example",
              },
            ],
            name: "name_example",
            parent: true,
          },
        },
        policyId: "policyId_example",
        rules: {
          "key": {
            actions: {
              "key": {
                notificationType: "UNDEFINED_RECTYPE",
                userIds: [
                  "userIds_example",
                ],
              },
            },
            ruleId: "ruleId_example",
          },
        },
        syslogConfig: {
          host: "host_example",
          includeQRadar: true,
          isDeletion: true,
          name: "name_example",
          port: "port_example",
          protocol: "protocol_example",
          syslogId: "syslogId_example",
          templateId: "templateId_example",
        },
        tasks: {
          "key": "UNDEFINED",
        },
      },
      workspaces: {
        "key": {
          auditInfo: {
            description: "description_example",
            enabled: true,
            id: "id_example",
            instructions: "instructions_example",
            isDeletion: true,
            name: "name_example",
            owner: {
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
            reportKey: "reportKey_example",
            runOnceNow: true,
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
            },
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
          dashboards: [
            {
              ID: "ID_example",
              type: "UNDEFINED_DASH",
            },
          ],
          groups: {
            "key": {
              desc: "desc_example",
              groupTypeId: 1,
              id: 1,
              ldapConfig: {
                attributes: [
                  "attributes_example",
                ],
                bindGroupId: 1,
                bindPassword: "bindPassword_example",
                clearGroup: true,
                filter: "filter_example",
                filterScope: 1,
                importLimit: 1,
                ldapGroupName: "ldapGroupName_example",
                ldapId: "ldapId_example",
                memberPrefix: "memberPrefix_example",
              },
              members: [
                {
                  memberId: "memberId_example",
                  name: "name_example",
                },
              ],
              membersToAdd: [
                "membersToAdd_example",
              ],
              membersToDelete: [
                {
                  memberId: "memberId_example",
                  name: "name_example",
                },
              ],
              name: "name_example",
              parent: true,
            },
          },
          reportsMap: {
            "key": {
              reports: [
                {
                  description: "description_example",
                  groupsNeeded: [
                    {
                      desc: "desc_example",
                      groupTypeId: 1,
                      id: 1,
                      ldapConfig: {
                        attributes: [
                          "attributes_example",
                        ],
                        bindGroupId: 1,
                        bindPassword: "bindPassword_example",
                        clearGroup: true,
                        filter: "filter_example",
                        filterScope: 1,
                        importLimit: 1,
                        ldapGroupName: "ldapGroupName_example",
                        ldapId: "ldapId_example",
                        memberPrefix: "memberPrefix_example",
                      },
                      members: [
                        {
                          memberId: "memberId_example",
                          name: "name_example",
                        },
                      ],
                      membersToAdd: [
                        "membersToAdd_example",
                      ],
                      membersToDelete: [
                        {
                          memberId: "memberId_example",
                          name: "name_example",
                        },
                      ],
                      name: "name_example",
                      parent: true,
                    },
                  ],
                  groupsPresent: [
                    {
                      desc: "desc_example",
                      groupTypeId: 1,
                      id: 1,
                      ldapConfig: {
                        attributes: [
                          "attributes_example",
                        ],
                        bindGroupId: 1,
                        bindPassword: "bindPassword_example",
                        clearGroup: true,
                        filter: "filter_example",
                        filterScope: 1,
                        importLimit: 1,
                        ldapGroupName: "ldapGroupName_example",
                        ldapId: "ldapId_example",
                        memberPrefix: "memberPrefix_example",
                      },
                      members: [
                        {
                          memberId: "memberId_example",
                          name: "name_example",
                        },
                      ],
                      membersToAdd: [
                        "membersToAdd_example",
                      ],
                      membersToDelete: [
                        {
                          memberId: "memberId_example",
                          name: "name_example",
                        },
                      ],
                      name: "name_example",
                      parent: true,
                    },
                  ],
                  reportId: "reportId_example",
                  reportTags: [
                    {
                      nlsKey: "nlsKey_example",
                      nlsValue: "nlsValue_example",
                    },
                  ],
                  status: "POPULATED",
                  title: "title_example",
                },
              ],
            },
          },
        },
      },
    },
  },
};

apiInstance.complianceAcceleratorCreateWorkspace(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **complianceacceleratorv3CreateWorkspaceRequest** | **Complianceacceleratorv3CreateWorkspaceRequest**|  |


### Return type

**StreamResultOfComplianceacceleratorv3CreateWorkspaceResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response.(streaming responses) |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **complianceAcceleratorDeleteComplianceWorkspaces**
> Complianceacceleratorv3DeleteComplianceWorkspacesResponse complianceAcceleratorDeleteComplianceWorkspaces()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ComplianceAcceleratorApi(configuration);

let body:.ComplianceAcceleratorApiComplianceAcceleratorDeleteComplianceWorkspacesRequest = {
  // Array<string> | Id to be deleted. (optional)
  regulations: [
    "regulations_example",
  ],
  // boolean | if you want to delete a whole configuration. (optional)
  deleteAll: true,
};

apiInstance.complianceAcceleratorDeleteComplianceWorkspaces(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **regulations** | **Array&lt;string&gt;** | Id to be deleted. | (optional) defaults to undefined
 **deleteAll** | [**boolean**] | if you want to delete a whole configuration. | (optional) defaults to undefined


### Return type

**Complianceacceleratorv3DeleteComplianceWorkspacesResponse**

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

# **complianceAcceleratorGetComplianceInfo**
> Complianceacceleratorv3GetComplianceInfoResponse complianceAcceleratorGetComplianceInfo()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ComplianceAcceleratorApi(configuration);

let body:.ComplianceAcceleratorApiComplianceAcceleratorGetComplianceInfoRequest = {
  // boolean | gives compliance workspace data without reaching out to other services - meant to be quicker for dashboards. (optional)
  isBrief: true,
};

apiInstance.complianceAcceleratorGetComplianceInfo(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **isBrief** | [**boolean**] | gives compliance workspace data without reaching out to other services - meant to be quicker for dashboards. | (optional) defaults to undefined


### Return type

**Complianceacceleratorv3GetComplianceInfoResponse**

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

# **complianceAcceleratorHydrateWorkspace**
> Complianceacceleratorv3HydrateComplianceWorkspacesResponse complianceAcceleratorHydrateWorkspace(complianceacceleratorv3HydrateComplianceWorkspacesRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ComplianceAcceleratorApi(configuration);

let body:.ComplianceAcceleratorApiComplianceAcceleratorHydrateWorkspaceRequest = {
  // Complianceacceleratorv3HydrateComplianceWorkspacesRequest
  complianceacceleratorv3HydrateComplianceWorkspacesRequest: {
    complianceId: "complianceId_example",
  },
};

apiInstance.complianceAcceleratorHydrateWorkspace(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **complianceacceleratorv3HydrateComplianceWorkspacesRequest** | **Complianceacceleratorv3HydrateComplianceWorkspacesRequest**|  |


### Return type

**Complianceacceleratorv3HydrateComplianceWorkspacesResponse**

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

# **complianceAcceleratorStoreComplianceInfo**
> Complianceacceleratorv3StoreComplianceInfoResponse complianceAcceleratorStoreComplianceInfo(complianceacceleratorv3StoreComplianceInfoRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ComplianceAcceleratorApi(configuration);

let body:.ComplianceAcceleratorApiComplianceAcceleratorStoreComplianceInfoRequest = {
  // Complianceacceleratorv3StoreComplianceInfoRequest
  complianceacceleratorv3StoreComplianceInfoRequest: {
    complianceInfo: {
      options: {
        emailConfig: {
          integrationId: "integrationId_example",
          templateId: "templateId_example",
        },
        parentGroups: {
          "key": {
            desc: "desc_example",
            groupTypeId: 1,
            id: 1,
            ldapConfig: {
              attributes: [
                "attributes_example",
              ],
              bindGroupId: 1,
              bindPassword: "bindPassword_example",
              clearGroup: true,
              filter: "filter_example",
              filterScope: 1,
              importLimit: 1,
              ldapGroupName: "ldapGroupName_example",
              ldapId: "ldapId_example",
              memberPrefix: "memberPrefix_example",
            },
            members: [
              {
                memberId: "memberId_example",
                name: "name_example",
              },
            ],
            membersToAdd: [
              "membersToAdd_example",
            ],
            membersToDelete: [
              {
                memberId: "memberId_example",
                name: "name_example",
              },
            ],
            name: "name_example",
            parent: true,
          },
        },
        policyId: "policyId_example",
        rules: {
          "key": {
            actions: {
              "key": {
                notificationType: "UNDEFINED_RECTYPE",
                userIds: [
                  "userIds_example",
                ],
              },
            },
            ruleId: "ruleId_example",
          },
        },
        syslogConfig: {
          host: "host_example",
          includeQRadar: true,
          isDeletion: true,
          name: "name_example",
          port: "port_example",
          protocol: "protocol_example",
          syslogId: "syslogId_example",
          templateId: "templateId_example",
        },
        tasks: {
          "key": "UNDEFINED",
        },
      },
      workspaces: {
        "key": {
          auditInfo: {
            description: "description_example",
            enabled: true,
            id: "id_example",
            instructions: "instructions_example",
            isDeletion: true,
            name: "name_example",
            owner: {
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
            reportKey: "reportKey_example",
            runOnceNow: true,
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
            },
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
          dashboards: [
            {
              ID: "ID_example",
              type: "UNDEFINED_DASH",
            },
          ],
          groups: {
            "key": {
              desc: "desc_example",
              groupTypeId: 1,
              id: 1,
              ldapConfig: {
                attributes: [
                  "attributes_example",
                ],
                bindGroupId: 1,
                bindPassword: "bindPassword_example",
                clearGroup: true,
                filter: "filter_example",
                filterScope: 1,
                importLimit: 1,
                ldapGroupName: "ldapGroupName_example",
                ldapId: "ldapId_example",
                memberPrefix: "memberPrefix_example",
              },
              members: [
                {
                  memberId: "memberId_example",
                  name: "name_example",
                },
              ],
              membersToAdd: [
                "membersToAdd_example",
              ],
              membersToDelete: [
                {
                  memberId: "memberId_example",
                  name: "name_example",
                },
              ],
              name: "name_example",
              parent: true,
            },
          },
          reportsMap: {
            "key": {
              reports: [
                {
                  description: "description_example",
                  groupsNeeded: [
                    {
                      desc: "desc_example",
                      groupTypeId: 1,
                      id: 1,
                      ldapConfig: {
                        attributes: [
                          "attributes_example",
                        ],
                        bindGroupId: 1,
                        bindPassword: "bindPassword_example",
                        clearGroup: true,
                        filter: "filter_example",
                        filterScope: 1,
                        importLimit: 1,
                        ldapGroupName: "ldapGroupName_example",
                        ldapId: "ldapId_example",
                        memberPrefix: "memberPrefix_example",
                      },
                      members: [
                        {
                          memberId: "memberId_example",
                          name: "name_example",
                        },
                      ],
                      membersToAdd: [
                        "membersToAdd_example",
                      ],
                      membersToDelete: [
                        {
                          memberId: "memberId_example",
                          name: "name_example",
                        },
                      ],
                      name: "name_example",
                      parent: true,
                    },
                  ],
                  groupsPresent: [
                    {
                      desc: "desc_example",
                      groupTypeId: 1,
                      id: 1,
                      ldapConfig: {
                        attributes: [
                          "attributes_example",
                        ],
                        bindGroupId: 1,
                        bindPassword: "bindPassword_example",
                        clearGroup: true,
                        filter: "filter_example",
                        filterScope: 1,
                        importLimit: 1,
                        ldapGroupName: "ldapGroupName_example",
                        ldapId: "ldapId_example",
                        memberPrefix: "memberPrefix_example",
                      },
                      members: [
                        {
                          memberId: "memberId_example",
                          name: "name_example",
                        },
                      ],
                      membersToAdd: [
                        "membersToAdd_example",
                      ],
                      membersToDelete: [
                        {
                          memberId: "memberId_example",
                          name: "name_example",
                        },
                      ],
                      name: "name_example",
                      parent: true,
                    },
                  ],
                  reportId: "reportId_example",
                  reportTags: [
                    {
                      nlsKey: "nlsKey_example",
                      nlsValue: "nlsValue_example",
                    },
                  ],
                  status: "POPULATED",
                  title: "title_example",
                },
              ],
            },
          },
        },
      },
    },
  },
};

apiInstance.complianceAcceleratorStoreComplianceInfo(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **complianceacceleratorv3StoreComplianceInfoRequest** | **Complianceacceleratorv3StoreComplianceInfoRequest**|  |


### Return type

**Complianceacceleratorv3StoreComplianceInfoResponse**

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


