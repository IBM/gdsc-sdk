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

import { Workflowv3TaskCreate } from '../models/Workflowv3TaskCreate';
import { HttpFile } from '../http/http';

/**
* Create new tasks.
*/
export class Workflowv3CreateTaskRequest {
    /**
    * Create tasks with common parent.
    */
    'caseId'?: string;
    'task'?: Workflowv3TaskCreate;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "caseId",
            "baseName": "case_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "task",
            "baseName": "task",
            "type": "Workflowv3TaskCreate",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Workflowv3CreateTaskRequest.attributeTypeMap;
    }

    public constructor() {
    }
}

