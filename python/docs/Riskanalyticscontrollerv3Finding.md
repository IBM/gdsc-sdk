# Riskanalyticscontrollerv3Finding

A finding (AKA observation); details the evidence found in a Risk event hourly observation; may contain multiple finding maps.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**finding_description** | **str** | Finding description. | [optional] 
**finding_details_map** | [**List[Riskanalyticscontrollerv3FindingDetailsMap]**](Riskanalyticscontrollerv3FindingDetailsMap.md) | Finding details - Optional. | [optional] 
**finding_type** | [**Riskanalyticscontrollerv3ObservationType**](Riskanalyticscontrollerv3ObservationType.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.riskanalyticscontrollerv3_finding import Riskanalyticscontrollerv3Finding

# TODO update the JSON string below
json = "{}"
# create an instance of Riskanalyticscontrollerv3Finding from a JSON string
riskanalyticscontrollerv3_finding_instance = Riskanalyticscontrollerv3Finding.from_json(json)
# print the JSON string representation of the object
print(Riskanalyticscontrollerv3Finding.to_json())

# convert the object into a dict
riskanalyticscontrollerv3_finding_dict = riskanalyticscontrollerv3_finding_instance.to_dict()
# create an instance of Riskanalyticscontrollerv3Finding from a dict
riskanalyticscontrollerv3_finding_from_dict = Riskanalyticscontrollerv3Finding.from_dict(riskanalyticscontrollerv3_finding_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


