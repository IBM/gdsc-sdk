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
* UpdateDashboardResponse is the response after updating a dashboard using the UpdateDashboard() api.
*/
export class Dashboardsv3UpdateDashboardResponse {
    /**
    * The id of the dashboard that was updated.
    */
    'dashboardId'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "dashboardId",
            "baseName": "dashboard_id",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Dashboardsv3UpdateDashboardResponse.attributeTypeMap;
    }

    public constructor() {
    }
}

