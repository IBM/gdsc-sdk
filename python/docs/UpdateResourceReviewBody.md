# UpdateResourceReviewBody


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**is_reviewed** | **bool** |  | 

## Example

```python
from ibm_gdsc_sdk_saas.models.update_resource_review_body import UpdateResourceReviewBody

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateResourceReviewBody from a JSON string
update_resource_review_body_instance = UpdateResourceReviewBody.from_json(json)
# print the JSON string representation of the object
print(UpdateResourceReviewBody.to_json())

# convert the object into a dict
update_resource_review_body_dict = update_resource_review_body_instance.to_dict()
# create an instance of UpdateResourceReviewBody from a dict
update_resource_review_body_from_dict = UpdateResourceReviewBody.from_dict(update_resource_review_body_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


