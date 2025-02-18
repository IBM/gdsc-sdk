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

import { Connectionsv3ConnectorType } from '../models/Connectionsv3ConnectorType';
import { Connectionsv3StreamConnectionConfig } from '../models/Connectionsv3StreamConnectionConfig';
import { Connectionsv3UCConnectionConfig } from '../models/Connectionsv3UCConnectionConfig';
import { HttpFile } from '../http/http';

/**
* Request parameters for update connection.
*/
export class Connectionsv3UpdateConnectionsConfigsRequest {
    /**
    * Optional: list of streaming connections.
    */
    'streamConnectionConfigs'?: Array<Connectionsv3StreamConnectionConfig>;
    'type'?: Connectionsv3ConnectorType;
    /**
    * Optional: list of UC connections.
    */
    'ucConnectionConfigs'?: Array<Connectionsv3UCConnectionConfig>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "streamConnectionConfigs",
            "baseName": "stream_connection_configs",
            "type": "Array<Connectionsv3StreamConnectionConfig>",
            "format": ""
        },
        {
            "name": "type",
            "baseName": "type",
            "type": "Connectionsv3ConnectorType",
            "format": ""
        },
        {
            "name": "ucConnectionConfigs",
            "baseName": "uc_connection_configs",
            "type": "Array<Connectionsv3UCConnectionConfig>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Connectionsv3UpdateConnectionsConfigsRequest.attributeTypeMap;
    }

    public constructor() {
    }
}



