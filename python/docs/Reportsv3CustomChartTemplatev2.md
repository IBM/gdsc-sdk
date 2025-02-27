# Reportsv3CustomChartTemplatev2

CustomChartTemplatev2 is a custom VEGA chart template.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**template_id** | **str** |  | [optional] 
**user_id** | **str** | The creator of the template. | [optional] 
**vega_definition** | **str** | The VEGA chart template, as a stringified JSON. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_custom_chart_templatev2 import Reportsv3CustomChartTemplatev2

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3CustomChartTemplatev2 from a JSON string
reportsv3_custom_chart_templatev2_instance = Reportsv3CustomChartTemplatev2.from_json(json)
# print the JSON string representation of the object
print(Reportsv3CustomChartTemplatev2.to_json())

# convert the object into a dict
reportsv3_custom_chart_templatev2_dict = reportsv3_custom_chart_templatev2_instance.to_dict()
# create an instance of Reportsv3CustomChartTemplatev2 from a dict
reportsv3_custom_chart_templatev2_from_dict = Reportsv3CustomChartTemplatev2.from_dict(reportsv3_custom_chart_templatev2_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


