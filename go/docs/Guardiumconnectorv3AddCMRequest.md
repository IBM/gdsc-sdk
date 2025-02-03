# Guardiumconnectorv3AddCMRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Cm** | Pointer to [**Guardiumconnectorv3CM**](Guardiumconnectorv3CM.md) |  | [optional] 
**EditCmAttributes** | Pointer to **[]string** | Central Manager edit attributes to get original values. | [optional] 
**IsEdit** | Pointer to **bool** | Flag to indicate if the Central Manager is being edited. | [optional] 

## Methods

### NewGuardiumconnectorv3AddCMRequest

`func NewGuardiumconnectorv3AddCMRequest() *Guardiumconnectorv3AddCMRequest`

NewGuardiumconnectorv3AddCMRequest instantiates a new Guardiumconnectorv3AddCMRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGuardiumconnectorv3AddCMRequestWithDefaults

`func NewGuardiumconnectorv3AddCMRequestWithDefaults() *Guardiumconnectorv3AddCMRequest`

NewGuardiumconnectorv3AddCMRequestWithDefaults instantiates a new Guardiumconnectorv3AddCMRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCm

`func (o *Guardiumconnectorv3AddCMRequest) GetCm() Guardiumconnectorv3CM`

GetCm returns the Cm field if non-nil, zero value otherwise.

### GetCmOk

`func (o *Guardiumconnectorv3AddCMRequest) GetCmOk() (*Guardiumconnectorv3CM, bool)`

GetCmOk returns a tuple with the Cm field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCm

`func (o *Guardiumconnectorv3AddCMRequest) SetCm(v Guardiumconnectorv3CM)`

SetCm sets Cm field to given value.

### HasCm

`func (o *Guardiumconnectorv3AddCMRequest) HasCm() bool`

HasCm returns a boolean if a field has been set.

### GetEditCmAttributes

`func (o *Guardiumconnectorv3AddCMRequest) GetEditCmAttributes() []string`

GetEditCmAttributes returns the EditCmAttributes field if non-nil, zero value otherwise.

### GetEditCmAttributesOk

`func (o *Guardiumconnectorv3AddCMRequest) GetEditCmAttributesOk() (*[]string, bool)`

GetEditCmAttributesOk returns a tuple with the EditCmAttributes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEditCmAttributes

`func (o *Guardiumconnectorv3AddCMRequest) SetEditCmAttributes(v []string)`

SetEditCmAttributes sets EditCmAttributes field to given value.

### HasEditCmAttributes

`func (o *Guardiumconnectorv3AddCMRequest) HasEditCmAttributes() bool`

HasEditCmAttributes returns a boolean if a field has been set.

### GetIsEdit

`func (o *Guardiumconnectorv3AddCMRequest) GetIsEdit() bool`

GetIsEdit returns the IsEdit field if non-nil, zero value otherwise.

### GetIsEditOk

`func (o *Guardiumconnectorv3AddCMRequest) GetIsEditOk() (*bool, bool)`

GetIsEditOk returns a tuple with the IsEdit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsEdit

`func (o *Guardiumconnectorv3AddCMRequest) SetIsEdit(v bool)`

SetIsEdit sets IsEdit field to given value.

### HasIsEdit

`func (o *Guardiumconnectorv3AddCMRequest) HasIsEdit() bool`

HasIsEdit returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


