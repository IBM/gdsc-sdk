# ListDataStores200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**results** | [**List[DataStore]**](DataStore.md) |  | [optional] 
**next_token** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.list_data_stores200_response import ListDataStores200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ListDataStores200Response from a JSON string
list_data_stores200_response_instance = ListDataStores200Response.from_json(json)
# print the JSON string representation of the object
print(ListDataStores200Response.to_json())

# convert the object into a dict
list_data_stores200_response_dict = list_data_stores200_response_instance.to_dict()
# create an instance of ListDataStores200Response from a dict
list_data_stores200_response_from_dict = ListDataStores200Response.from_dict(list_data_stores200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


