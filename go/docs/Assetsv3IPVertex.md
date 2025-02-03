# Assetsv3IPVertex

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**City** | Pointer to **string** |  | [optional] 
**Country** | Pointer to **string** |  | [optional] 
**DataCenter** | Pointer to **string** |  | [optional] 
**Description** | Pointer to **string** |  | [optional] 
**Dns** | Pointer to **string** |  | [optional] 
**ExtendedProperties** | Pointer to [**[]Assetsv3CustomProperty**](Assetsv3CustomProperty.md) |  | [optional] 
**IpAddress** | Pointer to **string** |  | [optional] 
**IpPort** | Pointer to [**[]Assetsv3ConnectionEdge**](Assetsv3ConnectionEdge.md) |  | [optional] 
**MacAddress** | Pointer to **string** |  | [optional] 
**Region** | Pointer to **string** |  | [optional] 
**ResolutionKey** | Pointer to **string** |  | [optional] 
**State** | Pointer to **string** |  | [optional] 
**Version** | Pointer to **string** |  | [optional] 

## Methods

### NewAssetsv3IPVertex

`func NewAssetsv3IPVertex() *Assetsv3IPVertex`

NewAssetsv3IPVertex instantiates a new Assetsv3IPVertex object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAssetsv3IPVertexWithDefaults

`func NewAssetsv3IPVertexWithDefaults() *Assetsv3IPVertex`

NewAssetsv3IPVertexWithDefaults instantiates a new Assetsv3IPVertex object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCity

`func (o *Assetsv3IPVertex) GetCity() string`

GetCity returns the City field if non-nil, zero value otherwise.

### GetCityOk

`func (o *Assetsv3IPVertex) GetCityOk() (*string, bool)`

GetCityOk returns a tuple with the City field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCity

`func (o *Assetsv3IPVertex) SetCity(v string)`

SetCity sets City field to given value.

### HasCity

`func (o *Assetsv3IPVertex) HasCity() bool`

HasCity returns a boolean if a field has been set.

### GetCountry

`func (o *Assetsv3IPVertex) GetCountry() string`

GetCountry returns the Country field if non-nil, zero value otherwise.

### GetCountryOk

`func (o *Assetsv3IPVertex) GetCountryOk() (*string, bool)`

GetCountryOk returns a tuple with the Country field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountry

`func (o *Assetsv3IPVertex) SetCountry(v string)`

SetCountry sets Country field to given value.

### HasCountry

`func (o *Assetsv3IPVertex) HasCountry() bool`

HasCountry returns a boolean if a field has been set.

### GetDataCenter

`func (o *Assetsv3IPVertex) GetDataCenter() string`

GetDataCenter returns the DataCenter field if non-nil, zero value otherwise.

### GetDataCenterOk

`func (o *Assetsv3IPVertex) GetDataCenterOk() (*string, bool)`

GetDataCenterOk returns a tuple with the DataCenter field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDataCenter

`func (o *Assetsv3IPVertex) SetDataCenter(v string)`

SetDataCenter sets DataCenter field to given value.

### HasDataCenter

`func (o *Assetsv3IPVertex) HasDataCenter() bool`

HasDataCenter returns a boolean if a field has been set.

### GetDescription

