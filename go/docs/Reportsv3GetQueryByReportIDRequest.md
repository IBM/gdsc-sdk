# Reportsv3GetQueryByReportIDRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AddGroupLiteral** | Pointer to **string** |  | [optional] 
**AddJobIdLiteral** | Pointer to **string** |  | [optional] 
**DateRange** | Pointer to [**Reportsv3DateRange**](Reportsv3DateRange.md) |  | [optional] 
**DefaultChartExpanded** | Pointer to **bool** | Optional: if report has chart -send  default_chart_expanded be saved in user settings collection per report and user. | [optional] 
**ExcludeGroupId** | Pointer to **string** |  | [optional] 
**FacetSelectedHeader** | Pointer to [**Reportsv3ReportHeader**](Reportsv3ReportHeader.md) |  | [optional] 
**FilterForJobId** | Pointer to **string** |  | [optional] 
**JobType** | Pointer to [**Reportsv3JobType**](Reportsv3JobType.md) |  | [optional] [default to UNDEFINED_JOB_TYPE]
**ModelTypes** | Pointer to [**[]Reportsv3ModelType**](Reportsv3ModelType.md) |  | [optional] 
**ReportId** | Pointer to **string** | The id of the Report we wish to run. | [optional] 
**SqlType** | Pointer to [**Reportsv3SqlType**](Reportsv3SqlType.md) |  | [optional] [default to UNDEFINED_SQL_TYPE]
**TableJoinOptimization** | Pointer to **bool** | Optional: disable or enable the table join optimization. | [optional] 

## Methods

### NewReportsv3GetQueryByReportIDRequest

`func NewReportsv3GetQueryByReportIDRequest() *Reportsv3GetQueryByReportIDRequest`

NewReportsv3GetQueryByReportIDRequest instantiates a new Reportsv3GetQueryByReportIDRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewReportsv3GetQueryByReportIDRequestWithDefaults

`func NewReportsv3GetQueryByReportIDRequestWithDefaults() *Reportsv3GetQueryByReportIDRequest`

NewReportsv3GetQueryByReportIDRequestWithDefaults instantiates a new Reportsv3GetQueryByReportIDRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAddGroupLiteral

`func (o *Reportsv3GetQueryByReportIDRequest) GetAddGroupLiteral() string`

GetAddGroupLiteral returns the AddGroupLiteral field if non-nil, zero value otherwise.

### GetAddGroupLiteralOk

`func (o *Reportsv3GetQueryByReportIDRequest) GetAddGroupLiteralOk() (*string, bool)`

GetAddGroupLiteralOk returns a tuple with the AddGroupLiteral field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAddGroupLiteral

`func (o *Reportsv3GetQueryByReportIDRequest) SetAddGroupLiteral(v string)`

SetAddGroupLiteral sets AddGroupLiteral field to given value.

### HasAddGroupLiteral

`func (o *Reportsv3GetQueryByReportIDRequest) HasAddGroupLiteral() bool`

HasAddGroupLiteral returns a boolean if a field has been set.

### GetAddJobIdLiteral

`func (o *Reportsv3GetQueryByReportIDRequest) GetAddJobIdLiteral() string`

GetAddJobIdLiteral returns the AddJobIdLiteral field if non-nil, zero value otherwise.

### GetAddJobIdLiteralOk

`func (o *Reportsv3GetQueryByReportIDRequest) GetAddJobIdLiteralOk() (*string, bool)`

GetAddJobIdLiteralOk returns a tuple with the AddJobIdLiteral field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAddJobIdLiteral

`func (o *Reportsv3GetQueryByReportIDRequest) SetAddJobIdLiteral(v string)`

SetAddJobIdLiteral sets AddJobIdLiteral field to given value.

### HasAddJobIdLiteral

`func (o *Reportsv3GetQueryByReportIDRequest) HasAddJobIdLiteral() bool`

HasAddJobIdLiteral returns a boolean if a field has been set.

### GetDateRange

`func (o *Reportsv3GetQueryByReportIDRequest) GetDateRange() Reportsv3DateRange`

