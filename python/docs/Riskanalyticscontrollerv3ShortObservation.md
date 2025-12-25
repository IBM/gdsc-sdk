# Riskanalyticscontrollerv3ShortObservation

Short observation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **int** | Count of observation. | [optional] 
**type** | [**Riskanalyticscontrollerv3ObservationType**](Riskanalyticscontrollerv3ObservationType.md) |  | [optional] [default to Riskanalyticscontrollerv3ObservationType.UNDEFINED_OBSERVATION_TYPE]

## Example

```python
from ibm_gdsc_sdk_saas.models.riskanalyticscontrollerv3_short_observation import Riskanalyticscontrollerv3ShortObservation

# TODO update the JSON string below
json = "{}"
# create an instance of Riskanalyticscontrollerv3ShortObservation from a JSON string
riskanalyticscontrollerv3_short_observation_instance = Riskanalyticscontrollerv3ShortObservation.from_json(json)
# print the JSON string representation of the object
print(Riskanalyticscontrollerv3ShortObservation.to_json())

# convert the object into a dict
riskanalyticscontrollerv3_short_observation_dict = riskanalyticscontrollerv3_short_observation_instance.to_dict()
# create an instance of Riskanalyticscontrollerv3ShortObservation from a dict
riskanalyticscontrollerv3_short_observation_from_dict = Riskanalyticscontrollerv3ShortObservation.from_dict(riskanalyticscontrollerv3_short_observation_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


