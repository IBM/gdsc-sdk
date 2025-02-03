# Sensitivity


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sensitivity_id** | **str** |  | 
**tag** | **str** |  | 
**query** | **str** |  | 
**resource_id** | **str** |  | 
**quarantine_bucket_link** | **str** |  | 
**data_store_id** | **str** |  | 
**last_seen** | **str** |  | 
**hash** | **str** |  | 
**category** | **str** |  | 

## Example

```python
from ibm_gdsc_sdk_software.models.sensitivity import Sensitivity

# TODO update the JSON string below
json = "{}"
# create an instance of Sensitivity from a JSON string
sensitivity_instance = Sensitivity.from_json(json)
# print the JSON string representation of the object
print(Sensitivity.to_json())

# convert the object into a dict
sensitivity_dict = sensitivity_instance.to_dict()
# create an instance of Sensitivity from a dict
sensitivity_from_dict = Sensitivity.from_dict(sensitivity_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


