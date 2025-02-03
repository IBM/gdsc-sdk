# Reportsv3ReportHeader

Report header.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aggregation_type** | [**Reportsv3AggregationType**](Reportsv3AggregationType.md) |  | [optional] 
**field_name** | [**Reportsv3FieldName**](Reportsv3FieldName.md) |  | [optional] 
**group_type_id** | **int** | Group type id for the filter. | [optional] 
**header_data_type** | [**Reportsv3HeaderDataType**](Reportsv3HeaderDataType.md) |  | [optional] 
**header_description** | [**Reportsv3HeaderDescription**](Reportsv3HeaderDescription.md) |  | [optional] 
**header_id** | **str** | Header ID. | [optional] 
**header_name** | **str** | The header name. | [optional] 
**header_type** | [**Reportsv3HeaderType**](Reportsv3HeaderType.md) |  | [optional] 
**header_type_length** | **int** | Header type length. | [optional] 
**literal** | [**Reportsv3Literal**](Reportsv3Literal.md) |  | [optional] 
**order_by** | [**Reportsv3OrderBy**](Reportsv3OrderBy.md) |  | [optional] 
**order_by_seq** | **int** | Order by sequence. | [optional] 
**schema_name** | **str** | Schema name. | [optional] 
**sequence** | **int** | Column sequence number. | [optional] 
**table_name** | **str** | Table name. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.reportsv3_report_header import Reportsv3ReportHeader

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3ReportHeader from a JSON string
reportsv3_report_header_instance = Reportsv3ReportHeader.from_json(json)
# print the JSON string representation of the object
print(Reportsv3ReportHeader.to_json())

# convert the object into a dict
reportsv3_report_header_dict = reportsv3_report_header_instance.to_dict()
# create an instance of Reportsv3ReportHeader from a dict
reportsv3_report_header_from_dict = Reportsv3ReportHeader.from_dict(reportsv3_report_header_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


