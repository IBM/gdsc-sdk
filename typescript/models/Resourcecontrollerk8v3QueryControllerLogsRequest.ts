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

import { Resourcecontrollerk8v3QueryLogs } from '../models/Resourcecontrollerk8v3QueryLogs';
import { HttpFile } from '../http/http';

export class Resourcecontrollerk8v3QueryControllerLogsRequest {
    /**
    * The ID of the controller to get logs for.
    */
    'controllerId'?: string;
    'queryLogs'?: Resourcecontrollerk8v3QueryLogs;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "controllerId",
            "baseName": "controller_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "queryLogs",
            "baseName": "queryLogs",
            "type": "Resourcecontrollerk8v3QueryLogs",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Resourcecontrollerk8v3QueryControllerLogsRequest.attributeTypeMap;
    }

    public constructor() {
    }
}

