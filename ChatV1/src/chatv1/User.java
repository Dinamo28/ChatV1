package chatv1;

public class User {
    String username,password,alias;
    
    public User(String username,String password,String alias){
        this.alias=alias;
        this.password = password;
        this.username=username;
    }
    public void ChangeAlias(){
        
    }
    public String GetUsername(){
        return username;
    }
    public String GetPassword(){
        return password;
    }
    public String GetAlias(){
        return alias;
    }
}
