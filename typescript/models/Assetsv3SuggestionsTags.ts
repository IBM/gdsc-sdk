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

import { HttpFile } from '../http/http';

export class Assetsv3SuggestionsTags {
    'domainId'?: string;
    /**
    * Name of the tag.
    */
    'tagCategory'?: string;
    'tagId'?: string;
    /**
    * Concepts for the tag.
    */
    'tagNames'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "domainId",
            "baseName": "domain_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "tagCategory",
            "baseName": "tag_category",
            "type": "string",
            "format": ""
        },
        {
            "name": "tagId",
            "baseName": "tag_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "tagNames",
            "baseName": "tag_names",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Assetsv3SuggestionsTags.attributeTypeMap;
    }

    public constructor() {
    }
}

