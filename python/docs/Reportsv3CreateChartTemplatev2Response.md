# Reportsv3CreateChartTemplatev2Response

CreateChartTemplatev2Response is the return for CreateChartTemplatev2() api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**template_id** | **str** | Unique chart ID. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_create_chart_templatev2_response import Reportsv3CreateChartTemplatev2Response

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3CreateChartTemplatev2Response from a JSON string
reportsv3_create_chart_templatev2_response_instance = Reportsv3CreateChartTemplatev2Response.from_json(json)
# print the JSON string representation of the object
print(Reportsv3CreateChartTemplatev2Response.to_json())

# convert the object into a dict
reportsv3_create_chart_templatev2_response_dict = reportsv3_create_chart_templatev2_response_instance.to_dict()
# create an instance of Reportsv3CreateChartTemplatev2Response from a dict
reportsv3_create_chart_templatev2_response_from_dict = Reportsv3CreateChartTemplatev2Response.from_dict(reportsv3_create_chart_templatev2_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


