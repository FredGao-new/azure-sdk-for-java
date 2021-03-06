// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.graphrbac.models;

import com.azure.core.annotation.Fluent;
import com.azure.management.graphrbac.AppRole;
import com.azure.management.graphrbac.OAuth2Permission;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * The ServicePrincipal model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "objectType")
@JsonTypeName("ServicePrincipal")
@Fluent
public final class ServicePrincipalInner extends DirectoryObjectInner {
    /*
     * whether or not the service principal account is enabled
     */
    @JsonProperty(value = "accountEnabled")
    private Boolean accountEnabled;

    /*
     * alternative names
     */
    @JsonProperty(value = "alternativeNames")
    private List<String> alternativeNames;

    /*
     * The display name exposed by the associated application.
     */
    @JsonProperty(value = "appDisplayName", access = JsonProperty.Access.WRITE_ONLY)
    private String appDisplayName;

    /*
     * The application ID.
     */
    @JsonProperty(value = "appId")
    private String appId;

    /*
     * The appOwnerTenantId property.
     */
    @JsonProperty(value = "appOwnerTenantId", access = JsonProperty.Access.WRITE_ONLY)
    private String appOwnerTenantId;

    /*
     * Specifies whether an AppRoleAssignment to a user or group is required
     * before Azure AD will issue a user or access token to the application.
     */
    @JsonProperty(value = "appRoleAssignmentRequired")
    private Boolean appRoleAssignmentRequired;

    /*
     * The collection of application roles that an application may declare.
     * These roles can be assigned to users, groups or service principals.
     */
    @JsonProperty(value = "appRoles")
    private List<AppRole> appRoles;

    /*
     * The display name of the service principal.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * A URL provided by the author of the associated application to report
     * errors when using the application.
     */
    @JsonProperty(value = "errorUrl")
    private String errorUrl;

    /*
     * The URL to the homepage of the associated application.
     */
    @JsonProperty(value = "homepage")
    private String homepage;

    /*
     * The collection of key credentials associated with the service principal.
     */
    @JsonProperty(value = "keyCredentials")
    private List<KeyCredentialInner> keyCredentials;

    /*
     * A URL provided by the author of the associated application to logout
     */
    @JsonProperty(value = "logoutUrl")
    private String logoutUrl;

    /*
     * The OAuth 2.0 permissions exposed by the associated application.
     */
    @JsonProperty(value = "oauth2Permissions", access = JsonProperty.Access.WRITE_ONLY)
    private List<OAuth2Permission> oauth2Permissions;

    /*
     * The collection of password credentials associated with the service
     * principal.
     */
    @JsonProperty(value = "passwordCredentials")
    private List<PasswordCredentialInner> passwordCredentials;

    /*
     * The thumbprint of preferred certificate to sign the token
     */
    @JsonProperty(value = "preferredTokenSigningKeyThumbprint")
    private String preferredTokenSigningKeyThumbprint;

    /*
     * The publisher's name of the associated application
     */
    @JsonProperty(value = "publisherName")
    private String publisherName;

    /*
     * The URLs that user tokens are sent to for sign in with the associated
     * application.  The redirect URIs that the oAuth 2.0 authorization code
     * and access tokens are sent to for the associated application.
     */
    @JsonProperty(value = "replyUrls")
    private List<String> replyUrls;

    /*
     * The URL to the SAML metadata of the associated application
     */
    @JsonProperty(value = "samlMetadataUrl")
    private String samlMetadataUrl;

    /*
     * A collection of service principal names.
     */
    @JsonProperty(value = "servicePrincipalNames")
    private List<String> servicePrincipalNames;

    /*
     * the type of the service principal
     */
    @JsonProperty(value = "servicePrincipalType")
    private String servicePrincipalType;

    /*
     * Optional list of tags that you can apply to your service principals. Not
     * nullable.
     */
    @JsonProperty(value = "tags")
    private List<String> tags;

    /**
     * Get the accountEnabled property: whether or not the service principal
     * account is enabled.
     * 
     * @return the accountEnabled value.
     */
    public Boolean accountEnabled() {
        return this.accountEnabled;
    }

    /**
     * Set the accountEnabled property: whether or not the service principal
     * account is enabled.
     * 
     * @param accountEnabled the accountEnabled value to set.
     * @return the ServicePrincipalInner object itself.
     */
    public ServicePrincipalInner withAccountEnabled(Boolean accountEnabled) {
        this.accountEnabled = accountEnabled;
        return this;
    }

    /**
     * Get the alternativeNames property: alternative names.
     * 
     * @return the alternativeNames value.
     */
    public List<String> alternativeNames() {
        return this.alternativeNames;
    }

    /**
     * Set the alternativeNames property: alternative names.
     * 
     * @param alternativeNames the alternativeNames value to set.
     * @return the ServicePrincipalInner object itself.
     */
    public ServicePrincipalInner withAlternativeNames(List<String> alternativeNames) {
        this.alternativeNames = alternativeNames;
        return this;
    }

