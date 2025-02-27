# Riskanalyticscontrollerv3Filter

Filter objects of the view of risks.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**header_id** | **str** | Header_id to filter by. | [optional] 
**values** | **List[str]** | Values of the filters. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.riskanalyticscontrollerv3_filter import Riskanalyticscontrollerv3Filter

# TODO update the JSON string below
json = "{}"
# create an instance of Riskanalyticscontrollerv3Filter from a JSON string
riskanalyticscontrollerv3_filter_instance = Riskanalyticscontrollerv3Filter.from_json(json)
# print the JSON string representation of the object
print(Riskanalyticscontrollerv3Filter.to_json())

# convert the object into a dict
riskanalyticscontrollerv3_filter_dict = riskanalyticscontrollerv3_filter_instance.to_dict()
# create an instance of Riskanalyticscontrollerv3Filter from a dict
riskanalyticscontrollerv3_filter_from_dict = Riskanalyticscontrollerv3Filter.from_dict(riskanalyticscontrollerv3_filter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


