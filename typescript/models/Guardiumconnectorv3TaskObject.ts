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

import { Guardiumconnectorv3SubTaskObject } from '../models/Guardiumconnectorv3SubTaskObject';
import { Guardiumconnectorv3TaskDefinitionObject } from '../models/Guardiumconnectorv3TaskDefinitionObject';
import { HttpFile } from '../http/http';

/**
* Object holding task info.
*/
export class Guardiumconnectorv3TaskObject {
    /**
    * Sub tasks.
    */
    'subTasks'?: Array<Guardiumconnectorv3SubTaskObject>;
    'taskDefinition'?: Guardiumconnectorv3TaskDefinitionObject;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "subTasks",
            "baseName": "sub_tasks",
            "type": "Array<Guardiumconnectorv3SubTaskObject>",
            "format": ""
        },
        {
            "name": "taskDefinition",
            "baseName": "task_definition",
            "type": "Guardiumconnectorv3TaskDefinitionObject",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Guardiumconnectorv3TaskObject.attributeTypeMap;
    }

    public constructor() {
    }
}

