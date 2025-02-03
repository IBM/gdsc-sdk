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

import { RpcStatus } from '../models/RpcStatus';
import { Universalconnectormanagerv3DatasourceDefinition } from '../models/Universalconnectormanagerv3DatasourceDefinition';
import { HttpFile } from '../http/http';

/**
* List of datasources defined for Univesal Connector with their details.
*/
export class Universalconnectormanagerv3DatasourcesResponse {
    /**
    * Collection of datasource definitions.
    */
    'datasources'?: Array<Universalconnectormanagerv3DatasourceDefinition>;
    'status'?: RpcStatus;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "datasources",
            "baseName": "datasources",
            "type": "Array<Universalconnectormanagerv3DatasourceDefinition>",
            "format": ""
        },
        {
            "name": "status",
            "baseName": "status",
            "type": "RpcStatus",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Universalconnectormanagerv3DatasourcesResponse.attributeTypeMap;
    }

    public constructor() {
    }
}

