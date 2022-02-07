package day44_Abstaction.lunchTask;

public interface WebDriver {
    void get(String url);
    void close();
    void quit();
    void getTitle();
}
