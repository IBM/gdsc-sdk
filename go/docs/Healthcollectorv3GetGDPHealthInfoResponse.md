# Healthcollectorv3GetGDPHealthInfoResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AllNodes** | Pointer to [**[]Healthcollectorv3CMNodeObject**](Healthcollectorv3CMNodeObject.md) | List of managed units and monitoring agents associated with the central manager. | [optional] 
**Status** | Pointer to [**Healthcollectorv3StatusResponseBase**](Healthcollectorv3StatusResponseBase.md) |  | [optional] 

## Methods

### NewHealthcollectorv3GetGDPHealthInfoResponse

`func NewHealthcollectorv3GetGDPHealthInfoResponse() *Healthcollectorv3GetGDPHealthInfoResponse`

NewHealthcollectorv3GetGDPHealthInfoResponse instantiates a new Healthcollectorv3GetGDPHealthInfoResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewHealthcollectorv3GetGDPHealthInfoResponseWithDefaults

`func NewHealthcollectorv3GetGDPHealthInfoResponseWithDefaults() *Healthcollectorv3GetGDPHealthInfoResponse`

NewHealthcollectorv3GetGDPHealthInfoResponseWithDefaults instantiates a new Healthcollectorv3GetGDPHealthInfoResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAllNodes

`func (o *Healthcollectorv3GetGDPHealthInfoResponse) GetAllNodes() []Healthcollectorv3CMNodeObject`

GetAllNodes returns the AllNodes field if non-nil, zero value otherwise.

### GetAllNodesOk

`func (o *Healthcollectorv3GetGDPHealthInfoResponse) GetAllNodesOk() (*[]Healthcollectorv3CMNodeObject, bool)`

GetAllNodesOk returns a tuple with the AllNodes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAllNodes

`func (o *Healthcollectorv3GetGDPHealthInfoResponse) SetAllNodes(v []Healthcollectorv3CMNodeObject)`

SetAllNodes sets AllNodes field to given value.

### HasAllNodes

`func (o *Healthcollectorv3GetGDPHealthInfoResponse) HasAllNodes() bool`

HasAllNodes returns a boolean if a field has been set.

### GetStatus

`func (o *Healthcollectorv3GetGDPHealthInfoResponse) GetStatus() Healthcollectorv3StatusResponseBase`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *Healthcollectorv3GetGDPHealthInfoResponse) GetStatusOk() (*Healthcollectorv3StatusResponseBase, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *Healthcollectorv3GetGDPHealthInfoResponse) SetStatus(v Healthcollectorv3StatusResponseBase)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *Healthcollectorv3GetGDPHealthInfoResponse) HasStatus() bool`

HasStatus returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


