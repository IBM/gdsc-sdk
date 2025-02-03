# Riskanalyticscontrollerv3Observation

Observation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lead_feature_id** | **int** | Lead feature id. | [optional] 
**observation_description** | **str** | Observation description. | [optional] 
**observation_id** | **int** | Id. | [optional] 
**observation_type** | [**Riskanalyticscontrollerv3ObservationType**](Riskanalyticscontrollerv3ObservationType.md) |  | [optional] 
**time** | **datetime** | Time - date in format YYYY-MM-DDTHH:mm:ssZ. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.riskanalyticscontrollerv3_observation import Riskanalyticscontrollerv3Observation

# TODO update the JSON string below
json = "{}"
# create an instance of Riskanalyticscontrollerv3Observation from a JSON string
riskanalyticscontrollerv3_observation_instance = Riskanalyticscontrollerv3Observation.from_json(json)
# print the JSON string representation of the object
print(Riskanalyticscontrollerv3Observation.to_json())

# convert the object into a dict
riskanalyticscontrollerv3_observation_dict = riskanalyticscontrollerv3_observation_instance.to_dict()
# create an instance of Riskanalyticscontrollerv3Observation from a dict
riskanalyticscontrollerv3_observation_from_dict = Riskanalyticscontrollerv3Observation.from_dict(riskanalyticscontrollerv3_observation_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


