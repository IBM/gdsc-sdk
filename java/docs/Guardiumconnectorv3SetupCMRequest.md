

# Guardiumconnectorv3SetupCMRequest

SetupCMRequest is the argument type used to register a GDP Central Manager to Guardium.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attributes** | [**List&lt;Guardiumconnectorv3Attribute&gt;**](Guardiumconnectorv3Attribute.md) | Attributes specific to the GDP Central Manager. |  [optional] |
|**cmGid** | **String** | Central Manager GID. |  [optional] |
|**cmHostname** | **String** | Central Manager hostname. |  [optional] |
|**cmIp** | **String** | Central Manager IP. |  [optional] |
|**pushRegistration** | **Boolean** | Attribute used to distinguish between old mode (pull) and new SaaS mode (push) used during registration. |  [optional] |



