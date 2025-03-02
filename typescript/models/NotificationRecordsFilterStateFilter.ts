/**
 * IBM Guardium Data Security Center
 * Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.
 *
 * OpenAPI spec version: 3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { HttpFile } from '../http/http';

/**
* The state filter groups commonly paired states.
*/
export enum NotificationRecordsFilterStateFilter {
    IncludeAll = 'INCLUDE_ALL',
    UnreadOnly = 'UNREAD_ONLY',
    ReadOnly = 'READ_ONLY',
    CompleteOnly = 'COMPLETE_ONLY',
    NotComplete = 'NOT_COMPLETE'
}
