# ConfigureSSORequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EmailDomain** | **string** | The domain from where your SSO emails are provided. | 
**IdpMetadata** | [**ConfigureSSORequestIdpMetadata**](ConfigureSSORequestIdpMetadata.md) |  | 

## Methods

### NewConfigureSSORequest

`func NewConfigureSSORequest(emailDomain string, idpMetadata ConfigureSSORequestIdpMetadata, ) *ConfigureSSORequest`

NewConfigureSSORequest instantiates a new ConfigureSSORequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewConfigureSSORequestWithDefaults

`func NewConfigureSSORequestWithDefaults() *ConfigureSSORequest`

NewConfigureSSORequestWithDefaults instantiates a new ConfigureSSORequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEmailDomain

`func (o *ConfigureSSORequest) GetEmailDomain() string`

GetEmailDomain returns the EmailDomain field if non-nil, zero value otherwise.

### GetEmailDomainOk

`func (o *ConfigureSSORequest) GetEmailDomainOk() (*string, bool)`

GetEmailDomainOk returns a tuple with the EmailDomain field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEmailDomain

`func (o *ConfigureSSORequest) SetEmailDomain(v string)`

SetEmailDomain sets EmailDomain field to given value.


### GetIdpMetadata

`func (o *ConfigureSSORequest) GetIdpMetadata() ConfigureSSORequestIdpMetadata`

GetIdpMetadata returns the IdpMetadata field if non-nil, zero value otherwise.

### GetIdpMetadataOk

`func (o *ConfigureSSORequest) GetIdpMetadataOk() (*ConfigureSSORequestIdpMetadata, bool)`

GetIdpMetadataOk returns a tuple with the IdpMetadata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIdpMetadata

`func (o *ConfigureSSORequest) SetIdpMetadata(v ConfigureSSORequestIdpMetadata)`

SetIdpMetadata sets IdpMetadata field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