GetDateRange returns the DateRange field if non-nil, zero value otherwise.

### GetDateRangeOk

`func (o *Reportsv3GetQueryByReportIDRequest) GetDateRangeOk() (*Reportsv3DateRange, bool)`

GetDateRangeOk returns a tuple with the DateRange field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDateRange

`func (o *Reportsv3GetQueryByReportIDRequest) SetDateRange(v Reportsv3DateRange)`

SetDateRange sets DateRange field to given value.

### HasDateRange

`func (o *Reportsv3GetQueryByReportIDRequest) HasDateRange() bool`

HasDateRange returns a boolean if a field has been set.

### GetDefaultChartExpanded

`func (o *Reportsv3GetQueryByReportIDRequest) GetDefaultChartExpanded() bool`

GetDefaultChartExpanded returns the DefaultChartExpanded field if non-nil, zero value otherwise.

### GetDefaultChartExpandedOk

`func (o *Reportsv3GetQueryByReportIDRequest) GetDefaultChartExpandedOk() (*bool, bool)`

GetDefaultChartExpandedOk returns a tuple with the DefaultChartExpanded field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefaultChartExpanded

`func (o *Reportsv3GetQueryByReportIDRequest) SetDefaultChartExpanded(v bool)`

SetDefaultChartExpanded sets DefaultChartExpanded field to given value.

### HasDefaultChartExpanded

`func (o *Reportsv3GetQueryByReportIDRequest) HasDefaultChartExpanded() bool`

HasDefaultChartExpanded returns a boolean if a field has been set.

### GetExcludeGroupId

`func (o *Reportsv3GetQueryByReportIDRequest) GetExcludeGroupId() string`

GetExcludeGroupId returns the ExcludeGroupId field if non-nil, zero value otherwise.

### GetExcludeGroupIdOk

`func (o *Reportsv3GetQueryByReportIDRequest) GetExcludeGroupIdOk() (*string, bool)`

GetExcludeGroupIdOk returns a tuple with the ExcludeGroupId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExcludeGroupId

`func (o *Reportsv3GetQueryByReportIDRequest) SetExcludeGroupId(v string)`

SetExcludeGroupId sets ExcludeGroupId field to given value.

### HasExcludeGroupId

`func (o *Reportsv3GetQueryByReportIDRequest) HasExcludeGroupId() bool`

HasExcludeGroupId returns a boolean if a field has been set.

### GetFacetSelectedHeader

`func (o *Reportsv3GetQueryByReportIDRequest) GetFacetSelectedHeader() Reportsv3ReportHeader`

GetFacetSelectedHeader returns the FacetSelectedHeader field if non-nil, zero value otherwise.

### GetFacetSelectedHeaderOk

`func (o *Reportsv3GetQueryByReportIDRequest) GetFacetSelectedHeaderOk() (*Reportsv3ReportHeader, bool)`

GetFacetSelectedHeaderOk returns a tuple with the FacetSelectedHeader field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFacetSelectedHeader

`func (o *Reportsv3GetQueryByReportIDRequest) SetFacetSelectedHeader(v Reportsv3ReportHeader)`

SetFacetSelectedHeader sets FacetSelectedHeader field to given value.

### HasFacetSelectedHeader

`func (o *Reportsv3GetQueryByReportIDRequest) HasFacetSelectedHeader() bool`

HasFacetSelectedHeader returns a boolean if a field has been set.

### GetFilterForJobId

`func (o *Reportsv3GetQueryByReportIDRequest) GetFilterForJobId() string`

GetFilterForJobId returns the FilterForJobId field if non-nil, zero value otherwise.

### GetFilterForJobIdOk

`func (o *Reportsv3GetQueryByReportIDRequest) GetFilterForJobIdOk() (*string, bool)`

GetFilterForJobIdOk returns a tuple with the FilterForJobId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilterForJobId

`func (o *Reportsv3GetQueryByReportIDRequest) SetFilterForJobId(v string)`

SetFilterForJobId sets FilterForJobId field to given value.

