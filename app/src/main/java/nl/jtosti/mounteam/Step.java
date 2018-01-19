package nl.jtosti.mounteam;

/**
 * Created by joost on 18-1-18.
 */

public class Step {
    private int minutes;
    private String name;
    private String content;
    private String url;

    public Step(int minutes, String name, String content, String url) {
        this.minutes = minutes;
        this.name = name;
        this.content = content;
        this.url = url;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
