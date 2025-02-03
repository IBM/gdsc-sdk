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

import { Guardiumconnectorv3StatusResponseBase } from '../models/Guardiumconnectorv3StatusResponseBase';
import { Guardiumconnectorv3TaskObject } from '../models/Guardiumconnectorv3TaskObject';
import { HttpFile } from '../http/http';

/**
* GetTasks response message and returned list of tasks.
*/
export class Guardiumconnectorv3GetTasksResponse {
    'status'?: Guardiumconnectorv3StatusResponseBase;
    /**
    * List of task(s).
    */
    'tasks'?: Array<Guardiumconnectorv3TaskObject>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "status",
            "baseName": "status",
            "type": "Guardiumconnectorv3StatusResponseBase",
            "format": ""
        },
        {
            "name": "tasks",
            "baseName": "tasks",
            "type": "Array<Guardiumconnectorv3TaskObject>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Guardiumconnectorv3GetTasksResponse.attributeTypeMap;
    }

    public constructor() {
    }
}

