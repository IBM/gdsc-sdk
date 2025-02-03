# Policybuilderv3GetPolicyNamesFromRuleIDsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**PolicyNames** | Pointer to **map[string]string** | Map where key is the the rule id and value is the policy name that uses that rule id. | [optional] 
**Status** | Pointer to [**Policybuilderv3StatusResponseBase**](Policybuilderv3StatusResponseBase.md) |  | [optional] 

## Methods

### NewPolicybuilderv3GetPolicyNamesFromRuleIDsResponse

`func NewPolicybuilderv3GetPolicyNamesFromRuleIDsResponse() *Policybuilderv3GetPolicyNamesFromRuleIDsResponse`

NewPolicybuilderv3GetPolicyNamesFromRuleIDsResponse instantiates a new Policybuilderv3GetPolicyNamesFromRuleIDsResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPolicybuilderv3GetPolicyNamesFromRuleIDsResponseWithDefaults

`func NewPolicybuilderv3GetPolicyNamesFromRuleIDsResponseWithDefaults() *Policybuilderv3GetPolicyNamesFromRuleIDsResponse`

NewPolicybuilderv3GetPolicyNamesFromRuleIDsResponseWithDefaults instantiates a new Policybuilderv3GetPolicyNamesFromRuleIDsResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPolicyNames

`func (o *Policybuilderv3GetPolicyNamesFromRuleIDsResponse) GetPolicyNames() map[string]string`

GetPolicyNames returns the PolicyNames field if non-nil, zero value otherwise.

### GetPolicyNamesOk

`func (o *Policybuilderv3GetPolicyNamesFromRuleIDsResponse) GetPolicyNamesOk() (*map[string]string, bool)`

GetPolicyNamesOk returns a tuple with the PolicyNames field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPolicyNames

`func (o *Policybuilderv3GetPolicyNamesFromRuleIDsResponse) SetPolicyNames(v map[string]string)`

SetPolicyNames sets PolicyNames field to given value.

### HasPolicyNames

`func (o *Policybuilderv3GetPolicyNamesFromRuleIDsResponse) HasPolicyNames() bool`

HasPolicyNames returns a boolean if a field has been set.

### GetStatus

`func (o *Policybuilderv3GetPolicyNamesFromRuleIDsResponse) GetStatus() Policybuilderv3StatusResponseBase`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *Policybuilderv3GetPolicyNamesFromRuleIDsResponse) GetStatusOk() (*Policybuilderv3StatusResponseBase, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *Policybuilderv3GetPolicyNamesFromRuleIDsResponse) SetStatus(v Policybuilderv3StatusResponseBase)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *Policybuilderv3GetPolicyNamesFromRuleIDsResponse) HasStatus() bool`

HasStatus returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


