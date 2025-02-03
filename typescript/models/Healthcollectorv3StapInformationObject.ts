/**
 * IBM Guardium Data Security Center
 * IBM Guardium Data Security Center simplifies your organization\'s Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.
 *
 * OpenAPI spec version: 3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { Healthcollectorv3InspectionEnginePresentDetails } from '../models/Healthcollectorv3InspectionEnginePresentDetails';
import { Healthcollectorv3StapObject } from '../models/Healthcollectorv3StapObject';
import { HttpFile } from '../http/http';

/**
* S-tap related information object.
*/
export class Healthcollectorv3StapInformationObject {
    /**
    * Details of inspection engines present at start and end.
    */
    'inspectionEngineDetails'?: Array<Healthcollectorv3InspectionEnginePresentDetails>;
    /**
    * Difference of inspection engines present at start and end.
    */
    'inspectionEngineDetailsChange'?: number;
    /**
    * Indicates whether the s-tap was present at end.
    */
    'presentAtEnd'?: boolean;
    /**
    * Indicates whether the s-tap was present at start.
    */
    'presentAtStart'?: boolean;
    'stap'?: Healthcollectorv3StapObject;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "inspectionEngineDetails",
            "baseName": "inspection_engine_details",
            "type": "Array<Healthcollectorv3InspectionEnginePresentDetails>",
            "format": ""
        },
        {
            "name": "inspectionEngineDetailsChange",
            "baseName": "inspection_engine_details_change",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "presentAtEnd",
            "baseName": "present_at_end",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "presentAtStart",
            "baseName": "present_at_start",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "stap",
            "baseName": "stap",
            "type": "Healthcollectorv3StapObject",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Healthcollectorv3StapInformationObject.attributeTypeMap;
    }

    public constructor() {
    }
}

