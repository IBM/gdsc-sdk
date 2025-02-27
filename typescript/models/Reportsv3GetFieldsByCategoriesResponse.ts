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

import { Reportsv3Header } from '../models/Reportsv3Header';
import { HttpFile } from '../http/http';

/**
* GetFieldsByCategoriesResponse is the return type of the GetFieldsByCategories() api.
*/
export class Reportsv3GetFieldsByCategoriesResponse {
    /**
    * Category fields.
    */
    'headers'?: Array<Reportsv3Header>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "headers",
            "baseName": "headers",
            "type": "Array<Reportsv3Header>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Reportsv3GetFieldsByCategoriesResponse.attributeTypeMap;
    }

    public constructor() {
    }
}

