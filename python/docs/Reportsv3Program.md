# Reportsv3Program


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**create_user_id** | **str** |  | [optional] 
**create_user_name** | **str** |  | [optional] 
**date_created** | **datetime** |  | [optional] 
**date_updated** | **datetime** |  | [optional] 
**program_description** | **str** |  | [optional] 
**program_id** | **int** |  | [optional] 
**program_title** | **str** |  | [optional] 
**update_user_id** | **str** |  | [optional] 
**update_user_name** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_program import Reportsv3Program

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3Program from a JSON string
reportsv3_program_instance = Reportsv3Program.from_json(json)
# print the JSON string representation of the object
print(Reportsv3Program.to_json())

# convert the object into a dict
reportsv3_program_dict = reportsv3_program_instance.to_dict()
# create an instance of Reportsv3Program from a dict
reportsv3_program_from_dict = Reportsv3Program.from_dict(reportsv3_program_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


