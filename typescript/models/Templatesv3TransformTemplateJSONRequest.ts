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

import { Templatesv3Integration } from '../models/Templatesv3Integration';
import { Templatesv3MIMEType } from '../models/Templatesv3MIMEType';
import { Templatesv3Origin } from '../models/Templatesv3Origin';
import { HttpFile } from '../http/http';

export class Templatesv3TransformTemplateJSONRequest {
    /**
    * Data used to transform the template. Data is in json string format.
    */
    'data'?: string;
    'integration'?: Templatesv3Integration;
    'mimeType'?: Templatesv3MIMEType;
    'origin'?: Templatesv3Origin;
    /**
    * The ID of the template to be transformed.
    */
    'templateId'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "data",
            "baseName": "data",
            "type": "string",
            "format": ""
        },
        {
            "name": "integration",
            "baseName": "integration",
            "type": "Templatesv3Integration",
            "format": ""
        },
        {
            "name": "mimeType",
            "baseName": "mime_type",
            "type": "Templatesv3MIMEType",
            "format": ""
        },
        {
            "name": "origin",
            "baseName": "origin",
            "type": "Templatesv3Origin",
            "format": ""
        },
        {
            "name": "templateId",
            "baseName": "template_id",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Templatesv3TransformTemplateJSONRequest.attributeTypeMap;
    }

    public constructor() {
    }
}



