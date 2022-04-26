/**
 * @author : Sanu Vithanage
 * @since : 0.1.0
 **/

public class Boy {

    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.chatWithGirl();
    }

    public void chatWithGirl() {
        Girl girl = new Girl();
        girl.chat();
    }
}
