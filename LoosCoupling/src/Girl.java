/**
 * @author : Sanu Vithanage
 * @since : 0.1.0
 **/
public class Girl implements Agreement  {
    public void chatWithAmal(){
        System.out.println("Chatting with boy");
    }

    @Override
    public void chat() {
        System.out.println("Chat");
    }
}
