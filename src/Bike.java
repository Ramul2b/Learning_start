abstract class Bike {

    private String model;
    private String yearOfIssue;
    private String stroller;

    private Engine engine;

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

}
