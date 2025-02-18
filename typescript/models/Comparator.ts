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

import { Operator } from '../models/Operator';
import { HttpFile } from '../http/http';

export class Comparator {
    'value': number;
    'operator': Operator;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "value",
            "baseName": "value",
            "type": "number",
            "format": ""
        },
        {
            "name": "operator",
            "baseName": "operator",
            "type": "Operator",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Comparator.attributeTypeMap;
    }

    public constructor() {
    }
}



