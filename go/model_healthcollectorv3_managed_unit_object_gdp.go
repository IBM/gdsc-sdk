/*
 * IBM Guardium Data Security Center
 *
 * IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.
 *
 * API version: 3
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */
package swagger

// Guardium Data Protection systems.
type Healthcollectorv3ManagedUnitObjectGdp struct {
	// Aggregation health status.
	AggHealthStatus int32 `json:"agg_health_status,omitempty"`
	// Connectivity status.
	Connectivity int32 `json:"connectivity,omitempty"`
	Details *Healthcollectorv3MuDetailsObjGdp `json:"details,omitempty"`
	// Aggregator the collector exports data to.
	ExportsTo []string `json:"exports_to,omitempty"`
	// Id of the managed unit.
	Id int32 `json:"id,omitempty"`
	// Collectors the aggregator imports data from.
	ImportsFrom []string `json:"imports_from,omitempty"`
	// Overall status of S-TAPs for the system.
	MusStapsHealthStatus int32 `json:"mus_staps_health_status,omitempty"`
	// Name of the Guardium Data Protection system.
	Name string `json:"name,omitempty"`
	// Operating system version.
	OsVersion string `json:"os_version,omitempty"`
	// Patch number.
	Patch string `json:"patch,omitempty"`
	// Overall system status.
	Status int32 `json:"status,omitempty"`
	// Unit type.
	Type_ string `json:"type,omitempty"`
	// IP address.
	UnitHostIp string `json:"unit_host_ip,omitempty"`
	// Unit utilization status.
	UnitUtilizationHealthStatus int32 `json:"unit_utilization_health_status,omitempty"`
	// Guardium Data Protection version.
	Version string `json:"version,omitempty"`
}
