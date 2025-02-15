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

import { Resourcecontrollerk8v3ControllerCommand } from '../models/Resourcecontrollerk8v3ControllerCommand';
import { HttpFile } from '../http/http';

export class Resourcecontrollerk8v3GetControllerCommandsResponse {
    /**
    * Contains the command information to be executed by a controller.
    */
    'commands'?: Array<Resourcecontrollerk8v3ControllerCommand>;
    /**
    * The ID of the controller for the commands.
    */
    'controllerId'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "commands",
            "baseName": "commands",
            "type": "Array<Resourcecontrollerk8v3ControllerCommand>",
            "format": ""
        },
        {
            "name": "controllerId",
            "baseName": "controller_id",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Resourcecontrollerk8v3GetControllerCommandsResponse.attributeTypeMap;
    }

    public constructor() {
    }
}

