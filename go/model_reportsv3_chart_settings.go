/*
 * IBM Guardium Data Security Center
 *
 * IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.
 *
 * API version: 3
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */
package swagger
import (
	"time"
)

// ChartSettings encapsulates all data necessary for a chart object.
type Reportsv3ChartSettings struct {
	// The chart id.
	ChartId string `json:"chart_id,omitempty"`
	// The chart title.
	ChartTitle string `json:"chart_title,omitempty"`
	ChartType *Reportsv3ChartType `json:"chart_type,omitempty"`
	// The chart's cration time in format YYYY-MM-DDTHH:mm:ss.sssZ.
	CreationTime time.Time `json:"creation_time,omitempty"`
	// An identifier for the creator of the chart.
	CreatorUserId string `json:"creator_user_id,omitempty"`
	// Header id for the dataset values.
	DatasetHeaderId string `json:"dataset_header_id,omitempty"`
	// Chart dataset max values.
	DatasetMaxValues int32 `json:"dataset_max_values,omitempty"`
	// The default_chart_expanded is a flag taken from the user settings collection per report and user.
	DefaultChartExpanded bool `json:"default_chart_expanded,omitempty"`
	// If true - this chart will be shown with the report.
	IsDefaultChart bool `json:"is_default_chart,omitempty"`
	// If a chart is predefined.
	IsPredefined bool `json:"is_predefined,omitempty"`
	// Chart refresh rate.
	RefreshRate int32 `json:"refresh_rate,omitempty"`
	// The report id that the chart connected to.
	ReportId string `json:"report_id,omitempty"`
	// Header id for the x-axis values.
	XaxisHeaderId string `json:"xaxis_header_id,omitempty"`
	// Chart xaxis max values.
	XaxisMaxValues int32 `json:"xaxis_max_values,omitempty"`
	// Header id for the y-axis values.
	YaxisHeaderId string `json:"yaxis_header_id,omitempty"`
}
