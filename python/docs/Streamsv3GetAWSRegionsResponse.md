# Streamsv3GetAWSRegionsResponse

GetAWSRegionsResponse defines response of GetAWSRegionsRequest call.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**region** | **List[str]** | Array of regions. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.streamsv3_get_aws_regions_response import Streamsv3GetAWSRegionsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Streamsv3GetAWSRegionsResponse from a JSON string
streamsv3_get_aws_regions_response_instance = Streamsv3GetAWSRegionsResponse.from_json(json)
# print the JSON string representation of the object
print(Streamsv3GetAWSRegionsResponse.to_json())

# convert the object into a dict
streamsv3_get_aws_regions_response_dict = streamsv3_get_aws_regions_response_instance.to_dict()
# create an instance of Streamsv3GetAWSRegionsResponse from a dict
streamsv3_get_aws_regions_response_from_dict = Streamsv3GetAWSRegionsResponse.from_dict(streamsv3_get_aws_regions_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


