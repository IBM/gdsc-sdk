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

import { Featureflagsv3FeatureFlag } from '../models/Featureflagsv3FeatureFlag';
import { HttpFile } from '../http/http';

/**
* UpdateFeatureFlagOverridesRequest request body of update featureflag API.
*/
export class Featureflagsv3UpdateFeatureFlagOverridesRequest {
    'featureFlag'?: Featureflagsv3FeatureFlag;
    /**
    * Optional tenant id.
    */
    'tenantId'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "featureFlag",
            "baseName": "feature_flag",
            "type": "Featureflagsv3FeatureFlag",
            "format": ""
        },
        {
            "name": "tenantId",
            "baseName": "tenant_id",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Featureflagsv3UpdateFeatureFlagOverridesRequest.attributeTypeMap;
    }

    public constructor() {
    }
}

