# Reportsv3Control


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**artifacts** | [**List[Reportsv3Artifact]**](Reportsv3Artifact.md) |  | [optional] 
**control_code** | **str** |  | [optional] 
**control_id** | **int** |  | [optional] 
**create_user_id** | **str** |  | [optional] 
**create_user_name** | **str** |  | [optional] 
**created_by_template** | **bool** |  | [optional] 
**date_created** | **datetime** |  | [optional] 
**date_updated** | **datetime** |  | [optional] 
**program_id** | **int** |  | [optional] 
**tags** | **List[str]** |  | [optional] 
**template_id** | **str** |  | [optional] 
**theme** | **str** |  | [optional] 
**title** | **str** |  | [optional] 
**update_user_id** | **str** |  | [optional] 
**update_user_name** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_control import Reportsv3Control

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3Control from a JSON string
reportsv3_control_instance = Reportsv3Control.from_json(json)
# print the JSON string representation of the object
print(Reportsv3Control.to_json())

# convert the object into a dict
reportsv3_control_dict = reportsv3_control_instance.to_dict()
# create an instance of Reportsv3Control from a dict
reportsv3_control_from_dict = Reportsv3Control.from_dict(reportsv3_control_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


