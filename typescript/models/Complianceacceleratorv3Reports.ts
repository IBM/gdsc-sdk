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

import { Complianceacceleratorv3Report } from '../models/Complianceacceleratorv3Report';
import { HttpFile } from '../http/http';

/**
* Reports object.
*/
export class Complianceacceleratorv3Reports {
    'reports'?: Array<Complianceacceleratorv3Report>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "reports",
            "baseName": "reports",
            "type": "Array<Complianceacceleratorv3Report>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Complianceacceleratorv3Reports.attributeTypeMap;
    }

    public constructor() {
    }
}

