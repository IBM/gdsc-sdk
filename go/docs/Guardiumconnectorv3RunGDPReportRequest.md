# Guardiumconnectorv3RunGDPReportRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CentralManagerId** | Pointer to **string** | Central Manager ID. | [optional] 
**MaxFetchSize** | Pointer to **int32** | Maximum number of rows to retrieve if not specified will retrieve the maximum number of rows allowed by GDP for CSV export can&#39;t be larger than the configured maximum number of rows for CSV export on specified central manager. | [optional] 
**ReportName** | Pointer to **string** | Name of the report. | [optional] 
**ReportParameters** | Pointer to [**[]Guardiumconnectorv3GDPReportParameter**](Guardiumconnectorv3GDPReportParameter.md) | Report parameters. | [optional] 
**SortColumn** | Pointer to **string** | Column to sort on if not specified returns rows in default sort order of the report. | [optional] 
**SortOrder** | Pointer to [**RunGDPReportRequestSortOrder**](RunGDPReportRequestSortOrder.md) |  | [optional] [default to ACS]
**StartFrom** | Pointer to **int32** | Result row index to retrieve from if not specified returns results from the beginning. | [optional] 

## Methods

### NewGuardiumconnectorv3RunGDPReportRequest

`func NewGuardiumconnectorv3RunGDPReportRequest() *Guardiumconnectorv3RunGDPReportRequest`

NewGuardiumconnectorv3RunGDPReportRequest instantiates a new Guardiumconnectorv3RunGDPReportRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGuardiumconnectorv3RunGDPReportRequestWithDefaults

`func NewGuardiumconnectorv3RunGDPReportRequestWithDefaults() *Guardiumconnectorv3RunGDPReportRequest`

NewGuardiumconnectorv3RunGDPReportRequestWithDefaults instantiates a new Guardiumconnectorv3RunGDPReportRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCentralManagerId

`func (o *Guardiumconnectorv3RunGDPReportRequest) GetCentralManagerId() string`

GetCentralManagerId returns the CentralManagerId field if non-nil, zero value otherwise.

### GetCentralManagerIdOk

`func (o *Guardiumconnectorv3RunGDPReportRequest) GetCentralManagerIdOk() (*string, bool)`

GetCentralManagerIdOk returns a tuple with the CentralManagerId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCentralManagerId

`func (o *Guardiumconnectorv3RunGDPReportRequest) SetCentralManagerId(v string)`

SetCentralManagerId sets CentralManagerId field to given value.

### HasCentralManagerId

`func (o *Guardiumconnectorv3RunGDPReportRequest) HasCentralManagerId() bool`

HasCentralManagerId returns a boolean if a field has been set.

### GetMaxFetchSize

`func (o *Guardiumconnectorv3RunGDPReportRequest) GetMaxFetchSize() int32`

GetMaxFetchSize returns the MaxFetchSize field if non-nil, zero value otherwise.

### GetMaxFetchSizeOk

`func (o *Guardiumconnectorv3RunGDPReportRequest) GetMaxFetchSizeOk() (*int32, bool)`

GetMaxFetchSizeOk returns a tuple with the MaxFetchSize field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxFetchSize

`func (o *Guardiumconnectorv3RunGDPReportRequest) SetMaxFetchSize(v int32)`

SetMaxFetchSize sets MaxFetchSize field to given value.

### HasMaxFetchSize

`func (o *Guardiumconnectorv3RunGDPReportRequest) HasMaxFetchSize() bool`

HasMaxFetchSize returns a boolean if a field has been set.

### GetReportName

`func (o *Guardiumconnectorv3RunGDPReportRequest) GetReportName() string`

GetReportName returns the ReportName field if non-nil, zero value otherwise.

### GetReportNameOk

`func (o *Guardiumconnectorv3RunGDPReportRequest) GetReportNameOk() (*string, bool)`

GetReportNameOk returns a tuple with the ReportName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReportName

`func (o *Guardiumconnectorv3RunGDPReportRequest) SetReportName(v string)`

SetReportName sets ReportName field to given value.

### HasReportName

`func (o *Guardiumconnectorv3RunGDPReportRequest) HasReportName() bool`

HasReportName returns a boolean if a field has been set.

### GetReportParameters

`func (o *Guardiumconnectorv3RunGDPReportRequest) GetReportParameters() []Guardiumconnectorv3GDPReportParameter`

GetReportParameters returns the ReportParameters field if non-nil, zero value otherwise.

### GetReportParametersOk

`func (o *Guardiumconnectorv3RunGDPReportRequest) GetReportParametersOk() (*[]Guardiumconnectorv3GDPReportParameter, bool)`

GetReportParametersOk returns a tuple with the ReportParameters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReportParameters

`func (o *Guardiumconnectorv3RunGDPReportRequest) SetReportParameters(v []Guardiumconnectorv3GDPReportParameter)`

SetReportParameters sets ReportParameters field to given value.

### HasReportParameters

`func (o *Guardiumconnectorv3RunGDPReportRequest) HasReportParameters() bool`

HasReportParameters returns a boolean if a field has been set.

### GetSortColumn

`func (o *Guardiumconnectorv3RunGDPReportRequest) GetSortColumn() string`

GetSortColumn returns the SortColumn field if non-nil, zero value otherwise.

### GetSortColumnOk

`func (o *Guardiumconnectorv3RunGDPReportRequest) GetSortColumnOk() (*string, bool)`

GetSortColumnOk returns a tuple with the SortColumn field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSortColumn

`func (o *Guardiumconnectorv3RunGDPReportRequest) SetSortColumn(v string)`

SetSortColumn sets SortColumn field to given value.

### HasSortColumn

`func (o *Guardiumconnectorv3RunGDPReportRequest) HasSortColumn() bool`

HasSortColumn returns a boolean if a field has been set.

### GetSortOrder

`func (o *Guardiumconnectorv3RunGDPReportRequest) GetSortOrder() RunGDPReportRequestSortOrder`

GetSortOrder returns the SortOrder field if non-nil, zero value otherwise.

### GetSortOrderOk

`func (o *Guardiumconnectorv3RunGDPReportRequest) GetSortOrderOk() (*RunGDPReportRequestSortOrder, bool)`

GetSortOrderOk returns a tuple with the SortOrder field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSortOrder

`func (o *Guardiumconnectorv3RunGDPReportRequest) SetSortOrder(v RunGDPReportRequestSortOrder)`

SetSortOrder sets SortOrder field to given value.

### HasSortOrder

`func (o *Guardiumconnectorv3RunGDPReportRequest) HasSortOrder() bool`

HasSortOrder returns a boolean if a field has been set.

### GetStartFrom

`func (o *Guardiumconnectorv3RunGDPReportRequest) GetStartFrom() int32`

GetStartFrom returns the StartFrom field if non-nil, zero value otherwise.

### GetStartFromOk

`func (o *Guardiumconnectorv3RunGDPReportRequest) GetStartFromOk() (*int32, bool)`

GetStartFromOk returns a tuple with the StartFrom field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStartFrom

`func (o *Guardiumconnectorv3RunGDPReportRequest) SetStartFrom(v int32)`

SetStartFrom sets StartFrom field to given value.

### HasStartFrom

`func (o *Guardiumconnectorv3RunGDPReportRequest) HasStartFrom() bool`

HasStartFrom returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


