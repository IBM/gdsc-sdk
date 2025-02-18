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
* DeleteReportResponse is the request for deleting a custom report.
*/
export class Reportsv3DeleteReportResponse {
    /**
    * The is_scheduled is a flag says is report scheduled.
    */
    'isScheduled'?: boolean;
    /**
    * Success or error message.
    */
    'message'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "isScheduled",
            "baseName": "is_scheduled",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "message",
            "baseName": "message",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Reportsv3DeleteReportResponse.attributeTypeMap;
    }

    public constructor() {
    }
}

