# Riskanalyticscontrollerv3Indicator


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**indicator_desc** | **str** | Indicator (feature) description. | [optional] 
**indicator_score** | **int** | Indicator (feature) score. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.riskanalyticscontrollerv3_indicator import Riskanalyticscontrollerv3Indicator

# TODO update the JSON string below
json = "{}"
# create an instance of Riskanalyticscontrollerv3Indicator from a JSON string
riskanalyticscontrollerv3_indicator_instance = Riskanalyticscontrollerv3Indicator.from_json(json)
# print the JSON string representation of the object
print(Riskanalyticscontrollerv3Indicator.to_json())

# convert the object into a dict
riskanalyticscontrollerv3_indicator_dict = riskanalyticscontrollerv3_indicator_instance.to_dict()
# create an instance of Riskanalyticscontrollerv3Indicator from a dict
riskanalyticscontrollerv3_indicator_from_dict = Riskanalyticscontrollerv3Indicator.from_dict(riskanalyticscontrollerv3_indicator_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


