# Healthcollectorv3Usage


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**label** | **str** |  | [optional] 
**name** | **str** |  | [optional] 
**nls_key** | **str** |  | [optional] 
**timestamp** | **datetime** |  | [optional] 
**value** | **float** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.healthcollectorv3_usage import Healthcollectorv3Usage

# TODO update the JSON string below
json = "{}"
# create an instance of Healthcollectorv3Usage from a JSON string
healthcollectorv3_usage_instance = Healthcollectorv3Usage.from_json(json)
# print the JSON string representation of the object
print(Healthcollectorv3Usage.to_json())

# convert the object into a dict
healthcollectorv3_usage_dict = healthcollectorv3_usage_instance.to_dict()
# create an instance of Healthcollectorv3Usage from a dict
healthcollectorv3_usage_from_dict = Healthcollectorv3Usage.from_dict(healthcollectorv3_usage_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


