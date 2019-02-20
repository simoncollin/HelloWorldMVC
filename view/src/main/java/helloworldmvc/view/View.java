package helloworldmvc.view;

public class View implements IView{

    public void display(String message){
        System.out.println(message);
    }
}
