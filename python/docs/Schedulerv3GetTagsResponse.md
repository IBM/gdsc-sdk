# Schedulerv3GetTagsResponse

GetTagsResponse returns an array of unique tags.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tags** | **List[str]** | Tags is a string created by each user. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.schedulerv3_get_tags_response import Schedulerv3GetTagsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Schedulerv3GetTagsResponse from a JSON string
schedulerv3_get_tags_response_instance = Schedulerv3GetTagsResponse.from_json(json)
# print the JSON string representation of the object
print(Schedulerv3GetTagsResponse.to_json())

# convert the object into a dict
schedulerv3_get_tags_response_dict = schedulerv3_get_tags_response_instance.to_dict()
# create an instance of Schedulerv3GetTagsResponse from a dict
schedulerv3_get_tags_response_from_dict = Schedulerv3GetTagsResponse.from_dict(schedulerv3_get_tags_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


