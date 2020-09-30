package com.pvt;

public class Main {

    public static void main(String[] args) {
        Computer computer=new Computer(12,"LG","Windows",true,2000);
        System.out.println(computer);
        computer.setId(13);
        computer.setName("Sumsung");
        computer.setOS("Linux");
        computer.setCoresCount(1500);
        System.out.println(computer);
        System.out.println("Создали несколько объектов класса User, c изменением параметров: ");
        User user = new User(1, "Алеся", "testLogin", "testPasswor",
                "375255388888", 45);
        System.out.println(user);
        user.setId(9);
        System.out.println(user);
        user.setAge(48);
        System.out.println(user);
        user.setUserName("Владимир");
        System.out.println(user);
        User user1 = new User(2, "Дмитрий", "testLogin1", "testPasswor1",
                "3752553322222", 25);
        User user2 = new User(3, "Валерий", "testLogin2", "testPasswor2",
                "3752553333333", 29);
        User user3 = new User(4, "Никита", "testLogin3", "testPasswor3",
                "375255344444", 22);
        System.out.println(user);
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);

        System.out.println("Получаем объект User,который не изменился: ");
        System.out.println(User.getInstance());


    }
}
