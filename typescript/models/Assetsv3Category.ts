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

import { Assetsv3SubCategory } from '../models/Assetsv3SubCategory';
import { HttpFile } from '../http/http';

/**
* Category - Main Category Data for Manage Asset Filter Panel.
*/
export class Assetsv3Category {
    'group'?: string;
    'id'?: string;
    'name'?: string;
    'showTimelineFilter'?: boolean;
    'subCategory'?: Array<Assetsv3SubCategory>;
    'timelineDisplayName'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "group",
            "baseName": "group",
            "type": "string",
            "format": ""
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "string",
            "format": ""
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string",
            "format": ""
        },
        {
            "name": "showTimelineFilter",
            "baseName": "show_timeline_filter",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "subCategory",
            "baseName": "sub_category",
            "type": "Array<Assetsv3SubCategory>",
            "format": ""
        },
        {
            "name": "timelineDisplayName",
            "baseName": "timeline_display_name",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Assetsv3Category.attributeTypeMap;
    }

    public constructor() {
    }
}