    /**
     * Get the appDisplayName property: The display name exposed by the
     * associated application.
     * 
     * @return the appDisplayName value.
     */
    public String appDisplayName() {
        return this.appDisplayName;
    }

    /**
     * Get the appId property: The application ID.
     * 
     * @return the appId value.
     */
    public String appId() {
        return this.appId;
    }

    /**
     * Set the appId property: The application ID.
     * 
     * @param appId the appId value to set.
     * @return the ServicePrincipalInner object itself.
     */
    public ServicePrincipalInner withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * Get the appOwnerTenantId property: The appOwnerTenantId property.
     * 
     * @return the appOwnerTenantId value.
     */
    public String appOwnerTenantId() {
        return this.appOwnerTenantId;
    }

    /**
     * Get the appRoleAssignmentRequired property: Specifies whether an
     * AppRoleAssignment to a user or group is required before Azure AD will
     * issue a user or access token to the application.
     * 
     * @return the appRoleAssignmentRequired value.
     */
    public Boolean appRoleAssignmentRequired() {
        return this.appRoleAssignmentRequired;
    }

    /**
     * Set the appRoleAssignmentRequired property: Specifies whether an
     * AppRoleAssignment to a user or group is required before Azure AD will
     * issue a user or access token to the application.
     * 
     * @param appRoleAssignmentRequired the appRoleAssignmentRequired value to
     * set.
     * @return the ServicePrincipalInner object itself.
     */
    public ServicePrincipalInner withAppRoleAssignmentRequired(Boolean appRoleAssignmentRequired) {
        this.appRoleAssignmentRequired = appRoleAssignmentRequired;
        return this;
    }

    /**
     * Get the appRoles property: The collection of application roles that an
     * application may declare. These roles can be assigned to users, groups or
     * service principals.
     * 
     * @return the appRoles value.
     */
    public List<AppRole> appRoles() {
        return this.appRoles;
    }

    /**
     * Set the appRoles property: The collection of application roles that an
     * application may declare. These roles can be assigned to users, groups or
     * service principals.
     * 
     * @param appRoles the appRoles value to set.
     * @return the ServicePrincipalInner object itself.
     */
    public ServicePrincipalInner withAppRoles(List<AppRole> appRoles) {
        this.appRoles = appRoles;
        return this;
    }

    /**
     * Get the displayName property: The display name of the service principal.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The display name of the service principal.
     * 
     * @param displayName the displayName value to set.
     * @return the ServicePrincipalInner object itself.
     */
    public ServicePrincipalInner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the errorUrl property: A URL provided by the author of the
     * associated application to report errors when using the application.
     * 
     * @return the errorUrl value.
     */
    public String errorUrl() {
        return this.errorUrl;
    }

    /**
     * Set the errorUrl property: A URL provided by the author of the
     * associated application to report errors when using the application.
     * 
     * @param errorUrl the errorUrl value to set.
     * @return the ServicePrincipalInner object itself.
     */
    public ServicePrincipalInner withErrorUrl(String errorUrl) {
        this.errorUrl = errorUrl;
        return this;
    }

    /**
     * Get the homepage property: The URL to the homepage of the associated
     * application.
     * 
     * @return the homepage value.
     */
    public String homepage() {
        return this.homepage;
    }

    /**
     * Set the homepage property: The URL to the homepage of the associated
     * application.
     * 
     * @param homepage the homepage value to set.
     * @return the ServicePrincipalInner object itself.
     */
    public ServicePrincipalInner withHomepage(String homepage) {
        this.homepage = homepage;
        return this;
    }

    /**
     * Get the keyCredentials property: The collection of key credentials
     * associated with the service principal.
     * 
     * @return the keyCredentials value.
     */
    public List<KeyCredentialInner> keyCredentials() {
        return this.keyCredentials;
    }

    /**
     * Set the keyCredentials property: The collection of key credentials
     * associated with the service principal.
     * 
     * @param keyCredentials the keyCredentials value to set.
     * @return the ServicePrincipalInner object itself.
     */
    public ServicePrincipalInner withKeyCredentials(List<KeyCredentialInner> keyCredentials) {
        this.keyCredentials = keyCredentials;
        return this;
    }

    /**
     * Get the logoutUrl property: A URL provided by the author of the
     * associated application to logout.
     * 
     * @return the logoutUrl value.
     */
    public String logoutUrl() {
        return this.logoutUrl;
    }

    /**
     * Set the logoutUrl property: A URL provided by the author of the
     * associated application to logout.
     * 
     * @param logoutUrl the logoutUrl value to set.
     * @return the ServicePrincipalInner object itself.
     */
    public ServicePrincipalInner withLogoutUrl(String logoutUrl) {
        this.logoutUrl = logoutUrl;
        return this;
    }

    /**
     * Get the oauth2Permissions property: The OAuth 2.0 permissions exposed by
     * the associated application.
     * 
     * @return the oauth2Permissions value.
     */
    public List<OAuth2Permission> oauth2Permissions() {
        return this.oauth2Permissions;
    }

