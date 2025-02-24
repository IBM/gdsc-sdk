# Riskanalyticscontrollerv3FindingDetailsMap

Contains a list of examples, reference links, in a finding category. If outlier finding, it could be HIGH_VOLUME, ERROR, NEW, and so on.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**finding_details** | [**Riskanalyticscontrollerv3FindingDetails**](Riskanalyticscontrollerv3FindingDetails.md) |  | [optional] 
**finding_details_type** | **str** |  | [optional] 
**finding_reference** | [**Riskanalyticscontrollerv3FindingReferenceLink**](Riskanalyticscontrollerv3FindingReferenceLink.md) |  | [optional] 
**report** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.riskanalyticscontrollerv3_finding_details_map import Riskanalyticscontrollerv3FindingDetailsMap

# TODO update the JSON string below
json = "{}"
# create an instance of Riskanalyticscontrollerv3FindingDetailsMap from a JSON string
riskanalyticscontrollerv3_finding_details_map_instance = Riskanalyticscontrollerv3FindingDetailsMap.from_json(json)
# print the JSON string representation of the object
print(Riskanalyticscontrollerv3FindingDetailsMap.to_json())

# convert the object into a dict
riskanalyticscontrollerv3_finding_details_map_dict = riskanalyticscontrollerv3_finding_details_map_instance.to_dict()
# create an instance of Riskanalyticscontrollerv3FindingDetailsMap from a dict
riskanalyticscontrollerv3_finding_details_map_from_dict = Riskanalyticscontrollerv3FindingDetailsMap.from_dict(riskanalyticscontrollerv3_finding_details_map_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


