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

import { Resourcecontrollerk8v3ControllerResources } from '../models/Resourcecontrollerk8v3ControllerResources';
import { Resourcecontrollerk8v3Version } from '../models/Resourcecontrollerk8v3Version';
import { HttpFile } from '../http/http';

/**
* ControllerHeartbeat Contains the information about a controller heartbeat.
*/
export class Resourcecontrollerk8v3ControllerHeartbeat {
    'capability'?: { [key: string]: boolean; };
    'controllerId'?: string;
    'controllerVersion'?: Resourcecontrollerk8v3Version;
    'resources'?: Resourcecontrollerk8v3ControllerResources;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "capability",
            "baseName": "capability",
            "type": "{ [key: string]: boolean; }",
            "format": ""
        },
        {
            "name": "controllerId",
            "baseName": "controller_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "controllerVersion",
            "baseName": "controller_version",
            "type": "Resourcecontrollerk8v3Version",
            "format": ""
        },
        {
            "name": "resources",
            "baseName": "resources",
            "type": "Resourcecontrollerk8v3ControllerResources",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Resourcecontrollerk8v3ControllerHeartbeat.attributeTypeMap;
    }

    public constructor() {
    }
}

