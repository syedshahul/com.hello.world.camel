package com.tmft.model;

public class TargetProperties {
	private String host;
	private String username;
	private String password;
	private String directoryPath;
	private String protocol;
	private Boolean addTimestamp;
	private String timeout;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDirectoryPath() {
        return directoryPath;
    }

    public void setDirectoryPath(String directoryPath) {
        this.directoryPath = directoryPath;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public Boolean getAddTimestamp() {
        return addTimestamp;
    }

    public void setAddTimestamp(Boolean addTimestamp) {
        this.addTimestamp = addTimestamp;
    }

    public String getTimeout() {
        return timeout;
    }

    public void setTimeout(String timeout) {
        this.timeout = timeout;
    }
}