    /**
     * Get the passwordCredentials property: The collection of password
     * credentials associated with the service principal.
     * 
     * @return the passwordCredentials value.
     */
    public List<PasswordCredentialInner> passwordCredentials() {
        return this.passwordCredentials;
    }

    /**
     * Set the passwordCredentials property: The collection of password
     * credentials associated with the service principal.
     * 
     * @param passwordCredentials the passwordCredentials value to set.
     * @return the ServicePrincipalInner object itself.
     */
    public ServicePrincipalInner withPasswordCredentials(List<PasswordCredentialInner> passwordCredentials) {
        this.passwordCredentials = passwordCredentials;
        return this;
    }

    /**
     * Get the preferredTokenSigningKeyThumbprint property: The thumbprint of
     * preferred certificate to sign the token.
     * 
     * @return the preferredTokenSigningKeyThumbprint value.
     */
    public String preferredTokenSigningKeyThumbprint() {
        return this.preferredTokenSigningKeyThumbprint;
    }

    /**
     * Set the preferredTokenSigningKeyThumbprint property: The thumbprint of
     * preferred certificate to sign the token.
     * 
     * @param preferredTokenSigningKeyThumbprint the
     * preferredTokenSigningKeyThumbprint value to set.
     * @return the ServicePrincipalInner object itself.
     */
    public ServicePrincipalInner withPreferredTokenSigningKeyThumbprint(String preferredTokenSigningKeyThumbprint) {
        this.preferredTokenSigningKeyThumbprint = preferredTokenSigningKeyThumbprint;
        return this;
    }

    /**
     * Get the publisherName property: The publisher's name of the associated
     * application.
     * 
     * @return the publisherName value.
     */
    public String publisherName() {
        return this.publisherName;
    }

    /**
     * Set the publisherName property: The publisher's name of the associated
     * application.
     * 
     * @param publisherName the publisherName value to set.
     * @return the ServicePrincipalInner object itself.
     */
    public ServicePrincipalInner withPublisherName(String publisherName) {
        this.publisherName = publisherName;
        return this;
    }

    /**
     * Get the replyUrls property: The URLs that user tokens are sent to for
     * sign in with the associated application.  The redirect URIs that the
     * oAuth 2.0 authorization code and access tokens are sent to for the
     * associated application.
     * 
     * @return the replyUrls value.
     */
    public List<String> replyUrls() {
        return this.replyUrls;
    }

    /**
     * Set the replyUrls property: The URLs that user tokens are sent to for
     * sign in with the associated application.  The redirect URIs that the
     * oAuth 2.0 authorization code and access tokens are sent to for the
     * associated application.
     * 
     * @param replyUrls the replyUrls value to set.
     * @return the ServicePrincipalInner object itself.
     */
    public ServicePrincipalInner withReplyUrls(List<String> replyUrls) {
        this.replyUrls = replyUrls;
        return this;
    }

    /**
     * Get the samlMetadataUrl property: The URL to the SAML metadata of the
     * associated application.
     * 
     * @return the samlMetadataUrl value.
     */
    public String samlMetadataUrl() {
        return this.samlMetadataUrl;
    }

    /**
     * Set the samlMetadataUrl property: The URL to the SAML metadata of the
     * associated application.
     * 
     * @param samlMetadataUrl the samlMetadataUrl value to set.
     * @return the ServicePrincipalInner object itself.
     */
    public ServicePrincipalInner withSamlMetadataUrl(String samlMetadataUrl) {
        this.samlMetadataUrl = samlMetadataUrl;
        return this;
    }

    /**
     * Get the servicePrincipalNames property: A collection of service
     * principal names.
     * 
     * @return the servicePrincipalNames value.
     */
    public List<String> servicePrincipalNames() {
        return this.servicePrincipalNames;
    }

    /**
     * Set the servicePrincipalNames property: A collection of service
     * principal names.
     * 
     * @param servicePrincipalNames the servicePrincipalNames value to set.
     * @return the ServicePrincipalInner object itself.
     */
    public ServicePrincipalInner withServicePrincipalNames(List<String> servicePrincipalNames) {
        this.servicePrincipalNames = servicePrincipalNames;
        return this;
    }

    /**
     * Get the servicePrincipalType property: the type of the service
     * principal.
     * 
     * @return the servicePrincipalType value.
     */
    public String servicePrincipalType() {
        return this.servicePrincipalType;
    }

    /**
     * Set the servicePrincipalType property: the type of the service
     * principal.
     * 
     * @param servicePrincipalType the servicePrincipalType value to set.
     * @return the ServicePrincipalInner object itself.
     */
    public ServicePrincipalInner withServicePrincipalType(String servicePrincipalType) {
        this.servicePrincipalType = servicePrincipalType;
        return this;
    }

    /**
     * Get the tags property: Optional list of tags that you can apply to your
     * service principals. Not nullable.
     * 
     * @return the tags value.
     */
    public List<String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Optional list of tags that you can apply to your
     * service principals. Not nullable.
     * 
     * @param tags the tags value to set.
     * @return the ServicePrincipalInner object itself.
     */
    public ServicePrincipalInner withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }
}
