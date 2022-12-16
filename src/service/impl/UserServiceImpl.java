package service.impl;

import enums.Gender;
import model.Book;
import model.User;
import service.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserServiceImpl implements UserService {
    List<User> users = new ArrayList<>();
    @Override
    public String createUser(List<User> users) {
        return null;
    }

    @Override
    public List<User> findAllUsers() {
        return users;
    }

    @Override
    public User findUserById(Long id) {
        for (User user : users) {
            if (user.getId()==id){
                users.add(user);
            }

        }
        return null;
    }

    @Override
    public String removeUserByName(String name) {
        for (User user : users) {
            if (user.getName().equals(name)){
                users.remove(user);
            }
        }

        return null;
    }

    @Override
    public void updateUser(Long id) {


    }

    @Override
    public void groupUsersByGender() {
      users.stream().filter(user-> user.getGender().equals(Gender.FEMALE)).toList();
        users.forEach(System.out::println);
        users.stream().filter(user -> user.getGender().equals(Gender.MALE)).toList();
        users.forEach(System.out::println);
    }

    @Override
    public String buyBooks(String name, List<Book> books) {
        for (User user : users) {
            if (user.getName().equals(name)){
                for (Book book : books) {
                    if (book.getName().equals(name)){
                        users.add(user);
                        books.add(book);
                    }

                }
            }

        }
        return null;
    }
}
