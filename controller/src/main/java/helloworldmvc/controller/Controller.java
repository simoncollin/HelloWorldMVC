package helloworldmvc.controller;

import helloworldmvc.model.IModel;
import helloworldmvc.view.IView;

public class Controller {
    IModel model;
    IView view;

    public Controller(IModel model, IView view) {
        this.model = model;
        this.view = view;
    }

    public void run(){
        this.view.display(this.model.getMessage());
    }
}
