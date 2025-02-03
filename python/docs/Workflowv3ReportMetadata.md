# Workflowv3ReportMetadata


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** |  | [optional] 
**name** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.workflowv3_report_metadata import Workflowv3ReportMetadata

# TODO update the JSON string below
json = "{}"
# create an instance of Workflowv3ReportMetadata from a JSON string
workflowv3_report_metadata_instance = Workflowv3ReportMetadata.from_json(json)
# print the JSON string representation of the object
print(Workflowv3ReportMetadata.to_json())

# convert the object into a dict
workflowv3_report_metadata_dict = workflowv3_report_metadata_instance.to_dict()
# create an instance of Workflowv3ReportMetadata from a dict
workflowv3_report_metadata_from_dict = Workflowv3ReportMetadata.from_dict(workflowv3_report_metadata_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


