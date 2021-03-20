package ca.dal.cs.csci3130.a4.q5;

import java.util.ArrayList;
import java.util.List;

public class GoodsPreferenceManager implements IPreferenceManager {

    private List<Observer> users = new ArrayList<Observer>();
    private String message;

    @Override
    public void attach(Observer user) {
        users.add(user);
    }

    public void setMessage(String message) {
        this.message = message;
        notifyAllUsers();
    }

    public String getMessage(){
        return this.message;
    }

    @Override
    public void notifyAllUsers() {
        for(Observer user : users){
            user.update(getMessage());
        }
    }

}
