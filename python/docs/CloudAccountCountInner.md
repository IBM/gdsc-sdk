# CloudAccountCountInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cloud_account_id** | **str** |  | 
**count** | **float** |  | 

## Example

```python
from ibm_gdsc_sdk_saas.models.cloud_account_count_inner import CloudAccountCountInner

# TODO update the JSON string below
json = "{}"
# create an instance of CloudAccountCountInner from a JSON string
cloud_account_count_inner_instance = CloudAccountCountInner.from_json(json)
# print the JSON string representation of the object
print(CloudAccountCountInner.to_json())

# convert the object into a dict
cloud_account_count_inner_dict = cloud_account_count_inner_instance.to_dict()
# create an instance of CloudAccountCountInner from a dict
cloud_account_count_inner_from_dict = CloudAccountCountInner.from_dict(cloud_account_count_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


