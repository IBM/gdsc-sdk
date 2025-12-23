# Reportsv3CategoryField


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**can_be_used_in_chart** | **bool** | If the header can be used in charts. | [optional] 
**field_name** | **str** | Field name&#39;s NLS translation key and translated value. | [optional] 
**group_type_id** | **int** | Group type id for the filter. | [optional] 
**header_category** | **str** | The category of the header. | [optional] 
**header_data_type** | [**Reportsv3HeaderDataType**](Reportsv3HeaderDataType.md) |  | [optional] [default to Reportsv3HeaderDataType.UNDEFINED_REPORT_HEADER_TYPE]
**header_description** | **str** | Header description&#39;s NLS translation key and translated value. | [optional] 
**header_name** | **str** | The header name. | [optional] 
**is_recommended** | **bool** | If the header is recommended. | [optional] 
**is_visible** | **bool** |  | [optional] 
**table_name** | **str** | Table name. | [optional] 
**type** | [**Reportsv3HeaderType**](Reportsv3HeaderType.md) |  | [optional] [default to Reportsv3HeaderType.UNDEFINED_TYPE]
**type_length** | **int** | Header type length. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_category_field import Reportsv3CategoryField

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3CategoryField from a JSON string
reportsv3_category_field_instance = Reportsv3CategoryField.from_json(json)
# print the JSON string representation of the object
print(Reportsv3CategoryField.to_json())

# convert the object into a dict
reportsv3_category_field_dict = reportsv3_category_field_instance.to_dict()
# create an instance of Reportsv3CategoryField from a dict
reportsv3_category_field_from_dict = Reportsv3CategoryField.from_dict(reportsv3_category_field_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


