# UpdateDatastoreCustodian200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data_store_ids** | **str** |  | [optional] 
**custodian** | **str** |  | 

## Example

```python
from ibm_gdsc_sdk_saas.models.update_datastore_custodian200_response import UpdateDatastoreCustodian200Response

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateDatastoreCustodian200Response from a JSON string
update_datastore_custodian200_response_instance = UpdateDatastoreCustodian200Response.from_json(json)
# print the JSON string representation of the object
print(UpdateDatastoreCustodian200Response.to_json())

# convert the object into a dict
update_datastore_custodian200_response_dict = update_datastore_custodian200_response_instance.to_dict()
# create an instance of UpdateDatastoreCustodian200Response from a dict
update_datastore_custodian200_response_from_dict = UpdateDatastoreCustodian200Response.from_dict(update_datastore_custodian200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


