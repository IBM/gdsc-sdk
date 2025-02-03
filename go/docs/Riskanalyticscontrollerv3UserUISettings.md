# Riskanalyticscontrollerv3UserUISettings

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CardSettings** | Pointer to [**[]Riskanalyticscontrollerv3CardSettings**](Riskanalyticscontrollerv3CardSettings.md) | A list of card settings for each view(box) of risks. | [optional] 
**ShowBanner** | Pointer to **bool** | Show_banner a flag to show additional info in the top of screen or to hide it. | [optional] 

## Methods

### NewRiskanalyticscontrollerv3UserUISettings

`func NewRiskanalyticscontrollerv3UserUISettings() *Riskanalyticscontrollerv3UserUISettings`

NewRiskanalyticscontrollerv3UserUISettings instantiates a new Riskanalyticscontrollerv3UserUISettings object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRiskanalyticscontrollerv3UserUISettingsWithDefaults

`func NewRiskanalyticscontrollerv3UserUISettingsWithDefaults() *Riskanalyticscontrollerv3UserUISettings`

NewRiskanalyticscontrollerv3UserUISettingsWithDefaults instantiates a new Riskanalyticscontrollerv3UserUISettings object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCardSettings

`func (o *Riskanalyticscontrollerv3UserUISettings) GetCardSettings() []Riskanalyticscontrollerv3CardSettings`

GetCardSettings returns the CardSettings field if non-nil, zero value otherwise.

### GetCardSettingsOk

`func (o *Riskanalyticscontrollerv3UserUISettings) GetCardSettingsOk() (*[]Riskanalyticscontrollerv3CardSettings, bool)`

GetCardSettingsOk returns a tuple with the CardSettings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCardSettings

`func (o *Riskanalyticscontrollerv3UserUISettings) SetCardSettings(v []Riskanalyticscontrollerv3CardSettings)`

SetCardSettings sets CardSettings field to given value.

### HasCardSettings

`func (o *Riskanalyticscontrollerv3UserUISettings) HasCardSettings() bool`

HasCardSettings returns a boolean if a field has been set.

### GetShowBanner

`func (o *Riskanalyticscontrollerv3UserUISettings) GetShowBanner() bool`

GetShowBanner returns the ShowBanner field if non-nil, zero value otherwise.

### GetShowBannerOk

`func (o *Riskanalyticscontrollerv3UserUISettings) GetShowBannerOk() (*bool, bool)`

GetShowBannerOk returns a tuple with the ShowBanner field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShowBanner

`func (o *Riskanalyticscontrollerv3UserUISettings) SetShowBanner(v bool)`

SetShowBanner sets ShowBanner field to given value.

### HasShowBanner

`func (o *Riskanalyticscontrollerv3UserUISettings) HasShowBanner() bool`

HasShowBanner returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


