/**
 * IBM Guardium Data Security Center
 * IBM Guardium Data Security Center simplifies your organization\'s Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.
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
* GetSchedulesByReportIdReponse - array of scheduled job IDs that the requested report_id is part of.
*/
export class Schedulerv3GetSchedulesByReportResponse {
    /**
    * List of schedule ids for this report id.
    */
    'scheduleIds'?: Array<string>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "scheduleIds",
            "baseName": "schedule_ids",
            "type": "Array<string>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Schedulerv3GetSchedulesByReportResponse.attributeTypeMap;
    }

    public constructor() {
    }
}

