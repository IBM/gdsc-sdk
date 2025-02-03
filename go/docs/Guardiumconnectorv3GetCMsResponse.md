# Guardiumconnectorv3GetCMsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Cms** | Pointer to [**[]Guardiumconnectorv3CM**](Guardiumconnectorv3CM.md) | List of Central Managers. | [optional] 
**Status** | Pointer to [**Guardiumconnectorv3StatusResponseBase**](Guardiumconnectorv3StatusResponseBase.md) |  | [optional] 
**TotalMus** | Pointer to **int32** | Total list of Managed Units. | [optional] 

## Methods

### NewGuardiumconnectorv3GetCMsResponse

`func NewGuardiumconnectorv3GetCMsResponse() *Guardiumconnectorv3GetCMsResponse`

NewGuardiumconnectorv3GetCMsResponse instantiates a new Guardiumconnectorv3GetCMsResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGuardiumconnectorv3GetCMsResponseWithDefaults

`func NewGuardiumconnectorv3GetCMsResponseWithDefaults() *Guardiumconnectorv3GetCMsResponse`

NewGuardiumconnectorv3GetCMsResponseWithDefaults instantiates a new Guardiumconnectorv3GetCMsResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCms

`func (o *Guardiumconnectorv3GetCMsResponse) GetCms() []Guardiumconnectorv3CM`

GetCms returns the Cms field if non-nil, zero value otherwise.

### GetCmsOk

`func (o *Guardiumconnectorv3GetCMsResponse) GetCmsOk() (*[]Guardiumconnectorv3CM, bool)`

GetCmsOk returns a tuple with the Cms field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCms

`func (o *Guardiumconnectorv3GetCMsResponse) SetCms(v []Guardiumconnectorv3CM)`

SetCms sets Cms field to given value.

### HasCms

`func (o *Guardiumconnectorv3GetCMsResponse) HasCms() bool`

HasCms returns a boolean if a field has been set.

### GetStatus

`func (o *Guardiumconnectorv3GetCMsResponse) GetStatus() Guardiumconnectorv3StatusResponseBase`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *Guardiumconnectorv3GetCMsResponse) GetStatusOk() (*Guardiumconnectorv3StatusResponseBase, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *Guardiumconnectorv3GetCMsResponse) SetStatus(v Guardiumconnectorv3StatusResponseBase)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *Guardiumconnectorv3GetCMsResponse) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetTotalMus

`func (o *Guardiumconnectorv3GetCMsResponse) GetTotalMus() int32`

GetTotalMus returns the TotalMus field if non-nil, zero value otherwise.

### GetTotalMusOk

`func (o *Guardiumconnectorv3GetCMsResponse) GetTotalMusOk() (*int32, bool)`

GetTotalMusOk returns a tuple with the TotalMus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalMus

`func (o *Guardiumconnectorv3GetCMsResponse) SetTotalMus(v int32)`

SetTotalMus sets TotalMus field to given value.

### HasTotalMus

`func (o *Guardiumconnectorv3GetCMsResponse) HasTotalMus() bool`

HasTotalMus returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


