# Guardiumconnectorv3GetDatamartsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**extraction_profile** | [**List[Guardiumconnectorv3ExtractionProfile]**](Guardiumconnectorv3ExtractionProfile.md) |  | [optional] 
**status** | [**Guardiumconnectorv3StatusResponseBase**](Guardiumconnectorv3StatusResponseBase.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.guardiumconnectorv3_get_datamarts_response import Guardiumconnectorv3GetDatamartsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3GetDatamartsResponse from a JSON string
guardiumconnectorv3_get_datamarts_response_instance = Guardiumconnectorv3GetDatamartsResponse.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3GetDatamartsResponse.to_json())

# convert the object into a dict
guardiumconnectorv3_get_datamarts_response_dict = guardiumconnectorv3_get_datamarts_response_instance.to_dict()
# create an instance of Guardiumconnectorv3GetDatamartsResponse from a dict
guardiumconnectorv3_get_datamarts_response_from_dict = Guardiumconnectorv3GetDatamartsResponse.from_dict(guardiumconnectorv3_get_datamarts_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


