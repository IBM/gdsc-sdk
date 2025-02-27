# Reportsrunnerv3GetReportDataCountResponse

GetReportDataCountResponse is the argument get count.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**limit_reached** | **bool** | limit_reached - signifies if the query limit reached. When set to true, it means that the limit was reached and there are more records on DB which were not read yet. | [optional] 
**total_number_of_rows** | **int** | Total Rows Count. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsrunnerv3_get_report_data_count_response import Reportsrunnerv3GetReportDataCountResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsrunnerv3GetReportDataCountResponse from a JSON string
reportsrunnerv3_get_report_data_count_response_instance = Reportsrunnerv3GetReportDataCountResponse.from_json(json)
# print the JSON string representation of the object
print(Reportsrunnerv3GetReportDataCountResponse.to_json())

# convert the object into a dict
reportsrunnerv3_get_report_data_count_response_dict = reportsrunnerv3_get_report_data_count_response_instance.to_dict()
# create an instance of Reportsrunnerv3GetReportDataCountResponse from a dict
reportsrunnerv3_get_report_data_count_response_from_dict = Reportsrunnerv3GetReportDataCountResponse.from_dict(reportsrunnerv3_get_report_data_count_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


