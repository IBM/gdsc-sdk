/*
 * IBM Guardium Data Security Center
 *
 * IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.
 *
 * API version: 3
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */
package swagger
// Assetsv3AssetView : AssetView - Types of view for displaying assets list .   - DB: Asset View type based on db  - Host: Asset View type based on host
type Assetsv3AssetView string

// List of assetsv3AssetView
const (
	DB_Assetsv3AssetView Assetsv3AssetView = "DB"
	HOST_Assetsv3AssetView Assetsv3AssetView = "Host"
)
