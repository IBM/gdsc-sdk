/*
 * IBM Guardium Data Security Center
 *
 * IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.
 *
 * API version: 3
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */
package swagger

// Dashboard - a small-scale representation of a Dashboard.
type Dashboardsv3Dashboard struct {
	// Dashboard cards.
	Cards []Dashboardsv3Card `json:"cards,omitempty"`
	// Dashboard description.
	DashboardDescription string `json:"dashboard_description,omitempty"`
	// Unique Dashboard ID.
	DashboardId string `json:"dashboard_id,omitempty"`
	// Dashboard title.
	DashboardTitle string `json:"dashboard_title,omitempty"`
	GlobalTimeFilter *Dashboardsv3TimeRange `json:"global_time_filter,omitempty"`
	ReportGlobalFilterList []Dashboardsv3ReportGlobalFilter `json:"report_global_filter_list,omitempty"`
}
