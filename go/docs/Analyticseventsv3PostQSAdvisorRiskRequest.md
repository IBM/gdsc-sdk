# Analyticseventsv3PostQSAdvisorRiskRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Origin** | Pointer to [**Templatesv3Origin**](Templatesv3Origin.md) |  | [optional] [default to UNDEFINED_ORIGIN]
**OriginData** | Pointer to **string** |  | [optional] 
**TargetReceivers** | Pointer to [**[]Schedulerv3Recipient**](Schedulerv3Recipient.md) |  | [optional] 
**TemplateData** | Pointer to **map[string]string** |  | [optional] 
**Title** | Pointer to **string** | Optional:Brief title used to quickly describe the notification. | [optional] 

## Methods

### NewAnalyticseventsv3PostQSAdvisorRiskRequest

`func NewAnalyticseventsv3PostQSAdvisorRiskRequest() *Analyticseventsv3PostQSAdvisorRiskRequest`

NewAnalyticseventsv3PostQSAdvisorRiskRequest instantiates a new Analyticseventsv3PostQSAdvisorRiskRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAnalyticseventsv3PostQSAdvisorRiskRequestWithDefaults

`func NewAnalyticseventsv3PostQSAdvisorRiskRequestWithDefaults() *Analyticseventsv3PostQSAdvisorRiskRequest`

NewAnalyticseventsv3PostQSAdvisorRiskRequestWithDefaults instantiates a new Analyticseventsv3PostQSAdvisorRiskRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOrigin

`func (o *Analyticseventsv3PostQSAdvisorRiskRequest) GetOrigin() Templatesv3Origin`

GetOrigin returns the Origin field if non-nil, zero value otherwise.

### GetOriginOk

`func (o *Analyticseventsv3PostQSAdvisorRiskRequest) GetOriginOk() (*Templatesv3Origin, bool)`

GetOriginOk returns a tuple with the Origin field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrigin

`func (o *Analyticseventsv3PostQSAdvisorRiskRequest) SetOrigin(v Templatesv3Origin)`

SetOrigin sets Origin field to given value.

### HasOrigin

`func (o *Analyticseventsv3PostQSAdvisorRiskRequest) HasOrigin() bool`

HasOrigin returns a boolean if a field has been set.

### GetOriginData

`func (o *Analyticseventsv3PostQSAdvisorRiskRequest) GetOriginData() string`

GetOriginData returns the OriginData field if non-nil, zero value otherwise.

### GetOriginDataOk

`func (o *Analyticseventsv3PostQSAdvisorRiskRequest) GetOriginDataOk() (*string, bool)`

GetOriginDataOk returns a tuple with the OriginData field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOriginData

`func (o *Analyticseventsv3PostQSAdvisorRiskRequest) SetOriginData(v string)`

SetOriginData sets OriginData field to given value.

### HasOriginData

`func (o *Analyticseventsv3PostQSAdvisorRiskRequest) HasOriginData() bool`

HasOriginData returns a boolean if a field has been set.

### GetTargetReceivers

`func (o *Analyticseventsv3PostQSAdvisorRiskRequest) GetTargetReceivers() []Schedulerv3Recipient`

GetTargetReceivers returns the TargetReceivers field if non-nil, zero value otherwise.

### GetTargetReceiversOk

`func (o *Analyticseventsv3PostQSAdvisorRiskRequest) GetTargetReceiversOk() (*[]Schedulerv3Recipient, bool)`

GetTargetReceiversOk returns a tuple with the TargetReceivers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTargetReceivers

`func (o *Analyticseventsv3PostQSAdvisorRiskRequest) SetTargetReceivers(v []Schedulerv3Recipient)`

SetTargetReceivers sets TargetReceivers field to given value.

### HasTargetReceivers

`func (o *Analyticseventsv3PostQSAdvisorRiskRequest) HasTargetReceivers() bool`

HasTargetReceivers returns a boolean if a field has been set.

### GetTemplateData

`func (o *Analyticseventsv3PostQSAdvisorRiskRequest) GetTemplateData() map[string]string`

GetTemplateData returns the TemplateData field if non-nil, zero value otherwise.

### GetTemplateDataOk

`func (o *Analyticseventsv3PostQSAdvisorRiskRequest) GetTemplateDataOk() (*map[string]string, bool)`

GetTemplateDataOk returns a tuple with the TemplateData field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTemplateData

`func (o *Analyticseventsv3PostQSAdvisorRiskRequest) SetTemplateData(v map[string]string)`

SetTemplateData sets TemplateData field to given value.

### HasTemplateData

`func (o *Analyticseventsv3PostQSAdvisorRiskRequest) HasTemplateData() bool`

HasTemplateData returns a boolean if a field has been set.

### GetTitle

`func (o *Analyticseventsv3PostQSAdvisorRiskRequest) GetTitle() string`

GetTitle returns the Title field if non-nil, zero value otherwise.

### GetTitleOk

`func (o *Analyticseventsv3PostQSAdvisorRiskRequest) GetTitleOk() (*string, bool)`

GetTitleOk returns a tuple with the Title field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTitle

`func (o *Analyticseventsv3PostQSAdvisorRiskRequest) SetTitle(v string)`

SetTitle sets Title field to given value.

### HasTitle

`func (o *Analyticseventsv3PostQSAdvisorRiskRequest) HasTitle() bool`

HasTitle returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


