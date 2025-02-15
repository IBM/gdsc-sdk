

# Groupbuilderv3LdapConfig

LdapConfig contains information about configuration for importing group members from LDAP.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attributes** | **List&lt;String&gt;** | LDAP object attribute used to convert to member data. |  [optional] |
|**bindGroupId** | **Integer** | ID of the group whose members are used as bind values for parameterize filter. |  [optional] |
|**bindPassword** | **String** | Password for binding to LDAP if bind ID is set for ICP LDAP definition. |  [optional] |
|**clearGroup** | **Boolean** | Flag indicating whether new data is replacing old data or is appended to it. |  [optional] |
|**filter** | **String** | LDAP search query to use to find objects. |  [optional] |
|**filterScope** | **Integer** | Scope of LDAP search:  sub-tree vs immediate base DN children. |  [optional] |
|**importLimit** | **Integer** | Maximum number of objects to import. |  [optional] |
|**ldapGroupName** | **String** | DN name of the LDAP group to get members from.  Alternative to explicit filter. |  [optional] |
|**ldapId** | **String** | ID of the ICP LDAP definition from which to import. |  [optional] |
|**memberPrefix** | **String** | Prefix that will be added to each imported member. |  [optional] |



