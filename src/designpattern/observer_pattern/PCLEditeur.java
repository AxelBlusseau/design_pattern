package designpattern.observer_pattern;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

//Observable
public class PCLEditeur {
    private String news;

    private PropertyChangeSupport support;

    public PCLEditeur() {
        support = new PropertyChangeSupport(this);
    }

    public void addSubcriber(PropertyChangeListener pcl) {
        support.addPropertyChangeListener(pcl);
    }

    public void removeSubscriber(PropertyChangeListener pcl) {
        support.removePropertyChangeListener(pcl);
    }

    public void setMagazine(String value) {
        support.firePropertyChange("news", this.news, value);
        this.news = value;
    }
}
