package chatv1;
public class User {
    String username,password,alias;
    Ventana in;
    public User(String username,String password,String alias){
        this.alias=alias;
        this.password = password;
        this.username=username;
    }
    public String ChangeAlias(){
        
        return alias;
    }
    public String GetUsername(){
        username = in.userTF.getText();
        return username;
    }
    public String GetPassword(){
        password = in.passTF.getText();
        return password;
    }
    public String GetAlias(){
        alias = in.AliasTF.getText();
        return alias;
    }
}
