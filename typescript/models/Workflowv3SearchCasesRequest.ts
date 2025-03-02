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

import { Workflowv3Filter } from '../models/Workflowv3Filter';
import { HttpFile } from '../http/http';

/**
* Request cases by filtering on specific values.
*/
export class Workflowv3SearchCasesRequest {
    'filter'?: Workflowv3Filter;
    /**
    * Optional: The max amount of cases to return for pagination.
    */
    'limit'?: number;
    /**
    * Optional: The amount to offset the cases for pagination.
    */
    'offset'?: number;
    /**
    * Optional: Cases that runs most latestly.
    */
    'withLatest'?: boolean;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "filter",
            "baseName": "filter",
            "type": "Workflowv3Filter",
            "format": ""
        },
        {
            "name": "limit",
            "baseName": "limit",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "offset",
            "baseName": "offset",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "withLatest",
            "baseName": "with_latest",
            "type": "boolean",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Workflowv3SearchCasesRequest.attributeTypeMap;
    }

    public constructor() {
    }
}

