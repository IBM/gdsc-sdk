/*
 * IBM Guardium Data Security Center
 *
 * IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.
 *
 * API version: 3
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */
package swagger

// GetActivityResponse returns the requested activity log records.
type Auditv3GetActivityRecordsResponse struct {
	// All of the eligible filters based on the passed in parameters.
	Filters []Auditv3FilterField `json:"filters,omitempty"`
	// All of the activity log records based on the passed in parameters.
	Records []Auditv3ActivityRecord `json:"records,omitempty"`
	// Total number of Activity records.
	TotalRecords string `json:"total_records,omitempty"`
}
