# Reportsv3Requirement


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**control_id** | **int** |  | [optional] 
**create_user_id** | **str** |  | [optional] 
**create_user_name** | **str** |  | [optional] 
**date_created** | **datetime** |  | [optional] 
**date_updated** | **datetime** |  | [optional] 
**link** | **str** |  | [optional] 
**regulation** | **str** |  | [optional] 
**requirement_code** | **str** |  | [optional] 
**requirement_description** | **str** |  | [optional] 
**requirement_id** | **int** |  | [optional] 
**update_user_id** | **str** |  | [optional] 
**update_user_name** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_requirement import Reportsv3Requirement

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3Requirement from a JSON string
reportsv3_requirement_instance = Reportsv3Requirement.from_json(json)
# print the JSON string representation of the object
print(Reportsv3Requirement.to_json())

# convert the object into a dict
reportsv3_requirement_dict = reportsv3_requirement_instance.to_dict()
# create an instance of Reportsv3Requirement from a dict
reportsv3_requirement_from_dict = Reportsv3Requirement.from_dict(reportsv3_requirement_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


