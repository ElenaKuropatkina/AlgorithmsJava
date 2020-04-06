package Lesson2.Tree;

import java.util.ArrayList;
import java.util.List;

public class Company {
        Integer id;
        Integer parentId;
        List<Company> list = new ArrayList<>();

    public Company(Integer id, Integer parentId){
        this.id = id;
        this.parentId = parentId;
    }

    public Integer getId() {
        return id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void addToList(Company c){
        list.add(c);
    }

    public List<Company> getList() {
        return list;
    }

    public void printId(){
        System.out.println(" -" + id);
    }
    public void printParentId(){
        System.out.println(id + ": ");

    }

}
