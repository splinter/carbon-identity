/*
*  Copyright (c) 2005-2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*  WSO2 Inc. licenses this file to you under the Apache License,
*  Version 2.0 (the "License"); you may not use this file except
*  in compliance with the License.
*  You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied.  See the License for the
* specific language governing permissions and limitations
* under the License.
*/
package org.wso2.carbon.identity.sso.saml.dto;

public class SAMLSSOReqValidationResponseDTO {

    private boolean isLogOutReq;
    private boolean isValid;
    private boolean doSingleLogout;
    private String issuer;
    private String subject;
    private String assertionConsumerURL;
    private String response;
    private String id;
    private String logoutResponse;
    private String loginPageURL;
    private String rpSessionId;
    private String requestMessageString;
    private String queryString;
    private boolean isPassive;
    private String destination;
    private SingleLogoutRequestDTO[] logoutRespDTO;
    private boolean isIdPInitSSO;

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAssertionConsumerURL() {
        return assertionConsumerURL;
    }

    public void setAssertionConsumerURL(String assertionConsumerURL) {
        this.assertionConsumerURL = assertionConsumerURL;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isLogOutReq() {
        return isLogOutReq;
    }

    public void setLogOutReq(boolean logOutReq) {
        isLogOutReq = logOutReq;
    }

    public SingleLogoutRequestDTO[] getLogoutRespDTO() {
        return logoutRespDTO;
    }

    public void setLogoutRespDTO(SingleLogoutRequestDTO[] logoutRespDTO) {
        this.logoutRespDTO = logoutRespDTO;
    }

    public String getLogoutResponse() {
        return logoutResponse;
    }

    public void setLogoutResponse(String logoutResponse) {
        this.logoutResponse = logoutResponse;
    }

    public boolean isDoSingleLogout() {
        return doSingleLogout;
    }

    public void setDoSingleLogout(boolean doSingleLogout) {
        this.doSingleLogout = doSingleLogout;
    }

    public String getLoginPageURL() {
        return loginPageURL;
    }

    public void setLoginPageURL(String loginPageURL) {
        this.loginPageURL = loginPageURL;
    }

    public String getRpSessionId() {
        return rpSessionId;
    }

    public void setRpSessionId(String rpSessionId) {
        this.rpSessionId = rpSessionId;
    }

    /**
     *
     * @return
     */
    public String getRequestMessageString() {
        return requestMessageString;
    }

    /**
     *
     * @param requestMessageString
     */
    public void setRequestMessageString(String requestMessageString) {
        this.requestMessageString = requestMessageString;
    }

    /**
     * @return the queryString
     */
    public String getQueryString() {
        return queryString;
    }

    /**
     * @param queryString the queryString to set
     */
    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    /**
     * @return the isPassive attrbute of the AuthnRequest
     */
    public boolean isPassive() {
        return isPassive;
    }

    /**
     * @param isPassive set the AuthnRequest isPassive attribute
     */
    public void setPassive(boolean isPassive) {
        this.isPassive = isPassive;
    }

    /**
     * @return the 'destination' attribute of the SAML request
     */
    public String getDestination() {
        return destination;
    }

    /**
     * @param destination Set the SAML request's 'destination' attribute
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    public boolean isIdPInitSSO() {
        return isIdPInitSSO;
    }

    public void setIdPInitSSO(boolean isIdPInitSSO) {
        this.isIdPInitSSO = isIdPInitSSO;
    }
}
