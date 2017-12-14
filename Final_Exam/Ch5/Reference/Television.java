package Ch5.Reference;

public class Television {
    public int channel;
    public int volume;
    public boolean onOff;

    Television() {
        channel = 1;
        volume = 15;
        onOff = false;
    }

    Television(int c, int v, boolean o) {
        channel = c;
        volume = v;
        onOff = o;
    }

    void print() {
        System.out.println("채널은 " + channel + "이고 볼륨은 " + volume + "이고, 켜짐 상태는 " + onOff + "입니다.");
    }
}
