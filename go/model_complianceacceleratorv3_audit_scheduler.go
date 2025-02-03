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

// Audit scheduler.
type Complianceacceleratorv3AuditScheduler struct {
	// Begin the schedule on.
	BeginSchedule time.Time `json:"begin_schedule,omitempty"`
	// Either by day of month or date of the week of month.
	ByDayOfMonth bool `json:"by_day_of_month,omitempty"`
	// The day of the month, combined with frequency = 4 because there last day of the month the data type is string.
	DayOfMonth string `json:"day_of_month,omitempty"`
	// What day do you want to run , combined with frequency= 3, such as Monday, Tuesday.
	DayOfWeek []Schedulerv3DayOfWeek `json:"day_of_week,omitempty"`
	DayOrder *Schedulerv3DayOrder `json:"day_order,omitempty"`
	DayOrderDayOfWeek *Schedulerv3DayOfWeek `json:"day_order_day_of_week,omitempty"`
	// End the schedule on , if it is null means never ends.
	EndSchedule time.Time `json:"end_schedule,omitempty"`
	Frequency *Schedulerv3Frequency `json:"frequency,omitempty"`
	// Month value.
	Months []Schedulerv3Month `json:"months,omitempty"`
	// Never end schedule or not.
	NeverEnd bool `json:"never_end,omitempty"`
	// Combined with frequency to define how often to run the job. ie, if frequncy =1 and repeat =3 means run the job every 3 hours.
	Repeat int32 `json:"repeat,omitempty"`
	RepeatBegin *Schedulerv3RepeatBegin `json:"repeat_begin,omitempty"`
	RepeatEnd *Schedulerv3RepeatEnd `json:"repeat_end,omitempty"`
}
