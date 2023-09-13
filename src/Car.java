abstract class Car {

    private String model;
    private String yearOfIssue;

    private Engine engine;

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

}
