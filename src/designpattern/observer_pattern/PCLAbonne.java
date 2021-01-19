package designpattern.observer_pattern;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

//Observer
public class PCLAbonne implements PropertyChangeListener {
    private String news;

    public void propertyChange(PropertyChangeEvent evt) {
        this.setNews((String) evt.getNewValue());
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }
}
