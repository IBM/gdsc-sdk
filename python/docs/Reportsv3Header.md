# Reportsv3Header


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**can_be_used_in_chart** | **bool** | If the header can be used in charts. | [optional] 
**field_name** | [**Reportsv3FieldName**](Reportsv3FieldName.md) |  | [optional] 
**group_type_id** | **int** | Group type id for the filter. | [optional] 
**header_category** | **str** | The category of the header. | [optional] 
**header_description** | [**Reportsv3HeaderDescription**](Reportsv3HeaderDescription.md) |  | [optional] 
**header_id** | **str** | The header id. | [optional] 
**header_name** | **str** | The header name. | [optional] 
**is_recommended** | **bool** | If the header is recommended. | [optional] 
**table_name** | **str** | Table name. | [optional] 
**type** | [**Reportsv3HeaderType**](Reportsv3HeaderType.md) |  | [optional] 
**type_length** | **int** | Header type length. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_header import Reportsv3Header

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3Header from a JSON string
reportsv3_header_instance = Reportsv3Header.from_json(json)
# print the JSON string representation of the object
print(Reportsv3Header.to_json())

# convert the object into a dict
reportsv3_header_dict = reportsv3_header_instance.to_dict()
# create an instance of Reportsv3Header from a dict
reportsv3_header_from_dict = Reportsv3Header.from_dict(reportsv3_header_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


