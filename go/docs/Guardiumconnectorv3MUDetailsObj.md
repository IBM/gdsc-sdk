# Guardiumconnectorv3MUDetailsObj

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AggHealthViewList** | Pointer to [**[]Guardiumconnectorv3AggregationViewListObject**](Guardiumconnectorv3AggregationViewListObject.md) | Aggregation details. | [optional] 
**ConnectivityDetails** | Pointer to [**Guardiumconnectorv3GeneralDetailsObject**](Guardiumconnectorv3GeneralDetailsObject.md) |  | [optional] 
**GeneralErrMessages** | Pointer to **[]string** | Additional messages and details about managed units. | [optional] 
**UtilizationScheme** | Pointer to [**Guardiumconnectorv3UtilizationParameterObject**](Guardiumconnectorv3UtilizationParameterObject.md) |  | [optional] 

## Methods

### NewGuardiumconnectorv3MUDetailsObj

`func NewGuardiumconnectorv3MUDetailsObj() *Guardiumconnectorv3MUDetailsObj`

NewGuardiumconnectorv3MUDetailsObj instantiates a new Guardiumconnectorv3MUDetailsObj object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGuardiumconnectorv3MUDetailsObjWithDefaults

`func NewGuardiumconnectorv3MUDetailsObjWithDefaults() *Guardiumconnectorv3MUDetailsObj`

NewGuardiumconnectorv3MUDetailsObjWithDefaults instantiates a new Guardiumconnectorv3MUDetailsObj object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAggHealthViewList

`func (o *Guardiumconnectorv3MUDetailsObj) GetAggHealthViewList() []Guardiumconnectorv3AggregationViewListObject`

GetAggHealthViewList returns the AggHealthViewList field if non-nil, zero value otherwise.

### GetAggHealthViewListOk

`func (o *Guardiumconnectorv3MUDetailsObj) GetAggHealthViewListOk() (*[]Guardiumconnectorv3AggregationViewListObject, bool)`

GetAggHealthViewListOk returns a tuple with the AggHealthViewList field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAggHealthViewList

`func (o *Guardiumconnectorv3MUDetailsObj) SetAggHealthViewList(v []Guardiumconnectorv3AggregationViewListObject)`

SetAggHealthViewList sets AggHealthViewList field to given value.

### HasAggHealthViewList

`func (o *Guardiumconnectorv3MUDetailsObj) HasAggHealthViewList() bool`

HasAggHealthViewList returns a boolean if a field has been set.

### GetConnectivityDetails

`func (o *Guardiumconnectorv3MUDetailsObj) GetConnectivityDetails() Guardiumconnectorv3GeneralDetailsObject`

GetConnectivityDetails returns the ConnectivityDetails field if non-nil, zero value otherwise.

### GetConnectivityDetailsOk

`func (o *Guardiumconnectorv3MUDetailsObj) GetConnectivityDetailsOk() (*Guardiumconnectorv3GeneralDetailsObject, bool)`

GetConnectivityDetailsOk returns a tuple with the ConnectivityDetails field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConnectivityDetails

`func (o *Guardiumconnectorv3MUDetailsObj) SetConnectivityDetails(v Guardiumconnectorv3GeneralDetailsObject)`

SetConnectivityDetails sets ConnectivityDetails field to given value.

### HasConnectivityDetails

`func (o *Guardiumconnectorv3MUDetailsObj) HasConnectivityDetails() bool`

HasConnectivityDetails returns a boolean if a field has been set.

### GetGeneralErrMessages

`func (o *Guardiumconnectorv3MUDetailsObj) GetGeneralErrMessages() []string`

GetGeneralErrMessages returns the GeneralErrMessages field if non-nil, zero value otherwise.

### GetGeneralErrMessagesOk

`func (o *Guardiumconnectorv3MUDetailsObj) GetGeneralErrMessagesOk() (*[]string, bool)`

GetGeneralErrMessagesOk returns a tuple with the GeneralErrMessages field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGeneralErrMessages

`func (o *Guardiumconnectorv3MUDetailsObj) SetGeneralErrMessages(v []string)`

SetGeneralErrMessages sets GeneralErrMessages field to given value.

### HasGeneralErrMessages

`func (o *Guardiumconnectorv3MUDetailsObj) HasGeneralErrMessages() bool`

HasGeneralErrMessages returns a boolean if a field has been set.

### GetUtilizationScheme

`func (o *Guardiumconnectorv3MUDetailsObj) GetUtilizationScheme() Guardiumconnectorv3UtilizationParameterObject`

GetUtilizationScheme returns the UtilizationScheme field if non-nil, zero value otherwise.

### GetUtilizationSchemeOk

`func (o *Guardiumconnectorv3MUDetailsObj) GetUtilizationSchemeOk() (*Guardiumconnectorv3UtilizationParameterObject, bool)`

GetUtilizationSchemeOk returns a tuple with the UtilizationScheme field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUtilizationScheme

`func (o *Guardiumconnectorv3MUDetailsObj) SetUtilizationScheme(v Guardiumconnectorv3UtilizationParameterObject)`

SetUtilizationScheme sets UtilizationScheme field to given value.

### HasUtilizationScheme

`func (o *Guardiumconnectorv3MUDetailsObj) HasUtilizationScheme() bool`

HasUtilizationScheme returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


