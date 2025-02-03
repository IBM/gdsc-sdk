# Connectionsv3UCConnectionSummary

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Alias** | Pointer to **string** | Connection configuration nickname, set by dev/user (optional). | [optional] 
**ConfigId** | Pointer to **string** | Foreign key to the saved connection configuration by the user. | [optional] 
**DatasourceType** | Pointer to **string** | Datasource type. | [optional] 
**FilterAlias** | Pointer to **string** | Connector filter plugin alias (datasource, usually, like \&quot;MongoDB\&quot;). | [optional] 
**Host** | Pointer to **string** | URI where related Universal connector service is running/listening. | [optional] 
**InputAlias** | Pointer to **string** | Connection input plugin alias, like \&quot;Filebeat\&quot;. | [optional] 
**LastResponse** | Pointer to **string** | The heartbeat. | [optional] 
**Port** | Pointer to **string** | Port where the related Universal connector service is running/listening. | [optional] 
**Status** | Pointer to [**Connectionsv3Status**](Connectionsv3Status.md) |  | [optional] [default to UNDEFINED_STATUS]
**StatusText** | Pointer to **string** | If status is not OK, details what&#39;s wrong (non-localized). | [optional] 
**UcConnectionId** | Pointer to **string** | UC connection id. | [optional] 

## Methods

### NewConnectionsv3UCConnectionSummary

`func NewConnectionsv3UCConnectionSummary() *Connectionsv3UCConnectionSummary`

NewConnectionsv3UCConnectionSummary instantiates a new Connectionsv3UCConnectionSummary object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewConnectionsv3UCConnectionSummaryWithDefaults

`func NewConnectionsv3UCConnectionSummaryWithDefaults() *Connectionsv3UCConnectionSummary`

NewConnectionsv3UCConnectionSummaryWithDefaults instantiates a new Connectionsv3UCConnectionSummary object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAlias

`func (o *Connectionsv3UCConnectionSummary) GetAlias() string`

GetAlias returns the Alias field if non-nil, zero value otherwise.

### GetAliasOk

`func (o *Connectionsv3UCConnectionSummary) GetAliasOk() (*string, bool)`

GetAliasOk returns a tuple with the Alias field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAlias

`func (o *Connectionsv3UCConnectionSummary) SetAlias(v string)`

SetAlias sets Alias field to given value.

### HasAlias

`func (o *Connectionsv3UCConnectionSummary) HasAlias() bool`

HasAlias returns a boolean if a field has been set.

### GetConfigId

`func (o *Connectionsv3UCConnectionSummary) GetConfigId() string`

GetConfigId returns the ConfigId field if non-nil, zero value otherwise.

### GetConfigIdOk

`func (o *Connectionsv3UCConnectionSummary) GetConfigIdOk() (*string, bool)`

GetConfigIdOk returns a tuple with the ConfigId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConfigId

`func (o *Connectionsv3UCConnectionSummary) SetConfigId(v string)`

SetConfigId sets ConfigId field to given value.

### HasConfigId

`func (o *Connectionsv3UCConnectionSummary) HasConfigId() bool`

HasConfigId returns a boolean if a field has been set.

### GetDatasourceType

`func (o *Connectionsv3UCConnectionSummary) GetDatasourceType() string`

GetDatasourceType returns the DatasourceType field if non-nil, zero value otherwise.

### GetDatasourceTypeOk

`func (o *Connectionsv3UCConnectionSummary) GetDatasourceTypeOk() (*string, bool)`

GetDatasourceTypeOk returns a tuple with the DatasourceType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDatasourceType

`func (o *Connectionsv3UCConnectionSummary) SetDatasourceType(v string)`

SetDatasourceType sets DatasourceType field to given value.

### HasDatasourceType

`func (o *Connectionsv3UCConnectionSummary) HasDatasourceType() bool`

HasDatasourceType returns a boolean if a field has been set.

### GetFilterAlias

`func (o *Connectionsv3UCConnectionSummary) GetFilterAlias() string`

GetFilterAlias returns the FilterAlias field if non-nil, zero value otherwise.

### GetFilterAliasOk

`func (o *Connectionsv3UCConnectionSummary) GetFilterAliasOk() (*string, bool)`

GetFilterAliasOk returns a tuple with the FilterAlias field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilterAlias

`func (o *Connectionsv3UCConnectionSummary) SetFilterAlias(v string)`

SetFilterAlias sets FilterAlias field to given value.

