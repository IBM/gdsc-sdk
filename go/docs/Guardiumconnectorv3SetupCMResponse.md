# Guardiumconnectorv3SetupCMResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Response** | Pointer to **string** | Response message. | [optional] 
**ResponseCode** | Pointer to **string** | Translatable reponse code or empty string if there is no response. | [optional] 
**Tasks** | Pointer to [**[]Guardiumconnectorv3TaskObject**](Guardiumconnectorv3TaskObject.md) | List of Tasks associated with the Central Manager. | [optional] 

## Methods

### NewGuardiumconnectorv3SetupCMResponse

`func NewGuardiumconnectorv3SetupCMResponse() *Guardiumconnectorv3SetupCMResponse`

NewGuardiumconnectorv3SetupCMResponse instantiates a new Guardiumconnectorv3SetupCMResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGuardiumconnectorv3SetupCMResponseWithDefaults

`func NewGuardiumconnectorv3SetupCMResponseWithDefaults() *Guardiumconnectorv3SetupCMResponse`

NewGuardiumconnectorv3SetupCMResponseWithDefaults instantiates a new Guardiumconnectorv3SetupCMResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetResponse

`func (o *Guardiumconnectorv3SetupCMResponse) GetResponse() string`

GetResponse returns the Response field if non-nil, zero value otherwise.

### GetResponseOk

`func (o *Guardiumconnectorv3SetupCMResponse) GetResponseOk() (*string, bool)`

GetResponseOk returns a tuple with the Response field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResponse

`func (o *Guardiumconnectorv3SetupCMResponse) SetResponse(v string)`

SetResponse sets Response field to given value.

### HasResponse

`func (o *Guardiumconnectorv3SetupCMResponse) HasResponse() bool`

HasResponse returns a boolean if a field has been set.

### GetResponseCode

`func (o *Guardiumconnectorv3SetupCMResponse) GetResponseCode() string`

GetResponseCode returns the ResponseCode field if non-nil, zero value otherwise.

### GetResponseCodeOk

`func (o *Guardiumconnectorv3SetupCMResponse) GetResponseCodeOk() (*string, bool)`

GetResponseCodeOk returns a tuple with the ResponseCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResponseCode

`func (o *Guardiumconnectorv3SetupCMResponse) SetResponseCode(v string)`

SetResponseCode sets ResponseCode field to given value.

### HasResponseCode

`func (o *Guardiumconnectorv3SetupCMResponse) HasResponseCode() bool`

HasResponseCode returns a boolean if a field has been set.

### GetTasks

`func (o *Guardiumconnectorv3SetupCMResponse) GetTasks() []Guardiumconnectorv3TaskObject`

GetTasks returns the Tasks field if non-nil, zero value otherwise.

### GetTasksOk

`func (o *Guardiumconnectorv3SetupCMResponse) GetTasksOk() (*[]Guardiumconnectorv3TaskObject, bool)`

GetTasksOk returns a tuple with the Tasks field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTasks

`func (o *Guardiumconnectorv3SetupCMResponse) SetTasks(v []Guardiumconnectorv3TaskObject)`

SetTasks sets Tasks field to given value.

### HasTasks

`func (o *Guardiumconnectorv3SetupCMResponse) HasTasks() bool`

HasTasks returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


