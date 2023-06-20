package fr.ilesyazi.applicationscratch130623;

public class User {

    private String id;
    private String name;
    private String age;

    public User(String id,String name){
        this.id = id;
        this.name = name;
    }

    public String getId(){
        return id;
    }
    public void setId(){

        this.id =id;
    }

    public String getName(){

        return name;
    }
    public void setName(){

        this.name = name;
    }
}
