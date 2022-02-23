package com.geekbrains.server.authorization;
//ИНЕТРФЕЙС АВТОРИЗАЦИИ
public interface AuthService {
    void start();
    String getNickNameByLoginAndPassword(String login, String password);
    void end();
    int [] array = new int[10];

}
