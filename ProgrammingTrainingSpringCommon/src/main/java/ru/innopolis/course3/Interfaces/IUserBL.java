package ru.innopolis.course3.Interfaces;


import ru.innopolis.course3.pojo.User;

/**
 * Created by korot on 11.01.2017.
 */
public interface IUserBL extends BService<User, Integer> {
    Integer getIdUser(String name, String password) throws DataException;


}