### HasFilterAlias

`func (o *Connectionsv3UCConnectionSummary) HasFilterAlias() bool`

HasFilterAlias returns a boolean if a field has been set.

### GetHost

`func (o *Connectionsv3UCConnectionSummary) GetHost() string`

GetHost returns the Host field if non-nil, zero value otherwise.

### GetHostOk

`func (o *Connectionsv3UCConnectionSummary) GetHostOk() (*string, bool)`

GetHostOk returns a tuple with the Host field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHost

`func (o *Connectionsv3UCConnectionSummary) SetHost(v string)`

SetHost sets Host field to given value.

### HasHost

`func (o *Connectionsv3UCConnectionSummary) HasHost() bool`

HasHost returns a boolean if a field has been set.

### GetInputAlias

`func (o *Connectionsv3UCConnectionSummary) GetInputAlias() string`

GetInputAlias returns the InputAlias field if non-nil, zero value otherwise.

### GetInputAliasOk

`func (o *Connectionsv3UCConnectionSummary) GetInputAliasOk() (*string, bool)`

GetInputAliasOk returns a tuple with the InputAlias field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInputAlias

`func (o *Connectionsv3UCConnectionSummary) SetInputAlias(v string)`

SetInputAlias sets InputAlias field to given value.

### HasInputAlias

`func (o *Connectionsv3UCConnectionSummary) HasInputAlias() bool`

HasInputAlias returns a boolean if a field has been set.

### GetLastResponse

`func (o *Connectionsv3UCConnectionSummary) GetLastResponse() string`

GetLastResponse returns the LastResponse field if non-nil, zero value otherwise.

### GetLastResponseOk

`func (o *Connectionsv3UCConnectionSummary) GetLastResponseOk() (*string, bool)`

GetLastResponseOk returns a tuple with the LastResponse field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastResponse

`func (o *Connectionsv3UCConnectionSummary) SetLastResponse(v string)`

SetLastResponse sets LastResponse field to given value.

### HasLastResponse

`func (o *Connectionsv3UCConnectionSummary) HasLastResponse() bool`

HasLastResponse returns a boolean if a field has been set.

### GetPort

`func (o *Connectionsv3UCConnectionSummary) GetPort() string`

GetPort returns the Port field if non-nil, zero value otherwise.

### GetPortOk

`func (o *Connectionsv3UCConnectionSummary) GetPortOk() (*string, bool)`

GetPortOk returns a tuple with the Port field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPort

`func (o *Connectionsv3UCConnectionSummary) SetPort(v string)`

SetPort sets Port field to given value.

### HasPort

`func (o *Connectionsv3UCConnectionSummary) HasPort() bool`

HasPort returns a boolean if a field has been set.

### GetStatus

`func (o *Connectionsv3UCConnectionSummary) GetStatus() Connectionsv3Status`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *Connectionsv3UCConnectionSummary) GetStatusOk() (*Connectionsv3Status, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *Connectionsv3UCConnectionSummary) SetStatus(v Connectionsv3Status)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *Connectionsv3UCConnectionSummary) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetStatusText

`func (o *Connectionsv3UCConnectionSummary) GetStatusText() string`

GetStatusText returns the StatusText field if non-nil, zero value otherwise.

### GetStatusTextOk

`func (o *Connectionsv3UCConnectionSummary) GetStatusTextOk() (*string, bool)`

GetStatusTextOk returns a tuple with the StatusText field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatusText

`func (o *Connectionsv3UCConnectionSummary) SetStatusText(v string)`

SetStatusText sets StatusText field to given value.

### HasStatusText

`func (o *Connectionsv3UCConnectionSummary) HasStatusText() bool`

HasStatusText returns a boolean if a field has been set.

### GetUcConnectionId

`func (o *Connectionsv3UCConnectionSummary) GetUcConnectionId() string`

GetUcConnectionId returns the UcConnectionId field if non-nil, zero value otherwise.

### GetUcConnectionIdOk

`func (o *Connectionsv3UCConnectionSummary) GetUcConnectionIdOk() (*string, bool)`

GetUcConnectionIdOk returns a tuple with the UcConnectionId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUcConnectionId

`func (o *Connectionsv3UCConnectionSummary) SetUcConnectionId(v string)`

SetUcConnectionId sets UcConnectionId field to given value.

### HasUcConnectionId

`func (o *Connectionsv3UCConnectionSummary) HasUcConnectionId() bool`

HasUcConnectionId returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


