package org.knit.lab1;

public class SimpleUrl {
    private String protocol;
    private String address;
    private String domainZone;
    private String siteName;
    private String webpageName;
    private String webPageExtention;

    public SimpleUrl(String protocol, String address, String domainZone, String siteName, String webpageName, String webPageExtention) {
        this.protocol = protocol;
        this.address = address;
        this.domainZone = domainZone;
        this.siteName = siteName;
        this.webpageName = webpageName;
        this.webPageExtention = webPageExtention;
    }

    @Override
    public String toString() {
        return
                "protocol=" + protocol + '\n' +
                "address=" + address + '\n' +
                "domainZone=" + domainZone + '\n' +
                "siteName=" + siteName + '\n' +
                "webpageName=" + webpageName + '\n' +
                "webPageExtention=" + webPageExtention + '\n';
    }

    public SimpleUrl() {
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDomainZone() {
        return domainZone;
    }

    public void setDomainZone(String domainZone) {
        this.domainZone = domainZone;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getWebpageName() {
        return webpageName;
    }

    public void setWebpageName(String webpageName) {
        this.webpageName = webpageName;
    }

    public String getWebPageExtention() {
        return webPageExtention;
    }

    public void setWebPageExtention(String webPageExtention) {
        this.webPageExtention = webPageExtention;
    }
}
