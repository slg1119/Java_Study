package Ch5.Inner_Class;

public class Main {
    public static void main (String args[]) {
        Body body = new Body();
        Body.Haed head = body.new Haed();

        head.smell("Food");

    }
}
