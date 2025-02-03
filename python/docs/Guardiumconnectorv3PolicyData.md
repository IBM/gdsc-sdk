# Guardiumconnectorv3PolicyData


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**audit_pattern** | **str** |  | [optional] 
**category** | **str** |  | [optional] 
**installed** | **bool** |  | [optional] 
**log_flat** | **bool** |  | [optional] 
**policy_name** | **str** |  | [optional] 
**policy_type** | **str** |  | [optional] 
**rules** | [**List[Guardiumconnectorv3Rule]**](Guardiumconnectorv3Rule.md) |  | [optional] 
**rules_on_flat** | **bool** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_policy_data import Guardiumconnectorv3PolicyData

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3PolicyData from a JSON string
guardiumconnectorv3_policy_data_instance = Guardiumconnectorv3PolicyData.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3PolicyData.to_json())

# convert the object into a dict
guardiumconnectorv3_policy_data_dict = guardiumconnectorv3_policy_data_instance.to_dict()
# create an instance of Guardiumconnectorv3PolicyData from a dict
guardiumconnectorv3_policy_data_from_dict = Guardiumconnectorv3PolicyData.from_dict(guardiumconnectorv3_policy_data_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


