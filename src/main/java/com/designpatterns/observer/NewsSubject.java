package com.designpatterns.observer;

public interface NewsSubject {
    void register(NewsObserver newsObserver);
    void detach(NewsObserver newsObserver);
    void notify(String news);
}
