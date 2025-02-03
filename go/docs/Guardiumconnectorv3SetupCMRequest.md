# Guardiumconnectorv3SetupCMRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Attributes** | Pointer to [**[]Guardiumconnectorv3Attribute**](Guardiumconnectorv3Attribute.md) | Attributes specific to the GDP Central Manager. | [optional] 
**CmGid** | Pointer to **string** | Central Manager GID. | [optional] 
**CmHostname** | Pointer to **string** | Central Manager hostname. | [optional] 
**CmIp** | Pointer to **string** | Central Manager IP. | [optional] 
**PushRegistration** | Pointer to **bool** | Attribute used to distinguish between old mode (pull) and new SaaS mode (push) used during registration. | [optional] 

## Methods

### NewGuardiumconnectorv3SetupCMRequest

`func NewGuardiumconnectorv3SetupCMRequest() *Guardiumconnectorv3SetupCMRequest`

NewGuardiumconnectorv3SetupCMRequest instantiates a new Guardiumconnectorv3SetupCMRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGuardiumconnectorv3SetupCMRequestWithDefaults

`func NewGuardiumconnectorv3SetupCMRequestWithDefaults() *Guardiumconnectorv3SetupCMRequest`

NewGuardiumconnectorv3SetupCMRequestWithDefaults instantiates a new Guardiumconnectorv3SetupCMRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAttributes

`func (o *Guardiumconnectorv3SetupCMRequest) GetAttributes() []Guardiumconnectorv3Attribute`

GetAttributes returns the Attributes field if non-nil, zero value otherwise.

### GetAttributesOk

`func (o *Guardiumconnectorv3SetupCMRequest) GetAttributesOk() (*[]Guardiumconnectorv3Attribute, bool)`

GetAttributesOk returns a tuple with the Attributes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttributes

`func (o *Guardiumconnectorv3SetupCMRequest) SetAttributes(v []Guardiumconnectorv3Attribute)`

SetAttributes sets Attributes field to given value.

### HasAttributes

`func (o *Guardiumconnectorv3SetupCMRequest) HasAttributes() bool`

HasAttributes returns a boolean if a field has been set.

### GetCmGid

`func (o *Guardiumconnectorv3SetupCMRequest) GetCmGid() string`

GetCmGid returns the CmGid field if non-nil, zero value otherwise.

### GetCmGidOk

`func (o *Guardiumconnectorv3SetupCMRequest) GetCmGidOk() (*string, bool)`

GetCmGidOk returns a tuple with the CmGid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCmGid

`func (o *Guardiumconnectorv3SetupCMRequest) SetCmGid(v string)`

SetCmGid sets CmGid field to given value.

### HasCmGid

`func (o *Guardiumconnectorv3SetupCMRequest) HasCmGid() bool`

HasCmGid returns a boolean if a field has been set.

### GetCmHostname

`func (o *Guardiumconnectorv3SetupCMRequest) GetCmHostname() string`

GetCmHostname returns the CmHostname field if non-nil, zero value otherwise.

### GetCmHostnameOk

`func (o *Guardiumconnectorv3SetupCMRequest) GetCmHostnameOk() (*string, bool)`

GetCmHostnameOk returns a tuple with the CmHostname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCmHostname

`func (o *Guardiumconnectorv3SetupCMRequest) SetCmHostname(v string)`

SetCmHostname sets CmHostname field to given value.

### HasCmHostname

`func (o *Guardiumconnectorv3SetupCMRequest) HasCmHostname() bool`

HasCmHostname returns a boolean if a field has been set.

### GetCmIp

`func (o *Guardiumconnectorv3SetupCMRequest) GetCmIp() string`

GetCmIp returns the CmIp field if non-nil, zero value otherwise.

### GetCmIpOk

`func (o *Guardiumconnectorv3SetupCMRequest) GetCmIpOk() (*string, bool)`

GetCmIpOk returns a tuple with the CmIp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCmIp

`func (o *Guardiumconnectorv3SetupCMRequest) SetCmIp(v string)`

SetCmIp sets CmIp field to given value.

### HasCmIp

`func (o *Guardiumconnectorv3SetupCMRequest) HasCmIp() bool`

HasCmIp returns a boolean if a field has been set.

### GetPushRegistration

`func (o *Guardiumconnectorv3SetupCMRequest) GetPushRegistration() bool`

GetPushRegistration returns the PushRegistration field if non-nil, zero value otherwise.

### GetPushRegistrationOk

`func (o *Guardiumconnectorv3SetupCMRequest) GetPushRegistrationOk() (*bool, bool)`

GetPushRegistrationOk returns a tuple with the PushRegistration field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPushRegistration

`func (o *Guardiumconnectorv3SetupCMRequest) SetPushRegistration(v bool)`

SetPushRegistration sets PushRegistration field to given value.

### HasPushRegistration

`func (o *Guardiumconnectorv3SetupCMRequest) HasPushRegistration() bool`

HasPushRegistration returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


