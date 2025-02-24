# CloudAccountDetails


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cloud_account_id** | **str** |  | 
**cloud_account_name** | **str** |  | [optional] 
**service_provider** | [**ServiceProvider**](ServiceProvider.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.cloud_account_details import CloudAccountDetails

# TODO update the JSON string below
json = "{}"
# create an instance of CloudAccountDetails from a JSON string
cloud_account_details_instance = CloudAccountDetails.from_json(json)
# print the JSON string representation of the object
print(CloudAccountDetails.to_json())

# convert the object into a dict
cloud_account_details_dict = cloud_account_details_instance.to_dict()
# create an instance of CloudAccountDetails from a dict
cloud_account_details_from_dict = CloudAccountDetails.from_dict(cloud_account_details_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


