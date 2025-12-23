# Universalconnectormanagerv3ConnectivityState

Connectivity status (connectivity); after ping to UC service on openShift + checks on its health.   - UC_OK: n/n nodes are alive.  - UC_INITIALIZING: Just created, waiting till next refresh.  - UC_FAILURE: n out of n pods/nodes are failing; status text should detail (mem? storage?).  - UC_UNKNOWN: All other errors.

## Enum

* `UC_OK` (value: `'UC_OK'`)

* `UC_INITIALIZING` (value: `'UC_INITIALIZING'`)

* `UC_FAILURE` (value: `'UC_FAILURE'`)

* `UC_UNKNOWN` (value: `'UC_UNKNOWN'`)

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


