package yana.kulyk;

public enum ChecklistUrl {
    CREATE_CHECKLIST("POST", "/1/checklists"), GET_CHECKLIST("GET", "/1/checklists"),
    GET_CHECKLIST_BOARD("GET", "/1/checklists/id/cards"), GET_CHECKLIST_ITEM("GET", "/1/checklists/id/checkItems");

    private String method;
    private String url;

    private ChecklistUrl(String method, String url) {
        this.method = method;
        this.url = url;
    }

    public String getUrl() {
        return this.url;
    }

    public String getMethod() {
        return this.method;
    }
}
