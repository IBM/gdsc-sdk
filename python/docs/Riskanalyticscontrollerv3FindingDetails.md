# Riskanalyticscontrollerv3FindingDetails


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**counts** | [**List[Riskanalyticscontrollerv3DetailToCount]**](Riskanalyticscontrollerv3DetailToCount.md) |  | [optional] 
**finding_examples** | **List[str]** |  | [optional] 
**finding_references** | [**List[Riskanalyticscontrollerv3FindingReferenceLink]**](Riskanalyticscontrollerv3FindingReferenceLink.md) | Finding links/references; used outlier with high volume type, and in policy violations; each reference contains a deep link filters to the report. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.riskanalyticscontrollerv3_finding_details import Riskanalyticscontrollerv3FindingDetails

# TODO update the JSON string below
json = "{}"
# create an instance of Riskanalyticscontrollerv3FindingDetails from a JSON string
riskanalyticscontrollerv3_finding_details_instance = Riskanalyticscontrollerv3FindingDetails.from_json(json)
# print the JSON string representation of the object
print(Riskanalyticscontrollerv3FindingDetails.to_json())

# convert the object into a dict
riskanalyticscontrollerv3_finding_details_dict = riskanalyticscontrollerv3_finding_details_instance.to_dict()
# create an instance of Riskanalyticscontrollerv3FindingDetails from a dict
riskanalyticscontrollerv3_finding_details_from_dict = Riskanalyticscontrollerv3FindingDetails.from_dict(riskanalyticscontrollerv3_finding_details_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


