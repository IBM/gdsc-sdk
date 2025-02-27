# Resourcecontrollerk8v3AppHpa

AppHpa contains the information required for horizontal pod autoscaler.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**max_replicas** | **str** | The upper limit for the number of pods that can be set by the autoscaler. It cannot be smaller than min_replicas. | [optional] 
**min_replicas** | **str** | Optional: The lower limit for the number of pods that can be set by the autoscaler, default 1. | [optional] 
**target_cpu_utilization_percentage** | **str** | Optional: The target average CPU utilization (represented as a percentage of requested CPU) over all the pods; if not specified it defaults to the target CPU utilization at 80% of the requested resources. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_app_hpa import Resourcecontrollerk8v3AppHpa

# TODO update the JSON string below
json = "{}"
# create an instance of Resourcecontrollerk8v3AppHpa from a JSON string
resourcecontrollerk8v3_app_hpa_instance = Resourcecontrollerk8v3AppHpa.from_json(json)
# print the JSON string representation of the object
print(Resourcecontrollerk8v3AppHpa.to_json())

# convert the object into a dict
resourcecontrollerk8v3_app_hpa_dict = resourcecontrollerk8v3_app_hpa_instance.to_dict()
# create an instance of Resourcecontrollerk8v3AppHpa from a dict
resourcecontrollerk8v3_app_hpa_from_dict = Resourcecontrollerk8v3AppHpa.from_dict(resourcecontrollerk8v3_app_hpa_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


