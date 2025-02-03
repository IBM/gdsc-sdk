# Healthcollectorv3CMNodeObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Cm** | Pointer to **string** | Host name or IP address of the central manager. | [optional] 
**LastHealthInfoCollectedTimestamp** | Pointer to **string** | Timestamp from when the health information was collected. | [optional] 
**Nodes** | Pointer to [**[]Healthcollectorv3ManagedUnitObject**](Healthcollectorv3ManagedUnitObject.md) | List of Guardium Data Protection systems. | [optional] 

## Methods

### NewHealthcollectorv3CMNodeObject

`func NewHealthcollectorv3CMNodeObject() *Healthcollectorv3CMNodeObject`

NewHealthcollectorv3CMNodeObject instantiates a new Healthcollectorv3CMNodeObject object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewHealthcollectorv3CMNodeObjectWithDefaults

`func NewHealthcollectorv3CMNodeObjectWithDefaults() *Healthcollectorv3CMNodeObject`

NewHealthcollectorv3CMNodeObjectWithDefaults instantiates a new Healthcollectorv3CMNodeObject object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCm

`func (o *Healthcollectorv3CMNodeObject) GetCm() string`

GetCm returns the Cm field if non-nil, zero value otherwise.

### GetCmOk

`func (o *Healthcollectorv3CMNodeObject) GetCmOk() (*string, bool)`

GetCmOk returns a tuple with the Cm field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCm

`func (o *Healthcollectorv3CMNodeObject) SetCm(v string)`

SetCm sets Cm field to given value.

### HasCm

`func (o *Healthcollectorv3CMNodeObject) HasCm() bool`

HasCm returns a boolean if a field has been set.

### GetLastHealthInfoCollectedTimestamp

`func (o *Healthcollectorv3CMNodeObject) GetLastHealthInfoCollectedTimestamp() string`

GetLastHealthInfoCollectedTimestamp returns the LastHealthInfoCollectedTimestamp field if non-nil, zero value otherwise.

### GetLastHealthInfoCollectedTimestampOk

`func (o *Healthcollectorv3CMNodeObject) GetLastHealthInfoCollectedTimestampOk() (*string, bool)`

GetLastHealthInfoCollectedTimestampOk returns a tuple with the LastHealthInfoCollectedTimestamp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastHealthInfoCollectedTimestamp

`func (o *Healthcollectorv3CMNodeObject) SetLastHealthInfoCollectedTimestamp(v string)`

SetLastHealthInfoCollectedTimestamp sets LastHealthInfoCollectedTimestamp field to given value.

### HasLastHealthInfoCollectedTimestamp

`func (o *Healthcollectorv3CMNodeObject) HasLastHealthInfoCollectedTimestamp() bool`

HasLastHealthInfoCollectedTimestamp returns a boolean if a field has been set.

### GetNodes

`func (o *Healthcollectorv3CMNodeObject) GetNodes() []Healthcollectorv3ManagedUnitObject`

GetNodes returns the Nodes field if non-nil, zero value otherwise.

### GetNodesOk

`func (o *Healthcollectorv3CMNodeObject) GetNodesOk() (*[]Healthcollectorv3ManagedUnitObject, bool)`

GetNodesOk returns a tuple with the Nodes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNodes

`func (o *Healthcollectorv3CMNodeObject) SetNodes(v []Healthcollectorv3ManagedUnitObject)`

SetNodes sets Nodes field to given value.

### HasNodes

`func (o *Healthcollectorv3CMNodeObject) HasNodes() bool`

HasNodes returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


