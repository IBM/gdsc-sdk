# Guardiumconnectorv3GetCMsConfigResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Cms** | Pointer to [**[]Guardiumconnectorv3CM**](Guardiumconnectorv3CM.md) | List of Central Managers. | [optional] 
**Status** | Pointer to [**Guardiumconnectorv3StatusResponseBase**](Guardiumconnectorv3StatusResponseBase.md) |  | [optional] 

## Methods

### NewGuardiumconnectorv3GetCMsConfigResponse

`func NewGuardiumconnectorv3GetCMsConfigResponse() *Guardiumconnectorv3GetCMsConfigResponse`

NewGuardiumconnectorv3GetCMsConfigResponse instantiates a new Guardiumconnectorv3GetCMsConfigResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGuardiumconnectorv3GetCMsConfigResponseWithDefaults

`func NewGuardiumconnectorv3GetCMsConfigResponseWithDefaults() *Guardiumconnectorv3GetCMsConfigResponse`

NewGuardiumconnectorv3GetCMsConfigResponseWithDefaults instantiates a new Guardiumconnectorv3GetCMsConfigResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCms

`func (o *Guardiumconnectorv3GetCMsConfigResponse) GetCms() []Guardiumconnectorv3CM`

GetCms returns the Cms field if non-nil, zero value otherwise.

### GetCmsOk

`func (o *Guardiumconnectorv3GetCMsConfigResponse) GetCmsOk() (*[]Guardiumconnectorv3CM, bool)`

GetCmsOk returns a tuple with the Cms field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCms

`func (o *Guardiumconnectorv3GetCMsConfigResponse) SetCms(v []Guardiumconnectorv3CM)`

SetCms sets Cms field to given value.

### HasCms

`func (o *Guardiumconnectorv3GetCMsConfigResponse) HasCms() bool`

HasCms returns a boolean if a field has been set.

### GetStatus

`func (o *Guardiumconnectorv3GetCMsConfigResponse) GetStatus() Guardiumconnectorv3StatusResponseBase`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *Guardiumconnectorv3GetCMsConfigResponse) GetStatusOk() (*Guardiumconnectorv3StatusResponseBase, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *Guardiumconnectorv3GetCMsConfigResponse) SetStatus(v Guardiumconnectorv3StatusResponseBase)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *Guardiumconnectorv3GetCMsConfigResponse) HasStatus() bool`

HasStatus returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


