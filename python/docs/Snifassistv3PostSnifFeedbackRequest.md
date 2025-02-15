# Snifassistv3PostSnifFeedbackRequest

PostSnifFeedbackRequest is the request message to post sniffer feedback for the installed policies.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**edge_id** | **str** | Specify edge_id if known. | [optional] 
**snif_feedback** | [**Snifassistv3Feedback**](Snifassistv3Feedback.md) |  | [optional] 
**tenant_id** | **str** | Specify tenant_id. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.snifassistv3_post_snif_feedback_request import Snifassistv3PostSnifFeedbackRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Snifassistv3PostSnifFeedbackRequest from a JSON string
snifassistv3_post_snif_feedback_request_instance = Snifassistv3PostSnifFeedbackRequest.from_json(json)
# print the JSON string representation of the object
print(Snifassistv3PostSnifFeedbackRequest.to_json())

# convert the object into a dict
snifassistv3_post_snif_feedback_request_dict = snifassistv3_post_snif_feedback_request_instance.to_dict()
# create an instance of Snifassistv3PostSnifFeedbackRequest from a dict
snifassistv3_post_snif_feedback_request_from_dict = Snifassistv3PostSnifFeedbackRequest.from_dict(snifassistv3_post_snif_feedback_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


