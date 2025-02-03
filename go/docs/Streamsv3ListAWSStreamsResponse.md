# Streamsv3ListAWSStreamsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**StreamsByRegion** | Pointer to [**map[string]Streamsv3StreamByRegion**](Streamsv3StreamByRegion.md) | Map of streams by regions. | [optional] 

## Methods

### NewStreamsv3ListAWSStreamsResponse

`func NewStreamsv3ListAWSStreamsResponse() *Streamsv3ListAWSStreamsResponse`

NewStreamsv3ListAWSStreamsResponse instantiates a new Streamsv3ListAWSStreamsResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewStreamsv3ListAWSStreamsResponseWithDefaults

`func NewStreamsv3ListAWSStreamsResponseWithDefaults() *Streamsv3ListAWSStreamsResponse`

NewStreamsv3ListAWSStreamsResponseWithDefaults instantiates a new Streamsv3ListAWSStreamsResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetStreamsByRegion

`func (o *Streamsv3ListAWSStreamsResponse) GetStreamsByRegion() map[string]Streamsv3StreamByRegion`

GetStreamsByRegion returns the StreamsByRegion field if non-nil, zero value otherwise.

### GetStreamsByRegionOk

`func (o *Streamsv3ListAWSStreamsResponse) GetStreamsByRegionOk() (*map[string]Streamsv3StreamByRegion, bool)`

GetStreamsByRegionOk returns a tuple with the StreamsByRegion field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStreamsByRegion

`func (o *Streamsv3ListAWSStreamsResponse) SetStreamsByRegion(v map[string]Streamsv3StreamByRegion)`

SetStreamsByRegion sets StreamsByRegion field to given value.

### HasStreamsByRegion

`func (o *Streamsv3ListAWSStreamsResponse) HasStreamsByRegion() bool`

HasStreamsByRegion returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


