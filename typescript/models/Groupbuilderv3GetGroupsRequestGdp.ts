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

import { Groupbuilderv3GdpGroup } from '../models/Groupbuilderv3GdpGroup';
import { HttpFile } from '../http/http';

export class Groupbuilderv3GetGroupsRequestGdp {
    /**
    * ID of central manager.
    */
    'centralManagerId'?: string;
    /**
    * Groups pushed from GDP.
    */
    'data'?: Array<Groupbuilderv3GdpGroup>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "centralManagerId",
            "baseName": "central_manager_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "data",
            "baseName": "data",
            "type": "Array<Groupbuilderv3GdpGroup>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Groupbuilderv3GetGroupsRequestGdp.attributeTypeMap;
    }

    public constructor() {
    }
}

