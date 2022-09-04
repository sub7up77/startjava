public class Jaeger {

    private String modelName;
    private String mark;
    private String status;
    private float height;
    private float weight;

    public Jaeger() {
    }

    public Jaeger(String modelName, String mark, String status, float height, float weight) {
        this.modelName = modelName;
        this.mark = mark;
        this.status = status;
        this.height = height;
        this.weight = weight;
    }

    public String toString() {
        return ("\nJaeger: " + modelName + "\nMark: " + mark + "\nStatus: " + status +
                "\nHeight: " + height + " ft." + "\nWeight: " + weight + " tons");
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public boolean drift() {
        if(status.equals("Active")) {
            System.out.println("I'm drifting ...");
            return true;
        }
        return false;
    }

    public void fight() {
        System.out.println("I'm fighting ...");
    }
}