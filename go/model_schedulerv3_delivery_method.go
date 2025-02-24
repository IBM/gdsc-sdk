/*
 * IBM Guardium Data Security Center
 *
 * IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.
 *
 * API version: 3
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */
package swagger

// DeliveryMethod configures who receives the report and how they receive it.
type Schedulerv3DeliveryMethod struct {
	FileFormat *Schedulerv3FileFormat `json:"file_format,omitempty"`
	// Optional: Preferred time zone to have all timestamps in.
	ReportTimeZone string `json:"report_time_zone,omitempty"`
}
