package org.example.CollectionFramework;

import java.util.Objects;

public class Student implements Comparable<Student> {
    public int id;
    public String name;
    Student(int id,String name){
        this.id=id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(o == null || getClass()!=o.getClass()){
            return false;
        }
        Student s= (Student) o;
        return id== s.id && Objects.equals(name,s.name);
    }
    public int hashCode(){
        return Objects.hash(id,name);
    }

    @Override
    public int compareTo(Student o) {
        if(this.id==o.id){
            return this.name.compareTo(o.name);
        }
        return this.id-o.id;
    }
}
