# Connectionsv3HeaderFilter

Header filter.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The unique identifier for this header. | [optional] 
**values** | **List[str]** | The values to match. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.connectionsv3_header_filter import Connectionsv3HeaderFilter

# TODO update the JSON string below
json = "{}"
# create an instance of Connectionsv3HeaderFilter from a JSON string
connectionsv3_header_filter_instance = Connectionsv3HeaderFilter.from_json(json)
# print the JSON string representation of the object
print(Connectionsv3HeaderFilter.to_json())

# convert the object into a dict
connectionsv3_header_filter_dict = connectionsv3_header_filter_instance.to_dict()
# create an instance of Connectionsv3HeaderFilter from a dict
connectionsv3_header_filter_from_dict = Connectionsv3HeaderFilter.from_dict(connectionsv3_header_filter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


