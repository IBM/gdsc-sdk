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

import { Assetsv3AssignedTags } from '../models/Assetsv3AssignedTags';
import { Assetsv3SuggestionsTags } from '../models/Assetsv3SuggestionsTags';
import { Assetsv3UnassignedTags } from '../models/Assetsv3UnassignedTags';
import { HttpFile } from '../http/http';

/**
* Response for listing tags.
*/
export class Assetsv3ListTagsResponse {
    'assigned'?: Array<Assetsv3AssignedTags>;
    'suggestions'?: Array<Assetsv3SuggestionsTags>;
    'unassigned'?: Array<Assetsv3UnassignedTags>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "assigned",
            "baseName": "assigned",
            "type": "Array<Assetsv3AssignedTags>",
            "format": ""
        },
        {
            "name": "suggestions",
            "baseName": "suggestions",
            "type": "Array<Assetsv3SuggestionsTags>",
            "format": ""
        },
        {
            "name": "unassigned",
            "baseName": "unassigned",
            "type": "Array<Assetsv3UnassignedTags>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Assetsv3ListTagsResponse.attributeTypeMap;
    }

    public constructor() {
    }
}

