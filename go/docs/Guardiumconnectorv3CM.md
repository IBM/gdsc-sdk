# Guardiumconnectorv3CM

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Attributes** | Pointer to [**[]Guardiumconnectorv3Attribute**](Guardiumconnectorv3Attribute.md) | Central Manager attributes. | [optional] 
**CentralManagerId** | Pointer to **string** | Central Manager hostname or ip. | [optional] 
**CmDateParamAvailable** | Pointer to **string** | Flag check if CM can handle setting start end date for aggregator dm export. | [optional] 
**DatamartEndDateAggregator** | Pointer to **string** | Initial start date for streaming historical datamart from GDP aggregator. | [optional] 
**DatamartStartDateAggregator** | Pointer to **string** | Initial start date for streaming historical datamart from GDP aggregator. | [optional] 
**DatamartStartDateCollector** | Pointer to **string** | Initial start date for streaming historical datamart from GDP. | [optional] 
**MaxSupportedDmVersion** | Pointer to **string** |  | [optional] 
**Mode** | Pointer to **string** | Flag to determine if GI supports push or pull mode. | [optional] 
**Name** | Pointer to **string** | Central Manager name. | [optional] 
**Port** | Pointer to **string** | Port used to communicate with the Central Manager. | [optional] 
**Status** | Pointer to **string** | Central Manager status. | [optional] 
**SupportCustomDmTypeSetup** | Pointer to **string** |  | [optional] 

## Methods

### NewGuardiumconnectorv3CM

`func NewGuardiumconnectorv3CM() *Guardiumconnectorv3CM`

NewGuardiumconnectorv3CM instantiates a new Guardiumconnectorv3CM object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGuardiumconnectorv3CMWithDefaults

`func NewGuardiumconnectorv3CMWithDefaults() *Guardiumconnectorv3CM`

NewGuardiumconnectorv3CMWithDefaults instantiates a new Guardiumconnectorv3CM object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAttributes

`func (o *Guardiumconnectorv3CM) GetAttributes() []Guardiumconnectorv3Attribute`

GetAttributes returns the Attributes field if non-nil, zero value otherwise.

### GetAttributesOk

`func (o *Guardiumconnectorv3CM) GetAttributesOk() (*[]Guardiumconnectorv3Attribute, bool)`

GetAttributesOk returns a tuple with the Attributes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttributes

`func (o *Guardiumconnectorv3CM) SetAttributes(v []Guardiumconnectorv3Attribute)`

SetAttributes sets Attributes field to given value.

### HasAttributes

`func (o *Guardiumconnectorv3CM) HasAttributes() bool`

HasAttributes returns a boolean if a field has been set.

### GetCentralManagerId

`func (o *Guardiumconnectorv3CM) GetCentralManagerId() string`

GetCentralManagerId returns the CentralManagerId field if non-nil, zero value otherwise.

### GetCentralManagerIdOk

`func (o *Guardiumconnectorv3CM) GetCentralManagerIdOk() (*string, bool)`

GetCentralManagerIdOk returns a tuple with the CentralManagerId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCentralManagerId

`func (o *Guardiumconnectorv3CM) SetCentralManagerId(v string)`

SetCentralManagerId sets CentralManagerId field to given value.

### HasCentralManagerId

`func (o *Guardiumconnectorv3CM) HasCentralManagerId() bool`

HasCentralManagerId returns a boolean if a field has been set.

### GetCmDateParamAvailable

`func (o *Guardiumconnectorv3CM) GetCmDateParamAvailable() string`

GetCmDateParamAvailable returns the CmDateParamAvailable field if non-nil, zero value otherwise.

### GetCmDateParamAvailableOk

`func (o *Guardiumconnectorv3CM) GetCmDateParamAvailableOk() (*string, bool)`

GetCmDateParamAvailableOk returns a tuple with the CmDateParamAvailable field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCmDateParamAvailable

`func (o *Guardiumconnectorv3CM) SetCmDateParamAvailable(v string)`

SetCmDateParamAvailable sets CmDateParamAvailable field to given value.

### HasCmDateParamAvailable

`func (o *Guardiumconnectorv3CM) HasCmDateParamAvailable() bool`

HasCmDateParamAvailable returns a boolean if a field has been set.

### GetDatamartEndDateAggregator

`func (o *Guardiumconnectorv3CM) GetDatamartEndDateAggregator() string`

GetDatamartEndDateAggregator returns the DatamartEndDateAggregator field if non-nil, zero value otherwise.

### GetDatamartEndDateAggregatorOk

`func (o *Guardiumconnectorv3CM) GetDatamartEndDateAggregatorOk() (*string, bool)`

GetDatamartEndDateAggregatorOk returns a tuple with the DatamartEndDateAggregator field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDatamartEndDateAggregator

`func (o *Guardiumconnectorv3CM) SetDatamartEndDateAggregator(v string)`

SetDatamartEndDateAggregator sets DatamartEndDateAggregator field to given value.

### HasDatamartEndDateAggregator

`func (o *Guardiumconnectorv3CM) HasDatamartEndDateAggregator() bool`

HasDatamartEndDateAggregator returns a boolean if a field has been set.

### GetDatamartStartDateAggregator

