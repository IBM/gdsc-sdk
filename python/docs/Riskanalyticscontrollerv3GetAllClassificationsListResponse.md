# Riskanalyticscontrollerv3GetAllClassificationsListResponse

GetAllClassificationsListResponse message for the GetAllClassificationsList api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**classifications** | **Dict[str, str]** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.riskanalyticscontrollerv3_get_all_classifications_list_response import Riskanalyticscontrollerv3GetAllClassificationsListResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Riskanalyticscontrollerv3GetAllClassificationsListResponse from a JSON string
riskanalyticscontrollerv3_get_all_classifications_list_response_instance = Riskanalyticscontrollerv3GetAllClassificationsListResponse.from_json(json)
# print the JSON string representation of the object
print(Riskanalyticscontrollerv3GetAllClassificationsListResponse.to_json())

# convert the object into a dict
riskanalyticscontrollerv3_get_all_classifications_list_response_dict = riskanalyticscontrollerv3_get_all_classifications_list_response_instance.to_dict()
# create an instance of Riskanalyticscontrollerv3GetAllClassificationsListResponse from a dict
riskanalyticscontrollerv3_get_all_classifications_list_response_from_dict = Riskanalyticscontrollerv3GetAllClassificationsListResponse.from_dict(riskanalyticscontrollerv3_get_all_classifications_list_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


