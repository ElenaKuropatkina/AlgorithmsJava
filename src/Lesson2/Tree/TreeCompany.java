package Lesson2.Tree;

import java.util.ArrayList;

public class TreeCompany {

   public static void main(String[] args) {
       ArrayList<Company> companies = new ArrayList<>();

       companies.add(new Company(0, null));
       companies.add(new Company(1, 0));
       companies.add(new Company(2, 0));
       companies.add(new Company(3, 1));
       companies.add(new Company(4, 3));
       companies.add(new Company(5, 4));
       companies.add(new Company(6, 0));

       for (int i = 0; i < companies.size(); i++) {
           for (int j = i + 1; j < companies.size(); j++) {
               if (companies.get(i).getId() == companies.get(j).getParentId()) {
                   companies.get(i).addToList(companies.get(j));
               }
           }
       }

       for (Company c : companies) {
           if (!c.getList().isEmpty()) {
               c.printParentId();
           }
           for (Company cc : c.getList()) {
               if (!cc.getList().isEmpty() & c.getId() != cc.getParentId()) {
                   cc.printParentId();
               } else cc.printId();
           }
       }
   }
}
