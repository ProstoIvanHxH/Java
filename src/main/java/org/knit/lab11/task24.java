package org.knit.lab11;
import java.io.Console;
import java.io.File;
import java.util.List;
import java.util.Scanner;
import java.sql.SQLException;
public class task24 {
    public static void main(String[] args) throws SQLException{
        System.out.println("Все пользователи");
        UserDAO  userDAO=new UserDAOImpl();
        List<User> all = userDAO.findAll();
        userDAO.findAll().forEach(System.out::println);

        User user= new User("Bibovich2","1aboba@gmail.com");
        System.out.println("Добавляем пользователя: "+user);
        userDAO.create(user);
//        for(var i:userDAO.findAll()){
//            System.out.println(i.getEmail());
//        }
        System.out.println("Все пользователи после добавления");
        userDAO.findAll().forEach(System.out::println);


        System.out.println(userDAO.findById(3).getEmail());
        System.out.println(userDAO.emailExists("john.doe@examplgye.com"));
//        Scanner scanner = new Scanner(System.in);
//        boolean isWork=true;
//        while (isWork){
//            System.out.print("Введите команду: ");
//            String input = scanner.nextLine();
//            if(input.equals("exit")){
//                isWork=false;
//            }
//        }
    }
}
