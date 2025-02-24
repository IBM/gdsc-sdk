# Reportsv3DeleteChartv2Response

DeleteChartv2Response responds to the request with a success or fail message.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **str** | Success or error message. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_delete_chartv2_response import Reportsv3DeleteChartv2Response

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3DeleteChartv2Response from a JSON string
reportsv3_delete_chartv2_response_instance = Reportsv3DeleteChartv2Response.from_json(json)
# print the JSON string representation of the object
print(Reportsv3DeleteChartv2Response.to_json())

# convert the object into a dict
reportsv3_delete_chartv2_response_dict = reportsv3_delete_chartv2_response_instance.to_dict()
# create an instance of Reportsv3DeleteChartv2Response from a dict
reportsv3_delete_chartv2_response_from_dict = Reportsv3DeleteChartv2Response.from_dict(reportsv3_delete_chartv2_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


