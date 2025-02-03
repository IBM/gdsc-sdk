# Streamsv3ListAWSStreamsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AccessKeyId** | Pointer to **string** | AWS access key ID. | [optional] 
**AuthType** | Pointer to [**Streamsv3AuthType**](Streamsv3AuthType.md) |  | [optional] [default to SECURITY_CREDENTIALS]
**Id** | Pointer to **string** | Identifier. | [optional] 
**Region** | Pointer to **[]string** | AWS region. | [optional] 
**RoleArn** | Pointer to **string** | IAM role ARN. | [optional] 
**SecretKeyId** | Pointer to **string** | AWS secret key ID. | [optional] 
**StreamType** | Pointer to [**Streamsv3StreamType**](Streamsv3StreamType.md) |  | [optional] [default to AWS_KINESIS]

## Methods

### NewStreamsv3ListAWSStreamsRequest

`func NewStreamsv3ListAWSStreamsRequest() *Streamsv3ListAWSStreamsRequest`

NewStreamsv3ListAWSStreamsRequest instantiates a new Streamsv3ListAWSStreamsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewStreamsv3ListAWSStreamsRequestWithDefaults

`func NewStreamsv3ListAWSStreamsRequestWithDefaults() *Streamsv3ListAWSStreamsRequest`

NewStreamsv3ListAWSStreamsRequestWithDefaults instantiates a new Streamsv3ListAWSStreamsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAccessKeyId

`func (o *Streamsv3ListAWSStreamsRequest) GetAccessKeyId() string`

GetAccessKeyId returns the AccessKeyId field if non-nil, zero value otherwise.

### GetAccessKeyIdOk

`func (o *Streamsv3ListAWSStreamsRequest) GetAccessKeyIdOk() (*string, bool)`

GetAccessKeyIdOk returns a tuple with the AccessKeyId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccessKeyId

`func (o *Streamsv3ListAWSStreamsRequest) SetAccessKeyId(v string)`

SetAccessKeyId sets AccessKeyId field to given value.

### HasAccessKeyId

`func (o *Streamsv3ListAWSStreamsRequest) HasAccessKeyId() bool`

HasAccessKeyId returns a boolean if a field has been set.

### GetAuthType

`func (o *Streamsv3ListAWSStreamsRequest) GetAuthType() Streamsv3AuthType`

GetAuthType returns the AuthType field if non-nil, zero value otherwise.

### GetAuthTypeOk

`func (o *Streamsv3ListAWSStreamsRequest) GetAuthTypeOk() (*Streamsv3AuthType, bool)`

GetAuthTypeOk returns a tuple with the AuthType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAuthType

`func (o *Streamsv3ListAWSStreamsRequest) SetAuthType(v Streamsv3AuthType)`

SetAuthType sets AuthType field to given value.

### HasAuthType

`func (o *Streamsv3ListAWSStreamsRequest) HasAuthType() bool`

HasAuthType returns a boolean if a field has been set.

### GetId

`func (o *Streamsv3ListAWSStreamsRequest) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *Streamsv3ListAWSStreamsRequest) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *Streamsv3ListAWSStreamsRequest) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *Streamsv3ListAWSStreamsRequest) HasId() bool`

HasId returns a boolean if a field has been set.

### GetRegion

`func (o *Streamsv3ListAWSStreamsRequest) GetRegion() []string`

GetRegion returns the Region field if non-nil, zero value otherwise.

### GetRegionOk

`func (o *Streamsv3ListAWSStreamsRequest) GetRegionOk() (*[]string, bool)`

GetRegionOk returns a tuple with the Region field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRegion

`func (o *Streamsv3ListAWSStreamsRequest) SetRegion(v []string)`

SetRegion sets Region field to given value.

### HasRegion

`func (o *Streamsv3ListAWSStreamsRequest) HasRegion() bool`

HasRegion returns a boolean if a field has been set.

### GetRoleArn

`func (o *Streamsv3ListAWSStreamsRequest) GetRoleArn() string`

GetRoleArn returns the RoleArn field if non-nil, zero value otherwise.

### GetRoleArnOk

`func (o *Streamsv3ListAWSStreamsRequest) GetRoleArnOk() (*string, bool)`

GetRoleArnOk returns a tuple with the RoleArn field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRoleArn

`func (o *Streamsv3ListAWSStreamsRequest) SetRoleArn(v string)`

SetRoleArn sets RoleArn field to given value.

### HasRoleArn

`func (o *Streamsv3ListAWSStreamsRequest) HasRoleArn() bool`

HasRoleArn returns a boolean if a field has been set.

### GetSecretKeyId

`func (o *Streamsv3ListAWSStreamsRequest) GetSecretKeyId() string`

GetSecretKeyId returns the SecretKeyId field if non-nil, zero value otherwise.

### GetSecretKeyIdOk

`func (o *Streamsv3ListAWSStreamsRequest) GetSecretKeyIdOk() (*string, bool)`

GetSecretKeyIdOk returns a tuple with the SecretKeyId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSecretKeyId

`func (o *Streamsv3ListAWSStreamsRequest) SetSecretKeyId(v string)`

SetSecretKeyId sets SecretKeyId field to given value.

### HasSecretKeyId

`func (o *Streamsv3ListAWSStreamsRequest) HasSecretKeyId() bool`

HasSecretKeyId returns a boolean if a field has been set.

### GetStreamType

`func (o *Streamsv3ListAWSStreamsRequest) GetStreamType() Streamsv3StreamType`

GetStreamType returns the StreamType field if non-nil, zero value otherwise.

### GetStreamTypeOk

`func (o *Streamsv3ListAWSStreamsRequest) GetStreamTypeOk() (*Streamsv3StreamType, bool)`

GetStreamTypeOk returns a tuple with the StreamType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStreamType

`func (o *Streamsv3ListAWSStreamsRequest) SetStreamType(v Streamsv3StreamType)`

SetStreamType sets StreamType field to given value.

### HasStreamType

`func (o *Streamsv3ListAWSStreamsRequest) HasStreamType() bool`

HasStreamType returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


