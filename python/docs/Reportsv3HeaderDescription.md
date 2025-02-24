# Reportsv3HeaderDescription

HeaderDescription represents a header description's translation key and its translated value.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**nls_key** | **str** | Identifies the header&#39;s description NLS translated string. | [optional] 
**nls_value** | **str** | The header&#39;s description NLS translated string. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_header_description import Reportsv3HeaderDescription

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3HeaderDescription from a JSON string
reportsv3_header_description_instance = Reportsv3HeaderDescription.from_json(json)
# print the JSON string representation of the object
print(Reportsv3HeaderDescription.to_json())

# convert the object into a dict
reportsv3_header_description_dict = reportsv3_header_description_instance.to_dict()
# create an instance of Reportsv3HeaderDescription from a dict
reportsv3_header_description_from_dict = Reportsv3HeaderDescription.from_dict(reportsv3_header_description_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


