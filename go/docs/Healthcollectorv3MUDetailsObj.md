# Healthcollectorv3MUDetailsObj

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AggregationDetailsList** | Pointer to [**[]Healthcollectorv3AggregationDetailsObject**](Healthcollectorv3AggregationDetailsObject.md) | Aggregation details. | [optional] 
**ConnectivityDetails** | Pointer to [**Healthcollectorv3GeneralDetailsObject**](Healthcollectorv3GeneralDetailsObject.md) |  | [optional] 
**GeneralErrMessages** | Pointer to **[]string** | Additional messages and details about managed units. | [optional] 
**UtilizationParametersValues** | Pointer to [**Healthcollectorv3UtilizationParameterObject**](Healthcollectorv3UtilizationParameterObject.md) |  | [optional] 

## Methods

### NewHealthcollectorv3MUDetailsObj

`func NewHealthcollectorv3MUDetailsObj() *Healthcollectorv3MUDetailsObj`

NewHealthcollectorv3MUDetailsObj instantiates a new Healthcollectorv3MUDetailsObj object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewHealthcollectorv3MUDetailsObjWithDefaults

`func NewHealthcollectorv3MUDetailsObjWithDefaults() *Healthcollectorv3MUDetailsObj`

NewHealthcollectorv3MUDetailsObjWithDefaults instantiates a new Healthcollectorv3MUDetailsObj object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAggregationDetailsList

`func (o *Healthcollectorv3MUDetailsObj) GetAggregationDetailsList() []Healthcollectorv3AggregationDetailsObject`

GetAggregationDetailsList returns the AggregationDetailsList field if non-nil, zero value otherwise.

### GetAggregationDetailsListOk

`func (o *Healthcollectorv3MUDetailsObj) GetAggregationDetailsListOk() (*[]Healthcollectorv3AggregationDetailsObject, bool)`

GetAggregationDetailsListOk returns a tuple with the AggregationDetailsList field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAggregationDetailsList

`func (o *Healthcollectorv3MUDetailsObj) SetAggregationDetailsList(v []Healthcollectorv3AggregationDetailsObject)`

SetAggregationDetailsList sets AggregationDetailsList field to given value.

### HasAggregationDetailsList

`func (o *Healthcollectorv3MUDetailsObj) HasAggregationDetailsList() bool`

HasAggregationDetailsList returns a boolean if a field has been set.

### GetConnectivityDetails

`func (o *Healthcollectorv3MUDetailsObj) GetConnectivityDetails() Healthcollectorv3GeneralDetailsObject`

GetConnectivityDetails returns the ConnectivityDetails field if non-nil, zero value otherwise.

### GetConnectivityDetailsOk

`func (o *Healthcollectorv3MUDetailsObj) GetConnectivityDetailsOk() (*Healthcollectorv3GeneralDetailsObject, bool)`

GetConnectivityDetailsOk returns a tuple with the ConnectivityDetails field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConnectivityDetails

`func (o *Healthcollectorv3MUDetailsObj) SetConnectivityDetails(v Healthcollectorv3GeneralDetailsObject)`

SetConnectivityDetails sets ConnectivityDetails field to given value.

### HasConnectivityDetails

`func (o *Healthcollectorv3MUDetailsObj) HasConnectivityDetails() bool`

HasConnectivityDetails returns a boolean if a field has been set.

### GetGeneralErrMessages

`func (o *Healthcollectorv3MUDetailsObj) GetGeneralErrMessages() []string`

GetGeneralErrMessages returns the GeneralErrMessages field if non-nil, zero value otherwise.

### GetGeneralErrMessagesOk

`func (o *Healthcollectorv3MUDetailsObj) GetGeneralErrMessagesOk() (*[]string, bool)`

GetGeneralErrMessagesOk returns a tuple with the GeneralErrMessages field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGeneralErrMessages

`func (o *Healthcollectorv3MUDetailsObj) SetGeneralErrMessages(v []string)`

SetGeneralErrMessages sets GeneralErrMessages field to given value.

### HasGeneralErrMessages

`func (o *Healthcollectorv3MUDetailsObj) HasGeneralErrMessages() bool`

HasGeneralErrMessages returns a boolean if a field has been set.

### GetUtilizationParametersValues

`func (o *Healthcollectorv3MUDetailsObj) GetUtilizationParametersValues() Healthcollectorv3UtilizationParameterObject`

GetUtilizationParametersValues returns the UtilizationParametersValues field if non-nil, zero value otherwise.

### GetUtilizationParametersValuesOk

`func (o *Healthcollectorv3MUDetailsObj) GetUtilizationParametersValuesOk() (*Healthcollectorv3UtilizationParameterObject, bool)`

GetUtilizationParametersValuesOk returns a tuple with the UtilizationParametersValues field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUtilizationParametersValues

`func (o *Healthcollectorv3MUDetailsObj) SetUtilizationParametersValues(v Healthcollectorv3UtilizationParameterObject)`

SetUtilizationParametersValues sets UtilizationParametersValues field to given value.

### HasUtilizationParametersValues

`func (o *Healthcollectorv3MUDetailsObj) HasUtilizationParametersValues() bool`

HasUtilizationParametersValues returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