`func (o *Guardiumconnectorv3CM) GetDatamartStartDateAggregator() string`

GetDatamartStartDateAggregator returns the DatamartStartDateAggregator field if non-nil, zero value otherwise.

### GetDatamartStartDateAggregatorOk

`func (o *Guardiumconnectorv3CM) GetDatamartStartDateAggregatorOk() (*string, bool)`

GetDatamartStartDateAggregatorOk returns a tuple with the DatamartStartDateAggregator field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDatamartStartDateAggregator

`func (o *Guardiumconnectorv3CM) SetDatamartStartDateAggregator(v string)`

SetDatamartStartDateAggregator sets DatamartStartDateAggregator field to given value.

### HasDatamartStartDateAggregator

`func (o *Guardiumconnectorv3CM) HasDatamartStartDateAggregator() bool`

HasDatamartStartDateAggregator returns a boolean if a field has been set.

### GetDatamartStartDateCollector

`func (o *Guardiumconnectorv3CM) GetDatamartStartDateCollector() string`

GetDatamartStartDateCollector returns the DatamartStartDateCollector field if non-nil, zero value otherwise.

### GetDatamartStartDateCollectorOk

`func (o *Guardiumconnectorv3CM) GetDatamartStartDateCollectorOk() (*string, bool)`

GetDatamartStartDateCollectorOk returns a tuple with the DatamartStartDateCollector field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDatamartStartDateCollector

`func (o *Guardiumconnectorv3CM) SetDatamartStartDateCollector(v string)`

SetDatamartStartDateCollector sets DatamartStartDateCollector field to given value.

### HasDatamartStartDateCollector

`func (o *Guardiumconnectorv3CM) HasDatamartStartDateCollector() bool`

HasDatamartStartDateCollector returns a boolean if a field has been set.

### GetMaxSupportedDmVersion

`func (o *Guardiumconnectorv3CM) GetMaxSupportedDmVersion() string`

GetMaxSupportedDmVersion returns the MaxSupportedDmVersion field if non-nil, zero value otherwise.

### GetMaxSupportedDmVersionOk

`func (o *Guardiumconnectorv3CM) GetMaxSupportedDmVersionOk() (*string, bool)`

GetMaxSupportedDmVersionOk returns a tuple with the MaxSupportedDmVersion field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxSupportedDmVersion

`func (o *Guardiumconnectorv3CM) SetMaxSupportedDmVersion(v string)`

SetMaxSupportedDmVersion sets MaxSupportedDmVersion field to given value.

### HasMaxSupportedDmVersion

`func (o *Guardiumconnectorv3CM) HasMaxSupportedDmVersion() bool`

HasMaxSupportedDmVersion returns a boolean if a field has been set.

### GetMode

`func (o *Guardiumconnectorv3CM) GetMode() string`

GetMode returns the Mode field if non-nil, zero value otherwise.

### GetModeOk

`func (o *Guardiumconnectorv3CM) GetModeOk() (*string, bool)`

GetModeOk returns a tuple with the Mode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMode

`func (o *Guardiumconnectorv3CM) SetMode(v string)`

SetMode sets Mode field to given value.

### HasMode

`func (o *Guardiumconnectorv3CM) HasMode() bool`

HasMode returns a boolean if a field has been set.

### GetName

`func (o *Guardiumconnectorv3CM) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *Guardiumconnectorv3CM) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *Guardiumconnectorv3CM) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *Guardiumconnectorv3CM) HasName() bool`

HasName returns a boolean if a field has been set.

### GetPort

`func (o *Guardiumconnectorv3CM) GetPort() string`

GetPort returns the Port field if non-nil, zero value otherwise.

### GetPortOk

`func (o *Guardiumconnectorv3CM) GetPortOk() (*string, bool)`

GetPortOk returns a tuple with the Port field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPort

`func (o *Guardiumconnectorv3CM) SetPort(v string)`

SetPort sets Port field to given value.

### HasPort

`func (o *Guardiumconnectorv3CM) HasPort() bool`

HasPort returns a boolean if a field has been set.

### GetStatus

`func (o *Guardiumconnectorv3CM) GetStatus() string`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *Guardiumconnectorv3CM) GetStatusOk() (*string, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *Guardiumconnectorv3CM) SetStatus(v string)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *Guardiumconnectorv3CM) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetSupportCustomDmTypeSetup

`func (o *Guardiumconnectorv3CM) GetSupportCustomDmTypeSetup() string`

GetSupportCustomDmTypeSetup returns the SupportCustomDmTypeSetup field if non-nil, zero value otherwise.

### GetSupportCustomDmTypeSetupOk

`func (o *Guardiumconnectorv3CM) GetSupportCustomDmTypeSetupOk() (*string, bool)`

GetSupportCustomDmTypeSetupOk returns a tuple with the SupportCustomDmTypeSetup field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSupportCustomDmTypeSetup

`func (o *Guardiumconnectorv3CM) SetSupportCustomDmTypeSetup(v string)`

SetSupportCustomDmTypeSetup sets SupportCustomDmTypeSetup field to given value.

### HasSupportCustomDmTypeSetup

`func (o *Guardiumconnectorv3CM) HasSupportCustomDmTypeSetup() bool`

HasSupportCustomDmTypeSetup returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


