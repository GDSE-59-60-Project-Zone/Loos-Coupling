/**
 * @author : Sanu Vithanage
 * @since : 0.1.0
 **/
public class Boy {
    public void chatWithGirl(){
        //Tight coupling
        /*Girl girl = new Girl();
        girl.chat();
*/

        //Loos-coupling coupling
        Agreement girl = new Girl();
        girl.chat();
    }
}
