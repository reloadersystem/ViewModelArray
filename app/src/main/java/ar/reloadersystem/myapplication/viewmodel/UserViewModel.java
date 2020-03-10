package ar.reloadersystem.myapplication.viewmodel;

import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

import ar.reloadersystem.myapplication.User;

public class UserViewModel extends ViewModel {

    private List<User> userList;

    public UserViewModel() {
        this.userList = new ArrayList<>();
    }

    public void addUser(User user) {
        userList.add(user);
    }

    private UserViewModel(List<User> userList) {
        this.userList = userList;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
