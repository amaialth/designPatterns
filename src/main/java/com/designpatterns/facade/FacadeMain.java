package com.designpatterns.facade;

public class FacadeMain {
    public static void main(String[] args) {
        //Create Sub System Components
        DVDPlayer dvdPlayer = new DVDPlayer();
        AudioSystem audioSystem = new AudioSystem();
        Projector projector = new Projector();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvdPlayer, audioSystem, projector);

        homeTheater.watchMovie("Inception");

        homeTheater.endMovie();
    }
}
