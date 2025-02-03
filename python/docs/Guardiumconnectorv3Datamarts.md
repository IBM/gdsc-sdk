# Guardiumconnectorv3Datamarts


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dm** | **str** |  | [optional] 
**dm_current_type** | **str** |  | [optional] 
**dm_default_type** | **str** |  | [optional] 
**schedule** | **str** |  | [optional] 
**unit_types** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_datamarts import Guardiumconnectorv3Datamarts

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3Datamarts from a JSON string
guardiumconnectorv3_datamarts_instance = Guardiumconnectorv3Datamarts.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3Datamarts.to_json())

# convert the object into a dict
guardiumconnectorv3_datamarts_dict = guardiumconnectorv3_datamarts_instance.to_dict()
# create an instance of Guardiumconnectorv3Datamarts from a dict
guardiumconnectorv3_datamarts_from_dict = Guardiumconnectorv3Datamarts.from_dict(guardiumconnectorv3_datamarts_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


