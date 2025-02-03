# Streamsv3ListAWSStreamsResponse

ListAWSStreamsResponse defines response of ListAWSStreamsRequest call.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**streams_by_region** | [**Dict[str, Streamsv3StreamByRegion]**](Streamsv3StreamByRegion.md) | Map of streams by regions. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.streamsv3_list_aws_streams_response import Streamsv3ListAWSStreamsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Streamsv3ListAWSStreamsResponse from a JSON string
streamsv3_list_aws_streams_response_instance = Streamsv3ListAWSStreamsResponse.from_json(json)
# print the JSON string representation of the object
print(Streamsv3ListAWSStreamsResponse.to_json())

# convert the object into a dict
streamsv3_list_aws_streams_response_dict = streamsv3_list_aws_streams_response_instance.to_dict()
# create an instance of Streamsv3ListAWSStreamsResponse from a dict
streamsv3_list_aws_streams_response_from_dict = Streamsv3ListAWSStreamsResponse.from_dict(streamsv3_list_aws_streams_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


