# Analyticseventsv3PostQSAdvisorRiskRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**origin** | [**Templatesv3Origin**](Templatesv3Origin.md) |  | [optional] 
**origin_data** | **str** |  | [optional] 
**target_receivers** | [**List[Schedulerv3Recipient]**](Schedulerv3Recipient.md) |  | [optional] 
**template_data** | **Dict[str, str]** |  | [optional] 
**title** | **str** | Optional:Brief title used to quickly describe the notification. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.analyticseventsv3_post_qs_advisor_risk_request import Analyticseventsv3PostQSAdvisorRiskRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Analyticseventsv3PostQSAdvisorRiskRequest from a JSON string
analyticseventsv3_post_qs_advisor_risk_request_instance = Analyticseventsv3PostQSAdvisorRiskRequest.from_json(json)
# print the JSON string representation of the object
print(Analyticseventsv3PostQSAdvisorRiskRequest.to_json())

# convert the object into a dict
analyticseventsv3_post_qs_advisor_risk_request_dict = analyticseventsv3_post_qs_advisor_risk_request_instance.to_dict()
# create an instance of Analyticseventsv3PostQSAdvisorRiskRequest from a dict
analyticseventsv3_post_qs_advisor_risk_request_from_dict = Analyticseventsv3PostQSAdvisorRiskRequest.from_dict(analyticseventsv3_post_qs_advisor_risk_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


