# Streamsv3CheckAWSCredentialsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AccessKeyId** | Pointer to **string** | AWS access key ID. | [optional] 
**AuthType** | Pointer to [**Streamsv3AuthType**](Streamsv3AuthType.md) |  | [optional] [default to SECURITY_CREDENTIALS]
**Id** | Pointer to **string** | Indetifier. | [optional] 
**Region** | Pointer to **string** | AWS region. | [optional] 
**RoleArn** | Pointer to **string** | IAM role ARN. | [optional] 
**SecretKeyId** | Pointer to **string** | AWS secret key ID. | [optional] 
**StreamName** | Pointer to **string** | Name of stream. | [optional] 
**StreamType** | Pointer to [**Streamsv3StreamType**](Streamsv3StreamType.md) |  | [optional] [default to AWS_KINESIS]

## Methods

### NewStreamsv3CheckAWSCredentialsRequest

`func NewStreamsv3CheckAWSCredentialsRequest() *Streamsv3CheckAWSCredentialsRequest`

NewStreamsv3CheckAWSCredentialsRequest instantiates a new Streamsv3CheckAWSCredentialsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewStreamsv3CheckAWSCredentialsRequestWithDefaults

`func NewStreamsv3CheckAWSCredentialsRequestWithDefaults() *Streamsv3CheckAWSCredentialsRequest`

NewStreamsv3CheckAWSCredentialsRequestWithDefaults instantiates a new Streamsv3CheckAWSCredentialsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAccessKeyId

`func (o *Streamsv3CheckAWSCredentialsRequest) GetAccessKeyId() string`

GetAccessKeyId returns the AccessKeyId field if non-nil, zero value otherwise.

### GetAccessKeyIdOk

`func (o *Streamsv3CheckAWSCredentialsRequest) GetAccessKeyIdOk() (*string, bool)`

GetAccessKeyIdOk returns a tuple with the AccessKeyId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccessKeyId

`func (o *Streamsv3CheckAWSCredentialsRequest) SetAccessKeyId(v string)`

SetAccessKeyId sets AccessKeyId field to given value.

### HasAccessKeyId

`func (o *Streamsv3CheckAWSCredentialsRequest) HasAccessKeyId() bool`

HasAccessKeyId returns a boolean if a field has been set.

### GetAuthType

`func (o *Streamsv3CheckAWSCredentialsRequest) GetAuthType() Streamsv3AuthType`

GetAuthType returns the AuthType field if non-nil, zero value otherwise.

### GetAuthTypeOk

`func (o *Streamsv3CheckAWSCredentialsRequest) GetAuthTypeOk() (*Streamsv3AuthType, bool)`

GetAuthTypeOk returns a tuple with the AuthType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAuthType

`func (o *Streamsv3CheckAWSCredentialsRequest) SetAuthType(v Streamsv3AuthType)`

SetAuthType sets AuthType field to given value.

### HasAuthType

`func (o *Streamsv3CheckAWSCredentialsRequest) HasAuthType() bool`

HasAuthType returns a boolean if a field has been set.

### GetId

`func (o *Streamsv3CheckAWSCredentialsRequest) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *Streamsv3CheckAWSCredentialsRequest) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *Streamsv3CheckAWSCredentialsRequest) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *Streamsv3CheckAWSCredentialsRequest) HasId() bool`

HasId returns a boolean if a field has been set.

### GetRegion

`func (o *Streamsv3CheckAWSCredentialsRequest) GetRegion() string`

GetRegion returns the Region field if non-nil, zero value otherwise.

### GetRegionOk

`func (o *Streamsv3CheckAWSCredentialsRequest) GetRegionOk() (*string, bool)`

GetRegionOk returns a tuple with the Region field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRegion

`func (o *Streamsv3CheckAWSCredentialsRequest) SetRegion(v string)`

SetRegion sets Region field to given value.

### HasRegion

`func (o *Streamsv3CheckAWSCredentialsRequest) HasRegion() bool`

HasRegion returns a boolean if a field has been set.

### GetRoleArn

`func (o *Streamsv3CheckAWSCredentialsRequest) GetRoleArn() string`

GetRoleArn returns the RoleArn field if non-nil, zero value otherwise.

### GetRoleArnOk

`func (o *Streamsv3CheckAWSCredentialsRequest) GetRoleArnOk() (*string, bool)`

GetRoleArnOk returns a tuple with the RoleArn field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRoleArn

`func (o *Streamsv3CheckAWSCredentialsRequest) SetRoleArn(v string)`

SetRoleArn sets RoleArn field to given value.

### HasRoleArn

`func (o *Streamsv3CheckAWSCredentialsRequest) HasRoleArn() bool`

HasRoleArn returns a boolean if a field has been set.

### GetSecretKeyId

`func (o *Streamsv3CheckAWSCredentialsRequest) GetSecretKeyId() string`

GetSecretKeyId returns the SecretKeyId field if non-nil, zero value otherwise.

### GetSecretKeyIdOk

`func (o *Streamsv3CheckAWSCredentialsRequest) GetSecretKeyIdOk() (*string, bool)`

GetSecretKeyIdOk returns a tuple with the SecretKeyId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSecretKeyId

`func (o *Streamsv3CheckAWSCredentialsRequest) SetSecretKeyId(v string)`

SetSecretKeyId sets SecretKeyId field to given value.

### HasSecretKeyId

`func (o *Streamsv3CheckAWSCredentialsRequest) HasSecretKeyId() bool`

HasSecretKeyId returns a boolean if a field has been set.

### GetStreamName

`func (o *Streamsv3CheckAWSCredentialsRequest) GetStreamName() string`

GetStreamName returns the StreamName field if non-nil, zero value otherwise.

### GetStreamNameOk

`func (o *Streamsv3CheckAWSCredentialsRequest) GetStreamNameOk() (*string, bool)`

GetStreamNameOk returns a tuple with the StreamName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStreamName

`func (o *Streamsv3CheckAWSCredentialsRequest) SetStreamName(v string)`

SetStreamName sets StreamName field to given value.

### HasStreamName

`func (o *Streamsv3CheckAWSCredentialsRequest) HasStreamName() bool`

HasStreamName returns a boolean if a field has been set.

### GetStreamType

`func (o *Streamsv3CheckAWSCredentialsRequest) GetStreamType() Streamsv3StreamType`

GetStreamType returns the StreamType field if non-nil, zero value otherwise.

### GetStreamTypeOk

`func (o *Streamsv3CheckAWSCredentialsRequest) GetStreamTypeOk() (*Streamsv3StreamType, bool)`

GetStreamTypeOk returns a tuple with the StreamType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStreamType

`func (o *Streamsv3CheckAWSCredentialsRequest) SetStreamType(v Streamsv3StreamType)`

SetStreamType sets StreamType field to given value.

### HasStreamType

`func (o *Streamsv3CheckAWSCredentialsRequest) HasStreamType() bool`

HasStreamType returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


