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
import { Templatesv3DefaultContent } from '../models/Templatesv3DefaultContent';
import { HttpFile } from '../http/http';

/**
* The default template content for the specified origin.
*/
export class Templatesv3GetOriginDefaultContentResponse {
    /**
    * Default contents associated with the origin and MIME type specified; empty string not available.
    */
    'defaultContents'?: Array<Templatesv3DefaultContent>;
    'status'?: RpcStatus;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "defaultContents",
            "baseName": "default_contents",
            "type": "Array<Templatesv3DefaultContent>",
            "format": ""
        },
        {
            "name": "status",
            "baseName": "status",
            "type": "RpcStatus",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Templatesv3GetOriginDefaultContentResponse.attributeTypeMap;
    }

    public constructor() {
    }
}

