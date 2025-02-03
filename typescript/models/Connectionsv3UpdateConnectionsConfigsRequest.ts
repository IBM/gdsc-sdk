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



