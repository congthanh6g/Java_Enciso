package com.example.helloworld;

import com.example.helloworld.model.Chef;
import com.example.helloworld.model.Employee;
import com.example.helloworld.model.Moveable;
import com.example.helloworld.model.Programmer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Programmer a = new Programmer();
//        a.setSalary(100);
//        a.setBonus(120);
//        System.out.println(a.getSalary());
//        System.out.println(a.getBonus());
//
//        Programmer b = new Programmer(150,120);
//        System.out.println(b.getSalary());
//        System.out.println(b.getBonus());
//        b.theString();
//
//        Chef c = new Chef();
//        c.theString();
//        // Tinh da hinh
//        // Upcasting & Downcasting
//
//        // Programmer , Chef extends tu thang Employee : deu la employee
//        Programmer p = new Programmer();

        // da hinh : tac dung

        ArrayList<Employee> employeeList = new ArrayList<>();

        Employee j = new Programmer(); // casting (initiate an object)
        employeeList.add(j);
        Employee k = new Chef(); //
        employeeList.add(k);
        Employee m = new Chef();
        employeeList.add(m);

        for (int i = 0; i < employeeList.size(); i++) {
            if(employeeList.get(i) instanceof Chef) { // check neu employee day la programmer
                System.out.println(employeeList.get(i).getName() + " is an employee");
            }
        }

        // unmoveable object : tuong , cay , ... -
        // class unmoveable (toa do) <- extend : tuong , cay, bom (constructor (super))
        // List<unmoveable object> list . list.add(tuong), list.add(cay)
        // List<Cay> cay
        // List<tuong> tuong
        // for (list unmoveable) { unmoveable[i] instanceof bom no se no : xoa bom , player -1 mau
        //

        // moveable object : player , bullet, ...

        // abstract class va interface
        /*
             abstract class : co the co abstract method, method binh thuong
             interface : chi co phuong thuc abstract

             extend class -> co 1 limitation :
             A class cannot extend more than 1 class (da ke thua)
             child ko the extend tu ca cha1 , cha2 (multiple inheritance)
             -> De giai quyet van de nay thi sinh ra interface
             Interface -> an outline of some imaginary class
                       -> sole purpose = to be inherited
                       -> only defines what to be done not how to do it -> abstract class ()
                       1 class co the implement nhieu interface

                       1 VD:
                       CARAVAN is both a House, Vehicle
                       Caravan extends house, vehicle (Sai)
                       Tao 2 interface : moveable habitable
                       Moveable <- vehicle implement
                       Habitable <- house implement
                       Caravan implement moveable , habitable
             * Khong the tao object tu interface class
             // anonymous inner class ( cai nay m tu tim hieu -> trong code app : truyen 1 interface vao trong 1 method )
        */

        /*
        Tuan 01 : 08/10
            1. Constructor ( Khong tham so & Co tham so )
            -> Neu 1 class ko co constructor thi sao?
            -> Neu 1 class chi co constructor co tham so thi sao?
            -> super() & super.method
            + Getter / Setter
            2. this (self-reference)
            3. access-modifier (public , private, protected, default)
            4. Java memory, Java references, "new" keyword
            5. Passing data to method ( passing value to function & passing object to function)
            6. "final" keyword & "static" keyword -> phuong thuc static & khoi static
            7. Tinh chat trong javaOOP ( giai thich (tinh chat) + lay 1 vi du )
                7.1 Tinh dong goi (encapsulation)
                7.2 Tinh da hinh (polymorphism)
                7.3 Tinh truu tuong (so sanh giua abstract va interface)
                    7.3.1 Abstract
                    7.3.2 Interface
                7.4 Tinh ke thua (inheritance)
                    7.4.1 Upcasting
                    7.4.2 Downcasting
                    7.4.4 ClassCastException la error gi ?
                    7.4.5 instanceof
            Tuan 02 : 15/10
            1. Exception Handling
            2. Java Files & Streams (scanner)
            3. Data Structure ( Noi qua )
            4. Generic data type
            5. Bat dau game
                5.1 Hien thi cua so
                5.2 Ve hinh chu nhat & cho no di chuyen (gameLoop)
                5.3 Hien thi text & hinh anh
        */
    }
}