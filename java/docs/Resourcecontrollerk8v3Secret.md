

# Resourcecontrollerk8v3Secret

Secret contains the information about a secret.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**created** | **String** | Optional: The date this secret was created (ms since epoch). |  [optional] |
|**id** | **String** | Optional:  The ID of the secret. |  [optional] |
|**modified** | **String** | Optional: The date this secret was modified (ms since epoch). |  [optional] |
|**name** | **String** | The name of the secret. Must be a valid name of an environment variable. |  [optional] |
|**_protected** | **Boolean** | Optional: Used to show the secret is encrypted or not in workload pod. |  [optional] |
|**value** | **String** | The value of the secret. This value is write-only and will never be returned. |  [optional] |



