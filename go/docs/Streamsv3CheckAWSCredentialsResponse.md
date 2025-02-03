# Streamsv3CheckAWSCredentialsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | Pointer to [**Streamsv3AWSCheckStreamStatus**](Streamsv3AWSCheckStreamStatus.md) |  | [optional] [default to OK]

## Methods

### NewStreamsv3CheckAWSCredentialsResponse

`func NewStreamsv3CheckAWSCredentialsResponse() *Streamsv3CheckAWSCredentialsResponse`

NewStreamsv3CheckAWSCredentialsResponse instantiates a new Streamsv3CheckAWSCredentialsResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewStreamsv3CheckAWSCredentialsResponseWithDefaults

`func NewStreamsv3CheckAWSCredentialsResponseWithDefaults() *Streamsv3CheckAWSCredentialsResponse`

NewStreamsv3CheckAWSCredentialsResponseWithDefaults instantiates a new Streamsv3CheckAWSCredentialsResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetStatus

`func (o *Streamsv3CheckAWSCredentialsResponse) GetStatus() Streamsv3AWSCheckStreamStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *Streamsv3CheckAWSCredentialsResponse) GetStatusOk() (*Streamsv3AWSCheckStreamStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *Streamsv3CheckAWSCredentialsResponse) SetStatus(v Streamsv3AWSCheckStreamStatus)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *Streamsv3CheckAWSCredentialsResponse) HasStatus() bool`

HasStatus returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


