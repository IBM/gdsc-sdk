# Universalconnectormanagerv3GetUCSetupResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Binaries** | Pointer to [**[]Universalconnectormanagerv3File**](Universalconnectormanagerv3File.md) | Binaries files (zip,rpm,jar, base64 encoded). | [optional] 
**Certificates** | Pointer to **map[string]string** | Map of certificates (key is the name, value is the value itself). | [optional] 
**Configurations** | Pointer to [**[]Universalconnectormanagerv3File**](Universalconnectormanagerv3File.md) | Configuration files for pipeline. | [optional] 
**Credentials** | Pointer to **map[string]string** | Map of credentials (key is the name, value is the value itself). | [optional] 
**OfflinePackages** | Pointer to [**[]Universalconnectormanagerv3File**](Universalconnectormanagerv3File.md) |  | [optional] 
**PipelineType** | Pointer to **string** | Type of the pipeline (pull or push). | [optional] 

## Methods

### NewUniversalconnectormanagerv3GetUCSetupResponse

`func NewUniversalconnectormanagerv3GetUCSetupResponse() *Universalconnectormanagerv3GetUCSetupResponse`

NewUniversalconnectormanagerv3GetUCSetupResponse instantiates a new Universalconnectormanagerv3GetUCSetupResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUniversalconnectormanagerv3GetUCSetupResponseWithDefaults

`func NewUniversalconnectormanagerv3GetUCSetupResponseWithDefaults() *Universalconnectormanagerv3GetUCSetupResponse`

NewUniversalconnectormanagerv3GetUCSetupResponseWithDefaults instantiates a new Universalconnectormanagerv3GetUCSetupResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBinaries

`func (o *Universalconnectormanagerv3GetUCSetupResponse) GetBinaries() []Universalconnectormanagerv3File`

GetBinaries returns the Binaries field if non-nil, zero value otherwise.

### GetBinariesOk

`func (o *Universalconnectormanagerv3GetUCSetupResponse) GetBinariesOk() (*[]Universalconnectormanagerv3File, bool)`

GetBinariesOk returns a tuple with the Binaries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBinaries

`func (o *Universalconnectormanagerv3GetUCSetupResponse) SetBinaries(v []Universalconnectormanagerv3File)`

SetBinaries sets Binaries field to given value.

### HasBinaries

`func (o *Universalconnectormanagerv3GetUCSetupResponse) HasBinaries() bool`

HasBinaries returns a boolean if a field has been set.

### GetCertificates

`func (o *Universalconnectormanagerv3GetUCSetupResponse) GetCertificates() map[string]string`

GetCertificates returns the Certificates field if non-nil, zero value otherwise.

### GetCertificatesOk

`func (o *Universalconnectormanagerv3GetUCSetupResponse) GetCertificatesOk() (*map[string]string, bool)`

GetCertificatesOk returns a tuple with the Certificates field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCertificates

`func (o *Universalconnectormanagerv3GetUCSetupResponse) SetCertificates(v map[string]string)`

SetCertificates sets Certificates field to given value.

### HasCertificates

`func (o *Universalconnectormanagerv3GetUCSetupResponse) HasCertificates() bool`

HasCertificates returns a boolean if a field has been set.

### GetConfigurations

`func (o *Universalconnectormanagerv3GetUCSetupResponse) GetConfigurations() []Universalconnectormanagerv3File`

GetConfigurations returns the Configurations field if non-nil, zero value otherwise.

### GetConfigurationsOk

`func (o *Universalconnectormanagerv3GetUCSetupResponse) GetConfigurationsOk() (*[]Universalconnectormanagerv3File, bool)`

GetConfigurationsOk returns a tuple with the Configurations field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConfigurations

`func (o *Universalconnectormanagerv3GetUCSetupResponse) SetConfigurations(v []Universalconnectormanagerv3File)`

SetConfigurations sets Configurations field to given value.

### HasConfigurations

`func (o *Universalconnectormanagerv3GetUCSetupResponse) HasConfigurations() bool`

HasConfigurations returns a boolean if a field has been set.

### GetCredentials

`func (o *Universalconnectormanagerv3GetUCSetupResponse) GetCredentials() map[string]string`

GetCredentials returns the Credentials field if non-nil, zero value otherwise.

### GetCredentialsOk

`func (o *Universalconnectormanagerv3GetUCSetupResponse) GetCredentialsOk() (*map[string]string, bool)`

GetCredentialsOk returns a tuple with the Credentials field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCredentials

`func (o *Universalconnectormanagerv3GetUCSetupResponse) SetCredentials(v map[string]string)`

SetCredentials sets Credentials field to given value.

### HasCredentials

`func (o *Universalconnectormanagerv3GetUCSetupResponse) HasCredentials() bool`

HasCredentials returns a boolean if a field has been set.

### GetOfflinePackages

`func (o *Universalconnectormanagerv3GetUCSetupResponse) GetOfflinePackages() []Universalconnectormanagerv3File`

GetOfflinePackages returns the OfflinePackages field if non-nil, zero value otherwise.

### GetOfflinePackagesOk

`func (o *Universalconnectormanagerv3GetUCSetupResponse) GetOfflinePackagesOk() (*[]Universalconnectormanagerv3File, bool)`

GetOfflinePackagesOk returns a tuple with the OfflinePackages field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOfflinePackages

`func (o *Universalconnectormanagerv3GetUCSetupResponse) SetOfflinePackages(v []Universalconnectormanagerv3File)`

SetOfflinePackages sets OfflinePackages field to given value.

### HasOfflinePackages

`func (o *Universalconnectormanagerv3GetUCSetupResponse) HasOfflinePackages() bool`

HasOfflinePackages returns a boolean if a field has been set.

### GetPipelineType

`func (o *Universalconnectormanagerv3GetUCSetupResponse) GetPipelineType() string`

GetPipelineType returns the PipelineType field if non-nil, zero value otherwise.

### GetPipelineTypeOk

`func (o *Universalconnectormanagerv3GetUCSetupResponse) GetPipelineTypeOk() (*string, bool)`

GetPipelineTypeOk returns a tuple with the PipelineType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPipelineType

`func (o *Universalconnectormanagerv3GetUCSetupResponse) SetPipelineType(v string)`

SetPipelineType sets PipelineType field to given value.

### HasPipelineType

`func (o *Universalconnectormanagerv3GetUCSetupResponse) HasPipelineType() bool`

HasPipelineType returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


