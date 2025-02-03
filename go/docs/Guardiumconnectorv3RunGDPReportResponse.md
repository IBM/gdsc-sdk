# Guardiumconnectorv3RunGDPReportResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ReportData** | Pointer to [**[]Guardiumconnectorv3GDPReportResultRow**](Guardiumconnectorv3GDPReportResultRow.md) | Report data. | [optional] 
**Status** | Pointer to [**Guardiumconnectorv3StatusResponseBase**](Guardiumconnectorv3StatusResponseBase.md) |  | [optional] 

## Methods

### NewGuardiumconnectorv3RunGDPReportResponse

`func NewGuardiumconnectorv3RunGDPReportResponse() *Guardiumconnectorv3RunGDPReportResponse`

NewGuardiumconnectorv3RunGDPReportResponse instantiates a new Guardiumconnectorv3RunGDPReportResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGuardiumconnectorv3RunGDPReportResponseWithDefaults

`func NewGuardiumconnectorv3RunGDPReportResponseWithDefaults() *Guardiumconnectorv3RunGDPReportResponse`

NewGuardiumconnectorv3RunGDPReportResponseWithDefaults instantiates a new Guardiumconnectorv3RunGDPReportResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetReportData

`func (o *Guardiumconnectorv3RunGDPReportResponse) GetReportData() []Guardiumconnectorv3GDPReportResultRow`

GetReportData returns the ReportData field if non-nil, zero value otherwise.

### GetReportDataOk

`func (o *Guardiumconnectorv3RunGDPReportResponse) GetReportDataOk() (*[]Guardiumconnectorv3GDPReportResultRow, bool)`

GetReportDataOk returns a tuple with the ReportData field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReportData

`func (o *Guardiumconnectorv3RunGDPReportResponse) SetReportData(v []Guardiumconnectorv3GDPReportResultRow)`

SetReportData sets ReportData field to given value.

### HasReportData

`func (o *Guardiumconnectorv3RunGDPReportResponse) HasReportData() bool`

HasReportData returns a boolean if a field has been set.

### GetStatus

`func (o *Guardiumconnectorv3RunGDPReportResponse) GetStatus() Guardiumconnectorv3StatusResponseBase`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *Guardiumconnectorv3RunGDPReportResponse) GetStatusOk() (*Guardiumconnectorv3StatusResponseBase, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *Guardiumconnectorv3RunGDPReportResponse) SetStatus(v Guardiumconnectorv3StatusResponseBase)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *Guardiumconnectorv3RunGDPReportResponse) HasStatus() bool`

HasStatus returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


