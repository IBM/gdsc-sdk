# Healthcollectorv3GetStreamsIngestionResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**streams_ingestion** | [**List[Healthcollectorv3Usage]**](Healthcollectorv3Usage.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.healthcollectorv3_get_streams_ingestion_response import Healthcollectorv3GetStreamsIngestionResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Healthcollectorv3GetStreamsIngestionResponse from a JSON string
healthcollectorv3_get_streams_ingestion_response_instance = Healthcollectorv3GetStreamsIngestionResponse.from_json(json)
# print the JSON string representation of the object
print(Healthcollectorv3GetStreamsIngestionResponse.to_json())

# convert the object into a dict
healthcollectorv3_get_streams_ingestion_response_dict = healthcollectorv3_get_streams_ingestion_response_instance.to_dict()
# create an instance of Healthcollectorv3GetStreamsIngestionResponse from a dict
healthcollectorv3_get_streams_ingestion_response_from_dict = Healthcollectorv3GetStreamsIngestionResponse.from_dict(healthcollectorv3_get_streams_ingestion_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


