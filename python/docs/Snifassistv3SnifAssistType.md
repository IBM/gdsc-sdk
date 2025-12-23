# Snifassistv3SnifAssistType

This defines what type of service will be provided to sniffer.   - VERSION_NOT_SUPPORTED: Nothing is supported due to version mismatch.  - POLICY: Assist sniffer with Guardium policy configuration.  - CONFIGURATION_PARAMETERS: Assist sniffer with configuration parameters.  - GROUP_UPDATE: Assist sniffer with policy group member updates.  - SNIF_REGISTER: First message going from snif to assist  - STAP_CONFIG: Assist sniffer with STAP configuration.  - STAP_CONFIG_ACK: Ack from assist to snif after receiving STAP config  - STAP_CONFIG_DELETE: Assist sniffer with STAP configuration deletion.  - STAP_CONFIG_DELETE_ACK: Ack from assist to snif after receiving STAP config delete.  - STAP_HEARTBEAT: Assist sniffer with STAP heartbeat report.  - STAP_COMMAND: Send STAP command to stap.  - SNIF_FEEDBACK: Assist sniffer with policy and group update feedback

## Enum

* `VERSION_NOT_SUPPORTED` (value: `'VERSION_NOT_SUPPORTED'`)

* `POLICY` (value: `'POLICY'`)

* `CONFIGURATION_PARAMETERS` (value: `'CONFIGURATION_PARAMETERS'`)

* `GROUP_UPDATE` (value: `'GROUP_UPDATE'`)

* `SNIF_REGISTER` (value: `'SNIF_REGISTER'`)

* `STAP_CONFIG` (value: `'STAP_CONFIG'`)

* `STAP_CONFIG_ACK` (value: `'STAP_CONFIG_ACK'`)

* `STAP_CONFIG_DELETE` (value: `'STAP_CONFIG_DELETE'`)

* `STAP_CONFIG_DELETE_ACK` (value: `'STAP_CONFIG_DELETE_ACK'`)

* `STAP_HEARTBEAT` (value: `'STAP_HEARTBEAT'`)

* `STAP_COMMAND` (value: `'STAP_COMMAND'`)

* `SNIF_FEEDBACK` (value: `'SNIF_FEEDBACK'`)

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


