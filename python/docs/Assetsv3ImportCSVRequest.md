# Assetsv3ImportCSVRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**csv_id** | **str** |  | [optional] 
**import_action** | **str** |  | [optional] 
**template_type** | [**Assetsv3TemplateType**](Assetsv3TemplateType.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.assetsv3_import_csv_request import Assetsv3ImportCSVRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3ImportCSVRequest from a JSON string
assetsv3_import_csv_request_instance = Assetsv3ImportCSVRequest.from_json(json)
# print the JSON string representation of the object
print(Assetsv3ImportCSVRequest.to_json())

# convert the object into a dict
assetsv3_import_csv_request_dict = assetsv3_import_csv_request_instance.to_dict()
# create an instance of Assetsv3ImportCSVRequest from a dict
assetsv3_import_csv_request_from_dict = Assetsv3ImportCSVRequest.from_dict(assetsv3_import_csv_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


