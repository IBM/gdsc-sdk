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

import { Connectionsv3ConnectorColumn } from '../models/Connectionsv3ConnectorColumn';
import { Connectionsv3ConnectorType } from '../models/Connectionsv3ConnectorType';
import { HttpFile } from '../http/http';

/**
* Connector.
*/
export class Connectionsv3Connector {
    /**
    * The columns.
    */
    'columns'?: Array<Connectionsv3ConnectorColumn>;
    /**
    * The id of the connector.
    */
    'id'?: string;
    /**
    * The tags that this connector has.
    */
    'tags'?: Array<string>;
    'type'?: Connectionsv3ConnectorType;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "columns",
            "baseName": "columns",
            "type": "Array<Connectionsv3ConnectorColumn>",
            "format": ""
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "string",
            "format": ""
        },
        {
            "name": "tags",
            "baseName": "tags",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "type",
            "baseName": "type",
            "type": "Connectionsv3ConnectorType",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Connectionsv3Connector.attributeTypeMap;
    }

    public constructor() {
    }
}



