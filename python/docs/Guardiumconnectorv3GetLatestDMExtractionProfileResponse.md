# Guardiumconnectorv3GetLatestDMExtractionProfileResponse

Returns the datamart extraction profile for a particular Central Manager.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | Datamart extraction profile name. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.guardiumconnectorv3_get_latest_dm_extraction_profile_response import Guardiumconnectorv3GetLatestDMExtractionProfileResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3GetLatestDMExtractionProfileResponse from a JSON string
guardiumconnectorv3_get_latest_dm_extraction_profile_response_instance = Guardiumconnectorv3GetLatestDMExtractionProfileResponse.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3GetLatestDMExtractionProfileResponse.to_json())

# convert the object into a dict
guardiumconnectorv3_get_latest_dm_extraction_profile_response_dict = guardiumconnectorv3_get_latest_dm_extraction_profile_response_instance.to_dict()
# create an instance of Guardiumconnectorv3GetLatestDMExtractionProfileResponse from a dict
guardiumconnectorv3_get_latest_dm_extraction_profile_response_from_dict = Guardiumconnectorv3GetLatestDMExtractionProfileResponse.from_dict(guardiumconnectorv3_get_latest_dm_extraction_profile_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