### HasFilterForJobId

`func (o *Reportsv3GetQueryByReportIDRequest) HasFilterForJobId() bool`

HasFilterForJobId returns a boolean if a field has been set.

### GetJobType

`func (o *Reportsv3GetQueryByReportIDRequest) GetJobType() Reportsv3JobType`

GetJobType returns the JobType field if non-nil, zero value otherwise.

### GetJobTypeOk

`func (o *Reportsv3GetQueryByReportIDRequest) GetJobTypeOk() (*Reportsv3JobType, bool)`

GetJobTypeOk returns a tuple with the JobType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetJobType

`func (o *Reportsv3GetQueryByReportIDRequest) SetJobType(v Reportsv3JobType)`

SetJobType sets JobType field to given value.

### HasJobType

`func (o *Reportsv3GetQueryByReportIDRequest) HasJobType() bool`

HasJobType returns a boolean if a field has been set.

### GetModelTypes

`func (o *Reportsv3GetQueryByReportIDRequest) GetModelTypes() []Reportsv3ModelType`

GetModelTypes returns the ModelTypes field if non-nil, zero value otherwise.

### GetModelTypesOk

`func (o *Reportsv3GetQueryByReportIDRequest) GetModelTypesOk() (*[]Reportsv3ModelType, bool)`

GetModelTypesOk returns a tuple with the ModelTypes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModelTypes

`func (o *Reportsv3GetQueryByReportIDRequest) SetModelTypes(v []Reportsv3ModelType)`

SetModelTypes sets ModelTypes field to given value.

### HasModelTypes

`func (o *Reportsv3GetQueryByReportIDRequest) HasModelTypes() bool`

HasModelTypes returns a boolean if a field has been set.

### GetReportId

`func (o *Reportsv3GetQueryByReportIDRequest) GetReportId() string`

GetReportId returns the ReportId field if non-nil, zero value otherwise.

### GetReportIdOk

`func (o *Reportsv3GetQueryByReportIDRequest) GetReportIdOk() (*string, bool)`

GetReportIdOk returns a tuple with the ReportId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReportId

`func (o *Reportsv3GetQueryByReportIDRequest) SetReportId(v string)`

SetReportId sets ReportId field to given value.

### HasReportId

`func (o *Reportsv3GetQueryByReportIDRequest) HasReportId() bool`

HasReportId returns a boolean if a field has been set.

### GetSqlType

`func (o *Reportsv3GetQueryByReportIDRequest) GetSqlType() Reportsv3SqlType`

GetSqlType returns the SqlType field if non-nil, zero value otherwise.

### GetSqlTypeOk

`func (o *Reportsv3GetQueryByReportIDRequest) GetSqlTypeOk() (*Reportsv3SqlType, bool)`

GetSqlTypeOk returns a tuple with the SqlType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSqlType

`func (o *Reportsv3GetQueryByReportIDRequest) SetSqlType(v Reportsv3SqlType)`

SetSqlType sets SqlType field to given value.

### HasSqlType

`func (o *Reportsv3GetQueryByReportIDRequest) HasSqlType() bool`

HasSqlType returns a boolean if a field has been set.

### GetTableJoinOptimization

`func (o *Reportsv3GetQueryByReportIDRequest) GetTableJoinOptimization() bool`

GetTableJoinOptimization returns the TableJoinOptimization field if non-nil, zero value otherwise.

### GetTableJoinOptimizationOk

`func (o *Reportsv3GetQueryByReportIDRequest) GetTableJoinOptimizationOk() (*bool, bool)`

GetTableJoinOptimizationOk returns a tuple with the TableJoinOptimization field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTableJoinOptimization

`func (o *Reportsv3GetQueryByReportIDRequest) SetTableJoinOptimization(v bool)`

SetTableJoinOptimization sets TableJoinOptimization field to given value.

### HasTableJoinOptimization

`func (o *Reportsv3GetQueryByReportIDRequest) HasTableJoinOptimization() bool`

HasTableJoinOptimization returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


