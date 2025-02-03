# SetDataStoreLabelRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**label** | **str** |  | 

## Example

```python
from ibm_gdsc_sdk_software.models.set_data_store_label_request import SetDataStoreLabelRequest

# TODO update the JSON string below
json = "{}"
# create an instance of SetDataStoreLabelRequest from a JSON string
set_data_store_label_request_instance = SetDataStoreLabelRequest.from_json(json)
# print the JSON string representation of the object
print(SetDataStoreLabelRequest.to_json())

# convert the object into a dict
set_data_store_label_request_dict = set_data_store_label_request_instance.to_dict()
# create an instance of SetDataStoreLabelRequest from a dict
set_data_store_label_request_from_dict = SetDataStoreLabelRequest.from_dict(set_data_store_label_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


