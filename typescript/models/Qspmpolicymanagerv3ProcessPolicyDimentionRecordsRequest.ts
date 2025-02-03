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

import { HttpFile } from '../http/http';

export class Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest {
    'provisonIdList'?: Array<string>;
    'scanIdList'?: Array<string>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "provisonIdList",
            "baseName": "ProvisonIdList",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "scanIdList",
            "baseName": "ScanIdList",
            "type": "Array<string>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest.attributeTypeMap;
    }

    public constructor() {
    }
}

