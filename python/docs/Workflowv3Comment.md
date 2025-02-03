# Workflowv3Comment

Case or task read-only comment.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**what** | **str** | Text of the comment. | [optional] 
**when** | **datetime** | Timestamp when the comment happened. | [optional] 
**who** | **str** | User ID who created the comment. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.workflowv3_comment import Workflowv3Comment

# TODO update the JSON string below
json = "{}"
# create an instance of Workflowv3Comment from a JSON string
workflowv3_comment_instance = Workflowv3Comment.from_json(json)
# print the JSON string representation of the object
print(Workflowv3Comment.to_json())

# convert the object into a dict
workflowv3_comment_dict = workflowv3_comment_instance.to_dict()
# create an instance of Workflowv3Comment from a dict
workflowv3_comment_from_dict = Workflowv3Comment.from_dict(workflowv3_comment_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


