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

import { GooglerpcStatus } from '../models/GooglerpcStatus';
import { Workflowv3Task } from '../models/Workflowv3Task';
import { HttpFile } from '../http/http';

/**
* Returns just tasks, not cases.
*/
export class Workflowv3TaskListResponse {
    'status'?: GooglerpcStatus;
    /**
    * All tasks or just the ones requested.
    */
    'tasks'?: Array<Workflowv3Task>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "status",
            "baseName": "status",
            "type": "GooglerpcStatus",
            "format": ""
        },
        {
            "name": "tasks",
            "baseName": "tasks",
            "type": "Array<Workflowv3Task>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Workflowv3TaskListResponse.attributeTypeMap;
    }

    public constructor() {
    }
}

