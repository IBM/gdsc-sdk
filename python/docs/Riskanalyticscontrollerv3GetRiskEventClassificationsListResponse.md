# Riskanalyticscontrollerv3GetRiskEventClassificationsListResponse

GetRiskEventClassificationsListResponse message for the GetRiskEventClassificationsList API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**classification_match_details** | [**List[Riskanalyticsenginev3ClassificationMatchDetails]**](Riskanalyticsenginev3ClassificationMatchDetails.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.riskanalyticscontrollerv3_get_risk_event_classifications_list_response import Riskanalyticscontrollerv3GetRiskEventClassificationsListResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Riskanalyticscontrollerv3GetRiskEventClassificationsListResponse from a JSON string
riskanalyticscontrollerv3_get_risk_event_classifications_list_response_instance = Riskanalyticscontrollerv3GetRiskEventClassificationsListResponse.from_json(json)
# print the JSON string representation of the object
print(Riskanalyticscontrollerv3GetRiskEventClassificationsListResponse.to_json())

# convert the object into a dict
riskanalyticscontrollerv3_get_risk_event_classifications_list_response_dict = riskanalyticscontrollerv3_get_risk_event_classifications_list_response_instance.to_dict()
# create an instance of Riskanalyticscontrollerv3GetRiskEventClassificationsListResponse from a dict
riskanalyticscontrollerv3_get_risk_event_classifications_list_response_from_dict = Riskanalyticscontrollerv3GetRiskEventClassificationsListResponse.from_dict(riskanalyticscontrollerv3_get_risk_event_classifications_list_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


