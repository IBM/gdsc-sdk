# Reportsv3DisplayHeader

DisplayHeader that have the header name and the translated value.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**field_name** | [**Reportsv3FieldName**](Reportsv3FieldName.md) |  | [optional] 
**header_description** | [**Reportsv3HeaderDescription**](Reportsv3HeaderDescription.md) |  | [optional] 
**header_id** | **str** | The header ID. | [optional] 
**header_name** | **str** | The header name. | [optional] 
**sequence** | **int** | Sequence of the corresponding header. | [optional] 
**table_name** | **str** | Table name. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_display_header import Reportsv3DisplayHeader

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3DisplayHeader from a JSON string
reportsv3_display_header_instance = Reportsv3DisplayHeader.from_json(json)
# print the JSON string representation of the object
print(Reportsv3DisplayHeader.to_json())

# convert the object into a dict
reportsv3_display_header_dict = reportsv3_display_header_instance.to_dict()
# create an instance of Reportsv3DisplayHeader from a dict
reportsv3_display_header_from_dict = Reportsv3DisplayHeader.from_dict(reportsv3_display_header_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


