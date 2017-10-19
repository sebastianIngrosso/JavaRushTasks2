package com.javarush.task.task14.task1413;

/**
 * Created by bohdan on 28.05.2017.
 */
public class Computer {
    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor monitor;

    public Computer(Keyboard keyboard, Mouse mouse, Monitor monitor) {
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.monitor = monitor;
    }

    public Monitor getMonitor() {
        return monitor;

    }

    public Mouse getMouse() {

        return mouse;
    }

    public Keyboard getKeyboard() {

        return keyboard;
    }

    public Computer(Monitor monitor) {

        this.monitor = monitor;
    }

    public Computer(Mouse mouse) {

        this.mouse = mouse;
    }

    public Computer(Keyboard keyboard) {

        this.keyboard = keyboard;
    }
}
