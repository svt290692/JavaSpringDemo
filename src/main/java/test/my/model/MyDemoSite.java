package test.my.model;

public class MyDemoSite {
    private final String icon;
    private final String id;
    private final String website;
    private final String title;
    private final String description;

    public MyDemoSite(String icon, String id, String website, String title, String description) {
        this.icon = icon;
        this.id = id;
        this.website = website;
        this.title = title;
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }

    public String getId() {
        return id;
    }

    public String getWebsite() {
        return website;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
