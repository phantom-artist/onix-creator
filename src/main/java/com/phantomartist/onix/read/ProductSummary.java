package com.phantomartist.onix.read;

public class ProductSummary {

    private int recordNumber;
    private String identifier;
    private String title;
    private String contributor;

    public int getRecordNumber() {
        return recordNumber;
    }
    public void setRecordNumber(int recordNumber) {
        this.recordNumber = recordNumber;
    }
    public String getIdentifier() {
        return identifier;
    }
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContributor() {
        return contributor;
    }
    public void setContributor(String contributor) {
        this.contributor = contributor;
    }
    @Override
    public String toString() {
        return "ProductSummary [recordNumber=" + recordNumber + ", identifier=" + identifier + ", title=" + title
                + ", contributor=" + contributor + "]";
    }
}