`func (o *Assetsv3IPVertex) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *Assetsv3IPVertex) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *Assetsv3IPVertex) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *Assetsv3IPVertex) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetDns

`func (o *Assetsv3IPVertex) GetDns() string`

GetDns returns the Dns field if non-nil, zero value otherwise.

### GetDnsOk

`func (o *Assetsv3IPVertex) GetDnsOk() (*string, bool)`

GetDnsOk returns a tuple with the Dns field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDns

`func (o *Assetsv3IPVertex) SetDns(v string)`

SetDns sets Dns field to given value.

### HasDns

`func (o *Assetsv3IPVertex) HasDns() bool`

HasDns returns a boolean if a field has been set.

### GetExtendedProperties

`func (o *Assetsv3IPVertex) GetExtendedProperties() []Assetsv3CustomProperty`

GetExtendedProperties returns the ExtendedProperties field if non-nil, zero value otherwise.

### GetExtendedPropertiesOk

`func (o *Assetsv3IPVertex) GetExtendedPropertiesOk() (*[]Assetsv3CustomProperty, bool)`

GetExtendedPropertiesOk returns a tuple with the ExtendedProperties field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExtendedProperties

`func (o *Assetsv3IPVertex) SetExtendedProperties(v []Assetsv3CustomProperty)`

SetExtendedProperties sets ExtendedProperties field to given value.

### HasExtendedProperties

`func (o *Assetsv3IPVertex) HasExtendedProperties() bool`

HasExtendedProperties returns a boolean if a field has been set.

### GetIpAddress

`func (o *Assetsv3IPVertex) GetIpAddress() string`

GetIpAddress returns the IpAddress field if non-nil, zero value otherwise.

### GetIpAddressOk

`func (o *Assetsv3IPVertex) GetIpAddressOk() (*string, bool)`

GetIpAddressOk returns a tuple with the IpAddress field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIpAddress

`func (o *Assetsv3IPVertex) SetIpAddress(v string)`

SetIpAddress sets IpAddress field to given value.

### HasIpAddress

`func (o *Assetsv3IPVertex) HasIpAddress() bool`

HasIpAddress returns a boolean if a field has been set.

### GetIpPort

`func (o *Assetsv3IPVertex) GetIpPort() []Assetsv3ConnectionEdge`

GetIpPort returns the IpPort field if non-nil, zero value otherwise.

### GetIpPortOk

`func (o *Assetsv3IPVertex) GetIpPortOk() (*[]Assetsv3ConnectionEdge, bool)`

GetIpPortOk returns a tuple with the IpPort field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIpPort

`func (o *Assetsv3IPVertex) SetIpPort(v []Assetsv3ConnectionEdge)`

SetIpPort sets IpPort field to given value.

### HasIpPort

`func (o *Assetsv3IPVertex) HasIpPort() bool`

HasIpPort returns a boolean if a field has been set.

### GetMacAddress

`func (o *Assetsv3IPVertex) GetMacAddress() string`

GetMacAddress returns the MacAddress field if non-nil, zero value otherwise.

### GetMacAddressOk

`func (o *Assetsv3IPVertex) GetMacAddressOk() (*string, bool)`

GetMacAddressOk returns a tuple with the MacAddress field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMacAddress

`func (o *Assetsv3IPVertex) SetMacAddress(v string)`

SetMacAddress sets MacAddress field to given value.

### HasMacAddress

`func (o *Assetsv3IPVertex) HasMacAddress() bool`

HasMacAddress returns a boolean if a field has been set.

### GetRegion

`func (o *Assetsv3IPVertex) GetRegion() string`

GetRegion returns the Region field if non-nil, zero value otherwise.

### GetRegionOk

`func (o *Assetsv3IPVertex) GetRegionOk() (*string, bool)`

GetRegionOk returns a tuple with the Region field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRegion

`func (o *Assetsv3IPVertex) SetRegion(v string)`

SetRegion sets Region field to given value.

### HasRegion

`func (o *Assetsv3IPVertex) HasRegion() bool`

HasRegion returns a boolean if a field has been set.

### GetResolutionKey

`func (o *Assetsv3IPVertex) GetResolutionKey() string`

GetResolutionKey returns the ResolutionKey field if non-nil, zero value otherwise.

### GetResolutionKeyOk

`func (o *Assetsv3IPVertex) GetResolutionKeyOk() (*string, bool)`

GetResolutionKeyOk returns a tuple with the ResolutionKey field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResolutionKey

`func (o *Assetsv3IPVertex) SetResolutionKey(v string)`

SetResolutionKey sets ResolutionKey field to given value.

### HasResolutionKey

`func (o *Assetsv3IPVertex) HasResolutionKey() bool`

HasResolutionKey returns a boolean if a field has been set.

### GetState

`func (o *Assetsv3IPVertex) GetState() string`

GetState returns the State field if non-nil, zero value otherwise.

### GetStateOk

`func (o *Assetsv3IPVertex) GetStateOk() (*string, bool)`

GetStateOk returns a tuple with the State field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetState

`func (o *Assetsv3IPVertex) SetState(v string)`

SetState sets State field to given value.

### HasState

`func (o *Assetsv3IPVertex) HasState() bool`

HasState returns a boolean if a field has been set.

### GetVersion

`func (o *Assetsv3IPVertex) GetVersion() string`

GetVersion returns the Version field if non-nil, zero value otherwise.

### GetVersionOk

`func (o *Assetsv3IPVertex) GetVersionOk() (*string, bool)`

GetVersionOk returns a tuple with the Version field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersion

`func (o *Assetsv3IPVertex) SetVersion(v string)`

SetVersion sets Version field to given value.

### HasVersion

`func (o *Assetsv3IPVertex) HasVersion() bool`

HasVersion returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


