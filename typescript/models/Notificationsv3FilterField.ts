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

import { Notificationsv3Filter } from '../models/Notificationsv3Filter';
import { HttpFile } from '../http/http';

/**
* The Filters that can be applied to the given notifications.
*/
export class Notificationsv3FilterField {
    /**
    * The filters that are eligable to be filtered on.
    */
    'filters'?: Array<Notificationsv3Filter>;
    /**
    * The name of the filter field.
    */
    'name'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "filters",
            "baseName": "filters",
            "type": "Array<Notificationsv3Filter>",
            "format": ""
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Notificationsv3FilterField.attributeTypeMap;
    }

    public constructor() {
    }
}

