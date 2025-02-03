# Reportsv3DeleteChartTemplatev2Response

DeleteChartTemplatev2Response is the return for DeleteChartTemplatev2() api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **str** | Success or error message. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.reportsv3_delete_chart_templatev2_response import Reportsv3DeleteChartTemplatev2Response

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3DeleteChartTemplatev2Response from a JSON string
reportsv3_delete_chart_templatev2_response_instance = Reportsv3DeleteChartTemplatev2Response.from_json(json)
# print the JSON string representation of the object
print(Reportsv3DeleteChartTemplatev2Response.to_json())

# convert the object into a dict
reportsv3_delete_chart_templatev2_response_dict = reportsv3_delete_chart_templatev2_response_instance.to_dict()
# create an instance of Reportsv3DeleteChartTemplatev2Response from a dict
reportsv3_delete_chart_templatev2_response_from_dict = Reportsv3DeleteChartTemplatev2Response.from_dict(reportsv3_delete_chart_templatev2_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


