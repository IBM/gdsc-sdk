# Reportsv3GetChartTemplatesv2Response

GetChartTemplatesv2Response is the return for GetChartTemplatesv2() api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**templates** | [**List[Reportsv3CustomChartTemplatev2]**](Reportsv3CustomChartTemplatev2.md) | List of all custom chart templates. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.reportsv3_get_chart_templatesv2_response import Reportsv3GetChartTemplatesv2Response

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3GetChartTemplatesv2Response from a JSON string
reportsv3_get_chart_templatesv2_response_instance = Reportsv3GetChartTemplatesv2Response.from_json(json)
# print the JSON string representation of the object
print(Reportsv3GetChartTemplatesv2Response.to_json())

# convert the object into a dict
reportsv3_get_chart_templatesv2_response_dict = reportsv3_get_chart_templatesv2_response_instance.to_dict()
# create an instance of Reportsv3GetChartTemplatesv2Response from a dict
reportsv3_get_chart_templatesv2_response_from_dict = Reportsv3GetChartTemplatesv2Response.from_dict(reportsv3_get_chart_templatesv2_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


