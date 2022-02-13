package com.jsotto.jobsearch;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class JobPosition {
    private String id;

    private String type;

    private String  url;

    @SerializedName("created_ad")
    private String createAd;

    private String company;

    @SerializedName("company_url")

    private String companyUrl;

    private String title;

    private String location;

    @SerializedName("company_logo")

    private String companyLogo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCreateAd() {
        return createAd;
    }

    public void setCreateAd(String createAd) {
        this.createAd = createAd;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompanyUrl() {
        return companyUrl;
    }

    public void setCompanyUrl(String companyUrl) {
        this.companyUrl = companyUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCompanyLogo() {
        return companyLogo;
    }

    public void setCompanyLogo(String companyLogo) {
        this.companyLogo = companyLogo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobPosition that = (JobPosition) o;
        return Objects.equals(id, that.id) && Objects.equals(type, that.type) && Objects.equals(url, that.url) && Objects.equals(createAd, that.createAd) && Objects.equals(company, that.company) && Objects.equals(companyUrl, that.companyUrl) && Objects.equals(title, that.title) && Objects.equals(location, that.location) && Objects.equals(companyLogo, that.companyLogo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, url, createAd, company, companyUrl, title, location, companyLogo);
    }

    @Override
    public String toString() {
        return "JobPosition{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", url='" + url + '\'' +
                ", createAd='" + createAd + '\'' +
                ", company='" + company + '\'' +
                ", companyUrl='" + companyUrl + '\'' +
                ", title='" + title + '\'' +
                ", location='" + location + '\'' +
                ", companyLogo='" + companyLogo + '\'' +
                '}';
    }
}
