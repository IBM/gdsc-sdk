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

import { Reportsv3Variant } from '../models/Reportsv3Variant';
import { HttpFile } from '../http/http';

export class Reportsv3GetVariantsResponse {
    'variants'?: Array<Reportsv3Variant>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "variants",
            "baseName": "variants",
            "type": "Array<Reportsv3Variant>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Reportsv3GetVariantsResponse.attributeTypeMap;
    }

    public constructor() {
    }
}

