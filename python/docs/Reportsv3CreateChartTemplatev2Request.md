# Reportsv3CreateChartTemplatev2Request

CreateChartTemplatev2Request is the argument for CreateChartTemplatev2() api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**vega_definition** | **str** | The VEGA chart template, as a stringified JSON. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_create_chart_templatev2_request import Reportsv3CreateChartTemplatev2Request

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3CreateChartTemplatev2Request from a JSON string
reportsv3_create_chart_templatev2_request_instance = Reportsv3CreateChartTemplatev2Request.from_json(json)
# print the JSON string representation of the object
print(Reportsv3CreateChartTemplatev2Request.to_json())

# convert the object into a dict
reportsv3_create_chart_templatev2_request_dict = reportsv3_create_chart_templatev2_request_instance.to_dict()
# create an instance of Reportsv3CreateChartTemplatev2Request from a dict
reportsv3_create_chart_templatev2_request_from_dict = Reportsv3CreateChartTemplatev2Request.from_dict(reportsv3_create_chart_templatev2_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


