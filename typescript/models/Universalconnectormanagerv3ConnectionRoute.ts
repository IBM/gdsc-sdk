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
* Describes incoming host:port into Insights; needed by client, for datasource configuration.
*/
export class Universalconnectormanagerv3ConnectionRoute {
    /**
    * URI where related Universal connector service is running/listening.
    */
    'host'?: string;
    /**
    * Port where the related Universal connector service is running/listening.
    */
    'port'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "host",
            "baseName": "host",
            "type": "string",
            "format": ""
        },
        {
            "name": "port",
            "baseName": "port",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Universalconnectormanagerv3ConnectionRoute.attributeTypeMap;
    }

    public constructor() {
    }
}

