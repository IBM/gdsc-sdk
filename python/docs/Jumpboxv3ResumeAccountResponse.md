# Jumpboxv3ResumeAccountResponse

ResumeTenantResponse message for PATCH v3/accounts/resume/{account_id} api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.jumpboxv3_resume_account_response import Jumpboxv3ResumeAccountResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Jumpboxv3ResumeAccountResponse from a JSON string
jumpboxv3_resume_account_response_instance = Jumpboxv3ResumeAccountResponse.from_json(json)
# print the JSON string representation of the object
print(Jumpboxv3ResumeAccountResponse.to_json())

# convert the object into a dict
jumpboxv3_resume_account_response_dict = jumpboxv3_resume_account_response_instance.to_dict()
# create an instance of Jumpboxv3ResumeAccountResponse from a dict
jumpboxv3_resume_account_response_from_dict = Jumpboxv3ResumeAccountResponse.from_dict(jumpboxv3_resume_account_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


