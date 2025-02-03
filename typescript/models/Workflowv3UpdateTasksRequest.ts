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

import { Workflowv3TaskEdit } from '../models/Workflowv3TaskEdit';
import { HttpFile } from '../http/http';

/**
* Update existing tasks.
*/
export class Workflowv3UpdateTasksRequest {
    /**
    * Update tasks belonging to common parent.
    */
    'caseId'?: string;
    /**
    * Update multiple tasks in one request.
    */
    'tasks'?: Array<Workflowv3TaskEdit>;
    /**
    * Only update these fields in the backend records.
    */
    'updateFields'?: Array<string>;
    'workflowId'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "caseId",
            "baseName": "case_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "tasks",
            "baseName": "tasks",
            "type": "Array<Workflowv3TaskEdit>",
            "format": ""
        },
        {
            "name": "updateFields",
            "baseName": "update_fields",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "workflowId",
            "baseName": "workflow_id",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Workflowv3UpdateTasksRequest.attributeTypeMap;
    }

    public constructor() {
    }
}

