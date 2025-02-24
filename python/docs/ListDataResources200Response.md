# ListDataResources200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**results** | [**List[DataResource]**](DataResource.md) |  | [optional] 
**next_token** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.list_data_resources200_response import ListDataResources200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ListDataResources200Response from a JSON string
list_data_resources200_response_instance = ListDataResources200Response.from_json(json)
# print the JSON string representation of the object
print(ListDataResources200Response.to_json())

# convert the object into a dict
list_data_resources200_response_dict = list_data_resources200_response_instance.to_dict()
# create an instance of ListDataResources200Response from a dict
list_data_resources200_response_from_dict = ListDataResources200Response.from_dict(list_data_resources200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


