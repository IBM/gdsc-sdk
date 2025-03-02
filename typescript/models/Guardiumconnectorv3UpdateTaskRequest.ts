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
* Updates specified task.
*/
export class Guardiumconnectorv3UpdateTaskRequest {
    /**
    * ID of central manager.
    */
    'centralManagerId'?: string;
    /**
    * Updates task interval.
    */
    'interval'?: string;
    /**
    * ID of task being updated.
    */
    'taskId'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "centralManagerId",
            "baseName": "central_manager_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "interval",
            "baseName": "interval",
            "type": "string",
            "format": ""
        },
        {
            "name": "taskId",
            "baseName": "task_id",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Guardiumconnectorv3UpdateTaskRequest.attributeTypeMap;
    }

    public constructor() {
    }
}

